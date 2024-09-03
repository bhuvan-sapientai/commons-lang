package org.apache.commons.lang3;

import org.apache.commons.lang3.CharSetUtils;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CharSetUtilsSapientGeneratedTest {

    @Test
    void containsAnyWhenDeepEmptySet() {
        String[] emptySet = new String[] {};
        assertFalse(CharSetUtils.containsAny("hello", emptySet));
    }

    @ParameterizedTest
    @CsvSource({ "hello, k-p, true", "hello, a-d, false", "hello, hl, true" })
    void containsAnyWithVariousInputs(String str, String set, boolean expected) {
        assertEquals(expected, CharSetUtils.containsAny(str, set));
    }

    @Test
    void containsAnyWithNullAndEmptyInputs() {
        assertAll(() -> assertFalse(CharSetUtils.containsAny(null, "a-z")), () -> assertFalse(CharSetUtils.containsAny("", "a-z")), () -> assertFalse(CharSetUtils.containsAny("hello", (String[]) null)), () -> assertFalse(CharSetUtils.containsAny("hello", "")));
    }

    @Test
    void countWhenDeepEmptySet() {
        String[] emptySet = new String[] {};
        assertEquals(0, CharSetUtils.count("hello", emptySet));
    }

    @ParameterizedTest
    @CsvSource({ "hello, k-p, 3", "hello, a-e, 1", "hello, x-z, 0" })
    void countWithVariousInputs(String str, String set, int expected) {
        assertEquals(expected, CharSetUtils.count(str, set));
    }

    @Test
    void countWithNullAndEmptyInputs() {
        assertAll(() -> assertEquals(0, CharSetUtils.count(null, "a-z")), () -> assertEquals(0, CharSetUtils.count("", "a-z")), () -> assertEquals(0, CharSetUtils.count("hello", (String[]) null)), () -> assertEquals(0, CharSetUtils.count("hello", "")));
    }

    @Test
    void deleteWhenDeepEmptySet() {
        String[] emptySet = new String[] {};
        assertEquals("hello", CharSetUtils.delete("hello", emptySet));
    }

    @ParameterizedTest
    @CsvSource({ "hello, hl, eo", "hello, le, ho", "hello, x-z, hello" })
    void deleteWithVariousInputs(String str, String set, String expected) {
        assertEquals(expected, CharSetUtils.delete(str, set));
    }

    @Test
    void deleteWithNullAndEmptyInputs() {
        assertAll(() -> assertNull(CharSetUtils.delete(null, "a-z")), () -> assertEquals("", CharSetUtils.delete("", "a-z")), () -> assertEquals("hello", CharSetUtils.delete("hello", (String[]) null)), () -> assertEquals("hello", CharSetUtils.delete("hello", "")));
    }

    @Test
    void keepWhenStrIsNull() {
        assertNull(CharSetUtils.keep(null, "a-z"));
    }

    @Test
    void keepWhenDeepEmptySet() {
        String[] emptySet = new String[] {};
        assertEquals("", CharSetUtils.keep("hello", emptySet));
    }

    @ParameterizedTest
    @CsvSource({ "hello, hl, hll", "hello, le, ell", "hello, x-z, ''" })
    void keepWithVariousInputs(String str, String set, String expected) {
        assertEquals(expected, CharSetUtils.keep(str, set));
    }

    @Test
    void keepWithEmptyInputs() {
        assertAll(() -> assertEquals("", CharSetUtils.keep("", "a-z")), () -> assertEquals("", CharSetUtils.keep("hello", (String[]) null)), () -> assertEquals("", CharSetUtils.keep("hello", "")));
    }

    @Test
    void squeezeWhenDeepEmptySet() {
        String[] emptySet = new String[] {};
        assertEquals("hello", CharSetUtils.squeeze("hello", emptySet));
    }

    @ParameterizedTest
    @CsvSource({ "hello, k-p, helo", "hello, a-e, hello", "helllo, l, helo" })
    void squeezeWithVariousInputs(String str, String set, String expected) {
        assertEquals(expected, CharSetUtils.squeeze(str, set));
    }

    @Test
    void squeezeWithNullAndEmptyInputs() {
        assertAll(() -> assertNull(CharSetUtils.squeeze(null, "a-z")), () -> assertEquals("", CharSetUtils.squeeze("", "a-z")), () -> assertEquals("hello", CharSetUtils.squeeze("hello", (String[]) null)), () -> assertEquals("hello", CharSetUtils.squeeze("hello", "")));
    }

    @Test
    void testCharSetUtilsConstructor() {
        assertDoesNotThrow(() -> new CharSetUtils());
    }
}
