package org.apache.commons.lang3.concurrent;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CallableBackgroundInitializerSapientGeneratedTest {

    //Sapient generated method id: ${0d61017c-e19b-300f-9703-dccf93be2a65}
    @Disabled()
    @Test()
    void initialize1Test() throws Exception {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CallableBackgroundInitializer target = new CallableBackgroundInitializer((Callable) null, (ExecutorService) null);
        //Act Statement(s)
        Object result = target.initialize();
        Object object = new Object();
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${4c4fead5-dcfd-313d-a47b-e83ad23f6769}
    @Disabled()
    @Test()
    void getTypedException1Test() {
        //Arrange Statement(s)
        CallableBackgroundInitializer target = new CallableBackgroundInitializer((Callable) null, (ExecutorService) null);
        Exception exception = new Exception();
        //Act Statement(s)
        Exception result = target.getTypedException(exception);
        Exception exception2 = new Exception(exception);
        //Assert statement(s)
        //TODO: Please implement equals method in Exception for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(exception2)));
    }
}
