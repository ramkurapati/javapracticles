package OldDataStrutures;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo
{

	public static void main(String[] args)
	{
		
		// Create a hash map
		Hashtable<String, Integer> pincodes =new Hashtable<String, Integer>();
		Enumeration<String> districts;
		String str;
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
		//pincodes.put("Nandyal",      null);Null pointer exception
		//pincodes.put(null,      new Integer(518016));Null pointer exception
		//pincodes.put(null,      null);Null pointer exception
		
		System.out.println("Key Nandyal value  "+pincodes.get("Nandyal"));
		// Show all pincode in hash table.
		districts = pincodes.keys();
		while(districts.hasMoreElements())
		{
			str =(String) districts.nextElement();
			System.out.println(str +": "+pincodes.get(str));
		}
	}

}
