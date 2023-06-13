package multi;

class MyThread extends Thread{
	public void run() {
		//System.out.println(this.getName());
		for(int i=0;i<100000;i++)
		{
			System.out.println(i+"\t"+this.getName());
		}
	}
}
public class Multithreading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread=new MyThread();
		myThread.setName("First Thread");
		myThread.start();
		MyThread myThread1=new MyThread();	
		myThread1.setName("Second Thread");
		myThread1.start();
	}

}
