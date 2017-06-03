package OldDataStrutures;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictionaryDemo 
{
  public static void main(String[] args)
  {
	  Dictionary<Integer, String> d = new Hashtable<Integer, String>(); 
      d.put(360,"Degrees");
      d.put(4,"Directions");
      d.put(365,"Days");
      d.put(7,"WeekDays");
      d.put(5,"PanchaBhuthas");
      d.put(9,"Planets");
      // d.put(10,null);Null pointer exception
      // d.put(null,"ram");Null pointer exception
      //d.put(null,null);Null pointer exception
      
      System.out.println("Key 7 value  "+d.get(7));
      System.out.println("removed key 4 "+d.remove(4));
      System.out.println("Key 4 value  "+d.get(4));
      System.out.println("Key 20 value  "+d.get(20));
      Enumeration<Integer> key = d.keys();
      while(key.hasMoreElements()){
          System.out.println("keys "+key.nextElement());
      }
      Enumeration<String> element = d.elements();
      while(element.hasMoreElements()){
          System.out.println("values "+element.nextElement());
      }
  }
}
