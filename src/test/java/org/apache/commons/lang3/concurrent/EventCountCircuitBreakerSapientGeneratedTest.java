package org.apache.commons.lang3.concurrent;

import org.apache.commons.lang3.concurrent.EventCountCircuitBreaker;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EventCountCircuitBreakerSapientGeneratedTest {

    @Test
    void checkStateWhenStateStrategyCurrentStateNotIsStateTransitionThisCurrentDataNextDataAndIsOpenCurrentState() {
        EventCountCircuitBreaker target = spy(new EventCountCircuitBreaker(10, 1000, TimeUnit.MILLISECONDS));
        doReturn(1000000000L).when(target).nanoTime();
        boolean result = target.checkState();
        assertFalse(result);
        verify(target, times(1)).nanoTime();
    }

    @Test
    void checkStateWhenIsOpenNotCurrentState() {
        EventCountCircuitBreaker target = spy(new EventCountCircuitBreaker(1, 100, TimeUnit.MILLISECONDS));
        doReturn(0L, 200000000L).when(target).nanoTime();
        target.incrementAndCheckState();
        boolean result = target.checkState();
        assertTrue(result);
        verify(target, times(2)).nanoTime();
    }

    @Test
    void checkStateWhenUpdateCheckIntervalDataNotCurrentDataNextDataAndStateStrategyCurrentStateNotIsStateTransitionThisCurrentD() {
        EventCountCircuitBreaker target = spy(new EventCountCircuitBreaker(10, 1000, TimeUnit.MILLISECONDS));
        doReturn(0L, 500000000L, 500000001L).when(target).nanoTime();
        target.incrementAndCheckState();
        boolean result = target.checkState();
        assertFalse(result);
        verify(target, times(3)).nanoTime();
    }

    @Test
    void closeTest() {
        EventCountCircuitBreaker target = spy(new EventCountCircuitBreaker(10, 1000, TimeUnit.MILLISECONDS));
        doReturn(1000000000L).when(target).nanoTime();
        target.open();
        target.close();
        assertTrue(target.checkState());
        verify(target, atLeastOnce()).nanoTime();
    }

    @Test
    void incrementAndCheckStateWhenIncrementAndCheckState1() {
        EventCountCircuitBreaker target = spy(new EventCountCircuitBreaker(2, 1000, TimeUnit.MILLISECONDS));
        doReturn(0L, 500000000L).when(target).nanoTime();
        boolean result = target.incrementAndCheckState();
        assertTrue(result);
        verify(target, times(2)).nanoTime();
    }

    @Test
    void incrementAndCheckStateWhenIncrementAndCheckStateNot1() {
        EventCountCircuitBreaker target = spy(new EventCountCircuitBreaker(1, 1000, TimeUnit.MILLISECONDS));
        doReturn(0L, 500000000L).when(target).nanoTime();
        target.incrementAndCheckState();
        boolean result = target.incrementAndCheckState();
        assertFalse(result);
        verify(target, times(2)).nanoTime();
    }

    @ParameterizedTest
    @CsvSource({ "0,true", "1,false" })
    void incrementAndCheckState2Test(int increment, boolean expected) {
        EventCountCircuitBreaker target = spy(new EventCountCircuitBreaker(1, 1000, TimeUnit.MILLISECONDS));
        doReturn(0L, 500000000L).when(target).nanoTime();
        boolean result = target.incrementAndCheckState(increment);
        assertEquals(expected, result);
        verify(target, atLeastOnce()).nanoTime();
    }

    @Test
    void nanoTimeTest() {
        EventCountCircuitBreaker target = new EventCountCircuitBreaker(10, 1000, TimeUnit.MILLISECONDS);
        long result = target.nanoTime();
        assertThat(result, greaterThan(0L));
    }

    @Test
    void openTest() {
        EventCountCircuitBreaker target = spy(new EventCountCircuitBreaker(10, 1000, TimeUnit.MILLISECONDS));
        doReturn(1000000000L).when(target).nanoTime();
        target.open();
        assertFalse(target.checkState());
        verify(target, atLeastOnce()).nanoTime();
    }

    @Test
    void testConstructorWithThreeParameters() {
        EventCountCircuitBreaker target = new EventCountCircuitBreaker(10, 1000, TimeUnit.MILLISECONDS);
        assertEquals(10, target.getOpeningThreshold());
        assertEquals(10, target.getClosingThreshold());
        assertEquals(1000000000L, target.getOpeningInterval());
        assertEquals(1000000000L, target.getClosingInterval());
    }

    @Test
    void testConstructorWithFourParameters() {
        EventCountCircuitBreaker target = new EventCountCircuitBreaker(10, 1000, TimeUnit.MILLISECONDS, 5);
        assertEquals(10, target.getOpeningThreshold());
        assertEquals(5, target.getClosingThreshold());
        assertEquals(1000000000L, target.getOpeningInterval());
        assertEquals(1000000000L, target.getClosingInterval());
    }

    @Test
    void testConstructorWithSixParameters() {
        EventCountCircuitBreaker target = new EventCountCircuitBreaker(10, 1000, TimeUnit.MILLISECONDS, 5, 2000, TimeUnit.MILLISECONDS);
        assertEquals(10, target.getOpeningThreshold());
        assertEquals(5, target.getClosingThreshold());
        assertEquals(1000000000L, target.getOpeningInterval());
        assertEquals(2000000000L, target.getClosingInterval());
    }

    @Test
    void testGetters() {
        EventCountCircuitBreaker target = new EventCountCircuitBreaker(10, 1000, TimeUnit.MILLISECONDS, 5, 2000, TimeUnit.MILLISECONDS);
        assertEquals(10, target.getOpeningThreshold());
        assertEquals(5, target.getClosingThreshold());
        assertEquals(1000000000L, target.getOpeningInterval());
        assertEquals(2000000000L, target.getClosingInterval());
    }
}
