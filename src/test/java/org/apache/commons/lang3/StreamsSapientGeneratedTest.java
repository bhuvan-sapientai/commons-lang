package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.stream.Collector;
import java.util.Collection;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import java.util.stream.Stream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StreamsSapientGeneratedTest {

    //Sapient generated method id: ${streamTest}, hash: 16718FF8EBE89E56BA260BB28D0B07FD
    @Test()
    void streamTest() {
        //Arrange Statement(s)
        Stream streamMock = mock(Stream.class);
        try (MockedStatic<Streams> streams = mockStatic(Streams.class, CALLS_REAL_METHODS)) {
            Stream stream = Stream.empty();
            Streams.FailableStream streamsFailableStream = new Streams.FailableStream(stream);
            streams.when(() -> Streams.stream(streamMock)).thenReturn(streamsFailableStream);
            Collection<Object> collection = new ArrayList<>();
            //Act Statement(s)
            Streams.FailableStream result = Streams.stream(collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(streamsFailableStream));
                streams.verify(() -> Streams.stream(streamMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${stream1Test}, hash: 3F9AD84E20890B2435135518BD556B8D
    @Test()
    void stream1Test() {
        //Arrange Statement(s)
        Stream<Object> stream = Stream.empty();
        
        //Act Statement(s)
        Streams.FailableStream result = Streams.stream(stream);
        
        //Assert statement(s)
        //TODO: Please implement equals method in FailableStream for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${toArrayTest}, hash: 205BE87406F244020E0F444A5A471C56
    @Test()
    void toArrayTest() {
        
        //Act Statement(s)
        Collector<Object, ?, Object[]> result = Streams.toArray(Object.class);
        
        //Assert statement(s)
        //TODO: Please implement equals method in ArrayCollector for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
