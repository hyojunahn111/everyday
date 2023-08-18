import java.util.*;

public class back9086 {

	public static void main(String[] args) {

		int count;
		
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			String word = sc.next();
			char charArray[] = word.toCharArray();
			
			System.out.print(charArray[0]);
			System.out.print(charArray[charArray.length - 1]);
			System.out.println();
		}
		
	}

}
