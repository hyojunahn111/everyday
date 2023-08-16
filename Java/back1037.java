import java.util.Scanner;
import java.util.Arrays;

public class back1037 {

	public static void main(String[] args) {

		int Ncount = 0;
		int tmp;
		
		Scanner sc = new Scanner(System.in);
		
		Ncount = sc.nextInt();
		
		int arr[] = new int[Ncount];
		
		for(int i = 0; i<Ncount; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int j = 0; j < arr.length-1; j++ ) {
            for (int z = j+1; z < arr.length; z++ ) {
                if(arr[z] < arr[j]) {
                    tmp = arr[z];
                    arr[z] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
		
		int firstindex = 0;
		int lastindex = arr.length - 1;
		int result = arr[lastindex] * arr[firstindex];
		
		System.out.println(result);
		
	}

}
