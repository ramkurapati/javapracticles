package BitwiseOperators;

public class BinaryOperators {

	public static void main(String[] args) 
	{
		int a=10;//00001010
		int b=20;//00010100
		System.out.println(" A&B = "+(a&b));
		
		int c=10;
		int d=20;
		System.out.println(" c|d = "+(c|d));
		int e=10;
		int f=20;
		System.out.println(" e^f = "+(e^f));
		int g=10;
		int F=20;
		System.out.println(" ~g = "+(~g));
		System.out.println(" ~F = "+(~F));
		
		int x = 11 & 9;
        int y = x ^ 3;
        System.out.println( y | 12 );

	}

}
