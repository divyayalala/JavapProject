package multi;
class threadTest extends Thread{
	public void run() {
		task1();
		task2();
		task3();
	}

	private void task3() {
		System.out.println("task3");
		
	}

	private void task2() {
		System.out.println("task2");
		
	}

	private void task1() {
	 System.out.println("task1");
		
	}
}

public class singleTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadTest test= new threadTest();
		test.start();

	}

}
