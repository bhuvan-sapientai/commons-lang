package org.apache.commons.lang3.concurrent;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

import org.junit.jupiter.api.Disabled;
import org.mockito.stubbing.Answer;

import java.util.concurrent.ExecutorService;

import org.mockito.MockedStatic;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BackgroundInitializerSapientGeneratedTest {

    //Sapient generated method id: ${ed212fe2-2afd-3617-872a-5724a1f34c1c}
    @Disabled()
    @Test()
    void builderTest() {
        //Act Statement(s)
        BackgroundInitializer.Builder<BackgroundInitializer<Object>, Object> result = BackgroundInitializer.builder();
        BackgroundInitializer.Builder<BackgroundInitializer<Object>, Object> backgroundInitializerBuilder = new BackgroundInitializer.Builder<>();
        //Assert statement(s)
        //TODO: Please implement equals method in Builder for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(backgroundInitializerBuilder)));
    }

    //Sapient generated method id: ${6622f25d-a757-3657-897d-6e8d267e5dd1}
    @Test()
    void isInitializedWhenFutureIsNull() throws ExecutionException, InterruptedException {
        /* Branches:
         * (future == null) : true
         */
        //Arrange Statement(s)
        BackgroundInitializer target = new BackgroundInitializer((ExecutorService) null);
        //Act Statement(s)
        boolean result = target.isInitialized();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${12132c3c-0bc6-33cd-84d8-5a0220c99087}
    @Test()
    void isStartedWhenFutureIsNull() {
        /* Branches:
         * (future != null) : false
         */
        //Arrange Statement(s)
        BackgroundInitializer target = new BackgroundInitializer((ExecutorService) null);
        //Act Statement(s)
        boolean result = target.isStarted();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${2496d5f4-e0b7-3ea1-9258-46412530a16c}
    @Test()
    void setExternalExecutorWhenIsStartedThrowsIllegalStateException() {
        /* Branches:
         * (isStarted()) : true
         */
        //Arrange Statement(s)
        BackgroundInitializer target = spy(new BackgroundInitializer((ExecutorService) null));
        doReturn(true).when(target).isStarted();
        //TODO: Needs initialization with real value
        ExecutorService executorService = null;
        IllegalStateException illegalStateException = new IllegalStateException("Cannot set ExecutorService after start()!");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.setExternalExecutor(executorService);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            verify(target).isStarted();
        });
    }

    //Sapient generated method id: ${d33c5efa-f11c-3ce5-94c1-f5d7a8306d73}
    @Test()
    void setExternalExecutorWhenIsStartedNot() {
        /* Branches:
         * (isStarted()) : false
         */
        //Arrange Statement(s)
        BackgroundInitializer target = spy(new BackgroundInitializer((ExecutorService) null));
        doReturn(false).when(target).isStarted();
        //TODO: Needs initialization with real value
        ExecutorService executorService = null;
        //Act Statement(s)
        target.setExternalExecutor(executorService);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(target.getExternalExecutor(), is(nullValue()));
            verify(target).isStarted();
        });
    }

    //Sapient generated method id: ${398fbd16-0b04-3d0f-873b-7095b87d3bb9}
    @Test()
    void startWhenIsStarted() {
        /* Branches:
         * (!isStarted()) : false
         */
        //Arrange Statement(s)
        BackgroundInitializer target = spy(new BackgroundInitializer((ExecutorService) null));
        doReturn(true).when(target).isStarted();
        //Act Statement(s)
        boolean result = target.start();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target).isStarted();
        });
    }

    //Sapient generated method id: ${e4e5550c-704e-30ee-98d2-31ae2955cf8d}
    @Disabled(value = "Potential harmful system call (ExecutorService.submit) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    void startWhenExecutorIsNull() {
        /* Branches:
         * (!isStarted()) : true
         * (executor == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BackgroundInitializer target = spy(new BackgroundInitializer((ExecutorService) null));
        doReturn(false).when(target).isStarted();
        //Act Statement(s)
        boolean result = target.start();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).isStarted();
        });
    }

    //Sapient generated method id: ${3f1654f4-0942-34ab-a461-06ea5653f0ef}
    @Disabled(value = "Potential harmful system call (ExecutorService.submit) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    void startWhenExecutorIsNotNull() {
        /* Branches:
         * (!isStarted()) : true
         * (executor == null) : false
         */
        //Arrange Statement(s)
        BackgroundInitializer target = spy(new BackgroundInitializer((ExecutorService) null));
        doReturn(false).when(target).isStarted();
        //Act Statement(s)
        boolean result = target.start();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).isStarted();
        });
    }

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}
    @Disabled(value = "Potential harmful system call (Future.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    void getTest() throws ConcurrentException, ExecutionException, InterruptedException {
        //Arrange Statement(s)
        BackgroundInitializer target = spy(new BackgroundInitializer((ExecutorService) null));
        doReturn(null).when(target).getFuture();
        //Act Statement(s)
        Object result = target.get();
        Object object = new Object();
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, equalTo(object));
            verify(target).getFuture();
        });
    }

    //Sapient generated method id: ${ebefa8b5-4c6a-3623-93b4-c2372accb1c6}
    @Disabled(value = "Potential harmful system call (Future.get) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    void getWhenCaughtExecutionException() throws ConcurrentException, InterruptedException, ExecutionException {
        /* Branches:
         * (catch-exception (ExecutionException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConcurrentUtils> concurrentUtils = mockStatic(ConcurrentUtils.class)) {
            Throwable throwable = new Throwable();
            ExecutionException executionException = new ExecutionException(throwable);
            concurrentUtils.when(() -> ConcurrentUtils.handleCause(executionException)).thenAnswer((Answer<Void>) invocation -> null);
            BackgroundInitializer target = spy(new BackgroundInitializer((ExecutorService) null));
            doReturn(null).when(target).getFuture();
            //Act Statement(s)
            Object result = target.get();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                concurrentUtils.verify(() -> ConcurrentUtils.handleCause(executionException), atLeast(1));
                verify(target).getFuture();
            });
        }
    }

    //Sapient generated method id: ${f97c1192-d3a9-3baa-a94c-6ca12f6d3f2a}
    @Disabled(value = "Potential harmful system call (Future.get, Thread.interrupt) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    void getWhenCaughtInterruptedExceptionThrowsConcurrentException() throws ConcurrentException {
        /* Branches:
         * (catch-exception (InterruptedException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BackgroundInitializer target = spy(new BackgroundInitializer((ExecutorService) null));
        doReturn(null).when(target).getFuture();
        InterruptedException interruptedException = new InterruptedException();
        //Act Statement(s)
        final ConcurrentException result = assertThrows(ConcurrentException.class, () -> {
            target.get();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), isA(interruptedException.getClass()));
            verify(target).getFuture();
        });
    }

    //Sapient generated method id: ${0e03500e-ab9a-319d-86b7-5996a45b2f1c}
    @Test()
    void getFutureWhenFutureIsNullThrowsIllegalStateException() {
        /* Branches:
         * (future == null) : true
         */
        //Arrange Statement(s)
        BackgroundInitializer target = new BackgroundInitializer((ExecutorService) null);
        IllegalStateException illegalStateException = new IllegalStateException("start() must be called first!");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.getFuture();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${0a121177-3418-3ef2-9ebe-803c80daa8e3}
    @Test()
    void getTaskCountTest() {
        //Arrange Statement(s)
        BackgroundInitializer target = new BackgroundInitializer((ExecutorService) null);
        //Act Statement(s)
        int result = target.getTaskCount();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${4c4fead5-dcfd-313d-a47b-e83ad23f6769}
    @Disabled()
    @Test()
    void getTypedException1Test() {
        //Arrange Statement(s)
        BackgroundInitializer target = new BackgroundInitializer((ExecutorService) null);
        Exception exception = new Exception();
        //Act Statement(s)
        Exception result = target.getTypedException(exception);
        Exception exception2 = new Exception(exception);
        //Assert statement(s)
        //TODO: Please implement equals method in Exception for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(exception2)));
    }
}
