package level_1._31_to_40;

import java.util.List;
import java.util.stream.Collectors;

/*
    < 시저 암호 >

    어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
    예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다.
    "z"는 1만큼 밀면 "a"가 됩니다.
    문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

    제한 조건
    공백은 아무리 밀어도 공백입니다.
    s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
    s의 길이는 8000이하입니다.
    n은 1 이상, 25이하인 자연수입니다.
 */
public class _038 {

    public static String theBestSolution(String s, int n) {
        String result = "";
        n = n % 26;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            result += ch;
        }
        System.out.println("038: " + result);
        return result;
    }

    public static String solution(String s, int n) {

        List<Integer> list = s.chars()
                .map(v -> {
                    if (65 <= v && v <= 90) {
                        if (v + n > 90) {
                            v = 65 + (v + n - 1 - 90);
                        } else {
                            v = v + n;
                        }
                    }
                    if (97 <= v && v <= 122) {
                        if (v + n > 122) {
                            v = 97 + (v + n - 1 - 122);
                        } else {
                            v = v + n;
                        }
                    }
                    return v;
                })
                .boxed().collect(Collectors.toList());
        String answer = list.stream()
                .map(Character::toString)
                .collect(Collectors.joining(""));
        System.out.println("038: " + answer);
        return answer;
    }
}
