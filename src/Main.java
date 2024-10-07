import lv2.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        _001.solution("-4 -3 2 4");
        _002.solution("((((()()))))");
        _003.solution(new int[]{1, 2}, new int[]{3, 4});
        _004.solution("3people unFollowed me");

        _005.solution("01110");
        _006.theBestSolution(15);
        _007.solution(78);

        System.out.println("_008.solution(5) = " + _008.solution(5));

    }
}