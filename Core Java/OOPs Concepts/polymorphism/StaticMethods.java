package polymorphism;

class Sample3
{
   static  void root(long a)
	{
		System.out.println(" base root method with static  long"+a);
		//System.out.println("squre root of "+ a + " is "+Math.sqrt(a));
	}
	static  void root(int a){
		System.out.println(" base root method without static int "+a);
		//System.out.println(a);
	}
}
class Sample4 extends Sample3
{
	static void root(float a)
	{
		System.out.println(" derived root method with static float "+a);
		//System.out.println("squre of "+ a + " is "+(a*a));
	}
	static void root(String a)
	{
			System.out.println("drived root method with static "+ a );
	}
	
	void root(Boolean a){
		System.out.println(" derived root method without static "+a);
			}
	
	 void root(char a){
			System.out.println(" derived root method  "+a);
			//System.out.println(a);
		}
}

public class StaticMethods {

	public static void main(String[] args)
	{
		
		Sample3 s=new Sample4();
		s.root("ram");
		
		/*Sample4 s4=new Sample4();
		//s4.root("hello");
		s4.root(168);*/
	}
}
