package org.apache.commons.lang3.builder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DiffResultSapientGeneratedTest {

    private final Diff diffMock = mock(Diff.class);

    //Sapient generated method id: ${getDiffsTest}, hash: BF710EC9F7E412B135D72E05661F8C94
    @Test()
    void getDiffsTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        List<Diff<?>> anyList = new ArrayList<>();
        anyList.add(diffMock);
        DiffResult<Object> target = new DiffResult(object, object2, anyList, (ToStringStyle) null);
        
        //Act Statement(s)
        List<Diff<?>> result = target.getDiffs();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result.get(0), is(instanceOf(Diff.class)));
        });
    }

    //Sapient generated method id: ${getNumberOfDiffsTest}, hash: 33EE77F6EB47AD832CAAA0A9EDEDD0BC
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

    //Sapient generated method id: ${iteratorTest}, hash: F8C1979A3A2911901E0C3005BF8246E0
    @Test()
    void iteratorTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        List<Diff<?>> anyList = new ArrayList<>();
        DiffResult<Object> target = new DiffResult(object, object2, anyList, (ToStringStyle) null);
        
        //Act Statement(s)
        Iterator<Diff<?>> result = target.iterator();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${toStringTest}, hash: 484BC57246999E1F8D664D81B3815376
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

    //Sapient generated method id: ${toString1WhenDiffListIsEmpty}, hash: E3E9BC1DBF5D9C0B6EB9093867433DAD
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
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        
        //Act Statement(s)
        String result = target.toString(recursiveToStringStyle);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }

    //Sapient generated method id: ${toString1WhenDiffListNotIsEmpty}, hash: 0C6F73B58A9521524E0447666BAAA234
    @Test()
    void toString1WhenDiffListNotIsEmpty() {
        /* Branches:
         * (diffList.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        List<Diff<?>> anyList = new ArrayList<>();
        anyList.add(diffMock);
        DiffResult<Object> target = new DiffResult(object, object2, anyList, (ToStringStyle) null);
        RecursiveToStringStyle recursiveToStringStyle = new RecursiveToStringStyle();
        
        //Act Statement(s)
        String result = target.toString(recursiveToStringStyle);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("A differs from B")));
    }
}
