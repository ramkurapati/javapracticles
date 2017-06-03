package Realization;

public class ImplementationDemo {

	public static void main(String[] args) 
	{
		Mammals mcat=new Cat();
		System.out.println(mcat.walk());
		Mammals mcow=new Cow();
		System.out.println(mcow.walk());
	}

}
