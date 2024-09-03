package org.apache.commons.lang3;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;
import org.mockito.stubbing.Answer;
import java.io.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SerializationUtilsSapientGeneratedTest {

    private final Serializable serializableMock = mock(Serializable.class);

    @Test
    void cloneWhenObjectIsNull() {
        Serializable result = SerializationUtils.clone(null);
        assertThat(result, is(nullValue()));
    }

    @Disabled()
    @Test
    void cloneWhenObjectIsNotNull() {
        try (MockedStatic<SerializationUtils> serializationUtils = mockStatic(SerializationUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { 1, 2, 3 };
            serializationUtils.when(() -> SerializationUtils.serialize(serializableMock)).thenReturn(byteArray);
            serializationUtils.when(() -> SerializationUtils.deserialize(any(byte[].class))).thenReturn(serializableMock);
            Serializable result = SerializationUtils.clone(serializableMock);
            assertAll(() -> assertThat(result, is(notNullValue())), () -> assertThat(result, is(serializableMock)), () -> serializationUtils.verify(() -> SerializationUtils.serialize(serializableMock), times(1)), () -> serializationUtils.verify(() -> SerializationUtils.deserialize(byteArray), times(1)));
        }
    }

    @Test
    void cloneWhenSerializationFails() {
        try (MockedStatic<SerializationUtils> serializationUtils = mockStatic(SerializationUtils.class, CALLS_REAL_METHODS)) {
            serializationUtils.when(() -> SerializationUtils.serialize(serializableMock)).thenThrow(new SerializationException("Serialization failed"));
            SerializationException exception = assertThrows(SerializationException.class, () -> SerializationUtils.clone(serializableMock));
            assertThat(exception.getMessage(), containsString("Serialization failed"));
        }
    }

    @Disabled()
    @Test
    void cloneWhenDeserializationFails() {
        try (MockedStatic<SerializationUtils> serializationUtils = mockStatic(SerializationUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { 1, 2, 3 };
            serializationUtils.when(() -> SerializationUtils.serialize(serializableMock)).thenReturn(byteArray);
            serializationUtils.when(() -> SerializationUtils.deserialize(any(byte[].class))).thenThrow(new SerializationException("Deserialization failed"));
            SerializationException exception = assertThrows(SerializationException.class, () -> SerializationUtils.clone(serializableMock));
            assertThat(exception.getMessage(), containsString("Deserialization failed"));
        }
    }

    @ParameterizedTest
    @CsvSource({ "ClassNotFoundException", "IOException" })
    void deserializeThrowsSerializationExceptionWhenExceptionOccurs(String exceptionClass) throws Exception {
        byte[] byteArray = new byte[] { 1, 2, 3 };
        InputStream inputStream = new ByteArrayInputStream(byteArray);
        ObjectInputStream ois = mock(ObjectInputStream.class);
        try (MockedStatic<ObjectInputStream> objectInputStreamMockedStatic = mockStatic(ObjectInputStream.class)) {
            objectInputStreamMockedStatic.when(() -> new ObjectInputStream(inputStream)).thenReturn(ois);
            Exception exception = (Exception) Class.forName(exceptionClass).getDeclaredConstructor().newInstance();
            when(ois.readObject()).thenThrow(exception);
            SerializationException serializationException = assertThrows(SerializationException.class, () -> SerializationUtils.deserialize(inputStream));
            assertThat(serializationException.getCause(), is(instanceOf(exception.getClass())));
        }
    }

    @Disabled()
    @Test
    void roundtripTest() {
        try (MockedStatic<SerializationUtils> serializationUtils = mockStatic(SerializationUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { 1, 2, 3 };
            serializationUtils.when(() -> SerializationUtils.serialize(serializableMock)).thenReturn(byteArray);
            serializationUtils.when(() -> SerializationUtils.deserialize(byteArray)).thenReturn(serializableMock);
            Serializable result = SerializationUtils.roundtrip(serializableMock);
            assertAll(() -> assertThat(result, equalTo(serializableMock)), () -> serializationUtils.verify(() -> SerializationUtils.serialize(serializableMock), times(1)), () -> serializationUtils.verify(() -> SerializationUtils.deserialize(byteArray), times(1)));
        }
    }

    @Disabled()
    @Test
    void serializeTest() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = mock(ObjectOutputStream.class);
        try (MockedStatic<ObjectOutputStream> objectOutputStreamMockedStatic = mockStatic(ObjectOutputStream.class)) {
            objectOutputStreamMockedStatic.when(() -> new ObjectOutputStream(baos)).thenReturn(oos);
            SerializationUtils.serialize(serializableMock, baos);
            verify(oos, times(1)).writeObject(serializableMock);
            verify(oos, times(1)).close();
        }
    }

    @Disabled()
    @Test
    void serializeThrowsSerializationExceptionWhenIOExceptionOccurs() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = mock(ObjectOutputStream.class);
        try (MockedStatic<ObjectOutputStream> objectOutputStreamMockedStatic = mockStatic(ObjectOutputStream.class)) {
            objectOutputStreamMockedStatic.when(() -> new ObjectOutputStream(baos)).thenReturn(oos);
            doThrow(new IOException("Test exception")).when(oos).writeObject(serializableMock);
            SerializationException exception = assertThrows(SerializationException.class, () -> SerializationUtils.serialize(serializableMock, baos));
            assertThat(exception.getCause(), is(instanceOf(IOException.class)));
            assertThat(exception.getCause().getMessage(), is("Test exception"));
        }
    }

    @Test
    void deserializeByteArrayTest() {
        try (MockedStatic<SerializationUtils> serializationUtils = mockStatic(SerializationUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[] { 1, 2, 3 };
            Object expectedObject = new Object();
            serializationUtils.when(() -> SerializationUtils.deserialize(any(InputStream.class))).thenReturn(expectedObject);
            Object result = SerializationUtils.deserialize(byteArray);
            assertThat(result, is(expectedObject));
            serializationUtils.verify(() -> SerializationUtils.deserialize(any(ByteArrayInputStream.class)), times(1));
        }
    }

    @Test
    void deserializeByteArrayThrowsNullPointerExceptionWhenInputIsNull() {
        assertThrows(NullPointerException.class, () -> SerializationUtils.deserialize((byte[]) null));
    }

    @Test
    void deserializeInputStreamThrowsNullPointerExceptionWhenInputIsNull() {
        assertThrows(NullPointerException.class, () -> SerializationUtils.deserialize((InputStream) null));
    }
}
