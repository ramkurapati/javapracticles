package onlineExamSolutions;

 class Base{
	 public void  method(String msg){
		 System.out.println(" from Base ");
		 System.out.println(msg);
	 }
}
 class Derived extends Base{
	 public void  method(Object msg){
		 System.out.println(" from Derived ");
		 System.out.println(msg);
	 }
	 
	 
}
public class Demo {

	public static void main(String[] args) {
		Derived derived=new Derived();
		derived.method("hello");
	}

}
