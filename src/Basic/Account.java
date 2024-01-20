package Basic;

public class Account {
	int n=3;
	public int[] balance=new int[3];
	private int[] acc= {1,2,3,4};
	
	public void dep(int acc,int amount) {
		Account obj=new Account();
		for(int i=0;i<3;i++) {
			if(obj.acc[i]==acc) {
				obj.balance[i]=amount;
			}
		}
	}
	public void balance(int acc) {
		Account obj=new Account();
		for(int i=0;i<n;i++) {
			if(obj.acc[i]==acc) {
				System.out.println(obj.balance[i]);
			}
		}
	}
	public void withdraw(int acc,int amount) {
		Account obj=new Account();
		for(int i=0;i<n;i++) {
			if(obj.acc[i]==acc) {
				if(obj.balance[i]>=amount) {
				obj.balance[i]=balance[i]-amount;
				} System.out.println("insuffienct balance");
			}
		}
	}
	public static void main(String []args) {
		int acc=1,bal=1000;
		Account obj=new Account();
		obj.dep(acc, bal);
		obj.balance(acc);
	}

}
