package org.apache.commons.lang3.stream;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Enumeration;
import java.util.List;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.Collection;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StreamsSapientGeneratedTest {

    //Sapient generated method id: ${c1c32264-8060-357c-bead-9a6ec4de0bd3}
    @Test()
    void failableStreamTest() {
        //Arrange Statement(s)
        try (MockedStatic<Streams> streams = mockStatic(Streams.class, CALLS_REAL_METHODS)) {
            Stream<Object> stream = Stream.empty();
            streams.when(() -> Streams.of(anyCollection())).thenReturn(stream);
            Stream stream2 = Stream.empty();
            Streams.FailableStream streamsFailableStream = new Streams.FailableStream(stream2);
            streams.when(() -> Streams.failableStream((Stream) any())).thenReturn(streamsFailableStream);
            Collection<Object> collection = new ArrayList<>();
            //Act Statement(s)
            Streams.FailableStream result = Streams.failableStream(collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(streamsFailableStream));
                streams.verify(() -> Streams.of(anyCollection()), atLeast(1));
                streams.verify(() -> Streams.failableStream((Stream) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ce703536-6717-33cc-9aa3-09e418c856ad}
    @Disabled()
    @Test()
    void failableStream1Test() {
        //Arrange Statement(s)
        Stream<Object> stream = Stream.empty();
        //Act Statement(s)
        Streams.FailableStream result = Streams.failableStream(stream);
        Streams.FailableStream streamsFailableStream = new Streams.FailableStream(stream);
        //Assert statement(s)
        //TODO: Please implement equals method in FailableStream for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(streamsFailableStream)));
    }

    //Sapient generated method id: ${b118b63e-e535-3fe8-9341-9b5d426b6ea7}
    @Test()
    void failableStream2Test() {
        //Arrange Statement(s)
        try (MockedStatic<Streams> streams = mockStatic(Streams.class, CALLS_REAL_METHODS)) {
            Stream<Object> stream = Stream.empty();
            Object[] objectArray = new Object[]{};
            streams.when(() -> Streams.of(objectArray)).thenReturn(stream);
            Stream stream2 = Stream.empty();
            Streams.FailableStream streamsFailableStream = new Streams.FailableStream(stream2);
            streams.when(() -> Streams.failableStream((Stream) any())).thenReturn(streamsFailableStream);
            //Act Statement(s)
            Streams.FailableStream result = Streams.failableStream(objectArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(streamsFailableStream));
                streams.verify(() -> Streams.of(objectArray), atLeast(1));
                streams.verify(() -> Streams.failableStream((Stream) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0da33769-3758-3dca-84d8-f1a4872221c7}
    @Disabled()
    @Test()
    void instancesOfWhenStreamIsNull() {
        /* Branches:
         * (stream == null) : true  #  inside of method
         */
        //Arrange Statement(s)
        try (MockedStatic<Streams> streams = mockStatic(Streams.class, CALLS_REAL_METHODS)) {
            streams.when(() -> Streams.of(anyCollection())).thenReturn(null);
            Collection<Object> collection = new ArrayList<>();
            //Act Statement(s)
            Stream result = Streams.instancesOf(Object.class, collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                streams.verify(() -> Streams.of(anyCollection()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${e5c58b51-3141-30e9-aee2-549dcc1f54a5}
    @Disabled()
    @Test()
    void instancesOfWhenStreamIsNotNull() {
        /* Branches:
         * (stream == null) : false  #  inside of method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Streams> streams = mockStatic(Streams.class, CALLS_REAL_METHODS)) {
            Stream<Object> stream = Stream.empty();
            streams.when(() -> Streams.of(anyCollection())).thenReturn(stream);
            Collection<Object> collection = new ArrayList<>();
            //Act Statement(s)
            Stream result = Streams.instancesOf(Object.class, collection);
            Stream stream2 = Stream.empty();
            //Assert statement(s)
            //TODO: Please implement equals method in Stream for verification to succeed or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, equalTo(stream2));
                streams.verify(() -> Streams.of(anyCollection()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${bf05414e-6356-30ad-9452-1e9803087359}
    @Disabled()
    @Test()
    void nonNullTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Streams> streams = mockStatic(Streams.class, CALLS_REAL_METHODS)) {
            Stream<Object> stream = Stream.empty();
            streams.when(() -> Streams.of(anyCollection())).thenReturn(stream);
            Collection<Object> collection = new ArrayList<>();
            //Act Statement(s)
            Stream result = Streams.nonNull(collection);
            Stream stream2 = Stream.empty();
            //Assert statement(s)
            //TODO: Please implement equals method in Stream for verification to succeed or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, equalTo(stream2));
                streams.verify(() -> Streams.of(anyCollection()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ca3d0857-d04b-39c7-91b7-838de19166a3}
    @Test()
    void nonNull1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Streams> streams = mockStatic(Streams.class, CALLS_REAL_METHODS)) {
            Stream<Object> stream = Stream.empty();
            Object[] objectArray = new Object[]{};
            streams.when(() -> Streams.of(objectArray)).thenReturn(stream);
            Stream stream2 = Stream.empty();
            streams.when(() -> Streams.nonNull((Stream) any())).thenReturn(stream2);
            //Act Statement(s)
            Stream result = Streams.nonNull(objectArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(stream2));
                streams.verify(() -> Streams.of(objectArray), atLeast(1));
                streams.verify(() -> Streams.nonNull((Stream) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a2e6d23a-6da8-3cd1-92c9-dfe8f3f1b755}
    @Disabled()
    @Test()
    void nonNull2WhenStreamIsNull() {
        /* Branches:
         * (stream == null) : true  #  inside of method
         */
        //Arrange Statement(s)
        Stream<Object> stream = null;
        //Act Statement(s)
        Stream result = Streams.nonNull(stream);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${913f96f3-6af5-3bcf-af58-181b34a77af7}
    @Disabled()
    @Test()
    void nonNull2WhenStreamIsNotNull() {
        /* Branches:
         * (stream == null) : false  #  inside of method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Stream<Object> stream = Stream.empty();
        //Act Statement(s)
        Stream result = Streams.nonNull(stream);
        Stream stream2 = Stream.empty();
        //Assert statement(s)
        //TODO: Please implement equals method in Stream for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(stream2)));
    }

    //Sapient generated method id: ${ccfa1d1c-a1b4-3c6c-a9aa-0face184b296}
    @Disabled()
    @Test()
    void ofWhenCollectionIsNull() {
        /* Branches:
         * (collection == null) : true
         */
        //Arrange Statement(s)
        Collection<Object> collection = null;
        //Act Statement(s)
        Stream result = Streams.of(collection);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${f69ffa89-94b6-3fd7-80ec-e360dc8f5494}
    @Disabled()
    @Test()
    void ofWhenCollectionIsNotNull() {
        /* Branches:
         * (collection == null) : false
         */
        //Arrange Statement(s)
        Collection<Object> collection = new ArrayList<>();
        //Act Statement(s)
        Stream result = Streams.of(collection);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${2d9e451b-59ca-3da9-a6c7-f80da9bfa12e}
    @Disabled()
    @Test()
    void of1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Enumeration<Object> enumeration = null;
        //Act Statement(s)
        Stream result = Streams.of(enumeration);
        Stream stream = Stream.empty();
        //Assert statement(s)
        //TODO: Please implement equals method in Stream for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(stream)));
    }

    //Sapient generated method id: ${f648a8e7-6ca3-3a39-87be-daba6fa527de}
    @Disabled()
    @Test()
    void of2WhenIterableIsNull() {
        /* Branches:
         * (iterable == null) : true
         */
        //Arrange Statement(s)
        Iterable<Object> iterable = null;
        //Act Statement(s)
        Stream result = Streams.of(iterable);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${0fc234c3-c203-324e-a4f7-824425b56f59}
    @Disabled()
    @Test()
    void of2WhenIterableIsNotNull() {
        /* Branches:
         * (iterable == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Iterable<Object> iterable = null;
        //Act Statement(s)
        Stream result = Streams.of(iterable);
        Stream stream = Stream.empty();
        //Assert statement(s)
        //TODO: Please implement equals method in Stream for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(stream)));
    }

    //Sapient generated method id: ${f786c25c-0989-39f4-ad29-3c1fd5411892}
    @Disabled()
    @Test()
    void of3WhenIteratorIsNull() {
        /* Branches:
         * (iterator == null) : true
         */
        //Arrange Statement(s)
        Iterator<Object> iterator = null;
        //Act Statement(s)
        Stream result = Streams.of(iterator);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${ad416a12-4fbe-3231-8480-2a85c6a219d6}
    @Disabled()
    @Test()
    void of3WhenIteratorIsNotNull() {
        /* Branches:
         * (iterator == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List list = new ArrayList<>();
        Iterator<Object> iteratorIterator = list.iterator();
        //Act Statement(s)
        Stream result = Streams.of(iteratorIterator);
        Stream stream = Stream.empty();
        //Assert statement(s)
        //TODO: Please implement equals method in Stream for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(stream)));
    }

    //Sapient generated method id: ${c6253f2d-e4a2-30c4-acdf-b900d5bea54f}
    @Disabled()
    @Test()
    void of5WhenValuesIsNull() {
        /* Branches:
         * (values == null) : true
         */
        //Arrange Statement(s)
        Object[] object = null;
        //Act Statement(s)
        Stream result = Streams.of(object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${029c9283-4f70-3bd2-94ab-ce9804456848}
    @Disabled()
    @Test()
    void of5WhenValuesIsNotNull() {
        /* Branches:
         * (values == null) : false
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        Stream result = Streams.of(objectArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${b4af2388-e781-3800-820a-b8ede09bd914}
    @Test()
    void streamTest() {
        //Arrange Statement(s)
        try (MockedStatic<Streams> streams = mockStatic(Streams.class, CALLS_REAL_METHODS)) {
            Stream stream = Stream.empty();
            Streams.FailableStream streamsFailableStream = new Streams.FailableStream(stream);
            streams.when(() -> Streams.failableStream(anyCollection())).thenReturn(streamsFailableStream);
            Collection<Object> collection = new ArrayList<>();
            //Act Statement(s)
            Streams.FailableStream result = Streams.stream(collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(streamsFailableStream));
                streams.verify(() -> Streams.failableStream(anyCollection()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3b200cb7-448d-34b5-bf0d-0c7d7dec4137}
    @Test()
    void stream1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Streams> streams = mockStatic(Streams.class, CALLS_REAL_METHODS)) {
            Stream stream = Stream.empty();
            Streams.FailableStream streamsFailableStream = new Streams.FailableStream(stream);
            streams.when(() -> Streams.failableStream((Stream) any())).thenReturn(streamsFailableStream);
            Stream<Object> stream2 = Stream.empty();
            //Act Statement(s)
            Streams.FailableStream result = Streams.stream(stream2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(streamsFailableStream));
                streams.verify(() -> Streams.failableStream((Stream) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d237bbaf-b248-312d-8608-292b0411608c}
    @Disabled()
    @Test()
    void toArrayTest() {
        //Act Statement(s)
        Collector<Object, ?, Object[]> result = Streams.toArray(Object.class);
        Streams.ArrayCollector streamsArrayCollector = new Streams.ArrayCollector(Object.class);
        //Assert statement(s)
        //TODO: Please implement equals method in ArrayCollector for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(streamsArrayCollector)));
    }
}
