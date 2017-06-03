package Superandthis;

class Emp
{
   protected int age ;
   public String name1;
   private String name2;
   String dname;
   
  /* public Emp( int age,String nm1,String nm2)
	{
	    this.name1=nm1;
	    this.name2=nm2;
		this.age=age;
	}*/
   public void display()
	{
		System.out.println(" "+name1);
		System.out.println(" "+name2);
		System.out.println(" "+age);
		System.out.println(" "+dname);
	}
   
}
class department extends Emp
{
	public department(String dname,int age,String name1,String name2)
	{
		
		super.age=age;
		super.name1=name1;
		this.dname=dname;
		
	}
	public void display2()
	{
		System.out.println("------------- ");
		System.out.println(" "+dname);
		System.out.println(" "+name1);
		System.out.println(" "+age);
		//System.out.println(" "+name2); //not visible
	}
	
}

public class SuperThisDemo2
{
  public static void main(String[] args)
  {
	  department d=new department("Accounts", 25,"ram","mohan");
	  d.display();
	  d.display2();
  }
}
