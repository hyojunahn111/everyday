import java.util.Scanner;

public class back2480 {

	public static void main(String[] args) {

		int a, b, c = 0;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a == b && b == c && a == c) {
			System.out.println(10000 + a * 1000);
		}
		else if (a != b && b != c && a != c) {
			int max = 0;
			if(a > b && a > c) {
				max = a;
			}
			else {
				if(b > c && b > a) {
					max = b;
				}
				else {
					max = c;
				}
			}
			
			System.out.println(max * 100);
		}
		else {
			if(a == b || a == c) {
				System.out.println(1000 + a * 100);
			}
			else {
				if(b == c || b == a) {
					System.out.println(1000 + b * 100);
				}
				else {
					System.out.println(1000 + c * 100);
				}
			}
		}
	}

}
