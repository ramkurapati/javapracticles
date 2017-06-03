package Bankapp;

import java.util.HashMap;

public class BalanceEnquiry implements Transaction
{

    public void process(HashMap<Integer,String> hm1,HashMap<Integer,Integer> hm2,int balance)
    {
    	    System.out.println(" Balance Enquiry page displaying ");
    		System.out.println(" your balace is  "+balance);
    }

}
