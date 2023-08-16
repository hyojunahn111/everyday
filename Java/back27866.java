import java.util.Scanner;

public class back27866 {

	public static void main(String[] args) {

		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		char word[] = input.toCharArray();
		
		
		num = sc.nextInt();
		
		System.out.println(word[num - 1]);
		
	}

}
