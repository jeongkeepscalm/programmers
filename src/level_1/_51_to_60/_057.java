package level_1._51_to_60;

import java.util.ArrayList;

/*
    덧칠하기
    총 n칸 존재, m칸 칠 가능, section: 칠해야하는 벽
 */
public class _057 {

    public static int solution(int n, int m, int[] section) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = section[0]; i <= section[section.length - 1]; i++) {
            list.add(i);
        }
        // section 배열의 값이 list 에 있다면 0으로 변경
        for (int value : section) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == value) {
                    list.set(i, 0); // 값 변경
                }
            }
        }

        System.out.println("list = " + list);


        return answer;
    }

}
