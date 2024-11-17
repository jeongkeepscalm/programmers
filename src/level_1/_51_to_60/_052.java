package level_1._51_to_60;

import java.util.Arrays;

/*
    < 기사단원의 무기 >
 */
public class _052 {

    public static int theBestSolution(int number, int limit, int power) {
        int[] count = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
        }
        System.out.println("052: " + Arrays.toString(count));
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }
        return answer;
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int[] intArr = new int[number];
        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    if (j != i / j) {
                        count++;
                    }
                }
            }
            intArr[i - 1] = count;
        }

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] > limit) {
                intArr[i] = power;
            }
        }

        for (int i : intArr) {
            answer += i;
        }

        return answer;
    }
}