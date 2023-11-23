package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.io.File;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SystemUtilsSapientGeneratedTest {

    //Sapient generated method id: ${e61394c3-0293-3541-9ddc-51d3e9fb993d}
    @Test()
    void getEnvironmentVariableWhenValueIsNull() {
        /* Branches:
         * (value == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = SystemUtils.getEnvironmentVariable("NON_EXISTING_VARIABLE", "DEFAULT_VALUE");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("DEFAULT_VALUE")));
    }

    //Sapient generated method id: ${66508131-425c-3052-b520-609a35244917}
    @Disabled()
    @Test()
    void getEnvironmentVariableWhenValueIsNotNull() {
        /* Branches:
         * (value == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = SystemUtils.getEnvironmentVariable("PATH", "/usr/bin");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("/usr/bin:/bin:/usr/sbin:/sbin")));
    }

    //Sapient generated method id: ${70466e75-bbad-3dad-8754-3224c48a7a36}
    @Disabled()
    @Test()
    void getHostNameWhenNotIS_OS_WINDOWS() {
        /* Branches:
         * (IS_OS_WINDOWS) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = SystemUtils.getHostName();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${a7c7ee35-a552-3f54-8dab-d10b5f866c18}
    @Disabled()
    @Test()
    void getJavaHomeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        File result = SystemUtils.getJavaHome();
        File file = new File("/Applications/IntelliJ IDEA CE 231.app/Contents/jbr/Contents/Home");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(file)));
    }

    //Sapient generated method id: ${b3465731-467a-31dd-b5e9-df8cffce27a2}
    @Test()
    void getJavaIoTmpDirTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        File result = SystemUtils.getJavaIoTmpDir();
        File file = new File("/var/folders/23/6wlpx0js4c9b9z51m_1txb780000gn/T/");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(file)));
    }

    //Sapient generated method id: ${ec79bec4-465b-30f0-880c-3b4d761d9f36}
    @Disabled()
    @Test()
    void getUserDirTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        File result = SystemUtils.getUserDir();
        File file = new File("/");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(file)));
    }

    //Sapient generated method id: ${12e9ce3a-7ba1-38af-8aaa-1edf2ee30c1f}
    @Test()
    void getUserHomeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        File result = SystemUtils.getUserHome();
        File file = new File("/Users/bhuvan");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(file)));
    }

    //Sapient generated method id: ${7a51bcb8-69de-33a3-9bea-031d2f592a3d}
    @Test()
    void getUserNameTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = SystemUtils.getUserName();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("bhuvan")));
    }

    //Sapient generated method id: ${d4dd2f36-3629-3528-9f46-85c4fec60339}
    @Disabled()
    @Test()
    void getUserName1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = SystemUtils.getUserName("guest");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${9bb5efe8-d69a-3428-a24e-c012eab69234}
    @Disabled()
    @Test()
    void isJavaAwtHeadlessWhenBooleanTRUEToStringEqualsJAVA_AWT_HEADLESS() {
        /* Branches:
         * (Boolean.TRUE.toString().equals(JAVA_AWT_HEADLESS)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = SystemUtils.isJavaAwtHeadless();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${b367e6f2-1963-349c-9564-5978754d9d0d}
    @Test()
    void isJavaAwtHeadlessWhenBooleanTRUEToStringNotEqualsJAVA_AWT_HEADLESS() {
        /* Branches:
         * (Boolean.TRUE.toString().equals(JAVA_AWT_HEADLESS)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = SystemUtils.isJavaAwtHeadless();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${a292c2a9-181e-3c50-9fbd-be9c3ad86cd2}
    @Test()
    void isJavaVersionAtLeastWhenJAVA_SPECIFICATION_VERSION_AS_ENUMAtLeastRequiredVersion() {
        /* Branches:
         * (JAVA_SPECIFICATION_VERSION_AS_ENUM.atLeast(requiredVersion)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_0_9);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${0d2388b6-62b4-3d65-9616-9fe274bef522}
    @Disabled()
    @Test()
    void isJavaVersionAtLeastWhenJAVA_SPECIFICATION_VERSION_AS_ENUMNotAtLeastRequiredVersion() {
        /* Branches:
         * (JAVA_SPECIFICATION_VERSION_AS_ENUM.atLeast(requiredVersion)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_1_8);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${270f423f-bfa0-3f17-85fe-5cd4f0dba09d}
    @Disabled()
    @Test()
    void isJavaVersionAtMostWhenJAVA_SPECIFICATION_VERSION_AS_ENUMAtMostRequiredVersion() {
        /* Branches:
         * (JAVA_SPECIFICATION_VERSION_AS_ENUM.atMost(requiredVersion)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = SystemUtils.isJavaVersionAtMost(JavaVersion.JAVA_1_8);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${09535cee-e2b9-36d7-bb50-492aa424bbd3}
    @Test()
    void isJavaVersionAtMostWhenJAVA_SPECIFICATION_VERSION_AS_ENUMNotAtMostRequiredVersion() {
        /* Branches:
         * (JAVA_SPECIFICATION_VERSION_AS_ENUM.atMost(requiredVersion)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = SystemUtils.isJavaVersionAtMost(JavaVersion.JAVA_0_9);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${5052aea3-af2c-320b-b5f0-520e66a130da}
    @Test()
    void isJavaVersionMatchWhenVersionIsNotNull() {
        /* Branches:
         * (version == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = SystemUtils.isJavaVersionMatch("17", "21");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${845e1bb0-88e4-317a-ab3f-1458418096f4}
    @Test()
    void isOSMatchWhenIsOSVersionMatchOsVersionOsVersionPrefix() {
        /* Branches:
         * (osName == null) : false
         * (osVersion == null) : false
         * (isOSNameMatch(osName, osNamePrefix)) : true
         * (isOSVersionMatch(osVersion, osVersionPrefix)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SystemUtils> systemUtils = mockStatic(SystemUtils.class, CALLS_REAL_METHODS)) {
            systemUtils.when(() -> SystemUtils.isOSNameMatch("Mac OS X", "Mac OS X")).thenReturn(true);
            systemUtils.when(() -> SystemUtils.isOSVersionMatch("14.0", "13")).thenReturn(true);
            //Act Statement(s)
            boolean result = SystemUtils.isOSMatch("Mac OS X", "14.0", "Mac OS X", "13");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                systemUtils.verify(() -> SystemUtils.isOSNameMatch("Mac OS X", "Mac OS X"), atLeast(1));
                systemUtils.verify(() -> SystemUtils.isOSVersionMatch("14.0", "13"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3fbd86ca-9de3-3226-b57e-dcfefe63eaa4}
    @Test()
    void isOSMatchWhenIsOSVersionMatchNotOsVersionOsVersionPrefix() {
        /* Branches:
         * (osName == null) : false
         * (osVersion == null) : false
         * (isOSNameMatch(osName, osNamePrefix)) : true
         * (isOSVersionMatch(osVersion, osVersionPrefix)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SystemUtils> systemUtils = mockStatic(SystemUtils.class, CALLS_REAL_METHODS)) {
            systemUtils.when(() -> SystemUtils.isOSNameMatch("Mac OS X", "Mac OS X")).thenReturn(true);
            systemUtils.when(() -> SystemUtils.isOSVersionMatch("14.0", "13")).thenReturn(false);
            //Act Statement(s)
            boolean result = SystemUtils.isOSMatch("Mac OS X", "14.0", "Mac OS X", "13");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                systemUtils.verify(() -> SystemUtils.isOSNameMatch("Mac OS X", "Mac OS X"), atLeast(1));
                systemUtils.verify(() -> SystemUtils.isOSVersionMatch("14.0", "13"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${162b9411-5186-3742-84f7-e2e0fcb193db}
    @Test()
    void isOSNameMatchWhenOsNameIsNotNull() {
        /* Branches:
         * (osName == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = SystemUtils.isOSNameMatch("Mac OS X", "z/OS");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${83b9a32a-d6e4-3bd2-bd8a-3ed627179942}
    @Test()
    void isOSVersionMatchWhenIIndexOfVersionPrefixPartsNotEqualsIIndexOfVersionParts() {
        /* Branches:
         * (StringUtils.isEmpty(osVersion)) : false
         * (i < Math.min(versionPrefixParts.length, versionParts.length)) : true
         * (!versionPrefixParts[i].equals(versionParts[i])) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = SystemUtils.isOSVersionMatch("14.0", "13");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }
}
