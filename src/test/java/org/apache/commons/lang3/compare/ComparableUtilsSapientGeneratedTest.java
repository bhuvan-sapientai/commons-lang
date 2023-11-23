package org.apache.commons.lang3.compare;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ComparableUtilsSapientGeneratedTest {

    //Sapient generated method id: ${d9deeb8a-01f3-3eca-a9d1-4cdbac046a10}
    @Test()
    void betweenTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Comparable comparable = null;
        //TODO: Needs initialization with real value
        Comparable comparable2 = null;

        //Act Statement(s)
        Predicate result = ComparableUtils.between(comparable, comparable2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${eb38c539-34f2-3525-9566-0dba23a505ed}
    @Test()
    void betweenExclusiveTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Comparable comparable = null;
        //TODO: Needs initialization with real value
        Comparable comparable2 = null;

        //Act Statement(s)
        Predicate result = ComparableUtils.betweenExclusive(comparable, comparable2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${c7d8c8fc-589c-3c67-85b8-b6c0ba6f56b0}
    @Test()
    void geTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Comparable comparable = null;

        //Act Statement(s)
        Predicate result = ComparableUtils.ge(comparable);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${84de9e79-70a1-312c-9e3e-37c05a2466be}
    @Test()
    void gtTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Comparable comparable = null;

        //Act Statement(s)
        Predicate result = ComparableUtils.gt(comparable);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${17723183-1d77-3293-96d3-5c36d008054f}
    @Test()
    void isTest() {
        //Arrange Statement(s)
        Comparable comparable = null;

        //Act Statement(s)
        ComparableUtils.ComparableCheckBuilder result = ComparableUtils.is(comparable);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${3e813070-73e7-364d-8870-7a92a7ee657e}
    @Test()
    void leTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Comparable comparable = null;

        //Act Statement(s)
        Predicate result = ComparableUtils.le(comparable);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${d0d762ed-357a-3960-89ca-6b1ccba779ce}
    @Test()
    void ltTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Comparable comparable = null;

        //Act Statement(s)
        Predicate result = ComparableUtils.lt(comparable);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${4b176472-9a7b-350d-b98d-f3c358047ca8}
    @Test()
    void maxWhenObjectUtilsCompareComparable1Comparable2FalseGreaterThan0() {
        /* Branches:
         * (ObjectUtils.compare(comparable1, comparable2, false) > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Comparable comparable = null;
        //TODO: Needs initialization with real value
        Comparable comparable2 = null;

        //Act Statement(s)
        Comparable result = ComparableUtils.max(comparable, comparable2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(comparable)));
    }

    //Sapient generated method id: ${fd3264d7-7779-3b9c-a904-3fc0fac39cc2}
    @Test()
    void maxWhenObjectUtilsCompareComparable1Comparable2FalseNotGreaterThan0() {
        /* Branches:
         * (ObjectUtils.compare(comparable1, comparable2, false) > 0) : false
         */
        //Arrange Statement(s)
        Comparable comparable = null;
        Comparable comparable2 = null;

        //Act Statement(s)
        Comparable result = ComparableUtils.max(comparable, comparable2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(comparable2)));
    }

    //Sapient generated method id: ${71115ea6-ca73-31c2-9d20-23e463a331c2}
    @Test()
    void minWhenObjectUtilsCompareComparable1Comparable2TrueLessThan0() {
        /* Branches:
         * (ObjectUtils.compare(comparable1, comparable2, true) < 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Comparable comparable = null;
        //TODO: Needs initialization with real value
        Comparable comparable2 = null;

        //Act Statement(s)
        Comparable result = ComparableUtils.min(comparable, comparable2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(comparable)));
    }

    //Sapient generated method id: ${3d9020ff-5d4b-3bb0-b618-d0f401644c90}
    @Test()
    void minWhenObjectUtilsCompareComparable1Comparable2TrueNotLessThan0() {
        /* Branches:
         * (ObjectUtils.compare(comparable1, comparable2, true) < 0) : false
         */
        //Arrange Statement(s)
        Comparable comparable = null;
        Comparable comparable2 = null;

        //Act Statement(s)
        Comparable result = ComparableUtils.min(comparable, comparable2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(comparable2)));
    }
}
