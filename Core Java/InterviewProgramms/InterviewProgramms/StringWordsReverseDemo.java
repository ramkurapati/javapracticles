package InterviewProgramms;

public class StringWordsReverseDemo 
{

	public static void main(String[] args)
	{
		String sentence="My name is rammohan";
		String[] sentence2=sentence.split(" ");
		for(String str:sentence2)
		{
			System.out.println(" "+str);
		}
		String reverse="";
		
		for(int i=0;i<sentence2.length;i++)
		{
			
			reverse=reverse+" ";
			for ( int j = sentence2[i].length() - 1 ; j >= 0 ; j-- )
			{
		         reverse = reverse + sentence2[i].charAt(j);
		         
			}
			
		}
		 System.out.println("Reverse of  string is: "+reverse);
	}

}
