package Instancemethods;

import java.util.Scanner;

public class InstanceMethodsDemo 
{
	
	public static void main(String[] args) 
	{
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		s.setName(sc.nextLine());
		s.setAge(25);
		s.setSex('M');
		
		System.out.println("Name : "+s.getName());
		System.out.println("Age : "+s.getAge());
	    System.out.println("Gender : "+s.getSex());
	}

}
