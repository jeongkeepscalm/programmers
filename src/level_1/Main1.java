package level_1;

import level_1._11_to_20.*;
import level_1._1_to_10.*;
import level_1._21_to_30.*;
import level_1._31_to_40.*;
import level_1._41_to_50.*;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        _003.theOtherSolution(4, 3);                     // stream
        _005.theBestSolution(123);                          // while
        _006.solution(5);                                   // stream
        _008.solution(12345);                               // StringBuilder
        _009.solution("pPoooyY");                           // stream
        _010.theBestSolution(118372);                       // StringBuilder
        _012.theBestSolution(13);                           // char - 0
        _013.theOtherSolution(5, 3);                     // for (삼항 연산자)
        _014.theBestSolution
                (new String[]{"Jane", "Kim"});
        _015.solution(626331);                          // 삼항 연산자
        _019.theBestSolution(new int[]{4, 3, 2, 1});           // stream
        _020.solution("00000001234");
        _021.theBestSolution
                (new int[]{-1, 0, 1}, new int[]{1, 0, -1});     // stream
        _023.theBestSolution("qwer");
        _025.theOtherSolution("Zbcdefg");                   // basic
        _027.theBestSolution("0a123");                       // exception
        _028.theBestSolution(new int[][]{{1, 2}, {2, 3}}        // array basic
                , new int[][]{{3, 4}, {5, 6}});
        _032.theBestSolution(new int[]{2,2,3,3}, 10);
        _034.solution("3141592", "271");
        _035.theBestSolution("try hello world");
        _037.theBestSolution(new int[][]                        // math.max
                {{10, 7}, {12, 3}, {8, 15}
                        , {14, 7}, {5, 15}});
        _038.solution("a B z", 4);                        // stream
        _038.theBestSolution("a B z", 4);                 // char
        _039.theBestSolution("banana");                      // map
        _041.solution(new int[]{2, 1, 3, 4, 1});                // stream
        _042.solution(new int[]{1, 5, 2, 6, 3, 7, 4}            // System.arraycopy() || Arrays.copyOfRange()
                , new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        _044.theOtherSolution(new String[]                      // ★ comparator
                {"dfs", "abc", "axx"}, 0);

        _045.solution(2, 1, 20);
    }
}
