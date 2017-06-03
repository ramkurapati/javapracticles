package Usingthrows;
import java.io.IOException;
public class ExceptionPropagationSolution {

	void m() throws IOException
	 {  
	    throw new java.io.IOException("device error");//checked exception  
	  }  
	  void n() throws IOException
	  {  
	    m();  
	  }  
	  void p()
	  {  
	    try{  
	         n();  
	       }
	    catch(Exception e){System.out.println("exception handeled");}  
	  }  
	public static void main(String[] args) throws IOException {
		ExceptionPropagationSolution obj=new ExceptionPropagationSolution();
		obj.p();
		obj.n();

		
		System.out.println("normal flow...");  
	}

}
