package org.apache.commons.lang3.time;

import org.apache.commons.lang3.time.DateFormatUtils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.Locale;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Date;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatUtilsSapientGeneratedTest {

    @Test
    void formatWhenCalendarIsNull() {
        Calendar calendar = null;
        assertThrows(NullPointerException.class, () -> DateFormatUtils.format(calendar, "yyyy-MM-dd"));
    }

    @Test
    void formatWhenCalendarIsNotNull() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.JULY, 15);
        String result = DateFormatUtils.format(calendar, "yyyy-MM-dd");
        assertThat(result, equalTo("2023-07-15"));
    }

    @Test
    void format1WhenCalendarIsNull() {
        Calendar calendar = null;
        Locale locale = Locale.US;
        assertThrows(NullPointerException.class, () -> DateFormatUtils.format(calendar, "yyyy-MM-dd", locale));
    }

    @Test
    void format1WhenCalendarIsNotNull() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.JULY, 15);
        Locale locale = Locale.US;
        String result = DateFormatUtils.format(calendar, "yyyy-MM-dd", locale);
        assertThat(result, equalTo("2023-07-15"));
    }

    @Test
    void format2Test() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.JULY, 15);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        String result = DateFormatUtils.format(calendar, "yyyy-MM-dd HH:mm:ss Z", timeZone);
        assertTrue(result.startsWith("2023-07-15") && result.endsWith("+0000"));
    }

    @Test
    void format3Test() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.JULY, 15, 10, 30, 0);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Locale locale = Locale.US;
        String result = DateFormatUtils.format(calendar, "yyyy-MM-dd HH:mm:ss Z", timeZone, locale);
        assertThat(result, equalTo("2023-07-15 10:30:00 +0000"));
    }

    @Test
    void format4Test() {
        // 2023-07-15 10:00:00 GMT
        Date date = new Date(1689418800000L);
        String result = DateFormatUtils.format(date, "yyyy-MM-dd HH:mm:ss");
        assertTrue(result.startsWith("2023-07-15"));
    }

    @Test
    void format5Test() {
        // 2023-07-15 10:00:00 GMT
        Date date = new Date(1689418800000L);
        Locale locale = Locale.US;
        String result = DateFormatUtils.format(date, "EEEE, MMMM d, yyyy", locale);
        assertThat(result, equalTo("Saturday, July 15, 2023"));
    }

    @Test
    void format6Test() {
        // 2023-07-15 10:00:00 GMT
        Date date = new Date(1689418800000L);
        TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
        String result = DateFormatUtils.format(date, "yyyy-MM-dd HH:mm:ss Z", timeZone);
        assertTrue(result.startsWith("2023-07-15") && result.endsWith("-0400"));
    }

    @Test
    void format7Test() {
        // 2023-07-15 10:00:00 GMT
        Date date = new Date(1689418800000L);
        TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
        Locale locale = Locale.US;
        String result = DateFormatUtils.format(date, "EEEE, MMMM d, yyyy HH:mm:ss Z", timeZone, locale);
        assertThat(result, equalTo("Saturday, July 15, 2023 06:00:00 -0400"));
    }

    @ParameterizedTest
    @CsvSource({ "0, yyyy-MM-dd HH:mm:ss, 1970-01-01 00:00:00", "1689418800000, yyyy-MM-dd, 2023-07-15" })
    void format8Test(long millis, String pattern, String expected) {
        String result = DateFormatUtils.format(millis, pattern);
        assertThat(result, equalTo(expected));
    }

    @ParameterizedTest
    @CsvSource({ "0, EEEE MMMM d yyyy, en, Thursday January 1 1970", "1689418800000, EEEE MMMM d yyyy, fr, samedi juillet 15 2023" })
    void format9Test(long millis, String pattern, String language, String expected) {
        Locale locale = new Locale(language);
        String result = DateFormatUtils.format(millis, pattern, locale);
        assertThat(result, equalTo(expected));
    }

    @Test
    void format10Test() {
        // 2023-07-15 10:00:00 GMT
        long millis = 1689418800000L;
        TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
        String result = DateFormatUtils.format(millis, "yyyy-MM-dd HH:mm:ss Z", timeZone);
        assertThat(result, equalTo("2023-07-15 06:00:00 -0400"));
    }

    @Test
    void format11Test() {
        // 2023-07-15 10:00:00 GMT
        long millis = 1689418800000L;
        TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
        Locale locale = Locale.US;
        String result = DateFormatUtils.format(millis, "EEEE, MMMM d, yyyy HH:mm:ss Z", timeZone, locale);
        assertThat(result, equalTo("Saturday, July 15, 2023 06:00:00 -0400"));
    }

    @Test
    void formatUTCTest() {
        // 2023-07-15 10:00:00 GMT
        Date date = new Date(1689418800000L);
        String result = DateFormatUtils.formatUTC(date, "yyyy-MM-dd HH:mm:ss");
        assertThat(result, equalTo("2023-07-15 10:00:00"));
    }

    @Test
    void formatUTC1Test() {
        // 2023-07-15 10:00:00 GMT
        Date date = new Date(1689418800000L);
        Locale locale = Locale.US;
        String result = DateFormatUtils.formatUTC(date, "EEEE, MMMM d, yyyy HH:mm:ss", locale);
        assertThat(result, equalTo("Saturday, July 15, 2023 10:00:00"));
    }

    @Test
    void formatUTC2Test() {
        // 2023-07-15 10:00:00 GMT
        long millis = 1689418800000L;
        String result = DateFormatUtils.formatUTC(millis, "yyyy-MM-dd HH:mm:ss");
        assertThat(result, equalTo("2023-07-15 10:00:00"));
    }

    @Test
    void formatUTC3Test() {
        // 2023-07-15 10:00:00 GMT
        long millis = 1689418800000L;
        Locale locale = Locale.US;
        String result = DateFormatUtils.formatUTC(millis, "EEEE, MMMM d, yyyy HH:mm:ss", locale);
        assertThat(result, equalTo("Saturday, July 15, 2023 10:00:00"));
    }
}
