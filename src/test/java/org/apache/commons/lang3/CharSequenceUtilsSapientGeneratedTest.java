package org.apache.commons.lang3;

import org.apache.commons.lang3.CharSequenceUtils;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CharSequenceUtilsSapientGeneratedTest {

    @Test
    void indexOfWhenCsInstanceOfString() {
        int result = CharSequenceUtils.indexOf("Hello", "l", 0);
        assertThat(result, equalTo(2));
    }

    @Test
    void indexOfWhenCsInstanceOfStringBuilder() {
        StringBuilder sb = new StringBuilder("Hello");
        int result = CharSequenceUtils.indexOf(sb, "l", 0);
        assertThat(result, equalTo(2));
    }

    @Test
    void indexOfWhenCsInstanceOfStringBuffer() {
        StringBuffer sb = new StringBuffer("Hello");
        int result = CharSequenceUtils.indexOf(sb, "l", 1);
        assertThat(result, equalTo(2));
    }

    @Test
    void indexOfWhenCsNotInstanceOfStringBuffer() {
        CharSequence cs = new StringBuilder("Hello");
        int result = CharSequenceUtils.indexOf(cs, "l", 0);
        assertThat(result, equalTo(2));
    }

    @ParameterizedTest
    @CsvSource({ "Hello, l, 0, 2", "Hello, o, 0, 4", "Hello, x, 0, -1", "Hello, H, 1, -1" })
    void indexOf1WithVariousInputs(String cs, int searchChar, int start, int expected) {
        int result = CharSequenceUtils.indexOf(cs, searchChar, start);
        assertThat(result, equalTo(expected));
    }

    @Test
    void indexOf1WithSupplementaryCharacter() {
        // String with a smiley emoji
        String cs = "Hello\uD83D\uDE00World";
        // Unicode code point for smiley emoji
        int result = CharSequenceUtils.indexOf(cs, 0x1F600, 0);
        assertThat(result, equalTo(5));
    }

    @Test
    void lastIndexOfWhenCsIsNull() {
        int result = CharSequenceUtils.lastIndexOf(null, (CharSequence) "test", 0);
        assertThat(result, equalTo(-1));
    }

    @ParameterizedTest
    @CsvSource({ "Hello, l, 4, 3", "Hello, o, 4, 4", "Hello, x, 4, -1", "Hello, H, 1, 0" })
    void lastIndexOfWithVariousInputs(String cs, String searchChar, int start, int expected) {
        int result = CharSequenceUtils.lastIndexOf(cs, searchChar, start);
        assertThat(result, equalTo(expected));
    }

    @ParameterizedTest
    @CsvSource({ "Hello, l, 4, 3", "Hello, o, 4, 4", "Hello, x, 4, -1", "Hello, H, 1, 0" })
    void lastIndexOf1WithVariousInputs(String cs, int searchChar, int start, int expected) {
        int result = CharSequenceUtils.lastIndexOf(cs, searchChar, start);
        assertThat(result, equalTo(expected));
    }

    @Test
    void lastIndexOf1WithSupplementaryCharacter() {
        // String with two smiley emojis
        String cs = "Hello\uD83D\uDE00World\uD83D\uDE00";
        // Unicode code point for smiley emoji
        int result = CharSequenceUtils.lastIndexOf(cs, 0x1F600, cs.length() - 1);
        assertThat(result, equalTo(11));
    }

    @ParameterizedTest
    @CsvSource({ "Hello, false, 0, hello, 0, 5, true", "Hello, true, 0, HELLO, 0, 5, true", "Hello, false, 0, HELLO, 0, 5, false", "Hello, false, 1, ello, 0, 4, true", "Hello, false, 0, Hello, 0, 4, true", "Hello, false, 0, Hello, 1, 4, false" })
    void regionMatchesWithVariousInputs(String cs, boolean ignoreCase, int thisStart, String substring, int start, int length, boolean expected) {
        boolean result = CharSequenceUtils.regionMatches(cs, ignoreCase, thisStart, substring, start, length);
        assertThat(result, equalTo(expected));
    }

    @Test
    void subSequenceWhenCsIsNull() {
        CharSequence result = CharSequenceUtils.subSequence(null, 0);
        assertThat(result, is(nullValue()));
    }

    @Test
    void subSequenceWhenCsIsNotNull() {
        CharSequence result = CharSequenceUtils.subSequence("Hello", 2);
        assertThat(result, equalTo("llo"));
    }

    @Test
    void toCharArrayWhenSourceIsEmpty() {
        char[] result = CharSequenceUtils.toCharArray("");
        assertThat(result, equalTo(new char[0]));
    }

    @Test
    void toCharArrayWhenSourceIsString() {
        char[] result = CharSequenceUtils.toCharArray("Hello");
        assertThat(result, equalTo(new char[] { 'H', 'e', 'l', 'l', 'o' }));
    }

    @Test
    void toCharArrayWhenSourceIsStringBuilder() {
        StringBuilder sb = new StringBuilder("Hello");
        char[] result = CharSequenceUtils.toCharArray(sb);
        assertThat(result, equalTo(new char[] { 'H', 'e', 'l', 'l', 'o' }));
    }

    @Test
    void checkLaterThan1Method() {
        // This is a private method, so we test it indirectly through lastIndexOf
        int result = CharSequenceUtils.lastIndexOf("HelloHello", "llo", 9);
        assertThat(result, equalTo(7));
    }

    @Test
    void constructorTest() {
        assertDoesNotThrow(() -> new CharSequenceUtils());
    }
}
