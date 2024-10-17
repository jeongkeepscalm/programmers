package level_1._1_to_10;

import java.util.Arrays;

/*
    < 자연수 뒤집어 배열로 만들기 >

    자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
    예를 들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
    
    제한 조건
    n은 10,000,000,000이하인 자연수입니다.
 */
public class _008 {
    public static int[] solution(long n) {
        String a = String.valueOf(n);
        int[] answer = new int[a.length()];
        int cnt = 0;
        while (n > 0) {
            answer[cnt] = (int) (n % 10);
            n /= 10;
            cnt++;
        }
        System.out.println("008: " + Arrays.toString(answer));
        return answer;

        /*
            return new StringBuilder().append(n).reverse().chars().map(v -> Character.getNumericValue(v)).toArray();

         */

    }

}
