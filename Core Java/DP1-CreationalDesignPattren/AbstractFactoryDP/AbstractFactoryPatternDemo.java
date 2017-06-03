package AbstractFactoryDP;

import java.util.Scanner;

public class AbstractFactoryPatternDemo
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice animal or color");
		String choice=scan.next();
		AbstractFactory af=FactoryProducer.getFactory(choice);
		if(choice.equalsIgnoreCase("animal"))
		{
		System.out.println("Enter your choice of animal");
		String animaltype=scan.next();
		Animal animal=af.getAnimal(animaltype);
		animal.type();
		}
		if(choice.equalsIgnoreCase("color"))
		{
		System.out.println("Enter your choice of color ");
		String animalcolor=scan.next();
		Color color=af.getColor(animalcolor);
		color.bodycolor();
		}
		
	}
	
}
