package InterviewProgramms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListDemo {

	public static void main(String[] args) 
	{
	
		List<String> arl=new ArrayList<String>();
		arl.add("b");arl.add("d");arl.add("c");arl.add("e");arl.add("a");arl.add("g");arl.add("f");arl.add("h");arl.add("bb");arl.add("i");arl.add("l");arl.add("p");arl.add("m");arl.add("k");arl.add("n");arl.add("r");arl.add("o");arl.add("q");arl.add("z");arl.add("u");arl.add("s");arl.add("j");arl.add("t");arl.add("w");arl.add("v");arl.add("x");arl.add("y");
		arl.add("ee");arl.add("aa");arl.add("cc");arl.add("gg");arl.add("dd");arl.add("zz");arl.add("ff");arl.add("hh");arl.add("kk");arl.add("ii");arl.add("jj");arl.add("ll");arl.add("mm");arl.add("nn");arl.add("oo");arl.add("ss");arl.add("pp");arl.add("vv");arl.add("rr");arl.add("xx");arl.add("tt");arl.add("qq");arl.add("uu");arl.add("yy");arl.add("ww");
         
		System.out.println(arl);
		Collections.sort(arl);
		System.out.println(arl);
		ArrayList<String> arl2=new ArrayList<String>();
		
		for(String str:arl)
		{
			if(str.length()==1)
			  arl2.add(str);
		}
		for(String str:arl)
		{
			if(str.length()==2)
				arl2.add(str);
		}
		
		System.out.println(arl2);
		
		
	}

}
