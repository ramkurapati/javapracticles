package overloadmethodswithoveridemethods;

public class BedRoom extends Room{
	
	public void m1(){
		System.out.println("m1 in Bedroom ");
	}
	
	public void m1(String s){
		System.out.println("m1 in Bedroom "+s);
	}
	
	
	
	public static void main(String[] arg){
		
		
		/*Room room=new Room();
		room.m1();
		room.m1(99);*/
		
		
		/*BedRoom bedRoom=new BedRoom();
		bedRoom.m1(2);*/
		
		Room rb=new BedRoom();
		rb.m1();
		
		Room r=new Room();
		//r.m1(false);
		
		
	}
}
