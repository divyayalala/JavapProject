package multi;

class producer1 extends Thread{
	StringBuffer sb;
	public boolean dataprodover;
	public producer1() {
		sb = new StringBuffer();
	}
	public void run() {
		synchronized (sb) {
		for(int i=1;i<=10;i++) {
			try {
				sb.append(i+" ");
				Thread.sleep(100);
				System.out.println("Appending...");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		sb.notify();
		}
	}
	
}
class consumer1 extends Thread{
	producer1 prod;
	public consumer1(producer1 prod) {
		this.prod = prod;
	}
	public void run() {
		synchronized (prod.sb) {
			try {
				prod.sb.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(prod.sb);
	}
}
public class notifyMethod {
   public static void main(String[] args) {
	   producer1 p1 = new producer1();
	   consumer1 c1 = new consumer1(p1);
	   c1.start();
	   p1.start();
	   
   }
}

