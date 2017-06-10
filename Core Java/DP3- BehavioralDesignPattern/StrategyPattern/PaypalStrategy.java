package StrategyPattern;

public class PaypalStrategy implements PaymentGateway{

	 String emailId;
	 String password;
	
	public PaypalStrategy(String email, String pwd){
		this.emailId=email;
		this.password=pwd;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal.");
	}

}