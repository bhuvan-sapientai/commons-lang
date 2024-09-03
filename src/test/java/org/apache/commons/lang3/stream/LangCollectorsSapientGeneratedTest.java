package org.apache.commons.lang3.stream;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.function.Function;
import java.util.stream.Collector;
import org.mockito.MockedStatic;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
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
class LangCollectorsSapientGeneratedTest {

    private final Collector collectorMock = mock(Collector.class);

    //Sapient generated method id: ${joiningTest}, hash: B002FD8FE3E06977F3B9A0D4A36E465B
    @Test()
    void joiningTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Collector<Object, ?, String> result = LangCollectors.joining();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${joining1Test}, hash: E249554D1D279C0C9BF608211704810F
    @Test()
    void joining1Test() {
        //Arrange Statement(s)
        try (MockedStatic<LangCollectors> langCollectors = mockStatic(LangCollectors.class, CALLS_REAL_METHODS)) {
            langCollectors.when(() -> LangCollectors.joining("delimiter1", "", "")).thenReturn(collectorMock);
            //Act Statement(s)
            Collector<Object, ?, String> result = LangCollectors.joining("delimiter1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(collectorMock));
                langCollectors.verify(() -> LangCollectors.joining("delimiter1", "", ""), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${joining2Test}, hash: EB3BD534F60A12C4079894696C739DB9
    @Test()
    void joining2Test() {
        //Arrange Statement(s)
        try (MockedStatic<LangCollectors> langCollectors = mockStatic(LangCollectors.class, CALLS_REAL_METHODS)) {
            langCollectors.when(() -> LangCollectors.joining(eq("delimiter1"), eq("prefix1"), eq("suffix1"), (Function) any())).thenReturn(collectorMock);
            //Act Statement(s)
            Collector<Object, ?, String> result = LangCollectors.joining("delimiter1", "prefix1", "suffix1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(collectorMock));
                langCollectors.verify(() -> LangCollectors.joining(eq("delimiter1"), eq("prefix1"), eq("suffix1"), (Function) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${joining3Test}, hash: AD7E6D936E193FFC35BB4FBCAA548797
    @Test()
    void joining3Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Function functionMock = mock(Function.class);
        
        //Act Statement(s)
        Collector<Object, ?, String> result = LangCollectors.joining("delimiter1", "prefix1", "suffix1", functionMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
