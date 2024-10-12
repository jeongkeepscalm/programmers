package level_1;

import java.util.Arrays;

/*
    < 평균 구하기 >

    정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

    제한사항
    arr은 길이 1 이상, 100 이하인 배열입니다.
    arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 */
public class _002 {

    public static double solution(int[] arr) {
        double answer = 0;
        answer = Arrays.stream(arr).average().getAsDouble();
        System.out.println("answer = " + answer);
        return answer;
    }

}
