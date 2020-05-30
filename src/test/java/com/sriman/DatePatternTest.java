package com.sriman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatePatternTest {

    @Test
    public void should() {
        assertEquals(DatePattern.en_GB.getDatePattern(), "EEEE, d MMMM");
        assertEquals(DatePattern.en_US.getDatePattern(), "EEEE, MMMM d");
        assertEquals(DatePattern.ja_JP.getDatePattern(), "MMM/dd (EEE)");
        assertEquals(DatePattern.th_TH.getDatePattern(), "EEEE, d MMMM");
    }
}
