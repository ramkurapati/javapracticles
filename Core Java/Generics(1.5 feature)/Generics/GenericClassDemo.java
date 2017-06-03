package Generics;

public class GenericClassDemo<T,S>
{
	T first ;
	S second;
     public GenericClassDemo(T fst,S scd )
     {
    	this.first = fst;
    	this.second = scd;
     }
     
	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public S getSecond() {
		return second;
	}

	public void setSecond(S second) {
		this.second = second;
	}
    public String join()
    {
		return "("+first.toString()+","+second.toString()+")";
    }

	public static void main(String[] args)
	{
		
		GenericClassDemo<String,String> grade=new GenericClassDemo<String,String>("ram","A");
		GenericClassDemo<String,Integer> marks=new GenericClassDemo<String,Integer>("ram",100);
		System.out.println("grade: "+grade.join());
		System.out.println("marks: "+marks.join());
				
	}
}
