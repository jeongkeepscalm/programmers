package level_1._41_to_50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// 폰켓몬
public class _050 {

    public static int theBestSolution(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
    }

    public static int solution(int[] nums) {
        int answer = 0;
        int max_number = nums.length / 2;
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(numList);
        return answer = Math.min(set.size(), max_number);
    }

}
