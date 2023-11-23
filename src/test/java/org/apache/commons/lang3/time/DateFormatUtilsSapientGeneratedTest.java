package org.apache.commons.lang3.time;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DateFormatUtilsSapientGeneratedTest {

    //Sapient generated method id: ${bd08e1ae-e1ca-313c-aa1b-2e90f6a41325}
    @Disabled()
    @Test()
    void formatWhenCalendarIsNull() {
        /* Branches:
         * (calendar == null) : true  #  inside getTimeZone method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Calendar calendar = null;
        //Act Statement(s)
        String result = DateFormatUtils.format(calendar, "pattern1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${ecbbedb8-1f57-3c49-9a07-2d12056912c8}
    @Disabled()
    @Test()
    void formatWhenCalendarIsNotNull() {
        /* Branches:
         * (calendar == null) : false  #  inside getTimeZone method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Calendar calendar = Calendar.getInstance();
        //Act Statement(s)
        String result = DateFormatUtils.format(calendar, "pattern1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${ab1b7925-605b-31ec-9d40-f2f7365b70fd}
    @Disabled()
    @Test()
    void format1WhenCalendarIsNull() {
        /* Branches:
         * (calendar == null) : true  #  inside getTimeZone method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Calendar calendar = null;
        Locale locale = new Locale("language1");
        //Act Statement(s)
        String result = DateFormatUtils.format(calendar, "pattern1", locale);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${779f5622-1a2b-3b8a-85ef-d26d6a5af506}
    @Disabled()
    @Test()
    void format1WhenCalendarIsNotNull() {
        /* Branches:
         * (calendar == null) : false  #  inside getTimeZone method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Calendar calendar = Calendar.getInstance();
        Locale locale = new Locale("language1");
        //Act Statement(s)
        String result = DateFormatUtils.format(calendar, "pattern1", locale);
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
        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone = TimeZone.getDefault();
        //Act Statement(s)
        String result = DateFormatUtils.format(calendar, "pattern1", timeZone);
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
        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        //Act Statement(s)
        String result = DateFormatUtils.format(calendar, "yyyy-MM-dd HH:mm:ss", timeZone, locale);
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
        Date date = new Date();
        //Act Statement(s)
        String result = DateFormatUtils.format(date, "pattern1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
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
        Date date = new Date();
        Locale locale = new Locale("language1");
        //Act Statement(s)
        String result = DateFormatUtils.format(date, "pattern1", locale);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
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
        Date date = new Date();
        TimeZone timeZone = TimeZone.getDefault();
        //Act Statement(s)
        String result = DateFormatUtils.format(date, "pattern1", timeZone);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
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
        Date date = new Date();
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        //Act Statement(s)
        String result = DateFormatUtils.format(date, "dd MMMM yyyy", timeZone, locale);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${b056ca0c-67d1-33be-babe-b63e194984f7}
    @Disabled()
    @Test()
    void format8Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = DateFormatUtils.format(0L, "pattern1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
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
        Locale locale = new Locale("language1");
        //Act Statement(s)
        String result = DateFormatUtils.format(0L, "pattern1", locale);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${7c88f2f6-4d15-343c-ac61-33f8931b1b13}
    @Disabled()
    @Test()
    void format10Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        //Act Statement(s)
        String result = DateFormatUtils.format(0L, "pattern1", timeZone);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${cf4b1bf8-1cf9-3931-9a68-03cfaddf5093}
    @Disabled()
    @Test()
    void format11Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        //Act Statement(s)
        String result = DateFormatUtils.format(0L, "pattern1", timeZone, locale);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${fd2a93e0-ddf7-3ee1-b079-1d62b344023b}
    @Disabled()
    @Test()
    void formatUTCTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Date date = new Date();
        //Act Statement(s)
        String result = DateFormatUtils.formatUTC(date, "pattern1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${09c7817d-bc11-3beb-ab3e-38a429d25009}
    @Disabled()
    @Test()
    void formatUTC1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Date date = new Date();
        Locale locale = new Locale("language1");
        //Act Statement(s)
        String result = DateFormatUtils.formatUTC(date, "pattern1", locale);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${f20b52ac-8154-32e5-ab70-64a1f7a88540}
    @Disabled()
    @Test()
    void formatUTC2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = DateFormatUtils.formatUTC(0L, "pattern1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${c562ca61-efde-3e78-8dd9-98a96151949a}
    @Disabled()
    @Test()
    void formatUTC3Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Locale locale = new Locale("language1");
        //Act Statement(s)
        String result = DateFormatUtils.formatUTC(0L, "pattern1", locale);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }
}
