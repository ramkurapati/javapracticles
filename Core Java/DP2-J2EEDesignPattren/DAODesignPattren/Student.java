package DAODesignPattren;

public class Student {

	    private int rollNo;
		private String name;
		
		
		public Student(String name,int i) 
		{
			this.rollNo = i;
			this.name = name;
		}
		public int getRollNo()
		{
			return rollNo;
			}
		public void setRollNo(int rollNo) 
		{
			this.rollNo = rollNo; 
			}
		public String getName()
		{
			return name; 
			}
		public void setName(String name) 
		{
			this.name = name;
		}
	}


