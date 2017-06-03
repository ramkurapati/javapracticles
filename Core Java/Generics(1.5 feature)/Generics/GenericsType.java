package Generics;
public class GenericsType<T> {
	 
    private T t;
     
    public T get(){
        return this.t;
    }
     
    public void set(T t1){
        this.t=t1;
    }
     
    public static void main(String args[]){
    	
        GenericsType<String> type = new GenericsType<>();
        type.set("Pankaj"); //valid
        String str=type.get(); 
        System.out.println(str);
        
        GenericsType<Integer> type2 = new GenericsType<>();
        type2.set(30); 
        type2.set(20);
        int i=type2.get();
        System.out.println(i);
        
        
        GenericsType type1 = new GenericsType(); //raw type
        type1.set("kumar"); //valid and autoboxing support required
        String str2=(String) type1.get();
        System.out.println(str2);
        type1.set(20); //valid and autoboxing support required
        int i2=(int) type1.get();
        System.out.println(i2);
        
    }

}
