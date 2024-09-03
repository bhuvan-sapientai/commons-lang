package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArrayFillSapientGeneratedTest {

    //Sapient generated method id: ${fillTest}, hash: E9489C152BE2518513AE7BF69C3D99D9
    @Test()
    void fillTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        
        //Act Statement(s)
        byte[] result = ArrayFill.fill(byteArray, (byte) 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteArray)));
    }

    //Sapient generated method id: ${fill1Test}, hash: 0C70D511D3DC5C07AB63FDBAA1142F67
    @Test()
    void fill1Test() {
        //Arrange Statement(s)
        char[] charArray = new char[] {};
        
        //Act Statement(s)
        char[] result = ArrayFill.fill(charArray, 'A');
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charArray)));
    }

    //Sapient generated method id: ${fill2Test}, hash: 818354BAB99030421614336BF8B798FD
    @Test()
    void fill2Test() {
        //Arrange Statement(s)
        double[] doubleArray = new double[] {};
        
        //Act Statement(s)
        double[] result = ArrayFill.fill(doubleArray, Double.parseDouble("1.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(doubleArray)));
    }

    //Sapient generated method id: ${fill3Test}, hash: A6AF03FE64105830613E418371E4FBEF
    @Test()
    void fill3Test() {
        //Arrange Statement(s)
        float[] floatArray = new float[] {};
        
        //Act Statement(s)
        float[] result = ArrayFill.fill(floatArray, Float.parseFloat("1.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(floatArray)));
    }

    //Sapient generated method id: ${fill4Test}, hash: DC4F9C4751A031E45651AB08C67AA260
    @Test()
    void fill4Test() {
        //Arrange Statement(s)
        int[] intArray = new int[] {};
        
        //Act Statement(s)
        int[] result = ArrayFill.fill(intArray, 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(intArray)));
    }

    //Sapient generated method id: ${fill5Test}, hash: DE58ED7A4F566831C7943D76B835A76F
    @Test()
    void fill5Test() {
        //Arrange Statement(s)
        long[] longArray = new long[] {};
        
        //Act Statement(s)
        long[] result = ArrayFill.fill(longArray, 1L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longArray)));
    }

    //Sapient generated method id: ${fill6Test}, hash: 1DA98571DA4DED746315AA5E35F6E0C6
    @Test()
    void fill6Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        short[] shortArray = new short[] {};
        
        //Act Statement(s)
        short[] result = ArrayFill.fill(shortArray, (short) 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(shortArray)));
    }

    //Sapient generated method id: ${fill7Test}, hash: FFE4608687F341CA7ECE65D105008DFB
    @Test()
    void fill7Test() {
        //Arrange Statement(s)
        Object[] objectArray = new Object[] {};
        Object object = new Object();
        
        //Act Statement(s)
        Object[] result = ArrayFill.fill(objectArray, object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectArray)));
    }
}
