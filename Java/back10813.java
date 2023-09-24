import java.util.*;

public class back10813 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] baskets = new int[N+1];
        for (int i = 1; i <= N; i++) {
            baskets[i] = i;
        }
        
        for (int i = 0; i < M; i++) {
            int basket1 = sc.nextInt();
            int basket2 = sc.nextInt();

            // 두 바구니의 공을 교환
            int tempBall = baskets[basket1];
            baskets[basket1] = baskets[basket2];
            baskets[basket2] = tempBall;
        }
        
        for (int i=1;i<=N;i++){
            System.out.print(baskets[i]+" ");
        }
	}

}
