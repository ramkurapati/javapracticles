package OldDataStrutures;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class EnumSetDemo2 {

	
	enum Week
	{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
		
	}
	
	public static void main(String[] args)
	{
		EnumSet<Week> weekdays=EnumSet.range(Week.MONDAY, Week.FRIDAY);
		EnumSet<Week> weekends=EnumSet.of(Week.SATURDAY, Week.SUNDAY);
		EnumSet<Week> fullweek=EnumSet.allOf(Week.class);
		EnumSet<Week> nullweek=EnumSet.noneOf(Week.class);
		EnumSet<Week> fullweek2=fullweek.clone();
		EnumSet<Week> workingdays=EnumSet.copyOf(weekdays);//EnumSet<Week>
		EnumSet<Week> holidays=EnumSet.complementOf(weekdays);//remaining of weekdays=weekends
		EnumSet<Week> workingdays2=EnumSet.complementOf(weekends);//remaining of weekends=weekdays
		workingdays2.add(Week.SATURDAY);
		List<Week> list=new ArrayList<Week>();
		list.add(Week.FRIDAY);
		list.add(Week.SUNDAY);
	
		EnumSet<Week> fesitivaldays=EnumSet.copyOf(list);//Collection<Week>
		System.out.println("weekdays    "+weekdays);
		System.out.println("weekends    "+weekends);
		System.out.println("Total week  "+fullweek);
		System.out.println("Total week clone "+fullweek2);
		System.out.println("Zero week   "+nullweek);
		System.out.println("workingdays "+workingdays);
		System.out.println("holidays    "+holidays);
		System.out.println("workingdays for small cmpys "+workingdays2);
		System.out.println("fesitivaldays "+fesitivaldays);
	}
}
