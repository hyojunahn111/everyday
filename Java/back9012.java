import java.util.*;

public class back9012 {

	public static void main(String[] args) {

		int count;
		
		
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			String blockcount = sc.next();
			char[] charArray = blockcount.toCharArray(); //String을 char 바꿈 -> 한 글자씩 나눠줌
			
			//새로추가
			boolean isVPS = true;
			int a = 0;    //이 변수로 인해 루프 돌 때마다 a가 0으로 초기화됨
			
			for(char ch : charArray) {
				if(ch == '(') {
					a++;    //vps를 비교하기 위해서 증가
				}
				else if(ch== ')') {
					a--;	//vps를 비교하기 위해서 감소
				}
				//else {
					//System.out.println("에러발생");
				//}
				
				if(a < 0) {		//만약 여기서 (보다 )이 많아지게 되버리면 애초에 VPS를 위반하는 것이므로 false를 반환하고 break
					isVPS = false;
					break;
				}
			}
			
			if (a != 0) {	//a가 증가 감소해서 0이 되지 않는다면 VPS를 위반하는 것으로 false반환
				isVPS = false;
			}
			
			if(isVPS) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
	}

}
