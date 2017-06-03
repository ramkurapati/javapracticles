package ClassLoaders;

class Student
{
	  Student(String name)
	 {
		this.name=name; 
	 }
	public String name;
	final static String schoolname="BBV";
	static
	{
		System.out.println(" your school name in static block "+schoolname);
		
	}
	
	{
		System.out.println(" your school name in non-static "+schoolname);
		System.out.println(" your        name in non-staic  "+name);
	}
	
}
