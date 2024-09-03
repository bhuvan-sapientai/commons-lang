package org.apache.commons.lang3.exception;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
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
import java.io.ByteArrayOutputStream;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import java.util.Arrays;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ExceptionUtilsSapientGeneratedTest {

    private final UndeclaredThrowableException undeclaredThrowableExceptionMock = mock(UndeclaredThrowableException.class);

    //Sapient generated method id: ${asRuntimeExceptionThrowsThrowable}, hash: 645B5A3ED0FB6202391FE3AE03E8640C
    @Test()
    void asRuntimeExceptionThrowsThrowable() {
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        //Act Statement(s)
        final Throwable result = assertThrows(Throwable.class, () -> {
            ExceptionUtils.asRuntimeException(throwable);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(throwable)));
    }

    //Sapient generated method id: ${forEachTest}, hash: 5C7EA27DB00439C973B25C09B4173443
    @Test()
    void forEachTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Consumer consumerMock = mock(Consumer.class);
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Stream stream = Stream.empty();
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.stream(throwable)).thenReturn(stream);
            //Act Statement(s)
            ExceptionUtils.forEach(throwable, consumerMock);
            //Assert statement(s)
            assertAll("result", () -> exceptionUtils.verify(() -> ExceptionUtils.stream(throwable), atLeast(1)));
        }
    }

    //Sapient generated method id: ${getCauseTest}, hash: 5ED994023757F0D7880359FEC62A2E4A
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

    //Sapient generated method id: ${getCause1WhenThrowableIsNull}, hash: 320F4E200FA48A394AF94603E9735B06
    @Test()
    void getCause1WhenThrowableIsNull() {
        /* Branches:
         * (throwable == null) : true
         */
         //Arrange Statement(s)
        Throwable throwable = null;
        String[] stringArray = new String[] {};
        
        //Act Statement(s)
        Throwable result = ExceptionUtils.getCause(throwable, stringArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getCause1WhenCauseIsNotNull}, hash: 77FC3A058700CDC615F6D813CAC572A6
    @Test()
    void getCause1WhenCauseIsNotNull() {
        /* Branches:
         * (throwable == null) : false
         * (methodNames == null) : true
         * (cause != null) : true
         */
         //Arrange Statement(s)
        Throwable throwable = new Throwable();
        Throwable throwable2 = new Throwable(throwable);
        String[] string = null;
        
        //Act Statement(s)
        Throwable result = ExceptionUtils.getCause(throwable2, string);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(throwable)));
    }

    //Sapient generated method id: ${getCause1WhenThrowableIsAssignableFromMethodGetReturnType}, hash: E7A68EFD0C345AC56662E40BF791FE6D
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
        
        //Assert statement(s)
        //TODO: Please implement equals method in Throwable for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getCause1WhenCaughtIllegalAccessExceptionOrIllegalArgumentExceptionOrInvocationTargetException}, hash: 5EA76924127F4EE75383E9A6AF56F73C
    @Test()
    void getCause1WhenCaughtIllegalAccessExceptionOrIllegalArgumentExceptionOrInvocationTargetException() {
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
        
        //Assert statement(s)
        //TODO: Please implement equals method in Throwable for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getDefaultCauseMethodNamesTest}, hash: FDD761E29624FF568A2C1BE27B57F28C
    @Test()
    void getDefaultCauseMethodNamesTest() {
        
        //Act Statement(s)
        String[] result = ExceptionUtils.getDefaultCauseMethodNames();
        String[] stringResultArray = new String[] { "getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", "getLinkedCause", "getThrowable" };
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
    }

    //Sapient generated method id: ${getMessageWhenThIsNull}, hash: 94991772DDE975BD828558E06E47C47F
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

    //Sapient generated method id: ${getMessageWhenThIsNotNull}, hash: 643EE5AA72F7086AD3B149C6F803B058
    @Test()
    void getMessageWhenThIsNotNull() {
        /* Branches:
         * (th == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Throwable throwable = new Throwable("A");
        
        //Act Statement(s)
        String result = ExceptionUtils.getMessage(throwable);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("B: A")));
    }

    //Sapient generated method id: ${getRootCauseWhenListIsEmpty}, hash: D88703043596658F9F8E1F1715F54A90
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

    //Sapient generated method id: ${getRootCauseWhenListNotIsEmpty}, hash: FF430EABEAB15C69E0F651419F13216A
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

    //Sapient generated method id: ${getRootCauseMessageWhenRootIsNull}, hash: 648CDD9A89B32A5E55EF91A21285732F
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

    //Sapient generated method id: ${getRootCauseMessageWhenRootIsNotNull}, hash: B0673535118F98C51A8359C36FD739EF
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

    //Sapient generated method id: ${getRootCauseStackTraceTest}, hash: 2AE53B1813E55D0CFB41AC22698BEAA5
    @Test()
    void getRootCauseStackTraceTest() {
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            List<String> stringList = new ArrayList<>();
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getRootCauseStackTraceList(throwable)).thenReturn(stringList);
            //Act Statement(s)
            String[] result = ExceptionUtils.getRootCauseStackTrace(throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                exceptionUtils.verify(() -> ExceptionUtils.getRootCauseStackTraceList(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getRootCauseStackTraceListWhenThrowableIsNull}, hash: EAEE7887C741BD2F3595F8EE00FE249A
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

    //Sapient generated method id: ${getRootCauseStackTraceListWhenIEqualsCountMinus1}, hash: 7014BC267E887D55296599B3D0E2316C
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
            Throwable[] throwableArray = new Throwable[] { throwable, throwable2 };
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
            List<String> stringResultList = new ArrayList<>(Arrays.asList("throwable4"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable3), atLeast(1));
                exceptionUtils.verify(() -> ExceptionUtils.getStackFrameList(throwable4), atLeast(1));
                exceptionUtils.verify(() -> ExceptionUtils.getStackFrameList(throwable), atLeast(1));
                exceptionUtils.verify(() -> ExceptionUtils.removeCommonFrames(anyList(), anyList()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getStackFrameListWhenTokenSubstring0AtTrimIsEmpty}, hash: 048BD72BCFCC32CEEAF9B3803E167FD4
    @Test()
    void getStackFrameListWhenTokenSubstring0AtTrimIsEmpty() {
        /* Branches:
         * (frames.hasMoreTokens()) : true
         * (at != NOT_FOUND) : true
         * (token.substring(0, at).trim().isEmpty()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: frames - Method: hasMoreTokens
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getStackTrace(throwable)).thenReturn("return_of_getStackTrace1");
            //Act Statement(s)
            List<String> result = ExceptionUtils.getStackFrameList(throwable);
            List<String> stringResultList = new ArrayList<>(Arrays.asList(" at"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
                exceptionUtils.verify(() -> ExceptionUtils.getStackTrace(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getStackFrameListWhenNotTraceStarted}, hash: 188BFA5A5B07AD177585658AE1D2787E
    @Test()
    void getStackFrameListWhenNotTraceStarted() {
        /* Branches:
         * (frames.hasMoreTokens()) : true
         * (at != NOT_FOUND) : true
         * (token.substring(0, at).trim().isEmpty()) : false
         * (traceStarted) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: frames - Method: hasMoreTokens
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${getStackFramesWhenFramesHasMoreTokens}, hash: DE322A6DA31B95B43FEE156AEAA59ABA
    @Test()
    void getStackFramesWhenFramesHasMoreTokens() {
        /* Branches:
         * (frames.hasMoreTokens()) : true
         */
         
        //Act Statement(s)
        String[] result = ExceptionUtils.getStackFrames("stackTrace1");
        String[] stringResultArray = new String[] { "stackTrace1" };
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
    }

    //Sapient generated method id: ${getStackFrames1WhenThrowableIsNull}, hash: EE61B7F05BEDCD53A2944E293E7F7944
    @Test()
    void getStackFrames1WhenThrowableIsNull() {
        /* Branches:
         * (throwable == null) : true
         */
         //Arrange Statement(s)
        Throwable throwable = null;
        
        //Act Statement(s)
        String[] result = ExceptionUtils.getStackFrames(throwable);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //Sapient generated method id: ${getStackFrames1WhenThrowableIsNotNull}, hash: 8FB691EEEE92BE0AACB2156A7B86A22D
    @Test()
    void getStackFrames1WhenThrowableIsNotNull() {
        /* Branches:
         * (throwable == null) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getStackTrace(throwable)).thenReturn("return_of_getStackTrace1");
            String[] stringArray = new String[] {};
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

    //Sapient generated method id: ${getStackTraceWhenThrowableIsNull}, hash: 5A8960821ECB6B0F209BB36DB118EEDE
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

    //Sapient generated method id: ${getStackTraceWhenThrowableIsNotNull}, hash: BDD2D15DFAF968BBBEAEAB901EC4F02F
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

    //Sapient generated method id: ${getThrowableCountTest}, hash: 3A2A03A8041587696E3A888050D5C73A
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

    //Sapient generated method id: ${getThrowableListWhenListNotContainsThrowable}, hash: 112FDBB4E4D2D2EC25065C1421189604
    @Test()
    void getThrowableListWhenListNotContainsThrowable() {
        /* Branches:
         * (throwable != null) : true
         * (!list.contains(throwable)) : true
         */
         //Arrange Statement(s)
        Throwable throwable = new Throwable((Throwable) null);
        
        //Act Statement(s)
        List<Throwable> result = ExceptionUtils.getThrowableList(throwable);
        
        //Assert statement(s)
        //TODO: Please implement equals method in Throwable for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result.size(), equalTo(1)));
    }

    //Sapient generated method id: ${getThrowablesTest}, hash: F2EFCA916A719CE61E69F0BB32CE5F9A
    @Test()
    void getThrowablesTest() {
        //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            List<Throwable> throwableList = new ArrayList<>();
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowableList(throwable)).thenReturn(throwableList);
            //Act Statement(s)
            Throwable[] result = ExceptionUtils.getThrowables(throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowableList(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${hasCauseWhenTypeIsInstanceChain}, hash: 36DF3819DDA8AE666CC4E68E793897A7
    @Test()
    void hasCauseWhenTypeIsInstanceChain() {
        /* Branches:
         * (chain instanceof UndeclaredThrowableException) : true
         * (type.isInstance(chain)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = ExceptionUtils.hasCause(undeclaredThrowableExceptionMock, Throwable.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${hasCauseWhenTypeNotIsInstanceChain}, hash: E83EFE3A9AD7A6E3D7A7DA51C3C2D3D9
    @Test()
    void hasCauseWhenTypeNotIsInstanceChain() {
        /* Branches:
         * (chain instanceof UndeclaredThrowableException) : true
         * (type.isInstance(chain)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = ExceptionUtils.hasCause(undeclaredThrowableExceptionMock, Throwable.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${indexOfThrowableWhenTypeIsNull}, hash: 9C0025164CA817401E8154D72AA332B9
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

    //Sapient generated method id: ${indexOfThrowableWhenFromIndexGreaterThanOrEqualsToThrowablesLength}, hash: 9F95C1E682E36E2193AB2AFAD461C630
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
            Throwable[] throwableArray = new Throwable[] {};
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

    //Sapient generated method id: ${indexOfThrowableWhenTypeEqualsIIndexOfThrowablesGetClass}, hash: 055E274555CFBD3859F0BF7317928856
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
            Throwable[] throwableArray = new Throwable[] { throwable };
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

    //Sapient generated method id: ${indexOfThrowableWhenTypeNotEqualsIIndexOfThrowablesGetClass}, hash: F210E3488477A18164A8226E92B62855
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
            Throwable[] throwableArray = new Throwable[] { throwable };
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

    //Sapient generated method id: ${indexOfThrowable1WhenTypeIsNull}, hash: DB2C98A411CB97052511459AED212AD7
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

    //Sapient generated method id: ${indexOfThrowable1WhenFromIndexGreaterThanOrEqualsToThrowablesLength}, hash: 30C3D2041BEE560EEEF72FAEB49DE466
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
            Throwable[] throwableArray = new Throwable[] {};
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

    //Sapient generated method id: ${indexOfThrowable1WhenTypeEqualsIIndexOfThrowablesGetClass}, hash: 45FE781EF6DE325C2AE16AE1C19CDDFC
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
            Throwable[] throwableArray = new Throwable[] { throwable };
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

    //Sapient generated method id: ${indexOfThrowable1WhenTypeNotEqualsIIndexOfThrowablesGetClass}, hash: FC477F2C5A4564DB511BA60ECFD6E7D1
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
            Throwable[] throwableArray = new Throwable[] { throwable };
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

    //Sapient generated method id: ${indexOfTypeWhenTypeIsNull}, hash: 489E7F337C0A3E025A52C8B9AD00015D
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

    //Sapient generated method id: ${indexOfTypeWhenFromIndexGreaterThanOrEqualsToThrowablesLength}, hash: B10EDCBA80A8038346B23A683B325A09
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
            Throwable[] throwableArray = new Throwable[] {};
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

    //Sapient generated method id: ${indexOfTypeWhenTypeIsAssignableFromIIndexOfThrowablesGetClass}, hash: 28DBDD3DB19778C40C873F165F738504
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
            Throwable[] throwableArray = new Throwable[] { throwable };
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

    //Sapient generated method id: ${indexOfTypeWhenTypeNotIsAssignableFromIIndexOfThrowablesGetClass}, hash: 74701DD060D91DDA3E49BAA349FFFD45
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
            Throwable[] throwableArray = new Throwable[] { throwable };
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

    //Sapient generated method id: ${indexOfType1WhenTypeIsNull}, hash: 6A0989EDB9FC3A9A702C95B12E146DBF
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

    //Sapient generated method id: ${indexOfType1WhenFromIndexGreaterThanOrEqualsToThrowablesLength}, hash: 5235847F20605AE83174AEC67EAAC573
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
            Throwable[] throwableArray = new Throwable[] {};
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

    //Sapient generated method id: ${indexOfType1WhenTypeIsAssignableFromIIndexOfThrowablesGetClass}, hash: 7370C2E3662427A4A3F7D6BC7AA031F3
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
            Throwable[] throwableArray = new Throwable[] { throwable };
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

    //Sapient generated method id: ${indexOfType1WhenTypeNotIsAssignableFromIIndexOfThrowablesGetClass}, hash: 936C0E942B6999C47E6CC106A796C21B
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
            Throwable[] throwableArray = new Throwable[] { throwable };
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

    //Sapient generated method id: ${isCheckedWhenThrowableNotInstanceOfRuntimeException}, hash: B8B2DE9CF17D00593465416E6D330458
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

    //Sapient generated method id: ${isCheckedWhenThrowableInstanceOfRuntimeException}, hash: C996EEDCF1779CC358841128D0F3D8A4
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

    //Sapient generated method id: ${isUncheckedWhenThrowableInstanceOfRuntimeException}, hash: 8C474EFEB7A9CB59CC06B0BA5EC242A6
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

    //Sapient generated method id: ${isUncheckedWhenThrowableNotInstanceOfRuntimeException}, hash: 7679D8DEB9ADE995939283592E948F7D
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

    //Sapient generated method id: ${printRootCauseStackTraceTest}, hash: 60934BAC7E576265E9117555912CA441
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

    //Sapient generated method id: ${printRootCauseStackTrace1WhenThrowableIsNull}, hash: C0D4E132EB42F1C284FDA5998F6F8090
    @Test()
    void printRootCauseStackTrace1WhenThrowableIsNull() {
        /* Branches:
         * (throwable == null) : true
         */
         //Arrange Statement(s)
        Throwable throwable = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        
        //Act Statement(s)
        ExceptionUtils.printRootCauseStackTrace(throwable, printStream);
    }

    //Sapient generated method id: ${printRootCauseStackTrace1WhenThrowableIsNotNull}, hash: CA7993F4BBAEB39EC45920DB130145E4
    @Test()
    void printRootCauseStackTrace1WhenThrowableIsNotNull() {
        /* Branches:
         * (throwable == null) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
            List<String> stringList = new ArrayList<>(Arrays.asList("return_of_getRootCauseStackTraceListItem1"));
            Throwable throwable = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getRootCauseStackTraceList(throwable)).thenReturn(stringList);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(byteArrayOutputStream);
            //Act Statement(s)
            ExceptionUtils.printRootCauseStackTrace(throwable, printStream);
            //Assert statement(s)
            assertAll("result", () -> exceptionUtils.verify(() -> ExceptionUtils.getRootCauseStackTraceList(throwable), atLeast(1)));
        }
    }

    //Sapient generated method id: ${printRootCauseStackTrace2WhenThrowableIsNull}, hash: 349093DE1AC11AFCD6DF03A75CB3E6C2
    @Test()
    void printRootCauseStackTrace2WhenThrowableIsNull() {
        /* Branches:
         * (throwable == null) : true
         */
        //Arrange Statement(s)
        //Throwable throwable = null;
        //Writer writer = Writer.nullWriter();
        //PrintWriter printWriter = new PrintWriter(writer);
        //Act Statement(s)
        //ExceptionUtils.printRootCauseStackTrace(throwable, printWriter);
    }

    //Sapient generated method id: ${printRootCauseStackTrace2WhenThrowableIsNotNull}, hash: 523FDAD110D98F57A745971B9DC52E1A
    @Test()
    void printRootCauseStackTrace2WhenThrowableIsNotNull() {
        /* Branches:
         * (throwable == null) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ExceptionUtils> exceptionUtils = mockStatic(ExceptionUtils.class, CALLS_REAL_METHODS)) {
    List<String> stringList = new ArrayList<>(Arrays.asList("A"));
    Throwable throwable = new Throwable();
    exceptionUtils.when(() -> ExceptionUtils.getRootCauseStackTraceList(throwable)).thenReturn(stringList);
    Writer writer = Writer.nullWriter();
    PrintWriter printWriter = new PrintWriter(writer);
    //Act Statement(s)
    ExceptionUtils.printRootCauseStackTrace(throwable, printWriter);
    //Assert statement(s)
    assertAll("result", () -> exceptionUtils.verify(() -> ExceptionUtils.getRootCauseStackTraceList(throwable), atLeast(1)));
}*/
    }

    //Sapient generated method id: ${removeCommonFramesWhenCauseFrameEqualsWrapperFrame}, hash: 1DD61619779016B42622304A994307DE
    @Test()
    void removeCommonFramesWhenCauseFrameEqualsWrapperFrame() {
        /* Branches:
         * (causeFrameIndex >= 0) : true
         * (wrapperFrameIndex >= 0) : true
         * (causeFrame.equals(wrapperFrame)) : true
         */
         //Arrange Statement(s)
        List<String> stringList = new ArrayList<>(Arrays.asList("causeFramesItem1", ""));
        List<String> stringList2 = new ArrayList<>(Arrays.asList(""));
        
        //Act Statement(s)
        ExceptionUtils.removeCommonFrames(stringList, stringList2);
        List<String> stringStringListList = new ArrayList<>(Arrays.asList("causeFramesItem1"));
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(stringList.size(), equalTo(1));
            assertThat(stringList, containsInRelativeOrder(stringStringListList.toArray()));
        });
    }

    //Sapient generated method id: ${rethrowThrowsThrowable}, hash: 57000AED8B3B5CDD173B965244AE9C67
    @Test()
    void rethrowThrowsThrowable() {
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        //Act Statement(s)
        final Throwable result = assertThrows(Throwable.class, () -> {
            ExceptionUtils.rethrow(throwable);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(throwable)));
    }

    //Sapient generated method id: ${streamTest}, hash: A333016507798FFB2EE7843944F577CD
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
                assertThat(result, is(notNullValue()));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowableList(throwable), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${throwableOfThrowableWhenTypeIsNull}, hash: E27A103BC9C66811FE1E65907A96112D
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

    //Sapient generated method id: ${throwableOfThrowableWhenFromIndexGreaterThanOrEqualsToThrowablesLength}, hash: 2F18E3F6909621EA10A8AD7DB2AE8329
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
            Throwable[] throwableArray = new Throwable[] {};
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

    //Sapient generated method id: ${throwableOfThrowableWhenTypeEqualsIIndexOfThrowablesGetClass}, hash: 0386CFBE0ABC7EEC2F1166EFA1B7AE60
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
            Throwable[] throwableArray = new Throwable[] { throwable };
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            Throwable result = ExceptionUtils.throwableOfThrowable(throwable2, Throwable.class);
            //Assert statement(s)
            //TODO: Please implement equals method in Throwable for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${throwableOfThrowableWhenTypeNotEqualsIIndexOfThrowablesGetClass}, hash: 238A67CFE7953AADF247455D2F108507
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
            Throwable[] throwableArray = new Throwable[] { throwable };
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

    //Sapient generated method id: ${throwableOfThrowable1WhenTypeIsNull}, hash: 9B010F19735A64D5B8F36CC38446DC99
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

    //Sapient generated method id: ${throwableOfThrowable1WhenFromIndexGreaterThanOrEqualsToThrowablesLength}, hash: 69F8824EB2001C09A444A5F32E315395
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
            Throwable[] throwableArray = new Throwable[] {};
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

    //Sapient generated method id: ${throwableOfThrowable1WhenTypeEqualsIIndexOfThrowablesGetClass}, hash: 2F1FAF0E7322AAC38E22FAD89976B9C3
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
            Throwable[] throwableArray = new Throwable[] { throwable };
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            Throwable result = ExceptionUtils.throwableOfThrowable(throwable2, Throwable.class, -1);
            //Assert statement(s)
            //TODO: Please implement equals method in Throwable for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${throwableOfThrowable1WhenTypeNotEqualsIIndexOfThrowablesGetClass}, hash: 538828ABB0EFEA8390AEBDEC55410542
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
            Throwable[] throwableArray = new Throwable[] { throwable };
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

    //Sapient generated method id: ${throwableOfTypeWhenTypeIsNull}, hash: A3F8BAFA948F5C1CF95BA11AD3D0FF0C
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

    //Sapient generated method id: ${throwableOfTypeWhenFromIndexGreaterThanOrEqualsToThrowablesLength}, hash: 399D856E356B5828E9348906E6B61F6F
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
            Throwable[] throwableArray = new Throwable[] {};
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

    //Sapient generated method id: ${throwableOfTypeWhenTypeIsAssignableFromIIndexOfThrowablesGetClass}, hash: 8C2B241B7181E5F4397F9926EF834F43
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
            Throwable[] throwableArray = new Throwable[] { throwable };
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            Throwable result = ExceptionUtils.throwableOfType(throwable2, Throwable.class);
            //Assert statement(s)
            //TODO: Please implement equals method in Throwable for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${throwableOfTypeWhenTypeNotIsAssignableFromIIndexOfThrowablesGetClass}, hash: 105E13D12B544B1E55D2C50869032B55
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
            Throwable[] throwableArray = new Throwable[] { throwable };
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

    //Sapient generated method id: ${throwableOfType1WhenTypeIsNull}, hash: 9554258196E1061C03A539A6FE54BCE1
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

    //Sapient generated method id: ${throwableOfType1WhenFromIndexGreaterThanOrEqualsToThrowablesLength}, hash: C14E20E34A8DD8302D218BFF026EEFE8
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
            Throwable[] throwableArray = new Throwable[] {};
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

    //Sapient generated method id: ${throwableOfType1WhenTypeIsAssignableFromIIndexOfThrowablesGetClass}, hash: 995C6E3A482FE00B0F68AA1E3781B9FA
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
            Throwable[] throwableArray = new Throwable[] { throwable };
            Throwable throwable2 = new Throwable();
            exceptionUtils.when(() -> ExceptionUtils.getThrowables(throwable2)).thenReturn(throwableArray);
            //Act Statement(s)
            Throwable result = ExceptionUtils.throwableOfType(throwable2, Throwable.class, -1);
            //Assert statement(s)
            //TODO: Please implement equals method in Throwable for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                exceptionUtils.verify(() -> ExceptionUtils.getThrowables(throwable2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${throwableOfType1WhenTypeNotIsAssignableFromIIndexOfThrowablesGetClass}, hash: A5B88E49A3EE5B12EE96FE38A75DD106
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
            Throwable[] throwableArray = new Throwable[] { throwable };
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

    //Sapient generated method id: ${throwUncheckedWhenThrowableInstanceOfRuntimeExceptionThrowsRuntimeException}, hash: BF605151418FD620C6F4202EC2E192BD
    @Test()
    void throwUncheckedWhenThrowableInstanceOfRuntimeExceptionThrowsRuntimeException() {
        /* Branches:
         * (throwable instanceof RuntimeException) : true
         */
         //Arrange Statement(s)
        RuntimeException runtimeException = new RuntimeException();
        //Act Statement(s)
        final RuntimeException result = assertThrows(RuntimeException.class, () -> {
            ExceptionUtils.throwUnchecked((Object) runtimeException);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(runtimeException)));
    }

    //Sapient generated method id: ${throwUncheckedWhenThrowableInstanceOfErrorThrowsError}, hash: 2B2BDFD768D8989B6CFB1E6718D890CA
    @Test()
    void throwUncheckedWhenThrowableInstanceOfErrorThrowsError() {
        /* Branches:
         * (throwable instanceof RuntimeException) : false
         * (throwable instanceof Error) : true
         */
         //Arrange Statement(s)
        Error error = new Error();
        //Act Statement(s)
        final Error result = assertThrows(Error.class, () -> {
            ExceptionUtils.throwUnchecked((Object) error);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(error)));
    }

    //Sapient generated method id: ${throwUncheckedWhenThrowableNotInstanceOfError}, hash: 6249435DECB836DE9F2656F98B25E30D
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

    //Sapient generated method id: ${throwUnchecked1WhenIsUncheckedThrowableThrowsRuntimeException}, hash: AB62E0412FE9FF2A9EC81669E86FFE94
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

    //Sapient generated method id: ${throwUnchecked1WhenIsUncheckedNotThrowable}, hash: 7C6EECA6D0309CEB2FBDBB0F4598AD8C
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

    //Sapient generated method id: ${wrapAndThrowThrowsUndeclaredThrowableException}, hash: 66BC2051DD1544AE80F9DE88ABF4CD7F
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