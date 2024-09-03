package org.apache.commons.lang3.reflect;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;
import org.mockito.MockedStatic;
import java.lang.reflect.Constructor;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConstructorUtilsSapientGeneratedTest {

    private final Constructor constructorMock = mock(Constructor.class);

    private final Constructor constructorMock2 = mock(Constructor.class);

    //Sapient generated method id: ${getAccessibleConstructorTest}, hash: 5109158BF8AEFC4385B9BB9C53E26BA8
    @Test()
    void getAccessibleConstructorTest() {
        //Arrange Statement(s)
        try (MockedStatic<ConstructorUtils> constructorUtils = mockStatic(ConstructorUtils.class, CALLS_REAL_METHODS)) {
            constructorUtils.when(() -> ConstructorUtils.getAccessibleConstructor((Constructor) any())).thenReturn(constructorMock);
            Class<?>[] classArray = new Class[] {};
            //Act Statement(s)
            Constructor result = ConstructorUtils.getAccessibleConstructor(Object.class, classArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(constructorMock));
                constructorUtils.verify(() -> ConstructorUtils.getAccessibleConstructor((Constructor) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getAccessibleConstructorWhenCaughtNoSuchMethodException}, hash: 4AD9BE21D3B8541B671CD015E3B1450F
    @Test()
    void getAccessibleConstructorWhenCaughtNoSuchMethodException() {
        /* Branches:
         * (catch-exception (NoSuchMethodException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ConstructorUtils> constructorUtils = mockStatic(ConstructorUtils.class, CALLS_REAL_METHODS)) {
            constructorUtils.when(() -> ConstructorUtils.getAccessibleConstructor(constructorMock2)).thenReturn(constructorMock);
            Class<?>[] classArray = new Class[] {};
            //Act Statement(s)
            Constructor result = ConstructorUtils.getAccessibleConstructor(Object.class, classArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                constructorUtils.verify(() -> ConstructorUtils.getAccessibleConstructor(constructorMock2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getAccessibleConstructor1WhenIsAccessibleNotCtorGetDeclaringClass}, hash: B5F3D2EEF13E17AA88131B033AD1D826
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
         
        //Act Statement(s)
        Constructor result = ConstructorUtils.getAccessibleConstructor(constructorMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getAccessibleConstructor1WhenClassUtilsIsPublicClsAndIsAccessibleCtorGetDeclaringClass}, hash: 164E9954E6386EF63D0E4FFFAE642C06
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
         
        //Act Statement(s)
        Constructor result = ConstructorUtils.getAccessibleConstructor(constructorMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(constructorMock)));
    }

    //Sapient generated method id: ${getMatchingAccessibleConstructorTest}, hash: D960FA5F97FD0DE5433909FBCEEBE24E
    @Test()
    void getMatchingAccessibleConstructorTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Class<?>[] classArray = new Class[] {};
        
        //Act Statement(s)
        Constructor result = ConstructorUtils.getMatchingAccessibleConstructor(Object.class, classArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getMatchingAccessibleConstructorWhenResultIsNull}, hash: A4F754C14FAF7849213C5AFB16AF9E62
    @Test()
    void getMatchingAccessibleConstructorWhenResultIsNull() {
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
            constructorUtils.when(() -> ConstructorUtils.getAccessibleConstructor(constructorMock2)).thenReturn(constructorMock);
            Class<?>[] classArray = new Class[] {};
            //Act Statement(s)
            Constructor result = ConstructorUtils.getMatchingAccessibleConstructor(Object.class, classArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(constructorMock));
                constructorUtils.verify(() -> ConstructorUtils.getAccessibleConstructor(constructorMock2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeConstructorTest}, hash: 65614B5F8C78F28092B238D2719C2C4E
    @Test()
    void invokeConstructorTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //Arrange Statement(s)
        try (MockedStatic<ConstructorUtils> constructorUtils = mockStatic(ConstructorUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object[] objectArray = new Object[] {};
            Class<?>[] classArray = new Class[] {};
            constructorUtils.when(() -> ConstructorUtils.invokeConstructor(Object.class, objectArray, classArray)).thenReturn(object);
            Object[] objectArray2 = new Object[] {};
            //Act Statement(s)
            Object result = ConstructorUtils.invokeConstructor(Object.class, objectArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                constructorUtils.verify(() -> ConstructorUtils.invokeConstructor(Object.class, objectArray, classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeConstructor1WhenCtorIsNullThrowsNoSuchMethodException}, hash: 3F6497266F38E130EF5231F3ADBD3256
    @Test()
    void invokeConstructor1WhenCtorIsNullThrowsNoSuchMethodException() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /* Branches:
         * (ctor == null) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<ConstructorUtils> constructorUtils = mockStatic(ConstructorUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            constructorUtils.when(() -> ConstructorUtils.getMatchingAccessibleConstructor(Object.class, classArray)).thenReturn(null);
            Object[] objectArray = new Object[] {};
            Class<?>[] classArray2 = new Class[] {};
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

    //Sapient generated method id: ${invokeConstructor1WhenCtorIsVarArgs}, hash: F3C38E7E2566E456CBB0D3D4A75A5344
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
            Class<?>[] classArray = new Class[] {};
            constructorUtils.when(() -> ConstructorUtils.getMatchingAccessibleConstructor(Object.class, classArray)).thenReturn(constructorMock);
            Object[] objectArray = new Object[] {};
            Class<?>[] classArray2 = new Class[] {};
            //Act Statement(s)
            Object result = ConstructorUtils.invokeConstructor(Object.class, objectArray, classArray2);
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                constructorUtils.verify(() -> ConstructorUtils.getMatchingAccessibleConstructor(Object.class, classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeExactConstructorTest}, hash: 6E399C2F63B1DC9325FCD63D3C12A9C8
    @Test()
    void invokeExactConstructorTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //Arrange Statement(s)
        try (MockedStatic<ConstructorUtils> constructorUtils = mockStatic(ConstructorUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object[] objectArray = new Object[] {};
            Class<?>[] classArray = new Class[] {};
            constructorUtils.when(() -> ConstructorUtils.invokeExactConstructor(Object.class, objectArray, classArray)).thenReturn(object);
            Object[] objectArray2 = new Object[] {};
            //Act Statement(s)
            Object result = ConstructorUtils.invokeExactConstructor(Object.class, objectArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                constructorUtils.verify(() -> ConstructorUtils.invokeExactConstructor(Object.class, objectArray, classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeExactConstructor1WhenCtorIsNullThrowsNoSuchMethodException}, hash: 78E05E428B830BCC5A50142408B78DF3
    @Test()
    void invokeExactConstructor1WhenCtorIsNullThrowsNoSuchMethodException() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /* Branches:
         * (ctor == null) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<ConstructorUtils> constructorUtils = mockStatic(ConstructorUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            constructorUtils.when(() -> ConstructorUtils.getAccessibleConstructor(Object.class, classArray)).thenReturn(null);
            Object[] objectArray = new Object[] {};
            Class<?>[] classArray2 = new Class[] {};
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

    //Sapient generated method id: ${invokeExactConstructor1WhenCtorIsNotNull}, hash: 03B26D8E0EE1195ED5D2A79BC570DADF
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
            Class<?>[] classArray = new Class[] {};
            constructorUtils.when(() -> ConstructorUtils.getAccessibleConstructor(Object.class, classArray)).thenReturn(constructorMock);
            Object[] objectArray = new Object[] {};
            Class<?>[] classArray2 = new Class[] {};
            //Act Statement(s)
            Object result = ConstructorUtils.invokeExactConstructor(Object.class, objectArray, classArray2);
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                constructorUtils.verify(() -> ConstructorUtils.getAccessibleConstructor(Object.class, classArray), atLeast(1));
            });
        }
    }
}
