import java.util.Scanner;

public class back2525 {

	public static void main(String[] args) {
		
		int hour = 0;
		int min = 0;
		int plus = 0;
		Scanner sc = new Scanner(System.in);
		
		hour = sc.nextInt();
		min = sc.nextInt();
		
		plus = sc.nextInt();
		
		int sum = 0;
		sum = min + plus;
		
		if(sum >= 60) {
			System.out.println(((hour + (sum / 60)) % 24) + " " + (sum % 60));
		}
		else {
			System.out.println((hour % 24) + " " + sum);
		}
		
		
	}

}
