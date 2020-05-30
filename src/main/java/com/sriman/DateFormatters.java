package com.sriman;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public interface DateFormatters {
        DateTimeFormatter DATEFORMAT_MM_DD_YYYY = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.getDefault());
        DateTimeFormatter DATEFORMAT_YYYY_MM_DD = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.getDefault());
        DateTimeFormatter DATEFORMAT_DD_MM_YYYY = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.getDefault());
        DateTimeFormatter DATEFORMAT_YYYY_M_D = DateTimeFormatter.ofPattern("yyyy-M-d", Locale.getDefault());
        DateTimeFormatter DATEFORMAT_YYY_MM_DD = DateTimeFormatter.ofPattern("yyyy/MM/dd", Locale.getDefault());
}
