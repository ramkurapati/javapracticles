package GenericsOnObjects;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class GenericObjects<K,V> 
{
	    private K emp;
	    private V dept;
	    
	    public K getEmp() {
			return emp;
		}

		public V getDept() {
			return dept;
		}

	public GenericObjects(K emp, V dept)
	{
		this.emp=emp;
		this.dept=dept;
	}

	
	public void show()
    {
            System.out.println( emp + " \t " + dept);   
    }
	
	public static void main(String[] args)
	{	
	     Employee e1=new Employee("ram",1234L);
		 Employee e2=new Employee("kumar",1235L);
		 Employee e3=new Employee("raja",1246L);
		 Employee e4=new Employee("krishna",1256L);
		 Employee e5=new Employee("Jyothi",1276L);
		
		 Department d1=new Department("Accounts",9876L);
		 Department d2=new Department("Finacial",9800L);
		 Department d3=new Department("HR",9001L);
		 Department d4=new Department("Administration",9009L);
		 Department d5=new Department("IT",9100L);

		 HashMap<String,Long> hm=new HashMap<>();
		 hm.put(e1.ename,d1.did);
		 hm.put(e2.ename,d1.did);
		 hm.put(e3.ename,d3.did);
		 hm.put(e4.ename,d4.did);
		 hm.put(e5.ename,d5.did);
		 
		 System.out.println(" "+hm);
		 
		    /*Set<?> set=hm.entrySet();
			Iterator<?> it=set.iterator();
			while(it.hasNext())
			{
				Map.Entry me=(Map.Entry) it.next();
				System.out.println(me.getKey()+":"+me.getValue());
			}*/
		
	    GenericObjects<Set<String>, Collection<Long>> cmp = new GenericObjects<>(hm.keySet(),hm.values());
		cmp.show();
		
		 HashMap<String,String> hm2=new HashMap<>();
		 hm2.put(e1.ename,d1.dname);
		 hm2.put(e2.ename,d2.dname);
		 hm2.put(e3.ename,d3.dname);
		 hm2.put(e4.ename,d4.dname);
		 hm2.put(e5.ename,d5.dname);
		 
		 System.out.println(" "+hm2);
		 
		 GenericObjects<Set<String>, Collection<String>> cmp2 = new GenericObjects<>(hm2.keySet(),hm2.values());
		 cmp2.show();
		
	}

}
