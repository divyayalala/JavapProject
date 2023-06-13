package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();
	list.add(10);
	list.add(null);
	//type is object type
	List anotherList = new ArrayList();
	anotherList.add("hello");
	anotherList.add(10.9);
	anotherList.add(true);
	anotherList.add(null);
	System.out.println(anotherList);
}
}
