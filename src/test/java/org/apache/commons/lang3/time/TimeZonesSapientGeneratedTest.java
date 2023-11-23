package org.apache.commons.lang3.time;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.TimeZone;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TimeZonesSapientGeneratedTest {

    //Sapient generated method id: ${0610e4aa-76c2-395b-a3c6-93c5fecc5184}
    @Test()
    void toTimeZoneTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();

        //Act Statement(s)
        TimeZone result = TimeZones.toTimeZone(timeZone);
        TimeZone timeZone2 = TimeZone.getDefault();

        //Assert statement(s)
        //TODO: Please implement equals method in TimeZone for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(timeZone2)));
    }
}
