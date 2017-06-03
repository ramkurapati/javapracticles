package Inheritance.IsARelationship;

 class Dog extends Mammal
 {
	 
	 /*public void info(){
		  System.out.println("dog info");
	  }*/
	 
 	public static void main(String[] args)
	{
		Animal a=new Animal();//parent =new parent valid
		Animal am=new Mammal();//parent =new child  valid
		Mammal m=new Mammal();//child1=new child1  valid
		Mammal md= new Dog();//child1=new child2  valid
		Dog d=new Dog();//child2=new child2
		//Dog dog=new Animal();//child =new parent not valid
		
		System.out.println(m instanceof Animal);
		System.out.println(am instanceof Mammal);
		System.out.println(d instanceof Animal);
		System.out.println(m instanceof Mammal);
		System.out.println(md instanceof Dog);
		System.out.println(a instanceof Dog);
		//d.info();
		//md.info();
		//m.info();
		am.info();
		

	}
 }


