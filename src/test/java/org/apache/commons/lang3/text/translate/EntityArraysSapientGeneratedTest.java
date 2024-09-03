package org.apache.commons.lang3.text.translate;

import org.apache.commons.lang3.text.translate.EntityArrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.stream.Stream;

class EntityArraysSapientGeneratedTest {

    @Test
    void APOS_ESCAPETest() {
        String[][] result = EntityArrays.APOS_ESCAPE();
        assertAll(() -> assertThat(result.length, equalTo(1)), () -> assertThat(result[0][0], equalTo("'")), () -> assertThat(result[0][1], equalTo("&apos;")));
    }

    @Test
    void APOS_UNESCAPETest() {
        String[][] result = EntityArrays.APOS_UNESCAPE();
        assertAll(() -> assertThat(result.length, equalTo(1)), () -> assertThat(result[0][0], equalTo("&apos;")), () -> assertThat(result[0][1], equalTo("'")));
    }

    @Test
    void BASIC_ESCAPETest() {
        String[][] result = EntityArrays.BASIC_ESCAPE();
        assertAll(() -> assertThat(result.length, equalTo(4)), () -> assertThat(result, hasItemInArray(new String[] { "\"", "&quot;" })), () -> assertThat(result, hasItemInArray(new String[] { "&", "&amp;" })), () -> assertThat(result, hasItemInArray(new String[] { "<", "&lt;" })), () -> assertThat(result, hasItemInArray(new String[] { ">", "&gt;" })));
    }

    @Test
    void BASIC_UNESCAPETest() {
        String[][] result = EntityArrays.BASIC_UNESCAPE();
        assertAll(() -> assertThat(result.length, equalTo(4)), () -> assertThat(result, hasItemInArray(new String[] { "&quot;", "\"" })), () -> assertThat(result, hasItemInArray(new String[] { "&amp;", "&" })), () -> assertThat(result, hasItemInArray(new String[] { "&lt;", "<" })), () -> assertThat(result, hasItemInArray(new String[] { "&gt;", ">" })));
    }

    @Test
    void HTML40_EXTENDED_ESCAPETest() {
        String[][] result = EntityArrays.HTML40_EXTENDED_ESCAPE();
        assertAll(() -> assertThat(result.length, equalTo(252)), () -> assertThat(result, hasItemInArray(new String[] { "\u0192", "&fnof;" })), () -> assertThat(result, hasItemInArray(new String[] { "\u0391", "&Alpha;" })), () -> assertThat(result, hasItemInArray(new String[] { "\u20AC", "&euro;" })));
    }

    @Test
    void HTML40_EXTENDED_UNESCAPETest() {
        String[][] result = EntityArrays.HTML40_EXTENDED_UNESCAPE();
        assertAll(() -> assertThat(result.length, equalTo(252)), () -> assertThat(result, hasItemInArray(new String[] { "&fnof;", "\u0192" })), () -> assertThat(result, hasItemInArray(new String[] { "&Alpha;", "\u0391" })), () -> assertThat(result, hasItemInArray(new String[] { "&euro;", "\u20AC" })));
    }

    @ParameterizedTest
    @MethodSource("provideArraysForInvert")
    void invertTest(String[][] input, String[][] expected) {
        String[][] result = EntityArrays.invert(input);
        assertArrayEquals(expected, result);
    }

    static Stream<Object[]> provideArraysForInvert() {
        return Stream.of(new Object[] { new String[][] { { "a", "1" }, { "b", "2" } }, new String[][] { { "1", "a" }, { "2", "b" } } }, new Object[] { new String[][] { { "x", "y" }, { "z", "w" } }, new String[][] { { "y", "x" }, { "w", "z" } } });
    }

    @Test
    void ISO8859_1_ESCAPETest() {
        String[][] result = EntityArrays.ISO8859_1_ESCAPE();
        assertAll(() -> assertThat(result.length, equalTo(96)), () -> assertThat(result, hasItemInArray(new String[] { "\u00A0", "&nbsp;" })), () -> assertThat(result, hasItemInArray(new String[] { "\u00FF", "&yuml;" })));
    }

    @Test
    void ISO8859_1_UNESCAPETest() {
        String[][] result = EntityArrays.ISO8859_1_UNESCAPE();
        assertAll(() -> assertThat(result.length, equalTo(96)), () -> assertThat(result, hasItemInArray(new String[] { "&nbsp;", "\u00A0" })), () -> assertThat(result, hasItemInArray(new String[] { "&yuml;", "\u00FF" })));
    }

    @Test
    void JAVA_CTRL_CHARS_ESCAPETest() {
        String[][] result = EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        assertAll(() -> assertThat(result.length, equalTo(5)), () -> assertThat(result, hasItemInArray(new String[] { "\b", "\\b" })), () -> assertThat(result, hasItemInArray(new String[] { "\n", "\\n" })), () -> assertThat(result, hasItemInArray(new String[] { "\t", "\\t" })), () -> assertThat(result, hasItemInArray(new String[] { "\f", "\\f" })), () -> assertThat(result, hasItemInArray(new String[] { "\r", "\\r" })));
    }

    @Test
    void JAVA_CTRL_CHARS_UNESCAPETest() {
        String[][] result = EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        assertAll(() -> assertThat(result.length, equalTo(5)), () -> assertThat(result, hasItemInArray(new String[] { "\\b", "\b" })), () -> assertThat(result, hasItemInArray(new String[] { "\\n", "\n" })), () -> assertThat(result, hasItemInArray(new String[] { "\\t", "\t" })), () -> assertThat(result, hasItemInArray(new String[] { "\\f", "\f" })), () -> assertThat(result, hasItemInArray(new String[] { "\\r", "\r" })));
    }
}
