/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

import java.util.Scanner;

public class arry2 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int size,sum=0,c;
        System.out.println(" Enter the initial value ");
        c=s.nextInt();
        int[] arr=new int[c];
        System.out.println(" Enter the size of array ");
        size=s.nextInt();
        System.out.println(" Array size= " +arr.length);
        System.out.println(" Enter the " + size + " numbers one by one ");
        for(int count=0; count<size; count++)
        {
            arr[count] = s.nextInt();
        }
        for(int count=0; count<size; count++)
        {
            sum+=arr[count];
        }
        System.out.println(" Sum of the array items = " + sum);
    }
}
