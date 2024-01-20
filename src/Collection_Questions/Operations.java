package Collection_Questions;

import java.util.*;

public class Operations {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(40);
		list.add(50);
		//reverse a list
		Collections.reverse(list);
		System.out.println(list);
		//sorting a list
		Collections.sort(list);
		System.out.println(list);
		//remove duplicates elements
		LinkedHashSet<Integer> set=new LinkedHashSet<>(list);
		System.out.println(set);
		
	}
}
