
public class ExecutionOrder {

	{
		System.out.println("Instance Block");
	}
	static{
		System.out.println("Static Block");
	}
	
	public void m1(){
		System.out.println("In m1 method");
	}
	
	public static void m2(){
		System.out.println("In static m2 method");
	}
	
	public ExecutionOrder(){
		System.out.println("In constructor");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("in main");
		
		ExecutionOrder.m2();
		ExecutionOrder executionOrder=new ExecutionOrder();
		//executionOrder.m1();

	}

}
