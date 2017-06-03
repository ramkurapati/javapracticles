package BuilderDP;

public abstract class Burger {
	
	 public Packing packing() {
	      return new Wrapper();
	   }
	 
	 public abstract float price();

}
