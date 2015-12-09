package database;
import java.io.File;  
  
import org.hibernate.HibernateException;  
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
import org.hibernate.tool.hbm2ddl.SchemaExport;  

public class DataBase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		   Configuration config = null;  
           Session session = null;  
           Transaction tx = null;  
       try {       
            config = new Configuration().configure(new File(       
                   "src/hibernate.cfg.xml"));       
      
            System.out.println("Creating tables...");       
      
            SessionFactory sessionFactory = config.buildSessionFactory();       
            session = sessionFactory.openSession();       
            tx = session.beginTransaction();       
      
            SchemaExport schemaExport = new SchemaExport(config);       
            schemaExport.create(true, true);       
      
            System.out.println("Table created.");       
      
            tx.commit();       
      
        } catch (HibernateException e) {       
            e.printStackTrace();       
           try {       
                tx.rollback();       
            } catch (HibernateException e1) {       
                e1.printStackTrace();       
            }       
        } finally {       
      
        }       
	}

}
