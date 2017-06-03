package usedforInterfaces;

interface Addable{  
    int add(int a,int b);  
}  
public class LambdaExpressionExample {

	public static void main(String[] args) {
		
        // Multiple parameters with data type in lambda expression  
        Addable ad1=(int a,int b)->(a+b);  
        System.out.println(ad1.add(100,200));  
        
        // Multiple parameters in lambda expression  
        Addable ad2=(a,b)->(a+b);  
        System.out.println(ad2.add(10,20));  
        
        
        Addable ad3=(a,b) ->{
        	return a+b;
        };
        
        System.out.println(ad3.add(10,200));
        
        

	}

}
