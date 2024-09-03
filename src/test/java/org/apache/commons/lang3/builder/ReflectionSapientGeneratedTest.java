package org.apache.commons.lang3.builder;

import org.apache.commons.lang3.builder.Reflection;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.lang.reflect.Field;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ReflectionSapientGeneratedTest {

    private final Field fieldMock = mock(Field.class);

    @Test
    void getUncheckedTest() throws IllegalAccessException {
        // Arrange
        Object object = new Object();
        Object expectedValue = new Object();
        when(fieldMock.get(object)).thenReturn(expectedValue);
        // Act
        Object result = Reflection.getUnchecked(fieldMock, object);
        // Assert
        assertAll(() -> assertThat(result, is(notNullValue())), () -> assertThat(result, is(expectedValue)));
        verify(fieldMock).get(object);
    }

    @Test
    void getUncheckedWhenCaughtIllegalAccessExceptionThrowsIllegalArgumentException() throws IllegalAccessException {
        // Arrange
        Object object = new Object();
        IllegalAccessException illegalAccessException = new IllegalAccessException("Test exception");
        when(fieldMock.get(object)).thenThrow(illegalAccessException);
        // Act & Assert
        IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> Reflection.getUnchecked(fieldMock, object));
        assertAll(() -> assertThat(result, is(notNullValue())), () -> assertThat(result.getCause(), is(instanceOf(IllegalAccessException.class))), () -> assertThat(result.getCause(), is(illegalAccessException)));
        verify(fieldMock).get(object);
    }

    @ParameterizedTest
    @NullSource
    void getUncheckedWithNullFieldThrowsNullPointerException(Field nullField) {
        Object object = new Object();
        assertThrows(NullPointerException.class, () -> Reflection.getUnchecked(nullField, object));
    }

    @ParameterizedTest
    @ValueSource(strings = { "", "test" })
    void getUncheckedWithDifferentObjects(String obj) throws IllegalAccessException {
        when(fieldMock.get(obj)).thenReturn(obj.length());
        Object result = Reflection.getUnchecked(fieldMock, obj);
        assertThat(result, is(obj.length()));
        verify(fieldMock).get(obj);
    }

    @Test
    void getUncheckedWithNullObject() throws IllegalAccessException {
        when(fieldMock.get(null)).thenReturn(null);
        Object result = Reflection.getUnchecked(fieldMock, null);
        assertNull(result);
        verify(fieldMock).get(null);
    }
}
