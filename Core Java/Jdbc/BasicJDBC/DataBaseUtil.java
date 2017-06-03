package BasicJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseUtil 
{
	private static Connection conn;

	public static Connection createConnection() throws ClassNotFoundException, SQLException
	{
		if(conn==null)
		{
		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/mydatabase";
		String user="root";
		String password="system";
		conn=DriverManager.getConnection(url, user, password);
		}
		return conn;
		
	}

}
