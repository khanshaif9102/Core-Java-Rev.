package Collection_Questions;

import java.util.*;

public class ArrayList_Rem_Dup {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(20);
		list.add(20);
		list.add(40);
		list.add(40);
		list.add(50);
		list.add(50);
		System.out.println("List:"+list);
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		set.addAll(list);
		System.out.println("Set:"+set);
	}
}
