package SQLExceptionAndClassNotFoundException;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

public class ConnectionManager {

	public static Connection getConnection()
	{ 
        java.sql.Connection conn = null; 
       
            try 
            
            {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			}
            catch (ClassNotFoundException e) 
            {
				e.printStackTrace();
			} 
            String string = "jdbc:oracle:thin:@localhost:1521:XE";
			try 
			{
				conn = DriverManager.getConnection(string,"system","system");
			}
			catch (SQLException e) 
			{
				
				e.printStackTrace();
			} 
            System.out.println("Connection Created Successfully..."); 
      
        return (Connection) conn;

  }
}
