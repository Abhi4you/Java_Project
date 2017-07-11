import java.util.Scanner;

public class ReverseStringOnFibonacci {
	
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String..:");
		String str = scanner.nextLine();
		String reverseStr = "";
		
		String[] toArrayStr = str.split("\\s+");
		String reverseWord = "";
		String reverseLetter = "";
		int a = 0, b = 1,c;
		for(int i = 0; i < toArrayStr.length; i++){
			c = a + b;
			reverseWord = toArrayStr[i];
			
			for(int j = reverseWord.length()-1; j >= 0; j--){
				reverseLetter = reverseLetter + reverseWord.charAt(j);
			}
			reverseStr = reverseStr + reverseLetter+" ";
			reverseWord = "";
			reverseLetter = "";
		}
		System.out.println("Reverse Statement :"+reverseStr);
		
		
	}
}
