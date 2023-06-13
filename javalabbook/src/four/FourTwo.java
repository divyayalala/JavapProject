package four;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class FourTwo {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("numbers.txt");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter(",");
        while(scanner.hasNext()) {
        	int val = Integer.parseInt(scanner.next());
        	if(val%2==0) {
        		System.out.println(val);
        	}
      	
        }
		scanner.close();
	}
}
