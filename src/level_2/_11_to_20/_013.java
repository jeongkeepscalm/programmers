package level_2._11_to_20;

import java.util.Arrays;

/*
    < n개의 최소공배수 >

    두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
    예를 들어 2와 7의 최소공배수는 14가 됩니다.
    정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
    n개의 숫자를 담은 배열 arr 이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution 을 완성해 주세요.

    제한 사항
    arr 은 길이 1이상, 15이하인 배열입니다.
    arr 의 원소는 100 이하인 자연수입니다.
 */
public class _013 {

    public int theBestSolution(int[] arr) {

        Arrays.sort(arr);

        // 배열의 첫 번째 요소를 초기 결과값으로 설정
        int result = arr[0];

        // 배열의 두 번째 요소부터 끝까지 순차적으로 최소공배수를 계산
        for (int i = 1; i < arr.length; i++) {
            result = lcm(result, arr[i]);
        }

        // 최종 계산된 최소공배수를 반환
        System.out.println("013: " + result);
        return result;
    }

    // GCD(Greatest Common Divisor)
    // 최대 공약수: 두 자연수가 공통으로 갖는 약수들 중 가장 큰 값
    public int gcd(int n, int m) {
        // 유클리드 호제법을 사용하여 최대공약수를 계산
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }

    // LCM(Least Common Multiple)
    // 최소 공배수: 두 자연수의 배수들 중 공통된 가장 작은 수
    public int lcm(int n, int m) {
        // 두 숫자의 곱을 최대공약수로 나누어 최소공배수를 계산
        return n * m / gcd(n, m);
    }

    // mine
    public static int solution(int[] arr) {
        Arrays.sort(arr);
        int numToAdd = arr[arr.length - 1];
        int theBiggestNumber = numToAdd;
        while (true) {
            int finalTheBiggestNumber = theBiggestNumber;
            boolean isAllMatched = Arrays.stream(arr).allMatch(num -> finalTheBiggestNumber % num == 0);
            if (isAllMatched) {
                break;
            }
            theBiggestNumber += numToAdd;
        }
        System.out.println("013: " + theBiggestNumber);
        return theBiggestNumber;
    }
}
