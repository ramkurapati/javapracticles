package InterviewProgramms;

import java.util.ArrayList;
import java.util.List;

public class DuplicateStringDemo {

	public static void main(String[] args) {
	

		List<String> list=new ArrayList<String>();
		list.add("Ram");
		list.add("ram");
		list.add("MOHAN");
		list.add("Mohan");
		list.add("NAIDU");
		list.add("naidu");
		
		System.out.println(" "+list);
		
		for(String str:list)
		{
			if(str.equalsIgnoreCase("Ram"))
			{
				list.remove("Ram");
				break;
			}
		}
		for(String str:list)
		{
		
			if(str.equalsIgnoreCase("MOHAN"))
			{
				list.remove("MOHAN");
				break;
			}
		}
		for(String str:list)
		{
		
			if(str.equalsIgnoreCase("NAIDU"))
			{
				list.remove("NAIDU");
				break;
			}
			
		}
		System.out.println(" "+list);
	}

}
