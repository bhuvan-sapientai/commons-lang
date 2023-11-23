package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArraySorterSapientGeneratedTest {

    //Sapient generated method id: ${b19abfa3-0da3-3ff2-bf58-4c0d718f728b}
    @Test()
    void sortTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        byte[] result = ArraySorter.sort(byteArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteArray)));
    }

    //Sapient generated method id: ${ea6ed912-ac3e-3205-9463-399f04ad4c57}
    @Test()
    void sort1Test() {
        //Arrange Statement(s)
        char[] charArray = new char[]{};

        //Act Statement(s)
        char[] result = ArraySorter.sort(charArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charArray)));
    }

    //Sapient generated method id: ${b7b0cc0c-b454-38d8-8bea-6da703467d29}
    @Test()
    void sort2Test() {
        //Arrange Statement(s)
        double[] doubleArray = new double[]{};

        //Act Statement(s)
        double[] result = ArraySorter.sort(doubleArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(doubleArray)));
    }

    //Sapient generated method id: ${599dac5a-277f-3f38-9d7a-bdd3b31dcc6b}
    @Test()
    void sort3Test() {
        //Arrange Statement(s)
        float[] floatArray = new float[]{};

        //Act Statement(s)
        float[] result = ArraySorter.sort(floatArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(floatArray)));
    }

    //Sapient generated method id: ${0070b767-5bcb-3348-bd3d-659b7e54a842}
    @Test()
    void sort4Test() {
        //Arrange Statement(s)
        int[] intArray = new int[]{};

        //Act Statement(s)
        int[] result = ArraySorter.sort(intArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(intArray)));
    }

    //Sapient generated method id: ${75b12de1-f2ce-343c-8cf0-97b7e26c9042}
    @Test()
    void sort5Test() {
        //Arrange Statement(s)
        long[] longArray = new long[]{};

        //Act Statement(s)
        long[] result = ArraySorter.sort(longArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longArray)));
    }

    //Sapient generated method id: ${7210ed12-853c-3194-bd34-687ef20757c2}
    @Test()
    void sort6Test() {
        //Arrange Statement(s)
        short[] shortArray = new short[]{};

        //Act Statement(s)
        short[] result = ArraySorter.sort(shortArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(shortArray)));
    }

    //Sapient generated method id: ${a7bfa6fe-6e49-338a-842d-61f36271afc8}
    @Test()
    void sort7Test() {
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};

        //Act Statement(s)
        Object[] result = ArraySorter.sort(objectArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectArray)));
    }

    //Sapient generated method id: ${d1230f79-87a4-3766-8c33-4f64348656ba}
    @Test()
    void sort8Test() {
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        Comparator<Object> comparator = Comparator.reverseOrder();

        //Act Statement(s)
        Object[] result = ArraySorter.sort(objectArray, comparator);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectArray)));
    }
}
