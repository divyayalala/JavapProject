package multi;
class reservation extends Thread{
	public reservation(ThreadGroup tg, String string) {
		// TODO Auto-generated constructor stub
		super(tg,string);
	}

	public void run() {
		System.out.println("I am reservation thread");
	}
}
class cancellation extends Thread{
	public cancellation(ThreadGroup tg, String string) {
		// TODO Auto-generated constructor stub
		super(tg,string);
	}

	public void run() {
		System.out.println("I am cancellation thread");
	}
}
public class TGroup{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup tg = new ThreadGroup("first group");
		reservation r1 = new reservation(tg,"first thread");
		reservation r2 = new reservation(tg,"second thread");
		
		ThreadGroup tg2 = new ThreadGroup(tg,"second group");
		cancellation c1 = new cancellation(tg2,"third thread");
		cancellation c2 = new cancellation(tg2,"fourth thread");
		
		System.out.println("parent of tg1 :"+tg2.getParent());
		
		tg.setMaxPriority(7);
		System.out.println(r1.getThreadGroup());
		System.out.println(c1.getThreadGroup());
		r1.start();
		r2.start();
		c1.start();
		c2.start();
		System.out.println("no of threads active in tg "+tg.activeCount());
		System.out.println("no of threads active in tg "+tg2.activeCount());
		

	}

}
