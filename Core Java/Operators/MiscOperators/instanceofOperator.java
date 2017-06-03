package MiscOperators;
public class instanceofOperator {
	
	public static void main(String[] args)
	{
		String name = null; 
		boolean result2 = name instanceof String;
		
		instanceofOperator ins=new instanceofOperator();
		boolean result3 = ins instanceof instanceofOperator;
		
		System.out.println(" instance result is "+result2);
		System.out.println(" instance result is "+result3);

	}

}
