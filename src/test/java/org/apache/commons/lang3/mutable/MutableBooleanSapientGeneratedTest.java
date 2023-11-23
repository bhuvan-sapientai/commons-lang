package org.apache.commons.lang3.mutable;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MutableBooleanSapientGeneratedTest {

    //Sapient generated method id: ${b0d20fa9-e250-397e-b581-b3faccc5922b}
    @Test()
    void getValueTest() {
        //Arrange Statement(s)
        MutableBoolean target = new MutableBoolean(false);

        //Act Statement(s)
        Boolean result = target.getValue();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${c83accda-e025-33a6-958f-cb8c26a7e27f}
    @Test()
    void setFalseTest() {
        //Arrange Statement(s)
        MutableBoolean target = new MutableBoolean(false);

        //Act Statement(s)
        target.setFalse();
    }

    //Sapient generated method id: ${10c51784-ddc4-37bb-a045-eb4f326fbcfd}
    @Test()
    void setTrueTest() {
        //Arrange Statement(s)
        MutableBoolean target = new MutableBoolean(false);

        //Act Statement(s)
        target.setTrue();
    }

    //Sapient generated method id: ${3a069434-0a20-3c0a-b281-65568fb6e90d}
    @Test()
    void setValue1Test() {
        //Arrange Statement(s)
        MutableBoolean target = new MutableBoolean(false);

        //Act Statement(s)
        target.setValue(false);
    }

    //Sapient generated method id: ${9c4d3e96-2380-3606-ac49-3a48096b46c2}
    @Test()
    void isFalseWhenNotValue() {
        /* Branches:
         * (!value) : true
         */
        //Arrange Statement(s)
        MutableBoolean target = new MutableBoolean(false);

        //Act Statement(s)
        boolean result = target.isFalse();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${dc2f61ed-37e3-31d5-b43d-7402914c44ab}
    @Test()
    void isFalseWhenValue() {
        /* Branches:
         * (!value) : false
         */
        //Arrange Statement(s)
        MutableBoolean target = new MutableBoolean(true);

        //Act Statement(s)
        boolean result = target.isFalse();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${9a68992f-c17b-3f0e-aa5c-d24166008f87}
    @Test()
    void booleanValueWhenValue() {
        /* Branches:
         * (value) : true
         */
        //Arrange Statement(s)
        MutableBoolean target = new MutableBoolean(true);

        //Act Statement(s)
        boolean result = target.booleanValue();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${5295f44c-e7b7-3062-90cb-cab2070ee8f5}
    @Test()
    void booleanValueWhenNotValue() {
        /* Branches:
         * (value) : false
         */
        //Arrange Statement(s)
        MutableBoolean target = new MutableBoolean(false);

        //Act Statement(s)
        boolean result = target.booleanValue();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${3e646156-41ca-31fe-b5c5-3e21a6be8b82}
    @Test()
    void toBooleanTest() {
        //Arrange Statement(s)
        MutableBoolean target = spy(new MutableBoolean(false));
        doReturn(false).when(target).booleanValue();

        //Act Statement(s)
        Boolean result = target.toBoolean();

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target).booleanValue();
        });
    }

    //Sapient generated method id: ${af5f6332-26a2-3749-8f9a-ac87ce6fe7cf}
    @Test()
    void compareToTest() {
        //Arrange Statement(s)
        MutableBoolean target = new MutableBoolean(false);
        MutableBoolean mutableBoolean = new MutableBoolean(false);

        //Act Statement(s)
        int result = target.compareTo(mutableBoolean);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Test()
    void toStringTest() {
        //Arrange Statement(s)
        MutableBoolean target = new MutableBoolean(false);

        //Act Statement(s)
        String result = target.toString();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("false")));
    }
}
