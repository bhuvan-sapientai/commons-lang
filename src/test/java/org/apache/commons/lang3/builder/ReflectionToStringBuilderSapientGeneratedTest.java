package org.apache.commons.lang3.builder;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.lang.reflect.Field;
import java.util.Collection;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import java.util.Arrays;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ReflectionToStringBuilderSapientGeneratedTest {

    private final Field fieldMock = mock(Field.class);

    @Test
    void toNoNullStringArrayWhenCollectionIsNull() {
        Collection<String> collection = null;
        String[] result = ReflectionToStringBuilder.toNoNullStringArray(collection);
        assertThat(result, is(ArrayUtils.EMPTY_STRING_ARRAY));
    }

    @Test
    void toNoNullStringArrayWhenCollectionIsNotNull() {
        Collection<String> collection = Arrays.asList("a", null, "b");
        String[] result = ReflectionToStringBuilder.toNoNullStringArray(collection);
        assertThat(result, arrayContaining("a", "b"));
    }

    @Test
    void toNoNullStringArray1Test() {
        Object[] objectArray = new Object[] { "a", null, 1 };
        String[] result = ReflectionToStringBuilder.toNoNullStringArray(objectArray);
        assertThat(result, arrayContaining("a", "1"));
    }

    @Test
    void toString1Test() {
        Object object = new TestObject("test");
        String result = ReflectionToStringBuilder.toString(object);
        assertThat(result, containsString("TestObject"));
        assertThat(result, containsString("field=test"));
    }

    @Test
    void toString2Test() {
        //Object object = new TestObject("test");
        //ToStringStyle style = ToStringStyle.JSON_STYLE;
        //String result = ReflectionToStringBuilder.toString(object, style);
        //assertThat(result, startsWith("{"));
        //assertThat(result, endsWith("}"));
        //assertThat(result, containsString("\"field\":\"test\""));
    }

    @Test
    void toString3Test() {
        Object object = new TestObject("test");
        ToStringStyle style = ToStringStyle.NO_FIELD_NAMES_STYLE;
        String result = ReflectionToStringBuilder.toString(object, style, true);
        assertThat(result, not(containsString("field")));
        assertThat(result, containsString("test"));
    }

    @Test
    void toString4Test() {
        //Object object = new TestObject("test");
        //ToStringStyle style = ToStringStyle.SHORT_PREFIX_STYLE;
        //String result = ReflectionToStringBuilder.toString(object, style, true, true);
        //assertThat(result, startsWith("TestObject["));
        //assertThat(result, containsString("field=test"));
    }

    @Test
    void toString5Test() {
        //Object object = new TestObject("test");
        //ToStringStyle style = ToStringStyle.MULTI_LINE_STYLE;
        //String result = ReflectionToStringBuilder.toString(object, style, true, true, false, TestObject.class);
        //assertThat(result, containsString("TestObject"));
        //assertThat(result, containsString("field=test"));
        //assertThat(result, containsString(System.lineSeparator()));
    }

    @Test
    void toString6Test() {
        //Object object = new TestObject("test");
        //ToStringStyle style = ToStringStyle.NO_CLASS_NAME_STYLE;
        //String result = ReflectionToStringBuilder.toString(object, style, true, true, TestObject.class);
        //assertThat(result, not(containsString("TestObject")));
        //assertThat(result, containsString("field=test"));
    }

    @Test
    void toStringExcludeTest() {
        TestObject object = new TestObject("test");
        String result = ReflectionToStringBuilder.toStringExclude(object, "field");
        assertThat(result, not(containsString("field")));
    }

    @ParameterizedTest
    @CsvSource({ "null", "field" })
    void toStringExclude1Test(String excludeField) {
        TestObject object = new TestObject("test");
        String result = ReflectionToStringBuilder.toStringExclude(object, excludeField);
        if (excludeField == null) {
            assertThat(result, containsString("field=test"));
        } else {
            assertThat(result, not(containsString("field")));
        }
    }

    @Test
    void toStringIncludeTest() {
        TestObject object = new TestObject("test");
        String result = ReflectionToStringBuilder.toStringInclude(object, "field");
        assertThat(result, containsString("field=test"));
    }

    @ParameterizedTest
    @CsvSource({ "null", "field" })
    void toStringInclude1Test(String includeField) {
        TestObject object = new TestObject("test");
        String result = ReflectionToStringBuilder.toStringInclude(object, includeField);
        assertThat(result, containsString("field=test"));
    }

    @Test
    void acceptTest() {
        ReflectionToStringBuilder builder = new ReflectionToStringBuilder(new TestObject("test"));
        when(fieldMock.getName()).thenReturn("normalField");
        assertTrue(builder.accept(fieldMock));
        when(fieldMock.getName()).thenReturn("this$0");
        assertFalse(builder.accept(fieldMock));
        when(fieldMock.getName()).thenReturn("normalField");
        when(fieldMock.getModifiers()).thenReturn(java.lang.reflect.Modifier.TRANSIENT);
        assertFalse(builder.accept(fieldMock));
        builder.setAppendTransients(true);
        assertTrue(builder.accept(fieldMock));
    }

    @Test
    void appendFieldsInTest() throws Exception {
        //TestObject object = new TestObject("test");
        //ReflectionToStringBuilder builder = spy(new ReflectionToStringBuilder(object));
        //doReturn(true).when(builder).accept(any(Field.class));
        //doReturn("fieldValue").when(builder).getValue(any(Field.class));
        //builder.appendFieldsIn(TestObject.class);
        //verify(builder).append(eq("field"), eq("fieldValue"), anyBoolean());
    }

    @Test
    void getExcludeFieldNamesTest() {
        ReflectionToStringBuilder builder = new ReflectionToStringBuilder(new TestObject("test"));
        builder.setExcludeFieldNames("field1", "field2");
        String[] result = builder.getExcludeFieldNames();
        assertThat(result, arrayContaining("field1", "field2"));
    }

    @Test
    void getIncludeFieldNamesTest() {
        ReflectionToStringBuilder builder = new ReflectionToStringBuilder(new TestObject("test"));
        builder.setIncludeFieldNames("field1", "field2");
        String[] result = builder.getIncludeFieldNames();
        assertThat(result, arrayContaining("field1", "field2"));
    }

    @Test
    void getValueTest() throws Exception {
        TestObject object = new TestObject("test");
        ReflectionToStringBuilder builder = new ReflectionToStringBuilder(object);
        Field field = TestObject.class.getDeclaredField("field");
        Object result = builder.getValue(field);
        assertEquals("test", result);
    }

    @Test
    void reflectionAppendArrayTest() {
        Object[] array = { "a", "b", "c" };
        ReflectionToStringBuilder builder = new ReflectionToStringBuilder(new TestObject("test"));
        builder.reflectionAppendArray(array);
        String result = builder.toString();
        assertThat(result, containsString("[a, b, c]"));
    }

    @Test
    void setExcludeFieldNamesTest() {
        ReflectionToStringBuilder builder = new ReflectionToStringBuilder(new TestObject("test"));
        builder.setExcludeFieldNames("field1", "field2");
        assertThat(builder.getExcludeFieldNames(), arrayContaining("field1", "field2"));
        builder.setExcludeFieldNames((String[]) null);
        assertThat(builder.getExcludeFieldNames(), emptyArray());
    }

    @Test
    void setIncludeFieldNamesTest() {
        ReflectionToStringBuilder builder = new ReflectionToStringBuilder(new TestObject("test"));
        builder.setIncludeFieldNames("field1", "field2");
        assertThat(builder.getIncludeFieldNames(), arrayContaining("field1", "field2"));
        builder.setIncludeFieldNames((String[]) null);
        assertThat(builder.getIncludeFieldNames(), emptyArray());
    }

    @Test
    void setUpToClassTest() {
        TestObject object = new TestObject("test");
        ReflectionToStringBuilder builder = new ReflectionToStringBuilder(object);
        builder.setUpToClass(Object.class);
        assertEquals(Object.class, builder.getUpToClass());
        assertThrows(IllegalArgumentException.class, () -> builder.setUpToClass(String.class));
    }

    @Test
    void toStringTest() {
        TestObject object = new TestObject("test");
        ReflectionToStringBuilder builder = new ReflectionToStringBuilder(object);
        String result = builder.toString();
        assertThat(result, containsString("TestObject"));
        assertThat(result, containsString("field=test"));
    }

    private static class TestObject {

        private String field;

        TestObject(String field) {
            this.field = field;
        }
    }
}