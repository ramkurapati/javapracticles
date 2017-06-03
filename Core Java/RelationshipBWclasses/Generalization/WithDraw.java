package Generalization;

import java.util.HashMap;

public class WithDraw extends Transaction
{

	private int amount;
	private int newbalance=0;
	
	public void setAmount(int amt) 
	{
		    this.amount = amt;
	}

	public void process(HashMap<Integer,String> hm1,HashMap<Integer,Integer> hm2,int accno)
	{
	    System.out.println(" With draw page displaying ");
	    if(hm1.containsKey(accno)==hm2.containsKey(accno))
 		{
	    	if(hm2.get(accno)>amount)
 			 newbalance=hm2.get(accno)-amount;
	    	else
	    	 System.out.println("Insufficient funds");	
 		}
	    System.out.println("remaining balance is "+newbalance);
	 }

}
