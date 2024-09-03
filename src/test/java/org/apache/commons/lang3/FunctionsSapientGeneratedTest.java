package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.function.BiConsumer;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.BiPredicate;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.BiFunction;
import org.mockito.stubbing.Answer;
import java.util.stream.Stream;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.function.Predicate;
import java.util.Collection;
import java.util.function.Supplier;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FunctionsSapientGeneratedTest {

    private final Functions.FailableBiConsumer functionsFailableBiConsumerMock = mock(Functions.FailableBiConsumer.class);

    private final Functions.FailableBiFunction functionsFailableBiFunctionMock = mock(Functions.FailableBiFunction.class);

    private final Functions.FailableBiPredicate functionsFailableBiPredicateMock = mock(Functions.FailableBiPredicate.class);

    private final Functions.FailableCallable functionsFailableCallableMock = mock(Functions.FailableCallable.class);

    private final Functions.FailableConsumer functionsFailableConsumerMock = mock(Functions.FailableConsumer.class);

    private final Functions.FailableFunction functionsFailableFunctionMock = mock(Functions.FailableFunction.class);

    private final Functions.FailablePredicate functionsFailablePredicateMock = mock(Functions.FailablePredicate.class);

    private final Functions.FailableRunnable functionsFailableRunnableMock = mock(Functions.FailableRunnable.class);

    private final Functions.FailableSupplier functionsFailableSupplierMock = mock(Functions.FailableSupplier.class);

    //Sapient generated method id: ${acceptTest}, hash: FB6A8903A817DF9C1F9BCA70FA035DF7
    @Test()
    void acceptTest() {
        //Arrange Statement(s)
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            functions.when(() -> Functions.run((Functions.FailableRunnable) any())).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            Object object2 = new Object();
            //Act Statement(s)
            Functions.accept(functionsFailableBiConsumerMock, object, object2);
            //Assert statement(s)
            assertAll("result", () -> functions.verify(() -> Functions.run((Functions.FailableRunnable) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${accept1Test}, hash: 188AA51A1B80B4D32CBE199DC5D39085
    @Test()
    void accept1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            functions.when(() -> Functions.run((Functions.FailableRunnable) any())).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            //Act Statement(s)
            Functions.accept(functionsFailableConsumerMock, object);
            //Assert statement(s)
            assertAll("result", () -> functions.verify(() -> Functions.run((Functions.FailableRunnable) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${applyTest}, hash: 5E6C75E6A354C457D83993C9E5189009
    @Test()
    void applyTest() {
        //Arrange Statement(s)
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            functions.when(() -> Functions.get((Functions.FailableSupplier) any())).thenReturn(object);
            Object object2 = new Object();
            Object object3 = new Object();
            //Act Statement(s)
            Object result = Functions.apply(functionsFailableBiFunctionMock, object2, object3);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                functions.verify(() -> Functions.get((Functions.FailableSupplier) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${apply1Test}, hash: F427369D1EF2DA7FC700ADDFBD07D2BF
    @Test()
    void apply1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            functions.when(() -> Functions.get((Functions.FailableSupplier) any())).thenReturn(object);
            Object object2 = new Object();
            //Act Statement(s)
            Object result = Functions.apply(functionsFailableFunctionMock, object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                functions.verify(() -> Functions.get((Functions.FailableSupplier) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${asBiConsumerTest}, hash: B5443A4ADD84F7E62F78AD9654DBD973
    @Test()
    void asBiConsumerTest() {
        
        //Act Statement(s)
        BiConsumer<Object, Object> result = Functions.asBiConsumer(functionsFailableBiConsumerMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${asBiFunctionTest}, hash: 1783EA6A896FA07E80EC873A46675822
    @Test()
    void asBiFunctionTest() {
        
        //Act Statement(s)
        BiFunction<Object, Object, Object> result = Functions.asBiFunction(functionsFailableBiFunctionMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${asBiPredicateTest}, hash: CAE9B883B1F46A8874DDD2499EB21649
    @Test()
    void asBiPredicateTest() {
        
        //Act Statement(s)
        BiPredicate<Object, Object> result = Functions.asBiPredicate(functionsFailableBiPredicateMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${asCallableTest}, hash: 3320A215CA0CA48E2E68FD68E0B5F8A8
    @Test()
    void asCallableTest() {
        
        //Act Statement(s)
        Callable result = Functions.asCallable(functionsFailableCallableMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${asConsumerTest}, hash: 1976AA9C0FCC4BCB30E0DDF630C96B47
    @Test()
    void asConsumerTest() {
        
        //Act Statement(s)
        Consumer result = Functions.asConsumer(functionsFailableConsumerMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${asFunctionTest}, hash: A388C66F781D8F865C617E319B616EF9
    @Test()
    void asFunctionTest() {
        
        //Act Statement(s)
        Function<Object, Object> result = Functions.asFunction(functionsFailableFunctionMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${asPredicateTest}, hash: 404373C62E71F7D0F80231985E95B927
    @Test()
    void asPredicateTest() {
        
        //Act Statement(s)
        Predicate result = Functions.asPredicate(functionsFailablePredicateMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${asRunnableTest}, hash: 7CF4110D392196A8EA16C0908C3549AD
    @Test()
    void asRunnableTest() {
        
        //Act Statement(s)
        Runnable result = Functions.asRunnable(functionsFailableRunnableMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${asSupplierTest}, hash: 2D5C11858E83553005C74F7DF0BF69F3
    @Test()
    void asSupplierTest() {
        
        //Act Statement(s)
        Supplier result = Functions.asSupplier(functionsFailableSupplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${callTest}, hash: 4EA7520FFF917264C36262E312CDDE3A
    @Test()
    void callTest() {
        //Arrange Statement(s)
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            functions.when(() -> Functions.get((Functions.FailableSupplier) any())).thenReturn(object);
            //Act Statement(s)
            Object result = Functions.call(functionsFailableCallableMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                functions.verify(() -> Functions.get((Functions.FailableSupplier) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getTest}, hash: DC17288D2C1C43F877BD07D7F3E2E3B0
    @Test()
    void getTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Object result = Functions.get(functionsFailableSupplierMock);
        
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getWhenCaughtThrowableThrowsRuntimeException}, hash: DE46D253052F1A7610111BFD50448E1E
    @Test()
    void getWhenCaughtThrowableThrowsRuntimeException() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Functions.FailableSupplier supplierMock = mock(Functions.FailableSupplier.class);
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            doReturn(object).when(supplierMock).get();
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            functions.when(() -> Functions.rethrow(throwable)).thenThrow(runtimeException);
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Functions.get(supplierMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                verify(supplierMock, atLeast(1)).get();
                functions.verify(() -> Functions.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${rethrowWhenThrowableNotInstanceOfIOExceptionThrowsUndeclaredThrowableException}, hash: 8AB0169ED14BE9BFD2DCAC3A463AE060
    @Test()
    void rethrowWhenThrowableNotInstanceOfIOExceptionThrowsUndeclaredThrowableException() {
        /* Branches:
         * (throwable instanceof IOException) : false
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

    //Sapient generated method id: ${runTest}, hash: C4000F37B880EB7E480D77FE1A6FC301
    @Test()
    void runTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Functions.run(functionsFailableRunnableMock);
    }

    //Sapient generated method id: ${runWhenCaughtThrowableThrowsRuntimeException}, hash: 4A3A86FD97883843D53DD7C8ABC9CA85
    @Test()
    void runWhenCaughtThrowableThrowsRuntimeException() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Functions.FailableRunnable runnableMock = mock(Functions.FailableRunnable.class);
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            doNothing().when(runnableMock).run();
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            functions.when(() -> Functions.rethrow(throwable)).thenThrow(runtimeException);
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Functions.run(runnableMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                verify(runnableMock, atLeast(1)).run();
                functions.verify(() -> Functions.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${streamTest}, hash: C23ED60D7764D3975CA14154060367BC
    @Test()
    void streamTest() {
        //Arrange Statement(s)
        Collection<Object> collection = new ArrayList<>();
        
        //Act Statement(s)
        Streams.FailableStream result = Functions.stream(collection);
        
        //Assert statement(s)
        //TODO: Please implement equals method in FailableStream for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${stream1Test}, hash: 2902FD393901E5AD576E82BB7A99287B
    @Test()
    void stream1Test() {
        //Arrange Statement(s)
        Stream<Object> stream = Stream.empty();
        
        //Act Statement(s)
        Streams.FailableStream result = Functions.stream(stream);
        
        //Assert statement(s)
        //TODO: Please implement equals method in FailableStream for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${testWhenSupplierGetAsBoolean}, hash: 19A517DBE3203A0C26E4165FFD29E170
    @Test()
    void testWhenSupplierGetAsBoolean() {
        /* Branches:
         * (supplier.getAsBoolean()) : true  #  inside getAsBoolean method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: supplier - Method: getAsBoolean
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        
        //Act Statement(s)
        boolean result = Functions.test(functionsFailableBiPredicateMock, object, object2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${testWhenSupplierNotGetAsBoolean}, hash: DC723E3C7C673FD94A08BB2575240303
    @Test()
    void testWhenSupplierNotGetAsBoolean() {
        /* Branches:
         * (supplier.getAsBoolean()) : false  #  inside getAsBoolean method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: supplier - Method: getAsBoolean
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        
        //Act Statement(s)
        boolean result = Functions.test(functionsFailableBiPredicateMock, object, object2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${testWhenCaughtThrowableThrowsRuntimeException}, hash: E52C14D2CC85E0676CAB049787BB0430
    @Test()
    void testWhenCaughtThrowableThrowsRuntimeException() {
        /* Branches:
         * (catch-exception (Throwable)) : true  #  inside getAsBoolean method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: supplier - Method: getAsBoolean
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            functions.when(() -> Functions.rethrow(throwable)).thenThrow(runtimeException);
            Object object = new Object();
            Object object2 = new Object();
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Functions.test(functionsFailableBiPredicateMock, object, object2);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                functions.verify(() -> Functions.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${test1WhenSupplierGetAsBoolean}, hash: CF90A99D2AAF692B8A86C56B3DEAA049
    @Test()
    void test1WhenSupplierGetAsBoolean() {
        /* Branches:
         * (supplier.getAsBoolean()) : true  #  inside getAsBoolean method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: supplier - Method: getAsBoolean
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = Functions.test(functionsFailablePredicateMock, object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${test1WhenSupplierNotGetAsBoolean}, hash: BD86CD0811D40F53E750EE88390EC645
    @Test()
    void test1WhenSupplierNotGetAsBoolean() {
        /* Branches:
         * (supplier.getAsBoolean()) : false  #  inside getAsBoolean method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: supplier - Method: getAsBoolean
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = Functions.test(functionsFailablePredicateMock, object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${test1WhenCaughtThrowableThrowsRuntimeException}, hash: 94B209B48851C7536CBE8ADF987DF1D0
    @Test()
    void test1WhenCaughtThrowableThrowsRuntimeException() {
        /* Branches:
         * (catch-exception (Throwable)) : true  #  inside getAsBoolean method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: supplier - Method: getAsBoolean
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            functions.when(() -> Functions.rethrow(throwable)).thenThrow(runtimeException);
            Object object = new Object();
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Functions.test(functionsFailablePredicateMock, object);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                functions.verify(() -> Functions.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${tryWithResourcesWhenErrorHandlerIsNotNull}, hash: F0CD60099A4B739B580A2C4CC290D5A5
    @Test()
    void tryWithResourcesWhenErrorHandlerIsNotNull() {
        /* Branches:
         * (errorHandler != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Functions.FailableRunnable<Throwable>[] failableRunnableArray = new Functions.FailableRunnable[] {};
        
        //Act Statement(s)
        Functions.tryWithResources(functionsFailableRunnableMock, functionsFailableConsumerMock, failableRunnableArray);
    }

    //Sapient generated method id: ${tryWithResourcesWhenErrorHandlerIsNull}, hash: A7DDB728F4276B5E3558BE3399172E5D
    @Test()
    void tryWithResourcesWhenErrorHandlerIsNull() {
        /* Branches:
         * (errorHandler != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Functions.FailableConsumer<Throwable, Throwable> functionsFailableConsumer = null;
        Functions.FailableRunnable<Throwable>[] failableRunnableArray = new Functions.FailableRunnable[] {};
        
        //Act Statement(s)
        Functions.tryWithResources(functionsFailableRunnableMock, functionsFailableConsumer, failableRunnableArray);
    }

    //Sapient generated method id: ${tryWithResources1Test}, hash: 60224AA5BDC7EA822F53637BB4201A4B
    @Test()
    void tryWithResources1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Functions> functions = mockStatic(Functions.class, CALLS_REAL_METHODS)) {
            Functions.FailableRunnable<Throwable>[] failableRunnableArray = new Functions.FailableRunnable[] {};
            functions.when(() -> Functions.tryWithResources(functionsFailableRunnableMock, (Functions.FailableConsumer) null, failableRunnableArray)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            Functions.tryWithResources(functionsFailableRunnableMock, failableRunnableArray);
            //Assert statement(s)
            assertAll("result", () -> functions.verify(() -> Functions.tryWithResources(functionsFailableRunnableMock, (Functions.FailableConsumer) null, failableRunnableArray), atLeast(1)));
        }
    }
}
