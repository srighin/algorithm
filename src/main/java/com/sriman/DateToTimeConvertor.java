package com.sriman;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateToTimeConvertor {

    public static final ZoneId PST_ZONE = ZoneId.of("America/Los_Angeles");

    public static void main(String[] args) {

        String makeTimestampFilterForBookingNotification = makeTimestampFilterForBookingNotification(2019, 8, 01);
        System.out.println(makeTimestampFilterForBookingNotification);

    }

    private static String makeTimestampFilterForBookingNotification(Integer year, Integer month, Integer day) {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(year, month, day, 0, 0, 0, 0, PST_ZONE);
        long startOfDay = zonedDateTime.toInstant().toEpochMilli();

        String timestampMatch = "createdTimeStamp: " + startOfDay;
        return timestampMatch;
    }
}
