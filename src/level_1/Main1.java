package level_1;

import level_1._11_to_20.*;
import level_1._1_to_10.*;
import level_1._21_to_30.*;
import level_1._31_to_40.*;
import level_1._41_to_50.*;
import level_1._51_to_60._051;
import level_1._51_to_60._052;
import level_1._51_to_60._053;
import level_1._51_to_60._054;

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
        _045.theOtherSolution(3, 1, 20);          // * 콜라 문제
        _046.theBestSolution(6                                  // Binary
                , new int[]{46, 33, 33 ,22, 31, 50}
                , new int[]{27 ,56, 19, 14, 14, 10});
        _047.theBestSolution(4
                , new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000});
        _049.solution(new String[]{"i", "drink", "water"}       // Deque
                , new String[]{"want", "to"}
                , new String[]{"i", "want", "to", "drink", "water"});
        _050.theBestSolution(new int[]{1, 2, 3, 2});            // stream

        _051.theOtherSolution(5, 24);                     // 요일 구하기
        _052.theBestSolution(10, 3, 2);      // 약수의 갯수 구하기

        _053.solution(new int[]{1,2,3,4,5});
        _054.theBestSolution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});


    }

}
