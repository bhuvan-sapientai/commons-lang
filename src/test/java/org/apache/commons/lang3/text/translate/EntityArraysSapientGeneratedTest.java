package org.apache.commons.lang3.text.translate;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EntityArraysSapientGeneratedTest {

    //Sapient generated method id: ${80cc62d8-4dac-3fd3-a1c5-abad3e6cfb2e}
    @Disabled()
    @Test()
    void invertWhenILessThanArrayLength() {
        /* Branches:
         * (i < array.length) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray2 = new String[]{"\b", "\\b"};
        String[] stringArray3 = new String[]{"\n", "\\n"};
        String[] stringArray4 = new String[]{"\t", "\\t"};
        String[] stringArray5 = new String[]{"\f", "\\f"};
        String[] stringArray6 = new String[]{"\r", "\\r"};
        String[][] stringArray = new String[][]{stringArray2, stringArray3, stringArray4, stringArray5, stringArray6};
        //Act Statement(s)
        String[][] result = EntityArrays.invert(stringArray);
        String[][] stringResultArray = new String[][]{};
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
    }
}
