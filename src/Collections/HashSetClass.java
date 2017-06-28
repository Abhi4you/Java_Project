package Collections;
import java.util.*;

public class HashSetClass {

		public static void main(String[] args){
			/*HashSet<String> h = new HashSet<String>();
			System.out.println(h.add("A"));
			System.out.println(h.add("A"));
			System.out.println(h.add("B"));
			System.out.println(h.add(null));
			System.out.println(h.add("C"));
			System.out.println("size :"+h.size());
			System.out.println(h);*/
			
			HashSet<Integer> set = new HashSet<Integer>();
			set.add(10);
			set.add(3);
			set.add(9);
			set.add(1);
			set.add(5);
			set.add(8);
			set.add(null);
			System.out.println(set);
			
			LinkedHashSet<Integer> link = new LinkedHashSet<Integer>();
			link.add(10);
			link.add(3);
			link.add(9);
			link.add(1);
			link.add(5);
			link.add(8);
			link.add(null);
			System.out.println(link);
			
			
			
		}
}
