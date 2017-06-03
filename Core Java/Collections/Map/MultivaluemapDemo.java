package Map;


import java.util.TreeMap;

import org.apache.commons.collections.map.MultiKeyMap;
import org.apache.commons.collections.map.MultiValueMap;

public class MultivaluemapDemo 
{

	public static void main(String[] args)
	{
		MultiValueMap mvm=new MultiValueMap();
		mvm.put("AMARAVATI","AP");
		mvm.put( "HYDERBAD","TS");
		mvm.put( "BENGALUR","KA");
		mvm.put( "CHENNAI","TN");
		mvm.put( "CHANDIGHAD","PB");
		mvm.put( "MUMBAI","MH");
		mvm.put( "GANDHINAGAR","GJ");
		mvm.put( "DISPUR","ASM");
		mvm.put( "CHANDIGHAD","HY");
		System.out.println("before overide "+mvm);
		TreeMap tm=new TreeMap(mvm);
		System.out.println("after "+tm);
		
		MultiKeyMap mkm=new MultiKeyMap();
		mkm.put("K","N", "ram");
		mkm.put("L","M", "raj");
		mkm.put("N","H", "ram");
		System.out.println("before overide "+mkm);
	}
}
