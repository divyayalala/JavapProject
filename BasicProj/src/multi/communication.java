package multi;

class producer extends Thread{
	StringBuffer sb;
	public boolean dataprodover;
	public producer() {
		sb = new StringBuffer();
	}
	public void run() {
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
		dataprodover = true;
	}
	
}
class consumer extends Thread{
	producer prod;
	public consumer(producer prod) {
		this.prod = prod;
	}
	public void run() {
		try {
			while(!prod.dataprodover)
				Thread.sleep(10);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(prod.sb);
	}
}
public class communication {
   public static void main(String[] args) {
	   producer p1 = new producer();
	   consumer c1 = new consumer(p1);
	   c1.start();
	   p1.start();
	   
   }
}
