package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import org.mockito.stubbing.Answer;

import java.util.BitSet;
import java.util.AbstractMap;
import java.util.function.IntFunction;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.Random;
import java.util.Comparator;
import java.lang.reflect.Array;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArrayUtilsSapientGeneratedTest {

    //Sapient generated method id: ${90386753-4e5e-30ec-a0ff-4d9d79fb430e}
    @Test()
    void add1WhenIndexNotEquals0ThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : true  #  inside add method
         * (index != 0) : true  #  inside add method
         */
        //Arrange Statement(s)
        boolean[] _boolean = null;
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Index: 8, Length: 0");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayUtils.add(_boolean, 8, false);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${1404623f-5283-33e4-95ba-294b81913ae9}
    @Test()
    void add1WhenIndexEquals0() {
        /* Branches:
         * (array == null) : true  #  inside add method
         * (index != 0) : false  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        boolean[] _boolean = null;

        //Act Statement(s)
        boolean[] result = ArrayUtils.add(_boolean, 0, false);
        boolean[] booleanResultArray = new boolean[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(booleanResultArray)));
    }

    //Sapient generated method id: ${f62f5df0-7627-32cd-8d89-4b86fe6c5901}
    @Test()
    void add1WhenIndexLessThan0ThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : false  #  inside add method
         * (index > length) : false  #  inside add method
         * (index < 0) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        boolean[] booleanArray = new boolean[]{};
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("s1");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayUtils.add(booleanArray, 0, false);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${d342ae7e-d393-333b-b3bd-d9cb07642c7c}
    @Test()
    void add1WhenIndexLessThanLength() {
        /* Branches:
         * (array == null) : false  #  inside add method
         * (index > length) : false  #  inside add method
         * (index < 0) : false  #  inside add method
         * (index < length) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        boolean[] booleanArray = new boolean[]{};

        //Act Statement(s)
        boolean[] result = ArrayUtils.add(booleanArray, 0, false);
        boolean[] booleanResultArray = new boolean[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(booleanResultArray)));
    }

    //Sapient generated method id: ${9c2bd21d-0439-36e5-8da9-89c433f1bfd6}
    @Test()
    void add3WhenIndexNotEquals0ThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : true  #  inside add method
         * (index != 0) : true  #  inside add method
         */
        //Arrange Statement(s)
        byte[] _byte = null;
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Index: 2, Length: 0");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayUtils.add(_byte, 2, (byte) 2);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${5a711a7b-7163-320e-8845-a1edf0d48ad0}
    @Test()
    void add3WhenIndexEquals0() {
        /* Branches:
         * (array == null) : true  #  inside add method
         * (index != 0) : false  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] _byte = null;

        //Act Statement(s)
        byte[] result = ArrayUtils.add(_byte, 0, (byte) 0);
        byte[] byteResultArray = new byte[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //Sapient generated method id: ${92d00c42-ba17-3fce-9caa-bf18b95b2e5e}
    @Test()
    void add3WhenIndexLessThan0ThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : false  #  inside add method
         * (index > length) : false  #  inside add method
         * (index < 0) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("s1");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayUtils.add(byteArray, 0, (byte) 0);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${be38d833-429b-358b-839f-e6d82703385f}
    @Test()
    void add3WhenIndexLessThanLength() {
        /* Branches:
         * (array == null) : false  #  inside add method
         * (index > length) : false  #  inside add method
         * (index < 0) : false  #  inside add method
         * (index < length) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        byte[] result = ArrayUtils.add(byteArray, 0, (byte) 0);
        byte[] byteResultArray = new byte[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //Sapient generated method id: ${f56f647c-4cca-3a5c-a528-f86819a85114}
    @Test()
    void add5WhenIndexNotEquals0ThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : true  #  inside add method
         * (index != 0) : true  #  inside add method
         */
        //Arrange Statement(s)
        char[] _char = null;
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Index: 2, Length: 0");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayUtils.add(_char, 2, 'A');
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${fcb1ed47-5699-3f2a-80b1-9c9a958731d7}
    @Test()
    void add5WhenIndexEquals0() {
        /* Branches:
         * (array == null) : true  #  inside add method
         * (index != 0) : false  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        char[] _char = null;

        //Act Statement(s)
        char[] result = ArrayUtils.add(_char, 0, 'A');
        char[] charResultArray = new char[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charResultArray)));
    }

    //Sapient generated method id: ${4df0a87e-bb91-3a30-9457-fd2735d76167}
    @Test()
    void add5WhenIndexLessThan0ThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : false  #  inside add method
         * (index > length) : false  #  inside add method
         * (index < 0) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        char[] charArray = new char[]{};
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("s1");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayUtils.add(charArray, 0, 'A');
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${a26ea7b6-795a-3688-a4df-456d76676c23}
    @Test()
    void add5WhenIndexLessThanLength() {
        /* Branches:
         * (array == null) : false  #  inside add method
         * (index > length) : false  #  inside add method
         * (index < 0) : false  #  inside add method
         * (index < length) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        char[] charArray = new char[]{};

        //Act Statement(s)
        char[] result = ArrayUtils.add(charArray, 0, 'A');
        char[] charResultArray = new char[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charResultArray)));
    }

    //Sapient generated method id: ${5f1b63d1-d21c-3a7a-bdfc-6b8b9d7930dd}
    @Test()
    void add7WhenIndexNotEquals0ThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : true  #  inside add method
         * (index != 0) : true  #  inside add method
         */
        //Arrange Statement(s)
        double[] _double = null;
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Index: 2, Length: 0");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayUtils.add(_double, 2, Double.parseDouble("0.5"));
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${cf5fd61e-c934-38c4-9198-35e8450e95db}
    @Test()
    void add7WhenIndexEquals0() {
        /* Branches:
         * (array == null) : true  #  inside add method
         * (index != 0) : false  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        double[] _double = null;

        //Act Statement(s)
        double[] result = ArrayUtils.add(_double, 0, Double.parseDouble("1.0"));
        double[] doubleResultArray = new double[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(doubleResultArray)));
    }

    //Sapient generated method id: ${05f3ec1b-df7a-37be-b3ff-15daaef10f21}
    @Test()
    void add7WhenIndexLessThan0ThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : false  #  inside add method
         * (index > length) : false  #  inside add method
         * (index < 0) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        double[] doubleArray = new double[]{};
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("s1");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayUtils.add(doubleArray, 0, Double.parseDouble("0.0"));
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${f8dfa858-6123-356d-867b-e9d7455ec0ea}
    @Test()
    void add7WhenIndexLessThanLength() {
        /* Branches:
         * (array == null) : false  #  inside add method
         * (index > length) : false  #  inside add method
         * (index < 0) : false  #  inside add method
         * (index < length) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        double[] doubleArray = new double[]{};

        //Act Statement(s)
        double[] result = ArrayUtils.add(doubleArray, 0, Double.parseDouble("0.0"));
        double[] doubleResultArray = new double[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(doubleResultArray)));
    }

    //Sapient generated method id: ${fdf96add-9bc7-3f9d-8012-209fee7f6b22}
    @Test()
    void add9WhenIndexNotEquals0ThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : true  #  inside add method
         * (index != 0) : true  #  inside add method
         */
        //Arrange Statement(s)
        float[] _float = null;
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Index: 2, Length: 0");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayUtils.add(_float, 2, Float.parseFloat("0.5"));
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${d0c29d74-b501-3335-88a9-a04ee4973ecb}
    @Test()
    void add9WhenIndexEquals0() {
        /* Branches:
         * (array == null) : true  #  inside add method
         * (index != 0) : false  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        float[] _float = null;

        //Act Statement(s)
        float[] result = ArrayUtils.add(_float, 0, Float.parseFloat("1.0"));
        float[] floatResultArray = new float[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(floatResultArray)));
    }

    //Sapient generated method id: ${58ec4d35-d83b-31d7-89d8-e759780737fb}
    @Test()
    void add9WhenIndexLessThan0ThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : false  #  inside add method
         * (index > length) : false  #  inside add method
         * (index < 0) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        float[] floatArray = new float[]{};
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("s1");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayUtils.add(floatArray, 0, Float.parseFloat("0.0"));
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${bd88c185-860d-3530-9ab3-7fcc238b120c}
    @Test()
    void add9WhenIndexLessThanLength() {
        /* Branches:
         * (array == null) : false  #  inside add method
         * (index > length) : false  #  inside add method
         * (index < 0) : false  #  inside add method
         * (index < length) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        float[] floatArray = new float[]{};

        //Act Statement(s)
        float[] result = ArrayUtils.add(floatArray, 0, Float.parseFloat("0.0"));
        float[] floatResultArray = new float[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(floatResultArray)));
    }

    //Sapient generated method id: ${7c7eb972-5876-309b-a653-3c58a261b1cf}
    @Test()
    void add11WhenIndexNotEquals0ThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : true  #  inside add method
         * (index != 0) : true  #  inside add method
         */
        //Arrange Statement(s)
        int[] _int = null;
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Index: 2, Length: 0");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayUtils.add(_int, 2, 2);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${4b5b06e0-cf36-3a6b-9024-a55471388605}
    @Test()
    void add11WhenIndexEquals0() {
        /* Branches:
         * (array == null) : true  #  inside add method
         * (index != 0) : false  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        int[] _int = null;

        //Act Statement(s)
        int[] result = ArrayUtils.add(_int, 0, 0);
        int[] intResultArray = new int[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(intResultArray)));
    }

    //Sapient generated method id: ${57207ca6-7a98-3672-a13b-9bd675a2766b}
    @Test()
    void add11WhenIndexLessThan0ThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : false  #  inside add method
         * (index > length) : false  #  inside add method
         * (index < 0) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        int[] intArray = new int[]{};
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("s1");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayUtils.add(intArray, 0, 0);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${a6d52139-bf18-3255-8c30-f37df669ce79}
    @Test()
    void add11WhenIndexLessThanLength() {
        /* Branches:
         * (array == null) : false  #  inside add method
         * (index > length) : false  #  inside add method
         * (index < 0) : false  #  inside add method
         * (index < length) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        int[] intArray = new int[]{};

        //Act Statement(s)
        int[] result = ArrayUtils.add(intArray, 0, 0);
        int[] intResultArray = new int[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(intResultArray)));
    }

    //Sapient generated method id: ${4453ff08-9871-3154-beec-f278ccd5ac2b}
    @Test()
    void add12WhenIndexNotEquals0ThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : true  #  inside add method
         * (index != 0) : true  #  inside add method
         */
        //Arrange Statement(s)
        long[] _long = null;
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Index: 2, Length: 0");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayUtils.add(_long, 2, 2L);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${161dd8cc-13d6-3c97-8bab-a75119e98e2b}
    @Test()
    void add12WhenIndexEquals0() {
        /* Branches:
         * (array == null) : true  #  inside add method
         * (index != 0) : false  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        long[] _long = null;

        //Act Statement(s)
        long[] result = ArrayUtils.add(_long, 0, 0L);
        long[] longResultArray = new long[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longResultArray)));
    }

    //Sapient generated method id: ${43a310bb-693f-3797-9294-da2c4192dda3}
    @Test()
    void add12WhenIndexLessThan0ThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : false  #  inside add method
         * (index > length) : false  #  inside add method
         * (index < 0) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        long[] longArray = new long[]{};
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("s1");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayUtils.add(longArray, 0, 0L);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${ca9d1af9-6da3-39c5-8086-980334998669}
    @Test()
    void add12WhenIndexLessThanLength() {
        /* Branches:
         * (array == null) : false  #  inside add method
         * (index > length) : false  #  inside add method
         * (index < 0) : false  #  inside add method
         * (index < length) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        long[] longArray = new long[]{};

        //Act Statement(s)
        long[] result = ArrayUtils.add(longArray, 0, 0L);
        long[] longResultArray = new long[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longResultArray)));
    }

    //Sapient generated method id: ${da98f4a9-6a8b-3977-b6f5-aa0dd3bf7cd2}
    @Test()
    void add15WhenIndexNotEquals0ThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : true  #  inside add method
         * (index != 0) : true  #  inside add method
         */
        //Arrange Statement(s)
        short[] _short = null;
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Index: 2, Length: 0");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayUtils.add(_short, 2, (short) 2);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${e892cceb-1c3e-357d-bfd2-be4731e10f38}
    @Test()
    void add15WhenIndexEquals0() {
        /* Branches:
         * (array == null) : true  #  inside add method
         * (index != 0) : false  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        short[] _short = null;

        //Act Statement(s)
        short[] result = ArrayUtils.add(_short, 0, (short) 0);
        short[] shortResultArray = new short[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(shortResultArray)));
    }

    //Sapient generated method id: ${00ee4307-b9c8-3289-adbb-5ebdec311324}
    @Test()
    void add15WhenIndexLessThan0ThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : false  #  inside add method
         * (index > length) : false  #  inside add method
         * (index < 0) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        short[] shortArray = new short[]{};
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("s1");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayUtils.add(shortArray, 0, (short) 0);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${696c375c-693c-3dff-a69a-12171efcff40}
    @Test()
    void add15WhenIndexLessThanLength() {
        /* Branches:
         * (array == null) : false  #  inside add method
         * (index > length) : false  #  inside add method
         * (index < 0) : false  #  inside add method
         * (index < length) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        short[] shortArray = new short[]{};

        //Act Statement(s)
        short[] result = ArrayUtils.add(shortArray, 0, (short) 0);
        short[] shortResultArray = new short[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(shortResultArray)));
    }

    //Sapient generated method id: ${e350371f-8cdd-3081-9552-96468904e135}
    @Test()
    void add17WhenElementIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (array != null) : false
         * (element != null) : false
         */
        //Arrange Statement(s)
        Object[] object = null;
        Object object2 = null;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Array and element cannot both be null");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            ArrayUtils.add(object, 0, object2);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${6262f9e4-a8f2-3ec6-a302-2f8786a69359}
    @Test()
    void add17WhenIndexLessThan0ThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array != null) : true
         * (array == null) : false  #  inside add method
         * (index > length) : false  #  inside add method
         * (index < 0) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        Object object = new Object();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("s1");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayUtils.add(objectArray, 0, object);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${9fe708cb-3a00-370f-9a29-e0c5796c8378}
    @Test()
    void add17WhenIndexNotEquals0ThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array != null) : false
         * (element != null) : true
         * (array == null) : true  #  inside add method
         * (index != 0) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] object = null;
        Object object2 = new Object();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Index: 2, Length: 0");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayUtils.add(object, 2, object2);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${7d7a4e02-d3bc-3348-a377-a49508e2bf46}
    @Test()
    void add17WhenIndexEquals0() {
        /* Branches:
         * (array != null) : false
         * (element != null) : true
         * (array == null) : true  #  inside add method
         * (index != 0) : false  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] object = null;
        Object object2 = new Object();

        //Act Statement(s)
        Object[] result = ArrayUtils.add(object, 0, object2);
        Object object3 = new Object();

        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object3)));
    }

    //Sapient generated method id: ${7cd4bda8-6025-365c-837f-de8a03c3a02f}
    @Test()
    void add17WhenIndexLessThanLength() {
        /* Branches:
         * (array != null) : true
         * (array == null) : false  #  inside add method
         * (index > length) : false  #  inside add method
         * (index < 0) : false  #  inside add method
         * (index < length) : true  #  inside add method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        Object object = new Object();

        //Act Statement(s)
        Object[] result = ArrayUtils.add(objectArray, 1, object);
        Object object2 = new Object();

        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object2)));
    }

    //Sapient generated method id: ${fc7acea5-ca18-3249-8e15-31f76ce488b3}
    @Test()
    void addAllWhenArray1IsNull() {
        /* Branches:
         * (array1 == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            boolean[] booleanArray2 = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.clone(booleanArray2)).thenReturn(booleanArray);
            boolean[] _boolean = null;
            //Act Statement(s)
            boolean[] result = ArrayUtils.addAll(_boolean, booleanArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanArray));
                arrayUtils.verify(() -> ArrayUtils.clone(booleanArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9a5dade7-396d-3357-b785-972923057d39}
    @Test()
    void addAllWhenArray2IsNull() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            boolean[] booleanArray2 = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.clone(booleanArray2)).thenReturn(booleanArray);
            boolean[] _boolean = null;
            //Act Statement(s)
            boolean[] result = ArrayUtils.addAll(booleanArray2, _boolean);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanArray));
                arrayUtils.verify(() -> ArrayUtils.clone(booleanArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ad164ba9-530d-32f6-925d-d64c6b745e9a}
    @Test()
    void addAllWhenArray2IsNotNull() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : false
         */
        //Arrange Statement(s)
        boolean[] booleanArray = new boolean[]{};
        boolean[] booleanArray2 = new boolean[]{};

        //Act Statement(s)
        boolean[] result = ArrayUtils.addAll(booleanArray, booleanArray2);
        boolean[] booleanResultArray = new boolean[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(booleanResultArray)));
    }

    //Sapient generated method id: ${5e08c4fc-a668-3c4c-9aeb-2d9301f5b4f8}
    @Test()
    void addAll1WhenArray1IsNull() {
        /* Branches:
         * (array1 == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.clone(byteArray2)).thenReturn(byteArray);
            byte[] _byte = null;
            //Act Statement(s)
            byte[] result = ArrayUtils.addAll(_byte, byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                arrayUtils.verify(() -> ArrayUtils.clone(byteArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${17c9e79c-ce51-3fde-9fb4-5ccd20bd1e52}
    @Test()
    void addAll1WhenArray2IsNull() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.clone(byteArray2)).thenReturn(byteArray);
            byte[] _byte = null;
            //Act Statement(s)
            byte[] result = ArrayUtils.addAll(byteArray2, _byte);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                arrayUtils.verify(() -> ArrayUtils.clone(byteArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${742b5f5d-fc4e-3ec2-9eb8-683382384e6e}
    @Test()
    void addAll1WhenArray2IsNotNull() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        byte[] byteArray2 = new byte[]{};

        //Act Statement(s)
        byte[] result = ArrayUtils.addAll(byteArray, byteArray2);
        byte[] byteResultArray = new byte[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //Sapient generated method id: ${33cbc27c-14ee-3128-9496-382bc965171d}
    @Test()
    void addAll2WhenArray1IsNull() {
        /* Branches:
         * (array1 == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            char[] charArray2 = new char[]{};
            arrayUtils.when(() -> ArrayUtils.clone(charArray2)).thenReturn(charArray);
            char[] _char = null;
            //Act Statement(s)
            char[] result = ArrayUtils.addAll(_char, charArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                arrayUtils.verify(() -> ArrayUtils.clone(charArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${78ccc2e9-5dff-3e4c-962e-df4e9d9ebd33}
    @Test()
    void addAll2WhenArray2IsNull() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            char[] charArray2 = new char[]{};
            arrayUtils.when(() -> ArrayUtils.clone(charArray2)).thenReturn(charArray);
            char[] _char = null;
            //Act Statement(s)
            char[] result = ArrayUtils.addAll(charArray2, _char);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                arrayUtils.verify(() -> ArrayUtils.clone(charArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${212ed6d8-92f1-32b7-8a64-be8561acc354}
    @Test()
    void addAll2WhenArray2IsNotNull() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : false
         */
        //Arrange Statement(s)
        char[] charArray = new char[]{};
        char[] charArray2 = new char[]{};

        //Act Statement(s)
        char[] result = ArrayUtils.addAll(charArray, charArray2);
        char[] charResultArray = new char[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charResultArray)));
    }

    //Sapient generated method id: ${f909681c-01e1-3c7b-81b4-207f9bd1761f}
    @Test()
    void addAll3WhenArray1IsNull() {
        /* Branches:
         * (array1 == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            double[] doubleArray2 = new double[]{};
            arrayUtils.when(() -> ArrayUtils.clone(doubleArray2)).thenReturn(doubleArray);
            double[] _double = null;
            //Act Statement(s)
            double[] result = ArrayUtils.addAll(_double, doubleArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleArray));
                arrayUtils.verify(() -> ArrayUtils.clone(doubleArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a2eb8b2b-a62c-3603-ad02-67f1e09da627}
    @Test()
    void addAll3WhenArray2IsNull() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            double[] doubleArray2 = new double[]{};
            arrayUtils.when(() -> ArrayUtils.clone(doubleArray2)).thenReturn(doubleArray);
            double[] _double = null;
            //Act Statement(s)
            double[] result = ArrayUtils.addAll(doubleArray2, _double);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleArray));
                arrayUtils.verify(() -> ArrayUtils.clone(doubleArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${178c1950-c1d2-32a3-a76c-6eb8f32b42f5}
    @Test()
    void addAll3WhenArray2IsNotNull() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : false
         */
        //Arrange Statement(s)
        double[] doubleArray = new double[]{};
        double[] doubleArray2 = new double[]{};

        //Act Statement(s)
        double[] result = ArrayUtils.addAll(doubleArray, doubleArray2);
        double[] doubleResultArray = new double[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(doubleResultArray)));
    }

    //Sapient generated method id: ${effb0a92-ea50-3d9f-a35b-2b55452872c3}
    @Test()
    void addAll4WhenArray1IsNull() {
        /* Branches:
         * (array1 == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            float[] floatArray2 = new float[]{};
            arrayUtils.when(() -> ArrayUtils.clone(floatArray2)).thenReturn(floatArray);
            float[] _float = null;
            //Act Statement(s)
            float[] result = ArrayUtils.addAll(_float, floatArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatArray));
                arrayUtils.verify(() -> ArrayUtils.clone(floatArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${20f17bc2-2a2f-3314-9b7d-fd0c5459f15b}
    @Test()
    void addAll4WhenArray2IsNull() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            float[] floatArray2 = new float[]{};
            arrayUtils.when(() -> ArrayUtils.clone(floatArray2)).thenReturn(floatArray);
            float[] _float = null;
            //Act Statement(s)
            float[] result = ArrayUtils.addAll(floatArray2, _float);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatArray));
                arrayUtils.verify(() -> ArrayUtils.clone(floatArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${00d38cc9-0d03-3729-95bd-89849234bee8}
    @Test()
    void addAll4WhenArray2IsNotNull() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : false
         */
        //Arrange Statement(s)
        float[] floatArray = new float[]{};
        float[] floatArray2 = new float[]{};

        //Act Statement(s)
        float[] result = ArrayUtils.addAll(floatArray, floatArray2);
        float[] floatResultArray = new float[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(floatResultArray)));
    }

    //Sapient generated method id: ${4b4ac7fc-5ef8-3649-b666-47bfa75925e4}
    @Test()
    void addAll5WhenArray1IsNull() {
        /* Branches:
         * (array1 == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            int[] intArray2 = new int[]{};
            arrayUtils.when(() -> ArrayUtils.clone(intArray2)).thenReturn(intArray);
            int[] _int = null;
            //Act Statement(s)
            int[] result = ArrayUtils.addAll(_int, intArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(intArray));
                arrayUtils.verify(() -> ArrayUtils.clone(intArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9f6c9909-a07b-3aa4-9379-12f2ea786c50}
    @Test()
    void addAll5WhenArray2IsNull() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            int[] intArray2 = new int[]{};
            arrayUtils.when(() -> ArrayUtils.clone(intArray2)).thenReturn(intArray);
            int[] _int = null;
            //Act Statement(s)
            int[] result = ArrayUtils.addAll(intArray2, _int);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(intArray));
                arrayUtils.verify(() -> ArrayUtils.clone(intArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8bd4995e-99ae-31e2-b839-06742bec2dca}
    @Test()
    void addAll5WhenArray2IsNotNull() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : false
         */
        //Arrange Statement(s)
        int[] intArray = new int[]{};
        int[] intArray2 = new int[]{};

        //Act Statement(s)
        int[] result = ArrayUtils.addAll(intArray, intArray2);
        int[] intResultArray = new int[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(intResultArray)));
    }

    //Sapient generated method id: ${b7cc4504-6ad3-3567-80fd-a2929bc5feea}
    @Test()
    void addAll6WhenArray1IsNull() {
        /* Branches:
         * (array1 == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            long[] longArray2 = new long[]{};
            arrayUtils.when(() -> ArrayUtils.clone(longArray2)).thenReturn(longArray);
            long[] _long = null;
            //Act Statement(s)
            long[] result = ArrayUtils.addAll(_long, longArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray));
                arrayUtils.verify(() -> ArrayUtils.clone(longArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9b7d6752-0d05-36ba-b5e2-5b27471cc4a7}
    @Test()
    void addAll6WhenArray2IsNull() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            long[] longArray2 = new long[]{};
            arrayUtils.when(() -> ArrayUtils.clone(longArray2)).thenReturn(longArray);
            long[] _long = null;
            //Act Statement(s)
            long[] result = ArrayUtils.addAll(longArray2, _long);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray));
                arrayUtils.verify(() -> ArrayUtils.clone(longArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${e937fa48-57f8-3a7d-a31c-1c90a9d50e44}
    @Test()
    void addAll6WhenArray2IsNotNull() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : false
         */
        //Arrange Statement(s)
        long[] longArray = new long[]{};
        long[] longArray2 = new long[]{};

        //Act Statement(s)
        long[] result = ArrayUtils.addAll(longArray, longArray2);
        long[] longResultArray = new long[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longResultArray)));
    }

    //Sapient generated method id: ${528acc97-b053-374f-989f-0c1a11e94b81}
    @Test()
    void addAll7WhenArray1IsNull() {
        /* Branches:
         * (array1 == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            short[] shortArray2 = new short[]{};
            arrayUtils.when(() -> ArrayUtils.clone(shortArray2)).thenReturn(shortArray);
            short[] _short = null;
            //Act Statement(s)
            short[] result = ArrayUtils.addAll(_short, shortArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(shortArray));
                arrayUtils.verify(() -> ArrayUtils.clone(shortArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3ce01ed5-ec39-320f-834e-8417e5156df7}
    @Test()
    void addAll7WhenArray2IsNull() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            short[] shortArray2 = new short[]{};
            arrayUtils.when(() -> ArrayUtils.clone(shortArray2)).thenReturn(shortArray);
            short[] _short = null;
            //Act Statement(s)
            short[] result = ArrayUtils.addAll(shortArray2, _short);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(shortArray));
                arrayUtils.verify(() -> ArrayUtils.clone(shortArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${de1bf1d9-0231-3a0f-81fc-70884a6705df}
    @Test()
    void addAll7WhenArray2IsNotNull() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : false
         */
        //Arrange Statement(s)
        short[] shortArray = new short[]{};
        short[] shortArray2 = new short[]{};

        //Act Statement(s)
        short[] result = ArrayUtils.addAll(shortArray, shortArray2);
        short[] shortResultArray = new short[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(shortResultArray)));
    }

    //Sapient generated method id: ${e66d5609-71ae-3ed2-ab9b-9af46a526269}
    @Test()
    void addFirstWhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.add((boolean[]) null, false)).thenReturn(booleanArray);
            boolean[] _boolean = null;
            //Act Statement(s)
            boolean[] result = ArrayUtils.addFirst(_boolean, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanArray));
                arrayUtils.verify(() -> ArrayUtils.add((boolean[]) null, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fce6c8f8-0fcf-39c2-b177-2d58b0526352}
    @Test()
    void addFirstWhenArrayIsNotNull() {
        /* Branches:
         * (array == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            boolean[] booleanArray2 = new boolean[]{};
            boolean[] booleanArray3 = new boolean[]{false};
            arrayUtils.when(() -> ArrayUtils.insert(0, booleanArray2, booleanArray3)).thenReturn(booleanArray);
            //Act Statement(s)
            boolean[] result = ArrayUtils.addFirst(booleanArray2, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanArray));
                arrayUtils.verify(() -> ArrayUtils.insert(0, booleanArray2, booleanArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${aa660445-227e-3a55-9342-e45c2c246fce}
    @Test()
    void addFirst1WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.add((byte[]) null, (byte) 0)).thenReturn(byteArray);
            byte[] _byte = null;
            //Act Statement(s)
            byte[] result = ArrayUtils.addFirst(_byte, (byte) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                arrayUtils.verify(() -> ArrayUtils.add((byte[]) null, (byte) 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1dd3b980-e45f-3308-a194-49c1038ac5ff}
    @Test()
    void addFirst1WhenArrayIsNotNull() {
        /* Branches:
         * (array == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{(byte) 0};
            arrayUtils.when(() -> ArrayUtils.insert(0, byteArray2, byteArray3)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = ArrayUtils.addFirst(byteArray2, (byte) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                arrayUtils.verify(() -> ArrayUtils.insert(0, byteArray2, byteArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f0634082-73ec-3571-b60e-e13501ed305a}
    @Test()
    void addFirst2WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.add((char[]) null, 'A')).thenReturn(charArray);
            char[] _char = null;
            //Act Statement(s)
            char[] result = ArrayUtils.addFirst(_char, 'A');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                arrayUtils.verify(() -> ArrayUtils.add((char[]) null, 'A'), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5edc7311-f3ea-3320-92a7-20af8112ca6d}
    @Test()
    void addFirst2WhenArrayIsNotNull() {
        /* Branches:
         * (array == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            char[] charArray2 = new char[]{};
            char[] charArray3 = new char[]{'A'};
            arrayUtils.when(() -> ArrayUtils.insert(0, charArray2, charArray3)).thenReturn(charArray);
            //Act Statement(s)
            char[] result = ArrayUtils.addFirst(charArray2, 'A');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                arrayUtils.verify(() -> ArrayUtils.insert(0, charArray2, charArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4d8801fd-8bb9-3c56-a4d7-1c33099a4e35}
    @Test()
    void addFirst3WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.add((double[]) null, Double.parseDouble("0.0"))).thenReturn(doubleArray);
            double[] _double = null;
            //Act Statement(s)
            double[] result = ArrayUtils.addFirst(_double, Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleArray));
                arrayUtils.verify(() -> ArrayUtils.add((double[]) null, Double.parseDouble("0.0")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${45a38361-07f5-3aaf-b433-09d4bfaf582b}
    @Test()
    void addFirst3WhenArrayIsNotNull() {
        /* Branches:
         * (array == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            double[] doubleArray2 = new double[]{};
            double[] doubleArray3 = new double[]{Double.parseDouble("0.0")};
            arrayUtils.when(() -> ArrayUtils.insert(0, doubleArray2, doubleArray3)).thenReturn(doubleArray);
            //Act Statement(s)
            double[] result = ArrayUtils.addFirst(doubleArray2, Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleArray));
                arrayUtils.verify(() -> ArrayUtils.insert(0, doubleArray2, doubleArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7b5456e8-d172-37d9-9b79-0cb34e197cb2}
    @Test()
    void addFirst4WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.add((float[]) null, Float.parseFloat("0.0"))).thenReturn(floatArray);
            float[] _float = null;
            //Act Statement(s)
            float[] result = ArrayUtils.addFirst(_float, Float.parseFloat("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatArray));
                arrayUtils.verify(() -> ArrayUtils.add((float[]) null, Float.parseFloat("0.0")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${038f02f4-f8f7-3feb-be0e-be790de3a791}
    @Test()
    void addFirst4WhenArrayIsNotNull() {
        /* Branches:
         * (array == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            float[] floatArray2 = new float[]{};
            float[] floatArray3 = new float[]{Float.parseFloat("0.0")};
            arrayUtils.when(() -> ArrayUtils.insert(0, floatArray2, floatArray3)).thenReturn(floatArray);
            //Act Statement(s)
            float[] result = ArrayUtils.addFirst(floatArray2, Float.parseFloat("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatArray));
                arrayUtils.verify(() -> ArrayUtils.insert(0, floatArray2, floatArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ada2ed37-a9a7-3c68-ab28-862e7523f6c8}
    @Test()
    void addFirst5WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.add((int[]) null, 0)).thenReturn(intArray);
            int[] _int = null;
            //Act Statement(s)
            int[] result = ArrayUtils.addFirst(_int, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(intArray));
                arrayUtils.verify(() -> ArrayUtils.add((int[]) null, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b026cb59-a73b-3be3-9310-eb2dce5a3f4c}
    @Test()
    void addFirst5WhenArrayIsNotNull() {
        /* Branches:
         * (array == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            int[] intArray2 = new int[]{};
            int[] intArray3 = new int[]{0};
            arrayUtils.when(() -> ArrayUtils.insert(0, intArray2, intArray3)).thenReturn(intArray);
            //Act Statement(s)
            int[] result = ArrayUtils.addFirst(intArray2, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(intArray));
                arrayUtils.verify(() -> ArrayUtils.insert(0, intArray2, intArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ed116360-ddd5-3dff-8a7f-b68207aaeb58}
    @Test()
    void addFirst6WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.add((long[]) null, 0L)).thenReturn(longArray);
            long[] _long = null;
            //Act Statement(s)
            long[] result = ArrayUtils.addFirst(_long, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray));
                arrayUtils.verify(() -> ArrayUtils.add((long[]) null, 0L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8da28402-46b8-3963-8b32-ce4aeec21a95}
    @Test()
    void addFirst6WhenArrayIsNotNull() {
        /* Branches:
         * (array == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            long[] longArray2 = new long[]{};
            long[] longArray3 = new long[]{0L};
            arrayUtils.when(() -> ArrayUtils.insert(0, longArray2, longArray3)).thenReturn(longArray);
            //Act Statement(s)
            long[] result = ArrayUtils.addFirst(longArray2, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray));
                arrayUtils.verify(() -> ArrayUtils.insert(0, longArray2, longArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b5e5a25b-8c56-3914-84b7-79841fe362de}
    @Test()
    void addFirst7WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.add((short[]) null, (short) 0)).thenReturn(shortArray);
            short[] _short = null;
            //Act Statement(s)
            short[] result = ArrayUtils.addFirst(_short, (short) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(shortArray));
                arrayUtils.verify(() -> ArrayUtils.add((short[]) null, (short) 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a7a6e644-3c66-372c-a6c9-18b2e432172e}
    @Test()
    void addFirst7WhenArrayIsNotNull() {
        /* Branches:
         * (array == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            short[] shortArray2 = new short[]{};
            short[] shortArray3 = new short[]{(short) 0};
            arrayUtils.when(() -> ArrayUtils.insert(0, shortArray2, shortArray3)).thenReturn(shortArray);
            //Act Statement(s)
            short[] result = ArrayUtils.addFirst(shortArray2, (short) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(shortArray));
                arrayUtils.verify(() -> ArrayUtils.insert(0, shortArray2, shortArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${be036f22-e77f-3445-802a-a2117cc10176}
    @Test()
    void addFirst8WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            Object object = new Object();
            arrayUtils.when(() -> ArrayUtils.add((Object[]) null, object)).thenReturn(objectArray);
            Object[] object2 = null;
            //Act Statement(s)
            Object[] result = ArrayUtils.addFirst(object2, object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(objectArray));
                arrayUtils.verify(() -> ArrayUtils.add((Object[]) null, object), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b17a0570-9312-3e18-94b8-56b3aea677c0}
    @Test()
    void addFirst8WhenArrayIsNotNull() {
        /* Branches:
         * (array == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            Object[] objectArray2 = new Object[]{};
            Object object = new Object();
            Object[] objectArray3 = new Object[]{object};
            arrayUtils.when(() -> ArrayUtils.insert(0, objectArray2, objectArray3)).thenReturn(objectArray);
            //Act Statement(s)
            Object[] result = ArrayUtils.addFirst(objectArray2, object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(objectArray));
                arrayUtils.verify(() -> ArrayUtils.insert(0, objectArray2, objectArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f68a6f69-8eae-36d8-943e-3f7c3f382757}
    @Test()
    void containsWhenIndexOfArrayValueToFindNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, valueToFind) != INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(booleanArray, false)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(booleanArray, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(booleanArray, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0a4c5bbb-2156-32ca-8f26-6ff74efc72aa}
    @Test()
    void containsWhenIndexOfArrayValueToFindEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, valueToFind) != INDEX_NOT_FOUND) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(booleanArray, false)).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(booleanArray, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(booleanArray, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${52d8f967-a7b9-3903-9ea6-60940652198b}
    @Test()
    void contains1WhenIndexOfArrayValueToFindNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, valueToFind) != INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(byteArray, (byte) 0)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(byteArray, (byte) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(byteArray, (byte) 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${198590e3-3b07-33aa-b0c4-bb2980d65eff}
    @Test()
    void contains1WhenIndexOfArrayValueToFindEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, valueToFind) != INDEX_NOT_FOUND) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(byteArray, (byte) 0)).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(byteArray, (byte) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(byteArray, (byte) 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f771d3bb-fbab-3513-945e-95293818d755}
    @Test()
    void contains2WhenIndexOfArrayValueToFindNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, valueToFind) != INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(charArray, 'A')).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(charArray, 'A');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(charArray, 'A'), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6f5e7def-1bb7-3991-b249-ce8181057d6f}
    @Test()
    void contains2WhenIndexOfArrayValueToFindEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, valueToFind) != INDEX_NOT_FOUND) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(charArray, 'A')).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(charArray, 'A');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(charArray, 'A'), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${aed1f530-c16a-3bd5-8fdb-381a28613424}
    @Test()
    void contains3WhenIndexOfArrayValueToFindNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, valueToFind) != INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"))).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(doubleArray, Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ecbbb644-c004-34ea-abf1-cf857bf2ae95}
    @Test()
    void contains3WhenIndexOfArrayValueToFindEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, valueToFind) != INDEX_NOT_FOUND) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"))).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(doubleArray, Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2010414c-905e-37d4-9cfd-f04b07543b5a}
    @Test()
    void contains4WhenIndexOfArrayValueToFind0ToleranceNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, valueToFind, 0, tolerance) != INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), 0, Double.parseDouble("0.0"))).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(doubleArray, Double.parseDouble("0.0"), Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), 0, Double.parseDouble("0.0")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${488f6942-37f6-395b-9cda-2ab35b99b556}
    @Test()
    void contains4WhenIndexOfArrayValueToFind0ToleranceEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, valueToFind, 0, tolerance) != INDEX_NOT_FOUND) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), 0, Double.parseDouble("0.0"))).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(doubleArray, Double.parseDouble("0.0"), Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), 0, Double.parseDouble("0.0")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${28e58cae-ed28-385b-9a83-8430c1ceffe0}
    @Test()
    void contains5WhenIndexOfArrayValueToFindNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, valueToFind) != INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(floatArray, Float.parseFloat("0.0"))).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(floatArray, Float.parseFloat("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(floatArray, Float.parseFloat("0.0")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${90f8b2ab-0899-3188-a7c0-ce1690a597df}
    @Test()
    void contains5WhenIndexOfArrayValueToFindEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, valueToFind) != INDEX_NOT_FOUND) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(floatArray, Float.parseFloat("0.0"))).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(floatArray, Float.parseFloat("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(floatArray, Float.parseFloat("0.0")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2397f5b1-b4ae-3ca7-9256-2f59867d2452}
    @Test()
    void contains6WhenIndexOfArrayValueToFindNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, valueToFind) != INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(intArray, 0)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(intArray, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(intArray, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${26cff277-569c-38c1-b8f0-272dae29e87d}
    @Test()
    void contains6WhenIndexOfArrayValueToFindEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, valueToFind) != INDEX_NOT_FOUND) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(intArray, 0)).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(intArray, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(intArray, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${62a426e8-6540-3428-bb18-a5d83b28d787}
    @Test()
    void contains7WhenIndexOfArrayValueToFindNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, valueToFind) != INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(longArray, 0L)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(longArray, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(longArray, 0L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${bc482d2f-7037-36f9-aec9-b75cd1549ff9}
    @Test()
    void contains7WhenIndexOfArrayValueToFindEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, valueToFind) != INDEX_NOT_FOUND) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(longArray, 0L)).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(longArray, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(longArray, 0L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${29d4e6a7-4bdb-3cef-953e-a6802afbb78e}
    @Test()
    void contains8WhenIndexOfArrayObjectToFindNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, objectToFind) != INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            Object object = new Object();
            arrayUtils.when(() -> ArrayUtils.indexOf(objectArray, object)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(objectArray, object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(objectArray, object), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7ede4197-40c1-380a-a4a6-73a50620846e}
    @Test()
    void contains8WhenIndexOfArrayObjectToFindEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, objectToFind) != INDEX_NOT_FOUND) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            Object object = new Object();
            arrayUtils.when(() -> ArrayUtils.indexOf(objectArray, object)).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(objectArray, object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(objectArray, object), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0c6b5108-1e46-301e-9d46-b239193ae007}
    @Test()
    void contains9WhenIndexOfArrayValueToFindNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, valueToFind) != INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(shortArray, (short) 0)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(shortArray, (short) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(shortArray, (short) 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2718b243-6c71-3097-b9e4-1e05853d074c}
    @Test()
    void contains9WhenIndexOfArrayValueToFindEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (indexOf(array, valueToFind) != INDEX_NOT_FOUND) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(shortArray, (short) 0)).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.contains(shortArray, (short) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.indexOf(shortArray, (short) 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ce8785e5-d51a-33c7-b6fa-1a4efc88f7a6}
    @Test()
    void containsAnyWhenStreamsOfObjectsToFindAnyMatchContainsArrayE() {
        /* Branches:
         * (Streams.of(objectsToFind).anyMatch(e -> contains(array, e))) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{(Object) null, (Object) null, (Object) null};
        Object[] objectArray2 = new Object[]{};

        //Act Statement(s)
        boolean result = ArrayUtils.containsAny(objectArray, objectArray2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${8e7fef2c-0e9b-3d6d-8305-067def6168df}
    @Test()
    void containsAnyWhenStreamsOfObjectsToFindNotAnyMatchContainsArrayE() {
        /* Branches:
         * (Streams.of(objectsToFind).anyMatch(e -> contains(array, e))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{(Object) null, (Object) null, (Object) null};
        Object[] objectArray2 = new Object[]{(Object) null, (Object) null};

        //Act Statement(s)
        boolean result = ArrayUtils.containsAny(objectArray, objectArray2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}
    @Test()
    void getTest() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.get(objectArray, 0, (Object) null)).thenReturn(object);
            //Act Statement(s)
            Object result = ArrayUtils.get(objectArray, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                arrayUtils.verify(() -> ArrayUtils.get(objectArray, 0, (Object) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${57589f2e-b638-3284-b730-bd477179f05f}
    @Test()
    void get1WhenIsArrayIndexValidArrayIndex() {
        /* Branches:
         * (isArrayIndexValid(array, index)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object[] objectArray = new Object[]{object};
            arrayUtils.when(() -> ArrayUtils.isArrayIndexValid(objectArray, 0)).thenReturn(true);
            Object object2 = new Object();
            //Act Statement(s)
            Object result = ArrayUtils.get(objectArray, 0, object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                arrayUtils.verify(() -> ArrayUtils.isArrayIndexValid(objectArray, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f834820c-ac4b-39ea-a536-6b3f96c0e0fc}
    @Test()
    void get1WhenIsArrayIndexValidNotArrayIndex() {
        /* Branches:
         * (isArrayIndexValid(array, index)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.isArrayIndexValid(objectArray, 0)).thenReturn(false);
            Object object = new Object();
            //Act Statement(s)
            Object result = ArrayUtils.get(objectArray, 0, object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                arrayUtils.verify(() -> ArrayUtils.isArrayIndexValid(objectArray, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${33b119b3-ead9-3d91-b3dd-54019742f965}
    @Test()
    void getComponentTypeTest() {
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};

        //Act Statement(s)
        Class result = ArrayUtils.getComponentType(objectArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Object.class)));
    }

    //Sapient generated method id: ${3252f3ee-6863-32b0-b532-b9e9bb6830c0}
    @Test()
    void getLengthWhenArrayIsNotNull() {
        /* Branches:
         * (array != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();

        //Act Statement(s)
        int result = ArrayUtils.getLength(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${5142afbd-5909-345b-84e9-2d8f850e7123}
    @Test()
    void getLengthWhenArrayIsNull() {
        /* Branches:
         * (array != null) : false
         */
        //Arrange Statement(s)
        Object object = null;

        //Act Statement(s)
        int result = ArrayUtils.getLength(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${38f7c071-283a-3aab-adff-62ff29c426ab}
    @Test()
    void hashCodeTest() {
        //Arrange Statement(s)
        Object object = new Object();

        //Act Statement(s)
        int result = ArrayUtils.hashCode(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(629)));
    }

    //Sapient generated method id: ${c6b214db-06f5-31dc-a26d-683553212da9}
    @Test()
    void indexesOfTest() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(booleanArray, false, 0)).thenReturn(bitSet);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(booleanArray, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(booleanArray, false, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f9c7d503-b786-3a77-819b-00cdbda3bccf}
    @Test()
    void indexesOf1WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        boolean[] _boolean = null;

        //Act Statement(s)
        BitSet result = ArrayUtils.indexesOf(_boolean, false, 0);
        BitSet bitSet = new BitSet();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(bitSet)));
    }

    //Sapient generated method id: ${8452bcad-6189-3294-9d97-4836bf0b9c03}
    @Test()
    void indexesOf1WhenStartIndexEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(booleanArray, false, -1)).thenReturn(-1);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(booleanArray, false, -1);
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(booleanArray, false, -1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3354ff90-d1fe-305d-a12a-8e0b00c913d5}
    @Test()
    void indexesOf1WhenStartIndexNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(booleanArray, false, -1)).thenReturn(0);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(booleanArray, false, -1);
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(booleanArray, false, -1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${98f337fe-3b22-31a7-8126-6217dc2e9687}
    @Test()
    void indexesOf2Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(byteArray, (byte) 0, 0)).thenReturn(bitSet);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(byteArray, (byte) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(byteArray, (byte) 0, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${93424067-8111-3fc3-99db-841dbb5292da}
    @Test()
    void indexesOf3WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        byte[] _byte = null;

        //Act Statement(s)
        BitSet result = ArrayUtils.indexesOf(_byte, (byte) 0, 0);
        BitSet bitSet = new BitSet();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(bitSet)));
    }

    //Sapient generated method id: ${7147f88f-d01a-32fb-8479-20158a948216}
    @Test()
    void indexesOf3WhenStartIndexEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(byteArray, (byte) 0, -1)).thenReturn(-1);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(byteArray, (byte) 0, -1);
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(byteArray, (byte) 0, -1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${e21cd5ef-a5bf-3e78-8626-3f6bb360d846}
    @Test()
    void indexesOf3WhenStartIndexNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(byteArray, (byte) 0, -1)).thenReturn(0);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(byteArray, (byte) 0, -1);
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(byteArray, (byte) 0, -1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${84c87863-3e70-3a9e-ae11-f5e30b834d39}
    @Test()
    void indexesOf4Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(charArray, 'A', 0)).thenReturn(bitSet);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(charArray, 'A');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(charArray, 'A', 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${aa69b32b-dcf3-3ec6-8363-22418ee6ed92}
    @Test()
    void indexesOf5WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        char[] _char = null;

        //Act Statement(s)
        BitSet result = ArrayUtils.indexesOf(_char, 'A', 0);
        BitSet bitSet = new BitSet();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(bitSet)));
    }

    //Sapient generated method id: ${33daa64b-6220-3602-9a25-17d6696dbf0c}
    @Test()
    void indexesOf5WhenStartIndexEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(charArray, 'A', -1)).thenReturn(-1);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(charArray, 'A', -1);
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(charArray, 'A', -1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${800618e1-a30d-36b9-acaa-79e545865d45}
    @Test()
    void indexesOf5WhenStartIndexNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(charArray, 'A', -1)).thenReturn(0);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(charArray, 'A', -1);
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(charArray, 'A', -1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${db827608-c7f5-36c3-9fb1-f9183ecf33d4}
    @Test()
    void indexesOf6Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(doubleArray, Double.parseDouble("0.0"), 0)).thenReturn(bitSet);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(doubleArray, Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(doubleArray, Double.parseDouble("0.0"), 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${524c3ef8-ad9b-3e0f-8d3b-45c34e4e6904}
    @Test()
    void indexesOf7Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(doubleArray, Double.parseDouble("0.0"), 0, Double.parseDouble("0.0"))).thenReturn(bitSet);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(doubleArray, Double.parseDouble("0.0"), Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(doubleArray, Double.parseDouble("0.0"), 0, Double.parseDouble("0.0")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b000a5ca-9c9f-32cb-91f6-0b65dec5c7da}
    @Test()
    void indexesOf8WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        double[] _double = null;

        //Act Statement(s)
        BitSet result = ArrayUtils.indexesOf(_double, Double.parseDouble("0.0"), 0);
        BitSet bitSet = new BitSet();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(bitSet)));
    }

    //Sapient generated method id: ${c11562a9-7256-30be-b6dc-62a57ab2addd}
    @Test()
    void indexesOf8WhenStartIndexEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), -1)).thenReturn(-1);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(doubleArray, Double.parseDouble("0.0"), -1);
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), -1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c30da9af-bdf6-3f8c-abb1-8e758ff74950}
    @Test()
    void indexesOf8WhenStartIndexNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), -1)).thenReturn(0);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(doubleArray, Double.parseDouble("0.0"), -1);
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), -1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d19d10c0-7625-33dc-b913-58032f437cc6}
    @Test()
    void indexesOf9WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        double[] _double = null;

        //Act Statement(s)
        BitSet result = ArrayUtils.indexesOf(_double, Double.parseDouble("0.0"), 0, Double.parseDouble("0.0"));
        BitSet bitSet = new BitSet();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(bitSet)));
    }

    //Sapient generated method id: ${d4e3f3c3-c40b-3802-8d0f-47e40dd0267b}
    @Test()
    void indexesOf9WhenStartIndexEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), -1, Double.parseDouble("0.0"))).thenReturn(-1);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(doubleArray, Double.parseDouble("0.0"), -1, Double.parseDouble("0.0"));
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), -1, Double.parseDouble("0.0")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8d767205-4af7-3062-ae21-56da1315379a}
    @Test()
    void indexesOf9WhenStartIndexNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), -1, Double.parseDouble("0.0"))).thenReturn(0);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(doubleArray, Double.parseDouble("0.0"), -1, Double.parseDouble("0.0"));
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), -1, Double.parseDouble("0.0")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${73553ad4-232b-3043-9bb2-7811ad61787f}
    @Test()
    void indexesOf10Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(floatArray, Float.parseFloat("0.0"), 0)).thenReturn(bitSet);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(floatArray, Float.parseFloat("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(floatArray, Float.parseFloat("0.0"), 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${bc7e29ec-bc07-3e0c-9083-054975bb90a0}
    @Test()
    void indexesOf11WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        float[] _float = null;

        //Act Statement(s)
        BitSet result = ArrayUtils.indexesOf(_float, Float.parseFloat("0.0"), 0);
        BitSet bitSet = new BitSet();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(bitSet)));
    }

    //Sapient generated method id: ${0c87be8f-1863-3904-8462-64f6803b5312}
    @Test()
    void indexesOf11WhenStartIndexEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(floatArray, Float.parseFloat("0.0"), -1)).thenReturn(-1);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(floatArray, Float.parseFloat("0.0"), -1);
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(floatArray, Float.parseFloat("0.0"), -1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0d00a79c-a849-359f-8c89-188791eb0fb7}
    @Test()
    void indexesOf11WhenStartIndexNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(floatArray, Float.parseFloat("0.0"), -1)).thenReturn(0);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(floatArray, Float.parseFloat("0.0"), -1);
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(floatArray, Float.parseFloat("0.0"), -1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3bc248f9-caa6-3b33-b046-8499409436fa}
    @Test()
    void indexesOf12Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(intArray, 0, 0)).thenReturn(bitSet);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(intArray, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(intArray, 0, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${03cb0338-0299-3694-b32e-fff55ee66ad1}
    @Test()
    void indexesOf13WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        int[] _int = null;

        //Act Statement(s)
        BitSet result = ArrayUtils.indexesOf(_int, 0, 0);
        BitSet bitSet = new BitSet();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(bitSet)));
    }

    //Sapient generated method id: ${3c836489-8c59-3db0-9400-5b3a3f01476e}
    @Test()
    void indexesOf13WhenStartIndexEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(intArray, 0, -1)).thenReturn(-1);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(intArray, 0, -1);
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(intArray, 0, -1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ff6441cc-2506-37e3-91b7-0fe39fcfa8fe}
    @Test()
    void indexesOf13WhenStartIndexNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(intArray, 0, -1)).thenReturn(0);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(intArray, 0, -1);
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(intArray, 0, -1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${53212122-7b13-3c72-aa83-91e871a44010}
    @Test()
    void indexesOf14Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(longArray, 0L, 0)).thenReturn(bitSet);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(longArray, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(longArray, 0L, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2348f1bf-09f8-312b-b59d-005c2db375c3}
    @Test()
    void indexesOf15WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        long[] _long = null;

        //Act Statement(s)
        BitSet result = ArrayUtils.indexesOf(_long, 0L, 0);
        BitSet bitSet = new BitSet();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(bitSet)));
    }

    //Sapient generated method id: ${2e32f2cd-ca91-3379-8900-c8da08505679}
    @Test()
    void indexesOf15WhenStartIndexEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(longArray, 0L, -1)).thenReturn(-1);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(longArray, 0L, -1);
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(longArray, 0L, -1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${edfb10f4-cbe3-3cc4-8602-428e20e3a68e}
    @Test()
    void indexesOf15WhenStartIndexNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(longArray, 0L, -1)).thenReturn(0);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(longArray, 0L, -1);
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(longArray, 0L, -1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${45ffa9c7-a918-3a80-8195-26a01f223123}
    @Test()
    void indexesOf16Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            Object[] objectArray = new Object[]{};
            Object object = new Object();
            arrayUtils.when(() -> ArrayUtils.indexesOf(objectArray, object, 0)).thenReturn(bitSet);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(objectArray, object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(objectArray, object, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4b0e379f-1afc-3ede-8ab6-c1a74af878ed}
    @Test()
    void indexesOf17WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Object[] object = null;
        Object object2 = new Object();

        //Act Statement(s)
        BitSet result = ArrayUtils.indexesOf(object, object2, 0);
        BitSet bitSet = new BitSet();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(bitSet)));
    }

    //Sapient generated method id: ${c65ef7df-96a5-31a2-9fb3-cdfc55c0322b}
    @Test()
    void indexesOf17WhenStartIndexEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            Object object = new Object();
            arrayUtils.when(() -> ArrayUtils.indexOf(objectArray, object, -1)).thenReturn(-1);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(objectArray, object, -1);
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(objectArray, object, -1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5c2db93d-3622-331e-933a-27238a785e9c}
    @Test()
    void indexesOf17WhenStartIndexNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            Object object = new Object();
            arrayUtils.when(() -> ArrayUtils.indexOf(objectArray, object, -1)).thenReturn(0);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(objectArray, object, -1);
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(objectArray, object, -1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${90cb8b19-7960-384d-a779-152d8f88f5b1}
    @Test()
    void indexesOf18Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(shortArray, (short) 0, 0)).thenReturn(bitSet);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(shortArray, (short) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(shortArray, (short) 0, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8e2ff714-6a28-3682-a212-5674073be229}
    @Test()
    void indexesOf19WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        short[] _short = null;

        //Act Statement(s)
        BitSet result = ArrayUtils.indexesOf(_short, (short) 0, 0);
        BitSet bitSet = new BitSet();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(bitSet)));
    }

    //Sapient generated method id: ${8702143d-aea6-3155-95d4-9fd7e785b32f}
    @Test()
    void indexesOf19WhenStartIndexEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(shortArray, (short) 0, -1)).thenReturn(-1);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(shortArray, (short) 0, -1);
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(shortArray, (short) 0, -1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${15b70811-7c46-30ba-a66d-90dfd69b128a}
    @Test()
    void indexesOf19WhenStartIndexNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (array == null) : false
         * (startIndex < array.length) : true
         * (startIndex == INDEX_NOT_FOUND) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(shortArray, (short) 0, -1)).thenReturn(0);
            //Act Statement(s)
            BitSet result = ArrayUtils.indexesOf(shortArray, (short) 0, -1);
            BitSet bitSet = new BitSet();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bitSet));
                arrayUtils.verify(() -> ArrayUtils.indexOf(shortArray, (short) 0, -1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5b50b3bd-56a0-3e98-8688-4f4e74bcabed}
    @Test()
    void indexOfTest() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(booleanArray, false, 0)).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(booleanArray, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.indexOf(booleanArray, false, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${12c7d549-d01f-3dc4-83f9-79352d34bf0b}
    @Test()
    void indexOf1WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(true);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(booleanArray, false, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6cca25e6-243a-3cf6-9626-b52cd9601b82}
    @Test()
    void indexOf1WhenValueToFindEqualsIIndexOfArray() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : true
         * (i < array.length) : true
         * (valueToFind == array[i]) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{false};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(booleanArray, false, -1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${eb681b7d-a66b-3b64-ada3-723fcc2b42eb}
    @Test()
    void indexOf1WhenValueToFindNotEqualsIIndexOfArray() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : true
         * (i < array.length) : true
         * (valueToFind == array[i]) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{false};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(booleanArray, true, -1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c643ce90-140c-3a23-b6c5-cf71af5c2c4a}
    @Test()
    void indexOf2Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(byteArray, (byte) 0, 0)).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(byteArray, (byte) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.indexOf(byteArray, (byte) 0, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9c146553-3c32-34d3-b9e9-64b9faa15987}
    @Test()
    void indexOf3WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        byte[] _byte = null;

        //Act Statement(s)
        int result = ArrayUtils.indexOf(_byte, (byte) 0, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${3a141e05-f648-31ee-ab83-71da54c68fc4}
    @Test()
    void indexOf3WhenValueToFindEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         * (i < array.length) : true
         * (valueToFind == array[i]) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) -1};

        //Act Statement(s)
        int result = ArrayUtils.indexOf(byteArray, (byte) -1, -1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${b88d5c2d-ee8e-325d-951c-53cf4cce277b}
    @Test()
    void indexOf3WhenValueToFindNotEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         * (i < array.length) : true
         * (valueToFind == array[i]) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};

        //Act Statement(s)
        int result = ArrayUtils.indexOf(byteArray, (byte) -1, -1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${e449f32d-9197-3f4d-a7b6-6535e6001a7d}
    @Test()
    void indexOf4Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(charArray, 'A', 0)).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(charArray, 'A');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.indexOf(charArray, 'A', 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b6256368-b40d-3b6b-b853-4dbd58ae10fa}
    @Test()
    void indexOf5WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        char[] _char = null;

        //Act Statement(s)
        int result = ArrayUtils.indexOf(_char, 'A', 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${1f729f9a-217e-3fa6-938c-391f9d0a3794}
    @Test()
    void indexOf5WhenValueToFindEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         * (i < array.length) : true
         * (valueToFind == array[i]) : true
         */
        //Arrange Statement(s)
        char[] charArray = new char[]{'A'};

        //Act Statement(s)
        int result = ArrayUtils.indexOf(charArray, 'A', -1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${c729a5a3-ed21-31f4-8467-c85fbd5442cd}
    @Test()
    void indexOf5WhenValueToFindNotEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         * (i < array.length) : true
         * (valueToFind == array[i]) : false
         */
        //Arrange Statement(s)
        char[] charArray = new char[]{'B'};

        //Act Statement(s)
        int result = ArrayUtils.indexOf(charArray, 'A', -1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${3fa2de3e-a769-3128-9d93-b2e9434fb834}
    @Test()
    void indexOf6Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), 0)).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${abed6c2d-a5f7-33ac-9e77-d9f8ab244757}
    @Test()
    void indexOf7Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), 0, Double.parseDouble("0.0"))).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), 0, Double.parseDouble("0.0")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${34d3e80e-8b22-365f-bf81-facb3b7df09a}
    @Test()
    void indexOf8WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(true);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b148908a-e426-38b7-9d51-d007b9f5fc97}
    @Test()
    void indexOf8WhenDoubleIsNaNElement() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : true
         * (i < array.length) : true
         * (valueToFind == element) : false
         * (searchNaN) : true
         * (Double.isNaN(element)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a2d8ca7a-6887-3f04-8c28-0979e983ef32}
    @Test()
    void indexOf8WhenDoubleNotIsNaNElement() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : true
         * (i < array.length) : true
         * (valueToFind == element) : false
         * (searchNaN) : true
         * (Double.isNaN(element)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${e7e07e66-d57d-3979-ba97-daefe55809b3}
    @Test()
    void indexOf9WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(true);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"), 0, Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${399c8766-fdc7-307d-a060-ccb3525c5d40}
    @Test()
    void indexOf9WhenIIndexOfArrayLessThanOrEqualsToMax() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : true
         * (i < array.length) : true
         * (array[i] >= min) : true
         * (array[i] <= max) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{Double.parseDouble("0.5")};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.5"), -1, Double.parseDouble("0.5"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4199af31-7a49-3a9f-9424-6017499fe4e9}
    @Test()
    void indexOf9WhenIIndexOfArrayGreaterThanMax() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : true
         * (i < array.length) : true
         * (array[i] >= min) : true
         * (array[i] <= max) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{Double.parseDouble("0.0")};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(doubleArray, Double.parseDouble("-0.25"), -1, Double.parseDouble("-0.25"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${90ac9326-63c8-30c8-9454-92345504c049}
    @Test()
    void indexOf10Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(floatArray, Float.parseFloat("0.0"), 0)).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(floatArray, Float.parseFloat("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.indexOf(floatArray, Float.parseFloat("0.0"), 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0d7e7c21-5689-3cd4-92a2-ac63bb5a3766}
    @Test()
    void indexOf11WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(true);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(floatArray, Float.parseFloat("0.0"), 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2213181e-9577-3588-8818-92d4ef5fcfc5}
    @Test()
    void indexOf11WhenFloatIsNaNElement() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : true
         * (i < array.length) : true
         * (valueToFind == element) : false
         * (searchNaN) : true
         * (Float.isNaN(element)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(floatArray, Float.parseFloat("0.0"), 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1ae0daa0-8ac8-30fe-9b7e-56a34d36732e}
    @Test()
    void indexOf11WhenFloatNotIsNaNElement() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : true
         * (i < array.length) : true
         * (valueToFind == element) : false
         * (searchNaN) : true
         * (Float.isNaN(element)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(floatArray, Float.parseFloat("0.0"), 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b8553111-71f1-3096-8b40-4146688de12e}
    @Test()
    void indexOf12Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(intArray, 0, 0)).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(intArray, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.indexOf(intArray, 0, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${138f2435-897e-3b00-ab04-5dc050e9ecd3}
    @Test()
    void indexOf13WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        int[] _int = null;

        //Act Statement(s)
        int result = ArrayUtils.indexOf(_int, 0, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${720d5f6f-774b-3768-8d38-41bf526c7706}
    @Test()
    void indexOf13WhenValueToFindEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         * (i < array.length) : true
         * (valueToFind == array[i]) : true
         */
        //Arrange Statement(s)
        int[] intArray = new int[]{-1};

        //Act Statement(s)
        int result = ArrayUtils.indexOf(intArray, -1, -1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${1cd7cc7f-abb8-33e2-aa5c-7acb50a07703}
    @Test()
    void indexOf13WhenValueToFindNotEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         * (i < array.length) : true
         * (valueToFind == array[i]) : false
         */
        //Arrange Statement(s)
        int[] intArray = new int[]{0};

        //Act Statement(s)
        int result = ArrayUtils.indexOf(intArray, -1, -1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${db553dea-6986-3192-9064-e7e0a0c86eb8}
    @Test()
    void indexOf14Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(longArray, 0L, 0)).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(longArray, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.indexOf(longArray, 0L, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7114b4e9-447d-3168-b054-beb646236c0e}
    @Test()
    void indexOf15WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        long[] _long = null;

        //Act Statement(s)
        int result = ArrayUtils.indexOf(_long, 0L, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${f3720644-724d-32cf-9bfd-f3639149b23b}
    @Test()
    void indexOf15WhenValueToFindEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         * (i < array.length) : true
         * (valueToFind == array[i]) : true
         */
        //Arrange Statement(s)
        long[] longArray = new long[]{0L};

        //Act Statement(s)
        int result = ArrayUtils.indexOf(longArray, 0L, -1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${88fa37e4-af6c-3311-930b-3275497b4ef1}
    @Test()
    void indexOf15WhenValueToFindNotEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         * (i < array.length) : true
         * (valueToFind == array[i]) : false
         */
        //Arrange Statement(s)
        long[] longArray = new long[]{0L};

        //Act Statement(s)
        int result = ArrayUtils.indexOf(longArray, -1L, -1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${d51ab76b-6c18-3ad2-93c0-e3ce85c6d390}
    @Test()
    void indexOf16Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            Object object = new Object();
            arrayUtils.when(() -> ArrayUtils.indexOf(objectArray, object, 0)).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(objectArray, object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.indexOf(objectArray, object, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${acc4216c-53f9-385e-8d56-4582e676b72f}
    @Test()
    void indexOf17WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Object[] object = null;
        Object object2 = new Object();

        //Act Statement(s)
        int result = ArrayUtils.indexOf(object, object2, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${d515e996-640e-3def-83c4-e65bf62a4d2a}
    @Test()
    void indexOf17WhenIIndexOfArrayIsNull() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         * (objectToFind == null) : true
         * (i < array.length) : true
         * (array[i] == null) : true
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{(Object) null};
        Object object = null;

        //Act Statement(s)
        int result = ArrayUtils.indexOf(objectArray, object, -1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${94e3499a-48d3-3d2b-baae-2779111afd12}
    @Test()
    void indexOf17WhenIIndexOfArrayIsNotNull() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         * (objectToFind == null) : true
         * (i < array.length) : true
         * (array[i] == null) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object[] objectArray = new Object[]{object};
        Object object2 = null;

        //Act Statement(s)
        int result = ArrayUtils.indexOf(objectArray, object2, -1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${99c8dc55-090a-372e-95c0-ded08865ffd5}
    @Test()
    void indexOf17WhenObjectToFindEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         * (objectToFind == null) : false
         * (i < array.length) : true
         * (objectToFind.equals(array[i])) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object[] objectArray = new Object[]{object};
        Object object2 = new Object();

        //Act Statement(s)
        int result = ArrayUtils.indexOf(objectArray, object2, -1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${cd953cfb-4e75-36f1-b55c-88cfff52f494}
    @Test()
    void indexOf17WhenObjectToFindNotEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         * (objectToFind == null) : false
         * (i < array.length) : true
         * (objectToFind.equals(array[i])) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object[] objectArray = new Object[]{object};
        Object object2 = new Object();

        //Act Statement(s)
        int result = ArrayUtils.indexOf(objectArray, object2, -1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${888631ec-d432-3a4d-98b6-abf7ed6288f6}
    @Test()
    void indexOf18Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(shortArray, (short) 0, 0)).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.indexOf(shortArray, (short) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.indexOf(shortArray, (short) 0, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2670595c-fc8f-3169-8658-f936565a4dba}
    @Test()
    void indexOf19WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        short[] _short = null;

        //Act Statement(s)
        int result = ArrayUtils.indexOf(_short, (short) 0, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${f62b59f3-0bab-3a2d-a7d9-e2ed8ec842ef}
    @Test()
    void indexOf19WhenValueToFindEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         * (i < array.length) : true
         * (valueToFind == array[i]) : true
         */
        //Arrange Statement(s)
        short[] shortArray = new short[]{(short) -1};

        //Act Statement(s)
        int result = ArrayUtils.indexOf(shortArray, (short) -1, -1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${0d7b324f-7502-3aad-bdad-e4990f2a72ce}
    @Test()
    void indexOf19WhenValueToFindNotEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         * (i < array.length) : true
         * (valueToFind == array[i]) : false
         */
        //Arrange Statement(s)
        short[] shortArray = new short[]{(short) 0};

        //Act Statement(s)
        int result = ArrayUtils.indexOf(shortArray, (short) -1, -1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${4bdcfbde-a268-3c35-82d6-8b30c37ab955}
    @Test()
    void insertWhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        boolean[] _boolean = null;
        boolean[] booleanArray = new boolean[]{};

        //Act Statement(s)
        boolean[] result = ArrayUtils.insert(0, _boolean, booleanArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${5254a1c0-fe75-355e-abdb-8659567c3af8}
    @Test()
    void insertWhenArrayUtilsIsEmptyValues() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(true);
            boolean[] booleanArray2 = new boolean[]{};
            boolean[] booleanArray3 = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.clone(booleanArray3)).thenReturn(booleanArray2);
            //Act Statement(s)
            boolean[] result = ArrayUtils.insert(0, booleanArray3, booleanArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanArray2));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(booleanArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6cf207cd-f373-3206-b365-d5e4088c5e65}
    @Test()
    void insertWhenIndexGreaterThanArrayLengthThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : false
         * (index < 0) : false
         * (index > array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(false);
            boolean[] booleanArray2 = new boolean[]{};
            //Act Statement(s)
            final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
                ArrayUtils.insert(2, booleanArray2, booleanArray);
            });
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Index: 2, Length: 0");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9e64c8c7-6055-37f6-b3cf-100224a3b480}
    @Test()
    void insertWhenIndexLessThanArrayLength() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : false
         * (index < 0) : false
         * (index > array.length) : false
         * (index > 0) : true
         * (index < array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(false);
            boolean[] booleanArray2 = new boolean[]{false, false};
            //Act Statement(s)
            boolean[] result = ArrayUtils.insert(1, booleanArray2, booleanArray);
            boolean[] booleanResultArray = new boolean[]{false, false};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${495513e2-2150-34c0-859f-7e255e5d2828}
    @Test()
    void insert1WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        byte[] _byte = null;
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        byte[] result = ArrayUtils.insert(0, _byte, byteArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${107e9c5d-68d0-3570-b4ef-a6a292867d25}
    @Test()
    void insert1WhenArrayUtilsIsEmptyValues() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(byteArray)).thenReturn(true);
            byte[] byteArray2 = new byte[]{};
            byte[] byteArray3 = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.clone(byteArray3)).thenReturn(byteArray2);
            //Act Statement(s)
            byte[] result = ArrayUtils.insert(0, byteArray3, byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray2));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(byteArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(byteArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3529e0a3-a947-3a53-830b-d25c88bc7a69}
    @Test()
    void insert1WhenIndexGreaterThanArrayLengthThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : false
         * (index < 0) : false
         * (index > array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(byteArray)).thenReturn(false);
            byte[] byteArray2 = new byte[]{};
            //Act Statement(s)
            final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
                ArrayUtils.insert(2, byteArray2, byteArray);
            });
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Index: 2, Length: 0");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(byteArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${656f0eb4-d58e-33c4-baeb-8c5bd30ff516}
    @Test()
    void insert1WhenIndexLessThanArrayLength() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : false
         * (index < 0) : false
         * (index > array.length) : false
         * (index > 0) : true
         * (index < array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(byteArray)).thenReturn(false);
            byte[] byteArray2 = new byte[]{(byte) 0, (byte) 1};
            //Act Statement(s)
            byte[] result = ArrayUtils.insert(1, byteArray2, byteArray);
            byte[] byteResultArray = new byte[]{(byte) 0, (byte) 0};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(byteArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5590ddef-af12-3aa8-9da7-b88a812760ff}
    @Test()
    void insert2WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        char[] _char = null;
        char[] charArray = new char[]{};

        //Act Statement(s)
        char[] result = ArrayUtils.insert(0, _char, charArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${13891218-c58d-3269-b78c-47d14d5949af}
    @Test()
    void insert2WhenArrayUtilsIsEmptyValues() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(charArray)).thenReturn(true);
            char[] charArray2 = new char[]{};
            char[] charArray3 = new char[]{};
            arrayUtils.when(() -> ArrayUtils.clone(charArray3)).thenReturn(charArray2);
            //Act Statement(s)
            char[] result = ArrayUtils.insert(0, charArray3, charArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray2));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(charArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(charArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${97154d59-b429-3534-b2e6-48ee8c7818e6}
    @Test()
    void insert2WhenIndexGreaterThanArrayLengthThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : false
         * (index < 0) : false
         * (index > array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(charArray)).thenReturn(false);
            char[] charArray2 = new char[]{};
            //Act Statement(s)
            final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
                ArrayUtils.insert(2, charArray2, charArray);
            });
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Index: 2, Length: 0");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(charArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2a9d7be4-4fab-3a49-8373-24fb122f3ed3}
    @Test()
    void insert2WhenIndexLessThanArrayLength() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : false
         * (index < 0) : false
         * (index > array.length) : false
         * (index > 0) : true
         * (index < array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(charArray)).thenReturn(false);
            char[] charArray2 = new char[]{'A', 'A'};
            //Act Statement(s)
            char[] result = ArrayUtils.insert(1, charArray2, charArray);
            char[] charResultArray = new char[]{'\u0000', '\u0000'};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(charArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6d2e3e7a-4c33-3254-985c-24fed3c51053}
    @Test()
    void insert3WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        double[] _double = null;
        double[] doubleArray = new double[]{};

        //Act Statement(s)
        double[] result = ArrayUtils.insert(0, _double, doubleArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${9afd40f6-f58c-33fb-8773-8dd44e73726d}
    @Test()
    void insert3WhenArrayUtilsIsEmptyValues() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(true);
            double[] doubleArray2 = new double[]{};
            double[] doubleArray3 = new double[]{};
            arrayUtils.when(() -> ArrayUtils.clone(doubleArray3)).thenReturn(doubleArray2);
            //Act Statement(s)
            double[] result = ArrayUtils.insert(0, doubleArray3, doubleArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleArray2));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(doubleArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${835978f1-296b-33a0-a20a-0478332c0515}
    @Test()
    void insert3WhenIndexGreaterThanArrayLengthThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : false
         * (index < 0) : false
         * (index > array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            double[] doubleArray2 = new double[]{};
            //Act Statement(s)
            final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
                ArrayUtils.insert(2, doubleArray2, doubleArray);
            });
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Index: 2, Length: 0");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5e54d372-689f-3831-9b45-f11a37080bf4}
    @Test()
    void insert3WhenIndexLessThanArrayLength() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : false
         * (index < 0) : false
         * (index > array.length) : false
         * (index > 0) : true
         * (index < array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            double[] doubleArray2 = new double[]{Double.parseDouble("0"), Double.parseDouble("1")};
            //Act Statement(s)
            double[] result = ArrayUtils.insert(1, doubleArray2, doubleArray);
            double[] doubleResultArray = new double[]{Double.parseDouble("0.0"), Double.parseDouble("0.0")};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d9599fb8-27e7-39d9-9afb-c15986f29d34}
    @Test()
    void insert4WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        float[] _float = null;
        float[] floatArray = new float[]{};

        //Act Statement(s)
        float[] result = ArrayUtils.insert(0, _float, floatArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${e13df034-53ac-37df-a116-b4c56d0ca645}
    @Test()
    void insert4WhenArrayUtilsIsEmptyValues() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(true);
            float[] floatArray2 = new float[]{};
            float[] floatArray3 = new float[]{};
            arrayUtils.when(() -> ArrayUtils.clone(floatArray3)).thenReturn(floatArray2);
            //Act Statement(s)
            float[] result = ArrayUtils.insert(0, floatArray3, floatArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatArray2));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(floatArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${df82e6e7-4213-390e-be49-5e985d0cab12}
    @Test()
    void insert4WhenIndexGreaterThanArrayLengthThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : false
         * (index < 0) : false
         * (index > array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(false);
            float[] floatArray2 = new float[]{};
            //Act Statement(s)
            final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
                ArrayUtils.insert(2, floatArray2, floatArray);
            });
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Index: 2, Length: 0");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${86f1eefb-c5c7-3784-895f-07d1dbca365b}
    @Test()
    void insert4WhenIndexLessThanArrayLength() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : false
         * (index < 0) : false
         * (index > array.length) : false
         * (index > 0) : true
         * (index < array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(false);
            float[] floatArray2 = new float[]{Float.parseFloat("0"), Float.parseFloat("1")};
            //Act Statement(s)
            float[] result = ArrayUtils.insert(1, floatArray2, floatArray);
            float[] floatResultArray = new float[]{Float.parseFloat("0.0"), Float.parseFloat("0.0")};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9479a4f1-83df-3a69-a644-987da4459913}
    @Test()
    void insert5WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        int[] _int = null;
        int[] intArray = new int[]{};

        //Act Statement(s)
        int[] result = ArrayUtils.insert(0, _int, intArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${610df441-fdec-3b48-b710-26a0f2b2d00c}
    @Test()
    void insert5WhenArrayUtilsIsEmptyValues() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(intArray)).thenReturn(true);
            int[] intArray2 = new int[]{};
            int[] intArray3 = new int[]{};
            arrayUtils.when(() -> ArrayUtils.clone(intArray3)).thenReturn(intArray2);
            //Act Statement(s)
            int[] result = ArrayUtils.insert(0, intArray3, intArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(intArray2));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(intArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(intArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4858023f-0a0f-3644-b09c-da8ab780a97d}
    @Test()
    void insert5WhenIndexGreaterThanArrayLengthThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : false
         * (index < 0) : false
         * (index > array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(intArray)).thenReturn(false);
            int[] intArray2 = new int[]{};
            //Act Statement(s)
            final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
                ArrayUtils.insert(2, intArray2, intArray);
            });
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Index: 2, Length: 0");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${e0faf8ea-9ef4-3ce8-a2d4-a44fe4284cc7}
    @Test()
    void insert5WhenIndexLessThanArrayLength() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : false
         * (index < 0) : false
         * (index > array.length) : false
         * (index > 0) : true
         * (index < array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(intArray)).thenReturn(false);
            int[] intArray2 = new int[]{0, 1};
            //Act Statement(s)
            int[] result = ArrayUtils.insert(1, intArray2, intArray);
            int[] intResultArray = new int[]{0, 0};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(intResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4fe4e1cd-4688-3bdd-8960-8248dd171bdd}
    @Test()
    void insert6WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        long[] _long = null;
        long[] longArray = new long[]{};

        //Act Statement(s)
        long[] result = ArrayUtils.insert(0, _long, longArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${d4b74d13-fd0d-3f27-a708-6be443b31566}
    @Test()
    void insert6WhenArrayUtilsIsEmptyValues() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(longArray)).thenReturn(true);
            long[] longArray2 = new long[]{};
            long[] longArray3 = new long[]{};
            arrayUtils.when(() -> ArrayUtils.clone(longArray3)).thenReturn(longArray2);
            //Act Statement(s)
            long[] result = ArrayUtils.insert(0, longArray3, longArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray2));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(longArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(longArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f50382ba-3337-3797-9cec-d60e0ae76c1d}
    @Test()
    void insert6WhenIndexGreaterThanArrayLengthThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : false
         * (index < 0) : false
         * (index > array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(longArray)).thenReturn(false);
            long[] longArray2 = new long[]{};
            //Act Statement(s)
            final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
                ArrayUtils.insert(2, longArray2, longArray);
            });
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Index: 2, Length: 0");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(longArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1e6b18aa-dba9-3bbc-b4ec-69c977408b7e}
    @Test()
    void insert6WhenIndexLessThanArrayLength() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : false
         * (index < 0) : false
         * (index > array.length) : false
         * (index > 0) : true
         * (index < array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(longArray)).thenReturn(false);
            long[] longArray2 = new long[]{0L, 1L};
            //Act Statement(s)
            long[] result = ArrayUtils.insert(1, longArray2, longArray);
            long[] longResultArray = new long[]{0L, 0L};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(longArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ba31fdcf-0557-35d1-9d62-90814f99c3cd}
    @Test()
    void insert7WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        short[] _short = null;
        short[] shortArray = new short[]{};

        //Act Statement(s)
        short[] result = ArrayUtils.insert(0, _short, shortArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${405f65b1-ad58-3f94-a890-0f4bc34a4c95}
    @Test()
    void insert7WhenArrayUtilsIsEmptyValues() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(shortArray)).thenReturn(true);
            short[] shortArray2 = new short[]{};
            short[] shortArray3 = new short[]{};
            arrayUtils.when(() -> ArrayUtils.clone(shortArray3)).thenReturn(shortArray2);
            //Act Statement(s)
            short[] result = ArrayUtils.insert(0, shortArray3, shortArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(shortArray2));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(shortArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(shortArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${29176f64-a74e-35d4-8ea0-31e6a66ee3fd}
    @Test()
    void insert7WhenIndexGreaterThanArrayLengthThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : false
         * (index < 0) : false
         * (index > array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(shortArray)).thenReturn(false);
            short[] shortArray2 = new short[]{};
            //Act Statement(s)
            final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
                ArrayUtils.insert(2, shortArray2, shortArray);
            });
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Index: 2, Length: 0");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(shortArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ffbccf37-0631-328b-a87a-ce9116b1bd5d}
    @Test()
    void insert7WhenIndexLessThanArrayLength() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : false
         * (index < 0) : false
         * (index > array.length) : false
         * (index > 0) : true
         * (index < array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(shortArray)).thenReturn(false);
            short[] shortArray2 = new short[]{(short) 0, (short) 1};
            //Act Statement(s)
            short[] result = ArrayUtils.insert(1, shortArray2, shortArray);
            short[] shortResultArray = new short[]{(short) 0, (short) 0};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(shortResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(shortArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4195f0bd-5e7a-364e-a89d-357b262646a7}
    @Test()
    void insert8WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Object[] object = null;
        Object[] objectArray = new Object[]{};

        //Act Statement(s)
        Object[] result = ArrayUtils.insert(0, object, objectArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${3bf5b61d-9447-31fb-ad45-ee150ebcf8c0}
    @Test()
    void insert8WhenArrayUtilsIsEmptyValues() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(objectArray)).thenReturn(true);
            Object[] objectArray2 = new Object[]{};
            Object[] objectArray3 = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.clone(objectArray3)).thenReturn(objectArray2);
            //Act Statement(s)
            Object[] result = ArrayUtils.insert(0, objectArray3, objectArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(objectArray2));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(objectArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(objectArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c58ffa58-2af9-3f2e-b7e5-07087c5901d6}
    @Test()
    void insert8WhenIndexGreaterThanArrayLengthThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : false
         * (index < 0) : false
         * (index > array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(objectArray)).thenReturn(false);
            Object[] objectArray2 = new Object[]{};
            //Act Statement(s)
            final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
                ArrayUtils.insert(2, objectArray2, objectArray);
            });
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Index: 2, Length: 0");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${48c3cdba-9e17-3c6d-a327-d9bcc3bbb2f1}
    @Test()
    void insert8WhenIndexLessThanArrayLength() {
        /* Branches:
         * (array == null) : false
         * (ArrayUtils.isEmpty(values)) : false
         * (index < 0) : false
         * (index > array.length) : false
         * (index > 0) : true
         * (index < array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(objectArray)).thenReturn(false);
            Object object = new Object();
            Object object2 = new Object();
            Object[] objectArray2 = new Object[]{object, object2};
            //Act Statement(s)
            Object[] result = ArrayUtils.insert(1, objectArray2, objectArray);
            Object object3 = Array.newInstance(Object.class, 2);
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, equalTo(object3));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9ee108df-7d9e-323a-bc7e-0b09ca59753f}
    @Test()
    void isArrayIndexValidWhenGetLengthArrayGreaterThanIndex() {
        /* Branches:
         * (index >= 0) : true
         * (getLength(array) > index) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(objectArray)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isArrayIndexValid(objectArray, 1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${14c7d499-fdd6-34e4-af4b-5400a3a39c9b}
    @Test()
    void isArrayIndexValidWhenGetLengthArrayNotGreaterThanIndex() {
        /* Branches:
         * (index >= 0) : true
         * (getLength(array) > index) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(objectArray)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isArrayIndexValid(objectArray, 1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${978e984e-e801-3bf8-9ccc-97f62bb58f39}
    @Test()
    void isEmptyWhenGetLengthArrayEquals0() {
        /* Branches:
         * (getLength(array) == 0) : true  #  inside isArrayEmpty method
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(booleanArray)).thenReturn(0);
            //Act Statement(s)
            boolean result = ArrayUtils.isEmpty(booleanArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1072c73c-5921-369b-9269-09ddd660653d}
    @Test()
    void isEmptyWhenGetLengthArrayNotEquals0() {
        /* Branches:
         * (getLength(array) == 0) : false  #  inside isArrayEmpty method
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(booleanArray)).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.isEmpty(booleanArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4a053b15-8a70-304c-88ac-028f9b4b09fa}
    @Test()
    void isEmpty1WhenGetLengthArrayEquals0() {
        /* Branches:
         * (getLength(array) == 0) : true  #  inside isArrayEmpty method
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(byteArray)).thenReturn(0);
            //Act Statement(s)
            boolean result = ArrayUtils.isEmpty(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(byteArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${588ef746-bbc0-3195-af4d-0732891eab78}
    @Test()
    void isEmpty1WhenGetLengthArrayNotEquals0() {
        /* Branches:
         * (getLength(array) == 0) : false  #  inside isArrayEmpty method
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(byteArray)).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.isEmpty(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(byteArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c11b67a3-7397-36ce-a1ee-a88f1608e02d}
    @Test()
    void isEmpty2WhenGetLengthArrayEquals0() {
        /* Branches:
         * (getLength(array) == 0) : true  #  inside isArrayEmpty method
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(charArray)).thenReturn(0);
            //Act Statement(s)
            boolean result = ArrayUtils.isEmpty(charArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(charArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f940282b-124f-3091-b318-3ae7b43f1bdc}
    @Test()
    void isEmpty2WhenGetLengthArrayNotEquals0() {
        /* Branches:
         * (getLength(array) == 0) : false  #  inside isArrayEmpty method
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(charArray)).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.isEmpty(charArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(charArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${eae8640e-6e11-3c9e-9be1-bc5edd77052c}
    @Test()
    void isEmpty3WhenGetLengthArrayEquals0() {
        /* Branches:
         * (getLength(array) == 0) : true  #  inside isArrayEmpty method
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(doubleArray)).thenReturn(0);
            //Act Statement(s)
            boolean result = ArrayUtils.isEmpty(doubleArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d214c184-639c-3b3f-9aaa-4fc66165489d}
    @Test()
    void isEmpty3WhenGetLengthArrayNotEquals0() {
        /* Branches:
         * (getLength(array) == 0) : false  #  inside isArrayEmpty method
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(doubleArray)).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.isEmpty(doubleArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b860c0f2-184b-3396-b06e-33253f3c12ab}
    @Test()
    void isEmpty4WhenGetLengthArrayEquals0() {
        /* Branches:
         * (getLength(array) == 0) : true  #  inside isArrayEmpty method
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(floatArray)).thenReturn(0);
            //Act Statement(s)
            boolean result = ArrayUtils.isEmpty(floatArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8dea8245-daa2-314f-b54f-4c6d74ae1d63}
    @Test()
    void isEmpty4WhenGetLengthArrayNotEquals0() {
        /* Branches:
         * (getLength(array) == 0) : false  #  inside isArrayEmpty method
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(floatArray)).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.isEmpty(floatArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7243972f-d969-33fc-8211-d55d5e5c6d60}
    @Test()
    void isEmpty5WhenGetLengthArrayEquals0() {
        /* Branches:
         * (getLength(array) == 0) : true  #  inside isArrayEmpty method
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(intArray)).thenReturn(0);
            //Act Statement(s)
            boolean result = ArrayUtils.isEmpty(intArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${955a9f1d-cf14-37a9-9c32-e5fa5cf0bd20}
    @Test()
    void isEmpty5WhenGetLengthArrayNotEquals0() {
        /* Branches:
         * (getLength(array) == 0) : false  #  inside isArrayEmpty method
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(intArray)).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.isEmpty(intArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0e330b7b-fd70-30d6-a1b5-cda61f93cc55}
    @Test()
    void isEmpty6WhenGetLengthArrayEquals0() {
        /* Branches:
         * (getLength(array) == 0) : true  #  inside isArrayEmpty method
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(longArray)).thenReturn(0);
            //Act Statement(s)
            boolean result = ArrayUtils.isEmpty(longArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(longArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2c0b94e5-3ddc-3570-af49-b6b6d5f186de}
    @Test()
    void isEmpty6WhenGetLengthArrayNotEquals0() {
        /* Branches:
         * (getLength(array) == 0) : false  #  inside isArrayEmpty method
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(longArray)).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.isEmpty(longArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(longArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1ea3e1ca-9454-3947-874d-bc24a64d5749}
    @Test()
    void isEmpty7WhenGetLengthArrayEquals0() {
        /* Branches:
         * (getLength(array) == 0) : true  #  inside isArrayEmpty method
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(objectArray)).thenReturn(0);
            //Act Statement(s)
            boolean result = ArrayUtils.isEmpty(objectArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${de47c4ea-9c9a-3a10-b5dc-8657275cd32f}
    @Test()
    void isEmpty7WhenGetLengthArrayNotEquals0() {
        /* Branches:
         * (getLength(array) == 0) : false  #  inside isArrayEmpty method
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(objectArray)).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.isEmpty(objectArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${14bb8a83-1c05-30eb-a6f4-d6e9843c98c7}
    @Test()
    void isEmpty8WhenGetLengthArrayEquals0() {
        /* Branches:
         * (getLength(array) == 0) : true  #  inside isArrayEmpty method
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(shortArray)).thenReturn(0);
            //Act Statement(s)
            boolean result = ArrayUtils.isEmpty(shortArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(shortArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${638a5be7-8b21-3721-958a-32b21d96fc10}
    @Test()
    void isEmpty8WhenGetLengthArrayNotEquals0() {
        /* Branches:
         * (getLength(array) == 0) : false  #  inside isArrayEmpty method
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(shortArray)).thenReturn(-1);
            //Act Statement(s)
            boolean result = ArrayUtils.isEmpty(shortArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(shortArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5c34015c-da39-31da-9759-3c8317f37be8}
    @Test()
    void isEqualsWhenNewEqualsBuilderAppendArray1Array2IsEquals() {
        /* Branches:
         * (new EqualsBuilder().append(array1, array2).isEquals()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();

        //Act Statement(s)
        boolean result = ArrayUtils.isEquals(object, object2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${b2256df7-866d-3afd-9357-286127d4c745}
    @Test()
    void isEqualsWhenNewEqualsBuilderAppendArray1Array2NotIsEquals() {
        /* Branches:
         * (new EqualsBuilder().append(array1, array2).isEquals()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();

        //Act Statement(s)
        boolean result = ArrayUtils.isEquals(object, object2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${36a7ce00-800f-3454-b36c-41f5e0043eb2}
    @Test()
    void isNotEmptyWhenIsEmptyNotArray() {
        /* Branches:
         * (!isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(false);
            //Act Statement(s)
            boolean result = ArrayUtils.isNotEmpty(booleanArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3b5a1577-2427-31ca-9bc8-c133b4da7316}
    @Test()
    void isNotEmptyWhenIsEmptyArray() {
        /* Branches:
         * (!isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(true);
            //Act Statement(s)
            boolean result = ArrayUtils.isNotEmpty(booleanArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0992cce1-b023-3582-9ee3-5742c04f35c8}
    @Test()
    void isNotEmpty1WhenIsEmptyNotArray() {
        /* Branches:
         * (!isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(byteArray)).thenReturn(false);
            //Act Statement(s)
            boolean result = ArrayUtils.isNotEmpty(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(byteArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${864676a7-c2f7-37f3-a142-aa9d1fb6ec96}
    @Test()
    void isNotEmpty1WhenIsEmptyArray() {
        /* Branches:
         * (!isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(byteArray)).thenReturn(true);
            //Act Statement(s)
            boolean result = ArrayUtils.isNotEmpty(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(byteArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8781d4fa-e2ae-3c15-9e14-cb24afa74e20}
    @Test()
    void isNotEmpty2WhenIsEmptyNotArray() {
        /* Branches:
         * (!isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(charArray)).thenReturn(false);
            //Act Statement(s)
            boolean result = ArrayUtils.isNotEmpty(charArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(charArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1295e9b7-cc2a-3808-a5f2-f37a2a05abde}
    @Test()
    void isNotEmpty2WhenIsEmptyArray() {
        /* Branches:
         * (!isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(charArray)).thenReturn(true);
            //Act Statement(s)
            boolean result = ArrayUtils.isNotEmpty(charArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(charArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${e9f02e62-b9fd-3e9f-8f49-f853bdc94670}
    @Test()
    void isNotEmpty3WhenIsEmptyNotArray() {
        /* Branches:
         * (!isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            //Act Statement(s)
            boolean result = ArrayUtils.isNotEmpty(doubleArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a1c400cc-1be4-3e6e-924e-f431d55adfae}
    @Test()
    void isNotEmpty3WhenIsEmptyArray() {
        /* Branches:
         * (!isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(true);
            //Act Statement(s)
            boolean result = ArrayUtils.isNotEmpty(doubleArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b010dce0-1216-3b1b-b1a6-4d5c658d8b8a}
    @Test()
    void isNotEmpty4WhenIsEmptyNotArray() {
        /* Branches:
         * (!isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(false);
            //Act Statement(s)
            boolean result = ArrayUtils.isNotEmpty(floatArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${77ed7898-f094-3113-a9cd-2e0fe22d082b}
    @Test()
    void isNotEmpty4WhenIsEmptyArray() {
        /* Branches:
         * (!isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(true);
            //Act Statement(s)
            boolean result = ArrayUtils.isNotEmpty(floatArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ebf8186c-b7fc-3d29-918a-1ea357c4a55f}
    @Test()
    void isNotEmpty5WhenIsEmptyNotArray() {
        /* Branches:
         * (!isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(intArray)).thenReturn(false);
            //Act Statement(s)
            boolean result = ArrayUtils.isNotEmpty(intArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0e460afd-8c3b-3eea-a392-6e57683e5207}
    @Test()
    void isNotEmpty5WhenIsEmptyArray() {
        /* Branches:
         * (!isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(intArray)).thenReturn(true);
            //Act Statement(s)
            boolean result = ArrayUtils.isNotEmpty(intArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1270a4ea-056a-3f81-9d69-37e67aaf3e61}
    @Test()
    void isNotEmpty6WhenIsEmptyNotArray() {
        /* Branches:
         * (!isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(longArray)).thenReturn(false);
            //Act Statement(s)
            boolean result = ArrayUtils.isNotEmpty(longArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(longArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2158e76e-9372-3457-8aa9-7ec701fb69be}
    @Test()
    void isNotEmpty6WhenIsEmptyArray() {
        /* Branches:
         * (!isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(longArray)).thenReturn(true);
            //Act Statement(s)
            boolean result = ArrayUtils.isNotEmpty(longArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(longArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${473f6bd4-072b-3640-90a8-925e90ce8f29}
    @Test()
    void isNotEmpty7WhenIsEmptyNotArray() {
        /* Branches:
         * (!isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(shortArray)).thenReturn(false);
            //Act Statement(s)
            boolean result = ArrayUtils.isNotEmpty(shortArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(shortArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d02f226e-92ac-38e0-ae5d-f19cf53badf0}
    @Test()
    void isNotEmpty7WhenIsEmptyArray() {
        /* Branches:
         * (!isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(shortArray)).thenReturn(true);
            //Act Statement(s)
            boolean result = ArrayUtils.isNotEmpty(shortArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(shortArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${750a4421-4731-310f-b1e1-7392bb606e72}
    @Test()
    void isNotEmpty8WhenIsEmptyNotArray() {
        /* Branches:
         * (!isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(objectArray)).thenReturn(false);
            //Act Statement(s)
            boolean result = ArrayUtils.isNotEmpty(objectArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cf5196a0-4808-3e04-9a14-761c7b242390}
    @Test()
    void isNotEmpty8WhenIsEmptyArray() {
        /* Branches:
         * (!isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(objectArray)).thenReturn(true);
            //Act Statement(s)
            boolean result = ArrayUtils.isNotEmpty(objectArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6067c270-13b0-387f-a43b-fb27099195ae}
    @Test()
    void isSameLengthWhenGetLengthArray1EqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(booleanArray)).thenReturn(1);
            boolean[] booleanArray2 = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(booleanArray2)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(booleanArray, booleanArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(booleanArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(booleanArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${aae507b1-6090-369d-bdee-d1dccce8895f}
    @Test()
    void isSameLengthWhenGetLengthArray1NotEqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(booleanArray)).thenReturn(1);
            boolean[] booleanArray2 = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(booleanArray2)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(booleanArray, booleanArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(booleanArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(booleanArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${78a7cb85-eae1-3f41-ac8e-1bfa6dd59d5f}
    @Test()
    void isSameLength1WhenGetLengthArray1EqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(byteArray)).thenReturn(1);
            byte[] byteArray2 = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(byteArray2)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(byteArray, byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(byteArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(byteArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7fdee1b9-13d2-39d2-9dd1-acf59b5495b0}
    @Test()
    void isSameLength1WhenGetLengthArray1NotEqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(byteArray)).thenReturn(1);
            byte[] byteArray2 = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(byteArray2)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(byteArray, byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(byteArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(byteArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c43d2874-b530-397d-807a-d5f9cc62f002}
    @Test()
    void isSameLength2WhenGetLengthArray1EqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(charArray)).thenReturn(1);
            char[] charArray2 = new char[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(charArray2)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(charArray, charArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(charArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(charArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${34bb9f6e-c5ad-3e1d-aedd-9d1173bebcbd}
    @Test()
    void isSameLength2WhenGetLengthArray1NotEqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(charArray)).thenReturn(1);
            char[] charArray2 = new char[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(charArray2)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(charArray, charArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(charArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(charArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${60fce323-95ef-3ac2-95b5-7e55a767cca4}
    @Test()
    void isSameLength3WhenGetLengthArray1EqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(doubleArray)).thenReturn(1);
            double[] doubleArray2 = new double[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(doubleArray2)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(doubleArray, doubleArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(doubleArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(doubleArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4186b436-3eea-3ffa-ba07-fe671fff5b7f}
    @Test()
    void isSameLength3WhenGetLengthArray1NotEqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(doubleArray)).thenReturn(1);
            double[] doubleArray2 = new double[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(doubleArray2)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(doubleArray, doubleArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(doubleArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(doubleArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d2434333-7185-35e7-9897-306ae0a3bb26}
    @Test()
    void isSameLength4WhenGetLengthArray1EqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(floatArray)).thenReturn(1);
            float[] floatArray2 = new float[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(floatArray2)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(floatArray, floatArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(floatArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(floatArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ddb879fe-8ef9-32e6-9119-c096e8c2065e}
    @Test()
    void isSameLength4WhenGetLengthArray1NotEqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(floatArray)).thenReturn(1);
            float[] floatArray2 = new float[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(floatArray2)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(floatArray, floatArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(floatArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(floatArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a101b521-f498-3630-bd00-366dab903087}
    @Test()
    void isSameLength5WhenGetLengthArray1EqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(intArray)).thenReturn(1);
            int[] intArray2 = new int[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(intArray2)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(intArray, intArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(intArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(intArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${26dc1e8a-20bb-314f-93b0-2691b2980671}
    @Test()
    void isSameLength5WhenGetLengthArray1NotEqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(intArray)).thenReturn(1);
            int[] intArray2 = new int[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(intArray2)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(intArray, intArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(intArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(intArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ef338c53-3dee-3258-ad06-33f5e423caac}
    @Test()
    void isSameLength6WhenGetLengthArray1EqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(longArray)).thenReturn(1);
            long[] longArray2 = new long[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(longArray2)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(longArray, longArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(longArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(longArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${aeab95d2-ce66-3765-86fb-cd01c4e5a413}
    @Test()
    void isSameLength6WhenGetLengthArray1NotEqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(longArray)).thenReturn(1);
            long[] longArray2 = new long[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(longArray2)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(longArray, longArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(longArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(longArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0efd5b9f-508f-3811-b6a2-debe90563315}
    @Test()
    void isSameLength7WhenGetLengthArray1EqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            arrayUtils.when(() -> ArrayUtils.getLength(object)).thenReturn(1);
            Object object2 = new Object();
            arrayUtils.when(() -> ArrayUtils.getLength(object2)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(object, object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(object), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(object2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${11396b09-8cf8-3ae1-bdfc-b26f5b8e15f2}
    @Test()
    void isSameLength7WhenGetLengthArray1NotEqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            arrayUtils.when(() -> ArrayUtils.getLength(object)).thenReturn(1);
            Object object2 = new Object();
            arrayUtils.when(() -> ArrayUtils.getLength(object2)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(object, object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(object), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(object2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${e487bc96-6211-3feb-b44c-3d4700fa3ac9}
    @Test()
    void isSameLength8WhenGetLengthArray1EqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(objectArray)).thenReturn(1);
            Object[] objectArray2 = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(objectArray2)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(objectArray, objectArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(objectArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(objectArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${43b908ed-a1d6-3bbe-ba03-3e7620af9e03}
    @Test()
    void isSameLength8WhenGetLengthArray1NotEqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(objectArray)).thenReturn(1);
            Object[] objectArray2 = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(objectArray2)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(objectArray, objectArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(objectArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(objectArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${eb65eaf5-0230-3fa8-8d49-c27e0663933f}
    @Test()
    void isSameLength9WhenGetLengthArray1EqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(shortArray)).thenReturn(1);
            short[] shortArray2 = new short[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(shortArray2)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(shortArray, shortArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(shortArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(shortArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a0b1403b-ff70-3e1b-a090-7ba3762de25e}
    @Test()
    void isSameLength9WhenGetLengthArray1NotEqualsGetLengthArray2() {
        /* Branches:
         * (getLength(array1) == getLength(array2)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(shortArray)).thenReturn(1);
            short[] shortArray2 = new short[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(shortArray2)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSameLength(shortArray, shortArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(shortArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.getLength(shortArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${50c36cf4-a0ff-38d9-98ab-10488f5f0981}
    @Test()
    void isSameTypeWhenArray2IsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = null;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The Array must not be null");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            ArrayUtils.isSameType(object, object2);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${7b94fc1a-6e54-345f-9ae7-84c45934d0fe}
    @Test()
    void isSameTypeWhenArray1GetClassGetNameEqualsArray2GetClassGetName() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : false
         * (array1.getClass().getName().equals(array2.getClass().getName())) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();

        //Act Statement(s)
        boolean result = ArrayUtils.isSameType(object, object2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${56e8c0bf-0ed6-31c1-b2a9-e4fcdaf00d74}
    @Test()
    void isSameTypeWhenArray1GetClassGetNameNotEqualsArray2GetClassGetName() {
        /* Branches:
         * (array1 == null) : false
         * (array2 == null) : false
         * (array1.getClass().getName().equals(array2.getClass().getName())) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();

        //Act Statement(s)
        boolean result = ArrayUtils.isSameType(object, object2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${e72b20cb-9d4b-3abf-b841-d96f145893a7}
    @Test()
    void isSortedWhenGetLengthArrayLessThan2() {
        /* Branches:
         * (getLength(array) < 2) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(booleanArray)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(booleanArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8d211ccc-5aea-3c8b-b264-c09fc778a2c7}
    @Test()
    void isSortedWhenBooleanUtilsComparePreviousCurrentGreaterThan0() {
        /* Branches:
         * (getLength(array) < 2) : false
         * (i < n) : true
         * (BooleanUtils.compare(previous, current) > 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{true, false};
            arrayUtils.when(() -> ArrayUtils.getLength(booleanArray)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(booleanArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${79690a66-fe2e-3c8f-89de-d49b4e92e8c7}
    @Test()
    void isSortedWhenBooleanUtilsComparePreviousCurrentNotGreaterThan0() {
        /* Branches:
         * (getLength(array) < 2) : false
         * (i < n) : true
         * (BooleanUtils.compare(previous, current) > 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{false, false};
            arrayUtils.when(() -> ArrayUtils.getLength(booleanArray)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(booleanArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${32c2b8c5-3e83-316c-a8a3-594ca6c4f524}
    @Test()
    void isSorted1WhenGetLengthArrayLessThan2() {
        /* Branches:
         * (getLength(array) < 2) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(byteArray)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(byteArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5bb7797f-47f7-3778-918e-33c2f9250be1}
    @Test()
    void isSorted1WhenNumberUtilsComparePreviousCurrentGreaterThan0() {
        /* Branches:
         * (getLength(array) < 2) : false
         * (i < n) : true
         * (NumberUtils.compare(previous, current) > 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 5, (byte) 4, (byte) 3, (byte) 2, (byte) 1};
            arrayUtils.when(() -> ArrayUtils.getLength(byteArray)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(byteArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c4ab5180-b2a8-3b4d-b71d-d61f1484bee8}
    @Test()
    void isSorted1WhenNumberUtilsComparePreviousCurrentNotGreaterThan0() {
        /* Branches:
         * (getLength(array) < 2) : false
         * (i < n) : true
         * (NumberUtils.compare(previous, current) > 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 0, (byte) 0};
            arrayUtils.when(() -> ArrayUtils.getLength(byteArray)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(byteArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6322f4f3-57ae-3b29-aed3-297533bdd7a3}
    @Test()
    void isSorted2WhenGetLengthArrayLessThan2() {
        /* Branches:
         * (getLength(array) < 2) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(charArray)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(charArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(charArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${29c74219-670c-3ab5-a29f-53b5d4fc7f6c}
    @Test()
    void isSorted2WhenCharUtilsComparePreviousCurrentGreaterThan0() {
        /* Branches:
         * (getLength(array) < 2) : false
         * (i < n) : true
         * (CharUtils.compare(previous, current) > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(charArray)).thenReturn(0);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(charArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(charArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fe66f302-8c13-376f-944f-f42441e465ba}
    @Test()
    void isSorted2WhenCharUtilsComparePreviousCurrentNotGreaterThan0() {
        /* Branches:
         * (getLength(array) < 2) : false
         * (i < n) : true
         * (CharUtils.compare(previous, current) > 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{'A', 'A'};
            arrayUtils.when(() -> ArrayUtils.getLength(charArray)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(charArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(charArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${101003cf-9074-34c3-ac04-4ee9ed121dd9}
    @Test()
    void isSorted3WhenGetLengthArrayLessThan2() {
        /* Branches:
         * (getLength(array) < 2) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(doubleArray)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(doubleArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5de3e718-4b37-31f5-915f-6613ef90f1cb}
    @Test()
    void isSorted3WhenDoubleComparePreviousCurrentGreaterThan0() {
        /* Branches:
         * (getLength(array) < 2) : false
         * (i < n) : true
         * (Double.compare(previous, current) > 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{Double.parseDouble("0.5"), Double.parseDouble("0.25")};
            arrayUtils.when(() -> ArrayUtils.getLength(doubleArray)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(doubleArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b82b80d4-1109-3024-a992-48fb3f7f24cb}
    @Test()
    void isSorted3WhenDoubleComparePreviousCurrentNotGreaterThan0() {
        /* Branches:
         * (getLength(array) < 2) : false
         * (i < n) : true
         * (Double.compare(previous, current) > 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{Double.parseDouble("0.5"), Double.parseDouble("0.5")};
            arrayUtils.when(() -> ArrayUtils.getLength(doubleArray)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(doubleArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0562e245-08a8-3637-84f6-f1988d301dba}
    @Test()
    void isSorted4WhenGetLengthArrayLessThan2() {
        /* Branches:
         * (getLength(array) < 2) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(floatArray)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(floatArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cd29cfed-06fb-3c0e-9186-01f157b3a816}
    @Test()
    void isSorted4WhenFloatComparePreviousCurrentGreaterThan0() {
        /* Branches:
         * (getLength(array) < 2) : false
         * (i < n) : true
         * (Float.compare(previous, current) > 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{Float.parseFloat("0.5"), Float.parseFloat("0.25")};
            arrayUtils.when(() -> ArrayUtils.getLength(floatArray)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(floatArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${11fca81d-f673-3f16-be52-80fa2e4bdb3b}
    @Test()
    void isSorted4WhenFloatComparePreviousCurrentNotGreaterThan0() {
        /* Branches:
         * (getLength(array) < 2) : false
         * (i < n) : true
         * (Float.compare(previous, current) > 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{Float.parseFloat("0.5"), Float.parseFloat("0.5")};
            arrayUtils.when(() -> ArrayUtils.getLength(floatArray)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(floatArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0664982a-922c-3037-a1b7-462c292d9386}
    @Test()
    void isSorted5WhenGetLengthArrayLessThan2() {
        /* Branches:
         * (getLength(array) < 2) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(intArray)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(intArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${e049c04d-4dd1-3809-a4ed-869a8264097a}
    @Test()
    void isSorted5WhenNumberUtilsComparePreviousCurrentGreaterThan0() {
        /* Branches:
         * (getLength(array) < 2) : false
         * (i < n) : true
         * (NumberUtils.compare(previous, current) > 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{5, 4, 3, 2, 1};
            arrayUtils.when(() -> ArrayUtils.getLength(intArray)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(intArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ebd08984-c9f4-3840-aa70-4bce67e2e423}
    @Test()
    void isSorted5WhenNumberUtilsComparePreviousCurrentNotGreaterThan0() {
        /* Branches:
         * (getLength(array) < 2) : false
         * (i < n) : true
         * (NumberUtils.compare(previous, current) > 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{0, 0};
            arrayUtils.when(() -> ArrayUtils.getLength(intArray)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(intArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${48d537f0-d478-34d4-9793-926dce096362}
    @Test()
    void isSorted6WhenGetLengthArrayLessThan2() {
        /* Branches:
         * (getLength(array) < 2) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(longArray)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(longArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(longArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${33484e2c-856c-3939-b911-61bbe6a03e13}
    @Test()
    void isSorted6WhenNumberUtilsComparePreviousCurrentGreaterThan0() {
        /* Branches:
         * (getLength(array) < 2) : false
         * (i < n) : true
         * (NumberUtils.compare(previous, current) > 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{10L, 5L, 3L, 2L, 1L};
            arrayUtils.when(() -> ArrayUtils.getLength(longArray)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(longArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(longArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3f6c32f2-0370-3a03-b7a5-483f70034ef1}
    @Test()
    void isSorted6WhenNumberUtilsComparePreviousCurrentNotGreaterThan0() {
        /* Branches:
         * (getLength(array) < 2) : false
         * (i < n) : true
         * (NumberUtils.compare(previous, current) > 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{0L, 0L};
            arrayUtils.when(() -> ArrayUtils.getLength(longArray)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(longArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(longArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f0a1bae2-6969-3a44-9059-dc8b68b978ab}
    @Test()
    void isSorted7WhenGetLengthArrayLessThan2() {
        /* Branches:
         * (getLength(array) < 2) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(shortArray)).thenReturn(1);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(shortArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(shortArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2d56697a-0ea8-3966-bf2c-5196e98f1c3d}
    @Test()
    void isSorted7WhenNumberUtilsComparePreviousCurrentGreaterThan0() {
        /* Branches:
         * (getLength(array) < 2) : false
         * (i < n) : true
         * (NumberUtils.compare(previous, current) > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{(short) 1, (short) 1};
            arrayUtils.when(() -> ArrayUtils.getLength(shortArray)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(shortArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(shortArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${acfff881-91e9-37fa-b748-1750aee72e96}
    @Test()
    void isSorted7WhenNumberUtilsComparePreviousCurrentNotGreaterThan0() {
        /* Branches:
         * (getLength(array) < 2) : false
         * (i < n) : true
         * (NumberUtils.compare(previous, current) > 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{(short) 0, (short) 0};
            arrayUtils.when(() -> ArrayUtils.getLength(shortArray)).thenReturn(2);
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(shortArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(shortArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4ca22743-28d4-3f13-bf89-bb093162d8ee}
    @Test()
    void isSorted9WhenGetLengthArrayLessThan2() {
        /* Branches:
         * (getLength(array) < 2) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.getLength(objectArray)).thenReturn(1);
            Comparator<Object> comparator = Comparator.reverseOrder();
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(objectArray, comparator);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${20943c38-4d95-327c-9c5a-5a3b7a85ff26}
    @Test()
    void isSorted9WhenComparatorComparePreviousCurrentGreaterThan0() {
        /* Branches:
         * (getLength(array) < 2) : false
         * (i < n) : true
         * (comparator.compare(previous, current) > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            Object[] objectArray = new Object[]{object, object2};
            arrayUtils.when(() -> ArrayUtils.getLength(objectArray)).thenReturn(2);
            Comparator<Object> comparator = Comparator.reverseOrder();
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(objectArray, comparator);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                arrayUtils.verify(() -> ArrayUtils.getLength(objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a79dc416-3ac0-323e-87ca-f8a57c7e029e}
    @Test()
    void isSorted9WhenComparatorComparePreviousCurrentNotGreaterThan0() {
        /* Branches:
         * (getLength(array) < 2) : false
         * (i < n) : true
         * (comparator.compare(previous, current) > 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            Object[] objectArray = new Object[]{object, object2};
            arrayUtils.when(() -> ArrayUtils.getLength(objectArray)).thenReturn(2);
            Comparator<Object> comparator = Comparator.reverseOrder();
            //Act Statement(s)
            boolean result = ArrayUtils.isSorted(objectArray, comparator);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                arrayUtils.verify(() -> ArrayUtils.getLength(objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${efab3034-42a5-3017-b154-cb7b06611b89}
    @Test()
    void lastIndexOfTest() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.lastIndexOf(booleanArray, false, 2147483647)).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(booleanArray, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.lastIndexOf(booleanArray, false, 2147483647), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ff83ad45-4ba8-3357-a3e0-a9ae5779faf9}
    @Test()
    void lastIndexOf1WhenStartIndexLessThan0() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(booleanArray, false, -2147483648);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5a721a00-0a88-3d01-9a88-a2571d1548e6}
    @Test()
    void lastIndexOf1WhenValueToFindEqualsIIndexOfArray() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : false
         * (startIndex >= array.length) : true
         * (i >= 0) : true
         * (valueToFind == array[i]) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{false};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(booleanArray, false, 1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d28b11ea-d03f-380c-a367-0d61d6616b10}
    @Test()
    void lastIndexOf1WhenValueToFindNotEqualsIIndexOfArray() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : false
         * (startIndex >= array.length) : true
         * (i >= 0) : true
         * (valueToFind == array[i]) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{false};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(booleanArray, true, 1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4652643a-e277-3923-8bfb-68826a615196}
    @Test()
    void lastIndexOf2Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.lastIndexOf(byteArray, (byte) 0, 2147483647)).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(byteArray, (byte) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.lastIndexOf(byteArray, (byte) 0, 2147483647), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${02cd009a-d9e1-3cf6-884e-7b98994052ed}
    @Test()
    void lastIndexOf3WhenStartIndexLessThan0() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        int result = ArrayUtils.lastIndexOf(byteArray, (byte) 0, -2147483648);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${98457995-4d69-3173-9c7b-f1b13e2d17bd}
    @Test()
    void lastIndexOf3WhenValueToFindEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : false
         * (startIndex >= array.length) : true
         * (i >= 0) : true
         * (valueToFind == array[i]) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1};

        //Act Statement(s)
        int result = ArrayUtils.lastIndexOf(byteArray, (byte) 1, 1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${f6a78e30-d7dc-39f8-8531-95c8d0bf0b4d}
    @Test()
    void lastIndexOf3WhenValueToFindNotEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : false
         * (startIndex >= array.length) : true
         * (i >= 0) : true
         * (valueToFind == array[i]) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 2};

        //Act Statement(s)
        int result = ArrayUtils.lastIndexOf(byteArray, (byte) 1, 1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${5a52b39f-5818-33fe-bfe1-3f562347cd26}
    @Test()
    void lastIndexOf4Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.lastIndexOf(charArray, 'A', 2147483647)).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(charArray, 'A');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.lastIndexOf(charArray, 'A', 2147483647), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${49b6f656-e361-3e49-8a0d-285e73e313e6}
    @Test()
    void lastIndexOf5WhenStartIndexLessThan0() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         */
        //Arrange Statement(s)
        char[] charArray = new char[]{};

        //Act Statement(s)
        int result = ArrayUtils.lastIndexOf(charArray, 'A', -2147483648);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${7b360b7a-57a7-333e-8cc7-81ec5aca8f28}
    @Test()
    void lastIndexOf5WhenValueToFindEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : false
         * (startIndex >= array.length) : true
         * (i >= 0) : true
         * (valueToFind == array[i]) : true
         */
        //Arrange Statement(s)
        char[] charArray = new char[]{'A'};

        //Act Statement(s)
        int result = ArrayUtils.lastIndexOf(charArray, 'A', 1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${177398b8-05d7-32e5-a392-b7f31434fa65}
    @Test()
    void lastIndexOf5WhenValueToFindNotEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : false
         * (startIndex >= array.length) : true
         * (i >= 0) : true
         * (valueToFind == array[i]) : false
         */
        //Arrange Statement(s)
        char[] charArray = new char[]{'B'};

        //Act Statement(s)
        int result = ArrayUtils.lastIndexOf(charArray, 'A', 1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${d3437a4b-98d1-368b-9c4b-104de818faa3}
    @Test()
    void lastIndexOf6Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.lastIndexOf(doubleArray, Double.parseDouble("0.0"), 2147483647)).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(doubleArray, Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.lastIndexOf(doubleArray, Double.parseDouble("0.0"), 2147483647), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${86e9805b-4e1d-34b2-be47-5f57bf1a381f}
    @Test()
    void lastIndexOf7Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.lastIndexOf(doubleArray, Double.parseDouble("0.0"), 2147483647, Double.parseDouble("0.0"))).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(doubleArray, Double.parseDouble("0.0"), Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.lastIndexOf(doubleArray, Double.parseDouble("0.0"), 2147483647, Double.parseDouble("0.0")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${56a7a46b-38dd-39e2-89bb-d2e3e32e249c}
    @Test()
    void lastIndexOf8WhenStartIndexLessThan0() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(doubleArray, Double.parseDouble("0.0"), -2147483648);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8fd54fca-72b3-32d5-b603-3fe155f658be}
    @Test()
    void lastIndexOf8WhenValueToFindEqualsIIndexOfArray() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : false
         * (startIndex >= array.length) : true
         * (i >= 0) : true
         * (valueToFind == array[i]) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{Double.parseDouble("0.0")};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(doubleArray, Double.parseDouble("0.0"), 1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1454b55e-6104-3dc5-965c-da96a070f08f}
    @Test()
    void lastIndexOf8WhenValueToFindNotEqualsIIndexOfArray() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : false
         * (startIndex >= array.length) : true
         * (i >= 0) : true
         * (valueToFind == array[i]) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{Double.parseDouble("0.25")};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(doubleArray, Double.parseDouble("0.5"), 1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4a39afd9-7e91-3083-9518-e5421eae4c69}
    @Test()
    void lastIndexOf9WhenStartIndexLessThan0() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(doubleArray, Double.parseDouble("0.0"), -2147483648, Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2f6d7066-0aa4-3b7f-911a-396cdc918e46}
    @Test()
    void lastIndexOf9WhenIIndexOfArrayLessThanOrEqualsToMax() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : false
         * (startIndex >= array.length) : true
         * (i >= 0) : true
         * (array[i] >= min) : true
         * (array[i] <= max) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{Double.parseDouble("0.25")};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(doubleArray, Double.parseDouble("0.25"), 1, Double.parseDouble("0.25"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ea07b111-f551-3863-9473-b4c5c9ad81a5}
    @Test()
    void lastIndexOf9WhenIIndexOfArrayGreaterThanMax() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : false
         * (startIndex >= array.length) : true
         * (i >= 0) : true
         * (array[i] >= min) : true
         * (array[i] <= max) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{Double.parseDouble("0.25")};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(doubleArray, Double.parseDouble("0.0"), 1, Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${99afffcd-26cc-3b2c-8a1a-f453158ba04c}
    @Test()
    void lastIndexOf10Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.lastIndexOf(floatArray, Float.parseFloat("0.0"), 2147483647)).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(floatArray, Float.parseFloat("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.lastIndexOf(floatArray, Float.parseFloat("0.0"), 2147483647), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c3b7ed57-be87-3050-b8d1-81c16518361f}
    @Test()
    void lastIndexOf11WhenStartIndexLessThan0() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(floatArray, Float.parseFloat("0.0"), -2147483648);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f3bddda0-4501-3df7-bef9-6ec2fd7a392a}
    @Test()
    void lastIndexOf11WhenValueToFindEqualsIIndexOfArray() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : false
         * (startIndex >= array.length) : true
         * (i >= 0) : true
         * (valueToFind == array[i]) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{Float.parseFloat("0.0")};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(floatArray, Float.parseFloat("0.0"), 1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d6531ee4-b042-384a-af3b-f26f6bfb107f}
    @Test()
    void lastIndexOf11WhenValueToFindNotEqualsIIndexOfArray() {
        /* Branches:
         * (isEmpty(array)) : false
         * (startIndex < 0) : false
         * (startIndex >= array.length) : true
         * (i >= 0) : true
         * (valueToFind == array[i]) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{Float.parseFloat("0.5")};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(false);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(floatArray, Float.parseFloat("0.25"), 1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d24538e1-1284-34df-9c53-f0c34136a925}
    @Test()
    void lastIndexOf12Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.lastIndexOf(intArray, 0, 2147483647)).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(intArray, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.lastIndexOf(intArray, 0, 2147483647), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5a0ccb13-eb9e-3f75-85b3-1ba71acbf633}
    @Test()
    void lastIndexOf13WhenStartIndexLessThan0() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         */
        //Arrange Statement(s)
        int[] intArray = new int[]{};

        //Act Statement(s)
        int result = ArrayUtils.lastIndexOf(intArray, 0, -2147483648);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${32424e05-45ba-3187-8e2f-003e1f614404}
    @Test()
    void lastIndexOf13WhenValueToFindEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : false
         * (startIndex >= array.length) : true
         * (i >= 0) : true
         * (valueToFind == array[i]) : true
         */
        //Arrange Statement(s)
        int[] intArray = new int[]{1};

        //Act Statement(s)
        int result = ArrayUtils.lastIndexOf(intArray, 1, 1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${41de17ed-e2bd-3bfd-b0a7-05a0eda05beb}
    @Test()
    void lastIndexOf13WhenValueToFindNotEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : false
         * (startIndex >= array.length) : true
         * (i >= 0) : true
         * (valueToFind == array[i]) : false
         */
        //Arrange Statement(s)
        int[] intArray = new int[]{2};

        //Act Statement(s)
        int result = ArrayUtils.lastIndexOf(intArray, 1, 1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${ba811c97-5ef1-3b35-9b25-3c64d08b5b3c}
    @Test()
    void lastIndexOf14Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.lastIndexOf(longArray, 0L, 2147483647)).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(longArray, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.lastIndexOf(longArray, 0L, 2147483647), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${317a2830-da25-3626-8552-2e5dd512e85a}
    @Test()
    void lastIndexOf15WhenStartIndexLessThan0() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         */
        //Arrange Statement(s)
        long[] longArray = new long[]{};

        //Act Statement(s)
        int result = ArrayUtils.lastIndexOf(longArray, 0L, -2147483648);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${4fa7703e-604b-3094-9ce8-abe8d8b5d01f}
    @Test()
    void lastIndexOf15WhenValueToFindEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : false
         * (startIndex >= array.length) : true
         * (i >= 0) : true
         * (valueToFind == array[i]) : true
         */
        //Arrange Statement(s)
        long[] longArray = new long[]{1L};

        //Act Statement(s)
        int result = ArrayUtils.lastIndexOf(longArray, 1L, 1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${e4192b4c-5d57-37d8-8bc6-6a38d690db45}
    @Test()
    void lastIndexOf15WhenValueToFindNotEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : false
         * (startIndex >= array.length) : true
         * (i >= 0) : true
         * (valueToFind == array[i]) : false
         */
        //Arrange Statement(s)
        long[] longArray = new long[]{1L};

        //Act Statement(s)
        int result = ArrayUtils.lastIndexOf(longArray, 2L, 1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${7254c9e7-5369-3d78-9ccf-2a08411d6852}
    @Test()
    void lastIndexOf16Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            Object object = new Object();
            arrayUtils.when(() -> ArrayUtils.lastIndexOf(objectArray, object, 2147483647)).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(objectArray, object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.lastIndexOf(objectArray, object, 2147483647), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${254efe7f-8387-325b-879d-5db57bcba495}
    @Test()
    void lastIndexOf18Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.lastIndexOf(shortArray, (short) 0, 2147483647)).thenReturn(0);
            //Act Statement(s)
            int result = ArrayUtils.lastIndexOf(shortArray, (short) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                arrayUtils.verify(() -> ArrayUtils.lastIndexOf(shortArray, (short) 0, 2147483647), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fbb5c163-cdd0-3569-a3e0-a9efb885d1e7}
    @Test()
    void lastIndexOf19WhenStartIndexLessThan0() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : true
         */
        //Arrange Statement(s)
        short[] shortArray = new short[]{};

        //Act Statement(s)
        int result = ArrayUtils.lastIndexOf(shortArray, (short) 0, -2147483648);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${3fae1366-7f76-3166-b657-9eb4647b4511}
    @Test()
    void lastIndexOf19WhenValueToFindEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : false
         * (startIndex >= array.length) : true
         * (i >= 0) : true
         * (valueToFind == array[i]) : true
         */
        //Arrange Statement(s)
        short[] shortArray = new short[]{(short) 1};

        //Act Statement(s)
        int result = ArrayUtils.lastIndexOf(shortArray, (short) 1, 1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${2cd1ff15-4104-328d-9494-1f683016bcee}
    @Test()
    void lastIndexOf19WhenValueToFindNotEqualsIIndexOfArray() {
        /* Branches:
         * (array == null) : false
         * (startIndex < 0) : false
         * (startIndex >= array.length) : true
         * (i >= 0) : true
         * (valueToFind == array[i]) : false
         */
        //Arrange Statement(s)
        short[] shortArray = new short[]{(short) 2};

        //Act Statement(s)
        int result = ArrayUtils.lastIndexOf(shortArray, (short) 1, 1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${75669a03-9f81-34fa-9649-cc4250cff465}
    @Test()
    void newInstanceTest() {

        //Act Statement(s)
        Object[] result = ArrayUtils.newInstance(Object.class, 0);
        Object object = Array.newInstance(Object.class, 0);

        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${208d5c40-3d8e-3cc3-a983-a3bce099a349}
    @Test()
    void nullToEmptyWhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(true);
            //Act Statement(s)
            boolean[] result = ArrayUtils.nullToEmpty(booleanArray);
            boolean[] booleanResultArray = new boolean[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cbc2cbe8-b6ef-3809-acd3-63ea08d5e0b8}
    @Test()
    void nullToEmptyWhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(false);
            //Act Statement(s)
            boolean[] result = ArrayUtils.nullToEmpty(booleanArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cce3def6-7af0-3658-ade4-4d08aae4f814}
    @Test()
    void nullToEmpty1WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Boolean[] booleanArray = new Boolean[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(true);
            //Act Statement(s)
            Boolean[] result = ArrayUtils.nullToEmpty(booleanArray);
            Boolean[] booleanResultArray = new Boolean[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0d415bb8-ca01-3a1c-a331-883085be6fa3}
    @Test()
    void nullToEmpty1WhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Boolean[] booleanArray = new Boolean[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(false);
            //Act Statement(s)
            Boolean[] result = ArrayUtils.nullToEmpty(booleanArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3b433021-767e-3653-a20f-5f071269ccf6}
    @Test()
    void nullToEmpty2WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(byteArray)).thenReturn(true);
            //Act Statement(s)
            byte[] result = ArrayUtils.nullToEmpty(byteArray);
            byte[] byteResultArray = new byte[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(byteArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${490bb6d0-a417-3818-933c-2c6126aafeaa}
    @Test()
    void nullToEmpty2WhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(byteArray)).thenReturn(false);
            //Act Statement(s)
            byte[] result = ArrayUtils.nullToEmpty(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(byteArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d85c9e84-ce89-3796-99d4-cbf4cdc285ca}
    @Test()
    void nullToEmpty3WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Byte[] byteArray = new Byte[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(byteArray)).thenReturn(true);
            //Act Statement(s)
            Byte[] result = ArrayUtils.nullToEmpty(byteArray);
            Byte[] byteResultArray = new Byte[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(byteArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${38580bfa-a02a-3d5c-bd8b-789c8160a0b7}
    @Test()
    void nullToEmpty3WhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Byte[] byteArray = new Byte[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(byteArray)).thenReturn(false);
            //Act Statement(s)
            Byte[] result = ArrayUtils.nullToEmpty(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(byteArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5a0451a9-96a6-30a2-b459-ae1c7f496024}
    @Test()
    void nullToEmpty4WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(charArray)).thenReturn(true);
            //Act Statement(s)
            char[] result = ArrayUtils.nullToEmpty(charArray);
            char[] charResultArray = new char[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(charArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${712c2e22-514b-315f-aeb0-db5054fa1e21}
    @Test()
    void nullToEmpty4WhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(charArray)).thenReturn(false);
            //Act Statement(s)
            char[] result = ArrayUtils.nullToEmpty(charArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(charArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${92ca0852-ffac-3d5e-8278-f3355dbfc047}
    @Test()
    void nullToEmpty5WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Character[] characterArray = new Character[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(characterArray)).thenReturn(true);
            //Act Statement(s)
            Character[] result = ArrayUtils.nullToEmpty(characterArray);
            Character[] characterResultArray = new Character[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(characterResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(characterArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cb5c22bf-a579-30b8-ad9d-8b8d03f48eb0}
    @Test()
    void nullToEmpty5WhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Character[] characterArray = new Character[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(characterArray)).thenReturn(false);
            //Act Statement(s)
            Character[] result = ArrayUtils.nullToEmpty(characterArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(characterArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(characterArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3f9165bd-3655-3854-91e0-a4fc4b7688b3}
    @Test()
    void nullToEmpty6WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(classArray)).thenReturn(true);
            //Act Statement(s)
            Class<?>[] result = ArrayUtils.nullToEmpty(classArray);
            Class<?>[] classResultArray = new Class[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(classResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a4a89978-24ee-3c94-85e9-7a56a0f6b406}
    @Test()
    void nullToEmpty6WhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(classArray)).thenReturn(false);
            //Act Statement(s)
            Class<?>[] result = ArrayUtils.nullToEmpty(classArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(classArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${11778d33-4526-348b-ab90-b8e08460aece}
    @Test()
    void nullToEmpty7WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(true);
            //Act Statement(s)
            double[] result = ArrayUtils.nullToEmpty(doubleArray);
            double[] doubleResultArray = new double[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c64f92bb-db2e-3444-8e52-b9b7c1741399}
    @Test()
    void nullToEmpty7WhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            //Act Statement(s)
            double[] result = ArrayUtils.nullToEmpty(doubleArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7e48ecf3-6281-3c26-b13d-039677135005}
    @Test()
    void nullToEmpty8WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Double[] doubleArray = new Double[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(true);
            //Act Statement(s)
            Double[] result = ArrayUtils.nullToEmpty(doubleArray);
            Double[] doubleResultArray = new Double[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${641bc863-7fa5-3255-b9bd-d5c04788b9bc}
    @Test()
    void nullToEmpty8WhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Double[] doubleArray = new Double[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            //Act Statement(s)
            Double[] result = ArrayUtils.nullToEmpty(doubleArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${95553d73-2262-362c-ab92-1cc6bb31e7e7}
    @Test()
    void nullToEmpty9WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(true);
            //Act Statement(s)
            float[] result = ArrayUtils.nullToEmpty(floatArray);
            float[] floatResultArray = new float[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ec388cc4-781a-3d9a-b1aa-7efb07e6a637}
    @Test()
    void nullToEmpty9WhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(false);
            //Act Statement(s)
            float[] result = ArrayUtils.nullToEmpty(floatArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2fee8afb-28d9-34fe-b47c-4d1cd9e7a1c7}
    @Test()
    void nullToEmpty10WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Float[] floatArray = new Float[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(true);
            //Act Statement(s)
            Float[] result = ArrayUtils.nullToEmpty(floatArray);
            Float[] floatResultArray = new Float[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b8cfef61-e243-346d-a061-b960153c32dc}
    @Test()
    void nullToEmpty10WhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Float[] floatArray = new Float[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(false);
            //Act Statement(s)
            Float[] result = ArrayUtils.nullToEmpty(floatArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b610d851-9e60-3fe7-b05c-9bd638f211e8}
    @Test()
    void nullToEmpty11WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(intArray)).thenReturn(true);
            //Act Statement(s)
            int[] result = ArrayUtils.nullToEmpty(intArray);
            int[] intResultArray = new int[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(intResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1719ab93-2be3-3778-bd54-760e0c4c06a4}
    @Test()
    void nullToEmpty11WhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(intArray)).thenReturn(false);
            //Act Statement(s)
            int[] result = ArrayUtils.nullToEmpty(intArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(intArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d57bfefb-3d33-3212-acac-05e36389e314}
    @Test()
    void nullToEmpty12WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Integer[] integerArray = new Integer[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(integerArray)).thenReturn(true);
            //Act Statement(s)
            Integer[] result = ArrayUtils.nullToEmpty(integerArray);
            Integer[] integerResultArray = new Integer[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(integerResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(integerArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5ff7c710-c669-39b2-b458-6edd4ec29a57}
    @Test()
    void nullToEmpty12WhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Integer[] integerArray = new Integer[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(integerArray)).thenReturn(false);
            //Act Statement(s)
            Integer[] result = ArrayUtils.nullToEmpty(integerArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(integerArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(integerArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f0d64453-e00d-3a3e-9df4-a43f551340fe}
    @Test()
    void nullToEmpty13WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(longArray)).thenReturn(true);
            //Act Statement(s)
            long[] result = ArrayUtils.nullToEmpty(longArray);
            long[] longResultArray = new long[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(longArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${17c5e9c2-525e-32e2-ad7f-2dcf8e97dd33}
    @Test()
    void nullToEmpty13WhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(longArray)).thenReturn(false);
            //Act Statement(s)
            long[] result = ArrayUtils.nullToEmpty(longArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(longArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${83bbdb07-5457-3248-9805-012e86ffd86b}
    @Test()
    void nullToEmpty14WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Long[] longArray = new Long[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(longArray)).thenReturn(true);
            //Act Statement(s)
            Long[] result = ArrayUtils.nullToEmpty(longArray);
            Long[] longResultArray = new Long[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(longArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${659a9613-ac88-369e-b741-a24b50e82e98}
    @Test()
    void nullToEmpty14WhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Long[] longArray = new Long[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(longArray)).thenReturn(false);
            //Act Statement(s)
            Long[] result = ArrayUtils.nullToEmpty(longArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(longArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0f568b9f-d56f-3a95-a8eb-878ae188a8b8}
    @Test()
    void nullToEmpty15WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(objectArray)).thenReturn(true);
            //Act Statement(s)
            Object[] result = ArrayUtils.nullToEmpty(objectArray);
            Object[] objectResultArray = new Object[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(objectResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${bd7c85bd-b4c4-3765-a468-46116296298e}
    @Test()
    void nullToEmpty15WhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(objectArray)).thenReturn(false);
            //Act Statement(s)
            Object[] result = ArrayUtils.nullToEmpty(objectArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(objectArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1887059c-4028-3dd8-bd62-14ab5aa3e8d8}
    @Test()
    void nullToEmpty16WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(shortArray)).thenReturn(true);
            //Act Statement(s)
            short[] result = ArrayUtils.nullToEmpty(shortArray);
            short[] shortResultArray = new short[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(shortResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(shortArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${21ea3c72-66fd-307a-acff-fe0bf63702c7}
    @Test()
    void nullToEmpty16WhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(shortArray)).thenReturn(false);
            //Act Statement(s)
            short[] result = ArrayUtils.nullToEmpty(shortArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(shortArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(shortArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${330e299f-839d-3b4a-b84d-9f5774a2e87a}
    @Test()
    void nullToEmpty17WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Short[] shortArray = new Short[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(shortArray)).thenReturn(true);
            //Act Statement(s)
            Short[] result = ArrayUtils.nullToEmpty(shortArray);
            Short[] shortResultArray = new Short[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(shortResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(shortArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d439f708-65d8-3fb5-91b3-7ac4e2e84af4}
    @Test()
    void nullToEmpty17WhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Short[] shortArray = new Short[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(shortArray)).thenReturn(false);
            //Act Statement(s)
            Short[] result = ArrayUtils.nullToEmpty(shortArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(shortArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(shortArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${39305035-c7cc-3c5a-b197-eafdb6568499}
    @Test()
    void nullToEmpty18WhenIsEmptyArray() {
        /* Branches:
         * (isEmpty(array)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            String[] stringArray = new String[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(stringArray)).thenReturn(true);
            //Act Statement(s)
            String[] result = ArrayUtils.nullToEmpty(stringArray);
            String[] stringResultArray = new String[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(stringResultArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${334c02f9-c19e-3125-af4e-6847b2062798}
    @Test()
    void nullToEmpty18WhenIsEmptyNotArray() {
        /* Branches:
         * (isEmpty(array)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            String[] stringArray = new String[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(stringArray)).thenReturn(false);
            //Act Statement(s)
            String[] result = ArrayUtils.nullToEmpty(stringArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(stringArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b6f1488b-e528-33da-b558-194a0e8bb3dc}
    @Test()
    void nullToEmpty19WhenTypeIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (type == null) : true
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        Class<Object[]> _class = null;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The type must not be null");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            ArrayUtils.nullToEmpty(objectArray, _class);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${91aa41d3-bddc-35c2-b4c7-3e168a49b881}
    @Test()
    void nullToEmpty19WhenArrayIsNull() {
        /* Branches:
         * (type == null) : false
         * (array == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] object = null;

        //Act Statement(s)
        Object[] result = ArrayUtils.nullToEmpty(object, Object[].class);
        Object object2 = new Object();

        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object2)));
    }

    //Sapient generated method id: ${38d43579-4005-35c9-bd6b-e196a01cb7cb}
    @Test()
    void nullToEmpty19WhenArrayIsNotNull() {
        /* Branches:
         * (type == null) : false
         * (array == null) : false
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};

        //Act Statement(s)
        Object[] result = ArrayUtils.nullToEmpty(objectArray, Object[].class);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectArray)));
    }

    //Sapient generated method id: ${665a12f5-ccf3-320c-8658-350e3664bb94}
    @Test()
    void removeTest() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            //boolean[] booleanArray = new boolean[] {};
            //boolean[] booleanArray2 = new boolean[] {};
            //TODO: Please change the modifier of remove from private to default to isolate the test case scenario
            //arrayUtils.when(() -> ArrayUtils.remove(booleanArray2, 0)).thenReturn(booleanArray);
            //Act Statement(s)
            //boolean[] result = ArrayUtils.remove(booleanArray2, 0);
            //Assert statement(s)
            //assertAll("result", () -> assertThat(result, equalTo(booleanArray)));
        }
    }

    //Sapient generated method id: ${f4a70d8d-2704-3bc5-aa3a-cafcc6ea94ba}
    @Test()
    void remove1Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            //byte[] byteArray = new byte[] {};
            //byte[] byteArray2 = new byte[] {};
            //TODO: Please change the modifier of remove from private to default to isolate the test case scenario
            //arrayUtils.when(() -> ArrayUtils.remove(byteArray2, 0)).thenReturn(byteArray);
            //Act Statement(s)
            //byte[] result = ArrayUtils.remove(byteArray2, 0);
            //Assert statement(s)
            //assertAll("result", () -> assertThat(result, equalTo(byteArray)));
        }
    }

    //Sapient generated method id: ${f0d85640-3861-3a0c-9b1e-682c8d7b85f9}
    @Test()
    void remove2Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            //char[] charArray = new char[] {};
            //char[] charArray2 = new char[] {};
            //TODO: Please change the modifier of remove from private to default to isolate the test case scenario
            //arrayUtils.when(() -> ArrayUtils.remove(charArray2, 0)).thenReturn(charArray);
            //Act Statement(s)
            //char[] result = ArrayUtils.remove(charArray2, 0);
            //Assert statement(s)
            //assertAll("result", () -> assertThat(result, equalTo(charArray)));
        }
    }

    //Sapient generated method id: ${b613d507-972a-350b-8046-a399a70e8638}
    @Test()
    void remove3Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            //double[] doubleArray = new double[] {};
            //double[] doubleArray2 = new double[] {};
            //TODO: Please change the modifier of remove from private to default to isolate the test case scenario
            //arrayUtils.when(() -> ArrayUtils.remove(doubleArray2, 0)).thenReturn(doubleArray);
            //Act Statement(s)
            //double[] result = ArrayUtils.remove(doubleArray2, 0);
            //Assert statement(s)
            //assertAll("result", () -> assertThat(result, equalTo(doubleArray)));
        }
    }

    //Sapient generated method id: ${31e2db63-d836-3c74-af36-585ca233dcd5}
    @Test()
    void remove4Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            //float[] floatArray = new float[] {};
            //float[] floatArray2 = new float[] {};
            //TODO: Please change the modifier of remove from private to default to isolate the test case scenario
            //arrayUtils.when(() -> ArrayUtils.remove(floatArray2, 0)).thenReturn(floatArray);
            //Act Statement(s)
            //float[] result = ArrayUtils.remove(floatArray2, 0);
            //Assert statement(s)
            //assertAll("result", () -> assertThat(result, equalTo(floatArray)));
        }
    }

    //Sapient generated method id: ${e5c9dc51-05c5-3263-af73-06c4a660d9aa}
    @Test()
    void remove5Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            //int[] intArray = new int[] {};
            //int[] intArray2 = new int[] {};
            //TODO: Please change the modifier of remove from private to default to isolate the test case scenario
            //arrayUtils.when(() -> ArrayUtils.remove(intArray2, 0)).thenReturn(intArray);
            //Act Statement(s)
            //int[] result = ArrayUtils.remove(intArray2, 0);
            //Assert statement(s)
            //assertAll("result", () -> assertThat(result, equalTo(intArray)));
        }
    }

    //Sapient generated method id: ${a9e52b6e-8789-3791-b28f-4088d821bbfd}
    @Test()
    void remove6Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            //long[] longArray = new long[] {};
            //long[] longArray2 = new long[] {};
            //TODO: Please change the modifier of remove from private to default to isolate the test case scenario
            //arrayUtils.when(() -> ArrayUtils.remove(longArray2, 0)).thenReturn(longArray);
            //Act Statement(s)
            //long[] result = ArrayUtils.remove(longArray2, 0);
            //Assert statement(s)
            //assertAll("result", () -> assertThat(result, equalTo(longArray)));
        }
    }

    //Sapient generated method id: ${eea02421-abce-3087-aa87-bb2be702634b}
    @Test()
    void removeAllTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            boolean[] booleanArray2 = new boolean[]{true, false, true, false};
            int[] intArray = new int[]{1, 3};
            arrayUtils.when(() -> ArrayUtils.removeAll(booleanArray2, intArray)).thenReturn(booleanArray);
            //Act Statement(s)
            boolean[] result = ArrayUtils.removeAll(booleanArray2, intArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanArray));
                arrayUtils.verify(() -> ArrayUtils.removeAll(booleanArray2, intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f9e72a62-ea1a-38dd-a2e7-e587e478110e}
    @Test()
    void removeAll1Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            byte[] byteArray2 = new byte[]{};
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(byteArray2, intArray)).thenReturn(byteArray);
            //Act Statement(s)
            byte[] result = ArrayUtils.removeAll(byteArray2, intArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                arrayUtils.verify(() -> ArrayUtils.removeAll(byteArray2, intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f1bd5b55-35de-35af-89e3-e01a17a223a0}
    @Test()
    void removeAll2Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            char[] charArray2 = new char[]{};
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(charArray2, intArray)).thenReturn(charArray);
            //Act Statement(s)
            char[] result = ArrayUtils.removeAll(charArray2, intArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                arrayUtils.verify(() -> ArrayUtils.removeAll(charArray2, intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${51cd5fee-63d6-32a5-b18c-e1db315218c2}
    @Test()
    void removeAll3Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            double[] doubleArray2 = new double[]{};
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(doubleArray2, intArray)).thenReturn(doubleArray);
            //Act Statement(s)
            double[] result = ArrayUtils.removeAll(doubleArray2, intArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleArray));
                arrayUtils.verify(() -> ArrayUtils.removeAll(doubleArray2, intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2baccc3e-c332-3226-b7a4-cd711148d17e}
    @Test()
    void removeAll4Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            float[] floatArray2 = new float[]{Float.parseFloat("1.0"), Float.parseFloat("3.0"), Float.parseFloat("5.0")};
            int[] intArray = new int[]{1, 3};
            arrayUtils.when(() -> ArrayUtils.removeAll(floatArray2, intArray)).thenReturn(floatArray);
            //Act Statement(s)
            float[] result = ArrayUtils.removeAll(floatArray2, intArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatArray));
                arrayUtils.verify(() -> ArrayUtils.removeAll(floatArray2, intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7ca98dcc-61c3-303e-b7dc-3b9a09ce853e}
    @Test()
    void removeAll5Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            int[] intArray2 = new int[]{};
            int[] intArray3 = new int[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(intArray2, intArray3)).thenReturn(intArray);
            //Act Statement(s)
            int[] result = ArrayUtils.removeAll(intArray2, intArray3);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(intArray));
                arrayUtils.verify(() -> ArrayUtils.removeAll(intArray2, intArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0113ece9-29c4-3b20-9016-250b9fe01888}
    @Test()
    void removeAll6Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            long[] longArray2 = new long[]{};
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(longArray2, intArray)).thenReturn(longArray);
            //Act Statement(s)
            long[] result = ArrayUtils.removeAll(longArray2, intArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray));
                arrayUtils.verify(() -> ArrayUtils.removeAll(longArray2, intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b5d869d7-4a0a-3f6a-ba64-e9ce69856bd0}
    @Test()
    void removeAll7WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Object object = null;
        BitSet bitSet = new BitSet();

        //Act Statement(s)
        Object result = ArrayUtils.removeAll(object, bitSet);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${da3fe2ba-ef61-3632-9e34-9a6570a7f324}
    @Test()
    void removeAll7WhenCountGreaterThan0() {
        /* Branches:
         * (array == null) : false
         * ((set = indices.nextSetBit(srcIndex)) != -1) : true
         * (count > 0) : true
         * (count > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            arrayUtils.when(() -> ArrayUtils.getLength(object)).thenReturn(2);
            BitSet bitSet = new BitSet();
            //Act Statement(s)
            Object result = ArrayUtils.removeAll(object, bitSet);
            Object object2 = new Object();
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, equalTo(object2));
                arrayUtils.verify(() -> ArrayUtils.getLength(object), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9fd61e68-af2f-3c54-97dd-d987ee345802}
    @Test()
    void removeAll8WhenIndexGreaterThanOrEqualsToLengthThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (isNotEmpty(clonedIndices)) : true
         * (--i >= 0) : true
         * (index < 0) : false
         * (index >= length) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            arrayUtils.when(() -> ArrayUtils.getLength(object)).thenReturn(0);
            int[] intArray = new int[]{};
            int[] intArray2 = new int[]{1, 2, 3};
            arrayUtils.when(() -> ArrayUtils.clone(intArray2)).thenReturn(intArray);
            int[] intArray3 = new int[]{};
            arrayUtils.when(() -> ArrayUtils.isNotEmpty(intArray3)).thenReturn(false);
            //Act Statement(s)
            final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
                ArrayUtils.removeAll(object, intArray2);
            });
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("s1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
                arrayUtils.verify(() -> ArrayUtils.getLength(object), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(intArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isNotEmpty(intArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6d294d2d-b471-3515-9e9e-220265551a84}
    @Test()
    void removeAll8WhenEndMinusIndexGreaterThan1AndEndGreaterThan0() {
        /* Branches:
         * (isNotEmpty(clonedIndices)) : true
         * (--i >= 0) : true
         * (index < 0) : false
         * (index >= length) : false
         * (index >= prevIndex) : false
         * (diff < length) : true
         * (i >= 0) : true
         * (end - index > 1) : true
         * (end > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            arrayUtils.when(() -> ArrayUtils.getLength(object)).thenReturn(0);
            int[] intArray = new int[]{};
            int[] intArray2 = new int[]{0, 2, 4};
            arrayUtils.when(() -> ArrayUtils.clone(intArray2)).thenReturn(intArray);
            int[] intArray3 = new int[]{};
            arrayUtils.when(() -> ArrayUtils.isNotEmpty(intArray3)).thenReturn(false);
            //Act Statement(s)
            Object result = ArrayUtils.removeAll(object, intArray2);
            Object object2 = new Object();
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, equalTo(object2));
                arrayUtils.verify(() -> ArrayUtils.getLength(object), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(intArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isNotEmpty(intArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${05809e4a-9a59-323a-8e18-86dcf5ce2c30}
    @Test()
    void removeAll9Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            short[] shortArray2 = new short[]{};
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(shortArray2, intArray)).thenReturn(shortArray);
            //Act Statement(s)
            short[] result = ArrayUtils.removeAll(shortArray2, intArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(shortArray));
                arrayUtils.verify(() -> ArrayUtils.removeAll(shortArray2, intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${965904b4-a603-3a77-9c9d-df1807e81cf0}
    @Test()
    void removeAll10Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object[] objectArray = new Object[]{};
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(objectArray, intArray)).thenReturn(object);
            //Act Statement(s)
            Object[] result = ArrayUtils.removeAll(objectArray, intArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                arrayUtils.verify(() -> ArrayUtils.removeAll(objectArray, intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${666631e4-bee5-3c0d-b8c0-8ffeb74ab2c2}
    @Test()
    void removeAllOccurencesTest() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(booleanArray, false)).thenReturn(bitSet);
            boolean[] booleanArray2 = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(booleanArray, bitSet)).thenReturn(booleanArray2);
            //Act Statement(s)
            boolean[] result = ArrayUtils.removeAllOccurences(booleanArray, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanArray2));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(booleanArray, false), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(booleanArray, bitSet), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${19f364dd-b926-3194-810f-0403d5434c47}
    @Test()
    void removeAllOccurences1Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(byteArray, (byte) 0)).thenReturn(bitSet);
            byte[] byteArray2 = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(byteArray, bitSet)).thenReturn(byteArray2);
            //Act Statement(s)
            byte[] result = ArrayUtils.removeAllOccurences(byteArray, (byte) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray2));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(byteArray, (byte) 0), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(byteArray, bitSet), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${34c9d31d-9b68-3969-8610-92bdc25d1792}
    @Test()
    void removeAllOccurences2Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(charArray, 'A')).thenReturn(bitSet);
            char[] charArray2 = new char[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(charArray, bitSet)).thenReturn(charArray2);
            //Act Statement(s)
            char[] result = ArrayUtils.removeAllOccurences(charArray, 'A');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray2));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(charArray, 'A'), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(charArray, bitSet), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${512ee7b1-ecb2-37ea-b9ba-53764ddece1c}
    @Test()
    void removeAllOccurences3Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(doubleArray, Double.parseDouble("0.0"))).thenReturn(bitSet);
            double[] doubleArray2 = new double[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(doubleArray, bitSet)).thenReturn(doubleArray2);
            //Act Statement(s)
            double[] result = ArrayUtils.removeAllOccurences(doubleArray, Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleArray2));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(doubleArray, Double.parseDouble("0.0")), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(doubleArray, bitSet), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5bb6631e-6d20-355a-8089-7c1d3f341067}
    @Test()
    void removeAllOccurences4Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(floatArray, Float.parseFloat("0.0"))).thenReturn(bitSet);
            float[] floatArray2 = new float[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(floatArray, bitSet)).thenReturn(floatArray2);
            //Act Statement(s)
            float[] result = ArrayUtils.removeAllOccurences(floatArray, Float.parseFloat("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatArray2));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(floatArray, Float.parseFloat("0.0")), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(floatArray, bitSet), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5ed29743-dfd0-39a1-955a-bf1125356ac8}
    @Test()
    void removeAllOccurences5Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(intArray, 0)).thenReturn(bitSet);
            int[] intArray2 = new int[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(intArray, bitSet)).thenReturn(intArray2);
            //Act Statement(s)
            int[] result = ArrayUtils.removeAllOccurences(intArray, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(intArray2));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(intArray, 0), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(intArray, bitSet), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c1c7ad5c-2a4d-3bc7-9be2-6abf84af79fe}
    @Test()
    void removeAllOccurences6Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(longArray, 0L)).thenReturn(bitSet);
            long[] longArray2 = new long[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(longArray, bitSet)).thenReturn(longArray2);
            //Act Statement(s)
            long[] result = ArrayUtils.removeAllOccurences(longArray, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray2));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(longArray, 0L), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(longArray, bitSet), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b1a73ec2-5e2d-3057-afb3-78efdc847a4c}
    @Test()
    void removeAllOccurences7Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(shortArray, (short) 0)).thenReturn(bitSet);
            short[] shortArray2 = new short[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(shortArray, bitSet)).thenReturn(shortArray2);
            //Act Statement(s)
            short[] result = ArrayUtils.removeAllOccurences(shortArray, (short) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(shortArray2));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(shortArray, (short) 0), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(shortArray, bitSet), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b27629b0-4535-3989-be16-8a6bf4264c0e}
    @Test()
    void removeAllOccurences8Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            Object[] objectArray = new Object[]{};
            Object object = new Object();
            arrayUtils.when(() -> ArrayUtils.indexesOf(objectArray, object)).thenReturn(bitSet);
            Object object2 = new Object();
            arrayUtils.when(() -> ArrayUtils.removeAll(objectArray, bitSet)).thenReturn(object2);
            //Act Statement(s)
            Object[] result = ArrayUtils.removeAllOccurences(objectArray, object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object2));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(objectArray, object), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(objectArray, bitSet), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f4206e5b-ac62-3d3a-a1b7-f691bdb52332}
    @Test()
    void removeAllOccurrencesTest() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(booleanArray, false)).thenReturn(bitSet);
            boolean[] booleanArray2 = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(booleanArray, bitSet)).thenReturn(booleanArray2);
            //Act Statement(s)
            boolean[] result = ArrayUtils.removeAllOccurrences(booleanArray, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanArray2));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(booleanArray, false), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(booleanArray, bitSet), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${52a57918-7918-31ae-a82f-e9472dfc8f75}
    @Test()
    void removeAllOccurrences1Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(byteArray, (byte) 0)).thenReturn(bitSet);
            byte[] byteArray2 = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(byteArray, bitSet)).thenReturn(byteArray2);
            //Act Statement(s)
            byte[] result = ArrayUtils.removeAllOccurrences(byteArray, (byte) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray2));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(byteArray, (byte) 0), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(byteArray, bitSet), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${960e2b7c-aa9b-30cd-91e7-e7e3b888b4bc}
    @Test()
    void removeAllOccurrences2Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(charArray, 'A')).thenReturn(bitSet);
            char[] charArray2 = new char[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(charArray, bitSet)).thenReturn(charArray2);
            //Act Statement(s)
            char[] result = ArrayUtils.removeAllOccurrences(charArray, 'A');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray2));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(charArray, 'A'), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(charArray, bitSet), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cc46b073-08f5-3624-b569-2098a037e307}
    @Test()
    void removeAllOccurrences3Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(doubleArray, Double.parseDouble("0.0"))).thenReturn(bitSet);
            double[] doubleArray2 = new double[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(doubleArray, bitSet)).thenReturn(doubleArray2);
            //Act Statement(s)
            double[] result = ArrayUtils.removeAllOccurrences(doubleArray, Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleArray2));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(doubleArray, Double.parseDouble("0.0")), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(doubleArray, bitSet), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${305fc317-a44d-3775-9d19-f274b7b18c24}
    @Test()
    void removeAllOccurrences4Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(floatArray, Float.parseFloat("0.0"))).thenReturn(bitSet);
            float[] floatArray2 = new float[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(floatArray, bitSet)).thenReturn(floatArray2);
            //Act Statement(s)
            float[] result = ArrayUtils.removeAllOccurrences(floatArray, Float.parseFloat("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatArray2));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(floatArray, Float.parseFloat("0.0")), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(floatArray, bitSet), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0370a8a9-eea6-3a3b-9326-aaace67da509}
    @Test()
    void removeAllOccurrences5Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(intArray, 0)).thenReturn(bitSet);
            int[] intArray2 = new int[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(intArray, bitSet)).thenReturn(intArray2);
            //Act Statement(s)
            int[] result = ArrayUtils.removeAllOccurrences(intArray, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(intArray2));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(intArray, 0), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(intArray, bitSet), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${476046d3-5ff3-358c-9aba-ccccf5c3f22a}
    @Test()
    void removeAllOccurrences6Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(longArray, 0L)).thenReturn(bitSet);
            long[] longArray2 = new long[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(longArray, bitSet)).thenReturn(longArray2);
            //Act Statement(s)
            long[] result = ArrayUtils.removeAllOccurrences(longArray, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray2));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(longArray, 0L), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(longArray, bitSet), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8b13ada6-9470-380b-82e7-20cc41eb63e7}
    @Test()
    void removeAllOccurrences7Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.indexesOf(shortArray, (short) 0)).thenReturn(bitSet);
            short[] shortArray2 = new short[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(shortArray, bitSet)).thenReturn(shortArray2);
            //Act Statement(s)
            short[] result = ArrayUtils.removeAllOccurrences(shortArray, (short) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(shortArray2));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(shortArray, (short) 0), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(shortArray, bitSet), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b6b4fd27-3238-3d69-a0b1-9951606fff78}
    @Test()
    void removeAllOccurrences8Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            BitSet bitSet = new BitSet();
            Object[] objectArray = new Object[]{};
            Object object = new Object();
            arrayUtils.when(() -> ArrayUtils.indexesOf(objectArray, object)).thenReturn(bitSet);
            Object object2 = new Object();
            arrayUtils.when(() -> ArrayUtils.removeAll(objectArray, bitSet)).thenReturn(object2);
            //Act Statement(s)
            Object[] result = ArrayUtils.removeAllOccurrences(objectArray, object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object2));
                arrayUtils.verify(() -> ArrayUtils.indexesOf(objectArray, object), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(objectArray, bitSet), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a9e146a5-5ab8-3a66-871d-7fb3ab408291}
    @Test()
    void removeElementWhenIndexEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (index == INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(booleanArray, false)).thenReturn(-1);
            boolean[] booleanArray2 = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.clone(booleanArray)).thenReturn(booleanArray2);
            //Act Statement(s)
            boolean[] result = ArrayUtils.removeElement(booleanArray, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanArray2));
                arrayUtils.verify(() -> ArrayUtils.indexOf(booleanArray, false), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4afabbb5-2b8d-3e56-bd2c-c82e6a8e0305}
    @Test()
    void removeElementWhenIndexNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (index == INDEX_NOT_FOUND) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(booleanArray, false)).thenReturn(1);
            boolean[] booleanArray2 = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.remove(booleanArray, 1)).thenReturn(booleanArray2);
            //Act Statement(s)
            boolean[] result = ArrayUtils.removeElement(booleanArray, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanArray2));
                arrayUtils.verify(() -> ArrayUtils.indexOf(booleanArray, false), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.remove(booleanArray, 1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9f80764d-d230-30e7-b843-265c90673328}
    @Test()
    void removeElement1WhenIndexEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (index == INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(byteArray, (byte) 0)).thenReturn(-1);
            byte[] byteArray2 = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.clone(byteArray)).thenReturn(byteArray2);
            //Act Statement(s)
            byte[] result = ArrayUtils.removeElement(byteArray, (byte) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray2));
                arrayUtils.verify(() -> ArrayUtils.indexOf(byteArray, (byte) 0), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(byteArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ea78183e-3fd1-3f72-a988-9a424fbd9edf}
    @Test()
    void removeElement1WhenIndexNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (index == INDEX_NOT_FOUND) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(byteArray, (byte) 0)).thenReturn(1);
            byte[] byteArray2 = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.remove(byteArray, 1)).thenReturn(byteArray2);
            //Act Statement(s)
            byte[] result = ArrayUtils.removeElement(byteArray, (byte) 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray2));
                arrayUtils.verify(() -> ArrayUtils.indexOf(byteArray, (byte) 0), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.remove(byteArray, 1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${36a7d787-4183-31ae-b3f1-07fad905243b}
    @Test()
    void removeElement2WhenIndexEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (index == INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(charArray, 'A')).thenReturn(-1);
            char[] charArray2 = new char[]{};
            arrayUtils.when(() -> ArrayUtils.clone(charArray)).thenReturn(charArray2);
            //Act Statement(s)
            char[] result = ArrayUtils.removeElement(charArray, 'A');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray2));
                arrayUtils.verify(() -> ArrayUtils.indexOf(charArray, 'A'), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(charArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${caba1491-2402-337b-8b6e-611ceb203a88}
    @Test()
    void removeElement2WhenIndexNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (index == INDEX_NOT_FOUND) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(charArray, 'A')).thenReturn(1);
            char[] charArray2 = new char[]{};
            arrayUtils.when(() -> ArrayUtils.remove(charArray, 1)).thenReturn(charArray2);
            //Act Statement(s)
            char[] result = ArrayUtils.removeElement(charArray, 'A');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray2));
                arrayUtils.verify(() -> ArrayUtils.indexOf(charArray, 'A'), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.remove(charArray, 1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9fb80b07-afc8-3d18-a07e-b63c8cd255c6}
    @Test()
    void removeElement3WhenIndexEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (index == INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"))).thenReturn(-1);
            double[] doubleArray2 = new double[]{};
            arrayUtils.when(() -> ArrayUtils.clone(doubleArray)).thenReturn(doubleArray2);
            //Act Statement(s)
            double[] result = ArrayUtils.removeElement(doubleArray, Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleArray2));
                arrayUtils.verify(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0")), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7e27d58c-e96d-3dc7-a011-106be3ea4f07}
    @Test()
    void removeElement3WhenIndexNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (index == INDEX_NOT_FOUND) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0"))).thenReturn(1);
            double[] doubleArray2 = new double[]{};
            arrayUtils.when(() -> ArrayUtils.remove(doubleArray, 1)).thenReturn(doubleArray2);
            //Act Statement(s)
            double[] result = ArrayUtils.removeElement(doubleArray, Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleArray2));
                arrayUtils.verify(() -> ArrayUtils.indexOf(doubleArray, Double.parseDouble("0.0")), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.remove(doubleArray, 1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6b31407a-25f4-3236-b863-dcce48b8ee6e}
    @Test()
    void removeElement4WhenIndexEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (index == INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(floatArray, Float.parseFloat("0.0"))).thenReturn(-1);
            float[] floatArray2 = new float[]{};
            arrayUtils.when(() -> ArrayUtils.clone(floatArray)).thenReturn(floatArray2);
            //Act Statement(s)
            float[] result = ArrayUtils.removeElement(floatArray, Float.parseFloat("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatArray2));
                arrayUtils.verify(() -> ArrayUtils.indexOf(floatArray, Float.parseFloat("0.0")), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${bb57a673-2a22-3848-9cc6-9cd21f99d5c6}
    @Test()
    void removeElement4WhenIndexNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (index == INDEX_NOT_FOUND) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(floatArray, Float.parseFloat("0.0"))).thenReturn(1);
            float[] floatArray2 = new float[]{};
            arrayUtils.when(() -> ArrayUtils.remove(floatArray, 1)).thenReturn(floatArray2);
            //Act Statement(s)
            float[] result = ArrayUtils.removeElement(floatArray, Float.parseFloat("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatArray2));
                arrayUtils.verify(() -> ArrayUtils.indexOf(floatArray, Float.parseFloat("0.0")), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.remove(floatArray, 1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${073f7ff5-2cc5-3d9a-a9e8-68698842ff92}
    @Test()
    void removeElement5WhenIndexEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (index == INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(intArray, 0)).thenReturn(-1);
            int[] intArray2 = new int[]{};
            arrayUtils.when(() -> ArrayUtils.clone(intArray)).thenReturn(intArray2);
            //Act Statement(s)
            int[] result = ArrayUtils.removeElement(intArray, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(intArray2));
                arrayUtils.verify(() -> ArrayUtils.indexOf(intArray, 0), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8ffd360e-c56d-3d4f-8e78-3a2065ce16a6}
    @Test()
    void removeElement5WhenIndexNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (index == INDEX_NOT_FOUND) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(intArray, 0)).thenReturn(1);
            int[] intArray2 = new int[]{};
            arrayUtils.when(() -> ArrayUtils.remove(intArray, 1)).thenReturn(intArray2);
            //Act Statement(s)
            int[] result = ArrayUtils.removeElement(intArray, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(intArray2));
                arrayUtils.verify(() -> ArrayUtils.indexOf(intArray, 0), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.remove(intArray, 1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a140e144-6a04-323f-aba3-ffc42f20f0bc}
    @Test()
    void removeElement6WhenIndexEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (index == INDEX_NOT_FOUND) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(longArray, 0L)).thenReturn(-1);
            long[] longArray2 = new long[]{};
            arrayUtils.when(() -> ArrayUtils.clone(longArray)).thenReturn(longArray2);
            //Act Statement(s)
            long[] result = ArrayUtils.removeElement(longArray, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray2));
                arrayUtils.verify(() -> ArrayUtils.indexOf(longArray, 0L), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(longArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5ec95e5e-2561-3d71-99b9-a8746e2f0add}
    @Test()
    void removeElement6WhenIndexNotEqualsINDEX_NOT_FOUND() {
        /* Branches:
         * (index == INDEX_NOT_FOUND) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.indexOf(longArray, 0L)).thenReturn(1);
            long[] longArray2 = new long[]{};
            arrayUtils.when(() -> ArrayUtils.remove(longArray, 1)).thenReturn(longArray2);
            //Act Statement(s)
            long[] result = ArrayUtils.removeElement(longArray, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray2));
                arrayUtils.verify(() -> ArrayUtils.indexOf(longArray, 0L), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.remove(longArray, 1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${220442a3-c2ac-309b-aad5-6070549c8345}
    @Test()
    void removeElementsWhenIsEmptyValues() {
        /* Branches:
         * (isEmpty(array)) : false
         * (isEmpty(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(false);
            boolean[] booleanArray2 = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray2)).thenReturn(true);
            boolean[] booleanArray3 = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.clone(booleanArray)).thenReturn(booleanArray3);
            //Act Statement(s)
            boolean[] result = ArrayUtils.removeElements(booleanArray, booleanArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanArray3));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${808d2ac0-b432-3967-9c11-f0653c564e8e}
    @Test()
    void removeElementsWhenCountDecrementAndGetEquals0() {
        /* Branches:
         * (isEmpty(array)) : false
         * (isEmpty(values)) : false
         * (for-each(values)) : true
         * (count == null) : true
         * (i < array.length) : true
         * (count != null) : true
         * (count.decrementAndGet() == 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{true, false, true};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(false);
            boolean[] booleanArray2 = new boolean[]{true};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray2)).thenReturn(false);
            boolean[] booleanArray3 = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(eq(booleanArray), (BitSet) any())).thenReturn(booleanArray3);
            //Act Statement(s)
            boolean[] result = ArrayUtils.removeElements(booleanArray, booleanArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanArray3));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(eq(booleanArray), (BitSet) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${232ca10e-204a-3d4c-91c5-0c74f5f5ad80}
    @Test()
    void removeElements1WhenIsEmptyValues() {
        /* Branches:
         * (isEmpty(array)) : false
         * (isEmpty(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(byteArray)).thenReturn(false);
            byte[] byteArray2 = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(byteArray2)).thenReturn(true);
            byte[] byteArray3 = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.clone(byteArray)).thenReturn(byteArray3);
            //Act Statement(s)
            byte[] result = ArrayUtils.removeElements(byteArray, byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray3));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(byteArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(byteArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(byteArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7bb46c85-d0e7-3f30-8537-ac7b7e0bc93b}
    @Test()
    void removeElements1WhenCountDecrementAndGetEquals0() {
        /* Branches:
         * (isEmpty(array)) : false
         * (isEmpty(values)) : false
         * (for-each(values)) : true
         * (count == null) : true
         * (i < array.length) : true
         * (count != null) : true
         * (count.decrementAndGet() == 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 4};
            arrayUtils.when(() -> ArrayUtils.isEmpty(byteArray)).thenReturn(false);
            byte[] byteArray2 = new byte[]{(byte) 1, (byte) 3, (byte) 5};
            arrayUtils.when(() -> ArrayUtils.isEmpty(byteArray2)).thenReturn(false);
            byte[] byteArray3 = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(eq(byteArray), (BitSet) any())).thenReturn(byteArray3);
            //Act Statement(s)
            byte[] result = ArrayUtils.removeElements(byteArray, byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray3));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(byteArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(byteArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(eq(byteArray), (BitSet) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fe22cc70-0dfe-3487-8a48-da0e96ec2037}
    @Test()
    void removeElements2WhenIsEmptyValues() {
        /* Branches:
         * (isEmpty(array)) : false
         * (isEmpty(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(charArray)).thenReturn(false);
            char[] charArray2 = new char[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(charArray2)).thenReturn(true);
            char[] charArray3 = new char[]{};
            arrayUtils.when(() -> ArrayUtils.clone(charArray)).thenReturn(charArray3);
            //Act Statement(s)
            char[] result = ArrayUtils.removeElements(charArray, charArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray3));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(charArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(charArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(charArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${42dd90f7-e858-3617-a53f-edd02f14140f}
    @Test()
    void removeElements2WhenCountDecrementAndGetEquals0() {
        /* Branches:
         * (isEmpty(array)) : false
         * (isEmpty(values)) : false
         * (for-each(values)) : true
         * (count == null) : true
         * (i < array.length) : true
         * (count != null) : true
         * (count.decrementAndGet() == 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{'a', 'b', 'c'};
            arrayUtils.when(() -> ArrayUtils.isEmpty(charArray)).thenReturn(false);
            char[] charArray2 = new char[]{'a', 'b'};
            arrayUtils.when(() -> ArrayUtils.isEmpty(charArray2)).thenReturn(false);
            char[] charArray3 = new char[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(eq(charArray), (BitSet) any())).thenReturn(charArray3);
            //Act Statement(s)
            char[] result = ArrayUtils.removeElements(charArray, charArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray3));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(charArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(charArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(eq(charArray), (BitSet) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8b6ac98a-f02f-3f30-b3a8-dd602b029b94}
    @Test()
    void removeElements3WhenIsEmptyValues() {
        /* Branches:
         * (isEmpty(array)) : false
         * (isEmpty(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            double[] doubleArray2 = new double[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray2)).thenReturn(true);
            double[] doubleArray3 = new double[]{};
            arrayUtils.when(() -> ArrayUtils.clone(doubleArray)).thenReturn(doubleArray3);
            //Act Statement(s)
            double[] result = ArrayUtils.removeElements(doubleArray, doubleArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleArray3));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(doubleArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5fc9f4c8-9521-3cc5-833a-deca8d707ab3}
    @Test()
    void removeElements3WhenCountDecrementAndGetEquals0() {
        /* Branches:
         * (isEmpty(array)) : false
         * (isEmpty(values)) : false
         * (for-each(values)) : true
         * (count == null) : true
         * (i < array.length) : true
         * (count != null) : true
         * (count.decrementAndGet() == 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{Double.parseDouble("1.0"), Double.parseDouble("2.0"), Double.parseDouble("3.0"), Double.parseDouble("4.0"), Double.parseDouble("5.0")};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            double[] doubleArray2 = new double[]{Double.parseDouble("1.0"), Double.parseDouble("2.0"), Double.parseDouble("3.0")};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray2)).thenReturn(false);
            double[] doubleArray3 = new double[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(eq(doubleArray), (BitSet) any())).thenReturn(doubleArray3);
            //Act Statement(s)
            double[] result = ArrayUtils.removeElements(doubleArray, doubleArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleArray3));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(eq(doubleArray), (BitSet) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${71fd41fb-8de6-3c64-b90a-b0fc5b9b78e3}
    @Test()
    void removeElements4WhenIsEmptyValues() {
        /* Branches:
         * (isEmpty(array)) : false
         * (isEmpty(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(false);
            float[] floatArray2 = new float[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray2)).thenReturn(true);
            float[] floatArray3 = new float[]{};
            arrayUtils.when(() -> ArrayUtils.clone(floatArray)).thenReturn(floatArray3);
            //Act Statement(s)
            float[] result = ArrayUtils.removeElements(floatArray, floatArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatArray3));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(floatArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0878375a-58fd-34ae-b4d2-311adec6aa65}
    @Test()
    void removeElements4WhenCountDecrementAndGetEquals0() {
        /* Branches:
         * (isEmpty(array)) : false
         * (isEmpty(values)) : false
         * (for-each(values)) : true
         * (count == null) : true
         * (i < array.length) : true
         * (count != null) : true
         * (count.decrementAndGet() == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(false);
            float[] floatArray2 = new float[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray2)).thenReturn(false);
            float[] floatArray3 = new float[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(eq(floatArray), (BitSet) any())).thenReturn(floatArray3);
            //Act Statement(s)
            float[] result = ArrayUtils.removeElements(floatArray, floatArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatArray3));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(eq(floatArray), (BitSet) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cc8d4c70-13ac-3f67-8749-524013083b12}
    @Test()
    void removeElements5WhenIsEmptyValues() {
        /* Branches:
         * (isEmpty(array)) : false
         * (isEmpty(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(intArray)).thenReturn(false);
            int[] intArray2 = new int[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(intArray2)).thenReturn(true);
            int[] intArray3 = new int[]{};
            arrayUtils.when(() -> ArrayUtils.clone(intArray)).thenReturn(intArray3);
            //Act Statement(s)
            int[] result = ArrayUtils.removeElements(intArray, intArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(intArray3));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(intArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(intArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(intArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${311bb3e3-66ba-3e85-a2a5-6a9ee50d225b}
    @Test()
    void removeElements5WhenCountDecrementAndGetEquals0() {
        /* Branches:
         * (isEmpty(array)) : false
         * (isEmpty(values)) : false
         * (for-each(values)) : true
         * (count == null) : true
         * (i < array.length) : true
         * (count != null) : true
         * (count.decrementAndGet() == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(intArray)).thenReturn(false);
            int[] intArray2 = new int[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(intArray2)).thenReturn(false);
            int[] intArray3 = new int[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(eq(intArray), (BitSet) any())).thenReturn(intArray3);
            //Act Statement(s)
            int[] result = ArrayUtils.removeElements(intArray, intArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(intArray3));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(intArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(intArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(eq(intArray), (BitSet) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${e167fe6d-40aa-33a6-a500-455c84586d63}
    @Test()
    void removeElements6WhenIsEmptyValues() {
        /* Branches:
         * (isEmpty(array)) : false
         * (isEmpty(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(longArray)).thenReturn(false);
            long[] longArray2 = new long[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(longArray2)).thenReturn(true);
            long[] longArray3 = new long[]{};
            arrayUtils.when(() -> ArrayUtils.clone(longArray)).thenReturn(longArray3);
            //Act Statement(s)
            long[] result = ArrayUtils.removeElements(longArray, longArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray3));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(longArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(longArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(longArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3927a032-353c-3bf5-a760-062c640838a6}
    @Test()
    void removeElements6WhenCountDecrementAndGetEquals0() {
        /* Branches:
         * (isEmpty(array)) : false
         * (isEmpty(values)) : false
         * (for-each(values)) : true
         * (count == null) : true
         * (i < array.length) : true
         * (count != null) : true
         * (count.decrementAndGet() == 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{1L, 2L, 3L, 4L, 5L};
            arrayUtils.when(() -> ArrayUtils.isEmpty(longArray)).thenReturn(false);
            long[] longArray2 = new long[]{1L, 2L, 3L};
            arrayUtils.when(() -> ArrayUtils.isEmpty(longArray2)).thenReturn(false);
            long[] longArray3 = new long[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(eq(longArray), (BitSet) any())).thenReturn(longArray3);
            //Act Statement(s)
            long[] result = ArrayUtils.removeElements(longArray, longArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray3));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(longArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(longArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(eq(longArray), (BitSet) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${94184baf-61e5-3fc0-ad24-7152c29f99fc}
    @Test()
    void removeElements7WhenIsEmptyValues() {
        /* Branches:
         * (isEmpty(array)) : false
         * (isEmpty(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(shortArray)).thenReturn(false);
            short[] shortArray2 = new short[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(shortArray2)).thenReturn(true);
            short[] shortArray3 = new short[]{};
            arrayUtils.when(() -> ArrayUtils.clone(shortArray)).thenReturn(shortArray3);
            //Act Statement(s)
            short[] result = ArrayUtils.removeElements(shortArray, shortArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(shortArray3));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(shortArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(shortArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(shortArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4232c5ac-bf19-3658-aaa0-0892627fc869}
    @Test()
    void removeElements7WhenCountDecrementAndGetEquals0() {
        /* Branches:
         * (isEmpty(array)) : false
         * (isEmpty(values)) : false
         * (for-each(values)) : true
         * (count == null) : true
         * (i < array.length) : true
         * (count != null) : true
         * (count.decrementAndGet() == 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{(short) 1, (short) 2, (short) 3, (short) 4, (short) 5};
            arrayUtils.when(() -> ArrayUtils.isEmpty(shortArray)).thenReturn(false);
            short[] shortArray2 = new short[]{(short) 1, (short) 2, (short) 3};
            arrayUtils.when(() -> ArrayUtils.isEmpty(shortArray2)).thenReturn(false);
            short[] shortArray3 = new short[]{};
            arrayUtils.when(() -> ArrayUtils.removeAll(eq(shortArray), (BitSet) any())).thenReturn(shortArray3);
            //Act Statement(s)
            short[] result = ArrayUtils.removeElements(shortArray, shortArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(shortArray3));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(shortArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(shortArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(eq(shortArray), (BitSet) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b60a50f9-233e-33c1-87f7-f140d039f070}
    @Test()
    void removeElements8WhenIsEmptyValues() {
        /* Branches:
         * (isEmpty(array)) : false
         * (isEmpty(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(objectArray)).thenReturn(false);
            Object[] objectArray2 = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(objectArray2)).thenReturn(true);
            Object[] objectArray3 = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.clone(objectArray)).thenReturn(objectArray3);
            //Act Statement(s)
            Object[] result = ArrayUtils.removeElements(objectArray, objectArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(objectArray3));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(objectArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(objectArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.clone(objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a02b3ab4-1355-3738-9623-b43e8746fb90}
    @Test()
    void removeElements8WhenCountDecrementAndGetEquals0() {
        /* Branches:
         * (isEmpty(array)) : false
         * (isEmpty(values)) : false
         * (for-each(values)) : true
         * (count == null) : true
         * (i < array.length) : true
         * (count != null) : true
         * (count.decrementAndGet() == 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object[] objectArray = new Object[]{object};
            arrayUtils.when(() -> ArrayUtils.isEmpty(objectArray)).thenReturn(false);
            Object[] objectArray2 = new Object[]{object};
            arrayUtils.when(() -> ArrayUtils.isEmpty(objectArray2)).thenReturn(false);
            Object object2 = new Object();
            arrayUtils.when(() -> ArrayUtils.removeAll(eq(objectArray), (BitSet) any())).thenReturn(object2);
            //Act Statement(s)
            Object[] result = ArrayUtils.removeElements(objectArray, objectArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object2));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(objectArray), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(objectArray2), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.removeAll(eq(objectArray), (BitSet) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cc128521-1458-32b8-887e-90dd4601072f}
    @Test()
    void reverseWhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        boolean[] _boolean = null;

        //Act Statement(s)
        ArrayUtils.reverse(_boolean);
    }

    //Sapient generated method id: ${dcadef10-c7ed-3054-bea1-9dafa84865fc}
    @Test()
    void reverseWhenArrayIsNotNull() {
        /* Branches:
         * (array == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.reverse(booleanArray, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.reverse(booleanArray);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.reverse(booleanArray, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${579a9daa-3b04-3cfe-b045-12a666bc26ab}
    @Test()
    void reverse1WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        boolean[] _boolean = null;

        //Act Statement(s)
        ArrayUtils.reverse(_boolean, 0, 0);
    }

    //Sapient generated method id: ${3cef486f-bf21-3bf9-8e3c-c4c417ecade0}
    @Test()
    void reverse1WhenJGreaterThanI() {
        /* Branches:
         * (array == null) : false
         * (j > i) : true
         */
        //Arrange Statement(s)
        boolean[] booleanArray = new boolean[]{false, false};

        //Act Statement(s)
        ArrayUtils.reverse(booleanArray, -1, 2);
    }

    //Sapient generated method id: ${7f4e17c4-ff93-34ac-b514-d5c6bb997221}
    @Test()
    void reverse2WhenArrayIsNotNull() {
        /* Branches:
         * (array != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.reverse(byteArray, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.reverse(byteArray);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.reverse(byteArray, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${bab2d4f7-2e7a-3676-9875-1512e6fb440f}
    @Test()
    void reverse3WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        byte[] _byte = null;

        //Act Statement(s)
        ArrayUtils.reverse(_byte, 0, 0);
    }

    //Sapient generated method id: ${170960b6-08d7-381c-8015-d65e2635a6c2}
    @Test()
    void reverse3WhenJGreaterThanI() {
        /* Branches:
         * (array == null) : false
         * (j > i) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 1, (byte) 0};

        //Act Statement(s)
        ArrayUtils.reverse(byteArray, -1, 2);
        byte[] byteByteArrayArray = new byte[]{(byte) 0, (byte) 1};

        //Assert statement(s)
        assertAll("result", () -> assertThat(byteArray, equalTo(byteByteArrayArray)));
    }

    //Sapient generated method id: ${699fe6cf-c165-3ea6-9739-6380c6744c2a}
    @Test()
    void reverse4WhenArrayIsNotNull() {
        /* Branches:
         * (array != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.reverse(charArray, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.reverse(charArray);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.reverse(charArray, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${00a4de64-bdb8-34b7-bf6f-5f6d467670e4}
    @Test()
    void reverse5WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        char[] _char = null;

        //Act Statement(s)
        ArrayUtils.reverse(_char, 0, 0);
    }

    //Sapient generated method id: ${8b725a56-a9b1-3010-9fb3-b7519654202d}
    @Test()
    void reverse5WhenJGreaterThanI() {
        /* Branches:
         * (array == null) : false
         * (j > i) : true
         */
        //Arrange Statement(s)
        char[] charArray = new char[]{'A', 'A'};

        //Act Statement(s)
        ArrayUtils.reverse(charArray, -1, 2);
    }

    //Sapient generated method id: ${97ae23e7-ecaf-3d4d-a683-40a29ee3c902}
    @Test()
    void reverse6WhenArrayIsNotNull() {
        /* Branches:
         * (array != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.reverse(doubleArray, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.reverse(doubleArray);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.reverse(doubleArray, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${40290761-f243-35b8-8274-20c4751e8de0}
    @Test()
    void reverse7WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        double[] _double = null;

        //Act Statement(s)
        ArrayUtils.reverse(_double, 0, 0);
    }

    //Sapient generated method id: ${99584f93-a4d9-3e8c-bca4-fdf54fd44984}
    @Test()
    void reverse7WhenJGreaterThanI() {
        /* Branches:
         * (array == null) : false
         * (j > i) : true
         */
        //Arrange Statement(s)
        double[] doubleArray = new double[]{Double.parseDouble("1"), Double.parseDouble("0")};

        //Act Statement(s)
        ArrayUtils.reverse(doubleArray, -1, 2);
        double[] doubleDoubleArrayArray = new double[]{Double.parseDouble("0"), Double.parseDouble("1")};

        //Assert statement(s)
        assertAll("result", () -> assertThat(doubleArray, equalTo(doubleDoubleArrayArray)));
    }

    //Sapient generated method id: ${ac01b465-e051-3d00-bbc2-020d6beb3e6f}
    @Test()
    void reverse8WhenArrayIsNotNull() {
        /* Branches:
         * (array != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.reverse(floatArray, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.reverse(floatArray);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.reverse(floatArray, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${91d51260-dde4-3bd6-945d-f0d0d5ed0ed3}
    @Test()
    void reverse9WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        float[] _float = null;

        //Act Statement(s)
        ArrayUtils.reverse(_float, 0, 0);
    }

    //Sapient generated method id: ${349aaac2-6655-3ec2-8e4d-8b34c18eff6f}
    @Test()
    void reverse9WhenJGreaterThanI() {
        /* Branches:
         * (array == null) : false
         * (j > i) : true
         */
        //Arrange Statement(s)
        float[] floatArray = new float[]{Float.parseFloat("1"), Float.parseFloat("0")};

        //Act Statement(s)
        ArrayUtils.reverse(floatArray, -1, 2);
        float[] floatFloatArrayArray = new float[]{Float.parseFloat("0"), Float.parseFloat("1")};

        //Assert statement(s)
        assertAll("result", () -> assertThat(floatArray, equalTo(floatFloatArrayArray)));
    }

    //Sapient generated method id: ${5d7dfb43-6ed6-3834-aa86-c201de8fb00a}
    @Test()
    void reverse10WhenArrayIsNotNull() {
        /* Branches:
         * (array != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.reverse(intArray, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.reverse(intArray);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.reverse(intArray, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${bdca6c57-79f7-3178-b1fc-a956640e7432}
    @Test()
    void reverse11WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        int[] _int = null;

        //Act Statement(s)
        ArrayUtils.reverse(_int, 0, 0);
    }

    //Sapient generated method id: ${ccada86d-be85-3966-af4f-0d5e6cdbf1c5}
    @Test()
    void reverse11WhenJGreaterThanI() {
        /* Branches:
         * (array == null) : false
         * (j > i) : true
         */
        //Arrange Statement(s)
        int[] intArray = new int[]{1, 0};

        //Act Statement(s)
        ArrayUtils.reverse(intArray, -1, 2);
        int[] intIntArrayArray = new int[]{0, 1};

        //Assert statement(s)
        assertAll("result", () -> assertThat(intArray, equalTo(intIntArrayArray)));
    }

    //Sapient generated method id: ${446f5bf3-68df-3406-84ac-7c811eda3c87}
    @Test()
    void reverse12WhenArrayIsNotNull() {
        /* Branches:
         * (array != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.reverse(longArray, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.reverse(longArray);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.reverse(longArray, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${5554cccf-2587-3bd8-9c16-e1d7f1f6d87d}
    @Test()
    void reverse13WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        long[] _long = null;

        //Act Statement(s)
        ArrayUtils.reverse(_long, 0, 0);
    }

    //Sapient generated method id: ${4dce335d-6810-387e-b5aa-a7a622926139}
    @Test()
    void reverse13WhenJGreaterThanI() {
        /* Branches:
         * (array == null) : false
         * (j > i) : true
         */
        //Arrange Statement(s)
        long[] longArray = new long[]{1L, 0L};

        //Act Statement(s)
        ArrayUtils.reverse(longArray, -1, 2);
        long[] longLongArrayArray = new long[]{0L, 1L};

        //Assert statement(s)
        assertAll("result", () -> assertThat(longArray, equalTo(longLongArrayArray)));
    }

    //Sapient generated method id: ${f0dcc690-0402-3bc0-b54f-4f30489187bf}
    @Test()
    void reverse14WhenArrayIsNotNull() {
        /* Branches:
         * (array != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.reverse(objectArray, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.reverse(objectArray);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.reverse(objectArray, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${012ebca8-91f0-38c1-a5cd-002ffb656516}
    @Test()
    void reverse15WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Object[] object = null;

        //Act Statement(s)
        ArrayUtils.reverse(object, 0, 0);
    }

    //Sapient generated method id: ${24e05b2f-1839-3f0b-b5b3-8b830befeaed}
    @Test()
    void reverse15WhenJGreaterThanI() {
        /* Branches:
         * (array == null) : false
         * (j > i) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Object[] objectArray = new Object[]{object, object2};

        //Act Statement(s)
        ArrayUtils.reverse(objectArray, -1, 2);
    }

    //Sapient generated method id: ${51688acc-2350-3117-a4cc-eb0378f6c30a}
    @Test()
    void reverse16WhenArrayIsNotNull() {
        /* Branches:
         * (array != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.reverse(shortArray, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.reverse(shortArray);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.reverse(shortArray, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${4af62c94-cc2d-395e-be18-ebe6e9ae6d95}
    @Test()
    void reverse17WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        short[] _short = null;

        //Act Statement(s)
        ArrayUtils.reverse(_short, 0, 0);
    }

    //Sapient generated method id: ${1c122263-bec6-3438-b7e9-d72ea6b83ed4}
    @Test()
    void reverse17WhenJGreaterThanI() {
        /* Branches:
         * (array == null) : false
         * (j > i) : true
         */
        //Arrange Statement(s)
        short[] shortArray = new short[]{(short) 1, (short) 0};

        //Act Statement(s)
        ArrayUtils.reverse(shortArray, -1, 2);
        short[] shortShortArrayArray = new short[]{(short) 0, (short) 1};

        //Assert statement(s)
        assertAll("result", () -> assertThat(shortArray, equalTo(shortShortArrayArray)));
    }

    //Sapient generated method id: ${1d1b617c-f4a7-33d5-ab45-efd5f4e660ba}
    @Test()
    void setAllWhenGeneratorIsNotNull() {
        /* Branches:
         * (array != null) : true
         * (generator != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        //TODO: Needs initialization with real value
        IntFunction<Object> intFunction = null;

        //Act Statement(s)
        Object[] result = ArrayUtils.setAll(objectArray, intFunction);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectArray)));
    }

    //Sapient generated method id: ${68c1c502-815f-358c-9403-81a7e7ea169c}
    @Test()
    void setAll1WhenILessThanArrayLength() {
        /* Branches:
         * (array != null) : true
         * (generator != null) : true
         * (i < array.length) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object[] objectArray = new Object[]{object};
        //TODO: Needs initialization with real value
        Supplier<Object> supplier = null;

        //Act Statement(s)
        Object[] result = ArrayUtils.setAll(objectArray, supplier);
        Object object2 = new Object();
        Object[] objectResultArray = new Object[]{object2};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectResultArray)));
    }

    //Sapient generated method id: ${0df955fe-9520-35c7-ab90-3cf3bf249783}
    @Test()
    void shiftWhenArrayIsNotNull() {
        /* Branches:
         * (array != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.shift(booleanArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(booleanArray, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.shift(booleanArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${f852b464-e4d1-3625-96bf-1689efd83797}
    @Test()
    void shift1WhenEndIndexExclusiveLessThanOrEqualsTo0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : true
         */
        //Arrange Statement(s)
        boolean[] booleanArray = new boolean[]{};

        //Act Statement(s)
        ArrayUtils.shift(booleanArray, -2, 0, 0);
    }

    //Sapient generated method id: ${4eea454d-d506-3ef2-a366-e7f746e6683c}
    @Test()
    void shift1WhenNLessThanOrEqualsTo1() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : true
         */
        //Arrange Statement(s)
        boolean[] booleanArray = new boolean[]{};

        //Act Statement(s)
        ArrayUtils.shift(booleanArray, -2, 1, 0);
    }

    //Sapient generated method id: ${5b4461ed-8cb5-3070-862f-9b7cbe5d3e90}
    @Test()
    void shift1WhenOffsetGreaterThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.swap(booleanArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(booleanArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(booleanArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${63274d52-4530-3bf4-b9b3-356728677841}
    @Test()
    void shift1WhenOffsetLessThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : false
         * (offset < nOffset) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.swap(booleanArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(booleanArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(booleanArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${2afd4b1f-aa35-3f78-99be-c3d2a7772eff}
    @Test()
    void shift1WhenOffsetNotLessThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : false
         * (offset < nOffset) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.swap(booleanArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(booleanArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(booleanArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${491f5925-098c-35da-94d4-0c267db5a75e}
    @Test()
    void shift2WhenArrayIsNotNull() {
        /* Branches:
         * (array != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.shift(byteArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(byteArray, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.shift(byteArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${460501d0-bbc5-3063-a95b-e16935600258}
    @Test()
    void shift3WhenEndIndexExclusiveLessThanOrEqualsTo0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        ArrayUtils.shift(byteArray, -2, 0, 0);
    }

    //Sapient generated method id: ${2e2c48ec-173e-3b5d-a4ab-df169e6212a0}
    @Test()
    void shift3WhenNLessThanOrEqualsTo1() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        ArrayUtils.shift(byteArray, -2, 1, 0);
    }

    //Sapient generated method id: ${70fa8232-3c61-3665-b91d-0b7eb592c71b}
    @Test()
    void shift3WhenOffsetGreaterThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.swap(byteArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(byteArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(byteArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${00dc8d07-9bf6-3078-a254-4694c4e5bcf4}
    @Test()
    void shift3WhenOffsetLessThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : false
         * (offset < nOffset) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.swap(byteArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(byteArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(byteArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${cfaf5271-9e99-3b50-86fd-29639e6051e7}
    @Test()
    void shift3WhenOffsetNotLessThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : false
         * (offset < nOffset) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.swap(byteArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(byteArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(byteArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${d2800dfe-3c6b-38a0-98d4-8a7f78fafa11}
    @Test()
    void shift4WhenArrayIsNotNull() {
        /* Branches:
         * (array != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.shift(charArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(charArray, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.shift(charArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${5dd7b7bb-3b44-3a4e-901c-83298b9a44be}
    @Test()
    void shift5WhenEndIndexExclusiveLessThanOrEqualsTo0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : true
         */
        //Arrange Statement(s)
        char[] charArray = new char[]{};

        //Act Statement(s)
        ArrayUtils.shift(charArray, -2, 0, 0);
    }

    //Sapient generated method id: ${cbf1d130-aaad-3416-8540-371dc03054c7}
    @Test()
    void shift5WhenNLessThanOrEqualsTo1() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : true
         */
        //Arrange Statement(s)
        char[] charArray = new char[]{};

        //Act Statement(s)
        ArrayUtils.shift(charArray, -2, 1, 0);
    }

    //Sapient generated method id: ${7f6c3d16-b674-35af-bd06-a237ea8a95a1}
    @Test()
    void shift5WhenOffsetGreaterThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.swap(charArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(charArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(charArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${7854ac56-983f-38f3-90db-fe16af91cd87}
    @Test()
    void shift5WhenOffsetLessThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : false
         * (offset < nOffset) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.swap(charArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(charArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(charArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${d3d3a666-3e0e-3bb3-b1bf-dc2379e9219e}
    @Test()
    void shift5WhenOffsetNotLessThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : false
         * (offset < nOffset) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.swap(charArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(charArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(charArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${109a929b-40b4-315e-8681-dfb77988b70f}
    @Test()
    void shift6WhenArrayIsNotNull() {
        /* Branches:
         * (array != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.shift(doubleArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(doubleArray, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.shift(doubleArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${4aea15fc-5da0-3daa-ba06-e24d20166322}
    @Test()
    void shift7WhenEndIndexExclusiveLessThanOrEqualsTo0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : true
         */
        //Arrange Statement(s)
        double[] doubleArray = new double[]{};

        //Act Statement(s)
        ArrayUtils.shift(doubleArray, -2, 0, 0);
    }

    //Sapient generated method id: ${4c5c3a14-954f-3410-b65d-90e1b7dba9d9}
    @Test()
    void shift7WhenNLessThanOrEqualsTo1() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : true
         */
        //Arrange Statement(s)
        double[] doubleArray = new double[]{};

        //Act Statement(s)
        ArrayUtils.shift(doubleArray, -2, 1, 0);
    }

    //Sapient generated method id: ${7185bfc8-e495-3de0-a957-096f5c13b246}
    @Test()
    void shift7WhenOffsetGreaterThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.swap(doubleArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(doubleArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(doubleArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${2aa28fe5-eb0d-316d-89d5-3ef5d6ea60db}
    @Test()
    void shift7WhenOffsetLessThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : false
         * (offset < nOffset) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.swap(doubleArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(doubleArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(doubleArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${09f64775-d941-3f68-8c73-bbd970eb1b75}
    @Test()
    void shift7WhenOffsetNotLessThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : false
         * (offset < nOffset) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.swap(doubleArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(doubleArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(doubleArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${85fa143a-3afa-3f1f-8fc9-4d9aa1b11162}
    @Test()
    void shift8WhenArrayIsNotNull() {
        /* Branches:
         * (array != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.shift(floatArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(floatArray, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.shift(floatArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${33977a1f-cb8a-3657-a2e0-74e90814f16f}
    @Test()
    void shift9WhenEndIndexExclusiveLessThanOrEqualsTo0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : true
         */
        //Arrange Statement(s)
        float[] floatArray = new float[]{};

        //Act Statement(s)
        ArrayUtils.shift(floatArray, -2, 0, 0);
    }

    //Sapient generated method id: ${f751132f-dfd4-3736-a498-168fe4f1c544}
    @Test()
    void shift9WhenNLessThanOrEqualsTo1() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : true
         */
        //Arrange Statement(s)
        float[] floatArray = new float[]{};

        //Act Statement(s)
        ArrayUtils.shift(floatArray, -2, 1, 0);
    }

    //Sapient generated method id: ${8f6fece0-5855-3b83-9d3e-ad3831f35a5d}
    @Test()
    void shift9WhenOffsetGreaterThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.swap(floatArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(floatArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(floatArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${7a5d8af2-01ac-360a-a1af-014d5af61c1f}
    @Test()
    void shift9WhenOffsetLessThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : false
         * (offset < nOffset) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.swap(floatArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(floatArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(floatArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${984a228f-309b-3ff8-b6df-2c6729ce4efe}
    @Test()
    void shift9WhenOffsetNotLessThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : false
         * (offset < nOffset) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.swap(floatArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(floatArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(floatArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${047dcb21-af99-307d-a8a0-5a9133a496b6}
    @Test()
    void shift10WhenArrayIsNotNull() {
        /* Branches:
         * (array != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.shift(intArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(intArray, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.shift(intArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${c3c4af75-17aa-359f-a924-0f9dd3b322ad}
    @Test()
    void shift11WhenEndIndexExclusiveLessThanOrEqualsTo0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : true
         */
        //Arrange Statement(s)
        int[] intArray = new int[]{};

        //Act Statement(s)
        ArrayUtils.shift(intArray, -2, 0, 0);
    }

    //Sapient generated method id: ${797345b8-35c3-34e6-945f-6ad1ef6a4c89}
    @Test()
    void shift11WhenNLessThanOrEqualsTo1() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : true
         */
        //Arrange Statement(s)
        int[] intArray = new int[]{};

        //Act Statement(s)
        ArrayUtils.shift(intArray, -2, 1, 0);
    }

    //Sapient generated method id: ${52249807-1602-37ab-9eef-e3c5dc38d4c2}
    @Test()
    void shift11WhenOffsetGreaterThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.swap(intArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(intArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(intArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${92a8e6d9-f266-3727-9dc5-137e5a2a344e}
    @Test()
    void shift11WhenOffsetLessThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : false
         * (offset < nOffset) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.swap(intArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(intArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(intArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${0c507af2-f4c9-38e9-bed6-9d1edca55ccb}
    @Test()
    void shift11WhenOffsetNotLessThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : false
         * (offset < nOffset) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.swap(intArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(intArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(intArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${fafab990-c3c2-344f-accd-111f70bc23d4}
    @Test()
    void shift12WhenArrayIsNotNull() {
        /* Branches:
         * (array != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.shift(longArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(longArray, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.shift(longArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${7153a731-d799-3e08-abc6-be1e1fe084f5}
    @Test()
    void shift13WhenEndIndexExclusiveLessThanOrEqualsTo0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : true
         */
        //Arrange Statement(s)
        long[] longArray = new long[]{};

        //Act Statement(s)
        ArrayUtils.shift(longArray, -2, 0, 0);
    }

    //Sapient generated method id: ${d6e26476-983b-34c4-b58a-7edf9974cdb1}
    @Test()
    void shift13WhenNLessThanOrEqualsTo1() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : true
         */
        //Arrange Statement(s)
        long[] longArray = new long[]{};

        //Act Statement(s)
        ArrayUtils.shift(longArray, -2, 1, 0);
    }

    //Sapient generated method id: ${974aabef-1284-3b08-8b3d-0e395d7d7035}
    @Test()
    void shift13WhenOffsetGreaterThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.swap(longArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(longArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(longArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${e1cf29c8-cabc-34cc-bb2e-65973c8ab380}
    @Test()
    void shift13WhenOffsetLessThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : false
         * (offset < nOffset) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.swap(longArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(longArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(longArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${f90e9ab8-3e98-3d1f-9cac-ad63d7a1dee6}
    @Test()
    void shift13WhenOffsetNotLessThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : false
         * (offset < nOffset) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.swap(longArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(longArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(longArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${8568a91d-f52e-3221-b288-eb50e55534ea}
    @Test()
    void shift14WhenArrayIsNotNull() {
        /* Branches:
         * (array != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.shift(objectArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(objectArray, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.shift(objectArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${bc92c55d-b359-3ffc-9436-5d907708be36}
    @Test()
    void shift15WhenEndIndexExclusiveLessThanOrEqualsTo0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : true
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};

        //Act Statement(s)
        ArrayUtils.shift(objectArray, -2, 0, 0);
    }

    //Sapient generated method id: ${f4fedf54-cff7-3cea-b5e8-355b3eab44e3}
    @Test()
    void shift15WhenNLessThanOrEqualsTo1() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : true
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};

        //Act Statement(s)
        ArrayUtils.shift(objectArray, -2, 1, 0);
    }

    //Sapient generated method id: ${ca157ba6-b967-37c3-9af8-ce4375267067}
    @Test()
    void shift15WhenOffsetGreaterThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.swap(objectArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(objectArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(objectArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${e0ce3c86-6cbb-314a-bf7f-7f0c81d8531d}
    @Test()
    void shift15WhenOffsetLessThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : false
         * (offset < nOffset) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.swap(objectArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(objectArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(objectArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${1409a320-90ac-30c4-84f9-4d030f370519}
    @Test()
    void shift15WhenOffsetNotLessThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : false
         * (offset < nOffset) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.swap(objectArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(objectArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(objectArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${5e10526b-91cd-3a60-8831-65dc5e955aca}
    @Test()
    void shift16WhenArrayIsNotNull() {
        /* Branches:
         * (array != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.shift(shortArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(shortArray, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.shift(shortArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${f4c5998c-6375-32dc-94e8-4b63b562ee27}
    @Test()
    void shift17WhenEndIndexExclusiveLessThanOrEqualsTo0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : true
         */
        //Arrange Statement(s)
        short[] shortArray = new short[]{};

        //Act Statement(s)
        ArrayUtils.shift(shortArray, -2, 0, 0);
    }

    //Sapient generated method id: ${65681fe3-5366-30c2-8edc-ce49d61bed63}
    @Test()
    void shift17WhenNLessThanOrEqualsTo1() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : true
         */
        //Arrange Statement(s)
        short[] shortArray = new short[]{};

        //Act Statement(s)
        ArrayUtils.shift(shortArray, -2, 1, 0);
    }

    //Sapient generated method id: ${0eb2a985-b766-3c4c-95d8-31ea97c23976}
    @Test()
    void shift17WhenOffsetGreaterThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.swap(shortArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(shortArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(shortArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${0a7f20a9-ce02-3ed4-9abc-9d512951bc24}
    @Test()
    void shift17WhenOffsetLessThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : false
         * (offset < nOffset) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.swap(shortArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(shortArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(shortArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${abc1f460-cab1-38cf-b5c9-948f11ec91a2}
    @Test()
    void shift17WhenOffsetNotLessThanNOffset() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive >= array.length - 1) : false
         * (endIndexExclusive <= 0) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive >= array.length) : true
         * (n <= 1) : false
         * (offset < 0) : true
         * (n > 1) : true
         * (offset > 0) : true
         * (offset > nOffset) : false
         * (offset < nOffset) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.swap(shortArray, 0, 0, 0)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shift(shortArray, 0, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(shortArray, 0, 0, 0), atLeast(1)));
        }
    }

    //Sapient generated method id: ${94e11664-1329-38b4-a532-f8af1fe60695}
    @Test()
    void shuffleTest() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.shuffle(eq(booleanArray), (ThreadLocalRandom) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shuffle(booleanArray);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.shuffle(eq(booleanArray), (ThreadLocalRandom) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${9a0db6a3-58c0-3034-8328-7d5b3787f5e5}
    @Test()
    void shuffle1WhenIGreaterThan1() {
        /* Branches:
         * (i > 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{true, false, true, false};
            arrayUtils.when(() -> ArrayUtils.swap(booleanArray, 3, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            arrayUtils.when(() -> ArrayUtils.swap(booleanArray, 2, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            arrayUtils.when(() -> ArrayUtils.swap(booleanArray, 1, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            Random random = new Random();
            //Act Statement(s)
            ArrayUtils.shuffle(booleanArray, random);
            //Assert statement(s)
            assertAll("result", () -> {
                arrayUtils.verify(() -> ArrayUtils.swap(booleanArray, 3, 0, 1), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.swap(booleanArray, 2, 0, 1), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.swap(booleanArray, 1, 0, 1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8002b5c5-cd9a-3a1b-aa27-d129753df597}
    @Test()
    void shuffle2Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.shuffle(eq(byteArray), (ThreadLocalRandom) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shuffle(byteArray);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.shuffle(eq(byteArray), (ThreadLocalRandom) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${6ffe3bce-402e-35d2-b805-8aa5f8efa730}
    @Test()
    void shuffle3WhenIGreaterThan1() {
        /* Branches:
         * (i > 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 1, (byte) 2};
            arrayUtils.when(() -> ArrayUtils.swap(byteArray, 1, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            Random random = new Random();
            //Act Statement(s)
            ArrayUtils.shuffle(byteArray, random);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(byteArray, 1, 0, 1), atLeast(1)));
        }
    }

    //Sapient generated method id: ${b76c9665-15cb-3bef-82ff-2f8b4a726d7f}
    @Test()
    void shuffle4Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.shuffle(eq(charArray), (ThreadLocalRandom) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shuffle(charArray);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.shuffle(eq(charArray), (ThreadLocalRandom) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${9aec57cb-b906-3977-9ebc-a6b2b33b5a0e}
    @Test()
    void shuffle5WhenIGreaterThan1() {
        /* Branches:
         * (i > 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{'a', 'b'};
            arrayUtils.when(() -> ArrayUtils.swap(charArray, 1, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            Random random = new Random();
            //Act Statement(s)
            ArrayUtils.shuffle(charArray, random);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(charArray, 1, 0, 1), atLeast(1)));
        }
    }

    //Sapient generated method id: ${06ea9ec3-6caf-37ee-935e-27f72a811777}
    @Test()
    void shuffle6Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.shuffle(eq(doubleArray), (ThreadLocalRandom) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shuffle(doubleArray);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.shuffle(eq(doubleArray), (ThreadLocalRandom) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${957f4403-f3ba-3f22-b21b-189250cf00cd}
    @Test()
    void shuffle7WhenIGreaterThan1() {
        /* Branches:
         * (i > 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{Double.parseDouble("1.0"), Double.parseDouble("2.0")};
            arrayUtils.when(() -> ArrayUtils.swap(doubleArray, 1, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            Random random = new Random();
            //Act Statement(s)
            ArrayUtils.shuffle(doubleArray, random);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(doubleArray, 1, 0, 1), atLeast(1)));
        }
    }

    //Sapient generated method id: ${468a2b86-1645-3676-b6ce-3af90d42369c}
    @Test()
    void shuffle8Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.shuffle(eq(floatArray), (ThreadLocalRandom) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shuffle(floatArray);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.shuffle(eq(floatArray), (ThreadLocalRandom) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${65b1149e-d842-37e8-aa7b-e306e3d36763}
    @Test()
    void shuffle9WhenIGreaterThan1() {
        /* Branches:
         * (i > 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{Float.parseFloat("1.0"), Float.parseFloat("2.0"), Float.parseFloat("3.0")};
            arrayUtils.when(() -> ArrayUtils.swap(floatArray, 2, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            arrayUtils.when(() -> ArrayUtils.swap(floatArray, 1, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            Random random = new Random();
            //Act Statement(s)
            ArrayUtils.shuffle(floatArray, random);
            //Assert statement(s)
            assertAll("result", () -> {
                arrayUtils.verify(() -> ArrayUtils.swap(floatArray, 2, 0, 1), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.swap(floatArray, 1, 0, 1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6357d80b-b28f-3463-bbfe-1e4630f8857e}
    @Test()
    void shuffle10Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.shuffle(eq(intArray), (ThreadLocalRandom) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shuffle(intArray);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.shuffle(eq(intArray), (ThreadLocalRandom) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${d6dab0bd-4bad-3f1f-83b8-8f92075a37a8}
    @Test()
    void shuffle11WhenIGreaterThan1() {
        /* Branches:
         * (i > 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{1, 2, 3, 4, 5};
            arrayUtils.when(() -> ArrayUtils.swap(intArray, 4, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            arrayUtils.when(() -> ArrayUtils.swap(intArray, 3, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            arrayUtils.when(() -> ArrayUtils.swap(intArray, 2, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            arrayUtils.when(() -> ArrayUtils.swap(intArray, 1, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            Random random = new Random();
            //Act Statement(s)
            ArrayUtils.shuffle(intArray, random);
            //Assert statement(s)
            assertAll("result", () -> {
                arrayUtils.verify(() -> ArrayUtils.swap(intArray, 4, 0, 1), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.swap(intArray, 3, 0, 1), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.swap(intArray, 2, 0, 1), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.swap(intArray, 1, 0, 1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9ff32b42-7e48-3e37-a082-13c77190eafa}
    @Test()
    void shuffle12Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.shuffle(eq(longArray), (ThreadLocalRandom) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shuffle(longArray);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.shuffle(eq(longArray), (ThreadLocalRandom) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${8efefbd8-7d7f-3dd3-b321-3b06f100389c}
    @Test()
    void shuffle13WhenIGreaterThan1() {
        /* Branches:
         * (i > 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{1L, 2L, 3L, 4L, 5L};
            arrayUtils.when(() -> ArrayUtils.swap(longArray, 4, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            arrayUtils.when(() -> ArrayUtils.swap(longArray, 3, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            arrayUtils.when(() -> ArrayUtils.swap(longArray, 2, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            arrayUtils.when(() -> ArrayUtils.swap(longArray, 1, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            Random random = new Random();
            //Act Statement(s)
            ArrayUtils.shuffle(longArray, random);
            //Assert statement(s)
            assertAll("result", () -> {
                arrayUtils.verify(() -> ArrayUtils.swap(longArray, 4, 0, 1), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.swap(longArray, 3, 0, 1), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.swap(longArray, 2, 0, 1), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.swap(longArray, 1, 0, 1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6e204345-3690-3895-8d65-6e96c79e951b}
    @Test()
    void shuffle14Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.shuffle(eq(objectArray), (ThreadLocalRandom) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shuffle(objectArray);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.shuffle(eq(objectArray), (ThreadLocalRandom) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${43f908ef-2136-3bd2-b0fb-4b5b653902ae}
    @Test()
    void shuffle15WhenIGreaterThan1() {
        /* Branches:
         * (i > 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{(Object) null, (Object) null, (Object) null};
            arrayUtils.when(() -> ArrayUtils.swap(objectArray, 2, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            arrayUtils.when(() -> ArrayUtils.swap(objectArray, 1, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            Random random = new Random();
            //Act Statement(s)
            ArrayUtils.shuffle(objectArray, random);
            //Assert statement(s)
            assertAll("result", () -> {
                arrayUtils.verify(() -> ArrayUtils.swap(objectArray, 2, 0, 1), atLeast(1));
                arrayUtils.verify(() -> ArrayUtils.swap(objectArray, 1, 0, 1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6a0650ff-b97e-362a-b199-c90ee192e051}
    @Test()
    void shuffle16Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.shuffle(eq(shortArray), (ThreadLocalRandom) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.shuffle(shortArray);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.shuffle(eq(shortArray), (ThreadLocalRandom) any()), atLeast(1)));
        }
    }

    //Sapient generated method id: ${24e5e520-cda0-301e-bc78-2b1c5531a0be}
    @Test()
    void shuffle17WhenIGreaterThan1() {
        /* Branches:
         * (i > 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{(short) 1, (short) 2};
            arrayUtils.when(() -> ArrayUtils.swap(shortArray, 1, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            Random random = new Random();
            //Act Statement(s)
            ArrayUtils.shuffle(shortArray, random);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(shortArray, 1, 0, 1), atLeast(1)));
        }
    }

    //Sapient generated method id: ${144c238a-2dae-301a-b37c-11b63d074d20}
    @Test()
    void subarrayWhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        boolean[] _boolean = null;

        //Act Statement(s)
        boolean[] result = ArrayUtils.subarray(_boolean, 0, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${9d051fc1-02a7-34ba-8209-5840ff356253}
    @Test()
    void subarrayWhenNewSizeLessThanOrEqualsTo0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive > array.length) : true
         * (newSize <= 0) : true
         */
        //Arrange Statement(s)
        boolean[] booleanArray = new boolean[]{};

        //Act Statement(s)
        boolean[] result = ArrayUtils.subarray(booleanArray, -1, 1);
        boolean[] booleanResultArray = new boolean[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(booleanResultArray)));
    }

    //Sapient generated method id: ${1c385c85-c31c-3678-ac1f-6c4c5d18b074}
    @Test()
    void subarrayWhenNewSizeGreaterThan0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive > array.length) : true
         * (newSize <= 0) : false
         */
        //Arrange Statement(s)
        boolean[] booleanArray = new boolean[]{false};

        //Act Statement(s)
        boolean[] result = ArrayUtils.subarray(booleanArray, -1, 2);
        boolean[] booleanResultArray = new boolean[]{false};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(booleanResultArray)));
    }

    //Sapient generated method id: ${adadd9b3-697a-35d8-9b4a-48393e08381e}
    @Test()
    void subarray1WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        byte[] _byte = null;

        //Act Statement(s)
        byte[] result = ArrayUtils.subarray(_byte, 0, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${3606fa4f-8401-3d2d-a916-663d3d472f42}
    @Test()
    void subarray1WhenNewSizeLessThanOrEqualsTo0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive > array.length) : true
         * (newSize <= 0) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        byte[] result = ArrayUtils.subarray(byteArray, -1, 1);
        byte[] byteResultArray = new byte[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //Sapient generated method id: ${aea6b98b-abc0-366b-a807-2bb9b9aa64ca}
    @Test()
    void subarray1WhenNewSizeGreaterThan0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive > array.length) : true
         * (newSize <= 0) : false
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) 0};

        //Act Statement(s)
        byte[] result = ArrayUtils.subarray(byteArray, -1, 2);
        byte[] byteResultArray = new byte[]{(byte) 0};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //Sapient generated method id: ${22a10f99-2da3-394e-8aa9-6048a4cf8ff9}
    @Test()
    void subarray2WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        char[] _char = null;

        //Act Statement(s)
        char[] result = ArrayUtils.subarray(_char, 0, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${c79ae49d-e2e0-353e-9db7-d3e1601b68eb}
    @Test()
    void subarray2WhenNewSizeLessThanOrEqualsTo0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive > array.length) : true
         * (newSize <= 0) : true
         */
        //Arrange Statement(s)
        char[] charArray = new char[]{};

        //Act Statement(s)
        char[] result = ArrayUtils.subarray(charArray, -1, 1);
        char[] charResultArray = new char[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charResultArray)));
    }

    //Sapient generated method id: ${4f4db014-0d8d-3a51-9689-d318f4cc8a5d}
    @Test()
    void subarray2WhenNewSizeGreaterThan0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive > array.length) : true
         * (newSize <= 0) : false
         */
        //Arrange Statement(s)
        char[] charArray = new char[]{'A'};

        //Act Statement(s)
        char[] result = ArrayUtils.subarray(charArray, -1, 2);
        char[] charResultArray = new char[]{'\u0000'};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charResultArray)));
    }

    //Sapient generated method id: ${c406ac57-0bd2-31fa-913d-659f21804e96}
    @Test()
    void subarray3WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        double[] _double = null;

        //Act Statement(s)
        double[] result = ArrayUtils.subarray(_double, 0, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${c1f0a98c-963a-3a14-9501-3f37831b034a}
    @Test()
    void subarray3WhenNewSizeLessThanOrEqualsTo0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive > array.length) : true
         * (newSize <= 0) : true
         */
        //Arrange Statement(s)
        double[] doubleArray = new double[]{};

        //Act Statement(s)
        double[] result = ArrayUtils.subarray(doubleArray, -1, 1);
        double[] doubleResultArray = new double[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(doubleResultArray)));
    }

    //Sapient generated method id: ${a0e000f1-697f-3c0a-a6f7-0ee8b28feda2}
    @Test()
    void subarray3WhenNewSizeGreaterThan0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive > array.length) : true
         * (newSize <= 0) : false
         */
        //Arrange Statement(s)
        double[] doubleArray = new double[]{Double.parseDouble("0")};

        //Act Statement(s)
        double[] result = ArrayUtils.subarray(doubleArray, -1, 2);
        double[] doubleResultArray = new double[]{Double.parseDouble("0.0")};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(doubleResultArray)));
    }

    //Sapient generated method id: ${6345bc4d-d6c0-3b9c-810b-129e4c05eb4a}
    @Test()
    void subarray4WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        float[] _float = null;

        //Act Statement(s)
        float[] result = ArrayUtils.subarray(_float, 0, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${6fe95ba2-4fe5-3519-8e47-d7c2ce579451}
    @Test()
    void subarray4WhenNewSizeLessThanOrEqualsTo0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive > array.length) : true
         * (newSize <= 0) : true
         */
        //Arrange Statement(s)
        float[] floatArray = new float[]{};

        //Act Statement(s)
        float[] result = ArrayUtils.subarray(floatArray, -1, 1);
        float[] floatResultArray = new float[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(floatResultArray)));
    }

    //Sapient generated method id: ${176ddfb7-afef-37e2-9793-3e3cd9ef49b6}
    @Test()
    void subarray4WhenNewSizeGreaterThan0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive > array.length) : true
         * (newSize <= 0) : false
         */
        //Arrange Statement(s)
        float[] floatArray = new float[]{Float.parseFloat("0")};

        //Act Statement(s)
        float[] result = ArrayUtils.subarray(floatArray, -1, 2);
        float[] floatResultArray = new float[]{Float.parseFloat("0.0")};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(floatResultArray)));
    }

    //Sapient generated method id: ${84893f29-5742-34f1-bea5-7d3594462029}
    @Test()
    void subarray5WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        int[] _int = null;

        //Act Statement(s)
        int[] result = ArrayUtils.subarray(_int, 0, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${022f52e9-7cb3-38c2-8bee-f6df5854c4c8}
    @Test()
    void subarray5WhenNewSizeLessThanOrEqualsTo0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive > array.length) : true
         * (newSize <= 0) : true
         */
        //Arrange Statement(s)
        int[] intArray = new int[]{};

        //Act Statement(s)
        int[] result = ArrayUtils.subarray(intArray, -1, 1);
        int[] intResultArray = new int[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(intResultArray)));
    }

    //Sapient generated method id: ${5efcd230-4547-3942-8143-2edbb174724d}
    @Test()
    void subarray5WhenNewSizeGreaterThan0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive > array.length) : true
         * (newSize <= 0) : false
         */
        //Arrange Statement(s)
        int[] intArray = new int[]{0};

        //Act Statement(s)
        int[] result = ArrayUtils.subarray(intArray, -1, 2);
        int[] intResultArray = new int[]{0};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(intResultArray)));
    }

    //Sapient generated method id: ${1394bb73-158b-3c10-8894-9bb207f64586}
    @Test()
    void subarray6WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        long[] _long = null;

        //Act Statement(s)
        long[] result = ArrayUtils.subarray(_long, 0, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${fc65f0a4-389c-3aa0-9b35-29ad6265e1b5}
    @Test()
    void subarray6WhenNewSizeLessThanOrEqualsTo0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive > array.length) : true
         * (newSize <= 0) : true
         */
        //Arrange Statement(s)
        long[] longArray = new long[]{};

        //Act Statement(s)
        long[] result = ArrayUtils.subarray(longArray, -1, 1);
        long[] longResultArray = new long[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longResultArray)));
    }

    //Sapient generated method id: ${97418e4f-057e-38e9-8f51-12a7ba6b55ec}
    @Test()
    void subarray6WhenNewSizeGreaterThan0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive > array.length) : true
         * (newSize <= 0) : false
         */
        //Arrange Statement(s)
        long[] longArray = new long[]{0L};

        //Act Statement(s)
        long[] result = ArrayUtils.subarray(longArray, -1, 2);
        long[] longResultArray = new long[]{0L};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longResultArray)));
    }

    //Sapient generated method id: ${b3845488-5975-31c3-8f38-3dce332ecfa5}
    @Test()
    void subarray7WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        short[] _short = null;

        //Act Statement(s)
        short[] result = ArrayUtils.subarray(_short, 0, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${481b134c-e96e-3a2f-9797-0f9ed8afd296}
    @Test()
    void subarray7WhenNewSizeLessThanOrEqualsTo0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive > array.length) : true
         * (newSize <= 0) : true
         */
        //Arrange Statement(s)
        short[] shortArray = new short[]{};

        //Act Statement(s)
        short[] result = ArrayUtils.subarray(shortArray, -1, 1);
        short[] shortResultArray = new short[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(shortResultArray)));
    }

    //Sapient generated method id: ${51a98315-3f3e-37d9-9b2f-70e84c0681f3}
    @Test()
    void subarray7WhenNewSizeGreaterThan0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive > array.length) : true
         * (newSize <= 0) : false
         */
        //Arrange Statement(s)
        short[] shortArray = new short[]{(short) 0};

        //Act Statement(s)
        short[] result = ArrayUtils.subarray(shortArray, -1, 2);
        short[] shortResultArray = new short[]{(short) 0};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(shortResultArray)));
    }

    //Sapient generated method id: ${91da51f9-e7dd-3342-af99-d11acf022294}
    @Test()
    void subarray8WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Object[] object = null;

        //Act Statement(s)
        Object[] result = ArrayUtils.subarray(object, 0, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${ea1d8f0a-7420-3fae-804a-3341f71fed43}
    @Test()
    void subarray8WhenNewSizeLessThanOrEqualsTo0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive > array.length) : true
         * (newSize <= 0) : true
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};

        //Act Statement(s)
        Object[] result = ArrayUtils.subarray(objectArray, -1, 1);
        Object object = Array.newInstance(Object.class, 0);

        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${26260dff-9a79-3d28-8e9b-bddd6a8df16a}
    @Test()
    void subarray8WhenNewSizeGreaterThan0() {
        /* Branches:
         * (array == null) : false
         * (startIndexInclusive < 0) : true
         * (endIndexExclusive > array.length) : true
         * (newSize <= 0) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object[] objectArray = new Object[]{object};

        //Act Statement(s)
        Object[] result = ArrayUtils.subarray(objectArray, -1, 2);
        Object object2 = Array.newInstance(Object.class, 1);

        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object2)));
    }

    //Sapient generated method id: ${f49c3760-480d-3c79-a1e2-ed01dd333408}
    @Test()
    void swapTest() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.swap(booleanArray, 0, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.swap(booleanArray, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(booleanArray, 0, 0, 1), atLeast(1)));
        }
    }

    //Sapient generated method id: ${02c55c68-f2f9-3357-b071-abc54a2edbdb}
    @Test()
    void swap1WhenOffset2GreaterThanOrEqualsToArrayLength() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(booleanArray, -1, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${2aefa4fe-19ae-3db9-8cdc-860fa6796459}
    @Test()
    void swap1WhenILessThanLen() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : false
         * (offset1 < 0) : true
         * (offset2 < 0) : true
         * (i < len) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{false};
            arrayUtils.when(() -> ArrayUtils.isEmpty(booleanArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(booleanArray, -1, -1, 1);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.isEmpty(booleanArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${9d7cec3d-0786-3893-bee3-8ce7c63e2160}
    @Test()
    void swap2Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.swap(byteArray, 0, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.swap(byteArray, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(byteArray, 0, 0, 1), atLeast(1)));
        }
    }

    //Sapient generated method id: ${ee37500b-efca-3cea-bc5a-2dc90111633b}
    @Test()
    void swap3WhenOffset2GreaterThanOrEqualsToArrayLength() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(byteArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(byteArray, -1, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.isEmpty(byteArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${6e4f518e-771e-31e6-9165-afd8f7a3af40}
    @Test()
    void swap3WhenILessThanLen() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : false
         * (offset1 < 0) : true
         * (offset2 < 0) : true
         * (i < len) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{(byte) 0};
            arrayUtils.when(() -> ArrayUtils.isEmpty(byteArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(byteArray, -1, -1, 1);
            byte[] byteByteArrayArray = new byte[]{(byte) 0};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(byteArray, equalTo(byteByteArrayArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(byteArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0090f46f-168e-34e0-bfd7-95145d279a59}
    @Test()
    void swap4Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.swap(charArray, 0, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.swap(charArray, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(charArray, 0, 0, 1), atLeast(1)));
        }
    }

    //Sapient generated method id: ${7a91139e-1f55-3e66-8405-ec936d883dd0}
    @Test()
    void swap5WhenOffset2GreaterThanOrEqualsToArrayLength() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(charArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(charArray, -1, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.isEmpty(charArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${ba76bd16-33b5-3d39-9ab7-4138cc3488d6}
    @Test()
    void swap5WhenILessThanLen() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : false
         * (offset1 < 0) : true
         * (offset2 < 0) : true
         * (i < len) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{'A'};
            arrayUtils.when(() -> ArrayUtils.isEmpty(charArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(charArray, -1, -1, 1);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.isEmpty(charArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${efc6f5eb-3681-3cd7-bd82-aa36daf2150f}
    @Test()
    void swap6Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.swap(doubleArray, 0, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.swap(doubleArray, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(doubleArray, 0, 0, 1), atLeast(1)));
        }
    }

    //Sapient generated method id: ${dcf527ed-d8c6-3dc4-8bb0-c9b9a937fa64}
    @Test()
    void swap7WhenOffset2GreaterThanOrEqualsToArrayLength() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(doubleArray, -1, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${70a7955d-2859-3751-8f19-af30382f1ef2}
    @Test()
    void swap7WhenILessThanLen() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : false
         * (offset1 < 0) : true
         * (offset2 < 0) : true
         * (i < len) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{Double.parseDouble("0")};
            arrayUtils.when(() -> ArrayUtils.isEmpty(doubleArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(doubleArray, -1, -1, 1);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.isEmpty(doubleArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${d4485d1b-1195-34bb-80d9-063040b0cf44}
    @Test()
    void swap8Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.swap(floatArray, 0, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.swap(floatArray, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(floatArray, 0, 0, 1), atLeast(1)));
        }
    }

    //Sapient generated method id: ${5e1881c9-79b6-3f1d-b55a-271282a4d757}
    @Test()
    void swap9WhenOffset2GreaterThanOrEqualsToArrayLength() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(floatArray, -1, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${9e59777c-c848-30df-b68d-eca46b14b1a8}
    @Test()
    void swap9WhenILessThanLen() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : false
         * (offset1 < 0) : true
         * (offset2 < 0) : true
         * (i < len) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{Float.parseFloat("0")};
            arrayUtils.when(() -> ArrayUtils.isEmpty(floatArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(floatArray, -1, -1, 1);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.isEmpty(floatArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${cacb2d1a-cca8-3108-8ab2-2ac88b4974b0}
    @Test()
    void swap10Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.swap(intArray, 0, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.swap(intArray, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(intArray, 0, 0, 1), atLeast(1)));
        }
    }

    //Sapient generated method id: ${59dc607c-c4d4-3738-9c74-78363b19a401}
    @Test()
    void swap11WhenOffset2GreaterThanOrEqualsToArrayLength() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(intArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(intArray, -1, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.isEmpty(intArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${effadf45-d16f-36bb-bdfb-f1403e526b2a}
    @Test()
    void swap11WhenILessThanLen() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : false
         * (offset1 < 0) : true
         * (offset2 < 0) : true
         * (i < len) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{0};
            arrayUtils.when(() -> ArrayUtils.isEmpty(intArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(intArray, -1, -1, 1);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.isEmpty(intArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${bb0b9573-5ee5-3ea0-b42e-b9efa50ca97c}
    @Test()
    void swap12Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.swap(longArray, 0, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.swap(longArray, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(longArray, 0, 0, 1), atLeast(1)));
        }
    }

    //Sapient generated method id: ${45db0273-689b-34d0-8240-a30d4dcba3f1}
    @Test()
    void swap13WhenOffset2GreaterThanOrEqualsToArrayLength() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(longArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(longArray, -1, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.isEmpty(longArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${33cb3a25-c0ef-3997-9b92-40390dbd3f24}
    @Test()
    void swap13WhenILessThanLen() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : false
         * (offset1 < 0) : true
         * (offset2 < 0) : true
         * (i < len) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{0L};
            arrayUtils.when(() -> ArrayUtils.isEmpty(longArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(longArray, -1, -1, 1);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.isEmpty(longArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${a739b1c2-939b-39e0-ab3d-e6522ead7c33}
    @Test()
    void swap14Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.swap(objectArray, 0, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.swap(objectArray, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(objectArray, 0, 0, 1), atLeast(1)));
        }
    }

    //Sapient generated method id: ${a1d7aaac-6040-304f-b153-2c0254fb5fd0}
    @Test()
    void swap15WhenOffset2GreaterThanOrEqualsToArrayLength() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(objectArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(objectArray, -1, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.isEmpty(objectArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${3f381488-3a54-3155-b08f-0cc406c06bef}
    @Test()
    void swap15WhenILessThanLen() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : false
         * (offset1 < 0) : true
         * (offset2 < 0) : true
         * (i < len) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object[] objectArray = new Object[]{object};
            arrayUtils.when(() -> ArrayUtils.isEmpty(objectArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(objectArray, -1, -1, 1);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.isEmpty(objectArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${16c953fd-728c-396a-83b0-e520b6b2c086}
    @Test()
    void swap16Test() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.swap(shortArray, 0, 0, 1)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ArrayUtils.swap(shortArray, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.swap(shortArray, 0, 0, 1), atLeast(1)));
        }
    }

    //Sapient generated method id: ${604f1c7b-22ec-3899-b3d6-0810782e4794}
    @Test()
    void swap17WhenOffset2GreaterThanOrEqualsToArrayLength() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(shortArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(shortArray, -1, 0, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.isEmpty(shortArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${1112cd3d-410f-334f-af8b-78c27d19bafa}
    @Test()
    void swap17WhenOffset1EqualsOffset2() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : false
         * (offset1 < 0) : true
         * (offset2 < 0) : true
         * (offset1 == offset2) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{};
            arrayUtils.when(() -> ArrayUtils.isEmpty(shortArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(shortArray, -1, -1, 0);
            //Assert statement(s)
            assertAll("result", () -> arrayUtils.verify(() -> ArrayUtils.isEmpty(shortArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${470546e0-d305-3e57-a934-a28cea11f666}
    @Test()
    void swap17WhenILessThanLen() {
        /* Branches:
         * (isEmpty(array)) : false
         * (offset1 >= array.length) : false
         * (offset2 >= array.length) : false
         * (offset1 < 0) : true
         * (offset2 < 0) : false
         * (offset1 == offset2) : false
         * (i < len) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            short[] shortArray = new short[]{(short) 1, (short) 0};
            arrayUtils.when(() -> ArrayUtils.isEmpty(shortArray)).thenReturn(false);
            //Act Statement(s)
            ArrayUtils.swap(shortArray, -1, 1, 1);
            short[] shortShortArrayArray = new short[]{(short) 0, (short) 1};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(shortArray, equalTo(shortShortArrayArray));
                arrayUtils.verify(() -> ArrayUtils.isEmpty(shortArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d237bbaf-b248-312d-8608-292b0411608c}
    @Test()
    void toArrayTest() {
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};

        //Act Statement(s)
        Object[] result = ArrayUtils.toArray(objectArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectArray)));
    }

    //Sapient generated method id: ${85ad6b04-4285-363d-8a77-61c6155b4938}
    @Test()
    void toMapWhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Object[] object = null;

        //Act Statement(s)
        Map<Object, Object> result = ArrayUtils.toMap(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${29a1323c-a659-3ea4-8e46-14b007484309}
    @Test()
    void toMapWhenObjectInstanceOfMapEntry__() {
        /* Branches:
         * (array == null) : false
         * (i < array.length) : true
         * (object instanceof Map.Entry<?, ?>) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object[] objectArray = new Object[]{new AbstractMap.SimpleEntry<>(object, object2), object3};

        //Act Statement(s)
        Map<Object, Object> result = ArrayUtils.toMap(objectArray);
        Map<Object, Object> objectObjectResultMap = new HashMap<>(3);
        objectObjectResultMap.put(object, object2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectObjectResultMap)));
    }

    //Sapient generated method id: ${418dc9b5-df55-39a7-a9b7-e212c431aa45}
    @Test()
    void toMapWhenEntryLengthLessThan2ThrowsIllegalArgumentException() {
        /* Branches:
         * (array == null) : false
         * (i < array.length) : true
         * (object instanceof Map.Entry<?, ?>) : false
         * (object instanceof Object[]) : true
         * (entry.length < 2) : true
         */
        //Arrange Statement(s)
        Object objectMock = mock(Object.class, "toMap_object1");
        Object object = new Object();
        Object[] objectArray = new Object[]{objectMock, object};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Array element 0, 'toMap_object1', has a length less than 2");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            ArrayUtils.toMap(objectArray);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${0bf039aa-dda3-3416-b49d-0c13bd63b382}
    @Test()
    void toMapWhenEntryLengthNotLessThan2() {
        /* Branches:
         * (array == null) : false
         * (i < array.length) : true
         * (object instanceof Map.Entry<?, ?>) : false
         * (object instanceof Object[]) : true
         * (entry.length < 2) : false
         */
        //Arrange Statement(s)
        Object[] objectArray2 = new Object[]{(Object) null, (Object) null};
        Object[] objectArray3 = new Object[]{(Object) null, (Object) null};
        Object[] objectArray = new Object[]{objectArray2, objectArray3};

        //Act Statement(s)
        Map<Object, Object> result = ArrayUtils.toMap(objectArray);
        Map<Object, Object> objectObjectResultMap = new HashMap<>(3);
        objectObjectResultMap.put((Object) null, (Object) null);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectObjectResultMap)));
    }

    //Sapient generated method id: ${72ed897b-a757-3dab-bc58-feb4103e64c2}
    @Test()
    void toObjectWhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        boolean[] _boolean = null;

        //Act Statement(s)
        Boolean[] result = ArrayUtils.toObject(_boolean);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${5ec4af71-c280-321b-b7b0-3792f470c04f}
    @Test()
    void toObjectWhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        boolean[] booleanArray = new boolean[]{};

        //Act Statement(s)
        Boolean[] result = ArrayUtils.toObject(booleanArray);
        Boolean[] booleanResultArray = new Boolean[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(booleanResultArray)));
    }

    //Sapient generated method id: ${e4ae6bde-d272-329c-ab58-9ca73a6e75ec}
    @Test()
    void toObjectWhenArrayLengthNotEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Boolean[] booleanArray = new Boolean[]{};
            Boolean[] booleanArray2 = new Boolean[]{(Boolean) null};
            arrayUtils.when(() -> ArrayUtils.setAll(eq(booleanArray2), (IntFunction) any())).thenReturn(booleanArray);
            boolean[] booleanArray3 = new boolean[]{false};
            //Act Statement(s)
            Boolean[] result = ArrayUtils.toObject(booleanArray3);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanArray));
                arrayUtils.verify(() -> ArrayUtils.setAll(eq(booleanArray2), (IntFunction) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7e99d034-d8c9-3304-afa0-aecfc4d2015f}
    @Test()
    void toObject1WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        byte[] _byte = null;

        //Act Statement(s)
        Byte[] result = ArrayUtils.toObject(_byte);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${9a37ff8d-19e9-3b9d-b1c6-751813c6f593}
    @Test()
    void toObject1WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        Byte[] result = ArrayUtils.toObject(byteArray);
        Byte[] byteResultArray = new Byte[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //Sapient generated method id: ${f9518b52-03f5-3a68-a7e8-7bedf0b6d983}
    @Test()
    void toObject1WhenArrayLengthNotEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Byte[] byteArray = new Byte[]{};
            Byte[] byteArray2 = new Byte[]{(Byte) null};
            arrayUtils.when(() -> ArrayUtils.setAll(eq(byteArray2), (IntFunction) any())).thenReturn(byteArray);
            byte[] byteArray3 = new byte[]{(byte) 0};
            //Act Statement(s)
            Byte[] result = ArrayUtils.toObject(byteArray3);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                arrayUtils.verify(() -> ArrayUtils.setAll(eq(byteArray2), (IntFunction) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${25f42301-58d1-332a-ac50-f000798778c8}
    @Test()
    void toObject2WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        char[] _char = null;

        //Act Statement(s)
        Character[] result = ArrayUtils.toObject(_char);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${6af991c2-da3b-3e19-a21b-83c66b5f42a7}
    @Test()
    void toObject2WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        char[] charArray = new char[]{};

        //Act Statement(s)
        Character[] result = ArrayUtils.toObject(charArray);
        Character[] characterResultArray = new Character[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(characterResultArray)));
    }

    //Sapient generated method id: ${981f6c8f-040e-36cc-b360-e3849e0ada27}
    @Test()
    void toObject2WhenArrayLengthNotEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Character[] characterArray = new Character[]{};
            Character[] characterArray2 = new Character[]{(Character) null};
            arrayUtils.when(() -> ArrayUtils.setAll(eq(characterArray2), (IntFunction) any())).thenReturn(characterArray);
            char[] charArray = new char[]{'A'};
            //Act Statement(s)
            Character[] result = ArrayUtils.toObject(charArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(characterArray));
                arrayUtils.verify(() -> ArrayUtils.setAll(eq(characterArray2), (IntFunction) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c5bd5313-4444-3e94-bcc7-0647320c638f}
    @Test()
    void toObject3WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        double[] _double = null;

        //Act Statement(s)
        Double[] result = ArrayUtils.toObject(_double);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${4bc463be-2815-3d6d-8c75-de2be5795913}
    @Test()
    void toObject3WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        double[] doubleArray = new double[]{};

        //Act Statement(s)
        Double[] result = ArrayUtils.toObject(doubleArray);
        Double[] doubleResultArray = new Double[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(doubleResultArray)));
    }

    //Sapient generated method id: ${896d2f7d-8a10-339e-877f-6a8294ac1206}
    @Test()
    void toObject3WhenArrayLengthNotEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Double[] doubleArray = new Double[]{};
            Double[] doubleArray2 = new Double[]{(Double) null};
            arrayUtils.when(() -> ArrayUtils.setAll(eq(doubleArray2), (IntFunction) any())).thenReturn(doubleArray);
            double[] doubleArray3 = new double[]{Double.parseDouble("0")};
            //Act Statement(s)
            Double[] result = ArrayUtils.toObject(doubleArray3);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleArray));
                arrayUtils.verify(() -> ArrayUtils.setAll(eq(doubleArray2), (IntFunction) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3821538d-694f-3d16-8a30-54c673705e67}
    @Test()
    void toObject4WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        float[] _float = null;

        //Act Statement(s)
        Float[] result = ArrayUtils.toObject(_float);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${24a9f839-9ec0-3309-9cce-c255bf6a3992}
    @Test()
    void toObject4WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        float[] floatArray = new float[]{};

        //Act Statement(s)
        Float[] result = ArrayUtils.toObject(floatArray);
        Float[] floatResultArray = new Float[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(floatResultArray)));
    }

    //Sapient generated method id: ${9029dee3-9fc0-3200-bd40-03c91c31b2c2}
    @Test()
    void toObject4WhenArrayLengthNotEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Float[] floatArray = new Float[]{};
            Float[] floatArray2 = new Float[]{(Float) null};
            arrayUtils.when(() -> ArrayUtils.setAll(eq(floatArray2), (IntFunction) any())).thenReturn(floatArray);
            float[] floatArray3 = new float[]{Float.parseFloat("0")};
            //Act Statement(s)
            Float[] result = ArrayUtils.toObject(floatArray3);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatArray));
                arrayUtils.verify(() -> ArrayUtils.setAll(eq(floatArray2), (IntFunction) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${728d1297-bd18-3075-810f-8e7ee23b412e}
    @Test()
    void toObject5WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        int[] _int = null;

        //Act Statement(s)
        Integer[] result = ArrayUtils.toObject(_int);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${a2a70f1d-8132-372c-9558-ce45fd077e48}
    @Test()
    void toObject5WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        int[] intArray = new int[]{};

        //Act Statement(s)
        Integer[] result = ArrayUtils.toObject(intArray);
        Integer[] integerResultArray = new Integer[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(integerResultArray)));
    }

    //Sapient generated method id: ${29854c65-7bd9-3c04-bf8c-089c11cd0cc0}
    @Test()
    void toObject5WhenArrayLengthNotEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Integer[] integerArray = new Integer[]{};
            Integer[] integerArray2 = new Integer[]{(Integer) null};
            arrayUtils.when(() -> ArrayUtils.setAll(eq(integerArray2), (IntFunction) any())).thenReturn(integerArray);
            int[] intArray = new int[]{0};
            //Act Statement(s)
            Integer[] result = ArrayUtils.toObject(intArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(integerArray));
                arrayUtils.verify(() -> ArrayUtils.setAll(eq(integerArray2), (IntFunction) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${432fe284-936d-32b0-806f-8760e79ed884}
    @Test()
    void toObject6WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        long[] _long = null;

        //Act Statement(s)
        Long[] result = ArrayUtils.toObject(_long);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${52db09a7-4b4a-390e-9bba-d89750bc5bfe}
    @Test()
    void toObject6WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        long[] longArray = new long[]{};

        //Act Statement(s)
        Long[] result = ArrayUtils.toObject(longArray);
        Long[] longResultArray = new Long[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longResultArray)));
    }

    //Sapient generated method id: ${f83b5c77-de84-367e-865a-5b5b364ef6a3}
    @Test()
    void toObject6WhenArrayLengthNotEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Long[] longArray = new Long[]{};
            Long[] longArray2 = new Long[]{(Long) null};
            arrayUtils.when(() -> ArrayUtils.setAll(eq(longArray2), (IntFunction) any())).thenReturn(longArray);
            long[] longArray3 = new long[]{0L};
            //Act Statement(s)
            Long[] result = ArrayUtils.toObject(longArray3);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray));
                arrayUtils.verify(() -> ArrayUtils.setAll(eq(longArray2), (IntFunction) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${34959d6d-8643-3071-9e67-551ba959d2ee}
    @Test()
    void toObject7WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        short[] _short = null;

        //Act Statement(s)
        Short[] result = ArrayUtils.toObject(_short);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${42e7ac8e-3eab-3b24-9988-362dd3e3cc25}
    @Test()
    void toObject7WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        short[] shortArray = new short[]{};

        //Act Statement(s)
        Short[] result = ArrayUtils.toObject(shortArray);
        Short[] shortResultArray = new Short[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(shortResultArray)));
    }

    //Sapient generated method id: ${2d661aa1-66ff-3299-a11b-691a11c83edf}
    @Test()
    void toObject7WhenArrayLengthNotEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Short[] shortArray = new Short[]{};
            Short[] shortArray2 = new Short[]{(Short) null};
            arrayUtils.when(() -> ArrayUtils.setAll(eq(shortArray2), (IntFunction) any())).thenReturn(shortArray);
            short[] shortArray3 = new short[]{(short) 0};
            //Act Statement(s)
            Short[] result = ArrayUtils.toObject(shortArray3);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(shortArray));
                arrayUtils.verify(() -> ArrayUtils.setAll(eq(shortArray2), (IntFunction) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${282aafd5-5f7c-354f-8ff6-e1e6624ad7ba}
    @Test()
    void toPrimitiveTest() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            Boolean[] booleanArray2 = new Boolean[]{};
            arrayUtils.when(() -> ArrayUtils.toPrimitive(booleanArray2, false)).thenReturn(booleanArray);
            //Act Statement(s)
            boolean[] result = ArrayUtils.toPrimitive(booleanArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanArray));
                arrayUtils.verify(() -> ArrayUtils.toPrimitive(booleanArray2, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${76c4f4b2-8ba3-3f1d-98b1-2c4a1643f705}
    @Test()
    void toPrimitive1WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Boolean[] _boolean = null;

        //Act Statement(s)
        boolean[] result = ArrayUtils.toPrimitive(_boolean, false);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${8116122c-1072-3147-a85c-fbfad67c8260}
    @Test()
    void toPrimitive1WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        Boolean[] booleanArray = new Boolean[]{};

        //Act Statement(s)
        boolean[] result = ArrayUtils.toPrimitive(booleanArray, false);
        boolean[] booleanResultArray = new boolean[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(booleanResultArray)));
    }

    //Sapient generated method id: ${4885815e-5e9d-374c-b9e4-46dc0639a1d1}
    @Test()
    void toPrimitive1WhenBIsNull() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         * (b == null) : true
         */
        //Arrange Statement(s)
        Boolean[] booleanArray = new Boolean[]{(Boolean) null};

        //Act Statement(s)
        boolean[] result = ArrayUtils.toPrimitive(booleanArray, false);
        boolean[] booleanResultArray = new boolean[]{false};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(booleanResultArray)));
    }

    //Sapient generated method id: ${fc598797-cb76-3d07-9795-8175766e0279}
    @Test()
    void toPrimitive1WhenBIsNotNull() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         * (b == null) : false
         */
        //Arrange Statement(s)
        Boolean[] booleanArray = new Boolean[]{false};

        //Act Statement(s)
        boolean[] result = ArrayUtils.toPrimitive(booleanArray, false);
        boolean[] booleanResultArray = new boolean[]{false};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(booleanResultArray)));
    }

    //Sapient generated method id: ${06236371-ede0-3317-942d-cd5a3b8c54f6}
    @Test()
    void toPrimitive2WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Byte[] _byte = null;

        //Act Statement(s)
        byte[] result = ArrayUtils.toPrimitive(_byte);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${92405bf7-dadd-3e0d-8ae2-3cb50442d3cb}
    @Test()
    void toPrimitive2WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        Byte[] byteArray = new Byte[]{};

        //Act Statement(s)
        byte[] result = ArrayUtils.toPrimitive(byteArray);
        byte[] byteResultArray = new byte[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //Sapient generated method id: ${846f0b27-079c-334d-a8eb-14ad4b98d9d7}
    @Test()
    void toPrimitive2WhenILessThanArrayLength() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         */
        //Arrange Statement(s)
        Byte[] byteArray = new Byte[]{(byte) 1};

        //Act Statement(s)
        byte[] result = ArrayUtils.toPrimitive(byteArray);
        byte[] byteResultArray = new byte[]{(byte) 1};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //Sapient generated method id: ${8e470cb6-658b-37c0-947e-486f82a2d0ee}
    @Test()
    void toPrimitive3WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Byte[] _byte = null;

        //Act Statement(s)
        byte[] result = ArrayUtils.toPrimitive(_byte, (byte) 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${6aa916d1-b27e-39a9-9676-58f68062e529}
    @Test()
    void toPrimitive3WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        Byte[] byteArray = new Byte[]{};

        //Act Statement(s)
        byte[] result = ArrayUtils.toPrimitive(byteArray, (byte) 0);
        byte[] byteResultArray = new byte[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //Sapient generated method id: ${2c2446ff-71b0-3fce-8d30-6e09e5f06720}
    @Test()
    void toPrimitive3WhenBIsNull() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         * (b == null) : true
         */
        //Arrange Statement(s)
        Byte[] byteArray = new Byte[]{(Byte) null};

        //Act Statement(s)
        byte[] result = ArrayUtils.toPrimitive(byteArray, (byte) 0);
        byte[] byteResultArray = new byte[]{(byte) 0};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //Sapient generated method id: ${2ef827eb-9520-3530-9fd5-76d13890797d}
    @Test()
    void toPrimitive3WhenBIsNotNull() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         * (b == null) : false
         */
        //Arrange Statement(s)
        Byte[] byteArray = new Byte[]{(byte) 1};

        //Act Statement(s)
        byte[] result = ArrayUtils.toPrimitive(byteArray, (byte) 0);
        byte[] byteResultArray = new byte[]{(byte) 1};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //Sapient generated method id: ${47c0ffe0-32b1-390b-8731-56647404ddf4}
    @Test()
    void toPrimitive4WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Character[] character = null;

        //Act Statement(s)
        char[] result = ArrayUtils.toPrimitive(character);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${9267c204-badf-3661-87c9-b6ff444739c3}
    @Test()
    void toPrimitive4WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        Character[] characterArray = new Character[]{};

        //Act Statement(s)
        char[] result = ArrayUtils.toPrimitive(characterArray);
        char[] charResultArray = new char[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charResultArray)));
    }

    //Sapient generated method id: ${f30da945-1098-3717-967c-a1519cd0f229}
    @Test()
    void toPrimitive4WhenILessThanArrayLength() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         */
        //Arrange Statement(s)
        Character[] characterArray = new Character[]{'A'};

        //Act Statement(s)
        char[] result = ArrayUtils.toPrimitive(characterArray);
        char[] charResultArray = new char[]{'A'};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charResultArray)));
    }

    //Sapient generated method id: ${057b07bc-6551-393f-bf3c-8460baa7f703}
    @Test()
    void toPrimitive5WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Character[] character = null;

        //Act Statement(s)
        char[] result = ArrayUtils.toPrimitive(character, 'A');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${d79221c5-155b-31a1-9c61-12f24bfb780d}
    @Test()
    void toPrimitive5WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        Character[] characterArray = new Character[]{};

        //Act Statement(s)
        char[] result = ArrayUtils.toPrimitive(characterArray, 'A');
        char[] charResultArray = new char[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charResultArray)));
    }

    //Sapient generated method id: ${ad3cc7cb-2d92-3727-aabc-bf17809f7c1d}
    @Test()
    void toPrimitive5WhenBIsNull() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         * (b == null) : true
         */
        //Arrange Statement(s)
        Character[] characterArray = new Character[]{(Character) null};

        //Act Statement(s)
        char[] result = ArrayUtils.toPrimitive(characterArray, 'A');
        char[] charResultArray = new char[]{'A'};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charResultArray)));
    }

    //Sapient generated method id: ${7e6f2a4e-67b0-3af6-b5b8-56f7e3668f87}
    @Test()
    void toPrimitive5WhenBIsNotNull() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         * (b == null) : false
         */
        //Arrange Statement(s)
        Character[] characterArray = new Character[]{'A'};

        //Act Statement(s)
        char[] result = ArrayUtils.toPrimitive(characterArray, 'A');
        char[] charResultArray = new char[]{'A'};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charResultArray)));
    }

    //Sapient generated method id: ${bcf55929-0af7-37bb-b791-15ee525803f7}
    @Test()
    void toPrimitive6WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Double[] _double = null;

        //Act Statement(s)
        double[] result = ArrayUtils.toPrimitive(_double);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${d1b73f36-0eb9-35c5-ab73-167f39e664e6}
    @Test()
    void toPrimitive6WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        Double[] doubleArray = new Double[]{};

        //Act Statement(s)
        double[] result = ArrayUtils.toPrimitive(doubleArray);
        double[] doubleResultArray = new double[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(doubleResultArray)));
    }

    //Sapient generated method id: ${060d3ce0-3d46-36dd-a38c-99e4c6e585f6}
    @Test()
    void toPrimitive6WhenILessThanArrayLength() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         */
        //Arrange Statement(s)
        Double[] doubleArray = new Double[]{Double.parseDouble("1.0")};

        //Act Statement(s)
        double[] result = ArrayUtils.toPrimitive(doubleArray);
        double[] doubleResultArray = new double[]{Double.parseDouble("1.0")};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(doubleResultArray)));
    }

    //Sapient generated method id: ${46df99eb-133c-321b-a676-e5574588ebab}
    @Test()
    void toPrimitive7WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Double[] _double = null;

        //Act Statement(s)
        double[] result = ArrayUtils.toPrimitive(_double, Double.parseDouble("0.0"));

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${413c24aa-a5ac-3d93-8eb5-c4db4d62a790}
    @Test()
    void toPrimitive7WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        Double[] doubleArray = new Double[]{};

        //Act Statement(s)
        double[] result = ArrayUtils.toPrimitive(doubleArray, Double.parseDouble("0.0"));
        double[] doubleResultArray = new double[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(doubleResultArray)));
    }

    //Sapient generated method id: ${cf97d0ed-160b-3ef2-93d9-e52046c7cbe3}
    @Test()
    void toPrimitive7WhenBIsNull() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         * (b == null) : true
         */
        //Arrange Statement(s)
        Double[] doubleArray = new Double[]{(Double) null};

        //Act Statement(s)
        double[] result = ArrayUtils.toPrimitive(doubleArray, Double.parseDouble("0"));
        double[] doubleResultArray = new double[]{Double.parseDouble("0")};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(doubleResultArray)));
    }

    //Sapient generated method id: ${b672f774-05fe-3acd-8247-01192c404bed}
    @Test()
    void toPrimitive7WhenBIsNotNull() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         * (b == null) : false
         */
        //Arrange Statement(s)
        Double[] doubleArray = new Double[]{Double.parseDouble("1.0")};

        //Act Statement(s)
        double[] result = ArrayUtils.toPrimitive(doubleArray, Double.parseDouble("0.0"));
        double[] doubleResultArray = new double[]{Double.parseDouble("1.0")};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(doubleResultArray)));
    }

    //Sapient generated method id: ${f44f1ac6-30b2-31df-9ecd-f01d992c4c29}
    @Test()
    void toPrimitive8WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Float[] _float = null;

        //Act Statement(s)
        float[] result = ArrayUtils.toPrimitive(_float);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${2ea6b2eb-d04b-3d6f-922e-8fe90253e7aa}
    @Test()
    void toPrimitive8WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        Float[] floatArray = new Float[]{};

        //Act Statement(s)
        float[] result = ArrayUtils.toPrimitive(floatArray);
        float[] floatResultArray = new float[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(floatResultArray)));
    }

    //Sapient generated method id: ${0837079f-9bb8-37e8-904f-39ecb5c26d4d}
    @Test()
    void toPrimitive8WhenILessThanArrayLength() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         */
        //Arrange Statement(s)
        Float[] floatArray = new Float[]{Float.parseFloat("1.0")};

        //Act Statement(s)
        float[] result = ArrayUtils.toPrimitive(floatArray);
        float[] floatResultArray = new float[]{Float.parseFloat("1.0")};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(floatResultArray)));
    }

    //Sapient generated method id: ${47da661b-1f02-360f-92ac-d46bd742bc85}
    @Test()
    void toPrimitive9WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Float[] _float = null;

        //Act Statement(s)
        float[] result = ArrayUtils.toPrimitive(_float, Float.parseFloat("0.0"));

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${58882472-c1e2-352b-8ce9-8c79207f403e}
    @Test()
    void toPrimitive9WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        Float[] floatArray = new Float[]{};

        //Act Statement(s)
        float[] result = ArrayUtils.toPrimitive(floatArray, Float.parseFloat("0.0"));
        float[] floatResultArray = new float[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(floatResultArray)));
    }

    //Sapient generated method id: ${42e962ea-336a-343a-ae04-2113e7d0a1ee}
    @Test()
    void toPrimitive9WhenBIsNull() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         * (b == null) : true
         */
        //Arrange Statement(s)
        Float[] floatArray = new Float[]{(Float) null};

        //Act Statement(s)
        float[] result = ArrayUtils.toPrimitive(floatArray, Float.parseFloat("0"));
        float[] floatResultArray = new float[]{Float.parseFloat("0")};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(floatResultArray)));
    }

    //Sapient generated method id: ${2e77483d-d33e-301b-a1c9-50f5c549785f}
    @Test()
    void toPrimitive9WhenBIsNotNull() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         * (b == null) : false
         */
        //Arrange Statement(s)
        Float[] floatArray = new Float[]{Float.parseFloat("1.0")};

        //Act Statement(s)
        float[] result = ArrayUtils.toPrimitive(floatArray, Float.parseFloat("0.0"));
        float[] floatResultArray = new float[]{Float.parseFloat("1.0")};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(floatResultArray)));
    }

    //Sapient generated method id: ${89cfaf5f-bebd-3e63-9246-4ae5662b1a58}
    @Test()
    void toPrimitive10WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Integer[] integer = null;

        //Act Statement(s)
        int[] result = ArrayUtils.toPrimitive(integer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${2684d42f-e137-37d5-a8b0-69af7254b956}
    @Test()
    void toPrimitive10WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        Integer[] integerArray = new Integer[]{};

        //Act Statement(s)
        int[] result = ArrayUtils.toPrimitive(integerArray);
        int[] intResultArray = new int[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(intResultArray)));
    }

    //Sapient generated method id: ${cd074ed5-94a0-3c4c-934a-b8f8b2f593b8}
    @Test()
    void toPrimitive10WhenILessThanArrayLength() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         */
        //Arrange Statement(s)
        Integer[] integerArray = new Integer[]{1};

        //Act Statement(s)
        int[] result = ArrayUtils.toPrimitive(integerArray);
        int[] intResultArray = new int[]{1};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(intResultArray)));
    }

    //Sapient generated method id: ${68232218-dd7d-328e-8eef-07b81f3a8f77}
    @Test()
    void toPrimitive11WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Integer[] integer = null;

        //Act Statement(s)
        int[] result = ArrayUtils.toPrimitive(integer, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${e1ce9eaa-af14-3bde-a6c4-77150041351a}
    @Test()
    void toPrimitive11WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        Integer[] integerArray = new Integer[]{};

        //Act Statement(s)
        int[] result = ArrayUtils.toPrimitive(integerArray, 0);
        int[] intResultArray = new int[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(intResultArray)));
    }

    //Sapient generated method id: ${4355e9e3-423d-3fb2-8c02-33efd34537fd}
    @Test()
    void toPrimitive11WhenBIsNull() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         * (b == null) : true
         */
        //Arrange Statement(s)
        Integer[] integerArray = new Integer[]{(Integer) null};

        //Act Statement(s)
        int[] result = ArrayUtils.toPrimitive(integerArray, 0);
        int[] intResultArray = new int[]{0};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(intResultArray)));
    }

    //Sapient generated method id: ${631fc962-42c8-3192-a45f-460d32b4e473}
    @Test()
    void toPrimitive11WhenBIsNotNull() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         * (b == null) : false
         */
        //Arrange Statement(s)
        Integer[] integerArray = new Integer[]{1};

        //Act Statement(s)
        int[] result = ArrayUtils.toPrimitive(integerArray, 0);
        int[] intResultArray = new int[]{1};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(intResultArray)));
    }

    //Sapient generated method id: ${0f7454f7-8400-31e4-aa3d-80a37fca3bd8}
    @Test()
    void toPrimitive12WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Long[] _long = null;

        //Act Statement(s)
        long[] result = ArrayUtils.toPrimitive(_long);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${c666e553-41e0-32e6-947b-7fe20fe16d6b}
    @Test()
    void toPrimitive12WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        Long[] longArray = new Long[]{};

        //Act Statement(s)
        long[] result = ArrayUtils.toPrimitive(longArray);
        long[] longResultArray = new long[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longResultArray)));
    }

    //Sapient generated method id: ${16d2fbd0-2ee9-3fb3-a0a1-3dc45501724c}
    @Test()
    void toPrimitive12WhenILessThanArrayLength() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         */
        //Arrange Statement(s)
        Long[] longArray = new Long[]{1L};

        //Act Statement(s)
        long[] result = ArrayUtils.toPrimitive(longArray);
        long[] longResultArray = new long[]{1L};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longResultArray)));
    }

    //Sapient generated method id: ${45e746f7-2858-387a-bf41-c831c479f1ad}
    @Test()
    void toPrimitive13WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Long[] _long = null;

        //Act Statement(s)
        long[] result = ArrayUtils.toPrimitive(_long, 0L);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${44b0f7cb-ce11-348d-b722-40e97d48028c}
    @Test()
    void toPrimitive13WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        Long[] longArray = new Long[]{};

        //Act Statement(s)
        long[] result = ArrayUtils.toPrimitive(longArray, 0L);
        long[] longResultArray = new long[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longResultArray)));
    }

    //Sapient generated method id: ${1803b271-689e-3215-8126-ccc30478f659}
    @Test()
    void toPrimitive13WhenBIsNull() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         * (b == null) : true
         */
        //Arrange Statement(s)
        Long[] longArray = new Long[]{(Long) null};

        //Act Statement(s)
        long[] result = ArrayUtils.toPrimitive(longArray, 0L);
        long[] longResultArray = new long[]{0L};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longResultArray)));
    }

    //Sapient generated method id: ${89f19f51-bb14-33c2-8343-e0b897f061cc}
    @Test()
    void toPrimitive13WhenBIsNotNull() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         * (b == null) : false
         */
        //Arrange Statement(s)
        Long[] longArray = new Long[]{1L};

        //Act Statement(s)
        long[] result = ArrayUtils.toPrimitive(longArray, 0L);
        long[] longResultArray = new long[]{1L};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longResultArray)));
    }

    //Sapient generated method id: ${8b6d70f4-2416-3e0e-97ec-bef059037594}
    @Test()
    void toPrimitive14WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Object object = null;

        //Act Statement(s)
        Object result = ArrayUtils.toPrimitive(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${55626b11-60d2-3b6f-b156-83d5ad712338}
    @Test()
    void toPrimitive14WhenBooleanTYPEEqualsPt() {
        /* Branches:
         * (array == null) : false
         * (Boolean.TYPE.equals(pt)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{};
            Boolean[] booleanArray2 = new Boolean[]{};
            arrayUtils.when(() -> ArrayUtils.toPrimitive(booleanArray2)).thenReturn(booleanArray);
            //Act Statement(s)
            Object result = ArrayUtils.toPrimitive((Object) booleanArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(booleanArray));
                arrayUtils.verify(() -> ArrayUtils.toPrimitive(booleanArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f5d4dfac-429c-3ba8-ad13-329976c394c1}
    @Test()
    void toPrimitive14WhenCharacterTYPEEqualsPt() {
        /* Branches:
         * (array == null) : false
         * (Boolean.TYPE.equals(pt)) : false
         * (Character.TYPE.equals(pt)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[]{};
            Character[] characterArray = new Character[]{};
            arrayUtils.when(() -> ArrayUtils.toPrimitive(characterArray)).thenReturn(charArray);
            //Act Statement(s)
            Object result = ArrayUtils.toPrimitive((Object) characterArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(charArray));
                arrayUtils.verify(() -> ArrayUtils.toPrimitive(characterArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b18874b2-a075-3060-a139-197333510fe2}
    @Test()
    void toPrimitive14WhenByteTYPEEqualsPt() {
        /* Branches:
         * (array == null) : false
         * (Boolean.TYPE.equals(pt)) : false
         * (Character.TYPE.equals(pt)) : false
         * (Byte.TYPE.equals(pt)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            Byte[] byteArray2 = new Byte[]{};
            arrayUtils.when(() -> ArrayUtils.toPrimitive(byteArray2)).thenReturn(byteArray);
            //Act Statement(s)
            Object result = ArrayUtils.toPrimitive((Object) byteArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                arrayUtils.verify(() -> ArrayUtils.toPrimitive(byteArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${260da7f3-6f93-31c7-83e9-7d0188f7f97c}
    @Test()
    void toPrimitive14WhenIntegerTYPEEqualsPt() {
        /* Branches:
         * (array == null) : false
         * (Boolean.TYPE.equals(pt)) : false
         * (Character.TYPE.equals(pt)) : false
         * (Byte.TYPE.equals(pt)) : false
         * (Integer.TYPE.equals(pt)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            int[] intArray = new int[]{};
            Integer[] integerArray = new Integer[]{};
            arrayUtils.when(() -> ArrayUtils.toPrimitive(integerArray)).thenReturn(intArray);
            //Act Statement(s)
            Object result = ArrayUtils.toPrimitive((Object) integerArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(intArray));
                arrayUtils.verify(() -> ArrayUtils.toPrimitive(integerArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c6d01c82-6274-3d51-9a96-09528cfac3f9}
    @Test()
    void toPrimitive14WhenLongTYPEEqualsPt() {
        /* Branches:
         * (array == null) : false
         * (Boolean.TYPE.equals(pt)) : false
         * (Character.TYPE.equals(pt)) : false
         * (Byte.TYPE.equals(pt)) : false
         * (Integer.TYPE.equals(pt)) : false
         * (Long.TYPE.equals(pt)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            long[] longArray = new long[]{};
            Long[] longArray2 = new Long[]{};
            arrayUtils.when(() -> ArrayUtils.toPrimitive(longArray2)).thenReturn(longArray);
            //Act Statement(s)
            Object result = ArrayUtils.toPrimitive((Object) longArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longArray));
                arrayUtils.verify(() -> ArrayUtils.toPrimitive(longArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b210ca8b-b289-35f2-921a-f0f901087b8e}
    @Test()
    void toPrimitive14WhenShortTYPEEqualsPt() {
        /* Branches:
         * (array == null) : false
         * (Boolean.TYPE.equals(pt)) : false
         * (Character.TYPE.equals(pt)) : false
         * (Byte.TYPE.equals(pt)) : false
         * (Integer.TYPE.equals(pt)) : false
         * (Long.TYPE.equals(pt)) : false
         * (Short.TYPE.equals(pt)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Short[] shortArray = new Short[]{};

        //Act Statement(s)
        Object result = ArrayUtils.toPrimitive((Object) shortArray);
        Object object = new Object();

        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${cb44b6a9-8bf2-305c-b517-ffcf4066270f}
    @Test()
    void toPrimitive14WhenDoubleTYPEEqualsPt() {
        /* Branches:
         * (array == null) : false
         * (Boolean.TYPE.equals(pt)) : false
         * (Character.TYPE.equals(pt)) : false
         * (Byte.TYPE.equals(pt)) : false
         * (Integer.TYPE.equals(pt)) : false
         * (Long.TYPE.equals(pt)) : false
         * (Short.TYPE.equals(pt)) : false
         * (Double.TYPE.equals(pt)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            double[] doubleArray = new double[]{};
            Double[] doubleArray2 = new Double[]{};
            arrayUtils.when(() -> ArrayUtils.toPrimitive(doubleArray2)).thenReturn(doubleArray);
            //Act Statement(s)
            Object result = ArrayUtils.toPrimitive((Object) doubleArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(doubleArray));
                arrayUtils.verify(() -> ArrayUtils.toPrimitive(doubleArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${bd837ddd-b161-38a2-aec2-5ae3162d0d27}
    @Test()
    void toPrimitive14WhenFloatTYPEEqualsPt() {
        /* Branches:
         * (array == null) : false
         * (Boolean.TYPE.equals(pt)) : false
         * (Character.TYPE.equals(pt)) : false
         * (Byte.TYPE.equals(pt)) : false
         * (Integer.TYPE.equals(pt)) : false
         * (Long.TYPE.equals(pt)) : false
         * (Short.TYPE.equals(pt)) : false
         * (Double.TYPE.equals(pt)) : false
         * (Float.TYPE.equals(pt)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            float[] floatArray = new float[]{};
            Float[] floatArray2 = new Float[]{};
            arrayUtils.when(() -> ArrayUtils.toPrimitive(floatArray2)).thenReturn(floatArray);
            //Act Statement(s)
            Object result = ArrayUtils.toPrimitive((Object) floatArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(floatArray));
                arrayUtils.verify(() -> ArrayUtils.toPrimitive(floatArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9c8e1b65-b515-3bd9-a51a-3543c152bfc1}
    @Test()
    void toPrimitive14WhenFloatTYPENotEqualsPt() {
        /* Branches:
         * (array == null) : false
         * (Boolean.TYPE.equals(pt)) : false
         * (Character.TYPE.equals(pt)) : false
         * (Byte.TYPE.equals(pt)) : false
         * (Integer.TYPE.equals(pt)) : false
         * (Long.TYPE.equals(pt)) : false
         * (Short.TYPE.equals(pt)) : false
         * (Double.TYPE.equals(pt)) : false
         * (Float.TYPE.equals(pt)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();

        //Act Statement(s)
        Object result = ArrayUtils.toPrimitive(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${e777060c-acba-3396-9cea-f193333acc29}
    @Test()
    void toPrimitive15WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Short[] _short = null;

        //Act Statement(s)
        short[] result = ArrayUtils.toPrimitive(_short);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${3884f591-70a8-3230-a4b2-ee0c9568f8b1}
    @Test()
    void toPrimitive15WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        Short[] shortArray = new Short[]{};

        //Act Statement(s)
        short[] result = ArrayUtils.toPrimitive(shortArray);
        short[] shortResultArray = new short[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(shortResultArray)));
    }

    //Sapient generated method id: ${ae7b619d-02f0-3af5-ba47-d0e95710af13}
    @Test()
    void toPrimitive15WhenILessThanArrayLength() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         */
        //Arrange Statement(s)
        Short[] shortArray = new Short[]{(short) 1};

        //Act Statement(s)
        short[] result = ArrayUtils.toPrimitive(shortArray);
        short[] shortResultArray = new short[]{(short) 1};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(shortResultArray)));
    }

    //Sapient generated method id: ${7bf5c7d2-e97b-3ec6-a16a-a9e71ed7f25c}
    @Test()
    void toPrimitive16WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Short[] _short = null;

        //Act Statement(s)
        short[] result = ArrayUtils.toPrimitive(_short, (short) 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${c0ca8684-18a8-3f9f-90ae-1dafd0612385}
    @Test()
    void toPrimitive16WhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        Short[] shortArray = new Short[]{};

        //Act Statement(s)
        short[] result = ArrayUtils.toPrimitive(shortArray, (short) 0);
        short[] shortResultArray = new short[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(shortResultArray)));
    }

    //Sapient generated method id: ${ede82df9-4b9c-3540-872d-0fc1bf11c095}
    @Test()
    void toPrimitive16WhenBIsNull() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         * (b == null) : true
         */
        //Arrange Statement(s)
        Short[] shortArray = new Short[]{(Short) null};

        //Act Statement(s)
        short[] result = ArrayUtils.toPrimitive(shortArray, (short) 0);
        short[] shortResultArray = new short[]{(short) 0};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(shortResultArray)));
    }

    //Sapient generated method id: ${5525a8a4-2e36-3258-9fa4-c928f9b35e64}
    @Test()
    void toPrimitive16WhenBIsNotNull() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         * (b == null) : false
         */
        //Arrange Statement(s)
        Short[] shortArray = new Short[]{(short) 1};

        //Act Statement(s)
        short[] result = ArrayUtils.toPrimitive(shortArray, (short) 0);
        short[] shortResultArray = new short[]{(short) 1};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(shortResultArray)));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Test()
    void toStringTest() {
        //Arrange Statement(s)
        try (MockedStatic<ArrayUtils> arrayUtils = mockStatic(ArrayUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            arrayUtils.when(() -> ArrayUtils.toString(object, "{}")).thenReturn("return_of_toString1");
            //Act Statement(s)
            String result = ArrayUtils.toString(object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toString1"));
                arrayUtils.verify(() -> ArrayUtils.toString(object, "{}"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c5fa9e5c-0f42-3ba4-b017-b12bc78605bc}
    @Test()
    void toString1WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Object object = null;

        //Act Statement(s)
        String result = ArrayUtils.toString(object, "stringIfNull1");

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("stringIfNull1")));
    }

    //Sapient generated method id: ${ada8e421-def5-36ad-a205-c40f62841fe7}
    @Test()
    void toString1WhenArrayIsNotNull() {
        /* Branches:
         * (array == null) : false
         */
        //Arrange Statement(s)
        Object object = new Object();

        //Act Statement(s)
        String result = ArrayUtils.toString(object, "stringIfNull1");

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("<null>,<null>")));
    }

    //Sapient generated method id: ${23a2e005-96fa-34d0-bab4-54f785dfee5d}
    @Test()
    void toStringArrayWhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         */
        //Arrange Statement(s)
        Object[] object = null;

        //Act Statement(s)
        String[] result = ArrayUtils.toStringArray(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${ea64b636-e689-35f6-99fa-6621fd7785ba}
    @Test()
    void toStringArrayWhenArrayLengthEquals0() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};

        //Act Statement(s)
        String[] result = ArrayUtils.toStringArray(objectArray);
        String[] stringResultArray = new String[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
    }

    //Sapient generated method id: ${0a66c343-f044-3200-b0cf-b52f3172095a}
    @Test()
    void toStringArrayWhenILessThanArrayLength() {
        /* Branches:
         * (array == null) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         */
        //Arrange Statement(s)
        Object objectMock = mock(Object.class, "toStringArray_object1");
        Object[] objectArray = new Object[]{objectMock};

        //Act Statement(s)
        String[] result = ArrayUtils.toStringArray(objectArray);
        String[] stringResultArray = new String[]{"toStringArray_object1"};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
    }

    //Sapient generated method id: ${5a13f6ba-9bea-30d4-998a-cdeebd0d3ac7}
    @Test()
    void toStringArray1WhenArrayIsNull() {
        /* Branches:
         * (null == array) : true
         */

        //Act Statement(s)
        String[] result = ArrayUtils.toStringArray((Object[]) null, "valueForNullElements1");

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${ff8b97c0-cf9b-34f8-bc78-6a8ae5892c90}
    @Test()
    void toStringArray1WhenArrayLengthEquals0() {
        /* Branches:
         * (null == array) : false
         * (array.length == 0) : true
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};

        //Act Statement(s)
        String[] result = ArrayUtils.toStringArray(objectArray, "valueForNullElements1");
        String[] stringResultArray = new String[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
    }

    //Sapient generated method id: ${1ce78324-cbc6-36f2-a744-3973c244bc94}
    @Test()
    void toStringArray1WhenILessThanArrayLength() {
        /* Branches:
         * (null == array) : false
         * (array.length == 0) : false
         * (i < array.length) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object[] objectArray = new Object[]{object};

        //Act Statement(s)
        String[] result = ArrayUtils.toStringArray(objectArray, "valueForNullElements1");
        String[] stringResultArray = new String[]{"valueForNullElements1"};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
    }
}
