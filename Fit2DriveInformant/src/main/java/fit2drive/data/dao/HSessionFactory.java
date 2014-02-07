package fit2drive.data.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author Derrick
 * Bean for wrapping the sessionFactory
 *
 */
@Component
public class HSessionFactory {

	final SessionFactory sessionFactory;
	
	
	@SuppressWarnings("deprecation")
	public HSessionFactory() {
		this.sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	/**
	 * Opens a Hibernate session
	 * @return session
	 */
	public Session openSession() {
		return this.sessionFactory.openSession();
	}
}
