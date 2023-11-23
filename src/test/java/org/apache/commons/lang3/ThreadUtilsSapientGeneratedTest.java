package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.time.Duration;
import java.util.Collection;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.function.Predicate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ThreadUtilsSapientGeneratedTest {

    //Sapient generated method id: ${62b3e488-5259-3c6d-89ad-ea70754235b3}
    @Test()
    void findThreadByIdWhenThreadIdLessThanOrEqualsTo0ThrowsIllegalArgumentException() {
        /* Branches:
         * (threadId <= 0) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The thread id must be greater than zero");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            ThreadUtils.findThreadById(-1L);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${aadbb6a5-c4d0-31c6-a45e-336bc8fe76aa}
    @Test()
    void findThreadByIdWhenResultIsEmpty() {
        /* Branches:
         * (threadId <= 0) : false
         * (result.isEmpty()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ThreadUtils> threadUtils = mockStatic(ThreadUtils.class, CALLS_REAL_METHODS)) {
            Collection<Thread> collection = new ArrayList<>();
            threadUtils.when(() -> ThreadUtils.findThreads((Predicate) any())).thenReturn(collection);
            //Act Statement(s)
            Thread result = ThreadUtils.findThreadById(1L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                threadUtils.verify(() -> ThreadUtils.findThreads((Predicate) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3bfc9a04-8b8a-3141-b576-83fdca096221}
    @Test()
    void findThreadByIdWhenResultNotIsEmpty() {
        /* Branches:
         * (threadId <= 0) : false
         * (result.isEmpty()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ThreadUtils> threadUtils = mockStatic(ThreadUtils.class, CALLS_REAL_METHODS)) {
            Thread thread = new Thread();
            Collection<Thread> collection = new ArrayList<>();
            collection.add(thread);
            threadUtils.when(() -> ThreadUtils.findThreads((Predicate) any())).thenReturn(collection);
            //Act Statement(s)
            Thread result = ThreadUtils.findThreadById(1L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(thread));
                threadUtils.verify(() -> ThreadUtils.findThreads((Predicate) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4d027dc1-efdb-383d-b1b7-7025c5a1c83c}
    @Test()
    void findThreadById1WhenThreadGetThreadGroupGetNameEqualsThreadGroupName() {
        /* Branches:
         * (thread != null) : true
         * (thread.getThreadGroup() != null) : true
         * (thread.getThreadGroup().getName().equals(threadGroupName)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ThreadUtils> threadUtils = mockStatic(ThreadUtils.class, CALLS_REAL_METHODS)) {
            Thread thread = new Thread();
            threadUtils.when(() -> ThreadUtils.findThreadById(1L)).thenReturn(thread);
            //Act Statement(s)
            Thread result = ThreadUtils.findThreadById(1L, "main");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(thread));
                threadUtils.verify(() -> ThreadUtils.findThreadById(1L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${027e6d5a-0799-316e-9234-97c84ba5a9c1}
    @Disabled()
    @Test()
    void findThreadById1WhenThreadGetThreadGroupGetNameNotEqualsThreadGroupName() {
        /* Branches:
         * (thread != null) : true
         * (thread.getThreadGroup() != null) : true
         * (thread.getThreadGroup().getName().equals(threadGroupName)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ThreadUtils> threadUtils = mockStatic(ThreadUtils.class, CALLS_REAL_METHODS)) {
            Thread thread = new Thread();
            threadUtils.when(() -> ThreadUtils.findThreadById(1L)).thenReturn(thread);
            //Act Statement(s)
            Thread result = ThreadUtils.findThreadById(1L, "main");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                threadUtils.verify(() -> ThreadUtils.findThreadById(1L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${17b36b46-e8c9-3572-86c3-498a1113bc13}
    @Disabled()
    @Test()
    void findThreadById2WhenThreadGroupEqualsThreadGetThreadGroup() {
        /* Branches:
         * (thread != null) : true
         * (threadGroup.equals(thread.getThreadGroup())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ThreadUtils> threadUtils = mockStatic(ThreadUtils.class, CALLS_REAL_METHODS)) {
            Thread thread = new Thread();
            threadUtils.when(() -> ThreadUtils.findThreadById(1L)).thenReturn(thread);
            ThreadGroup threadGroup = new ThreadGroup("name1");
            //Act Statement(s)
            Thread result = ThreadUtils.findThreadById(1L, threadGroup);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(thread));
                threadUtils.verify(() -> ThreadUtils.findThreadById(1L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a6939b82-5213-3831-b148-bf09505011f9}
    @Test()
    void findThreadById2WhenThreadGroupNotEqualsThreadGetThreadGroup() {
        /* Branches:
         * (thread != null) : true
         * (threadGroup.equals(thread.getThreadGroup())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ThreadUtils> threadUtils = mockStatic(ThreadUtils.class, CALLS_REAL_METHODS)) {
            Thread thread = new Thread();
            threadUtils.when(() -> ThreadUtils.findThreadById(1L)).thenReturn(thread);
            ThreadGroup threadGroup = new ThreadGroup("name1");
            //Act Statement(s)
            Thread result = ThreadUtils.findThreadById(1L, threadGroup);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                threadUtils.verify(() -> ThreadUtils.findThreadById(1L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8b89e0f5-ec4e-396f-89c2-0072182ae5d8}
    @Test()
    void findThreadGroupsTest() {
        //Arrange Statement(s)
        try (MockedStatic<ThreadUtils> threadUtils = mockStatic(ThreadUtils.class, CALLS_REAL_METHODS)) {
            ThreadGroup threadGroup = new ThreadGroup("name1");
            threadUtils.when(() -> ThreadUtils.getSystemThreadGroup()).thenReturn(threadGroup);
            Collection<ThreadGroup> collection = new ArrayList<>();
            threadUtils.when(() -> ThreadUtils.findThreadGroups(threadGroup, true, (Predicate) null)).thenReturn(collection);
            //TODO: Needs initialization with real value
            Predicate<ThreadGroup> predicate = null;
            //Act Statement(s)
            Collection<ThreadGroup> result = ThreadUtils.findThreadGroups(predicate);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(collection));
                threadUtils.verify(() -> ThreadUtils.getSystemThreadGroup(), atLeast(1));
                threadUtils.verify(() -> ThreadUtils.findThreadGroups(threadGroup, true, (Predicate) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a07861ae-084d-3aa5-80d3-3981117a7be3}
    @Disabled()
    @Test()
    void findThreadGroups1WhenCountLessThanThreadGroupsLength() {
        /* Branches:
         * (count >= threadGroups.length) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ThreadGroup threadGroup = new ThreadGroup("name1");
        //TODO: Needs initialization with real value
        Predicate<ThreadGroup> predicate = null;
        //Act Statement(s)
        Collection<ThreadGroup> result = ThreadUtils.findThreadGroups(threadGroup, true, predicate);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${b32c1f09-adad-3618-9c54-bfea5d360cd7}
    @Test()
    void findThreadGroupsByNameTest() {
        //Arrange Statement(s)
        try (MockedStatic<ThreadUtils> threadUtils = mockStatic(ThreadUtils.class, CALLS_REAL_METHODS)) {
            Collection<ThreadGroup> collection = new ArrayList<>();
            threadUtils.when(() -> ThreadUtils.findThreadGroups((Predicate) any())).thenReturn(collection);
            //Act Statement(s)
            Collection<ThreadGroup> result = ThreadUtils.findThreadGroupsByName("threadGroupName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(collection));
                threadUtils.verify(() -> ThreadUtils.findThreadGroups((Predicate) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f2f41e9f-d476-3306-a372-e1ef4d15ce8e}
    @Test()
    void findThreadsTest() {
        //Arrange Statement(s)
        try (MockedStatic<ThreadUtils> threadUtils = mockStatic(ThreadUtils.class, CALLS_REAL_METHODS)) {
            ThreadGroup threadGroup = new ThreadGroup("name1");
            threadUtils.when(() -> ThreadUtils.getSystemThreadGroup()).thenReturn(threadGroup);
            Collection<Thread> collection = new ArrayList<>();
            threadUtils.when(() -> ThreadUtils.findThreads(threadGroup, true, (Predicate) null)).thenReturn(collection);
            //TODO: Needs initialization with real value
            Predicate<Thread> predicate = null;
            //Act Statement(s)
            Collection<Thread> result = ThreadUtils.findThreads(predicate);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(collection));
                threadUtils.verify(() -> ThreadUtils.getSystemThreadGroup(), atLeast(1));
                threadUtils.verify(() -> ThreadUtils.findThreads(threadGroup, true, (Predicate) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b83892b9-0b98-37cf-98a5-dfe9fe832ee0}
    @Disabled()
    @Test()
    void findThreads1WhenCountLessThanThreadsLength() {
        /* Branches:
         * (count >= threads.length) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ThreadGroup threadGroup = new ThreadGroup("name1");
        //TODO: Needs initialization with real value
        Predicate<Thread> predicate = null;
        //Act Statement(s)
        Collection<Thread> result = ThreadUtils.findThreads(threadGroup, true, predicate);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${bb9940e5-9b85-3e23-b912-5292a8b231de}
    @Test()
    void findThreadsByNameTest() {
        //Arrange Statement(s)
        try (MockedStatic<ThreadUtils> threadUtils = mockStatic(ThreadUtils.class, CALLS_REAL_METHODS)) {
            Collection<Thread> collection = new ArrayList<>();
            threadUtils.when(() -> ThreadUtils.findThreads((Predicate) any())).thenReturn(collection);
            //Act Statement(s)
            Collection<Thread> result = ThreadUtils.findThreadsByName("threadName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(collection));
                threadUtils.verify(() -> ThreadUtils.findThreads((Predicate) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${17231689-908f-3609-854d-8414289e8b58}
    @Disabled()
    @Test()
    void findThreadsByName1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ThreadUtils> threadUtils = mockStatic(ThreadUtils.class, CALLS_REAL_METHODS)) {
            ThreadGroup threadGroup = new ThreadGroup("name1");
            Collection<ThreadGroup> collection = new ArrayList<>();
            collection.add(threadGroup);
            threadUtils.when(() -> ThreadUtils.findThreadGroups((Predicate) any())).thenReturn(collection);
            Thread thread = new Thread();
            Collection<Thread> collection2 = new ArrayList<>(Arrays.asList(thread));
            threadUtils.when(() -> ThreadUtils.findThreads(eq(threadGroup), eq(false), (Predicate) any())).thenReturn(collection2);
            //Act Statement(s)
            Collection<Thread> result = ThreadUtils.findThreadsByName("threadName1", "threadGroupName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                threadUtils.verify(() -> ThreadUtils.findThreadGroups((Predicate) any()), atLeast(1));
                threadUtils.verify(() -> ThreadUtils.findThreads(eq(threadGroup), eq(false), (Predicate) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6f749b15-9b55-37a1-a049-9bdbbb367096}
    @Test()
    void findThreadsByName2Test() {
        //Arrange Statement(s)
        try (MockedStatic<ThreadUtils> threadUtils = mockStatic(ThreadUtils.class, CALLS_REAL_METHODS)) {
            Collection<Thread> collection = new ArrayList<>();
            ThreadGroup threadGroup = new ThreadGroup("name1");
            threadUtils.when(() -> ThreadUtils.findThreads(eq(threadGroup), eq(false), (Predicate) any())).thenReturn(collection);
            //Act Statement(s)
            Collection<Thread> result = ThreadUtils.findThreadsByName("threadName1", threadGroup);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(collection));
                threadUtils.verify(() -> ThreadUtils.findThreads(eq(threadGroup), eq(false), (Predicate) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${563584bb-4a90-3e4e-a0ef-b49f76cc26c4}
    @Test()
    void getAllThreadGroupsTest() {
        //Arrange Statement(s)
        try (MockedStatic<ThreadUtils> threadUtils = mockStatic(ThreadUtils.class, CALLS_REAL_METHODS)) {
            Collection<ThreadGroup> collection = new ArrayList<>();
            threadUtils.when(() -> ThreadUtils.findThreadGroups((Predicate) any())).thenReturn(collection);
            //Act Statement(s)
            Collection<ThreadGroup> result = ThreadUtils.getAllThreadGroups();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(collection));
                threadUtils.verify(() -> ThreadUtils.findThreadGroups((Predicate) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${51947fbe-adf1-37a1-a281-42bc6b1f9d07}
    @Test()
    void getAllThreadsTest() {
        //Arrange Statement(s)
        try (MockedStatic<ThreadUtils> threadUtils = mockStatic(ThreadUtils.class, CALLS_REAL_METHODS)) {
            Collection<Thread> collection = new ArrayList<>();
            threadUtils.when(() -> ThreadUtils.findThreads((Predicate) any())).thenReturn(collection);
            //Act Statement(s)
            Collection<Thread> result = ThreadUtils.getAllThreads();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(collection));
                threadUtils.verify(() -> ThreadUtils.findThreads((Predicate) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c40ac4b1-f983-3d66-b649-d14d815c40d0}
    @Test()
    void getSystemThreadGroupWhenThreadGroupGetParentIsNotNull() {
        /* Branches:
         * (threadGroup != null) : true
         * (threadGroup.getParent() != null) : true
         */
        //Act Statement(s)
        ThreadGroup result = ThreadUtils.getSystemThreadGroup();
        Thread thread = Thread.currentThread();
        ThreadGroup threadGroup = thread.getThreadGroup();
        ThreadGroup threadGroup2 = threadGroup.getParent();
        //Assert statement(s)
        //TODO: Please implement equals method in ThreadGroup for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(threadGroup2)));
    }

    //Sapient generated method id: ${48c37f1f-f666-3286-8fa6-93184e92bee8}
    @Test()
    void joinTest() throws InterruptedException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Thread thread = new Thread();
        Duration duration = Duration.ofDays(0L);
        //Act Statement(s)
        ThreadUtils.join(thread, duration);
    }

    //Sapient generated method id: ${c72cede0-4b6f-3a5d-9842-93e94d5152ff}
    @Test()
    void sleepTest() throws InterruptedException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Duration duration = Duration.ofDays(0L);
        //Act Statement(s)
        ThreadUtils.sleep(duration);
    }

    //Sapient generated method id: ${9ff92c18-9f84-3bca-87bf-d59d51e4edbb}
    @Test()
    void sleepQuietlyTest() throws InterruptedException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Duration duration = Duration.ofDays(0L);
        //Act Statement(s)
        ThreadUtils.sleepQuietly(duration);
    }

    //Sapient generated method id: ${33d9f4e7-e7a9-376c-a94d-f7c9f58981f0}
    @Test()
    void sleepQuietlyWhenCaughtInterruptedException() throws InterruptedException {
        /* Branches:
         * (catch-exception (InterruptedException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Duration duration = Duration.ofDays(0L);
        //Act Statement(s)
        ThreadUtils.sleepQuietly(duration);
    }
}
