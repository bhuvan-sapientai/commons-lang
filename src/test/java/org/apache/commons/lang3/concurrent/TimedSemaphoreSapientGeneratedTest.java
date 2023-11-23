package org.apache.commons.lang3.concurrent;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TimedSemaphoreSapientGeneratedTest {

    //Sapient generated method id: ${1908bd05-8f2e-3390-8eef-84aa1dbce7ba}
    @Test()
    void shutdownWhenTaskIsNull() {
        /* Branches:
         * (!shutdown) : true
         * (ownExecutor) : false
         * (task != null) : false
         */
        //Arrange Statement(s)
        TimedSemaphore target = new TimedSemaphore((ScheduledExecutorService) null, 1L, TimeUnit.NANOSECONDS, 0);
        //Act Statement(s)
        target.shutdown();
        //Assert statement(s)
        assertAll("result", () -> assertThat(target.isShutdown(), equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${7b81247e-5863-373a-8322-bc034893f2ce}
    @Test()
    void acquireWhenIsShutdownThrowsIllegalStateException() throws InterruptedException {
        /* Branches:
         * (isShutdown()) : true  #  inside prepareAcquire method
         */
        //Arrange Statement(s)
        TimedSemaphore target = spy(new TimedSemaphore((ScheduledExecutorService) null, 1L, TimeUnit.NANOSECONDS, 0));
        doReturn(true).when(target).isShutdown();
        IllegalStateException illegalStateException = new IllegalStateException("TimedSemaphore is shut down!");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.acquire();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            verify(target).isShutdown();
        });
    }

    //Sapient generated method id: ${342d1605-75ca-3c5e-a0af-b827fc56c78a}
    @Test()
    void acquireWhenCanPassAndCanPass() throws InterruptedException {
        /* Branches:
         * (isShutdown()) : false  #  inside prepareAcquire method
         * (task == null) : true  #  inside prepareAcquire method
         * (getLimit() <= NO_LIMIT) : false  #  inside acquirePermit method
         * (acquireCount < getLimit()) : true  #  inside acquirePermit method
         * (!canPass) : false
         * (!canPass) : false
         */
        //Arrange Statement(s)
        TimedSemaphore target = spy(new TimedSemaphore((ScheduledExecutorService) null, 1L, TimeUnit.NANOSECONDS, 1));
        doReturn(false).when(target).isShutdown();
        doReturn(null).when(target).startTimer();
        //Act Statement(s)
        target.acquire();
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).isShutdown();
            verify(target).startTimer();
        });
    }

    //Sapient generated method id: ${2f3c632e-b886-37b8-8181-e3c87114cd20}
    @Test()
    void tryAcquireWhenIsShutdownThrowsIllegalStateException() {
        /* Branches:
         * (isShutdown()) : true  #  inside prepareAcquire method
         */
        //Arrange Statement(s)
        TimedSemaphore target = spy(new TimedSemaphore((ScheduledExecutorService) null, 1L, TimeUnit.NANOSECONDS, 0));
        doReturn(true).when(target).isShutdown();
        IllegalStateException illegalStateException = new IllegalStateException("TimedSemaphore is shut down!");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.tryAcquire();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            verify(target).isShutdown();
        });
    }

    //Sapient generated method id: ${d3f1ba27-b522-342f-aa6a-def52828ea5f}
    @Test()
    void tryAcquireWhenAcquireCountLessThanGetLimit() {
        /* Branches:
         * (isShutdown()) : false  #  inside prepareAcquire method
         * (task == null) : true  #  inside prepareAcquire method
         * (getLimit() <= NO_LIMIT) : false  #  inside acquirePermit method
         * (acquireCount < getLimit()) : true  #  inside acquirePermit method
         */
        //Arrange Statement(s)
        TimedSemaphore target = spy(new TimedSemaphore((ScheduledExecutorService) null, 1L, TimeUnit.NANOSECONDS, 1));
        doReturn(false).when(target).isShutdown();
        doReturn(null).when(target).startTimer();
        //Act Statement(s)
        boolean result = target.tryAcquire();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).isShutdown();
            verify(target).startTimer();
        });
    }

    //Sapient generated method id: ${e22b4a42-c4e6-3a59-8cdb-f07b3f2dea44}
    @Test()
    void getAvailablePermitsTest() {
        //Arrange Statement(s)
        TimedSemaphore target = new TimedSemaphore((ScheduledExecutorService) null, 1L, TimeUnit.NANOSECONDS, 0);
        //Act Statement(s)
        int result = target.getAvailablePermits();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${93d720ed-e294-3a4a-87da-f4082c5b17de}
    @Test()
    void getAverageCallsPerPeriodWhenPeriodCountEquals0() {
        /* Branches:
         * (periodCount == 0) : true
         */
        //Arrange Statement(s)
        TimedSemaphore target = new TimedSemaphore((ScheduledExecutorService) null, 1L, TimeUnit.NANOSECONDS, 0);
        //Act Statement(s)
        double result = target.getAverageCallsPerPeriod();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${de45d6b3-80a2-30d8-b440-9deddd02304e}
    @Disabled()
    @Test()
    void startTimerTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimedSemaphore target = new TimedSemaphore((ScheduledExecutorService) null, 1L, TimeUnit.NANOSECONDS, 0);
        //Act Statement(s)
        ScheduledFuture<?> result = target.startTimer();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${f0f04eed-f7a7-379e-983e-488df9e4a8d5}
    @Test()
    void endOfPeriodTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimedSemaphore target = new TimedSemaphore((ScheduledExecutorService) null, 1L, TimeUnit.NANOSECONDS, 0);
        //Act Statement(s)
        target.endOfPeriod();
        //Assert statement(s)
        assertAll("result", () -> assertThat(target.getAcquireCount(), equalTo(0)));
    }
}
