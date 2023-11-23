package org.apache.commons.lang3.concurrent;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MemoizerSapientGeneratedTest {

    //Sapient generated method id: ${e022dd50-ee00-3029-91de-7c419773931f}
    @Disabled(value = "Potential harmful system call (Future.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    void computeTest() throws InterruptedException, ExecutionException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Memoizer target = new Memoizer((Computable) null, false);
        Object object = new Object();
        //Act Statement(s)
        Object result = target.compute(object);
        Object object2 = new Object();
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object2)));
    }

    //Sapient generated method id: ${80ba8494-d6d5-3cf8-9fdc-64a2022ed8f3}
    @Disabled(value = "Potential harmful system call (Future.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    void computeWhenCaughtCancellationException() throws InterruptedException, ExecutionException {
        /* Branches:
         * (catch-exception (CancellationException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Memoizer target = new Memoizer((Computable) null, false);
        Object object = new Object();
        //Act Statement(s)
        Object result = target.compute(object);
    }

    //Sapient generated method id: ${e0c3b259-6cb2-37d1-ab1a-3713597689d5}
    @Disabled(value = "Potential harmful system call (Future.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    void computeWhenRecalculateThrowsIllegalStateException() throws InterruptedException, ExecutionException {
        /* Branches:
         * (catch-exception (ExecutionException)) : true
         * (recalculate) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Memoizer target = new Memoizer((Computable) null, true);
        Object object = new Object();
        Throwable throwable = new Throwable();
        IllegalStateException illegalStateException = new IllegalStateException("Unchecked exception", throwable);
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.compute(object);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            assertThat(result.getCause(), isA(throwable.getClass()));
        });
    }
}
