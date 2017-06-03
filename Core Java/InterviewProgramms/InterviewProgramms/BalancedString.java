package InterviewProgramms;

import java.util.Scanner;
import java.util.Stack;

public class BalancedString {
	
	public  String check(String expr)
	 {
	 if (expr.isEmpty())
	 return expr +" Balanced";

	 Stack<Character> stack = new Stack<Character>();
	 for (int i = 0; i < expr.length(); i++)
	 {
	 char current = expr.charAt(i);
	 if (current == '{' || current == '(' || current == '[')
	 {
	 stack.push(current);
	 }
	 if (current == '}' || current == ')' || current == ']')
	 {
	 if (stack.isEmpty())
	 return expr+" Not Balanced";
	 char last = stack.peek();
	 if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
	 stack.pop();
	 else 
	 return expr+" Not Balanced";
	 }
	 }
	 return stack.isEmpty()?expr+" Balanced":expr+" Not Balanced";
	 }
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your string ..");
		String inputString=scanner.nextLine();
		
		System.out.println(new BalancedString().check(inputString));
		
	}

}
