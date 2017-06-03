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
public class scan1 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double fnum,snum,ans;
        System.out.println("Enter first number");
        fnum=s.nextDouble();
        System.out.println("Enter second number");
        snum=s.nextDouble();
        ans=fnum+snum;
        System.out.println("Addition=" +ans);
    }
}
