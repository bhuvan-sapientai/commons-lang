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

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GmtTimeZoneSapientGeneratedTest {

    //Sapient generated method id: ${getOffsetTest}, hash: D645DAA6D58EF1E29D8958CB101EFAD8
    @Test()
    void getOffsetTest() {
        //Arrange Statement(s)
        GmtTimeZone target = new GmtTimeZone(true, -371, -160);
        
        //Act Statement(s)
        int result = target.getOffset(0, 0, 0, 0, 0, 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1345200000)));
    }

    //Sapient generated method id: ${inDaylightTimeTest}, hash: ACA2F1D825A1143113483C97EACD69AD
    @Test()
    void inDaylightTimeTest() {
        //Arrange Statement(s)
        GmtTimeZone target = new GmtTimeZone(true, -371, -160);
        Date date = new Date();
        
        //Act Statement(s)
        boolean result = target.inDaylightTime(date);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${setRawOffsetThrowsUnsupportedOperationException}, hash: 9446387DBFAB2DD45972DE8CEB208C1D
    @Test()
    void setRawOffsetThrowsUnsupportedOperationException() {
        //Arrange Statement(s)
        GmtTimeZone target = new GmtTimeZone(true, -371, -160);
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.setRawOffset(0);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${toStringTest}, hash: D275549B410297E4B755DA257E4473BE
    @Test()
    void toStringTest() {
        //Arrange Statement(s)
        GmtTimeZone target = new GmtTimeZone(true, 8, -480);
        
        //Act Statement(s)
        String result = target.toString();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("[GmtTimeZone id=\"GMT-08:\u00000\",offset=0]")));
    }

    //Sapient generated method id: ${useDaylightTimeTest}, hash: 7713F1055325F104BF1E18C080691613
    @Test()
    void useDaylightTimeTest() {
        //Arrange Statement(s)
        GmtTimeZone target = new GmtTimeZone(true, -371, -160);
        
        //Act Statement(s)
        boolean result = target.useDaylightTime();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }
}
