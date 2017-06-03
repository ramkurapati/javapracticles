package Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		
		hm.put(9208, "sony");
		hm.put(1100, "Nokia");
		hm.put(7788, "Karbon");
		
		
		System.out.println(hm);
		/*hm.remove(null);
		System.out.println(hm);
		System.out.println(hm.get(7989));*/
		
		//Set<Integer> keys=hm.keySet();
		//System.out.println(keys);
		
		Collection<String> vals= hm.values();
		System.out.println(vals);
		
		Set<Entry<Integer,String>> entry=hm.entrySet();
		
		
		
		for(Integer i:hm.keySet()){
			System.out.println(i + " "+hm.get(i));
			
		}
		for(String s:vals){
			System.out.println(s + " ");
			
		}
		for(Entry<Integer,String> e:entry){
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
		
		
		
		
		
	}

}
