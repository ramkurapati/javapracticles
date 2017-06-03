package OldDataStrutures;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class EnumMapDemo 
{
	enum Panchabhutas
	{
		Akash,Vayu,Tejas,Jala,Prithvi;
	}
	
	public static void main(String[] args)
	{
		EnumMap<Panchabhutas,String> enummap=new EnumMap<Panchabhutas,String>(Panchabhutas.class);
		enummap.put(Panchabhutas.Vayu,   "Air");
		enummap.put(Panchabhutas.Prithvi,"Earth");
		enummap.put(Panchabhutas.Jala,   "Water");
		enummap.put(Panchabhutas.Tejas,  "Fire");
		enummap.put(Panchabhutas.Akash,  "Sky");
		
		System.out.println("Size of EnumMap is: " +enummap.size());
		System.out.println("EnumMap is        : " +enummap);
		System.out.println("EnumMap key : " +Panchabhutas.Tejas +" value: " + enummap.get(Panchabhutas.Tejas));
		System.out.println("Does EnumMap has key   :" +Panchabhutas.Jala + "  : "+  enummap.containsKey(Panchabhutas.Jala));
		System.out.println("Does EnumMap has value :"+enummap.get(Panchabhutas.Prithvi)+ " : "+enummap.containsValue("Earth"));
		
		Set<Panchabhutas> set=enummap.keySet();
		Iterator<Panchabhutas> enumKeySet =set .iterator();
        while(enumKeySet.hasNext())
        {
        	Panchabhutas pb = enumKeySet.next();
            System.out.println("key : " + pb +"  "+ "value : " + enummap.get(pb));
        }
        System.out.println("-------------");
        Set<Entry<Panchabhutas,String>> set2=enummap.entrySet();
        Iterator<Entry<Panchabhutas,String>> it=set2.iterator();
        while(it.hasNext())
        {
        	Entry<Panchabhutas,String> pb2=it.next();
        	System.out.println("key : " + pb2.getKey() +"  "+ "value : " + pb2.getValue());
        	
        }

		
	}
	
}
