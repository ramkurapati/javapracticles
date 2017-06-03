package BasicJDBC;

import java.sql.SQLException;
import java.util.List;

public interface CustomerBillDAO 
{

	public void insertBills(Bill bill) throws SQLException;
	public List<Bill> getBills() throws SQLException;
	
}
