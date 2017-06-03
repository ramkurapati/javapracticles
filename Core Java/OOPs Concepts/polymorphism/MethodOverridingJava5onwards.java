package polymorphism;

class Animal 
{
	Animal type(String name)
	{
		return new Animal(name);
	}
	Animal()
	{
	}
	Animal(String nm)
	{
		System.out.println("from constructor "+nm);
	}
}
class Dog extends Animal
{
	/*Dog type(String name)
	{
		return new Dog(name);
	}
	Dog()
	{	
	}
	Dog(String nme)
	{
		System.out.println("from dog constructor "+nme);
	}*/
}
public class MethodOverridingJava5onwards {

	public static void main(String[] args)
	{
		Animal an=new Animal();
		an.type("cat");
		Animal an2=new Dog();
		an2.type("doberman");
	}
}
