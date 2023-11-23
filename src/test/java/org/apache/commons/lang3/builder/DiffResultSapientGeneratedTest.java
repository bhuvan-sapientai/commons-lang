package org.apache.commons.lang3.builder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Iterator;
import java.util.Spliterators;
import java.util.ArrayList;
import java.util.stream.StreamSupport;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DiffResultSapientGeneratedTest {

    //Sapient generated method id: ${567b19bc-8f91-3884-b935-1ff4556d2712}
    @Test()
    void getDiffsTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        List<Diff<?>> anyList = new ArrayList<>();
        DiffResult<Object> target = new DiffResult(object, object2, anyList, (ToStringStyle) null);
        //Act Statement(s)
        List<Diff<?>> result = target.getDiffs();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${8069d348-a647-3d7d-a5fe-329c386e6dbc}
    @Test()
    void getNumberOfDiffsTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        List<Diff<?>> anyList = new ArrayList<>();
        DiffResult<Object> target = new DiffResult(object, object2, anyList, (ToStringStyle) null);
        //Act Statement(s)
        int result = target.getNumberOfDiffs();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Test()
    void toStringTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        List<Diff<?>> anyList = new ArrayList<>();
        DiffResult<Object> target = spy(new DiffResult(object, object2, anyList, (ToStringStyle) null));
        ToStringStyle toStringStyle = ToStringStyle.DEFAULT_STYLE;
        doReturn("return_of_toString1").when(target).toString(toStringStyle);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_toString1"));
            verify(target).toString(toStringStyle);
        });
    }

    //Sapient generated method id: ${91969d80-d354-3b99-bd69-246cb605afdb}
    @Test()
    void toString1WhenDiffListIsEmpty() {
        /* Branches:
         * (diffList.isEmpty()) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        List<Diff<?>> anyList = new ArrayList<>();
        DiffResult<Object> target = new DiffResult(object, object2, anyList, (ToStringStyle) null);
        //TODO: Needs initialization with real value
        ToStringStyle toStringStyle = null;
        //Act Statement(s)
        String result = target.toString(toStringStyle);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }

    //Sapient generated method id: ${d7449e5f-b54c-3d46-a8b5-6e9727843638}
    @Disabled()
    @Test()
    void toString1WhenNotDiffListIsEmpty() {
        /* Branches:
         * (diffList.isEmpty()) : false
         * (diffList.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        List<Diff<?>> anyList = new ArrayList<>();
        anyList.add((Diff) null);
        DiffResult<Object> target = new DiffResult(object, object2, anyList, (ToStringStyle) null);
        //TODO: Needs initialization with real value
        ToStringStyle toStringStyle = null;
        //Act Statement(s)
        String result = target.toString(toStringStyle);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("A differs from B")));
    }

    //Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}
    @Test()
    void iteratorTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        List<Diff<?>> anyList = new ArrayList<>();
        DiffResult<Object> target = new DiffResult(object, object2, anyList, (ToStringStyle) null);
        //Act Statement(s)
        Iterator<Diff<?>> result = target.iterator();
        List<Diff<?>> anyList2 = new ArrayList<>();
        Iterator<Diff<?>> iteratorResult = anyList2.iterator();
        //Assert statement(s)
        assertAll("result", () -> assertThat(StreamSupport.stream(Spliterators.spliteratorUnknownSize(result, 0), false).toArray(), equalTo(StreamSupport.stream(Spliterators.spliteratorUnknownSize(iteratorResult, 0), false).toArray())));
    }
}
