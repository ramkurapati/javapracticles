package BuilderDP;

public abstract class ColdDrink {

	public Packing packing() {
	       return new Bottle();
		}

		public abstract float price();
}
