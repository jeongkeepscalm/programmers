package level_1._51_to_60;

import java.util.*;

/*
    모의고사

    1번 수포자가 찍는 방식: 1, 2, 3, 4, 5 ...
    2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5 ...
    3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 ...
 */
public class _053 {

    public static int[] solution(int[] answers) {

        int[] student1Arr = {1, 2, 3, 4, 5};
        int[] student2Arr = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3Arr = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);

        for (int i = 0; i < answers.length; i++) {

            if (student1Arr[i % student1Arr.length] == answers[i]) {
                map.put(1, map.get(1) + 1);
            }
            if (student2Arr[i % student2Arr.length] == answers[i]) {
                map.put(2, map.get(2) + 1);
            }
            if (student3Arr[i % student3Arr.length] == answers[i]) {
                map.put(3, map.get(3) + 1);
            }

        }

        System.out.println("map = " + map);

        ArrayList<Integer> answerList = new ArrayList<>();
        Integer maxScore = Collections.max(map.values());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxScore == entry.getValue()) {
                answerList.add(entry.getKey());
            }
        }

        int[] answer = answerList.stream().mapToInt(i -> i).sorted().toArray();
        System.out.println("answer: " + Arrays.toString(answer));

        return answer;
    }

}
