import java.util.Scanner;
import java.util.Arrays;

public class back11659 {

	public static void main(String[] args) {

		int numcount, count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		numcount = sc.nextInt();
		count = sc.nextInt();
		
		int arr[] = new int[numcount + 1];
		
		arr[0] = 0;
		
		for(int i = 1; i <= numcount; i++) {
			arr[i] = arr[i-1] + sc.nextInt();
		}
		
		for(int j = 0; j < count; j++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			System.out.println(arr[num2] - arr[num1-1]);
			
		}
	}

}
