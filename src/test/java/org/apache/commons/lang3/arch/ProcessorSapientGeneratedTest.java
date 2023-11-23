package org.apache.commons.lang3.arch;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ProcessorSapientGeneratedTest {

    //Sapient generated method id: ${c3138ddc-ab16-3e81-9422-b5a8a5dd352a}
    @Test()
    void is32BitWhenArchBIT_32EqualsArch() {
        /* Branches:
         * (Arch.BIT_32 == arch) : true
         */
        //Arrange Statement(s)
        Processor target = new Processor(Processor.Arch.BIT_32, Processor.Type.AARCH_64);

        //Act Statement(s)
        boolean result = target.is32Bit();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${3476542e-5a24-3817-a65d-e422d8e35ad8}
    @Test()
    void is32BitWhenArchBIT_32NotEqualsArch() {
        /* Branches:
         * (Arch.BIT_32 == arch) : false
         */
        //Arrange Statement(s)
        Processor target = new Processor(Processor.Arch.BIT_64, Processor.Type.AARCH_64);

        //Act Statement(s)
        boolean result = target.is32Bit();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${c845e334-a287-38f9-a991-47d6c89152fd}
    @Test()
    void is64BitWhenArchBIT_64EqualsArch() {
        /* Branches:
         * (Arch.BIT_64 == arch) : true
         */
        //Arrange Statement(s)
        Processor target = new Processor(Processor.Arch.BIT_64, Processor.Type.AARCH_64);

        //Act Statement(s)
        boolean result = target.is64Bit();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${c7c09bfc-1589-3049-9f1c-412f01b450aa}
    @Test()
    void is64BitWhenArchBIT_64NotEqualsArch() {
        /* Branches:
         * (Arch.BIT_64 == arch) : false
         */
        //Arrange Statement(s)
        Processor target = new Processor(Processor.Arch.BIT_32, Processor.Type.AARCH_64);

        //Act Statement(s)
        boolean result = target.is64Bit();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${9f2d25c9-c803-37b9-aec9-0fbc9aa7d938}
    @Test()
    void isAarch64WhenTypeAARCH_64EqualsType() {
        /* Branches:
         * (Type.AARCH_64 == type) : true
         */
        //Arrange Statement(s)
        Processor target = new Processor(Processor.Arch.BIT_32, Processor.Type.AARCH_64);

        //Act Statement(s)
        boolean result = target.isAarch64();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${313ad28e-3f33-353f-a65e-76186c6c3357}
    @Test()
    void isAarch64WhenTypeAARCH_64NotEqualsType() {
        /* Branches:
         * (Type.AARCH_64 == type) : false
         */
        //Arrange Statement(s)
        Processor target = new Processor(Processor.Arch.BIT_32, Processor.Type.IA_64);

        //Act Statement(s)
        boolean result = target.isAarch64();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${49ab5cfa-ac6c-3ebb-9d53-cd7b7be02528}
    @Test()
    void isIA64WhenTypeIA_64EqualsType() {
        /* Branches:
         * (Type.IA_64 == type) : true
         */
        //Arrange Statement(s)
        Processor target = new Processor(Processor.Arch.BIT_32, Processor.Type.IA_64);

        //Act Statement(s)
        boolean result = target.isIA64();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${1e4819b9-30cd-365f-bd3f-1283395232dd}
    @Test()
    void isIA64WhenTypeIA_64NotEqualsType() {
        /* Branches:
         * (Type.IA_64 == type) : false
         */
        //Arrange Statement(s)
        Processor target = new Processor(Processor.Arch.BIT_32, Processor.Type.UNKNOWN);

        //Act Statement(s)
        boolean result = target.isIA64();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${f00c328e-a80f-3c0b-bb6e-1ef1a9fcc44c}
    @Test()
    void isPPCWhenTypePPCEqualsType() {
        /* Branches:
         * (Type.PPC == type) : true
         */
        //Arrange Statement(s)
        Processor target = new Processor(Processor.Arch.BIT_32, Processor.Type.PPC);

        //Act Statement(s)
        boolean result = target.isPPC();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${76aad96a-72a3-3628-9cf0-50ae6457cda2}
    @Test()
    void isPPCWhenTypePPCNotEqualsType() {
        /* Branches:
         * (Type.PPC == type) : false
         */
        //Arrange Statement(s)
        Processor target = new Processor(Processor.Arch.BIT_32, Processor.Type.UNKNOWN);

        //Act Statement(s)
        boolean result = target.isPPC();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${bb27b434-9115-3a33-bf42-6f30ae285c41}
    @Test()
    void isX86WhenTypeX86EqualsType() {
        /* Branches:
         * (Type.X86 == type) : true
         */
        //Arrange Statement(s)
        Processor target = new Processor(Processor.Arch.BIT_32, Processor.Type.X86);

        //Act Statement(s)
        boolean result = target.isX86();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${e3128dc9-b225-393a-8a9c-39233302c182}
    @Test()
    void isX86WhenTypeX86NotEqualsType() {
        /* Branches:
         * (Type.X86 == type) : false
         */
        //Arrange Statement(s)
        Processor target = new Processor(Processor.Arch.BIT_32, Processor.Type.UNKNOWN);

        //Act Statement(s)
        boolean result = target.isX86();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Test()
    void toStringTest() {
        //Arrange Statement(s)
        Processor target = new Processor(Processor.Arch.BIT_64, Processor.Type.PPC);

        //Act Statement(s)
        String result = target.toString();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("PPC 64-bit")));
    }
}
