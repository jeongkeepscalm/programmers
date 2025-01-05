package level_1._51_to_60;
/*
    소수 찾기
 */
public class _055 {

    /**
     * 에라토스테네스의 체 알고리즘 사용
     * 어떤 수 i가 소수인지 판별하려면 i의 제곱근까지만 나눠보면 된다.
     */

    public static int solution(int n) {
        
        int count = 0; // 실행 횟수
        
        if (n < 2) {
            return 0; // 소수가 없음
        }

        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true; // 처음엔 모두 소수라고 가정(0, 1 은 소수가 아니므로 제외)
        }

        for (int i = 2; i * i <= n; i++) { // i의 제곱근까지만 확인
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) { // i의 배수들은 소수가 아님
                    count ++;
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("count = " + count);

        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                answer++; // 소수 카운트
            }
        }

        return answer;
    }


}
