package Usingthrows;

import java.io.IOException;


class M{  
	 void method(){  
		 try{
			 System.out.println("device operation performed");  
		 }
		 catch(Exception e){
			 System.out.println("error handeld");
		 }
	  
	 }  
	}  

public class ExceptionDeclarationDemo {
	
	public static void main(String[] args) {
		
		M t=new M();
		 t.method();     
		  
		    System.out.println("normal flow..."); 
	}

}
