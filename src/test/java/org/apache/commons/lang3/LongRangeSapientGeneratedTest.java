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

    //Sapient generated method id: ${of2Test}, hash: 7B23C6AA6C43119E3DD20CF60381D992
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

    //Sapient generated method id: ${of3WhenDefaultBranch}, hash: A18C005428C65C003100A9A0D77D8270
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

    //Sapient generated method id: ${of3WhenDefaultBranchAndDefaultBranch}, hash: 8E2F4A572A35C7A6861BB0107B45A38B
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
