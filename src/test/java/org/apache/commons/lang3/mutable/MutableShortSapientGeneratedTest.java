package org.apache.commons.lang3.mutable;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.closeTo;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MutableShortSapientGeneratedTest {

    //Sapient generated method id: ${b0d20fa9-e250-397e-b581-b3faccc5922b}
    @Test()
    void getValueTest() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 1);
        //Act Statement(s)
        Short result = target.getValue();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 1)));
    }

    //Sapient generated method id: ${3a069434-0a20-3c0a-b281-65568fb6e90d}
    @Test()
    void setValue1Test() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 0);
        //Act Statement(s)
        target.setValue(1);
    }

    //Sapient generated method id: ${d92442e6-cddd-31db-b2df-1af19fc2f595}
    @Test()
    void incrementTest() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) -1);
        //Act Statement(s)
        target.increment();
    }

    //Sapient generated method id: ${bbae3125-0cb3-334f-97c3-39c7da056dc4}
    @Test()
    void getAndIncrementTest() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) -1);
        //Act Statement(s)
        short result = target.getAndIncrement();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) -1)));
    }

    //Sapient generated method id: ${890f896f-c388-3106-a430-8811e86b0db6}
    @Test()
    void incrementAndGetTest() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) -1);
        //Act Statement(s)
        short result = target.incrementAndGet();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }

    //Sapient generated method id: ${0dcc1d22-7fa4-328c-80de-22c9ae9d2bf0}
    @Test()
    void decrementTest() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 1);
        //Act Statement(s)
        target.decrement();
    }

    //Sapient generated method id: ${fae6f0a6-e362-3b8b-a92c-1d02d9fd0672}
    @Test()
    void getAndDecrementTest() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 1);
        //Act Statement(s)
        short result = target.getAndDecrement();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 1)));
    }

    //Sapient generated method id: ${ea46b7d1-8a0f-3621-b6a8-12e1b7d43e79}
    @Test()
    void decrementAndGetTest() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 1);
        //Act Statement(s)
        short result = target.decrementAndGet();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }

    //Sapient generated method id: ${2f52d914-224e-3cf8-a2e5-c61089a0f6f4}
    @Test()
    void addTest() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 0);
        //Act Statement(s)
        target.add((short) 0);
    }

    //Sapient generated method id: ${c171c54c-6269-3c0b-b712-82c3caeff653}
    @Test()
    void add1Test() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 0);
        //Act Statement(s)
        target.add(0);
    }

    //Sapient generated method id: ${97b5e3b9-042a-36e9-ba00-8365659a5608}
    @Test()
    void subtractTest() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 0);
        //Act Statement(s)
        target.subtract((short) 0);
    }

    //Sapient generated method id: ${5908211b-82d8-3fa8-a6d0-2be222d4a70b}
    @Test()
    void subtract1Test() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 0);
        //Act Statement(s)
        target.subtract(0);
    }

    //Sapient generated method id: ${1398fbfe-b231-35e3-9e1c-683ed1d4d73d}
    @Test()
    void addAndGetTest() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 0);
        //Act Statement(s)
        short result = target.addAndGet((short) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }

    //Sapient generated method id: ${665959d3-3962-349d-ab3e-782533879234}
    @Test()
    void addAndGet1Test() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 0);
        //Act Statement(s)
        short result = target.addAndGet(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }

    //Sapient generated method id: ${61f8febd-b51c-3ca7-9d82-9e442a3a6b8e}
    @Test()
    void getAndAddTest() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 0);
        //Act Statement(s)
        short result = target.getAndAdd((short) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }

    //Sapient generated method id: ${ac1aec5a-7d5e-3bde-8bb7-ae4975dfb17a}
    @Test()
    void getAndAdd1Test() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 0);
        //Act Statement(s)
        short result = target.getAndAdd(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }

    //Sapient generated method id: ${8cf02827-a127-3a36-a5a5-60f0cd935f11}
    @Test()
    void shortValueTest() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 0);
        //Act Statement(s)
        short result = target.shortValue();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }

    //Sapient generated method id: ${767dc907-1074-3191-bfda-0a702630b7c3}
    @Test()
    void intValueTest() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort(0);
        //Act Statement(s)
        int result = target.intValue();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${9023386b-0a58-3cc3-912f-1a61aadf88ac}
    @Test()
    void longValueTest() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 1);
        //Act Statement(s)
        long result = target.longValue();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1L)));
    }

    //Sapient generated method id: ${aeac4aab-4829-3a1e-aab9-a9108ac2e6bd}
    @Test()
    void floatValueTest() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 0);
        //Act Statement(s)
        float result = target.floatValue();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("0.0"))));
    }

    //Sapient generated method id: ${6f7e6bb6-bfda-39e2-9303-4545aceabb0b}
    @Test()
    void doubleValueTest() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 0);
        //Act Statement(s)
        double result = target.doubleValue();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${3abd5914-020e-3dac-9c32-b505f6c12002}
    @Test()
    void toShortTest() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 1);
        //Act Statement(s)
        Short result = target.toShort();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 1)));
    }

    //Sapient generated method id: ${af5f6332-26a2-3749-8f9a-ac87ce6fe7cf}
    @Disabled()
    @Test()
    void compareToTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 1);
        //TODO: Needs initialization with real value
        MutableShort mutableShort = null;
        //Act Statement(s)
        int result = target.compareTo(mutableShort);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Test()
    void toStringTest() {
        //Arrange Statement(s)
        MutableShort target = new MutableShort((short) 2);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("2")));
    }
}
