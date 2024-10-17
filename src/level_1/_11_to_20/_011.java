package level_1._11_to_20;
/*
    < 정수 제곱근 판별 >

    임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
    n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

    제한 사항
    n은 1이상, 50000000000000 이하인 양의 정수입니다.
 */
public class _011 {

    public static long theBestSolution(long n) {
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
        return -1;
    }

    public static long solution(long n) {

        double sqrt = Math.sqrt(n);
        String sqrtString = String.valueOf(sqrt);

        if (!sqrtString.endsWith(".0")) return -1;

        long pow = (long) Math.pow((long) (sqrt + 1), 2);
        System.out.println("011: " + pow);
        return pow;

    }

}
