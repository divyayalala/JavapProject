package three;
import java.util.*;

public class ThreeFour {
public static void main(String[] args) {	
    ArrayList<String> s = new ArrayList<>();
    s.add("divya");
    s.add("nandini");
    s.add("fariha");
    Collections.sort(s,new ComparatorExample());
    for(String i:s) {
    	System.out.println(i);
    }
    
}
}
