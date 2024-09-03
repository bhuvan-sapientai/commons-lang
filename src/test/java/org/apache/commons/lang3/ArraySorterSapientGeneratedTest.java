package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArraySorterSapientGeneratedTest {

    //Sapient generated method id: ${sortTest}, hash: AB831ABA2FB3E2C04587AB63DEBA356D
    @Test()
    void sortTest() {
        //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        
        //Act Statement(s)
        byte[] result = ArraySorter.sort(byteArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteArray)));
    }

    //Sapient generated method id: ${sort1Test}, hash: 6E47E52268ADF78076F6AED3E75154B1
    @Test()
    void sort1Test() {
        //Arrange Statement(s)
        char[] charArray = new char[] {};
        
        //Act Statement(s)
        char[] result = ArraySorter.sort(charArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charArray)));
    }

    //Sapient generated method id: ${sort2Test}, hash: 88D542441F7D5A2365BEE99674305773
    @Test()
    void sort2Test() {
        //Arrange Statement(s)
        double[] doubleArray = new double[] {};
        
        //Act Statement(s)
        double[] result = ArraySorter.sort(doubleArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(doubleArray)));
    }

    //Sapient generated method id: ${sort3Test}, hash: BABBE4DA626F326A443C77FD98F7EA97
    @Test()
    void sort3Test() {
        //Arrange Statement(s)
        float[] floatArray = new float[] {};
        
        //Act Statement(s)
        float[] result = ArraySorter.sort(floatArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(floatArray)));
    }

    //Sapient generated method id: ${sort4Test}, hash: D1EAD0D861BE56A6A02781696FE13AA4
    @Test()
    void sort4Test() {
        //Arrange Statement(s)
        int[] intArray = new int[] {};
        
        //Act Statement(s)
        int[] result = ArraySorter.sort(intArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(intArray)));
    }

    //Sapient generated method id: ${sort5Test}, hash: 231221A2073BA5334732A58A9400BBD7
    @Test()
    void sort5Test() {
        //Arrange Statement(s)
        long[] longArray = new long[] {};
        
        //Act Statement(s)
        long[] result = ArraySorter.sort(longArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longArray)));
    }

    //Sapient generated method id: ${sort6Test}, hash: 702E4FC2A94E4ED1FEAF6C1416E4EF6D
    @Test()
    void sort6Test() {
        //Arrange Statement(s)
        short[] shortArray = new short[] {};
        
        //Act Statement(s)
        short[] result = ArraySorter.sort(shortArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(shortArray)));
    }

    //Sapient generated method id: ${sort7Test}, hash: 8F87FE2862D70624EBE6E7D9CDB2D570
    @Test()
    void sort7Test() {
        //Arrange Statement(s)
        Object[] objectArray = new Object[] {};
        
        //Act Statement(s)
        Object[] result = ArraySorter.sort(objectArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectArray)));
    }

    //Sapient generated method id: ${sort8Test}, hash: 389E172578441F332CF1D8E2D945D0BE
    @Test()
    void sort8Test() {
        //Arrange Statement(s)
        Object[] objectArray = new Object[] {};
        Comparator comparator = Comparator.reverseOrder();
        
        //Act Statement(s)
        Object[] result = ArraySorter.sort(objectArray, comparator);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectArray)));
    }
}
