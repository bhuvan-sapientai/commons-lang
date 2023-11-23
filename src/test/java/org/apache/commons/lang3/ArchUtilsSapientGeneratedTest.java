package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.commons.lang3.arch.Processor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArchUtilsSapientGeneratedTest {

    //Sapient generated method id: ${fc3a5b69-8072-3954-8710-49bcffc6dc18}
    @Disabled()
    @Test()
    void getProcessorTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Processor result = ArchUtils.getProcessor();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${c339edf7-68b9-37e3-ab2f-a6fbbdfabc82}
    @Disabled()
    @Test()
    void getProcessor1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Processor result = ArchUtils.getProcessor("x86");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }
}
