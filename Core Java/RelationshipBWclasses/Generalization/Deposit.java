package Generalization;

import java.util.HashMap;

public class Deposit extends Transaction
{
	private int amount;
	private int newbalance=0;
	
	public void setAmount(int amt) 
	{
		    this.amount = amt;
	}
	public void process(HashMap<Integer,String> hm1,HashMap<Integer,Integer> hm2,int accno)
	{
		 System.out.println(" Deposit page displaying ");
	    if(hm1.containsKey(accno)==hm2.containsKey(accno))
 		{
	
 			 newbalance=hm2.get(accno)+amount;
	    	
 		}
	    System.out.println(" balance is "+newbalance);
	 }

}
