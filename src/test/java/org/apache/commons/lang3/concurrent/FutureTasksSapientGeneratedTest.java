package org.apache.commons.lang3.concurrent;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FutureTasksSapientGeneratedTest {

    //Sapient generated method id: ${ef8a815d-5b58-3af3-b941-bad6d059cca5}
    @Disabled(value = "Potential harmful system call (FutureTask.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    void runTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Callable<Object> callable = null;
        //Act Statement(s)
        FutureTask result = FutureTasks.run(callable);
        FutureTask<Object> futureTask = new FutureTask<>((Callable) null);
        //Assert statement(s)
        //TODO: Please implement equals method in FutureTask for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(futureTask)));
    }
}
