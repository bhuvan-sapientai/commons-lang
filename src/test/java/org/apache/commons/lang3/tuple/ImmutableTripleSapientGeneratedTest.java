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

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ImmutableTripleSapientGeneratedTest {

    //Sapient generated method id: ${d12da1d2-df97-3fe2-8847-218afb2f25e9}
    @Test()
    void emptyArray1Test() {
        //Act Statement(s)
        ImmutableTriple<Object, Object, Object>[] result = ImmutableTriple.emptyArray();
        ImmutableTriple<Object, Object, Object>[] immutableTripleResultArray = new ImmutableTriple[]{};
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(immutableTripleResultArray)));
    }

    //Sapient generated method id: ${ad4ece22-a358-38a3-96cf-df3eaf721832}
    @Disabled()
    @Test()
    void nullTripleTest() {
        //Act Statement(s)
        ImmutableTriple<Object, Object, Object> result = ImmutableTriple.nullTriple();
        Object object = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        ImmutableTriple immutableTriple = new ImmutableTriple(object, object2, object3);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(immutableTriple)));
    }

    //Sapient generated method id: ${4c4c8c14-ecee-31be-990e-0e258c2e834e}
    @Test()
    void of1WhenRightIsNotNull() {
        /* Branches:
         * (left != null) : true
         * (middle != null) : true
         * (right != null) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        //Act Statement(s)
        ImmutableTriple<Object, Object, Object> result = ImmutableTriple.of(object, object2, object3);
        ImmutableTriple<Object, Object, Object> immutableTriple = new ImmutableTriple<>(object, object2, object3);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(immutableTriple)));
    }

    //Sapient generated method id: ${c77dcf67-6776-358b-8040-ecb573ce3791}
    @Disabled()
    @Test()
    void of1WhenRightIsNull() {
        /* Branches:
         * (left != null) : false
         * (middle != null) : false
         * (right != null) : false
         */
        //Arrange Statement(s)
        Object object = null;
        Object object2 = null;
        Object object3 = null;
        //Act Statement(s)
        ImmutableTriple<Object, Object, Object> result = ImmutableTriple.of(object, object2, object3);
        Object object4 = new Object();
        Object object5 = new Object();
        Object object6 = new Object();
        ImmutableTriple immutableTriple = new ImmutableTriple(object4, object5, object6);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(immutableTriple)));
    }

    //Sapient generated method id: ${ba305d04-37b6-34e8-b947-c11feca121c7}
    @Test()
    void ofNonNull1Test() {
        //Arrange Statement(s)
        try (MockedStatic<ImmutableTriple> immutableTriple = mockStatic(ImmutableTriple.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            Object object3 = new Object();
            ImmutableTriple immutableTriple2 = new ImmutableTriple(object, object2, object3);
            Object object4 = new Object();
            Object object5 = new Object();
            Object object6 = new Object();
            immutableTriple.when(() -> ImmutableTriple.of(object4, object5, object6)).thenReturn(immutableTriple2);
            //Act Statement(s)
            ImmutableTriple<Object, Object, Object> result = ImmutableTriple.ofNonNull(object4, object5, object6);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(immutableTriple2));
                immutableTriple.verify(() -> ImmutableTriple.of(object4, object5, object6), atLeast(1));
            });
        }
    }
}
