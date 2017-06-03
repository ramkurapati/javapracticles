package p1;

public class usestatic1 {

    public static void main(String[] args)
    {
        static1 s1=new static1("Ram",23);
        static1 s2=new static1("Sham",25);
        static1 s3=new static1("Rahim",30);
        System.out.println(s1.getname());
        System.out.println(s1.getage());
        System.out.println(s1.getmembers());
    }
}
