package Test;


import java.util.HashMap;

public class Customer 
{
	private long custNo;
    private String custName;
    private String operator;
	private String custstate;
    private String custCountry;
    
    public Customer()
    {
    	
    }
   
    public Customer(long custNo, String custName, String operator,
			String custstate, String custCountry) {
		
		this.custNo = custNo;
		this.custName = custName;
		this.operator = operator;
		this.custstate = custstate;
		this.custCountry = custCountry;
	}



	public long getCustNo() {
        return custNo;
    }
   
    public String getCustName() {
        return custName;
    }
  
    public String getOperator() {
		return operator;
	}

	public String getCuststate() {
		return custstate;
	}
	
	public String getCustCountry() {
        return custCountry;
    }
   
    
    public HashMap<Long,Customer> loadData()
    {
    	HashMap<Long,Customer> hm=new HashMap<>();
    	hm.put(9505584532L, new Customer(9505584532L,"Rammohan naidu k","AirTel","Andhra Pradesh","India"));
    	hm.put(9951232332L, new Customer(9951232332L,"Rajendra Prasad k","AirTel","Andhra Pradesh","India"));
    	hm.put(9620735469L, new Customer(9620735469L,"Mahendra Jalla","Vodafone","Karntaka","India"));
    	hm.put(9440232332L, new Customer(9440232332L,"Sham","BSNL","Andhra Pradesh","India"));
    	hm.put(9620778989L, new Customer(9620778989L,"Ram","VODAFONE","Andhra Pradesh","India"));
    	
		return hm;
    	
    }
}
