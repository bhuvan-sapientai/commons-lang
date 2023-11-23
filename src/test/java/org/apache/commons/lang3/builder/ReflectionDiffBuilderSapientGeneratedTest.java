package org.apache.commons.lang3.builder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import org.mockito.MockedStatic;
import org.apache.commons.lang3.reflect.FieldUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ReflectionDiffBuilderSapientGeneratedTest {

    //Sapient generated method id: ${b62083c5-e094-3c40-b6c6-a4a7c81c5a55}
    @Test()
    void setExcludeFieldNamesWhenExcludeFieldNamesParamIsNull() {
        /* Branches:
         * (excludeFieldNamesParam == null) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        ReflectionDiffBuilder target = new ReflectionDiffBuilder(object, object2, (ToStringStyle) null);
        String[] string = null;
        //Act Statement(s)
        ReflectionDiffBuilder result = target.setExcludeFieldNames(string);
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
        Object object2 = new Object();
        ReflectionDiffBuilder target = new ReflectionDiffBuilder(object, object2, (ToStringStyle) null);
        String[] stringArray = new String[]{"id", "createdAt"};
        //Act Statement(s)
        ReflectionDiffBuilder result = target.setExcludeFieldNames(stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${90a5e0e8-99e5-34ba-9dae-5cc834f99e13}
    @Disabled()
    @Test()
    void buildWhenLeftEqualsRight() throws IllegalAccessException {
        /* Branches:
         * (left.equals(right)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        ReflectionDiffBuilder target = new ReflectionDiffBuilder(object, object2, (ToStringStyle) null);
        //Act Statement(s)
        DiffResult result = target.build();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${f473fce4-08c0-389a-a56c-1b0ff7569d7e}
    @Disabled()
    @Test()
    void buildWhenAcceptNotField() throws IllegalAccessException {
        /* Branches:
         * (left.equals(right)) : false
         * (for-each(FieldUtils.getAllFields(clazz))) : true  #  inside appendFields method
         * (field.getName().indexOf(ClassUtils.INNER_CLASS_SEPARATOR_CHAR) != -1) : true  #  inside accept method
         * (accept(field)) : false  #  inside appendFields method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        ReflectionDiffBuilder target = new ReflectionDiffBuilder(object, object2, (ToStringStyle) null);
        //Act Statement(s)
        DiffResult result = target.build();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${53f28488-5e35-3fa5-b042-1aa510183c9d}
    @Disabled()
    @Test()
    void buildWhenAcceptField() throws IllegalAccessException {
        /* Branches:
         * (left.equals(right)) : false
         * (for-each(FieldUtils.getAllFields(clazz))) : true  #  inside appendFields method
         * (field.getName().indexOf(ClassUtils.INNER_CLASS_SEPARATOR_CHAR) != -1) : false  #  inside accept method
         * (Modifier.isTransient(field.getModifiers())) : false  #  inside accept method
         * (Modifier.isStatic(field.getModifiers())) : false  #  inside accept method
         * (this.excludeFieldNames != null) : false  #  inside accept method
         * (!field.isAnnotationPresent(DiffExclude.class)) : true  #  inside accept method
         * (accept(field)) : true  #  inside appendFields method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        ReflectionDiffBuilder target = new ReflectionDiffBuilder(object, object2, (ToStringStyle) null);
        //Act Statement(s)
        DiffResult result = target.build();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${37bef3e9-af20-3e70-a775-8959e7650e90}
    @Disabled()
    @Test()
    void buildWhenCaughtIllegalAccessExceptionThrowsIllegalArgumentException() throws IllegalAccessException {
        /* Branches:
         * (left.equals(right)) : false
         * (for-each(FieldUtils.getAllFields(clazz))) : true  #  inside appendFields method
         * (field.getName().indexOf(ClassUtils.INNER_CLASS_SEPARATOR_CHAR) != -1) : false  #  inside accept method
         * (Modifier.isTransient(field.getModifiers())) : false  #  inside accept method
         * (Modifier.isStatic(field.getModifiers())) : false  #  inside accept method
         * (this.excludeFieldNames != null) : false  #  inside accept method
         * (!field.isAnnotationPresent(DiffExclude.class)) : true  #  inside accept method
         * (accept(field)) : true  #  inside appendFields method
         * (catch-exception (IllegalAccessException)) : true  #  inside appendFields method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class)) {
            Object object = new Object();
            Object object2 = new Object();
            fieldUtils.when(() -> FieldUtils.readField((Field) null, object2, true)).thenReturn(object);
            Object object3 = new Object();
            Object object4 = new Object();
            fieldUtils.when(() -> FieldUtils.readField((Field) null, object4, true)).thenReturn(object3);
            ReflectionDiffBuilder target = new ReflectionDiffBuilder(object2, object4, (ToStringStyle) null);
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                target.build();
            });
            IllegalAccessException illegalAccessException = new IllegalAccessException("");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected IllegalAccessException: ", illegalAccessException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                assertThat(result.getCause(), isA(illegalAccessException.getClass()));
                fieldUtils.verify(() -> FieldUtils.readField((Field) null, object2, true), atLeast(1));
                fieldUtils.verify(() -> FieldUtils.readField((Field) null, object4, true), atLeast(1));
            });
        }
    }
}
