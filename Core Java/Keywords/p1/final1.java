package p1;

public class final1 {
    
    public String fname;
    public String sname;
    public final String company;

    final1(String fn,String sn,String c)
    {
        fname=fn;
        sname=sn;
        company=c;
    }

    public String getfname()
    {
       return fname;
    }

    public String getsname()
    {
       return sname;
    }

    public String getcomp()
    {
       return company;
    }
}
