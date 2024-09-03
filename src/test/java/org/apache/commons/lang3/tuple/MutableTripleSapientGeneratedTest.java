package org.apache.commons.lang3.tuple;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MutableTripleSapientGeneratedTest {

    //Sapient generated method id: ${emptyArray1Test}, hash: D143AA1EF97798AC6B551A014802E0E4
    @Test()
    void emptyArray1Test() {
        
        //Act Statement(s)
        MutableTriple<Object, Object, Object>[] result = MutableTriple.emptyArray();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //Sapient generated method id: ${of1Test}, hash: E94A576578C0A68A59767861525BC7C7
    @Test()
    void of1Test() {
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        
        //Act Statement(s)
        MutableTriple<Object, Object, Object> result = MutableTriple.of(object, object2, object3);
        MutableTriple<Object, Object, Object> mutableTriple = new MutableTriple<>(object, object2, object3);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(mutableTriple)));
    }

    //Sapient generated method id: ${ofNonNull1Test}, hash: F9BEAA6B5A63728E23BD5EF6623C7A14
    @Test()
    void ofNonNull1Test() {
        //Arrange Statement(s)
        try (MockedStatic<MutableTriple> mutableTriple = mockStatic(MutableTriple.class, CALLS_REAL_METHODS)) {
            MutableTriple<Object, Object, Object> mutableTriple2 = new MutableTriple<>();
            Object object = new Object();
            Object object2 = new Object();
            Object object3 = new Object();
            mutableTriple.when(() -> MutableTriple.of(object, object2, object3)).thenReturn(mutableTriple2);
            //Act Statement(s)
            MutableTriple<Object, Object, Object> result = MutableTriple.ofNonNull(object, object2, object3);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(mutableTriple2));
                mutableTriple.verify(() -> MutableTriple.of(object, object2, object3), atLeast(1));
            });
        }
    }
}
