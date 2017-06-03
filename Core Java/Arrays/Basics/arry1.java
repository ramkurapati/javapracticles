/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

public class arry1 {
    public static void main(String[] args)
    {
        int values[] = {12,23,23,45,34,67,43,67,35,67};
        System.out.println("Array Length " + values.length);
        System.out.println("counter value");
        for(int counter=0;counter<values.length;counter++)
        {
            System.out.println( "   "+counter + " \t " + values[counter]);
        }
    }
}
