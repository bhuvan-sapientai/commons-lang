package org.apache.commons.lang3.text.translate;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Writer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AggregateTranslatorSapientGeneratedTest {

    //Sapient generated method id: ${759806ea-e470-3b06-add2-be351f3cf8a9}
    @Test()
    void translateWhenConsumedNotEquals0() throws IOException {
        /* Branches:
         * (for-each(translators)) : true
         * (consumed != 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CharSequenceTranslator[] charSequenceTranslatorArray = new CharSequenceTranslator[]{};
        AggregateTranslator target = new AggregateTranslator(charSequenceTranslatorArray);
        Writer writer = Writer.nullWriter();

        //Act Statement(s)
        int result = target.translate("translate_charSequence1", 0, writer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${bacdd31c-ee87-3386-8dde-c8ad22fc92bf}
    @Test()
    void translateWhenConsumedEquals0() throws IOException {
        /* Branches:
         * (for-each(translators)) : true
         * (consumed != 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CharSequenceTranslator[] charSequenceTranslatorArray = new CharSequenceTranslator[]{};
        AggregateTranslator target = new AggregateTranslator(charSequenceTranslatorArray);
        Writer writer = Writer.nullWriter();

        //Act Statement(s)
        int result = target.translate("translate_charSequence1", 0, writer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }
}
