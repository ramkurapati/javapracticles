package usedforInterfaces;

public class RunnableDemo {

	public static void main(String[] args) {

        Runnable r1=()->{
        	
        	System.out.println("Thread started");
        };
        
        Thread t1=new Thread(r1);
        t1.start();
	}

}
