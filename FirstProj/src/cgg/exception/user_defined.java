package cgg.exception;

class applicationException extends Exception {
	private int detail;
	
	public applicationException(int detail) {
		super();
		this.detail = detail;
	}
	public String toString() {
		return "Application exception";
	}
}
public class user_defined{
	public static void main(String[] args) {
		try {
			compute(1);
			compute(20);
		}
		catch(applicationException e) {
			System.out.println(e);
		}
	}
private static void compute(int i) throws applicationException{
	System.out.println("called compute");
	if(i>10)
		throw new applicationException(i);
   System.out.println("normal exit");
}
}
