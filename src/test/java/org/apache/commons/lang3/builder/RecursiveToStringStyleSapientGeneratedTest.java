package org.apache.commons.lang3.builder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.ArrayList;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RecursiveToStringStyleSapientGeneratedTest {

    //Sapient generated method id: ${06b5e3db-d661-3194-aaf0-0eb1e68e32f2}
    @Test()
    void appendDetailWhenAcceptValueGetClass() {
        /* Branches:
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true
         * (!String.class.equals(value.getClass())) : true
         * (accept(value.getClass())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        RecursiveToStringStyle target = spy(new RecursiveToStringStyle());
        doReturn(true).when(target).accept(Object.class);
        StringBuffer stringBuffer = new StringBuffer();
        Object object = new Object();

        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", object);

        //Assert statement(s)
        assertAll("result", () -> verify(target).accept(Object.class));
    }

    //Sapient generated method id: ${09faeffd-ed91-3a80-8d01-b964376e649e}
    @Test()
    void appendDetailWhenAcceptNotValueGetClass() {
        /* Branches:
         * (!ClassUtils.isPrimitiveWrapper(value.getClass())) : true
         * (!String.class.equals(value.getClass())) : true
         * (accept(value.getClass())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        RecursiveToStringStyle target = spy(new RecursiveToStringStyle());
        doReturn(false).when(target).accept(Object.class);
        StringBuffer stringBuffer = new StringBuffer();
        Object object = new Object();

        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", object);

        //Assert statement(s)
        assertAll("result", () -> verify(target).accept(Object.class));
    }

    //Sapient generated method id: ${64960aca-39de-3bfc-a4c1-60132d2dc9f4}
    @Test()
    void appendDetail1Test() {
        //Arrange Statement(s)
        RecursiveToStringStyle target = spy(new RecursiveToStringStyle());
        StringBuffer stringBuffer = new StringBuffer();
        Collection<Object> collection = new ArrayList<>();
        doNothing().when(target).appendClassName(stringBuffer, collection);
        doNothing().when(target).appendIdentityHashCode(stringBuffer, collection);
        Object[] objectArray = new Object[]{};
        doNothing().when(target).appendDetail(stringBuffer, "fieldName1", objectArray);

        //Act Statement(s)
        target.appendDetail(stringBuffer, "fieldName1", collection);

        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).appendClassName(stringBuffer, collection);
            verify(target).appendIdentityHashCode(stringBuffer, collection);
            verify(target).appendDetail(stringBuffer, "fieldName1", objectArray);
        });
    }

    //Sapient generated method id: ${7b2c2fb4-ef75-3919-82fb-d0fa67974572}
    @Test()
    void acceptTest() {
        //Arrange Statement(s)
        RecursiveToStringStyle target = new RecursiveToStringStyle();

        //Act Statement(s)
        boolean result = target.accept(Object.class);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }
}
