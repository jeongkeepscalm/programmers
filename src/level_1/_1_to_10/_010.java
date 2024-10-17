package level_1._1_to_10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/*
    < 정수 내림차순으로 배치하기 >

    함수 solution은 정수 n을 매개변수로 입력받습니다.
    n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
    예를들어 n이 118372면 873211을 리턴하면 됩니다.

    제한 조건
    n은 1이상 8000000000 이하인 자연수입니다.
 */
public class _010 {

    public static String res = "";
    public static long theBestSolution(long n) {
        IntStream chars = String.valueOf(n).chars();
        res = "";
        chars.sorted().forEach(c -> {
            res = Character.valueOf((char) c) + res;
        });
        System.out.println("010: " + res);
        return Long.parseLong(res);
    }

    public static long theOtherSolution(long n) {

        String[] stringArray = String.valueOf(n).split("");
        Arrays.sort(stringArray);

        StringBuilder sb = new StringBuilder();
        for (String str : stringArray) {
            sb.append(str);
        }
        String reversedString = sb.reverse().toString();
        System.out.println("010: " + reversedString);
        return Long.parseLong(reversedString);
    }

    // mine
    public static long solution(long n) {

        long answer = 0;
        int length = String.valueOf(n).length();
        long[] arr = new long[length];
        int idx = 0;

        // complete arr
        while (n > 0) {
            arr[idx] = n % 10;
            n /= 10;
            idx++;
        }

        // sort desc
        long[] reversedArr = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToLong(v -> v)
                .toArray();

        // long -> String
        String reducedString = Arrays.stream(reversedArr)
                .mapToObj(String::valueOf)
                .reduce("", (a, b) -> a + b);
        answer = Long.valueOf(reducedString);

        return answer;
    }

}
