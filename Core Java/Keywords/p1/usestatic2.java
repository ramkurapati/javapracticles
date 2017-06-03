package p1;

public class usestatic2 {

    public static void main(String[] args)
    {
        static2 s1=new static2("Ram",23);
        static2 s2=new static2("Sham",25);
        static2 s3=new static2("Rahim",30);
        System.out.println(s1.getname());
        System.out.println(s1.getage());
        System.out.println(static2.getmembers());
    }
}
