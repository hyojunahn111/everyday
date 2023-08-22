import java.util.*;

public class back1157 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.next().toUpperCase(); // 입력된 단어를 대문자로 변환
        char newword[] = word.toCharArray();

        // HashMap 객체 생성후 알파벳 빈도 저장
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : newword) {
            int count = freqMap.getOrDefault(ch, 0); // 알파벳 빈도 가져오거나 기본값 0 할당
            freqMap.put(ch, count + 1); // 알파벳 빈도 증가
        }
//		  위에 for문을 풀면 이렇게 됨
//        for (int i = 0; i < newword.length; i++) {
//        char ch = newword[i]; // i 번째 인덱스의 문자 가져오기
//        int count;
//        if (freqMap.containsKey(ch)) { // 알파벳 ch가 키로 포함된 경우
//            count = freqMap.get(ch); // ch 알파벳에 해당하는 빈도 수 가져오기
//        } else { // 알파벳 ch가 키로 포함되지 않은 경우
//            count = 0; // 기본값 0 할당하기
//        }
//        freqMap.put(ch, count + 1); // 알파벳 빈도 증가
//    }
        
        
        // 최빈값 찾기
        int maxFreq = 0;
        char mostFrequent = '?';
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFrequent = entry.getKey();
            } else if (entry.getValue() == maxFreq) {
                mostFrequent = '?';
            }
        }

        // 결과 출력
        System.out.println(mostFrequent);
    }
}
