package level_1._11_to_20;

import java.util.concurrent.atomic.AtomicInteger;

/*
    < 하샤드 수 >
    
    양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
    예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
    자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution 을 완성해주세요.

    제한 조건
    x는 1 이상, 10000 이하인 정수입니다.
 */
public class _012 {

    public static boolean theBestSolution(int x) {
        int sum = String.valueOf(x).chars().map(c -> c - '0').sum();
        return x % sum == 0;
    }


    public static boolean solution(int x) {
        boolean answer = false;

        AtomicInteger sum = new AtomicInteger();
        String xStr = String.valueOf(x);
        xStr.chars().forEach(c -> {
            sum.addAndGet(Character.getNumericValue(c));
        });

        if (x % Integer.valueOf(String.valueOf(sum)) == 0) answer = true;

        System.out.println("answer = " + answer);
        return answer;
    }

}
