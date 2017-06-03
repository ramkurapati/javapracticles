package Map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo 
{

	public static void main(String[] args) 
	{
		
	/*	Languages langs1=new Languages("Java");
		Languages langs2=new Languages("C");
		Languages langs3=new Languages("C++");
		Languages langs4=new Languages("Oracle");
		Languages langs5=new Languages("SQL");
		
		WeakHashMap<Languages, String> whm=new WeakHashMap<Languages, String>();
		
		whm.put(langs1,"Platform independent");
		whm.put(langs2,"Medium Level");
		whm.put(langs3,"Pure OOPs");
		whm.put(langs4,"DataBase coding");
		whm.put(langs5,"DataBase coding");
		
		System.out.println(whm);
		WeakHashMap<Integer, String> whm2=new WeakHashMap<Integer, String>();
		Integer s1=23;
		whm2.put(s1, "ram");
		System.out.println(whm2);
		s1=null;
		System.gc();
		System.out.println(whm2);
		
		langs1=null;
		langs2=null;
		langs3=null;
		langs4=null;
		langs5=null;
		
		System.gc();
		System.out.println("Weak HashMap :"+whm);*/
		
		Languages lang1=new Languages("Java");
		Languages lang2=new Languages("C");
		Languages lang3=new Languages("C++");
		Languages lang4=new Languages("Oracle");
		Languages lang5=new Languages("SQL");
		
		HashMap<Languages, String> hm=new HashMap<Languages, String>();
		hm.put(lang1,"Platform independent");
		hm.put(lang2,"Medium Level");
		hm.put(lang3,"Pure OOPs");
		hm.put(lang4,"DataBase coding");
		hm.put(lang5,"DataBase coding");
		System.out.println("HashMap before null     :"+hm);
		lang1=null;
		lang2=null;
		lang3=null;
		lang4=null;
		lang5=null;
		System.gc();
		
		System.out.println("HashMap      :"+hm);

	}
	

}

