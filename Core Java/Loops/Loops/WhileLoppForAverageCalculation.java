package Loops;
import java.util.Scanner;
public class WhileLoppForAverageCalculation {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int total=0;
        int grade;
        int avg;
        int counter=0;
        while(counter<10)
        {
            System.out.println("  Enter  " + (counter+1) + "  number  ");
            grade=s.nextInt();
            total=total+grade;
            counter++;
        }
        avg=total/10;
        System.out.println("  Your average is  " + avg);
    }
}
