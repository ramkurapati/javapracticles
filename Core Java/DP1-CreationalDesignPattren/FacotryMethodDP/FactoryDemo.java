package FacotryMethodDP;

import java.util.Scanner;
public class FactoryDemo 
{
	
	public static void main(String args[])
    {
    	   Scanner s=new Scanner(System.in);
    	   System.out.println("Enter country name for currency");
           String cou =s.nextLine();
           Currency currency = CurrencyFactory.createCurrency(cou);
           System.out.println(currency.getSymbol());
    }
}


