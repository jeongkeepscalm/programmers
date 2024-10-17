package level_1._21_to_30;
/*
    < 최대 공약수와 최소 공배수 >

    두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
    배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
    예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

    제한 사항
    두 수는 1이상 1000000이하의 자연수입니다.
 */
public class _030 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        return answer;
    }

    // GCD(Greatest Common Divisor)
    // 최대 공약수: 두 자연수가 공통으로 갖는 약수들 중 가장 큰 값
    public int gcd(int n, int m) {
        // 유클리드 호제법을 사용하여 최대공약수를 계산
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

    // LCM(Least Common Multiple)
    // 최소 공배수: 두 자연수의 배수들 중 공통된 가장 작은 수
    public int lcm(int n, int m) {
        // 두 숫자의 곱을 최대공약수로 나누어 최소공배수를 계산
        return n * m / gcd(n, m);
    }
}
