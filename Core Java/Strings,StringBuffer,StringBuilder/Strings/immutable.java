package Strings;

public class immutable {

	
	public static void main(String[] args) {
		
		String st="ram";
		System.out.println(st.hashCode());
		//st=st.concat("mohan");
		//System.out.println(st.concat("mohan"));//concat() method appends the string at the end 
		//System.out.println(st.concat("mohan").hashCode());
		System.out.println(st);//will print ram because strings are immutable objects
		System.out.println(st.hashCode());
		
		/*StringBuffer sbf=new StringBuffer("ram");
		System.out.println(sbf.hashCode());
	    sbf.append("mohan");
	    //System.out.println(sbf.append("mohan").hashCode());
	    System.out.println(sbf);
	    System.out.println(sbf.hashCode());*/

	}

}
