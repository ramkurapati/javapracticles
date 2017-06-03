package p2;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class CreateAccount 
{
 public static void main(String a[])
 
 {
	 
	 Session session = null;
	 try
	 {
		 
		 
	 Configuration cfg = new Configuration();
	 SessionFactory sessionfactory = cfg.configure().buildSessionFactory();
	 
	 session = sessionfactory.openSession();
	 Transaction tx = session.beginTransaction();
	 
	 p2.Account account = new p2.Account();
	account.setAccNum(10000);
	account.setAccBalance(30000);
	account.setAccType("S");
	 
	 session.save(account);
	 
	 tx.commit();
	 
	 System.out.println("Contact Created...");
	 
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 finally
	 {
		 try{ session.close();}catch(Exception e){}
	 }
	 
	 
 }
 
}
