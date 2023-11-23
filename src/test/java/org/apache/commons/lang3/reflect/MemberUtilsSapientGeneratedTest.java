package org.apache.commons.lang3.reflect;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import org.mockito.MockedStatic;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Constructor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MemberUtilsSapientGeneratedTest {

    //Sapient generated method id: ${bd4dec70-1f09-3e5c-8da1-34069c8575b3}
    @Test()
    void setAccessibleWorkaroundWhenObjIsAccessible() {
        /* Branches:
         * (obj == null) : false
         * (obj.isAccessible()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        AccessibleObject accessibleObject = null;
        //Act Statement(s)
        AccessibleObject result = MemberUtils.setAccessibleWorkaround(accessibleObject);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(accessibleObject)));
    }

    //Sapient generated method id: ${cd986a5d-dfc3-37c5-a19e-5b32c163de95}
    @Disabled()
    @Test()
    void setAccessibleWorkaroundWhenIsPackageAccessMGetDeclaringClassGetModifiers() {
        /* Branches:
         * (obj == null) : false
         * (obj.isAccessible()) : false
         * (!obj.isAccessible()) : true
         * (isPublic(m)) : true
         * (isPackageAccess(m.getDeclaringClass().getModifiers())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MemberUtils> memberUtils = mockStatic(MemberUtils.class, CALLS_REAL_METHODS)) {
            memberUtils.when(() -> MemberUtils.isPublic((Member) null)).thenReturn(true);
            memberUtils.when(() -> MemberUtils.isPackageAccess(0)).thenReturn(true);
            //TODO: Needs initialization with real value
            AccessibleObject accessibleObject = null;
            //Act Statement(s)
            AccessibleObject result = MemberUtils.setAccessibleWorkaround(accessibleObject);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(accessibleObject));
                memberUtils.verify(() -> MemberUtils.isPublic((Member) null), atLeast(1));
                memberUtils.verify(() -> MemberUtils.isPackageAccess(0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${709f2ca0-47bf-3e08-a799-d96c0e478c99}
    @Disabled()
    @Test()
    void setAccessibleWorkaroundWhenIsPackageAccessNotMGetDeclaringClassGetModifiers() {
        /* Branches:
         * (obj == null) : false
         * (obj.isAccessible()) : false
         * (!obj.isAccessible()) : true
         * (isPublic(m)) : true
         * (isPackageAccess(m.getDeclaringClass().getModifiers())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MemberUtils> memberUtils = mockStatic(MemberUtils.class, CALLS_REAL_METHODS)) {
            memberUtils.when(() -> MemberUtils.isPublic((Member) null)).thenReturn(true);
            memberUtils.when(() -> MemberUtils.isPackageAccess(0)).thenReturn(false);
            //TODO: Needs initialization with real value
            AccessibleObject accessibleObject = null;
            //Act Statement(s)
            AccessibleObject result = MemberUtils.setAccessibleWorkaround(accessibleObject);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(accessibleObject));
                memberUtils.verify(() -> MemberUtils.isPublic((Member) null), atLeast(1));
                memberUtils.verify(() -> MemberUtils.isPackageAccess(0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7bc1667e-e337-359b-afa8-fa8c60396e4a}
    @Test()
    void isPackageAccessWhenModifiersAndACCESS_TESTEquals0() {
        /* Branches:
         * ((modifiers & ACCESS_TEST) == 0) : true
         */
        //Act Statement(s)
        boolean result = MemberUtils.isPackageAccess(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${dd264f16-b6f2-34d4-bcdd-02db8540ddab}
    @Test()
    void isPackageAccessWhenModifiersAndACCESS_TESTNotEquals0() {
        /* Branches:
         * ((modifiers & ACCESS_TEST) == 0) : false
         */
        //Act Statement(s)
        boolean result = MemberUtils.isPackageAccess(1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${d269e754-85c5-339e-8c29-fc3847b5edfe}
    @Disabled()
    @Test()
    void isPublicWhenModifierIsPublicMemberGetModifiers() {
        /* Branches:
         * (member != null) : true
         * (Modifier.isPublic(member.getModifiers())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Member member = null;
        //Act Statement(s)
        boolean result = MemberUtils.isPublic(member);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${97f9abde-b883-34df-b7ef-74458c58714e}
    @Test()
    void isPublicWhenModifierNotIsPublicMemberGetModifiers() {
        /* Branches:
         * (member != null) : true
         * (Modifier.isPublic(member.getModifiers())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Member member = null;
        //Act Statement(s)
        boolean result = MemberUtils.isPublic(member);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${1b5c80a1-3af8-3bc8-b4bf-c7bf2c25c47e}
    @Disabled()
    @Test()
    void isStaticWhenModifierIsStaticMemberGetModifiers() {
        /* Branches:
         * (member != null) : true
         * (Modifier.isStatic(member.getModifiers())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Member member = null;
        //Act Statement(s)
        boolean result = MemberUtils.isStatic(member);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${eec77fca-d364-3d69-8c20-5e8a40fa7e7c}
    @Test()
    void isStaticWhenModifierNotIsStaticMemberGetModifiers() {
        /* Branches:
         * (member != null) : true
         * (Modifier.isStatic(member.getModifiers())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Member member = null;
        //Act Statement(s)
        boolean result = MemberUtils.isStatic(member);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${07acd1b4-5cbc-37a0-8006-f6815e735321}
    @Disabled()
    @Test()
    void isAccessibleWhenMemberNotIsSynthetic() {
        /* Branches:
         * (isPublic(member)) : true
         * (!member.isSynthetic()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MemberUtils> memberUtils = mockStatic(MemberUtils.class, CALLS_REAL_METHODS)) {
            memberUtils.when(() -> MemberUtils.isPublic((Member) null)).thenReturn(true);
            //TODO: Needs initialization with real value
            Member member = null;
            //Act Statement(s)
            boolean result = MemberUtils.isAccessible(member);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                memberUtils.verify(() -> MemberUtils.isPublic((Member) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5495a6df-1953-3761-a456-ec862234cfa3}
    @Disabled()
    @Test()
    void isAccessibleWhenMemberIsSynthetic() {
        /* Branches:
         * (isPublic(member)) : true
         * (!member.isSynthetic()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MemberUtils> memberUtils = mockStatic(MemberUtils.class, CALLS_REAL_METHODS)) {
            memberUtils.when(() -> MemberUtils.isPublic((Member) null)).thenReturn(true);
            //TODO: Needs initialization with real value
            Member member = null;
            //Act Statement(s)
            boolean result = MemberUtils.isAccessible(member);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                memberUtils.verify(() -> MemberUtils.isPublic((Member) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2b0d7b1a-efdd-397f-8081-c74d3afff3bc}
    @Disabled()
    @Test()
    void compareConstructorFitWhenSrcArgsLengthLessThanNormalArgsLen() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Constructor<?> constructor = null;
        //TODO: Needs initialization with real value
        Constructor<?> constructor2 = null;
        Class<?>[] classArray = new Class[]{};
        //Act Statement(s)
        int result = MemberUtils.compareConstructorFit(constructor, constructor2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${0d045635-19a4-38f9-95c0-440ddeb94ca5}
    @Disabled()
    @Test()
    void compareConstructorFitWhenExplicitArrayForVarargs() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (i < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (destClass.isPrimitive()) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getPrimitivePromotionCost method
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < destArgs.length) : false  #  inside getTotalTransformationCost method
         * (srcArgs.length == destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1] != null) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1].isArray()) : true  #  inside getTotalTransformationCost method
         * (noVarArgsPassed) : false  #  inside getTotalTransformationCost method
         * (explicitArrayForVarargs) : true  #  inside getTotalTransformationCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Constructor<?> constructor = null;
        //TODO: Needs initialization with real value
        Constructor<?> constructor2 = null;
        Class<?>[] classArray = new Class[]{(Class) null, Object.class, Object.class};
        //Act Statement(s)
        int result = MemberUtils.compareConstructorFit(constructor, constructor2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${71b7d7a9-6446-364b-92da-a8c8444f7086}
    @Disabled()
    @Test()
    void compareConstructorFitWhenILessThanSrcArgsLength() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (i < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (destClass.isPrimitive()) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getPrimitivePromotionCost method
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < destArgs.length) : false  #  inside getTotalTransformationCost method
         * (srcArgs.length == destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1] != null) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1].isArray()) : false  #  inside getTotalTransformationCost method
         * (noVarArgsPassed) : false  #  inside getTotalTransformationCost method
         * (explicitArrayForVarargs) : false  #  inside getTotalTransformationCost method
         * (i < srcArgs.length) : true  #  inside getTotalTransformationCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Constructor<?> constructor = null;
        //TODO: Needs initialization with real value
        Constructor<?> constructor2 = null;
        Class<?>[] classArray = new Class[]{(Class) null, Object.class, (Class) null};
        //Act Statement(s)
        int result = MemberUtils.compareConstructorFit(constructor, constructor2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${6d805fa9-d46d-33f7-a8c4-7cd7e8f874df}
    @Disabled()
    @Test()
    void compareConstructorFitWhenDestClassNotIsInterfaceAndSrcClassIsNull() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (i < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (destClass.isPrimitive()) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getPrimitivePromotionCost method
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length == destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1] != null) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1].isArray()) : true  #  inside getTotalTransformationCost method
         * (noVarArgsPassed) : true  #  inside getTotalTransformationCost method
         * (srcClass != null) : true  #  inside getObjectTransformationCost method
         * (!destClass.equals(srcClass)) : true  #  inside getObjectTransformationCost method
         * (destClass.isInterface()) : false  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getObjectTransformationCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Constructor<?> constructor = null;
        //TODO: Needs initialization with real value
        Constructor<?> constructor2 = null;
        Class<?>[] classArray = new Class[]{};
        //Act Statement(s)
        int result = MemberUtils.compareConstructorFit(constructor, constructor2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${ae88d872-443a-32e0-96bc-390c656b3abd}
    @Disabled()
    @Test()
    void compareConstructorFitWhenClassUtilsIsAssignableSrcClassDestClassAndSrcClassIsNotNull() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (i < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (destClass.isPrimitive()) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getPrimitivePromotionCost method
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < destArgs.length) : false  #  inside getTotalTransformationCost method
         * (srcArgs.length == destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1] != null) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1].isArray()) : true  #  inside getTotalTransformationCost method
         * (noVarArgsPassed) : false  #  inside getTotalTransformationCost method
         * (explicitArrayForVarargs) : true  #  inside getTotalTransformationCost method
         * (srcClass != null) : true  #  inside getObjectTransformationCost method
         * (!destClass.equals(srcClass)) : true  #  inside getObjectTransformationCost method
         * (destClass.isInterface()) : true  #  inside getObjectTransformationCost method
         * (ClassUtils.isAssignable(srcClass, destClass)) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : false  #  inside getObjectTransformationCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Constructor<?> constructor = null;
        //TODO: Needs initialization with real value
        Constructor<?> constructor2 = null;
        Class<?>[] classArray = new Class[]{(Class) null, Object.class, Object.class};
        //Act Statement(s)
        int result = MemberUtils.compareConstructorFit(constructor, constructor2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${20de6bb0-f07d-32a0-abd2-8155d6e5f87a}
    @Disabled()
    @Test()
    void compareConstructorFitWhenClassUtilsNotIsAssignableSrcClassDestClassAndSrcClassIsNull() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (i < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (destClass.isPrimitive()) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getPrimitivePromotionCost method
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < destArgs.length) : false  #  inside getTotalTransformationCost method
         * (srcArgs.length == destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1] != null) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1].isArray()) : true  #  inside getTotalTransformationCost method
         * (noVarArgsPassed) : false  #  inside getTotalTransformationCost method
         * (explicitArrayForVarargs) : true  #  inside getTotalTransformationCost method
         * (srcClass != null) : true  #  inside getObjectTransformationCost method
         * (!destClass.equals(srcClass)) : true  #  inside getObjectTransformationCost method
         * (destClass.isInterface()) : true  #  inside getObjectTransformationCost method
         * (ClassUtils.isAssignable(srcClass, destClass)) : false  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getObjectTransformationCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Constructor<?> constructor = null;
        //TODO: Needs initialization with real value
        Constructor<?> constructor2 = null;
        Class<?>[] classArray = new Class[]{(Class) null, Object.class, Object.class};
        //Act Statement(s)
        int result = MemberUtils.compareConstructorFit(constructor, constructor2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${e6e62e5c-6482-3c92-8b00-fae0ee645cb5}
    @Disabled()
    @Test()
    void compareConstructorFitWhenILessThanORDERED_PRIMITIVE_TYPESLengthMinus1() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (i < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (destClass.isPrimitive()) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getPrimitivePromotionCost method
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < destArgs.length) : false  #  inside getTotalTransformationCost method
         * (srcArgs.length == destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1] != null) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1].isArray()) : true  #  inside getTotalTransformationCost method
         * (noVarArgsPassed) : false  #  inside getTotalTransformationCost method
         * (explicitArrayForVarargs) : true  #  inside getTotalTransformationCost method
         * (!cls.isPrimitive()) : true  #  inside getPrimitivePromotionCost method
         * (cls != destClass) : true  #  inside getPrimitivePromotionCost method
         * (i < ORDERED_PRIMITIVE_TYPES.length) : true  #  inside getPrimitivePromotionCost method
         * (cls == ORDERED_PRIMITIVE_TYPES[i]) : true  #  inside getPrimitivePromotionCost method
         * (i < ORDERED_PRIMITIVE_TYPES.length - 1) : true  #  inside getPrimitivePromotionCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Constructor<?> constructor = null;
        //TODO: Needs initialization with real value
        Constructor<?> constructor2 = null;
        Class<?>[] classArray = new Class[]{(Class) null, Object.class, Object.class};
        //Act Statement(s)
        int result = MemberUtils.compareConstructorFit(constructor, constructor2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${e0791214-e27f-3388-9e50-a9b118fa1cb6}
    @Disabled()
    @Test()
    void compareConstructorFitWhenDestClassIsInterfaceAndClassUtilsIsAssignableSrcClassDestClassAndSrcClassIsNotNull() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (i < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (destClass.isPrimitive()) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getPrimitivePromotionCost method
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < destArgs.length) : false  #  inside getTotalTransformationCost method
         * (srcArgs.length == destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1] != null) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1].isArray()) : false  #  inside getTotalTransformationCost method
         * (noVarArgsPassed) : false  #  inside getTotalTransformationCost method
         * (explicitArrayForVarargs) : false  #  inside getTotalTransformationCost method
         * (i < srcArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcClass != null) : true  #  inside getObjectTransformationCost method
         * (!destClass.equals(srcClass)) : true  #  inside getObjectTransformationCost method
         * (destClass.isInterface()) : true  #  inside getObjectTransformationCost method
         * (ClassUtils.isAssignable(srcClass, destClass)) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : false  #  inside getObjectTransformationCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Constructor<?> constructor = null;
        //TODO: Needs initialization with real value
        Constructor<?> constructor2 = null;
        Class<?>[] classArray = new Class[]{(Class) null, Object.class, Object.class};
        //Act Statement(s)
        int result = MemberUtils.compareConstructorFit(constructor, constructor2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${24f3be44-5cd1-3aef-b06b-6ffd99eeff8e}
    @Disabled()
    @Test()
    void compareConstructorFitWhenDestClassIsInterfaceAndClassUtilsNotIsAssignableSrcClassDestClassAndSrcClassIsNull() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (i < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (destClass.isPrimitive()) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getPrimitivePromotionCost method
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < destArgs.length) : false  #  inside getTotalTransformationCost method
         * (srcArgs.length == destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1] != null) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1].isArray()) : false  #  inside getTotalTransformationCost method
         * (noVarArgsPassed) : false  #  inside getTotalTransformationCost method
         * (explicitArrayForVarargs) : false  #  inside getTotalTransformationCost method
         * (i < srcArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcClass != null) : true  #  inside getObjectTransformationCost method
         * (!destClass.equals(srcClass)) : true  #  inside getObjectTransformationCost method
         * (destClass.isInterface()) : true  #  inside getObjectTransformationCost method
         * (ClassUtils.isAssignable(srcClass, destClass)) : false  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getObjectTransformationCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Constructor<?> constructor = null;
        //TODO: Needs initialization with real value
        Constructor<?> constructor2 = null;
        Class<?>[] classArray = new Class[]{(Class) null, Object.class, Object.class};
        //Act Statement(s)
        int result = MemberUtils.compareConstructorFit(constructor, constructor2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${8abdb761-cf2d-31bf-aa23-e5e36b0ce3e3}
    @Disabled()
    @Test()
    void compareConstructorFitWhenILessThanORDERED_PRIMITIVE_TYPESLengthAndClsEqualsIIndexOfORDERED_PRIMITIVE_TYPESAndILessThanO() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (i < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (destClass.isPrimitive()) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getPrimitivePromotionCost method
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < destArgs.length) : false  #  inside getTotalTransformationCost method
         * (srcArgs.length == destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1] != null) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1].isArray()) : false  #  inside getTotalTransformationCost method
         * (noVarArgsPassed) : false  #  inside getTotalTransformationCost method
         * (explicitArrayForVarargs) : false  #  inside getTotalTransformationCost method
         * (i < srcArgs.length) : true  #  inside getTotalTransformationCost method
         * (!cls.isPrimitive()) : true  #  inside getPrimitivePromotionCost method
         * (cls != destClass) : true  #  inside getPrimitivePromotionCost method
         * (i < ORDERED_PRIMITIVE_TYPES.length) : true  #  inside getPrimitivePromotionCost method
         * (cls == ORDERED_PRIMITIVE_TYPES[i]) : true  #  inside getPrimitivePromotionCost method
         * (i < ORDERED_PRIMITIVE_TYPES.length - 1) : true  #  inside getPrimitivePromotionCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Constructor<?> constructor = null;
        //TODO: Needs initialization with real value
        Constructor<?> constructor2 = null;
        Class<?>[] classArray = new Class[]{(Class) null, Object.class, Object.class};
        //Act Statement(s)
        int result = MemberUtils.compareConstructorFit(constructor, constructor2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${bb724be1-d888-3103-b9d3-03f1b6730e5c}
    @Disabled()
    @Test()
    void compareMethodFitWhenSrcArgsLengthLessThanNormalArgsLen() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Method method = null;
        //TODO: Needs initialization with real value
        Method method2 = null;
        Class<?>[] classArray = new Class[]{};
        //Act Statement(s)
        int result = MemberUtils.compareMethodFit(method, method2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${24204f4b-de3e-3e60-94a9-91308c131d64}
    @Disabled()
    @Test()
    void compareMethodFitWhenExplicitArrayForVarargs() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (i < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (destClass.isPrimitive()) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getPrimitivePromotionCost method
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < destArgs.length) : false  #  inside getTotalTransformationCost method
         * (srcArgs.length == destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1] != null) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1].isArray()) : true  #  inside getTotalTransformationCost method
         * (noVarArgsPassed) : false  #  inside getTotalTransformationCost method
         * (explicitArrayForVarargs) : true  #  inside getTotalTransformationCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Method method = null;
        //TODO: Needs initialization with real value
        Method method2 = null;
        Class<?>[] classArray = new Class[]{(Class) null, Object.class, Object.class};
        //Act Statement(s)
        int result = MemberUtils.compareMethodFit(method, method2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${d19da7d1-5044-3fca-96a4-0d3c438a4ee1}
    @Disabled()
    @Test()
    void compareMethodFitWhenILessThanSrcArgsLength() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (i < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (destClass.isPrimitive()) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getPrimitivePromotionCost method
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < destArgs.length) : false  #  inside getTotalTransformationCost method
         * (srcArgs.length == destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1] != null) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1].isArray()) : false  #  inside getTotalTransformationCost method
         * (noVarArgsPassed) : false  #  inside getTotalTransformationCost method
         * (explicitArrayForVarargs) : false  #  inside getTotalTransformationCost method
         * (i < srcArgs.length) : true  #  inside getTotalTransformationCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Method method = null;
        //TODO: Needs initialization with real value
        Method method2 = null;
        Class<?>[] classArray = new Class[]{(Class) null, Object.class, (Class) null};
        //Act Statement(s)
        int result = MemberUtils.compareMethodFit(method, method2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${f8c7d3ec-b6ae-3e1a-9216-b048ecf082cd}
    @Disabled()
    @Test()
    void compareMethodFitWhenDestClassNotIsInterfaceAndSrcClassIsNull() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (i < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (destClass.isPrimitive()) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getPrimitivePromotionCost method
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length == destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1] != null) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1].isArray()) : true  #  inside getTotalTransformationCost method
         * (noVarArgsPassed) : true  #  inside getTotalTransformationCost method
         * (srcClass != null) : true  #  inside getObjectTransformationCost method
         * (!destClass.equals(srcClass)) : true  #  inside getObjectTransformationCost method
         * (destClass.isInterface()) : false  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getObjectTransformationCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Method method = null;
        //TODO: Needs initialization with real value
        Method method2 = null;
        Class<?>[] classArray = new Class[]{};
        //Act Statement(s)
        int result = MemberUtils.compareMethodFit(method, method2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${45fc32b7-c4ed-31d2-9694-d4bbe8c9ba74}
    @Disabled()
    @Test()
    void compareMethodFitWhenClassUtilsIsAssignableSrcClassDestClassAndSrcClassIsNotNull() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (i < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (destClass.isPrimitive()) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getPrimitivePromotionCost method
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < destArgs.length) : false  #  inside getTotalTransformationCost method
         * (srcArgs.length == destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1] != null) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1].isArray()) : true  #  inside getTotalTransformationCost method
         * (noVarArgsPassed) : false  #  inside getTotalTransformationCost method
         * (explicitArrayForVarargs) : true  #  inside getTotalTransformationCost method
         * (srcClass != null) : true  #  inside getObjectTransformationCost method
         * (!destClass.equals(srcClass)) : true  #  inside getObjectTransformationCost method
         * (destClass.isInterface()) : true  #  inside getObjectTransformationCost method
         * (ClassUtils.isAssignable(srcClass, destClass)) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : false  #  inside getObjectTransformationCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Method method = null;
        //TODO: Needs initialization with real value
        Method method2 = null;
        Class<?>[] classArray = new Class[]{(Class) null, Object.class, Object.class};
        //Act Statement(s)
        int result = MemberUtils.compareMethodFit(method, method2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${d5a3b637-052b-370b-b174-2612524873f1}
    @Disabled()
    @Test()
    void compareMethodFitWhenClassUtilsNotIsAssignableSrcClassDestClassAndSrcClassIsNull() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (i < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (destClass.isPrimitive()) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getPrimitivePromotionCost method
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < destArgs.length) : false  #  inside getTotalTransformationCost method
         * (srcArgs.length == destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1] != null) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1].isArray()) : true  #  inside getTotalTransformationCost method
         * (noVarArgsPassed) : false  #  inside getTotalTransformationCost method
         * (explicitArrayForVarargs) : true  #  inside getTotalTransformationCost method
         * (srcClass != null) : true  #  inside getObjectTransformationCost method
         * (!destClass.equals(srcClass)) : true  #  inside getObjectTransformationCost method
         * (destClass.isInterface()) : true  #  inside getObjectTransformationCost method
         * (ClassUtils.isAssignable(srcClass, destClass)) : false  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getObjectTransformationCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Method method = null;
        //TODO: Needs initialization with real value
        Method method2 = null;
        Class<?>[] classArray = new Class[]{(Class) null, Object.class, Object.class};
        //Act Statement(s)
        int result = MemberUtils.compareMethodFit(method, method2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${804a04b0-aa3e-3d2d-8969-1ae3ea62c410}
    @Disabled()
    @Test()
    void compareMethodFitWhenILessThanORDERED_PRIMITIVE_TYPESLengthMinus1() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (i < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (destClass.isPrimitive()) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getPrimitivePromotionCost method
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < destArgs.length) : false  #  inside getTotalTransformationCost method
         * (srcArgs.length == destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1] != null) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1].isArray()) : true  #  inside getTotalTransformationCost method
         * (noVarArgsPassed) : false  #  inside getTotalTransformationCost method
         * (explicitArrayForVarargs) : true  #  inside getTotalTransformationCost method
         * (!cls.isPrimitive()) : true  #  inside getPrimitivePromotionCost method
         * (cls != destClass) : true  #  inside getPrimitivePromotionCost method
         * (i < ORDERED_PRIMITIVE_TYPES.length) : true  #  inside getPrimitivePromotionCost method
         * (cls == ORDERED_PRIMITIVE_TYPES[i]) : true  #  inside getPrimitivePromotionCost method
         * (i < ORDERED_PRIMITIVE_TYPES.length - 1) : true  #  inside getPrimitivePromotionCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Method method = null;
        //TODO: Needs initialization with real value
        Method method2 = null;
        Class<?>[] classArray = new Class[]{(Class) null, Object.class, Object.class};
        //Act Statement(s)
        int result = MemberUtils.compareMethodFit(method, method2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${1c5473c9-0aee-381d-bbf1-8cb8d6717bb1}
    @Disabled()
    @Test()
    void compareMethodFitWhenDestClassIsInterfaceAndClassUtilsIsAssignableSrcClassDestClassAndSrcClassIsNotNull() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (i < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (destClass.isPrimitive()) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getPrimitivePromotionCost method
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < destArgs.length) : false  #  inside getTotalTransformationCost method
         * (srcArgs.length == destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1] != null) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1].isArray()) : false  #  inside getTotalTransformationCost method
         * (noVarArgsPassed) : false  #  inside getTotalTransformationCost method
         * (explicitArrayForVarargs) : false  #  inside getTotalTransformationCost method
         * (i < srcArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcClass != null) : true  #  inside getObjectTransformationCost method
         * (!destClass.equals(srcClass)) : true  #  inside getObjectTransformationCost method
         * (destClass.isInterface()) : true  #  inside getObjectTransformationCost method
         * (ClassUtils.isAssignable(srcClass, destClass)) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : false  #  inside getObjectTransformationCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Method method = null;
        //TODO: Needs initialization with real value
        Method method2 = null;
        Class<?>[] classArray = new Class[]{(Class) null, Object.class, Object.class};
        //Act Statement(s)
        int result = MemberUtils.compareMethodFit(method, method2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${833e3331-a7b0-35d9-87e6-f8fa39f2d380}
    @Disabled()
    @Test()
    void compareMethodFitWhenDestClassIsInterfaceAndClassUtilsNotIsAssignableSrcClassDestClassAndSrcClassIsNull() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (i < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (destClass.isPrimitive()) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getPrimitivePromotionCost method
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < destArgs.length) : false  #  inside getTotalTransformationCost method
         * (srcArgs.length == destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1] != null) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1].isArray()) : false  #  inside getTotalTransformationCost method
         * (noVarArgsPassed) : false  #  inside getTotalTransformationCost method
         * (explicitArrayForVarargs) : false  #  inside getTotalTransformationCost method
         * (i < srcArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcClass != null) : true  #  inside getObjectTransformationCost method
         * (!destClass.equals(srcClass)) : true  #  inside getObjectTransformationCost method
         * (destClass.isInterface()) : true  #  inside getObjectTransformationCost method
         * (ClassUtils.isAssignable(srcClass, destClass)) : false  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getObjectTransformationCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Method method = null;
        //TODO: Needs initialization with real value
        Method method2 = null;
        Class<?>[] classArray = new Class[]{(Class) null, Object.class, Object.class};
        //Act Statement(s)
        int result = MemberUtils.compareMethodFit(method, method2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${a3f2f69e-d736-3754-b52a-4b63257784d6}
    @Disabled()
    @Test()
    void compareMethodFitWhenILessThanORDERED_PRIMITIVE_TYPESLengthAndClsEqualsIIndexOfORDERED_PRIMITIVE_TYPESAndILessThanORDERE() {
        /* Branches:
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (i < normalArgsLen) : true  #  inside getTotalTransformationCost method
         * (destClass.isPrimitive()) : true  #  inside getObjectTransformationCost method
         * (srcClass == null) : true  #  inside getPrimitivePromotionCost method
         * (isVarArgs) : true  #  inside getTotalTransformationCost method
         * (srcArgs.length < destArgs.length) : false  #  inside getTotalTransformationCost method
         * (srcArgs.length == destArgs.length) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1] != null) : true  #  inside getTotalTransformationCost method
         * (srcArgs[srcArgs.length - 1].isArray()) : false  #  inside getTotalTransformationCost method
         * (noVarArgsPassed) : false  #  inside getTotalTransformationCost method
         * (explicitArrayForVarargs) : false  #  inside getTotalTransformationCost method
         * (i < srcArgs.length) : true  #  inside getTotalTransformationCost method
         * (!cls.isPrimitive()) : true  #  inside getPrimitivePromotionCost method
         * (cls != destClass) : true  #  inside getPrimitivePromotionCost method
         * (i < ORDERED_PRIMITIVE_TYPES.length) : true  #  inside getPrimitivePromotionCost method
         * (cls == ORDERED_PRIMITIVE_TYPES[i]) : true  #  inside getPrimitivePromotionCost method
         * (i < ORDERED_PRIMITIVE_TYPES.length - 1) : true  #  inside getPrimitivePromotionCost method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Method method = null;
        //TODO: Needs initialization with real value
        Method method2 = null;
        Class<?>[] classArray = new Class[]{(Class) null, Object.class, Object.class};
        //Act Statement(s)
        int result = MemberUtils.compareMethodFit(method, method2, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${3dfb2d3a-3ece-38c4-b87a-6f2b575c73da}
    @Disabled()
    @Test()
    void isMatchingMethodWhenClassUtilsIsAssignableParameterTypesMethodParameterTypesTrue() {
        /* Branches:
         * (ClassUtils.isAssignable(parameterTypes, methodParameterTypes, true)) : true  #  inside isMatchingExecutable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Method method = null;
        Class<?>[] classArray = new Class[]{};
        //Act Statement(s)
        boolean result = MemberUtils.isMatchingMethod(method, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${0fed05c8-b9f6-3993-a0e6-f47faf065389}
    @Disabled()
    @Test()
    void isMatchingMethodWhenMethodNotIsVarArgs() {
        /* Branches:
         * (ClassUtils.isAssignable(parameterTypes, methodParameterTypes, true)) : false  #  inside isMatchingExecutable method
         * (method.isVarArgs()) : false  #  inside isMatchingExecutable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Method method = null;
        Class<?>[] classArray = new Class[]{};
        //Act Statement(s)
        boolean result = MemberUtils.isMatchingMethod(method, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${ec771de4-52ec-3386-a92b-e0d167b9e49e}
    @Disabled()
    @Test()
    void isMatchingMethodWhenClassUtilsNotIsAssignableIIndexOfParameterTypesIIndexOfMethodParameterTypesTrue() {
        /* Branches:
         * (ClassUtils.isAssignable(parameterTypes, methodParameterTypes, true)) : false  #  inside isMatchingExecutable method
         * (method.isVarArgs()) : true  #  inside isMatchingExecutable method
         * (i < methodParameterTypes.length - 1) : true  #  inside isMatchingExecutable method
         * (i < parameterTypes.length) : true  #  inside isMatchingExecutable method
         * (!ClassUtils.isAssignable(parameterTypes[i], methodParameterTypes[i], true)) : true  #  inside isMatchingExecutable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Method method = null;
        Class<?>[] classArray = new Class[]{Object.class};
        //Act Statement(s)
        boolean result = MemberUtils.isMatchingMethod(method, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${3c5b0e49-36d3-3a7c-8c09-6ef51f5a1a3d}
    @Disabled()
    @Test()
    void isMatchingMethodWhenILessThanParameterTypesLengthAndClassUtilsNotIsAssignableIIndexOfParameterTypesVarArgParameterTypeT() {
        /* Branches:
         * (ClassUtils.isAssignable(parameterTypes, methodParameterTypes, true)) : false  #  inside isMatchingExecutable method
         * (method.isVarArgs()) : true  #  inside isMatchingExecutable method
         * (i < methodParameterTypes.length - 1) : true  #  inside isMatchingExecutable method
         * (i < parameterTypes.length) : true  #  inside isMatchingExecutable method
         * (!ClassUtils.isAssignable(parameterTypes[i], methodParameterTypes[i], true)) : false  #  inside isMatchingExecutable method
         * (i < parameterTypes.length) : true  #  inside isMatchingExecutable method
         * (!ClassUtils.isAssignable(parameterTypes[i], varArgParameterType, true)) : true  #  inside isMatchingExecutable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Method method = null;
        Class<?>[] classArray = new Class[]{Object.class, Object.class};
        //Act Statement(s)
        boolean result = MemberUtils.isMatchingMethod(method, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${817c6a92-3eef-34ee-a730-66114a98e362}
    @Disabled()
    @Test()
    void isMatchingMethodWhenILessThanParameterTypesLengthAndClassUtilsIsAssignableIIndexOfParameterTypesVarArgParameterTypeTrue() {
        /* Branches:
         * (ClassUtils.isAssignable(parameterTypes, methodParameterTypes, true)) : false  #  inside isMatchingExecutable method
         * (method.isVarArgs()) : true  #  inside isMatchingExecutable method
         * (i < methodParameterTypes.length - 1) : true  #  inside isMatchingExecutable method
         * (i < parameterTypes.length) : true  #  inside isMatchingExecutable method
         * (!ClassUtils.isAssignable(parameterTypes[i], methodParameterTypes[i], true)) : false  #  inside isMatchingExecutable method
         * (i < parameterTypes.length) : true  #  inside isMatchingExecutable method
         * (!ClassUtils.isAssignable(parameterTypes[i], varArgParameterType, true)) : false  #  inside isMatchingExecutable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Method method = null;
        Class<?>[] classArray = new Class[]{Object.class, Object.class};
        //Act Statement(s)
        boolean result = MemberUtils.isMatchingMethod(method, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${52b20917-4a26-39b8-b759-785bc901faa7}
    @Disabled()
    @Test()
    void isMatchingConstructorWhenClassUtilsIsAssignableParameterTypesMethodParameterTypesTrue() {
        /* Branches:
         * (ClassUtils.isAssignable(parameterTypes, methodParameterTypes, true)) : true  #  inside isMatchingExecutable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Constructor<?> constructor = null;
        Class<?>[] classArray = new Class[]{};
        //Act Statement(s)
        boolean result = MemberUtils.isMatchingConstructor(constructor, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${991df8cd-f8ad-30a3-aceb-40450f6bf233}
    @Disabled()
    @Test()
    void isMatchingConstructorWhenMethodNotIsVarArgs() {
        /* Branches:
         * (ClassUtils.isAssignable(parameterTypes, methodParameterTypes, true)) : false  #  inside isMatchingExecutable method
         * (method.isVarArgs()) : false  #  inside isMatchingExecutable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Constructor<?> constructor = null;
        Class<?>[] classArray = new Class[]{};
        //Act Statement(s)
        boolean result = MemberUtils.isMatchingConstructor(constructor, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${4297ac72-6d66-330b-adb6-857ab6ec7a43}
    @Disabled()
    @Test()
    void isMatchingConstructorWhenClassUtilsNotIsAssignableIIndexOfParameterTypesIIndexOfMethodParameterTypesTrue() {
        /* Branches:
         * (ClassUtils.isAssignable(parameterTypes, methodParameterTypes, true)) : false  #  inside isMatchingExecutable method
         * (method.isVarArgs()) : true  #  inside isMatchingExecutable method
         * (i < methodParameterTypes.length - 1) : true  #  inside isMatchingExecutable method
         * (i < parameterTypes.length) : true  #  inside isMatchingExecutable method
         * (!ClassUtils.isAssignable(parameterTypes[i], methodParameterTypes[i], true)) : true  #  inside isMatchingExecutable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Constructor<?> constructor = null;
        Class<?>[] classArray = new Class[]{Object.class};
        //Act Statement(s)
        boolean result = MemberUtils.isMatchingConstructor(constructor, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${dcef5ba7-022f-3d25-a864-e8922f985b2b}
    @Disabled()
    @Test()
    void isMatchingConstructorWhenILessThanParameterTypesLengthAndClassUtilsNotIsAssignableIIndexOfParameterTypesVarArgParameter() {
        /* Branches:
         * (ClassUtils.isAssignable(parameterTypes, methodParameterTypes, true)) : false  #  inside isMatchingExecutable method
         * (method.isVarArgs()) : true  #  inside isMatchingExecutable method
         * (i < methodParameterTypes.length - 1) : true  #  inside isMatchingExecutable method
         * (i < parameterTypes.length) : true  #  inside isMatchingExecutable method
         * (!ClassUtils.isAssignable(parameterTypes[i], methodParameterTypes[i], true)) : false  #  inside isMatchingExecutable method
         * (i < parameterTypes.length) : true  #  inside isMatchingExecutable method
         * (!ClassUtils.isAssignable(parameterTypes[i], varArgParameterType, true)) : true  #  inside isMatchingExecutable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Constructor<?> constructor = null;
        Class<?>[] classArray = new Class[]{Object.class, Object.class};
        //Act Statement(s)
        boolean result = MemberUtils.isMatchingConstructor(constructor, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${d446dabd-1fab-3d27-ba11-55d7c027c23c}
    @Disabled()
    @Test()
    void isMatchingConstructorWhenILessThanParameterTypesLengthAndClassUtilsIsAssignableIIndexOfParameterTypesVarArgParameterTyp() {
        /* Branches:
         * (ClassUtils.isAssignable(parameterTypes, methodParameterTypes, true)) : false  #  inside isMatchingExecutable method
         * (method.isVarArgs()) : true  #  inside isMatchingExecutable method
         * (i < methodParameterTypes.length - 1) : true  #  inside isMatchingExecutable method
         * (i < parameterTypes.length) : true  #  inside isMatchingExecutable method
         * (!ClassUtils.isAssignable(parameterTypes[i], methodParameterTypes[i], true)) : false  #  inside isMatchingExecutable method
         * (i < parameterTypes.length) : true  #  inside isMatchingExecutable method
         * (!ClassUtils.isAssignable(parameterTypes[i], varArgParameterType, true)) : false  #  inside isMatchingExecutable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Constructor<?> constructor = null;
        Class<?>[] classArray = new Class[]{Object.class, Object.class};
        //Act Statement(s)
        boolean result = MemberUtils.isMatchingConstructor(constructor, classArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }
}
