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
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AnnotationUtilsSapientGeneratedTest {

    //Sapient generated method id: ${d4da03a5-fabc-327b-88dc-841a4c1f973a}
    @Test()
    void equalsWhenA1EqualsA2() throws ReflectiveOperationException {
        /* Branches:
         * (a1 == a2) : true
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        //TODO: Needs initialization with real value
        Annotation annotation2 = null;
        //Act Statement(s)
        boolean result = AnnotationUtils.equals(annotation, annotation2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${393ec62c-066a-3466-9556-e08e6a10c0f2}
    @Disabled()
    @Test()
    void equalsWhenA2IsNull() throws ReflectiveOperationException {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : true
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        Annotation annotation2 = null;
        //Act Statement(s)
        boolean result = AnnotationUtils.equals(annotation, annotation2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${8fcb5cd6-f778-3a5a-bcc2-7a5e447e1dd0}
    @Disabled()
    @Test()
    void equalsWhenType1NotEqualsType2() throws ReflectiveOperationException {
        /* Branches:
         * (a1 == a2) : false
         * (a1 == null) : false
         * (a2 == null) : false
         * (!type1.equals(type2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        //TODO: Needs initialization with real value
        Annotation annotation2 = null;
        //Act Statement(s)
        boolean result = AnnotationUtils.equals(annotation, annotation2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${fdf21317-0dd3-331b-abb7-0f7d37a193c9}
    @Disabled()
    @Test()
    void equalsWhenMemberEqualsMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${05dc0751-b7a7-3bd8-b7bb-d53476ea9e53}
    @Disabled()
    @Test()
    void equalsWhenMemberEqualsMGetReturnTypeV1V2AndCaughtReflectiveOperationException() throws SecurityException, IllegalArgumentException, ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f7125332-b3a0-37b8-bd4e-3ced78a15617}
    @Disabled()
    @Test()
    void equalsWhenO2IsNullAndMemberEqualsNotMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d2ec4574-7ad0-3c93-8796-52b077be5f1f}
    @Disabled()
    @Test()
    void equalsWhenTypeIsAnnotationAndMemberEqualsNotMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a3ef869c-2ed5-337b-8076-cc0570fd852e}
    @Disabled()
    @Test()
    void equalsWhenA1LengthNotEqualsA2LengthAndMemberEqualsNotMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8bcf1450-6c7d-33cd-9919-331244914288}
    @Disabled()
    @Test()
    void equalsWhenO1EqualsO2AndMemberEqualsMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${97f04c30-9089-3486-a251-3ca164a69f20}
    @Disabled()
    @Test()
    void equalsWhenO1NotEqualsO2AndMemberEqualsNotMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8a0e2682-7dfd-3d41-9ce1-854ce9f27406}
    @Disabled()
    @Test()
    void equalsWhenArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${08742782-ad3d-35b0-a191-df2df51500a5}
    @Disabled()
    @Test()
    void equalsWhenArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${e94ccf4d-e090-3664-bbc5-6b772d554659}
    @Disabled()
    @Test()
    void equalsWhenEqualsNotIIndexOfA1IIndexOfA2AndMemberEqualsNotMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${563e4079-5a61-3812-a056-01e464b7e8e7}
    @Disabled()
    @Test()
    void equalsWhenEqualsIIndexOfA1IIndexOfA2AndMemberEqualsMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7b01a969-03f9-387b-ba2e-def33a627155}
    @Disabled()
    @Test()
    void equalsWhenComponentTypeEqualsShortTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${351a8b63-5907-3742-8202-38aaa507447a}
    @Disabled()
    @Test()
    void equalsWhenComponentTypeEqualsShortTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9ac81d71-8219-3809-89f6-6e6b5afc3a01}
    @Disabled()
    @Test()
    void equalsWhenComponentTypeEqualsIntegerTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${246290d8-93fa-3382-9ee6-4a07ddef4925}
    @Disabled()
    @Test()
    void equalsWhenComponentTypeEqualsIntegerTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${e2d68bdf-d1c8-3665-957c-29b23eaf7fb3}
    @Disabled()
    @Test()
    void equalsWhenComponentTypeEqualsCharacterTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${dacac754-89c0-311e-ab7e-3dff96acc980}
    @Disabled()
    @Test()
    void equalsWhenComponentTypeEqualsCharacterTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2bb7fbed-1341-3f1f-88b5-16bc55fb4f5a}
    @Disabled()
    @Test()
    void equalsWhenComponentTypeEqualsLongTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cc74d1dc-92d0-3b0a-aa3d-33b7f08a8955}
    @Disabled()
    @Test()
    void equalsWhenComponentTypeEqualsLongTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${956c2b06-b995-316b-8dda-0c75b7c91b78}
    @Disabled()
    @Test()
    void equalsWhenComponentTypeEqualsFloatTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1764c969-0470-390d-a474-c91d0b2a048d}
    @Disabled()
    @Test()
    void equalsWhenComponentTypeEqualsFloatTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${23ccb048-27aa-3624-ac6e-5ea7e3e9fe80}
    @Disabled()
    @Test()
    void equalsWhenComponentTypeEqualsDoubleTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${72b7b9dd-5e62-3033-b8bf-6d19be31ef1a}
    @Disabled()
    @Test()
    void equalsWhenComponentTypeEqualsDoubleTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4f6ed194-ce4e-3116-92f1-d8b4897ccc75}
    @Disabled()
    @Test()
    void equalsWhenComponentTypeEqualsBooleanTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2ebcd19e-7f45-353d-a746-e0b34a790d19}
    @Disabled()
    @Test()
    void equalsWhenComponentTypeEqualsBooleanTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f1f24648-6ec9-324a-aaa5-deaeeb4b183e}
    @Disabled()
    @Test()
    void equalsWhenComponentTypeNotEqualsBooleanTYPEAndArraysEqualsO1O2AndMemberEqualsMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5b97a1af-74a3-336b-a229-2bd08c07ef74}
    @Disabled()
    @Test()
    void equalsWhenComponentTypeNotEqualsBooleanTYPEAndArraysNotEqualsO1O2AndMemberEqualsNotMGetReturnTypeV1V2() throws ReflectiveOperationException {
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
            //TODO: Needs initialization with real value
            Annotation annotation = null;
            //TODO: Needs initialization with real value
            Annotation annotation2 = null;
            //Act Statement(s)
            boolean result = AnnotationUtils.equals(annotation, annotation2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                annotationUtils.verify(() -> AnnotationUtils.isValidAnnotationMemberType(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${582cb030-7897-322d-adbe-f4fbdce0d8f2}
    @Disabled()
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
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        IllegalStateException illegalStateException = new IllegalStateException("Annotation method null returned null");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            AnnotationUtils.hashCode(annotation);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${8678f7c2-4988-38e1-9787-416aae2c7be2}
    @Disabled()
    @Test()
    void hashCodeWhenCaughtReflectiveOperationException() throws SecurityException, ReflectiveOperationException {
        /* Branches:
         * (for-each(type.getDeclaredMethods())) : false
         * (catch-exception (ReflectiveOperationException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotation);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${79f5d0f0-b655-3a81-988c-f380b3649d42}
    @Disabled()
    @Test()
    void hashCodeWhenComponentTypeEqualsByteTYPE() throws ReflectiveOperationException {
        /* Branches:
         * (for-each(type.getDeclaredMethods())) : true
         * (value == null) : false
         * (ObjectUtils.isArray(value)) : true  #  inside hashMember method
         * (componentType.equals(Byte.TYPE)) : true  #  inside arrayMemberHash method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotation);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${0cf532af-0fbb-3637-9bf9-235a34c9af60}
    @Disabled()
    @Test()
    void hashCodeWhenValueInstanceOfAnnotation() throws ReflectiveOperationException {
        /* Branches:
         * (for-each(type.getDeclaredMethods())) : true
         * (value == null) : false
         * (ObjectUtils.isArray(value)) : false  #  inside hashMember method
         * (value instanceof Annotation) : true  #  inside hashMember method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotation);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${c0fe7539-eb01-309b-9bc7-5acd16a08dff}
    @Disabled()
    @Test()
    void hashCodeWhenValueNotInstanceOfAnnotation() throws ReflectiveOperationException {
        /* Branches:
         * (for-each(type.getDeclaredMethods())) : true
         * (value == null) : false
         * (ObjectUtils.isArray(value)) : false  #  inside hashMember method
         * (value instanceof Annotation) : false  #  inside hashMember method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotation);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${64bd6014-90e9-362f-8041-b6b2dcd3dc21}
    @Disabled()
    @Test()
    void hashCodeWhenComponentTypeEqualsShortTYPE() throws ReflectiveOperationException {
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
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotation);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${15cd35ad-929d-3daf-a873-3c1e8f2b5295}
    @Disabled()
    @Test()
    void hashCodeWhenComponentTypeEqualsIntegerTYPE() throws ReflectiveOperationException {
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
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotation);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${c93dba30-cfd6-3aa9-871b-7240156e7b42}
    @Disabled()
    @Test()
    void hashCodeWhenComponentTypeEqualsCharacterTYPE() throws ReflectiveOperationException {
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
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotation);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${27747a8c-2f7c-3484-baea-1c5445541533}
    @Disabled()
    @Test()
    void hashCodeWhenComponentTypeEqualsLongTYPE() throws ReflectiveOperationException {
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
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotation);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${7e9cf32b-5b6b-3402-8c41-f13977eff37b}
    @Disabled()
    @Test()
    void hashCodeWhenComponentTypeEqualsFloatTYPE() throws ReflectiveOperationException {
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
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotation);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${0ccda7eb-3e52-38d7-9ec2-a85968a09c7a}
    @Disabled()
    @Test()
    void hashCodeWhenComponentTypeEqualsDoubleTYPE() throws ReflectiveOperationException {
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
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotation);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${e38f24cf-1b49-35ce-b7ed-60adf074ce30}
    @Disabled()
    @Test()
    void hashCodeWhenComponentTypeEqualsBooleanTYPE() throws ReflectiveOperationException {
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
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotation);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${672af1fd-ed6c-3315-86cc-0cbd8febe09a}
    @Disabled()
    @Test()
    void hashCodeWhenComponentTypeNotEqualsBooleanTYPE() throws ReflectiveOperationException {
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
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        //Act Statement(s)
        int result = AnnotationUtils.hashCode(annotation);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${d8c1d6ee-7d37-3932-9a7f-dc1a80000348}
    @Disabled()
    @Test()
    void hashCodeWhenCaughtReflectiveOperationExceptionThrowsUncheckedException() throws SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
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
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        ReflectiveOperationException reflectiveOperationException = new ReflectiveOperationException();
        //Act Statement(s)
        final UncheckedException result = assertThrows(UncheckedException.class, () -> {
            AnnotationUtils.hashCode(annotation);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), isA(reflectiveOperationException.getClass()));
        });
    }

    //Sapient generated method id: ${bf5027ab-541c-3498-a096-3c9762098907}
    @Disabled()
    @Test()
    void toStringWhenMGetParameterTypesLengthGreaterThan0() throws ReflectiveOperationException {
        /* Branches:
         * (for-each(a.annotationType().getDeclaredMethods())) : true
         * (m.getParameterTypes().length > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        //Act Statement(s)
        String result = AnnotationUtils.toString(annotation);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${f6cd818d-8bda-3960-a3ab-bb217fa9fe5b}
    @Disabled()
    @Test()
    void toStringWhenMGetParameterTypesLengthNotGreaterThan0() throws ReflectiveOperationException {
        /* Branches:
         * (for-each(a.annotationType().getDeclaredMethods())) : true
         * (m.getParameterTypes().length > 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        //Act Statement(s)
        String result = AnnotationUtils.toString(annotation);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${7f98c0c3-4a09-3103-8f34-ad4e93b4f4b0}
    @Disabled()
    @Test()
    void toStringWhenMGetParameterTypesLengthGreaterThan0AndCaughtReflectiveOperationException() throws SecurityException, ReflectiveOperationException {
        /* Branches:
         * (for-each(a.annotationType().getDeclaredMethods())) : true
         * (m.getParameterTypes().length > 0) : true
         * (catch-exception (ReflectiveOperationException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        //Act Statement(s)
        String result = AnnotationUtils.toString(annotation);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${c46678f8-b0a8-3c38-9d38-c4a60edaef51}
    @Disabled()
    @Test()
    void toStringWhenCaughtReflectiveOperationExceptionThrowsUncheckedException() throws SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        /* Branches:
         * (for-each(a.annotationType().getDeclaredMethods())) : true
         * (m.getParameterTypes().length > 0) : false
         * (catch-exception (ReflectiveOperationException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Annotation annotation = null;
        ReflectiveOperationException reflectiveOperationException = new ReflectiveOperationException();
        //Act Statement(s)
        final UncheckedException result = assertThrows(UncheckedException.class, () -> {
            AnnotationUtils.toString(annotation);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), isA(reflectiveOperationException.getClass()));
        });
    }

    //Sapient generated method id: ${59757330-e7c9-3dd7-9b97-4a850ce7a900}
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

    //Sapient generated method id: ${b5d29baa-e679-3f67-b3a6-9fed67b028ff}
    @Disabled()
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

    //Sapient generated method id: ${955b1391-429f-3379-a4f9-fbefc0a2ba5a}
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
}
