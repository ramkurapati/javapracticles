/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Basics;

import java.util.Random;

public class arry3 {
    public static void main(String[] args)
    {
        int freq[] = new int[7];
        Random dice = new Random();
        for(int face=1; face<1000; face++)
        {
            ++freq[1+dice.nextInt(6)];
        }
        System.out.println(" value\tfrequency ");
        for(int face=1; face<freq.length; face++)
        {
            System.out.println(face+"\t"+freq[face]);
        }
    }
}
