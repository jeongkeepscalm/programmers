package level_1._1_to_10;

import java.util.stream.IntStream;

/*
    < 나머지가 1이 되는 수 찾기 >

    자연수 n이 매개변수로 주어집니다.
    n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
    답이 항상 존재함은 증명될 수 있습니다.

    제한사항
    3 ≤ n ≤ 1,000,000
 */
public class _001 {

    public static int solution(int n) {
        int answer =  IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
        System.out.println("answer = " + answer);
        return answer;
    }

    public static int theBestSolution(int n) {
        int answer = 1;
        while (n % answer != 1) {
            answer++;
        }
        return answer;
    }

}
