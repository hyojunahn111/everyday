import java.util.*;

public class back1920 {

	public static void main(String[] args) {

		int count;
		
		Scanner sc = new Scanner(System.in);
		
		count = sc.nextInt();
		int arr[] = new int[count];
		
		for(int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);  // 배열 정렬
		
		int findcount = sc.nextInt();
		
		for(int j = 0; j < findcount; j++) {
			int find = sc.nextInt();
			int index = Arrays.binarySearch(arr, find);  // 이진 탐색을 통해 값 찾기
			if(index >= 0) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		}
	}
}

