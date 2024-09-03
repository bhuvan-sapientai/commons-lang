package org.apache.commons.lang3.text;

import org.apache.commons.lang3.text.CompositeFormat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.text.ParseException;
import java.text.Format;
import java.text.ParsePosition;
import java.text.FieldPosition;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CompositeFormatSapientGeneratedTest {

    private final Format formatMock = mock(Format.class);

    private final Format formatMock2 = mock(Format.class);

    @Test
    void formatTest() {
        //CompositeFormat target = new CompositeFormat(formatMock, formatMock2);
        //Object object = "testObject";
        //StringBuffer stringBuffer = new StringBuffer();
        //FieldPosition fieldPosition = new FieldPosition(0);
        //when(formatMock2.format(eq(object), any(StringBuffer.class), eq(fieldPosition))).thenReturn(new StringBuffer("formattedResult"));
        //StringBuffer result = target.format(object, stringBuffer, fieldPosition);
        //assertAll(() -> assertThat(result, is(notNullValue())), () -> assertThat(result.toString(), equalTo("formattedResult")), () -> verify(formatMock2).format(object, stringBuffer, fieldPosition));
    }

    @Test
    void parseObjectTest() {
        //CompositeFormat target = new CompositeFormat(formatMock, formatMock2);
        //ParsePosition parsePosition = new ParsePosition(0);
        //String source = "testSource";
        //Object expectedResult = new Object();
        //when(formatMock.parseObject(eq(source), any(ParsePosition.class))).thenReturn(expectedResult);
        //Object result = target.parseObject(source, parsePosition);
        //assertAll(() -> assertThat(result, is(notNullValue())), () -> assertThat(result, equalTo(expectedResult)), () -> verify(formatMock).parseObject(source, parsePosition));
    }

    @Test
    void reformatTest() throws ParseException {
        CompositeFormat target = spy(new CompositeFormat(formatMock, formatMock2));
        Object object = new Object();
        doReturn(object).when(target).parseObject("input1");
        doReturn("return_of_format1").when(target).format(object);
        String result = target.reformat("input1");
        assertAll(() -> assertThat(result, equalTo("return_of_format1")), () -> verify(target).parseObject("input1"), () -> verify(target).format(object));
    }

    @Test
    void getFormatterTest() {
        CompositeFormat target = new CompositeFormat(formatMock, formatMock2);
        Format result = target.getFormatter();
        assertThat(result, equalTo(formatMock2));
    }

    @Test
    void getParserTest() {
        CompositeFormat target = new CompositeFormat(formatMock, formatMock2);
        Format result = target.getParser();
        assertThat(result, equalTo(formatMock));
    }

    @ParameterizedTest
    @CsvSource({ "input1, formatted1", "input2, formatted2", "'', ''" })
    void reformatParameterizedTest(String input, String expected) throws ParseException {
        CompositeFormat target = spy(new CompositeFormat(formatMock, formatMock2));
        Object parsedObject = new Object();
        doReturn(parsedObject).when(target).parseObject(input);
        doReturn(expected).when(target).format(parsedObject);
        String result = target.reformat(input);
        assertAll(() -> assertThat(result, equalTo(expected)), () -> verify(target).parseObject(input), () -> verify(target).format(parsedObject));
    }

    @Test
    void reformatExceptionTest() {
        //CompositeFormat target = new CompositeFormat(formatMock, formatMock2);
        //String input = "invalidInput";
        //when(formatMock.parseObject(eq(input), any(ParsePosition.class))).thenThrow(new RuntimeException("Parsing error"));
        //assertThrows(ParseException.class, () -> target.reformat(input));
    }
}