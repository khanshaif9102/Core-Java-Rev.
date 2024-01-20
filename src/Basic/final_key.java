package Basic;

public class final_key {
	final int b=20;
	
	static int a=10;
	
	final_key(int n){
		this.a=n;
		a++;
	}
	public void show() {
		System.out.println(a);
	}
	public static void main(String args[]) {
		final_key obj=new final_key(5);
		obj.show();
		String s="shaif";
		s="khan";
		System.out.println(s);
	}
}
