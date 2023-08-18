import java.util.*;

public class back5597 {

	public static void main(String[] args) {

		int classcount = 30;
		int index[] = new int [classcount + 1];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < classcount - 2; i++) {
			int someclass = sc.nextInt();
			index[someclass] = 1;
		}
		
		for(int i = 1; i <= classcount; i++) {
			if(index[i] == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
