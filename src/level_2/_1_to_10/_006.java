package level_2._1_to_10;

/*
    < 숫자의 표현 >
    
    Finn 은 요즘 수학공부에 빠져 있습니다.
    수학 공부를 하던 Finn 은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다.
    예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.

    1 + 2 + 3 + 4 + 5 = 15
    4 + 5 + 6 = 15
    7 + 8 = 15
    15 = 15
    자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return 하는 solution 를 완성해주세요.

    제한사항
    n은 10,000 이하의 자연수 입니다.

 */
public class _006 {

    public static int theBestSolution(int num) {

        /**
         * 정수론 정리
         * 주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수
         *  == 주어진 수의 홀수 약수의 개수
         */

        int answer = 0;
        for (int i = 1; i <= num; i += 2)
            if (num % i == 0) answer++;

        System.out.println("006: " + answer);
        return answer;
    }

}
