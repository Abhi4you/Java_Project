package Collections;
import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;
		
		return I2.compareTo(I1);
	}
	
}
public class TressSetExample {
	public static void main(String[] args){
		TreeSet<Integer> tree = new TreeSet<Integer>(new MyCompare());
		tree.add(2);
		tree.add(4);
		tree.add(1);
		tree.add(9);
		tree.add(5);
		tree.add(8);
		tree.add(3);
		tree.add(6);
		tree.add(10);
		tree.add(7);
		tree.add(10);
		System.out.println("Tree values are :"+tree);
	}
}
