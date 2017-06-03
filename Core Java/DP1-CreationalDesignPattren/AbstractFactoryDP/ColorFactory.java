package AbstractFactoryDP;

public class ColorFactory extends AbstractFactory
{

	@Override
	 Animal getAnimal(String animaltype)
	{
		return null;
	}

	
	public Color getColor(String color)
	{
		if(color==null)
	           return null;
		
		if(color.equalsIgnoreCase("white"))
			   return new White();
		else if(color.equalsIgnoreCase("black"))
			   return new Black();	
		
		
		return null;
	}

}
