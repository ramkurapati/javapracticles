package Reflection;

class Simple{}  

class Test
{  
   public static void main(String args[]) throws ClassNotFoundException
   {  
   Class c=Class.forName("Reflection.Simple");  
   System.out.println(c.getName());  
   }  

}
