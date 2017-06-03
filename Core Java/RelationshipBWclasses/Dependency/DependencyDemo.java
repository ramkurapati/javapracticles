package Dependency;

public class DependencyDemo {

	public static void main(String[] args) 
	{
		
     ShoppingMall sm=new ShoppingMall("D-Mart");
     Customer c=new Customer();
     c.setName("ram");
     sm.offer(c);
     System.out.println(sm.getCust());
	}

}
