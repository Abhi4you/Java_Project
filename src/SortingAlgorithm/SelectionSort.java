package SortingAlgorithm;

public class SelectionSort {
	public int[] getSortedArray(int[] array){
		int index;
		for(int i = 0; i < array.length-1; i++){
			index = i;
			for(int j = i + 1; j < array.length; j++){
				if(array[j] < array[index]){
					index = j;
				}
			}
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		return array;
	}
	public static void main(String[] arg){
		int[] array = {9, 4, 7, 3, 2, 8, 6};
		SelectionSort ss = new SelectionSort();
		int[] sortedArray = ss.getSortedArray(array);
		for (int i : sortedArray) {
			System.out.print(i+",");
		}
	}
}
