package fit2drive.data.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import fit2drive.data.entities.F2DEntity;
import fit2drive.data.tables.DataColumn;
import fit2drive.data.tables.TableModelable;

/**
 * @author Derrick
 * 
 * Basic Dao which all Dao's should extend
 *
 * @param <T> class of the enity the Dao managers
 */
public abstract class  DaoImp<T extends F2DEntity> implements Dao<T>, TableModelable {

	public DaoImp() {
		this.dataColumns = this.createDataColumns();
	}


	/** The Hibernate session factory **/
	@Autowired
	protected HSessionFactory sessionFactory;

	
	public DataColumn[] getDataColumns() {
		return this.dataColumns;
	}
	
	
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
	
	
	
	
	
	
	/*
	 * Table Methods
	 */
	
	/** List of the columns **/
	final DataColumn[] dataColumns;
	
	/** Dao's must create their own DataColumns **/
	abstract protected DataColumn[] createDataColumns();

	/**
	 * @return number of active columns
	 */
	public int getNoActiveColumns() {
		int count = 0;
		for (DataColumn dataColumn : this.getDataColumns()) {
			if (dataColumn.isActive()) {
				count++;
			}
		}
		return count;
	}
	
	
	
	/**
	 * @return number of columns
	 */
	public int getNoColumns() {
		return this.createDataColumns().length;
	}
	
	
	/**
	 * @return array of the active indexes
	 */
	@SuppressWarnings("unused")
	private int[] getActiveRowIndexes() {
		
		int[] activeColumnIndexes = new int[this.getNoActiveColumns()];
		int count = 0;
		for (int i=0; i< dataColumns.length; i++){
			DataColumn column = dataColumns[i];
			if (column.isActive()) {
				activeColumnIndexes[count] = i;
				count++;
			}
		}
		return activeColumnIndexes;
	}
	
	
//	/**
//	 * @return all Active Rows and Data
//	 */
//	public Object[][] getActiveRows() {
//		
//		int[] activeIndexes = this.getActiveRowIndexes();
//		
//		List<T> allEntities = getAll();
//		Object[][] tableRows = new Object[allEntities.size()][getNoActiveColumns()];
//		
//		for (int i=0; i<allEntities.size(); i++) {
//			T entity = allEntities.get(i);
//			Object[] globalRow = entity.getTableRow();
//			for (int localRowIndex=0; localRowIndex < activeIndexes.length; localRowIndex++) {
//				int activeIndex = activeIndexes[localRowIndex];
//				tableRows[i][localRowIndex] = globalRow[activeIndex];
//			}
//		}
//		return tableRows;
//	}
//	
//
//	/**
//	 * @return all rows.
//	 */
//	public Object[][] getRows() {
//		List<T> allEntities = getAll();
//		Object[][] tableRows = new Object[allEntities.size()][this.getNoColumns()];
//		
//		for (int i=0; i<allEntities.size(); i++) {
//			T entity = allEntities.get(i);
//			Object[] globalRow = entity.getTableRow();
//			tableRows[i] = globalRow;
//		}
//		return tableRows;
//	}

}
