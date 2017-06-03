package Superandthis;

class Emp2
{
   protected int age ;
   public String name1="ram";
   protected String name2="mohan";
   String dname;
   
   public Emp2( int age,String nm1,String nm2)
	{
	    this.name1=nm1;
	    this.name2=nm2;
		this.age=age;
	}
   public void display()
	{
		System.out.println(" "+name1);
		System.out.println(" "+name2);
		System.out.println(" "+age);
		System.out.println(" "+dname);
	}
   
}
class department2 extends Emp2
{
	
	
	public department2(String dname,int age,String name1,String name2)
	{
		super(age,name1,name2);
		
		super.dname=dname;
	}
	
	public void display2()
	{
		System.out.println(" ");
		System.out.println(" "+dname);
	}
	
}

public class SuperWithOutThisDemo2
{
  public static void main(String[] args)
  {
	  department2 d=new department2("Accounts", 25,"raj","kumar");
	  d.display();
	  d.display2();
  }
}
