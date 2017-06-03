package StringBuffer;

public class StringBufferMethods {

	public static void main(String[] args)
	{
		
		StringBuffer sb=new StringBuffer("RAMMOHAN");
		System.out.println(" capacity "+sb.capacity());
		System.out.println(" value "+sb);
		System.out.println(" length "+sb.length());
		System.out.println(" reverse "+sb.reverse());
		
		StringBuffer sb2=new StringBuffer("Rammohan");
		System.out.println(" replace "+sb2.replace(3, 8, "Krishna"));
		System.out.println(" insert "+sb2.insert(3, "Manohar",0,7));//insert at 3rd position word length 0-7
		System.out.println(" replace "+sb2.deleteCharAt(3));
		System.out.println(" replace "+sb2.delete(3, 8));
		System.out.println(" replace "+sb2.append("Naidu "));
		System.out.println(" replace "+sb2.append('K'));
		System.out.println(" replace "+sb2.append(245.89));
		
	}

}
