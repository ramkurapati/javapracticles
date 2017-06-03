package InterviewProgramms;

class Student
	{
		public String name;

		public String getName()
		{
			return name;
		}

		public Student(String name) {
			
			this.name = name;
		}

	}
class Room extends Student
{
    String roomname;
	public Room(String name,String rmname)
	{
		super(name);
		this.roomname=rmname;
	}
	public String getName() {
		return roomname;
	}
	
	

}

public class EqualsTest 
{

	
	public static void main(String[] args)
	{
		Student st1=new Student("ram");
		System.out.println(st1.getName());
		
		
		Student st2=new Room("mohan","bedroom");//Dynamic dispatch
		
		System.out.println(st2.getName());

	}

}
