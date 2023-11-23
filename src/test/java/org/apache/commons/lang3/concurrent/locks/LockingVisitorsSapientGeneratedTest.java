package org.apache.commons.lang3.concurrent.locks;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.util.concurrent.locks.StampedLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReadWriteLock;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LockingVisitorsSapientGeneratedTest {

    //Sapient generated method id: ${2284fc3d-473b-3992-886d-8fe431bd702d}
    @Disabled()
    @Test()
    void createTest() {
        //Arrange Statement(s)
        Object object = new Object();
        ReadWriteLock readWriteLock = null;
        //Act Statement(s)
        LockingVisitors.ReadWriteLockVisitor result = LockingVisitors.create(object, readWriteLock);
        LockingVisitors.ReadWriteLockVisitor lockingVisitorsReadWriteLockVisitor = new LockingVisitors.ReadWriteLockVisitor(object, (ReadWriteLock) null);
        //Assert statement(s)
        //TODO: Please implement equals method in ReadWriteLockVisitor for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(lockingVisitorsReadWriteLockVisitor)));
    }

    //Sapient generated method id: ${89eba046-442c-30b3-8d5a-babfcd9703a1}
    @Test()
    void reentrantReadWriteLockVisitorTest() {
        //Arrange Statement(s)
        try (MockedStatic<LockingVisitors> lockingVisitors = mockStatic(LockingVisitors.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            lockingVisitors.when(() -> LockingVisitors.create(eq(object), (ReentrantReadWriteLock) any())).thenReturn(null);
            //Act Statement(s)
            LockingVisitors.ReadWriteLockVisitor result = LockingVisitors.reentrantReadWriteLockVisitor(object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                lockingVisitors.verify(() -> LockingVisitors.create(eq(object), (ReentrantReadWriteLock) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d1f61be7-4b13-338a-a387-4f3a43fe4ef3}
    @Disabled()
    @Test()
    void stampedLockVisitorTest() {
        //Arrange Statement(s)
        Object object = new Object();
        //Act Statement(s)
        LockingVisitors.StampedLockVisitor result = LockingVisitors.stampedLockVisitor(object);
        StampedLock stampedLock = new StampedLock();
        LockingVisitors.StampedLockVisitor lockingVisitorsStampedLockVisitor = new LockingVisitors.StampedLockVisitor(object, stampedLock);
        //Assert statement(s)
        //TODO: Please implement equals method in StampedLockVisitor for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(lockingVisitorsStampedLockVisitor)));
    }
}
