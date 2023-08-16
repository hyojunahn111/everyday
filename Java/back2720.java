import java.util.Scanner;

public class back2720 {

	public static void main(String[] args) {

		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			int price = sc.nextInt();
			
			int Q = price / 25;
			int priceQ = price % 25;
			
			int D = priceQ / 10;
			int priceD = priceQ % 10;
			
			int N = priceD / 5;
			int priceN = priceD % 5;
			
			int P = priceN;
			
			System.out.println(Q + " " + D + " " + N + " " + P);
		}
	}

}
