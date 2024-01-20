package Collection;
import java.util.*;

public class Comparable_Comparator {
	public static void main(String[] args) {
		ArrayList<Emp> emps=new ArrayList<>();
		emps.add(new Emp("shaif","321234",12));
		emps.add(new Emp("sahil","977",14));
		emps.add(new Emp("ibrar","777",4));
		System.out.println(emps);
		
		Collections.sort(emps, new IdComparator());
		//comparable
		System.out.println(emps);
		
		ArrayList<Emp> emps1=new ArrayList<>(emps);
		Collections.sort(emps1, new NameComparator());
		System.out.println(emps1);
	}
}
