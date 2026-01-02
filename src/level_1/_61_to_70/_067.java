package level_1._61_to_70;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

/*
    체육복

    n	lost	reserve	return
    5	[2, 4]	[1, 3, 5]	5
    5	[2, 4]	[3]	4
    3	[3]	[1]	2   
 */
public class _067 {

    public static int solution(int n, int[] lost, int[] reserve) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, 1);
        }

        for (int i : reserve) {
            map.put(i, map.get(i) + 1);
        }

        for (int i : lost) {
            map.put(i, map.get(i) - 1);
        }

        for (int i = 1; i <= map.size(); i++) {
            // 체육복이 없으면
            if (map.get(i) == 0) {

                if (map.getOrDefault(i - 1, 0) == 2) {
                    map.put(i - 1, 1);
                    map.put(i, 1);
                } else if (map.getOrDefault(i + 1, 0) == 2) {
                    map.put(i + 1, 1);
                    map.put(i, 1);
                }

            }
        }

        long count = map.entrySet().stream().filter(m -> m.getValue() != 0).count();

        return (int) count;
    }

    public static int solution2(int n, int[] lost, int[] reserve) {

        int[] people = new int[n + 2]; // IndexOutOfBounds Exception 방지
        Arrays.fill(people, 1);

        for (int i : lost) people[i]--;
        for (int i : reserve) people[i]++;

        for (int i = 1; i <= n; i++) {
            if (people[i] == 0) {
                if (people[i - 1] == 2) {
                    people[i - 1]--;
                    people[i]++;
                } else if (people[i + 1] == 2) {
                    people[i + 1]--;
                    people[i]++;
                }
            }
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (people[i] >= 1) answer++;
        }

        return answer;
    }

}
