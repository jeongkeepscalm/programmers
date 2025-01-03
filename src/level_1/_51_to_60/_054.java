package level_1._51_to_60;

import java.util.Arrays;
import java.util.Comparator;

/*
    과일장수

        3	4	[1, 2, 3, 1, 2, 3, 1]	                8
            [2, 3, 2, 3]: (최저 사과 점수) x (한 상자에 담긴 사과 개수) x (상자의 개수) = 2 x 4 x 1 = 8

        4	3	[4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2]	33
            [1, 1, 2]	1 x 3 = 3
            [2, 2, 2]	2 x 3 = 6
            [4, 4, 4]	4 x 3 = 12
            [4, 4, 4]	4 x 3 = 12
            (1 x 3 x 1) + (2 x 3 x 1) + (4 x 3 x 2) = 33
 */
public class _054 {

    public static int solution(int k, int m, int[] score) {

        int answer = 0;

        int[] sortedArray = Arrays.stream(score)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(v -> v)
                .toArray();

        int arrayCount = sortedArray.length / m;
        int[][] arr = new int[arrayCount][m];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sortedArray[count];
                count++;
            }
            int[] array = Arrays.stream(arr[i]).sorted().toArray();
            arr[i] = array;
        }

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i][0] * m;
        }

        return answer;

    }

    public static int theBestSolution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
    }

}
