package level_1._41_to_50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
    < 문자열 내 마음대로 정렬하기 >

    문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
    예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

    제한 조건
    strings는 길이 1 이상, 50이하인 배열입니다.
    strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
    strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
    모든 strings의 원소의 길이는 n보다 큽니다.
    인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.

    ["sun", "bed", "car"]	1	-> ["car", "bed", "sun"]
    ["abce", "abcd", "cdx"]	2	-> ["abcd", "abce", "cdx"]
 */
public class _044 {

    public static String[] theOtherSolution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) > o2.charAt(n)) return 1;
                else if (o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
                else return -1;
            }
        });
        return strings;
    }

    public String[] theBestSolution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        arr.sort(null);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }


    public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        Arrays.sort(strings);
        System.out.println("strings = " + Arrays.toString(strings));

        for (int j = 0; j < strings.length; j++) {
            for (int i = strings.length - 1; i > 0; i--) {
                String str1 = strings[i];
                String str2 = strings[i-1];
                char c1 = str1.charAt(n);
                char c2 = str2.charAt(n);
                if (c1 < c2) {
                    String temp = strings[i];
                    strings[i] = strings[i-1];
                    strings[i-1] = temp;
                }
            }
        }
        System.out.println("answer = " + Arrays.toString(strings));
        return strings;

    }

}
