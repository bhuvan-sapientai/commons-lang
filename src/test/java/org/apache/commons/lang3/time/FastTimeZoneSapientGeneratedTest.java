package org.apache.commons.lang3.time;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.util.TimeZone;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FastTimeZoneSapientGeneratedTest {

    //Sapient generated method id: ${85c7bcbf-13b8-3a4b-9beb-9c19cc341c8d}
    @Test()
    void getGmtTimeZoneTest() {
        //Act Statement(s)
        TimeZone result = FastTimeZone.getGmtTimeZone();
        GmtTimeZone gmtTimeZone = new GmtTimeZone(false, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(gmtTimeZone)));
    }

    //Sapient generated method id: ${5638854b-6541-30b8-8a34-167f1facedce}
    @Test()
    void getGmtTimeZone1WhenUTCEqualsPattern() {
        /* Branches:
         * ("Z".equals(pattern)) : false
         * ("UTC".equals(pattern)) : true
         */
        //Act Statement(s)
        TimeZone result = FastTimeZone.getGmtTimeZone("UTC");
        GmtTimeZone gmtTimeZone = new GmtTimeZone(false, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(gmtTimeZone)));
    }

    //Sapient generated method id: ${9c990b6a-94d3-3f2e-a43f-f2c78ef5d564}
    @Test()
    void getGmtTimeZone1WhenMNotMatches() {
        /* Branches:
         * ("Z".equals(pattern)) : false
         * ("UTC".equals(pattern)) : false
         * (m.matches()) : false
         */
        //Act Statement(s)
        TimeZone result = FastTimeZone.getGmtTimeZone("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${ec2ec15d-974f-32c7-bf89-a69407057b5c}
    @Disabled()
    @Test()
    void getGmtTimeZone1WhenHoursEquals0AndMinutesEquals0() {
        /* Branches:
         * ("Z".equals(pattern)) : false
         * ("UTC".equals(pattern)) : false
         * (m.matches()) : true
         * (group != null) : false  #  inside parseInt method
         * (hours == 0) : true
         * (minutes == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        TimeZone result = FastTimeZone.getGmtTimeZone("pattern1");
        GmtTimeZone gmtTimeZone = new GmtTimeZone(false, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(gmtTimeZone)));
    }

    //Sapient generated method id: ${95793e51-1805-3ecc-917a-471c4660cba6}
    @Disabled()
    @Test()
    void getGmtTimeZone1WhenGroupCharAt0Equals___() {
        /* Branches:
         * ("Z".equals(pattern)) : false
         * ("UTC".equals(pattern)) : false
         * (m.matches()) : true
         * (group != null) : true  #  inside parseInt method
         * (hours == 0) : true
         * (minutes == 0) : false
         * (group != null) : true  #  inside parseSign method
         * (group.charAt(0) == '-') : true  #  inside parseSign method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        TimeZone result = FastTimeZone.getGmtTimeZone("pattern1");
        GmtTimeZone gmtTimeZone = new GmtTimeZone(true, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(gmtTimeZone)));
    }

    //Sapient generated method id: ${d6c15c29-9c7c-3420-9816-9a15c846882f}
    @Disabled()
    @Test()
    void getGmtTimeZone1WhenGroupCharAt0NotEquals___() {
        /* Branches:
         * ("Z".equals(pattern)) : false
         * ("UTC".equals(pattern)) : false
         * (m.matches()) : true
         * (group != null) : true  #  inside parseInt method
         * (hours == 0) : true
         * (minutes == 0) : false
         * (group != null) : true  #  inside parseSign method
         * (group.charAt(0) == '-') : false  #  inside parseSign method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        TimeZone result = FastTimeZone.getGmtTimeZone("pattern1");
        GmtTimeZone gmtTimeZone = new GmtTimeZone(false, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(gmtTimeZone)));
    }

    //Sapient generated method id: ${caec973b-d16d-3c96-95e2-6e480447db3a}
    @Test()
    void getTimeZoneWhenTzIsNotNull() {
        /* Branches:
         * (tz != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<FastTimeZone> fastTimeZone = mockStatic(FastTimeZone.class, CALLS_REAL_METHODS)) {
            TimeZone timeZone = TimeZone.getDefault();
            fastTimeZone.when(() -> FastTimeZone.getGmtTimeZone("id1")).thenReturn(timeZone);
            //Act Statement(s)
            TimeZone result = FastTimeZone.getTimeZone("id1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(timeZone));
                fastTimeZone.verify(() -> FastTimeZone.getGmtTimeZone("id1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${dcab0180-ee54-382a-ab73-50ddde7f3020}
    @Test()
    void getTimeZoneWhenTzIsNull() {
        /* Branches:
         * (tz != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<FastTimeZone> fastTimeZone = mockStatic(FastTimeZone.class, CALLS_REAL_METHODS)) {
            fastTimeZone.when(() -> FastTimeZone.getGmtTimeZone("A")).thenReturn(null);
            //Act Statement(s)
            TimeZone result = FastTimeZone.getTimeZone("A");
            TimeZone timeZone = TimeZone.getTimeZone("A");
            //Assert statement(s)
            //TODO: Please implement equals method in TimeZone for verification to succeed or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, equalTo(timeZone));
                fastTimeZone.verify(() -> FastTimeZone.getGmtTimeZone("A"), atLeast(1));
            });
        }
    }
}
