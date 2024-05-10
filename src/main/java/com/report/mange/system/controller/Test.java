package com.report.mange.system.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static List<LocalDateTime> getEvery15MinutesRecordsToday() {
        List<LocalDateTime> records = new ArrayList<>();
        LocalDateTime startOfDay = LocalDateTime.now().withHour(0).withMinute(0).withSecond(0).withNano(0);
        LocalDateTime currentTime = startOfDay;

        while (currentTime.isBefore(LocalDateTime.now().withHour(23).withMinute(45))) {
            records.add(currentTime);
            currentTime = currentTime.plusMinutes(15);
        }

        return records;
    }

    public static void main(String[] args) {
        List<LocalDateTime> records = getEvery15MinutesRecordsToday();
        for (LocalDateTime record : records) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            System.out.println(record.format(formatter));
        }
    }

//    public static void main(String[] args) {
//        for (int j = 1; j < 17; j++) {
//            LocalDateTime time = LocalDateTime.now();
//            time = time.plusMinutes(j * 15);
//            LocalDateTime lastQuarter = time.truncatedTo(ChronoUnit.HOURS)
//                    .plusMinutes(15 * (time.getMinute() / 15));
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
//            System.out.println(lastQuarter.format(formatter));
//        }
//    }
}
