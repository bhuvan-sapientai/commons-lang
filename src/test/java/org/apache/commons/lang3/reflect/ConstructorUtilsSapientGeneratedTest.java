package org.apache.commons.lang3.reflect;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import org.mockito.MockedStatic;

import java.lang.reflect.Constructor;

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

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConstructorUtilsSapientGeneratedTest {

    //Sapient generated method id: ${cd2ba208-8289-3689-b840-c09f40f0410b}
    @Test()
    void invokeConstructorTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConstructorUtils> constructorUtils = mockStatic(ConstructorUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object[] objectArray = new Object[]{};
            Class<?>[] classArray = new Class[]{};
            constructorUtils.when(() -> ConstructorUtils.invokeConstructor(Object.class, objectArray, classArray)).thenReturn(object);
            Object[] objectArray2 = new Object[]{};
            //Act Statement(s)
            Object result = ConstructorUtils.invokeConstructor(Object.class, objectArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                constructorUtils.verify(() -> ConstructorUtils.invokeConstructor(Object.class, objectArray, classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8afff94e-64c6-3419-a8ca-93acdc6ee101}
    @Test()
    void invokeConstructor1WhenCtorIsNullThrowsNoSuchMethodException() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /* Branches:
         * (ctor == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConstructorUtils> constructorUtils = mockStatic(ConstructorUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[]{};
            constructorUtils.when(() -> ConstructorUtils.getMatchingAccessibleConstructor(Object.class, classArray)).thenReturn(null);
            Object[] objectArray = new Object[]{};
            Class<?>[] classArray2 = new Class[]{};
            //Act Statement(s)
            final NoSuchMethodException result = assertThrows(NoSuchMethodException.class, () -> {
                ConstructorUtils.invokeConstructor(Object.class, objectArray, classArray2);
            });
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("No such accessible constructor on object: java.lang.Object");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(noSuchMethodException.getMessage()));
                constructorUtils.verify(() -> ConstructorUtils.getMatchingAccessibleConstructor(Object.class, classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${186140c6-ae3f-3ef9-be8a-3307ffcbda4d}
    @Disabled()
    @Test()
    void invokeConstructor1WhenCtorIsVarArgs() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /* Branches:
         * (ctor == null) : false
         * (ctor.isVarArgs()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConstructorUtils> constructorUtils = mockStatic(ConstructorUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[]{};
            constructorUtils.when(() -> ConstructorUtils.getMatchingAccessibleConstructor(Object.class, classArray)).thenReturn(null);
            Object[] objectArray = new Object[]{};
            Class<?>[] classArray2 = new Class[]{};
            //Act Statement(s)
            Object result = ConstructorUtils.invokeConstructor(Object.class, objectArray, classArray2);
            Object object = new Object();
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                constructorUtils.verify(() -> ConstructorUtils.getMatchingAccessibleConstructor(Object.class, classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6c5ece11-cb96-3b60-a212-0bf96ce6963d}
    @Test()
    void invokeExactConstructorTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConstructorUtils> constructorUtils = mockStatic(ConstructorUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object[] objectArray = new Object[]{};
            Class<?>[] classArray = new Class[]{};
            constructorUtils.when(() -> ConstructorUtils.invokeExactConstructor(Object.class, objectArray, classArray)).thenReturn(object);
            Object[] objectArray2 = new Object[]{};
            //Act Statement(s)
            Object result = ConstructorUtils.invokeExactConstructor(Object.class, objectArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                constructorUtils.verify(() -> ConstructorUtils.invokeExactConstructor(Object.class, objectArray, classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${82417b93-c861-3e52-9c40-b7a7b10b2836}
    @Test()
    void invokeExactConstructor1WhenCtorIsNullThrowsNoSuchMethodException() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /* Branches:
         * (ctor == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConstructorUtils> constructorUtils = mockStatic(ConstructorUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[]{};
            constructorUtils.when(() -> ConstructorUtils.getAccessibleConstructor(Object.class, classArray)).thenReturn(null);
            Object[] objectArray = new Object[]{};
            Class<?>[] classArray2 = new Class[]{};
            //Act Statement(s)
            final NoSuchMethodException result = assertThrows(NoSuchMethodException.class, () -> {
                ConstructorUtils.invokeExactConstructor(Object.class, objectArray, classArray2);
            });
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("No such accessible constructor on object: java.lang.Object");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(noSuchMethodException.getMessage()));
                constructorUtils.verify(() -> ConstructorUtils.getAccessibleConstructor(Object.class, classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3e9923f7-0cd2-30d3-bd78-aacf5f307f78}
    @Disabled()
    @Test()
    void invokeExactConstructor1WhenCtorIsNotNull() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /* Branches:
         * (ctor == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConstructorUtils> constructorUtils = mockStatic(ConstructorUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[]{};
            constructorUtils.when(() -> ConstructorUtils.getAccessibleConstructor(Object.class, classArray)).thenReturn(null);
            Object[] objectArray = new Object[]{};
            Class<?>[] classArray2 = new Class[]{};
            //Act Statement(s)
            Object result = ConstructorUtils.invokeExactConstructor(Object.class, objectArray, classArray2);
            Object object = new Object();
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                constructorUtils.verify(() -> ConstructorUtils.getAccessibleConstructor(Object.class, classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a65f0c6f-37a7-3e2d-be5c-0fe8a60ee93b}
    @Disabled()
    @Test()
    void getAccessibleConstructorTest() throws NoSuchMethodException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConstructorUtils> constructorUtils = mockStatic(ConstructorUtils.class, CALLS_REAL_METHODS)) {
            constructorUtils.when(() -> ConstructorUtils.getAccessibleConstructor((Constructor) null)).thenReturn(null);
            Class<?>[] classArray = new Class[]{};
            //Act Statement(s)
            Constructor result = ConstructorUtils.getAccessibleConstructor(Object.class, classArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                constructorUtils.verify(() -> ConstructorUtils.getAccessibleConstructor((Constructor) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${e66befc5-7e44-3f4e-b6e2-159f44006c44}
    @Disabled()
    @Test()
    void getAccessibleConstructorWhenCaughtNoSuchMethodException() throws NoSuchMethodException, SecurityException {
        /* Branches:
         * (catch-exception (NoSuchMethodException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConstructorUtils> constructorUtils = mockStatic(ConstructorUtils.class, CALLS_REAL_METHODS)) {
            constructorUtils.when(() -> ConstructorUtils.getAccessibleConstructor((Constructor) null)).thenReturn(null);
            Class<?>[] classArray = new Class[]{};
            //Act Statement(s)
            Constructor result = ConstructorUtils.getAccessibleConstructor(Object.class, classArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                constructorUtils.verify(() -> ConstructorUtils.getAccessibleConstructor((Constructor) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${49aed4de-d5fd-3a74-a370-e49fb3b67fe1}
    @Disabled()
    @Test()
    void getAccessibleConstructor1WhenIsAccessibleNotCtorGetDeclaringClass() {
        /* Branches:
         * (MemberUtils.isAccessible(ctor)) : true
         * (cls != null) : true  #  inside isAccessible method
         * (!ClassUtils.isPublic(cls)) : true  #  inside isAccessible method
         * (isAccessible(ctor.getDeclaringClass())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Constructor<Object> constructor = null;
        //Act Statement(s)
        Constructor result = ConstructorUtils.getAccessibleConstructor(constructor);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${58055e83-f579-3ac7-8c0a-5f6031f09932}
    @Disabled()
    @Test()
    void getAccessibleConstructor1WhenClassUtilsIsPublicClsAndIsAccessibleCtorGetDeclaringClass() {
        /* Branches:
         * (MemberUtils.isAccessible(ctor)) : true
         * (cls != null) : true  #  inside isAccessible method
         * (!ClassUtils.isPublic(cls)) : false  #  inside isAccessible method
         * (isAccessible(ctor.getDeclaringClass())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Constructor<Object> constructor = null;
        //Act Statement(s)
        Constructor result = ConstructorUtils.getAccessibleConstructor(constructor);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(constructor)));
    }

    //Sapient generated method id: ${0935a1ed-1d06-3abf-a39e-45c697b6657f}
    @Disabled()
    @Test()
    void getMatchingAccessibleConstructorTest() throws NoSuchMethodException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Class<?>[] classArray = new Class[]{};
        //Act Statement(s)
        Constructor result = ConstructorUtils.getMatchingAccessibleConstructor(Object.class, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${2ecaa14b-7d11-3f2a-8e6b-dba4671f0a0a}
    @Disabled()
    @Test()
    void getMatchingAccessibleConstructorWhenResultIsNull() throws NoSuchMethodException, SecurityException {
        /* Branches:
         * (catch-exception (NoSuchMethodException)) : true
         * (for-each(ctors)) : true
         * (MemberUtils.isMatchingConstructor(ctor, parameterTypes)) : true
         * (ctor != null) : true
         * (result == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ConstructorUtils> constructorUtils = mockStatic(ConstructorUtils.class, CALLS_REAL_METHODS)) {
            constructorUtils.when(() -> ConstructorUtils.getAccessibleConstructor((Constructor) null)).thenReturn(null);
            Class<?>[] classArray = new Class[]{};
            //Act Statement(s)
            Constructor result = ConstructorUtils.getMatchingAccessibleConstructor(Object.class, classArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                constructorUtils.verify(() -> ConstructorUtils.getAccessibleConstructor((Constructor) null), atLeast(1));
            });
        }
    }
}
