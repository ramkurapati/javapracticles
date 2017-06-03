package practical;

import java.util.HashMap;

public class myApllication 
{

	public static void main(String[] args)
	{
	
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		
		hm1.put(new Integer(1233), "Audi");
		hm1.put(new Integer(1243), "BMW");
		hm1.put(new Integer(1245), "Honda");
		hm1.put(new Integer(1221), "Benz");
		
		HashMap<Integer,Integer> hm2=new HashMap<Integer,Integer>();
		hm2.put(new Integer(1243), 12000);
		hm2.put(new Integer(1233), 15000);
		hm2.put(new Integer(1221), 19000);
		hm2.put(new Integer(1245), 11000);
		
		

		for(int key: hm1.keySet())
		{
					
			if(hm1.containsKey(key)==hm2.containsKey(key))
			{
				System.out.println(key+"  "+hm1.get(key)+" "+hm2.get(key));
			
			}
		}
		
		
	}

}
