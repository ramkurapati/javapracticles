package OldDataStrutures;

import java.util.EnumSet;

public class EnumSetDemo {

	
	enum courses{Java,C,CPP,ManualTesting,AutomaticTesting};
	
	public static void main(String[] args)
	{
		EnumSet<courses> developers=EnumSet.of(courses.Java,courses.C,courses.CPP);
		EnumSet<courses> testers=EnumSet.of(courses.ManualTesting,courses.AutomaticTesting);
		if(developers.contains(courses.C))
		{
			System.out.println("C language is present in developers");
		}
		if(!testers.contains(courses.Java))
		{
			System.out.println("java language is not present testers");
		}
		for(courses c:developers)
		{
			System.out.println("languages  present in developers "+c);
		}
		for(courses c:testers)
		{
			System.out.println("languages  present in testers    "+c);
		}
		
	}
}
