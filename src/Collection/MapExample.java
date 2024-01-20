package Collection;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		HashMap<String,Integer> courses=new HashMap<>();
		//adding elements
		courses.put("core java", 4000);
		courses.put("basic python", 3500);
		courses.put("spring",8000);
		courses.put("android", 4000);
		courses.put("android", 4000);
		courses.put("PHP", 2424);
		System.out.println(courses);
		
//		courses.forEach((e1,e2)->{
//			System.out.println(e1+"="+e2);
//		});
//		
		courses.forEach((key,value)->{
			System.out.print(key);
			System.out.print("=>");
			System.out.println(value);
			System.out.println();
		});
		//entry set
		//key set
		System.out.println(courses.get("core java"));
		
	}
}
