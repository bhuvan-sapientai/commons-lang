package org.apache.commons.lang3.function;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.function.Function;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FunctionsSapientGeneratedTest {

    //Sapient generated method id: ${functionTest}, hash: 87AA1238EBC9B3429181AD6618452D1B
    @Test()
    void functionTest() {
        //Arrange Statement(s)
        Function functionMock = mock(Function.class);
        
        //Act Statement(s)
        Function<Object, Object> result = Functions.function(functionMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(functionMock)));
    }
}
