package org.apache.commons.lang3.function;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FunctionsSapientGeneratedTest {

    //Sapient generated method id: ${05d70beb-4151-3f45-8827-45003502d2c7}
    @Test()
    void functionTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Function<Object, Object> function = null;

        //Act Statement(s)
        Function<Object, Object> result = Functions.function(function);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(function)));
    }
}
