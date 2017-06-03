package Generics;

public class GenericsInheritance {

	 public static void main(String[] args) {
	        String str = "abc";
	        Object obj = new Object();
	        obj=str; // works because String is-a Object, inheritance in java
	         System.out.println(obj);
	         
	            int i =10;
		       Object obj2 = new Object();
		        obj=i; // works because String is-a Object, inheritance in java
		         System.out.println(obj);
	         
	        MyClass<String> myClass1 = new MyClass<String>();
	        MyClass<Object> myClass2 = new MyClass<Object>();
	       // myClass2=myClass1; // compilation error since MyClass<String> is not a MyClass<Object>
	       // myClass1=myClass2;// compilation error since MyClass<String> is not a MyClass<Object>
	        obj = myClass1; // MyClass<T> parent is Object
	        obj2=myClass2;
	        System.out.println(obj);
	        System.out.println(obj2);
	    }
	     
	    public static class MyClass<T>{}
}
