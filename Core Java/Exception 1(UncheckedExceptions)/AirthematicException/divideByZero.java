package AirthematicException;

import java.util.Scanner;

public class divideByZero {

    public static void main(String[] args)
    {
        int numer = 0;
        int denom = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter numeratior");
        numer =s.nextInt();
        System.out.println("Enter denom");
        denom =s.nextInt();
        try
        {
            System.out.println("Division = " +(numer/denom));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't divide by zero");
            System.out.println("Enter non zero denom");
            denom=s.nextInt();
            System.out.println("Division = " +(numer/denom));
        }        
    }
}
