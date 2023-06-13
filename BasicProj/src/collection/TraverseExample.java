package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("fariha");
		list.add("divya");
		list.add("ramya");
		list.add("nandini");
		list.add("ganga");
		
		//for each loop
		for(String s:list) {
			System.out.print(s+"\t");
		}
		System.out.println();
		//iterator(forward)
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
		System.out.println();
		//list iterator
		ListIterator<String> itr1 = list.listIterator(list.size());
		while(itr1.hasPrevious()) {
			System.out.print(itr1.previous()+"\t");
		}
		System.out.println(55);
		list.forEach(e->System.out.println(e));	
		System.out.println("sorting of elements");
		TreeSet<String> t1 = new TreeSet<>();
		t1.addAll(list);
		t1.forEach(e->System.out.print(e+"\t"));
	}
  
}
