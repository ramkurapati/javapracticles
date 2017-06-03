
package roseindia;

import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//Goups and Stories

public class OneToManyRelation {


	//Group and Multiple Stories
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessFact = null;
		Session session = null;
		try {
			sessFact=new Configuration().configure().buildSessionFactory();
			session=sessFact.openSession();
			Transaction tr = session.beginTransaction();
			
			//Group Object
			Group group = new Group("Java Group 2");
			//Array list to hold stories
			ArrayList list = new ArrayList();
			
			// Create Stories
			Story javaHistory = new Story();
			javaHistory.setInfo("Java History");
			list.add(javaHistory);
			
			// Create Stories
			Story javaPlatform = new Story();
			javaPlatform.setInfo("Java Platforms");
			list.add(javaPlatform);

			// Create Stories
			Story javaNews = new Story();
			javaNews.setInfo("Java News");
			list.add(javaNews);

			// Create Stories
			Story jeeNews = new Story();
			jeeNews.setInfo("JEE News");
			list.add(jeeNews);
			
			//Add the list to Group object
			group.setStories(list);
		    
		    
		    //Save group
		    session.save(group);
		    
		    //Print the generated group id
		    System.out.println("Group id:" + group.getId());
		    
		    /*
		    
		    //Load the group class
		    Group g = (Group) session.load(Group.class, 1);
		    System.out.println("Group Name:" + g.getName());
		    
		    List listStories = g.getStories();
		    Iterator storiesIter = listStories.iterator();
		    while(storiesIter.hasNext()) {
		    	Story story = (Story)storiesIter.next();
		    	System.out.println("Story Info:" + story.getInfo());
		    }
		    */
		    
		    tr.commit();
		    
		    
		}
		catch (HibernateException he){
			System.out.println(he.getMessage());
		}
		finally{
			//Session close
			session.close();
			//SessionFactory close 
			sessFact.close();
		}

	}

}
