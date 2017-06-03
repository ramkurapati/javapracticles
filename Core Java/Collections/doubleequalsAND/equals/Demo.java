package doubleequalsAND.equals;

public class Demo {
	public static void main(String[] args)
	{
		String s1=new String("ram");
		String s2=new String("ram");
		String s3="ram";
		String s4="ram";
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);

	}

}
