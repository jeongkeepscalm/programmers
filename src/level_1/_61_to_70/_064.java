package level_1._61_to_70;

import java.util.HashSet;
import java.util.Set;

/*
    둘만의 암호

    "aukks"	"wbqd"	5	"happy"
 */
public class _064 {
    public static String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        Set<Character> skipSet = new HashSet<>();

        // skip 문자열을 HashSet으로 변환하여 빠른 탐색 가능하도록 설정
        for (char ch : skip.toCharArray()) {
            skipSet.add(ch);
        }

        for (char c : s.toCharArray()) {
            int count = 0;
            char newChar = c;

            while (count < index) {
                newChar++;  // 다음 문자로 이동
                if (newChar > 'z') {  // z를 넘어가면 a로 순환
                    newChar = 'a';
                }
                if (!skipSet.contains(newChar)) {
                    count++;
                }
            }
            sb.append(newChar);
        }

        return sb.toString();
    }


    public static String theBestSolution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (char letter : s.toCharArray()) {
            char temp = letter;
            int idx = 0;
            while (idx < index) {
                temp = temp == 'z' ? 'a' : (char) (temp + 1);
                if (!skip.contains(String.valueOf(temp))) {
                    idx += 1;
                }
            }
            answer.append(temp);
        }

        return answer.toString();
    }
}
