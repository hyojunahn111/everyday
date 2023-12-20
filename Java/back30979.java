import java.util.Scanner;
import java.util.Arrays;

public class back30979 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.nextLine();  // This line is necessary to handle the newline character after input of N

        int[] candy = new int[N];
        for(int i=0; i<N; i++) {
            candy[i] = scanner.nextInt();
        }

        int sumCandy = Arrays.stream(candy).sum();

        if(T <= sumCandy) {
            System.out.println("Padaeng_i Happy");
        } else {
            System.out.println("Padaeng_i Cry");
        }
    }
}
