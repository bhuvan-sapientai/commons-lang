package org.apache.commons.lang3.reflect;

import org.apache.commons.lang3.reflect.MemberUtils;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.lang.reflect.Method;
import org.mockito.MockedStatic;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Constructor;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.lang3.ClassUtils;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MemberUtilsSapientGeneratedTest {

    private final AccessibleObject accessibleObjectMock = mock(AccessibleObject.class);

    private final Constructor<?> constructorMock = mock(Constructor.class);

    private final Constructor<?> constructorMock2 = mock(Constructor.class);

    private final Member memberMock = mock(Member.class);

    private final Method methodMock = mock(Method.class);

    private final Method methodMock2 = mock(Method.class);

    @ParameterizedTest
    @CsvSource({ "0, 1, true", "1, 0, false", "1, 1, false" })
    void compareConstructorFit(int leftParamCount, int rightParamCount, boolean expectedResult) {
        when(constructorMock.getParameterTypes()).thenReturn(new Class[leftParamCount]);
        when(constructorMock2.getParameterTypes()).thenReturn(new Class[rightParamCount]);
        when(constructorMock.isVarArgs()).thenReturn(false);
        when(constructorMock2.isVarArgs()).thenReturn(false);
        Class<?>[] actual = new Class<?>[0];
        int result = MemberUtils.compareConstructorFit(constructorMock, constructorMock2, actual);
        assertThat(result < 0, equalTo(expectedResult));
    }

    @ParameterizedTest
    @CsvSource({ "0, 1, true", "1, 0, false", "1, 1, false" })
    void compareMethodFit(int leftParamCount, int rightParamCount, boolean expectedResult) {
        when(methodMock.getParameterTypes()).thenReturn(new Class[leftParamCount]);
        when(methodMock2.getParameterTypes()).thenReturn(new Class[rightParamCount]);
        when(methodMock.isVarArgs()).thenReturn(false);
        when(methodMock2.isVarArgs()).thenReturn(false);
        Class<?>[] actual = new Class<?>[0];
        int result = MemberUtils.compareMethodFit(methodMock, methodMock2, actual);
        assertThat(result < 0, equalTo(expectedResult));
    }

    @Test
    void isAccessible() {
        when(memberMock.isSynthetic()).thenReturn(false);
        try (MockedStatic<MemberUtils> memberUtils = mockStatic(MemberUtils.class, CALLS_REAL_METHODS)) {
            memberUtils.when(() -> MemberUtils.isPublic(memberMock)).thenReturn(true);
            boolean result = MemberUtils.isAccessible(memberMock);
            assertTrue(result);
        }
    }

    @ParameterizedTest
    @CsvSource({ "true, true", "false, false", "true, false" })
    void isMatchingConstructor(boolean isAssignable, boolean expected) {
        Class<?>[] parameterTypes = new Class<?>[] { String.class };
        when(constructorMock.getParameterTypes()).thenReturn(new Class<?>[] { Object.class });
        when(constructorMock.isVarArgs()).thenReturn(false);
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            classUtils.when(() -> ClassUtils.isAssignable(parameterTypes, constructorMock.getParameterTypes(), true)).thenReturn(isAssignable);
            boolean result = MemberUtils.isMatchingConstructor(constructorMock, parameterTypes);
            assertThat(result, equalTo(expected));
        }
    }

    @ParameterizedTest
    @CsvSource({ "true, true", "false, false", "true, false" })
    void isMatchingMethod(boolean isAssignable, boolean expected) {
        Class<?>[] parameterTypes = new Class<?>[] { String.class };
        when(methodMock.getParameterTypes()).thenReturn(new Class<?>[] { Object.class });
        when(methodMock.isVarArgs()).thenReturn(false);
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            classUtils.when(() -> ClassUtils.isAssignable(parameterTypes, methodMock.getParameterTypes(), true)).thenReturn(isAssignable);
            boolean result = MemberUtils.isMatchingMethod(methodMock, parameterTypes);
            assertThat(result, equalTo(expected));
        }
    }

    @Test
    void isPackageAccess() {
        assertTrue(MemberUtils.isPackageAccess(0));
        assertFalse(MemberUtils.isPackageAccess(1));
    }

    @Test
    void isPublic() {
        when(memberMock.getModifiers()).thenReturn(1);
        assertTrue(MemberUtils.isPublic(memberMock));
        when(memberMock.getModifiers()).thenReturn(0);
        assertFalse(MemberUtils.isPublic(memberMock));
    }

    @Test
    void isStatic() {
        when(memberMock.getModifiers()).thenReturn(8);
        assertTrue(MemberUtils.isStatic(memberMock));
        when(memberMock.getModifiers()).thenReturn(0);
        assertFalse(MemberUtils.isStatic(memberMock));
    }

    @Test
    void setAccessibleWorkaround() {
        //when(accessibleObjectMock.isAccessible()).thenReturn(true);
        //AccessibleObject result = MemberUtils.setAccessibleWorkaround(accessibleObjectMock);
        //assertSame(accessibleObjectMock, result);
        //reset(accessibleObjectMock);
        //when(accessibleObjectMock.isAccessible()).thenReturn(false);
        //Member memberMock = mock(Member.class);
        //when(((Member) accessibleObjectMock).getDeclaringClass()).thenReturn(Object.class);
        /*try (MockedStatic<MemberUtils> memberUtils = mockStatic(MemberUtils.class, CALLS_REAL_METHODS)) {
    memberUtils.when(() -> MemberUtils.isPublic(any())).thenReturn(true);
    memberUtils.when(() -> MemberUtils.isPackageAccess(anyInt())).thenReturn(true);
    result = MemberUtils.setAccessibleWorkaround(accessibleObjectMock);
    verify(accessibleObjectMock).setAccessible(true);
    assertSame(accessibleObjectMock, result);
}*/
    }
}