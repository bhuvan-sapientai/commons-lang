package org.apache.commons.lang3.time;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GmtTimeZoneSapientGeneratedTest {

    //Sapient generated method id: ${e777a41c-5544-3891-9eff-556a5a0f6660}
    @Disabled()
    @Test()
    void getOffsetTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        GmtTimeZone target = new GmtTimeZone(false, 60, 0);
        //Act Statement(s)
        int result = target.getOffset(1, 2021, 9, 1, 3, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${dbf937dc-a5ea-352d-925c-b436f652486a}
    @Disabled()
    @Test()
    void inDaylightTimeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        GmtTimeZone target = new GmtTimeZone(false, 30, 0);
        Date date = new Date();
        //Act Statement(s)
        boolean result = target.inDaylightTime(date);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${4bd0e973-b0be-3ccf-89be-9808c9f0388a}
    @Disabled()
    @Test()
    void setRawOffsetThrowsUnsupportedOperationException() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        GmtTimeZone target = new GmtTimeZone(false, 60, 0);
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.setRawOffset(0);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
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
        GmtTimeZone target = new GmtTimeZone(false, 30, 0);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("[GmtTimeZone id=\"null\",offset=0]")));
    }

    //Sapient generated method id: ${1cf77399-f6fb-3e49-8cd4-2fd2e862ac16}
    @Disabled()
    @Test()
    void useDaylightTimeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        GmtTimeZone target = new GmtTimeZone(false, 30, 0);
        //Act Statement(s)
        boolean result = target.useDaylightTime();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }
}
