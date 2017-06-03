package Map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args)
	{
		
		IdentityHashMap<String,Integer> ihm=new IdentityHashMap<String,Integer>();
		ihm.put("Sony", 7800);
		ihm.put("Samsung", 5100);
		ihm.put(new String("Sony"), 9200);
		ihm.put(new String("Sony"), 1200);
		ihm.put("MicroMax", 4300);
		ihm.put("Htc", 8200);
		ihm.put(new String("Samsung"), 7900);
		
		System.out.println("IdentityHashMap "+ihm);
		
		
		/*HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Sony", 7800);
		hm.put("Samsung", 5100);
		hm.put(new String("Sony"), 9200);
		hm.put("MicroMax", 4300);
		hm.put("Htc", 8200);
		hm.put(new String("Samsung"), 7900);
		
		System.out.println("HashMap "+hm);
		*/

	}

}
