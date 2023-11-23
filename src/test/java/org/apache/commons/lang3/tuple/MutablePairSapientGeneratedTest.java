package org.apache.commons.lang3.tuple;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.util.Map;
import java.util.AbstractMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MutablePairSapientGeneratedTest {

    //Sapient generated method id: ${d12da1d2-df97-3fe2-8847-218afb2f25e9}
    @Test()
    void emptyArray1Test() {

        //Act Statement(s)
        MutablePair<Object, Object>[] result = MutablePair.emptyArray();
        MutablePair<Object, Object>[] mutablePairResultArray = new MutablePair[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(mutablePairResultArray)));
    }

    //Sapient generated method id: ${89de7933-05e8-343b-97f3-1b0a1a26943a}
    @Test()
    void of2Test() {
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();

        //Act Statement(s)
        MutablePair<Object, Object> result = MutablePair.of(object, object2);
        MutablePair<Object, Object> mutablePair = new MutablePair<>(object, object2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(mutablePair)));
    }

    //Sapient generated method id: ${a17ea412-dc40-396d-adf6-7e1bad70aa59}
    @Test()
    void of3WhenPairIsNotNull() {
        /* Branches:
         * (pair != null) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();

        //Act Statement(s)
        MutablePair<Object, Object> result = MutablePair.of(new AbstractMap.SimpleEntry<>(object, object2));
        MutablePair<Object, Object> mutablePair = new MutablePair<>(object, object2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(mutablePair)));
    }

    //Sapient generated method id: ${b9902692-7c31-3509-8f67-a0fc8344991d}
    @Test()
    void of3WhenPairIsNull() {
        /* Branches:
         * (pair != null) : false
         */
        //Arrange Statement(s)
        Map.Entry<Object, Object> mapEntry = null;

        //Act Statement(s)
        MutablePair<Object, Object> result = MutablePair.of(mapEntry);
        MutablePair<Object, Object> mutablePair = new MutablePair<>((Object) null, (Object) null);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(mutablePair)));
    }

    //Sapient generated method id: ${ba305d04-37b6-34e8-b947-c11feca121c7}
    @Test()
    void ofNonNull1Test() {
        //Arrange Statement(s)
        try (MockedStatic<MutablePair> mutablePair = mockStatic(MutablePair.class, CALLS_REAL_METHODS)) {
            MutablePair<Object, Object> mutablePair2 = new MutablePair<>();
            Object object = new Object();
            Object object2 = new Object();
            mutablePair.when(() -> MutablePair.of(object, object2)).thenReturn(mutablePair2);
            //Act Statement(s)
            MutablePair<Object, Object> result = MutablePair.ofNonNull(object, object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(mutablePair2));
                mutablePair.verify(() -> MutablePair.of(object, object2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${caf82ae3-0e98-3057-9861-2dae5125f309}
    @Test()
    void setValueTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        MutablePair target = new MutablePair(object, object2);
        Object object3 = new Object();

        //Act Statement(s)
        Object result = target.setValue(object3);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(object2)));
    }
}
