package level_1._61_to_70;

/*
    [PCCE 기출문제] 9번 / 이웃한 칸

    board	                                h	w	result
    [["blue", "red", "orange", "red"]
    , ["red", "red", "blue", "orange"]
    , ["blue", "orange", "red", "red"]
    , ["orange", "orange", "red", "blue"]]	1	1	2

    [["yellow", "green", "blue"]
    , ["blue", "green", "yellow"]
    , ["yellow", "blue", "blue"]]	        0	1	1
 */
public class _065 {
    public static int solution(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;

        // 오른쪽, 왼쪽, 위, 아래
        int[] dh = new int[]{0, 0,  1, -1};
        int[] dw = new int[]{1, -1, 0, 0};

        for (int i = 0; i < 4; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            if (h_check >= 0 && h_check < n && w_check >= 0  && w_check < n) {
                if (board[h][w].equals(board[h_check][w_check])) {
                    count++;
                }
            }
        }

        System.out.println("065: " + count);
        return count;
    }
}
