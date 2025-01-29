package level_1._51_to_60;

import java.util.*;

/*
    실패율
        5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
        4	[4,4,4,4,4]	                [4,1,2,3]
 */
public class _058 {

    public static int[] solution(int N, int[] stages) {
        int[] answer = {};

        Map<Integer, Double> map = new HashMap<>();
        int length = stages.length;

        for (int i = 1; i <= N; i++) {
            int temp = i;
            int count = (int) Arrays.stream(stages).filter(v -> v == temp).count();

            // length 가 0이면 나누기 연산 없이 실패율을 0.0으로 설정
            double probability = (length == 0) ? 0.0 : (double) count / length;
            map.put(i, probability);

            // length 업데이트 (플레이어 수 감소)
            length -= count;
        }

        List<Map.Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> {
            if (!b.getValue().equals(a.getValue())) {
                // 실패율 내림차순 정렬
                return Double.compare(b.getValue(), a.getValue());
            }
            // 스테이지 번호 오름차순 정렬
            return Integer.compare(a.getKey(), b.getKey());
        });

        int[] array = list.stream().map(v -> v.getKey()).mapToInt(v -> v).toArray();
        System.out.println("058: " + Arrays.toString(array));
        answer = array;

        return answer;
    }

}
