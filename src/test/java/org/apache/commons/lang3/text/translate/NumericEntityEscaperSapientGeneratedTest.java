package org.apache.commons.lang3.text.translate;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Writer;

import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NumericEntityEscaperSapientGeneratedTest {

    //Sapient generated method id: ${c0b2bb0d-ba86-37c8-8dc4-de09d6910458}
    @Test()
    void belowTest() {
        //Arrange Statement(s)
        try (MockedStatic<NumericEntityEscaper> numericEntityEscaper = mockStatic(NumericEntityEscaper.class, CALLS_REAL_METHODS)) {
            NumericEntityEscaper numericEntityEscaper2 = new NumericEntityEscaper();
            numericEntityEscaper.when(() -> NumericEntityEscaper.outsideOf(0, 2147483647)).thenReturn(numericEntityEscaper2);
            //Act Statement(s)
            NumericEntityEscaper result = NumericEntityEscaper.below(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(numericEntityEscaper2));
                numericEntityEscaper.verify(() -> NumericEntityEscaper.outsideOf(0, 2147483647), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${da3e5fe7-cac2-3dfe-9041-bf33d0e7e7a9}
    @Test()
    void aboveTest() {
        //Arrange Statement(s)
        try (MockedStatic<NumericEntityEscaper> numericEntityEscaper = mockStatic(NumericEntityEscaper.class, CALLS_REAL_METHODS)) {
            NumericEntityEscaper numericEntityEscaper2 = new NumericEntityEscaper();
            numericEntityEscaper.when(() -> NumericEntityEscaper.outsideOf(0, 0)).thenReturn(numericEntityEscaper2);
            //Act Statement(s)
            NumericEntityEscaper result = NumericEntityEscaper.above(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(numericEntityEscaper2));
                numericEntityEscaper.verify(() -> NumericEntityEscaper.outsideOf(0, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d9deeb8a-01f3-3eca-a9d1-4cdbac046a10}
    @Test()
    void betweenTest() {

        //Act Statement(s)
        NumericEntityEscaper result = NumericEntityEscaper.between(0, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${e4cd904e-25da-3f8f-a00d-87a280ebe78d}
    @Test()
    void outsideOfTest() {

        //Act Statement(s)
        NumericEntityEscaper result = NumericEntityEscaper.outsideOf(0, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${12313198-5110-3cff-9276-6b29864573f3}
    @Test()
    void translate3WhenCodePointLessThanBelow() throws IOException {
        /* Branches:
         * (between) : true
         * (codePoint < below) : true
         */
        //Arrange Statement(s)
        NumericEntityEscaper target = new NumericEntityEscaper();
        Writer writer = Writer.nullWriter();

        //Act Statement(s)
        boolean result = target.translate(-1, writer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${0cfdeee8-25f7-3c4c-b979-7ee69bfd15da}
    @Test()
    void translate3WhenCodePointNotGreaterThanAbove() throws IOException {
        /* Branches:
         * (between) : true
         * (codePoint < below) : false
         * (codePoint > above) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NumericEntityEscaper target = new NumericEntityEscaper();
        Writer writer = Writer.nullWriter();

        //Act Statement(s)
        boolean result = target.translate(1, writer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }
}
