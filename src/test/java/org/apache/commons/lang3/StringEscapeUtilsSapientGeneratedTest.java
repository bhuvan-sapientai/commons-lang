package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StringEscapeUtilsSapientGeneratedTest {

    //Sapient generated method id: ${505e7e10-0acf-3a0d-b7ee-a07029da230c}
    @Disabled()
    @Test()
    void escapeJavaTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = StringEscapeUtils.escapeJava("Hello, World!");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${d35af4a0-10a0-36a9-b7cd-3079380def8c}
    @Disabled()
    @Test()
    void escapeEcmaScriptTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = StringEscapeUtils.escapeEcmaScript("Hello, World!");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${29ece855-3354-34f8-8723-279f4ac1356f}
    @Disabled()
    @Test()
    void escapeJsonTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = StringEscapeUtils.escapeJson("Hello, World!");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${dfc4d20d-140c-3d3b-9694-2e995e567573}
    @Disabled()
    @Test()
    void unescapeJavaTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = StringEscapeUtils.unescapeJava("input1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${9ab46f95-b8e2-3f86-ac9b-131ee15b6d81}
    @Disabled()
    @Test()
    void unescapeEcmaScriptTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = StringEscapeUtils.unescapeEcmaScript("Hello World!");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${b3408816-5160-3efa-a43b-764463fec00a}
    @Disabled()
    @Test()
    void unescapeJsonTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = StringEscapeUtils.unescapeJson("input1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${be99506a-0fe9-3e92-8685-f0220b9d3ce0}
    @Disabled()
    @Test()
    void escapeHtml4Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = StringEscapeUtils.escapeHtml4("&lt;p&gt;Hello, World!&lt;/p&gt;");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${5de46dcd-e169-346b-8108-3aeeaa167a0c}
    @Disabled()
    @Test()
    void escapeHtml3Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = StringEscapeUtils.escapeHtml3("<h1>Hello, World!</h1>");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${d0137d2f-6cee-3e51-82f5-47d4ae1ea0e1}
    @Disabled()
    @Test()
    void unescapeHtml4Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = StringEscapeUtils.unescapeHtml4("&lt;div&gt;Hello World!&lt;/div&gt;");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${41a3078f-fc35-3e0c-a315-2923631a023a}
    @Disabled()
    @Test()
    void unescapeHtml3Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = StringEscapeUtils.unescapeHtml3("Hello &amp; World");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${a5b812c3-6fa2-387e-90f6-ec97f49b904a}
    @Disabled()
    @Test()
    void escapeXmlTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = StringEscapeUtils.escapeXml("Hello, <world>!");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${0c8351c7-8b24-3d5f-a9d8-d7d7fdcaf4fe}
    @Disabled()
    @Test()
    void escapeXml10Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = StringEscapeUtils.escapeXml10("<foo>bar</foo>");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${5678cbd1-d5a0-3502-85e8-c3d25f797d8c}
    @Disabled()
    @Test()
    void escapeXml11Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = StringEscapeUtils.escapeXml11("<foo>bar</foo>");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${7eb830cb-b669-38eb-9f90-86a1650836c8}
    @Disabled()
    @Test()
    void unescapeXmlTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = StringEscapeUtils.unescapeXml("<p>This is a &lt;b&gt;bold&lt;/b&gt; statement.</p>");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${c206dd68-9fc2-32c2-b39f-b614c9959111}
    @Disabled()
    @Test()
    void escapeCsvTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = StringEscapeUtils.escapeCsv("");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${d9ea9d27-f47d-3171-a4c3-5f20774ada58}
    @Disabled()
    @Test()
    void unescapeCsvTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = StringEscapeUtils.unescapeCsv("Hello,World");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }
}
