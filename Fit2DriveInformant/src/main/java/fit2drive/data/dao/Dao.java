package fit2drive.data.dao;

import java.util.List;

import fit2drive.data.entities.F2DEntity;

/**
 * @author Derrick
 * 
 * Most basic behavior of a Dao
 *
 * @param <ENTITY>
 */
public interface Dao<ENTITY extends F2DEntity, DATA> {

	/**
	 * This method should save the entity
	 * @param entity
	 */
	public void save(ENTITY entity);
	
	
	/**
	 * This method should delete the entity
	 * @param entity
	 */
	public void delete(ENTITY entity);
	
	
	/**
	 * This method should update the entity
	 * @param entity
	 */
	public void update(ENTITY entity);
	
	
	
	/**
	 * This method should retrieve the entity with the given id
	 * @param id - id of the entity
	 * @return
	 */
	public ENTITY get(int id);


	/**
	 * Method to retrieve all entities from the Dao
	 * 
	 * @return All Entities
	 */
	List<ENTITY> getAll();
	
	
	
	/**
	 * Method to find the number of all the entities
	 * 
	 * @return number of entities
	 */
	int getCount();
	
	
	
	
	
	/**
	 * Method to create a new entity given some user input.
	 * 
	 * @param data - user input to create the entity
	 * @return new Entity from the data
	 */
	public ENTITY createEntity(DATA data);
	
	
	
	
	
	/**
	 * Create an entity for testing purposes and table functionality for retrieving headings.
	 */
	public ENTITY createValidEntity();
	
	
	
	/**
	 * Headings.
	 */
	public String[] getHeadings();
	
	
	/**
	 * No of columns.
	 */
	public int numberOfColumns();
	
	
	
	/**
	 * Get the data.
	 */
	public Object[][] getData();
}
