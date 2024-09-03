package org.apache.commons.lang3.text.translate;

import org.apache.commons.lang3.text.translate.AggregateTranslator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AggregateTranslatorSapientGeneratedTest {

    @Test
    void translate1WhenConsumedNotEquals0() throws IOException {
        CharSequenceTranslator mockTranslator = mock(CharSequenceTranslator.class);
        when(mockTranslator.translate(any(CharSequence.class), anyInt(), any(Writer.class))).thenReturn(1);
        AggregateTranslator target = new AggregateTranslator(mockTranslator);
        Writer writer = new StringWriter();
        int result = target.translate("input1", 0, writer);
        assertAll(() -> assertThat(result, equalTo(1)), () -> verify(mockTranslator, times(1)).translate("input1", 0, writer));
    }

    @Test
    void translate1WhenConsumedEquals0() throws IOException {
        CharSequenceTranslator mockTranslator = mock(CharSequenceTranslator.class);
        when(mockTranslator.translate(any(CharSequence.class), anyInt(), any(Writer.class))).thenReturn(0);
        AggregateTranslator target = new AggregateTranslator(mockTranslator);
        Writer writer = new StringWriter();
        int result = target.translate("input1", 0, writer);
        assertAll(() -> assertThat(result, equalTo(0)), () -> verify(mockTranslator, times(1)).translate("input1", 0, writer));
    }

    @Test
    void translateWithMultipleTranslatorsFirstConsumed() throws IOException {
        CharSequenceTranslator mockTranslator1 = mock(CharSequenceTranslator.class);
        CharSequenceTranslator mockTranslator2 = mock(CharSequenceTranslator.class);
        when(mockTranslator1.translate(any(CharSequence.class), anyInt(), any(Writer.class))).thenReturn(2);
        AggregateTranslator target = new AggregateTranslator(mockTranslator1, mockTranslator2);
        Writer writer = new StringWriter();
        int result = target.translate("input1", 0, writer);
        assertAll(() -> assertThat(result, equalTo(2)), () -> verify(mockTranslator1, times(1)).translate("input1", 0, writer), () -> verify(mockTranslator2, never()).translate(any(CharSequence.class), anyInt(), any(Writer.class)));
    }

    @Test
    void translateWithMultipleTranslatorsNoneConsumed() throws IOException {
        CharSequenceTranslator mockTranslator1 = mock(CharSequenceTranslator.class);
        CharSequenceTranslator mockTranslator2 = mock(CharSequenceTranslator.class);
        when(mockTranslator1.translate(any(CharSequence.class), anyInt(), any(Writer.class))).thenReturn(0);
        when(mockTranslator2.translate(any(CharSequence.class), anyInt(), any(Writer.class))).thenReturn(0);
        AggregateTranslator target = new AggregateTranslator(mockTranslator1, mockTranslator2);
        Writer writer = new StringWriter();
        int result = target.translate("input1", 0, writer);
        assertAll(() -> assertThat(result, equalTo(0)), () -> verify(mockTranslator1, times(1)).translate("input1", 0, writer), () -> verify(mockTranslator2, times(1)).translate("input1", 0, writer));
    }

    @Test
    void translateWithNoTranslators() throws IOException {
        AggregateTranslator target = new AggregateTranslator();
        Writer writer = new StringWriter();
        int result = target.translate("input1", 0, writer);
        assertThat(result, equalTo(0));
    }

    @ParameterizedTest
    @CsvSource({ "input1, 0", "input2, 5", "'', 0", "'Hello, World!', 3" })
    void translateWithDifferentInputs(String input, int index) throws IOException {
        CharSequenceTranslator mockTranslator = mock(CharSequenceTranslator.class);
        when(mockTranslator.translate(any(CharSequence.class), anyInt(), any(Writer.class))).thenReturn(1);
        AggregateTranslator target = new AggregateTranslator(mockTranslator);
        Writer writer = new StringWriter();
        int result = target.translate(input, index, writer);
        assertAll(() -> assertThat(result, equalTo(1)), () -> verify(mockTranslator, times(1)).translate(input, index, writer));
    }

    @Test
    void translateWithIOException() {
        CharSequenceTranslator mockTranslator = mock(CharSequenceTranslator.class);
        try {
            when(mockTranslator.translate(any(CharSequence.class), anyInt(), any(Writer.class))).thenThrow(new IOException("Test exception"));
            AggregateTranslator target = new AggregateTranslator(mockTranslator);
            Writer writer = new StringWriter();
            assertThrows(IOException.class, () -> target.translate("input1", 0, writer));
        } catch (IOException e) {
            fail("Exception should not be thrown during test setup");
        }
    }
}
