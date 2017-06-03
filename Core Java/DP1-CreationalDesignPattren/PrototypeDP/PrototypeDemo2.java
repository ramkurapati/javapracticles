package PrototypeDP;

public class PrototypeDemo2 {

	
	public static void main(String[] args) {
		
		Employee employee1=new Employee();
		employee1.setName("ram");
		System.out.println(employee1.getName());
		
		Employee employee2=employee1.createInstance();//new Employee();
		System.out.println(employee2.getName());

	}

}
