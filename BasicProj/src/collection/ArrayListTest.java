package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListTest {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("hi");
	list.add("hello");
	System.out.println(list.get(0));
	System.out.println(list.size());
	System.out.println(list.contains("hello"));
	list.set(0, "divya");
	list.add(1, "yalala");
//	System.out.println(list.remove("hello"));
	list.clear();
	System.out.println(list);
	
	//linkedlist
	LinkedList l1 = new LinkedList();
	l1.add("hello");
	l1.add(1);
	l1.add(1, "hai");
	System.out.println(l1.get(2));
	System.out.println(l1);
	
	//vector 
	
	List<String> v1 = new Vector<>();
	v1.add("cgg");
	v1.add("temp");
	v1.addAll(0, l1);
	System.out.println(v1);
	
	//hashset
	Set<Double> s1 = new HashSet<>();
	s1.add(10.3);
	s1.add(16d);
	s1.add(18.9);
	s1.add(18.9);
	System.out.println(s1);
	//Treeset
	Set s2 = new TreeSet<>();
	s2.addAll(s1);
	//s2.add("divya");
	System.out.println(s2);
	//Linkedhashset
	LinkedHashSet l2 = new LinkedHashSet();
	l2.add("hello");
	l2.add("hai");
	System.out.println(l2);
}
}
