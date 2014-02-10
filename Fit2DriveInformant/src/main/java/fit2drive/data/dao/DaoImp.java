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
 * @param <T> class of the enity the Dao managers
 */
public abstract class  DaoImp<T extends F2DEntity> implements Dao<T> {



	/** The Hibernate session factory **/
	@Autowired
	protected HSessionFactory sessionFactory;
	
	
	public void save(T entity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}
	
	public void update(T entity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(entity);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(T entity) {
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
	private T get(int id, Class<?> cls) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		T t = (T) session.get(cls, id);
		
		session.close();
		
		return t;
	}
	
	/**
	 * This must be defined for every DaoImp because of poor Generic's in Java
	 * 
	 * @return Class which extends DaoImp
	 */
	public abstract Class<T> getEntityClass();
	
	
	@Override
	public T get(int id) {
		return this.get(id, getEntityClass());
	}
	
	
	@Override
	public List<T> getAll() {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Criteria criteria = session.createCriteria(getEntityClass());
		
		@SuppressWarnings("unchecked")
		List<T> entities = criteria.list();
		session.getTransaction().commit();
		session.close();
		
		return entities;
	}
	

	// TODO optimise this code
	public int getCount() {
		return this.getAll().size();
	}
	
	

}
