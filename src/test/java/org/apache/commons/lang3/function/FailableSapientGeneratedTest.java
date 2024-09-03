package org.apache.commons.lang3.function;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.function.BiConsumer;
import java.util.concurrent.Callable;
import org.apache.commons.lang3.stream.Streams;
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
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.closeTo;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FailableSapientGeneratedTest {

    private final FailableRunnable actionMock = mock(FailableRunnable.class);

    private final FailableBooleanSupplier failableBooleanSupplierMock = mock(FailableBooleanSupplier.class);

    private final FailableCallable failableCallableMock = mock(FailableCallable.class);

    private final FailableRunnable failableRunnableMock = mock(FailableRunnable.class);

    private final FailableRunnable failableRunnableMock2 = mock(FailableRunnable.class);

    private final FailableRunnable runnableMock = mock(FailableRunnable.class);

    //Sapient generated method id: ${acceptTest}, hash: 355123B6C0CC51AA7DDBA490C98907BB
    @Test()
    void acceptTest() {
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

    //Sapient generated method id: ${accept1Test}, hash: 17C00E6699026C2529B6E2FC4EC25A3B
    @Test()
    void accept1Test() {
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

    //Sapient generated method id: ${accept2Test}, hash: 8D91ACC60D6E55443ED6D4D3CE8D9818
    @Test()
    void accept2Test() {
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

    //Sapient generated method id: ${accept3Test}, hash: 3E3EB6BBDF72AECAD4CCE96FA14BE46B
    @Test()
    void accept3Test() {
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

    //Sapient generated method id: ${accept4Test}, hash: F82846E19EE70672BC643E5A60EAD9F6
    @Test()
    void accept4Test() {
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

    //Sapient generated method id: ${applyTest}, hash: 7249E095361168DC15003D07FB8EC6ED
    @Test()
    void applyTest() {
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

    //Sapient generated method id: ${apply1Test}, hash: 87FF35ED6B6EBCBEBF9171A2E402D498
    @Test()
    void apply1Test() {
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

    //Sapient generated method id: ${applyAsDoubleTest}, hash: 736FB9B02C29B79691B548FFFA65FCCB
    @Test()
    void applyAsDoubleTest() {
        //Arrange Statement(s)
        FailableDoubleBinaryOperator failableDoubleBinaryOperatorMock = mock(FailableDoubleBinaryOperator.class);
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            failable.when(() -> Failable.getAsDouble((FailableDoubleSupplier) any())).thenReturn(Double.parseDouble("0.0"));
            //Act Statement(s)
            double result = Failable.applyAsDouble(failableDoubleBinaryOperatorMock, Double.parseDouble("0.0"), Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001));
                failable.verify(() -> Failable.getAsDouble((FailableDoubleSupplier) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${asBiConsumerTest}, hash: B786BFBAFC69BF7AA676EF6F335A2F35
    @Test()
    void asBiConsumerTest() {
        //Arrange Statement(s)
        FailableBiConsumer failableBiConsumer = FailableBiConsumer.nop();
        
        //Act Statement(s)
        BiConsumer<Object, Object> result = Failable.asBiConsumer(failableBiConsumer);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${asBiFunctionTest}, hash: D5DEE0546ED777525B2B0012AE54BAC0
    @Test()
    void asBiFunctionTest() {
        //Arrange Statement(s)
        FailableBiFunction failableBiFunction = FailableBiFunction.nop();
        
        //Act Statement(s)
        BiFunction<Object, Object, Object> result = Failable.asBiFunction(failableBiFunction);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${asBiPredicateTest}, hash: 9B9C9C9CFA254D4FAB6FC901BDB7E49B
    @Test()
    void asBiPredicateTest() {
        //Arrange Statement(s)
        FailableBiPredicate failableBiPredicate = FailableBiPredicate.falsePredicate();
        
        //Act Statement(s)
        BiPredicate<Object, Object> result = Failable.asBiPredicate(failableBiPredicate);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${asCallableTest}, hash: B239F1C7CC014B4BE70F6A8AFF473E48
    @Test()
    void asCallableTest() {
        
        //Act Statement(s)
        Callable result = Failable.asCallable(failableCallableMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${asConsumerTest}, hash: 1743F0BA9F740998F089F3C216FFA66A
    @Test()
    void asConsumerTest() {
        //Arrange Statement(s)
        FailableConsumer failableConsumer = FailableConsumer.nop();
        
        //Act Statement(s)
        Consumer result = Failable.asConsumer(failableConsumer);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${asFunctionTest}, hash: 69CA459F36113BA16A36D07326D395C2
    @Test()
    void asFunctionTest() {
        //Arrange Statement(s)
        FailableFunction failableFunction = FailableFunction.identity();
        
        //Act Statement(s)
        Function<Object, Object> result = Failable.asFunction(failableFunction);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${asPredicateTest}, hash: A85820FE58F0A48AAB03F8A2CE4A65A0
    @Test()
    void asPredicateTest() {
        //Arrange Statement(s)
        FailablePredicate failablePredicate = FailablePredicate.falsePredicate();
        
        //Act Statement(s)
        Predicate result = Failable.asPredicate(failablePredicate);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${asRunnableTest}, hash: BF48C2AFCEBAEE333BFBB51F6FDD8B2E
    @Test()
    void asRunnableTest() {
        
        //Act Statement(s)
        Runnable result = Failable.asRunnable(failableRunnableMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${asSupplierTest}, hash: 138A0A3B9C0DE650FE0B1B6D29F63F0B
    @Test()
    void asSupplierTest() {
        //Arrange Statement(s)
        FailableSupplier failableSupplier = FailableSupplier.nul();
        
        //Act Statement(s)
        Supplier result = Failable.asSupplier(failableSupplier);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${callTest}, hash: 63A941E5E0709116B44FF3EDE0A05612
    @Test()
    void callTest() {
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            failable.when(() -> Failable.get((FailableSupplier) any())).thenReturn(object);
            //Act Statement(s)
            Object result = Failable.call(failableCallableMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                failable.verify(() -> Failable.get((FailableSupplier) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getTest}, hash: 88A77FD28B6A809DDB8D4D3209882D6E
    @Test()
    void getTest() {
        //Arrange Statement(s)
        FailableSupplier failableSupplier = FailableSupplier.nul();
        
        //Act Statement(s)
        Object result = Failable.get(failableSupplier);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getWhenCaughtThrowableThrowsRuntimeException}, hash: 89F986C9A5D8A69186319AB8C5E0C27F
    @Test()
    void getWhenCaughtThrowableThrowsRuntimeException() {
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
            FailableSupplier failableSupplier = FailableSupplier.nul();
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

    //Sapient generated method id: ${getAsBooleanWhenSupplierGetAsBoolean}, hash: 6EBC63E22A8424194F626685A972C523
    @Test()
    void getAsBooleanWhenSupplierGetAsBoolean() {
        /* Branches:
         * (supplier.getAsBoolean()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = Failable.getAsBoolean(failableBooleanSupplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${getAsBooleanWhenSupplierNotGetAsBoolean}, hash: 176490CC1FCB82F76E2FF5294F8A1A73
    @Test()
    void getAsBooleanWhenSupplierNotGetAsBoolean() {
        /* Branches:
         * (supplier.getAsBoolean()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = Failable.getAsBoolean(failableBooleanSupplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${getAsBooleanWhenCaughtThrowableThrowsRuntimeException}, hash: D85648F7A546A610D8D37A4DCED530E0
    @Test()
    void getAsBooleanWhenCaughtThrowableThrowsRuntimeException() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        FailableBooleanSupplier supplierMock = mock(FailableBooleanSupplier.class);
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(supplierMock).getAsBoolean();
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            failable.when(() -> Failable.rethrow(throwable)).thenThrow(runtimeException);
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Failable.getAsBoolean(supplierMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                verify(supplierMock, atLeast(1)).getAsBoolean();
                failable.verify(() -> Failable.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getAsDoubleTest}, hash: 6A73999DB97A80AB6BDD3BE530380203
    @Test()
    void getAsDoubleTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        FailableDoubleSupplier failableDoubleSupplierMock = mock(FailableDoubleSupplier.class);
        
        //Act Statement(s)
        double result = Failable.getAsDouble(failableDoubleSupplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${getAsDoubleWhenCaughtThrowableThrowsRuntimeException}, hash: 2790C40233F831F12066855C042E4C7E
    @Test()
    void getAsDoubleWhenCaughtThrowableThrowsRuntimeException() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        FailableDoubleSupplier supplierMock = mock(FailableDoubleSupplier.class);
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            doReturn(Double.parseDouble("0.0")).when(supplierMock).getAsDouble();
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            failable.when(() -> Failable.rethrow(throwable)).thenThrow(runtimeException);
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Failable.getAsDouble(supplierMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                verify(supplierMock, atLeast(1)).getAsDouble();
                failable.verify(() -> Failable.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getAsIntTest}, hash: DAE5763DD3DF1363A0923630054C24AC
    @Test()
    void getAsIntTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        FailableIntSupplier failableIntSupplierMock = mock(FailableIntSupplier.class);
        
        //Act Statement(s)
        int result = Failable.getAsInt(failableIntSupplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${getAsIntWhenCaughtThrowableThrowsRuntimeException}, hash: 5B62A2BC83F5EC3F9748F697F761F117
    @Test()
    void getAsIntWhenCaughtThrowableThrowsRuntimeException() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        FailableIntSupplier supplierMock = mock(FailableIntSupplier.class);
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            doReturn(0).when(supplierMock).getAsInt();
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            failable.when(() -> Failable.rethrow(throwable)).thenThrow(runtimeException);
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Failable.getAsInt(supplierMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                verify(supplierMock, atLeast(1)).getAsInt();
                failable.verify(() -> Failable.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getAsLongTest}, hash: BDCBBD57E248A0533DCE8D106C2BCEA6
    @Test()
    void getAsLongTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        FailableLongSupplier failableLongSupplierMock = mock(FailableLongSupplier.class);
        
        //Act Statement(s)
        long result = Failable.getAsLong(failableLongSupplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }

    //Sapient generated method id: ${getAsLongWhenCaughtThrowableThrowsRuntimeException}, hash: 267006CA67EE428477368C78AF4ADC9C
    @Test()
    void getAsLongWhenCaughtThrowableThrowsRuntimeException() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        FailableLongSupplier supplierMock = mock(FailableLongSupplier.class);
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            doReturn(0L).when(supplierMock).getAsLong();
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            failable.when(() -> Failable.rethrow(throwable)).thenThrow(runtimeException);
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Failable.getAsLong(supplierMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                verify(supplierMock, atLeast(1)).getAsLong();
                failable.verify(() -> Failable.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getAsShortTest}, hash: 4E58ACD7A15E01AF4304BCAD9FC61D02
    @Test()
    void getAsShortTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        FailableShortSupplier failableShortSupplierMock = mock(FailableShortSupplier.class);
        
        //Act Statement(s)
        short result = Failable.getAsShort(failableShortSupplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }

    //Sapient generated method id: ${getAsShortWhenCaughtThrowableThrowsRuntimeException}, hash: BF4B265B38384F89DA7465573ACA5BC6
    @Test()
    void getAsShortWhenCaughtThrowableThrowsRuntimeException() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        FailableShortSupplier supplierMock = mock(FailableShortSupplier.class);
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            doReturn((short) 0).when(supplierMock).getAsShort();
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            failable.when(() -> Failable.rethrow(throwable)).thenThrow(runtimeException);
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Failable.getAsShort(supplierMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                verify(supplierMock, atLeast(1)).getAsShort();
                failable.verify(() -> Failable.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${rethrowWhenThrowableNotInstanceOfIOExceptionThrowsUndeclaredThrowableException}, hash: 584987626D06BA615B272679A80A4F09
    @Test()
    void rethrowWhenThrowableNotInstanceOfIOExceptionThrowsUndeclaredThrowableException() {
        /* Branches:
         * (throwable instanceof IOException) : false
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

    //Sapient generated method id: ${runTest}, hash: 558D1FADC49FFA0641CAA63D3BCD3C83
    @Test()
    void runTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Failable.run(failableRunnableMock);
    }

    //Sapient generated method id: ${runWhenCaughtThrowableThrowsRuntimeException}, hash: 7A7F9CFE8922C085CC83756F722705B0
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
            doNothing().when(runnableMock).run();
            RuntimeException runtimeException = new RuntimeException();
            Throwable throwable = new Throwable();
            failable.when(() -> Failable.rethrow(throwable)).thenThrow(runtimeException);
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                Failable.run(runnableMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                verify(runnableMock, atLeast(1)).run();
                failable.verify(() -> Failable.rethrow(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${streamTest}, hash: 3111FE82B5BB9235EAE64EE386738BB8
    @Test()
    void streamTest() {
        //Arrange Statement(s)
        Collection<Object> collection = new ArrayList<>();
        
        //Act Statement(s)
        Streams.FailableStream result = Failable.stream(collection);
        
        //Assert statement(s)
        //TODO: Please implement equals method in FailableStream for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${stream1Test}, hash: 5045C9BE3F308DAAEEDA510D3ED6E2DB
    @Test()
    void stream1Test() {
        //Arrange Statement(s)
        Stream<Object> stream = Stream.empty();
        
        //Act Statement(s)
        Streams.FailableStream result = Failable.stream(stream);
        
        //Assert statement(s)
        //TODO: Please implement equals method in FailableStream for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${testWhenGetAsBooleanPredicateTestObject1Object2}, hash: ED535862EB37CBD98C0C4C069A399CB7
    @Test()
    void testWhenGetAsBooleanPredicateTestObject1Object2() {
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

    //Sapient generated method id: ${testWhenGetAsBooleanNotPredicateTestObject1Object2}, hash: 3438178D2239E1659F1C4E2CDB69A8A9
    @Test()
    void testWhenGetAsBooleanNotPredicateTestObject1Object2() {
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

    //Sapient generated method id: ${test1WhenGetAsBooleanPredicateTestObject}, hash: 92D2743316E4235B3BDB4F9C61512407
    @Test()
    void test1WhenGetAsBooleanPredicateTestObject() {
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

    //Sapient generated method id: ${test1WhenGetAsBooleanNotPredicateTestObject}, hash: 11DCE996A6628786715565C7207F2B71
    @Test()
    void test1WhenGetAsBooleanNotPredicateTestObject() {
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

    //Sapient generated method id: ${tryWithResourcesWhenResourcesIsNotEmptyAndThIsNull}, hash: EADE7B9B6DC3DA1037C917BBB5583B18
    @Test()
    void tryWithResourcesWhenResourcesIsNotEmptyAndThIsNull() {
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
        FailableConsumer<Throwable, Throwable> failableConsumer = null;
        FailableRunnable<Throwable>[] failableRunnableArray = new FailableRunnable[] { failableRunnableMock2 };
        
        //Act Statement(s)
        Failable.tryWithResources(failableRunnableMock, failableConsumer, failableRunnableArray);
    }

    //Sapient generated method id: ${tryWithResourcesWhenResourcesIsNotNullAndResourcesIsNotEmptyAndThIsNull}, hash: E051355AC878BF90AA42DC845C151B58
    @Test()
    void tryWithResourcesWhenResourcesIsNotNullAndResourcesIsNotEmptyAndThIsNull() {
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
        FailableConsumer failableConsumer = FailableConsumer.nop();
        FailableRunnable<Throwable>[] failableRunnableArray = new FailableRunnable[] { failableRunnableMock2 };
        
        //Act Statement(s)
        Failable.tryWithResources(failableRunnableMock, failableConsumer, failableRunnableArray);
    }

    //Sapient generated method id: ${tryWithResourcesWhenResourcesIsNotNullAndResourcesIsNotEmptyAndThIsNotNull}, hash: 00070B34E56E68ED8FC4BEF54F747807
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
        doNothing().when(actionMock).run();
        doNothing().when(runnableMock).run();
        FailableConsumer failableConsumer = FailableConsumer.nop();
        FailableRunnable<Throwable>[] failableRunnableArray = new FailableRunnable[] { runnableMock };
        
        //Act Statement(s)
        Failable.tryWithResources(actionMock, failableConsumer, failableRunnableArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(actionMock).run();
            verify(runnableMock).run();
        });
    }

    //Sapient generated method id: ${tryWithResourcesWhenThIsNullAndThIsNotNull}, hash: 8C47BAF9C637387BC308D177BB595A46
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
        doNothing().when(actionMock).run();
        doNothing().when(runnableMock).run();
        FailableConsumer<Throwable, Throwable> failableConsumer = null;
        FailableRunnable<Throwable>[] failableRunnableArray = new FailableRunnable[] { runnableMock };
        
        //Act Statement(s)
        Failable.tryWithResources(actionMock, failableConsumer, failableRunnableArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(actionMock).run();
            verify(runnableMock).run();
        });
    }

    //Sapient generated method id: ${tryWithResources1Test}, hash: A7595CFAECF2DCD3D9F1D02BA858E7B4
    @Test()
    void tryWithResources1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Failable> failable = mockStatic(Failable.class, CALLS_REAL_METHODS)) {
            FailableRunnable<Throwable>[] failableRunnableArray = new FailableRunnable[] {};
            failable.when(() -> Failable.tryWithResources(failableRunnableMock, (FailableConsumer) null, failableRunnableArray)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            Failable.tryWithResources(failableRunnableMock, failableRunnableArray);
            //Assert statement(s)
            assertAll("result", () -> failable.verify(() -> Failable.tryWithResources(failableRunnableMock, (FailableConsumer) null, failableRunnableArray), atLeast(1)));
        }
    }
}
