import java.util.*;

public class back2751 {

	public static void main(String[] args) {

		int count;
		
		Scanner sc = new Scanner(System.in);
		
		count = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		//int arr[] = new int[count];
		
		for(int i = 0; i < count; i++) {
			int num = sc.nextInt();
			list.add(num);
			//arr[i] = num;
		}
		
		Collections.sort(list);
		//Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		for(int n = 0; n < count; n++) {
			sb.append(list.get(n)).append("\n");
			//System.out.println(list.get(n));
			//System.out.println(arr[n]);
		}
		System.out.println(sb.toString());
	}

}
