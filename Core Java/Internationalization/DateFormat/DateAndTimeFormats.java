package DateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateAndTimeFormats 
{

	public static void main(String[] args) throws ParseException
	{
	
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT,DateFormat.DEFAULT, Locale.UK);
		String date = dateFormat.format(new Date());
		System.out.println(date);
		
		DateFormat dateFormat2 = DateFormat.getDateTimeInstance(DateFormat.DEFAULT,DateFormat.DEFAULT, Locale.ENGLISH);
		String date2 = dateFormat2.format(new Date());
		System.out.println(date2);
		
		DateFormat dateFormat3 = DateFormat.getDateTimeInstance(DateFormat.DEFAULT,DateFormat.DEFAULT, Locale.FRANCE);
		String date3 = dateFormat3.format(new Date());
		System.out.println(date3);
	}
}
