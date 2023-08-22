import java.util.*;

public class back10811 {

	public static void main(String[] args) {

		int count;
		int change;
		
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		change = sc.nextInt();
		int countarr[] = new int[count];
		
		
		for(int i = 0; i < count; i++) {
			countarr[i] = i+1;
		}
		
		for(int j = 0; j < change; j++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
            // 구간을 기준으로 바구니 뒤집기
            for (int z = 0; z < (b - a + 1) / 2; z++) {
                int tmp = countarr[a - 1 + z];
                countarr[a - 1 + z] = countarr[b - 1 - z];
                countarr[b - 1 - z] = tmp;
            }
		}
		
        for (int i = 0; i < count; i++) {
            System.out.print(countarr[i] + " ");
        }
		
	}

}
