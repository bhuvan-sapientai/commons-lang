package org.apache.commons.lang3.text.translate;

import org.apache.commons.lang3.text.translate.LookupTranslator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LookupTranslatorSapientGeneratedTest {

    @Test
    void translate1WhenResultIsNotNull() throws IOException {
        CharSequence[][] charSequenceArray = { { "abc", "123" }, { "def", "456" } };
        LookupTranslator target = new LookupTranslator(charSequenceArray);
        StringWriter writer = new StringWriter();
        int result = target.translate("abcdef", 0, writer);
        assertAll(() -> assertThat(result, equalTo(3)), () -> assertThat(writer.toString(), equalTo("123")));
    }

    @Test
    void translate1WhenResultIsNull() throws IOException {
        CharSequence[][] charSequenceArray = { { "abc", "123" }, { "def", "456" } };
        LookupTranslator target = new LookupTranslator(charSequenceArray);
        StringWriter writer = new StringWriter();
        int result = target.translate("xyz", 0, writer);
        assertAll(() -> assertThat(result, equalTo(0)), () -> assertThat(writer.toString(), equalTo("")));
    }

    @Test
    void translateWithEmptyLookup() throws IOException {
        CharSequence[][] charSequenceArray = {};
        LookupTranslator target = new LookupTranslator(charSequenceArray);
        StringWriter writer = new StringWriter();
        int result = target.translate("test", 0, writer);
        assertAll(() -> assertThat(result, equalTo(0)), () -> assertThat(writer.toString(), equalTo("")));
    }

    @Test
    void translateWithNullLookup() throws IOException {
        LookupTranslator target = new LookupTranslator((CharSequence[][]) null);
        StringWriter writer = new StringWriter();
        int result = target.translate("test", 0, writer);
        assertAll(() -> assertThat(result, equalTo(0)), () -> assertThat(writer.toString(), equalTo("")));
    }

    @ParameterizedTest
    @CsvSource({ "abcdef,0,123", "abcdef,3,456", "abcxyz,0,123", "xyzabc,3,123" })
    void translateWithVariousInputs(String input, int index, String expected) throws IOException {
        CharSequence[][] charSequenceArray = { { "abc", "123" }, { "def", "456" } };
        LookupTranslator target = new LookupTranslator(charSequenceArray);
        StringWriter writer = new StringWriter();
        int result = target.translate(input, index, writer);
        assertAll(() -> assertThat(result, equalTo(3)), () -> assertThat(writer.toString(), equalTo(expected)));
    }

    @Test
    void translateWithLongerInput() throws IOException {
        CharSequence[][] charSequenceArray = { { "abc", "123" }, { "abcdef", "456789" } };
        LookupTranslator target = new LookupTranslator(charSequenceArray);
        StringWriter writer = new StringWriter();
        int result = target.translate("abcdefghi", 0, writer);
        assertAll(() -> assertThat(result, equalTo(6)), () -> assertThat(writer.toString(), equalTo("456789")));
    }

    @Test
    void translateWithInputShorterThanLongest() throws IOException {
        CharSequence[][] charSequenceArray = { { "abc", "123" }, { "abcdef", "456789" } };
        LookupTranslator target = new LookupTranslator(charSequenceArray);
        StringWriter writer = new StringWriter();
        int result = target.translate("abcd", 0, writer);
        assertAll(() -> assertThat(result, equalTo(3)), () -> assertThat(writer.toString(), equalTo("123")));
    }

    @Test
    void translateWithNoMatch() throws IOException {
        CharSequence[][] charSequenceArray = { { "abc", "123" }, { "def", "456" } };
        LookupTranslator target = new LookupTranslator(charSequenceArray);
        StringWriter writer = new StringWriter();
        int result = target.translate("xyz", 0, writer);
        assertAll(() -> assertThat(result, equalTo(0)), () -> assertThat(writer.toString(), equalTo("")));
    }

    @Test
    void translateWithEmptyInput() throws IOException {
        CharSequence[][] charSequenceArray = { { "abc", "123" }, { "def", "456" } };
        LookupTranslator target = new LookupTranslator(charSequenceArray);
        StringWriter writer = new StringWriter();
        int result = target.translate("", 0, writer);
        assertAll(() -> assertThat(result, equalTo(0)), () -> assertThat(writer.toString(), equalTo("")));
    }

    @Test
    void translateWithIndexOutOfBounds() {
        CharSequence[][] charSequenceArray = { { "abc", "123" }, { "def", "456" } };
        LookupTranslator target = new LookupTranslator(charSequenceArray);
        StringWriter writer = new StringWriter();
        assertThrows(IndexOutOfBoundsException.class, () -> target.translate("abc", 3, writer));
    }
}
