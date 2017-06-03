package Generalization;

public class Transaction
{
   public   int accno;
     public void process()
     {
    	 System.out.println(" Transaction started ");
     }
     
	public void setAccno(int accno) {
		this.accno = accno;
	}

	public int getAccno() 
	{
		return accno;
	}
     
	
}
