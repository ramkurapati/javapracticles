package List.OtherOperations;

import java.util.LinkedList;

import PrototypeDP.Car;

public class MyStack {

	private LinkedList<Object> list = new LinkedList<Object>();
	public void push(Object o){
	list.addFirst(o);
	}
	public Object top(){
	return list.getFirst();
	}
	
	public Object pop(){
	return list.removeFirst();
	}
	
	public static void main(String args[]) {
	Car myCar;
	MyStack s = new MyStack();
	s.push (new Car());
	myCar = (Car)s.pop();
	}
}
