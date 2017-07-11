import java.util.HashSet;
import java.util.Scanner;

public class StringMaxScore {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		HashSet<Character> hs = new HashSet<Character>();
		
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("beforeUsedMem :"+beforeUsedMem);
		for (int i = 1; i <= n; i++) {
			String text = scanner.nextLine();
			/*long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
			System.out.println("beforeUsedMem :"+beforeUsedMem);*/
			System.out.println(getMaxScore(text));
			/*long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
			System.out.println("afterUsedMem :"+afterUsedMem);*/
		}
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("afterUsedMem :"+afterUsedMem);
		if(scanner!=null){
			scanner.close();
			System.gc();
		}

	}

	public static int getMaxScore(String text) {
		int max = 0;
		String temp = "";
		int l = 0;
		
		if (!isValidText(text)) {
			System.out.println("In valid text ");
		} else{
			for (int i = 0; i < text.length(); i++) {
				char c = text.charAt(i);
				if (temp.length() <= 1) {

					l = temp.length();
					temp += c;
				} else {
					if (isDistinctString(temp)) {
						//long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
						l = temp.length();
						temp += c;
					} else {
						int index = getCorrectPopsition(temp);
						if (index > -1) {
							l = temp.length();
							temp = temp.substring(0, index) + c + temp.substring(index, temp.length());
						}
					}
				}
				max = max + l;
			}
		}
		return max;
		
	}

	public static boolean isValidText(String text) {
		boolean flag = true;
		int count = 0;
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i < text.length(); i++) {
			flag = hs.add(text.charAt(i));
			if (!flag) {
				count++;
				flag = true;
			}
			if (count == 2)
				return false;
		}
		return flag;
	}

	public static int getCorrectPopsition(String text) {
		int index = -1;
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i < text.length(); i++) {
			boolean flag = hs.add(text.charAt(i));
			if (!flag) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static boolean isDistinctString(String text) {
		boolean flag = true;
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i < text.length(); i++) {
			flag = hs.add(text.charAt(i));
			if (!flag) {
				break;
			}
		}
		return flag;
	}

}