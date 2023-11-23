package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArrayFillSapientGeneratedTest {

    //Sapient generated method id: ${010c7e60-1def-31a6-abc8-4e21e3ed9865}
    @Test()
    void fillTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        byte[] result = ArrayFill.fill(byteArray, (byte) 1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteArray)));
    }

    //Sapient generated method id: ${31111037-16bd-3c08-aed3-fd06333ea83b}
    @Test()
    void fill1Test() {
        //Arrange Statement(s)
        char[] charArray = new char[]{};

        //Act Statement(s)
        char[] result = ArrayFill.fill(charArray, 'A');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charArray)));
    }

    //Sapient generated method id: ${1323788c-59d7-3ea5-8b93-563da7bc015d}
    @Test()
    void fill2Test() {
        //Arrange Statement(s)
        double[] doubleArray = new double[]{};

        //Act Statement(s)
        double[] result = ArrayFill.fill(doubleArray, Double.parseDouble("1.0"));

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(doubleArray)));
    }

    //Sapient generated method id: ${b4e5d9a1-2926-350a-b535-711e728eb33c}
    @Test()
    void fill3Test() {
        //Arrange Statement(s)
        float[] floatArray = new float[]{};

        //Act Statement(s)
        float[] result = ArrayFill.fill(floatArray, Float.parseFloat("1.0"));

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(floatArray)));
    }

    //Sapient generated method id: ${a57fa282-fa53-376e-a986-4d9fc8c9d640}
    @Test()
    void fill4Test() {
        //Arrange Statement(s)
        int[] intArray = new int[]{};

        //Act Statement(s)
        int[] result = ArrayFill.fill(intArray, 1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(intArray)));
    }

    //Sapient generated method id: ${df19f896-e33d-3e77-92bb-3b16ce8d40fb}
    @Test()
    void fill5Test() {
        //Arrange Statement(s)
        long[] longArray = new long[]{};

        //Act Statement(s)
        long[] result = ArrayFill.fill(longArray, 1L);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longArray)));
    }

    //Sapient generated method id: ${5d6d802e-07a3-3871-8f47-4b436b87d012}
    @Test()
    void fill6Test() {
        //Arrange Statement(s)
        short[] shortArray = new short[]{};

        //Act Statement(s)
        short[] result = ArrayFill.fill(shortArray, (short) 1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(shortArray)));
    }

    //Sapient generated method id: ${2bb4bfd7-066c-3bc8-9850-c9bc4f8363a1}
    @Test()
    void fill7Test() {
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        Object object = new Object();

        //Act Statement(s)
        Object[] result = ArrayFill.fill(objectArray, object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectArray)));
    }
}
