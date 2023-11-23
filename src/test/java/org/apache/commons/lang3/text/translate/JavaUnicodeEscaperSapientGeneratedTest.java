package org.apache.commons.lang3.text.translate;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JavaUnicodeEscaperSapientGeneratedTest {

    //Sapient generated method id: ${c81ab6d5-b975-325f-9877-ebd48dd6b23a}
    @Test()
    void above1Test() {
        //Arrange Statement(s)
        try (MockedStatic<JavaUnicodeEscaper> javaUnicodeEscaper = mockStatic(JavaUnicodeEscaper.class, CALLS_REAL_METHODS)) {
            JavaUnicodeEscaper javaUnicodeEscaper2 = new JavaUnicodeEscaper(0, 0, false);
            javaUnicodeEscaper.when(() -> JavaUnicodeEscaper.outsideOf(0, 0)).thenReturn(javaUnicodeEscaper2);
            //Act Statement(s)
            JavaUnicodeEscaper result = JavaUnicodeEscaper.above(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(javaUnicodeEscaper2));
                javaUnicodeEscaper.verify(() -> JavaUnicodeEscaper.outsideOf(0, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ce59b530-cd8f-3f1d-bf40-a78f789c2ce1}
    @Test()
    void below1Test() {
        //Arrange Statement(s)
        try (MockedStatic<JavaUnicodeEscaper> javaUnicodeEscaper = mockStatic(JavaUnicodeEscaper.class, CALLS_REAL_METHODS)) {
            JavaUnicodeEscaper javaUnicodeEscaper2 = new JavaUnicodeEscaper(0, 0, false);
            javaUnicodeEscaper.when(() -> JavaUnicodeEscaper.outsideOf(0, 2147483647)).thenReturn(javaUnicodeEscaper2);
            //Act Statement(s)
            JavaUnicodeEscaper result = JavaUnicodeEscaper.below(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(javaUnicodeEscaper2));
                javaUnicodeEscaper.verify(() -> JavaUnicodeEscaper.outsideOf(0, 2147483647), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${190ce24c-1e5b-3ba3-b730-22d6535019ac}
    @Disabled()
    @Test()
    void between1Test() {
        //Act Statement(s)
        JavaUnicodeEscaper result = JavaUnicodeEscaper.between(0, 0);
        JavaUnicodeEscaper javaUnicodeEscaper = new JavaUnicodeEscaper(0, 0, true);
        //Assert statement(s)
        //TODO: Please implement equals method in JavaUnicodeEscaper for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(javaUnicodeEscaper)));
    }

    //Sapient generated method id: ${17e2fd18-bbb3-3ec7-a501-1a4b716fc94a}
    @Disabled()
    @Test()
    void outsideOf1Test() {
        //Act Statement(s)
        JavaUnicodeEscaper result = JavaUnicodeEscaper.outsideOf(0, 0);
        JavaUnicodeEscaper javaUnicodeEscaper = new JavaUnicodeEscaper(0, 0, false);
        //Assert statement(s)
        //TODO: Please implement equals method in JavaUnicodeEscaper for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(javaUnicodeEscaper)));
    }

    //Sapient generated method id: ${d2011e0c-dd80-32df-82e7-1307a9299a7e}
    @Test()
    void toUtf16EscapeTest() {
        //Arrange Statement(s)
        JavaUnicodeEscaper target = new JavaUnicodeEscaper(0, 0, false);
        //Act Statement(s)
        final ArrayIndexOutOfBoundsException result = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            target.toUtf16Escape(0);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
