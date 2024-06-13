package p2;

import java.time.LocalDate;

public class CustomDateOutput {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        int year = currentDate.getYear();

        CustomDayOfWeek dayOfWeek = CustomDayOfWeek.valueOf(currentDate.getDayOfWeek().name());
        CustomMonth currentMonth = CustomMonth.valueOf(currentDate.getMonth().name());

        System.out.println("Day of the week: " + dayOfWeek);
        System.out.println("Month of the year:" + currentMonth);
        System.out.println("Year: " + year);
    }
}
