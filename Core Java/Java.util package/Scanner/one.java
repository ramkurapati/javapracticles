/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Scanner;

public class one {
    private int snum=100,ans;

    one(int fnum)
    {
        ans=fnum+snum;
    }

    int total()
    {
        return ans;
    }

    void show()
    {
        System.out.println("Return=" +total());
    }
}
