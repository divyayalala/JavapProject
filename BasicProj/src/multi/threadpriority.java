package multi;
class MyClass extends Thread{
	int c;
	public MyClass(String s) {
		super(s);
	}
	public void run() {
		for(int i=1;i<1000;i++) {
			c++;
			
		}
		System.out.println("completed thread :"+this.getName());
		System.out.println("Its priority :"+this.getPriority());
	}
}

public class threadpriority {
	public static void main(String[] args) {
		MyClass t1 = new MyClass("one");
		MyClass t2 = new MyClass("two");
		t1.setPriority(10);
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		
	}

}
