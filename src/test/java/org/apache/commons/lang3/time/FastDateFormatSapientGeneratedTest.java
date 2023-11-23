package org.apache.commons.lang3.time;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.Calendar;
import java.util.TimeZone;
import java.text.FieldPosition;
import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FastDateFormatSapientGeneratedTest {

    //Sapient generated method id: ${d2023724-fb02-31bf-8f56-c852070520c4}
    @Disabled()
    @Test()
    void formatTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        Object object = new Object();
        StringBuffer stringBuffer = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(0);
        //Act Statement(s)
        StringBuffer result = target.format(object, stringBuffer, fieldPosition);
        StringBuffer stringBuffer2 = new StringBuffer();
        //Assert statement(s)
        //TODO: Please implement equals method in StringBuffer for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(stringBuffer2)));
    }

    //Sapient generated method id: ${ddac4c27-7299-3192-a97f-bb7224671687}
    @Disabled()
    @Test()
    void format1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        //Act Statement(s)
        String result = target.format(1634567890000L);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${9726d1df-62b7-35d6-8c66-49ae903a39b5}
    @Disabled()
    @Test()
    void format2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        Date date2 = new Date();
        //Act Statement(s)
        String result = target.format(date2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${5eccb8d2-1a93-3abf-8fe3-ca5e867cab35}
    @Disabled()
    @Test()
    void format3Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        Calendar calendar = Calendar.getInstance();
        //Act Statement(s)
        String result = target.format(calendar);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${3612aa57-1eb2-3d0d-9cca-fef59552b16f}
    @Disabled()
    @Test()
    void format4Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        StringBuffer stringBuffer = new StringBuffer();
        //Act Statement(s)
        StringBuffer result = target.format(1629876543210L, stringBuffer);
        StringBuffer stringBuffer2 = new StringBuffer();
        //Assert statement(s)
        //TODO: Please implement equals method in StringBuffer for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(stringBuffer2)));
    }

    //Sapient generated method id: ${43fa53a3-cb6a-33e5-9520-348ec399d4da}
    @Disabled()
    @Test()
    void format5Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        Date date2 = new Date();
        StringBuffer stringBuffer = new StringBuffer();
        //Act Statement(s)
        StringBuffer result = target.format(date2, stringBuffer);
        StringBuffer stringBuffer2 = new StringBuffer();
        //Assert statement(s)
        //TODO: Please implement equals method in StringBuffer for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(stringBuffer2)));
    }

    //Sapient generated method id: ${7645e822-384a-31ee-88cb-323c31841239}
    @Disabled()
    @Test()
    void format6Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        Calendar calendar = Calendar.getInstance();
        StringBuffer stringBuffer = new StringBuffer();
        //Act Statement(s)
        StringBuffer result = target.format(calendar, stringBuffer);
        StringBuffer stringBuffer2 = new StringBuffer();
        //Assert statement(s)
        //TODO: Please implement equals method in StringBuffer for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(stringBuffer2)));
    }

    //Sapient generated method id: ${d137a877-9e47-3cf5-8fac-23e9d327b517}
    @Disabled()
    @Test()
    void format7Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        //TODO: Needs initialization with real value
        Appendable appendable = null;
        //Act Statement(s)
        Appendable result = target.format(0L, appendable);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${b056ca0c-67d1-33be-babe-b63e194984f7}
    @Disabled()
    @Test()
    void format8Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        Date date2 = new Date();
        //TODO: Needs initialization with real value
        Appendable appendable = null;
        //Act Statement(s)
        Appendable result = target.format(date2, appendable);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${294e3ade-8c15-3e5d-9773-c21d984450c1}
    @Disabled()
    @Test()
    void format9Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        Calendar calendar = Calendar.getInstance();
        //TODO: Needs initialization with real value
        Appendable appendable = null;
        //Act Statement(s)
        Appendable result = target.format(calendar, appendable);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${3a1fa216-77d7-3552-a886-5cb34f671ab0}
    @Disabled()
    @Test()
    void parseTest() throws ParseException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        //Act Statement(s)
        Date result = target.parse("2022-01-01 12:00:00");
        Date date2 = new Date();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(date2)));
    }

    //Sapient generated method id: ${68933352-f68c-3750-96b1-4ca6ef66b122}
    @Disabled()
    @Test()
    void parse1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        ParsePosition parsePosition = new ParsePosition(0);
        //Act Statement(s)
        Date result = target.parse("2021-01-01 00:00:00", parsePosition);
        Date date2 = new Date();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(date2)));
    }

    //Sapient generated method id: ${697824c6-39c3-3388-ae3b-8ccc0be76864}
    @Disabled()
    @Test()
    void parse2WhenParserParseSourcePosCalendar() {
        /* Branches:
         * (parser.parse(source, pos, calendar)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        ParsePosition parsePosition = new ParsePosition(0);
        Calendar calendar = Calendar.getInstance();
        //Act Statement(s)
        boolean result = target.parse("2022-01-01", parsePosition, calendar);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${e89c27d3-6a1d-348d-ad94-d229bbe424be}
    @Disabled()
    @Test()
    void parse2WhenParserNotParseSourcePosCalendar() {
        /* Branches:
         * (parser.parse(source, pos, calendar)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        ParsePosition parsePosition = new ParsePosition(0);
        Calendar calendar = Calendar.getInstance();
        //Act Statement(s)
        boolean result = target.parse("2022-01-01", parsePosition, calendar);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${c0e5fd58-457b-3aac-bcde-a4122dfbceb3}
    @Disabled()
    @Test()
    void parseObjectTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        ParsePosition parsePosition = new ParsePosition(0);
        //Act Statement(s)
        Object result = target.parseObject("2022-01-01 12:00:00", parsePosition);
        Object object = new Object();
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${0c65633c-01c2-3e06-b2b4-80fe1df1a534}
    @Disabled()
    @Test()
    void getPatternTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        //Act Statement(s)
        String result = target.getPattern();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("pattern1")));
    }

    //Sapient generated method id: ${16a17e32-ea3f-3a2f-a8e6-0b3d09d2eb97}
    @Disabled()
    @Test()
    void getTimeZoneTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        //Act Statement(s)
        TimeZone result = target.getTimeZone();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(timeZone)));
    }

    //Sapient generated method id: ${2e6c6e76-3e52-3c72-9bec-28de0d7d1cce}
    @Disabled()
    @Test()
    void getLocaleTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        //Act Statement(s)
        Locale result = target.getLocale();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(locale)));
    }

    //Sapient generated method id: ${33b767b1-f84d-3c42-8e79-63cba886def1}
    @Disabled()
    @Test()
    void getMaxLengthEstimateTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        //Act Statement(s)
        int result = target.getMaxLengthEstimate();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

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
        FastDateFormat target = new FastDateFormat("A", timeZone, locale, date);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("FastDateFormat[A,<init>_locale1,B]")));
    }

    //Sapient generated method id: ${a1cf6001-b515-3bd6-8ab4-1fd6aefb50e3}
    @Disabled()
    @Test()
    void applyRulesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        Date date = new Date();
        FastDateFormat target = new FastDateFormat("pattern1", timeZone, locale, date);
        Calendar calendar = Calendar.getInstance();
        StringBuffer stringBuffer = new StringBuffer();
        //Act Statement(s)
        StringBuffer result = target.applyRules(calendar, stringBuffer);
        StringBuffer stringBuffer2 = new StringBuffer();
        //Assert statement(s)
        //TODO: Please implement equals method in StringBuffer for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(stringBuffer2)));
    }
}
