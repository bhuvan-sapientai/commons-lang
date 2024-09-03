package org.apache.commons.lang3.function;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.function.Supplier;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SuppliersSapientGeneratedTest {

    //Sapient generated method id: ${getWhenSupplierIsNull}, hash: 83BD15EF6404BE40F983ACE964C653F0
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

    //Sapient generated method id: ${getWhenSupplierIsNotNull}, hash: 7AE25A8AA68EA62E4B2A13A409F31D40
    @Test()
    void getWhenSupplierIsNotNull() {
        /* Branches:
         * (supplier == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Supplier supplierMock = mock(Supplier.class);
        
        //Act Statement(s)
        Object result = Suppliers.get(supplierMock);
        
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${nulTest}, hash: B23E0575478F99762615D45E8C27116C
    @Test()
    void nulTest() {
        
        //Act Statement(s)
        Supplier result = Suppliers.nul();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
