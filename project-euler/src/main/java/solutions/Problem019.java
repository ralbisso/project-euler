package solutions;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Problem019 {

    public int solve() {
        int sundays = 0;
        LocalDate date = LocalDate.of(1901, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2000, Month.DECEMBER, 31);
        while (date.isBefore(end)) {
            date = date.plusMonths(1);
            if (DayOfWeek.SUNDAY.equals(date.getDayOfWeek())) {
                sundays++;
            }
        }
        return sundays;
    }
}
