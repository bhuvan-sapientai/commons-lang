package org.apache.commons.lang3.exception;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.io.Writer;

import org.mockito.stubbing.Answer;

import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.stream.Stream;
import java.lang.reflect.UndeclaredThrowableException;
import java.io.PrintStream;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.function.Consumer;

import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
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
class ExceptionUtilsSapientGeneratedTest {

    //Sapient generated method id: ${0dfce547-d9a4-3e2b-be0e-721bc387e1b2}
    @Test()
    void asRuntimeExceptionThrowsThrowable() {

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${eaf48a4e-d2f2-3434-bc4f-1847fbe649f9}
    @Test()
    void forEachTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Stream<Throwable> stream = Stream.empty();
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.stream(throwable)).thenReturn(stream);
            //TODO: Needs initialization with real value
            Consumer<Throwable> consumer = null;
            //Act Statement(s)
            ExceptionUtils.forEach(throwable, consumer);
            //Assert statement(s)
            assertAll("result", () -> exceptionUtils.verify(() -> ExceptionUtils.stream(throwable), atLeast(1)));
        }
    }

    //Sapient generated method id: ${7f28548e-8841-38ac-a747-570cc887b6f7}
    @Test()
    void getCauseTest() {
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getCause(throwable2, (String[]) null)).thenReturn(throwable);
            //Act Statement(s)
            Throwable result = ExceptionUtils.getCause(throwable2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(throwable));
                exceptionUtils.verify(() -> ExceptionUtils.getCause(throwable2, (String[]) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5b220f45-b87c-3cb3-9310-4700765b804f}
    @Test()
    void getCause1WhenThrowableIsNull() {
        /* Branches:
         * (throwable == null) : true
         */
        //Arrange Statement(s)
        Throwable throwable = null;
        String[] stringArray = new String[]{};

        //Act Statement(s)
        Throwable result = ExceptionUtils.getCause(throwable, stringArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${c17d2509-29c1-3953-974c-7fa4861494cf}
    @Test()
    void getCause1WhenCauseIsNotNull() {
        /* Branches:
         * (throwable == null) : false
         * (methodNames == null) : true
         * (cause != null) : true
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        //TODO: Needs initialization with real value
        String[] string = null;

        //Act Statement(s)
        Throwable result = ExceptionUtils.getCause(throwable, string);
        Throwable throwable2 = new Throwable();

        //Assert statement(s)
        //TODO: Please implement equals method in Throwable for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(throwable2)));
    }

    //Sapient generated method id: ${a122e046-c377-34d5-aab2-467afe183b97}
    @Test()
    void getCause1WhenThrowableIsAssignableFromMethodGetReturnType() {
        /* Branches:
         * (throwable == null) : false
         * (methodNames == null) : true
         * (cause != null) : false
         * (methodName != null) : true  #  inside getCauseUsingMethodName method
         * (method != null) : true  #  inside getCauseUsingMethodName method
         * (Throwable.class.isAssignableFrom(method.getReturnType())) : true  #  inside getCauseUsingMethodName method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        String[] string = null;

        //Act Statement(s)
        Throwable result = ExceptionUtils.getCause(throwable, string);
        Throwable throwable2 = new Throwable();

        //Assert statement(s)
        //TODO: Please implement equals method in Throwable for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(throwable2)));
    }

    //Sapient generated method id: ${014391c7-e0e6-3425-ad7d-663e497e7210}
    @Test()
    void getCause1WhenCaughtIllegalAccessExceptionOrIllegalArgumentExceptionOrInvocationTargetException() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        /* Branches:
         * (throwable == null) : false
         * (methodNames == null) : true
         * (cause != null) : false
         * (methodName != null) : true  #  inside getCauseUsingMethodName method
         * (catch-exception (NoSuchMethodException | SecurityException)) : true  #  inside getCauseUsingMethodName method
         * (method != null) : true  #  inside getCauseUsingMethodName method
         * (Throwable.class.isAssignableFrom(method.getReturnType())) : true  #  inside getCauseUsingMethodName method
         * (catch-exception (IllegalAccessException | IllegalArgumentException | InvocationTargetException)) : true  #  inside getCauseUsingMethodName method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        String[] string = null;

        //Act Statement(s)
        Throwable result = ExceptionUtils.getCause(throwable, string);
        Throwable throwable2 = new Throwable();

        //Assert statement(s)
        //TODO: Please implement equals method in Throwable for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(throwable2)));
    }

    //Sapient generated method id: ${f66a8be6-064f-3f19-9043-ace9eb5e1f16}
    @Test()
    void getDefaultCauseMethodNamesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */

        //Act Statement(s)
        String[] result = ExceptionUtils.getDefaultCauseMethodNames();
        String[] stringResultArray = new String[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
    }

    //Sapient generated method id: ${7d5b8528-07a8-3c09-97f3-614afd252016}
    @Test()
    void getMessageWhenThIsNull() {
        /* Branches:
         * (th == null) : true
         */
        //Arrange Statement(s)
        Throwable throwable = null;

        //Act Statement(s)
        String result = ExceptionUtils.getMessage(throwable);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }

    //Sapient generated method id: ${0936b51a-2999-3b19-b26c-404c4561dd34}
    @Test()
    void getMessageWhenThIsNotNull() {
        /* Branches:
         * (th == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();

        //Act Statement(s)
        String result = ExceptionUtils.getMessage(throwable);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("B: A")));
    }

    //Sapient generated method id: ${bd894dc9-5adc-36e6-a1ab-71ba224fc195}
    @Test()
    void getRootCauseWhenListIsEmpty() {
        /* Branches:
         * (list.isEmpty()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            List<Throwable> throwableList = new ArrayList<>();
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowableList(throwable)).thenReturn(throwableList);
            //Act Statement(s)
            Throwable result = ExceptionUtils.getRootCause(throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowableList(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0d03157c-d89e-33ae-bd93-cc69d466974a}
    @Test()
    void getRootCauseWhenListNotIsEmpty() {
        /* Branches:
         * (list.isEmpty()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            List<Throwable> throwableList = new ArrayList<>();
            throwableList.add(throwable);
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowableList(throwable2)).thenReturn(throwableList);
            //Act Statement(s)
            Throwable result = ExceptionUtils.getRootCause(throwable2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(throwable));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowableList(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${267febc3-a6b0-3d7b-9ca3-60c54b4ff0ea}
    @Test()
    void getRootCauseMessageWhenRootIsNull() {
        /* Branches:
         * (root == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getRootCause(throwable)).thenReturn(null);
            exceptionUtils.when(() -> ExceptionUtils.getMessage(throwable)).thenReturn("return_of_getMessage1");
            //Act Statement(s)
            String result = ExceptionUtils.getRootCauseMessage(throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getMessage1"));
                exceptionUtils.verify(() -> ExceptionUtils.getRootCause(throwable), atLeast(1));
                exceptionUtils.verify(() -> ExceptionUtils.getMessage(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fd0a6856-ec22-3b1a-b01c-d2028ce851cd}
    @Test()
    void getRootCauseMessageWhenRootIsNotNull() {
        /* Branches:
         * (root == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getRootCause(throwable2)).thenReturn(throwable);
            exceptionUtils.when(() -> ExceptionUtils.getMessage(throwable)).thenReturn("return_of_getMessage1");
            //Act Statement(s)
            String result = ExceptionUtils.getRootCauseMessage(throwable2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getMessage1"));
                exceptionUtils.verify(() -> ExceptionUtils.getRootCause(throwable2), atLeast(1));
                exceptionUtils.verify(() -> ExceptionUtils.getMessage(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c7779c82-8fb5-32a7-a5a4-01c09fb4c300}
    @Test()
    void getRootCauseStackTraceTest() {
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            List<String> stringList = new ArrayList<>();
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getRootCauseStackTraceList(throwable)).thenReturn(stringList);
            //Act Statement(s)
            String[] result = ExceptionUtils.getRootCauseStackTrace(throwable);
            String[] stringResultArray = new String[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(stringResultArray));
                exceptionUtils.verify(() -> ExceptionUtils.getRootCauseStackTraceList(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fb726a3c-4fc1-3146-94ed-c0dd3fc8720c}
    @Test()
    void getRootCauseStackTraceListWhenThrowableIsNull() {
        /* Branches:
         * (throwable == null) : true
         */
        //Arrange Statement(s)
        Throwable throwable = null;

        //Act Statement(s)
        List<String> result = ExceptionUtils.getRootCauseStackTraceList(throwable);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${ea75a875-f81c-3111-bca5-0fd3862f7674}
    @Test()
    void getRootCauseStackTraceListWhenIEqualsCountMinus1() {
        /* Branches:
         * (throwable == null) : false
         * (--i >= 0) : true
         * (i != 0) : true
         * (i == count - 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable throwable2 = new Throwable();
            Throwable[] throwableArray = new Throwable[]{throwable, throwable2};
            Throwable throwable3 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable3)).thenReturn(throwableArray);
            List<String> stringList = new ArrayList<>();
            Throwable throwable4 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getStackFrameList(throwable4)).thenReturn(stringList);
            List<String> stringList2 = new ArrayList<>();
            exceptionUtils.when(() -> ExceptionUtils.getStackFrameList(throwable)).thenReturn(stringList2);
            exceptionUtils.when(() -> ExceptionUtils.removeCommonFrames(anyList(), anyList())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            List<String> result = ExceptionUtils.getRootCauseStackTraceList(throwable3);
            List<String> stringResultList = new ArrayList<>();
            stringResultList.add("getRootCauseStackTraceList_throwable4");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(stringResultList.size()));
                assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable3), atLeast(1));
                exceptionUtils.verify(() -> ExceptionUtils.getStackFrameList(throwable4), atLeast(1));
                exceptionUtils.verify(() -> ExceptionUtils.getStackFrameList(throwable), atLeast(1));
                exceptionUtils.verify(() -> ExceptionUtils.removeCommonFrames(anyList(), anyList()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${575735b6-cf1a-3830-929e-e578dd66302a}
    @Test()
    void getStackFrameListWhenTokenSubstring0AtTrimIsEmpty() {
        /* Branches:
         * (frames.hasMoreTokens()) : true
         * (at != NOT_FOUND) : true
         * (token.substring(0, at).trim().isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getStackTrace(throwable)).thenReturn("return_of_getStackTrace1");
            //Act Statement(s)
            List<String> result = ExceptionUtils.getStackFrameList(throwable);
            List<String> stringResultList = new ArrayList<>();
            stringResultList.add(" at");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(stringResultList.size()));
                assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
                exceptionUtils.verify(() -> ExceptionUtils.getStackTrace(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ab2bf11d-ee9e-3e75-80a6-e778d479739f}
    @Test()
    void getStackFrameListWhenNotTraceStarted() {
        /* Branches:
         * (frames.hasMoreTokens()) : true
         * (at != NOT_FOUND) : true
         * (token.substring(0, at).trim().isEmpty()) : false
         * (traceStarted) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getStackTrace(throwable)).thenReturn("return_of_getStackTrace1");
            //Act Statement(s)
            List<String> result = ExceptionUtils.getStackFrameList(throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                exceptionUtils.verify(() -> ExceptionUtils.getStackTrace(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${dfbd84b1-6d76-3c4f-aa0a-6321656b6878}
    @Test()
    void getStackFramesWhenFramesHasMoreTokens() {
        /* Branches:
         * (frames.hasMoreTokens()) : true
         */

        //Act Statement(s)
        String[] result = ExceptionUtils.getStackFrames("stackTrace1");
        String[] stringResultArray = new String[]{"stackTrace1"};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
    }

    //Sapient generated method id: ${cecab59f-75d7-37d4-b526-647ec05721d8}
    @Test()
    void getStackFrames1WhenThrowableIsNull() {
        /* Branches:
         * (throwable == null) : true
         */
        //Arrange Statement(s)
        Throwable throwable = null;

        //Act Statement(s)
        String[] result = ExceptionUtils.getStackFrames(throwable);
        String[] stringResultArray = new String[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
    }

    //Sapient generated method id: ${4e246985-04b6-3a4c-aefc-23ea337a7259}
    @Test()
    void getStackFrames1WhenThrowableIsNotNull() {
        /* Branches:
         * (throwable == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getStackTrace(throwable)).thenReturn("return_of_getStackTrace1");
            String[] stringArray = new String[]{};
            exceptionUtils.when(() -> ExceptionUtils.getStackFrames("return_of_getStackTrace1")).thenReturn(stringArray);
            //Act Statement(s)
            String[] result = ExceptionUtils.getStackFrames(throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(stringArray));
                exceptionUtils.verify(() -> ExceptionUtils.getStackTrace(throwable), atLeast(1));
                exceptionUtils.verify(() -> ExceptionUtils.getStackFrames("return_of_getStackTrace1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ffa15038-edd4-31eb-9219-2605cb93fa0b}
    @Test()
    void getStackTraceWhenThrowableIsNull() {
        /* Branches:
         * (throwable == null) : true
         */
        //Arrange Statement(s)
        Throwable throwable = null;

        //Act Statement(s)
        String result = ExceptionUtils.getStackTrace(throwable);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }

    //Sapient generated method id: ${17ab2409-b801-3508-b9bd-8cc938edc70d}
    @Test()
    void getStackTraceWhenThrowableIsNotNull() {
        /* Branches:
         * (throwable == null) : false
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();

        //Act Statement(s)
        String result = ExceptionUtils.getStackTrace(throwable);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }

    //Sapient generated method id: ${565a32e1-0a14-32df-8a26-8f083a895373}
    @Test()
    void getThrowableCountTest() {
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            List<Throwable> throwableList = new ArrayList<>();
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowableList(throwable)).thenReturn(throwableList);
            //Act Statement(s)
            int result = ExceptionUtils.getThrowableCount(throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowableList(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d41e7131-017e-35c9-b84b-734c70fbdc41}
    @Test()
    void getThrowableListWhenListNotContainsThrowable() {
        /* Branches:
         * (throwable != null) : true
         * (!list.contains(throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();

        //Act Statement(s)
        List<Throwable> result = ExceptionUtils.getThrowableList(throwable);
        List<Throwable> throwableResultList = new ArrayList<>();
        throwableResultList.add(throwable);

        //Assert statement(s)
        //TODO: Please implement equals method in Throwable for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(throwableResultList.size()));
            assertThat(result, containsInRelativeOrder(throwableResultList.toArray()));
        });
    }

    //Sapient generated method id: ${cecbc80a-ef86-3537-b06b-ee9f4abf082f}
    @Test()
    void getThrowablesTest() {
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            List<Throwable> throwableList = new ArrayList<>();
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowableList(throwable)).thenReturn(throwableList);
            //Act Statement(s)
            Throwable[] result = ExceptionUtils.getThrowables(throwable);
            Throwable[] throwableResultArray = new Throwable[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(throwableResultArray));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowableList(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${06ec2024-6165-3458-ab80-28f17edf99d6}
    @Test()
    void hasCauseWhenTypeIsInstanceChain() {
        /* Branches:
         * (chain instanceof UndeclaredThrowableException) : true
         * (type.isInstance(chain)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        UndeclaredThrowableException undeclaredThrowableException = null;

        //Act Statement(s)
        boolean result = ExceptionUtils.hasCause(undeclaredThrowableException, Throwable.class);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${6de3ced9-eddf-304c-ae4b-0c15ce98313a}
    @Test()
    void hasCauseWhenTypeNotIsInstanceChain() {
        /* Branches:
         * (chain instanceof UndeclaredThrowableException) : true
         * (type.isInstance(chain)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        UndeclaredThrowableException undeclaredThrowableException = null;

        //Act Statement(s)
        boolean result = ExceptionUtils.hasCause(undeclaredThrowableException, Throwable.class);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${d596d088-49b9-32f6-b0f8-102f9228af1d}
    @Test()
    void indexOfThrowableWhenTypeIsNull() {
        /* Branches:
         * (throwable == null) : false  #  inside indexOf method
         * (type == null) : true  #  inside indexOf method
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        Class<Throwable> _class = null;

        //Act Statement(s)
        int result = ExceptionUtils.indexOfThrowable(throwable, _class);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${8d50a44d-01c5-3be9-ac69-a316d286b09d}
    @Test()
    void indexOfThrowableWhenFromIndexGreaterThanOrEqualsToThrowablesLength() {
        /* Branches:
         * (throwable == null) : false  #  inside indexOf method
         * (type == null) : false  #  inside indexOf method
         * (fromIndex < 0) : false  #  inside indexOf method
         * (fromIndex >= throwables.length) : true  #  inside indexOf method
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable[] throwableArray = new Throwable[]{};
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable)).thenReturn(throwableArray);
            //Act Statement(s)
            int result = ExceptionUtils.indexOfThrowable(throwable, Throwable.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a9a46c12-0c7b-3285-a044-f65d3e68cfb7}
    @Test()
    void indexOfThrowableWhenTypeEqualsIIndexOfThrowablesGetClass() {
        /* Branches:
         * (throwable == null) : false  #  inside indexOf method
         * (type == null) : false  #  inside indexOf method
         * (fromIndex < 0) : false  #  inside indexOf method
         * (fromIndex >= throwables.length) : false  #  inside indexOf method
         * (subclass) : false  #  inside indexOf method
         * (i < throwables.length) : true  #  inside indexOf method
         * (type.equals(throwables[i].getClass())) : true  #  inside indexOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable[] throwableArray = new Throwable[]{throwable};
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            int result = ExceptionUtils.indexOfThrowable(throwable2, Throwable.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7b70f83d-77a4-3a0a-8c9f-7f5025c2c06d}
    @Test()
    void indexOfThrowableWhenTypeNotEqualsIIndexOfThrowablesGetClass() {
        /* Branches:
         * (throwable == null) : false  #  inside indexOf method
         * (type == null) : false  #  inside indexOf method
         * (fromIndex < 0) : false  #  inside indexOf method
         * (fromIndex >= throwables.length) : false  #  inside indexOf method
         * (subclass) : false  #  inside indexOf method
         * (i < throwables.length) : true  #  inside indexOf method
         * (type.equals(throwables[i].getClass())) : false  #  inside indexOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable[] throwableArray = new Throwable[]{throwable};
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            int result = ExceptionUtils.indexOfThrowable(throwable2, Throwable.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${16317da7-c147-38ca-b4cb-55a022e95f7a}
    @Test()
    void indexOfThrowable1WhenTypeIsNull() {
        /* Branches:
         * (throwable == null) : false  #  inside indexOf method
         * (type == null) : true  #  inside indexOf method
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        Class<Throwable> _class = null;

        //Act Statement(s)
        int result = ExceptionUtils.indexOfThrowable(throwable, _class, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${d29a37c5-0d8b-3752-a376-5a620c12a424}
    @Test()
    void indexOfThrowable1WhenFromIndexGreaterThanOrEqualsToThrowablesLength() {
        /* Branches:
         * (throwable == null) : false  #  inside indexOf method
         * (type == null) : false  #  inside indexOf method
         * (fromIndex < 0) : true  #  inside indexOf method
         * (fromIndex >= throwables.length) : true  #  inside indexOf method
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable[] throwableArray = new Throwable[]{};
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable)).thenReturn(throwableArray);
            //Act Statement(s)
            int result = ExceptionUtils.indexOfThrowable(throwable, Throwable.class, -1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${11163246-567e-3f70-8d67-42fabb166b82}
    @Test()
    void indexOfThrowable1WhenTypeEqualsIIndexOfThrowablesGetClass() {
        /* Branches:
         * (throwable == null) : false  #  inside indexOf method
         * (type == null) : false  #  inside indexOf method
         * (fromIndex < 0) : true  #  inside indexOf method
         * (fromIndex >= throwables.length) : false  #  inside indexOf method
         * (subclass) : false  #  inside indexOf method
         * (i < throwables.length) : true  #  inside indexOf method
         * (type.equals(throwables[i].getClass())) : true  #  inside indexOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable[] throwableArray = new Throwable[]{throwable};
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            int result = ExceptionUtils.indexOfThrowable(throwable2, Throwable.class, -1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${76807e45-6e38-36b6-8760-72cbfe4e8d49}
    @Test()
    void indexOfThrowable1WhenTypeNotEqualsIIndexOfThrowablesGetClass() {
        /* Branches:
         * (throwable == null) : false  #  inside indexOf method
         * (type == null) : false  #  inside indexOf method
         * (fromIndex < 0) : true  #  inside indexOf method
         * (fromIndex >= throwables.length) : false  #  inside indexOf method
         * (subclass) : false  #  inside indexOf method
         * (i < throwables.length) : true  #  inside indexOf method
         * (type.equals(throwables[i].getClass())) : false  #  inside indexOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable[] throwableArray = new Throwable[]{throwable};
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            int result = ExceptionUtils.indexOfThrowable(throwable2, Throwable.class, -1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c8411dfc-3bf5-3e42-866b-c3ae7728f3f8}
    @Test()
    void indexOfTypeWhenTypeIsNull() {
        /* Branches:
         * (throwable == null) : false  #  inside indexOf method
         * (type == null) : true  #  inside indexOf method
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        Class<Throwable> _class = null;

        //Act Statement(s)
        int result = ExceptionUtils.indexOfType(throwable, _class);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${3022b064-44dc-30c9-91fe-8ed64aae3611}
    @Test()
    void indexOfTypeWhenFromIndexGreaterThanOrEqualsToThrowablesLength() {
        /* Branches:
         * (throwable == null) : false  #  inside indexOf method
         * (type == null) : false  #  inside indexOf method
         * (fromIndex < 0) : false  #  inside indexOf method
         * (fromIndex >= throwables.length) : true  #  inside indexOf method
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable[] throwableArray = new Throwable[]{};
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable)).thenReturn(throwableArray);
            //Act Statement(s)
            int result = ExceptionUtils.indexOfType(throwable, Throwable.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5ef345d9-35aa-36ea-a598-947933f13f39}
    @Test()
    void indexOfTypeWhenTypeIsAssignableFromIIndexOfThrowablesGetClass() {
        /* Branches:
         * (throwable == null) : false  #  inside indexOf method
         * (type == null) : false  #  inside indexOf method
         * (fromIndex < 0) : false  #  inside indexOf method
         * (fromIndex >= throwables.length) : false  #  inside indexOf method
         * (subclass) : true  #  inside indexOf method
         * (i < throwables.length) : true  #  inside indexOf method
         * (type.isAssignableFrom(throwables[i].getClass())) : true  #  inside indexOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable[] throwableArray = new Throwable[]{throwable};
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            int result = ExceptionUtils.indexOfType(throwable2, Throwable.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${45c06e90-bc80-3db4-88ce-e088fd2a576d}
    @Test()
    void indexOfTypeWhenTypeNotIsAssignableFromIIndexOfThrowablesGetClass() {
        /* Branches:
         * (throwable == null) : false  #  inside indexOf method
         * (type == null) : false  #  inside indexOf method
         * (fromIndex < 0) : false  #  inside indexOf method
         * (fromIndex >= throwables.length) : false  #  inside indexOf method
         * (subclass) : true  #  inside indexOf method
         * (i < throwables.length) : true  #  inside indexOf method
         * (type.isAssignableFrom(throwables[i].getClass())) : false  #  inside indexOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable[] throwableArray = new Throwable[]{throwable};
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            int result = ExceptionUtils.indexOfType(throwable2, Throwable.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${48bb0513-980a-32e8-af3f-77b4cc065b2a}
    @Test()
    void indexOfType1WhenTypeIsNull() {
        /* Branches:
         * (throwable == null) : false  #  inside indexOf method
         * (type == null) : true  #  inside indexOf method
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        Class<Throwable> _class = null;

        //Act Statement(s)
        int result = ExceptionUtils.indexOfType(throwable, _class, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${8daf8ffc-2218-36ab-a9b4-4e8d6da30183}
    @Test()
    void indexOfType1WhenFromIndexGreaterThanOrEqualsToThrowablesLength() {
        /* Branches:
         * (throwable == null) : false  #  inside indexOf method
         * (type == null) : false  #  inside indexOf method
         * (fromIndex < 0) : true  #  inside indexOf method
         * (fromIndex >= throwables.length) : true  #  inside indexOf method
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable[] throwableArray = new Throwable[]{};
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable)).thenReturn(throwableArray);
            //Act Statement(s)
            int result = ExceptionUtils.indexOfType(throwable, Throwable.class, -1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${42f5e781-06f2-38f3-a416-8e99db3e848b}
    @Test()
    void indexOfType1WhenTypeIsAssignableFromIIndexOfThrowablesGetClass() {
        /* Branches:
         * (throwable == null) : false  #  inside indexOf method
         * (type == null) : false  #  inside indexOf method
         * (fromIndex < 0) : true  #  inside indexOf method
         * (fromIndex >= throwables.length) : false  #  inside indexOf method
         * (subclass) : true  #  inside indexOf method
         * (i < throwables.length) : true  #  inside indexOf method
         * (type.isAssignableFrom(throwables[i].getClass())) : true  #  inside indexOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable[] throwableArray = new Throwable[]{throwable};
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            int result = ExceptionUtils.indexOfType(throwable2, Throwable.class, -1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6e0cd522-5249-36fe-aa1f-e416508fa00c}
    @Test()
    void indexOfType1WhenTypeNotIsAssignableFromIIndexOfThrowablesGetClass() {
        /* Branches:
         * (throwable == null) : false  #  inside indexOf method
         * (type == null) : false  #  inside indexOf method
         * (fromIndex < 0) : true  #  inside indexOf method
         * (fromIndex >= throwables.length) : false  #  inside indexOf method
         * (subclass) : true  #  inside indexOf method
         * (i < throwables.length) : true  #  inside indexOf method
         * (type.isAssignableFrom(throwables[i].getClass())) : false  #  inside indexOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable[] throwableArray = new Throwable[]{throwable};
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            int result = ExceptionUtils.indexOfType(throwable2, Throwable.class, -1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${71014a7c-0084-3a62-bab1-a4b64fdc571a}
    @Test()
    void isCheckedWhenThrowableNotInstanceOfRuntimeException() {
        /* Branches:
         * (throwable != null) : true
         * (!(throwable instanceof Error)) : true
         * (!(throwable instanceof RuntimeException)) : true
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();

        //Act Statement(s)
        boolean result = ExceptionUtils.isChecked(throwable);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${6123a7a5-cc54-3f39-89a5-b09ed152b300}
    @Test()
    void isCheckedWhenThrowableInstanceOfRuntimeException() {
        /* Branches:
         * (throwable != null) : true
         * (!(throwable instanceof Error)) : true
         * (!(throwable instanceof RuntimeException)) : false
         */
        //Arrange Statement(s)
        RuntimeException runtimeException = new RuntimeException();

        //Act Statement(s)
        boolean result = ExceptionUtils.isChecked(runtimeException);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${8b4b61a8-786d-3717-8988-49707d9bfc96}
    @Test()
    void isUncheckedWhenThrowableInstanceOfRuntimeException() {
        /* Branches:
         * (throwable != null) : true
         * (throwable instanceof Error) : false
         * (throwable instanceof RuntimeException) : true
         */
        //Arrange Statement(s)
        RuntimeException runtimeException = new RuntimeException();

        //Act Statement(s)
        boolean result = ExceptionUtils.isUnchecked(runtimeException);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${9907ad14-1f42-330d-8311-8272c36124d0}
    @Test()
    void isUncheckedWhenThrowableNotInstanceOfRuntimeException() {
        /* Branches:
         * (throwable != null) : true
         * (throwable instanceof Error) : false
         * (throwable instanceof RuntimeException) : false
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();

        //Act Statement(s)
        boolean result = ExceptionUtils.isUnchecked(throwable);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${dbbbf028-0206-320f-81bc-760abe826c41}
    @Test()
    void printRootCauseStackTraceTest() {
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            PrintStream printStream = System.err;
            exceptionUtils.when(() -> ExceptionUtils.printRootCauseStackTrace(throwable, printStream)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ExceptionUtils.printRootCauseStackTrace(throwable);
            //Assert statement(s)
            assertAll("result", () -> exceptionUtils.verify(() -> ExceptionUtils.printRootCauseStackTrace(throwable, printStream), atLeast(1)));
        }
    }

    //Sapient generated method id: ${1bbd051d-9bb9-35eb-9790-0b7429027c34}
    @Test()
    void printRootCauseStackTrace1WhenThrowableIsNull() {
        /* Branches:
         * (throwable == null) : true
         */
        //Arrange Statement(s)
        Throwable throwable = null;
        OutputStream outputStream = OutputStream.nullOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        //Act Statement(s)
        ExceptionUtils.printRootCauseStackTrace(throwable, printStream);
    }

    //Sapient generated method id: ${a859c1b9-fef4-3939-8620-19e46930ccb4}
    @Test()
    void printRootCauseStackTrace1WhenThrowableIsNotNull() {
        /* Branches:
         * (throwable == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            List<String> stringList = new ArrayList<>();
            stringList.add("return_of_getRootCauseStackTraceListItem1");
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getRootCauseStackTraceList(throwable)).thenReturn(stringList);
            OutputStream outputStream = OutputStream.nullOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            //Act Statement(s)
            ExceptionUtils.printRootCauseStackTrace(throwable, printStream);
            //Assert statement(s)
            assertAll("result", () -> exceptionUtils.verify(() -> ExceptionUtils.getRootCauseStackTraceList(throwable), atLeast(1)));
        }
    }

    //Sapient generated method id: ${f2797a40-6ac5-33a3-846b-dd38595dc771}
    @Test()
    void printRootCauseStackTrace2WhenThrowableIsNull() {
        /* Branches:
         * (throwable == null) : true
         */
        //Arrange Statement(s)
        Throwable throwable = null;
        Writer writer = Writer.nullWriter();
        PrintWriter printWriter = new PrintWriter(writer);

        //Act Statement(s)
        ExceptionUtils.printRootCauseStackTrace(throwable, printWriter);
    }

    //Sapient generated method id: ${e1b4f56a-bbc0-3319-b0f4-61c573cbf222}
    @Test()
    void printRootCauseStackTrace2WhenThrowableIsNotNull() {
        /* Branches:
         * (throwable == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            List<String> stringList = new ArrayList<>();
            stringList.add("return_of_getRootCauseStackTraceListItem1");
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getRootCauseStackTraceList(throwable)).thenReturn(stringList);
            Writer writer = Writer.nullWriter();
            PrintWriter printWriter = new PrintWriter(writer);
            //Act Statement(s)
            ExceptionUtils.printRootCauseStackTrace(throwable, printWriter);
            //Assert statement(s)
            assertAll("result", () -> exceptionUtils.verify(() -> ExceptionUtils.getRootCauseStackTraceList(throwable), atLeast(1)));
        }
    }

    //Sapient generated method id: ${b35aaae2-67f5-3e08-a93e-285c1e493cd0}
    @Test()
    void removeCommonFramesWhenCauseFrameEqualsWrapperFrame() {
        /* Branches:
         * (causeFrameIndex >= 0) : true
         * (wrapperFrameIndex >= 0) : true
         * (causeFrame.equals(wrapperFrame)) : true
         */
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>();
        stringList.add("causeFramesItem1");
        stringList.add("");
        List<String> stringList2 = new ArrayList<>();
        stringList2.add("");

        //Act Statement(s)
        ExceptionUtils.removeCommonFrames(stringList, stringList2);
        List<String> stringStringListList = new ArrayList<>();
        stringStringListList.add("causeFramesItem1");

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(stringList.size(), equalTo(stringStringListList.size()));
            assertThat(stringList, containsInRelativeOrder(stringStringListList.toArray()));
        });
    }

    //Sapient generated method id: ${3f08df45-95f0-3667-afa2-ec2d90e38879}
    @Test()
    void rethrowThrowsThrowable() {

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${b4af2388-e781-3800-820a-b8ede09bd914}
    @Test()
    void streamTest() {
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            List<Throwable> throwableList = new ArrayList<>();
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowableList(throwable)).thenReturn(throwableList);
            //Act Statement(s)
            Stream<Throwable> result = ExceptionUtils.stream(throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowableList(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f999d0a4-67d8-3fcd-b184-f9a73108a171}
    @Test()
    void throwableOfThrowableWhenTypeIsNull() {
        /* Branches:
         * (throwable == null) : false  #  inside throwableOf method
         * (type == null) : true  #  inside throwableOf method
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        Class<Throwable> _class = null;

        //Act Statement(s)
        Throwable result = ExceptionUtils.throwableOfThrowable(throwable, _class);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${f08a599a-91cf-3067-a65b-49fc52f1e86a}
    @Test()
    void throwableOfThrowableWhenFromIndexGreaterThanOrEqualsToThrowablesLength() {
        /* Branches:
         * (throwable == null) : false  #  inside throwableOf method
         * (type == null) : false  #  inside throwableOf method
         * (fromIndex < 0) : false  #  inside throwableOf method
         * (fromIndex >= throwables.length) : true  #  inside throwableOf method
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable[] throwableArray = new Throwable[]{};
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable)).thenReturn(throwableArray);
            //Act Statement(s)
            Throwable result = ExceptionUtils.throwableOfThrowable(throwable, Throwable.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${062d6e3f-55c8-3eff-8892-2ccc0b734c74}
    @Test()
    void throwableOfThrowableWhenTypeEqualsIIndexOfThrowablesGetClass() {
        /* Branches:
         * (throwable == null) : false  #  inside throwableOf method
         * (type == null) : false  #  inside throwableOf method
         * (fromIndex < 0) : false  #  inside throwableOf method
         * (fromIndex >= throwables.length) : false  #  inside throwableOf method
         * (subclass) : false  #  inside throwableOf method
         * (i < throwables.length) : true  #  inside throwableOf method
         * (type.equals(throwables[i].getClass())) : true  #  inside throwableOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable[] throwableArray = new Throwable[]{throwable};
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            Throwable result = ExceptionUtils.throwableOfThrowable(throwable2, Throwable.class);
            Throwable throwable3 = new Throwable();
            //Assert statement(s)
            //TODO: Please implement equals method in Throwable for verification to succeed or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, equalTo(throwable3));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a798bcf2-73c7-3ece-80fe-c55b7d262aa3}
    @Test()
    void throwableOfThrowableWhenTypeNotEqualsIIndexOfThrowablesGetClass() {
        /* Branches:
         * (throwable == null) : false  #  inside throwableOf method
         * (type == null) : false  #  inside throwableOf method
         * (fromIndex < 0) : false  #  inside throwableOf method
         * (fromIndex >= throwables.length) : false  #  inside throwableOf method
         * (subclass) : false  #  inside throwableOf method
         * (i < throwables.length) : true  #  inside throwableOf method
         * (type.equals(throwables[i].getClass())) : false  #  inside throwableOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable[] throwableArray = new Throwable[]{throwable};
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            Throwable result = ExceptionUtils.throwableOfThrowable(throwable2, Throwable.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fbc73775-94b5-336f-a12a-890ac6e75ff2}
    @Test()
    void throwableOfThrowable1WhenTypeIsNull() {
        /* Branches:
         * (throwable == null) : false  #  inside throwableOf method
         * (type == null) : true  #  inside throwableOf method
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        Class<Throwable> _class = null;

        //Act Statement(s)
        Throwable result = ExceptionUtils.throwableOfThrowable(throwable, _class, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${b9f56033-0a02-3b04-a609-0b24a685d228}
    @Test()
    void throwableOfThrowable1WhenFromIndexGreaterThanOrEqualsToThrowablesLength() {
        /* Branches:
         * (throwable == null) : false  #  inside throwableOf method
         * (type == null) : false  #  inside throwableOf method
         * (fromIndex < 0) : true  #  inside throwableOf method
         * (fromIndex >= throwables.length) : true  #  inside throwableOf method
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable[] throwableArray = new Throwable[]{};
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable)).thenReturn(throwableArray);
            //Act Statement(s)
            Throwable result = ExceptionUtils.throwableOfThrowable(throwable, Throwable.class, -1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a1f5a313-a2ba-3b02-bdbe-733836e81a76}
    @Test()
    void throwableOfThrowable1WhenTypeEqualsIIndexOfThrowablesGetClass() {
        /* Branches:
         * (throwable == null) : false  #  inside throwableOf method
         * (type == null) : false  #  inside throwableOf method
         * (fromIndex < 0) : true  #  inside throwableOf method
         * (fromIndex >= throwables.length) : false  #  inside throwableOf method
         * (subclass) : false  #  inside throwableOf method
         * (i < throwables.length) : true  #  inside throwableOf method
         * (type.equals(throwables[i].getClass())) : true  #  inside throwableOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable[] throwableArray = new Throwable[]{throwable};
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            Throwable result = ExceptionUtils.throwableOfThrowable(throwable2, Throwable.class, -1);
            Throwable throwable3 = new Throwable();
            //Assert statement(s)
            //TODO: Please implement equals method in Throwable for verification to succeed or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, equalTo(throwable3));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${e153deee-d689-3505-92f1-8ee93810829e}
    @Test()
    void throwableOfThrowable1WhenTypeNotEqualsIIndexOfThrowablesGetClass() {
        /* Branches:
         * (throwable == null) : false  #  inside throwableOf method
         * (type == null) : false  #  inside throwableOf method
         * (fromIndex < 0) : true  #  inside throwableOf method
         * (fromIndex >= throwables.length) : false  #  inside throwableOf method
         * (subclass) : false  #  inside throwableOf method
         * (i < throwables.length) : true  #  inside throwableOf method
         * (type.equals(throwables[i].getClass())) : false  #  inside throwableOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable[] throwableArray = new Throwable[]{throwable};
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            Throwable result = ExceptionUtils.throwableOfThrowable(throwable2, Throwable.class, -1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b782add0-9f43-376a-8cb2-8f5f8bc48217}
    @Test()
    void throwableOfTypeWhenTypeIsNull() {
        /* Branches:
         * (throwable == null) : false  #  inside throwableOf method
         * (type == null) : true  #  inside throwableOf method
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        Class<Throwable> _class = null;

        //Act Statement(s)
        Throwable result = ExceptionUtils.throwableOfType(throwable, _class);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${32bd3b9e-9da6-372e-a5b7-9ccb2a8fd901}
    @Test()
    void throwableOfTypeWhenFromIndexGreaterThanOrEqualsToThrowablesLength() {
        /* Branches:
         * (throwable == null) : false  #  inside throwableOf method
         * (type == null) : false  #  inside throwableOf method
         * (fromIndex < 0) : false  #  inside throwableOf method
         * (fromIndex >= throwables.length) : true  #  inside throwableOf method
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable[] throwableArray = new Throwable[]{};
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable)).thenReturn(throwableArray);
            //Act Statement(s)
            Throwable result = ExceptionUtils.throwableOfType(throwable, Throwable.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${da201b01-00bc-30ff-a492-002f50c16fef}
    @Test()
    void throwableOfTypeWhenTypeIsAssignableFromIIndexOfThrowablesGetClass() {
        /* Branches:
         * (throwable == null) : false  #  inside throwableOf method
         * (type == null) : false  #  inside throwableOf method
         * (fromIndex < 0) : false  #  inside throwableOf method
         * (fromIndex >= throwables.length) : false  #  inside throwableOf method
         * (subclass) : true  #  inside throwableOf method
         * (i < throwables.length) : true  #  inside throwableOf method
         * (type.isAssignableFrom(throwables[i].getClass())) : true  #  inside throwableOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable[] throwableArray = new Throwable[]{throwable};
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            Throwable result = ExceptionUtils.throwableOfType(throwable2, Throwable.class);
            Throwable throwable3 = new Throwable();
            //Assert statement(s)
            //TODO: Please implement equals method in Throwable for verification to succeed or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, equalTo(throwable3));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${bb04b718-e889-3ab2-b124-58d43c513063}
    @Test()
    void throwableOfTypeWhenTypeNotIsAssignableFromIIndexOfThrowablesGetClass() {
        /* Branches:
         * (throwable == null) : false  #  inside throwableOf method
         * (type == null) : false  #  inside throwableOf method
         * (fromIndex < 0) : false  #  inside throwableOf method
         * (fromIndex >= throwables.length) : false  #  inside throwableOf method
         * (subclass) : true  #  inside throwableOf method
         * (i < throwables.length) : true  #  inside throwableOf method
         * (type.isAssignableFrom(throwables[i].getClass())) : false  #  inside throwableOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable[] throwableArray = new Throwable[]{throwable};
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            Throwable result = ExceptionUtils.throwableOfType(throwable2, Throwable.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${002e4194-5a1e-36ed-bf8c-5a2d0fc18ded}
    @Test()
    void throwableOfType1WhenTypeIsNull() {
        /* Branches:
         * (throwable == null) : false  #  inside throwableOf method
         * (type == null) : true  #  inside throwableOf method
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        Class<Throwable> _class = null;

        //Act Statement(s)
        Throwable result = ExceptionUtils.throwableOfType(throwable, _class, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${c1abd9c6-130a-30d7-97e5-01f47d1ab4c9}
    @Test()
    void throwableOfType1WhenFromIndexGreaterThanOrEqualsToThrowablesLength() {
        /* Branches:
         * (throwable == null) : false  #  inside throwableOf method
         * (type == null) : false  #  inside throwableOf method
         * (fromIndex < 0) : true  #  inside throwableOf method
         * (fromIndex >= throwables.length) : true  #  inside throwableOf method
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable[] throwableArray = new Throwable[]{};
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable)).thenReturn(throwableArray);
            //Act Statement(s)
            Throwable result = ExceptionUtils.throwableOfType(throwable, Throwable.class, -1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6ae7f4a8-2406-3cbe-b722-eb3127104da4}
    @Test()
    void throwableOfType1WhenTypeIsAssignableFromIIndexOfThrowablesGetClass() {
        /* Branches:
         * (throwable == null) : false  #  inside throwableOf method
         * (type == null) : false  #  inside throwableOf method
         * (fromIndex < 0) : true  #  inside throwableOf method
         * (fromIndex >= throwables.length) : false  #  inside throwableOf method
         * (subclass) : true  #  inside throwableOf method
         * (i < throwables.length) : true  #  inside throwableOf method
         * (type.isAssignableFrom(throwables[i].getClass())) : true  #  inside throwableOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable[] throwableArray = new Throwable[]{throwable};
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            Throwable result = ExceptionUtils.throwableOfType(throwable2, Throwable.class, -1);
            Throwable throwable3 = new Throwable();
            //Assert statement(s)
            //TODO: Please implement equals method in Throwable for verification to succeed or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, equalTo(throwable3));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7c9c943f-03f7-3898-a256-72ac0f6f7246}
    @Test()
    void throwableOfType1WhenTypeNotIsAssignableFromIIndexOfThrowablesGetClass() {
        /* Branches:
         * (throwable == null) : false  #  inside throwableOf method
         * (type == null) : false  #  inside throwableOf method
         * (fromIndex < 0) : true  #  inside throwableOf method
         * (fromIndex >= throwables.length) : false  #  inside throwableOf method
         * (subclass) : true  #  inside throwableOf method
         * (i < throwables.length) : true  #  inside throwableOf method
         * (type.isAssignableFrom(throwables[i].getClass())) : false  #  inside throwableOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable[] throwableArray = new Throwable[]{throwable};
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            Throwable result = ExceptionUtils.throwableOfType(throwable2, Throwable.class, -1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${856bbdee-dabd-3364-a375-6e156c6d8eb3}
    @Test()
    void throwUncheckedWhenThrowableInstanceOfRuntimeExceptionThrowsRuntimeException() {
        /* Branches:
         * (throwable instanceof RuntimeException) : true
         */

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${b08dfef6-f377-3c48-821f-034c0a8d876e}
    @Test()
    void throwUncheckedWhenThrowableInstanceOfErrorThrowsError() {
        /* Branches:
         * (throwable instanceof RuntimeException) : false
         * (throwable instanceof Error) : true
         */

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${08f7d215-f7eb-3f8d-92eb-68f137c09657}
    @Test()
    void throwUncheckedWhenThrowableNotInstanceOfError() {
        /* Branches:
         * (throwable instanceof RuntimeException) : false
         * (throwable instanceof Error) : false
         */
        //Arrange Statement(s)
        Object object = new Object();

        //Act Statement(s)
        Object result = ExceptionUtils.throwUnchecked(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${c5d83c24-dc62-3fda-a2a8-f9ddbbe7fbff}
    @Test()
    void throwUnchecked1WhenIsUncheckedThrowableThrowsRuntimeException() {
        /* Branches:
         * (isUnchecked(throwable)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.isUnchecked(throwable)).thenReturn(true);
            RuntimeException runtimeException = new RuntimeException();
            exceptionUtils.when(() -> ExceptionUtils.asRuntimeException(throwable)).thenThrow(runtimeException);
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                ExceptionUtils.throwUnchecked(throwable);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(runtimeException));
                exceptionUtils.verify(() -> ExceptionUtils.isUnchecked(throwable), atLeast(1));
                exceptionUtils.verify(() -> ExceptionUtils.asRuntimeException(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ccbf5aaa-12f6-331a-8782-96e2759ed05b}
    @Test()
    void throwUnchecked1WhenIsUncheckedNotThrowable() {
        /* Branches:
         * (isUnchecked(throwable)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.isUnchecked(throwable)).thenReturn(false);
            //Act Statement(s)
            Throwable result = ExceptionUtils.throwUnchecked(throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(throwable));
                exceptionUtils.verify(() -> ExceptionUtils.isUnchecked(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b8950594-6efd-362f-b118-8586b791b95e}
    @Test()
    void wrapAndThrowThrowsUndeclaredThrowableException() {
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.throwUnchecked(throwable2)).thenReturn(throwable);
            //Act Statement(s)
            final UndeclaredThrowableException result = assertThrows(UndeclaredThrowableException.class, () -> {
                ExceptionUtils.wrapAndThrow(throwable2);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                exceptionUtils.verify(() -> ExceptionUtils.throwUnchecked(throwable2), atLeast(1));
            });
        }
    }
}
