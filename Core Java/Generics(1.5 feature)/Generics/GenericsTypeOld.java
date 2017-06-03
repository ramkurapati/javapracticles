package Generics;

public class GenericsTypeOld {

	 private Object t;
	 
	    public Object get() {
	        return t;
	    }
	 
	    public void set(Object t) {
	        this.t = t;
	    }
	 
	        public static void main(String[] args)
	        {
	        	
	        GenericsTypeOld type = new GenericsTypeOld();
	        type.set("Pankaj"); 
	        String str = (String) type.get();
	        System.out.println(str);
	        
	        GenericsTypeOld type1 = new GenericsTypeOld();
	        type1.set(new Integer(10)); 
	        int i = (int) type.get(); //type casting, error prone and can cause ClassCastException
	        System.out.println(i);
	        
	        GenericsType type2 = new GenericsType();
	        type2.set("ram");
	        String str2 = (String) type2.get();
	        System.out.println(str2);
	        
	        GenericsType type3 = new GenericsType();
	        type3.set(new Integer(20));
	        int k=(int) type3.get();
	        System.out.println(k);
	        
	        }
}
