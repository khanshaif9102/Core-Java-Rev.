package Collection_Questions;

public class Example {
	public static void main(String[] args) {
	Box<String> box=new Box<String>("wow this is amazing");
	System.out.println(box.getValue());
	System.out.println(box.container.getClass().getName());
	Box<Integer> box1=new Box<>(10);
	System.out.println(box1.getValue());
	System.out.println(box1.container.getClass().getName());
	box.container="shaif";
	box1.container=20;
	Box<Boolean> box2=new Box<>(true);
	System.out.println(box2.getValue());
	System.out.println(box2.getValue().getClass().getName());
	
	box.performSomeTask();
	box1.performSomeTask();
	
	}
}
