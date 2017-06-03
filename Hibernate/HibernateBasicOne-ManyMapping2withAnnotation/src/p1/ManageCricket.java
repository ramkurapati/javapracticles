package p1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageCricket {

	public static void main(String[] args)
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		 Session session = sessionFactory.openSession();
		 System.out.println("session created ...");
		 Transaction tx=session.beginTransaction();
		 
		 Team team1=new Team();
		 team1.setTeamcode("IND");
		 team1.setTname("India");
		 
		 Team team2=new Team();
		 team2.setTeamcode("AUS");
		 team2.setTname("Australia");

		 Player player1=new Player();
		 player1.setPfname("sachin");
		 player1.setPlname("tendulkar");
		 player1.setJersyno(new Integer(10));
		 Player player2=new Player();
		 player2.setPfname("Rahul");
		 player2.setPlname("Dravid");
		 player2.setJersyno(new Integer(07));
		 
		 List<Player> listIND = new ArrayList<Player>();
		 listIND.add(player1);
		 listIND.add(player2);
		 team1.setPlayers(listIND);
	
		 session.save(team1);
		
		 
		 Player player3=new Player();
		 player3.setPfname("Brett");
		 player3.setPlname("Lee");
		 player3.setJersyno(new Integer(20));
		 Player player4=new Player();
		 player4.setPfname("Jeorge");
		 player4.setPlname("Baili");
		 player4.setJersyno(new Integer(77));
		 
		 List<Player> listAUS = new ArrayList<Player>();
		 listAUS.add(player3);
		 listAUS.add(player4);
		 team2.setPlayers(listAUS);
	
		 session.save(team2);
		 
		 tx.commit();
		 
		
		 
		 
	}
}
