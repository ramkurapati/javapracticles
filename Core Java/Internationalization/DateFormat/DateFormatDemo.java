package DateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo 
{

	public static void main(String[] args) throws ParseException
	{
		
		Locale locale = new Locale("da", "DK");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		String date = dateFormat.format(new Date());
		System.out.println(date);
		
		DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.SHORT, locale);
		String date3 = dateFormat3.format(new Date());
		System.out.println(date3);
		
		DateFormat dateFormat5 = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
		String date5 = dateFormat5.format(new Date());
		System.out.println(date5);
		
		DateFormat dateFormat7 = DateFormat.getDateInstance(DateFormat.LONG, locale);
		String date7 = dateFormat7.format(new Date());
		System.out.println(date7);
		
		DateFormat dateFormat9 = DateFormat.getDateInstance(DateFormat.FULL, locale);
		String date9 = dateFormat9.format(new Date());
		System.out.println(date9);
		
		DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.UK);
		String date2 = dateFormat2.format(new Date());
		System.out.println(date2);
		
		DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.UK);
		String date4 = dateFormat4.format(new Date());
		System.out.println(date4);
		
		DateFormat dateFormat6 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.UK);
		String date6 = dateFormat6.format(new Date());
		System.out.println(date6);
		
		DateFormat dateFormat8 = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
		String date8 = dateFormat8.format(new Date());
		System.out.println(date8);
		
		DateFormat dateFormat10 = DateFormat.getDateInstance(DateFormat.FULL, Locale.UK);
		String date10 = dateFormat10.format(new Date());
		System.out.println(date10);
	}
	
	
}
