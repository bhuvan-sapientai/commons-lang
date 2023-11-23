package org.apache.commons.lang3.concurrent;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LazyInitializerSapientGeneratedTest {

    //Sapient generated method id: ${ed212fe2-2afd-3617-872a-5724a1f34c1c}
    @Disabled()
    @Test()
    void builderTest() {
        //Act Statement(s)
        LazyInitializer.Builder<LazyInitializer<Object>, Object> result = LazyInitializer.builder();
        LazyInitializer.Builder<LazyInitializer<Object>, Object> lazyInitializerBuilder = new LazyInitializer.Builder<>();
        //Assert statement(s)
        //TODO: Please implement equals method in Builder for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(lazyInitializerBuilder)));
    }

    //Sapient generated method id: ${2e343c12-20aa-3d58-be34-b45a587e32de}
    @Test()
    void getWhenResultEqualsNO_INIT() throws Exception {
        /* Branches:
         * (result == NO_INIT) : true
         * (result == NO_INIT) : true
         */
        //Arrange Statement(s)
        LazyInitializer target = spy(new LazyInitializer());
        Object object = new Object();
        doReturn(object).when(target).initialize();
        //Act Statement(s)
        Object result = target.get();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(object));
            verify(target).initialize();
        });
    }

    //Sapient generated method id: ${74bc01be-c8d9-36c9-aeb0-b7740f09582a}
    @Disabled()
    @Test()
    void isInitializedWhenObjectNotEqualsNO_INIT() {
        /* Branches:
         * (object != NO_INIT) : true
         */
        //Arrange Statement(s)
        LazyInitializer target = new LazyInitializer();
        //Act Statement(s)
        boolean result = target.isInitialized();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${2cfb8708-efc4-3f44-a2cf-e476e417b10e}
    @Test()
    void isInitializedWhenObjectEqualsNO_INIT() {
        /* Branches:
         * (object != NO_INIT) : false
         */
        //Arrange Statement(s)
        LazyInitializer target = new LazyInitializer();
        //Act Statement(s)
        boolean result = target.isInitialized();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${4c4fead5-dcfd-313d-a47b-e83ad23f6769}
    @Disabled()
    @Test()
    void getTypedException1Test() {
        //Arrange Statement(s)
        LazyInitializer target = new LazyInitializer();
        Exception exception = new Exception();
        //Act Statement(s)
        ConcurrentException result = target.getTypedException(exception);
        ConcurrentException concurrentException = new ConcurrentException(exception);
        //Assert statement(s)
        //TODO: Please implement equals method in ConcurrentException for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(concurrentException)));
    }
}
