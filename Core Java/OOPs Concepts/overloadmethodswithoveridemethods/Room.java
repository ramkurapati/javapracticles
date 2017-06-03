package overloadmethodswithoveridemethods;

public class Room {
	
	public void m1(){
		System.out.println(" m1 in room");
	}

	public void m1(int s){
		System.out.println("m1 in room with int param "+s);
	}
	
	/*public void m1(Object s){
		System.out.println("m1 in room with Object param  "+s);
	}*/
}
