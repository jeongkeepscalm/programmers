package level_1._31_to_40;

import javax.lang.model.SourceVersion;
import java.util.Arrays;

/*
    < 최소 직사각형 >

    명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다.
    다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서, 작아서 들고 다니기 편한 지갑을 만들어야 합니다.
    이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.

    아래 표는 4가지 명함의 가로 길이와 세로 길이를 나타냅니다.
    명함 번호	가로 길이	세로 길이
    1	60	50
    2	30	70
    3	60	30
    4	80	40

    가장 긴 가로 길이와 세로 길이가 각각 80, 70이기 때문에
    80(가로) x 70(세로) 크기의 지갑을 만들면 모든 명함들을 수납할 수 있습니다.
    하지만 2번 명함을 가로로 눕혀 수납한다면 80(가로) x 50(세로) 크기의 지갑으로 모든 명함들을 수납할 수 있습니다.
    이때의 지갑 크기는 4000(=80 x 50)입니다.
 */
public class _037 {

    public static int theBestSolution(int[][] sizes) {
        int width = 0, height = 0;
        for (int[] card : sizes) {
            width = Math.max(width, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        return width * height;
    }

    public static int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
                if (width < temp) {
                    width = temp;
                }
                if (height < sizes[i][1]) {
                    height = sizes[i][1];
                }
            } else {
                if (width < sizes[i][0]) {
                    width = sizes[i][0];
                }
                if (height < sizes[i][1]) {
                    height = sizes[i][1];
                }
            }
            System.out.println(Arrays.toString(sizes[i]));
        }
        return width * height;
    }
}
