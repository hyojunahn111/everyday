import java.util.Scanner;

public class back25304 {

	public static void main(String[] args) {

		int count = 0;
		int total = 0;
		int price = 0;
		int alltotal = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("총 가격을 입력하세요");
		alltotal = sc.nextInt();
		
		//System.out.println("총 개수를 입력하세요");
		count = sc.nextInt();
		
		for(int i = 0; i<count; i++) {
			//System.out.println("값을 입력하세요");
			price = sc.nextInt();
			//System.out.println("개수을 입력하세요");
			num = sc.nextInt();
			
			total += price * num;
		}
		
		if(total == alltotal) {
			System.out.println("Yes");
			//System.out.println(total);
		}
		else
		{
			System.out.println("No");
			//System.out.println(total);
		}
		
	}

}
