package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.nio.charset.Charset;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CharsetsSapientGeneratedTest {

    //Sapient generated method id: ${8a4e5fc8-dd58-3300-a61d-b787f0e8178a}
    @Test()
    void toCharsetWhenCharsetIsNull() {
        /* Branches:
         * (charset == null) : true
         */
        //Arrange Statement(s)
        Charset charset = null;

        //Act Statement(s)
        Charset result = Charsets.toCharset(charset);
        Charset charset2 = Charset.defaultCharset();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charset2)));
    }

    //Sapient generated method id: ${389c2092-dd9d-3cde-b19b-a3442ca94c6e}
    @Test()
    void toCharsetWhenCharsetIsNotNull() {
        /* Branches:
         * (charset == null) : false
         */
        //Arrange Statement(s)
        Charset charset = Charset.defaultCharset();

        //Act Statement(s)
        Charset result = Charsets.toCharset(charset);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charset)));
    }

    //Sapient generated method id: ${6c8f7ea1-faa2-351e-babf-d34af42a0f4e}
    @Test()
    void toCharset1WhenCharsetNameIsNull() {
        /* Branches:
         * (charsetName == null) : true
         */

        //Act Statement(s)
        Charset result = Charsets.toCharset((String) null);
        Charset charset = Charset.defaultCharset();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charset)));
    }

    //Sapient generated method id: ${5f6c89b5-21d0-3b35-b9b7-ccd8a3bb2243}
    @Test()
    void toCharset1WhenCharsetNameIsNotNull() {
        /* Branches:
         * (charsetName == null) : false
         */

        //Act Statement(s)
        Charset result = Charsets.toCharset("UTF-8");
        Charset charset = Charset.forName("UTF-8");

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charset)));
    }

    //Sapient generated method id: ${7bbc7706-1a97-3eac-91ce-d1568bd3d4dc}
    @Test()
    void toCharsetNameWhenCharsetNameIsNull() {
        /* Branches:
         * (charsetName == null) : true
         */

        //Act Statement(s)
        String result = Charsets.toCharsetName((String) null);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("UTF-8")));
    }

    //Sapient generated method id: ${1a68f7b9-2292-3bf9-a976-f2f733caac63}
    @Test()
    void toCharsetNameWhenCharsetNameIsNotNull() {
        /* Branches:
         * (charsetName == null) : false
         */

        //Act Statement(s)
        String result = Charsets.toCharsetName("charsetName1");

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("charsetName1")));
    }
}
