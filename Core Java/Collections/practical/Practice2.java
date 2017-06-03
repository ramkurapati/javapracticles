package practical;



public class Practice2 {

	public void m1(String msg){
		
		try{
			System.out.println("first method");
			System.out.println(msg);
		}catch(Exception e){
			System.out.println("Catch");
		}
	}
	
  public void m1(Object msg){
		
		try{
			System.out.println("second method");
			System.out.println(msg);
		}catch(Exception e){
			System.out.println("ExcepCatch");
		}
	}
	
	public static void main(String[] args) {
		Practice2 p = new Practice2();
		String i="9";
		p.m1(Integer.parseInt(i));

	}

}
