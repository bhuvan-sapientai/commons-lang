package org.apache.commons.lang3.text.translate;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Writer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class OctalUnescaperSapientGeneratedTest {

    //Sapient generated method id: ${40be5157-50d7-3ff0-b17d-589681223868}
    @Test()
    void translateWhenChGreaterThan_7_AndIsOctalDigitNotInputCharAtIndexPlus1() throws IOException {
        /* Branches:
         * (input.charAt(index) == '\\') : true
         * (remaining > 0) : true
         * (ch >= '0') : true  #  inside isOctalDigit method
         * (ch <= '7') : false  #  inside isOctalDigit method
         * (isOctalDigit(input.charAt(index + 1))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        OctalUnescaper target = new OctalUnescaper();
        Writer writer = Writer.nullWriter();

        //Act Statement(s)
        int result = target.translate("translate_charSequence1", 0, writer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${b7d517c8-fda7-3277-aa6c-28c30611b376}
    @Test()
    void translateWhenIsOctalDigitNotInputCharAtNext2() throws IOException {
        /* Branches:
         * (input.charAt(index) == '\\') : true
         * (remaining > 0) : true
         * (ch >= '0') : true  #  inside isOctalDigit method
         * (ch <= '7') : true  #  inside isOctalDigit method
         * (isOctalDigit(input.charAt(index + 1))) : true
         * (remaining > 1) : true
         * (isOctalDigit(input.charAt(next2))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        OctalUnescaper target = new OctalUnescaper();
        Writer writer = Writer.nullWriter();

        //Act Statement(s)
        int result = target.translate("translate_charSequence1", 0, writer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${9a664ebf-b16a-3e48-b1ad-d502043063ec}
    @Test()
    void translateWhenChGreaterThan_3_AndIsZeroToThreeNotInputCharAtNext() throws IOException {
        /* Branches:
         * (input.charAt(index) == '\\') : true
         * (remaining > 0) : true
         * (ch >= '0') : true  #  inside isOctalDigit method
         * (ch <= '7') : true  #  inside isOctalDigit method
         * (isOctalDigit(input.charAt(index + 1))) : true
         * (remaining > 1) : true
         * (isOctalDigit(input.charAt(next2))) : true
         * (remaining > 2) : true
         * (ch >= '0') : true  #  inside isZeroToThree method
         * (ch <= '3') : false  #  inside isZeroToThree method
         * (isZeroToThree(input.charAt(next))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        OctalUnescaper target = new OctalUnescaper();
        Writer writer = Writer.nullWriter();

        //Act Statement(s)
        int result = target.translate("translate_charSequence1", 0, writer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${81f81aba-f8c4-3f84-97e4-13f4c562554e}
    @Test()
    void translateWhenIsOctalDigitInputCharAtNext3() throws IOException {
        /* Branches:
         * (input.charAt(index) == '\\') : true
         * (remaining > 0) : true
         * (ch >= '0') : true  #  inside isOctalDigit method
         * (ch <= '7') : true  #  inside isOctalDigit method
         * (isOctalDigit(input.charAt(index + 1))) : true
         * (remaining > 1) : true
         * (isOctalDigit(input.charAt(next2))) : true
         * (remaining > 2) : true
         * (ch >= '0') : true  #  inside isZeroToThree method
         * (ch <= '3') : true  #  inside isZeroToThree method
         * (isZeroToThree(input.charAt(next))) : true
         * (isOctalDigit(input.charAt(next3))) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        OctalUnescaper target = new OctalUnescaper();
        Writer writer = Writer.nullWriter();

        //Act Statement(s)
        int result = target.translate("translate_charSequence1", 0, writer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${ee6ee53d-5a3e-36a0-a563-32e3de92147a}
    @Test()
    void translateWhenIsOctalDigitNotInputCharAtNext3() throws IOException {
        /* Branches:
         * (input.charAt(index) == '\\') : true
         * (remaining > 0) : true
         * (ch >= '0') : true  #  inside isOctalDigit method
         * (ch <= '7') : true  #  inside isOctalDigit method
         * (isOctalDigit(input.charAt(index + 1))) : true
         * (remaining > 1) : true
         * (isOctalDigit(input.charAt(next2))) : true
         * (remaining > 2) : true
         * (ch >= '0') : true  #  inside isZeroToThree method
         * (ch <= '3') : true  #  inside isZeroToThree method
         * (isZeroToThree(input.charAt(next))) : true
         * (isOctalDigit(input.charAt(next3))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        OctalUnescaper target = new OctalUnescaper();
        Writer writer = Writer.nullWriter();

        //Act Statement(s)
        int result = target.translate("translate_charSequence1", 0, writer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }
}
