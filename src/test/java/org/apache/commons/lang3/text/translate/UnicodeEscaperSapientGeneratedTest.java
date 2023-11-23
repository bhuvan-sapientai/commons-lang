package org.apache.commons.lang3.text.translate;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Writer;

import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UnicodeEscaperSapientGeneratedTest {

    //Sapient generated method id: ${c0b2bb0d-ba86-37c8-8dc4-de09d6910458}
    @Test()
    void belowTest() {
        //Arrange Statement(s)
        try (MockedStatic<UnicodeEscaper> unicodeEscaper = mockStatic(UnicodeEscaper.class, CALLS_REAL_METHODS)) {
            UnicodeEscaper unicodeEscaper2 = new UnicodeEscaper();
            unicodeEscaper.when(() -> UnicodeEscaper.outsideOf(0, 2147483647)).thenReturn(unicodeEscaper2);
            //Act Statement(s)
            UnicodeEscaper result = UnicodeEscaper.below(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(unicodeEscaper2));
                unicodeEscaper.verify(() -> UnicodeEscaper.outsideOf(0, 2147483647), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${da3e5fe7-cac2-3dfe-9041-bf33d0e7e7a9}
    @Test()
    void aboveTest() {
        //Arrange Statement(s)
        try (MockedStatic<UnicodeEscaper> unicodeEscaper = mockStatic(UnicodeEscaper.class, CALLS_REAL_METHODS)) {
            UnicodeEscaper unicodeEscaper2 = new UnicodeEscaper();
            unicodeEscaper.when(() -> UnicodeEscaper.outsideOf(0, 0)).thenReturn(unicodeEscaper2);
            //Act Statement(s)
            UnicodeEscaper result = UnicodeEscaper.above(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(unicodeEscaper2));
                unicodeEscaper.verify(() -> UnicodeEscaper.outsideOf(0, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${e4cd904e-25da-3f8f-a00d-87a280ebe78d}
    @Test()
    void outsideOfTest() {

        //Act Statement(s)
        UnicodeEscaper result = UnicodeEscaper.outsideOf(0, 0);
        UnicodeEscaper unicodeEscaper = new UnicodeEscaper(0, 0, false);

        //Assert statement(s)
        //TODO: Please implement equals method in UnicodeEscaper for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(unicodeEscaper)));
    }

    //Sapient generated method id: ${d9deeb8a-01f3-3eca-a9d1-4cdbac046a10}
    @Test()
    void betweenTest() {

        //Act Statement(s)
        UnicodeEscaper result = UnicodeEscaper.between(0, 0);
        UnicodeEscaper unicodeEscaper = new UnicodeEscaper(0, 0, true);

        //Assert statement(s)
        //TODO: Please implement equals method in UnicodeEscaper for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(unicodeEscaper)));
    }

    //Sapient generated method id: ${0546798b-69f0-3819-b30b-3fe857641ac5}
    @Test()
    void translate3WhenCodePointGreaterThanAbove() throws IOException {
        /* Branches:
         * (between) : true
         * (codePoint < below) : false
         * (codePoint > above) : true
         */
        //Arrange Statement(s)
        UnicodeEscaper target = new UnicodeEscaper(1, 1, true);
        Writer writer = Writer.nullWriter();

        //Act Statement(s)
        boolean result = target.translate(2, writer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${e003e223-7925-3abe-8e32-ee668482a26a}
    @Test()
    void translate3WhenCodePointLessThanOrEqualsToAbove() throws IOException {
        /* Branches:
         * (between) : false
         * (codePoint >= below) : true
         * (codePoint <= above) : true
         */
        //Arrange Statement(s)
        UnicodeEscaper target = new UnicodeEscaper(1, 1, false);
        Writer writer = Writer.nullWriter();

        //Act Statement(s)
        boolean result = target.translate(1, writer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${5316347b-04fe-3a47-88e3-d975bbc8118f}
    @Test()
    void translate3WhenCodePointNotGreaterThan65535() throws IOException {
        /* Branches:
         * (between) : true
         * (codePoint < below) : false
         * (codePoint > above) : false
         * (codePoint > 0xffff) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UnicodeEscaper target = new UnicodeEscaper(0, 0, true);
        Writer writer = Writer.nullWriter();

        //Act Statement(s)
        boolean result = target.translate(0, writer);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${20b62217-9132-3936-af26-3a3e874d92b2}
    @Test()
    void translate3WhenCodePointGreaterThanAboveAndCodePointGreaterThan65535() throws IOException {
        /* Branches:
         * (between) : false
         * (codePoint >= below) : true
         * (codePoint <= above) : false
         * (codePoint > 0xffff) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UnicodeEscaper target = spy(new UnicodeEscaper(65535, 65535, false));
        doReturn("return_of_toUtf16Escape1").when(target).toUtf16Escape(65536);
        Writer writer = Writer.nullWriter();

        //Act Statement(s)
        boolean result = target.translate(65536, writer);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).toUtf16Escape(65536);
        });
    }

    //Sapient generated method id: ${d2011e0c-dd80-32df-82e7-1307a9299a7e}
    @Test()
    void toUtf16EscapeTest() {
        //Arrange Statement(s)
        UnicodeEscaper target = new UnicodeEscaper(0, 0, false);

        //Act Statement(s)
        String result = target.toUtf16Escape(0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("\\uA")));
    }
}
