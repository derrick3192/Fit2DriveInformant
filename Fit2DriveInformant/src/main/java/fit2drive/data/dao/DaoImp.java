package fit2drive.data.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import fit2drive.data.entities.F2DEntity;

/**
 * @author Derrick
 * 
 * Basic Dao which all Dao's should extend
 *
 * @param <ENTITY> class of the enity the Dao managers
 */
public abstract class  DaoImp<ENTITY extends F2DEntity, DATA> implements Dao<ENTITY, DATA> {



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
	
	

}
