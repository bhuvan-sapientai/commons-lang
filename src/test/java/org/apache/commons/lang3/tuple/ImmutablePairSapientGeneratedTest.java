package org.apache.commons.lang3.tuple;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.util.Map;
import java.util.AbstractMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ImmutablePairSapientGeneratedTest {

    //Sapient generated method id: ${d12da1d2-df97-3fe2-8847-218afb2f25e9}
    @Test()
    void emptyArray1Test() {
        //Act Statement(s)
        ImmutablePair<Object, Object>[] result = ImmutablePair.emptyArray();
        ImmutablePair<Object, Object>[] immutablePairResultArray = new ImmutablePair[]{};
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(immutablePairResultArray)));
    }

    //Sapient generated method id: ${b70784fd-e146-34fe-9cb3-e473cc9d491a}
    @Test()
    void leftTest() {
        //Arrange Statement(s)
        try (MockedStatic<ImmutablePair> immutablePair = mockStatic(ImmutablePair.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            ImmutablePair immutablePair2 = new ImmutablePair(object, object2);
            Object object3 = new Object();
            immutablePair.when(() -> ImmutablePair.of(object3, (Object) null)).thenReturn(immutablePair2);
            //Act Statement(s)
            Pair<Object, Object> result = ImmutablePair.left(object3);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(immutablePair2));
                immutablePair.verify(() -> ImmutablePair.of(object3, (Object) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${44aa148d-ae51-3bcb-906a-b44fe20d904c}
    @Disabled()
    @Test()
    void nullPairTest() {
        //Act Statement(s)
        ImmutablePair<Object, Object> result = ImmutablePair.nullPair();
        Object object = new Object();
        Object object2 = new Object();
        ImmutablePair immutablePair = new ImmutablePair(object, object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(immutablePair)));
    }

    //Sapient generated method id: ${a7b25afa-9198-31ae-b026-41c2011c33ce}
    @Test()
    void of2WhenRightIsNotNull() {
        /* Branches:
         * (left != null) : false
         * (right != null) : true
         */
        //Arrange Statement(s)
        Object object = null;
        Object object2 = new Object();
        //Act Statement(s)
        ImmutablePair<Object, Object> result = ImmutablePair.of(object, object2);
        ImmutablePair<Object, Object> immutablePair = new ImmutablePair<>((Object) null, object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(immutablePair)));
    }

    //Sapient generated method id: ${4f2ef94e-1cc8-30b9-a068-c1eb00f65f84}
    @Disabled()
    @Test()
    void of2WhenRightIsNull() {
        /* Branches:
         * (left != null) : false
         * (right != null) : false
         */
        //Arrange Statement(s)
        Object object = null;
        Object object2 = null;
        //Act Statement(s)
        ImmutablePair<Object, Object> result = ImmutablePair.of(object, object2);
        Object object3 = new Object();
        Object object4 = new Object();
        ImmutablePair immutablePair = new ImmutablePair(object3, object4);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(immutablePair)));
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
        ImmutablePair<Object, Object> result = ImmutablePair.of(new AbstractMap.SimpleEntry<>(object, object2));
        ImmutablePair<Object, Object> immutablePair = new ImmutablePair<>(object, object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(immutablePair)));
    }

    //Sapient generated method id: ${b9902692-7c31-3509-8f67-a0fc8344991d}
    @Disabled()
    @Test()
    void of3WhenPairIsNull() {
        /* Branches:
         * (pair != null) : false
         */
        //Arrange Statement(s)
        Map.Entry<Object, Object> mapEntry = null;
        //Act Statement(s)
        ImmutablePair<Object, Object> result = ImmutablePair.of(mapEntry);
        Object object = new Object();
        Object object2 = new Object();
        ImmutablePair immutablePair = new ImmutablePair(object, object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(immutablePair)));
    }

    //Sapient generated method id: ${ba305d04-37b6-34e8-b947-c11feca121c7}
    @Test()
    void ofNonNull1Test() {
        //Arrange Statement(s)
        try (MockedStatic<ImmutablePair> immutablePair = mockStatic(ImmutablePair.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            ImmutablePair immutablePair2 = new ImmutablePair(object, object2);
            Object object3 = new Object();
            Object object4 = new Object();
            immutablePair.when(() -> ImmutablePair.of(object3, object4)).thenReturn(immutablePair2);
            //Act Statement(s)
            ImmutablePair<Object, Object> result = ImmutablePair.ofNonNull(object3, object4);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(immutablePair2));
                immutablePair.verify(() -> ImmutablePair.of(object3, object4), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f7051d1f-f720-3b33-960f-d9a2e0f4ec68}
    @Test()
    void rightTest() {
        //Arrange Statement(s)
        try (MockedStatic<ImmutablePair> immutablePair = mockStatic(ImmutablePair.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            ImmutablePair immutablePair2 = new ImmutablePair(object, object2);
            Object object3 = new Object();
            immutablePair.when(() -> ImmutablePair.of((Object) null, object3)).thenReturn(immutablePair2);
            //Act Statement(s)
            Pair<Object, Object> result = ImmutablePair.right(object3);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(immutablePair2));
                immutablePair.verify(() -> ImmutablePair.of((Object) null, object3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f2f28fc8-ab67-370d-9aa7-1de8ecbd9982}
    @Test()
    void setValueThrowsUnsupportedOperationException() {
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        ImmutablePair target = new ImmutablePair(object, object2);
        Object object3 = new Object();
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.setValue(object3);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
