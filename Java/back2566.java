import java.util.Scanner;

public class back2566 {

	public static void main(String[] args) {

		int arr[][] = new int[9][9];
		int max = 0;
		int a = 0, b = 0;

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 9; i++) {
			
			for(int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
				if(max < arr[i][j]) {
					max = arr[i][j];
					a = i;
					b = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println((a + 1) + " " + (b + 1));
		
	}

}
