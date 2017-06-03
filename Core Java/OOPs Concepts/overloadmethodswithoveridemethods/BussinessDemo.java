package overloadmethodswithoveridemethods;

public class BussinessDemo extends Bussiness {

	public static void m1(int s){
		System.out.println("in m2 demo  " +s);
	}
	
	
	
	public static void main(String[] args) {
		
		BussinessDemo bd=new BussinessDemo();
		//bd.m1(21);
		
		Bussiness b=new BussinessDemo();
		b.m1("ram");
	}

}
