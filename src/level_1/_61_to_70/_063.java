package level_1._61_to_70;

import java.util.ArrayList;

/*
    문자열 나누기
    "ba na na"	            3
    "ab ra ca da br a"	    6
    "aaabbacc ccab ba"	    3
 */
public class _063 {

    public static int solution(String s) {
        int answer = 0;
        String[] split = s.split("");
        String firstLetter = split[0];
        int countA = 0, countB = 0;

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(firstLetter)) {
                countA++;
            } else {
                countB++;
            }
            if (countA == countB || i == split.length-1) {
                answer++;
                countA = 0;
                countB = 0;
                if (i != split.length - 1) {
                    firstLetter = split[i + 1];
                }
            }
        }
        return answer;
    }

    public static int theBestSolution(String s) {
        char prev = '1';
        int same = 0, different = 0, answer = 0;
        for (char c : s.toCharArray()) {
            if (prev == '1') {
                prev = c;
                same++;
                answer++;
            } else if (prev == c) {
                same++;
            } else {
                different++;
            }

            if (same == different) {
                prev = '1';
                same = 0; different = 0;
            }
        }

        return answer;
    }

}
