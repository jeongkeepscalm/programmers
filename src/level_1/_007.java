package level_1;
/*
    < 문자열을 정수로 바꾸기 >

    문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

    제한 조건
    s의 길이는 1 이상 5이하입니다.
    s의 맨앞에는 부호(+, -)가 올 수 있습니다.
    s는 부호와 숫자로만 이루어져있습니다.
    s는 "0"으로 시작하지 않습니다.
 */
public class _007 {
    public static int solution(String str) {

        // 부호도 변환해준다.
        return Integer.parseInt(str);

        /*
            int answer = 0;
            boolean isMinus = false;
            if (str.startsWith("-") || str.startsWith("+")) {
                if (str.startsWith("-")) {
                    isMinus = true;
                }
                str = str.substring(1);
            }
            System.out.println("parseInt(str) = " + Integer.parseInt(str));
            answer = Integer.parseInt(str) * 1;
            if (isMinus) {
                answer *= -1;
            }

            return answer;
        */

    }

}
