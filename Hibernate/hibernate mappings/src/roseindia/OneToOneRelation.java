
package roseindia;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneRelation {

	public static void main(String[] args) {

		SessionFactory sessFact=null;
		Session sess=null;
		try{
			sessFact=new Configuration().configure().buildSessionFactory();
			sess=sessFact.openSession();
			System.out.println("sess:"+sess);
			
			//Create Customer Object
			Employee emp = new Employee();		
			emp.setName("Ram");
			
			//Create address object
			EmployeeAddress address = new EmployeeAddress();
			//Set some values
			address.setAddress("banglore");
			address.setCountry("India");
			
			emp.setAddress(address);
			
			Transaction tr = sess.beginTransaction();
			sess.save(emp);
			tr.commit();
			
			System.out.println("Done");

		}
		catch (HibernateException he){
			System.out.println(he.getMessage());
		}
		finally{
			//SessionFactory close 
			sessFact.close();
			//Session close
			sess.close();
		}

	}

}
