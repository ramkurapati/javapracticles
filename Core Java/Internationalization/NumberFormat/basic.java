package NumberFormat;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class basic 
{
	public static void main(String[] args) throws ParseException
	{
	NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.ENGLISH);
	System.out.println(numberFormat.getMaximumFractionDigits());
	System.out.println(numberFormat.getMinimumFractionDigits());
	System.out.println(numberFormat.getMaximumIntegerDigits());
	System.out.println(numberFormat.getMinimumIntegerDigits());
	
	 int[] myNumber={2,87,45,108,};
	 NumberFormat nf = NumberFormat.getInstance(Locale.ENGLISH);
	 for (int i = 0; i < myNumber.length; ++i)
	 {
	     System.out.println("given list of numbers "+nf.format(myNumber[i])+ "; ");
	 }
	 float [] myNumber2={1.1f,2.2f,3.3f,4.4f,5.5f,6.6f,7.7f,8.8f,9.9f};
	 NumberFormat nf2 = NumberFormat.getIntegerInstance(Locale.ENGLISH);
	 for (int i = 0; i < myNumber2.length; ++i)
	 {
	     System.out.println("Converting float "+myNumber2[i]+" to Integer "+nf2.format(myNumber2[i]) );
	 }
	 float [] myNumber3={1.1f,2.2f,3.3f,4.4f,5.5f,6.6f,7.7f,8.8f,9.9f};
	 NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.UK);
	 for (int i = 0; i < myNumber3.length; ++i)
	 {
	     System.out.println("Converting float "+myNumber3[i]+" to UK currency "+nf3.format(myNumber3[i]) );
	 }
	 float [] myNumber4={1.1f,2.2f,3.3f,4.4f,5.5f,6.6f,7.7f,8.8f,9.9f};
	 NumberFormat nf4 = NumberFormat.getPercentInstance(Locale.UK);
	 for (int i = 0; i < myNumber4.length; ++i)
	 {
	     System.out.println("Converting float "+myNumber4[i]+" to Percentage "+nf4.format(myNumber4[i]) );
	 }
	 float [] myNumber5={1.1f,2.2f,3.3f,4.4f,5.5f,6.6f,7.7f,8.8f,9.9f};
	 Locale[] nf5 = NumberFormat.getAvailableLocales();
	 for (int i = 0; i < myNumber5.length; ++i)
	 {
	     System.out.println("Converting float "+myNumber5[i]+" to length "+nf5.length );
	 }
	 
	 NumberFormat numberFormat2 =NumberFormat.getInstance(Locale.ENGLISH);
			    Number parse = numberFormat2.parse("190.99");
                System.out.println(parse.intValue());
            
     NumberFormat numberFormat3 =NumberFormat.getInstance(Locale.ENGLISH);
            	numberFormat3.setRoundingMode(RoundingMode.HALF_DOWN);
            	numberFormat3.setMinimumFractionDigits(0);
            	numberFormat3.setMaximumFractionDigits(0);
            	String number = numberFormat3.format(99.50);
            	System.out.println(number);   
            	
   
	}
}
