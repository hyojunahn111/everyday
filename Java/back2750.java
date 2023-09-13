import java.util.*;

public class back2750 {

	public static void main(String[] args) {

		int count;
		
		
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < count; i++) {
			int num = sc.nextInt();
			set.add(num);
		}
		
			List<Integer> nodouble = new ArrayList<>(set);
		
			Collections.sort(nodouble); //java 내장함수 오름차순 정렬
		
	        for (Integer num : nodouble) {
	            System.out.println(num);
		}
	        
	        //위 for-each문을 불편 이렇게 나온다
	        
	        //	for (int i = 0; i < listWithoutDuplicates.size(); i++) {
	        //		Integer num = listWithoutDuplicates.get(i);
	        //		System.out.println(num);
	        //	}
	        

	}
}
