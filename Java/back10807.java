import java.util.Scanner;

public class back10807 {

	public static void main(String[] args) {

		int count;
		
		Scanner sc = new Scanner(System.in);
		
		count = sc.nextInt();
		int arr[] = new int[count];
		
		for(int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}
		
		int vcount = sc.nextInt();
		int resultcount = 0;
		
		for(int j = 0; j < count; j++) {
			if(arr[j] == vcount) {
				resultcount++;
			}
		}
		System.out.println(resultcount);
	}

}
