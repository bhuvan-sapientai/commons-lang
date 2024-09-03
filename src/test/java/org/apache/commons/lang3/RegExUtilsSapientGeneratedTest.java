package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mockito.MockedStatic;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RegExUtilsSapientGeneratedTest {

    //Sapient generated method id: ${dotAllTest}, hash: 6CEF815A9B1FE019FAC7834FC95AFEAC
    @Test()
    void dotAllTest() {
        //Act Statement(s)
        Pattern result = RegExUtils.dotAll("A");
        //Assert statement(s)
        //TODO: Please implement equals method in Pattern for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${dotAllMatcherTest}, hash: 968B4AC25CE6EEBF429430C197111C5A
    @Test()
    void dotAllMatcherTest() {
        //Act Statement(s)
        Matcher result = RegExUtils.dotAllMatcher("A", "B");
        //Assert statement(s)
        //TODO: Please implement equals method in Matcher for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${removeAllTest}, hash: E1A5779263886413BD814A4C14DDC64E
    @Test()
    void removeAllTest() {
        //Arrange Statement(s)
        try (MockedStatic<RegExUtils> regExUtils = mockStatic(RegExUtils.class, CALLS_REAL_METHODS)) {
            regExUtils.when(() -> RegExUtils.replaceAll(eq("text1"), (Pattern) any(), eq(""))).thenReturn("return_of_replaceAll1");
            Pattern pattern = Pattern.compile("regex1");
            //Act Statement(s)
            String result = RegExUtils.removeAll("text1", pattern);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_replaceAll1"));
                regExUtils.verify(() -> RegExUtils.replaceAll(eq("text1"), (Pattern) any(), eq("")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${removeAll1Test}, hash: A367E7CA3B0CF12B0D56B82ADC24B977
    @Test()
    void removeAll1Test() {
        //Arrange Statement(s)
        try (MockedStatic<RegExUtils> regExUtils = mockStatic(RegExUtils.class, CALLS_REAL_METHODS)) {
            regExUtils.when(() -> RegExUtils.replaceAll("text1", "regex1", "")).thenReturn("return_of_replaceAll1");
            //Act Statement(s)
            String result = RegExUtils.removeAll("text1", "regex1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_replaceAll1"));
                regExUtils.verify(() -> RegExUtils.replaceAll("text1", "regex1", ""), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${removeFirstTest}, hash: A7B8D48AB89CB59A2A2D3D16113052A1
    @Test()
    void removeFirstTest() {
        //Arrange Statement(s)
        try (MockedStatic<RegExUtils> regExUtils = mockStatic(RegExUtils.class, CALLS_REAL_METHODS)) {
            regExUtils.when(() -> RegExUtils.replaceFirst(eq("text1"), (Pattern) any(), eq(""))).thenReturn("return_of_replaceFirst1");
            Pattern pattern = Pattern.compile("regex1");
            //Act Statement(s)
            String result = RegExUtils.removeFirst("text1", pattern);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_replaceFirst1"));
                regExUtils.verify(() -> RegExUtils.replaceFirst(eq("text1"), (Pattern) any(), eq("")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${removeFirst1Test}, hash: CACD58300D01EE6D2675DAE0F4542541
    @Test()
    void removeFirst1Test() {
        //Arrange Statement(s)
        try (MockedStatic<RegExUtils> regExUtils = mockStatic(RegExUtils.class, CALLS_REAL_METHODS)) {
            regExUtils.when(() -> RegExUtils.replaceFirst("text1", "regex1", "")).thenReturn("return_of_replaceFirst1");
            //Act Statement(s)
            String result = RegExUtils.removeFirst("text1", "regex1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_replaceFirst1"));
                regExUtils.verify(() -> RegExUtils.replaceFirst("text1", "regex1", ""), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${removePatternTest}, hash: C2C337D7534972872215333B56DA4D74
    @Test()
    void removePatternTest() {
        //Arrange Statement(s)
        try (MockedStatic<RegExUtils> regExUtils = mockStatic(RegExUtils.class, CALLS_REAL_METHODS)) {
            regExUtils.when(() -> RegExUtils.replacePattern("text1", "regex1", "")).thenReturn("return_of_replacePattern1");
            //Act Statement(s)
            String result = RegExUtils.removePattern("text1", "regex1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_replacePattern1"));
                regExUtils.verify(() -> RegExUtils.replacePattern("text1", "regex1", ""), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${replaceAllWhenObjectUtilsAnyNullTextRegexReplacement}, hash: 033CBCE1ED49D37536BA5D2854FEDF14
    @Test()
    void replaceAllWhenObjectUtilsAnyNullTextRegexReplacement() {
        /* Branches:
         * (ObjectUtils.anyNull(text, regex, replacement)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Pattern pattern = Pattern.compile("regex1");
        //Act Statement(s)
        String result = RegExUtils.replaceAll("text1", pattern, "replacement1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("text1")));
    }

    //Sapient generated method id: ${replaceAllWhenObjectUtilsNotAnyNullTextRegexReplacement}, hash: 63CF05F954E7332BB2FD42FAD8A86B4D
    @Disabled()
    @Test()
    void replaceAllWhenObjectUtilsNotAnyNullTextRegexReplacement() {
        /* Branches:
         * (ObjectUtils.anyNull(text, regex, replacement)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Pattern pattern = Pattern.compile("regex1");
        //Act Statement(s)
        String result = RegExUtils.replaceAll("text1", pattern, "replacement1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${replaceAll1WhenObjectUtilsAnyNullTextRegexReplacement}, hash: 9C99E27A3C4E1B5B28A44E6FA369FE01
    @Test()
    void replaceAll1WhenObjectUtilsAnyNullTextRegexReplacement() {
        /* Branches:
         * (ObjectUtils.anyNull(text, regex, replacement)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = RegExUtils.replaceAll("text1", "regex1", "replacement1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("text1")));
    }

    //Sapient generated method id: ${replaceAll1WhenObjectUtilsNotAnyNullTextRegexReplacement}, hash: 915514DCC292220EB16E817ABB65D8F0
    @Test()
    void replaceAll1WhenObjectUtilsNotAnyNullTextRegexReplacement() {
        /* Branches:
         * (ObjectUtils.anyNull(text, regex, replacement)) : false
         */
        //Act Statement(s)
        String result = RegExUtils.replaceAll("C", "A", "B");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("C")));
    }

    //Sapient generated method id: ${replaceFirstWhenReplacementIsNull}, hash: AF6AFA9247F1F1F74C21FDF17ED5E4B2
    @Test()
    void replaceFirstWhenReplacementIsNull() {
        /* Branches:
         * (text == null) : false
         * (regex == null) : false
         * (replacement == null) : true
         */
        //Arrange Statement(s)
        Pattern pattern = Pattern.compile("regex1");
        //Act Statement(s)
        String result = RegExUtils.replaceFirst("text1", pattern, (String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("text1")));
    }

    //Sapient generated method id: ${replaceFirstWhenReplacementIsNotNull}, hash: 0E2338E08B96B5E0D0F7750714E9B44E
    @Test()
    void replaceFirstWhenReplacementIsNotNull() {
        /* Branches:
         * (text == null) : false
         * (regex == null) : false
         * (replacement == null) : false
         */
        //Arrange Statement(s)
        Pattern pattern = Pattern.compile("regex1");
        //Act Statement(s)
        String result = RegExUtils.replaceFirst("text1", pattern, "replacement1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("text1")));
    }

    //Sapient generated method id: ${replaceFirst1WhenReplacementIsNull}, hash: D453AFFD6ACF216DC73022BCA4E0307B
    @Test()
    void replaceFirst1WhenReplacementIsNull() {
        /* Branches:
         * (text == null) : false
         * (regex == null) : false
         * (replacement == null) : true
         */
        //Act Statement(s)
        String result = RegExUtils.replaceFirst("text1", "regex1", (String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("text1")));
    }

    //Sapient generated method id: ${replaceFirst1WhenReplacementIsNotNull}, hash: 1ED2E520D51C3A157034E1D574D9F6F6
    @Test()
    void replaceFirst1WhenReplacementIsNotNull() {
        /* Branches:
         * (text == null) : false
         * (regex == null) : false
         * (replacement == null) : false
         */
        //Act Statement(s)
        String result = RegExUtils.replaceFirst("C", "A", "B");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("C")));
    }

    //Sapient generated method id: ${replacePatternWhenObjectUtilsAnyNullTextRegexReplacement}, hash: A0ABBFB275681AD25F33365D5F8B6196
    @Test()
    void replacePatternWhenObjectUtilsAnyNullTextRegexReplacement() {
        /* Branches:
         * (ObjectUtils.anyNull(text, regex, replacement)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = RegExUtils.replacePattern("text1", "regex1", "replacement1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("text1")));
    }

    //Sapient generated method id: ${replacePatternWhenObjectUtilsNotAnyNullTextRegexReplacement}, hash: 3E32913265DB710521E5769840496541
    @Disabled()
    @Test()
    void replacePatternWhenObjectUtilsNotAnyNullTextRegexReplacement() {
        /* Branches:
         * (ObjectUtils.anyNull(text, regex, replacement)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Matcher matcherMock = mock(Matcher.class);
        try (MockedStatic<RegExUtils> regExUtils = mockStatic(RegExUtils.class, CALLS_REAL_METHODS)) {
            regExUtils.when(() -> RegExUtils.dotAllMatcher("regex1", "text1")).thenReturn(matcherMock);
            //Act Statement(s)
            String result = RegExUtils.replacePattern("text1", "regex1", "replacement1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                regExUtils.verify(() -> RegExUtils.dotAllMatcher("regex1", "text1"), atLeast(1));
            });
        }
    }
}
