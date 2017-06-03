/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package polymorphism2;


public class run {
    public static void main(String[] args)
    {
        shape s[]=new shape[2];

        s[0]=new circle();
        s[1]=new triangle();

        for(int x=0;x<s.length;++x)
        {
             System.out.println(x);
             s[x].eat();
        }
    }
}
