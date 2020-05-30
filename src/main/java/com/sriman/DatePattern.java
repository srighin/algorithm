package com.sriman;

public enum DatePattern {
    en_GB("EEEE, d MMMM"),
    en_US("EEEE, MMMM d"),
    ja_JP("MMM/dd (EEE)"),
    th_TH("EEEE, d MMMM");

    private String datePattern;

    DatePattern(String locale) {
        this.datePattern = locale;
    }

    public String getDatePattern() {
        return datePattern;
    }
}

