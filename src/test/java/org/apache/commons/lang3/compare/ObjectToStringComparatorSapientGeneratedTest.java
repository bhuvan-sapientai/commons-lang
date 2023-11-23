package org.apache.commons.lang3.compare;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ObjectToStringComparatorSapientGeneratedTest {

    private final Object objectMock = mock(Object.class, "compare_object1");

    private final Object objectMock2 = mock(Object.class, "compare_object2");

    //Sapient generated method id: ${ca65dbf5-6182-39a2-9d24-f00c12b5637e}
    @Test()
    void compareWhenO2IsNull() {
        /* Branches:
         * (o1 == null) : true
         * (o2 == null) : true
         */
        //Arrange Statement(s)
        ObjectToStringComparator target = new ObjectToStringComparator();
        Object object = null;
        Object object2 = null;
        //Act Statement(s)
        int result = target.compare(object, object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${3b84a337-8fc2-3a0f-9881-32aa31b8f44c}
    @Test()
    void compareWhenO1IsNull() {
        /* Branches:
         * (o1 == null) : true
         * (o2 == null) : false
         * (o1 == null) : true
         */
        //Arrange Statement(s)
        ObjectToStringComparator target = new ObjectToStringComparator();
        Object object = null;
        Object object2 = new Object();
        //Act Statement(s)
        int result = target.compare(object, object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${32fe73ec-5642-3831-bb8c-22770cbc6dd3}
    @Test()
    void compareWhenO1IsNotNullAndO2IsNull() {
        /* Branches:
         * (o1 == null) : false
         * (o1 == null) : false
         * (o2 == null) : true
         */
        //Arrange Statement(s)
        ObjectToStringComparator target = new ObjectToStringComparator();
        Object object = new Object();
        Object object2 = null;
        //Act Statement(s)
        int result = target.compare(object, object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${94d24a6f-a2f7-34ed-8ab2-475b7e83c72e}
    @Disabled()
    @Test()
    void compareWhenString2IsNull() {
        /* Branches:
         * (o1 == null) : false
         * (o1 == null) : false
         * (o2 == null) : false
         * (string1 == null) : true
         * (string2 == null) : true
         */
        //Arrange Statement(s)
        ObjectToStringComparator target = new ObjectToStringComparator();
        //Act Statement(s)
        int result = target.compare(objectMock, objectMock2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${9d86c3da-4ee5-356f-9d0b-048fe1a8423f}
    @Disabled()
    @Test()
    void compareWhenString1IsNull() {
        /* Branches:
         * (o1 == null) : false
         * (o1 == null) : false
         * (o2 == null) : false
         * (string1 == null) : true
         * (string2 == null) : false
         * (string1 == null) : true
         */
        //Arrange Statement(s)
        ObjectToStringComparator target = new ObjectToStringComparator();
        //Act Statement(s)
        int result = target.compare(objectMock, objectMock2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${3d9d159b-5768-3d84-a316-416fb651d810}
    @Test()
    void compareWhenString1IsNotNullAndString2IsNull() {
        /* Branches:
         * (o1 == null) : false
         * (o1 == null) : false
         * (o2 == null) : false
         * (string1 == null) : false
         * (string1 == null) : false
         * (string2 == null) : true
         */
        //Arrange Statement(s)
        ObjectToStringComparator target = new ObjectToStringComparator();
        //Act Statement(s)
        int result = target.compare(objectMock, objectMock2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${955d0140-8ff0-366f-a302-aafd2cbf1ad0}
    @Test()
    void compareWhenString2IsNotNull() {
        /* Branches:
         * (o1 == null) : false
         * (o1 == null) : false
         * (o2 == null) : false
         * (string1 == null) : false
         * (string1 == null) : false
         * (string2 == null) : false
         */
        //Arrange Statement(s)
        ObjectToStringComparator target = new ObjectToStringComparator();
        //Act Statement(s)
        int result = target.compare(objectMock, objectMock2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }
}
