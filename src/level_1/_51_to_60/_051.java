package level_1._51_to_60;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
/*
    < 2016년 >
 */
public class _051 {

    public static String theOtherSolution(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
    }

    private static final int YEAR = 2016;

    public static String solution(int a, int b) {
        String answer = "";
        LocalDate localDate = LocalDate.of(YEAR, a, b);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        String displayName = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US); // Tue
        return answer = displayName.toUpperCase();
    }

}
