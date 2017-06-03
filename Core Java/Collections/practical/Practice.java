package practical;



public class Practice {

	public void m1(int a, int b){
		
		try{
			System.out.println("first method");
			System.out.println("obj  "+a/b);
		}catch(Exception e){
			System.out.println("Catch");
		}
	}
	
  public void m1(Integer a , int b){
		
		try{
			System.out.println("second method");
			System.out.println("obj "+ a/b);
		}catch(Exception e){
			System.out.println("ExcepCatch");
		}
	}
	
	public static void main(String[] args) {
		Practice p = new Practice();
		p.m1(3,0);

	}

}
