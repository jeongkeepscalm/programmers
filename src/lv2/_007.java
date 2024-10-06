package lv2;

/*
    
    < 다음 큰 숫자 >
    
    자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.

    조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
    조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
    조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
    예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.

    자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.

    제한 사항
    n은 1,000,000 이하의 자연수 입니다.
 */
public class _007 {

    /*
        문제풀이 순서
        1. 입력받은 매개변수 -> 2진수 변환 (변수저장: 1의 갯수 카운트)
        2. 입력받은 매개변수 += 1 후 2진수 변환하여 1의 갯수 카운트
        3. 변수 저장된 개수와 동일하면 해당 숫자 반환
     */

    public static int solution(int num) {

        int theNumberOfOne = Integer.bitCount(num);

        while (true) {
            int _theNumberOfOne = Integer.bitCount(++num);
            if (theNumberOfOne == _theNumberOfOne) break;
        }

        System.out.println("007: " + num);
        return num;
    }

    // Integer.bitCount() 로 대체
    private static int getTheNumberOfOne(int num) {
        String binaryString = Integer.toBinaryString(num);
        String replacedBinary = binaryString.replaceAll("0", "");
        return replacedBinary.length();
    }

}


