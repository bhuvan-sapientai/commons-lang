package org.apache.commons.lang3.event;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import org.apache.commons.lang3.reflect.MethodUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EventUtilsSapientGeneratedTest {

    //Sapient generated method id: ${0b160154-951e-3a14-95bd-e6793a7bce96}
    @Disabled()
    @Test()
    void addEventListenerTest() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        //Act Statement(s)
        EventUtils.addEventListener(object, Object.class, object2);
    }

    //Sapient generated method id: ${553c54f1-50e3-3bb9-bbc3-b68176085374}
    @Disabled()
    @Test()
    void addEventListenerWhenCaughtNoSuchMethodExceptionThrowsIllegalArgumentException() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /* Branches:
         * (catch-exception (NoSuchMethodException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class)) {
            Object object = new Object();
            Object object2 = new Object();
            Object object3 = new Object();
            Object[] objectArray = new Object[]{object3};
            methodUtils.when(() -> MethodUtils.invokeMethod(object2, "addObject", objectArray)).thenReturn(object);
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                EventUtils.addEventListener(object2, Object.class, object3);
            });
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Class java.lang.Object does not have a public addObject method which takes a parameter of type java.lang.Object.");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                methodUtils.verify(() -> MethodUtils.invokeMethod(object2, "addObject", objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${93726b42-06a3-3b41-bbdb-0d52ac0c3c11}
    @Disabled()
    @Test()
    void addEventListenerWhenCaughtIllegalAccessExceptionThrowsIllegalArgumentException() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /* Branches:
         * (catch-exception (IllegalAccessException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class)) {
            Object object = new Object();
            Object object2 = new Object();
            Object object3 = new Object();
            Object[] objectArray = new Object[]{object3};
            methodUtils.when(() -> MethodUtils.invokeMethod(object2, "addObject", objectArray)).thenReturn(object);
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                EventUtils.addEventListener(object2, Object.class, object3);
            });
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Class java.lang.Object does not have an accessible addObject method which takes a parameter of type java.lang.Object.");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                methodUtils.verify(() -> MethodUtils.invokeMethod(object2, "addObject", objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${54490f29-bae7-3dd5-bcdc-acfb58e1bd7e}
    @Disabled()
    @Test()
    void addEventListenerWhenCaughtInvocationTargetExceptionThrowsIllegalArgumentException() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /* Branches:
         * (catch-exception (InvocationTargetException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class)) {
            Object object = new Object();
            Object object2 = new Object();
            Object object3 = new Object();
            Object[] objectArray = new Object[]{object3};
            methodUtils.when(() -> MethodUtils.invokeMethod(object2, "addObject", objectArray)).thenReturn(object);
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                EventUtils.addEventListener(object2, Object.class, object3);
            });
            Throwable throwable = new Throwable();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to add listener.", throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                assertThat(result.getCause(), isA(throwable.getClass()));
                methodUtils.verify(() -> MethodUtils.invokeMethod(object2, "addObject", objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${875e70ec-cf6b-3036-a897-75afaceac7b2}
    @Disabled()
    @Test()
    void bindEventsToMethodTest() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<EventUtils> eventUtils = mockStatic(EventUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            eventUtils.when(() -> EventUtils.addEventListener(object, Object.class, object2)).thenAnswer((Answer<Void>) invocation -> null);
            Object object3 = new Object();
            String[] stringArray = new String[]{};
            //Act Statement(s)
            EventUtils.bindEventsToMethod(object3, "methodName1", object, Object.class, stringArray);
            //Assert statement(s)
            assertAll("result", () -> eventUtils.verify(() -> EventUtils.addEventListener(object, Object.class, object2), atLeast(1)));
        }
    }
}
