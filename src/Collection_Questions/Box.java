package Collection_Questions;

public class Box<T>{
	//Object class is top most parent class of all java classes
	T container;
	
	public Box(T container) {
		this.container=container;
	}
	public Object getValue() {
		return this.container;
	}
	public void performSomeTask() {
		if(container instanceof String) {
			System.out.println("length of "+container+" is :"+((String)this.container).length());
		} else if(container instanceof Integer) {
			System.out.println("this is a integer value:"+container);
		}
	}
}
