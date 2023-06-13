package multi;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class writer extends Thread implements AutoCloseable{
    PipedOutputStream dest;

	public writer(PipedOutputStream dest) {
		this.dest = dest;
	}
	public void run() {
		byte[] b = "I LIKE JAVA".getBytes();
			try {
				
				for(int i=0;i<b.length;i++) {
				dest.write(b[i]);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	@Override
	public void close() throws Exception {
		System.out.println("closed");
		
	}
		
	}
class reader extends Thread implements AutoCloseable{
	PipedInputStream source;

	public reader(PipedInputStream source) {
		this.source = source;
	}
	public void run() {
		try {
			int r = source.read();
			while(r!=-1) {
				System.out.write(r);
				r = source.read();
			}
			System.out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void close() throws Exception {
		System.out.println("closed");
	}
}
public class trywithresource {

	public static void main(String[] args) {
		try(PipedOutputStream dest = new PipedOutputStream();PipedInputStream source = new PipedInputStream(dest);
			writer writerthread = new writer(dest);reader readerThread = new reader(source)){
		    writerthread.start();
		    readerThread.start();	
		    writerthread.join();
		    readerThread.join();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
