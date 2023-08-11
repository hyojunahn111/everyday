import java.util.Scanner;
import java.util.Arrays;

public class back1152 {

	public static void main(String[] args) {

		String str;
		
		Scanner sc = new Scanner(System.in);
		
		str = sc.nextLine().trim();
		
		String[] words = str.split("\\s");
	
		int count = words.length;
		
		System.out.println(count);
		
	}

}
