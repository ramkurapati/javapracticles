package DateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class TimeFormatDemo 
{


	public static void main(String[] args) throws ParseException
	{
	
		Locale locale = new Locale("da", "DK");
		DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
		String time = dateFormat.format(new Date());
		System.out.println(time);
		
		DateFormat dateFormat3 = DateFormat.getTimeInstance(DateFormat.SHORT, locale);
		String time3 = dateFormat3.format(new Date());
		System.out.println(time3);
		
		DateFormat dateFormat5 = DateFormat.getTimeInstance(DateFormat.MEDIUM, locale);
		String time5 = dateFormat5.format(new Date());
		System.out.println(time5);
		
		DateFormat dateFormat7 = DateFormat.getTimeInstance(DateFormat.LONG, locale);
		String time7 = dateFormat7.format(new Date());
		System.out.println(time7);
		
		DateFormat dateFormat9 = DateFormat.getTimeInstance(DateFormat.FULL, locale);
		String time9 = dateFormat9.format(new Date());
		System.out.println(time9);
		
		
		
		
		DateFormat dateFormat2 = DateFormat.getTimeInstance(DateFormat.DEFAULT, Locale.UK);
		String time2 = dateFormat2.format(new Date());
		System.out.println(time2);
		
		DateFormat dateFormat4 = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.UK);
		String time4 = dateFormat4.format(new Date());
		System.out.println(time4);
		
		DateFormat dateFormat6 = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.UK);
		String time6 = dateFormat6.format(new Date());
		System.out.println(time6);
		
		DateFormat dateFormat8 = DateFormat.getTimeInstance(DateFormat.LONG, Locale.UK);
		String time8 = dateFormat8.format(new Date());
		System.out.println(time8);
		
		DateFormat dateFormat10 = DateFormat.getTimeInstance(DateFormat.FULL, Locale.UK);
		String time10 = dateFormat10.format(new Date());
		System.out.println(time10);
		
	} 
	
}
