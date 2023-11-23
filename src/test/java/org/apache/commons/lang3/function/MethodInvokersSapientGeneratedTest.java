package org.apache.commons.lang3.function;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.function.BiFunction;

import org.apache.commons.lang3.exception.UncheckedIllegalAccessException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MethodInvokersSapientGeneratedTest {

    //Sapient generated method id: ${2783fe99-0c97-353f-ad3c-cbbb397817ba}
    @Test()
    void asBiConsumerTest() throws IllegalAccessException {
        //Arrange Statement(s)
        try (MockedStatic<MethodInvokers> methodInvokers = mockStatic(MethodInvokers.class, CALLS_REAL_METHODS)) {
            methodInvokers.when(() -> MethodInvokers.asInterfaceInstance(BiConsumer.class, (Method) null)).thenReturn(null);
            //TODO: Needs initialization with real value
            Method method = null;
            //Act Statement(s)
            BiConsumer<Object, Object> result = MethodInvokers.asBiConsumer(method);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                methodInvokers.verify(() -> MethodInvokers.asInterfaceInstance(BiConsumer.class, (Method) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ebf05e33-f559-34e6-96f3-756e1f4b54ad}
    @Test()
    void asBiFunctionTest() throws IllegalAccessException {
        //Arrange Statement(s)
        try (MockedStatic<MethodInvokers> methodInvokers = mockStatic(MethodInvokers.class, CALLS_REAL_METHODS)) {
            methodInvokers.when(() -> MethodInvokers.asInterfaceInstance(BiFunction.class, (Method) null)).thenReturn(null);
            //TODO: Needs initialization with real value
            Method method = null;
            //Act Statement(s)
            BiFunction<Object, Object, Object> result = MethodInvokers.asBiFunction(method);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                methodInvokers.verify(() -> MethodInvokers.asInterfaceInstance(BiFunction.class, (Method) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${eb1b651a-7def-3fa6-a73a-dac05f460169}
    @Test()
    void asFailableBiConsumerTest() throws IllegalAccessException {
        //Arrange Statement(s)
        try (MockedStatic<MethodInvokers> methodInvokers = mockStatic(MethodInvokers.class, CALLS_REAL_METHODS)) {
            FailableBiConsumer<Object, Object, Throwable> failableBiConsumer = (FailableBiConsumer<Object, Object, Throwable>) FailableBiConsumer.nop();
            methodInvokers.when(() -> MethodInvokers.asInterfaceInstance(FailableBiConsumer.class, (Method) null)).thenReturn(failableBiConsumer);
            //TODO: Needs initialization with real value
            Method method = null;
            //Act Statement(s)
            FailableBiConsumer<Object, Object, Throwable> result = MethodInvokers.asFailableBiConsumer(method);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(failableBiConsumer));
                methodInvokers.verify(() -> MethodInvokers.asInterfaceInstance(FailableBiConsumer.class, (Method) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${39d96e72-e88d-3cfe-9c22-a186963b078d}
    @Test()
    void asFailableBiFunctionTest() throws IllegalAccessException {
        //Arrange Statement(s)
        try (MockedStatic<MethodInvokers> methodInvokers = mockStatic(MethodInvokers.class, CALLS_REAL_METHODS)) {
            FailableBiFunction<Object, Object, Object, Throwable> failableBiFunction = (FailableBiFunction<Object, Object, Object, Throwable>) FailableBiFunction.nop();
            methodInvokers.when(() -> MethodInvokers.asInterfaceInstance(FailableBiFunction.class, (Method) null)).thenReturn(failableBiFunction);
            //TODO: Needs initialization with real value
            Method method = null;
            //Act Statement(s)
            FailableBiFunction<Object, Object, Object, Throwable> result = MethodInvokers.asFailableBiFunction(method);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(failableBiFunction));
                methodInvokers.verify(() -> MethodInvokers.asInterfaceInstance(FailableBiFunction.class, (Method) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ba13eb5c-b286-3c65-aa33-7d7f76dd1327}
    @Test()
    void asFailableFunctionTest() throws IllegalAccessException {
        //Arrange Statement(s)
        try (MockedStatic<MethodInvokers> methodInvokers = mockStatic(MethodInvokers.class, CALLS_REAL_METHODS)) {
            FailableFunction<Object, Object, Throwable> failableFunction = (FailableFunction<Object, Object, Throwable>) FailableFunction.identity();
            methodInvokers.when(() -> MethodInvokers.asInterfaceInstance(FailableFunction.class, (Method) null)).thenReturn(failableFunction);
            //TODO: Needs initialization with real value
            Method method = null;
            //Act Statement(s)
            FailableFunction<Object, Object, Throwable> result = MethodInvokers.asFailableFunction(method);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(failableFunction));
                methodInvokers.verify(() -> MethodInvokers.asInterfaceInstance(FailableFunction.class, (Method) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${aa58c627-f4d4-31bf-b5d3-4888552565fc}
    @Test()
    void asFailableSupplierTest() throws IllegalAccessException {
        //Arrange Statement(s)
        try (MockedStatic<MethodInvokers> methodInvokers = mockStatic(MethodInvokers.class, CALLS_REAL_METHODS)) {
            FailableSupplier<Object, Throwable> failableSupplier = (FailableSupplier<Object, Throwable>) FailableSupplier.nul();
            methodInvokers.when(() -> MethodInvokers.asInterfaceInstance(FailableSupplier.class, (Method) null)).thenReturn(failableSupplier);
            //TODO: Needs initialization with real value
            Method method = null;
            //Act Statement(s)
            FailableSupplier<Object, Throwable> result = MethodInvokers.asFailableSupplier(method);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(failableSupplier));
                methodInvokers.verify(() -> MethodInvokers.asInterfaceInstance(FailableSupplier.class, (Method) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7061a179-ec6f-36fa-942d-3673cfe095e2}
    @Test()
    void asFunctionTest() throws IllegalAccessException {
        //Arrange Statement(s)
        try (MockedStatic<MethodInvokers> methodInvokers = mockStatic(MethodInvokers.class, CALLS_REAL_METHODS)) {
            methodInvokers.when(() -> MethodInvokers.asInterfaceInstance(Function.class, (Method) null)).thenReturn(null);
            //TODO: Needs initialization with real value
            Method method = null;
            //Act Statement(s)
            Function<Object, Object> result = MethodInvokers.asFunction(method);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                methodInvokers.verify(() -> MethodInvokers.asInterfaceInstance(Function.class, (Method) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f3a5c11d-a2e2-3483-a265-b42fb6b6a683}
    @Test()
    void asInterfaceInstanceTest() {
        //Arrange Statement(s)
        Method method = null;
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            MethodInvokers.asInterfaceInstance(Object.class, method);
        });

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${5b332415-c444-30cb-ba49-dab34a8607c5}
    @Test()
    void asInterfaceInstanceWhenCaughtIllegalAccessExceptionThrowsUncheckedIllegalAccessException() {
        /* Branches:
         * (catch-exception (IllegalAccessException)) : true  #  inside unreflectUnchecked method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Method method = null;
        IllegalAccessException illegalAccessException = new IllegalAccessException();
        //Act Statement(s)
        final UncheckedIllegalAccessException result = assertThrows(UncheckedIllegalAccessException.class, () -> {
            MethodInvokers.asInterfaceInstance(Object.class, method);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), isA(illegalAccessException.getClass()));
        });
    }

    //Sapient generated method id: ${6b37d8ae-48e4-3474-8940-c907b682595f}
    @Test()
    void asSupplierTest() throws IllegalAccessException {
        //Arrange Statement(s)
        try (MockedStatic<MethodInvokers> methodInvokers = mockStatic(MethodInvokers.class, CALLS_REAL_METHODS)) {
            methodInvokers.when(() -> MethodInvokers.asInterfaceInstance(Supplier.class, (Method) null)).thenReturn(null);
            //TODO: Needs initialization with real value
            Method method = null;
            //Act Statement(s)
            Supplier result = MethodInvokers.asSupplier(method);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                methodInvokers.verify(() -> MethodInvokers.asInterfaceInstance(Supplier.class, (Method) null), atLeast(1));
            });
        }
    }
}
