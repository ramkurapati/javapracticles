package SimpleDateFormat;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatDEMO
{

	public static void main(String[] args)
	{
		
		
		String pattern2 = "dd-MM-yy";
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2,Locale.ENGLISH);
		String date2 = simpleDateFormat2.format(new Date());
		System.out.println(date2);
		
		String pattern3 = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(pattern3,Locale.ENGLISH);
		String date3 = simpleDateFormat3.format(new Date());
		System.out.println(date3);
		
		String pattern4 = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(pattern4,Locale.ENGLISH);
		String date4 = simpleDateFormat4.format(new Date());
		System.out.println(date4);
		
		String pattern1 = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern1,Locale.ENGLISH);
		String date1 = simpleDateFormat1.format(new Date());
		System.out.println(date1);
		
		String pattern5 = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat(pattern5,Locale.ENGLISH);
		String date5 = simpleDateFormat5.format(new Date());
		System.out.println(date5);
		
		String pattern6 = "yyyy-MM-dd HH:mm:ss.SSS";
		SimpleDateFormat simpleDateFormat6 = new SimpleDateFormat(pattern6,Locale.ENGLISH);
		String date6 = simpleDateFormat6.format(new Date());
		System.out.println(date6);
		
		String pattern7 = "yyyy-MM-dd HH:mm:ss.SSSZ";
		SimpleDateFormat simpleDateFormat7 = new SimpleDateFormat(pattern7,Locale.ENGLISH);
		String date7 = simpleDateFormat7.format(new Date());
		System.out.println(date7);
		
		String pattern8 = "EEEEE dd MMMMM yyyy HH:mm:ss.SSSZ";
		SimpleDateFormat simpleDateFormat8 = new SimpleDateFormat(pattern8,Locale.ENGLISH);
		String date8 = simpleDateFormat8.format(new Date());
		System.out.println(date8);
		
		
		
		DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(Locale.UK);
		dateFormatSymbols.setWeekdays(new String[]{
		        "Unused",
		        "SUN",
		        "MON",
		        "TUES",
		        "WED",
		        "THRUS",
		        "FRI",
		        "SAT",
		});

		String pattern = "EEEEE MMMMM yyyy";
		SimpleDateFormat simpleDateFormat =new SimpleDateFormat(pattern, dateFormatSymbols);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		
	}

}
