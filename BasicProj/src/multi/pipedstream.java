package multi;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class writerthread extends Thread {
    PipedOutputStream dest;

	public writerthread(PipedOutputStream dest) {
		this.dest = dest;
	}
	public void run() {
		byte[] b = "I LIKE JAVA".getBytes();
			try {
				for(int i=0;i<b.length;i++) {
				dest.write(b[i]);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					dest.flush();
					dest.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
class ReaderThread extends Thread{
	PipedInputStream source;

	public ReaderThread(PipedInputStream source) {
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				source.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class pipedstream {
	public static void main(String[] args) {
		PipedOutputStream dest = new PipedOutputStream();
		PipedInputStream source = new PipedInputStream();
		try {
			dest.connect(source);
		    writerthread writerthread = new writerthread(dest);
		    ReaderThread readerThread = new ReaderThread(source);
		    writerthread.start();
		    readerThread.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
