package examples;

import java.util.Arrays;

public class SepateZeroDemo 
{
	public static void movezerosToFront(int[] array)
	{
		int counter =array.length-1;
		for(int i=array.length-1;i>=0;i--)
		{
			if(array[i]!=0)
			{
				array[counter]=array[i];
				counter--;
			}
		}
		 while (counter >= 0)
	        {
	            array[counter] = 0;
	 
	            counter--;
	        }
	 
	        System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) 
	{
		int[] arr={2,0,4,9,12,0,1,5,0,16};
		
		movezerosToFront(arr);
	}

}
