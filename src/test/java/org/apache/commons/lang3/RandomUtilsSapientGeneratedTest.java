package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RandomUtilsSapientGeneratedTest {

    //Sapient generated method id: ${nextBooleanWhenRandomNextBoolean}, hash: 9460DE6150336ABDD86FD7D65C5FA528
    @Test()
    void nextBooleanWhenRandomNextBoolean() {
        /* Branches:
         * (random().nextBoolean()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.util.concurrent.ThreadLocalRandom::nextBoolean has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = RandomUtils.nextBoolean();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${nextBooleanWhenRandomNotNextBoolean}, hash: 2CAD15830653FD9AC5BF0C5F0BA7C4A1
    @Test()
    void nextBooleanWhenRandomNotNextBoolean() {
        /* Branches:
         * (random().nextBoolean()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.util.concurrent.ThreadLocalRandom::nextBoolean has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = RandomUtils.nextBoolean();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${nextBytesWhenCountGreaterThanOrEqualsTo0ThrowsIllegalArgumentException}, hash: 734D2D581C19D92B8386BECA2E325F57
    @Test()
    void nextBytesWhenCountGreaterThanOrEqualsTo0ThrowsIllegalArgumentException() {
        /* Branches:
         * (count >= 0) : true
         */
         //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            RandomUtils.nextBytes(1);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${nextBytesWhenCountLessThan0ThrowsIllegalArgumentException}, hash: B71C665495757349F1C4599FFC94406F
    @Test()
    void nextBytesWhenCountLessThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (count >= 0) : false
         */
         //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            RandomUtils.nextBytes(-1);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${nextDoubleTest}, hash: A845C32E0E51F634A11A863254875BE8
    @Test()
    void nextDoubleTest() {
        //Arrange Statement(s)
        try (MockedStatic<RandomUtils> randomUtils = mockStatic(RandomUtils.class, CALLS_REAL_METHODS)) {
            randomUtils.when(() -> RandomUtils.nextDouble(Double.parseDouble("0.0"), Double.parseDouble("1.7976931348623157E308"))).thenReturn(Double.parseDouble("0.0"));
            //Act Statement(s)
            double result = RandomUtils.nextDouble();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001));
                randomUtils.verify(() -> RandomUtils.nextDouble(Double.parseDouble("0.0"), Double.parseDouble("1.7976931348623157E308")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${nextDouble1WhenEndExclusiveGreaterThanOrEqualsToStartInclusiveThrowsIllegalArgumentException}, hash: 1CE38C11B14B4DF4C03D67DF2675136D
    @Test()
    void nextDouble1WhenEndExclusiveGreaterThanOrEqualsToStartInclusiveThrowsIllegalArgumentException() {
        /* Branches:
         * (endExclusive >= startInclusive) : true
         */
         //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            RandomUtils.nextDouble(Double.parseDouble("0.5"), Double.parseDouble("0.5"));
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${nextDouble1WhenEndExclusiveLessThanStartInclusiveThrowsIllegalArgumentException}, hash: 549F9381E26407D848DBD2F476E66E21
    @Test()
    void nextDouble1WhenEndExclusiveLessThanStartInclusiveThrowsIllegalArgumentException() {
        /* Branches:
         * (endExclusive >= startInclusive) : false
         */
         //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            RandomUtils.nextDouble(Double.parseDouble("0.5"), Double.parseDouble("0.0"));
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${nextFloatTest}, hash: 936F07FBACA6C6183E0CB70409277F30
    @Test()
    void nextFloatTest() {
        //Arrange Statement(s)
        try (MockedStatic<RandomUtils> randomUtils = mockStatic(RandomUtils.class, CALLS_REAL_METHODS)) {
            randomUtils.when(() -> RandomUtils.nextFloat(Float.parseFloat("0.0"), Float.parseFloat("3.4028235E38"))).thenReturn(Float.parseFloat("0.0"));
            //Act Statement(s)
            float result = RandomUtils.nextFloat();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Float.parseFloat("0.0")));
                randomUtils.verify(() -> RandomUtils.nextFloat(Float.parseFloat("0.0"), Float.parseFloat("3.4028235E38")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${nextFloat1WhenEndExclusiveGreaterThanOrEqualsToStartInclusiveThrowsIllegalArgumentException}, hash: 0D277B7C8FEA2F5B982885021E175986
    @Test()
    void nextFloat1WhenEndExclusiveGreaterThanOrEqualsToStartInclusiveThrowsIllegalArgumentException() {
        /* Branches:
         * (endExclusive >= startInclusive) : true
         */
         //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            RandomUtils.nextFloat(Float.parseFloat("0.5"), Float.parseFloat("0.5"));
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${nextFloat1WhenEndExclusiveLessThanStartInclusiveThrowsIllegalArgumentException}, hash: 96DA28951EA4DAB61446D244533D15FA
    @Test()
    void nextFloat1WhenEndExclusiveLessThanStartInclusiveThrowsIllegalArgumentException() {
        /* Branches:
         * (endExclusive >= startInclusive) : false
         */
         //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            RandomUtils.nextFloat(Float.parseFloat("0.5"), Float.parseFloat("0.0"));
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${nextIntTest}, hash: B215F85B4B8F8F1DB3AC0EB870873F7A
    @Test()
    void nextIntTest() {
        //Arrange Statement(s)
        try (MockedStatic<RandomUtils> randomUtils = mockStatic(RandomUtils.class, CALLS_REAL_METHODS)) {
            randomUtils.when(() -> RandomUtils.nextInt(0, 2147483647)).thenReturn(0);
            //Act Statement(s)
            int result = RandomUtils.nextInt();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                randomUtils.verify(() -> RandomUtils.nextInt(0, 2147483647), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${nextInt1WhenEndExclusiveGreaterThanOrEqualsToStartInclusiveThrowsIllegalArgumentException}, hash: 4AF0BBD092659BF16935E4E0427595F2
    @Test()
    void nextInt1WhenEndExclusiveGreaterThanOrEqualsToStartInclusiveThrowsIllegalArgumentException() {
        /* Branches:
         * (endExclusive >= startInclusive) : true
         */
         //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            RandomUtils.nextInt(1, 1);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${nextInt1WhenEndExclusiveLessThanStartInclusiveThrowsIllegalArgumentException}, hash: DE009CEDA431FBCC7BEBFC4E2A28C015
    @Test()
    void nextInt1WhenEndExclusiveLessThanStartInclusiveThrowsIllegalArgumentException() {
        /* Branches:
         * (endExclusive >= startInclusive) : false
         */
         //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            RandomUtils.nextInt(2, 1);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${nextLongWhenBitsMinusValPlusNMinus1NotLessThan0}, hash: 48D179BDE2DEFC5598EBAEA752916101
    @Test()
    void nextLongWhenBitsMinusValPlusNMinus1NotLessThan0() {
        /* Branches:
         * (bits - val + (n - 1) < 0) : false  #  inside nextLong method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.util.concurrent.ThreadLocalRandom::nextLong has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        long result = RandomUtils.nextLong();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }

    //Sapient generated method id: ${nextLong2WhenEndExclusiveGreaterThanOrEqualsToStartInclusiveThrowsIllegalArgumentException}, hash: B910A2341D2C3F3AA9470B5A115E0B35
    @Test()
    void nextLong2WhenEndExclusiveGreaterThanOrEqualsToStartInclusiveThrowsIllegalArgumentException() {
        /* Branches:
         * (endExclusive >= startInclusive) : true
         */
         //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            RandomUtils.nextLong(1L, 2L);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${nextLong2WhenEndExclusiveLessThanStartInclusiveThrowsIllegalArgumentException}, hash: EE3E8EFD9424EC6EDA9CC9F42DFDDC19
    @Test()
    void nextLong2WhenEndExclusiveLessThanStartInclusiveThrowsIllegalArgumentException() {
        /* Branches:
         * (endExclusive >= startInclusive) : false
         */
         //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            RandomUtils.nextLong(2L, 1L);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
