package map;

import java.util.Map;

/**
 * map1, map2에 공통으로 들어있는 키 찾고 그 값의 합을 구하기
 */
public class MapTest1 {

    public static void main(String[] args) {

        // map1 생성
        Map<String, Integer> map1 = Map.of(
                "A", 1
                , "B", 2
                , "C", 3);

        // map2 생성
        Map<String, Integer> map2 = Map.of(
                "B", 4
                , "C", 5
                , "D", 6);

        int answer = map1.keySet().stream()
                .filter(key -> map2.containsKey(key))
                .mapToInt(key -> map1.get(key) + map2.get(key))
                .sum();

        System.out.println(answer);

    }

}
