package Bankapp;

import java.util.HashMap;
import java.util.Scanner;

public class BankingDemo
{
	public static void main(String[] args)
	{
		int balance=0;
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
		
		
		Customer cust=new Customer();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your acc no ");
		cust.setAccno(scan.nextInt());
		if(hm1.containsKey(cust.getAccno())==hm2.containsKey(cust.getAccno()))
  		{
     		 System.out.println("Hello "+hm1.get(cust.getAccno()));
  			 balance=hm2.get(cust.getAccno());
  		}
	    System.out.println("enter your operation");
	    String operation=scan.next();
	    
	    Transaction trans=TransactionFactory.createTransaction(operation);
	    trans.process(hm1,hm2,balance);
	   	
	
	    
	}

}
