package com.sriman;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UrlEncoding {

    private static final String UTF_8 = StandardCharsets.UTF_8.name();

    //String searchHotelsUrl = "https://wwwexpediacojp.integration.sb.karmalab.net/mobile/deeplink/Hotel-Search?startDate={0}&endDate={1}&openExternalBrowser=1&locale={2}&destination={3}&adults=3";
    String searchHotelsUrl = "https://expedia.co.jp/mobile/deeplink/Hotel-Search?mode=search&destination={2}&startDate={0}&endDate={1}&rooms=1&adults=2&openExternalBrowser=1&locale={3}";
    String flightSearchUrl = "https://www.expedia.com/mobile/deeplink/Flights-Search?mode=search&leg1=from:{0},to:{1},departure:{2}TANYT&&passengers=adults:1&trip=oneway&brandcid={3}&rfrr={4}&langid={5}";

    public static void main(String[] args) {

        UrlEncoding urlEncoding = new UrlEncoding();
        LocalDate checkinDate = LocalDate.of(2020, 02, 02);
        LocalDate checkoutDate = LocalDate.of(2020, 02, 04);
        String destination = "モントリオール";

        String searchHotelsUrl = urlEncoding.getSearchHotelsUrl(1041, checkinDate, checkoutDate, destination);
        System.out.println(searchHotelsUrl);

    }

    public String getSearchHotelsUrl (int locale, LocalDate checkinDate, LocalDate checkoutDate, String destinationCity) {
        try {

            String dest = URLEncoder.encode(destinationCity, UTF_8);
            String url = MessageFormat.format(searchHotelsUrl,
                    formatDate(checkinDate, DateFormatters.DATEFORMAT_YYYY_MM_DD),
                    formatDate(checkoutDate, DateFormatters.DATEFORMAT_YYYY_MM_DD),
                    dest, locale);
            return url;
        } catch (Exception ex) {
            System.out.println("Failed to create hotelinfo URL.");
        }
        return null;
    }

    public String formatDate(LocalDate inputDate, final DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.format(inputDate);
    }
}
