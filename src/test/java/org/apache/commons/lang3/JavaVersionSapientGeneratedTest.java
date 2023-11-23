package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JavaVersionSapientGeneratedTest {

    //Sapient generated method id: ${e22a9744-058f-3158-86bd-a2487d7d1f4a}
    @Test()
    void getJavaVersionTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<JavaVersion> javaVersion = mockStatic(JavaVersion.class, CALLS_REAL_METHODS)) {
            javaVersion.when(() -> JavaVersion.get("1.8")).thenReturn(JavaVersion.JAVA_0_9);
            //Act Statement(s)
            JavaVersion result = JavaVersion.getJavaVersion("1.8");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(JavaVersion.JAVA_0_9));
                javaVersion.verify(() -> JavaVersion.get("1.8"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f78fef20-323f-3292-8681-bb472a3f6f66}
    @Test()
    void getWhenVersionStrIsNull() {
        /* Branches:
         * (versionStr == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${5d2f6ec8-1e76-3eec-aefd-bc8ef0f615c6}
    @Test()
    void getWhenSwitchVersionStrCase0_9() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "0.9") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("0.9");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_0_9)));
    }

    //Sapient generated method id: ${f14d0b39-bead-3015-860b-1efe611fef71}
    @Test()
    void getWhenSwitchVersionStrCase1_1() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "1.1") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("1.1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_1_1)));
    }

    //Sapient generated method id: ${1df1d994-9da9-3cce-93be-f0dc15b0cdf8}
    @Test()
    void getWhenSwitchVersionStrCase1_2() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "1.2") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("1.2");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_1_2)));
    }

    //Sapient generated method id: ${aa379c02-c519-3373-a289-3c9cd47875a8}
    @Test()
    void getWhenSwitchVersionStrCase1_3() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "1.3") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("1.3");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_1_3)));
    }

    //Sapient generated method id: ${7af2a762-e894-37e0-8164-a5fe8278255c}
    @Test()
    void getWhenSwitchVersionStrCase1_4() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "1.4") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("1.4");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_1_4)));
    }

    //Sapient generated method id: ${5fb89835-cb5f-3555-91ae-441d1199d17f}
    @Test()
    void getWhenSwitchVersionStrCase1_5() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "1.5") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("1.5");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_1_5)));
    }

    //Sapient generated method id: ${0fb9ef28-749b-35cb-8892-618a676d71a6}
    @Test()
    void getWhenSwitchVersionStrCase1_6() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "1.6") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("1.6");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_1_6)));
    }

    //Sapient generated method id: ${a507f603-39d5-32ea-afb4-1b6f9ea9487d}
    @Test()
    void getWhenSwitchVersionStrCase1_7() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "1.7") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("1.7");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_1_7)));
    }

    //Sapient generated method id: ${14ab7614-361b-3e6c-a536-3a0392650628}
    @Test()
    void getWhenSwitchVersionStrCase1_8() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "1.8") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("1.8");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_1_8)));
    }

    //Sapient generated method id: ${92e34485-402e-3a1d-ade8-2dd424c95474}
    @Test()
    void getWhenSwitchVersionStrCase10() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "10") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("10");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_10)));
    }

    //Sapient generated method id: ${11479df8-4156-3d9f-83e9-ed2222834ace}
    @Test()
    void getWhenSwitchVersionStrCase11() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "11") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("11");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_11)));
    }

    //Sapient generated method id: ${b75fa75f-2521-32b7-a4ea-e9202cd639a3}
    @Test()
    void getWhenSwitchVersionStrCase12() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "12") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("12");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_12)));
    }

    //Sapient generated method id: ${b93ed032-a492-38ed-a8be-747af0e4eec2}
    @Test()
    void getWhenSwitchVersionStrCase13() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "13") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("13");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_13)));
    }

    //Sapient generated method id: ${3877a2b9-93a9-3b6b-8784-d49342ebcdb2}
    @Test()
    void getWhenSwitchVersionStrCase14() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "14") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("14");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_14)));
    }

    //Sapient generated method id: ${02546acc-a1b7-3362-a357-510f3117b284}
    @Test()
    void getWhenSwitchVersionStrCase15() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "15") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("15");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_15)));
    }

    //Sapient generated method id: ${cb409155-a81e-3c55-a6f4-20ca260439cb}
    @Test()
    void getWhenSwitchVersionStrCase16() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "16") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("16");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_16)));
    }

    //Sapient generated method id: ${13c469ed-bb59-3e26-900b-2f1ae9cdd7ac}
    @Test()
    void getWhenSwitchVersionStrCase17() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "17") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("17");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_17)));
    }

    //Sapient generated method id: ${08ce35dc-e8b4-30da-b8d3-2e822785a5b4}
    @Test()
    void getWhenSwitchVersionStrCase18() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "18") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("18");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_18)));
    }

    //Sapient generated method id: ${ebe75e2a-708f-3c87-b95f-c95862cb53be}
    @Test()
    void getWhenSwitchVersionStrCase19() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "19") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("19");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_19)));
    }

    //Sapient generated method id: ${b0b7a87e-74de-30f1-90c1-8fd6c4552188}
    @Test()
    void getWhenSwitchVersionStrCase20() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "20") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("20");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_20)));
    }

    //Sapient generated method id: ${5aa7df3a-8080-354b-9c32-f363fbd43180}
    @Test()
    void getWhenSwitchVersionStrCase21() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "21") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("21");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_21)));
    }

    //Sapient generated method id: ${31f79120-415c-377b-8ea5-602091bca034}
    @Test()
    void getWhenSwitchVersionStrCase9() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = "9") : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("9");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_9)));
    }

    //Sapient generated method id: ${ebdf2f01-e841-32f0-ab6c-690d87a56841}
    @Disabled()
    @Test()
    void getWhenFloatParseFloatVersionStrSubstringFirstCommaPlus1EndGreaterThan_9f() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = default) : true
         * (!value.contains(".")) : true  #  inside toFloatVersion method
         * ((v - 1.) < 1.) : true
         * (Float.parseFloat(versionStr.substring(firstComma + 1, end)) > .9f) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("versionStr1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(JavaVersion.JAVA_RECENT)));
    }

    //Sapient generated method id: ${6b247e77-59c9-3d2d-93d4-b76a8917674a}
    @Disabled()
    @Test()
    void getWhenVMinus1_LessThan1_AndFloatParseFloatVersionStrSubstringFirstCommaPlus1EndNotGreaterThan_9f() {
        /* Branches:
         * (versionStr == null) : false
         * (switch(versionStr) = default) : true
         * (!value.contains(".")) : false  #  inside toFloatVersion method
         * (toParse.length >= 2) : false  #  inside toFloatVersion method
         * ((v - 1.) < 1.) : true
         * (Float.parseFloat(versionStr.substring(firstComma + 1, end)) > .9f) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JavaVersion result = JavaVersion.get("versionStr1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }
}
