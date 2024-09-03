package org.apache.commons.lang3.text.translate;

import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;

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
import static org.mockito.Mockito.*;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NumericEntityUnescaperSapientGeneratedTest {

    @Test
    void isSetWhenOptionsContainsOption() {
        NumericEntityUnescaper target = new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.semiColonRequired);
        assertTrue(target.isSet(NumericEntityUnescaper.OPTION.semiColonRequired));
    }

    @Test
    void isSetWhenOptionsNotContainsOption() {
        NumericEntityUnescaper target = new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.semiColonOptional);
        assertFalse(target.isSet(NumericEntityUnescaper.OPTION.semiColonRequired));
    }

    @Test
    void translateWhenStartEqualsSeqEnd() throws IOException {
        NumericEntityUnescaper target = new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.semiColonRequired);
        Writer writer = new StringWriter();
        int result = target.translate("&#X", 0, writer);
        assertEquals(0, result);
        assertEquals("", writer.toString());
    }

    @Test
    void translateWhenIsSetOPTIONSemiColonRequired() throws IOException {
        NumericEntityUnescaper target = new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.semiColonRequired);
        Writer writer = new StringWriter();
        int result = target.translate("&#X41", 0, writer);
        assertEquals(0, result);
        assertEquals("", writer.toString());
    }

    @Test
    void translateWhenIsSetOPTIONErrorIfNoSemiColonThrowsIllegalArgumentException() {
        NumericEntityUnescaper target = new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.errorIfNoSemiColon);
        Writer writer = new StringWriter();
        assertThrows(IllegalArgumentException.class, () -> target.translate("&#X41", 0, writer));
    }

    @ParameterizedTest
    @CsvSource({ "&#x41;, A", "&#65;, A", "&#x1D306;, \uD834\uDF06", "&#128075;, \uD83D\uDC4B" })
    void translateValidEntities(String input, String expected) throws IOException {
        NumericEntityUnescaper target = new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.semiColonRequired);
        Writer writer = new StringWriter();
        int result = target.translate(input, 0, writer);
        assertEquals(input.length(), result);
        assertEquals(expected, writer.toString());
    }

    @Test
    void translateInvalidEntity() throws IOException {
        NumericEntityUnescaper target = new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.semiColonRequired);
        Writer writer = new StringWriter();
        int result = target.translate("&#xG41;", 0, writer);
        assertEquals(0, result);
        assertEquals("", writer.toString());
    }

    @Test
    void translateWithSemiColonOptional() throws IOException {
        NumericEntityUnescaper target = new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.semiColonOptional);
        Writer writer = new StringWriter();
        int result = target.translate("&#x41", 0, writer);
        assertEquals(5, result);
        assertEquals("A", writer.toString());
    }

    @Test
    void translateWithMultipleEntities() throws IOException {
        NumericEntityUnescaper target = new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.semiColonRequired);
        Writer writer = new StringWriter();
        String input = "&#65;&#66;&#67;";
        int result = target.translate(input, 0, writer);
        assertEquals(5, result);
        assertEquals("A", writer.toString());
    }

    @Test
    void translateNonEntity() throws IOException {
        NumericEntityUnescaper target = new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.semiColonRequired);
        Writer writer = new StringWriter();
        int result = target.translate("Hello", 0, writer);
        assertEquals(0, result);
        assertEquals("", writer.toString());
    }

    @Test
    void constructorWithNoOptions() {
        NumericEntityUnescaper target = new NumericEntityUnescaper();
        assertTrue(target.isSet(NumericEntityUnescaper.OPTION.semiColonRequired));
    }

    @Test
    void constructorWithMultipleOptions() {
        NumericEntityUnescaper target = new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.semiColonOptional, NumericEntityUnescaper.OPTION.errorIfNoSemiColon);
        assertTrue(target.isSet(NumericEntityUnescaper.OPTION.semiColonOptional));
        assertTrue(target.isSet(NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        assertFalse(target.isSet(NumericEntityUnescaper.OPTION.semiColonRequired));
    }
}
