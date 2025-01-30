package level_1._51_to_60;

import java.util.Arrays;

/*
    [PCCE 기출문제] 9번 / 지폐 접기

    [30, 15]	[26, 17]	1
    [50, 50]	[100, 241]	4
 */
public class _060 {

    public static int solution(int[] wallet, int[] bill) {
        int min = Math.min(minFolds(wallet, bill), minFolds(new int[]{wallet[1], wallet[0]}, bill));
        System.out.println("min = " + min);
        return min;
    }

    private static int minFolds(int[] wallet, int[] bill) {
        int answer = 0;
        int width = bill[0];
        int height = bill[1];

        while (width > wallet[0] || height > wallet[1]) {
            if (width > height) {
                width /= 2;
            } else {
                height /= 2;
            }
            answer++;
        }
        return answer;
    }


    public static int theBestSolution(int[] wallet, int[] bill) {
        int answer = 0;
        while(max(wallet) < max(bill) || min(wallet) < min(bill)) {
            bill[bill[0] > bill[1] ? 0 : 1] /= 2;
            answer++;
        }
        return answer;
    }

    private static int max(int[] arr) {
        return Math.max(arr[0], arr[1]);
    }

    private static int min(int[] arr) {
        return Math.min(arr[0], arr[1]);
    }
}
