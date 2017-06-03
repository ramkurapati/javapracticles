package Static;
abstract class clgeinfo
{
	 static double clgecode=8765;	 
}

public class StaticAccessmodifiersDemo 
{
	
	static String name;
	static int age;
	static char sex;
	static String college="RGM";
    static void info(String nm,int ag,char sx)
    {
    	name=nm;
		 age=ag;
		 sex=sx;
    }
    
    static String branch;
    static int marks;
    static char grade;
    static
    {
    	branch="cse"; 
    	gradeinfo('A');
    }
    public static void gradeinfo(char grde)
    {
    	grade=grde;
    }
    public void display()
    {
    	System.out.println(""+name);
    	System.out.println(""+age);
    	System.out.println(""+sex);
    	System.out.println(""+college);
    	System.out.println(""+branch);
    	System.out.println(""+marks);
    	System.out.println(""+grade);
    	System.out.println(""+clgeinfo.clgecode);
    }
    
     static class clgeinfo
    {
    	 static double clgecode=8765;	 
    }
	

	public static void main(String[] args)
	{
		info("ram",24,'m');
		marks=923;
		StaticAccessmodifiersDemo amd=new StaticAccessmodifiersDemo();
		amd.display();
		double c=clgeinfo.clgecode;
	}

}
