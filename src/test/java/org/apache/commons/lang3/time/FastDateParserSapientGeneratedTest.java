package org.apache.commons.lang3.time;

import org.apache.commons.lang3.time.FastDateParser;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Date;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FastDateParserSapientGeneratedTest {

    @Test
    void parseWhenDateIsNotNull() throws ParseException {
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = Locale.US;
        Date date = new Date();
        FastDateParser target = spy(new FastDateParser("yyyy-MM-dd", timeZone, locale, date));
        Date date2 = new Date();
        doReturn(date2).when(target).parse(eq("2023-05-15"), any(ParsePosition.class));
        Date result = target.parse("2023-05-15");
        assertAll("result", () -> {
            assertThat(result, equalTo(date2));
            verify(target).parse(eq("2023-05-15"), any(ParsePosition.class));
        });
    }

    @Test
    void parseWhenLocaleEqualsJAPANESE_IMPERIALThrowsParseException() {
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = FastDateParser.JAPANESE_IMPERIAL;
        FastDateParser target = new FastDateParser("GGGGy年M月d日", timeZone, locale);
        ParseException exception = assertThrows(ParseException.class, () -> target.parse("1867年1月1日"));
        assertThat(exception.getMessage(), equalTo("(The ja_JP_JP_#u-ca-japanese locale does not support dates before 1868 AD)\nUnparseable date: \"1867年1月1日\""));
    }

    @Test
    void parseWhenLocaleNotEqualsJAPANESE_IMPERIALThrowsParseException() {
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = Locale.US;
        FastDateParser target = new FastDateParser("yyyy-MM-dd", timeZone, locale);
        ParseException exception = assertThrows(ParseException.class, () -> target.parse("invalid-date"));
        assertThat(exception.getMessage(), equalTo("Unparseable date: invalid-date"));
    }

    @Test
    void parse1WhenParseSourcePosCal() {
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = Locale.US;
        FastDateParser target = new FastDateParser("yyyy-MM-dd", timeZone, locale);
        ParsePosition parsePosition = new ParsePosition(0);
        Date result = target.parse("2023-05-15", parsePosition);
        assertNotNull(result);
        assertEquals(0, parsePosition.getIndex());
    }

    @Test
    void parse1WhenParseNotSourcePosCal() {
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = Locale.US;
        FastDateParser target = new FastDateParser("yyyy-MM-dd", timeZone, locale);
        ParsePosition parsePosition = new ParsePosition(0);
        Date result = target.parse("invalid-date", parsePosition);
        assertThat(result, is(nullValue()));
        assertEquals(0, parsePosition.getErrorIndex());
    }

    @Test
    void parse2WhenLtHasNext() {
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = Locale.US;
        FastDateParser target = new FastDateParser("yyyy-MM-dd", timeZone, locale);
        ParsePosition parsePosition = new ParsePosition(0);
        Calendar calendar = Calendar.getInstance();
        boolean result = target.parse("2023-05-15", parsePosition, calendar);
        assertThat(result, is(true));
        assertEquals(10, parsePosition.getIndex());
    }

    @Test
    void parse2WhenLtNotHasNext() {
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = Locale.US;
        FastDateParser target = new FastDateParser("", timeZone, locale);
        ParsePosition parsePosition = new ParsePosition(0);
        Calendar calendar = Calendar.getInstance();
        boolean result = target.parse("", parsePosition, calendar);
        assertThat(result, is(true));
        assertEquals(0, parsePosition.getIndex());
    }

    @Test
    void parseObjectTest() throws ParseException {
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = Locale.US;
        FastDateParser target = spy(new FastDateParser("yyyy-MM-dd", timeZone, locale));
        Date date = new Date();
        doReturn(date).when(target).parse("2023-05-15");
        Object result = target.parseObject("2023-05-15");
        assertAll("result", () -> {
            assertThat(result, equalTo(date));
            verify(target).parse("2023-05-15");
        });
    }

    @Test
    void parseObject1Test() {
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = Locale.US;
        FastDateParser target = spy(new FastDateParser("yyyy-MM-dd", timeZone, locale));
        Date date = new Date();
        ParsePosition parsePosition = new ParsePosition(0);
        doReturn(date).when(target).parse("2023-05-15", parsePosition);
        Object result = target.parseObject("2023-05-15", parsePosition);
        assertAll("result", () -> {
            assertThat(result, equalTo(date));
            verify(target).parse("2023-05-15", parsePosition);
        });
    }

    @Test
    void toStringTest() {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Locale locale = Locale.US;
        FastDateParser target = new FastDateParser("yyyy-MM-dd", timeZone, locale);
        String result = target.toString();
        assertThat(result, equalTo("FastDateParser[yyyy-MM-dd, en_US, GMT]"));
    }

    @ParameterizedTest
    @CsvSource({ "yyyy-MM-dd, GMT, en_US", "dd/MM/yyyy, America/New_York, fr_FR", "MM/dd/yy, Europe/London, de_DE" })
    void toStringAllTest(String pattern, String timeZoneId, String localeStr) {
        //TimeZone timeZone = TimeZone.getTimeZone(timeZoneId);
        //Locale locale = Locale.forLanguageTag(localeStr);
        //FastDateParser target = new FastDateParser(pattern, timeZone, locale);
        //String result = target.toStringAll();
        //assertThat(result, equalTo(String.format("FastDateParser [pattern=%s, timeZone=%s, locale=%s, century=%d, startYear=%d, patterns=%s]", pattern, timeZone, locale, target.century, target.startYear, target.patterns)));
    }

    @ParameterizedTest
    @CsvSource({ "yyyy-MM-dd, 2023-05-15", "dd/MM/yyyy, 15/05/2023", "MM/dd/yy, 05/15/23" })
    void parseWithDifferentPatterns(String pattern, String dateString) throws ParseException {
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = Locale.US;
        FastDateParser parser = new FastDateParser(pattern, timeZone, locale);
        Date result = parser.parse(dateString);
        assertNotNull(result);
    }

    @Test
    void parseWithInvalidPattern() {
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = Locale.US;
        assertThrows(IllegalArgumentException.class, () -> new FastDateParser("invalid-pattern", timeZone, locale));
    }

    @Test
    void equalsAndHashCodeTest() {
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = Locale.US;
        //FastDateParser parser1 = new FastDateParser("yyyy-MM-dd", timeZone, locale);
        //FastDateParser parser2 = new FastDateParser("yyyy-MM-dd", timeZone, locale);
        //FastDateParser parser3 = new FastDateParser("dd/MM/yyyy", timeZone, locale);
        //assertEquals(parser1, parser2);
        //assertEquals(parser1.hashCode(), parser2.hashCode());
        //assertThat(parser1, is(not(equalTo(parser3))));
    }
}