package DecimalFormat;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class basic2 
{
	public static void main(String[] args) throws ParseException
	{
	
	DecimalFormat decimalFormat = (DecimalFormat)NumberFormat.getNumberInstance(Locale.ENGLISH);
	String pattern1 = "###.##";
	String pattern2 = "###,###.###";
	String pattern3 = "000.###";
	String pattern4 = "##0.###";
	decimalFormat.applyPattern(pattern1);
	String format1 = decimalFormat.format(123456789.123);
	System.out.println(format1);
	
	decimalFormat.applyPattern(pattern2);
	String format2 = decimalFormat.format(123456789.123);
	System.out.println(format2);
	
	decimalFormat.applyPattern(pattern3);
	String format3 = decimalFormat.format(9.9159);
	System.out.println(format3);
	
	decimalFormat.applyPattern(pattern4);
	String format4 = decimalFormat.format(09.9159);
	System.out.println(format4);
	
	String pattern5 = "#,##.###";
	decimalFormat.applyPattern(pattern5);
	decimalFormat.setGroupingSize(4);

	String number = decimalFormat.format(123456789.1237);
	System.out.println(number);
}

}
