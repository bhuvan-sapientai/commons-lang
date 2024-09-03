package org.apache.commons.lang3.time;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.Locale;
import java.util.Calendar;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CalendarUtilsSapientGeneratedTest {

    //Sapient generated method id: ${getInstanceTest}, hash: ED755EBD1D0F492736E2D523504FD527
    @Test()
    void getInstanceTest() {
        
        //Act Statement(s)
        CalendarUtils result = CalendarUtils.getInstance();
        
        //Assert statement(s)
        //TODO: Please implement equals method in CalendarUtils for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getInstance1Test}, hash: D1ED19C057492E05970634588BE83907
    @Test()
    void getInstance1Test() {
        //Arrange Statement(s)
        Locale locale = new Locale("language1");
        
        //Act Statement(s)
        CalendarUtils result = CalendarUtils.getInstance(locale);
        
        //Assert statement(s)
        //TODO: Please implement equals method in CalendarUtils for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getDayOfMonthTest}, hash: 33BFD9AA553FE624B07D733F32103B85
    @Test()
    void getDayOfMonthTest() {
        //Arrange Statement(s)
        Calendar calendar = Calendar.getInstance();
        Locale locale = new Locale("language1");
        CalendarUtils target = new CalendarUtils(calendar, locale);
        
        //Act Statement(s)
        int result = target.getDayOfMonth();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(3)));
    }

    //Sapient generated method id: ${getDayOfYearTest}, hash: 89A462CB2E8A6B30E49CEBD5E7663A89
    @Test()
    void getDayOfYearTest() {
        //Arrange Statement(s)
        Calendar calendar = Calendar.getInstance();
        Locale locale = new Locale("language1");
        CalendarUtils target = new CalendarUtils(calendar, locale);
        
        //Act Statement(s)
        int result = target.getDayOfYear();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(247)));
    }

    //Sapient generated method id: ${getMonthTest}, hash: 44F5C16115641A69C66C3C366210B687
    @Test()
    void getMonthTest() {
        //Arrange Statement(s)
        Calendar calendar = Calendar.getInstance();
        Locale locale = new Locale("language1");
        CalendarUtils target = new CalendarUtils(calendar, locale);
        
        //Act Statement(s)
        int result = target.getMonth();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(8)));
    }

    //Sapient generated method id: ${getMonthDisplayNamesWhenDisplayNamesIsNull}, hash: 67976208505CD718CAAC8117AAC3136F
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
        String[] result = target.getMonthDisplayNames(0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getMonthDisplayNamesWhenDisplayNamesIsNotNull}, hash: 0841C4444D731026341117CCC7EB5B1A
    @Test()
    void getMonthDisplayNamesWhenDisplayNamesIsNotNull() {
        /* Branches:
         * (displayNames == null) : false
         */
         //Arrange Statement(s)
        Calendar calendar = Calendar.getInstance();
        Locale locale = new Locale("language1");
        CalendarUtils target = new CalendarUtils(calendar, locale);
        
        //Act Statement(s)
        String[] result = target.getMonthDisplayNames(0);
        String[] stringResultArray = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null };
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
    }

    //Sapient generated method id: ${getStandaloneLongMonthNamesTest}, hash: 63DDFBB6467ACCEA708364F29AEB7589
    @Test()
    void getStandaloneLongMonthNamesTest() {
        //Arrange Statement(s)
        Calendar calendar = Calendar.getInstance();
        Locale locale = new Locale("language1");
        CalendarUtils target = spy(new CalendarUtils(calendar, locale));
        String[] stringArray = new String[] {};
        doReturn(stringArray).when(target).getMonthDisplayNames(32770);
        
        //Act Statement(s)
        String[] result = target.getStandaloneLongMonthNames();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(stringArray));
            verify(target).getMonthDisplayNames(32770);
        });
    }

    //Sapient generated method id: ${getStandaloneShortMonthNamesTest}, hash: 88572C5C1C30D3A361156CF725C2C5AB
    @Test()
    void getStandaloneShortMonthNamesTest() {
        //Arrange Statement(s)
        Calendar calendar = Calendar.getInstance();
        Locale locale = new Locale("language1");
        CalendarUtils target = spy(new CalendarUtils(calendar, locale));
        String[] stringArray = new String[] {};
        doReturn(stringArray).when(target).getMonthDisplayNames(32769);
        
        //Act Statement(s)
        String[] result = target.getStandaloneShortMonthNames();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(stringArray));
            verify(target).getMonthDisplayNames(32769);
        });
    }

    //Sapient generated method id: ${getYearTest}, hash: CA96953FC3E454A2B3B6FD656F2FE03C
    @Test()
    void getYearTest() {
        //Arrange Statement(s)
        Calendar calendar = Calendar.getInstance();
        Locale locale = new Locale("language1");
        CalendarUtils target = new CalendarUtils(calendar, locale);
        
        //Act Statement(s)
        int result = target.getYear();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(2024)));
    }
}
