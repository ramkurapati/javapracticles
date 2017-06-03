package Map;
import java.util.*;
public class TreeMapDemo {

	
	public static void main(String[] args) throws NullPointerException
	{
		TreeMap<String,Integer> pincodes=new TreeMap<String,Integer>();
		try{
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
			pincodes.put("Srikakulam",   new Integer(532001));
			pincodes.put("Srikakulam",   new Integer(5378701));
			//pincodes.put(null,   new Integer(5378701));	
		}
		catch(Exception ne){
			System.out.println(ne);
			//System.out.println("Null not allowed in TreeMap as key");
		}
		
		System.out.println(pincodes);
		/*System.out.println("Key Nandyal value  "+pincodes.get("Nandyal"));
		System.out.println("keys  "+pincodes.keySet());
		System.out.println("values"+pincodes.values());
		System.out.println("Key value 5 :"+pincodes.get("Ongole"));
		System.out.println(pincodes.firstKey()+":"+pincodes.get(pincodes.firstKey()));
		System.out.println(pincodes.lastKey()+":"+pincodes.get(pincodes.lastKey()));
		for(String str:pincodes.keySet()){
			System.out.println(str+"  "+pincodes.get(str));
			pincodes.put("Sri",   new Integer(55678701));
		}*/
	}
}
