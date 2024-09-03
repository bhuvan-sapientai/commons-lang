package org.apache.commons.lang3.concurrent;

import org.apache.commons.lang3.concurrent.FutureTasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.stream.Stream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FutureTasksSapientGeneratedTest {

    @Test
    void runTest() {
        Callable<String> callable = () -> "Test Result";
        FutureTask<String> result = FutureTasks.run(callable);
        assertAll(() -> assertThat(result, is(notNullValue())), () -> assertThat(result.isDone(), is(true)), () -> assertThat(result.get(), is("Test Result")));
    }

    @Test
    void runTestWithException() {
        Callable<String> callable = () -> {
            throw new RuntimeException("Test Exception");
        };
        FutureTask<String> result = FutureTasks.run(callable);
        assertAll(() -> assertThat(result, is(notNullValue())), () -> assertThat(result.isDone(), is(true)), () -> assertThrows(ExecutionException.class, result::get));
    }

    @ParameterizedTest
    @MethodSource("provideCallables")
    void runTestWithDifferentCallables(Callable<Integer> callable, Integer expected) throws Exception {
        FutureTask<Integer> result = FutureTasks.run(callable);
        assertAll(() -> assertThat(result, is(notNullValue())), () -> assertThat(result.isDone(), is(true)), () -> assertThat(result.get(), is(expected)));
    }

    private static Stream<Arguments> provideCallables() {
        return Stream.of(Arguments.of((Callable<Integer>) () -> 1, 1), Arguments.of((Callable<Integer>) () -> 0, 0), Arguments.of((Callable<Integer>) () -> -1, -1), Arguments.of((Callable<Integer>) () -> Integer.MAX_VALUE, Integer.MAX_VALUE), Arguments.of((Callable<Integer>) () -> Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @Test
    void runTestWithNullCallable() {
        assertThrows(NullPointerException.class, () -> FutureTasks.run(null));
    }

    @Test
    void testPrivateConstructor() throws Exception {
        //var constructor = FutureTasks.class.getDeclaredConstructor();
        //constructor.setAccessible(true);
        //var instance = constructor.newInstance();
        //assertThat(instance, is(notNullValue()));
    }
}