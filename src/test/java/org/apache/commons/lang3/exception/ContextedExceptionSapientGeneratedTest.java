package org.apache.commons.lang3.exception;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ContextedExceptionSapientGeneratedTest {

    //Sapient generated method id: ${82123540-6c5a-3f54-8d29-1396daa44948}
    @Test()
    void addContextValueTest() {
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        ContextedException target = new ContextedException("message1", throwable, (ExceptionContext) null);
        Object object = new Object();
        //Act Statement(s)
        ContextedException result = target.addContextValue("label1", object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${f658654c-b6e0-36a4-9c4c-a021c8c785ec}
    @Test()
    void setContextValueTest() {
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        ContextedException target = new ContextedException("message1", throwable, (ExceptionContext) null);
        Object object = new Object();
        //Act Statement(s)
        ContextedException result = target.setContextValue("label1", object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${c9992cf4-fcd4-34e8-8cb2-98e92afa0b97}
    @Test()
    void getContextValuesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        ContextedException target = new ContextedException("message1", throwable, (ExceptionContext) null);
        //Act Statement(s)
        List<Object> result = target.getContextValues("<value>");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${fca5c5a9-c2d3-39fe-b041-21168a68c5b6}
    @Test()
    void getFirstContextValueTest() {
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        ContextedException target = new ContextedException("message1", throwable, (ExceptionContext) null);
        //Act Statement(s)
        Object result = target.getFirstContextValue("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${2483c859-66ed-31bb-8076-d8a69fca7655}
    @Test()
    void getContextEntriesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        ContextedException target = new ContextedException("message1", throwable, (ExceptionContext) null);
        //Act Statement(s)
        List<Pair<String, Object>> result = target.getContextEntries();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${05319225-a66c-3aa8-99f6-a201d5ba34db}
    @Test()
    void getContextLabelsTest() {
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        ContextedException target = new ContextedException("message1", throwable, (ExceptionContext) null);
        //Act Statement(s)
        Set<String> result = target.getContextLabels();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${a52bed3f-53de-303b-8128-55ffe95a8205}
    @Test()
    void getMessageTest() {
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        ContextedException target = spy(new ContextedException("message1", throwable, (ExceptionContext) null));
        doReturn("A").when(target).getMessage();
        //Act Statement(s)
        String result = target.getMessage();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("A"));
            verify(target).getMessage();
        });
    }

    //Sapient generated method id: ${83021f3e-2e09-3289-a8d1-c3aba066e0cb}
    @Disabled()
    @Test()
    void getRawMessageTest() {
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        ContextedException target = spy(new ContextedException("message1", throwable, (ExceptionContext) null));
        doReturn("return_of_getMessage1").when(target).getMessage();
        //Act Statement(s)
        String result = target.getRawMessage();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getMessage1"));
            verify(target).getMessage();
        });
    }

    //Sapient generated method id: ${44aa1dcc-ae37-3bc2-a071-4512ca43f1d9}
    @Test()
    void getFormattedExceptionMessageTest() {
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        ContextedException target = new ContextedException("message1", throwable, (ExceptionContext) null);
        //Act Statement(s)
        String result = target.getFormattedExceptionMessage("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("A")));
    }
}
