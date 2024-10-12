package level_2;

import java.util.ArrayDeque;
import java.util.Deque;

/*
    < 올바른 괄호 >

    괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다.

    예를 들어
    "()()" 또는 "(())()" 는 올바른 괄호입니다.
    ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
    '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때,
    문자열 s가 올바른 괄호이면 true 를 return 하고,
    올바르지 않은 괄호이면 false 를 return 하는 solution 함수를 완성해 주세요.

    제한사항
    문자열 s의 길이 : 100,000 이하의 자연수
    문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.

 */
public class _002 {

    private static final int MAX_LENGTH = 100_000;

    public static boolean solution(String str) {
        if (str.length() > MAX_LENGTH) return false;
        if (!isValidCharacters(str)) return false;
        System.out.println("002: " + areParenthesesBalanced(str));
        return areParenthesesBalanced(str);
    }

    private static boolean isValidCharacters(String str) {
        return str.chars().allMatch(c -> c == '(' || c == ')');
    }

    private static boolean areParenthesesBalanced(String str) {
        /*
            Deque: Interface
            ArrayDeque: 스택과 큐의 기능을 모두 제공. 성능 우수
         */
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}

