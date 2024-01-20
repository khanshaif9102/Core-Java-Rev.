package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
	     list.add("shaif khan");
	     list.add("sahil khan");
	     list.add("ibrar k");
	     list.add("amit");
	     list.add("amit");
	     list.add("ABC");
	     
	     //Traversing 
	     //for each loop:
	     for(String i:list) {
	    	 System.out.print(i+"\t"+i.length()+"\t");
	    	 StringBuffer br=new StringBuffer(i);
	    	 System.out.println(br.reverse());
	     }
	    System.out.println("---------------------------");
	    //traversing using iterator: forward traversing
	    Iterator<String> itr=list.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    System.out.println("-----------------------------------");
	    //backward traversal of collection: list iterator
	    ListIterator<String> litr=list.listIterator(list.size());
	    while(litr.hasPrevious()) {
	    	String previous=litr.previous();
	    	System.out.println(previous);
	    }
	    //Enumeration
	    System.out.println("++++++++++++++++++for each method++++++++++++++++++");
	    //for each method
	    list.forEach(e->{
	    	System.out.println(e);
	    });
	    list.forEach(i->{
	    	System.out.println(i);
	    });
	    System.out.println("+++++++++++sorting of elements++++++++++++++");
	    TreeSet<String> set=new TreeSet<>();
	    set.addAll(list);
	    set.forEach(e->{
	    	System.out.println(e);
	    });
	    
	   // Comparable
	   //Comparator
	    
	}
}
