package org.apache.commons.lang3.concurrent;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConstantInitializerSapientGeneratedTest {

    //Sapient generated method id: ${getTest}, hash: 9D7391D2B52A26EAD842F917E2BD9A12
    @Test()
    void getTest() throws ConcurrentException {
        //Arrange Statement(s)
        Object object = new Object();
        ConstantInitializer target = new ConstantInitializer(object);
        
        //Act Statement(s)
        Object result = target.get();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${isInitializedTest}, hash: 529147FBA9F2508389ECFB3CDD911AC4
    @Test()
    void isInitializedTest() {
        //Arrange Statement(s)
        Object object = new Object();
        ConstantInitializer target = new ConstantInitializer(object);
        
        //Act Statement(s)
        boolean result = target.isInitialized();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${toStringTest}, hash: C3AC5BA71DBC76EFB5A3BF49A34F451C
    @Test()
    void toStringTest() {
        //Arrange Statement(s)
        Object objectMock = mock(Object.class, "obj");
        ConstantInitializer target = new ConstantInitializer(objectMock);
        
        //Act Statement(s)
        String result = target.toString();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("ConstantInitializer@0 [ object = obj ]")));
    }
}
