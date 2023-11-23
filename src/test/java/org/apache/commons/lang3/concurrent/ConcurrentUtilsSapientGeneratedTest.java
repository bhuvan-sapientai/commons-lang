package org.apache.commons.lang3.concurrent;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ConcurrentHashMap;

import org.mockito.MockedStatic;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConcurrentUtilsSapientGeneratedTest {

    //Sapient generated method id: ${0b77918f-1b35-3836-b2bc-7a5d0817ce09}
    @Test()
    void extractCauseWhenExGetCauseIsNull() {
        /* Branches:
         * (ex == null) : false
         * (ex.getCause() == null) : true
         */
        //Arrange Statement(s)
        ExecutionException executionException = new ExecutionException("message1", (Throwable) null);
        //Act Statement(s)
        ConcurrentException result = ConcurrentUtils.extractCause(executionException);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${ab58021f-b2c2-36ab-b3a5-45b533144e05}
    @Disabled()
    @Test()
    void extractCauseWhenExGetCauseIsNotNull() {
        /* Branches:
         * (ex == null) : false
         * (ex.getCause() == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        ExecutionException executionException = new ExecutionException("message1", throwable);
        //Act Statement(s)
        ConcurrentException result = ConcurrentUtils.extractCause(executionException);
        ConcurrentException concurrentException = new ConcurrentException("message1", throwable);
        //Assert statement(s)
        //TODO: Please implement equals method in ConcurrentException for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(concurrentException)));
    }

    //Sapient generated method id: ${3e0c5898-5e8c-39ba-a29e-c4e7473aaf10}
    @Test()
    void extractCauseUncheckedWhenExGetCauseIsNull() {
        /* Branches:
         * (ex == null) : false
         * (ex.getCause() == null) : true
         */
        //Arrange Statement(s)
        ExecutionException executionException = new ExecutionException("message1", (Throwable) null);
        //Act Statement(s)
        ConcurrentRuntimeException result = ConcurrentUtils.extractCauseUnchecked(executionException);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${2c38be5f-36a5-3d77-9e33-95a2211a92a9}
    @Disabled()
    @Test()
    void extractCauseUncheckedWhenExGetCauseIsNotNull() {
        /* Branches:
         * (ex == null) : false
         * (ex.getCause() == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        ExecutionException executionException = new ExecutionException("message1", throwable);
        //Act Statement(s)
        ConcurrentRuntimeException result = ConcurrentUtils.extractCauseUnchecked(executionException);
        ConcurrentRuntimeException concurrentRuntimeException = new ConcurrentRuntimeException("message1", throwable);
        //Assert statement(s)
        //TODO: Please implement equals method in ConcurrentRuntimeException for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(concurrentRuntimeException)));
    }

    //Sapient generated method id: ${3de92266-2624-33b7-954b-26ce85d1b23e}
    @Disabled()
    @Test()
    void handleCauseWhenCauseIsNotNullThrowsConcurrentException() throws ConcurrentException {
        /* Branches:
         * (cause != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ConcurrentUtils> concurrentUtils = mockStatic(ConcurrentUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            ConcurrentException concurrentException = new ConcurrentException(throwable);
            Throwable throwable2 = new Throwable();
            ExecutionException executionException = new ExecutionException(throwable2);
            concurrentUtils.when(() -> ConcurrentUtils.extractCause(executionException)).thenThrow(concurrentException);
            //Act Statement(s)
            final ConcurrentException result = assertThrows(ConcurrentException.class, () -> {
                ConcurrentUtils.handleCause(executionException);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(concurrentException));
                concurrentUtils.verify(() -> ConcurrentUtils.extractCause(executionException), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${afa68603-a57d-3e97-8003-7cb116a3482a}
    @Test()
    void handleCauseWhenCauseIsNull() throws ConcurrentException {
        /* Branches:
         * (cause != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ConcurrentUtils> concurrentUtils = mockStatic(ConcurrentUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            ExecutionException executionException = new ExecutionException(throwable);
            concurrentUtils.when(() -> ConcurrentUtils.extractCause(executionException)).thenReturn(null);
            //Act Statement(s)
            ConcurrentUtils.handleCause(executionException);
            //Assert statement(s)
            assertAll("result", () -> concurrentUtils.verify(() -> ConcurrentUtils.extractCause(executionException), atLeast(1)));
        }
    }

    //Sapient generated method id: ${dc219dd1-50b9-304d-a41a-549078551f10}
    @Test()
    void handleCauseUncheckedWhenCauseIsNotNullThrowsConcurrentRuntimeException() {
        /* Branches:
         * (cause != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ConcurrentUtils> concurrentUtils = mockStatic(ConcurrentUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            ConcurrentRuntimeException concurrentRuntimeException = new ConcurrentRuntimeException(throwable);
            Throwable throwable2 = new Throwable();
            ExecutionException executionException = new ExecutionException(throwable2);
            concurrentUtils.when(() -> ConcurrentUtils.extractCauseUnchecked(executionException)).thenThrow(concurrentRuntimeException);
            //Act Statement(s)
            final ConcurrentRuntimeException result = assertThrows(ConcurrentRuntimeException.class, () -> {
                ConcurrentUtils.handleCauseUnchecked(executionException);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(concurrentRuntimeException));
                concurrentUtils.verify(() -> ConcurrentUtils.extractCauseUnchecked(executionException), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${135cfc74-cbf8-3f31-bcce-30380aa7b314}
    @Test()
    void handleCauseUncheckedWhenCauseIsNull() {
        /* Branches:
         * (cause != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ConcurrentUtils> concurrentUtils = mockStatic(ConcurrentUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            ExecutionException executionException = new ExecutionException(throwable);
            concurrentUtils.when(() -> ConcurrentUtils.extractCauseUnchecked(executionException)).thenReturn(null);
            //Act Statement(s)
            ConcurrentUtils.handleCauseUnchecked(executionException);
            //Assert statement(s)
            assertAll("result", () -> concurrentUtils.verify(() -> ConcurrentUtils.extractCauseUnchecked(executionException), atLeast(1)));
        }
    }

    //Sapient generated method id: ${4fcbd87f-8838-3161-b4bb-367ba7abc850}
    @Test()
    void checkedExceptionTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        //Act Statement(s)
        Throwable result = ConcurrentUtils.checkedException(throwable);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(throwable)));
    }

    //Sapient generated method id: ${e3f3cd6c-f2f6-386c-8827-95d96ee849d4}
    @Disabled()
    @Test()
    void initializeWhenInitializerIsNotNull() throws ConcurrentException {
        /* Branches:
         * (initializer != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        ConcurrentInitializer<Object> concurrentInitializer = null;
        //Act Statement(s)
        Object result = ConcurrentUtils.initialize(concurrentInitializer);
        Object object = new Object();
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${9495d233-6477-3be4-a42a-544cebd7ba21}
    @Test()
    void initializeWhenInitializerIsNull() throws ConcurrentException {
        /* Branches:
         * (initializer != null) : false
         */
        //Arrange Statement(s)
        ConcurrentInitializer<Object> concurrentInitializer = null;
        //Act Statement(s)
        Object result = ConcurrentUtils.initialize(concurrentInitializer);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${26c3d1f9-c5c0-355b-ab8a-9bdb8156c70a}
    @Test()
    void initializeUncheckedTest() throws ConcurrentException {
        //Arrange Statement(s)
        try (MockedStatic<ConcurrentUtils> concurrentUtils = mockStatic(ConcurrentUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            concurrentUtils.when(() -> ConcurrentUtils.initialize((ConcurrentInitializer) null)).thenReturn(object);
            //TODO: Needs initialization with real value
            ConcurrentInitializer<Object> concurrentInitializer = null;
            //Act Statement(s)
            Object result = ConcurrentUtils.initializeUnchecked(concurrentInitializer);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                concurrentUtils.verify(() -> ConcurrentUtils.initialize((ConcurrentInitializer) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1458ea06-4509-3b0f-9c2e-02d20b67a693}
    @Disabled()
    @Test()
    void initializeUncheckedWhenCaughtConcurrentExceptionThrowsConcurrentRuntimeException() {
        /* Branches:
         * (catch-exception (ConcurrentException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConcurrentUtils> concurrentUtils = mockStatic(ConcurrentUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            concurrentUtils.when(() -> ConcurrentUtils.initialize((ConcurrentInitializer) null)).thenReturn(object);
            //TODO: Needs initialization with real value
            ConcurrentInitializer<Object> concurrentInitializer = null;
            //Act Statement(s)
            final ConcurrentRuntimeException result = assertThrows(ConcurrentRuntimeException.class, () -> {
                ConcurrentUtils.initializeUnchecked(concurrentInitializer);
            });
            Throwable throwable = new Throwable();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getCause(), isA(throwable.getClass()));
                concurrentUtils.verify(() -> ConcurrentUtils.initialize((ConcurrentInitializer) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${722f637f-8057-3fe1-b0cb-c05d8bac8d0d}
    @Test()
    void putIfAbsentWhenMapIsNull() {
        /* Branches:
         * (map == null) : true
         */
        //Arrange Statement(s)
        ConcurrentMap<Object, Object> concurrentMap = null;
        Object object = new Object();
        Object object2 = new Object();
        //Act Statement(s)
        Object result = ConcurrentUtils.putIfAbsent(concurrentMap, object, object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${131567fd-609b-3be7-98cd-7c2814e24884}
    @Test()
    void putIfAbsentWhenResultIsNull() {
        /* Branches:
         * (map == null) : false
         * (result != null) : false
         */
        //Arrange Statement(s)
        ConcurrentMap<Object, Object> objectObjectMap = new ConcurrentHashMap<>();
        Object object = new Object();
        Object object2 = new Object();
        //Act Statement(s)
        Object result = ConcurrentUtils.putIfAbsent(objectObjectMap, object, object2);
        ConcurrentMap<Object, Object> objectObjectObjectObjectMapMap = new ConcurrentHashMap<>();
        objectObjectObjectObjectMapMap.put(object, object2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(object2));
            assertThat(objectObjectMap, equalTo(objectObjectObjectObjectMapMap));
        });
    }

    //Sapient generated method id: ${e539115e-d0c7-3d3b-97d4-6a3fffc2f053}
    @Test()
    void createIfAbsentWhenInitIsNull() throws ConcurrentException {
        /* Branches:
         * (map == null) : false
         * (init == null) : true
         */
        //Arrange Statement(s)
        ConcurrentMap<Object, Object> objectObjectMap = new ConcurrentHashMap<>();
        Object object = new Object();
        ConcurrentInitializer<Object> concurrentInitializer = null;
        //Act Statement(s)
        Object result = ConcurrentUtils.createIfAbsent(objectObjectMap, object, concurrentInitializer);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${f58b393f-bf41-3939-a11c-b60454578ae8}
    @Disabled()
    @Test()
    void createIfAbsentWhenValueIsNull() throws ConcurrentException {
        /* Branches:
         * (map == null) : false
         * (init == null) : false
         * (value == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConcurrentUtils> concurrentUtils = mockStatic(ConcurrentUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            Object object3 = new Object();
            concurrentUtils.when(() -> ConcurrentUtils.putIfAbsent(any(), eq(object2), eq(object3))).thenReturn(object);
            ConcurrentMap<Object, Object> objectObjectMap = new ConcurrentHashMap<>();
            objectObjectMap.put(object2, (Object) null);
            //TODO: Needs initialization with real value
            ConcurrentInitializer<Object> concurrentInitializer = null;
            //Act Statement(s)
            Object result = ConcurrentUtils.createIfAbsent(objectObjectMap, object2, concurrentInitializer);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                concurrentUtils.verify(() -> ConcurrentUtils.putIfAbsent(any(), eq(object2), eq(object3)), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${80c4a6db-e039-3b08-b2ad-d36cf1867f75}
    @Disabled()
    @Test()
    void createIfAbsentWhenValueIsNotNull() throws ConcurrentException {
        /* Branches:
         * (map == null) : false
         * (init == null) : false
         * (value == null) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        ConcurrentMap<Object, Object> objectObjectMap = new ConcurrentHashMap<>();
        objectObjectMap.put(object, object2);
        //TODO: Needs initialization with real value
        ConcurrentInitializer<Object> concurrentInitializer = null;
        //Act Statement(s)
        Object result = ConcurrentUtils.createIfAbsent(objectObjectMap, object, concurrentInitializer);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(object2)));
    }

    //Sapient generated method id: ${a946ce2b-5cf3-3935-b2ed-f87e3ee12fe2}
    @Test()
    void createIfAbsentUncheckedTest() throws ConcurrentException {
        //Arrange Statement(s)
        try (MockedStatic<ConcurrentUtils> concurrentUtils = mockStatic(ConcurrentUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            concurrentUtils.when(() -> ConcurrentUtils.createIfAbsent(any(), eq(object2), eq((ConcurrentInitializer) null))).thenReturn(object);
            ConcurrentMap<Object, Object> objectObjectMap = new ConcurrentHashMap<>();
            //TODO: Needs initialization with real value
            ConcurrentInitializer<Object> concurrentInitializer = null;
            //Act Statement(s)
            Object result = ConcurrentUtils.createIfAbsentUnchecked(objectObjectMap, object2, concurrentInitializer);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                concurrentUtils.verify(() -> ConcurrentUtils.createIfAbsent(any(), eq(object2), eq((ConcurrentInitializer) null)), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2587c616-20fa-3702-8046-bcbd7071065d}
    @Disabled()
    @Test()
    void createIfAbsentUncheckedWhenCaughtConcurrentExceptionThrowsConcurrentRuntimeException() {
        /* Branches:
         * (catch-exception (ConcurrentException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConcurrentUtils> concurrentUtils = mockStatic(ConcurrentUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            concurrentUtils.when(() -> ConcurrentUtils.createIfAbsent(any(), eq(object2), eq((ConcurrentInitializer) null))).thenReturn(object);
            ConcurrentMap<Object, Object> objectObjectMap = new ConcurrentHashMap<>();
            //TODO: Needs initialization with real value
            ConcurrentInitializer<Object> concurrentInitializer = null;
            //Act Statement(s)
            final ConcurrentRuntimeException result = assertThrows(ConcurrentRuntimeException.class, () -> {
                ConcurrentUtils.createIfAbsentUnchecked(objectObjectMap, object2, concurrentInitializer);
            });
            Throwable throwable = new Throwable();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getCause(), isA(throwable.getClass()));
                concurrentUtils.verify(() -> ConcurrentUtils.createIfAbsent(any(), eq(object2), eq((ConcurrentInitializer) null)), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${47022dd0-a38e-347b-a1fd-f17272f4d470}
    @Disabled()
    @Test()
    void constantFutureTest() {
        //Arrange Statement(s)
        Object object = new Object();
        //Act Statement(s)
        Future result = ConcurrentUtils.constantFuture(object);
        ConcurrentUtils.ConstantFuture concurrentUtilsConstantFuture = new ConcurrentUtils.ConstantFuture(object);
        //Assert statement(s)
        //TODO: Please implement equals method in ConstantFuture for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(concurrentUtilsConstantFuture)));
    }
}
