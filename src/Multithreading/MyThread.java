package Multithreading;

public class MyThread implements Runnable
{
	public void run() {
		//task for thread
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
	public static void main(String []args) {
		MyThread t1=new MyThread();
		Thread thr=new Thread(t1);
		
		//obj another thread
		AnotherThread t2=new AnotherThread();
		
		thr.start();
		t2.start();
	}
}
