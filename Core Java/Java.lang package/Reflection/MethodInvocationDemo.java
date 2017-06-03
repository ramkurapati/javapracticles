package Reflection;

import java.lang.reflect.Method;

public class MethodInvocationDemo {

	public static void main(String[] args) {
		 
	    //no paramater
		Class<?> noparams[] = {};
	 
		//String parameter
		Class<?>[] paramString = new Class[1];
		paramString[0] = String.class;
	 
		//int parameter
		Class<?>[] paramInt = new Class[1];	
		paramInt[0] = Integer.TYPE;
	 
		try{
		        //load the AppTest at runtime
			Class<?> cls = Class.forName("Reflection.MethodsHome");
			Object obj = cls.newInstance();
	 
			//call the printIt method
			Method method = cls.getDeclaredMethod("printIt", noparams);
			method.invoke(obj, null);
	 
			//call the printItString method, pass a String param 
			method = cls.getDeclaredMethod("printItString", paramString);
			method.invoke(obj, new String("rammohan"));
	 
			//call the printItInt method, pass a int param
			method = cls.getDeclaredMethod("printItInt", paramInt);
			method.invoke(obj, 27);
	 
			//call the setCounter method, pass a int param
			method = cls.getDeclaredMethod("setCounter", paramInt);
			method.invoke(obj, 999);
	 
			//call the printCounter method
			method = cls.getDeclaredMethod("printCounter", noparams);
			method.invoke(obj, null);
	 
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
