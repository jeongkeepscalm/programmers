package level_1._21_to_30;
/*
    < 수박수박수박수박수박수? >

    길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
    예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

    제한 조건
    n은 길이 10,000이하인 자연수입니다.
 */
public class _022 {

    public static String solution(int n) {
        String word = "수박";
        word = word.repeat(n / 2);
        if (n % 2 != 0) word += "수";
        System.out.println("word = " + word);
        return word;
    }

}
