package level_1._51_to_60;

import java.util.ArrayList;

/*
    덧칠하기
    총 n칸 존재, m칸 칠 가능, section: 칠해야하는 벽
    8	4	[2, 3, 6]	2
 */
public class _057 {

    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        for (int i = 0; i < section.length; i++) {
            if (section[i] != 0) {
                int max = section[i] + m - 1;
                for (int j = 0; j < section.length; j++) {
                    if (section[j] <= max) {
                        section[j] = 0;
                    }
                }
                answer++;
            }
        }
        return answer;
    }

    public static int theOtherSolution(int n, int m, int[] section) {
        int roller = section[0];
        int cnt = 1;
        for(int i = 1; i < section.length; i++) {
            if(roller + m - 1 < section[i]) {
                cnt++;
                roller = section[i];
            }
        }
        return cnt;
    }


    public static int theOtherSolution2(int n, int m, int[] section) {
        int maxPainted = 0, cntPaint = 0;
        for (int point : section) {
            if (maxPainted <= point) {
                maxPainted = point + m;
                cntPaint++;
            }
        }
        return cntPaint;
    }

}
