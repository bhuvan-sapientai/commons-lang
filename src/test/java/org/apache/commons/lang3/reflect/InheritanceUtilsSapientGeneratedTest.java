package org.apache.commons.lang3.reflect;

import org.apache.commons.lang3.reflect.InheritanceUtils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class InheritanceUtilsSapientGeneratedTest {

    @Test
    void distanceWhenParentIsNull() {
        int result = InheritanceUtils.distance(Object.class, null);
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    @Test
    void distanceWhenChildIsNull() {
        int result = InheritanceUtils.distance(null, Object.class);
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    @Test
    void distanceWhenChildEqualsParent() {
        int result = InheritanceUtils.distance(Object.class, Object.class);
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    @Test
    void distanceWhenDEquals1() {
        int result = InheritanceUtils.distance(String.class, Object.class);
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    @Test
    void distanceWhenDGreaterThan0() {
        int result = InheritanceUtils.distance(Integer.class, Number.class);
        assertAll("result", () -> assertThat(result, equalTo(2)));
    }

    @Test
    void distanceWhenDNotGreaterThan0() {
        int result = InheritanceUtils.distance(Object.class, String.class);
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    @ParameterizedTest
    @CsvSource({ "java.lang.String, java.lang.Object, 1", "java.lang.Integer, java.lang.Number, 1", "java.lang.Integer, java.lang.Object, 2", "java.util.ArrayList, java.util.List, 1", "java.util.ArrayList, java.util.Collection, 2", "java.util.ArrayList, java.lang.Object, 3" })
    void distanceParameterizedTest(String childClassName, String parentClassName, int expectedDistance) throws ClassNotFoundException {
        Class<?> childClass = Class.forName(childClassName);
        Class<?> parentClass = Class.forName(parentClassName);
        int result = InheritanceUtils.distance(childClass, parentClass);
        assertAll("result", () -> assertThat(result, equalTo(expectedDistance)));
    }

    @Test
    void distanceWhenClassesAreUnrelated() {
        int result = InheritanceUtils.distance(String.class, Integer.class);
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    @Test
    void distanceWhenChildIsInterface() {
        int result = InheritanceUtils.distance(Comparable.class, Object.class);
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    @Test
    void distanceWhenParentIsInterface() {
        int result = InheritanceUtils.distance(String.class, Comparable.class);
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    @Test
    void testInheritanceUtilsConstructor() {
        new InheritanceUtils();
    }
}
