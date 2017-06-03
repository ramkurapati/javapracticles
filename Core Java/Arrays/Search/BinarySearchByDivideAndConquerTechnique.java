package Search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchByDivideAndConquerTechnique 
{

	 public int search(final int[] data,final int key) 
	 {
		  int startIndex=0;
		  int endIndex=data.length-1;
		  while (startIndex <= endIndex) 
		  {  
			 int midindex = (startIndex + endIndex) / 2;
			 
		     if (data[midindex] < key) 
		     {  
		         startIndex = midindex + 1;   
		     } 
		     else if (data[midindex] > key)
		     {  
		         endIndex = midindex - 1;  
		     }
		     else
		     {  
		         return  midindex;  
		     }  
		  }  
		  return -1;  
	 }
	
	public static void main(String[] args)
	{
		 final int arr[] = new int[10];
         System.out.println("Enter 10 numbers");
         Scanner scan = new Scanner(System.in);
         for (int i = 0; i < arr.length; i++) 
         {
             arr[i] = scan.nextInt();
          }
         
         Arrays.sort(arr);
         System.out.println("sorted array ");
         for(Integer i:arr)
  	     {
  		   System.out.print(i+" ");  
  	       }
         
         BinarySearchByDivideAndConquerTechnique bsd = new BinarySearchByDivideAndConquerTechnique();
         System.out.print("Enter the element to search: ");
         int num=scan.nextInt();
         
         int n = bsd.search(arr, num);
         if(n >= 0) 
         {
             System.out.println("Found at index: " + n);
         } 
         else 
         {
             System.out.println("Not Found");
         }

	}

}
