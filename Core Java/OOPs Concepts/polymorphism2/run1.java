package polymorphism2;

public class run1 {
    public static void main(String[] args)
    {
        sphere sh = new sphere();
        shape s=new shape();
        shape s1=new shape();

        triangle t = new triangle();
        circle c = new circle();

        sh.accept(s);
        sh.accept(s1);

        System.out.println("POLYMORPHISM");

        sh.accept(t);
        sh.accept(c);
    }
}
