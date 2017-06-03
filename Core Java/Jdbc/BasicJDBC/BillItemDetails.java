package BasicJDBC;

public class BillItemDetails 
{

	private int id;
	private int billid;
	private int itemamount;
	private String itemdescription;

	public BillItemDetails(int id, int billid, int itemamount,
			String itemdescription) {
		super();
		this.id = id;
		this.billid = billid;
		this.itemamount = itemamount;
		this.itemdescription = itemdescription;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public int getItemamount() {
		return itemamount;
	}
	public void setItemamount(int itemamount) {
		this.itemamount = itemamount;
	}
	public String getItemdescription() {
		return itemdescription;
	}
	public void setItemdescription(String itemdescription) {
		this.itemdescription = itemdescription;
	}




}
