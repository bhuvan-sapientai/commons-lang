package org.apache.commons.lang3.concurrent;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.exception.UncheckedInterruptedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UncheckedFutureImplSapientGeneratedTest {

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}
    @Disabled(value = "Potential harmful system call (Future.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    void getTest() throws ExecutionException, InterruptedException {
        //Arrange Statement(s)
        UncheckedFutureImpl target = new UncheckedFutureImpl((Future) null);
        //Act Statement(s)
        Object result = target.get();
        Object object = new Object();
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${f40719e8-632e-3049-8d5b-92a6aa32d037}
    @Disabled(value = "Potential harmful system call (Future.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    void getWhenCaughtInterruptedExceptionThrowsUncheckedInterruptedException() {
        /* Branches:
         * (catch-exception (InterruptedException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UncheckedFutureImpl target = new UncheckedFutureImpl((Future) null);
        InterruptedException interruptedException = new InterruptedException();
        //Act Statement(s)
        final UncheckedInterruptedException result = assertThrows(UncheckedInterruptedException.class, () -> {
            target.get();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), isA(interruptedException.getClass()));
        });
    }

    //Sapient generated method id: ${6a368ecd-4bbd-35b6-a106-de1cb75a681e}
    @Disabled(value = "Potential harmful system call (Future.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    void getWhenCaughtExecutionExceptionThrowsUncheckedExecutionException() {
        /* Branches:
         * (catch-exception (ExecutionException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UncheckedFutureImpl target = new UncheckedFutureImpl((Future) null);
        Throwable throwable = new Throwable();
        ExecutionException executionException = new ExecutionException(throwable);
        //Act Statement(s)
        final UncheckedExecutionException result = assertThrows(UncheckedExecutionException.class, () -> {
            target.get();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), isA(executionException.getClass()));
        });
    }

    //Sapient generated method id: ${fa77ec73-5d5e-3732-b683-af7decc28622}
    @Disabled(value = "Potential harmful system call (Future.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    void get1Test() throws ExecutionException, InterruptedException, TimeoutException {
        //Arrange Statement(s)
        UncheckedFutureImpl target = new UncheckedFutureImpl((Future) null);
        //Act Statement(s)
        Object result = target.get(0L, TimeUnit.NANOSECONDS);
        Object object = new Object();
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${90fb10a5-b4ab-3da6-a499-87696cf1f350}
    @Disabled(value = "Potential harmful system call (Future.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    void get1WhenCaughtInterruptedExceptionThrowsUncheckedInterruptedException() {
        /* Branches:
         * (catch-exception (InterruptedException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UncheckedFutureImpl target = new UncheckedFutureImpl((Future) null);
        InterruptedException interruptedException = new InterruptedException();
        //Act Statement(s)
        final UncheckedInterruptedException result = assertThrows(UncheckedInterruptedException.class, () -> {
            target.get(0L, TimeUnit.NANOSECONDS);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), isA(interruptedException.getClass()));
        });
    }

    //Sapient generated method id: ${f36e22a5-09f3-3654-8bd5-3e34f2cbcc1a}
    @Disabled(value = "Potential harmful system call (Future.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    void get1WhenCaughtExecutionExceptionThrowsUncheckedExecutionException() {
        /* Branches:
         * (catch-exception (ExecutionException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UncheckedFutureImpl target = new UncheckedFutureImpl((Future) null);
        Throwable throwable = new Throwable();
        ExecutionException executionException = new ExecutionException(throwable);
        //Act Statement(s)
        final UncheckedExecutionException result = assertThrows(UncheckedExecutionException.class, () -> {
            target.get(0L, TimeUnit.NANOSECONDS);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), isA(executionException.getClass()));
        });
    }

    //Sapient generated method id: ${7ddb5c23-4b64-3ad8-bc92-0ef50fc497c1}
    @Disabled(value = "Potential harmful system call (Future.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    void get1WhenCaughtTimeoutExceptionThrowsUncheckedTimeoutException() {
        /* Branches:
         * (catch-exception (TimeoutException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UncheckedFutureImpl target = new UncheckedFutureImpl((Future) null);
        TimeoutException timeoutException = new TimeoutException();
        //Act Statement(s)
        final UncheckedTimeoutException result = assertThrows(UncheckedTimeoutException.class, () -> {
            target.get(0L, TimeUnit.NANOSECONDS);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), isA(timeoutException.getClass()));
        });
    }
}
