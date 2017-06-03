package Search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchByRecursiveTechnique 
{

	 public int search(final int[] data, int startIndex,int endIndex,final int key) 
	 {
		  
		  if (startIndex <= endIndex) 
		  {  
			 int midindex = startIndex +(endIndex-startIndex) / 2;
			 
		     if (data[midindex] < key) 
		     {  
		    	 return search(data, midindex+1, endIndex , key);  
		     } 
		     else if (data[midindex] > key)
		     {  
		    	 return search(data, startIndex, midindex, key);  
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
         
         BinarySearchByRecursiveTechnique bsd = new BinarySearchByRecursiveTechnique();
         System.out.print("Enter the element to search: ");
         int num=scan.nextInt();
         
         int n = bsd.search(arr,0,arr.length-1, num);
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
