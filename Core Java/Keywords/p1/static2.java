package p1;

public class static2 {

    private String fname;
    private int age;
    public static int members;

    static2(String fn,int a)
    {
        fname=fn;
        age=a;
        members++;
    }

    public String getname()
    {
        return fname;
    }

    public int getage()
    {
        return age;
    }

    public static int getmembers()
    {
        return members;
    }
}
