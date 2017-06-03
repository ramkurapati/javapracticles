package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import java.util.Map.*;
import java.util.Set;

public class HashMapDemo {

	
	public static void main(String[] args)
	{
		HashMap<String, Integer> pincodes=new HashMap<String, Integer>();
		pincodes.put("Anantapur",    new Integer(504001));
		pincodes.put("Kurnool",      new Integer(518001));
		pincodes.put("Chittoor",     new Integer(517001)); 
		pincodes.put("Kadapa",       new Integer(516001));
		pincodes.put("Nellore",      new Integer(524001));
		pincodes.put("Ongole",       new Integer(523001));
		pincodes.put("Guntur",       new Integer(522002));
		pincodes.put("Machilipatnam",new Integer(521001));
		pincodes.put("Vijayawada",   new Integer(520001));
		pincodes.put("Eluru",        new Integer(534001));
		pincodes.put("Kakinada",     new Integer(533001));
		pincodes.put("Vishakapatnam",new Integer(530001));
		pincodes.put("Vijaynagaram", new Integer(535002));
		pincodes.put("Srikakulam",   new Integer(53200798));
		pincodes.put("Srikakulam",   new Integer(532001));
		pincodes.put(null,   new Integer(532001));
		pincodes.put(null,   new Integer(53268701));
		pincodes.put(null,   new Integer(53268901));
		System.out.println("Districts :"+pincodes);
		
		System.out.println("Key Nandyal value  "+pincodes.get("Nandyal"));
		Set<Map.Entry<String,Integer>> set=pincodes.entrySet();
		/*Iterator<?> it=set.iterator();
		while(it.hasNext())
		{
			Entry<?, ?> me= (Entry<?, ?>) it.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}*/
	
		for(Map.Entry<String, Integer> entry:set){
			
			System.out.println(entry.getKey()+" --> "+entry.getValue());
		}
		
		
	}
	
	
}
