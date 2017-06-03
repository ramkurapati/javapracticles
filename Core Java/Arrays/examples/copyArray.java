package examples;

import java.util.Arrays;

public class copyArray
{
	public static void main(String[] args)
	{
		int[] array1={1,2,3,4,2,5,1,3,6,7,8,9,1};
		int[] array2 =new int[13];
		int counter=0;
		for(int i=0;i<=array1.length-1;i++)
		{
			for(int j=i+1;j<array1.length;j++)
			{
				if(array1[i]==array1[j])
				{
					counter++;
				}
				
			}
			//array2[i]=array1[counter];
		}
       //System.out.println(Arrays.toString(array2));
		System.out.println(counter);
	}

}
