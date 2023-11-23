package org.apache.commons.lang3.exception;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DefaultExceptionContextSapientGeneratedTest {

    //Sapient generated method id: ${82123540-6c5a-3f54-8d29-1396daa44948}
    @Test()
    void addContextValueTest() {
        //Arrange Statement(s)
        DefaultExceptionContext target = new DefaultExceptionContext();
        Object object = new Object();

        //Act Statement(s)
        DefaultExceptionContext result = target.addContextValue("label1", object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${05319225-a66c-3aa8-99f6-a201d5ba34db}
    @Test()
    void getContextLabelsTest() {
        //Arrange Statement(s)
        DefaultExceptionContext target = new DefaultExceptionContext();

        //Act Statement(s)
        Set<String> result = target.getContextLabels();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${c9992cf4-fcd4-34e8-8cb2-98e92afa0b97}
    @Test()
    void getContextValuesTest() {
        //Arrange Statement(s)
        DefaultExceptionContext target = new DefaultExceptionContext();

        //Act Statement(s)
        List<Object> result = target.getContextValues("label1");

        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${fca5c5a9-c2d3-39fe-b041-21168a68c5b6}
    @Test()
    void getFirstContextValueTest() {
        //Arrange Statement(s)
        DefaultExceptionContext target = new DefaultExceptionContext();

        //Act Statement(s)
        Object result = target.getFirstContextValue("label1");

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${5c926255-bbda-3875-98a9-ff9cbf3bc9aa}
    @Test()
    void getFormattedExceptionMessageWhenContextValuesIsEmpty() throws Exception {
        /* Branches:
         * (baseMessage != null) : true
         * (!contextValues.isEmpty()) : false
         */
        //Arrange Statement(s)
        DefaultExceptionContext target = new DefaultExceptionContext();

        //Act Statement(s)
        String result = target.getFormattedExceptionMessage("A");

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("A")));
    }

    //Sapient generated method id: ${f658654c-b6e0-36a4-9c4c-a021c8c785ec}
    @Test()
    void setContextValueTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultExceptionContext target = spy(new DefaultExceptionContext());
        DefaultExceptionContext defaultExceptionContext = new DefaultExceptionContext();
        Object object = new Object();
        doReturn(defaultExceptionContext).when(target).addContextValue("defaultLabel", object);

        //Act Statement(s)
        DefaultExceptionContext result = target.setContextValue("defaultLabel", object);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).addContextValue("defaultLabel", object);
        });
    }
}
