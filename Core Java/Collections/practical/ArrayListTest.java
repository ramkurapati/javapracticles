package practical;

import java.util.ArrayList;

public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("one");// 0-9
		al.add("two");
		al.add("three");
		al.add("four");
		al.add("five");
		al.add("six");
		al.add("seven");
		al.add("eight");
		al.add("nine");
		al.add("ten");
		
		for(int i=1;i<al.size();){
			System.out.println(al.get(i));
			i +=2;//i=i+2;
			
		}
		

	}

}
