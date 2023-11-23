package org.apache.commons.lang3.function;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConsumersSapientGeneratedTest {

    //Sapient generated method id: ${af572c84-a0da-3ae2-befc-cf46c9ddc738}
    @Test()
    void nopTest() {

        //Act Statement(s)
        Consumer result = Consumers.nop();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
