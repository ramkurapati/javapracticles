class Tax
{
	void dispay(String name,Double num)
	{
		name = "Hello " + name.concat("!");
        num = num * 30 / 100;
        System.out.println(name + " You have to pay tax $" + num);
	}
}
public class WhyMutable 
{

	public static void main(String[] args) 
    {
        String name = "Parker";
        Double sal = new Double(60000.00);
        
        displayTax(name, sal);
        Tax t=new Tax();
        t.dispay(name, sal);
    }
    
    static void displayTax(String name, Double sal) 
    {
        name = "Hello " + name.concat("!");
        double sal2 = sal + 30;
        System.out.println(name + " You have to pay tax $" + sal2);
    }

}
