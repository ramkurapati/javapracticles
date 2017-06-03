package AccessSpecifiers;

public class PublmethodsClass1
{
	        String name;
	public  int     age;
	private char    sex;
	
	public void Store(String name,int age,char sex)
	{
		this.name=name;
		this.age=age;
		this.sex=sex;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getSex() {
		return sex;
	}

	
}
