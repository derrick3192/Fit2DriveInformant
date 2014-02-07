package fit2drive.data.dao;

import java.util.List;

import fit2drive.data.entities.F2DEntity;

/**
 * @author Derrick
 * 
 * Most basic behavior of a Dao
 *
 * @param <T>
 */
public interface Dao<T extends F2DEntity> {

	/**
	 * This method should save the entity
	 * @param entity
	 */
	public void save(T entity);
	
	
	/**
	 * This method should delete the entity
	 * @param entity
	 */
	public void delete(T entity);
	
	
	/**
	 * This method should update the entity
	 * @param entity
	 */
	public void update(T entity);
	
	
	
	/**
	 * This method should retrieve the entity with the given id
	 * @param id - id of the entity
	 * @return
	 */
	public T get(int id);


	/**
	 * Method to retrieve all entities from the Dao
	 * 
	 * @return All Entities
	 */
	List<T> getAll();
	
	
	
	/**
	 * Method to find the number of all the entities
	 * 
	 * @return number of entities
	 */
	int getCount();
}
