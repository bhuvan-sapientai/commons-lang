package org.apache.commons.lang3;

import org.apache.commons.lang3.JavaVersion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JavaVersionSapientGeneratedTest {

    @Test
    void getWhenVersionStrIsNull() {
        JavaVersion result = JavaVersion.get(null);
        assertThat(result, is(nullValue()));
    }

    @ParameterizedTest
    @CsvSource({ "0.9,JAVA_0_9", "1.1,JAVA_1_1", "1.2,JAVA_1_2", "1.3,JAVA_1_3", "1.4,JAVA_1_4", "1.5,JAVA_1_5", "1.6,JAVA_1_6", "1.7,JAVA_1_7", "1.8,JAVA_1_8", "9,JAVA_9", "10,JAVA_10", "11,JAVA_11", "12,JAVA_12", "13,JAVA_13", "14,JAVA_14", "15,JAVA_15", "16,JAVA_16", "17,JAVA_17", "18,JAVA_18", "19,JAVA_19", "20,JAVA_20", "21,JAVA_21" })
    void getForKnownVersions(String versionStr, JavaVersion expected) {
        JavaVersion result = JavaVersion.get(versionStr);
        assertThat(result, equalTo(expected));
    }

    @Test
    void getWhenVersionStrIsUnknownButLessThanOne() {
        JavaVersion result = JavaVersion.get("0.95");
        assertThat(result, equalTo(JavaVersion.JAVA_RECENT));
    }

    @Test
    void getWhenVersionStrIsUnknownAndGreaterThanTen() {
        JavaVersion result = JavaVersion.get("22");
        assertThat(result, equalTo(JavaVersion.JAVA_RECENT));
    }

    @Test
    void getWhenVersionStrIsUnknownAndBetweenOneAndTen() {
        JavaVersion result = JavaVersion.get("5.5");
        assertThat(result, is(nullValue()));
    }

    @ParameterizedTest
    @EnumSource(JavaVersion.class)
    void getJavaVersionForAllEnumValues(JavaVersion version) {
        JavaVersion result = JavaVersion.getJavaVersion(version.toString());
        assertThat(result, equalTo(version));
    }

    @ParameterizedTest
    @ValueSource(strings = { "0.95", "22", "100" })
    void getJavaVersionForUnknownHighVersions(String versionStr) {
        JavaVersion result = JavaVersion.getJavaVersion(versionStr);
        assertThat(result, equalTo(JavaVersion.JAVA_RECENT));
    }

    @Test
    void getJavaVersionForUnknownLowVersion() {
        JavaVersion result = JavaVersion.getJavaVersion("0.5");
        assertThat(result, is(nullValue()));
    }

    @ParameterizedTest
    @EnumSource(JavaVersion.class)
    void atLeastTest(JavaVersion version) {
        for (JavaVersion other : JavaVersion.values()) {
            boolean result = version.atLeast(other);
            assertThat(result, equalTo(version.ordinal() >= other.ordinal()));
        }
    }

    @ParameterizedTest
    @EnumSource(JavaVersion.class)
    void atMostTest(JavaVersion version) {
        for (JavaVersion other : JavaVersion.values()) {
            boolean result = version.atMost(other);
            assertThat(result, equalTo(version.ordinal() <= other.ordinal()));
        }
    }

    @ParameterizedTest
    @EnumSource(JavaVersion.class)
    void toStringTest(JavaVersion version) {
        String result = version.toString();
        assertThat(result, equalTo(version.name().substring(5).replace('_', '.')));
    }

    @Test
    void maxVersionTest() {
        float result = JavaVersion.JAVA_RECENT.atLeast(JavaVersion.JAVA_21) ? 22.0f : 21.0f;
        assertThat(result, greaterThanOrEqualTo(21.0f));
    }

    @ParameterizedTest
    @ValueSource(strings = { "1.5", "5", "1.8", "8", "9", "10", "11" })
    void toFloatVersionTest(String versionStr) {
        JavaVersion version = JavaVersion.get(versionStr);
        assertThat(version, is(notNullValue()));
    }
}
