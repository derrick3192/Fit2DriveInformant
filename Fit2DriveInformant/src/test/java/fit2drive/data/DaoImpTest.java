package fit2drive.data;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fit2drive.ApplicationContextAwareTest;
import fit2drive.data.dao.Dao;
import fit2drive.data.entities.F2DEntity;


public abstract class DaoImpTest<Entity extends F2DEntity, DATA, D extends Dao<Entity, DATA>> extends ApplicationContextAwareTest  {



	public abstract Entity createValidEntity();
	
	/** DAO being tested **/
	@Autowired(required=true)
	protected D dao;

	/**
	 * test that the createValidEntity method is working
	 */
	@Test
	public void testGetValidEntity() {
		try {
			Entity entity = createValidEntity();
			if (entity == null) {
				fail("the method DaoImpTest.createValidEntity() returned null, please recode the method in the test");
			}
		}
		catch(Exception e) {
			fail("through an exception while DaoImpTest.createValidEntity()");
		}
	}
	
	public void testGetCount() {
		assertTrue("Dao Count should be non-zero", dao.getCount() >= 0);
	}


	/**
	 * Testing that the DAO being tested creates and deletes the entity as we would expect.
	 */
	@Test
	public void testCreateAndDelete() {

		Entity entity = createValidEntity();

		int initialEntityCount = dao.getCount();

		try {
			dao.save(entity);
		} catch(Exception e) {
			e.printStackTrace();
			fail(dao.getClass() +" through an exception while saving");
		}

		int entityCountAfterSave = dao.getCount();

		assertTrue("Entity count did not increase by 1 after save", initialEntityCount + 1 == entityCountAfterSave);

		try {
			dao.delete(entity);
		} catch (Exception e) {
			e.printStackTrace();
			fail(dao.getClass() +" through an exception while deleting");
		}

		int entityCountAfterDelete = dao.getCount();

		assertTrue("Entity count did not decrease by 1 after delete", initialEntityCount == entityCountAfterDelete);

	}
}
