/*
Спроектируйте и разработайте метод, определяющий, сколько времени прошло с заданной даты.
С помощью этого методы выведите в консоль, сколько времени прошло с вашего дня рождения в удобном для восприятия виде,
например: «Вам исполнилось 20 лет, 3 месяца, 18 дней, 4 часа, 5 минут и 10 секунд».
*/
package task04_02;

import java.time.LocalDateTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        String textTimeFrom = getTimeFrom(1985, 5, 15);
        System.out.println(textTimeFrom);
    }

    private static String getTimeFrom(int year, int month, int day) {
        String textData = "";

        LocalDateTime bData = LocalDateTime.of(year, month, day, 0, 0, 0);
        LocalDateTime nData = LocalDateTime.now();

        Period period = Period.between(bData.toLocalDate(), nData.toLocalDate());

        textData = String.format("%d year, %d month, %d day, %d hour, %d min",
                period.getYears(), period.getMonths(), period.getDays(),
                nData.getHour() - bData.getHour(),
                nData.getMinute() - bData.getMinute());

        return textData;
    }
}