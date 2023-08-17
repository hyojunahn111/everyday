import java.util.Scanner;

public class back2839 {

    public static void main(String[] args) {

        int count;

        Scanner sc = new Scanner(System.in);

        count = sc.nextInt();
        int result = -1;

        int a = count / 5;
        while (a >= 0) {
            int remaining = count - (a * 5);
            if (remaining % 3 == 0) {
                int b = remaining / 3;
                result = a + b;
                break;
            }
            a--;
        }

        System.out.println(result);
    }

}
