package lv2;

import java.util.Arrays;

/*
    < 이진 변환 반복하기 >

    0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의합니다.

    x의 모든 0을 제거합니다.
    x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.
    예를 들어, x = "0111010"이라면, x에 이진 변환을 가하면 x = "0111010" -> "1111" -> "100" 이 됩니다.

    0과 1로 이루어진 문자열 s가 매개변수로 주어집니다. s가 "1"이 될 때까지 계속해서 s에 이진 변환을 가했을 때,
    이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return 하도록 solution 함수를 완성해주세요.
    return [이진 변환의 횟수, 변환 과정에서 제거된 모든 0의 개수]

    제한사항
    s의 길이는 1 이상 150,000 이하입니다.
    s에는 '1'이 최소 하나 이상 포함되어 있습니다.
 */
public class _005 {

    public int[] theBestSolution(String s) {
        int[] answer = new int[2];
        int temp;
        while( !s.equals("1") ) {
            answer[1] += s.length();
            s = s.replaceAll("0", "");
            temp = s.length();
            s = Integer.toBinaryString(temp);
            //System.out.println("s : " + s );
            answer[0]++;
            answer[1] -= temp;
        }
        return answer;
    }

    public static int[] solution(String str) {

        int[] result = new int[2];
        int theNumberOfExecution = 0;

        while (!"1".equals(str)) {

            int[] intArray = binaryConversion(str);
            int length = intArray[0];
            int countOfZero = intArray[1];

            ++theNumberOfExecution;
            str = Integer.toBinaryString(length);

            result[0] = theNumberOfExecution;
            result[1] += countOfZero;
        }

        System.out.println("005: " + Arrays.toString(result));
        return result;
    }

    public static int[] binaryConversion(String str) {

        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        int countOfZero = 0;
        for (Character c : chars) {
            if (c == '0') {
                countOfZero++;              // '0' 의 갯수를 센다.
            } else if (c == '1'){
                stringBuilder.append(c);    // '1' 을 모두 붙인다.
            }
        }

        // 1로만 이루어진 문자열의 길이를 반환한다.
        int length = stringBuilder.toString().length();
        return new int[]{length, countOfZero};
    }


}