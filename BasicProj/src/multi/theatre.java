package multi;
public class  theatre implements Runnable{
	String str;
	public theatre(String s) {
		super();
		this.str = s;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(str+" "+i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		theatre t = new theatre("cut test");
		theatre t1 = new theatre("show test");
		Thread test = new Thread(t);
		Thread test1 = new Thread(t1);
		test.start();
		test1.start();
		
	}
}
