package StringBuffer;

public class StringBufferCreation
{

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();
		System.out.println(" capacity "+sb.capacity());
		System.out.println(" length "+sb.length());
		System.out.println(" value "+sb);
		
		StringBuffer sb2=new StringBuffer("RAMMOHAN");
		System.out.println(" \ncapacity "+sb2.capacity());
		System.out.println(" length "+sb2.length());
		System.out.println(" value "+sb2);
		
		String s1="RAMMOHAN";
		StringBuffer sb1=new StringBuffer(s1);
		System.out.println(" \ncapacity "+sb1.capacity());
		System.out.println(" length "+sb1.length());
		System.out.println(" value "+sb1);
		
		char c[]={'R','A','M','M','O','H','A','N'};
		StringBuffer sb3=new StringBuffer(c[7]);
		System.out.println(" \ncapacity "+sb3.capacity());
		System.out.println(" length "+sb3.length());
		System.out.println(" value "+sb3);
		
		StringBuffer sb4=new StringBuffer(200);
		//sb4="RAMMOHAN";
		
		
		
          
	}

}
