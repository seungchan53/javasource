package api.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // 2025-03-13T14:37:25.247676400

        LocalDate date = LocalDate.now();
        System.out.println(date); // 2025-03-13
        System.out.println(date.getYear() + "년도 ");
        System.out.println(date.getMonthValue() + "월 ");
        System.out.println(date.getDayOfMonth() + "일 ");
        System.out.println("+5일 " + date.plusDays(5));
        System.out.println("-2  : " + date.minusMonths(2));
        LocalTime time = LocalTime.now();
        // System.out.println(time); // 14:39:28.062426100
        System.out.println(time.getHour() + "시");
        System.out.println(time.getMinute() + "분");
        System.out.println(time.getSecond() + "초");
        System.out.println("+5시 : " + time.plusHours(0));
    }
}
