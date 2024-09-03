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
class IntegerRangeSapientGeneratedTest {

    //Sapient generated method id: ${of2Test}, hash: E025C7F912AEF12DBE5FA4EF0B64FD41
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

    //Sapient generated method id: ${of3WhenDefaultBranch}, hash: 285384A9926A596F5A98583E25C0480C
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

    //Sapient generated method id: ${of3WhenDefaultBranchAndDefaultBranch}, hash: B0888DFF675083BF3582A86DA874808A
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
