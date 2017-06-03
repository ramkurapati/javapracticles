package AssignmentOperators;

public class Demo 
{
	public static void main(String[] args)
	{
		 int a=10;int b=20,c,d=27,f=4;
		 System.out.println(" C= "+(c=a+b));
		 System.out.println(" += "+(c+=a));//c=c+a;
		 System.out.println(" -= "+(c-=a));//c=c-a;
		 System.out.println(" *= "+(c*=a));//c=c*a;
		 System.out.println(" /= "+(c/=a));//c=c/a;
		 System.out.println(" %= "+(c%=a));//c=c%a;
		 System.out.println(" <<= "+(a<<=2));//a=a<<2  a*2*2
		 System.out.println(" >>= "+(d>>=4));//d=d>>2  d/4*4
		 System.out.println(" &= "+(f&=2));//f=f&2  AND
		 System.out.println(" |= "+(f|=2));//f=f|2   OR
		 System.out.println(" ^= "+(f^=2));//f=f^2  XOR
	}

}
