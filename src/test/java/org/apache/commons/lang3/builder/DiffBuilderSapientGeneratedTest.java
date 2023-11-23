package org.apache.commons.lang3.builder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DiffBuilderSapientGeneratedTest {

    //Sapient generated method id: ${76bd54cd-9b0b-3427-a139-836d90f0ef05}
    @Test()
    void appendWhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", false, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${46af45ca-40f6-3124-9e74-be5042ff0129}
    @Test()
    void append1WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        boolean[] booleanArray = new boolean[]{};
        boolean[] booleanArray2 = new boolean[]{};
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", booleanArray, booleanArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${0beab7d6-b07e-35a4-84ab-0a97f1098b34}
    @Test()
    void append2WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", (byte) 0, (byte) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${8fa7a163-097a-38e6-af44-6d79d91a96af}
    @Test()
    void append3WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        byte[] byteArray = new byte[]{};
        byte[] byteArray2 = new byte[]{};
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", byteArray, byteArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${565fd92e-b25a-35d5-a7b6-f0fc1acfc8ba}
    @Test()
    void append4WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", 'A', 'A');
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${673968fa-e5dc-3aeb-96bc-2d87bc77376b}
    @Test()
    void append5WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        char[] charArray = new char[]{};
        char[] charArray2 = new char[]{};
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", charArray, charArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${8c2a4112-a6e6-3e80-a220-4c116407ae86}
    @Test()
    void append6WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", Double.parseDouble("0.0"), Double.parseDouble("0.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${b352f3a5-c7ce-3499-a8d0-61733cff6af8}
    @Test()
    void append7WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        double[] doubleArray = new double[]{};
        double[] doubleArray2 = new double[]{};
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", doubleArray, doubleArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${9d1b7938-9d00-3cc9-bf5b-edc53dc2cfcc}
    @Test()
    void append8WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", Float.parseFloat("0.0"), Float.parseFloat("0.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${607d1c25-ccbc-3c57-8749-cb5f41c66305}
    @Test()
    void append9WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        float[] floatArray = new float[]{};
        float[] floatArray2 = new float[]{};
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", floatArray, floatArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${1e465a15-ab6e-3231-b744-417f25219d38}
    @Test()
    void append10WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", 0, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${09f5d8b6-1bdf-31c0-bc1e-26eb150575e8}
    @Test()
    void append11WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        int[] intArray = new int[]{};
        int[] intArray2 = new int[]{};
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", intArray, intArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${4345f138-31ee-3ee5-9968-f3fa7afe9d03}
    @Test()
    void append12WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", 0L, 0L);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${84d4bb21-0833-3a01-b9db-0e19ce433b7d}
    @Test()
    void append13WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        long[] longArray = new long[]{};
        long[] longArray2 = new long[]{};
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", longArray, longArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${ae8a7aec-7cc9-3b1d-bdfc-a2e589548813}
    @Test()
    void append14WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", (short) 0, (short) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${9238ec27-4968-32ab-9f0f-d019abc60b9c}
    @Test()
    void append15WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        short[] shortArray = new short[]{};
        short[] shortArray2 = new short[]{};
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", shortArray, shortArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${fa3a0f4a-420e-3d08-a785-3c3ea4f99d79}
    @Test()
    void append16WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        Object object3 = new Object();
        Object object4 = new Object();
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", object3, object4);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${0639e741-ad3f-316f-b8a8-9946cf7b61bf}
    @Test()
    void append17WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        Object[] objectArray = new Object[]{};
        Object[] objectArray2 = new Object[]{};
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", objectArray, objectArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${a025fd73-e44d-346e-829e-9df39aad46ae}
    @Disabled()
    @Test()
    void append18WhenObjectsTriviallyEqual() {
        /* Branches:
         * (objectsTriviallyEqual) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        //TODO: Needs initialization with real value
        DiffResult<Object> diffResult = null;
        //Act Statement(s)
        DiffBuilder result = target.append("fieldName1", diffResult);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${c319ea97-f8d0-37c4-a5dd-88e142a90c6d}
    @Disabled()
    @Test()
    void buildTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        DiffBuilder target = new DiffBuilder(object, object2, (ToStringStyle) null, true);
        //Act Statement(s)
        DiffResult result = target.build();
        List<Diff<?>> anyList = new ArrayList<>();
        DiffResult diffResult = new DiffResult(object, object2, anyList, (ToStringStyle) null);
        //Assert statement(s)
        //TODO: Please implement equals method in DiffResult for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(diffResult)));
    }
}
