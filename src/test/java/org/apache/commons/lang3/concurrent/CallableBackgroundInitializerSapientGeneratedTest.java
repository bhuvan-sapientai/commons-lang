package org.apache.commons.lang3.concurrent;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CallableBackgroundInitializerSapientGeneratedTest {

    private final Callable callableMock = mock(Callable.class);

    private final ExecutorService executorServiceMock = mock(ExecutorService.class);

    //Sapient generated method id: ${getTypedException1Test}, hash: D9261A437C9CC496DE642EE171DFBAB6
    @Test()
    void getTypedException1Test() {
        //Arrange Statement(s)
        CallableBackgroundInitializer target = new CallableBackgroundInitializer(callableMock, executorServiceMock);
        Exception exception = new Exception();
        
        //Act Statement(s)
        Exception result = target.getTypedException(exception);
        
        //Assert statement(s)
        //TODO: Please implement equals method in Exception for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${initialize1Test}, hash: 490FD618D8F97ABAD649C2C215AA268A
    @Disabled()
    @Test()
    void initialize1Test() throws Exception {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Callable.call) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        CallableBackgroundInitializer target = new CallableBackgroundInitializer(callableMock, executorServiceMock);
        
        //Act Statement(s)
        Object result = target.initialize();
        
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
