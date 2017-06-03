package Association;

public class Company 
{

	private String compname;
	private int noofemps;
	private String compaddress;
	
	
	public Company(String compname, int noofemps, String compaddress) {
		super();
		this.compname = compname;
		this.noofemps = noofemps;
		this.compaddress = compaddress;
	}

	public String getCompname() {
		return compname;
	}
	
	public int getNoofemps() {
		return noofemps;
	}
	
	public String getCompaddress() {
		return compaddress;
	}
	
	
}
