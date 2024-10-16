package level_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    < 제일 작은 수 제거하기 >

    정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수,
    solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
    예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

    제한 조건
    arr 은 길이 1 이상인 배열입니다.
    인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
 */
public class _019 {

    public static int[] theBestSolution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        int minimum = Arrays.stream(arr).min().getAsInt();
        int[] array = Arrays.stream(arr).filter(v -> v != minimum).toArray();
        System.out.println("array = " + Arrays.toString(array));
        return array;
    }

    public static int[] solution(int[] arr) {

        if (arr.length == 1) return new int[]{-1};

        int minimum = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (minimum > arr[i]) {
                minimum = arr[i];
                index = i;
            }
        }

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.remove(index);
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}
