package BasicJDBC;

import java.util.List;

public class Bill 
{

	private int id;
	private String billdate;
	private int totalamount;
	private String billdescription;

	int totalbill=0;
	private List<BillItemDetails> billitemdetailsList;
	public Bill()
	{
	}

	public Bill(int id, String billdate,
			String billdescription,List<BillItemDetails> billitemdetailsList) 
	{

		this.id = id;
		this.billdate = billdate;
		this.billdescription = billdescription;
		this.billitemdetailsList=billitemdetailsList;
		int totalbill=0;
		for(BillItemDetails i:this.billitemdetailsList)
		{
			totalbill=totalbill+i.getItemamount();
		}
		this.totalamount=totalbill;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBilldate() {
		return billdate;
	}
	public void setBilldate(String billdate) {
		this.billdate = billdate;
	}
	public int getTotalamount() 
	{
		return totalamount;
	}
	
	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}

	public String getBilldescription() {
		return billdescription;
	}
	public void setBilldescription(String billdescription) {
		this.billdescription = billdescription;
	}

	public List<BillItemDetails> getBillitemdetailsList() {
		return billitemdetailsList;
	}

	public void setBillitemdetailsList(List<BillItemDetails> billitemdetailsList) {
		this.billitemdetailsList = billitemdetailsList;
	}
	

}
