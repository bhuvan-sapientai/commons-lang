package org.apache.commons.lang3.time;

import org.apache.commons.lang3.time.FastDateFormat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.text.FieldPosition;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class FastDateFormatSapientGeneratedTest {

    private FastDateFormat fastDateFormat;

    private TimeZone timeZone;

    private Locale locale;

    @BeforeEach
    void setUp() {
        timeZone = TimeZone.getTimeZone("UTC");
        locale = Locale.US;
        fastDateFormat = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", timeZone, locale);
    }

    @Test
    void testGetInstance() {
        assertNotNull(FastDateFormat.getInstance());
        assertNotNull(FastDateFormat.getInstance("yyyy-MM-dd"));
        assertNotNull(FastDateFormat.getInstance("yyyy-MM-dd", locale));
        assertNotNull(FastDateFormat.getInstance("yyyy-MM-dd", timeZone));
        assertNotNull(FastDateFormat.getInstance("yyyy-MM-dd", timeZone, locale));
    }

    @ParameterizedTest
    @CsvSource({ "SHORT, SHORT", "MEDIUM, MEDIUM", "LONG, LONG", "FULL, FULL" })
    void testGetDateTimeInstance(int dateStyle, int timeStyle) {
        assertNotNull(FastDateFormat.getDateTimeInstance(dateStyle, timeStyle));
        assertNotNull(FastDateFormat.getDateTimeInstance(dateStyle, timeStyle, locale));
        assertNotNull(FastDateFormat.getDateTimeInstance(dateStyle, timeStyle, timeZone));
        assertNotNull(FastDateFormat.getDateTimeInstance(dateStyle, timeStyle, timeZone, locale));
    }

    @ParameterizedTest
    @CsvSource({ "SHORT", "MEDIUM", "LONG", "FULL" })
    void testGetDateInstance(int style) {
        assertNotNull(FastDateFormat.getDateInstance(style));
        assertNotNull(FastDateFormat.getDateInstance(style, locale));
        assertNotNull(FastDateFormat.getDateInstance(style, timeZone));
        assertNotNull(FastDateFormat.getDateInstance(style, timeZone, locale));
    }

    @ParameterizedTest
    @CsvSource({ "SHORT", "MEDIUM", "LONG", "FULL" })
    void testGetTimeInstance(int style) {
        assertNotNull(FastDateFormat.getTimeInstance(style));
        assertNotNull(FastDateFormat.getTimeInstance(style, locale));
        assertNotNull(FastDateFormat.getTimeInstance(style, timeZone));
        assertNotNull(FastDateFormat.getTimeInstance(style, timeZone, locale));
    }

    @Test
    void testFormat() {
        // 2021-01-01 00:00:00 UTC
        Date date = new Date(1609459200000L);
        assertEquals("2021-01-01 00:00:00", fastDateFormat.format(date));
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        calendar.setTime(date);
        assertEquals("2021-01-01 00:00:00", fastDateFormat.format(calendar));
        assertEquals("2021-01-01 00:00:00", fastDateFormat.format(1609459200000L));
    }

    @Test
    void testFormatWithAppendable() {
        // 2021-01-01 00:00:00 UTC
        Date date = new Date(1609459200000L);
        StringBuilder sb = new StringBuilder();
        fastDateFormat.format(date, sb);
        assertEquals("2021-01-01 00:00:00", sb.toString());
    }

    @Test
    void testParse() throws ParseException {
        // 2021-01-01 00:00:00 UTC
        Date expected = new Date(1609459200000L);
        Date actual = fastDateFormat.parse("2021-01-01 00:00:00");
        assertEquals(expected, actual);
    }

    @Test
    void testParseWithPosition() {
        // 2021-01-01 00:00:00 UTC
        Date expected = new Date(1609459200000L);
        ParsePosition pos = new ParsePosition(0);
        Date actual = fastDateFormat.parse("2021-01-01 00:00:00", pos);
        assertEquals(expected, actual);
        assertEquals(19, pos.getIndex());
    }

    @Test
    void testParseWithCalendar() {
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        ParsePosition pos = new ParsePosition(0);
        boolean result = fastDateFormat.parse("2021-01-01 00:00:00", pos, calendar);
        assertTrue(result);
        assertEquals(1609459200000L, calendar.getTimeInMillis());
    }

    @Test
    void testParseObject() {
        ParsePosition pos = new ParsePosition(0);
        Object result = fastDateFormat.parseObject("2021-01-01 00:00:00", pos);
        assertNotNull(result);
        assertTrue(result instanceof Date);
        assertEquals(1609459200000L, ((Date) result).getTime());
    }

    @Test
    void testGetPattern() {
        assertEquals("yyyy-MM-dd HH:mm:ss", fastDateFormat.getPattern());
    }

    @Test
    void testGetTimeZone() {
        assertEquals(timeZone, fastDateFormat.getTimeZone());
    }

    @Test
    void testGetLocale() {
        assertEquals(locale, fastDateFormat.getLocale());
    }

    @Test
    void testGetMaxLengthEstimate() {
        assertTrue(fastDateFormat.getMaxLengthEstimate() > 0);
    }

    @Test
    void testToString() {
        String expected = "FastDateFormat[yyyy-MM-dd HH:mm:ss,en_US,UTC]";
        assertEquals(expected, fastDateFormat.toString());
    }

    @Test
    void testEquals() {
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy-MM-dd", timeZone, locale);
        FastDateFormat format2 = FastDateFormat.getInstance("yyyy-MM-dd", timeZone, locale);
        FastDateFormat format3 = FastDateFormat.getInstance("dd-MM-yyyy", timeZone, locale);
        assertEquals(format1, format2);
        assertNotEquals(format1, format3);
    }

    @Test
    void testHashCode() {
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy-MM-dd", timeZone, locale);
        FastDateFormat format2 = FastDateFormat.getInstance("yyyy-MM-dd", timeZone, locale);
        assertEquals(format1.hashCode(), format2.hashCode());
    }
}
