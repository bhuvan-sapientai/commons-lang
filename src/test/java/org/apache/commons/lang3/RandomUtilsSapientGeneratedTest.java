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

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RandomUtilsSapientGeneratedTest {

    //Sapient generated method id: ${362db4b4-c4e0-31be-b4fe-47b2b32b1828}
    @Test()
    void nextBooleanWhenRandomNextBoolean() {
        /* Branches:
         * (random().nextBoolean()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = RandomUtils.nextBoolean();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${59b8b09e-9e2e-3fb2-bf66-68edb6e5eb9d}
    @Test()
    void nextBooleanWhenRandomNotNextBoolean() {
        /* Branches:
         * (random().nextBoolean()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = RandomUtils.nextBoolean();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${7a910380-a3dc-343c-99c7-88575fab6165}
    @Disabled()
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

    //Sapient generated method id: ${cf45b5ae-ed29-3967-82f0-078e9e6c2f6f}
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

    //Sapient generated method id: ${90c9de46-d332-360e-b863-7fcff31dd7d9}
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

    //Sapient generated method id: ${a8d2a81d-58f1-3608-a3f8-9ca9ae2d61fc}
    @Disabled()
    @Test()
    void nextDouble1WhenEndExclusiveGreaterThanOrEqualsToStartInclusiveThrowsIllegalArgumentException() {
        /* Branches:
         * (endExclusive >= startInclusive) : true
         */
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            RandomUtils.nextDouble(Double.parseDouble("0.0"), Double.parseDouble("0.0"));
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${67c385e9-528a-323c-8b71-07ee726674b5}
    @Test()
    void nextDouble1WhenEndExclusiveLessThanStartInclusiveThrowsIllegalArgumentException() {
        /* Branches:
         * (endExclusive >= startInclusive) : false
         */
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            RandomUtils.nextDouble(Double.parseDouble("0.5"), Double.parseDouble("0.25"));
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${71e5aa1c-d194-3e33-bdf9-bdfb9ace0725}
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

    //Sapient generated method id: ${6bbc7879-1d47-3d3d-bc67-e8783ff3b5e1}
    @Disabled()
    @Test()
    void nextFloat1WhenEndExclusiveGreaterThanOrEqualsToStartInclusiveThrowsIllegalArgumentException() {
        /* Branches:
         * (endExclusive >= startInclusive) : true
         */
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            RandomUtils.nextFloat(Float.parseFloat("0.0"), Float.parseFloat("0.0"));
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${0e3b540e-1651-317e-b78b-9b61dc0384aa}
    @Test()
    void nextFloat1WhenEndExclusiveLessThanStartInclusiveThrowsIllegalArgumentException() {
        /* Branches:
         * (endExclusive >= startInclusive) : false
         */
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            RandomUtils.nextFloat(Float.parseFloat("0.5"), Float.parseFloat("0.25"));
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${bf1dc3a1-2c21-3190-80d3-72076893e15b}
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

    //Sapient generated method id: ${fbfefcf7-c3ec-3b7b-ab74-0a253fe51ece}
    @Disabled()
    @Test()
    void nextInt1WhenEndExclusiveGreaterThanOrEqualsToStartInclusiveThrowsIllegalArgumentException() {
        /* Branches:
         * (endExclusive >= startInclusive) : true
         */
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            RandomUtils.nextInt(0, 0);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${61aef0b0-8f38-397b-9aa6-b08f11d7d9ca}
    @Test()
    void nextInt1WhenEndExclusiveLessThanStartInclusiveThrowsIllegalArgumentException() {
        /* Branches:
         * (endExclusive >= startInclusive) : false
         */
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            RandomUtils.nextInt(0, -1);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${3727f808-8018-3039-be56-2d29a115d124}
    @Disabled()
    @Test()
    void nextLongWhenBitsMinusValPlusNMinus1NotLessThan0() {
        /* Branches:
         * (bits - val + (n - 1) < 0) : false  #  inside nextLong method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        long result = RandomUtils.nextLong();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }

    //Sapient generated method id: ${80485769-6932-300c-81f5-ed22fcb0181b}
    @Disabled()
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

    //Sapient generated method id: ${cd108a06-77d1-3379-89fd-39ad995b3ccd}
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
