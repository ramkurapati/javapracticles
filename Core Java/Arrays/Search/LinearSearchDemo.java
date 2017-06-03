package Search;

import java.util.Scanner;

public class LinearSearchDemo 
{

	 public int search(final int[] data, final int key) 
	 {
         for (int i = 0; i < data.length; ++i) 
         {
                 if (data[i] == key)
                         return i;
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
         
         LinearSearchDemo lsd = new LinearSearchDemo();
         System.out.print("Enter the element to search: ");
         int num=scan.nextInt();
         int n = lsd.search(arr, num);
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
