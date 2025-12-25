package level_1._61_to_70;

import java.util.HashMap;

/*
    완주하지 못한 선수

    participant	                    completion	                                return
    ["leo", "kiki", "eden"]	        ["eden", "kiki"]	                        "leo"
    ["marina", "josipa"
    , "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
    ["mislav", "stanko"
    , "mislav", "ana"]	            ["stanko", "ana", "mislav"]	                "mislav"
 */
public class _066 {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0){
                answer = key;
                break;
            }
        }

        // answer = map.keySet().stream().filter(key -> map.get(key) == 1).findFirst().orElse("");

        return answer;
    }

}
