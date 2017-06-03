package Bankapp;

import java.util.HashMap;
import java.util.Scanner;

public class WithDraw implements Transaction
{

	private int amount;
	private int newbalance=0;
	
	public void process(HashMap<Integer,String> hm1,HashMap<Integer,Integer> hm2,int balance)
	{
	    System.out.println(" With draw page displaying ");
	    System.out.println("Enter a valid amount to withdraw ");
	    Scanner scan=new Scanner(System.in);
	    int wdamt=scan.nextInt();
		if(wdamt%100==0)
			this.amount=wdamt;
		else
			System.out.println("enter amount in multiples of hundred only");
		
	    if(balance>amount)
 			 newbalance=balance-amount;
	    else
	    	 System.out.println("Insufficient funds");	
	    	
	    System.out.println("remaining balance is "+newbalance);
	 }

}
