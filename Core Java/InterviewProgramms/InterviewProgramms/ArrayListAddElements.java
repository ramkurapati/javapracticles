package InterviewProgramms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayListAddElements 
{

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		al.add("6");
		al.add("7");
		al.add("8");
		al.add("9");
		al.add("10");
		al.add("11");
		al.add("12");
		al.add("13");
		al.add("14");
		al.add("15");al.add("16");al.add("17");al.add("18");al.add("19");al.add("20");
		
		System.out.println(""+al);
		
		Collections.sort(al);
		System.out.println(""+al);
		
		java.util.Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(" "+it.next());
		}

	}

}
