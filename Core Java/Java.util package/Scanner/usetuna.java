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
public class usetuna {
    public static void main(String[] args)
    {
      //  tuna t=new tuna();
      //  t.sendmessage("Lisa");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name");
        String name=s.nextLine();
      //  t.sendmessage(name);
        tuna1 t1=new tuna1(name);
    }
}
