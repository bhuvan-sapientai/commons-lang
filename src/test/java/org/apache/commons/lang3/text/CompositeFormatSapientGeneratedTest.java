package org.apache.commons.lang3.text;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.Format;
import java.text.ParsePosition;
import java.text.FieldPosition;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CompositeFormatSapientGeneratedTest {

    //Sapient generated method id: ${d2023724-fb02-31bf-8f56-c852070520c4}
    @Disabled()
    @Test()
    void formatTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CompositeFormat target = new CompositeFormat((Format) null, (Format) null);
        Object object = new Object();
        StringBuffer stringBuffer = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(0);
        //Act Statement(s)
        StringBuffer result = target.format(object, stringBuffer, fieldPosition);
        StringBuffer stringBuffer2 = new StringBuffer();
        //Assert statement(s)
        //TODO: Please implement equals method in StringBuffer for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(stringBuffer2)));
    }

    //Sapient generated method id: ${c0e5fd58-457b-3aac-bcde-a4122dfbceb3}
    @Disabled()
    @Test()
    void parseObjectTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CompositeFormat target = new CompositeFormat((Format) null, (Format) null);
        ParsePosition parsePosition = new ParsePosition(0);
        //Act Statement(s)
        Object result = target.parseObject("12345", parsePosition);
        Object object = new Object();
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${6699cfc6-5935-34c5-a0ce-616eb0ff5290}
    @Test()
    void reformatTest() throws ParseException {
        //Arrange Statement(s)
        CompositeFormat target = spy(new CompositeFormat((Format) null, (Format) null));
        Object object = new Object();
        doReturn(object).when(target).parseObject("input1");
        doReturn("return_of_format1").when(target).format(object);
        //Act Statement(s)
        String result = target.reformat("input1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_format1"));
            verify(target).parseObject("input1");
            verify(target).format(object);
        });
    }
}
