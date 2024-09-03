package org.apache.commons.lang3.time;

import org.apache.commons.lang3.time.TimeZones;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.TimeZone;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TimeZonesSapientGeneratedTest {

    @Test
    void toTimeZoneTest() {
        TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
        TimeZone result = TimeZones.toTimeZone(timeZone);
        assertAll("result", () -> assertThat(result, is(notNullValue())), () -> assertThat(result, is(timeZone)));
    }

    @Test
    void toTimeZoneWithNullTest() {
        TimeZone result = TimeZones.toTimeZone(null);
        assertThat(result, is(TimeZone.getDefault()));
    }

    @Test
    void gmtIdConstantTest() {
        assertThat(TimeZones.GMT_ID, is("GMT"));
    }

    @Test
    void gmtConstantTest() {
        assertAll("GMT constant", () -> assertThat(TimeZones.GMT, is(notNullValue())), () -> assertThat(TimeZones.GMT.getID(), is("GMT")));
    }

    @ParameterizedTest
    @CsvSource({ "America/Los_Angeles", "Europe/London", "Asia/Tokyo" })
    void toTimeZoneWithDifferentTimeZonesTest(String zoneId) {
        TimeZone timeZone = TimeZone.getTimeZone(zoneId);
        TimeZone result = TimeZones.toTimeZone(timeZone);
        assertThat(result, is(timeZone));
    }

    @Test
    void privateConstructorTest() {
        assertThrows(IllegalAccessException.class, () -> {
            TimeZones.class.getDeclaredConstructor().newInstance();
        });
    }
}
