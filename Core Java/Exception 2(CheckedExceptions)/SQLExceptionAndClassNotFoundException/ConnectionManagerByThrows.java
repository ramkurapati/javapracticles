package SQLExceptionAndClassNotFoundException;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

public class ConnectionManagerByThrows {

	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{ 
        java.sql.Connection conn = null; 
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String string = "jdbc:oracle:thin:@localhost:1521:XE";
		conn = DriverManager.getConnection(string,"system","system");
		System.out.println("Connection Created Successfully..."); 
      
        return (Connection) conn;

  }
}
