package Collections;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MyComparea implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;
		return I2.compareTo(I1);
	}
	
}

public class MapDemo {

	public static void main(String[] args) {
		/*String[] array = {"A","B","C","D"};
		List<String> list = Arrays.asList(array);
		System.out.println("list :"+list);*/
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "A");
		map.put(1, "B");
		map.put(3, "E");
		map.put(6, "C");
		map.put(2, "D");
		map.put(4, "F");
		map.put(8, "G");
		map.put(9, "H");
		map.put(5, "I");
		map.put(7, "J");
		System.out.println(map);
		//Collections.sort((List<T>) map, new MyComparea());
		for (Map.Entry<Integer, String> mp : map.entrySet()) {
			System.out.println(map.entrySet().contains(mp.getValue()));
			//System.out.println(mp.getKey()+" , "+mp.getValue());
		}

	}

}
