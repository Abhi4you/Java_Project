package Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


class Test
{
	public Object m1(){
		return null;
	}
}
class Demo extends Test
{
	public String m1(){
		return null;
	}
}
class MainDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(2);
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(3);
		arrayList.add(2);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(1);
		
		ArrayList<Integer> listDuplicates  = new ArrayList<>();
		for (int i = 0; i < arrayList.size(); i++) {
			if(listDuplicates.contains(arrayList.get(i))){
				System.out.println("Element in list :"+arrayList.get(i));
			}
		}
		System.out.println("listDuplicates :"+listDuplicates);
		
		Set<Integer> setDuplicates = new HashSet<>();
		for(int i = 0; i < arrayList.size(); i++){
			if(!setDuplicates.add(arrayList.get(i))){
				
			}
		}
		
		
	}
}
