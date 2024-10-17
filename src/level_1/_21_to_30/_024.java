package level_1._21_to_30;

import java.util.stream.IntStream;

/*
    < 약수의 개수와 덧셈 >

    두 정수 left와 right가 매개변수로 주어집니다.
    left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
    약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
    
    제한사항
    1 ≤ left ≤ right ≤ 1,000
 */
public class _024 {

    public static int solution(int left, int right) {
        int sum = IntStream.rangeClosed(left, right).map(_024::processDivisor).sum();
        System.out.println("sum = " + sum);
        return sum;
    }

    public static int processDivisor(int num) {
        int count = (int) IntStream.rangeClosed(1, num).filter(n -> num % n == 0).count();
        return count % 2 == 0 ? num : num * -1;
    }

}
