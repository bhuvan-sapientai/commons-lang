package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.lang3.exception.UncheckedException;
import java.lang.annotation.Annotation;
import org.mockito.MockedStatic;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AnnotationUtilsSapientGeneratedTest {

    private final Annotation annotationMock = mock(Annotation.class);

    private final Annotation annotationMock2 = mock(Annotation.class);

    //Sapient generated method id: ${equalsWhenA1EqualsA2}, hash: F7FF860EE539F867F4E1CF82A3411DE2
    @Test()
    void equalsWhenA1EqualsA2() {
        /* Branches:
         * (a1 == a2) : true
         */
         
        //Act Statement(s)
        boolean result = AnnotationUtils.equals(annotationMock, annotationMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${equalsWhenA2IsNull}, hash: 3986FC00C9536E5230B399CF645A9826
    @Test()
    void equalsWhenA2IsNull() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : true
         */
         //Arrange Statement(s)
        Annotation annotation = null;
        
        //Act Statement(s)
        boolean result = AnnotationUtils.equals(annotationMock, annotation);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${equalsWhenType1NotEqualsType2}, hash: 6AEA72334CD9AB44985C633A4C07507F
    @Test()
    void equalsWhenType1NotEqualsType2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${equalsWhenMemberEqualsMGetReturnTypeV1V2}, hash: 17D93E7BA1C4195BCFAA8112BE8BCB44
    @Test()
    void equalsWhenMemberEqualsMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : true  #  inside memberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenMemberEqualsMGetReturnTypeV1V2AndCaughtReflectiveOperationException}, hash: 16D0E6BBB97EB41D197B3A638FF2CFD8
    @Test()
    void equalsWhenMemberEqualsMGetReturnTypeV1V2AndCaughtReflectiveOperationException() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : true  #  inside memberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : false
         * (catch-exception (ReflectiveOperationException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenO2IsNullAndMemberEqualsNotMGetReturnTypeV1V2}, hash: 7BCE394CFB4308A0ACB6E6942C0F553B
    @Test()
    void equalsWhenO2IsNullAndMemberEqualsNotMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : true  #  inside memberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenTypeIsAnnotationAndMemberEqualsNotMGetReturnTypeV1V2}, hash: 192326824A02C2F31C879BF367CB996F
    @Test()
    void equalsWhenTypeIsAnnotationAndMemberEqualsNotMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : false  #  inside memberEquals method
         * (type.isAnnotation()) : true  #  inside memberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenA1LengthNotEqualsA2LengthAndMemberEqualsNotMGetReturnTypeV1V2}, hash: D87B5DE4789E59C57D36CF96A9F7DC76
    @Test()
    void equalsWhenA1LengthNotEqualsA2LengthAndMemberEqualsNotMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : true  #  inside arrayMemberEquals method
         * (a1.length != a2.length) : true  #  inside annotationArrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenO1EqualsO2AndMemberEqualsMGetReturnTypeV1V2}, hash: E3A58EDFC59DC25FFA35B1E5B021ABAA
    @Test()
    void equalsWhenO1EqualsO2AndMemberEqualsMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : false  #  inside memberEquals method
         * (type.isAnnotation()) : false  #  inside memberEquals method
         * (o1.equals(o2)) : true  #  inside memberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenO1NotEqualsO2AndMemberEqualsNotMGetReturnTypeV1V2}, hash: EA94D054E4BD6B4F46302E3C44EEB66E
    @Test()
    void equalsWhenO1NotEqualsO2AndMemberEqualsNotMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : false  #  inside memberEquals method
         * (type.isAnnotation()) : false  #  inside memberEquals method
         * (o1.equals(o2)) : false  #  inside memberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2}, hash: 7B9DDC08B3D06334AF3464ACA99F59B6
    @Test()
    void equalsWhenArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Byte.TYPE)) : true  #  inside arrayMemberEquals method
         * (Arrays.equals((byte[]) o1, (byte[]) o2)) : true  #  inside arrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2}, hash: 5BC2F64C512F13DC1884E3F98DB4536F
    @Test()
    void equalsWhenArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Byte.TYPE)) : true  #  inside arrayMemberEquals method
         * (Arrays.equals((byte[]) o1, (byte[]) o2)) : false  #  inside arrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(false);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenEqualsNotIIndexOfA1IIndexOfA2AndMemberEqualsNotMGetReturnTypeV1V2}, hash: E113C6D32B3CCF06DD57B88F099300B9
    @Test()
    void equalsWhenEqualsNotIIndexOfA1IIndexOfA2AndMemberEqualsNotMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : true  #  inside arrayMemberEquals method
         * (a1.length != a2.length) : false  #  inside annotationArrayMemberEquals method
         * (i < a1.length) : true  #  inside annotationArrayMemberEquals method
         * (!equals(a1[i], a2[i])) : true  #  inside annotationArrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenEqualsIIndexOfA1IIndexOfA2AndMemberEqualsMGetReturnTypeV1V2}, hash: C8C611BF6ACE0B349DCC25E723BE6AD8
    @Test()
    void equalsWhenEqualsIIndexOfA1IIndexOfA2AndMemberEqualsMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : true  #  inside arrayMemberEquals method
         * (a1.length != a2.length) : false  #  inside annotationArrayMemberEquals method
         * (i < a1.length) : true  #  inside annotationArrayMemberEquals method
         * (!equals(a1[i], a2[i])) : false  #  inside annotationArrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenComponentTypeEqualsShortTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2}, hash: EE37FE6F14F0CBECD7338C9031485DB2
    @Test()
    void equalsWhenComponentTypeEqualsShortTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Short.TYPE)) : true  #  inside arrayMemberEquals method
         * (Arrays.equals((short[]) o1, (short[]) o2)) : true  #  inside arrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenComponentTypeEqualsShortTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2}, hash: A62477A81E84945039D15F1BE127296D
    @Test()
    void equalsWhenComponentTypeEqualsShortTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Short.TYPE)) : true  #  inside arrayMemberEquals method
         * (Arrays.equals((short[]) o1, (short[]) o2)) : false  #  inside arrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(false);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenComponentTypeEqualsIntegerTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2}, hash: EEF359A279B7A3A0E1DC1F7B780616D3
    @Test()
    void equalsWhenComponentTypeEqualsIntegerTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Integer.TYPE)) : true  #  inside arrayMemberEquals method
         * (Arrays.equals((int[]) o1, (int[]) o2)) : true  #  inside arrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenComponentTypeEqualsIntegerTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2}, hash: 5E5D5CD81D5C2CFDCAB3244C8ED292EC
    @Test()
    void equalsWhenComponentTypeEqualsIntegerTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Integer.TYPE)) : true  #  inside arrayMemberEquals method
         * (Arrays.equals((int[]) o1, (int[]) o2)) : false  #  inside arrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(false);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenComponentTypeEqualsCharacterTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2}, hash: 2505954EA7D4CF50FA90E86F04E461EB
    @Test()
    void equalsWhenComponentTypeEqualsCharacterTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Character.TYPE)) : true  #  inside arrayMemberEquals method
         * (Arrays.equals((char[]) o1, (char[]) o2)) : true  #  inside arrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenComponentTypeEqualsCharacterTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2}, hash: 27032F0B2E73F11A05A9AA74DC26B82F
    @Test()
    void equalsWhenComponentTypeEqualsCharacterTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Character.TYPE)) : true  #  inside arrayMemberEquals method
         * (Arrays.equals((char[]) o1, (char[]) o2)) : false  #  inside arrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(false);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenComponentTypeEqualsLongTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2}, hash: 1F5CEC87C1BE420B27C0587B38D13BE1
    @Test()
    void equalsWhenComponentTypeEqualsLongTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Character.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Long.TYPE)) : true  #  inside arrayMemberEquals method
         * (Arrays.equals((long[]) o1, (long[]) o2)) : true  #  inside arrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenComponentTypeEqualsLongTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2}, hash: FE69969AED81DAE0EC7F118DC1D350B9
    @Test()
    void equalsWhenComponentTypeEqualsLongTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Character.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Long.TYPE)) : true  #  inside arrayMemberEquals method
         * (Arrays.equals((long[]) o1, (long[]) o2)) : false  #  inside arrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(false);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenComponentTypeEqualsFloatTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2}, hash: 818ECA535483DD1957916639CD4003A3
    @Test()
    void equalsWhenComponentTypeEqualsFloatTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Character.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Long.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Float.TYPE)) : true  #  inside arrayMemberEquals method
         * (Arrays.equals((float[]) o1, (float[]) o2)) : true  #  inside arrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenComponentTypeEqualsFloatTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2}, hash: CBA9DE36ED7A3F37B7DBCFDC96A6B260
    @Test()
    void equalsWhenComponentTypeEqualsFloatTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Character.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Long.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Float.TYPE)) : true  #  inside arrayMemberEquals method
         * (Arrays.equals((float[]) o1, (float[]) o2)) : false  #  inside arrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(false);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenComponentTypeEqualsDoubleTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2}, hash: 9D9436ACA9B12CD4372AD888521592EF
    @Test()
    void equalsWhenComponentTypeEqualsDoubleTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Character.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Long.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Float.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Double.TYPE)) : true  #  inside arrayMemberEquals method
         * (Arrays.equals((double[]) o1, (double[]) o2)) : true  #  inside arrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenComponentTypeEqualsDoubleTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2}, hash: 9F1399E9724BE0C211273D269ECAFE8C
    @Test()
    void equalsWhenComponentTypeEqualsDoubleTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Character.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Long.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Float.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Double.TYPE)) : true  #  inside arrayMemberEquals method
         * (Arrays.equals((double[]) o1, (double[]) o2)) : false  #  inside arrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(false);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenComponentTypeEqualsBooleanTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2}, hash: 4DDF09BD4B4EC0A9E9C1D8E4490B65F7
    @Test()
    void equalsWhenComponentTypeEqualsBooleanTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Character.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Long.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Float.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Double.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Boolean.TYPE)) : true  #  inside arrayMemberEquals method
         * (Arrays.equals((boolean[]) o1, (boolean[]) o2)) : true  #  inside arrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenComponentTypeEqualsBooleanTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2}, hash: EADD57D6E8C381AF19D40030D9C4D606
    @Test()
    void equalsWhenComponentTypeEqualsBooleanTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Character.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Long.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Float.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Double.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Boolean.TYPE)) : true  #  inside arrayMemberEquals method
         * (Arrays.equals((boolean[]) o1, (boolean[]) o2)) : false  #  inside arrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(false);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenComponentTypeNotEqualsBooleanTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2}, hash: A1EC8E30648C27F2EF17B7E28087C127
    @Test()
    void equalsWhenComponentTypeNotEqualsBooleanTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Character.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Long.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Float.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Double.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Boolean.TYPE)) : false  #  inside arrayMemberEquals method
         * (Arrays.equals((Object[]) o1, (Object[]) o2)) : true  #  inside arrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equalsWhenComponentTypeNotEqualsBooleanTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2}, hash: C1D8EF63BB31CC0A1CC53D80A68A1747
    @Test()
    void equalsWhenComponentTypeNotEqualsBooleanTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2() {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : false
         * (for-each(type1.getDeclaredMethods())) : true
         * (m.getParameterTypes().length == 0) : true
         * (isValidAnnotationMemberType(m.getReturnType())) : true
         * (o1 == o2) : false  #  inside memberEquals method
         * (o1 == null) : false  #  inside memberEquals method
         * (o2 == null) : false  #  inside memberEquals method
         * (type.isArray()) : true  #  inside memberEquals method
         * (componentType.isAnnotation()) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Character.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Long.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Float.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Double.TYPE)) : false  #  inside arrayMemberEquals method
         * (componentType.equals(Boolean.TYPE)) : false  #  inside arrayMemberEquals method
         * (Arrays.equals((Object[]) o1, (Object[]) o2)) : false  #  inside arrayMemberEquals method
         * (!memberEquals(m.getReturnType(), v1, v2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<AnnotationUtils> annotationUtils = mockStatic(AnnotationUtils.class, CALLS_REAL_METHODS)) {
            annotationUtils.when(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class)).thenReturn(true);
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotationMock, annotationMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${hashCodeWhenValueIsNullThrowsIllegalStateException}, hash: 6B133FD7D3471F3531DEA1AB7EB4B661
    @Test()
    void hashCodeWhenValueIsNullThrowsIllegalStateException() {
        /* Branches:
         * (for-each(type.getDeclaredMethods())) : true
         * (value == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Annotation method null returned null");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            AnnotationUtils.hashCode(annotationMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${hashCodeWhenCaughtReflectiveOperationException}, hash: C805D78748757D50A424F9671457133C
    @Test()
    void hashCodeWhenCaughtReflectiveOperationException() {
        /* Branches:
         * (for-each(type.getDeclaredMethods())) : false
         * (catch-exception (ReflectiveOperationException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotationMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${hashCodeWhenComponentTypeEqualsByteTYPE}, hash: 7F888C9DAAF34E12C1C77A7B80065CA6
    @Test()
    void hashCodeWhenComponentTypeEqualsByteTYPE() {
        /* Branches:
         * (for-each(type.getDeclaredMethods())) : true
         * (value == null) : false
         * (ObjectUtils.isArray(value)) : true  #  inside hashMember method
         * (componentType.equals(Byte.TYPE)) : true  #  inside arrayMemberHash method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotationMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${hashCodeWhenValueNotInstanceOfAnnotation}, hash: CC8B36C0590A892336BE35779674A926
    @Test()
    void hashCodeWhenValueNotInstanceOfAnnotation() {
        /* Branches:
         * (for-each(type.getDeclaredMethods())) : true
         * (value == null) : false
         * (ObjectUtils.isArray(value)) : false  #  inside hashMember method
         * (value instanceof Annotation) : false  #  inside hashMember method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotationMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${hashCodeWhenComponentTypeEqualsShortTYPE}, hash: 5F82C882B60C5F1988FFDDC4C0525ECF
    @Test()
    void hashCodeWhenComponentTypeEqualsShortTYPE() {
        /* Branches:
         * (for-each(type.getDeclaredMethods())) : true
         * (value == null) : false
         * (ObjectUtils.isArray(value)) : true  #  inside hashMember method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Short.TYPE)) : true  #  inside arrayMemberHash method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotationMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${hashCodeWhenComponentTypeEqualsIntegerTYPE}, hash: 74B859A9D113218D37F344E2D8E623FA
    @Test()
    void hashCodeWhenComponentTypeEqualsIntegerTYPE() {
        /* Branches:
         * (for-each(type.getDeclaredMethods())) : true
         * (value == null) : false
         * (ObjectUtils.isArray(value)) : true  #  inside hashMember method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Integer.TYPE)) : true  #  inside arrayMemberHash method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotationMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${hashCodeWhenComponentTypeEqualsCharacterTYPE}, hash: B094D1F8D59720E9A367C84858081177
    @Test()
    void hashCodeWhenComponentTypeEqualsCharacterTYPE() {
        /* Branches:
         * (for-each(type.getDeclaredMethods())) : true
         * (value == null) : false
         * (ObjectUtils.isArray(value)) : true  #  inside hashMember method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Character.TYPE)) : true  #  inside arrayMemberHash method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotationMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${hashCodeWhenComponentTypeEqualsLongTYPE}, hash: 4C2426751F22D3983D5E431701111F43
    @Test()
    void hashCodeWhenComponentTypeEqualsLongTYPE() {
        /* Branches:
         * (for-each(type.getDeclaredMethods())) : true
         * (value == null) : false
         * (ObjectUtils.isArray(value)) : true  #  inside hashMember method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Character.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Long.TYPE)) : true  #  inside arrayMemberHash method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotationMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${hashCodeWhenComponentTypeEqualsFloatTYPE}, hash: BEB158280E3EE48BA1CF88BC55BA6A25
    @Test()
    void hashCodeWhenComponentTypeEqualsFloatTYPE() {
        /* Branches:
         * (for-each(type.getDeclaredMethods())) : true
         * (value == null) : false
         * (ObjectUtils.isArray(value)) : true  #  inside hashMember method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Character.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Long.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Float.TYPE)) : true  #  inside arrayMemberHash method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotationMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${hashCodeWhenComponentTypeEqualsDoubleTYPE}, hash: 2AEE140561F92B2265D2E6655A6CCF7F
    @Test()
    void hashCodeWhenComponentTypeEqualsDoubleTYPE() {
        /* Branches:
         * (for-each(type.getDeclaredMethods())) : true
         * (value == null) : false
         * (ObjectUtils.isArray(value)) : true  #  inside hashMember method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Character.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Long.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Float.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Double.TYPE)) : true  #  inside arrayMemberHash method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotationMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${hashCodeWhenComponentTypeEqualsBooleanTYPE}, hash: 14783F73169F4F543F99F99C8CFAD01F
    @Test()
    void hashCodeWhenComponentTypeEqualsBooleanTYPE() {
        /* Branches:
         * (for-each(type.getDeclaredMethods())) : true
         * (value == null) : false
         * (ObjectUtils.isArray(value)) : true  #  inside hashMember method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Character.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Long.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Float.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Double.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Boolean.TYPE)) : true  #  inside arrayMemberHash method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotationMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${hashCodeWhenComponentTypeNotEqualsBooleanTYPE}, hash: EBC4487C5C6E60BD93B8EDB537C54859
    @Test()
    void hashCodeWhenComponentTypeNotEqualsBooleanTYPE() {
        /* Branches:
         * (for-each(type.getDeclaredMethods())) : true
         * (value == null) : false
         * (ObjectUtils.isArray(value)) : true  #  inside hashMember method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Character.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Long.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Float.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Double.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Boolean.TYPE)) : false  #  inside arrayMemberHash method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotationMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${hashCodeWhenCaughtReflectiveOperationExceptionThrowsUncheckedException}, hash: 44DE8E2D69711795B061A41903E571FC
    @Test()
    void hashCodeWhenCaughtReflectiveOperationExceptionThrowsUncheckedException() {
        /* Branches:
         * (for-each(type.getDeclaredMethods())) : true
         * (value == null) : false
         * (ObjectUtils.isArray(value)) : true  #  inside hashMember method
         * (componentType.equals(Byte.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Short.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Integer.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Character.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Long.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Float.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Double.TYPE)) : false  #  inside arrayMemberHash method
         * (componentType.equals(Boolean.TYPE)) : false  #  inside arrayMemberHash method
         * (catch-exception (ReflectiveOperationException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        ReflectiveOperationException reflectiveOperationException = new ReflectiveOperationException();
        //Act Statement(s)
        final UncheckedException result = assertThrows(UncheckedException.class, () -> {
            AnnotationUtils.hashCode(annotationMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), is(instanceOf(reflectiveOperationException.getClass())));
        });
    }

    //Sapient generated method id: ${isValidAnnotationMemberTypeWhenTypeIsNull}, hash: 77FC9930253F4AC65383E1E3CD322118
    @Test()
    void isValidAnnotationMemberTypeWhenTypeIsNull() {
        /* Branches:
         * (type == null) : true
         */
         //Arrange Statement(s)
        Class<?> _class = null;
        
        //Act Statement(s)
        boolean result = AnnotationUtils.isValidAnnotationMemberType(_class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isValidAnnotationMemberTypeWhenClassEqualsType}, hash: D8333D0DCF4E7938E4F538BBCAA1B8BC
    @Test()
    void isValidAnnotationMemberTypeWhenClassEqualsType() {
        /* Branches:
         * (type == null) : false
         * (type.isArray()) : true
         * (type.isPrimitive()) : false
         * (type.isEnum()) : false
         * (type.isAnnotation()) : false
         * (String.class.equals(type)) : false
         * (Class.class.equals(type)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = AnnotationUtils.isValidAnnotationMemberType(Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isValidAnnotationMemberTypeWhenClassNotEqualsType}, hash: 0780001C935834DA9A7636EEBFCD4F30
    @Test()
    void isValidAnnotationMemberTypeWhenClassNotEqualsType() {
        /* Branches:
         * (type == null) : false
         * (type.isArray()) : true
         * (type.isPrimitive()) : false
         * (type.isEnum()) : false
         * (type.isAnnotation()) : false
         * (String.class.equals(type)) : false
         * (Class.class.equals(type)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = AnnotationUtils.isValidAnnotationMemberType(Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${toStringWhenMGetParameterTypesLengthGreaterThan0}, hash: 20207AC3E7A238DF25673D88C7BE29D6
    @Test()
    void toStringWhenMGetParameterTypesLengthGreaterThan0() {
        /* Branches:
         * (for-each(a.annotationType().getDeclaredMethods())) : true
         * (m.getParameterTypes().length > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = AnnotationUtils.toString(annotationMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${toStringWhenMGetParameterTypesLengthNotGreaterThan0}, hash: F5C70D8D39026EB5EBEFEB87658BDE9C
    @Test()
    void toStringWhenMGetParameterTypesLengthNotGreaterThan0() {
        /* Branches:
         * (for-each(a.annotationType().getDeclaredMethods())) : true
         * (m.getParameterTypes().length > 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = AnnotationUtils.toString(annotationMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${toStringWhenMGetParameterTypesLengthGreaterThan0AndCaughtReflectiveOperationException}, hash: 3C0F4CABE4F2D7D2F5BD96E3A16ABE23
    @Test()
    void toStringWhenMGetParameterTypesLengthGreaterThan0AndCaughtReflectiveOperationException() {
        /* Branches:
         * (for-each(a.annotationType().getDeclaredMethods())) : true
         * (m.getParameterTypes().length > 0) : true
         * (catch-exception (ReflectiveOperationException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = AnnotationUtils.toString(annotationMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${toStringWhenCaughtReflectiveOperationExceptionThrowsUncheckedException}, hash: B148E59F1824FE1CD2A2AE0DC26F3773
    @Test()
    void toStringWhenCaughtReflectiveOperationExceptionThrowsUncheckedException() {
        /* Branches:
         * (for-each(a.annotationType().getDeclaredMethods())) : true
         * (m.getParameterTypes().length > 0) : false
         * (catch-exception (ReflectiveOperationException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        ReflectiveOperationException reflectiveOperationException = new ReflectiveOperationException();
        //Act Statement(s)
        final UncheckedException result = assertThrows(UncheckedException.class, () -> {
            AnnotationUtils.toString(annotationMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), is(instanceOf(reflectiveOperationException.getClass())));
        });
    }
}
