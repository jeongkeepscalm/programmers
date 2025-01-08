package level_1._51_to_60;

import java.util.Arrays;
import java.util.HashSet;

/*
    소수 만들기
 */
public class _056 {

    public static int theBestSolution(int[] nums) {
        int answer = 0;
        int length = nums.length;

        // 모든 서로 다른 3개 조합에 대해 처리
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    int numberComputed = nums[i] + nums[j] + nums[k];
                    if (isPrime(numberComputed)) {
                        answer++;
                    }
                }
            }
        }

        System.out.println("056: " + answer);

        return answer;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
