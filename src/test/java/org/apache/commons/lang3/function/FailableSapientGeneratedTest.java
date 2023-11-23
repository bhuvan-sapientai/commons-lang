package org.apache.commons.lang3.function;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.function.BiConsumer;
import java.util.concurrent.Callable;

import org.apache.commons.lang3.stream.Streams;

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
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FailableSapientGeneratedTest {

    //Sapient generated method id: ${7b2c2fb4-ef75-3919-82fb-d0fa67974572}
    @Test()
    void acceptTest() throws Throwable {
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            failable.when(() -> Failable.run((FailableRunnable) any())).thenAnswer((Answer<Void>) invocation -> null);
            FailableBiConsumer<Object, Object, Throwable> failableBiConsumer = FailableBiConsumer.nop();
            Object object = new Object();
            Object object2 = new Object();
            //Act Statement(s)
            Failable.accept(failableBiConsumer, object, object2);
            //Assert statement(s)
            assertAll("result", () -> failable.verify(() -> Failable.run((FailableRunnable) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${9a5ce440-4a05-30e7-b72f-4f5ad35419d5}
    @Test()
    void accept1Test() throws Throwable {
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            failable.when(() -> Failable.run((FailableRunnable) any())).thenAnswer((Answer<Void>) invocation -> null);
            FailableConsumer<Object, Throwable> failableConsumer = FailableConsumer.nop();
            Object object = new Object();
            //Act Statement(s)
            Failable.accept(failableConsumer, object);
            //Assert statement(s)
            assertAll("result", () -> failable.verify(() -> Failable.run((FailableRunnable) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${73b25171-ff44-363d-b1a7-07dabf08f90c}
    @Test()
    void accept2Test() throws Throwable {
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            failable.when(() -> Failable.run((FailableRunnable) any())).thenAnswer((Answer<Void>) invocation -> null);
            FailableDoubleConsumer<Throwable> failableDoubleConsumer = FailableDoubleConsumer.nop();
            //Act Statement(s)
            Failable.accept(failableDoubleConsumer, Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> failable.verify(() -> Failable.run((FailableRunnable) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${1a0466e9-92ad-3d87-a7a8-7fbac1f96a67}
    @Test()
    void accept3Test() throws Throwable {
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            failable.when(() -> Failable.run((FailableRunnable) any())).thenAnswer((Answer<Void>) invocation -> null);
            FailableIntConsumer<Throwable> failableIntConsumer = FailableIntConsumer.nop();
            //Act Statement(s)
            Failable.accept(failableIntConsumer, 0);
            //Assert statement(s)
            assertAll("result", () -> failable.verify(() -> Failable.run((FailableRunnable) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${640d629e-0e6d-3613-a6ef-4e8dedad937b}
    @Test()
    void accept4Test() throws Throwable {
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            failable.when(() -> Failable.run((FailableRunnable) any())).thenAnswer((Answer<Void>) invocation -> null);
            FailableLongConsumer<Throwable> failableLongConsumer = FailableLongConsumer.nop();
            //Act Statement(s)
            Failable.accept(failableLongConsumer, 0L);
            //Assert statement(s)
            assertAll("result", () -> failable.verify(() -> Failable.run((FailableRunnable) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${3d33b7c8-65b1-3105-b11e-1378b185b2be}
    @Test()
    void applyTest() throws Throwable {
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            failable.when(() -> Failable.get((FailableSupplier) any())).thenReturn(object);
            FailableBiFunction<Object, Object, Object, Throwable> failableBiFunction = FailableBiFunction.nop();
            Object object2 = new Object();
            Object object3 = new Object();
            //Act Statement(s)
            Object result = Failable.apply(failableBiFunction, object2, object3);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                failable.verify(() -> Failable.get((FailableSupplier) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${dad8dda9-d06d-3839-9dd6-843634c3b02c}
    @Test()
    void apply1Test() throws Throwable {
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            failable.when(() -> Failable.get((FailableSupplier) any())).thenReturn(object);
            FailableFunction<Object, Object, Throwable> failableFunction = FailableFunction.identity();
            Object object2 = new Object();
            //Act Statement(s)
            Object result = Failable.apply(failableFunction, object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                failable.verify(() -> Failable.get((FailableSupplier) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d3486399-2c93-32ef-b5e5-914012e43f3f}
    @Test()
    void applyAsDoubleTest() throws Throwable {
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            failable.when(() -> Failable.getAsDouble((FailableDoubleSupplier) any())).thenReturn(Double.parseDouble("0.0"));
            //TODO: Needs initialization with real value
            FailableDoubleBinaryOperator<Throwable> failableDoubleBinaryOperator = null;
            //Act Statement(s)
            double result = Failable.applyAsDouble(failableDoubleBinaryOperator, Double.parseDouble("0.0"), Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001));
                failable.verify(() -> Failable.getAsDouble((FailableDoubleSupplier) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2783fe99-0c97-353f-ad3c-cbbb397817ba}
    @Test()
    void asBiConsumerTest() {
        //Arrange Statement(s)
        FailableBiConsumer<Object, Object, ?> failableBiConsumer = FailableBiConsumer.nop();

        //Act Statement(s)
        BiConsumer<Object, Object> result = Failable.asBiConsumer(failableBiConsumer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${ebf05e33-f559-34e6-96f3-756e1f4b54ad}
    @Test()
    void asBiFunctionTest() {
        //Arrange Statement(s)
        FailableBiFunction<Object, Object, Object, ?> failableBiFunction = FailableBiFunction.nop();

        //Act Statement(s)
        BiFunction<Object, Object, Object> result = Failable.asBiFunction(failableBiFunction);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${1a9daf5c-7b16-3b39-9ced-8646fd5ea559}
    @Test()
    void asBiPredicateTest() {
        //Arrange Statement(s)
        FailableBiPredicate<Object, Object, ?> failableBiPredicate = FailableBiPredicate.falsePredicate();

        //Act Statement(s)
        BiPredicate<Object, Object> result = Failable.asBiPredicate(failableBiPredicate);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${5c3cd683-7de3-373b-877e-d296b4eb4fd9}
    @Test()
    void asCallableTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        FailableCallable<Object, ?> failableCallable = null;

        //Act Statement(s)
        Callable result = Failable.asCallable(failableCallable);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${a520a8de-a9e7-31b1-9548-dcbc66224f06}
    @Test()
    void asConsumerTest() {
        //Arrange Statement(s)
        FailableConsumer<Object, ?> failableConsumer = FailableConsumer.nop();

        //Act Statement(s)
        Consumer result = Failable.asConsumer(failableConsumer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${7061a179-ec6f-36fa-942d-3673cfe095e2}
    @Test()
    void asFunctionTest() {
        //Arrange Statement(s)
        FailableFunction<Object, Object, ?> failableFunction = FailableFunction.identity();

        //Act Statement(s)
        Function<Object, Object> result = Failable.asFunction(failableFunction);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${faf27e9d-8b2c-308c-a212-f28ccab1fb7b}
    @Test()
    void asPredicateTest() {
        //Arrange Statement(s)
        FailablePredicate<Object, ?> failablePredicate = FailablePredicate.falsePredicate();

        //Act Statement(s)
        Predicate result = Failable.asPredicate(failablePredicate);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${9d110134-aede-39b7-882a-8aec03520c13}
    @Test()
    void asRunnableTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        FailableRunnable<?> failableRunnable = null;

        //Act Statement(s)
        Runnable result = Failable.asRunnable(failableRunnable);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${6b37d8ae-48e4-3474-8940-c907b682595f}
    @Test()
    void asSupplierTest() {
        //Arrange Statement(s)
        FailableSupplier<Object, ?> failableSupplier = FailableSupplier.nul();

        //Act Statement(s)
        Supplier result = Failable.asSupplier(failableSupplier);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${7f46e9ea-9d9d-3f1a-9edc-cdb3cda2e6b0}
    @Test()
    void callTest() throws Throwable {
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            failable.when(() -> Failable.get((FailableSupplier) any())).thenReturn(object);
            //TODO: Needs initialization with real value
            FailableCallable<Object, Throwable> failableCallable = null;
            //Act Statement(s)
            Object result = Failable.call(failableCallable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                failable.verify(() -> Failable.get((FailableSupplier) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}
    @Test()
    void getTest() throws Throwable {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        FailableSupplier<Object, Throwable> failableSupplier = FailableSupplier.nul();

        //Act Statement(s)
        Object result = Failable.get(failableSupplier);
        Object object = new Object();

        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${c43ce815-b384-3bcc-a1d4-e8728e056eda}
    @Test()
    void getWhenCaughtThrowableThrowsRuntimeException() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            failable.when(() -> Failable.rethrow(throwable)).thenThrow(runtimeException);
            FailableSupplier<Object, Throwable> failableSupplier = FailableSupplier.nul();
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Failable.get(failableSupplier);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                failable.verify(() -> Failable.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${55debf49-b296-3de6-a1b9-66a85a0bd1d3}
    @Test()
    void getAsBooleanWhenSupplierGetAsBoolean() throws Throwable {
        /* Branches:
         * (supplier.getAsBoolean()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        FailableBooleanSupplier<Throwable> failableBooleanSupplier = null;

        //Act Statement(s)
        boolean result = Failable.getAsBoolean(failableBooleanSupplier);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${3d735c23-0fa9-3ba7-8cb6-0f8282ca00e0}
    @Test()
    void getAsBooleanWhenSupplierNotGetAsBoolean() throws Throwable {
        /* Branches:
         * (supplier.getAsBoolean()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        FailableBooleanSupplier<Throwable> failableBooleanSupplier = null;

        //Act Statement(s)
        boolean result = Failable.getAsBoolean(failableBooleanSupplier);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${b68a889d-64c9-36a5-bfd2-9165b5f5ab4c}
    @Test()
    void getAsBooleanWhenCaughtThrowableThrowsRuntimeException() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            failable.when(() -> Failable.rethrow(throwable)).thenThrow(runtimeException);
            //TODO: Needs initialization with real value
            FailableBooleanSupplier<Throwable> failableBooleanSupplier = null;
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Failable.getAsBoolean(failableBooleanSupplier);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                failable.verify(() -> Failable.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${327e1991-1c46-3d1a-bcfb-ed6e27cd1443}
    @Test()
    void getAsDoubleTest() throws Throwable {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        FailableDoubleSupplier<Throwable> failableDoubleSupplier = null;

        //Act Statement(s)
        double result = Failable.getAsDouble(failableDoubleSupplier);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${8677ce95-ac49-3204-b967-08b4d259ee90}
    @Test()
    void getAsDoubleWhenCaughtThrowableThrowsRuntimeException() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            failable.when(() -> Failable.rethrow(throwable)).thenThrow(runtimeException);
            //TODO: Needs initialization with real value
            FailableDoubleSupplier<Throwable> failableDoubleSupplier = null;
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Failable.getAsDouble(failableDoubleSupplier);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                failable.verify(() -> Failable.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8f0f68cf-5f0e-31a1-8bc4-d8bf99d2c260}
    @Test()
    void getAsIntTest() throws Throwable {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        FailableIntSupplier<Throwable> failableIntSupplier = null;

        //Act Statement(s)
        int result = Failable.getAsInt(failableIntSupplier);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${53eba28d-36ac-3552-8e17-4fb74934af16}
    @Test()
    void getAsIntWhenCaughtThrowableThrowsRuntimeException() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            failable.when(() -> Failable.rethrow(throwable)).thenThrow(runtimeException);
            //TODO: Needs initialization with real value
            FailableIntSupplier<Throwable> failableIntSupplier = null;
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Failable.getAsInt(failableIntSupplier);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                failable.verify(() -> Failable.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fa223921-034d-3efb-a559-92518ed5079c}
    @Test()
    void getAsLongTest() throws Throwable {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        FailableLongSupplier<Throwable> failableLongSupplier = null;

        //Act Statement(s)
        long result = Failable.getAsLong(failableLongSupplier);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }

    //Sapient generated method id: ${99d2b80f-e413-351b-9727-b09fb82238eb}
    @Test()
    void getAsLongWhenCaughtThrowableThrowsRuntimeException() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            failable.when(() -> Failable.rethrow(throwable)).thenThrow(runtimeException);
            //TODO: Needs initialization with real value
            FailableLongSupplier<Throwable> failableLongSupplier = null;
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Failable.getAsLong(failableLongSupplier);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                failable.verify(() -> Failable.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${30607cd2-29ea-366a-b77d-4fe625d7e52b}
    @Test()
    void getAsShortTest() throws Throwable {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        FailableShortSupplier<Throwable> failableShortSupplier = null;

        //Act Statement(s)
        short result = Failable.getAsShort(failableShortSupplier);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }

    //Sapient generated method id: ${e2cbf5f6-1364-3914-8717-c16304103b60}
    @Test()
    void getAsShortWhenCaughtThrowableThrowsRuntimeException() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            failable.when(() -> Failable.rethrow(throwable)).thenThrow(runtimeException);
            //TODO: Needs initialization with real value
            FailableShortSupplier<Throwable> failableShortSupplier = null;
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Failable.getAsShort(failableShortSupplier);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                failable.verify(() -> Failable.rethrow(throwable), atLeast(1));
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
            Failable.rethrow(iOException);
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
            Failable.rethrow(throwable);
        });

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${ef8a815d-5b58-3af3-b941-bad6d059cca5}
    @Test()
    void runTest() throws Throwable {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        FailableRunnable<Throwable> failableRunnable = null;

        //Act Statement(s)
        Failable.run(failableRunnable);
    }

    //Sapient generated method id: ${c1ba0f90-a1c5-3144-823f-d00ae335e0bb}
    @Test()
    void runWhenCaughtThrowableThrowsRuntimeException() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            failable.when(() -> Failable.rethrow(throwable)).thenThrow(runtimeException);
            //TODO: Needs initialization with real value
            FailableRunnable<Throwable> failableRunnable = null;
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Failable.run(failableRunnable);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                failable.verify(() -> Failable.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b4af2388-e781-3800-820a-b8ede09bd914}
    @Test()
    void streamTest() {
        //Arrange Statement(s)
        Collection<Object> collection = new ArrayList<>();

        //Act Statement(s)
        Streams.FailableStream result = Failable.stream(collection);
        Streams.FailableStream streamsFailableStream = new Streams.FailableStream((Stream) null);

        //Assert statement(s)
        //TODO: Please implement equals method in FailableStream for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(streamsFailableStream)));
    }

    //Sapient generated method id: ${3b200cb7-448d-34b5-bf0d-0c7d7dec4137}
    @Test()
    void stream1Test() {
        //Arrange Statement(s)
        Stream<Object> stream = Stream.empty();

        //Act Statement(s)
        Streams.FailableStream result = Failable.stream(stream);
        Streams.FailableStream streamsFailableStream = new Streams.FailableStream(stream);

        //Assert statement(s)
        //TODO: Please implement equals method in FailableStream for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(streamsFailableStream)));
    }

    //Sapient generated method id: ${c67cf450-8e3d-36aa-bd1a-285c8af48893}
    @Test()
    void testWhenGetAsBooleanPredicateTestObject1Object2() throws Throwable {
        /* Branches:
         * (getAsBoolean(() -> predicate.test(object1, object2))) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            failable.when(() -> Failable.getAsBoolean((FailableBooleanSupplier) any())).thenReturn(true);
            FailableBiPredicate<Object, Object, Throwable> failableBiPredicate = FailableBiPredicate.falsePredicate();
            Object object = new Object();
            Object object2 = new Object();
            //Act Statement(s)
            boolean result = Failable.test(failableBiPredicate, object, object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                failable.verify(() -> Failable.getAsBoolean((FailableBooleanSupplier) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c0c857b2-9f90-3d3c-b5e2-612837be2de6}
    @Test()
    void testWhenGetAsBooleanNotPredicateTestObject1Object2() throws Throwable {
        /* Branches:
         * (getAsBoolean(() -> predicate.test(object1, object2))) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            failable.when(() -> Failable.getAsBoolean((FailableBooleanSupplier) any())).thenReturn(false);
            FailableBiPredicate<Object, Object, Throwable> failableBiPredicate = FailableBiPredicate.falsePredicate();
            Object object = new Object();
            Object object2 = new Object();
            //Act Statement(s)
            boolean result = Failable.test(failableBiPredicate, object, object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                failable.verify(() -> Failable.getAsBoolean((FailableBooleanSupplier) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7033133c-0f74-3536-8917-761cb90c417c}
    @Test()
    void test1WhenGetAsBooleanPredicateTestObject() throws Throwable {
        /* Branches:
         * (getAsBoolean(() -> predicate.test(object))) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            failable.when(() -> Failable.getAsBoolean((FailableBooleanSupplier) any())).thenReturn(true);
            FailablePredicate<Object, Throwable> failablePredicate = FailablePredicate.falsePredicate();
            Object object = new Object();
            //Act Statement(s)
            boolean result = Failable.test(failablePredicate, object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                failable.verify(() -> Failable.getAsBoolean((FailableBooleanSupplier) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${bbde8dfa-30de-3891-897c-78b3b19c431f}
    @Test()
    void test1WhenGetAsBooleanNotPredicateTestObject() throws Throwable {
        /* Branches:
         * (getAsBoolean(() -> predicate.test(object))) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            failable.when(() -> Failable.getAsBoolean((FailableBooleanSupplier) any())).thenReturn(false);
            FailablePredicate<Object, Throwable> failablePredicate = FailablePredicate.falsePredicate();
            Object object = new Object();
            //Act Statement(s)
            boolean result = Failable.test(failablePredicate, object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                failable.verify(() -> Failable.getAsBoolean((FailableBooleanSupplier) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d139c1fa-1b60-32f5-a5b6-9e978b67952a}
    @Test()
    void tryWithResourcesWhenResourcesIsNotEmptyAndThIsNull() throws Throwable {
        /* Branches:
         * (errorHandler == null) : true
         * (resources != null) : true
         * (for-each(resources)) : true
         * (th != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        FailableRunnable<Throwable> failableRunnable = null;
        FailableConsumer<Throwable, Throwable> failableConsumer = null;
        FailableRunnable<Throwable>[] failableRunnableArray = new FailableRunnable[]{(FailableRunnable) null};

        //Act Statement(s)
        Failable.tryWithResources(failableRunnable, failableConsumer, failableRunnableArray);
        FailableRunnable<Throwable>[] failableRunnableFailableRunnableArrayArray = new FailableRunnable[]{(FailableRunnable) null};

        //Assert statement(s)
        assertAll("result", () -> assertThat(failableRunnableArray, equalTo(failableRunnableFailableRunnableArrayArray)));
    }

    //Sapient generated method id: ${378e8318-86aa-367b-9987-f1096b5b85ed}
    @Test()
    void tryWithResourcesWhenResourcesIsNotNullAndResourcesIsNotEmptyAndThIsNull() throws Throwable {
        /* Branches:
         * (errorHandler == null) : false
         * (resources != null) : true
         * (for-each(resources)) : true
         * (th != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        FailableRunnable<Throwable> failableRunnable = null;
        FailableConsumer<Throwable, Throwable> failableConsumer = FailableConsumer.nop();
        FailableRunnable<Throwable>[] failableRunnableArray = new FailableRunnable[]{(FailableRunnable) null};

        //Act Statement(s)
        Failable.tryWithResources(failableRunnable, failableConsumer, failableRunnableArray);
        FailableRunnable<Throwable>[] failableRunnableFailableRunnableArrayArray = new FailableRunnable[]{(FailableRunnable) null};

        //Assert statement(s)
        assertAll("result", () -> assertThat(failableRunnableArray, equalTo(failableRunnableFailableRunnableArrayArray)));
    }

    //Sapient generated method id: ${1987511d-73cd-3b8d-bc8d-bc37eada0dab}
    @Test()
    void tryWithResourcesWhenResourcesIsNotNullAndResourcesIsNotEmptyAndThIsNotNull() throws Throwable {
        /* Branches:
         * (errorHandler == null) : false
         * (catch-exception (Throwable)) : true
         * (resources != null) : true
         * (for-each(resources)) : true
         * (th != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        FailableRunnable<Throwable> failableRunnable = null;
        FailableConsumer<Throwable, Throwable> failableConsumer = FailableConsumer.nop();
        FailableRunnable<Throwable>[] failableRunnableArray = new FailableRunnable[]{};

        //Act Statement(s)
        Failable.tryWithResources(failableRunnable, failableConsumer, failableRunnableArray);
    }

    //Sapient generated method id: ${65ac2164-8f94-31fb-ac86-f1161567fabd}
    @Test()
    void tryWithResourcesWhenThIsNullAndThIsNotNull() throws Throwable {
        /* Branches:
         * (errorHandler == null) : true
         * (resources != null) : true
         * (for-each(resources)) : true
         * (catch-exception (Throwable)) : true
         * (th == null) : true
         * (th != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        FailableRunnable<Throwable> failableRunnable = null;
        FailableConsumer<Throwable, Throwable> failableConsumer = null;
        FailableRunnable<Throwable>[] failableRunnableArray = new FailableRunnable[]{(FailableRunnable) null};

        //Act Statement(s)
        Failable.tryWithResources(failableRunnable, failableConsumer, failableRunnableArray);
    }

    //Sapient generated method id: ${623ef367-30bf-34dc-9043-636bf43dfe12}
    @Test()
    void tryWithResources1Test() throws Throwable {
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            FailableRunnable<Throwable>[] failableRunnableArray = new FailableRunnable[]{};
            failable.when(() -> Failable.tryWithResources((FailableRunnable) null, (FailableConsumer) null, failableRunnableArray)).thenAnswer((Answer<Void>) invocation -> null);
            //TODO: Needs initialization with real value
            FailableRunnable<Throwable> failableRunnable = null;
            //Act Statement(s)
            Failable.tryWithResources(failableRunnable, failableRunnableArray);
            //Assert statement(s)
            assertAll("result", () -> failable.verify(() -> Failable.tryWithResources((FailableRunnable) null, (FailableConsumer) null, failableRunnableArray), atLeast(1)));
        }
    }
}
