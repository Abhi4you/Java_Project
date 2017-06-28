package Collections;
class MyThread extends Thread{
	public void run(){
		for (int i = 0; i < 4; i++) {
			System.out.println("Running from child thread....!!!");
		}
	}
}
public class ExtendsThreadDemo{
	public static void main(String[] args){
		MyThread mt = new MyThread();
		mt.start();
		for (int i = 0; i < 4; i++) {
			System.out.println("Running from map thread....!!!");
		}
	}
}
