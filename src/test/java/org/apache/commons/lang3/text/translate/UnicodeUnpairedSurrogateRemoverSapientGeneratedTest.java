package org.apache.commons.lang3.text.translate;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Writer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UnicodeUnpairedSurrogateRemoverSapientGeneratedTest {

    //Sapient generated method id: ${0386830b-02e2-3dd1-9162-ecd1602d92cb}
    @Test()
    void translate3WhenCodePointLessThanOrEqualsToCharacterMAX_SURROGATE() throws IOException {
        /* Branches:
         * (codePoint >= Character.MIN_SURROGATE) : true
         * (codePoint <= Character.MAX_SURROGATE) : true
         */
        //Arrange Statement(s)
        UnicodeUnpairedSurrogateRemover target = new UnicodeUnpairedSurrogateRemover();
        Writer writer = Writer.nullWriter();

        //Act Statement(s)
        boolean result = target.translate(55296, writer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${84cdaa36-072e-3895-9516-9195e6e21ffb}
    @Test()
    void translate3WhenCodePointGreaterThanCharacterMAX_SURROGATE() throws IOException {
        /* Branches:
         * (codePoint >= Character.MIN_SURROGATE) : true
         * (codePoint <= Character.MAX_SURROGATE) : false
         */
        //Arrange Statement(s)
        UnicodeUnpairedSurrogateRemover target = new UnicodeUnpairedSurrogateRemover();
        Writer writer = Writer.nullWriter();

        //Act Statement(s)
        boolean result = target.translate(57344, writer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }
}
