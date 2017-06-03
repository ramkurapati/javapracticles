package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcards {

	
	public static void main(String[] args) 
	{
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(3);
        ints.add(5);
        ints.add(10);
        System.out.println("ints List "+ints);
        double sum = sum(ints);
        System.out.println("Sum of ints="+sum);
        
        List<Double> dbls=new ArrayList<Double>();
        dbls.add(new Double(14.23));
        dbls.add(new Double(25.67));
        dbls.add(new Double(85.17));
        List<? extends Number> nums=dbls;
        System.out.println("Doubles List "+nums);
        int sum2 = 0;
        for(Number n : nums)
        {
            sum2 += n.intValue();
        }
        
        System.out.println("Sum of doubles="+sum2);
    }
 
    public static double sum(List<? extends Number> list){
        double sum = 0;
        for(Number n : list)
        {
            sum += n.doubleValue();
        }
        return sum;
    }
}
