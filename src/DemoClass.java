import java.util.LinkedList;
import java.util.Scanner;

class DemoClass {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the nummber of test case..");
		int numOfTestCase = scanner.nextInt();
		for(int i = 1; i <= numOfTestCase; i++){
		    System.out.println("Enter the nummber..");
		    int maxNum = scanner.nextInt();
		    System.out.println("Total number :"+getDigist(maxNum));
		}
	}
	public static int getDigist(int maxNum){
		int counter = 0;
	    boolean validDigist;
	    int number;
	    int lastdigist;
	    for(int num = 1; num <= maxNum; num++){
	        validDigist = true;
	        number = num;
	        while(number != 0){
	            lastdigist = number%10;
	            if(!isValidDigist(lastdigist)){
                    validDigist = false;
                    break;
	            }
	            number = number/10;
	        }
	        if(validDigist){
	            counter++;
	        }
	    }
	    return counter;
	}
	public static boolean isValidDigist(int lastdigist){
	    int[] arraySet = {1, 2, 3, 4 ,5};
	    for(int i = 0; i < arraySet.length; i++){
	        if(arraySet[i] == lastdigist){
	            return true;
	        }
	    }
	    return false; 
	}
}