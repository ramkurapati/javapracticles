package Basics;

import java.util.Arrays;

public class DECLARATION1 {

	public static void main(String[] args) 
	{
		 int arr1[]   =new int[5];        //size fixed by initialization i,e 5
		 int arr2[]   =new int[]{1,2,3};  //compiler fix size equal to number of elements present in it,here 3 elements
		 int[] arr3   =new int[10];        //size fixed by initialization i,e 10
		 int[] arr4   =new int[]{1,2,3,9,8,45};  //compiler fix size equal to number of elements present in it,here 6 elements
		 int[] arr5   ={1,2,3,12};        //compiler fix size equal to number of elements present in it,here 4 elements
		 int arr6[]   ={1,2,3,99,48,6,9}; //compiler fix size equal to number of elements present in it,here 7 elements
		 Arrays[] arr7=new Arrays[20];       //size fixed by initialization i,e 20
		 int arr8[]   =new int[]{};         //empty array 0 size 
		 
		 
		 System.out.println("arr1 "+arr1.length);
		 System.out.println("arr2 "+arr2.length);
		 System.out.println("arr3 "+arr3.length);
		 System.out.println("arr4 "+arr4.length);
		 System.out.println("arr5 "+arr5.length);
		 System.out.println("arr6 "+arr6.length);
		 System.out.println("arr7 "+arr7.length);
		 System.out.println("arr8 "+arr8.length);
		 
		 int arr9[]    =new int[5]; 
		 int arr10[]   =new int[5]; 
		 arr9=arr10;
		 System.out.println(""+arr9.equals(arr10));
		 System.out.println( arr9==arr10);
		 
	}

}
