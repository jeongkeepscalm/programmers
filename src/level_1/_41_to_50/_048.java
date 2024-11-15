package level_1._41_to_50;

import java.util.Arrays;
import java.util.HashMap;

/*
    추억 점수
    ["may", "kein", "kain", "radi"]
    [5, 10, 1, 3]
    [["may"],["kein", "deny", "may"], ["kon", "coni"]]

    [5, 15, 0]
 */
public class _048 {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int length = photo.length;
        int[] answer = new int[length];

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            String key = name[i];
            int value = yearning[i];
            map.put(key, value);
        }

        for (int i = 0; i < length; i++) {
            int sum = 0;
            int len = photo[i].length;

            for (int j = 0; j < len; j++) {
                try {
                    String str = photo[i][j];
                    Integer score = map.get(photo[i][j]);
                    sum += score;
                } catch (NullPointerException e) {
                    continue;
                }
            }
            answer[i] = sum;
        }

        System.out.println("048: " + Arrays.toString(answer));
        return answer;
    }
}
