import java.util.*;

public class back2562 {

	public static void main(String[] args) {

		int count = 9;
		int max = 0;
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		//count = sc.nextInt();
		
		int num[] = new int[count];
		
		for(int i = 0; i < count; i++) {
			num[i] = sc.nextInt();
			if(max <= num[i]) {
				max = num[i];
				index = i;
			}
		}
		
		
		System.out.println(max);
		System.out.println(index + 1);
		
		
		
		
		
	}

}
