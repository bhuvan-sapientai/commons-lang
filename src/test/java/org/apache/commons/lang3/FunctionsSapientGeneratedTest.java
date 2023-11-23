package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.function.BiConsumer;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.BiPredicate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.BiFunction;

import org.mockito.stubbing.Answer;

import java.io.UncheckedIOException;
import java.util.stream.Stream;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.function.Predicate;
import java.util.Collection;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FunctionsSapientGeneratedTest {

    //Sapient generated method id: ${7b2c2fb4-ef75-3919-82fb-d0fa67974572}
    @Test()
    void acceptTest() throws Throwable {
        //Arrange Statement(s)
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            functions.when(() -> Functions.run((Functions.FailableRunnable) any())).thenAnswer((Answer<Void>) invocation -> null);
            //TODO: Needs initialization with real value
            Functions.FailableBiConsumer<Object, Object, Throwable> functionsFailableBiConsumer = null;
            Object object = new Object();
            Object object2 = new Object();
            //Act Statement(s)
            Functions.accept(functionsFailableBiConsumer, object, object2);
            //Assert statement(s)
            assertAll("result", () -> functions.verify(() -> Functions.run((Functions.FailableRunnable) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${9a5ce440-4a05-30e7-b72f-4f5ad35419d5}
    @Test()
    void accept1Test() throws Throwable {
        //Arrange Statement(s)
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            functions.when(() -> Functions.run((Functions.FailableRunnable) any())).thenAnswer((Answer<Void>) invocation -> null);
            //TODO: Needs initialization with real value
            Functions.FailableConsumer<Object, Throwable> functionsFailableConsumer = null;
            Object object = new Object();
            //Act Statement(s)
            Functions.accept(functionsFailableConsumer, object);
            //Assert statement(s)
            assertAll("result", () -> functions.verify(() -> Functions.run((Functions.FailableRunnable) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${3d33b7c8-65b1-3105-b11e-1378b185b2be}
    @Test()
    void applyTest() throws Throwable {
        //Arrange Statement(s)
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            functions.when(() -> Functions.get((Functions.FailableSupplier) any())).thenReturn(object);
            //TODO: Needs initialization with real value
            Functions.FailableBiFunction<Object, Object, Object, Throwable> functionsFailableBiFunction = null;
            Object object2 = new Object();
            Object object3 = new Object();
            //Act Statement(s)
            Object result = Functions.apply(functionsFailableBiFunction, object2, object3);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                functions.verify(() -> Functions.get((Functions.FailableSupplier) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${dad8dda9-d06d-3839-9dd6-843634c3b02c}
    @Test()
    void apply1Test() throws Throwable {
        //Arrange Statement(s)
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            functions.when(() -> Functions.get((Functions.FailableSupplier) any())).thenReturn(object);
            //TODO: Needs initialization with real value
            Functions.FailableFunction<Object, Object, Throwable> functionsFailableFunction = null;
            Object object2 = new Object();
            //Act Statement(s)
            Object result = Functions.apply(functionsFailableFunction, object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                functions.verify(() -> Functions.get((Functions.FailableSupplier) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2783fe99-0c97-353f-ad3c-cbbb397817ba}
    @Test()
    void asBiConsumerTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Functions.FailableBiConsumer<Object, Object, ?> functionsFailableBiConsumer = null;
        //Act Statement(s)
        BiConsumer<Object, Object> result = Functions.asBiConsumer(functionsFailableBiConsumer);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${ebf05e33-f559-34e6-96f3-756e1f4b54ad}
    @Test()
    void asBiFunctionTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Functions.FailableBiFunction<Object, Object, Object, ?> functionsFailableBiFunction = null;
        //Act Statement(s)
        BiFunction<Object, Object, Object> result = Functions.asBiFunction(functionsFailableBiFunction);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${1a9daf5c-7b16-3b39-9ced-8646fd5ea559}
    @Test()
    void asBiPredicateTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Functions.FailableBiPredicate<Object, Object, ?> functionsFailableBiPredicate = null;
        //Act Statement(s)
        BiPredicate<Object, Object> result = Functions.asBiPredicate(functionsFailableBiPredicate);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${5c3cd683-7de3-373b-877e-d296b4eb4fd9}
    @Test()
    void asCallableTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Functions.FailableCallable<Object, ?> functionsFailableCallable = null;
        //Act Statement(s)
        Callable result = Functions.asCallable(functionsFailableCallable);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${a520a8de-a9e7-31b1-9548-dcbc66224f06}
    @Test()
    void asConsumerTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Functions.FailableConsumer<Object, ?> functionsFailableConsumer = null;
        //Act Statement(s)
        Consumer result = Functions.asConsumer(functionsFailableConsumer);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${7061a179-ec6f-36fa-942d-3673cfe095e2}
    @Test()
    void asFunctionTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Functions.FailableFunction<Object, Object, ?> functionsFailableFunction = null;
        //Act Statement(s)
        Function<Object, Object> result = Functions.asFunction(functionsFailableFunction);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${faf27e9d-8b2c-308c-a212-f28ccab1fb7b}
    @Test()
    void asPredicateTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Functions.FailablePredicate<Object, ?> functionsFailablePredicate = null;
        //Act Statement(s)
        Predicate result = Functions.asPredicate(functionsFailablePredicate);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${9d110134-aede-39b7-882a-8aec03520c13}
    @Test()
    void asRunnableTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Functions.FailableRunnable<?> functionsFailableRunnable = null;
        //Act Statement(s)
        Runnable result = Functions.asRunnable(functionsFailableRunnable);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${6b37d8ae-48e4-3474-8940-c907b682595f}
    @Test()
    void asSupplierTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Functions.FailableSupplier<Object, ?> functionsFailableSupplier = null;
        //Act Statement(s)
        Supplier result = Functions.asSupplier(functionsFailableSupplier);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${7f46e9ea-9d9d-3f1a-9edc-cdb3cda2e6b0}
    @Disabled()
    @Test()
    void callTest() throws Throwable {
        //Arrange Statement(s)
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            functions.when(() -> Functions.get((Functions.FailableSupplier) any())).thenReturn(object);
            //TODO: Needs initialization with real value
            Functions.FailableCallable<Object, Throwable> functionsFailableCallable = null;
            //Act Statement(s)
            Object result = Functions.call(functionsFailableCallable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                functions.verify(() -> Functions.get((Functions.FailableSupplier) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}
    @Disabled()
    @Test()
    void getTest() throws Throwable {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Functions.FailableSupplier<Object, Throwable> functionsFailableSupplier = null;
        //Act Statement(s)
        Object result = Functions.get(functionsFailableSupplier);
        Object object = new Object();
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${c43ce815-b384-3bcc-a1d4-e8728e056eda}
    @Disabled()
    @Test()
    void getWhenCaughtThrowableThrowsRuntimeException() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            functions.when(() -> Functions.rethrow(throwable)).thenThrow(runtimeException);
            //TODO: Needs initialization with real value
            Functions.FailableSupplier<Object, Throwable> functionsFailableSupplier = null;
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Functions.get(functionsFailableSupplier);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                functions.verify(() -> Functions.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4eaf0b4c-ab43-351b-ab86-4bd64ab5b5e8}
    @Test()
    void rethrowWhenThrowableInstanceOfIOExceptionThrowsUncheckedIOException() {
        /* Branches:
         * (throwable instanceof IOException) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IOException iOException = new IOException();
        //Act Statement(s)
        final UncheckedIOException result = assertThrows(UncheckedIOException.class, () -> {
            Functions.rethrow(iOException);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), isA(iOException.getClass()));
        });
    }

    //Sapient generated method id: ${14cc8fab-e428-3d85-b79d-132a8df49b99}
    @Test()
    void rethrowWhenThrowableNotInstanceOfIOExceptionThrowsUndeclaredThrowableException() {
        /* Branches:
         * (throwable instanceof IOException) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        //Act Statement(s)
        final UndeclaredThrowableException result = assertThrows(UndeclaredThrowableException.class, () -> {
            Functions.rethrow(throwable);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${ef8a815d-5b58-3af3-b941-bad6d059cca5}
    @Disabled()
    @Test()
    void runTest() throws Throwable {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Functions.FailableRunnable<Throwable> functionsFailableRunnable = null;
        //Act Statement(s)
        Functions.run(functionsFailableRunnable);
    }

    //Sapient generated method id: ${c1ba0f90-a1c5-3144-823f-d00ae335e0bb}
    @Disabled()
    @Test()
    void runWhenCaughtThrowableThrowsRuntimeException() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            functions.when(() -> Functions.rethrow(throwable)).thenThrow(runtimeException);
            //TODO: Needs initialization with real value
            Functions.FailableRunnable<Throwable> functionsFailableRunnable = null;
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Functions.run(functionsFailableRunnable);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                functions.verify(() -> Functions.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b4af2388-e781-3800-820a-b8ede09bd914}
    @Disabled()
    @Test()
    void streamTest() {
        //Arrange Statement(s)
        Collection<Object> collection = new ArrayList<>();
        //Act Statement(s)
        Streams.FailableStream result = Functions.stream(collection);
        Streams.FailableStream streamsFailableStream = new Streams.FailableStream((Stream) null);
        //Assert statement(s)
        //TODO: Please implement equals method in FailableStream for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(streamsFailableStream)));
    }

    //Sapient generated method id: ${3b200cb7-448d-34b5-bf0d-0c7d7dec4137}
    @Disabled()
    @Test()
    void stream1Test() {
        //Arrange Statement(s)
        Stream<Object> stream = Stream.empty();
        //Act Statement(s)
        Streams.FailableStream result = Functions.stream(stream);
        Streams.FailableStream streamsFailableStream = new Streams.FailableStream(stream);
        //Assert statement(s)
        //TODO: Please implement equals method in FailableStream for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(streamsFailableStream)));
    }

    //Sapient generated method id: ${db986202-3ef8-3379-a149-1be947cc078f}
    @Disabled()
    @Test()
    void testWhenSupplierGetAsBoolean() throws Throwable {
        /* Branches:
         * (supplier.getAsBoolean()) : true  #  inside getAsBoolean method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Functions.FailableBiPredicate<Object, Object, Throwable> functionsFailableBiPredicate = null;
        Object object = new Object();
        Object object2 = new Object();
        //Act Statement(s)
        boolean result = Functions.test(functionsFailableBiPredicate, object, object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${f3072eea-d0f9-376b-97c0-6a1369656ed4}
    @Disabled()
    @Test()
    void testWhenSupplierNotGetAsBoolean() throws Throwable {
        /* Branches:
         * (supplier.getAsBoolean()) : false  #  inside getAsBoolean method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Functions.FailableBiPredicate<Object, Object, Throwable> functionsFailableBiPredicate = null;
        Object object = new Object();
        Object object2 = new Object();
        //Act Statement(s)
        boolean result = Functions.test(functionsFailableBiPredicate, object, object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${c7bf983a-19d5-3cc6-8c50-fb029a5495c5}
    @Disabled()
    @Test()
    void testWhenCaughtThrowableThrowsRuntimeException() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true  #  inside getAsBoolean method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            functions.when(() -> Functions.rethrow(throwable)).thenThrow(runtimeException);
            //TODO: Needs initialization with real value
            Functions.FailableBiPredicate<Object, Object, Throwable> functionsFailableBiPredicate = null;
            Object object = new Object();
            Object object2 = new Object();
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Functions.test(functionsFailableBiPredicate, object, object2);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                functions.verify(() -> Functions.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5ada5b2b-64af-31c2-92ef-5c45a8285daa}
    @Disabled()
    @Test()
    void test1WhenSupplierGetAsBoolean() throws Throwable {
        /* Branches:
         * (supplier.getAsBoolean()) : true  #  inside getAsBoolean method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Functions.FailablePredicate<Object, Throwable> functionsFailablePredicate = null;
        Object object = new Object();
        //Act Statement(s)
        boolean result = Functions.test(functionsFailablePredicate, object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${7062f986-3a47-33d1-bcfd-4e798f9790d2}
    @Disabled()
    @Test()
    void test1WhenSupplierNotGetAsBoolean() throws Throwable {
        /* Branches:
         * (supplier.getAsBoolean()) : false  #  inside getAsBoolean method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Functions.FailablePredicate<Object, Throwable> functionsFailablePredicate = null;
        Object object = new Object();
        //Act Statement(s)
        boolean result = Functions.test(functionsFailablePredicate, object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${27fc3219-9943-363d-9541-b4be5a11f2f0}
    @Disabled()
    @Test()
    void test1WhenCaughtThrowableThrowsRuntimeException() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true  #  inside getAsBoolean method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            functions.when(() -> Functions.rethrow(throwable)).thenThrow(runtimeException);
            //TODO: Needs initialization with real value
            Functions.FailablePredicate<Object, Throwable> functionsFailablePredicate = null;
            Object object = new Object();
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Functions.test(functionsFailablePredicate, object);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                functions.verify(() -> Functions.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c7d12704-ec03-3dd8-b60c-7dcbb20fb6b1}
    @Disabled()
    @Test()
    void tryWithResourcesWhenErrorHandlerIsNotNull() {
        /* Branches:
         * (errorHandler != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Functions.FailableRunnable<Throwable> functionsFailableRunnable = null;
        //TODO: Needs initialization with real value
        Functions.FailableConsumer<Throwable, Throwable> functionsFailableConsumer = null;
        Functions.FailableRunnable<Throwable>[] failableRunnableArray = new Functions.FailableRunnable[]{};
        //Act Statement(s)
        Functions.tryWithResources(functionsFailableRunnable, functionsFailableConsumer, failableRunnableArray);
    }

    //Sapient generated method id: ${15ecb5e8-296c-3275-9081-480e2243d3c2}
    @Disabled()
    @Test()
    void tryWithResourcesWhenErrorHandlerIsNull() {
        /* Branches:
         * (errorHandler != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Functions.FailableRunnable<Throwable> functionsFailableRunnable = null;
        Functions.FailableConsumer<Throwable, Throwable> functionsFailableConsumer = null;
        Functions.FailableRunnable<Throwable>[] failableRunnableArray = new Functions.FailableRunnable[]{};
        //Act Statement(s)
        Functions.tryWithResources(functionsFailableRunnable, functionsFailableConsumer, failableRunnableArray);
    }

    //Sapient generated method id: ${623ef367-30bf-34dc-9043-636bf43dfe12}
    @Test()
    void tryWithResources1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            Functions.FailableRunnable<Throwable>[] failableRunnableArray = new Functions.FailableRunnable[]{};
            functions.when(() -> Functions.tryWithResources((Functions.FailableRunnable) null, (Functions.FailableConsumer) null, failableRunnableArray)).thenAnswer((Answer<Void>) invocation -> null);
            //TODO: Needs initialization with real value
            Functions.FailableRunnable<Throwable> functionsFailableRunnable = null;
            //Act Statement(s)
            Functions.tryWithResources(functionsFailableRunnable, failableRunnableArray);
            //Assert statement(s)
            assertAll("result", () -> functions.verify(() -> Functions.tryWithResources((Functions.FailableRunnable) null, (Functions.FailableConsumer) null, failableRunnableArray), atLeast(1)));
        }
    }
}
