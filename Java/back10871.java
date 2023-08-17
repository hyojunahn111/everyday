import java.util.*;

public class back10871 {

	public static void main(String[] args) {

		int count;	
		int lowthenme;
		
		Scanner sc = new Scanner(System.in);
		
		count = sc.nextInt();
		lowthenme = sc.nextInt();
		
		int arr[] = new int[count];
		
		for(int i = 0; i < count; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		for(int j = 0; j < count; j++) {
			if(arr[j] < lowthenme) {
				System.out.print(arr[j] + " ");
			}
		}
		
	}

}
