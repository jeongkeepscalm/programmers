package level_1._41_to_50;

import java.util.ArrayDeque;
import java.util.Deque;

/*
    < 카드 뭉치 >
 */
public class _049 {

    public static String solution(String[] cards1, String[] cards2, String[] goal) {

        String answer = "Yes";

        Deque<String> deque1 = new ArrayDeque<>();
        Deque<String> deque2 = new ArrayDeque<>();

        // queue 사용(add, peek, poll)
        for (String card : cards1) {
            deque1.add(card);
        }
        for (String card : cards2) {
            deque2.add(card);
        }
        for (String str : goal) {
            String firstWord1 = deque1.peek();
            String firstWord2 = deque2.peek();
            if (str.equals(firstWord1)) {
                deque1.poll(); // 삭제
            } else if (str.equals(firstWord2)) {
                deque2.poll();
            } else {
                answer = "No";
            }
        }
        System.out.println("049: " + answer);
        return answer;
    }

}
