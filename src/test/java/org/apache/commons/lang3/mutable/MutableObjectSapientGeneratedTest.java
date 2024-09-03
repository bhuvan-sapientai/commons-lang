package org.apache.commons.lang3.mutable;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MutableObjectSapientGeneratedTest {

    //Sapient generated method id: ${toStringTest}, hash: 832F471EC645BF00F9F4C9600D23690C
    @Test()
    void toStringTest() {
        //Arrange Statement(s)
        Object object = new Object();
        MutableObject target = new MutableObject(object);
        
        //Act Statement(s)
        String result = target.toString();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("java.lang.Object@681234ac")));
    }
}
