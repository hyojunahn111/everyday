	import java.util.*;
	public class back3052 {
	
		public static void main(String[] args) {
	
			int count = 10;
			int result = 0;
			
			Scanner sc = new Scanner(System.in);
			
			int arr[] = new int[count];
			
			for(int i = 0; i < count; i++) {
				int num = sc.nextInt();
				arr[i] = num % 42;
			}
			
			Set<Integer> uniqueSet = new HashSet<>(); //중복을 제거하기 위해 Hashset객체 생성
			
			for(int element : arr) {
				uniqueSet.add(element);
			}
			//위 코드랑 같은 말
//			for(int i = 0; i < arr.length; i++) {
//			    uniqueSet.add(arr[i]);
//			}

			
			Integer[] newArr = uniqueSet.toArray(new Integer[uniqueSet.size()]);
			
			
			System.out.println(newArr.length);
		}
	
	}
