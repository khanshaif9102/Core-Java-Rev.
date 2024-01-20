package Basic;
class Calculation {
	public void fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println(fact);
		
	}
}
public class object_through_ref_meth_cons{
	String name;
	int age;
	object_through_ref_meth_cons(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println(this.name+" : "+this.age);
	}
	public void getandshow(String n,int a) {
		 this.age=a;
		 this.name=n;
		 System.out.println(this.name+" : "+this.age);
	}
	
	public static void main(String []args) {
		Calculation obj1=new Calculation(),obj2=new Calculation(); //creating two objects  
		new Calculation().fact(5); //calling method with anonymous object  
		String name="shaif"; 
		int age=23;
		object_through_ref_meth_cons obj=new object_through_ref_meth_cons(name,age);
		
		obj.name="sahil"; //through reference
		obj.age=22; //through reference
		System.out.println(obj.name+" : "+obj.age);
		
		obj.getandshow("ibrar", 24); //through method
		
	}

}
