/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Scanner;

import java.util.Scanner;

/**
 *
 * @author Jetking
 */
public class useone {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter an integer");
        int num=s.nextInt();
        one obj=new one(num);
        obj.show();
    }
}
