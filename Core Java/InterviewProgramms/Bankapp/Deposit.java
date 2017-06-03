package Bankapp;

import java.util.HashMap;
import java.util.Scanner;

public class Deposit implements Transaction
{
	private int amount;
	private int newbalance=0;
	
	public void process(HashMap<Integer,String> hm1,HashMap<Integer,Integer> hm2,int balance)
	{
		 System.out.println(" Deposit page displaying ");
		 System.out.println("Enter a  amount to deposit ");
		 Scanner scan=new Scanner(System.in);
		 this.amount = scan.nextInt();
 	     newbalance=balance+amount;
	     System.out.println(" balance is "+newbalance);
	 }

}
