package Generics;

import java.util.HashMap;
 interface Pair<K,V>
{
	    public K getKey();
	    public V getValue();
}
public class GenericClassDemo2<K,V> implements Pair<K,V>
{ 
	    private K key;
	    private V value;
	public GenericClassDemo2(K key, V value)
	{
		this.key = key;
        this.value = value;  	    
	}
      
	
	public K getKey() 
	{
		
		return key;
	}

	
	public V getValue() 
	{
		
		return value;
	}
	
	public void show()
    {
		
            System.out.println( key + " \t " + value);
        
    }
	
	public static void main(String[] args)
	{
		GenericClassDemo2<String, Integer> pv=new GenericClassDemo2<>("Ram",25);
		GenericClassDemo2<Integer, String> pv1=new GenericClassDemo2<>(271,"M");
		System.out.println( "key "+ "\t "+ "value");
		pv.show();
		pv1.show();
		
		}

	
}
