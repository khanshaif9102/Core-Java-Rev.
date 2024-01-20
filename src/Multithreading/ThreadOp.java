package Multithreading;
class UserThread extends Thread{
	public void run() {
		// task for thread...
		System.out.println("this is user define thread");
	}
}
public class ThreadOp {
	public static void main(String []args) {
		System.out.println("program statrted....");
		int x=50+10;
		System.out.println(x);
	
		//Thread
		Thread t=Thread.currentThread();
		String t_name=t.getName();
		System.out.println("current thread:"+t_name);
		
		//sET NAME
		t.setName("Mymain");
		System.out.println(t.getName());
		
		try{Thread.sleep(5000);}catch(Exception e) {}
		
		System.out.println(t.getId());
		
		System.out.println("program ended");
		
		//going to start user defined thread.
				UserThread t1=new UserThread();
				t1.start();
	}
}
