package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
public static void main(String[] args) {
	Map<String,Integer> m1 = new HashMap<>();
	m1.put("core java", 45000);
	m1.put("basic python", 30000);
	m1.put("Spring", 50000);
	m1.put("spring boot", 20000);
	m1.put("Spring", 20000);
    ///traversing using iterator
	Set entryset = m1.entrySet();
	Iterator itr= entryset.iterator();
	System.out.println(m1);
	while(itr.hasNext()) {
		Map.Entry me = (Map.Entry)itr.next();
		System.out.println(me.getKey()+":"+me.getValue());
	}
	//updating a value
	m1.put("core java", m1.get("core java")+1000);
	System.out.println(m1
			);
}
}
