package p1;

public class static1 {

    private String fname;
    private int age;
    private static int members;

    static1(String fn,int a)
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

    public int getmembers()
    {
        return members;
    }
}
