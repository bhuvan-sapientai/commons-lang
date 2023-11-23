package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.mockito.stubbing.Answer;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;

import org.mockito.MockedStatic;

import java.io.Serializable;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SerializationUtilsSapientGeneratedTest {

    //Sapient generated method id: ${c4bf8b3c-4cbf-3d75-94a6-c408b5c1131c}
    @Test()
    void cloneWhenObjectIsNull() throws Throwable, ClassNotFoundException, IOException {
        /* Branches:
         * (object == null) : true
         */
        //Arrange Statement(s)
        Serializable serializable = null;

        //Act Statement(s)
        Serializable result = SerializationUtils.clone(serializable);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${67a7bb14-a25d-31f8-a1e7-f9ed6c7754c8}
    @Test()
    void cloneWhenObjectIsNotNull() throws Throwable, ClassNotFoundException, IOException {
        /* Branches:
         * (object == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SerializationUtils> serializationUtils = mockStatic(SerializationUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            serializationUtils.when(() -> SerializationUtils.serialize((Serializable) null)).thenReturn(byteArray);
            //TODO: Needs initialization with real value
            Serializable serializable = null;
            //Act Statement(s)
            Serializable result = SerializationUtils.clone(serializable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                serializationUtils.verify(() -> SerializationUtils.serialize((Serializable) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${63c99d69-816b-30f5-85a4-dc14e7682003}
    @Test()
    void cloneWhenDefaultBranchThrowsThrowable() throws IOException, ClassNotFoundException {
        /* Branches:
         * (object == null) : false
         * (branch expression (line 143)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SerializationUtils> serializationUtils = mockStatic(SerializationUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            serializationUtils.when(() -> SerializationUtils.serialize((Serializable) null)).thenReturn(byteArray);
            //TODO: Needs initialization with real value
            Serializable serializable = null;
            //Act Statement(s)
            final Throwable result = assertThrows(Throwable.class, () -> {
                SerializationUtils.clone(serializable);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                serializationUtils.verify(() -> SerializationUtils.serialize((Serializable) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7f4a8a0a-12c0-3f96-abd4-efb5c589dfa4}
    @Test()
    void cloneWhenCaughtClassNotFoundExceptionOrIOExceptionThrowsSerializationException() throws IOException, ClassNotFoundException {
        /* Branches:
         * (object == null) : false
         * (catch-exception (ClassNotFoundException | IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SerializationUtils> serializationUtils = mockStatic(SerializationUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            serializationUtils.when(() -> SerializationUtils.serialize((Serializable) null)).thenReturn(byteArray);
            //TODO: Needs initialization with real value
            Serializable serializable = null;
            //Act Statement(s)
            final SerializationException result = assertThrows(SerializationException.class, () -> {
                SerializationUtils.clone(serializable);
            });
            Exception exception = new Exception();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getCause(), isA(exception.getClass()));
                serializationUtils.verify(() -> SerializationUtils.serialize((Serializable) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9d317733-e6d7-3927-8baa-83a51bcd6892}
    @Test()
    void deserializeTest() throws Throwable, ClassNotFoundException, IOException {
        //Arrange Statement(s)
        try (MockedStatic<SerializationUtils> serializationUtils = mockStatic(SerializationUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            ByteArrayInputStream byteArrayInputStream = mock(ByteArrayInputStream.class);
            serializationUtils.when(() -> SerializationUtils.deserialize(byteArrayInputStream)).thenReturn(object);
            byte[] byteArray = new byte[]{};
            //Act Statement(s)
            Object result = SerializationUtils.deserialize(byteArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                serializationUtils.verify(() -> SerializationUtils.deserialize(byteArrayInputStream), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${48f153f8-9f5d-3f80-9a15-fb1715c8b9da}
    @Test()
    void deserialize1Test() throws Throwable, ClassNotFoundException, IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

        //Act Statement(s)
        Object result = SerializationUtils.deserialize(inputStream);
        Object object = new Object();

        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${1871a3a9-f82c-3e16-ad8e-ee5b7c3d371b}
    @Test()
    void deserialize1WhenDefaultBranchThrowsThrowable() throws IOException, ClassNotFoundException {
        /* Branches:
         * (branch expression (line 206)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        //Act Statement(s)
        final Throwable result = assertThrows(Throwable.class, () -> {
            SerializationUtils.deserialize(inputStream);
        });

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${1de7c734-9bd9-3a6f-8c9f-9bdf64b4a0fb}
    @Test()
    void deserialize1WhenCaughtClassNotFoundExceptionOrIOExceptionThrowsSerializationException() throws IOException, ClassNotFoundException {
        /* Branches:
         * (catch-exception (ClassNotFoundException | IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        Exception exception = new Exception();
        //Act Statement(s)
        final SerializationException result = assertThrows(SerializationException.class, () -> {
            SerializationUtils.deserialize(inputStream);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), isA(exception.getClass()));
        });
    }

    //Sapient generated method id: ${6bfef4ef-bf2c-36c9-9e83-5149a5b48e80}
    @Test()
    void roundtripTest() throws Throwable, IOException, ClassNotFoundException {
        //Arrange Statement(s)
        try (MockedStatic<SerializationUtils> serializationUtils = mockStatic(SerializationUtils.class, CALLS_REAL_METHODS)) {
            byte[] byteArray = new byte[]{};
            serializationUtils.when(() -> SerializationUtils.serialize((Serializable) null)).thenReturn(byteArray);
            serializationUtils.when(() -> SerializationUtils.deserialize(byteArray)).thenReturn(null);
            //TODO: Needs initialization with real value
            Serializable serializable = null;
            //Act Statement(s)
            Serializable result = SerializationUtils.roundtrip(serializable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                serializationUtils.verify(() -> SerializationUtils.serialize((Serializable) null), atLeast(1));
                serializationUtils.verify(() -> SerializationUtils.deserialize(byteArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9d328af1-2293-3544-bbbc-a0683c1f9fbe}
    @Test()
    void serializeTest() throws Throwable, IOException {
        //Arrange Statement(s)
        try (MockedStatic<SerializationUtils> serializationUtils = mockStatic(SerializationUtils.class, CALLS_REAL_METHODS)) {
            serializationUtils.when(() -> SerializationUtils.serialize(eq((Serializable) null), (ByteArrayOutputStream) any())).thenAnswer((Answer<Void>) invocation -> null);
            //TODO: Needs initialization with real value
            Serializable serializable = null;
            //Act Statement(s)
            byte[] result = SerializationUtils.serialize(serializable);
            byte[] byteResultArray = new byte[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteResultArray));
                serializationUtils.verify(() -> SerializationUtils.serialize(eq((Serializable) null), (ByteArrayOutputStream) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${aa3027ac-8bca-34c8-a436-b48f639f992a}
    @Test()
    void serialize1Test() throws Throwable, IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Serializable serializable = null;
        OutputStream outputStream = OutputStream.nullOutputStream();

        //Act Statement(s)
        SerializationUtils.serialize(serializable, outputStream);
    }

    //Sapient generated method id: ${40d33135-6c9b-3cf1-8a30-4e4d70464d23}
    @Test()
    void serialize1WhenDefaultBranchThrowsThrowable() throws IOException {
        /* Branches:
         * (branch expression (line 263)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Serializable serializable = null;
        OutputStream outputStream = OutputStream.nullOutputStream();
        //Act Statement(s)
        final Throwable result = assertThrows(Throwable.class, () -> {
            SerializationUtils.serialize(serializable, outputStream);
        });

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${0aca93ce-bc67-30dc-aae7-03bcf7aff1f7}
    @Test()
    void serialize1WhenDefaultBranch() throws Throwable, IOException {
        /* Branches:
         * (branch expression (line 263)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Serializable serializable = null;
        OutputStream outputStream = OutputStream.nullOutputStream();

        //Act Statement(s)
        SerializationUtils.serialize(serializable, outputStream);
    }

    //Sapient generated method id: ${6c274606-4003-3c42-a46a-5ef0d4b5f8a6}
    @Test()
    void serialize1WhenCaughtIOExceptionThrowsSerializationException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Serializable serializable = null;
        OutputStream outputStream = OutputStream.nullOutputStream();
        IOException iOException = new IOException();
        //Act Statement(s)
        final SerializationException result = assertThrows(SerializationException.class, () -> {
            SerializationUtils.serialize(serializable, outputStream);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), isA(iOException.getClass()));
        });
    }
}
