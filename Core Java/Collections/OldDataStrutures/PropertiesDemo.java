package OldDataStrutures;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args)
	{
		Properties prpts=new Properties();
		prpts.put("A", "Ant");
		prpts.put("B", "Bull");
		prpts.put("C", "Cat");
		prpts.put("D", "Dog");
		prpts.put("E", "Elephant");
		prpts.setProperty("F","Fox");
		
		Set<Object> alphabets=prpts.keySet();//HashTable subClass 
		Iterator<Object> it=alphabets.iterator();
		while(it.hasNext())
		{
			String str= (String) it.next();
			System.out.println("Alphabet "+str+" for "+prpts.getProperty(str));
		}
		Enumeration<Object> alphabets2=prpts.keys();//HashTable subClass 
		while(alphabets2.hasMoreElements())
		{
			String str= (String) alphabets2.nextElement();
			System.out.println("Alphabet "+str);
		}
		Enumeration<Object> animals=prpts.elements();//HashTable subClass 
		while(animals.hasMoreElements())
		{
			String str= (String) animals.nextElement();
			System.out.println("Animal "+str);
		}
		Collection<Object> animals2=prpts.values();//HashTable subClass
		for(Object o:animals2)
		{
			System.out.println("Animal "+o);
		}
		Enumeration<?> alphabets3=prpts.propertyNames();//Properties class
		while(alphabets3.hasMoreElements())
		{
			String str= (String) alphabets3.nextElement();
			System.out.println("Alphabet "+str);
		}
		Set<String> alphabets4=prpts.stringPropertyNames();//Properties class
		Iterator<String> it2=alphabets4.iterator();
		while(it2.hasNext())
		{
			String str= (String) it2.next();
			System.out.println("Alphabet "+str);
		}
		Set<Entry<Object, Object>> alphabets5=prpts.entrySet();//HashTable subClass
		Iterator<Entry<Object, Object>> it3=alphabets5.iterator();
		while(it3.hasNext())
		{
			Entry<Object, Object> me= (Entry<Object, Object>) it3.next();
			System.out.println("Alphabet "+me.getKey()+" for "+me.getValue());
		}
		
		
	}
}
