package storedprocedure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseUtil 
{

	public static Connection createConnection() throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/mydatabase";
		String user="root";
		String password="system";
		conn=DriverManager.getConnection(url, user, password);
		return conn;
		
	}

}
