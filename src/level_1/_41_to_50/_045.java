package level_1._41_to_50;

public class _045 {
    public static int solution(int give, int get, int own) {
        int remaining = 0;
        int answer = 0;

        while (own > give) {

            answer += (own / give) * get;
            if (own % give != 0) {
                remaining = own % give;
            }
            own /= give;
        }
        if (own + remaining >= give) answer++;

        System.out.println("own = " + own);
        System.out.println("remaining = " + remaining);
        System.out.println("answer = " + answer);
        return answer;
    }
}
