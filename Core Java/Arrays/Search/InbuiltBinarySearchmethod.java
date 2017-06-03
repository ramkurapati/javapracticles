package Search;



import java.util.Arrays;
import java.util.Scanner;

public class InbuiltBinarySearchmethod {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
	    int arr[]=new int[5];
	    System.out.println("enter array elements");
	   for(int i=0;i<arr.length;i++)
	   {
		      
			   arr[i]=s.nextInt(); 
	   }
	   System.out.println("Elements in Array ");
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.println(" "+arr[i]);  
	   }
	   System.out.println("Search element from array elements  ");
	   int element=s.nextInt();
	   int index=Arrays.binarySearch(arr, element);
	   if(index<0)
		   System.out.println("elemnet not found");
	   else
		   System.out.println("element found at "+(index+1));
	   
	}
}
