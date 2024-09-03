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

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SystemUtilsSapientGeneratedTest {

    //Sapient generated method id: ${getEnvironmentVariableWhenValueIsNull}, hash: 22DEC0A57EF510D64F351C4B449C4832
    @Test()
    void getEnvironmentVariableWhenValueIsNull() {
        /* Branches:
         * (value == null) : true
         */
         
        //Act Statement(s)
        String result = SystemUtils.getEnvironmentVariable("A", "defaultValue1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("defaultValue1")));
    }

    //Sapient generated method id: ${getEnvironmentVariableWhenValueIsNotNull}, hash: 457BE3D6044690CDB5884EC24FFC0BEC
    @Test()
    void getEnvironmentVariableWhenValueIsNotNull() {
        /* Branches:
         * (value == null) : false
         */
         
        //Act Statement(s)
        String result = SystemUtils.getEnvironmentVariable("A", "defaultValue1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${getHostNameWhenNotIS_OS_WINDOWS}, hash: 871FD71E8F90CDB7B6B4AE79E377D276
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

    //Sapient generated method id: ${getJavaHomeTest}, hash: 21E2628EE1C01CB0E168B0C32778456F
    @Test()
    void getJavaHomeTest() {
        
        //Act Statement(s)
        File result = SystemUtils.getJavaHome();
        File file = new File("/Applications/IntelliJ IDEA CE 231.app/Contents/jbr/Contents/Home");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(file)));
    }

    //Sapient generated method id: ${getJavaIoTmpDirTest}, hash: 5E9DE532C04502005B98D743154273AB
    @Test()
    void getJavaIoTmpDirTest() {
        
        //Act Statement(s)
        File result = SystemUtils.getJavaIoTmpDir();
        File file = new File("/var/folders/23/6wlpx0js4c9b9z51m_1txb780000gn/T/");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(file)));
    }

    //Sapient generated method id: ${getUserDirTest}, hash: 994FBBD05E9B6BBA10B7F4E6F8281B5B
    @Test()
    void getUserDirTest() {
        
        //Act Statement(s)
        File result = SystemUtils.getUserDir();
        File file = new File("/");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(file)));
    }

    //Sapient generated method id: ${getUserHomeTest}, hash: 85E1FBB89E5566385A31274636982DD7
    @Test()
    void getUserHomeTest() {
        
        //Act Statement(s)
        File result = SystemUtils.getUserHome();
        File file = new File("/Users/bhuvan");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(file)));
    }

    //Sapient generated method id: ${getUserNameTest}, hash: 528225899C99017C5A0C4714CE8A683E
    @Test()
    void getUserNameTest() {
        
        //Act Statement(s)
        String result = SystemUtils.getUserName();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("bhuvan")));
    }

    //Sapient generated method id: ${getUserName1Test}, hash: 8DEC8AF21E853C425A5E24280C3DF966
    @Test()
    void getUserName1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = SystemUtils.getUserName("defaultValue1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${isJavaAwtHeadlessTest}, hash: B8F8D98A1927EA690E7EC812FDE2315F
    @Test()
    void isJavaAwtHeadlessTest() {
        
        //Act Statement(s)
        boolean result = SystemUtils.isJavaAwtHeadless();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isJavaVersionAtLeastWhenJAVA_SPECIFICATION_VERSION_AS_ENUMAtLeastRequiredVersion}, hash: 11AD875E49BC79E26D1E1012B306FD99
    @Test()
    void isJavaVersionAtLeastWhenJAVA_SPECIFICATION_VERSION_AS_ENUMAtLeastRequiredVersion() {
        /* Branches:
         * (JAVA_SPECIFICATION_VERSION_AS_ENUM.atLeast(requiredVersion)) : true
         */
         
        //Act Statement(s)
        boolean result = SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_0_9);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isJavaVersionAtLeastWhenJAVA_SPECIFICATION_VERSION_AS_ENUMNotAtLeastRequiredVersion}, hash: 9D9D9A0F46C4CFF8D9D64FA7944BE9DC
    @Test()
    void isJavaVersionAtLeastWhenJAVA_SPECIFICATION_VERSION_AS_ENUMNotAtLeastRequiredVersion() {
        /* Branches:
         * (JAVA_SPECIFICATION_VERSION_AS_ENUM.atLeast(requiredVersion)) : false
         */
         
        //Act Statement(s)
        boolean result = SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_0_9);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isJavaVersionAtMostWhenJAVA_SPECIFICATION_VERSION_AS_ENUMAtMostRequiredVersion}, hash: 34E6A59EC275195BCE161E0C96CADF53
    @Test()
    void isJavaVersionAtMostWhenJAVA_SPECIFICATION_VERSION_AS_ENUMAtMostRequiredVersion() {
        /* Branches:
         * (JAVA_SPECIFICATION_VERSION_AS_ENUM.atMost(requiredVersion)) : true
         */
         
        //Act Statement(s)
        boolean result = SystemUtils.isJavaVersionAtMost(JavaVersion.JAVA_0_9);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isJavaVersionAtMostWhenJAVA_SPECIFICATION_VERSION_AS_ENUMNotAtMostRequiredVersion}, hash: 287DC64B1EF0C4A9E8B84FEE117DA910
    @Test()
    void isJavaVersionAtMostWhenJAVA_SPECIFICATION_VERSION_AS_ENUMNotAtMostRequiredVersion() {
        /* Branches:
         * (JAVA_SPECIFICATION_VERSION_AS_ENUM.atMost(requiredVersion)) : false
         */
         
        //Act Statement(s)
        boolean result = SystemUtils.isJavaVersionAtMost(JavaVersion.JAVA_0_9);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isJavaVersionMatchWhenVersionIsNotNull}, hash: A7A724A3B650D412D9B2229F8CBB0CFC
    @Test()
    void isJavaVersionMatchWhenVersionIsNotNull() {
        /* Branches:
         * (version == null) : false
         */
         
        //Act Statement(s)
        boolean result = SystemUtils.isJavaVersionMatch("17", "21");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isOSMatchWhenIsOSVersionMatchOsVersionOsVersionPrefix}, hash: 485DFCC11FC5AFD92EE3B01EA97D2F02
    @Test()
    void isOSMatchWhenIsOSVersionMatchOsVersionOsVersionPrefix() {
        /* Branches:
         * (osName == null) : false
         * (osVersion == null) : false
         * (isOSNameMatch(osName, osNamePrefix)) : true
         * (isOSVersionMatch(osVersion, osVersionPrefix)) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<SystemUtils> systemUtils = mockStatic(SystemUtils.class, CALLS_REAL_METHODS)) {
            systemUtils.when(() -> SystemUtils.isOSNameMatch("Mac OS X", "Mac OS X")).thenReturn(true);
            systemUtils.when(() -> SystemUtils.isOSVersionMatch("14.6.1", "13")).thenReturn(true);
            //Act Statement(s)
            boolean result = SystemUtils.isOSMatch("Mac OS X", "14.6.1", "Mac OS X", "13");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                systemUtils.verify(() -> SystemUtils.isOSNameMatch("Mac OS X", "Mac OS X"), atLeast(1));
                systemUtils.verify(() -> SystemUtils.isOSVersionMatch("14.6.1", "13"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isOSMatchWhenIsOSVersionMatchNotOsVersionOsVersionPrefix}, hash: 42FE0F366ECFF0BB3BDF1D0A52AE3399
    @Test()
    void isOSMatchWhenIsOSVersionMatchNotOsVersionOsVersionPrefix() {
        /* Branches:
         * (osName == null) : false
         * (osVersion == null) : false
         * (isOSNameMatch(osName, osNamePrefix)) : true
         * (isOSVersionMatch(osVersion, osVersionPrefix)) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<SystemUtils> systemUtils = mockStatic(SystemUtils.class, CALLS_REAL_METHODS)) {
            systemUtils.when(() -> SystemUtils.isOSNameMatch("Mac OS X", "Mac OS X")).thenReturn(true);
            systemUtils.when(() -> SystemUtils.isOSVersionMatch("14.6.1", "13")).thenReturn(false);
            //Act Statement(s)
            boolean result = SystemUtils.isOSMatch("Mac OS X", "14.6.1", "Mac OS X", "13");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                systemUtils.verify(() -> SystemUtils.isOSNameMatch("Mac OS X", "Mac OS X"), atLeast(1));
                systemUtils.verify(() -> SystemUtils.isOSVersionMatch("14.6.1", "13"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isOSNameMatchWhenOsNameIsNotNull}, hash: E190E5E502D06594DD4612F675263E3C
    @Test()
    void isOSNameMatchWhenOsNameIsNotNull() {
        /* Branches:
         * (osName == null) : false
         */
         
        //Act Statement(s)
        boolean result = SystemUtils.isOSNameMatch("Mac OS X", "z/OS");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isOSVersionMatchWhenIIndexOfVersionPrefixPartsNotEqualsIIndexOfVersionParts}, hash: B012DB024C4EEEBE4139092E4BCB084C
    @Test()
    void isOSVersionMatchWhenIIndexOfVersionPrefixPartsNotEqualsIIndexOfVersionParts() {
        /* Branches:
         * (StringUtils.isEmpty(osVersion)) : false
         * (i < Math.min(versionPrefixParts.length, versionParts.length)) : true
         * (!versionPrefixParts[i].equals(versionParts[i])) : true
         */
         
        //Act Statement(s)
        boolean result = SystemUtils.isOSVersionMatch("14.6.1", "13");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }
}
