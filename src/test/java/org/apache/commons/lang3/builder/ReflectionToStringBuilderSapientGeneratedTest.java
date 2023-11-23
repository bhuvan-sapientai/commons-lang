package org.apache.commons.lang3.builder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Collection;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ReflectionToStringBuilderSapientGeneratedTest {

    //Sapient generated method id: ${a782b162-c00f-3740-95cb-292b403dd0cb}
    @Test()
    void toNoNullStringArrayWhenCollectionIsNull() {
        /* Branches:
         * (collection == null) : true
         */
        //Arrange Statement(s)
        Collection<String> collection = null;
        //Act Statement(s)
        String[] result = ReflectionToStringBuilder.toNoNullStringArray(collection);
        String[] stringResultArray = new String[]{};
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
    }

    //Sapient generated method id: ${e3f0b4af-3667-3b11-be84-4a73ccbf4068}
    @Test()
    void toNoNullStringArrayWhenCollectionIsNotNull() {
        /* Branches:
         * (collection == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Collection<String> collection = new ArrayList<>();
        //Act Statement(s)
        String[] result = ReflectionToStringBuilder.toNoNullStringArray(collection);
        String[] stringResultArray = new String[]{};
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
    }

    //Sapient generated method id: ${06235828-218a-321a-b2b9-76f943a388ff}
    @Test()
    void toNoNullStringArray1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{(Object) null, (Object) null, (Object) null, (Object) null, (Object) null};
        //Act Statement(s)
        String[] result = ReflectionToStringBuilder.toNoNullStringArray(objectArray);
        String[] stringResultArray = new String[]{};
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
    }

    //Sapient generated method id: ${cabd8b84-4f2d-339c-9d46-60cffe26dac3}
    @Test()
    void toString1Test() {
        //Arrange Statement(s)
        try (MockedStatic<ReflectionToStringBuilder> reflectionToStringBuilder = mockStatic(ReflectionToStringBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            reflectionToStringBuilder.when(() -> ReflectionToStringBuilder.toString(object, (ToStringStyle) null, false, false, (Class) null)).thenReturn("return_of_toString1");
            //Act Statement(s)
            String result = ReflectionToStringBuilder.toString(object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toString1"));
                reflectionToStringBuilder.verify(() -> ReflectionToStringBuilder.toString(object, (ToStringStyle) null, false, false, (Class) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5e3eb7f2-e7a6-3bec-b66d-185c084763b9}
    @Test()
    void toString2Test() {
        //Arrange Statement(s)
        try (MockedStatic<ReflectionToStringBuilder> reflectionToStringBuilder = mockStatic(ReflectionToStringBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            reflectionToStringBuilder.when(() -> ReflectionToStringBuilder.toString(object, (ToStringStyle) null, false, false, (Class) null)).thenReturn("return_of_toString1");
            //TODO: Needs initialization with real value
            ToStringStyle toStringStyle = null;
            //Act Statement(s)
            String result = ReflectionToStringBuilder.toString(object, toStringStyle);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toString1"));
                reflectionToStringBuilder.verify(() -> ReflectionToStringBuilder.toString(object, (ToStringStyle) null, false, false, (Class) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3305bb8a-8a28-3f83-a75c-a4ae1e8c9a7a}
    @Test()
    void toString3Test() {
        //Arrange Statement(s)
        try (MockedStatic<ReflectionToStringBuilder> reflectionToStringBuilder = mockStatic(ReflectionToStringBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            reflectionToStringBuilder.when(() -> ReflectionToStringBuilder.toString(object, (ToStringStyle) null, false, false, (Class) null)).thenReturn("return_of_toString1");
            //TODO: Needs initialization with real value
            ToStringStyle toStringStyle = null;
            //Act Statement(s)
            String result = ReflectionToStringBuilder.toString(object, toStringStyle, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toString1"));
                reflectionToStringBuilder.verify(() -> ReflectionToStringBuilder.toString(object, (ToStringStyle) null, false, false, (Class) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ad124737-7b98-3afe-a9a1-8e1d58a78d68}
    @Test()
    void toString4Test() {
        //Arrange Statement(s)
        try (MockedStatic<ReflectionToStringBuilder> reflectionToStringBuilder = mockStatic(ReflectionToStringBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            reflectionToStringBuilder.when(() -> ReflectionToStringBuilder.toString(object, (ToStringStyle) null, false, false, (Class) null)).thenReturn("return_of_toString1");
            //TODO: Needs initialization with real value
            ToStringStyle toStringStyle = null;
            //Act Statement(s)
            String result = ReflectionToStringBuilder.toString(object, toStringStyle, false, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toString1"));
                reflectionToStringBuilder.verify(() -> ReflectionToStringBuilder.toString(object, (ToStringStyle) null, false, false, (Class) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f441ad93-715d-32a9-b5d1-cb5351f3e277}
    @Disabled()
    @Test()
    void toString5WhenClazzNotIsInstanceObjectThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 246)) : false  #  inside <init> method
         * (branch expression (line 249)) : false  #  inside <init> method
         * (clazz != null) : true  #  inside setUpToClass method
         * (object != null) : true  #  inside setUpToClass method
         * (!clazz.isInstance(object)) : true  #  inside setUpToClass method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ToStringBuilder> toStringBuilder = mockStatic(ToStringBuilder.class)) {
            toStringBuilder.when(() -> ToStringBuilder.getDefaultStyle()).thenReturn(null);
            Object object = new Object();
            ToStringStyle toStringStyle = null;
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                ReflectionToStringBuilder.toString(object, toStringStyle, false, false, false, Object.class);
            });
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Specified class is not a superclass of the object");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                toStringBuilder.verify(() -> ToStringBuilder.getDefaultStyle(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${dbdbe8ae-ac96-37d6-b6a4-bfce56c9a74b}
    @Disabled()
    @Test()
    void toString5WhenClazzIsInstanceObject() {
        /* Branches:
         * (branch expression (line 246)) : false  #  inside <init> method
         * (branch expression (line 249)) : false  #  inside <init> method
         * (clazz != null) : true  #  inside setUpToClass method
         * (object != null) : true  #  inside setUpToClass method
         * (!clazz.isInstance(object)) : false  #  inside setUpToClass method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ToStringBuilder> toStringBuilder = mockStatic(ToStringBuilder.class)) {
            toStringBuilder.when(() -> ToStringBuilder.getDefaultStyle()).thenReturn(null);
            Object object = new Object();
            ToStringStyle toStringStyle = null;
            //Act Statement(s)
            String result = ReflectionToStringBuilder.toString(object, toStringStyle, false, false, false, Object.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                toStringBuilder.verify(() -> ToStringBuilder.getDefaultStyle(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6084e66d-70a8-3cd9-9871-2c72a481f4f8}
    @Disabled()
    @Test()
    void toString6WhenClazzNotIsInstanceObjectThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 246)) : false  #  inside <init> method
         * (branch expression (line 249)) : false  #  inside <init> method
         * (clazz != null) : true  #  inside setUpToClass method
         * (object != null) : true  #  inside setUpToClass method
         * (!clazz.isInstance(object)) : true  #  inside setUpToClass method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ToStringBuilder> toStringBuilder = mockStatic(ToStringBuilder.class)) {
            toStringBuilder.when(() -> ToStringBuilder.getDefaultStyle()).thenReturn(null);
            Object object = new Object();
            ToStringStyle toStringStyle = null;
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                ReflectionToStringBuilder.toString(object, toStringStyle, false, false, Object.class);
            });
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Specified class is not a superclass of the object");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                toStringBuilder.verify(() -> ToStringBuilder.getDefaultStyle(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${e62fe752-812b-35e3-8bfd-b81670e922ec}
    @Disabled()
    @Test()
    void toString6WhenClazzIsInstanceObject() {
        /* Branches:
         * (branch expression (line 246)) : false  #  inside <init> method
         * (branch expression (line 249)) : false  #  inside <init> method
         * (clazz != null) : true  #  inside setUpToClass method
         * (object != null) : true  #  inside setUpToClass method
         * (!clazz.isInstance(object)) : false  #  inside setUpToClass method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ToStringBuilder> toStringBuilder = mockStatic(ToStringBuilder.class)) {
            toStringBuilder.when(() -> ToStringBuilder.getDefaultStyle()).thenReturn(null);
            Object object = new Object();
            ToStringStyle toStringStyle = null;
            //Act Statement(s)
            String result = ReflectionToStringBuilder.toString(object, toStringStyle, false, false, Object.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                toStringBuilder.verify(() -> ToStringBuilder.getDefaultStyle(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d321c25a-70b3-32f1-905b-cde3e426efae}
    @Test()
    void toStringExcludeTest() {
        //Arrange Statement(s)
        try (MockedStatic<ReflectionToStringBuilder> reflectionToStringBuilder = mockStatic(ReflectionToStringBuilder.class, CALLS_REAL_METHODS)) {
            String[] stringArray = new String[]{};
            reflectionToStringBuilder.when(() -> ReflectionToStringBuilder.toNoNullStringArray(anyCollection())).thenReturn(stringArray);
            Object object = new Object();
            reflectionToStringBuilder.when(() -> ReflectionToStringBuilder.toStringExclude(object, stringArray)).thenReturn("return_of_toStringExclude1");
            Collection<String> collection = new ArrayList<>();
            //Act Statement(s)
            String result = ReflectionToStringBuilder.toStringExclude(object, collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toStringExclude1"));
                reflectionToStringBuilder.verify(() -> ReflectionToStringBuilder.toNoNullStringArray(anyCollection()), atLeast(1));
                reflectionToStringBuilder.verify(() -> ReflectionToStringBuilder.toStringExclude(object, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3a3d5615-26c9-3be0-b500-f3eab7c47d6d}
    @Disabled()
    @Test()
    void toStringExclude1WhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 246)) : false  #  inside <init> method
         * (branch expression (line 249)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ToStringBuilder> toStringBuilder = mockStatic(ToStringBuilder.class)) {
            toStringBuilder.when(() -> ToStringBuilder.getDefaultStyle()).thenReturn(null);
            Object object = new Object();
            String[] stringArray = new String[]{};
            //Act Statement(s)
            String result = ReflectionToStringBuilder.toStringExclude(object, stringArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                toStringBuilder.verify(() -> ToStringBuilder.getDefaultStyle(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4effee4a-e388-3a1e-9ed2-d054ad882865}
    @Test()
    void toStringIncludeTest() {
        //Arrange Statement(s)
        try (MockedStatic<ReflectionToStringBuilder> reflectionToStringBuilder = mockStatic(ReflectionToStringBuilder.class, CALLS_REAL_METHODS)) {
            String[] stringArray = new String[]{};
            reflectionToStringBuilder.when(() -> ReflectionToStringBuilder.toNoNullStringArray(anyCollection())).thenReturn(stringArray);
            Object object = new Object();
            reflectionToStringBuilder.when(() -> ReflectionToStringBuilder.toStringInclude(object, stringArray)).thenReturn("return_of_toStringInclude1");
            Collection<String> collection = new ArrayList<>();
            //Act Statement(s)
            String result = ReflectionToStringBuilder.toStringInclude(object, collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toStringInclude1"));
                reflectionToStringBuilder.verify(() -> ReflectionToStringBuilder.toNoNullStringArray(anyCollection()), atLeast(1));
                reflectionToStringBuilder.verify(() -> ReflectionToStringBuilder.toStringInclude(object, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${de4df93c-ceb2-3e43-9e08-9c69bd45d652}
    @Disabled()
    @Test()
    void toStringInclude1WhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 246)) : false  #  inside <init> method
         * (branch expression (line 249)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ToStringBuilder> toStringBuilder = mockStatic(ToStringBuilder.class)) {
            toStringBuilder.when(() -> ToStringBuilder.getDefaultStyle()).thenReturn(null);
            Object object = new Object();
            String[] stringArray = new String[]{};
            //Act Statement(s)
            String result = ReflectionToStringBuilder.toStringInclude(object, stringArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                toStringBuilder.verify(() -> ToStringBuilder.getDefaultStyle(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2461cb78-a9a5-3a0e-96d4-272c109b1707}
    @Disabled()
    @Test()
    void acceptWhenFieldGetNameIndexOfClassUtilsINNER_CLASS_SEPARATOR_CHARNotEqualsMinus1() {
        /* Branches:
         * (field.getName().indexOf(ClassUtils.INNER_CLASS_SEPARATOR_CHAR) != -1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, false, false, false);
        //TODO: Needs initialization with real value
        Field field = null;
        //Act Statement(s)
        boolean result = target.accept(field);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${ade55793-98fe-301c-b563-039e12279dc0}
    @Disabled()
    @Test()
    void acceptWhenThisNotIsAppendTransients() {
        /* Branches:
         * (field.getName().indexOf(ClassUtils.INNER_CLASS_SEPARATOR_CHAR) != -1) : false
         * (Modifier.isTransient(field.getModifiers())) : true
         * (this.appendTransients) : false  #  inside isAppendTransients method
         * (!this.isAppendTransients()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, false, false, false);
        //TODO: Needs initialization with real value
        Field field = null;
        //Act Statement(s)
        boolean result = target.accept(field);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${67b263eb-3df5-34ea-bce0-8f2bdc794a26}
    @Disabled()
    @Test()
    void acceptWhenThisNotAppendStaticsAndThisNotIsAppendStatics() {
        /* Branches:
         * (field.getName().indexOf(ClassUtils.INNER_CLASS_SEPARATOR_CHAR) != -1) : false
         * (Modifier.isTransient(field.getModifiers())) : true
         * (this.appendTransients) : true  #  inside isAppendTransients method
         * (!this.isAppendTransients()) : false
         * (Modifier.isStatic(field.getModifiers())) : true
         * (this.appendStatics) : false  #  inside isAppendStatics method
         * (!this.isAppendStatics()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, true, false, false);
        //TODO: Needs initialization with real value
        Field field = null;
        //Act Statement(s)
        boolean result = target.accept(field);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${451c9c67-5ee9-381b-a30e-c64ec50ad1a2}
    @Disabled()
    @Test()
    void acceptWhenThisExcludeFieldNamesIsNullAndArrayUtilsNotIsNotEmptyIncludeFieldNamesAndFieldNotIsAnnotationPresentToStringE() {
        /* Branches:
         * (field.getName().indexOf(ClassUtils.INNER_CLASS_SEPARATOR_CHAR) != -1) : false
         * (Modifier.isTransient(field.getModifiers())) : true
         * (this.appendTransients) : true  #  inside isAppendTransients method
         * (!this.isAppendTransients()) : false
         * (Modifier.isStatic(field.getModifiers())) : true
         * (this.appendStatics) : true  #  inside isAppendStatics method
         * (!this.isAppendStatics()) : false
         * (this.excludeFieldNames != null) : false
         * (ArrayUtils.isNotEmpty(includeFieldNames)) : false
         * (!field.isAnnotationPresent(ToStringExclude.class)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, true, true, false);
        //TODO: Needs initialization with real value
        Field field = null;
        //Act Statement(s)
        boolean result = target.accept(field);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${0179d860-c1aa-3320-a946-ae7addfed267}
    @Disabled()
    @Test()
    void acceptWhenArrayUtilsNotIsNotEmptyIncludeFieldNamesAndFieldIsAnnotationPresentToStringExclude() {
        /* Branches:
         * (field.getName().indexOf(ClassUtils.INNER_CLASS_SEPARATOR_CHAR) != -1) : false
         * (Modifier.isTransient(field.getModifiers())) : true
         * (this.appendTransients) : true  #  inside isAppendTransients method
         * (!this.isAppendTransients()) : false
         * (Modifier.isStatic(field.getModifiers())) : true
         * (this.appendStatics) : true  #  inside isAppendStatics method
         * (!this.isAppendStatics()) : false
         * (this.excludeFieldNames != null) : false
         * (ArrayUtils.isNotEmpty(includeFieldNames)) : false
         * (!field.isAnnotationPresent(ToStringExclude.class)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, true, true, false);
        //TODO: Needs initialization with real value
        Field field = null;
        //Act Statement(s)
        boolean result = target.accept(field);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${f4394a32-bcd3-31fd-a220-3b7c9113c44f}
    @Disabled()
    @Test()
    void appendFieldsInWhenClazzIsArray() throws IllegalAccessException {
        /* Branches:
         * (clazz.isArray()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = spy(new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, false, false, false));
        Object object2 = new Object();
        ReflectionToStringBuilder reflectionToStringBuilder = new ReflectionToStringBuilder(object2);
        doReturn(reflectionToStringBuilder).when(target).reflectionAppendArray(object);
        //Act Statement(s)
        target.appendFieldsIn(Object.class);
        //Assert statement(s)
        assertAll("result", () -> verify(target).reflectionAppendArray(object));
    }

    //Sapient generated method id: ${85164add-2737-319f-8511-b5268ce73420}
    @Disabled()
    @Test()
    void appendFieldsInWhenThisNotAcceptFieldAndCaughtIllegalAccessException() throws SecurityException, IllegalAccessException {
        /* Branches:
         * (clazz.isArray()) : false
         * (for-each(fields)) : true
         * (this.accept(field)) : false
         * (catch-exception (IllegalAccessException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = spy(new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, false, false, false));
        doReturn(false).when(target).accept((Field) null);
        //Act Statement(s)
        target.appendFieldsIn(Object.class);
        //Assert statement(s)
        assertAll("result", () -> verify(target).accept((Field) null));
    }

    //Sapient generated method id: ${73d64100-42d9-3080-a6f7-05eb2897724f}
    @Disabled()
    @Test()
    void appendFieldsInWhenFieldValueIsNotNullAndFieldNotIsAnnotationPresentToStringSummary() throws IllegalAccessException {
        /* Branches:
         * (clazz.isArray()) : false
         * (for-each(fields)) : true
         * (this.accept(field)) : true
         * (!excludeNullValues) : false
         * (fieldValue != null) : true
         * (!field.isAnnotationPresent(ToStringSummary.class)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = spy(new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, false, false, true));
        doReturn(true).when(target).accept((Field) null);
        Object object2 = new Object();
        doReturn(object2).when(target).getValue((Field) null);
        Object object3 = new Object();
        ToStringBuilder toStringBuilder = new ToStringBuilder(object3);
        doReturn(toStringBuilder).when(target).append("fieldName1", object2, true);
        //Act Statement(s)
        target.appendFieldsIn(Object.class);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).accept((Field) null);
            verify(target).getValue((Field) null);
            verify(target).append("fieldName1", object2, true);
        });
    }

    //Sapient generated method id: ${8df68569-b660-3404-af6a-52360e64bdb8}
    @Disabled()
    @Test()
    void appendFieldsInWhenFieldValueIsNotNullAndFieldIsAnnotationPresentToStringSummary() throws IllegalAccessException {
        /* Branches:
         * (clazz.isArray()) : false
         * (for-each(fields)) : true
         * (this.accept(field)) : true
         * (!excludeNullValues) : false
         * (fieldValue != null) : true
         * (!field.isAnnotationPresent(ToStringSummary.class)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = spy(new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, false, false, true));
        doReturn(true).when(target).accept((Field) null);
        Object object2 = new Object();
        doReturn(object2).when(target).getValue((Field) null);
        Object object3 = new Object();
        ToStringBuilder toStringBuilder = new ToStringBuilder(object3);
        doReturn(toStringBuilder).when(target).append("fieldName1", object2, false);
        //Act Statement(s)
        target.appendFieldsIn(Object.class);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).accept((Field) null);
            verify(target).getValue((Field) null);
            verify(target).append("fieldName1", object2, false);
        });
    }

    //Sapient generated method id: ${c29729ec-f007-3080-b009-77e9fdf5d33e}
    @Disabled()
    @Test()
    void appendFieldsInWhenFieldNotIsAnnotationPresentToStringSummaryAndCaughtIllegalAccessExceptionThrowsIllegalStateException() throws SecurityException, IllegalAccessException {
        /* Branches:
         * (clazz.isArray()) : false
         * (for-each(fields)) : true
         * (this.accept(field)) : true
         * (!excludeNullValues) : false
         * (fieldValue != null) : true
         * (!field.isAnnotationPresent(ToStringSummary.class)) : true
         * (catch-exception (IllegalAccessException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = spy(new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, false, false, true));
        doReturn(true).when(target).accept((Field) null);
        Object object2 = new Object();
        doReturn(object2).when(target).getValue((Field) null);
        Object object3 = new Object();
        ToStringBuilder toStringBuilder = new ToStringBuilder(object3);
        doReturn(toStringBuilder).when(target).append("fieldName1", object2, true);
        IllegalAccessException illegalAccessException = new IllegalAccessException();
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.appendFieldsIn(Object.class);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), isA(illegalAccessException.getClass()));
            verify(target).accept((Field) null);
            verify(target).getValue((Field) null);
            verify(target).append("fieldName1", object2, true);
        });
    }

    //Sapient generated method id: ${b0d20fa9-e250-397e-b581-b3faccc5922b}
    @Disabled()
    @Test()
    void getValueTest() throws IllegalAccessException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, false, false, false);
        //TODO: Needs initialization with real value
        Field field = null;
        //Act Statement(s)
        Object result = target.getValue(field);
        Object object2 = new Object();
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object2)));
    }

    //Sapient generated method id: ${ae5d36ea-0d0d-3ecf-8954-87cc0c3f1455}
    @Disabled()
    @Test()
    void reflectionAppendArrayTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = spy(new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, false, false, false));
        doReturn(null).when(target).getStyle();
        StringBuffer stringBuffer = new StringBuffer();
        doReturn(stringBuffer).when(target).getStringBuffer();
        Object object2 = new Object();
        //Act Statement(s)
        ReflectionToStringBuilder result = target.reflectionAppendArray(object2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).getStyle();
            verify(target).getStringBuffer();
        });
    }

    //Sapient generated method id: ${b62083c5-e094-3c40-b6c6-a4a7c81c5a55}
    @Test()
    void setExcludeFieldNamesWhenExcludeFieldNamesParamIsNull() {
        /* Branches:
         * (excludeFieldNamesParam == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, false, false, false);
        String[] string = null;
        //Act Statement(s)
        ReflectionToStringBuilder result = target.setExcludeFieldNames(string);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${e7d5f95f-ad20-3d13-842b-ac4ceb2bc5f9}
    @Test()
    void setExcludeFieldNamesWhenExcludeFieldNamesParamIsNotNull() {
        /* Branches:
         * (excludeFieldNamesParam == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, false, false, false);
        String[] stringArray = new String[]{};
        //Act Statement(s)
        ReflectionToStringBuilder result = target.setExcludeFieldNames(stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${e3f59008-bcf2-3a04-8140-5a805f0b0ac9}
    @Test()
    void setIncludeFieldNamesWhenIncludeFieldNamesParamIsNull() {
        /* Branches:
         * (includeFieldNamesParam == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, false, false, false);
        String[] string = null;
        //Act Statement(s)
        ReflectionToStringBuilder result = target.setIncludeFieldNames(string);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${0f95c34f-bc8c-3b80-8a2b-6aecec038d8d}
    @Test()
    void setIncludeFieldNamesWhenIncludeFieldNamesParamIsNotNull() {
        /* Branches:
         * (includeFieldNamesParam == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, false, false, false);
        String[] stringArray = new String[]{};
        //Act Statement(s)
        ReflectionToStringBuilder result = target.setIncludeFieldNames(stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${6b773140-7431-3ac4-bced-312739dba9a7}
    @Disabled()
    @Test()
    void setUpToClassWhenClazzNotIsInstanceObjectThrowsIllegalArgumentException() {
        /* Branches:
         * (clazz != null) : true
         * (object != null) : true
         * (!clazz.isInstance(object)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, false, false, false);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Specified class is not a superclass of the object");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.setUpToClass(Object.class);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${40609b42-9ee3-39cb-8a94-60950b65b1b1}
    @Test()
    void setUpToClassWhenClazzIsInstanceObject() {
        /* Branches:
         * (clazz != null) : true
         * (object != null) : true
         * (!clazz.isInstance(object)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, false, false, false);
        //Act Statement(s)
        target.setUpToClass(Object.class);
        //Assert statement(s)
        assertAll("result", () -> assertThat(target.getUpToClass(), equalTo(Object.class)));
    }

    //Sapient generated method id: ${dc2b46b0-7a51-33a9-a2b0-296618f30c95}
    @Disabled()
    @Test()
    void toStringWhenThisGetObjectIsNull() throws IllegalAccessException {
        /* Branches:
         * (this.getObject() == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ReflectionToStringBuilder target = spy(new ReflectionToStringBuilder((Object) null, (ToStringStyle) null, (StringBuffer) null, Object.class, false, false, false));
        doReturn(null).when(target).getStyle();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(target).getStyle();
        });
    }

    //Sapient generated method id: ${52f3dffa-513e-3a82-8b7d-cfe1911e4412}
    @Disabled()
    @Test()
    void toStringWhenClazzNotEqualsThisGetUpToClassAndThisGetObjectIsNotNull() throws IllegalAccessException {
        /* Branches:
         * (this.getObject() == null) : false
         * (ArrayUtils.containsAny(this.excludeFieldNames, (Object[]) this.includeFieldNames)) : false  #  inside validate method
         * (clazz.getSuperclass() != null) : true
         * (clazz != this.getUpToClass()) : true
         * (this.getObject() == null) : false  #  inside toString method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ReflectionToStringBuilder target = spy(new ReflectionToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null, Object.class, false, false, false));
        doNothing().when(target).appendFieldsIn(Object.class);
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        doReturn(stringBuffer, stringBuffer2).when(target).getStringBuffer();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("toString_stringBuffer2"));
            verify(target, times(2)).appendFieldsIn(Object.class);
            verify(target, times(2)).getStringBuffer();
        });
    }
}
