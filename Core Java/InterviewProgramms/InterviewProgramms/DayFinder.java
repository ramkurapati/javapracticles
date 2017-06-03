package InterviewProgramms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayFinder {


	public static void main(String[] args) 
	{
		
		Date y = new Date(1000L*60*60*24);
		System.out.println(y);
		Date y2 = new Date(10956000L*60*60*24);
		System.out.println(y2);
		Date   newDate;
        String inputDate = "24-05-2015";
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        System.out.print("  " + inputDate + " parses as ");
        try
          {
            newDate = formatter.parse(inputDate);
            System.out.print(newDate + ".");
           }
        catch (ParseException e) 
           {
        	System.out.print("Unparseable using " + formatter + ".");
           }    
	}

}
