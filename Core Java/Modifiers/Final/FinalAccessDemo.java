package Final;

public class FinalAccessDemo 
{      
	        int age;
			public String name;
			final char sex='m';
			final void store(String nm,int ag)
			{
				this.age=ag;
				this.name=nm;
			}
			public  void display()
			{
				System.out.println(" "+name);
				System.out.println(" "+age);
			}
}
 class derived extends FinalAccessDemo
 {
	 int sal;
	 String address;
	 
	 public void store2(int sal,String address)
	 {
	     this.sal=sal;
	     this.address=address;
	 }
	 
 }


