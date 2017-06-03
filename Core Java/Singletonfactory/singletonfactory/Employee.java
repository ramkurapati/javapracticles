package singletonfactory;

public class Employee 
{
	

	//create an object of class
	   private static Employee emp;
	   private String name;
	   //make the constructor private so that this class cannot be
	   //instantiated
	   private Employee()
	   {
		  
	   }

	   //Get the only object available
	   public static Employee createInstance()
	   {
		     if(emp==null)
	            emp= new Employee();
		   return emp;
	   }

	  

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	 /*  @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}*/

		/*@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}*/
	   
}
