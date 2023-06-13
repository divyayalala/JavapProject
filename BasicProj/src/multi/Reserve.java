package multi;

public class Reserve implements Runnable{
	int available = 1;
	int wanted;
	public Reserve(int wanted) {
		super();
		this.wanted = wanted;
	}
	public void run() {
		System.out.println("Available berts "+available);
		if(available>=wanted) {
			String name = Thread.currentThread().getName();
			System.out.println(wanted+ "berths are reserved by "+name);
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				available = available - wanted;
		}
		else {
			System.out.println("sorry no births");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Reserve reserve = new Reserve(1);
	    Thread thread1 = new Thread(reserve);
	    Thread thread2 = new Thread(reserve);
	    thread1.start();
	    thread2.start();
	    
	    
	    

	}

}
