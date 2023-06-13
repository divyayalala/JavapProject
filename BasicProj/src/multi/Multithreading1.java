package multi;

public class Multithreading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let us find current thread");
		Thread t=Thread.currentThread();
		System.out.println("Current thread="+t);
		System.out.println("It's name= "+t.getName());
	}

}
