package org.apache.commons.lang3.builder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MultilineRecursiveToStringStyleSapientGeneratedTest {

    //Sapient generated method id: ${4907bc98-1ba7-3999-9447-a442a23d494d}
    @Disabled()
    @Test()
    void appendDetailWhenILessThanSpaces() {
        /* Branches:
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true
         * (!String.class.equals(value.getClass())) : true
         * (accept(value.getClass())) : true
         * (i < spaces) : true  #  inside spacer method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MultilineRecursiveToStringStyle target = spy(new MultilineRecursiveToStringStyle());
        doReturn(true).when(target).accept(Object.class);
        doNothing().when(target).setArrayStart("{\n!6!");
        doNothing().when(target).setArraySeparator(",\n!7!");
        doNothing().when(target).setArrayEnd("\n!8!}");
        doNothing().when(target).setContentStart("[\n!9!");
        doNothing().when(target).setFieldSeparator(",\n!a!");
        doNothing().when(target).setContentEnd("\n!b!]");
        doNothing().when(target).setArrayStart("{\n!c!");
        doNothing().when(target).setArraySeparator(",\n!d!");
        doNothing().when(target).setArrayEnd("\n!e!}");
        doNothing().when(target).setContentStart("[\n!f!");
        doNothing().when(target).setFieldSeparator(",\n!10!");
        doNothing().when(target).setContentEnd("\n!11!]");
        StringBuffer stringBuffer = new StringBuffer();
        Object object = new Object();
        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", object);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).accept(Object.class);
            verify(target).setArrayStart("{\n!6!");
            verify(target).setArraySeparator(",\n!7!");
            verify(target).setArrayEnd("\n!8!}");
            verify(target).setContentStart("[\n!9!");
            verify(target).setFieldSeparator(",\n!a!");
            verify(target).setContentEnd("\n!b!]");
            verify(target).setArrayStart("{\n!c!");
            verify(target).setArraySeparator(",\n!d!");
            verify(target).setArrayEnd("\n!e!}");
            verify(target).setContentStart("[\n!f!");
            verify(target).setFieldSeparator(",\n!10!");
            verify(target).setContentEnd("\n!11!]");
        });
    }

    //Sapient generated method id: ${06b5e3db-d661-3194-aaf0-0eb1e68e32f2}
    @Test()
    void appendDetailWhenAcceptValueGetClass() {
        /* Branches:
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true
         * (!String.class.equals(value.getClass())) : true
         * (accept(value.getClass())) : false
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : true  #  inside appendDetail method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
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

    //Sapient generated method id: ${09faeffd-ed91-3a80-8d01-b964376e649e}
    @Test()
    void appendDetailWhenAcceptNotValueGetClass() {
        /* Branches:
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true
         * (!String.class.equals(value.getClass())) : true
         * (accept(value.getClass())) : false
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true  #  inside appendDetail method
         * (!String.class.equals(value.getClass())) : true  #  inside appendDetail method
         * (accept(value.getClass())) : false  #  inside appendDetail method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
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

    //Sapient generated method id: ${92f0c5c0-c5ff-3d02-83d2-b0dbc6a58fa8}
    @Disabled()
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
        doNothing().when(target).setArrayStart("{\n!6!");
        doNothing().when(target).setArraySeparator(",\n!7!");
        doNothing().when(target).setArrayEnd("\n!8!}");
        doNothing().when(target).setContentStart("[\n!9!");
        doNothing().when(target).setFieldSeparator(",\n!a!");
        doNothing().when(target).setContentEnd("\n!b!]");
        doNothing().when(target).setArrayStart("{\n!c!");
        doNothing().when(target).setArraySeparator(",\n!d!");
        doNothing().when(target).setArrayEnd("\n!e!}");
        doNothing().when(target).setContentStart("[\n!f!");
        doNothing().when(target).setFieldSeparator(",\n!10!");
        doNothing().when(target).setContentEnd("\n!11!]");
        StringBuffer stringBuffer = new StringBuffer();
        Object object = new Object();
        //Act Statement(s)
        target.reflectionAppendArrayDetail(stringBuffer, "fieldName1", object);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).setArrayStart("{\n!6!");
            verify(target).setArraySeparator(",\n!7!");
            verify(target).setArrayEnd("\n!8!}");
            verify(target).setContentStart("[\n!9!");
            verify(target).setFieldSeparator(",\n!a!");
            verify(target).setContentEnd("\n!b!]");
            verify(target).setArrayStart("{\n!c!");
            verify(target).setArraySeparator(",\n!d!");
            verify(target).setArrayEnd("\n!e!}");
            verify(target).setContentStart("[\n!f!");
            verify(target).setFieldSeparator(",\n!10!");
            verify(target).setContentEnd("\n!11!]");
        });
    }
}
