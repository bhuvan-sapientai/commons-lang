package org.apache.commons.lang3.text.translate;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Writer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LookupTranslatorSapientGeneratedTest {

    //Sapient generated method id: ${8eaba18e-09b8-3f35-8622-357e3ae1c000}
    @Test()
    void translateWhenResultIsNotNull() throws IOException {
        /* Branches:
         * (prefixSet.contains(input.charAt(index))) : true
         * (index + longest > input.length()) : true
         * (i >= shortest) : true
         * (result != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CharSequence[][] charSequenceArray = new CharSequence[][]{};
        LookupTranslator target = new LookupTranslator(charSequenceArray);
        Writer writer = Writer.nullWriter();

        //Act Statement(s)
        int result = target.translate("translate_charSequence1", 0, writer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${7ad08f9b-e7cf-3374-872d-9bb23d406b20}
    @Test()
    void translateWhenResultIsNull() throws IOException {
        /* Branches:
         * (prefixSet.contains(input.charAt(index))) : true
         * (index + longest > input.length()) : true
         * (i >= shortest) : true
         * (result != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CharSequence[][] charSequenceArray = new CharSequence[][]{};
        LookupTranslator target = new LookupTranslator(charSequenceArray);
        Writer writer = Writer.nullWriter();

        //Act Statement(s)
        int result = target.translate("translate_charSequence1", 0, writer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }
}
