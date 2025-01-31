package level_1._61_to_70;

import java.util.Arrays;

/*

    로또의 최고 순위와 최저 순위

    1	6개 번호가 모두 일치
    2	5개 번호가 일치
    3	4개 번호가 일치
    4	3개 번호가 일치
    5	2개 번호가 일치
    6   (낙첨) 그 외

    [44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	    [3, 5]
    [0, 0, 0, 0, 0, 0]	    [38, 19, 20, 40, 15, 25]	[1, 6]
    [45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]	    [1, 1]
 */
public class _062 {

    public static int[] solution(int[] lottos, int[] win_nums) {
        int forGettingRank = 7;         // 등수를 계산하는 기준값
        int originalRightCount = 0;     // 0을 제외한 실제 맞춘 개수
        int minRank = 6;                // 최소 순위
        int zeroCount = (int) Arrays.stream(lottos).filter(v -> v == 0).count();  // 0의 개수

        // 실제 당첨된 개수 카운트
        for (int winNum : win_nums) {
            for (int lotto : lottos) {
                if (winNum == lotto) {
                    originalRightCount++;
                    break;
                }
            }
        }

        // 최고 순위와 최저 순위 계산
        int maxRank = Math.min(minRank, forGettingRank - (zeroCount + originalRightCount));
        int minRankResult = Math.min(minRank, forGettingRank - originalRightCount);

        return new int[]{maxRank, minRankResult};
    }

}
