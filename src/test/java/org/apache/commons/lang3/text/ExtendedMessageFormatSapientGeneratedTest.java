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
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ExtendedMessageFormatSapientGeneratedTest {

    //Sapient generated method id: ${e7fba370-2326-3eba-bce7-a8bd7eb427d1}
    @Disabled()
    @Test()
    void toPatternTest() {
        /**
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

    //Sapient generated method id: ${4ba18306-a9a3-3b6e-b6e0-382acf326b9f}
    @Disabled()
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

    //Sapient generated method id: ${5ef10941-480d-3d93-a353-09ef92e40305}
    @Test()
    void setFormatThrowsUnsupportedOperationException() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Locale locale = new Locale("language1");
        ExtendedMessageFormat target = new ExtendedMessageFormat("pattern1", locale, (Map) null);
        //TODO: Needs initialization with real value
        Format format = null;
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.setFormat(0, format);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${2a910c62-dbc3-365f-9227-2527fabe8bef}
    @Test()
    void setFormatByArgumentIndexThrowsUnsupportedOperationException() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Locale locale = new Locale("language1");
        ExtendedMessageFormat target = new ExtendedMessageFormat("pattern1", locale, (Map) null);
        //TODO: Needs initialization with real value
        Format format = null;
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.setFormatByArgumentIndex(0, format);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${91af6ff5-863d-3376-90c7-bfb425d93ffc}
    @Test()
    void setFormatsThrowsUnsupportedOperationException() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Locale locale = new Locale("language1");
        ExtendedMessageFormat target = new ExtendedMessageFormat("pattern1", locale, (Map) null);
        Format[] formatArray = new Format[]{};
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.setFormats(formatArray);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${30c8cee3-4e19-3303-ab75-89d8234b1d79}
    @Test()
    void setFormatsByArgumentIndexThrowsUnsupportedOperationException() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Locale locale = new Locale("language1");
        ExtendedMessageFormat target = new ExtendedMessageFormat("pattern1", locale, (Map) null);
        Format[] formatArray = new Format[]{};
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.setFormatsByArgumentIndex(formatArray);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
