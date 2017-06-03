package BasicJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerBillDAOImpl implements CustomerBillDAO
{

	@Override
	public void insertBills(Bill bill) throws SQLException 
	{
		Connection conn=null;
		PreparedStatement ps=null;
		try
		{
		conn=DataBaseUtil.createConnection();
		String sql="insert into bill values(?,?,?,?)";
		ps=conn.prepareStatement(sql);
		ps.setInt(1,bill.getId());
		ps.setString(2, bill.getBilldate());
		ps.setInt(3, bill.getTotalamount());
		ps.setString(4, bill.getBilldescription());
		int rs=ps.executeUpdate();
		if(rs!=0)
			System.out.println(rs+" row(s) inserted sucessfully into bill table");
		String sql2="insert into billitemdetails values(?,?,?,?)";
		for(BillItemDetails i:bill.getBillitemdetailsList())
		{
		ps=conn.prepareStatement(sql2);
		ps.setInt(1,i.getId());
		ps.setInt(2,i.getBillid() );
		ps.setInt(3,i.getItemamount());
		ps.setString(4,i.getItemdescription());
		int rs2=ps.executeUpdate();
		if(rs2!=0)
			System.out.println(rs+" row(s) inserted sucessfully into billitemdetails table");
		}
		//System.exit(0);
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

	@Override
	public List<Bill> getBills() throws SQLException 
	{
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<Bill> list=new ArrayList<>();
		try
		{
		conn=DataBaseUtil.createConnection();
		String sql="select * from bill";
		ps=conn.prepareStatement(sql);
		rs=ps.executeQuery();
		
		while(rs.next())
		{
			Bill b=new Bill();
			b.setId(rs.getInt("id"));
			b.setBilldate(rs.getString("bill_date"));
			b.setTotalamount(rs.getInt("total_amount"));
			b.setBilldescription(rs.getString("bill_description"));
			
			list.add(b);		
		}
		
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
			if(rs!=null)
				rs.close();
		}
		return list;
	}
	

}
