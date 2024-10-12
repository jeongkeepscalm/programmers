package level_2;

/*
    < JadenCase 문자열 만들기 >

    JadenCase 란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
    단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
    문자열 s가 주어졌을 때, s를 JadenCase 로 바꾼 문자열을 리턴하는 함수 solution 을 완성해주세요.

    제한 조건
    s는 길이 1 이상 200 이하인 문자열입니다.
    s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
    숫자는 단어의 첫 문자로만 나옵니다.
    숫자로만 이루어진 단어는 없습니다.
    공백문자가 연속해서 나올 수 있습니다.

    "3people unFollowed me" ->	"3people Unfollowed Me"
    "for the last week"	-> "For The Last Week"

 */
public class _004 {

    public static String theBestSolution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        System.out.println("004: " + answer);
        return answer;
    }

    public static String solution(String str) {

        StringBuilder stringBuilder = new StringBuilder();

        // 두번째 매개변수를 음수로 설정하여 모든 공백을 포함하여 나눈다.
        String[] words = str.split(" ", -1);

        for (String word : words) {
            if (word.length() > 0) {
                char firstChar = word.charAt(0);
                // 첫 문자가 알파벳인지 확인한다.
                if (Character.isLetter(firstChar)) {
                    stringBuilder
                            .append(Character.toUpperCase(firstChar))
                            .append(word.substring(1).toLowerCase());
                } else {
                    stringBuilder
                            .append(firstChar)
                            .append(word.substring(1).toLowerCase());
                }
            }
            stringBuilder.append(" ");
        }

        // 제일 마지막 단어에 추가된 공백을 제거한다.
        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }

        System.out.println("004: " + stringBuilder.toString());
        return stringBuilder.toString();
    }

}


