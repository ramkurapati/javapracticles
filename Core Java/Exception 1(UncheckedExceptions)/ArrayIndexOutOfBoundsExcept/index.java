package ArrayIndexOutOfBoundsExcept;

public class index {

    public static void main(String[] args)
    {                       // 0 1 2 
        int[] num = new int[] {1,2,3};
        try
        {
            System.out.println(num[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Can't access location...location incorrect");
        }
    }
}
