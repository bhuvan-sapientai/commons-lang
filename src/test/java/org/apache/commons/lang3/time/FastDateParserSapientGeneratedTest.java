package org.apache.commons.lang3.time;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

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
import static org.mockito.Mockito.atLeast;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FastDateParserSapientGeneratedTest {

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Disabled()
    @Test()
    void toStringTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateParser target = new FastDateParser("B", timeZone, locale, date);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("FastDateParser[B, <init>_locale2, A]")));
    }

    //Sapient generated method id: ${d8e7123d-9420-313b-9071-1e789cc094ad}
    @Disabled()
    @Test()
    void toStringAllTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateParser target = new FastDateParser("A", timeZone, locale, date);
        //Act Statement(s)
        String result = target.toStringAll();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("FastDateParser [pattern=A, timeZone=<init>_timeZone1, locale=<init>_locale2, century=0, startYear=2, patterns=[]]")));
    }

    //Sapient generated method id: ${c0e5fd58-457b-3aac-bcde-a4122dfbceb3}
    @Disabled()
    @Test()
    void parseObjectTest() throws ParseException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateParser target = spy(new FastDateParser("pattern1", timeZone, locale, date));
        Date date2 = new Date();
        doReturn(date2).when(target).parse("source1");
        //Act Statement(s)
        Object result = target.parseObject("source1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(date2));
            verify(target).parse("source1");
        });
    }

    //Sapient generated method id: ${5efb0272-0627-3bdf-ad28-2a669a0be555}
    @Disabled()
    @Test()
    void parseWhenDateIsNotNull() throws ParseException {
        /* Branches:
         * (date == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateParser target = spy(new FastDateParser("pattern1", timeZone, locale, date));
        Date date2 = new Date();
        doReturn(date2).when(target).parse(eq("source1"), (ParsePosition) any());
        //Act Statement(s)
        Date result = target.parse("source1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(date2));
            verify(target).parse(eq("source1"), (ParsePosition) any());
        });
    }

    //Sapient generated method id: ${60931dc4-a8fc-3a58-95a9-c89a891fbeb0}
    @Disabled()
    @Test()
    void parseWhenLocaleEqualsJAPANESE_IMPERIALThrowsParseException() throws ParseException {
        /* Branches:
         * (date == null) : true
         * (locale.equals(JAPANESE_IMPERIAL)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateParser target = spy(new FastDateParser("pattern1", timeZone, locale, date));
        doReturn(null).when(target).parse(eq("B"), (ParsePosition) any());
        ParseException parseException = new ParseException("(The <init>_locale2 locale does not support dates before 1868 AD)\nUnparseable date: \"B", -1);
        //Act Statement(s)
        final ParseException result = assertThrows(ParseException.class, () -> {
            target.parse("B");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(parseException.getMessage()));
            verify(target).parse(eq("B"), (ParsePosition) any());
        });
    }

    //Sapient generated method id: ${ae85ff8f-d511-3ae9-9179-85f756ade9e9}
    @Disabled()
    @Test()
    void parseWhenLocaleNotEqualsJAPANESE_IMPERIALThrowsParseException() throws ParseException {
        /* Branches:
         * (date == null) : true
         * (locale.equals(JAPANESE_IMPERIAL)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateParser target = spy(new FastDateParser("pattern1", timeZone, locale, date));
        doReturn(null).when(target).parse(eq("A"), (ParsePosition) any());
        ParseException parseException = new ParseException("Unparseable date: A", -1);
        //Act Statement(s)
        final ParseException result = assertThrows(ParseException.class, () -> {
            target.parse("A");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(parseException.getMessage()));
            verify(target).parse(eq("A"), (ParsePosition) any());
        });
    }

    //Sapient generated method id: ${e35caac3-a282-3f1c-9eaa-1f9a9e879123}
    @Disabled()
    @Test()
    void parseObject1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateParser target = spy(new FastDateParser("pattern1", timeZone, locale, date));
        Date date2 = new Date();
        ParsePosition parsePosition = new ParsePosition(0);
        doReturn(date2).when(target).parse("source1", parsePosition);
        //Act Statement(s)
        Object result = target.parseObject("source1", parsePosition);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(date2));
            verify(target).parse("source1", parsePosition);
        });
    }

    //Sapient generated method id: ${6a5ae078-7d31-32ef-9f0a-7b9db58468ef}
    @Disabled()
    @Test()
    void parse1WhenParseSourcePosCal() {
        /* Branches:
         * (parse(source, pos, cal)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateParser target = spy(new FastDateParser("pattern1", timeZone, locale, date));
        ParsePosition parsePosition = new ParsePosition(0);
        doReturn(true).when(target).parse(eq("source1"), eq(parsePosition), (Calendar) any());
        //Act Statement(s)
        Date result = target.parse("source1", parsePosition);
        Date date2 = new Date();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(date2));
            verify(target).parse(eq("source1"), eq(parsePosition), (Calendar) any());
        });
    }

    //Sapient generated method id: ${0f929c91-7d60-3bf1-b947-5ceb1ebc282d}
    @Disabled()
    @Test()
    void parse1WhenParseNotSourcePosCal() {
        /* Branches:
         * (parse(source, pos, cal)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateParser target = spy(new FastDateParser("pattern1", timeZone, locale, date));
        ParsePosition parsePosition = new ParsePosition(0);
        doReturn(false).when(target).parse(eq("source1"), eq(parsePosition), (Calendar) any());
        //Act Statement(s)
        Date result = target.parse("source1", parsePosition);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(target).parse(eq("source1"), eq(parsePosition), (Calendar) any());
        });
    }

    //Sapient generated method id: ${469f75e2-b797-37c0-8359-e5cec328f5e4}
    @Disabled()
    @Test()
    void parse2WhenStrategyAndWidthStrategyNotParseThisCalendarSourcePosMaxWidth() {
        /* Branches:
         * (lt.hasNext()) : true
         * (!strategyAndWidth.strategy.parse(this, calendar, source, pos, maxWidth)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateParser target = new FastDateParser("pattern1", timeZone, locale, date);
        ParsePosition parsePosition = new ParsePosition(0);
        Calendar calendar = Calendar.getInstance();
        //Act Statement(s)
        boolean result = target.parse("source1", parsePosition, calendar);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${deb41c38-9c9d-3afa-9322-2beddad3266c}
    @Disabled()
    @Test()
    void parse2WhenStrategyAndWidthStrategyParseThisCalendarSourcePosMaxWidth() {
        /* Branches:
         * (lt.hasNext()) : true
         * (!strategyAndWidth.strategy.parse(this, calendar, source, pos, maxWidth)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateParser target = new FastDateParser("pattern1", timeZone, locale, date);
        ParsePosition parsePosition = new ParsePosition(0);
        Calendar calendar = Calendar.getInstance();
        //Act Statement(s)
        boolean result = target.parse("source1", parsePosition, calendar);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }
}
