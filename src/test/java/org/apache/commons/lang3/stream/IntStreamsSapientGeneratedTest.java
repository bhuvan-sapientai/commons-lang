package org.apache.commons.lang3.stream;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.stream.IntStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class IntStreamsSapientGeneratedTest {

    //Sapient generated method id: ${rangeTest}, hash: A4924B59612D5C223031D93374F2498D
    @Test()
    void rangeTest() {
        
        //Act Statement(s)
        IntStream result = IntStreams.range(1);
        
        //Assert statement(s)
        //TODO: Please implement equals method in IntStream for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${rangeClosedTest}, hash: DCFF7F008BF4B01A03F6683AC51100AB
    @Test()
    void rangeClosedTest() {
        
        //Act Statement(s)
        IntStream result = IntStreams.rangeClosed(1);
        
        //Assert statement(s)
        //TODO: Please implement equals method in IntStream for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
