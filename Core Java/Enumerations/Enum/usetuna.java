package Enum;

public class usetuna {
    public static void main(String[] args)
    {
        for(tuna t : tuna.values())
        {
            System.out.format("%s\t%s\t%s\n",t,t.getheight(),t.getage());
        }
    }
}
