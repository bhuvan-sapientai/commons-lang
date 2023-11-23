package org.apache.commons.lang3.concurrent;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EventCountCircuitBreakerSapientGeneratedTest {

    //Sapient generated method id: ${eb5776b3-96f4-3a69-be1a-7dc1d5306360}
    @Disabled()
    @Test()
    void checkStateWhenStateStrategyCurrentStateNotIsStateTransitionThisCurrentDataNextDataAndIsOpenCurrentState() {
        /* Branches:
         * (stateStrategy(currentState).isCheckIntervalFinished(this, currentData, time)) : false  #  inside nextCheckIntervalData method
         * (currentData == nextData) : true  #  inside updateCheckIntervalData method
         * (!updateCheckIntervalData(currentData, nextData)) : false  #  inside performStateCheck method
         * (stateStrategy(currentState).isStateTransition(this, currentData, nextData)) : false  #  inside performStateCheck method
         * (!isOpen(currentState)) : false  #  inside performStateCheck method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EventCountCircuitBreaker target = new EventCountCircuitBreaker(0, 0L, TimeUnit.NANOSECONDS, 0, 0L, TimeUnit.NANOSECONDS);
        //Act Statement(s)
        boolean result = target.checkState();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${e267d46a-8ee4-358d-b841-7964a37641cf}
    @Disabled()
    @Test()
    void checkStateWhenIsOpenNotCurrentState() {
        /* Branches:
         * (stateStrategy(currentState).isCheckIntervalFinished(this, currentData, time)) : true  #  inside nextCheckIntervalData method
         * (currentData == nextData) : false  #  inside updateCheckIntervalData method
         * (checkIntervalData.compareAndSet(currentData, nextData)) : true  #  inside updateCheckIntervalData method
         * (!updateCheckIntervalData(currentData, nextData)) : false  #  inside performStateCheck method
         * (stateStrategy(currentState).isStateTransition(this, currentData, nextData)) : true  #  inside performStateCheck method
         * (!isOpen(currentState)) : true  #  inside performStateCheck method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EventCountCircuitBreaker target = spy(new EventCountCircuitBreaker(0, 0L, TimeUnit.NANOSECONDS, 0, 0L, TimeUnit.NANOSECONDS));
        doNothing().when(target).changeState(AbstractCircuitBreaker.State.CLOSED);
        //Act Statement(s)
        boolean result = target.checkState();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).changeState(AbstractCircuitBreaker.State.CLOSED);
        });
    }

    //Sapient generated method id: ${328aa1d6-1f3c-3a7e-91ac-06389de54bd1}
    @Disabled()
    @Test()
    void checkStateWhenUpdateCheckIntervalDataNotCurrentDataNextDataAndStateStrategyCurrentStateNotIsStateTransitionThisCurrentD() {
        /* Branches:
         * (stateStrategy(currentState).isCheckIntervalFinished(this, currentData, time)) : true  #  inside nextCheckIntervalData method
         * (currentData == nextData) : false  #  inside updateCheckIntervalData method
         * (checkIntervalData.compareAndSet(currentData, nextData)) : false  #  inside updateCheckIntervalData method
         * (!updateCheckIntervalData(currentData, nextData)) : true  #  inside performStateCheck method
         * (stateStrategy(currentState).isStateTransition(this, currentData, nextData)) : false  #  inside performStateCheck method
         * (!isOpen(currentState)) : false  #  inside performStateCheck method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EventCountCircuitBreaker target = new EventCountCircuitBreaker(0, 0L, TimeUnit.NANOSECONDS, 0, 0L, TimeUnit.NANOSECONDS);
        //Act Statement(s)
        boolean result = target.checkState();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${6e50f53a-b093-37f1-b26f-509276afa084}
    @Disabled()
    @Test()
    void incrementAndCheckState1WhenStateStrategyCurrentStateNotIsStateTransitionThisCurrentDataNextDataAndIsOpenCurrentState() {
        /* Branches:
         * (stateStrategy(currentState).isCheckIntervalFinished(this, currentData, time)) : false  #  inside nextCheckIntervalData method
         * (currentData == nextData) : true  #  inside updateCheckIntervalData method
         * (!updateCheckIntervalData(currentData, nextData)) : false  #  inside performStateCheck method
         * (stateStrategy(currentState).isStateTransition(this, currentData, nextData)) : false  #  inside performStateCheck method
         * (!isOpen(currentState)) : false  #  inside performStateCheck method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EventCountCircuitBreaker target = new EventCountCircuitBreaker(0, 0L, TimeUnit.NANOSECONDS, 0, 0L, TimeUnit.NANOSECONDS);
        //Act Statement(s)
        boolean result = target.incrementAndCheckState(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${e2e3f4dd-6ea3-3500-9fb2-e7390d11c635}
    @Disabled()
    @Test()
    void incrementAndCheckState1WhenIsOpenNotCurrentState() {
        /* Branches:
         * (stateStrategy(currentState).isCheckIntervalFinished(this, currentData, time)) : true  #  inside nextCheckIntervalData method
         * (currentData == nextData) : false  #  inside updateCheckIntervalData method
         * (checkIntervalData.compareAndSet(currentData, nextData)) : true  #  inside updateCheckIntervalData method
         * (!updateCheckIntervalData(currentData, nextData)) : false  #  inside performStateCheck method
         * (stateStrategy(currentState).isStateTransition(this, currentData, nextData)) : true  #  inside performStateCheck method
         * (!isOpen(currentState)) : true  #  inside performStateCheck method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EventCountCircuitBreaker target = spy(new EventCountCircuitBreaker(0, 0L, TimeUnit.NANOSECONDS, 0, 0L, TimeUnit.NANOSECONDS));
        doNothing().when(target).changeState(AbstractCircuitBreaker.State.CLOSED);
        //Act Statement(s)
        boolean result = target.incrementAndCheckState(0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).changeState(AbstractCircuitBreaker.State.CLOSED);
        });
    }

    //Sapient generated method id: ${82571de6-99ef-3325-acd6-f01d98f65f37}
    @Disabled()
    @Test()
    void incrementAndCheckState1WhenUpdateCheckIntervalDataNotCurrentDataNextDataAndStateStrategyCurrentStateNotIsStateTransitio() {
        /* Branches:
         * (stateStrategy(currentState).isCheckIntervalFinished(this, currentData, time)) : true  #  inside nextCheckIntervalData method
         * (currentData == nextData) : false  #  inside updateCheckIntervalData method
         * (checkIntervalData.compareAndSet(currentData, nextData)) : false  #  inside updateCheckIntervalData method
         * (!updateCheckIntervalData(currentData, nextData)) : true  #  inside performStateCheck method
         * (stateStrategy(currentState).isStateTransition(this, currentData, nextData)) : false  #  inside performStateCheck method
         * (!isOpen(currentState)) : false  #  inside performStateCheck method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EventCountCircuitBreaker target = new EventCountCircuitBreaker(0, 0L, TimeUnit.NANOSECONDS, 0, 0L, TimeUnit.NANOSECONDS);
        //Act Statement(s)
        boolean result = target.incrementAndCheckState(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${d9e352db-5faa-33e5-8310-e12e6ff0191c}
    @Test()
    void incrementAndCheckState2WhenIncrementAndCheckState1() {
        /* Branches:
         * (incrementAndCheckState(1)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EventCountCircuitBreaker target = spy(new EventCountCircuitBreaker(0, 0L, TimeUnit.NANOSECONDS, 0, 0L, TimeUnit.NANOSECONDS));
        doReturn(true).when(target).incrementAndCheckState(1);
        //Act Statement(s)
        boolean result = target.incrementAndCheckState();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).incrementAndCheckState(1);
        });
    }

    //Sapient generated method id: ${c58335a3-a4b9-3a0e-8e88-221f307f3064}
    @Test()
    void incrementAndCheckState2WhenIncrementAndCheckStateNot1() {
        /* Branches:
         * (incrementAndCheckState(1)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EventCountCircuitBreaker target = spy(new EventCountCircuitBreaker(0, 0L, TimeUnit.NANOSECONDS, 0, 0L, TimeUnit.NANOSECONDS));
        doReturn(false).when(target).incrementAndCheckState(1);
        //Act Statement(s)
        boolean result = target.incrementAndCheckState();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target).incrementAndCheckState(1);
        });
    }

    //Sapient generated method id: ${f345d4d3-6c9b-342c-998d-9a80cab36df2}
    @Test()
    void openTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EventCountCircuitBreaker target = spy(new EventCountCircuitBreaker(0, 0L, TimeUnit.NANOSECONDS, 0, 0L, TimeUnit.NANOSECONDS));
        doNothing().when(target).changeState(AbstractCircuitBreaker.State.OPEN);
        //Act Statement(s)
        target.open();
        //Assert statement(s)
        assertAll("result", () -> verify(target).changeState(AbstractCircuitBreaker.State.OPEN));
    }

    //Sapient generated method id: ${4338ea80-df41-3c09-b3eb-b0476a460c1f}
    @Test()
    void closeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EventCountCircuitBreaker target = spy(new EventCountCircuitBreaker(0, 0L, TimeUnit.NANOSECONDS, 0, 0L, TimeUnit.NANOSECONDS));
        doNothing().when(target).changeState(AbstractCircuitBreaker.State.CLOSED);
        //Act Statement(s)
        target.close();
        //Assert statement(s)
        assertAll("result", () -> verify(target).changeState(AbstractCircuitBreaker.State.CLOSED));
    }

    //Sapient generated method id: ${c9bee9c0-6c37-322b-9588-97f1e1c82d5c}
    @Disabled()
    @Test()
    void nanoTimeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EventCountCircuitBreaker target = new EventCountCircuitBreaker(0, 0L, TimeUnit.NANOSECONDS, 0, 0L, TimeUnit.NANOSECONDS);
        //Act Statement(s)
        long result = target.nanoTime();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }
}
