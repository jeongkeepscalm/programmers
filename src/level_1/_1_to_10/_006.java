package level_1._1_to_10;

import java.util.stream.IntStream;

/*
    < 약수의 합 >
    
    정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
    
    제한 사항
    n은 0 이상 3000이하인 정수입니다.
 */
public class _006 {
    public static int solution(int n) {
        int sum = IntStream.range(2, n + 1).filter(v -> n % v == 0).sum();
        System.out.println("006: " + sum);
        return sum;
        /*
            int answer = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    answer += i;
                }
            }
            return answer + num;
        */
    }
}
