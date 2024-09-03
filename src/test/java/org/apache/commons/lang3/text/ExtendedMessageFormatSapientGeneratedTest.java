package org.apache.commons.lang3.text;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.text.Format;
import java.util.Map;
import java.util.Locale;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ExtendedMessageFormatSapientGeneratedTest {

    private final Format formatMock = mock(Format.class);

    //Sapient generated method id: ${applyPatternWhenRegistryIsNull}, hash: 3347A335A988FA023D38D9040DD8C262
    @Test()
    void applyPatternWhenRegistryIsNull() {
        /* Branches:
         * (registry == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Locale locale = new Locale("language1");
        ExtendedMessageFormat target = spy(new ExtendedMessageFormat("pattern1", locale, (Map) null));
        doNothing().when(target).applyPattern("pattern1");
        doReturn("return_of_toPattern1").when(target).toPattern();
        
        //Act Statement(s)
        target.applyPattern("pattern1");
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).applyPattern("pattern1");
            verify(target).toPattern();
        });
    }

    //Sapient generated method id: ${setFormatThrowsUnsupportedOperationException}, hash: D65077A6B29B624DE81400FA096CD9C4
    @Test()
    void setFormatThrowsUnsupportedOperationException() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Locale locale = new Locale("language1");
        ExtendedMessageFormat target = new ExtendedMessageFormat("pattern1", locale, (Map) null);
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.setFormat(0, formatMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${setFormatByArgumentIndexThrowsUnsupportedOperationException}, hash: A6E048CED59C2166651A953DF53BBD37
    @Test()
    void setFormatByArgumentIndexThrowsUnsupportedOperationException() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Locale locale = new Locale("language1");
        ExtendedMessageFormat target = new ExtendedMessageFormat("pattern1", locale, (Map) null);
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.setFormatByArgumentIndex(0, formatMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${setFormatsThrowsUnsupportedOperationException}, hash: BD21E11ECD8102569298EC6B7065A24E
    @Test()
    void setFormatsThrowsUnsupportedOperationException() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Locale locale = new Locale("language1");
        ExtendedMessageFormat target = new ExtendedMessageFormat("pattern1", locale, (Map) null);
        Format[] formatArray = new Format[] {};
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.setFormats(formatArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${setFormatsByArgumentIndexThrowsUnsupportedOperationException}, hash: 2CDDD9FBBE0A3E6B5BC6C9BB14F1C546
    @Test()
    void setFormatsByArgumentIndexThrowsUnsupportedOperationException() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Locale locale = new Locale("language1");
        ExtendedMessageFormat target = new ExtendedMessageFormat("pattern1", locale, (Map) null);
        Format[] formatArray = new Format[] {};
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.setFormatsByArgumentIndex(formatArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${toPatternTest}, hash: E0BE7CA22C540EB124BA3013D5F8A2F3
    @Test()
    void toPatternTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Locale locale = new Locale("language1");
        ExtendedMessageFormat target = new ExtendedMessageFormat("pattern1", locale, (Map) null);
        
        //Act Statement(s)
        String result = target.toPattern();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }
}
