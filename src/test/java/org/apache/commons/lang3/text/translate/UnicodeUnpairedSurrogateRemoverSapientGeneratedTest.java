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

    //Sapient generated method id: ${translate3WhenCodePointLessThanOrEqualsToCharacterMAX_SURROGATE}, hash: B47FC4B80A1B9CA27860E795F4C59DE0
    @Test()
    void translate3WhenCodePointLessThanOrEqualsToCharacterMAX_SURROGATE() throws IOException {
        /* Branches:
         * (codePoint >= Character.MIN_SURROGATE) : true
         * (codePoint <= Character.MAX_SURROGATE) : true
         */
        //Arrange Statement(s)
        //UnicodeUnpairedSurrogateRemover target = new UnicodeUnpairedSurrogateRemover();
        //Writer writer = Writer.nullWriter();
        //Act Statement(s)
        //boolean result = target.translate(55296, writer);
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${translate3WhenCodePointGreaterThanCharacterMAX_SURROGATE}, hash: 467F9FBBC557BE927F4F494D1BD8007F
    @Test()
    void translate3WhenCodePointGreaterThanCharacterMAX_SURROGATE() throws IOException {
        /* Branches:
         * (codePoint >= Character.MIN_SURROGATE) : true
         * (codePoint <= Character.MAX_SURROGATE) : false
         */
        //Arrange Statement(s)
        //UnicodeUnpairedSurrogateRemover target = new UnicodeUnpairedSurrogateRemover();
        //Writer writer = Writer.nullWriter();
        //Act Statement(s)
        //boolean result = target.translate(57344, writer);
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }
}