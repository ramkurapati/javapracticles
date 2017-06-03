package storedprocedure;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

public class Demo {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws SQLException, ParseException {
		Employee employee=new Employee();
		employee.setId("1506544");
		employee.setName("Rammohan");
		employee.setDob("21-10-1987");
		employee.setSalary(29000);
		Connection conn=null;
		PreparedStatement ps=null;
		CallableStatement stmt = null;
		try
		{
		conn=DataBaseUtil.createConnection();
		/*String sql="insert into employee values(?,?,?,?)";
		ps=conn.prepareStatement(sql);
		ps.setString(1,employee.getId());
		ps.setString(2, employee.getName());
		ps.setString(3, employee.getDob());
		ps.setInt(4, employee.getSalary());
		int rs=ps.executeUpdate();
		if(rs!=0)
			System.out.println(rs+" row(s) inserted sucessfully into employee table");*/
		
		  String sql = "{call getEmpName (?, ?)}";
	      stmt = conn.prepareCall(sql);
	      String empID ="1506544" ;
	      stmt.setString(1, empID); 
	      stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
	      System.out.println("Executing stored procedure..." );
	      stmt.execute();
	      String empName = stmt.getString(2);
	      System.out.println("Emp Name with ID:" + 
	               empID + " is " + empName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(conn!=null)
				conn.close();
			if(ps!=null)
				ps.close();
		}
		

	}

}
