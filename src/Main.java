import lv2._001;
import lv2._002;
import lv2._003;
import lv2._004;

public class Main {
    public static void main(String[] args) {

        String s1 = _001.solution("-4 -3 2 4");
        System.out.println("s1 = " + s1);

        boolean s2 = _002.solution("((((()()))))");
        System.out.println("s2 = " + s2);

        int s3 = _003.solution(new int[]{1, 2}, new int[]{3, 4});
        System.out.println("s3 = " + s3);

        String s4 = _004.solution("3people unFollowed me");
        System.out.println("s4 = " + s4);

    }
}