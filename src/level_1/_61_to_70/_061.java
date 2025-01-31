package level_1._61_to_70;

/*
    [1차] 다트 게임
    - 기회 3번
    - 기회 한 번에 0~10점
    - S D T (1제곱, 2제곱, 3제곱)
    - * (스타상: 해당점수, 직전점수 2배, 스타상과 중첩가능)
    - # (아차상: 해당점수 마이너스, 스타상과 중첩가능: x-2 )

    1S2D*3T	    37	    11 * 2 + 22 * 2 + 33

 */

import java.util.*;
import java.util.regex.*;

public class _061 {
    public static int solution(String dartResult) {
        List<List<String>> parsedList = parseDartResult(dartResult);
        return calculateScore(parsedList);
    }

    private static List<List<String>> parseDartResult(String dartResult) {
        String pattern = "\\d{1,2}[SDT][*#]?";
        Matcher matcher = Pattern.compile(pattern).matcher(dartResult);
//        System.out.println("matcher = " + matcher);

        List<List<String>> parsedList = new ArrayList<>();
        while (matcher.find()) {
            String match = matcher.group();
//            System.out.println("match = " + match);
            Matcher numMatcher = Pattern.compile("(\\d{1,2})([SDT][*#]?)").matcher(match);
            if (numMatcher.matches()) {
                parsedList.add(Arrays.asList(numMatcher.group(1), numMatcher.group(2)));
            }
        }
        return parsedList;
    }

    private static int calculateScore(List<List<String>> parsedList) {
        
        // [0, 0, 0]: size: 3, 값: 0 인 불변 리스트 생성
        List<Integer> result = new ArrayList<>(Collections.nCopies(3, 0));

        for (int i = 0; i < parsedList.size(); i++) {
            int score = Integer.parseInt(parsedList.get(i).get(0));
            String zone = parsedList.get(i).get(1);

            // 보너스 처리
            if (zone.contains("S")) score = (int) Math.pow(score, 1);
            else if (zone.contains("D")) score = (int) Math.pow(score, 2);
            else if (zone.contains("T")) score = (int) Math.pow(score, 3);

            // 옵션 처리
            if (zone.contains("*")) {
                score *= 2;
                if (i > 0) result.set(i - 1, result.get(i - 1) * 2);
            } else if (zone.contains("#")) {
                score *= -1;
            }

            result.set(i, score);
        }

        System.out.println("061: " + result);

        return result.stream().mapToInt(Integer::intValue).sum();
    }

}
