package polymorphism;

 class Sample{
	 
	void add(int a,int b)
	{
		System.out.println("addtion by integers  "+(a+b));	
	}
	void add(float a,float b)
	{
		System.out.println("addtion by floats  "+(a+b));
	}
	void add(int a,float b)
	{
		System.out.println("addtion by integer & float  "+(a+b));	
	}
	void add(float a,int b)
	{
		System.out.println("addtion by float & integer  "+(a+b));
	}
	

}
public class MethodOverloading{
	
	public static void main(String[] args)
	{
		Sample s=new Sample();
		
		s.add(12, 13);
		s.add(11.3f,13.7f);
		s.add(12, 13.4f);
		s.add(12.4f,13);
	}
	
}


