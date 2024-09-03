package org.apache.commons.lang3.event;

import org.apache.commons.lang3.event.EventUtils;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
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
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EventUtilsSapientGeneratedTest {

    @Test
    void addEventListenerTest() {
        Object eventSource = mock(Object.class);
        Class<TestListener> listenerType = TestListener.class;
        TestListener listener = mock(TestListener.class);
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class)) {
            methodUtils.when(() -> MethodUtils.invokeMethod(eventSource, "addTestListener", listener)).thenReturn(null);
            EventUtils.addEventListener(eventSource, listenerType, listener);
            methodUtils.verify(() -> MethodUtils.invokeMethod(eventSource, "addTestListener", listener));
        }
    }

    @Test
    void addEventListenerWhenCaughtNoSuchMethodExceptionThrowsIllegalArgumentException() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object eventSource = new Object();
        Class<TestListener> listenerType = TestListener.class;
        TestListener listener = mock(TestListener.class);
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class)) {
            methodUtils.when(() -> MethodUtils.invokeMethod(eventSource, "addTestListener", listener)).thenThrow(new NoSuchMethodException());
            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> EventUtils.addEventListener(eventSource, listenerType, listener));
            assertThat(exception.getMessage(), equalTo("Class java.lang.Object does not have a public addTestListener method which takes a parameter of type org.apache.commons.lang3.event.EventUtilsSapientGeneratedTest$TestListener."));
        }
    }

    @Test
    void addEventListenerWhenCaughtIllegalAccessExceptionThrowsIllegalArgumentException() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object eventSource = new Object();
        Class<TestListener> listenerType = TestListener.class;
        TestListener listener = mock(TestListener.class);
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class)) {
            methodUtils.when(() -> MethodUtils.invokeMethod(eventSource, "addTestListener", listener)).thenThrow(new IllegalAccessException());
            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> EventUtils.addEventListener(eventSource, listenerType, listener));
            assertThat(exception.getMessage(), equalTo("Class java.lang.Object does not have an accessible addTestListener method which takes a parameter of type org.apache.commons.lang3.event.EventUtilsSapientGeneratedTest$TestListener."));
        }
    }

    @Test
    void addEventListenerWhenCaughtInvocationTargetExceptionThrowsIllegalArgumentException() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object eventSource = new Object();
        Class<TestListener> listenerType = TestListener.class;
        TestListener listener = mock(TestListener.class);
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class)) {
            methodUtils.when(() -> MethodUtils.invokeMethod(eventSource, "addTestListener", listener)).thenThrow(new InvocationTargetException(new RuntimeException("Test exception")));
            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> EventUtils.addEventListener(eventSource, listenerType, listener));
            assertThat(exception.getMessage(), equalTo("Unable to add listener."));
            assertThat(exception.getCause(), is(instanceOf(RuntimeException.class)));
            assertThat(exception.getCause().getMessage(), equalTo("Test exception"));
        }
    }

    @Test
    void bindEventsToMethodTest() {
        Object target = new Object();
        String methodName = "handleEvent";
        Object eventSource = mock(Object.class);
        Class<TestListener> listenerType = TestListener.class;
        String[] eventTypes = { "event1", "event2" };
        try (MockedStatic<EventUtils> eventUtils = mockStatic(EventUtils.class, CALLS_REAL_METHODS)) {
            eventUtils.when(() -> EventUtils.addEventListener(eventSource, listenerType, null)).thenAnswer((Answer<Void>) invocation -> null);
            EventUtils.bindEventsToMethod(target, methodName, eventSource, listenerType, eventTypes);
            eventUtils.verify(() -> EventUtils.addEventListener(eventSource, listenerType, null));
        }
    }

    @ParameterizedTest
    @CsvSource({ "true, event1", "true, event2", "false, event3" })
    void testEventBindingInvocationHandler(boolean shouldInvoke, String eventType) throws Throwable {
        //Object target = mock(Object.class);
        //String methodName = "handleEvent";
        //String[] eventTypes = { "event1", "event2" };
        //EventUtils.EventBindingInvocationHandler handler = new EventUtils.EventBindingInvocationHandler(target, methodName, eventTypes);
        //TestListener proxy = (TestListener) java.lang.reflect.Proxy.newProxyInstance(getClass().getClassLoader(), new Class<?>[] { TestListener.class }, handler);
        //java.lang.reflect.Method method = TestListener.class.getMethod(eventType);
        //Object[] args = new Object[0];
        //when(MethodUtils.invokeMethod(target, methodName)).thenReturn(null);
        //handler.invoke(proxy, method, args);
        /*if (shouldInvoke) {
    verify(target).handleEvent();
}*/
    }

    private interface TestListener {

        void event1();

        void event2();

        void event3();
    }
}