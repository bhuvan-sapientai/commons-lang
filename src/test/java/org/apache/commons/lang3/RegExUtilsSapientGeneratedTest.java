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
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RegExUtilsSapientGeneratedTest {

    //Sapient generated method id: ${ec83d889-3efa-32d5-a265-914a119df70a}
    @Disabled()
    @Test()
    void dotAllTest() {
        //Act Statement(s)
        Pattern result = RegExUtils.dotAll("A");
        Pattern pattern = Pattern.compile("A", 32);
        //Assert statement(s)
        //TODO: Please implement equals method in Pattern for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(pattern)));
    }

    //Sapient generated method id: ${ad6cabd0-4c6f-3ab6-9a16-ecd93ec30981}
    @Disabled()
    @Test()
    void dotAllMatcherTest() {
        //Act Statement(s)
        Matcher result = RegExUtils.dotAllMatcher("A", "B");
        Pattern pattern = Pattern.compile("A", 32);
        Matcher matcher = pattern.matcher("B");
        //Assert statement(s)
        //TODO: Please implement equals method in Matcher for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(matcher)));
    }

    //Sapient generated method id: ${eea02421-abce-3087-aa87-bb2be702634b}
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

    //Sapient generated method id: ${f9e72a62-ea1a-38dd-a2e7-e587e478110e}
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

    //Sapient generated method id: ${974cad2f-3ef9-39b7-8748-b16db39ddc16}
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

    //Sapient generated method id: ${f73f91b1-6aa5-3970-bb54-a8c5cd316c12}
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

    //Sapient generated method id: ${c0ed2db9-022a-30ec-8a62-ef1f858ae707}
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

    //Sapient generated method id: ${45cdf541-5fcc-31bd-bf56-2614402434ef}
    @Test()
    void replaceAllWhenObjectUtilsAnyNullTextRegexReplacement() {
        /* Branches:
         * (ObjectUtils.anyNull(text, regex, replacement)) : true
         */
        //Arrange Statement(s)
        Pattern pattern = Pattern.compile("regex1");
        //Act Statement(s)
        String result = RegExUtils.replaceAll("text1", pattern, "replacement1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("text1")));
    }

    //Sapient generated method id: ${6c0eccb6-26e7-3bb9-ba4c-045f430a5114}
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
        String result = RegExUtils.replaceAll("The quick brown fox jumps over the lazy dog", pattern, "cat");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${662921ae-8c2e-3433-ba22-98f365cd3da5}
    @Test()
    void replaceAll1WhenObjectUtilsAnyNullTextRegexReplacement() {
        /* Branches:
         * (ObjectUtils.anyNull(text, regex, replacement)) : true
         */
        //Act Statement(s)
        String result = RegExUtils.replaceAll("text1", "regex1", "replacement1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("text1")));
    }

    //Sapient generated method id: ${ca6a4236-8f19-3154-bb3a-f3d7e33e5bf3}
    @Test()
    void replaceAll1WhenObjectUtilsNotAnyNullTextRegexReplacement() {
        /* Branches:
         * (ObjectUtils.anyNull(text, regex, replacement)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = RegExUtils.replaceAll("C", "A", "B");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("C")));
    }

    //Sapient generated method id: ${b19e86f7-b23d-38ad-981a-72a10edaac66}
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

    //Sapient generated method id: ${d66dac95-0004-309a-9596-2951702f9b08}
    @Disabled()
    @Test()
    void replaceFirstWhenReplacementIsNotNull() {
        /* Branches:
         * (text == null) : false
         * (regex == null) : false
         * (replacement == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Pattern pattern = Pattern.compile("regex1");
        //Act Statement(s)
        String result = RegExUtils.replaceFirst("Hello World", pattern, "a");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${ae4699ed-1424-3ab8-9fa5-2fc8fe7ae36f}
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

    //Sapient generated method id: ${4f2efad2-90c2-360a-a7ce-da3197c1aa1c}
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

    //Sapient generated method id: ${341c4515-3eb1-3b92-bb4e-7332374c8973}
    @Test()
    void replacePatternWhenObjectUtilsAnyNullTextRegexReplacement() {
        /* Branches:
         * (ObjectUtils.anyNull(text, regex, replacement)) : true
         */
        //Act Statement(s)
        String result = RegExUtils.replacePattern("text1", "regex1", "replacement1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("text1")));
    }

    //Sapient generated method id: ${5099d277-d806-3843-94b1-d843dfb9eb4b}
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
        try (MockedStatic<RegExUtils> regExUtils = mockStatic(RegExUtils.class, CALLS_REAL_METHODS)) {
            regExUtils.when(() -> RegExUtils.dotAllMatcher("regex1", "text1")).thenReturn(null);
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
