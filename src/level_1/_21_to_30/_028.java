package level_1._21_to_30;

import java.util.ArrayList;

/*
    < 행렬의 덧셈 >

    행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
    2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

    제한 조건
    행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
 */
public class _028 {

    public static int[][] theBestSolution(int[][] arr1, int[][] arr2) {
        // 크기가 0인 2차원 배열 선언
        int[][] answer = {};
        // answer 는 arr1의 참조 주소값을 바라본다.
        answer = arr1;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            int[] intArray = new int[arr1[i].length];
            for (int j = 0; j < arr1[i].length; j++) {
                intArray[j] = arr1[i][j] + arr2[i][j];
            }
            list.add(intArray);
        }
        int[][] result = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
