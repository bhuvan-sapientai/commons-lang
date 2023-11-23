package org.apache.commons.lang3.concurrent;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ThresholdCircuitBreakerSapientGeneratedTest {

    //Sapient generated method id: ${77141153-ac08-35a1-8c73-b008d739dc8c}
    @Test()
    void checkStateWhenIsOpenNot() {
        /* Branches:
         * (!isOpen()) : true
         */
        //Arrange Statement(s)
        ThresholdCircuitBreaker target = spy(new ThresholdCircuitBreaker(0L));
        doReturn(false).when(target).isOpen();
        //Act Statement(s)
        boolean result = target.checkState();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).isOpen();
        });
    }

    //Sapient generated method id: ${1a21c553-6859-3f83-b6c2-e89e86588208}
    @Test()
    void checkStateWhenIsOpen() {
        /* Branches:
         * (!isOpen()) : false
         */
        //Arrange Statement(s)
        ThresholdCircuitBreaker target = spy(new ThresholdCircuitBreaker(0L));
        doReturn(true).when(target).isOpen();
        //Act Statement(s)
        boolean result = target.checkState();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target).isOpen();
        });
    }

    //Sapient generated method id: ${4338ea80-df41-3c09-b3eb-b0476a460c1f}
    @Test()
    void closeTest() {
        //Arrange Statement(s)
        ThresholdCircuitBreaker target = spy(new ThresholdCircuitBreaker(0L));
        doNothing().when(target).changeState(AbstractCircuitBreaker.State.CLOSED);
        //Act Statement(s)
        target.close();
        //Assert statement(s)
        assertAll("result", () -> verify(target).changeState(AbstractCircuitBreaker.State.CLOSED));
    }

    //Sapient generated method id: ${2d85e5f2-6975-31a7-94fb-7f8dd2091f3c}
    @Disabled()
    @Test()
    void incrementAndCheckState1WhenCheckState() {
        /* Branches:
         * (threshold == 0) : true
         * (used > threshold) : true
         * (checkState()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ThresholdCircuitBreaker target = spy(new ThresholdCircuitBreaker(0L));
        doNothing().when(target).open();
        doReturn(true).when(target).checkState();
        //Act Statement(s)
        boolean result = target.incrementAndCheckState(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target, times(2)).open();
            verify(target).checkState();
        });
    }

    //Sapient generated method id: ${37b57f03-a932-3273-a1bc-ee1004d7e89d}
    @Disabled()
    @Test()
    void incrementAndCheckState1WhenCheckStateNot() {
        /* Branches:
         * (threshold == 0) : true
         * (used > threshold) : true
         * (checkState()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ThresholdCircuitBreaker target = spy(new ThresholdCircuitBreaker(0L));
        doNothing().when(target).open();
        doReturn(false).when(target).checkState();
        //Act Statement(s)
        boolean result = target.incrementAndCheckState(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target, times(2)).open();
            verify(target).checkState();
        });
    }
}
