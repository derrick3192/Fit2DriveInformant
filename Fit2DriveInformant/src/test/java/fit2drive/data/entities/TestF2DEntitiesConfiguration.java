package fit2drive.data.entities;


import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

import org.junit.BeforeClass;
import org.junit.Test;
import org.reflections.Reflections;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;

/**
 * @author Derrick
 *
 *	Class to test if entity classes have been correctly coded.
 */
public class TestF2DEntitiesConfiguration {

	/** Set of all entity class in the project. */
	private static Set<Class<?>> entityClasses;
	

	@BeforeClass
	public static void beforeClass() {

		// initialize the set of all entity classes in the project.
		Reflections reflections = new Reflections("fit2drive");
		entityClasses = reflections.getTypesAnnotatedWith(Entity.class);
		// need to remove all abstract classes
		// find all classes to remove
		List<Class<?>> classesToRemove = new ArrayList<>();
		for (Class<?> entityClass : entityClasses) {

			if (Modifier.isAbstract(entityClass.getModifiers())){
				classesToRemove.add(entityClass);
			}
		}
		// remove the classes
		for (Class<?> entityClass : classesToRemove) {
			entityClasses.remove(entityClass);
		}
		
	
		
		
		
	}

	
	@Test
	public void entitiesShouldInheritFromF2DEntity() {

		for (Class<?> entityClass : entityClasses) {

			Class<?> superClass = entityClass.getSuperclass();
			assertTrue(
					"Error, An enity which is not abstract did not inherit from " + Entity.class.getName() + "\n"
							+"Please make sure the class " +entityClass.getName() +" inherits from " + Entity.class.getName(),
							superClass == F2DEntity.class);
		}
	}

	@Test
	public void entitiesShouldHaveTableName() {
		
		for (Class<?> entityClass : entityClasses) {
			
			Annotation[] annotationsOnClass = entityClass.getAnnotations();
			boolean hasTableAnnotation = false;
			for (Annotation annotation : annotationsOnClass) {
				if(annotation instanceof Table){
					hasTableAnnotation = true;
					Table tableAnnoation = (Table) annotation;
					assertTrue("Error, An entity which is not abstract did not have a table name in the "+Table.class.getName() +" annotation.\n"
							+ "Please include this for the entity: "+ entityClass.getName(),
							tableAnnoation.name().length() != 0);	
				}
			}
			assertTrue("Error, An entity which is not abstract did not the "+Data.class.getName() +" annotation. \n"
					+ "Please include this for the entity: "+ entityClass.getName(),
					hasTableAnnotation);
		}
	}
	
	
	
	
	@Test
	public void entitiesShouldHaveUniquieTableName () {
		
		List<String> tableNames = new ArrayList<>();
		
		for (Class<?> entityClass : entityClasses) {
			
			Annotation[] annotationsOnClass = entityClass.getAnnotations();
			for (Annotation annotation : annotationsOnClass) {
				if(annotation instanceof Table){
					Table tableAnnoation = (Table) annotation;
					String tableName = tableAnnoation.name();
					if (tableNames.contains(tableNames)) {
						fail("Error, duplicate table name. Please rename the table name for Entity: "+entityClass.getName());
					} else {
						tableNames.add(tableName);
					}
				}
			}
		}
	}
	
	@Test
	public void entitiesShouldHaveGettersAndSetters() {

		for (Class<?> entityClass : entityClasses) {

			Field[] fields = entityClass.getDeclaredFields();
			Method[] methods = entityClass.getDeclaredMethods();
			List<String> methodNames = new ArrayList<>();
			
			for (Method method: methods) {
				methodNames.add(method.getName());
			}
			
			
			for (Field field : fields) {
				String fieldName = field.getName();
				String fieldStringInMethod = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
				
				String getFieldName;
				String setFieldName;
				
				if (field.getType() == boolean.class) {
					getFieldName = "is"+fieldStringInMethod;
					setFieldName = "is"+fieldStringInMethod;
				} else {
					getFieldName = "get"+fieldStringInMethod;
					setFieldName = "set"+fieldStringInMethod;
				}
				
				if (!methodNames.contains(getFieldName) && !Modifier.isStatic(field.getModifiers())) {
					fail(entityClass.getName() + " is missing the "+getFieldName+" method");
				}
				
				if (!methodNames.contains(setFieldName) && !Modifier.isStatic(field.getModifiers())) {
					fail(entityClass.getName() + " is missing the "+setFieldName+" method");
				}
			}
		}
	}
	
	@Test
	public void entitiesShouldHaveParameterlessConstructor() {
		for (Class<?> entityClass : entityClasses) {
			Constructor<?>[] constructors = entityClass.getConstructors();
			boolean hasParameterlessConstructor = false;
			for (Constructor<?> constructor : constructors) {
				if (constructor.getTypeParameters().length == 0) {
					hasParameterlessConstructor = true;
				}
			}
			assertTrue("Error clas: "+entityClass.getName() + " is missing"
					+ "a parameterless constructor",hasParameterlessConstructor);
		}
		
	}
	
	
	@Test
	public void embeddablesShouldHaveParameterlessConstructor() {
		for (Class<?> entityClass : entityClasses) {
			Constructor<?>[] constructors = entityClass.getConstructors();
			boolean hasParameterlessConstructor = false;
			for (Constructor<?> constructor : constructors) {
				if (constructor.getTypeParameters().length == 0) {
					hasParameterlessConstructor = true;
				}
			}
			assertTrue("Error clas: "+entityClass.getName() + " is missing"
					+ "a parameterless constructor",hasParameterlessConstructor);
		}
		
	}

}
