package org.apache.commons.lang3.builder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MultilineRecursiveToStringStyleSapientGeneratedTest {

    //Sapient generated method id: ${appendDetail1WhenAcceptValueGetClass}, hash: 68AB5DB349116B74B7C3458E24B8A8CB
    @Test()
    void appendDetail1WhenAcceptValueGetClass() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : true  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doReturn(true).when(target).accept(boolean[].class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        boolean[] booleanArray = new boolean[] {};
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", booleanArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).accept(boolean[].class);
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${appendDetail1WhenAcceptNotValueGetClass}, hash: 035DA10FBAF4F6D3CE3FD9232251A785
    @Test()
    void appendDetail1WhenAcceptNotValueGetClass() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : false  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doReturn(false).when(target).accept(boolean[].class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        boolean[] booleanArray = new boolean[] {};
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", booleanArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).accept(boolean[].class);
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${appendDetail3WhenAcceptValueGetClass}, hash: 2A299ABE2EEF689274803B1F52F52C01
    @Test()
    void appendDetail3WhenAcceptValueGetClass() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : true  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doReturn(true).when(target).accept(byte[].class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        byte[] byteArray = new byte[] {};
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", byteArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).accept(byte[].class);
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${appendDetail3WhenAcceptNotValueGetClass}, hash: BA2F26B063E2349F561663A8771B8D12
    @Test()
    void appendDetail3WhenAcceptNotValueGetClass() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : false  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doReturn(false).when(target).accept(byte[].class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        byte[] byteArray = new byte[] {};
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", byteArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).accept(byte[].class);
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${appendDetail5WhenAcceptValueGetClass}, hash: 9C7464A7A750931A1841049F6D0AF076
    @Test()
    void appendDetail5WhenAcceptValueGetClass() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : true  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doReturn(true).when(target).accept(char[].class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        char[] charArray = new char[] {};
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", charArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).accept(char[].class);
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${appendDetail5WhenAcceptNotValueGetClass}, hash: A56D9FF7C30D59F3F818B0C4F7F8F0A1
    @Test()
    void appendDetail5WhenAcceptNotValueGetClass() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : false  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doReturn(false).when(target).accept(char[].class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        char[] charArray = new char[] {};
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", charArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).accept(char[].class);
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${appendDetail8WhenAcceptValueGetClass}, hash: 283C749227A08496B31490EB4C0D24C6
    @Test()
    void appendDetail8WhenAcceptValueGetClass() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : true  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doReturn(true).when(target).accept(double[].class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        double[] doubleArray = new double[] {};
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", doubleArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).accept(double[].class);
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${appendDetail8WhenAcceptNotValueGetClass}, hash: 291AC1026AE29D9A466D435EE97204C8
    @Test()
    void appendDetail8WhenAcceptNotValueGetClass() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : false  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doReturn(false).when(target).accept(double[].class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        double[] doubleArray = new double[] {};
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", doubleArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).accept(double[].class);
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${appendDetail10WhenAcceptValueGetClass}, hash: BE0D28FEA1A7B4D9B6E37758320AF3AC
    @Test()
    void appendDetail10WhenAcceptValueGetClass() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : true  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doReturn(true).when(target).accept(float[].class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        float[] floatArray = new float[] {};
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", floatArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).accept(float[].class);
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${appendDetail10WhenAcceptNotValueGetClass}, hash: 95A61D205F96E2608F01BC52DEE7D337
    @Test()
    void appendDetail10WhenAcceptNotValueGetClass() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : false  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doReturn(false).when(target).accept(float[].class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        float[] floatArray = new float[] {};
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", floatArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).accept(float[].class);
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${appendDetail13WhenAcceptValueGetClass}, hash: D186D8AE27C8452D9D401E9A889B5CCA
    @Test()
    void appendDetail13WhenAcceptValueGetClass() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : true  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doReturn(true).when(target).accept(int[].class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        int[] intArray = new int[] {};
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", intArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).accept(int[].class);
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${appendDetail13WhenAcceptNotValueGetClass}, hash: 72848D0CB94F23ADD4E46AE596DF9853
    @Test()
    void appendDetail13WhenAcceptNotValueGetClass() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : false  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doReturn(false).when(target).accept(int[].class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        int[] intArray = new int[] {};
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", intArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).accept(int[].class);
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${appendDetail15WhenAcceptValueGetClass}, hash: A07C0E311E09AF392C5BAA507D0EDFC9
    @Test()
    void appendDetail15WhenAcceptValueGetClass() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : true  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doReturn(true).when(target).accept(long[].class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        long[] longArray = new long[] {};
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", longArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).accept(long[].class);
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${appendDetail15WhenAcceptNotValueGetClass}, hash: 2BF87FA9C36B06F194BB82F42986C2D6
    @Test()
    void appendDetail15WhenAcceptNotValueGetClass() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : false  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doReturn(false).when(target).accept(long[].class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        long[] longArray = new long[] {};
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", longArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).accept(long[].class);
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${appendDetail17WhenILessThanSpaces}, hash: E0CBD8C892407E400AE68A6B3D68DCFB
    @Test()
    void appendDetail17WhenILessThanSpaces() {
        /* Branches:
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true
         * (!String.class.equals(value.getClass())) : true
         * (accept(value.getClass())) : true
         * (i < spaces) : true  #  inside spacer method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doReturn(true).when(target).accept(Object.class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        Object object = new Object();
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", object);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).accept(Object.class);
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${appendDetail17WhenAcceptValueGetClass}, hash: 33A9455C29074846A5DB8D77739B7F1D
    @Test()
    void appendDetail17WhenAcceptValueGetClass() {
        /* Branches:
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true
         * (!String.class.equals(value.getClass())) : true
         * (accept(value.getClass())) : false
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : true  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doReturn(false, true).when(target).accept(Object.class);
        StringBuffer stringBuffer = new StringBuffer();
        Object object = new Object();
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", object);
        
        //Assert statement(s)
        assertAll("result", () -> verify(target, times(2)).accept(Object.class));
    }

    //Sapient generated method id: ${appendDetail17WhenAcceptNotValueGetClass}, hash: BCA600559B1F750C3735187234DA05AF
    @Test()
    void appendDetail17WhenAcceptNotValueGetClass() {
        /* Branches:
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true
         * (!String.class.equals(value.getClass())) : true
         * (accept(value.getClass())) : false
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : false  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doReturn(false).when(target).accept(Object.class);
        StringBuffer stringBuffer = new StringBuffer();
        Object object = new Object();
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", object);
        
        //Assert statement(s)
        assertAll("result", () -> verify(target, times(2)).accept(Object.class));
    }

    //Sapient generated method id: ${appendDetail18WhenAcceptValueGetClass}, hash: 61FCEFCC534E00881BDCD2E63E56716D
    @Test()
    void appendDetail18WhenAcceptValueGetClass() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : true  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doReturn(true).when(target).accept(Object[].class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        Object[] objectArray = new Object[] {};
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", objectArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).accept(Object[].class);
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${appendDetail18WhenAcceptNotValueGetClass}, hash: 4DF859C7F42B123F2F246B6970009238
    @Test()
    void appendDetail18WhenAcceptNotValueGetClass() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : false  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doReturn(false).when(target).accept(Object[].class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        Object[] objectArray = new Object[] {};
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", objectArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).accept(Object[].class);
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${appendDetail20WhenAcceptValueGetClass}, hash: 124551144CC5E86B473761EB546FBBBB
    @Test()
    void appendDetail20WhenAcceptValueGetClass() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : true  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doReturn(true).when(target).accept(short[].class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        short[] shortArray = new short[] {};
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", shortArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).accept(short[].class);
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${appendDetail20WhenAcceptNotValueGetClass}, hash: EC0B68387EC8E2F740BC73F83AD1F8E5
    @Test()
    void appendDetail20WhenAcceptNotValueGetClass() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : false  #  inside appendDetail method
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doReturn(false).when(target).accept(short[].class);
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        short[] shortArray = new short[] {};
        
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", shortArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).accept(short[].class);
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }

    //Sapient generated method id: ${reflectionAppendArrayDetailWhenILessThanSpaces}, hash: C122EAA2470A290C9C1CEF1B65ED6FE1
    @Test()
    void reflectionAppendArrayDetailWhenILessThanSpaces() {
        /* Branches:
         * (i < spaces) : true  #  inside spacer method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doNothing().when(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n\" \",\" \"}");
        doNothing().when(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
        doNothing().when(target).setContentEnd("\n\" \",\" \"]");
        doNothing().when(target).setArrayStart("{\n\" \",\" \"");
        doNothing().when(target).setArraySeparator(",\n\" \",\" \"");
        doNothing().when(target).setArrayEnd("\n}");
        doNothing().when(target).setContentStart("[\n\" \",\" \"");
        doNothing().when(target).setFieldSeparator(",\n\" \",\" \"");
        doNothing().when(target).setContentEnd("\n]");
        StringBuffer stringBuffer = new StringBuffer();
        Object object = new Object();
        
        //Act Statement(s)
        target.reflectionAppendArrayDetail(stringBuffer, "fieldName1", object);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n\" \",\" \",\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setArrayEnd("\n\" \",\" \"}");
            verify(target).setContentStart("[\n\" \",\" \",\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \",\" \",\" \"");
            verify(target).setContentEnd("\n\" \",\" \"]");
            verify(target).setArrayStart("{\n\" \",\" \"");
            verify(target).setArraySeparator(",\n\" \",\" \"");
            verify(target).setArrayEnd("\n}");
            verify(target).setContentStart("[\n\" \",\" \"");
            verify(target).setFieldSeparator(",\n\" \",\" \"");
            verify(target).setContentEnd("\n]");
        });
    }
}
