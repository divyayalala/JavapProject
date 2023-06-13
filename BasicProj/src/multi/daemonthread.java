package multi;

class myDaemon extends Thread{
	public void run() {
		System.out.println("I am daemon thread...");
	}
}
public class daemonthread {
	public static void main(String[] args) {
		myDaemon d1 = new myDaemon();
		d1.setDaemon(true);
		System.out.println(d1.isDaemon());
		d1.start();
	}

}
