import java.util.*;

public class back1620 {

	public static void main(String[] args) {

		int allcount;
		int testcount;
		
		Scanner sc = new Scanner(System.in);
		
		allcount = sc.nextInt();
		testcount = sc.nextInt();
		
		Map<String, Integer> map = new HashMap<>();
		String arr[] = new String[allcount + 1];
		
		for(int i = 0; i < allcount; i++) {
			String pkname = sc.next();
			map.put(pkname, i+1);
			arr[i+1] = pkname;
		}
		
		for(int j = 0; j < testcount; j++) {
			if(sc.hasNextInt()) {
				System.out.println(arr[sc.nextInt()]);  //입력 받은 값이 숫자면 배열에서 찾아 출력
			}
			else {
				 System.out.println(map.get(sc.next()));  //입력 받은 값이 문자면 Map에서 찾아 출력
			}
		}
		
		
		
	}

}
