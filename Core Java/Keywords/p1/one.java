package p1;

public class one {
    private int sum;
    private final int NUMBER;
    
    public one(int n)
    {
        NUMBER=n;
    }

    public void add()
    {
        sum+=NUMBER;
    }

    public String toString()
    {
        return String.format("Sum=%d\n", sum);
    }
}
