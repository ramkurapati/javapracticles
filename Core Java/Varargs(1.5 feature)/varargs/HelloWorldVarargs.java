package varargs;

public class HelloWorldVarargs
{
	public static void test(String statename, String... args)
    {
        System.out.print("\n" + statename);
        for(String arg: args) 
        {
            System.out.print(" - " + arg);
        }
     }
	 public static void main(String[] args)
	 {
	        test("AP-->", "Vizag", "atp","kurnool");
	        test("TS-->", "Hyderabad", "warangal", "Nalgonda");
	 }
	 
	    
}
