package Strings;

public class StringsEqualsANDhashcode 
{

	public static void main(String[] args)
	{
		String str1="ram";
		String str2="ram";                                        
		String str3="Ram";
		String str4=new String("Ram");
		String str5=new String("Ram");
		String str6=str5;
		
		
		/*System.out.println(str1.hashCode() +"  "+str2.hashCode());
		System.out.println(" by equals "+str1.equals(str2));
		System.out.print(" by == ");
		System.out.println(str1==str2);*/
		
		/*System.out.println(str2.hashCode() +"  "+str3.hashCode());
		System.out.println(" by equals "+str2.equals(str3));
		System.out.print(" by == ");
		System.out.println(str2==str3);*/
		
		/*System.out.println(str3.hashCode() +"  "+str4.hashCode());
		System.out.println(" by equals "+str3.equals(str4));
		System.out.print(" by == ");
		System.out.println(str3==str4);	*/
		
		str4=str5;
		System.out.println(str4.hashCode() +"  "+str5.hashCode());
		System.out.println(" by equals "+str4.equals(str5));
		System.out.println(str4==str5);
		
		
		/*System.out.print(" by ==  with intern --");
		System.out.println(str3==str4.intern());
		
		System.out.println(str5.hashCode() +"  "+str6.hashCode());
		System.out.println(" by equals "+str5.equals(str6));
		System.out.println(str5==str6);*/
	}
}
