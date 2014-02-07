package fit2drive.data.members;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Embeddable;

import org.junit.BeforeClass;
import org.junit.Test;
import org.reflections.Reflections;




/**
 * @author Derrick
 * 
 * Test to confirm Embeddables are coded correctly.
 *
 */
public class TestEmbeddablesConfiguration {

	/** Set of all embeddable classes in the project. */
	private static Set<Class<?>> embeddableClasses;

	@BeforeClass
	public static void beforeClass() {

		// get all embeddable classes
		Reflections reflections = new Reflections("fit2drive");
		embeddableClasses = reflections.getTypesAnnotatedWith(Embeddable.class);

	}

	
	/*
	 * All embeddable entities need a parameterless constructor
	 */
	@Test
	public void embeddablesShouldHaveParameterlessConstructor() {
		for (Class<?> entityClass : embeddableClasses) {
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
	
	
	/*
	 * All embedable entities need getters and setters
	 */
	@Test
	public void embeddablesShouldHaveGettersAndSetters() {

		for (Class<?> entityClass : embeddableClasses) {

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

}
