package level_1._41_to_50;

import java.util.*;

/*
    < 두 개 뽑아서 더하기 >

    정수 배열 numbers가 주어집니다.
    numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
    배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

    제한사항
    numbers의 길이는 2 이상 100 이하입니다.
    numbers의 모든 수는 0 이상 100 이하입니다.

    [2,1,3,4,1]	-> [2,3,4,5,6,7]
    [5,0,2,7]   -> [2,5,7,9,12]
 */
public class _041 {
    public static int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    int value = numbers[i] + numbers[j];
                    set.add(value);
                }
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
