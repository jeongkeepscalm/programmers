package level_1._41_to_50;

/*
    < 콜라 문제 >
 */
public class _045 {
    public static int theOtherSolution(int give, int get, int own) {
        int answer = 0;
        while (own / give > 0) {
            answer += (own / give) * get;
            own = ((own / give) * get) + (own % give);
        }
        return answer;
    }
}
