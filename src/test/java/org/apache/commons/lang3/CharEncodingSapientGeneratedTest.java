package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CharEncodingSapientGeneratedTest {

    //Sapient generated method id: ${834a7785-1cfe-3f4c-8231-22bc63f4d3cf}
    @Test()
    void isSupportedWhenNameIsNull() {
        /* Branches:
         * (name == null) : true
         */
        //Act Statement(s)
        boolean result = CharEncoding.isSupported((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${8adb5c3c-c4f5-3a44-b050-136ed90d366e}
    @Disabled()
    @Test()
    void isSupportedWhenCharsetIsSupportedName() {
        /* Branches:
         * (name == null) : false
         * (Charset.isSupported(name)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = CharEncoding.isSupported("name1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${881e90da-bb31-3ec5-8d88-91a2779d3177}
    @Test()
    void isSupportedWhenCharsetNotIsSupportedName() {
        /* Branches:
         * (name == null) : false
         * (Charset.isSupported(name)) : false
         */
        //Act Statement(s)
        boolean result = CharEncoding.isSupported("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${76387468-b9be-31d4-ad8a-a6ace09babea}
    @Disabled()
    @Test()
    void isSupportedWhenCaughtIllegalCharsetNameException() {
        /* Branches:
         * (name == null) : false
         * (catch-exception (IllegalCharsetNameException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = CharEncoding.isSupported("UTF-8");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }
}
