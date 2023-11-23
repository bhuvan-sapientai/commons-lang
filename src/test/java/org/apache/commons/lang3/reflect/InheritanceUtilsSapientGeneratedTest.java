package org.apache.commons.lang3.reflect;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class InheritanceUtilsSapientGeneratedTest {

    //Sapient generated method id: ${7400acc1-8232-3c36-bd71-6eb0718276fa}
    @Test()
    void distanceWhenParentIsNull() {
        /* Branches:
         * (child == null) : false
         * (parent == null) : true
         */
        //Arrange Statement(s)
        Class<?> _class = null;
        //Act Statement(s)
        int result = InheritanceUtils.distance(Object.class, _class);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${0b309641-649a-3d89-8eee-f426920bb844}
    @Test()
    void distanceWhenChildEqualsParent() {
        /* Branches:
         * (child == null) : false
         * (parent == null) : false
         * (child.equals(parent)) : true
         */
        //Act Statement(s)
        int result = InheritanceUtils.distance(Object.class, Object.class);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${79d5aa09-19b3-30e6-ae74-9eea0aa8209b}
    @Test()
    void distanceWhenDEquals1() {
        /* Branches:
         * (child == null) : false
         * (parent == null) : false
         * (child.equals(parent)) : false
         * (d == 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        int result = InheritanceUtils.distance(Object.class, Object.class);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${ef59934b-6e64-3aff-b0da-205bd8d4febc}
    @Disabled()
    @Test()
    void distanceWhenDGreaterThan0() {
        /* Branches:
         * (child == null) : false
         * (parent == null) : false
         * (child.equals(parent)) : false
         * (d == 1) : false
         * (d > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        int result = InheritanceUtils.distance(Object.class, Object.class);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(2)));
    }

    //Sapient generated method id: ${ec54d6b2-3d9d-3ebc-9a9a-0f8d35109380}
    @Disabled()
    @Test()
    void distanceWhenDNotGreaterThan0() {
        /* Branches:
         * (child == null) : false
         * (parent == null) : false
         * (child.equals(parent)) : false
         * (d == 1) : false
         * (d > 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        int result = InheritanceUtils.distance(Object.class, Object.class);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }
}
