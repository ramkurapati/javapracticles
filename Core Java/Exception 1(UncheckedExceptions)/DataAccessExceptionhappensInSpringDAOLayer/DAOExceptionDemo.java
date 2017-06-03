package DataAccessExceptionhappensInSpringDAOLayer;

public class DAOExceptionDemo 
{

	
	public static void main(String[] args)
	{
		        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
				
				ForumDAO forumDAO = (ForumDAO) context.getBean("forumDAO");
				
				Forum springForum = new Forum(1, "Spring Forum",
				
				"Discuss everything related to Spring");
				
				try {
				
				forumDAO.insertForum(springForum);
				
				} catch (DuplicateKeyException e) {
				
				System.out.println("Forum Already Exist");
				
				} catch (DataAccessException e) {
				
				e.printStackTrace();
			
				}
			
				try {
			
				System.out.println(forumDAO.selectForum(2));
			
				} catch (EmptyResultDataAccessException e) {
			
				System.out.println("The Forum id is invalid");
				
				} catch (DataAccessException e) {
				
				e.printStackTrace();
				
				}

	}

}
