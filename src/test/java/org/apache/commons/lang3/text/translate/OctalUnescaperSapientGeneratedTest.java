package org.apache.commons.lang3.text.translate;

import org.apache.commons.lang3.text.translate.OctalUnescaper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class OctalUnescaperSapientGeneratedTest {

    @Test
    void translate1WhenChGreaterThan_7_AndIsOctalDigitNotInputCharAtIndexPlus1() throws IOException {
        OctalUnescaper target = new OctalUnescaper();
        StringWriter writer = new StringWriter();
        int result = target.translate("\\8abc", 0, writer);
        assertAll(() -> assertThat(result, equalTo(0)), () -> assertThat(writer.toString(), equalTo("")));
    }

    @Test
    void translate1WhenIsOctalDigitNotInputCharAtNext2() throws IOException {
        OctalUnescaper target = new OctalUnescaper();
        StringWriter writer = new StringWriter();
        int result = target.translate("\\5abc", 0, writer);
        assertAll(() -> assertThat(result, equalTo(2)), () -> assertThat(writer.toString(), equalTo("%")));
    }

    @Test
    void translate1WhenChGreaterThan_3_AndIsZeroToThreeNotInputCharAtNext() throws IOException {
        OctalUnescaper target = new OctalUnescaper();
        StringWriter writer = new StringWriter();
        int result = target.translate("\\456", 0, writer);
        assertAll(() -> assertThat(result, equalTo(3)), () -> assertThat(writer.toString(), equalTo("%")));
    }

    @Test
    void translate1WhenIsOctalDigitInputCharAtNext3() throws IOException {
        OctalUnescaper target = new OctalUnescaper();
        StringWriter writer = new StringWriter();
        int result = target.translate("\\377", 0, writer);
        assertAll(() -> assertThat(result, equalTo(4)), () -> assertThat(writer.toString(), equalTo("\u00FF")));
    }

    @Test
    void translate1WhenIsOctalDigitNotInputCharAtNext3() throws IOException {
        OctalUnescaper target = new OctalUnescaper();
        StringWriter writer = new StringWriter();
        int result = target.translate("\\378", 0, writer);
        assertAll(() -> assertThat(result, equalTo(3)), () -> assertThat(writer.toString(), equalTo("\u001F")));
    }

    @ParameterizedTest
    @CsvSource({ "\\1,\u0001", "\\01,\u0001", "\\001,\u0001", "\\377,\u00FF", "\\77,?", "\\0377,\u00FF7", "\\a,\\a" })
    void testVariousOctalSequences(String input, String expected) throws IOException {
        OctalUnescaper target = new OctalUnescaper();
        StringWriter writer = new StringWriter();
        target.translate(input, 0, writer);
        assertThat(writer.toString(), equalTo(expected));
    }

    @Test
    void testEmptyInput() throws IOException {
        OctalUnescaper target = new OctalUnescaper();
        StringWriter writer = new StringWriter();
        int result = target.translate("", 0, writer);
        assertAll(() -> assertThat(result, equalTo(0)), () -> assertThat(writer.toString(), equalTo("")));
    }

    @Test
    void testNonOctalSequence() throws IOException {
        OctalUnescaper target = new OctalUnescaper();
        StringWriter writer = new StringWriter();
        int result = target.translate("abc", 0, writer);
        assertAll(() -> assertThat(result, equalTo(0)), () -> assertThat(writer.toString(), equalTo("")));
    }

    @Test
    void testInvalidIndex() throws IOException {
        OctalUnescaper target = new OctalUnescaper();
        StringWriter writer = new StringWriter();
        assertThrows(StringIndexOutOfBoundsException.class, () -> {
            target.translate("\\123", 10, writer);
        });
    }

    @Test
    void testNullWriter() {
        OctalUnescaper target = new OctalUnescaper();
        assertThrows(NullPointerException.class, () -> {
            target.translate("\\123", 0, null);
        });
    }
}
