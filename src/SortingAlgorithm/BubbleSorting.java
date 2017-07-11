package SortingAlgorithm;

public class BubbleSorting {

	public static void main(String[] args) {
		
		int[] array = {5,1,6,2,4,3};
		int flag = 0;
		for (int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array.length-1-i; j++){
				
				System.out.println("i "+i+"  : j "+j);
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag = 1;
					System.out.println("flag : "+flag);
				}
			}
			System.out.println();
		}
		
		/*for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+",");
		}*/
		/*if(5 < 5){
			System.out.println("Less");
		}else
			System.out.println("greter");*/
	}

}
