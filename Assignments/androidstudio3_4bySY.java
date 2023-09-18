import java.util.*;

public class androidstudio3_4bySY {

	public static void main(String[] args) {
		
		int num = 100;
		
		int arr[][] = new int[3][3];
		
		for(int i =0; i< 3; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = num;
				num += 10;
			}
			
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
