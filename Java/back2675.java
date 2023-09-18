import java.util.*;

public class back2675 {

	public static void main(String[] args) {
		
		int count;
		
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		
		
		for(int i = 0; i < count; i++) {
			int seccount = sc.nextInt();
			String engone = sc.next();
			char engchar[] = engone.toCharArray();
			
            for(char c : engchar) {
                for(int j = 0; j < seccount; j++) {
                    System.out.print(c);
                }
            }
            System.out.println();
		}
		
	}

}
