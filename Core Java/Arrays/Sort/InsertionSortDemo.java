package Sort;

import java.util.Scanner;

public class InsertionSortDemo
{

	public static void main(String[] args)
	{
		 int[] arr1 = new int[10];
		 System.out.println("Enter 10 numbers");
         Scanner scan = new Scanner(System.in);
         for (int i = 0; i < arr1.length; i++) 
         {
        	 arr1[i] = scan.nextInt();
         }
	        int[] arr2 = Insertion_Sort(arr1);
	        for(int i:arr2)
	        {
	            System.out.print(i);
	            System.out.print(", ");
	        }
	}

	public static int[] Insertion_Sort(int[] input)
	
	{
         
	        int temp;
	        for (int i = 1; i < input.length; i++)
	        {
	            for(int j = i ; j > 0 ; j--)
	            {
	                if(input[j] < input[j-1])
	                {
	                    temp = input[j];
	                    input[j] = input[j-1];
	                    input[j-1] = temp;
	                }
	            }
	        }
	        return input;
	    }
}
