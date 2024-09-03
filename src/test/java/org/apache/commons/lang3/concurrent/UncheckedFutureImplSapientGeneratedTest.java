package org.apache.commons.lang3.concurrent;

import org.apache.commons.lang3.concurrent.UncheckedFutureImpl;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.exception.UncheckedInterruptedException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.*;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UncheckedFutureImplSapientGeneratedTest {

    @Test
    void getTest() throws Exception {
        Future<String> futureMock = mock(Future.class);
        when(futureMock.get()).thenReturn("result");
        UncheckedFutureImpl<String> target = new UncheckedFutureImpl<>(futureMock);
        String result = target.get();
        assertAll("result", () -> assertThat(result, is(notNullValue())), () -> assertThat(result, is("result")));
        verify(futureMock).get();
    }

    @Test
    void getWhenCaughtInterruptedExceptionThrowsUncheckedInterruptedException() throws Exception {
        Future<String> futureMock = mock(Future.class);
        when(futureMock.get()).thenThrow(new InterruptedException("test interruption"));
        UncheckedFutureImpl<String> target = new UncheckedFutureImpl<>(futureMock);
        UncheckedInterruptedException result = assertThrows(UncheckedInterruptedException.class, target::get);
        assertAll("result", () -> assertThat(result, is(notNullValue())), () -> assertThat(result.getCause(), is(instanceOf(InterruptedException.class))), () -> assertThat(result.getCause().getMessage(), is("test interruption")));
        verify(futureMock).get();
    }

    @Test
    void getWhenCaughtExecutionExceptionThrowsUncheckedExecutionException() throws Exception {
        Future<String> futureMock = mock(Future.class);
        when(futureMock.get()).thenThrow(new ExecutionException("test execution exception", new RuntimeException()));
        UncheckedFutureImpl<String> target = new UncheckedFutureImpl<>(futureMock);
        UncheckedExecutionException result = assertThrows(UncheckedExecutionException.class, target::get);
        assertAll("result", () -> assertThat(result, is(notNullValue())), () -> assertThat(result.getCause(), is(instanceOf(ExecutionException.class))), () -> assertThat(result.getCause().getMessage(), is("test execution exception")));
        verify(futureMock).get();
    }

    @ParameterizedTest
    @EnumSource(TimeUnit.class)
    void getWithTimeoutTest(TimeUnit unit) throws Exception {
        Future<String> futureMock = mock(Future.class);
        when(futureMock.get(anyLong(), any())).thenReturn("result");
        UncheckedFutureImpl<String> target = new UncheckedFutureImpl<>(futureMock);
        String result = target.get(10, unit);
        assertAll("result", () -> assertThat(result, is(notNullValue())), () -> assertThat(result, is("result")));
        verify(futureMock).get(10, unit);
    }

    @ParameterizedTest
    @EnumSource(TimeUnit.class)
    void getWithTimeoutWhenCaughtInterruptedExceptionThrowsUncheckedInterruptedException(TimeUnit unit) throws Exception {
        Future<String> futureMock = mock(Future.class);
        when(futureMock.get(anyLong(), any())).thenThrow(new InterruptedException("test interruption"));
        UncheckedFutureImpl<String> target = new UncheckedFutureImpl<>(futureMock);
        UncheckedInterruptedException result = assertThrows(UncheckedInterruptedException.class, () -> target.get(10, unit));
        assertAll("result", () -> assertThat(result, is(notNullValue())), () -> assertThat(result.getCause(), is(instanceOf(InterruptedException.class))), () -> assertThat(result.getCause().getMessage(), is("test interruption")));
        verify(futureMock).get(10, unit);
    }

    @ParameterizedTest
    @EnumSource(TimeUnit.class)
    void getWithTimeoutWhenCaughtExecutionExceptionThrowsUncheckedExecutionException(TimeUnit unit) throws Exception {
        Future<String> futureMock = mock(Future.class);
        when(futureMock.get(anyLong(), any())).thenThrow(new ExecutionException("test execution exception", new RuntimeException()));
        UncheckedFutureImpl<String> target = new UncheckedFutureImpl<>(futureMock);
        UncheckedExecutionException result = assertThrows(UncheckedExecutionException.class, () -> target.get(10, unit));
        assertAll("result", () -> assertThat(result, is(notNullValue())), () -> assertThat(result.getCause(), is(instanceOf(ExecutionException.class))), () -> assertThat(result.getCause().getMessage(), is("test execution exception")));
        verify(futureMock).get(10, unit);
    }

    @ParameterizedTest
    @EnumSource(TimeUnit.class)
    void getWithTimeoutWhenCaughtTimeoutExceptionThrowsUncheckedTimeoutException(TimeUnit unit) throws Exception {
        Future<String> futureMock = mock(Future.class);
        when(futureMock.get(anyLong(), any())).thenThrow(new TimeoutException("test timeout"));
        UncheckedFutureImpl<String> target = new UncheckedFutureImpl<>(futureMock);
        UncheckedTimeoutException result = assertThrows(UncheckedTimeoutException.class, () -> target.get(10, unit));
        assertAll("result", () -> assertThat(result, is(notNullValue())), () -> assertThat(result.getCause(), is(instanceOf(TimeoutException.class))), () -> assertThat(result.getCause().getMessage(), is("test timeout")));
        verify(futureMock).get(10, unit);
    }
}
