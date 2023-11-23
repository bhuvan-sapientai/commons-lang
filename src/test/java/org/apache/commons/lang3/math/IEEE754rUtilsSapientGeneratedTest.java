package org.apache.commons.lang3.math;

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
class IEEE754rUtilsSapientGeneratedTest {

    //Sapient generated method id: ${e89802db-4c3e-3920-a70c-efbd0ec528ca}
    @Disabled()
    @Test()
    void minWhenArrayLengthNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (array.length != 0) : true
         */
        //Arrange Statement(s)
        double[] doubleArray = new double[]{Double.parseDouble("0")};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            IEEE754rUtils.min(doubleArray);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${ac63da07-723b-361a-a4a7-e685d9a063ae}
    @Test()
    void minWhenArrayLengthEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (array.length != 0) : false
         */
        //Arrange Statement(s)
        double[] doubleArray = new double[]{};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            IEEE754rUtils.min(doubleArray);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${060d2b12-26e7-38e2-b0b8-c6101a267217}
    @Disabled()
    @Test()
    void min1WhenArrayLengthNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (array.length != 0) : true
         */
        //Arrange Statement(s)
        float[] floatArray = new float[]{Float.parseFloat("0")};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            IEEE754rUtils.min(floatArray);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${0c9b85d6-3271-382a-ba7c-4603add4c514}
    @Test()
    void min1WhenArrayLengthEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (array.length != 0) : false
         */
        //Arrange Statement(s)
        float[] floatArray = new float[]{};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            IEEE754rUtils.min(floatArray);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${c13ce5b5-9c3e-36a8-8914-a72f082e4b19}
    @Test()
    void min2Test() {
        //Arrange Statement(s)
        try (MockedStatic<IEEE754rUtils> iEEE754rUtils = mockStatic(IEEE754rUtils.class, CALLS_REAL_METHODS)) {
            iEEE754rUtils.when(() -> IEEE754rUtils.min(Double.parseDouble("0.0"), Double.parseDouble("0.0"))).thenReturn(Double.parseDouble("0.0"));
            //Act Statement(s)
            double result = IEEE754rUtils.min(Double.parseDouble("0.0"), Double.parseDouble("0.0"), Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001));
                iEEE754rUtils.verify(() -> IEEE754rUtils.min(Double.parseDouble("0.0"), Double.parseDouble("0.0")), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${0cc14b48-bdf9-3985-9b53-8f4810be067d}
    @Test()
    void min3WhenDoubleIsNaNA() {
        /* Branches:
         * (Double.isNaN(a)) : true
         */
        //Act Statement(s)
        double result = IEEE754rUtils.min(Double.parseDouble("NaN"), Double.parseDouble("5.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("5.0"), 0.00001)));
    }

    //Sapient generated method id: ${adf7d24e-6623-3ccc-98c0-4334b7e2f53a}
    @Test()
    void min3WhenDoubleIsNaNB() {
        /* Branches:
         * (Double.isNaN(a)) : false
         * (Double.isNaN(b)) : true
         */
        //Act Statement(s)
        double result = IEEE754rUtils.min(Double.parseDouble("5.0"), Double.parseDouble("NaN"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("5.0"), 0.00001)));
    }

    //Sapient generated method id: ${038e0219-bc9c-30d1-b346-fc0b3ae7c612}
    @Test()
    void min3WhenDoubleNotIsNaNB() {
        /* Branches:
         * (Double.isNaN(a)) : false
         * (Double.isNaN(b)) : false
         */
        //Act Statement(s)
        double result = IEEE754rUtils.min(Double.parseDouble("0.0"), Double.parseDouble("0.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${6b6e4797-c18e-3150-a92e-6ab90705e099}
    @Test()
    void min4Test() {
        //Arrange Statement(s)
        try (MockedStatic<IEEE754rUtils> iEEE754rUtils = mockStatic(IEEE754rUtils.class, CALLS_REAL_METHODS)) {
            iEEE754rUtils.when(() -> IEEE754rUtils.min(Float.parseFloat("0.0"), Float.parseFloat("0.0"))).thenReturn(Float.parseFloat("0.0"));
            //Act Statement(s)
            float result = IEEE754rUtils.min(Float.parseFloat("0.0"), Float.parseFloat("0.0"), Float.parseFloat("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Float.parseFloat("0.0")));
                iEEE754rUtils.verify(() -> IEEE754rUtils.min(Float.parseFloat("0.0"), Float.parseFloat("0.0")), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${43439132-aec1-3f3b-b4c3-a09770547788}
    @Test()
    void min5WhenFloatIsNaNA() {
        /* Branches:
         * (Float.isNaN(a)) : true
         */
        //Act Statement(s)
        float result = IEEE754rUtils.min(Float.parseFloat("NaN"), Float.parseFloat("3.14"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("3.14"))));
    }

    //Sapient generated method id: ${50d0aa64-1985-3164-8c2c-469ba4dcc0ab}
    @Test()
    void min5WhenFloatIsNaNB() {
        /* Branches:
         * (Float.isNaN(a)) : false
         * (Float.isNaN(b)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        float result = IEEE754rUtils.min(Float.parseFloat("0.0"), Float.parseFloat("0.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("0.0"))));
    }

    //Sapient generated method id: ${a61fda37-4a46-36e0-b045-29a7714bf71e}
    @Test()
    void min5WhenFloatNotIsNaNB() {
        /* Branches:
         * (Float.isNaN(a)) : false
         * (Float.isNaN(b)) : false
         */
        //Act Statement(s)
        float result = IEEE754rUtils.min(Float.parseFloat("0.0"), Float.parseFloat("0.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("0.0"))));
    }

    //Sapient generated method id: ${4455d2fd-852d-30d1-b369-789119ec3e5c}
    @Disabled()
    @Test()
    void maxWhenArrayLengthNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (array.length != 0) : true
         */
        //Arrange Statement(s)
        double[] doubleArray = new double[]{Double.parseDouble("0")};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            IEEE754rUtils.max(doubleArray);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${6df48fbd-9c00-3cb2-bfd6-830fe176b022}
    @Test()
    void maxWhenArrayLengthEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (array.length != 0) : false
         */
        //Arrange Statement(s)
        double[] doubleArray = new double[]{};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            IEEE754rUtils.max(doubleArray);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${9e558701-371d-3469-8aa4-63cd9fbe894b}
    @Disabled()
    @Test()
    void max1WhenArrayLengthNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (array.length != 0) : true
         */
        //Arrange Statement(s)
        float[] floatArray = new float[]{Float.parseFloat("0")};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            IEEE754rUtils.max(floatArray);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${974cae20-c6aa-34e7-b665-dd34d21e72df}
    @Test()
    void max1WhenArrayLengthEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (array.length != 0) : false
         */
        //Arrange Statement(s)
        float[] floatArray = new float[]{};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            IEEE754rUtils.max(floatArray);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${eb685e6f-513c-3d3e-b406-7e11f8829af9}
    @Test()
    void max2Test() {
        //Arrange Statement(s)
        try (MockedStatic<IEEE754rUtils> iEEE754rUtils = mockStatic(IEEE754rUtils.class, CALLS_REAL_METHODS)) {
            iEEE754rUtils.when(() -> IEEE754rUtils.max(Double.parseDouble("0.0"), Double.parseDouble("0.0"))).thenReturn(Double.parseDouble("0.0"));
            //Act Statement(s)
            double result = IEEE754rUtils.max(Double.parseDouble("0.0"), Double.parseDouble("0.0"), Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001));
                iEEE754rUtils.verify(() -> IEEE754rUtils.max(Double.parseDouble("0.0"), Double.parseDouble("0.0")), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${9f8c967b-c1ad-3135-9cdc-753eccc784d5}
    @Test()
    void max3WhenDoubleIsNaNA() {
        /* Branches:
         * (Double.isNaN(a)) : true
         */
        //Act Statement(s)
        double result = IEEE754rUtils.max(Double.parseDouble("NaN"), Double.parseDouble("5.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("5.0"), 0.00001)));
    }

    //Sapient generated method id: ${e85e8320-8ec8-3545-a759-302dbf8d1cfa}
    @Test()
    void max3WhenDoubleIsNaNB() {
        /* Branches:
         * (Double.isNaN(a)) : false
         * (Double.isNaN(b)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        double result = IEEE754rUtils.max(Double.parseDouble("0.0"), Double.parseDouble("0.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${e91ab3b0-b8b2-3e01-87bc-cc1e3a7dc52d}
    @Test()
    void max3WhenDoubleNotIsNaNB() {
        /* Branches:
         * (Double.isNaN(a)) : false
         * (Double.isNaN(b)) : false
         */
        //Act Statement(s)
        double result = IEEE754rUtils.max(Double.parseDouble("0.0"), Double.parseDouble("0.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${b7c0774e-265e-3a22-80c2-05768db966a1}
    @Test()
    void max4Test() {
        //Arrange Statement(s)
        try (MockedStatic<IEEE754rUtils> iEEE754rUtils = mockStatic(IEEE754rUtils.class, CALLS_REAL_METHODS)) {
            iEEE754rUtils.when(() -> IEEE754rUtils.max(Float.parseFloat("0.0"), Float.parseFloat("0.0"))).thenReturn(Float.parseFloat("0.0"));
            //Act Statement(s)
            float result = IEEE754rUtils.max(Float.parseFloat("0.0"), Float.parseFloat("0.0"), Float.parseFloat("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Float.parseFloat("0.0")));
                iEEE754rUtils.verify(() -> IEEE754rUtils.max(Float.parseFloat("0.0"), Float.parseFloat("0.0")), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${26f669f7-1377-36a5-b69f-2e82fa7d7aef}
    @Test()
    void max5WhenFloatIsNaNA() {
        /* Branches:
         * (Float.isNaN(a)) : true
         */
        //Act Statement(s)
        float result = IEEE754rUtils.max(Float.parseFloat("NaN"), Float.parseFloat("5.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("5.0"))));
    }

    //Sapient generated method id: ${1076132e-9bf0-3e66-b425-563486af479a}
    @Test()
    void max5WhenFloatIsNaNB() {
        /* Branches:
         * (Float.isNaN(a)) : false
         * (Float.isNaN(b)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        float result = IEEE754rUtils.max(Float.parseFloat("0.0"), Float.parseFloat("0.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("0.0"))));
    }

    //Sapient generated method id: ${60a74bd3-f145-3ae8-a577-e04cbbfb0863}
    @Test()
    void max5WhenFloatNotIsNaNB() {
        /* Branches:
         * (Float.isNaN(a)) : false
         * (Float.isNaN(b)) : false
         */
        //Act Statement(s)
        float result = IEEE754rUtils.max(Float.parseFloat("0.0"), Float.parseFloat("0.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("0.0"))));
    }
}
