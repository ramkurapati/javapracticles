package Enum;

import java.util.EnumSet;

public class usetuna1 {
     public static void main(String[] args)
    {
        for(tuna t : EnumSet.range(tuna.rahim,tuna.xyz))
        {
            System.out.format("%s\t%s\t%s\n",t,t.getheight(),t.getage());
        }
    }
}
