package org.apache.commons.lang3.time;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.Calendar;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CalendarUtilsSapientGeneratedTest {

    //Sapient generated method id: ${77ba61e1-cd11-3f39-878a-49bd5be97943}
    @Disabled()
    @Test()
    void getInstanceTest() {
        //Act Statement(s)
        CalendarUtils result = CalendarUtils.getInstance();
        Calendar calendar = Calendar.getInstance();
        CalendarUtils calendarUtils = new CalendarUtils(calendar);
        //Assert statement(s)
        //TODO: Please implement equals method in CalendarUtils for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(calendarUtils)));
    }

    //Sapient generated method id: ${a35be099-b7ae-3156-bfa2-0484449c338e}
    @Disabled()
    @Test()
    void getInstance1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Locale locale = new Locale("language1");
        //Act Statement(s)
        CalendarUtils result = CalendarUtils.getInstance(locale);
        Calendar calendar = Calendar.getInstance();
        CalendarUtils calendarUtils = new CalendarUtils(calendar, locale);
        //Assert statement(s)
        //TODO: Please implement equals method in CalendarUtils for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(calendarUtils)));
    }

    //Sapient generated method id: ${764662d3-7059-3dae-9270-f4c89bbd6aeb}
    @Disabled()
    @Test()
    void getDayOfMonthTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Calendar calendar = Calendar.getInstance();
        Locale locale = new Locale("language1");
        CalendarUtils target = new CalendarUtils(calendar, locale);
        //Act Statement(s)
        int result = target.getDayOfMonth();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${98083c0f-64b1-3055-8ae5-27bf54f787b3}
    @Disabled()
    @Test()
    void getDayOfYearTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Calendar calendar = Calendar.getInstance();
        Locale locale = new Locale("language1");
        CalendarUtils target = new CalendarUtils(calendar, locale);
        //Act Statement(s)
        int result = target.getDayOfYear();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${9c38746c-2f2a-3fa8-98aa-5f2be1d4eb62}
    @Disabled()
    @Test()
    void getMonthTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Calendar calendar = Calendar.getInstance();
        Locale locale = new Locale("language1");
        CalendarUtils target = new CalendarUtils(calendar, locale);
        //Act Statement(s)
        int result = target.getMonth();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${d91d30bb-148b-3d3f-b57a-a752ba572954}
    @Disabled()
    @Test()
    void getMonthDisplayNamesWhenDisplayNamesIsNull() {
        /* Branches:
         * (displayNames == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Calendar calendar = Calendar.getInstance();
        Locale locale = new Locale("language1");
        CalendarUtils target = new CalendarUtils(calendar, locale);
        //Act Statement(s)
        String[] result = target.getMonthDisplayNames(-1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${6fcebe98-c7bc-3bcb-888a-0c79fc154fb6}
    @Disabled()
    @Test()
    void getMonthDisplayNamesWhenNotDisplayNamesIsEmpty() {
        /* Branches:
         * (displayNames == null) : false
         * (displayNames.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Calendar calendar = Calendar.getInstance();
        Locale locale = new Locale("language1");
        CalendarUtils target = new CalendarUtils(calendar, locale);
        //Act Statement(s)
        String[] result = target.getMonthDisplayNames(0);
        String[] stringResultArray = new String[]{"resultItem1"};
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
    }

    //Sapient generated method id: ${27f1463f-cb80-3b39-a771-5c996cb366da}
    @Test()
    void getStandaloneLongMonthNamesTest() {
        //Arrange Statement(s)
        Calendar calendar = Calendar.getInstance();
        Locale locale = new Locale("language1");
        CalendarUtils target = spy(new CalendarUtils(calendar, locale));
        String[] stringArray = new String[]{};
        doReturn(stringArray).when(target).getMonthDisplayNames(32770);
        //Act Statement(s)
        String[] result = target.getStandaloneLongMonthNames();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(stringArray));
            verify(target).getMonthDisplayNames(32770);
        });
    }

    //Sapient generated method id: ${467008a1-0afa-3e03-8e51-c4b43cded833}
    @Test()
    void getStandaloneShortMonthNamesTest() {
        //Arrange Statement(s)
        Calendar calendar = Calendar.getInstance();
        Locale locale = new Locale("language1");
        CalendarUtils target = spy(new CalendarUtils(calendar, locale));
        String[] stringArray = new String[]{};
        doReturn(stringArray).when(target).getMonthDisplayNames(32769);
        //Act Statement(s)
        String[] result = target.getStandaloneShortMonthNames();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(stringArray));
            verify(target).getMonthDisplayNames(32769);
        });
    }

    //Sapient generated method id: ${d0a6981f-5f52-3d1d-a9d2-28651f157ea5}
    @Disabled()
    @Test()
    void getYearTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Calendar calendar = Calendar.getInstance();
        Locale locale = new Locale("language1");
        CalendarUtils target = new CalendarUtils(calendar, locale);
        //Act Statement(s)
        int result = target.getYear();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }
}
