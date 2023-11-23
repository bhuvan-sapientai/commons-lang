package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.Collection;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StreamsSapientGeneratedTest {

    //Sapient generated method id: ${b4af2388-e781-3800-820a-b8ede09bd914}
    @Disabled()
    @Test()
    void streamTest() {
        //Arrange Statement(s)
        Stream<Object> stream = Stream.empty();
        //Act Statement(s)
        Streams.FailableStream result = Streams.stream(stream);
        Streams.FailableStream streamsFailableStream = new Streams.FailableStream(stream);
        //Assert statement(s)
        //TODO: Please implement equals method in FailableStream for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(streamsFailableStream)));
    }

    //Sapient generated method id: ${3b200cb7-448d-34b5-bf0d-0c7d7dec4137}
    @Disabled()
    @Test()
    void stream1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Streams> streams = mockStatic(Streams.class, CALLS_REAL_METHODS)) {
            Stream stream = Stream.empty();
            Streams.FailableStream streamsFailableStream = new Streams.FailableStream(stream);
            streams.when(() -> Streams.stream((Stream) null)).thenReturn(streamsFailableStream);
            Collection<Object> collection = new ArrayList<>();
            //Act Statement(s)
            Streams.FailableStream result = Streams.stream(collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(streamsFailableStream));
                streams.verify(() -> Streams.stream((Stream) null), atLeast(1));
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
