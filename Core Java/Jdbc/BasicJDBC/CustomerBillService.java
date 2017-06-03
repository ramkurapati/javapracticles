package BasicJDBC;

import java.sql.SQLException;
import java.util.List;

public class CustomerBillService 
{
	private static CustomerBillService customerBillService =new CustomerBillService();
	
	public static CustomerBillService  createInstance()
	{
		return customerBillService;
		
	}
	
	private CustomerBillDAO cbdao;

	public CustomerBillDAO getCbdao() {
		return cbdao;
	}

	public void setCbdao(CustomerBillDAO cbdao) {
		this.cbdao = cbdao;
	}
	
	public void insert(Bill bill) throws SQLException
	{
		cbdao.insertBills(bill);
	}
	
	public List<Bill> display() throws SQLException
	{
		return cbdao.getBills();
		
	}
 
}
