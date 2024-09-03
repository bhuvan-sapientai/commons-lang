package org.apache.commons.lang3.builder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DiffBuilderSapientGeneratedTest {

    //Sapient generated method id: ${appendWhenObjectsTriviallyEqual}, hash: 2D03344F82B1EDEDE18064A10F58BE1F
    @Test()
    void appendWhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", false, false);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append1WhenObjectsTriviallyEqual}, hash: EB5B7A2F180A78C238A744EFB9A048E6
    @Test()
    void append1WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        boolean[] booleanArray = new boolean[] {};
        boolean[] booleanArray2 = new boolean[] {};
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", booleanArray, booleanArray2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append2WhenObjectsTriviallyEqual}, hash: 125AFCB8A982BF1B4A106EFB8C835F33
    @Test()
    void append2WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", (byte) 0, (byte) 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append3WhenObjectsTriviallyEqual}, hash: F4A54A7342436F0EEF19FF50039E774F
    @Test()
    void append3WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        byte[] byteArray = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", byteArray, byteArray2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append4WhenObjectsTriviallyEqual}, hash: A208BDB474EFF11AA2797402872B634F
    @Test()
    void append4WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", 'A', 'A');
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append5WhenObjectsTriviallyEqual}, hash: E020C19FB90A5B12A181ECD123807327
    @Test()
    void append5WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        char[] charArray = new char[] {};
        char[] charArray2 = new char[] {};
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", charArray, charArray2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append6WhenObjectsTriviallyEqual}, hash: B08BD5CB2CCC1BF20A2CE5AB72A275D5
    @Test()
    void append6WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        DiffResult diffResultMock = mock(DiffResult.class);
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", diffResultMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append7WhenObjectsTriviallyEqual}, hash: B80FEEDAAD1D6A3E591856441A93432D
    @Test()
    void append7WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", Double.parseDouble("0.0"), Double.parseDouble("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append8WhenObjectsTriviallyEqual}, hash: 4EC3ACB2C66009748733A58393736B36
    @Test()
    void append8WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        double[] doubleArray = new double[] {};
        double[] doubleArray2 = new double[] {};
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", doubleArray, doubleArray2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append9WhenObjectsTriviallyEqual}, hash: E2AE18598502F7BC929F6C6C6E39C3D1
    @Test()
    void append9WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", Float.parseFloat("0.0"), Float.parseFloat("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append10WhenObjectsTriviallyEqual}, hash: 9EE81BAA7533DFFAF33BF4153BF3FDDE
    @Test()
    void append10WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        float[] floatArray = new float[] {};
        float[] floatArray2 = new float[] {};
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", floatArray, floatArray2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append11WhenObjectsTriviallyEqual}, hash: 39A102A1DD75E0B679377867A317E968
    @Test()
    void append11WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", 0, 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append12WhenObjectsTriviallyEqual}, hash: 6DE4BBDF0D1C97AF0B32A41733A249E4
    @Test()
    void append12WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        int[] intArray = new int[] {};
        int[] intArray2 = new int[] {};
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", intArray, intArray2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append13WhenObjectsTriviallyEqual}, hash: DB20EA8241E1F7CE12CEEE2D3A7224D6
    @Test()
    void append13WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", 0L, 0L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append14WhenObjectsTriviallyEqual}, hash: E3DEEEE9981C7CBE09DC79782338540C
    @Test()
    void append14WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        long[] longArray = new long[] {};
        long[] longArray2 = new long[] {};
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", longArray, longArray2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append15WhenObjectsTriviallyEqual}, hash: D2C66CB0BD8D1C0C485896CC68D4CE4D
    @Test()
    void append15WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        Object object2 = new Object();
        Object object3 = new Object();
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", object2, object3);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append16WhenObjectsTriviallyEqual}, hash: A503FCD5053FB23CF986F6019514807A
    @Test()
    void append16WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        Object[] objectArray = new Object[] {};
        Object[] objectArray2 = new Object[] {};
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", objectArray, objectArray2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append17WhenObjectsTriviallyEqual}, hash: 38BEC36451B5D0F615DCE12E6608667B
    @Test()
    void append17WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", (short) 0, (short) 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append18WhenObjectsTriviallyEqual}, hash: F48C7844D796B6882A987DF1DF704EB3
    @Test()
    void append18WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        short[] shortArray = new short[] {};
        short[] shortArray2 = new short[] {};
        
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", shortArray, shortArray2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${buildTest}, hash: 5AF953040768F9ADC9C86D84274C12B7
    @Test()
    void buildTest() {
        //Arrange Statement(s)
        Object object = new Object();
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        DiffBuilder target = new DiffBuilder(object, object, recursiveToStringStyle, true);
        
        //Act Statement(s)
        DiffResult result = target.build();
        
        //Assert statement(s)
        //TODO: Please implement equals method in DiffResult for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
