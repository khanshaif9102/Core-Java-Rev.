package Collection_Questions;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
		//type safe list:- generic
		List<String> list=new ArrayList<>();
		list.add("SH");
		
		//non type safe list
		List anotherList=new ArrayList();
		anotherList.addAll(list);
		
		System.out.println(list);
		System.out.println(anotherList);
	}
}
