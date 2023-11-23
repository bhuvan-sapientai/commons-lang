package org.apache.commons.lang3.builder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ReflectionSapientGeneratedTest {

    //Sapient generated method id: ${686c0fb3-48c5-3739-9918-095b0a8d2bac}
    @Test()
    void getUncheckedTest() {
        //Arrange Statement(s)
        Field field = null;
        Object object = new Object();
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            Reflection.getUnchecked(field, object);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${a5e4cf6e-b1c4-3934-9ba6-d8c6ca2c540b}
    @Disabled()
    @Test()
    void getUncheckedWhenCaughtIllegalAccessExceptionThrowsIllegalArgumentException() throws IllegalArgumentException, IllegalAccessException {
        /* Branches:
         * (catch-exception (IllegalAccessException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Field field = null;
        Object object = new Object();
        IllegalAccessException illegalAccessException = new IllegalAccessException();
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Reflection.getUnchecked(field, object);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), isA(illegalAccessException.getClass()));
        });
    }
}
