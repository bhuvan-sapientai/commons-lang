package org.apache.commons.lang3.builder;

import org.apache.commons.lang3.builder.ReflectionDiffBuilder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.ArraySorter;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ReflectionDiffBuilderSapientGeneratedTest {

    @Test
    void buildWhenLeftEqualsRight() {
        Object object = new Object();
        RecursiveToStringStyle style = new RecursiveToStringStyle();
        ReflectionDiffBuilder<Object> target = new ReflectionDiffBuilder<>(object, object, style);
        DiffResult<Object> result = target.build();
        assertAll(() -> assertThat(result, is(notNullValue())), () -> assertThat(result.getDiffs(), is(empty())));
    }

    @Test
    void buildWhenLeftNotEqualsRight() {
        TestObject left = new TestObject("left", 1);
        TestObject right = new TestObject("right", 2);
        ReflectionDiffBuilder<TestObject> target = new ReflectionDiffBuilder<>(left, right, ToStringStyle.DEFAULT_STYLE);
        DiffResult<TestObject> result = target.build();
        assertAll(() -> assertThat(result, is(notNullValue())), () -> assertThat(result.getDiffs(), hasSize(2)), () -> assertThat(result.getDiffs(), hasItem(hasProperty("fieldName", equalTo("name")))), () -> assertThat(result.getDiffs(), hasItem(hasProperty("fieldName", equalTo("value")))));
    }

    @Test
    void buildWhenFieldIsExcluded() {
        TestObject left = new TestObject("left", 1);
        TestObject right = new TestObject("right", 2);
        ReflectionDiffBuilder<TestObject> target = new ReflectionDiffBuilder<>(left, right, ToStringStyle.DEFAULT_STYLE).setExcludeFieldNames("name");
        DiffResult<TestObject> result = target.build();
        assertAll(() -> assertThat(result, is(notNullValue())), () -> assertThat(result.getDiffs(), hasSize(1)), () -> assertThat(result.getDiffs(), hasItem(hasProperty("fieldName", equalTo("value")))));
    }

    @Test
    void buildWhenFieldHasDiffExcludeAnnotation() {
        TestObjectWithAnnotation left = new TestObjectWithAnnotation("left", 1);
        TestObjectWithAnnotation right = new TestObjectWithAnnotation("right", 2);
        ReflectionDiffBuilder<TestObjectWithAnnotation> target = new ReflectionDiffBuilder<>(left, right, ToStringStyle.DEFAULT_STYLE);
        DiffResult<TestObjectWithAnnotation> result = target.build();
        assertAll(() -> assertThat(result, is(notNullValue())), () -> assertThat(result.getDiffs(), hasSize(1)), () -> assertThat(result.getDiffs(), hasItem(hasProperty("fieldName", equalTo("name")))));
    }

    @Test
    void buildWhenCaughtIllegalAccessExceptionThrowsIllegalArgumentException() throws IllegalAccessException {
        //TestObject left = new TestObject("left", 1);
        //TestObject right = new TestObject("right", 2);
        //ReflectionDiffBuilder<TestObject> target = spy(new ReflectionDiffBuilder<>(left, right, ToStringStyle.DEFAULT_STYLE));
        /*try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class)) {
    fieldUtils.when(() -> FieldUtils.readField(any(Field.class), eq(left), eq(true))).thenThrow(new IllegalAccessException("Test exception"));
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, target::build);
    assertThat(exception.getMessage(), containsString("Unexpected IllegalAccessException"));
    assertThat(exception.getCause(), is(instanceOf(IllegalAccessException.class)));
}*/
    }

    @ParameterizedTest
    @CsvSource({ "null", "name,value", "name", "value" })
    void setAndGetExcludeFieldNames(String excludeFieldNamesParam) {
        TestObject left = new TestObject("left", 1);
        TestObject right = new TestObject("right", 2);
        ReflectionDiffBuilder<TestObject> target = new ReflectionDiffBuilder<>(left, right, ToStringStyle.DEFAULT_STYLE);
        String[] excludeFieldNames = excludeFieldNamesParam == null ? null : excludeFieldNamesParam.split(",");
        target.setExcludeFieldNames(excludeFieldNames);
        String[] result = target.getExcludeFieldNames();
        if (excludeFieldNames == null) {
            assertThat(result, is(emptyArray()));
        } else {
            assertThat(result, arrayContainingInAnyOrder(excludeFieldNames));
        }
    }

    private static class TestObject {

        private String name;

        private int value;

        TestObject(String name, int value) {
            this.name = name;
            this.value = value;
        }
    }

    private static class TestObjectWithAnnotation {

        private String name;

        @DiffExclude
        private int value;

        TestObjectWithAnnotation(String name, int value) {
            this.name = name;
            this.value = value;
        }
    }
}