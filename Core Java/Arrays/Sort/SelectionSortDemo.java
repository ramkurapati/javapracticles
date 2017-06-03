package Sort;

import java.util.Scanner;

public class SelectionSortDemo
{
	 public static int[] Selection_Sort(int[] arr)
	 {
         
	        for (int i = 0; i < arr.length - 1; i++)
	        {
	            int index = i;
	            for (int j = i + 1; j < arr.length; j++)
	            {
	                if (arr[index]>arr[j]  ) 
	                    index = j;
	             }
	      
	            int smallerNumber = arr[index];  
	            arr[index] = arr[i];
	            arr[i] = smallerNumber;
	        }
	        return arr;
	    }
	
	 public static void main(String[] args) 
	{
		 
        int arr1[] = new int[10];
        System.out.println("Enter 10 numbers");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) 
        {
            arr1[i] = scan.nextInt();
        }
        int[] arr2 = Selection_Sort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
	}

}
