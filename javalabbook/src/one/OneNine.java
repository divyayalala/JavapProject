package one;
import java.util.*;

public class OneNine {

	public static void main(String[] args) {
	     int option;
	     String s1;
	     Scanner s2 = new Scanner(System.in);
	     System.out.println("1.Add string to itself \n 2.Replace odd position with # \n 3.Remove Duplicates in string \n 4.Change odd characters to UpperString");
	    System.out.print("Enter Option:");
	     option = s2.nextInt();
	     System.out.print("Enter String:");
	    s1 = s2.next();
	    s1 = stringoperation(s1,option);
	    System.out.println(s1);
	    	 

	}
	private static String stringoperation(String s1, int option) {
	   if(option == 1) {
		   s1 = s1+s1;
		   return s1;
	   }
	   else if(option == 2) {
		   int i=0;
		   StringBuilder s2 = new StringBuilder();
		   while(i<s1.length()) {
			   if(i%2!=0) {
			         s2.append("#");
			   }
			   else
				   s2.append(s1.charAt(i));
			   i++;
		   }
		   return s2.toString();
	   }
	   else if(option == 3) {
		   StringBuilder sb = new StringBuilder();
		for(int i=0;i<s1.length();i++) {
			boolean b=false;
			for(int j=i+1;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					b = true;
				}
			}
			//System.out.println(b);
			if(!b) {
				sb.append(s1.charAt(i));
			}
		}
		return sb.toString();
	   }
	   else if(option == 4) {
		   int i=0;
		   StringBuilder sb = new StringBuilder();
		   while(i<s1.length()) {
			   if(i%2!=0) {
				    sb.append(Character.toUpperCase(s1.charAt(i)));
				   }
			   else
				   sb.append(s1.charAt(i));
			   i++;
		   }
		   return sb.toString();
	   }
	return s1;
	}

}
