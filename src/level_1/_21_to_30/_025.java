package level_1._21_to_30;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    < 문자열 내림차순으로 배치하기 >

    문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

    제한 사항
    str은 길이 1 이상인 문자열입니다.
 */
public class _025 {
    public static String solution(String s) {
        Stream<Integer> sorted = s.chars().boxed().sorted(Comparator.reverseOrder());
        String result = sorted.map(i -> String.valueOf((char) i.intValue())).collect(Collectors.joining());
        System.out.println("result = " + result);
        return result;
    }

    public static String theOtherSolution(String str) {
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }
}
