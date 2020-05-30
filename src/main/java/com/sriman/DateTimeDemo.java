package com.sriman;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateTimeDemo {

    public static final String DATE_PATTERN_YYYY_MM_DD = "yyyy/MM/dd";
    public static final String TIME_PATTERN = "hh:mm a";
    public static final String JAPANESE_TIME_PATTERN = "a hh:mm";
    public static DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void main(String[] args) {

        String departureTime = "15:35";
        LocalTime time= LocalTime.parse(departureTime, DateTimeFormatter.ofPattern("H:mm"));
        System.out.println("Time :: "+time);
        String createdLocalizedDate = "2019-12-25";
        LocalDateTime legDeptTime = LocalDateTime.of(LocalDate.parse(createdLocalizedDate, DATEFORMATTER), LocalDateTime.now().toLocalTime());
        String departureDateInString = legDeptTime.format(DateTimeFormatter.ofPattern(DATE_PATTERN_YYYY_MM_DD));

        //System.out.println(departureDateInString);
       // System.out.println(convertDateFormat(createdLocalizedDate));
    }

    private static String convertDateFormat(String date) {
        Date originalDate = null;
        try {
            originalDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat dmyFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dmyFormat.format(originalDate);
    }

    public static Locale getLocaleFromString(String localeString) {
        if (localeString == null) {
            return null;
        }
        return Locale.forLanguageTag(localeString);
    }
}
