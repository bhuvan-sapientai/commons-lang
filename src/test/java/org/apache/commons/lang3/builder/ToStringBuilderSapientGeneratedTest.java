package org.apache.commons.lang3.builder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ToStringBuilderSapientGeneratedTest {

    //Sapient generated method id: ${19f91469-c961-30d4-8622-ae4381664c27}
    @Test()
    void getDefaultStyleTest() {
        //Act Statement(s)
        ToStringStyle result = ToStringBuilder.getDefaultStyle();
        ToStringStyle toStringStyle = ToStringStyle.DEFAULT_STYLE;
        //Assert statement(s)
        //TODO: Please implement equals method in ToStringStyle for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(toStringStyle)));
    }

    //Sapient generated method id: ${3e286f53-beb4-3320-ab9f-4827a567c70b}
    @Disabled(value = "Potential harmful system call (static field write: defaultStyle) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests")
    @Test()
    void setDefaultStyleTest() {
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        ToStringStyle toStringStyle = null;
        //Act Statement(s)
        ToStringBuilder.setDefaultStyle(toStringStyle);
        //Assert statement(s)
        assertAll("result", () -> assertThat(ToStringBuilder.getDefaultStyle(), is(nullValue())));
    }

    //Sapient generated method id: ${d15e2f74-5090-37e2-be9f-2ea19965f0d2}
    @Disabled()
    @Test()
    void reflectionToStringTest() {
        //Arrange Statement(s)
        Object object = new Object();
        //Act Statement(s)
        String result = ToStringBuilder.reflectionToString(object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("<null>")));
    }

    //Sapient generated method id: ${93ccb3c7-c1dc-3271-9788-72da2a4ab300}
    @Disabled()
    @Test()
    void reflectionToString1Test() {
        //Arrange Statement(s)
        Object object = new Object();
        ToStringStyle toStringStyle = null;
        //Act Statement(s)
        String result = ToStringBuilder.reflectionToString(object, toStringStyle);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("<null>")));
    }

    //Sapient generated method id: ${2c966dae-89e1-39a2-8753-9b7b6b9dbb17}
    @Disabled()
    @Test()
    void reflectionToString2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        //TODO: Needs initialization with real value
        ToStringStyle toStringStyle = null;
        //Act Statement(s)
        String result = ToStringBuilder.reflectionToString(object, toStringStyle, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${81897b59-05dd-3a62-8049-1a074b2409df}
    @Disabled()
    @Test()
    void reflectionToString3Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        //TODO: Needs initialization with real value
        ToStringStyle toStringStyle = null;
        //Act Statement(s)
        String result = ToStringBuilder.reflectionToString(object, toStringStyle, false, Object.class);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${676fd4ee-a054-37bb-b933-26f808f69714}
    @Test()
    void appendTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        ToStringBuilder result = target.append(false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${58db9f23-ced0-3c8d-85e1-0552ae227959}
    @Test()
    void append1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        boolean[] booleanArray = new boolean[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append(booleanArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${b324e137-5e69-3120-8d06-f0a667c86b18}
    @Test()
    void append2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        ToStringBuilder result = target.append((byte) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${3da06991-53bd-3aea-888b-644df0df1988}
    @Test()
    void append3Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append(byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${77faf400-bf10-378a-a01b-bf0aeb738054}
    @Test()
    void append4Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        ToStringBuilder result = target.append('A');
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${89cd1bc4-cc18-38a3-91af-b77d66a2155e}
    @Test()
    void append5Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        char[] charArray = new char[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append(charArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${49ec5054-cded-359c-bbec-b7dfbfc6a70b}
    @Test()
    void append6Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        ToStringBuilder result = target.append(Double.parseDouble("0.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${b1b34fef-bb63-3c57-9c40-b810c0566ba5}
    @Test()
    void append7Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        double[] doubleArray = new double[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append(doubleArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${f3d7688c-b3eb-395b-a588-830ae1d5b905}
    @Test()
    void append8Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        ToStringBuilder result = target.append(Float.parseFloat("0.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${e4c86b0a-ccbc-31d3-9793-95fb586594d6}
    @Test()
    void append9Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        float[] floatArray = new float[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append(floatArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${bc7fd1c6-0075-355c-80f7-fb98309e0201}
    @Test()
    void append10Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        ToStringBuilder result = target.append(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${665eb434-2822-322a-a831-5c2f33d90413}
    @Test()
    void append11Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        int[] intArray = new int[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append(intArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${a8941ea3-dae5-3fab-b8cb-3c1c0d58264b}
    @Test()
    void append12Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        ToStringBuilder result = target.append(0L);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${bc7ec139-ac76-3102-991e-92073fd0fc3f}
    @Test()
    void append13Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        long[] longArray = new long[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append(longArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${d34dd394-f8d8-3d1a-aadc-ba03c32a90a6}
    @Test()
    void append14Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        Object object2 = new Object();
        //Act Statement(s)
        ToStringBuilder result = target.append(object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${4a08c14b-bd47-38c0-9856-75e7a11d0428}
    @Test()
    void append15Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append(objectArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${daa93de7-e090-3c4e-9661-7a2aca592df5}
    @Test()
    void append16Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        ToStringBuilder result = target.append((short) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${3d7732f7-55a8-3e55-b58c-8fd56a0ec763}
    @Test()
    void append17Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        short[] shortArray = new short[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append(shortArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${6cd8e039-c580-3b1d-a1f5-4a31a49312a6}
    @Test()
    void append18Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${9871c992-3d9a-3b24-b3c5-9942409b5327}
    @Test()
    void append19Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        boolean[] booleanArray = new boolean[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", booleanArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${3b449391-9dde-38d8-8edd-56b4300c6171}
    @Test()
    void append20Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        boolean[] booleanArray = new boolean[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", booleanArray, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${8ee1e7f3-ba7f-3716-84ee-bcd4298d1e64}
    @Test()
    void append21Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", (byte) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${ceb11fb1-c767-357f-9ec1-84ce7ec53d65}
    @Test()
    void append22Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${c2678ac6-1ce1-3d0d-8825-453bf98c0476}
    @Test()
    void append23Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", byteArray, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${21bc0e61-5e15-35ad-a0e6-347de606def6}
    @Test()
    void append24Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", 'A');
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${8794b8cb-0a1d-3651-8a8f-a790c874a8a0}
    @Test()
    void append25Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        char[] charArray = new char[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", charArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${05c130b6-b311-34dd-a7fe-f8d0fb710289}
    @Test()
    void append26Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        char[] charArray = new char[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", charArray, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${0fcb05fd-a420-33c5-b8b7-91db42584b87}
    @Test()
    void append27Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", Double.parseDouble("0.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${6025e054-5c33-3024-afcb-bc71568ae32c}
    @Test()
    void append28Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        double[] doubleArray = new double[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", doubleArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${ba521414-7d7d-32e8-9984-39a4ab746665}
    @Test()
    void append29Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        double[] doubleArray = new double[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", doubleArray, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${661689b2-abbe-3733-a6f7-dc73b81f2062}
    @Test()
    void append30Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", Float.parseFloat("0.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${d97c4287-a9d3-3f14-bc53-8fcff50ce394}
    @Test()
    void append31Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        float[] floatArray = new float[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", floatArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${8c9562df-aeb9-37c2-89ac-71ee0d5959c8}
    @Test()
    void append32Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        float[] floatArray = new float[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", floatArray, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${623286a4-8ee8-3a96-b34d-ec14c125c23c}
    @Test()
    void append33Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${133853f0-56ec-3e7a-8491-db34fd75ad7a}
    @Test()
    void append34Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        int[] intArray = new int[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", intArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${1d856550-53bd-30fa-bb1a-4e07fb368fc0}
    @Test()
    void append35Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        int[] intArray = new int[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", intArray, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${807dae09-a93e-3901-91a2-ddcf51f7afee}
    @Test()
    void append36Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", 0L);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${17ef2a54-ee33-3b56-ab36-694739c78037}
    @Test()
    void append37Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        long[] longArray = new long[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", longArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${0814cfc4-b5ec-3a32-914f-af2899545954}
    @Test()
    void append38Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        long[] longArray = new long[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", longArray, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${4aa186ea-f79d-38be-a5d6-dee299b1c6b1}
    @Test()
    void append39Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        Object object2 = new Object();
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${2c3a6284-85fa-3dc7-8ee0-7c3273e2302d}
    @Test()
    void append40Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        Object object2 = new Object();
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", object2, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${468fd6ec-1313-3856-94b7-22c9f4280fe3}
    @Test()
    void append41Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", objectArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${279af25d-83e8-3876-9ee1-a752c7449975}
    @Test()
    void append42Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", objectArray, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${f979482e-7b21-3882-b237-43e5097f01d1}
    @Test()
    void append43Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", (short) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${407838d5-da81-3f3d-ae1d-c3650cc3a554}
    @Test()
    void append44Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        short[] shortArray = new short[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", shortArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${72c16fbc-e0b2-3dc8-83ee-c46c9e62e60d}
    @Test()
    void append45Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        short[] shortArray = new short[]{};
        //Act Statement(s)
        ToStringBuilder result = target.append("fieldName1", shortArray, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${51d207fb-dbf7-350b-938b-a39359d24193}
    @Test()
    void appendAsObjectToStringTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = spy(new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null));
        StringBuffer stringBuffer = new StringBuffer();
        doReturn(stringBuffer).when(target).getStringBuffer();
        Object object2 = new Object();
        //Act Statement(s)
        ToStringBuilder result = target.appendAsObjectToString(object2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).getStringBuffer();
        });
    }

    //Sapient generated method id: ${816f3e19-4e89-3bb6-b5da-775fd8cb1cc1}
    @Test()
    void appendSuperWhenSuperToStringIsNotNull() {
        /* Branches:
         * (superToString != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        ToStringBuilder result = target.appendSuper("superToString1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${3a54d6ed-b18d-3800-9180-813959dacf9d}
    @Test()
    void appendToStringWhenToStringIsNotNull() {
        /* Branches:
         * (toString != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        ToStringBuilder result = target.appendToString("toString1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${dc2b46b0-7a51-33a9-a2b0-296618f30c95}
    @Disabled()
    @Test()
    void toStringWhenThisGetObjectIsNull() {
        /* Branches:
         * (this.getObject() == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ToStringBuilder target = spy(new ToStringBuilder((Object) null, (ToStringStyle) null, (StringBuffer) null));
        StringBuffer stringBuffer = new StringBuffer();
        doReturn(null).when(target).getStyle();
        StringBuffer stringBuffer2 = new StringBuffer();
        doReturn(stringBuffer, stringBuffer2).when(target).getStringBuffer();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("toString_stringBuffer3"));
            verify(target, times(2)).getStringBuffer();
            verify(target).getStyle();
        });
    }

    //Sapient generated method id: ${7d6d6bb6-7978-36d5-8d73-68a45b4fa602}
    @Disabled()
    @Test()
    void toStringWhenThisGetObjectIsNotNull() {
        /* Branches:
         * (this.getObject() == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = spy(new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null));
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        doReturn(stringBuffer, stringBuffer2).when(target).getStringBuffer();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("toString_stringBuffer2"));
            verify(target, times(2)).getStringBuffer();
        });
    }

    //Sapient generated method id: ${c319ea97-f8d0-37c4-a5dd-88e142a90c6d}
    @Disabled()
    @Test()
    void buildTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ToStringBuilder target = new ToStringBuilder(object, (ToStringStyle) null, (StringBuffer) null);
        //Act Statement(s)
        String result = target.build();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }
}
