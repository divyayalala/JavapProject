package multi;
class bookticket extends Thread{
	Object train,comp;
	public bookticket(Object train,Object comp) {
		this.train = train;
		this.comp = comp;
	}
	public void run() {
		synchronized(train) {
			System.out.println("book ticket locked on train");
		}
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("book ticket for lock on compartment....");
		synchronized(comp) {
			System.out.println("cancel ticket locked on train");
		}
	}
}
class cancelticket extends Thread{
	Object train,comp;
	public cancelticket(Object train,Object comp) {
		this.train = train;
		this.comp = comp;
	}
	public void run() {
		synchronized(train) {
			System.out.println("book ticket locked on train");
		}
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("book ticket for lock on compartment....");
		synchronized(comp) {
			System.out.println("cancel ticket locked on train");
		}
	}
}
public class deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object train = new Object();
		Object comp = new Object();

	}

}
