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

    //Sapient generated method id: ${d12da1d2-df97-3fe2-8847-218afb2f25e9}
    @Test()
    void emptyArray1Test() {

        //Act Statement(s)
        MutableTriple<Object, Object, Object>[] result = MutableTriple.emptyArray();
        MutableTriple<Object, Object, Object>[] mutableTripleResultArray = new MutableTriple[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(mutableTripleResultArray)));
    }

    //Sapient generated method id: ${2d9e451b-59ca-3da9-a6c7-f80da9bfa12e}
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

    //Sapient generated method id: ${ba305d04-37b6-34e8-b947-c11feca121c7}
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
