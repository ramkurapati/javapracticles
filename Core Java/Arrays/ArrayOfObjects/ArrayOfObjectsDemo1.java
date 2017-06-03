package ArrayOfObjects;

public class ArrayOfObjectsDemo1 
{
	
	int x;
	public ArrayOfObjectsDemo1(int x)
	{
		this.x=x;
		System.out.println("Constructor "+(++x));
	}
	public static void main(String[] args)
	{
		ArrayOfObjectsDemo1[] aob=new ArrayOfObjectsDemo1[5];
		for(int i=0; i<aob.length; i++)
		{
			aob[i] = new ArrayOfObjectsDemo1(i);//this will call constructor.
        }
		
	}

}
