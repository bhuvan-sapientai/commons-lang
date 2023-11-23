package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CharUtilsSapientGeneratedTest {

    //Sapient generated method id: ${ed4d63fe-62f9-330f-a33f-3df50b7fe349}
    @Test()
    void toCharacterObjectTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        Character result = CharUtils.toCharacterObject('a');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo('a')));
    }

    //Sapient generated method id: ${1c60febc-d3af-3f67-8564-15ded4ae509e}
    @Test()
    void toCharacterObject1WhenStringUtilsIsEmptyStr() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        Character result = CharUtils.toCharacterObject("");

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${564beac9-c419-37aa-a25f-d49192da2dbe}
    @Test()
    void toCharacterObject1WhenStringUtilsNotIsEmptyStr() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        Character result = CharUtils.toCharacterObject("Hello");

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo('H')));
    }

    //Sapient generated method id: ${a2a22b9d-cfcc-3e4b-9428-d7d14295f1ce}
    @Test()
    void toCharTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        char result = CharUtils.toChar('a');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo('a')));
    }

    //Sapient generated method id: ${1126d6e4-e840-3bf4-819a-4afb927e5efc}
    @Test()
    void toChar1WhenChIsNotNull() {
        /* Branches:
         * (ch != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        char result = CharUtils.toChar('a', 'b');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo('a')));
    }

    //Sapient generated method id: ${5d923826-d84e-39ec-b8e8-256181592dab}
    @Test()
    void toChar1WhenChIsNull() {
        /* Branches:
         * (ch != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        char result = CharUtils.toChar((Character) null, 'a');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo('a')));
    }

    //Sapient generated method id: ${234651bd-5f36-3cd8-aede-f063471ced9d}
    @Test()
    void toChar2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        char result = CharUtils.toChar("Hello World");

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo('H')));
    }

    //Sapient generated method id: ${ffc9c39c-a527-3249-95e1-3e75f2e797fb}
    @Test()
    void toChar3WhenStringUtilsIsEmptyStr() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        char result = CharUtils.toChar("", 'a');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo('a')));
    }

    //Sapient generated method id: ${7583bf4c-65e7-370f-9d24-7223a06c7c16}
    @Test()
    void toChar3WhenStringUtilsNotIsEmptyStr() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        char result = CharUtils.toChar("a", 'b');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo('a')));
    }

    //Sapient generated method id: ${32a1c0a9-0e3b-326c-8a3a-1d6e0c293915}
    @Test()
    void toIntValueWhenIsAsciiNumericNotChThrowsIllegalArgumentException() {
        /* Branches:
         * (!isAsciiNumeric(ch)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CharUtils> charUtils = mockStatic(CharUtils.class, CALLS_REAL_METHODS)) {
            charUtils.when(() -> CharUtils.isAsciiNumeric('a')).thenReturn(false);
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                CharUtils.toIntValue('a');
            });
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The character a is not in the range '0' - '9'");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                charUtils.verify(() -> CharUtils.isAsciiNumeric('a'), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d73d996e-056a-3445-a78f-0d5128dba078}
    @Test()
    void toIntValueWhenIsAsciiNumericCh() {
        /* Branches:
         * (!isAsciiNumeric(ch)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CharUtils> charUtils = mockStatic(CharUtils.class, CALLS_REAL_METHODS)) {
            charUtils.when(() -> CharUtils.isAsciiNumeric(5)).thenReturn(true);
            //Act Statement(s)
            int result = CharUtils.toIntValue((char) 5);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(5));
                charUtils.verify(() -> CharUtils.isAsciiNumeric(5), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c6d6b397-f017-33a2-83dd-3920ccc3948a}
    @Test()
    void toIntValue1WhenIsAsciiNumericCh() {
        /* Branches:
         * (isAsciiNumeric(ch)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CharUtils> charUtils = mockStatic(CharUtils.class, CALLS_REAL_METHODS)) {
            charUtils.when(() -> CharUtils.isAsciiNumeric(5)).thenReturn(true);
            //Act Statement(s)
            int result = CharUtils.toIntValue((char) 5, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(5));
                charUtils.verify(() -> CharUtils.isAsciiNumeric(5), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d00b106f-f18c-3bf4-b57c-602bcd6f0bd2}
    @Test()
    void toIntValue1WhenIsAsciiNumericNotCh() {
        /* Branches:
         * (isAsciiNumeric(ch)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CharUtils> charUtils = mockStatic(CharUtils.class, CALLS_REAL_METHODS)) {
            charUtils.when(() -> CharUtils.isAsciiNumeric('a')).thenReturn(false);
            //Act Statement(s)
            int result = CharUtils.toIntValue('a', 10);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(10));
                charUtils.verify(() -> CharUtils.isAsciiNumeric('a'), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${34851fcf-6444-3fcd-9643-18c7e7fe160b}
    @Test()
    void toIntValue2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CharUtils> charUtils = mockStatic(CharUtils.class, CALLS_REAL_METHODS)) {
            charUtils.when(() -> CharUtils.toIntValue('A')).thenReturn(0);
            //Act Statement(s)
            int result = CharUtils.toIntValue('A');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                charUtils.verify(() -> CharUtils.toIntValue('A'), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c6dcc136-1359-3cb5-a4bb-62fd4b10a4e7}
    @Test()
    void toIntValue3WhenChIsNotNull() {
        /* Branches:
         * (ch != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CharUtils> charUtils = mockStatic(CharUtils.class, CALLS_REAL_METHODS)) {
            charUtils.when(() -> CharUtils.toIntValue('a', 0)).thenReturn(0);
            //Act Statement(s)
            int result = CharUtils.toIntValue('a', 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                charUtils.verify(() -> CharUtils.toIntValue('a', 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1b146c57-c24b-3111-a281-acb656a0a98b}
    @Test()
    void toIntValue3WhenChIsNull() {
        /* Branches:
         * (ch != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        int result = CharUtils.toIntValue((Character) null, 10);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(10)));
    }

    //Sapient generated method id: ${c3579771-c688-3dbb-9988-52037ea1733b}
    @Test()
    void toStringWhenChLessThanCHAR_STRING_ARRAYLength() {
        /* Branches:
         * (ch < CHAR_STRING_ARRAY.length) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        String result = CharUtils.toString('a');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${5a5f5fcc-fdac-32ce-a991-53a6e341e455}
    @Test()
    void toStringWhenChNotLessThanCHAR_STRING_ARRAYLength() {
        /* Branches:
         * (ch < CHAR_STRING_ARRAY.length) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        String result = CharUtils.toString('\u20AC');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("\u20AC")));
    }

    //Sapient generated method id: ${8e6aef49-4325-3a39-8ad8-51c57295fe67}
    @Test()
    void toString1WhenChIsNotNull() {
        /* Branches:
         * (ch != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CharUtils> charUtils = mockStatic(CharUtils.class, CALLS_REAL_METHODS)) {
            charUtils.when(() -> CharUtils.toString('a')).thenReturn("return_of_toString1");
            //Act Statement(s)
            String result = CharUtils.toString('a');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toString1"));
                charUtils.verify(() -> CharUtils.toString('a'), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f300ba1b-f019-318f-802c-6c7436acbb7c}
    @Test()
    void toString1WhenChIsNull() {
        /* Branches:
         * (ch != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        String result = CharUtils.toString((Character) null);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${ee621511-b895-314b-b6b8-6c7fa5e803bc}
    @Test()
    void unicodeEscapedTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        String result = CharUtils.unicodeEscaped('a');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("\\uAAAA")));
    }

    //Sapient generated method id: ${4eb62bd0-cae1-3274-aa0c-dd3859b591d5}
    @Test()
    void unicodeEscaped1WhenChIsNotNull() {
        /* Branches:
         * (ch != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CharUtils> charUtils = mockStatic(CharUtils.class, CALLS_REAL_METHODS)) {
            charUtils.when(() -> CharUtils.unicodeEscaped('a')).thenReturn("return_of_unicodeEscaped1");
            //Act Statement(s)
            String result = CharUtils.unicodeEscaped('a');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_unicodeEscaped1"));
                charUtils.verify(() -> CharUtils.unicodeEscaped('a'), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d694ea81-99cb-3c5f-831e-45ff966f4259}
    @Test()
    void unicodeEscaped1WhenChIsNull() {
        /* Branches:
         * (ch != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        String result = CharUtils.unicodeEscaped((Character) null);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${a4e92dce-b66c-3cb5-a419-731c68cf322e}
    @Test()
    void isAsciiWhenChLessThan128() {
        /* Branches:
         * (ch < 128) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        boolean result = CharUtils.isAscii('a');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${85636d8b-9c49-30c4-befc-9c4976eb52bf}
    @Test()
    void isAsciiWhenChNotLessThan128() {
        /* Branches:
         * (ch < 128) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        boolean result = CharUtils.isAscii('\u00E9');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${e8c9e6d6-f933-3f19-bd5d-a23c3e4c6548}
    @Test()
    void isAsciiPrintableWhenChLessThan127() {
        /* Branches:
         * (ch >= 32) : true
         * (ch < 127) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        boolean result = CharUtils.isAsciiPrintable('6');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${c87f4b48-dc70-33c4-946c-c9944d3c09eb}
    @Test()
    void isAsciiPrintableWhenChNotLessThan127() {
        /* Branches:
         * (ch >= 32) : true
         * (ch < 127) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        boolean result = CharUtils.isAsciiPrintable('\uD83F');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${fdcfd985-63d6-3df2-8485-9ad7ef1bd98a}
    @Test()
    void isAsciiControlWhenChEquals127() {
        /* Branches:
         * (ch < 32) : false
         * (ch == 127) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        boolean result = CharUtils.isAsciiControl('');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${abe76657-4cd6-3858-bb3b-d717cd91add7}
    @Test()
    void isAsciiControlWhenChNotEquals127() {
        /* Branches:
         * (ch < 32) : false
         * (ch == 127) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        boolean result = CharUtils.isAsciiControl('3');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${6a6ab76f-2803-300c-b5a0-06cbda61e4b7}
    @Test()
    void isAsciiAlphaWhenIsAsciiAlphaLowerCh() {
        /* Branches:
         * (isAsciiAlphaUpper(ch)) : false
         * (isAsciiAlphaLower(ch)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CharUtils> charUtils = mockStatic(CharUtils.class, CALLS_REAL_METHODS)) {
            charUtils.when(() -> CharUtils.isAsciiAlphaUpper('1')).thenReturn(false);
            charUtils.when(() -> CharUtils.isAsciiAlphaLower('1')).thenReturn(true);
            //Act Statement(s)
            boolean result = CharUtils.isAsciiAlpha('1');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                charUtils.verify(() -> CharUtils.isAsciiAlphaUpper('1'), atLeast(1));
                charUtils.verify(() -> CharUtils.isAsciiAlphaLower('1'), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${228e77bd-5be0-3f2f-989c-29fd7ee7141b}
    @Test()
    void isAsciiAlphaWhenIsAsciiAlphaLowerNotCh() {
        /* Branches:
         * (isAsciiAlphaUpper(ch)) : false
         * (isAsciiAlphaLower(ch)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CharUtils> charUtils = mockStatic(CharUtils.class, CALLS_REAL_METHODS)) {
            charUtils.when(() -> CharUtils.isAsciiAlphaUpper('1')).thenReturn(false);
            charUtils.when(() -> CharUtils.isAsciiAlphaLower('1')).thenReturn(false);
            //Act Statement(s)
            boolean result = CharUtils.isAsciiAlpha('1');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                charUtils.verify(() -> CharUtils.isAsciiAlphaUpper('1'), atLeast(1));
                charUtils.verify(() -> CharUtils.isAsciiAlphaLower('1'), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3ae43050-2fd4-320e-bc15-01662784d1e0}
    @Test()
    void isAsciiAlphaUpperWhenChLessThanOrEqualsTo_Z_() {
        /* Branches:
         * (ch >= 'A') : true
         * (ch <= 'Z') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        boolean result = CharUtils.isAsciiAlphaUpper('B');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${51e7a298-1a95-3ff3-ab6c-416e882197a3}
    @Test()
    void isAsciiAlphaUpperWhenChGreaterThan_Z_() {
        /* Branches:
         * (ch >= 'A') : true
         * (ch <= 'Z') : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        boolean result = CharUtils.isAsciiAlphaUpper('\uD83F');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${58b03b74-cbe3-3cf8-a8c3-5318f8569bfa}
    @Test()
    void isAsciiAlphaLowerWhenChLessThanOrEqualsTo_z_() {
        /* Branches:
         * (ch >= 'a') : true
         * (ch <= 'z') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        boolean result = CharUtils.isAsciiAlphaLower('m');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${80cbe6d8-59cf-37fa-9853-41f2c4a833c4}
    @Test()
    void isAsciiAlphaLowerWhenChGreaterThan_z_() {
        /* Branches:
         * (ch >= 'a') : true
         * (ch <= 'z') : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        boolean result = CharUtils.isAsciiAlphaLower('\uD83F');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${faa2bfde-39b4-35d1-b882-8d3397875b2b}
    @Test()
    void isAsciiNumericWhenChLessThanOrEqualsTo_9_() {
        /* Branches:
         * (ch >= '0') : true
         * (ch <= '9') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        boolean result = CharUtils.isAsciiNumeric('5');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${fe228b51-ebbc-305b-9e74-cf60bb353014}
    @Test()
    void isAsciiNumericWhenChGreaterThan_9_() {
        /* Branches:
         * (ch >= '0') : true
         * (ch <= '9') : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        boolean result = CharUtils.isAsciiNumeric('\uD83F');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${d18207d4-8b46-3f95-ad2a-1e65fa526eda}
    @Test()
    void isAsciiAlphanumericWhenIsAsciiNumericCh() {
        /* Branches:
         * (isAsciiAlpha(ch)) : false
         * (isAsciiNumeric(ch)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CharUtils> charUtils = mockStatic(CharUtils.class, CALLS_REAL_METHODS)) {
            charUtils.when(() -> CharUtils.isAsciiAlpha('@')).thenReturn(false);
            charUtils.when(() -> CharUtils.isAsciiNumeric('@')).thenReturn(true);
            //Act Statement(s)
            boolean result = CharUtils.isAsciiAlphanumeric('@');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                charUtils.verify(() -> CharUtils.isAsciiAlpha('@'), atLeast(1));
                charUtils.verify(() -> CharUtils.isAsciiNumeric('@'), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ef893ff5-63e0-3bd0-86fe-f2d4bdf8cca6}
    @Test()
    void isAsciiAlphanumericWhenIsAsciiNumericNotCh() {
        /* Branches:
         * (isAsciiAlpha(ch)) : false
         * (isAsciiNumeric(ch)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CharUtils> charUtils = mockStatic(CharUtils.class, CALLS_REAL_METHODS)) {
            charUtils.when(() -> CharUtils.isAsciiAlpha('@')).thenReturn(false);
            charUtils.when(() -> CharUtils.isAsciiNumeric('@')).thenReturn(false);
            //Act Statement(s)
            boolean result = CharUtils.isAsciiAlphanumeric('@');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                charUtils.verify(() -> CharUtils.isAsciiAlpha('@'), atLeast(1));
                charUtils.verify(() -> CharUtils.isAsciiNumeric('@'), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d3e977de-633f-3acd-9866-5ed0c48a1db3}
    @Test()
    void compareTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        int result = CharUtils.compare(a, b);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }
}
