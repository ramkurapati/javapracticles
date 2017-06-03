package Generalization;

import java.util.HashMap;

public class BalanceEnquiry extends Transaction
{

    public void process(HashMap<Integer,String> hm1,HashMap<Integer,Integer> hm2,int accno)
    {
    	 System.out.println(" Balance Enquiry page displaying ");
    	 if(hm1.containsKey(accno)==hm2.containsKey(accno))
 		{
 			System.out.println(" your balace is  "+hm2.get(accno));

 		}
    }
	

}
