package Collections;
class MyThreads implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Running from runnable interface...");
		}
		
	}
	
}
public class ImplementsThreadDemo {
	public static void main(String[] args){
		MyThreads t = new MyThreads();
		Thread th = new Thread(t);
		th.start();
		for (int i = 0; i < 3; i++) {
			System.out.println("Running from main thread...!!!");
		}
	}
}
