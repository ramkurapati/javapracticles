package ClassLoaders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class InstanceDemo {

	public static void main(String[] args) 
	{
		Object obj=new ArrayList<Object>().iterator();
       System.out.println(obj instanceof List);
       System.out.println(obj instanceof Iterator);
       System.out.println(obj instanceof ArrayList);
       
       StringBuffer sb=new StringBuffer("ram");
       StringBuilder sbd=new StringBuilder("ram");
       System.out.println("buffer and builder compare "+sb.equals(sbd));
       String str=sb.toString();
       System.out.println(str);
       System.out.println(str instanceof String);
       
       String str1=sbd.toString();
       System.out.println(str1);
       System.out.println(str1 instanceof String);
       
       String str3=new String("RAMMOHAN");
       char[] charry=str3.toCharArray();
       System.out.println(charry);
       System.out.println(charry instanceof char[]);
       
       char[] charry2={'R','A','M'};
       String str4=new String(charry2);String str41=String.valueOf(charry2);
       System.out.println(charry2);
       System.out.println(str4);
       System.out.println(str4 instanceof String);
       
       String[] st={"m","o","h","a","n"};
       String str5=Arrays.toString(st);
       String str6=Arrays.asList(st).toString();
       System.out.println(str5);
       System.out.println(str6);
       StringBuffer sbf = new StringBuffer();
       if(st.length > 0)
       {
               sbf.append(st[0]);
               for(int i=1; i < st.length; i++)
               {
                       sbf.append("").append(st[i]);
               }    
       }
       String str7=sbf.toString();
       System.out.println(str7);
       System.out.println(str5 instanceof String);
       
       Integer i=new Integer(100);
       String str2=i.toString();
       System.out.println(str2);
       System.out.println(str2 instanceof String);
       
       Object[] obj2={"ram","mohan"};
       System.out.println(Arrays.deepToString(obj2));
       
       Object obj3="ram";
       System.out.println(obj3.toString());
       
       Object obj4=24;
       System.out.println(obj4.toString());
       
       Object obj5='t';
       System.out.println(obj5.toString());
       
	}

}
