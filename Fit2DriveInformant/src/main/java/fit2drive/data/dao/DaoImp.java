package fit2drive.data.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import fit2drive.data.entities.F2DEntity;


/*
 * 		Example of performing a rollback using hibernate from MKong.		
 * 
 *         Session session = null;
    	Transaction tx = null;
 
    	try{
    		session = HibernateUtil.getSessionFactory().openSession();
    		tx = session.beginTransaction();
    		tx.setTimeout(5);
 
    		//doSomething(session);
 
    		tx.commit();
 
 
    	}catch(RuntimeException e){
    		try{
    			tx.rollback();
    		}catch(RuntimeException rbe){
    			log.error("Couldn’t roll back transaction", rbe);
    		}
    		throw e;
    	}finally{
    		if(session!=null){
    			session.close();
    		}
    	}
 */



/**
 * @author Derrick
 * 
 * Basic Dao which all Dao's should extend
 *
 * @param <ENTITY> class of the enity the Dao managers
 */
public abstract class DaoImp<ENTITY extends F2DEntity, DATA> implements Dao<ENTITY, DATA> {



	/** The Hibernate session factory **/
	@Autowired
	protected HSessionFactory sessionFactory;
	
	
	public void save(ENTITY entity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}
	
	public void update(ENTITY entity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(entity);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(ENTITY entity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(entity);
		session.getTransaction().commit();
		session.close();
	}
	
	/**
	 * Needed because of poor Java Generic's
	 * 
	 * @param id
	 * @param cls
	 * @return
	 */
	private ENTITY get(int id, Class<?> cls) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		ENTITY t = (ENTITY) session.get(cls, id);
		
		session.close();
		
		return t;
	}
	
	/**
	 * This must be defined for every DaoImp because of poor Generic's in Java
	 * 
	 * @return Class which extends DaoImp
	 */
	public abstract Class<ENTITY> getEntityClass();
	
	
	@Override
	public ENTITY get(int id) {
		return this.get(id, getEntityClass());
	}
	
	
	@Override
	public List<ENTITY> getAll() {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Criteria criteria = session.createCriteria(getEntityClass());
		
		@SuppressWarnings("unchecked")
		List<ENTITY> entities = criteria.list();
		session.getTransaction().commit();
		session.close();
		
		return entities;
	}
	

	// TODO optimise this code
	public int getCount() {
		return this.getAll().size();
	}


	@Override
	public String[] getHeadings() {
		return this.createValidEntity().headings();
	}

	@Override
	public int numberOfColumns() {
		return this.numberOfColumns();
	}
	
	@Override
	public Object[][] getData() {
		
		final int noRows = this.getCount();
		final int noColumns = this.numberOfColumns();
		
		List<ENTITY> entities = this.getAll();
		Object[][] data = new Object[noRows][noColumns]; 
		
		for (int i = 0; i < noRows; i++) {
			Object[] rowOfData = entities.get(i).asRow();
			for (int j = 0; j < noColumns; j++) {
				data[i][j] = rowOfData[j];
			}
		}
		
		return data;
	}

}
