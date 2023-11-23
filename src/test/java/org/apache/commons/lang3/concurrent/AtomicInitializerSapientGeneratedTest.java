package org.apache.commons.lang3.concurrent;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AtomicInitializerSapientGeneratedTest {

    //Sapient generated method id: ${ed212fe2-2afd-3617-872a-5724a1f34c1c}
    @Disabled()
    @Test()
    void builderTest() {
        //Act Statement(s)
        AtomicInitializer.Builder<AtomicInitializer<Object>, Object> result = AtomicInitializer.builder();
        AtomicInitializer.Builder<AtomicInitializer<Object>, Object> atomicInitializerBuilder = new AtomicInitializer.Builder<>();
        //Assert statement(s)
        //TODO: Please implement equals method in Builder for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(atomicInitializerBuilder)));
    }

    //Sapient generated method id: ${4c4fead5-dcfd-313d-a47b-e83ad23f6769}
    @Disabled()
    @Test()
    void getTypedException1Test() {
        //Arrange Statement(s)
        AtomicInitializer target = new AtomicInitializer();
        Exception exception = new Exception();
        //Act Statement(s)
        ConcurrentException result = target.getTypedException(exception);
        ConcurrentException concurrentException = new ConcurrentException(exception);
        //Assert statement(s)
        //TODO: Please implement equals method in ConcurrentException for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(concurrentException)));
    }
}
