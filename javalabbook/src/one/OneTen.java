package one;
import java.util.*;


public class OneTen {
	public static void main(String[] args) {
		String s;
		Scanner scan = new Scanner(System.in);
		s = scan.next();
		System.out.println(checkPositive(s));
	}

	private static boolean checkPositive(String s) {
		int i=0;
		while(i<s.length()-1) {
			if(s.charAt(i)-'a'>s.charAt(i+1)-'a')
				return false;
			i++;
		}
		return true;
	}
}
