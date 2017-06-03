package Dependency;

public class ShoppingMall 
{

	private String mallname;
	private Customer cust;
	
	ShoppingMall(String mname)
	{
		this.mallname=mname;
	}

	public String getMallname() {
		return mallname;
	}
	public void offer(Customer c)
	{
		this.cust=c;
	}

	public Customer getCust() {
		return cust;
	}
	
	
	
}
