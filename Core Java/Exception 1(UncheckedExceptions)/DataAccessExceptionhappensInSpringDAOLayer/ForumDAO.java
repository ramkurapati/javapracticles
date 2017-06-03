package DataAccessExceptionhappensInSpringDAOLayer;

public interface ForumDAO {

	public void insertForum(Forum forum);
	public Forum selectForum(int forumId);
	
}
