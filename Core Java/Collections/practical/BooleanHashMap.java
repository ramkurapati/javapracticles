package practical;

import java.util.HashMap;

public class BooleanHashMap {

	
	public static void main(String[] args)
	{
		HashMap<Boolean,String> hm=new HashMap<Boolean,String>();
		hm.put(true, "ram");
		hm.put(false,"raj");
		hm.put(false, "kalyan");
		hm.put(true, "mohan");
		
		System.out.println(hm);
		
		HashMap<String,Object> hm2=new HashMap<String,Object>();
		hm2.put("ram",true);
		hm2.put("raj","shekar");
		hm2.put("kalyan",34);
		hm2.put("mohan",'k');
		
		System.out.println(hm2);

	}

}
