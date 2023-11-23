package org.apache.commons.lang3.concurrent;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MultiBackgroundInitializerSapientGeneratedTest {

    //Sapient generated method id: ${f5da140a-562a-39fc-87d6-bec9cef688a7}
    @Disabled()
    @Test()
    void addInitializerWhenIsStartedThrowsIllegalStateException() {
        /* Branches:
         * (isStarted()) : true
         */
        //Arrange Statement(s)
        MultiBackgroundInitializer target = spy(new MultiBackgroundInitializer((ExecutorService) null));
        doReturn(true).when(target).isStarted();
        //TODO: Needs initialization with real value
        BackgroundInitializer<?> backgroundInitializer = null;
        IllegalStateException illegalStateException = new IllegalStateException("addInitializer() must not be called after start()!");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.addInitializer("name1", backgroundInitializer);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            verify(target).isStarted();
        });
    }

    //Sapient generated method id: ${161f1dcc-839b-33a0-8369-a10409de88a6}
    @Disabled()
    @Test()
    void addInitializerWhenIsStartedNot() {
        /* Branches:
         * (isStarted()) : false
         */
        //Arrange Statement(s)
        MultiBackgroundInitializer target = spy(new MultiBackgroundInitializer((ExecutorService) null));
        doReturn(false).when(target).isStarted();
        //TODO: Needs initialization with real value
        BackgroundInitializer<?> backgroundInitializer = null;
        //Act Statement(s)
        target.addInitializer("name1", backgroundInitializer);
        //Assert statement(s)
        assertAll("result", () -> verify(target).isStarted());
    }

    //Sapient generated method id: ${0a121177-3418-3ef2-9ebe-803c80daa8e3}
    @Disabled()
    @Test()
    void getTaskCountTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MultiBackgroundInitializer target = new MultiBackgroundInitializer((ExecutorService) null);
        //Act Statement(s)
        int result = target.getTaskCount();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(2)));
    }

    //Sapient generated method id: ${68e7d27e-ae54-39c2-a18a-ae359eb80011}
    @Test()
    void initialize1WhenInitsIsEmpty() throws Exception {
        /* Branches:
         * (inits.isEmpty()) : true
         */
        //Arrange Statement(s)
        MultiBackgroundInitializer target = new MultiBackgroundInitializer((ExecutorService) null);
        //Act Statement(s)
        MultiBackgroundInitializer.MultiBackgroundInitializerResults result = target.initialize();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${0dcfaa04-c85c-3b72-a558-cfa72a3afb27}
    @Test()
    void isInitializedWhenChildInitializersIsEmpty() {
        /* Branches:
         * (childInitializers.isEmpty()) : true
         */
        //Arrange Statement(s)
        MultiBackgroundInitializer target = new MultiBackgroundInitializer((ExecutorService) null);
        //Act Statement(s)
        boolean result = target.isInitialized();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${c4fd6e46-1b5b-3791-adfb-0f0c3e934a36}
    @Test()
    void closeWhenExceptionIsNull() throws Exception {
        /* Branches:
         * (for-each(childInitializers.values())) : false
         * (exception != null) : false
         */
        //Arrange Statement(s)
        MultiBackgroundInitializer target = new MultiBackgroundInitializer((ExecutorService) null);
        //Act Statement(s)
        target.close();
    }
}
