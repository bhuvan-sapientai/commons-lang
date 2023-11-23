package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LongRangeSapientGeneratedTest {

    //Sapient generated method id: ${89de7933-05e8-343b-97f3-1b0a1a26943a}
    @Test()
    void of2Test() {
        //Arrange Statement(s)
        try (MockedStatic<LongRange> longRange = mockStatic(LongRange.class, CALLS_REAL_METHODS)) {
            LongRange longRange2 = LongRange.of(0L, 0L);
            longRange.when(() -> LongRange.of(1L, 1L)).thenReturn(longRange2);
            //Act Statement(s)
            LongRange result = LongRange.of(1L, 1L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(longRange2));
                longRange.verify(() -> LongRange.of(1L, 1L), atLeast(1));
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
        LongRange result = LongRange.of(0L, 0L);

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
        LongRange result = LongRange.of(0L, 0L);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
