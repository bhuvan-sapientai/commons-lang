package org.apache.commons.lang3.math;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.closeTo;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FractionSapientGeneratedTest {

    //Sapient generated method id: ${97abcce5-e895-3882-8e22-a99e74d65415}
    @Test()
    void getFractionWhenDenominatorEquals0ThrowsArithmeticException() {
        /* Branches:
         * (denominator == 0) : true
         */
        //Arrange Statement(s)
        ArithmeticException arithmeticException = new ArithmeticException("The denominator must not be zero");
        //Act Statement(s)
        final ArithmeticException result = assertThrows(ArithmeticException.class, () -> {
            Fraction.getFraction(0, 0);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(arithmeticException.getMessage()));
        });
    }

    //Sapient generated method id: ${106d6ab4-91b3-3284-8710-04a63dd6ab3e}
    @Test()
    void getFractionWhenDenominatorEqualsIntegerMIN_VALUEThrowsArithmeticException() {
        /* Branches:
         * (denominator == 0) : false
         * (denominator < 0) : true
         * (numerator == Integer.MIN_VALUE) : false
         * (denominator == Integer.MIN_VALUE) : true
         */
        //Arrange Statement(s)
        ArithmeticException arithmeticException = new ArithmeticException("overflow: can't negate");
        //Act Statement(s)
        final ArithmeticException result = assertThrows(ArithmeticException.class, () -> {
            Fraction.getFraction(0, -2147483648);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(arithmeticException.getMessage()));
        });
    }

    //Sapient generated method id: ${50c0831a-39b4-3350-bed1-bc3160ba14e6}
    @Test()
    void getFractionWhenDenominatorNotEqualsIntegerMIN_VALUE() {
        /* Branches:
         * (denominator == 0) : false
         * (denominator < 0) : true
         * (numerator == Integer.MIN_VALUE) : false
         * (denominator == Integer.MIN_VALUE) : false
         */
        //Act Statement(s)
        Fraction result = Fraction.getFraction(0, -1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${1951df1d-bbbc-338d-b50e-32bc0d90ce7b}
    @Test()
    void getFraction1WhenDenominatorEquals0ThrowsArithmeticException() {
        /* Branches:
         * (denominator == 0) : true
         */
        //Arrange Statement(s)
        ArithmeticException arithmeticException = new ArithmeticException("The denominator must not be zero");
        //Act Statement(s)
        final ArithmeticException result = assertThrows(ArithmeticException.class, () -> {
            Fraction.getFraction(0, 0, 0);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(arithmeticException.getMessage()));
        });
    }

    //Sapient generated method id: ${b4847936-3ad5-3c2a-a950-3afd75bd54c9}
    @Test()
    void getFraction1WhenDenominatorLessThan0ThrowsArithmeticException() {
        /* Branches:
         * (denominator == 0) : false
         * (denominator < 0) : true
         */
        //Arrange Statement(s)
        ArithmeticException arithmeticException = new ArithmeticException("The denominator must not be negative");
        //Act Statement(s)
        final ArithmeticException result = assertThrows(ArithmeticException.class, () -> {
            Fraction.getFraction(0, 0, -1);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(arithmeticException.getMessage()));
        });
    }

    //Sapient generated method id: ${c6611cc4-3ea3-30ef-9278-ba36ea44191f}
    @Test()
    void getFraction1WhenNumeratorLessThan0ThrowsArithmeticException() {
        /* Branches:
         * (denominator == 0) : false
         * (denominator < 0) : false
         * (numerator < 0) : true
         */
        //Arrange Statement(s)
        ArithmeticException arithmeticException = new ArithmeticException("The numerator must not be negative");
        //Act Statement(s)
        final ArithmeticException result = assertThrows(ArithmeticException.class, () -> {
            Fraction.getFraction(0, -1, 1);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(arithmeticException.getMessage()));
        });
    }

    //Sapient generated method id: ${c3d1cf2f-9db0-3ee2-93da-556500e8bef2}
    @Test()
    void getFraction1WhenNumeratorValueNotGreaterThanIntegerMAX_VALUE() {
        /* Branches:
         * (denominator == 0) : false
         * (denominator < 0) : false
         * (numerator < 0) : false
         * (whole < 0) : true
         * (numeratorValue < Integer.MIN_VALUE) : false
         * (numeratorValue > Integer.MAX_VALUE) : false
         */
        //Act Statement(s)
        Fraction result = Fraction.getFraction(-1, 0, 1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${dce26f2a-bdfd-3430-a93f-712e69f79283}
    @Test()
    void getFraction1WhenNumeratorValueNotLessThanIntegerMIN_VALUEAndNumeratorValueGreaterThanIntegerMAThrowsArithmeticException() {
        /* Branches:
         * (denominator == 0) : false
         * (denominator < 0) : false
         * (numerator < 0) : false
         * (whole < 0) : false
         * (numeratorValue < Integer.MIN_VALUE) : false
         * (numeratorValue > Integer.MAX_VALUE) : true
         */
        //Arrange Statement(s)
        ArithmeticException arithmeticException = new ArithmeticException("Numerator too large to represent as an Integer.");
        //Act Statement(s)
        final ArithmeticException result = assertThrows(ArithmeticException.class, () -> {
            Fraction.getFraction(1, 2147483647, 1);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(arithmeticException.getMessage()));
        });
    }

    //Sapient generated method id: ${53db1b33-860c-302a-b7dc-a4754d1a363d}
    @Test()
    void getReducedFractionWhenDenominatorEquals0ThrowsArithmeticException() {
        /* Branches:
         * (denominator == 0) : true
         */
        //Arrange Statement(s)
        ArithmeticException arithmeticException = new ArithmeticException("The denominator must not be zero");
        //Act Statement(s)
        final ArithmeticException result = assertThrows(ArithmeticException.class, () -> {
            Fraction.getReducedFraction(0, 0);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(arithmeticException.getMessage()));
        });
    }

    //Sapient generated method id: ${f07a24ff-8880-35fc-b2c1-ca00ad2cfb7b}
    @Test()
    void getReducedFractionWhenNumeratorEquals0() {
        /* Branches:
         * (denominator == 0) : false
         * (numerator == 0) : true
         */
        //Act Statement(s)
        Fraction result = Fraction.getReducedFraction(0, 1);
        Fraction fraction = Fraction.ZERO;
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(fraction)));
    }

    //Sapient generated method id: ${2be0bcd0-ce63-34e5-993e-c0ee08028130}
    @Disabled()
    @Test()
    void getReducedFractionWhenVEqualsIntegerMIN_VALUEThrowsArithmeticException() {
        /* Branches:
         * (denominator == 0) : false
         * (numerator == 0) : false
         * (denominator == Integer.MIN_VALUE) : true
         * ((numerator & 1) == 0) : true
         * (denominator < 0) : true
         * (numerator == Integer.MIN_VALUE) : false
         * (denominator == Integer.MIN_VALUE) : false
         * (u == 0) : false  #  inside greatestCommonDivisor method
         * (v == 0) : true  #  inside greatestCommonDivisor method
         * (u == Integer.MIN_VALUE) : false  #  inside greatestCommonDivisor method
         * (v == Integer.MIN_VALUE) : true  #  inside greatestCommonDivisor method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ArithmeticException arithmeticException = new ArithmeticException("overflow: gcd is 2^31");
        //Act Statement(s)
        final ArithmeticException result = assertThrows(ArithmeticException.class, () -> {
            Fraction.getReducedFraction(0, 0);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(arithmeticException.getMessage()));
        });
    }

    //Sapient generated method id: ${b0130995-2754-3ecc-81e9-ef771b427f00}
    @Disabled()
    @Test()
    void getReducedFractionWhenVNotEqualsIntegerMIN_VALUE() {
        /* Branches:
         * (denominator == 0) : false
         * (numerator == 0) : false
         * (denominator == Integer.MIN_VALUE) : true
         * ((numerator & 1) == 0) : true
         * (denominator < 0) : true
         * (numerator == Integer.MIN_VALUE) : false
         * (denominator == Integer.MIN_VALUE) : false
         * (u == 0) : false  #  inside greatestCommonDivisor method
         * (v == 0) : true  #  inside greatestCommonDivisor method
         * (u == Integer.MIN_VALUE) : false  #  inside greatestCommonDivisor method
         * (v == Integer.MIN_VALUE) : false  #  inside greatestCommonDivisor method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Fraction result = Fraction.getReducedFraction(0, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${7acaf649-5c7f-3c7b-badf-5b8964056506}
    @Disabled()
    @Test()
    void getReducedFractionWhenMathAbsVEquals1() {
        /* Branches:
         * (denominator == 0) : false
         * (numerator == 0) : false
         * (denominator == Integer.MIN_VALUE) : true
         * ((numerator & 1) == 0) : true
         * (denominator < 0) : true
         * (numerator == Integer.MIN_VALUE) : false
         * (denominator == Integer.MIN_VALUE) : false
         * (u == 0) : false  #  inside greatestCommonDivisor method
         * (v == 0) : false  #  inside greatestCommonDivisor method
         * (Math.abs(u) == 1) : false  #  inside greatestCommonDivisor method
         * (Math.abs(v) == 1) : true  #  inside greatestCommonDivisor method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Fraction result = Fraction.getReducedFraction(0, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${5f67c602-9335-397c-8f4a-f26519098799}
    @Disabled()
    @Test()
    void getReducedFractionWhenKNotEquals31AndUAnd1Equals1AndTAnd1Equals0AndTNotGreaterThan0AndTEquals0() {
        /* Branches:
         * (denominator == 0) : false
         * (numerator == 0) : false
         * (denominator == Integer.MIN_VALUE) : true
         * ((numerator & 1) == 0) : true
         * (denominator < 0) : true
         * (numerator == Integer.MIN_VALUE) : false
         * (denominator == Integer.MIN_VALUE) : false
         * (u == 0) : false  #  inside greatestCommonDivisor method
         * (v == 0) : false  #  inside greatestCommonDivisor method
         * (Math.abs(u) == 1) : false  #  inside greatestCommonDivisor method
         * (Math.abs(v) == 1) : false  #  inside greatestCommonDivisor method
         * (u > 0) : true  #  inside greatestCommonDivisor method
         * (v > 0) : true  #  inside greatestCommonDivisor method
         * ((u & 1) == 0) : true  #  inside greatestCommonDivisor method
         * ((v & 1) == 0) : true  #  inside greatestCommonDivisor method
         * (k < 31) : true  #  inside greatestCommonDivisor method
         * (k == 31) : false  #  inside greatestCommonDivisor method
         * ((u & 1) == 1) : true  #  inside greatestCommonDivisor method
         * ((t & 1) == 0) : true  #  inside greatestCommonDivisor method
         * (t > 0) : false  #  inside greatestCommonDivisor method
         * (t != 0) : false  #  inside greatestCommonDivisor method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Fraction result = Fraction.getReducedFraction(-3, -2147483648);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${7fdb3dde-97bf-3629-8a68-1c945643283c}
    @Test()
    void getReducedFractionWhenKNotEquals31AndUAnd1NotEquals1AndTAnd1Equals0AndTGreaterThan0AndTEquals0() {
        /* Branches:
         * (denominator == 0) : false
         * (numerator == 0) : false
         * (denominator == Integer.MIN_VALUE) : true
         * ((numerator & 1) == 0) : true
         * (denominator < 0) : true
         * (numerator == Integer.MIN_VALUE) : false
         * (denominator == Integer.MIN_VALUE) : false
         * (u == 0) : false  #  inside greatestCommonDivisor method
         * (v == 0) : false  #  inside greatestCommonDivisor method
         * (Math.abs(u) == 1) : false  #  inside greatestCommonDivisor method
         * (Math.abs(v) == 1) : false  #  inside greatestCommonDivisor method
         * (u > 0) : true  #  inside greatestCommonDivisor method
         * (v > 0) : true  #  inside greatestCommonDivisor method
         * ((u & 1) == 0) : true  #  inside greatestCommonDivisor method
         * ((v & 1) == 0) : true  #  inside greatestCommonDivisor method
         * (k < 31) : true  #  inside greatestCommonDivisor method
         * (k == 31) : false  #  inside greatestCommonDivisor method
         * ((u & 1) == 1) : false  #  inside greatestCommonDivisor method
         * ((t & 1) == 0) : true  #  inside greatestCommonDivisor method
         * (t > 0) : true  #  inside greatestCommonDivisor method
         * (t != 0) : false  #  inside greatestCommonDivisor method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Fraction result = Fraction.getReducedFraction(-32, -2147483648);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${32b40321-0681-33e8-a807-3a08079c2853}
    @Test()
    void getFraction2WhenValueNotLessThan0AndValueGreaterThanIntegerMAX_VALUEThrowsArithmeticException() {
        /* Branches:
         * (value < 0) : false
         * (value > Integer.MAX_VALUE) : true
         */
        //Arrange Statement(s)
        ArithmeticException arithmeticException = new ArithmeticException("The value must not be greater than Integer.MAX_VALUE or NaN");
        //Act Statement(s)
        final ArithmeticException result = assertThrows(ArithmeticException.class, () -> {
            Fraction.getFraction(Double.parseDouble("2.147483648E9"));
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(arithmeticException.getMessage()));
        });
    }

    //Sapient generated method id: ${658a9cf9-27cc-3146-b587-a595666b72f0}
    @Test()
    void getFraction2WhenILessThan25AndINotEquals25() {
        /* Branches:
         * (value < 0) : true
         * (value > Integer.MAX_VALUE) : false
         * (Double.isNaN(value)) : false
         * (delta1 > delta2) : true
         * (denom2 <= 10000) : true
         * (denom2 > 0) : true
         * (i < 25) : true
         * (i == 25) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Fraction> fraction = mockStatic(Fraction.class, CALLS_REAL_METHODS)) {
            Fraction fraction2 = Fraction.getFraction(Double.parseDouble("0.0"));
            fraction.when(() -> Fraction.getReducedFraction(-1, 2)).thenReturn(fraction2);
            //Act Statement(s)
            Fraction result = Fraction.getFraction(Double.parseDouble("-0.5"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(fraction2));
                fraction.verify(() -> Fraction.getReducedFraction(-1, 2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${12d01a4c-4fed-3793-9002-abc5cbf4d095}
    @Test()
    void getFraction3WhenPosGreaterThanOrEqualsTo0() {
        /* Branches:
         * (pos >= 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Fraction> fraction = mockStatic(Fraction.class, CALLS_REAL_METHODS)) {
            Fraction fraction2 = Fraction.getFraction(Double.parseDouble("0.0"));
            fraction.when(() -> Fraction.getFraction(Double.parseDouble("1.0"))).thenReturn(fraction2);
            //Act Statement(s)
            Fraction result = Fraction.getFraction("1.0");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(fraction2));
                fraction.verify(() -> Fraction.getFraction(Double.parseDouble("1.0")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2622d61a-4ff1-34dc-b4e0-e4582d2b29d8}
    @Test()
    void getFraction3WhenPosLessThan0ThrowsNumberFormatException() {
        /* Branches:
         * (pos >= 0) : false
         * (pos > 0) : true
         * (pos < 0) : true
         */
        //Arrange Statement(s)
        NumberFormatException numberFormatException = new NumberFormatException("The fraction could not be parsed as the format X Y/Z");
        //Act Statement(s)
        final NumberFormatException result = assertThrows(NumberFormatException.class, () -> {
            Fraction.getFraction("3  ");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(numberFormatException.getMessage()));
        });
    }

    //Sapient generated method id: ${579f9470-66a3-3960-932f-00cc8ec07dcb}
    @Test()
    void getFraction3WhenPosNotLessThan0() {
        /* Branches:
         * (pos >= 0) : false
         * (pos > 0) : true
         * (pos < 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Fraction> fraction = mockStatic(Fraction.class, CALLS_REAL_METHODS)) {
            Fraction fraction2 = Fraction.getFraction(Double.parseDouble("0.0"));
            fraction.when(() -> Fraction.getFraction(9, 0, 0)).thenReturn(fraction2);
            //Act Statement(s)
            Fraction result = Fraction.getFraction("9 0/0");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(fraction2));
                fraction.verify(() -> Fraction.getFraction(9, 0, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1e7eb190-68e2-3af5-b48d-c78fe46819b8}
    @Test()
    void getFraction3WhenPosLessThan0() {
        /* Branches:
         * (pos >= 0) : false
         * (pos > 0) : false
         * (pos < 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Fraction> fraction = mockStatic(Fraction.class, CALLS_REAL_METHODS)) {
            Fraction fraction2 = Fraction.getFraction(Double.parseDouble("0.0"));
            fraction.when(() -> Fraction.getFraction(8, 1)).thenReturn(fraction2);
            //Act Statement(s)
            Fraction result = Fraction.getFraction("8");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(fraction2));
                fraction.verify(() -> Fraction.getFraction(8, 1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1846c813-9c16-3cd3-ad47-f741cf9c1362}
    @Test()
    void getFraction3WhenPosNotGreaterThan0AndPosNotLessThan0() {
        /* Branches:
         * (pos >= 0) : false
         * (pos > 0) : false
         * (pos < 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Fraction> fraction = mockStatic(Fraction.class, CALLS_REAL_METHODS)) {
            Fraction fraction2 = Fraction.getFraction(Double.parseDouble("0.0"));
            fraction.when(() -> Fraction.getFraction(5, 0)).thenReturn(fraction2);
            //Act Statement(s)
            Fraction result = Fraction.getFraction("5/0");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(fraction2));
                fraction.verify(() -> Fraction.getFraction(5, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${603d23af-d518-3604-b6e0-3588ff81c23e}
    @Disabled()
    @Test()
    void getProperNumeratorTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        //Act Statement(s)
        int result = target.getProperNumerator();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${08ad8945-2b31-34d6-a4f4-12a0e5569a7a}
    @Disabled()
    @Test()
    void getProperWholeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        //Act Statement(s)
        int result = target.getProperWhole();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${767dc907-1074-3191-bfda-0a702630b7c3}
    @Disabled()
    @Test()
    void intValueTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        //Act Statement(s)
        int result = target.intValue();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${9023386b-0a58-3cc3-912f-1a61aadf88ac}
    @Disabled()
    @Test()
    void longValueTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        //Act Statement(s)
        long result = target.longValue();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }

    //Sapient generated method id: ${aeac4aab-4829-3a1e-aab9-a9108ac2e6bd}
    @Disabled()
    @Test()
    void floatValueTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        //Act Statement(s)
        float result = target.floatValue();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("0.0"))));
    }

    //Sapient generated method id: ${6f7e6bb6-bfda-39e2-9303-4545aceabb0b}
    @Disabled()
    @Test()
    void doubleValueTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        //Act Statement(s)
        double result = target.doubleValue();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${8cebd5b4-1f34-3e3b-b4c4-c1568bf17905}
    @Disabled()
    @Test()
    void reduceWhenEqualsZERO() {
        /* Branches:
         * (numerator == 0) : true
         * (equals(ZERO)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        //Act Statement(s)
        Fraction result = target.reduce();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${e0c7249a-8ecb-3a19-8da9-a97abb984602}
    @Disabled()
    @Test()
    void reduceWhenEqualsNotZERO() {
        /* Branches:
         * (numerator == 0) : true
         * (equals(ZERO)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        //Act Statement(s)
        Fraction result = target.reduce();
        Fraction fraction = Fraction.ZERO;
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(fraction)));
    }

    //Sapient generated method id: ${bd586093-b5cc-3870-a52f-efde638d2ffb}
    @Disabled()
    @Test()
    void invertWhenNumeratorEquals0ThrowsArithmeticException() {
        /* Branches:
         * (numerator == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        ArithmeticException arithmeticException = new ArithmeticException("Unable to invert zero.");
        //Act Statement(s)
        final ArithmeticException result = assertThrows(ArithmeticException.class, () -> {
            target.invert();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(arithmeticException.getMessage()));
        });
    }

    //Sapient generated method id: ${bddd317b-5314-3497-a5bb-bf3d9e3e5760}
    @Disabled()
    @Test()
    void negateWhenNumeratorNotEqualsIntegerMIN_VALUE() {
        /* Branches:
         * (numerator == Integer.MIN_VALUE) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        //Act Statement(s)
        Fraction result = target.negate();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${861d1ecb-56d8-3ef9-aab9-86de9509fc57}
    @Disabled()
    @Test()
    void absWhenNumeratorGreaterThanOrEqualsTo0() {
        /* Branches:
         * (numerator >= 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        //Act Statement(s)
        Fraction result = target.abs();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${1e8025a2-97bc-30ea-9ebc-474d39542777}
    @Disabled()
    @Test()
    void powWhenPowerEquals1() {
        /* Branches:
         * (power == 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        //Act Statement(s)
        Fraction result = target.pow(1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${a22db079-6a2a-3ceb-9d07-d541e5a0577d}
    @Disabled()
    @Test()
    void powWhenPowerEquals0() {
        /* Branches:
         * (power == 1) : false
         * (power == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        //Act Statement(s)
        Fraction result = target.pow(0);
        Fraction fraction = Fraction.ONE;
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(fraction)));
    }

    //Sapient generated method id: ${731503a0-fc92-3aa5-8e89-20efe263529c}
    @Disabled()
    @Test()
    void powWhenPowerEqualsIntegerMIN_VALUE() {
        /* Branches:
         * (power == 1) : false
         * (power == 0) : false
         * (power < 0) : true
         * (power == Integer.MIN_VALUE) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = spy(Fraction.getFraction(0, 0, 0));
        Fraction fraction = Fraction.getFraction(Double.parseDouble("0.0"));
        doReturn(fraction).when(target).invert();
        //Act Statement(s)
        Fraction result = target.pow(-2147483648);
        Fraction fraction2 = Fraction.getFraction(Double.parseDouble("0.0"));
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(fraction2));
            verify(target).invert();
        });
    }

    //Sapient generated method id: ${56f57727-1ffc-38dc-9c2d-9c98725549a6}
    @Disabled()
    @Test()
    void powWhenPowerNotEqualsIntegerMIN_VALUE() {
        /* Branches:
         * (power == 1) : false
         * (power == 0) : false
         * (power < 0) : true
         * (power == Integer.MIN_VALUE) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = spy(Fraction.getFraction(0, 0, 0));
        Fraction fraction = Fraction.getFraction(Double.parseDouble("0.0"));
        doReturn(fraction).when(target).invert();
        //Act Statement(s)
        Fraction result = target.pow(-2);
        Fraction fraction2 = Fraction.getFraction(Double.parseDouble("0.0"));
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(fraction2));
            verify(target).invert();
        });
    }

    //Sapient generated method id: ${435a3ddf-a61e-373c-82b1-75bdb53c9941}
    @Disabled()
    @Test()
    void powWhenPowerModulus2Equals0() {
        /* Branches:
         * (power == 1) : false
         * (power == 0) : false
         * (power < 0) : false
         * (power % 2 == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = spy(Fraction.getFraction(0, 0, 0));
        Fraction fraction = Fraction.getFraction(Double.parseDouble("0.0"));
        doReturn(fraction).when(target).multiplyBy(target);
        //Act Statement(s)
        Fraction result = target.pow(2);
        Fraction fraction2 = Fraction.getFraction(Double.parseDouble("0.0"));
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(fraction2));
            verify(target).multiplyBy(target);
        });
    }

    //Sapient generated method id: ${325301c8-cfa9-376e-a76f-1dd6c0e75f6d}
    @Disabled()
    @Test()
    void powWhenPowerModulus2NotEquals0() {
        /* Branches:
         * (power == 1) : false
         * (power == 0) : false
         * (power < 0) : false
         * (power % 2 == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = spy(Fraction.getFraction(0, 0, 0));
        Fraction fraction = Fraction.getFraction(Double.parseDouble("0.0"));
        doReturn(fraction).when(target).multiplyBy(target);
        //Act Statement(s)
        Fraction result = target.pow(3);
        Fraction fraction2 = Fraction.getFraction(Double.parseDouble("0.0"));
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(fraction2));
            verify(target).multiplyBy(target);
        });
    }

    //Sapient generated method id: ${9167f10c-3e04-3dcf-bc8e-920925acf08a}
    @Disabled()
    @Test()
    void addWhenIsAdd() {
        /* Branches:
         * (numerator == 0) : true  #  inside addSub method
         * (isAdd) : true  #  inside addSub method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        Fraction fraction = Fraction.getFraction(Double.parseDouble("0.0"));
        //Act Statement(s)
        Fraction result = target.add(fraction);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(fraction)));
    }

    //Sapient generated method id: ${4f9839ba-7cf1-365c-baa3-5f552678b260}
    @Disabled()
    @Test()
    void subtractWhenNotIsAdd() {
        /* Branches:
         * (numerator == 0) : true  #  inside addSub method
         * (isAdd) : false  #  inside addSub method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        Fraction fraction = Fraction.getFraction(Double.parseDouble("0.0"));
        //Act Statement(s)
        Fraction result = target.subtract(fraction);
        Fraction fraction2 = Fraction.getFraction(Double.parseDouble("0.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(fraction2)));
    }

    //Sapient generated method id: ${43c6b11e-d9e5-376b-8570-a53f6aea94dd}
    @Disabled()
    @Test()
    void multiplyByWhenNumeratorEquals0() {
        /* Branches:
         * (numerator == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        Fraction fraction = Fraction.getFraction(Double.parseDouble("0.0"));
        //Act Statement(s)
        Fraction result = target.multiplyBy(fraction);
        Fraction fraction2 = Fraction.ZERO;
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(fraction2)));
    }

    //Sapient generated method id: ${a1287407-0cf0-3ae7-b464-2f2ad45cd3ce}
    @Disabled()
    @Test()
    void divideByWhenFractionNumeratorEquals0ThrowsArithmeticException() {
        /* Branches:
         * (fraction.numerator == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        //TODO: Needs initialization with real value
        Fraction fraction = null;
        ArithmeticException arithmeticException = new ArithmeticException("The fraction to divide by must not be zero");
        //Act Statement(s)
        final ArithmeticException result = assertThrows(ArithmeticException.class, () -> {
            target.divideBy(fraction);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(arithmeticException.getMessage()));
        });
    }

    //Sapient generated method id: ${f51fd47b-892b-3955-9218-78744d52ee93}
    @Disabled()
    @Test()
    void divideByWhenFractionNumeratorNotEquals0() {
        /* Branches:
         * (fraction.numerator == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = spy(Fraction.getFraction(0, 0, 0));
        Fraction fraction = Fraction.getFraction(Double.parseDouble("0.0"));
        doReturn(fraction).when(target).multiplyBy((Fraction) any());
        Fraction fraction2 = Fraction.getFraction(Double.parseDouble("0.0"));
        //Act Statement(s)
        Fraction result = target.divideBy(fraction2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(fraction));
            verify(target).multiplyBy((Fraction) any());
        });
    }

    //Sapient generated method id: ${0a13476a-ee22-3bf8-8b25-27b62051f210}
    @Disabled()
    @Test()
    void compareToWhenThisEqualsOther() {
        /* Branches:
         * (this == other) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        //Act Statement(s)
        int result = target.compareTo(target);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${02c3d490-6241-33a2-a248-e106fddfcd66}
    @Disabled()
    @Test()
    void compareToWhenNumeratorNotEqualsOtherNumerator() {
        /* Branches:
         * (this == other) : false
         * (numerator == other.numerator) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        //TODO: Needs initialization with real value
        Fraction fraction = null;
        //Act Statement(s)
        int result = target.compareTo(fraction);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${5665d35a-de98-328f-9c90-e93b84c05012}
    @Disabled()
    @Test()
    void compareToWhenDenominatorEqualsOtherDenominator() {
        /* Branches:
         * (this == other) : false
         * (numerator == other.numerator) : true
         * (denominator == other.denominator) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        //TODO: Needs initialization with real value
        Fraction fraction = null;
        //Act Statement(s)
        int result = target.compareTo(fraction);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${0e64e8ed-a5dc-35ba-9660-05fba27bf54b}
    @Disabled()
    @Test()
    void toStringWhenToStringIsNull() {
        /* Branches:
         * (toString == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("0/0")));
    }

    //Sapient generated method id: ${6e787e80-34bd-3543-a966-49ea43269a11}
    @Disabled()
    @Test()
    void toProperStringWhenNumeratorEquals0() {
        /* Branches:
         * (toProperString == null) : true
         * (numerator == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Fraction target = Fraction.getFraction(0, 0, 0);
        //Act Statement(s)
        String result = target.toProperString();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("0")));
    }
}
