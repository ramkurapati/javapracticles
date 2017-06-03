package Basics;

public enum Directions 
{
	EAST(0) {
		@Override
		public void shout() {
			System.out.println("Direction is East !!!");
			System.out.print("------>");
			
		}
	},
	WEST(180) {
		@Override
		public void shout() {
			System.out.println("Direction is West !!!");
			System.out.print("<------");
			
		}
	},
	NORTH(90) {
		@Override
		public void shout() {
			System.out.println("Direction is North !!!");
			System.out.println("^");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
		}
	},
	SOUTH(270) {
		@Override
		public void shout() {
			System.out.println("Direction is South !!!");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("v");
		}
	};
	// Constructor
	private Directions(final int angle) 
	{
		this.angle = angle;
	}

	// Internal state
	private int angle;

	public int getAngle() {
		return angle;
	}

	// Abstract method which need to be implemented
	public abstract void shout();
}
