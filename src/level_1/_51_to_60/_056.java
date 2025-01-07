package level_1._51_to_60;

import java.util.Arrays;
import java.util.HashSet;

/*
    소수 만들기
 */
public class _056 {

    public static int solution(int[] nums) {
        int answer = 0;

        int length = nums.length;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j) continue;
                for (int k = 0; k < length; k++) {
                    if (i == k || j == k) continue;
                    int numberComputed = nums[i] + nums[j] + nums[k];
                    set.add(numberComputed);
                }
            }
        }


        for (Integer num : set) {
            if (isPrime(num)) answer++;
        }

        return answer;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 1 이하의 숫자는 소수가 아님
        for (int i = 2; i <= Math.sqrt(n); i++) { // 2부터 √n까지 검사
            if (n % i == 0) return false; // 나누어 떨어지면 소수가 아님
        }
        return true; // 나누어 떨어지지 않으면 소수
    }

}
