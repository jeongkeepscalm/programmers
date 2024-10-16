package level_1;
/*
    < 가운데 글자 가져오기 >

    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
    단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

    재한사항
    s는 길이가 1 이상, 100이하인 스트링입니다.
 */
public class _023 {
    public static String theBestSolution(String word) {
        return word.substring((word.length()-1)/2, word.length()/2 + 1);
    }

    public static String solution(String s) {
        String answer = "";
        int length = s.length();
        int middleIndex = length / 2;

        answer = length % 2 == 0
                ? s.substring(middleIndex - 1, middleIndex + 1)
                : s.substring(middleIndex, middleIndex + 1);

        System.out.println("answer = " + answer);
        return answer;
    }


}
