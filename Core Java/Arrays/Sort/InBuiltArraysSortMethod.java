package Sort;



import java.util.Arrays;
import java.util.Scanner;

public class InBuiltArraysSortMethod {

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
	   Arrays.sort(arr);
	   System.out.println("Elements in Array after sort ");  
	   for(Integer i:arr)
	   {
		   System.out.println(" "+i);  
	   }
	  
	}
}
