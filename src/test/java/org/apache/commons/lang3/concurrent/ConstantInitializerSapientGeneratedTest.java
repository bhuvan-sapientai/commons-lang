package org.apache.commons.lang3.concurrent;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConstantInitializerSapientGeneratedTest {

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}
    @Test()
    void getTest() throws ConcurrentException {
        //Arrange Statement(s)
        Object object = new Object();
        ConstantInitializer target = new ConstantInitializer(object);
        //Act Statement(s)
        Object result = target.get();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${36be940e-f718-3050-aec3-bf96aab4a9db}
    @Test()
    void isInitializedTest() {
        //Arrange Statement(s)
        Object object = new Object();
        ConstantInitializer target = new ConstantInitializer(object);
        //Act Statement(s)
        boolean result = target.isInitialized();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Disabled()
    @Test()
    void toStringTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ConstantInitializer target = new ConstantInitializer(object);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("ConstantInitializer@0 [ object = A ]")));
    }
}
