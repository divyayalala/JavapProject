package collection;

import java.util.Collections;
import java.util.TreeSet;

class SortExample {

	public static void main(String[] args) {
		TreeSet<Emp> emps = new TreeSet<>();
		emps.add(new Emp("pqr","5343659",12));
		emps.add(new Emp("xyz","5141659",11));
		emps.add(new Emp("abc","5243639",10));
		emps.add(new Emp("lmn","5047609",19));
		System.out.println(emps);
//		Collections.sort(emps);
//		System.out.println(emps);
//		ArrayList<Emp> emps1 = new ArrayList<>(emps);
//		Collections.sort(emps1, new NameComparator());
//		System.out.println(emps1);
 	}

}
