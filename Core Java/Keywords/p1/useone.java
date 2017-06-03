package p1;

public class useone {
    public static void main(String[] args)
    {
        one obj = new one(10);
        for(int i=0;i<5;i++)
        {
            obj.add();
            System.out.printf("%s", obj);
        }
    }
}
