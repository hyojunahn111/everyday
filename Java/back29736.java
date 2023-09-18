import java.util.*;

public class back29736 {

	public static void main(String[] args) {

		int bsK;
		int disX;
		int A, B;
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		bsK = sc.nextInt();
		disX = sc.nextInt();

		
		int low = Math.max(A, bsK - disX);
		int up = Math.min(B, bsK + disX);
		
		if(low > up) {
			System.out.println("IMPOSSIBLE");
		}
		else {
			System.out.println(up - low + 1);
		}
	}
}
