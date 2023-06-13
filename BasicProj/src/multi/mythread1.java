package multi;

public class mythread1 extends Thread{
	
    String str;
	public mythread1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.str = name;
	}
	public void run() {
		System.out.println("thread name : "+getName());
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		mythread1 thread = new mythread1("first thread");
		thread.start();
		mythread1 thread2 = new mythread1("first thread");
		thread2.start();
		boolean alive = thread.isAlive();
		System.out.println("first thread is alive "+alive);
		boolean alive1 = thread.isAlive();
		System.out.println("first thread is alive "+alive1);
		thread.join();
		thread2.join();
		System.out.println("main ends");

	}

}
