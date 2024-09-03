package org.apache.commons.lang3.text.translate;

import org.apache.commons.lang3.text.translate.UnicodeUnescaper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UnicodeUnescaperSapientGeneratedTest {

    @Test
    void translate1WhenInputCharAtIndexPlus1NotEquals_u_() throws IOException {
        UnicodeUnescaper target = new UnicodeUnescaper();
        Writer writer = new StringWriter();
        int result = target.translate("\\a", 0, writer);
        assertAll("result", () -> assertThat(result, equalTo(0)), () -> assertThat(writer.toString(), equalTo("")));
    }

    @ParameterizedTest
    @CsvSource({ "\\u0041,A", "\\uu0042,B", "\\uuu0043,C", "\\u+0044,D" })
    void translate1WhenIndexPlusIPlus4LessThanOrEqualsToInputLength(String input, String expected) throws IOException {
        UnicodeUnescaper target = new UnicodeUnescaper();
        Writer writer = new StringWriter();
        int result = target.translate(input, 0, writer);
        assertAll("result", () -> assertThat(result, equalTo(input.length())), () -> assertThat(writer.toString(), equalTo(expected)));
    }

    @Test
    void translate1WhenIndexPlusIPlus4GreaterThanInputLengthThrowsIllegalArgumentException() {
        UnicodeUnescaper target = new UnicodeUnescaper();
        Writer writer = new StringWriter();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> target.translate("\\u123", 0, writer));
        assertThat(exception.getMessage(), startsWith("Less than 4 hex digits in unicode value:"));
    }

    @Test
    void translate1WhenCaughtNumberFormatExceptionThrowsIllegalArgumentException() {
        UnicodeUnescaper target = new UnicodeUnescaper();
        Writer writer = new StringWriter();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> target.translate("\\uGHIJ", 0, writer));
        assertAll("exception", () -> assertThat(exception.getMessage(), startsWith("Unable to parse unicode value:")), () -> assertThat(exception.getCause(), is(instanceOf(NumberFormatException.class))));
    }

    @Test
    void translateWithMultipleUnicodeEscapes() throws IOException {
        UnicodeUnescaper target = new UnicodeUnescaper();
        Writer writer = new StringWriter();
        String input = "\\u0048\\u0065\\u006C\\u006C\\u006F";
        int result = target.translate(input, 0, writer);
        assertAll("result", () -> assertThat(result, equalTo(6)), () -> assertThat(writer.toString(), equalTo("H")));
    }

    @Test
    void translateWithMixedContent() throws IOException {
        UnicodeUnescaper target = new UnicodeUnescaper();
        Writer writer = new StringWriter();
        String input = "Hello \\u0057orld";
        int result = target.translate(input, 6, writer);
        assertAll("result", () -> assertThat(result, equalTo(6)), () -> assertThat(writer.toString(), equalTo("W")));
    }

    @Test
    void translateWithInvalidIndex() throws IOException {
        UnicodeUnescaper target = new UnicodeUnescaper();
        Writer writer = new StringWriter();
        int result = target.translate("\\u0041", 2, writer);
        assertAll("result", () -> assertThat(result, equalTo(0)), () -> assertThat(writer.toString(), equalTo("")));
    }

    @Test
    void translateWithEmptyInput() throws IOException {
        UnicodeUnescaper target = new UnicodeUnescaper();
        Writer writer = new StringWriter();
        int result = target.translate("", 0, writer);
        assertAll("result", () -> assertThat(result, equalTo(0)), () -> assertThat(writer.toString(), equalTo("")));
    }
}
