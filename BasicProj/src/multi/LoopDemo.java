package multi;

import java.io.IOException;

class MyLoopThread extends Thread{
	boolean stop=false;
	public void run() {
		System.out.println("Iam thread");
		for(int i=1;i<100000;i++)
		{
			System.out.println(i+" "+this.getName());
		}
	}
}

public class LoopDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MyLoopThread l=new MyLoopThread();
		l.setName("First");
		l.start();
		System.in.read();
		l.stop=true;
	}

}
