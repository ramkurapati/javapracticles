package varargs;

public class varlen {
    public static void main(String[] args)
    {
        int avg = average(10,20,30,40,50);
        System.out.println("Average=" + avg);
    }

    public static int average(int...numbers)
    {
        int total=0;
        for(int x : numbers)
        {
            total+=x;
        }
        return total/numbers.length;
    }
}
