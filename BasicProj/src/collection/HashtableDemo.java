package collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable<String,Double> balance = new Hashtable<>();
		balance.put("abc", 16.7);
		balance.put("pqr", 20.0);
		balance.put("xyz", 12.7);
		
		System.out.println("-----------");
		//traversing using enumeration
		Enumeration<String> keys = balance.keys();
		while(keys.hasMoreElements()) {
			String ele = keys.nextElement();
		    System.out.println(ele+" : "+balance.get(ele));
		}
		balance.put("abc", 25.0);
		System.out.println(balance);
		//for each metod
		balance.forEach((k,v)->System.out.println(k+" "+v));

	}

}
