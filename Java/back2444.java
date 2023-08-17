import java.util.Scanner;

public class back2444 {

	public static void main(String[] args) {

		int count = 0;
		String star = "*";
		
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		
		for(int i = 1; i<count + 1; i++) {
			System.out.print(" ".repeat(count - i));
			System.out.print(star.repeat(2*i -1));
			System.out.println("");
			}
        for (int j = 1; j < count; j++) {
            System.out.print(" ".repeat(j));
            System.out.print(star.repeat(2 * (count - j) - 1));
            System.out.println("");
		}
		
	}

}
