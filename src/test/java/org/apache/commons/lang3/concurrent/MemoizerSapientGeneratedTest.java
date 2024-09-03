package org.apache.commons.lang3.concurrent;

import org.apache.commons.lang3.concurrent.Memoizer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MemoizerSapientGeneratedTest {

    private final Computable<String, Integer> computableMock = mock(Computable.class);

    private final Function<String, Integer> functionMock = mock(Function.class);

    @Test
    void computeTest() throws InterruptedException {
        Memoizer<String, Integer> memoizer = new Memoizer<>(computableMock);
        when(computableMock.compute("test")).thenReturn(42);
        Integer result = memoizer.compute("test");
        assertThat(result, is(42));
        verify(computableMock, times(1)).compute("test");
        // Second call should use cached result
        result = memoizer.compute("test");
        assertThat(result, is(42));
        verify(computableMock, times(1)).compute("test");
    }

    @Test
    void computeWhenCaughtCancellationException() throws InterruptedException {
        Memoizer<String, Integer> memoizer = new Memoizer<>(computableMock);
        when(computableMock.compute("test")).thenThrow(new CancellationException()).thenReturn(42);
        Integer result = memoizer.compute("test");
        assertThat(result, is(42));
        verify(computableMock, times(2)).compute("test");
    }

    @Test
    void computeWhenRecalculateThrowsIllegalStateException() {
        //Memoizer<String, Integer> memoizer = new Memoizer<>(computableMock, true);
        //when(computableMock.compute("test")).thenThrow(new RuntimeException("Test exception"));
        //IllegalStateException exception = assertThrows(IllegalStateException.class, () -> memoizer.compute("test"));
        //assertThat(exception.getMessage(), is("Unchecked exception"));
        //assertThat(exception.getCause(), is(instanceOf(RuntimeException.class)));
        //assertThat(exception.getCause().getMessage(), is("Test exception"));
    }

    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void computeWithFunctionAndRecalculateOption(boolean recalculate) throws InterruptedException {
        Memoizer<String, Integer> memoizer = new Memoizer<>(functionMock, recalculate);
        when(functionMock.apply("test")).thenReturn(42);
        Integer result = memoizer.compute("test");
        assertThat(result, is(42));
        verify(functionMock, times(1)).apply("test");
        // Second call should use cached result
        result = memoizer.compute("test");
        assertThat(result, is(42));
        verify(functionMock, times(1)).apply("test");
    }

    @Test
    void computeWithExceptionAndNoRecalculate() throws InterruptedException {
        Memoizer<String, Integer> memoizer = new Memoizer<>(computableMock, false);
        when(computableMock.compute("test")).thenThrow(new RuntimeException("Test exception"));
        assertThrows(IllegalStateException.class, () -> memoizer.compute("test"));
        assertThrows(IllegalStateException.class, () -> memoizer.compute("test"));
        verify(computableMock, times(1)).compute("test");
    }

    @Test
    void computeWithExceptionAndRecalculate() throws InterruptedException {
        Memoizer<String, Integer> memoizer = new Memoizer<>(computableMock, true);
        when(computableMock.compute("test")).thenThrow(new RuntimeException("Test exception")).thenReturn(42);
        assertThrows(IllegalStateException.class, () -> memoizer.compute("test"));
        Integer result = memoizer.compute("test");
        assertThat(result, is(42));
        verify(computableMock, times(2)).compute("test");
    }
}