package objectcreation;
class Rectangle
{
	
	int length,breadth;
	
	Rectangle(){
		
	}
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public void Area(int l,int b)
	{
		this.length=l;this.breadth=b;
		double area=length*breadth;
		System.out.println(" Area of rectangle  "+area);
	}
	public void Circumference(int l,int b)
	{
		this.length=l;this.breadth=b;
		double circumference=2*(length+breadth);
		System.out.println(" Circumference of rectangle  "+circumference);
	}
	
}

public class ObjectDemo 
{
	public static void main(String[] args) 
	{
		
		/*Rectangle rec1=new Rectangle();
		Rectangle rec2=rec1;
		System.out.println("objects equals check "+rec1.equals(rec2));*/
		
		/*Rectangle rec3=new Rectangle();
		Rectangle rec4=new Rectangle();
		System.out.println("objects equals check "+rec3.equals(rec4));*/
		
		/*rec1.Area(12, 6);
		rec2.Circumference(12, 7);*/
		
		Rectangle rec5=new Rectangle(4,5);
		Rectangle rec6=new Rectangle(4,5);
		System.out.println("hashcodes "+rec5.hashCode() +" "+rec6.hashCode());
		System.out.println("objects equals check "+rec5.equals(rec6));
		System.out.println("objects equals check "+ (rec5==rec6));
		
		/*Rectangle rec7=new Rectangle(4,5);
		Rectangle rec8=rec7;
		System.out.println("objects equals check "+rec7.equals(rec8));
		System.out.println("objects equals check "+ (rec7==rec8));
		*/
		
	
		
	}

}
