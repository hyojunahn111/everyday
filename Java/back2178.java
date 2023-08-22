import java.util.*;

public class back2178 {

	public static void main(String[] args) {

		int count;
		int score = 0;
		double sum = 0;
		
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		
		int arr[] = new int[count];
		
		for(int i = 0; i < count; i++) {
			score = sc.nextInt();
			arr[i] = score;	
		}
		
		int max = arr[0]; // 배열의 첫 번째 값을 최대값으로 초기 설정

		// 배열을 순회하며 최대값을 찾음
		for(int i = 1; i < count; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i = 0; i < count; i++) {
			sum += (double)arr[i] / max * 100; 
		}
		
		double result = sum / count;
		
		System.out.println(result);
		
		
		
	}

}
