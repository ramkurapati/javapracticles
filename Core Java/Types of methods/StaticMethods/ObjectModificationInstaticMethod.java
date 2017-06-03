package StaticMethods;
class Emp
{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
public class ObjectModificationInstaticMethod 
{
	public static void modify(Emp e)
	{
		e.setId(30);
	}

	public static void main(String[] args) 
	{
	   Emp e=new Emp();
	   e.setId(20);
	   System.out.println(e.getId());
	   modify(e);
	   System.out.println(e.getId());
	}

}
