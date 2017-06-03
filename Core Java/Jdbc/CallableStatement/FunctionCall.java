package CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;

import storedprocedure.DataBaseUtil;

public class FunctionCall {

	public static void main(String[] args) throws Exception{  
		
		Connection con=DataBaseUtil.createConnection();
		CallableStatement stmt=con.prepareCall("{call getAge(?,?)}");  
		stmt.setString(1,"1506914");
		stmt.registerOutParameter(2,java.sql.Types.INTEGER);  
		stmt.execute();
		System.out.println(stmt.getInt(2));  
	}
}
