package StringBuilder;


public class StringBuilderDemo {
	public static void main(String[] args)
	{
		/*String name=new String("K");
		System.out.println(name.hashCode());
		System.out.println(name.concat("Rammohan").hashCode());
		name.concat("Rammohan");
		System.out.println(name.hashCode());*/
		
		
		/*StringBuffer sb=new StringBuffer("K");
		sb.append("Rammohan");
		
		System.out.println(sb);
		
		System.out.println(sb.substring(0,4));
		
		StringBuilder sbl=new StringBuilder("K");
		sbl.append("Rammohan");
		
		System.out.println(sbl.reverse());*/
		
		
		StringBuilder sb1=new StringBuilder("ram");
		System.out.println(sb1.hashCode());
		StringBuilder sb2=new StringBuilder("ram");
		System.out.println(sb2.hashCode());
		StringBuilder sb3=new StringBuilder(sb2);
		System.out.println(sb3.hashCode());
		
		
		System.out.println(sb1.equals(sb2));
		System.out.println(sb2.equals(sb3));
		
		System.out.println(sb1==sb2);
		System.out.println(sb2==sb3);
		
		
		
		
	}

}
