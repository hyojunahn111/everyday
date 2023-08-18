import java.util.*;

public class back28701 {

	public static void main(String[] args) {

		int count;
		int firstsum = 0;
		int thirdsum = 0;
		
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		
		for(int i = 1; i < count + 1; i++) {
			  firstsum += i;
			  thirdsum += i * i * i;
		}
		  System.out.println(firstsum);
		  System.out.println(firstsum * firstsum);
		  System.out.println(thirdsum);
		
	}

}
