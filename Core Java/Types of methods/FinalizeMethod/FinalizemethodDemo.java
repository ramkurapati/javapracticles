package FinalizeMethod;

public class FinalizemethodDemo
{
   int age;
   String name;
   FinalizemethodDemo(int age,String name)
   {
	   this.age=age;
	   this.name=name;
   }
   public void dispaly()
   {
	   System.out.println("name --"+name);
	   System.out.println("age-- "+age);
   }
}
	class derived extends FinalizemethodDemo
	{
		protected void finalize() throws Throwable
		{
			super.finalize();
		}
		derived(int age, String name)
		{
			super(age, name);
		}
		public void dispaly2()
		{
			 System.out.println("name "+name);
			 System.out.println("age "+age);
		 }
		
	}

