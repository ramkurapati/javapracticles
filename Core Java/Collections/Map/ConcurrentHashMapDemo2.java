package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo2 
{

	public static void main(String[] args) {

        // ConcurrentHashMap implementation details
        Map<Integer, String> concurrentHMap = new ConcurrentHashMap<Integer, String>();
        concurrentHMap.put(1,"FIRST" );
        concurrentHMap.put(2,"SECOND");
        concurrentHMap.put(3,"THIRD");
        concurrentHMap.put(4,"FOURTH");
        concurrentHMap.put(5,"FIFTH");
        concurrentHMap.put(6,"SIXTH");
        System.out.println("ConcurrentHashMap before iteration : " + concurrentHMap);
        Iterator<Integer> ccHMapIterator = concurrentHMap.keySet().iterator();

        while (ccHMapIterator.hasNext())
        {
              Integer key = ccHMapIterator.next();
              if (key.equals(4))
                    concurrentHMap.put(key + 3, "SEVEN");
        }
        System.out.println("ConcurrentHashMap after iteration : " + concurrentHMap);

        System.out.println("**************************************");
        // HashMap implementation details
        Map<Integer, String> hMap = new HashMap<Integer, String>();
        hMap.put(1,"FIRST" );
        hMap.put(2,"SECOND");
        hMap.put(3,"THIRD");
        hMap.put(4,"FOURTH");
        hMap.put(5,"FIFTH");
        hMap.put(6,"SIXTH");
        System.out.println("HashMap before iteration : " + hMap);
        Iterator<Integer> hashMapIterator = hMap.keySet().iterator();

        while (hashMapIterator.hasNext()) 
        {
              Integer key = hashMapIterator.next();
              if (key.equals(4))
                    hMap.put(key + 3, "SEVEN");
        }
        System.out.println("HashMap after iteration : " + hMap);
  }
}
