import java.util.*;

public class back28691 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char chword = word.charAt(0);
		
		if(chword == ('M')) {
			System.out.println("MatKor");
		}
		else if(chword == ('W')) {
			System.out.println("WiCys");
		}
		else if(chword == ('C')) {
			System.out.println("CyKor");
		}
		else if(chword == ('A')) {
			System.out.println("AlKor");
		}
		else if(chword == ('$')) {
			System.out.println("$clear");
		}
	}

}
