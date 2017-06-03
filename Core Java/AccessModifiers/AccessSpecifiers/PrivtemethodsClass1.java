package AccessSpecifiers;

public class PrivtemethodsClass1
{
	        String name;
	public  int     age;
	private char    sex;
	
	private void Store(String name,int age,char sex)
	{
		this.name=name;
		this.age=age;
		this.sex=sex;
	}

	private String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	private char getSex() {
		return sex;
	}

	
}
