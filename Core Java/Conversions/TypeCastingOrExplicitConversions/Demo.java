package TypeCastingOrExplicitConversions;

public class Demo {

	public static void main(String[] args) 
	{
		short sh=2;
		int ish=sh;
		//byte bsh=(short)sh; //error
		//byte bi=(int)ish;  //error
		byte b=2;
		int ib=b;
		char c='m';
		//String s=(char)c; error
		String s2="ram";
		//char c=(char)s2; error
		//int i=(int)s2;  error
		int i=26;
		//int if=(float)ft; error
		float fti=(int)i;
		//float ftd=(double)d; error
		double dii=(int)i;
		double df=(float)fti;
		//doble dl=(long)l;   errror
		long l=(int)i;
		//long l2=(double)df;// error
		//long l=(float)ft; error
		
	}

}
