package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BitFieldSapientGeneratedTest {

    //Sapient generated method id: ${b0d20fa9-e250-397e-b581-b3faccc5922b}
    @Test()
    void getValueTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitField target = new BitField(0);
        //Act Statement(s)
        int result = target.getValue(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${a2e7b08e-47e2-3455-85b8-50f40718b5ad}
    @Test()
    void getShortValueTest() {
        //Arrange Statement(s)
        BitField target = spy(new BitField(0));
        doReturn(0).when(target).getValue((short) 0);
        //Act Statement(s)
        short result = target.getShortValue((short) 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo((short) 0));
            verify(target).getValue((short) 0);
        });
    }

    //Sapient generated method id: ${54d8935b-c25b-3fa5-a6d7-323a0822e385}
    @Test()
    void getRawValueTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitField target = new BitField(0);
        //Act Statement(s)
        int result = target.getRawValue(5);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${12d78b07-04b1-3557-bc71-3aff3bf5b60d}
    @Test()
    void getShortRawValueTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitField target = new BitField(0);
        //Act Statement(s)
        short result = target.getShortRawValue((short) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }

    //Sapient generated method id: ${0c1de536-a528-3f4b-a859-153c596f783d}
    @Disabled()
    @Test()
    void isSetWhenHolderAndMaskNotEquals0() {
        /* Branches:
         * ((holder & mask) != 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitField target = new BitField(0);
        //Act Statement(s)
        boolean result = target.isSet(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${4f8c7eec-9fea-323f-8d34-5f6b71aa7201}
    @Test()
    void isSetWhenHolderAndMaskEquals0() {
        /* Branches:
         * ((holder & mask) != 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitField target = new BitField(0);
        //Act Statement(s)
        boolean result = target.isSet(1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${ab12da8a-6555-398f-b0cd-28a670807028}
    @Test()
    void isAllSetWhenHolderAndMaskEqualsMask() {
        /* Branches:
         * ((holder & mask) == mask) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitField target = new BitField(0);
        //Act Statement(s)
        boolean result = target.isAllSet(-1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${87fe61a4-9010-334f-818f-7ca3085c62c4}
    @Disabled()
    @Test()
    void isAllSetWhenHolderAndMaskNotEqualsMask() {
        /* Branches:
         * ((holder & mask) == mask) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitField target = new BitField(0);
        //Act Statement(s)
        boolean result = target.isAllSet(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${caf82ae3-0e98-3057-9861-2dae5125f309}
    @Test()
    void setValueTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitField target = new BitField(0);
        //Act Statement(s)
        int result = target.setValue(0, 1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${c49cf82b-2442-3144-83d6-0c5aedf6e64b}
    @Test()
    void setShortValueTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitField target = new BitField(0);
        //Act Statement(s)
        short result = target.setShortValue((short) 0, (short) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }

    //Sapient generated method id: ${53c00396-4771-38ed-8731-096091c47b7f}
    @Test()
    void clearTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitField target = new BitField(0);
        //Act Statement(s)
        int result = target.clear(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${06dc709c-e5ec-30c8-b01d-cbd0dd80c7fb}
    @Test()
    void clearShortTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitField target = new BitField(0);
        //Act Statement(s)
        short result = target.clearShort((short) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }

    //Sapient generated method id: ${050e7b4a-f2ad-30c5-afe4-608d7770a1eb}
    @Test()
    void clearByteTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitField target = new BitField(0);
        //Act Statement(s)
        byte result = target.clearByte((byte) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((byte) 0)));
    }

    //Sapient generated method id: ${5f854b88-bcf7-387d-b72e-a25ce3260bc1}
    @Disabled()
    @Test()
    void setTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitField target = new BitField(0);
        //Act Statement(s)
        int result = target.set(5);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${964af333-3405-3711-beff-dc3fa26a7da6}
    @Test()
    void setShortTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitField target = new BitField(0);
        //Act Statement(s)
        short result = target.setShort((short) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }

    //Sapient generated method id: ${2d883002-a9fe-33d7-a0cc-c98a3ed53b7e}
    @Test()
    void setByteTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitField target = new BitField(0);
        //Act Statement(s)
        byte result = target.setByte((byte) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((byte) 0)));
    }

    //Sapient generated method id: ${9d7313aa-4114-3686-a6ce-72dcf5252f43}
    @Test()
    void setBooleanWhenFlag() {
        /* Branches:
         * (flag) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitField target = new BitField(0);
        //Act Statement(s)
        int result = target.setBoolean(0, true);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${6745da95-58c5-346a-affe-74bd674954e7}
    @Test()
    void setBooleanWhenNotFlag() {
        /* Branches:
         * (flag) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitField target = new BitField(0);
        //Act Statement(s)
        int result = target.setBoolean(0, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${d5358464-9867-3046-a0db-62276b961d94}
    @Test()
    void setShortBooleanWhenFlag() {
        /* Branches:
         * (flag) : true
         */
        //Arrange Statement(s)
        BitField target = spy(new BitField(0));
        doReturn((short) 0).when(target).setShort((short) 0);
        //Act Statement(s)
        short result = target.setShortBoolean((short) 0, true);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo((short) 0));
            verify(target).setShort((short) 0);
        });
    }

    //Sapient generated method id: ${c6155d3a-af60-38cd-b911-a14117a4ba2c}
    @Test()
    void setShortBooleanWhenNotFlag() {
        /* Branches:
         * (flag) : false
         */
        //Arrange Statement(s)
        BitField target = spy(new BitField(0));
        doReturn((short) 0).when(target).clearShort((short) 0);
        //Act Statement(s)
        short result = target.setShortBoolean((short) 0, false);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo((short) 0));
            verify(target).clearShort((short) 0);
        });
    }

    //Sapient generated method id: ${436b78d8-a08a-3fd5-bc44-b785b5e08bcc}
    @Test()
    void setByteBooleanWhenFlag() {
        /* Branches:
         * (flag) : true
         */
        //Arrange Statement(s)
        BitField target = spy(new BitField(0));
        doReturn((byte) 0).when(target).setByte((byte) 0);
        //Act Statement(s)
        byte result = target.setByteBoolean((byte) 0, true);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo((byte) 0));
            verify(target).setByte((byte) 0);
        });
    }

    //Sapient generated method id: ${7a89197c-ccee-30e4-a572-8522ca07c473}
    @Test()
    void setByteBooleanWhenNotFlag() {
        /* Branches:
         * (flag) : false
         */
        //Arrange Statement(s)
        BitField target = spy(new BitField(0));
        doReturn((byte) 0).when(target).clearByte((byte) 0);
        //Act Statement(s)
        byte result = target.setByteBoolean((byte) 0, false);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo((byte) 0));
            verify(target).clearByte((byte) 0);
        });
    }
}
