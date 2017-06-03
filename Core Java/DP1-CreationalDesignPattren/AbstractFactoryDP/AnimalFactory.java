package AbstractFactoryDP;

public class AnimalFactory extends AbstractFactory
{

	
	public Animal getAnimal(String animaltype)
	{
		    if(animaltype==null)
		           return null;
			
			if(animaltype.equalsIgnoreCase("Domestic"))
				   return new DomesticAnimal();
			else if(animaltype.equalsIgnoreCase("Wild"))
				   return new WildAnimal();
		
		
		return null;
	}

	@Override
	Color getColor(String color) {
		
		return null;
	}

}
