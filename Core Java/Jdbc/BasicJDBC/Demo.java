package BasicJDBC;

import java.sql.Connection;
import java.sql.SQLException;

public class Demo {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Connection con=null;
		try{
			 con=DataBaseUtil.createConnection();
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("in finally");
		}
		
		System.out.println(con);
		

	}

}
