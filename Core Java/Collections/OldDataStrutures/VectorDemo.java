package OldDataStrutures;

import java.util.Iterator;

import java.util.Vector;

public class VectorDemo 
{
   public static void main(String[] arrays)
	{
	Vector<String> v=new Vector<String>();
	
	v.addElement("Vijaywada");
	v.addElement("Chittoor");
	v.addElement("Kurnool");
	v.addElement("Guntur");
	v.addElement("Anantapur");
	v.addElement("Kadapa");
	v.addElement("Vizag");
	v.add("Nellore");
	v.addElement("Vijayanagaram");
	v.addElement("Srikakulam");
	v.addElement("Krishna");
	
	
	System.out.println("Items in vector"+v);
	System.out.println("Vector capacity "+v.capacity());
	int i=0;
	while(i<v.size())
	{
		System.out.println("["+i+"]="+v.get(i));	
		i++;
	}
	System.out.println("Item at 4 "+v.elementAt(4));
	System.out.println("First Item "+v.firstElement());
	System.out.println("Last  Item "+v.lastElement());
	System.out.println("Nellore Index at "+v.indexOf("Nellore"));
	System.out.println("Kadapa lastindex "+v.lastIndexOf("Kadapa"));
	System.out.println(""+v.set(7,"Prakasham"));
	System.out.println("Removed item "+v.remove(5));
	System.out.println("vecotr size after deletion "+v.size());
	System.out.println("Items in vector  after deletion ");
	for(i=0;i<v.size();i++)
	{
		System.out.println("al["+i+"]="+v.get(i));		
	}
	Iterator<String> it=v.iterator();
	while(it.hasNext())
	{
		System.out.println(" data in arraylist iterator   "+it.next());
	}
	
 }
}
