import java.util.*;

public class back2869 {

	public static void main(String[] args) {

		int go;
		int back;
		int reach;
		int daycount = 0;
		
		Scanner sc = new Scanner(System.in);
		go = sc.nextInt();
		back = sc.nextInt();
		reach = sc.nextInt();
		
		// 전체 높이에서 마지막 날 뒤로 미끄러지는 걸 제외한 높이를 계산한다.
		reach -= go;

		// 전체 높이에서 낮 동안 오르는 거리와 미끄러지는 거리 차이를 나눠 며칠이 걸리는지 구한다.
		daycount = reach / (go - back);

		// 나머지가 있는 경우 추가로 하루가 걸린다.
		if (reach % (go - back) > 0) {
			daycount++;
		}

		//마지막날 도달하는 날 (하루)를 더해준다.
		daycount++;
		
		System.out.println(daycount);
		}
	}
