package level_2;

import level_2._11_to_20.*;
import level_2._1_to_10.*;

public class Main2 {
    public static void main(String[] args) {
        _001.solution("-4 -3 2 4");
        _002.solution("((((()()))))");
        _003.solution(new int[]{1, 2}, new int[]{3, 4});
        _004.solution("3people unFollowed me");
        _005.solution("01110");
        _006.theBestSolution(15);
        _007.solution(78);                                        // binary
        _008.theBestSolution(5);                                    // array(fibonacci)
        _009.theBestSolution("cdcd");                              // stack
        _010.theBestSolution(8,1);
        _011.theBestSolution(5000);                                 // binary
        _012.theBestSolution(new int[]{70, 50, 80, 50}, 100);     // pointer
        _013.solution(new int[]{2, 6, 8, 14});
        _014.solution(2, new String[]{"hello", "one", "even",
                "never", "now", "world", "draw" });
        _015.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3});

        _016.theBestSolution(4);

    }
}
