package ByMethods;
public class GenericsMethodTestByT {

	//Generics in method
    public static <T> boolean isEqual(T g1,T g2){
        return g1.equals(g2);
    }
     
    public static void main(String args[])
    {
    	
        String g1 = new String("ram");
        String g2 = new String("ram");
         
       
         
        boolean isEq = GenericsMethodTestByT.<String>isEqual(g1, g2);
        System.out.println(isEq);
        //above statement can be written simply as
        boolean isE = GenericsMethodTestByT.isEqual(g1, g2);
        System.out.println(isE);
        
        //This feature, known as type inference, allows you to invoke a generic method as an ordinary method, without specifying a type between angle brackets.
        //Compiler will infer the type that is needed
        if(GenericsMethodTestByT.isEqual(g1, g2))
              System.out.println("equal");
        else
        	System.out.println(" not equal");
        
        Integer g3= new Integer(100);
        Integer g4= new Integer(10);
       
        
        if(GenericsMethodTestByT.isEqual(g3, g4))
            System.out.println("equal");
        else
      	    System.out.println("not equal");
        	
    }
}
