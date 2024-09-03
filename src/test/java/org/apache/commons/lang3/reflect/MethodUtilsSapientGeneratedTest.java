package org.apache.commons.lang3.reflect;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;
import java.util.Set;
import org.apache.commons.lang3.ClassUtils;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MethodUtilsSapientGeneratedTest {

    private final Method methodMock = mock(Method.class);

    private final Method methodMock2 = mock(Method.class);

    //Sapient generated method id: ${getAccessibleMethodTest}, hash: E613AF4006D6555D38FBC4FA450D265E
    @Test()
    void getAccessibleMethodTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            methodUtils.when(() -> MethodUtils.getAccessibleMethod(methodMock2)).thenReturn(methodMock);
            Class<?>[] classArray = new Class[] {};
            //Act Statement(s)
            Method result = MethodUtils.getAccessibleMethod(Object.class, "methodName1", classArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(methodMock));
                methodUtils.verify(() -> MethodUtils.getAccessibleMethod(methodMock2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getAccessibleMethodWhenCaughtNoSuchMethodException}, hash: 76BFFE5565727B6945122130314A0B09
    @Test()
    void getAccessibleMethodWhenCaughtNoSuchMethodException() {
        /* Branches:
         * (catch-exception (NoSuchMethodException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            methodUtils.when(() -> MethodUtils.getAccessibleMethod(methodMock2)).thenReturn(methodMock);
            Class<?>[] classArray = new Class[] {};
            //Act Statement(s)
            Method result = MethodUtils.getAccessibleMethod(Object.class, "methodName1", classArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                methodUtils.verify(() -> MethodUtils.getAccessibleMethod(methodMock2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getAccessibleMethod1WhenMemberUtilsNotIsAccessibleMethod}, hash: D4A511410DEB5D907D94B28CC62F4D85
    @Test()
    void getAccessibleMethod1WhenMemberUtilsNotIsAccessibleMethod() {
        /* Branches:
         * (!MemberUtils.isAccessible(method)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Method result = MethodUtils.getAccessibleMethod(methodMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getAccessibleMethod1WhenClassUtilsIsPublicCls}, hash: C27639F529A54C3AB534E279FA0D3374
    @Test()
    void getAccessibleMethod1WhenClassUtilsIsPublicCls() {
        /* Branches:
         * (!MemberUtils.isAccessible(method)) : false
         * (ClassUtils.isPublic(cls)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Method result = MethodUtils.getAccessibleMethod(methodMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(methodMock)));
    }

    //Sapient generated method id: ${getAccessibleMethod1WhenMethodIsNullAndParentClassIsNull}, hash: 3D4EEAC10177D14F5C6E68704696607F
    @Test()
    void getAccessibleMethod1WhenMethodIsNullAndParentClassIsNull() {
        /* Branches:
         * (!MemberUtils.isAccessible(method)) : false
         * (ClassUtils.isPublic(cls)) : false
         * (cls != null) : true  #  inside getAccessibleMethodFromInterfaceNest method
         * (for-each(interfaces)) : true  #  inside getAccessibleMethodFromInterfaceNest method
         * (!ClassUtils.isPublic(anInterface)) : false  #  inside getAccessibleMethodFromInterfaceNest method
         * (method == null) : true
         * (parentClass != null) : false  #  inside getAccessibleMethodFromSuperclass method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Method result = MethodUtils.getAccessibleMethod(methodMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getAccessibleMethod1WhenClassUtilsIsPublicParentClass}, hash: D9267F4565F8581C9C3D0947C1AC776E
    @Test()
    void getAccessibleMethod1WhenClassUtilsIsPublicParentClass() {
        /* Branches:
         * (!MemberUtils.isAccessible(method)) : false
         * (ClassUtils.isPublic(cls)) : false
         * (cls != null) : true  #  inside getAccessibleMethodFromInterfaceNest method
         * (for-each(interfaces)) : true  #  inside getAccessibleMethodFromInterfaceNest method
         * (!ClassUtils.isPublic(anInterface)) : true  #  inside getAccessibleMethodFromInterfaceNest method
         * (method == null) : true
         * (parentClass != null) : true  #  inside getAccessibleMethodFromSuperclass method
         * (ClassUtils.isPublic(parentClass)) : true  #  inside getAccessibleMethodFromSuperclass method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Method result = MethodUtils.getAccessibleMethod(methodMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getAccessibleMethod1WhenClassUtilsNotIsPublicParentClass}, hash: 97CC127F37C9A6CB96049062B0426541
    @Test()
    void getAccessibleMethod1WhenClassUtilsNotIsPublicParentClass() {
        /* Branches:
         * (!MemberUtils.isAccessible(method)) : false
         * (ClassUtils.isPublic(cls)) : false
         * (cls != null) : true  #  inside getAccessibleMethodFromInterfaceNest method
         * (for-each(interfaces)) : true  #  inside getAccessibleMethodFromInterfaceNest method
         * (!ClassUtils.isPublic(anInterface)) : true  #  inside getAccessibleMethodFromInterfaceNest method
         * (method == null) : true
         * (parentClass != null) : true  #  inside getAccessibleMethodFromSuperclass method
         * (ClassUtils.isPublic(parentClass)) : false  #  inside getAccessibleMethodFromSuperclass method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Method result = MethodUtils.getAccessibleMethod(methodMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getAccessibleMethod1WhenMethodIsNotNullAndMethodIsNotNull}, hash: C16E089436B3E61C3D06D29229D9B7E6
    @Test()
    void getAccessibleMethod1WhenMethodIsNotNullAndMethodIsNotNull() {
        /* Branches:
         * (!MemberUtils.isAccessible(method)) : false
         * (ClassUtils.isPublic(cls)) : false
         * (cls != null) : true  #  inside getAccessibleMethodFromInterfaceNest method
         * (for-each(interfaces)) : true  #  inside getAccessibleMethodFromInterfaceNest method
         * (!ClassUtils.isPublic(anInterface)) : false  #  inside getAccessibleMethodFromInterfaceNest method
         * (catch-exception (NoSuchMethodException)) : true  #  inside getAccessibleMethodFromInterfaceNest method
         * (method != null) : true  #  inside getAccessibleMethodFromInterfaceNest method
         * (method == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Method result = MethodUtils.getAccessibleMethod(methodMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getAccessibleMethod1WhenCaughtNoSuchMethodException}, hash: 383B1A8A6CDEBCA2CB5F053188E61487
    @Test()
    void getAccessibleMethod1WhenCaughtNoSuchMethodException() {
        /* Branches:
         * (!MemberUtils.isAccessible(method)) : false
         * (ClassUtils.isPublic(cls)) : false
         * (cls != null) : true  #  inside getAccessibleMethodFromInterfaceNest method
         * (for-each(interfaces)) : true  #  inside getAccessibleMethodFromInterfaceNest method
         * (!ClassUtils.isPublic(anInterface)) : true  #  inside getAccessibleMethodFromInterfaceNest method
         * (method == null) : true
         * (parentClass != null) : true  #  inside getAccessibleMethodFromSuperclass method
         * (ClassUtils.isPublic(parentClass)) : true  #  inside getAccessibleMethodFromSuperclass method
         * (catch-exception (NoSuchMethodException)) : true  #  inside getAccessibleMethodFromSuperclass method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Method result = MethodUtils.getAccessibleMethod(methodMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getAccessibleMethod1WhenMethodIsNullAndMethodIsNullAndParentClassIsNull}, hash: F9A599E5A888895DFF6BC411A6D1D788
    @Test()
    void getAccessibleMethod1WhenMethodIsNullAndMethodIsNullAndParentClassIsNull() {
        /* Branches:
         * (!MemberUtils.isAccessible(method)) : false
         * (ClassUtils.isPublic(cls)) : false
         * (cls != null) : true  #  inside getAccessibleMethodFromInterfaceNest method
         * (for-each(interfaces)) : true  #  inside getAccessibleMethodFromInterfaceNest method
         * (!ClassUtils.isPublic(anInterface)) : false  #  inside getAccessibleMethodFromInterfaceNest method
         * (catch-exception (NoSuchMethodException)) : true  #  inside getAccessibleMethodFromInterfaceNest method
         * (method != null) : false  #  inside getAccessibleMethodFromInterfaceNest method
         * (method == null) : true
         * (parentClass != null) : false  #  inside getAccessibleMethodFromSuperclass method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Method result = MethodUtils.getAccessibleMethod(methodMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getAnnotationWhenMemberUtilsNotIsAccessibleMethod}, hash: D9EAAF3C54125E6ED9A8093413C0347C
    @Test()
    void getAnnotationWhenMemberUtilsNotIsAccessibleMethod() {
        /* Branches:
         * (!ignoreAccess) : true
         * (!MemberUtils.isAccessible(method)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Annotation result = MethodUtils.getAnnotation(methodMock, Annotation.class, false, false);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getAnnotationWhenClsIsNullThrowsNullPointerException}, hash: BD69B17F97C65166592F51DFF04AEBEE
    @Test()
    void getAnnotationWhenClsIsNullThrowsNullPointerException() {
        /* Branches:
         * (!ignoreAccess) : true
         * (!MemberUtils.isAccessible(method)) : false
         * (annotation == null) : true
         * (searchSupers) : true
         * (cls == null) : true  #  inside getAllSuperclassesAndInterfaces method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            MethodUtils.getAnnotation(methodMock, Annotation.class, true, false);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getAnnotationWhenEquivalentMethodIsNotNullAndAnnotationIsNotNull}, hash: EA77B0B8985DAF36B35A97D99C20BC1F
    @Test()
    void getAnnotationWhenEquivalentMethodIsNotNullAndAnnotationIsNotNull() {
        /* Branches:
         * (!ignoreAccess) : false
         * (annotation == null) : true
         * (searchSupers) : true
         * (cls == null) : false  #  inside getAllSuperclassesAndInterfaces method
         * (interfaceIndex < allInterfaces.size()) : true  #  inside getAllSuperclassesAndInterfaces method
         * (interfaceIndex >= allInterfaces.size()) : false  #  inside getAllSuperclassesAndInterfaces method
         * (superClassIndex >= allSuperclasses.size()) : true  #  inside getAllSuperclassesAndInterfaces method
         * (for-each(classes)) : true
         * (ignoreAccess) : true
         * (equivalentMethod != null) : true
         * (annotation != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            methodUtils.when(() -> MethodUtils.getMatchingMethod(Object.class, "string2", classArray)).thenReturn(methodMock);
            //Act Statement(s)
            Annotation result = MethodUtils.getAnnotation(methodMock2, Annotation.class, true, true);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                methodUtils.verify(() -> MethodUtils.getMatchingMethod(Object.class, "string2", classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getAnnotationWhenClassesIsNotEmptyAndNotIgnoreAccessAndEquivalentMethodIsNull}, hash: CDE53780050CC017F093B0C40B10A2E1
    @Test()
    void getAnnotationWhenClassesIsNotEmptyAndNotIgnoreAccessAndEquivalentMethodIsNull() {
        /* Branches:
         * (!ignoreAccess) : true
         * (!MemberUtils.isAccessible(method)) : false
         * (annotation == null) : true
         * (searchSupers) : true
         * (cls == null) : false  #  inside getAllSuperclassesAndInterfaces method
         * (interfaceIndex < allInterfaces.size()) : true  #  inside getAllSuperclassesAndInterfaces method
         * (interfaceIndex >= allInterfaces.size()) : false  #  inside getAllSuperclassesAndInterfaces method
         * (superClassIndex >= allSuperclasses.size()) : false  #  inside getAllSuperclassesAndInterfaces method
         * (!(superClassIndex < interfaceIndex)) : true  #  inside getAllSuperclassesAndInterfaces method
         * (superClassIndex < allSuperclasses.size()) : true  #  inside getAllSuperclassesAndInterfaces method
         * (for-each(classes)) : true
         * (ignoreAccess) : false
         * (equivalentMethod != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            methodUtils.when(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string2", classArray)).thenReturn(null);
            Class<?>[] classArray2 = new Class[] {};
            methodUtils.when(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string3", classArray2)).thenReturn(null);
            Class<?>[] classArray3 = new Class[] {};
            methodUtils.when(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string4", classArray3)).thenReturn(null);
            Class<?>[] classArray4 = new Class[] {};
            methodUtils.when(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string5", classArray4)).thenReturn(null);
            Class<?>[] classArray5 = new Class[] {};
            methodUtils.when(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string6", classArray5)).thenReturn(null);
            Class<?>[] classArray6 = new Class[] {};
            methodUtils.when(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string7", classArray6)).thenReturn(null);
            //Act Statement(s)
            Annotation result = MethodUtils.getAnnotation(methodMock, Annotation.class, true, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                methodUtils.verify(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string2", classArray), atLeast(1));
                methodUtils.verify(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string3", classArray2), atLeast(1));
                methodUtils.verify(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string4", classArray3), atLeast(1));
                methodUtils.verify(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string5", classArray4), atLeast(1));
                methodUtils.verify(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string6", classArray5), atLeast(1));
                methodUtils.verify(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string7", classArray6), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getMatchingAccessibleMethodTest}, hash: 9EF87A373A1DF30B55AFADAC361A784B
    @Test()
    void getMatchingAccessibleMethodTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Class<?>[] classArray = new Class[] {};
        
        //Act Statement(s)
        Method result = MethodUtils.getMatchingAccessibleMethod(Object.class, "methodName1", classArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getMatchingAccessibleMethodWhenParameterTypeNameIsNull}, hash: 0D4A70F2BEB11F208065D60C8919387D
    @Test()
    void getMatchingAccessibleMethodWhenParameterTypeNameIsNull() {
        /* Branches:
         * (catch-exception (NoSuchMethodException)) : true
         * (for-each(matchingMethods)) : true
         * (accessibleMethod != null) : true
         * (bestMatch == null) : true
         * (bestMatch != null) : true
         * (bestMatch != null) : true
         * (bestMatch.isVarArgs()) : true
         * (bestMatch.getParameterTypes().length > 0) : true
         * (parameterTypes.length > 0) : true
         * (lastParameterType == null) : true
         * (lastParameterType == null) : true
         * (parameterTypeName != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            methodUtils.when(() -> MethodUtils.getAccessibleMethod(methodMock2)).thenReturn(methodMock);
            Class<?>[] classArray = new Class[] { (Class) null };
            //Act Statement(s)
            Method result = MethodUtils.getMatchingAccessibleMethod(Object.class, "methodName1", classArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(methodMock));
                methodUtils.verify(() -> MethodUtils.getAccessibleMethod(methodMock2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getMatchingAccessibleMethodWhenMethodParameterComponentTypeNameNotEqualsParameterTypeSuperClassName}, hash: D62BB63EEFAC741F301F9B3AFE5A7B52
    @Test()
    void getMatchingAccessibleMethodWhenMethodParameterComponentTypeNameNotEqualsParameterTypeSuperClassName() {
        /* Branches:
         * (catch-exception (NoSuchMethodException)) : true
         * (for-each(matchingMethods)) : true
         * (accessibleMethod != null) : true
         * (bestMatch == null) : true
         * (bestMatch != null) : true
         * (bestMatch != null) : true
         * (bestMatch.isVarArgs()) : true
         * (bestMatch.getParameterTypes().length > 0) : true
         * (parameterTypes.length > 0) : true
         * (lastParameterType == null) : false
         * (lastParameterType == null) : false
         * (parameterTypeName != null) : true
         * (parameterTypeSuperClassName != null) : true
         * (!methodParameterComponentTypeName.equals(parameterTypeName)) : true
         * (!methodParameterComponentTypeName.equals(parameterTypeSuperClassName)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            methodUtils.when(() -> MethodUtils.getAccessibleMethod(methodMock2)).thenReturn(methodMock);
            Class<?>[] classArray = new Class[] { Object.class };
            //Act Statement(s)
            Method result = MethodUtils.getMatchingAccessibleMethod(Object.class, "methodName1", classArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                methodUtils.verify(() -> MethodUtils.getAccessibleMethod(methodMock2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getMatchingMethodWhenArraysDeepEqualsMethodGetParameterTypesParameterTypes}, hash: A05E9FB748AEB6A67548A11E6C06D956
    @Test()
    void getMatchingMethodWhenArraysDeepEqualsMethodGetParameterTypesParameterTypes() {
        /* Branches:
         * (for-each(methods)) : true
         * (Arrays.deepEquals(method.getParameterTypes(), parameterTypes)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Class<?>[] classArray = new Class[] {};
        
        //Act Statement(s)
        Method result = MethodUtils.getMatchingMethod(Object.class, "methodName1", classArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getMatchingMethodWhenCandidatesIsEmpty}, hash: D03DB87865522D8AD5F2FD300461A33A
    @Test()
    void getMatchingMethodWhenCandidatesIsEmpty() {
        /* Branches:
         * (for-each(methods)) : true
         * (Arrays.deepEquals(method.getParameterTypes(), parameterTypes)) : false
         * (branch expression (line 413)) : false
         * (candidates.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Class<?>[] classArray = new Class[] {};
        
        //Act Statement(s)
        Method result = MethodUtils.getMatchingMethod(Object.class, "methodName1", classArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getMatchingMethodWhenClassUtilsNotIsAssignableFromClassArrayToClassArrayTrueAndCandidatesIsEmpty}, hash: 99634BBBD69CDB515EACE473E613EF22
    @Test()
    void getMatchingMethodWhenClassUtilsNotIsAssignableFromClassArrayToClassArrayTrueAndCandidatesIsEmpty() {
        /* Branches:
         * (for-each(methods)) : true
         * (Arrays.deepEquals(method.getParameterTypes(), parameterTypes)) : false
         * (branch expression (line 413)) : true
         * (!ClassUtils.isAssignable(fromClassArray, toClassArray, true)) : true  #  inside distance method
         * (candidates.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Class<?>[] classArray = new Class[] {};
        
        //Act Statement(s)
        Method result = MethodUtils.getMatchingMethod(Object.class, "methodName1", classArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getMatchingMethodWhenAClassEqualsToClassAndCandidatesIsEmpty}, hash: D4C3011DE29858F8759ED8BB46E609C3
    @Test()
    void getMatchingMethodWhenAClassEqualsToClassAndCandidatesIsEmpty() {
        /* Branches:
         * (for-each(methods)) : true
         * (Arrays.deepEquals(method.getParameterTypes(), parameterTypes)) : false
         * (branch expression (line 413)) : true
         * (!ClassUtils.isAssignable(fromClassArray, toClassArray, true)) : false  #  inside distance method
         * (offset < fromClassArray.length) : true  #  inside distance method
         * (aClass == null) : false  #  inside distance method
         * (aClass.equals(toClass)) : true  #  inside distance method
         * (candidates.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Class<?>[] classArray = new Class[] {};
        
        //Act Statement(s)
        Method result = MethodUtils.getMatchingMethod(Object.class, "methodName1", classArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getMatchingMethodWhenClassUtilsNotIsAssignableAClassToClassFalseAndCandidatesIsEmpty}, hash: B2C8E966ABB51CB47DA9073D865F11DE
    @Test()
    void getMatchingMethodWhenClassUtilsNotIsAssignableAClassToClassFalseAndCandidatesIsEmpty() {
        /* Branches:
         * (for-each(methods)) : true
         * (Arrays.deepEquals(method.getParameterTypes(), parameterTypes)) : false
         * (branch expression (line 413)) : true
         * (!ClassUtils.isAssignable(fromClassArray, toClassArray, true)) : false  #  inside distance method
         * (offset < fromClassArray.length) : true  #  inside distance method
         * (aClass == null) : false  #  inside distance method
         * (aClass.equals(toClass)) : false  #  inside distance method
         * (ClassUtils.isAssignable(aClass, toClass, true)) : true  #  inside distance method
         * (!ClassUtils.isAssignable(aClass, toClass, false)) : true  #  inside distance method
         * (candidates.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Class<?>[] classArray = new Class[] {};
        
        //Act Statement(s)
        Method result = MethodUtils.getMatchingMethod(Object.class, "methodName1", classArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getMatchingMethodWhenClassUtilsIsAssignableAClassToClassFalseAndCandidatesIsEmpty}, hash: 4CA4162304903689DEDF15A11F005F84
    @Test()
    void getMatchingMethodWhenClassUtilsIsAssignableAClassToClassFalseAndCandidatesIsEmpty() {
        /* Branches:
         * (for-each(methods)) : true
         * (Arrays.deepEquals(method.getParameterTypes(), parameterTypes)) : false
         * (branch expression (line 413)) : true
         * (!ClassUtils.isAssignable(fromClassArray, toClassArray, true)) : false  #  inside distance method
         * (offset < fromClassArray.length) : true  #  inside distance method
         * (aClass == null) : false  #  inside distance method
         * (aClass.equals(toClass)) : false  #  inside distance method
         * (ClassUtils.isAssignable(aClass, toClass, true)) : true  #  inside distance method
         * (!ClassUtils.isAssignable(aClass, toClass, false)) : false  #  inside distance method
         * (candidates.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Class<?>[] classArray = new Class[] {};
        
        //Act Statement(s)
        Method result = MethodUtils.getMatchingMethod(Object.class, "methodName1", classArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getMethodsListWithAnnotationTest}, hash: DDBF3126D8F7430E246ECED1AAAF137E
    @Test()
    void getMethodsListWithAnnotationTest() {
        //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            List<Method> methodList = new ArrayList<>();
            methodUtils.when(() -> MethodUtils.getMethodsListWithAnnotation(Object.class, Annotation.class, false, false)).thenReturn(methodList);
            //Act Statement(s)
            List<Method> result = MethodUtils.getMethodsListWithAnnotation(Object.class, Annotation.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(methodList));
                methodUtils.verify(() -> MethodUtils.getMethodsListWithAnnotation(Object.class, Annotation.class, false, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getMethodsListWithAnnotation1WhenClsIsNullThrowsNullPointerException}, hash: 56DB54968EC4B48877D23EBD0B198350
    @Test()
    void getMethodsListWithAnnotation1WhenClsIsNullThrowsNullPointerException() {
        /* Branches:
         * (searchSupers) : true
         * (cls == null) : true  #  inside getAllSuperclassesAndInterfaces method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Class<?> _class = null;
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            MethodUtils.getMethodsListWithAnnotation(_class, Annotation.class, true, false);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getMethodsListWithAnnotation1WhenNotIgnoreAccess}, hash: 29A8C954776148C48DD524D97E13F7AC
    @Test()
    void getMethodsListWithAnnotation1WhenNotIgnoreAccess() {
        /* Branches:
         * (searchSupers) : false
         * (ignoreAccess) : false  #  inside lambda$getMethodsListWithAnnotation$7 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        List<Method> result = MethodUtils.getMethodsListWithAnnotation(Object.class, Annotation.class, false, false);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getMethodsListWithAnnotation1WhenIgnoreAccess}, hash: 07F7C1CEB7D1F76C66EE576FC0968E2B
    @Test()
    void getMethodsListWithAnnotation1WhenIgnoreAccess() {
        /* Branches:
         * (searchSupers) : true
         * (cls == null) : false  #  inside getAllSuperclassesAndInterfaces method
         * (interfaceIndex < allInterfaces.size()) : false  #  inside getAllSuperclassesAndInterfaces method
         * (superClassIndex < allSuperclasses.size()) : true  #  inside getAllSuperclassesAndInterfaces method
         * (interfaceIndex >= allInterfaces.size()) : true  #  inside getAllSuperclassesAndInterfaces method
         * (ignoreAccess) : true  #  inside lambda$getMethodsListWithAnnotation$7 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        List<Method> result = MethodUtils.getMethodsListWithAnnotation(Object.class, Annotation.class, true, true);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getMethodsWithAnnotationTest}, hash: 35D4E6E8717377631E48AA54B2FA11D9
    @Test()
    void getMethodsWithAnnotationTest() {
        //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Method[] methodArray = new Method[] {};
            methodUtils.when(() -> MethodUtils.getMethodsWithAnnotation(Object.class, Annotation.class, false, false)).thenReturn(methodArray);
            //Act Statement(s)
            Method[] result = MethodUtils.getMethodsWithAnnotation(Object.class, Annotation.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(methodArray));
                methodUtils.verify(() -> MethodUtils.getMethodsWithAnnotation(Object.class, Annotation.class, false, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getMethodsWithAnnotation1Test}, hash: A9EE6088C78288E7E892ED9C5322D8B1
    @Test()
    void getMethodsWithAnnotation1Test() {
        //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            List<Method> methodList = new ArrayList<>();
            methodUtils.when(() -> MethodUtils.getMethodsListWithAnnotation(Object.class, Annotation.class, false, false)).thenReturn(methodList);
            //Act Statement(s)
            Method[] result = MethodUtils.getMethodsWithAnnotation(Object.class, Annotation.class, false, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                methodUtils.verify(() -> MethodUtils.getMethodsListWithAnnotation(Object.class, Annotation.class, false, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getOverrideHierarchyWhenMIsNull}, hash: 67E9408EF08843974989E9487C16A5E6
    @Test()
    void getOverrideHierarchyWhenMIsNull() {
        /* Branches:
         * (hierarchy.hasNext()) : true
         * (m == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            methodUtils.when(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string2", classArray)).thenReturn(null);
            //Act Statement(s)
            Set<Method> result = MethodUtils.getOverrideHierarchy(methodMock, ClassUtils.Interfaces.INCLUDE);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                assertThat(result.iterator().next(), is(instanceOf(Method.class)));
                methodUtils.verify(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string2", classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getOverrideHierarchyWhenArraysEqualsMGetParameterTypesParameterTypes}, hash: FA432B990E8104EE3525283A4ED044E6
    @Test()
    void getOverrideHierarchyWhenArraysEqualsMGetParameterTypesParameterTypes() {
        /* Branches:
         * (hierarchy.hasNext()) : true
         * (m == null) : false
         * (Arrays.equals(m.getParameterTypes(), parameterTypes)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            methodUtils.when(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string2", classArray)).thenReturn(methodMock);
            //Act Statement(s)
            Set<Method> result = MethodUtils.getOverrideHierarchy(methodMock2, ClassUtils.Interfaces.INCLUDE);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(2));
                assertThat(result.iterator().next(), is(instanceOf(Method.class)));
                methodUtils.verify(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string2", classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getOverrideHierarchyWhenTypeUtilsNotEqualsChildTypeParentType}, hash: 078E6F2260FDBAA8627C0F8DD0B6C668
    @Test()
    void getOverrideHierarchyWhenTypeUtilsNotEqualsChildTypeParentType() {
        /* Branches:
         * (hierarchy.hasNext()) : true
         * (m == null) : false
         * (Arrays.equals(m.getParameterTypes(), parameterTypes)) : false
         * (i < parameterTypes.length) : true
         * (!TypeUtils.equals(childType, parentType)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] { Object.class };
            methodUtils.when(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string2", classArray)).thenReturn(methodMock);
            //Act Statement(s)
            Set<Method> result = MethodUtils.getOverrideHierarchy(methodMock2, ClassUtils.Interfaces.INCLUDE);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                assertThat(result.iterator().next(), is(instanceOf(Method.class)));
                methodUtils.verify(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string2", classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getOverrideHierarchyWhenTypeUtilsEqualsChildTypeParentType}, hash: FDB2C159AFA9FD9966488BD0E148ACFF
    @Test()
    void getOverrideHierarchyWhenTypeUtilsEqualsChildTypeParentType() {
        /* Branches:
         * (hierarchy.hasNext()) : true
         * (m == null) : false
         * (Arrays.equals(m.getParameterTypes(), parameterTypes)) : false
         * (i < parameterTypes.length) : true
         * (!TypeUtils.equals(childType, parentType)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] { Object.class };
            methodUtils.when(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string2", classArray)).thenReturn(methodMock);
            //Act Statement(s)
            Set<Method> result = MethodUtils.getOverrideHierarchy(methodMock2, ClassUtils.Interfaces.INCLUDE);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(2));
                assertThat(result.iterator().next(), is(instanceOf(Method.class)));
                methodUtils.verify(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "string2", classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getVarArgsWhenArgsLengthMinus1IndexOfArgsGetClassEqualsMethodParameterTypesLengthMinus1IndexOfMethodParameterTypes}, hash: 0E9B9AEE8BECCEA848100B7BDAB1D975
    @Test()
    void getVarArgsWhenArgsLengthMinus1IndexOfArgsGetClassEqualsMethodParameterTypesLengthMinus1IndexOfMethodParameterTypes() {
        /* Branches:
         * (args.length == methodParameterTypes.length) : true
         * (args[args.length - 1] == null) : false
         * (args[args.length - 1].getClass().equals(methodParameterTypes[methodParameterTypes.length - 1])) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        Object[] objectArray = new Object[] { object };
        Class<?>[] classArray = new Class[] { Object.class };
        
        //Act Statement(s)
        Object[] result = MethodUtils.getVarArgs(objectArray, classArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectArray)));
    }

    //Sapient generated method id: ${getVarArgsWhenArgsLengthMinus1IndexOfArgsGetClassNotEqualsMethodParameterTypesLengthMinus1IndexOfMethodParameterTypesAn}, hash: AF8643F276F34BCFDD5E4988E316BEE1
    @Test()
    void getVarArgsWhenArgsLengthMinus1IndexOfArgsGetClassNotEqualsMethodParameterTypesLengthMinus1IndexOfMethodParameterTypesAn() {
        /* Branches:
         * (args.length == methodParameterTypes.length) : true
         * (args[args.length - 1] == null) : false
         * (args[args.length - 1].getClass().equals(methodParameterTypes[methodParameterTypes.length - 1])) : false
         * (varArgComponentType.isPrimitive()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        Object[] objectArray = new Object[] { object };
        Class<?>[] classArray = new Class[] { Object.class };
        
        //Act Statement(s)
        Object[] result = MethodUtils.getVarArgs(objectArray, classArray);
        Object object2 = new Object();
        Object[] objectResultArray = new Object[] { object2 };
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectResultArray)));
    }

    //Sapient generated method id: ${invokeExactMethodTest}, hash: 8E49788CA40627F74D1B331EEAE2C590
    @Test()
    void invokeExactMethodTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            Object[] objectArray = new Object[] {};
            methodUtils.when(() -> MethodUtils.invokeExactMethod(object2, "methodName1", objectArray, (Class[]) null)).thenReturn(object);
            //Act Statement(s)
            Object result = MethodUtils.invokeExactMethod(object2, "methodName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                methodUtils.verify(() -> MethodUtils.invokeExactMethod(object2, "methodName1", objectArray, (Class[]) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeExactMethod1Test}, hash: 79FEA08D680D0A9D9BE7103EB936E3D1
    @Test()
    void invokeExactMethod1Test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            Object[] objectArray = new Object[] {};
            Class<?>[] classArray = new Class[] {};
            methodUtils.when(() -> MethodUtils.invokeExactMethod(object2, "methodName1", objectArray, classArray)).thenReturn(object);
            Object[] objectArray2 = new Object[] {};
            //Act Statement(s)
            Object result = MethodUtils.invokeExactMethod(object2, "methodName1", objectArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                methodUtils.verify(() -> MethodUtils.invokeExactMethod(object2, "methodName1", objectArray, classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeExactMethod2WhenMethodIsNullThrowsNoSuchMethodException}, hash: C3186CAB95B2018B0AAB703EC7C9703E
    @Test()
    void invokeExactMethod2WhenMethodIsNullThrowsNoSuchMethodException() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        /* Branches:
         * (method == null) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            methodUtils.when(() -> MethodUtils.getAccessibleMethod(Object.class, "A", classArray)).thenReturn(null);
            Object object = new Object();
            Object[] objectArray = new Object[] {};
            Class<?>[] classArray2 = new Class[] {};
            //Act Statement(s)
            final NoSuchMethodException result = assertThrows(NoSuchMethodException.class, () -> {
                MethodUtils.invokeExactMethod(object, "A", objectArray, classArray2);
            });
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("No such accessible method: A() on object: java.lang.Object");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(noSuchMethodException.getMessage()));
                methodUtils.verify(() -> MethodUtils.getAccessibleMethod(Object.class, "A", classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeExactMethod2WhenMethodIsNotNull}, hash: 12B9C5C9BFEB8B83EF0287398468F08E
    @Test()
    void invokeExactMethod2WhenMethodIsNotNull() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        /* Branches:
         * (method == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            methodUtils.when(() -> MethodUtils.getAccessibleMethod(Object.class, "methodName1", classArray)).thenReturn(methodMock);
            Object object = new Object();
            Object[] objectArray = new Object[] {};
            Class<?>[] classArray2 = new Class[] {};
            //Act Statement(s)
            Object result = MethodUtils.invokeExactMethod(object, "methodName1", objectArray, classArray2);
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                methodUtils.verify(() -> MethodUtils.getAccessibleMethod(Object.class, "methodName1", classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeExactStaticMethodTest}, hash: 0A9DEB51D76A4FEF7701ACC526F02042
    @Test()
    void invokeExactStaticMethodTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object[] objectArray = new Object[] {};
            Class<?>[] classArray = new Class[] {};
            methodUtils.when(() -> MethodUtils.invokeExactStaticMethod(Object.class, "methodName1", objectArray, classArray)).thenReturn(object);
            Object[] objectArray2 = new Object[] {};
            //Act Statement(s)
            Object result = MethodUtils.invokeExactStaticMethod(Object.class, "methodName1", objectArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                methodUtils.verify(() -> MethodUtils.invokeExactStaticMethod(Object.class, "methodName1", objectArray, classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeExactStaticMethod1WhenMethodIsNullThrowsNoSuchMethodException}, hash: F6BD679B8B6F8FDD728CC8D5CFC772E0
    @Test()
    void invokeExactStaticMethod1WhenMethodIsNullThrowsNoSuchMethodException() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        /* Branches:
         * (method == null) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            methodUtils.when(() -> MethodUtils.getAccessibleMethod(Object.class, "A", classArray)).thenReturn(null);
            Object[] objectArray = new Object[] {};
            Class<?>[] classArray2 = new Class[] {};
            //Act Statement(s)
            final NoSuchMethodException result = assertThrows(NoSuchMethodException.class, () -> {
                MethodUtils.invokeExactStaticMethod(Object.class, "A", objectArray, classArray2);
            });
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("No such accessible method: A() on class: java.lang.Object");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(noSuchMethodException.getMessage()));
                methodUtils.verify(() -> MethodUtils.getAccessibleMethod(Object.class, "A", classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeExactStaticMethod1WhenMethodIsNotNull}, hash: D022402EAAA6A2487944C224F708A0CA
    @Test()
    void invokeExactStaticMethod1WhenMethodIsNotNull() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        /* Branches:
         * (method == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            methodUtils.when(() -> MethodUtils.getAccessibleMethod(Object.class, "methodName1", classArray)).thenReturn(methodMock);
            Object[] objectArray = new Object[] {};
            Class<?>[] classArray2 = new Class[] {};
            //Act Statement(s)
            Object result = MethodUtils.invokeExactStaticMethod(Object.class, "methodName1", objectArray, classArray2);
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                methodUtils.verify(() -> MethodUtils.getAccessibleMethod(Object.class, "methodName1", classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeMethodTest}, hash: ADDAD029260FB407690A01A49773929C
    @Test()
    void invokeMethodTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            Object[] objectArray = new Object[] {};
            methodUtils.when(() -> MethodUtils.invokeMethod(object2, false, "methodName1", objectArray, (Class[]) null)).thenReturn(object);
            //Act Statement(s)
            Object result = MethodUtils.invokeMethod(object2, false, "methodName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                methodUtils.verify(() -> MethodUtils.invokeMethod(object2, false, "methodName1", objectArray, (Class[]) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeMethod1Test}, hash: 514CFBA226D336C4E996D57ADC153FA2
    @Test()
    void invokeMethod1Test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            Object[] objectArray = new Object[] {};
            Class<?>[] classArray = new Class[] {};
            methodUtils.when(() -> MethodUtils.invokeMethod(object2, false, "methodName1", objectArray, classArray)).thenReturn(object);
            Object[] objectArray2 = new Object[] {};
            //Act Statement(s)
            Object result = MethodUtils.invokeMethod(object2, false, "methodName1", objectArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                methodUtils.verify(() -> MethodUtils.invokeMethod(object2, false, "methodName1", objectArray, classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeMethod2WhenMethodIsNullThrowsNoSuchMethodException}, hash: 37A083A5129BEC682B0906E6626967CC
    @Test()
    void invokeMethod2WhenMethodIsNullThrowsNoSuchMethodException() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        /* Branches:
         * (forceAccess) : false
         * (method == null) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            methodUtils.when(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "A", classArray)).thenReturn(null);
            Object object = new Object();
            Object[] objectArray = new Object[] {};
            Class<?>[] classArray2 = new Class[] {};
            //Act Statement(s)
            final NoSuchMethodException result = assertThrows(NoSuchMethodException.class, () -> {
                MethodUtils.invokeMethod(object, false, "A", objectArray, classArray2);
            });
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("No such accessible method: A() on object: java.lang.Object");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(noSuchMethodException.getMessage()));
                methodUtils.verify(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "A", classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeMethod2WhenMethodIsVarArgs}, hash: 3606FBBC33C3A1AEFB18E7FBA06237B4
    @Test()
    void invokeMethod2WhenMethodIsVarArgs() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        /* Branches:
         * (forceAccess) : true
         * (method != null) : true
         * (!method.isAccessible()) : true
         * (method == null) : false
         * (method.isVarArgs()) : true  #  inside toVarArgs method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            methodUtils.when(() -> MethodUtils.getMatchingMethod(Object.class, "methodName1", classArray)).thenReturn(methodMock);
            Object[] objectArray = new Object[] {};
            Object[] objectArray2 = new Object[] {};
            Class<?>[] classArray2 = new Class[] {};
            methodUtils.when(() -> MethodUtils.getVarArgs(objectArray2, classArray2)).thenReturn(objectArray);
            Object object = new Object();
            Object[] objectArray3 = new Object[] {};
            Class<?>[] classArray3 = new Class[] {};
            //Act Statement(s)
            Object result = MethodUtils.invokeMethod(object, true, "methodName1", objectArray3, classArray3);
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                methodUtils.verify(() -> MethodUtils.getMatchingMethod(Object.class, "methodName1", classArray), atLeast(1));
                methodUtils.verify(() -> MethodUtils.getVarArgs(objectArray2, classArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeMethod3Test}, hash: D416FB1E7188C663045585C4E635FD51
    @Test()
    void invokeMethod3Test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            Object[] objectArray = new Object[] {};
            methodUtils.when(() -> MethodUtils.invokeMethod(object2, "methodName1", objectArray, (Class[]) null)).thenReturn(object);
            //Act Statement(s)
            Object result = MethodUtils.invokeMethod(object2, "methodName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                methodUtils.verify(() -> MethodUtils.invokeMethod(object2, "methodName1", objectArray, (Class[]) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeMethod4Test}, hash: 744F265DE5AF29F1F31AE1BF59E13F72
    @Test()
    void invokeMethod4Test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            Object[] objectArray = new Object[] {};
            Class<?>[] classArray = new Class[] {};
            methodUtils.when(() -> MethodUtils.invokeMethod(object2, "methodName1", objectArray, classArray)).thenReturn(object);
            Object[] objectArray2 = new Object[] {};
            //Act Statement(s)
            Object result = MethodUtils.invokeMethod(object2, "methodName1", objectArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                methodUtils.verify(() -> MethodUtils.invokeMethod(object2, "methodName1", objectArray, classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeMethod5Test}, hash: 5EE2246E36974288C2D2E8DC506FEED2
    @Test()
    void invokeMethod5Test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            Object[] objectArray = new Object[] {};
            Class<?>[] classArray = new Class[] {};
            methodUtils.when(() -> MethodUtils.invokeMethod(object2, false, "methodName1", objectArray, classArray)).thenReturn(object);
            //Act Statement(s)
            Object result = MethodUtils.invokeMethod(object2, "methodName1", objectArray, classArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                methodUtils.verify(() -> MethodUtils.invokeMethod(object2, false, "methodName1", objectArray, classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeStaticMethodTest}, hash: FE446637592362AB5F2035BBB51ED47D
    @Test()
    void invokeStaticMethodTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object[] objectArray = new Object[] {};
            Class<?>[] classArray = new Class[] {};
            methodUtils.when(() -> MethodUtils.invokeStaticMethod(Object.class, "methodName1", objectArray, classArray)).thenReturn(object);
            Object[] objectArray2 = new Object[] {};
            //Act Statement(s)
            Object result = MethodUtils.invokeStaticMethod(Object.class, "methodName1", objectArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                methodUtils.verify(() -> MethodUtils.invokeStaticMethod(Object.class, "methodName1", objectArray, classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeStaticMethod1WhenMethodIsNullThrowsNoSuchMethodException}, hash: 6CC40E46DACC2410FE99D3B7BF51DE8C
    @Test()
    void invokeStaticMethod1WhenMethodIsNullThrowsNoSuchMethodException() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        /* Branches:
         * (method == null) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            methodUtils.when(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "A", classArray)).thenReturn(null);
            Object[] objectArray = new Object[] {};
            Class<?>[] classArray2 = new Class[] {};
            //Act Statement(s)
            final NoSuchMethodException result = assertThrows(NoSuchMethodException.class, () -> {
                MethodUtils.invokeStaticMethod(Object.class, "A", objectArray, classArray2);
            });
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("No such accessible method: A() on class: java.lang.Object");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(noSuchMethodException.getMessage()));
                methodUtils.verify(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "A", classArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${invokeStaticMethod1WhenMethodIsVarArgs}, hash: ABF1F121AB347489CB258B9D203F4697
    @Test()
    void invokeStaticMethod1WhenMethodIsVarArgs() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        /* Branches:
         * (method == null) : false
         * (method.isVarArgs()) : true  #  inside toVarArgs method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<MethodUtils> methodUtils = mockStatic(MethodUtils.class, CALLS_REAL_METHODS)) {
            Class<?>[] classArray = new Class[] {};
            methodUtils.when(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "methodName1", classArray)).thenReturn(methodMock);
            Object[] objectArray = new Object[] {};
            Object[] objectArray2 = new Object[] {};
            Class<?>[] classArray2 = new Class[] {};
            methodUtils.when(() -> MethodUtils.getVarArgs(objectArray2, classArray2)).thenReturn(objectArray);
            Object[] objectArray3 = new Object[] {};
            Class<?>[] classArray3 = new Class[] {};
            //Act Statement(s)
            Object result = MethodUtils.invokeStaticMethod(Object.class, "methodName1", objectArray3, classArray3);
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                methodUtils.verify(() -> MethodUtils.getMatchingAccessibleMethod(Object.class, "methodName1", classArray), atLeast(1));
                methodUtils.verify(() -> MethodUtils.getVarArgs(objectArray2, classArray2), atLeast(1));
            });
        }
    }
}
