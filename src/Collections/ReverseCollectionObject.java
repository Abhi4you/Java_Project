package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Object>{
	@Override
	public int compare(Object o1, Object o2) {
		
		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;
		
		return -I1.compareTo(I2);
	}
}

public class ReverseCollectionObject  extends MyComparator{

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(6);
		list.add(7);
		list.add(3);
		list.add(9);
		list.add(5);
		list.add(4);
		list.add(1);
		list.add(8);
		list.add(10);
		/*for (Integer integer : list) {
			System.out.print(integer+" ");
		}
		System.out.println();
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();*/
		Collections.sort(list);
		System.out.println("Without sort :"+list);
		Collections.sort(list, new MyComparator());
		
		System.out.println("Reverse ArrayList :"+list);
		
		
	}

}
