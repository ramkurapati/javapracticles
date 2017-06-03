package BasicJDBC;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BillController
{

	public static void main(String[] args) throws SQLException
	{
		BillItemDetails bitem1=new BillItemDetails(1, 101, 300, "Perfume");
		BillItemDetails bitem2=new BillItemDetails(2, 101, 700, "Shoes");
		List<BillItemDetails> billitemlist1=new ArrayList<BillItemDetails>();
		billitemlist1.add(bitem1);
		billitemlist1.add(bitem2);
		
		Bill bill1=new Bill(101, "31-05-2015", "Purchased at More", billitemlist1);
		/*
		BillItemDetails bitem3=new BillItemDetails(3, 102, 3000, "watch");
		List<BillItemDetails> billitemlist2=new ArrayList<BillItemDetails>();
		billitemlist2.add(bitem3);
			
		Bill bill2=new Bill(102, "31-05-2015", "Purchased at More", billitemlist2);*/
		
		CustomerBillService cbs=CustomerBillService.createInstance();
		cbs.setCbdao(new CustomerBillDAOImpl());
		cbs.insert(bill1);
		//cbs.insert(bill2);
		
		List<Bill> list=cbs.display();
		for(Bill b:list)
		{
			System.out.println("Bill id           : "+b.getId());
			System.out.println("Bill date         : "+b.getBilldate());
			System.out.println("Bill Total amount : "+b.getTotalamount());
			System.out.println("Bill description  : "+b.getBilldescription());
			System.out.println("----------------------------------");
		}
	}
}
