package org.apache.commons.lang3.function;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SuppliersSapientGeneratedTest {

    //Sapient generated method id: ${aed7c6f0-a167-3925-82f4-0e518e31097a}
    @Test()
    void nulTest() {
        //Act Statement(s)
        Supplier result = Suppliers.nul();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${6c46cea8-2d5b-3394-9fbf-e124d8ecaed3}
    @Test()
    void getWhenSupplierIsNull() {
        /* Branches:
         * (supplier == null) : true
         */
        //Arrange Statement(s)
        Supplier<Object> supplier = null;
        //Act Statement(s)
        Object result = Suppliers.get(supplier);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${435d7013-90e2-36a2-ad5a-7611b76ef17d}
    @Disabled()
    @Test()
    void getWhenSupplierIsNotNull() {
        /* Branches:
         * (supplier == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Supplier<Object> supplier = null;
        //Act Statement(s)
        Object result = Suppliers.get(supplier);
        Object object = new Object();
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }
}
