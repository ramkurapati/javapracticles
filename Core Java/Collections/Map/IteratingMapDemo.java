package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratingMapDemo {

	public static void main(String[] args)
	{
		
	HashMap<String,Integer> hm=new HashMap<String, Integer>();
	hm.put("k",89);
	hm.put("l",79);
	hm.put("m",39);
	hm.put("t",19);
	hm.put("f",69);
	
	System.out.println("------------with keyset------------------------------");
	Iterator<String> it=hm.keySet().iterator();
	while(it.hasNext())
	{
		Object obj=it.next();
		System.out.println(obj+" "+hm.get(obj));
	}
	System.out.println("------------------------------------------");
	
	for(Object obj:hm.keySet())
	{
          System.out.println(obj+" "+hm.get(obj));
	}
	
	System.out.println("------------with entryset------------------------------");
	
	Iterator<Entry<String, Integer>> it2=hm.entrySet().iterator();
	
	while(it2.hasNext())
	{
		Entry<String,Integer> ent=it2.next();
		System.out.println(ent.getKey()+"  "+"  "+ent.getValue());
	}
	System.out.println("------------------------------------------");
	
	for(Entry<String, Integer> ent2:hm.entrySet())
	{
		System.out.println(ent2.getKey()+"  "+"  "+ent2.getValue());
	}
	
	
	}

}
