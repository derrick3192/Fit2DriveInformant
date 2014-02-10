//package fit2drive.data.quicktable;
//
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.sql.SQLException;
//import java.util.Properties;
//
//import quick.dbtable.DBTable;
//
///**
// * @author Derrick
// * 
// * Quick table for debugging purposes, to quickly view tables in a database
// *
// */
//public class Quicktable extends DBTable {
//
//	/**
//	 * 
//	 */
//	
//	
//	
//	String entityName;
//	
//	
//	public Quicktable(String entityName) {
//		
//		Properties hibernateProperties = new Properties();
//		InputStream input = null;
//	 
//		try {
//	 
//			input = new FileInputStream("hibernate.properties");
//	 
//			// load a properties file
//			hibernateProperties.load(input);
//		} catch(Exception e) {
//			return;
//		}
//		
//		init(entityName, hibernateProperties);
//		
//	}
//	
//	public Quicktable(String entityName, Properties hibernateProperties) {
//		init(entityName, hibernateProperties);
//	}
//	
//	/**
//	 * @param hibernateProperties - Hibernate properties to connect to the database
//	 * @param entityName
//	 */
//	private void init(String entityName, Properties hibernateProperties) {
//		
//		// name of the entity
//		this.entityName = entityName;
//		
//		// properties of the database
//		this.setUser(hibernateProperties.			getProperty("hibernate.connection.username"));
//		this.setPassword(hibernateProperties.		getProperty("hibernate.connection.password"));
//		this.setDatabaseDriver(hibernateProperties.	getProperty("hibernate.connection.driver_class"));
//		this.setJdbcUrl(hibernateProperties.		getProperty("hibernate.connection.url"));
//		
//		// set the sql statement the table will show
//		this.setSelectSql("select * from "+this.entityName);
//		
//	      try
//	      {
//	         //connect to database & create a connection
//	         this.connectDatabase();
//	  
//	         //fetch the data from database to fill the table
//	         this.refresh();
//	      }
//	      catch(SQLException e)
//	      {
//	         e.printStackTrace();
//	      }
//	      catch(ClassNotFoundException e)
//	      {
//	         e.printStackTrace();
//	      }
//		
//	}
//	
//}
