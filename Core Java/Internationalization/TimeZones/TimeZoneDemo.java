package TimeZones;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneDemo
{

	public static void main(String[] args)
	{
		Calendar calendar = new GregorianCalendar();

		calendar.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));

		calendar.set(Calendar.HOUR_OF_DAY, 12);

		System.out.println("UTC: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("UTC: " + calendar.getTimeInMillis());

		calendar.setTimeZone(TimeZone.getTimeZone("Europe/Copenhagen"));
		System.out.println("CPH: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("CPH: " + calendar.getTimeInMillis());

		calendar.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		System.out.println("NYC: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("NYC: " + calendar.getTimeInMillis());
		
		calendar.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
		System.out.println("IST: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("IST: " + calendar.getTimeInMillis());
		
		String[] availableIDs = TimeZone.getAvailableIDs();

		for(String id : availableIDs) {
		    System.out.println("id = " + id);
		}

	}

}
