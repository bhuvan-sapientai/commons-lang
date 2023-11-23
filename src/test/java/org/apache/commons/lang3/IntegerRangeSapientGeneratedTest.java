package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class IntegerRangeSapientGeneratedTest {

    //Sapient generated method id: ${89de7933-05e8-343b-97f3-1b0a1a26943a}
    @Test()
    void of2Test() {
        //Arrange Statement(s)
        try (MockedStatic<IntegerRange> integerRange = mockStatic(IntegerRange.class, CALLS_REAL_METHODS)) {
            IntegerRange integerRange2 = IntegerRange.of(0, 0);
            integerRange.when(() -> IntegerRange.of(1, 1)).thenReturn(integerRange2);
            //Act Statement(s)
            IntegerRange result = IntegerRange.of(1, 1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(integerRange2));
                integerRange.verify(() -> IntegerRange.of(1, 1), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d3e55c46-8fa8-31a3-835a-1820f41ee673}
    @Test()
    void of3WhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 224)) : false  #  inside <init> method
         * (branch expression (line 229)) : false  #  inside <init> method
         */

        //Act Statement(s)
        IntegerRange result = IntegerRange.of(0, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${7a9cdbde-7415-3a09-b04a-1a4540112cfe}
    @Test()
    void of3WhenDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (branch expression (line 224)) : false  #  inside <init> method
         * (branch expression (line 229)) : false  #  inside <init> method
         */

        //Act Statement(s)
        IntegerRange result = IntegerRange.of(0, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
