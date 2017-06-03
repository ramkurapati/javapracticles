package InterviewProgramms;

import java.util.ArrayList;

public class ArrayListWithOutGenerics {

	
	public static void main(String[] args) 
	{
		
        ArrayList al=new ArrayList();
        al.add("ram");
        al.add(26);
        al.add("male");
        al.add(2014);
        al.add("ATP");
        al.add('K');
        
        System.out.println(""+al);
        for(Object obj:al)
        {
        	System.out.println(""+obj);
        }
        
        
	}

}
