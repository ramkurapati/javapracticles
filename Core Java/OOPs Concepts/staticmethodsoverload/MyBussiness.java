package staticmethodsoverload;

public class MyBussiness {
	
	public static void m1(String s){
		System.out.println("in m1 " +s);
	}
    
	public static void m1(Object s){
		System.out.println("in m2 " +s);
		
	}
	
	
	
}
