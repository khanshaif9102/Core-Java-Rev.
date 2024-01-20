package Collection;
//import util package[all classes]
import java.util.*;

public class StartCode {
	public static void main(String []args) {
		System.out.println("welcome to code java collection framework");
		/*Creating collection
		 * 1)type safe- same type of elements(objects) are added to collection
		 * 2)none type safe- different types of elements(objects) can be added to collection
		 */
		//Type safe collection
		ArrayList<String> list=new ArrayList<String>();
	     list.add("shaif khan");
	     list.add("sahil khan");
	     list.add("ibrar k");
	     list.add("amit");
	     list.add("amit");
	System.out.println(list);
//		System.out.println(list.get(0));
//		
//		//untype safe collection
//		LinkedList list1=new LinkedList();
//		list1.add(20);
//		list1.add(20.125);
//		list1.add("khan");
//		list1.add(10.55555);
//		System.out.println(list1);
//		Iterator itr=list1.iterator();
	
	//remove 
		list.remove("shaif khan");
		System.out.println(list);
		//size
		System.out.println("list size: "+list.size());
		
		//check item is there or not
		//type ka equla method call karta hai checking krne ke liye
		System.out.println(list.contains("khan"));
		
		//check for empty
		System.out.println(list.isEmpty());
		
		//setting value
		list.add(1,"shaif");
		System.out.println(list);
		list.set(1, "shaif khan");
		System.out.println(list);
		
		//remove all elemnts
		//list.clear();
	//	System.out.println(list);
		
		Vector<String> vector=new Vector<>();
		vector.addAll(list);
		System.out.println(vector);
		System.out.println("-----------------------------------");
		
		HashSet<Double> nms=new HashSet<>();
		nms.add(14.14);
		nms.add(20.25);
		nms.add(12.4445);
		nms.add(2354.235);
		nms.add(99.3);
		nms.add(99.3);
		nms.add(5.3);
		System.out.println(nms);
		
		TreeSet<Double> tset=new TreeSet<>();
		tset.addAll(nms);
		System.out.println(tset);
		
	}
}
