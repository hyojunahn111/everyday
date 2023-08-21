import java.util.*;

public class back11720 {

	public static void main(String[] args) {

		int count;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		
		String num = sc.next();
		
		for(int i = 0; i < count; i++) {
			
			sum += num.charAt(i) - '0'; //0의 아스키코드 = 48
		}
		
		System.out.println(sum);
		
	}

}
