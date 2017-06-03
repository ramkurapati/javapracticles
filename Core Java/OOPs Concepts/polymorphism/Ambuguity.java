package polymorphism;
class A{
	
	public String go(Integer i1, Integer i2) {
	    return "A1";
	  }
	
	  public String go(int i1,int i2) {
	    return "A2";
	  }
	  public String go(Object i1, String i2) {
		    return "A3";
		  }
		
	  public String go(String i1,Object i2) {
		    return "A4";
		  }
	
}

public class Ambuguity {

	public static void main(String[] args) {
		A a = new A();
		
	    Integer i = 3;

	    System.out.println("Example 5");
	    System.out.println(" 1: " + a.go(i, i));
	    System.out.println(" 2: " + a.go(2, 3));
	    System.out.println(" 3: " + a.go(78, null));

	}

}
