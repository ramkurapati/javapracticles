package Generalization;

import java.util.HashMap;
import java.util.Scanner;

public class BankingDemo
{
	private static Scanner scan;

	public static void main(String[] args)
	{
      HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		
		hm1.put(new Integer(1233), "ram");
		hm1.put(new Integer(1243), "raj");
		hm1.put(new Integer(1245), "kalyan");
		hm1.put(new Integer(1221), "venky");
		
		HashMap<Integer,Integer> hm2=new HashMap<Integer,Integer>();
		hm2.put(new Integer(1243), 12000);
		hm2.put(new Integer(1233), 15000);
		hm2.put(new Integer(1221), 19000);
		hm2.put(new Integer(1245), 11000);
		
		
		Transaction trans=new Transaction();
		scan = new Scanner(System.in);
		System.out.println("Enter your acc no ");
		trans.setAccno(scan.nextInt());
	    
	    BalanceEnquiry be=new BalanceEnquiry();
	    be.process();
	    be.process(hm1,hm2,trans.getAccno());
	    
	    /*WithDraw wd=new WithDraw();
	    wd.process();
		System.out.println("Enter a valid amount to withdraw ");
		if(scan.nextInt()%100==0)
		{
			wd.setAmount(scan.nextInt());
	        wd.process(hm1,hm2,trans.getAccno());
		}	    
		else
			System.out.println("enter amount in multiples of hundred only");
	    */
		
		Deposit dep=new Deposit();
		dep.process();
		System.out.println("Enter a  amount to deposit ");
		dep.setAmount(scan.nextInt());
		dep.process(hm1,hm2,trans.getAccno());
	    
	}

}
