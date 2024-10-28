package level_1._41_to_50;

import java.util.Arrays;

/*
    < 비밀 지도 >
 */
public class _046 {

    public static String[] theBestSolution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        System.out.println("046: " + Arrays.toString(result));

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }
        System.out.println("046: " + Arrays.toString(result));

        return result;
    }

    public static String[] solution(int n, int[] array1, int[] array2) {
        String[] answer = new String[n];

        String[] arr1 = Arrays.stream(array1)
                .mapToObj(v -> String.format("%"+n+"s", Integer.toBinaryString(v)).replace(" ", "0"))
                .toArray(String[]::new);
        String[] arr2 = Arrays.stream(array2)
                .mapToObj(v -> String.format("%"+n+"s", Integer.toBinaryString(v)).replace(" ", "0"))
                .toArray(String[]::new);

        for (int i = 0; i < n; i++) {
            String[] split1 = arr1[i].split("");
            String[] split2 = arr2[i].split("");
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ("0".equals(split1[j]) && "0".equals(split2[j])) {
                    sb.append(" ");
                } else {
                    sb.append("#");
                }
            }
            answer[i] = sb.toString();
        }
        System.out.println("answer = " + Arrays.toString(answer));

        return answer;
    }
}
