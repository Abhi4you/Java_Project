package Collections;
import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		WeakHashMap<Object, String> map = new WeakHashMap<Object, String>();
		//HashMap<Object, String> map = new HashMap<Object, String>();
		WeakHashMapDemo w = new WeakHashMapDemo();
		map.put(w, "Abhishek");
		System.out.println(map);
		w = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);
	}

}
