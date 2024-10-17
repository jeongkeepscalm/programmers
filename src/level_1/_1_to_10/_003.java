package level_1._1_to_10;

import java.util.Arrays;
import java.util.stream.LongStream;

/*
    < x만큼 간격이 있는 n개의 숫자 >

    함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
    다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

    제한 조건
    x는 -10000000 이상, 10000000 이하인 정수입니다.
    n은 1000 이하인 자연수입니다.
 */
public class _003 {

    public static long[] solution(int x, int n) {
        long[] arr = new long[n];
        arr[0] = x;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + x;
        }
        return arr;
    }

    public static long[] theOtherSolution(int x, int n) {
        // LongStream.iterate(x, i -> i + x):
        //      x 부터 시작하여 현재 값 i에 x를 더한 값을 반환
        long[] array = LongStream.iterate(x, i -> i + x).limit(n).toArray();
        System.out.println("003: " + Arrays.toString(array));
        return array;
    }

}
