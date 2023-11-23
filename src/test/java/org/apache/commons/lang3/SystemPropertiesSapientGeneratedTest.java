package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.function.LongSupplier;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.function.IntSupplier;
import java.util.function.BooleanSupplier;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SystemPropertiesSapientGeneratedTest {

    //Sapient generated method id: ${793d2afe-a79f-343b-8b13-56e51aaf5130}
    @Test()
    void getAwtToolkitTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("awt.toolkit")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getAwtToolkit();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("awt.toolkit"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b67a3be8-267c-3f8d-aece-b654d29ff3b0}
    @Disabled()
    @Test()
    void getBooleanWhenDefaultIfAbsentIsNotNull() {
        /* Branches:
         * (str == null) : true
         * (defaultIfAbsent != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("my.custom.property")).thenReturn(null);
            //TODO: Needs initialization with real value
            BooleanSupplier booleanSupplier = null;
            //Act Statement(s)
            boolean result = SystemProperties.getBoolean("my.custom.property", booleanSupplier);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                systemProperties.verify(() -> SystemProperties.getProperty("my.custom.property"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9284b6b7-6f3f-399e-8e3f-b4b6e92e48f4}
    @Test()
    void getBooleanWhenDefaultIfAbsentIsNull() {
        /* Branches:
         * (str == null) : true
         * (defaultIfAbsent != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("my.custom.property")).thenReturn(null);
            //TODO: Needs initialization with real value
            BooleanSupplier booleanSupplier = null;
            //Act Statement(s)
            boolean result = SystemProperties.getBoolean("my.custom.property", booleanSupplier);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                systemProperties.verify(() -> SystemProperties.getProperty("my.custom.property"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${36895023-6812-308b-9126-e159ebcc7e2d}
    @Disabled()
    @Test()
    void getBooleanWhenStrIsNullDefaultIfAbsentIsNotNullAndDefaultIfAbsentGetAsBoolean() {
        /* Branches:
         * (str == null) : false
         * (str == null ? defaultIfAbsent != null && defaultIfAbsent.getAsBoolean() : Boolean.parseBoolean(str)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.version")).thenReturn("return_of_getProperty1");
            //TODO: Needs initialization with real value
            BooleanSupplier booleanSupplier = null;
            //Act Statement(s)
            boolean result = SystemProperties.getBoolean("java.version", booleanSupplier);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                systemProperties.verify(() -> SystemProperties.getProperty("java.version"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fbfbdaa2-816c-375d-80e2-d4fd076d3840}
    @Test()
    void getBooleanWhenStrIsNullBooleanParseBooleanStr() {
        /* Branches:
         * (str == null) : false
         * (str == null ? defaultIfAbsent != null && defaultIfAbsent.getAsBoolean() : Boolean.parseBoolean(str)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("key1")).thenReturn("A");
            //TODO: Needs initialization with real value
            BooleanSupplier booleanSupplier = null;
            //Act Statement(s)
            boolean result = SystemProperties.getBoolean("key1", booleanSupplier);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                systemProperties.verify(() -> SystemProperties.getProperty("key1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d040489d-6a19-3758-8e2c-fc4b04cf099f}
    @Test()
    void getFileEncodingTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("file.encoding")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getFileEncoding();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("file.encoding"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7a5dfe32-d2a5-3981-8dfe-df490c2005b9}
    @Test()
    void getFileSeparatorTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("file.separator")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getFileSeparator();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("file.separator"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${57585347-469e-3e97-82b3-d12008a84055}
    @Test()
    void getIntWhenStrIsNotNull() {
        /* Branches:
         * (str == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("key1")).thenReturn("2");
            //TODO: Needs initialization with real value
            IntSupplier intSupplier = null;
            //Act Statement(s)
            int result = SystemProperties.getInt("key1", intSupplier);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(2));
                systemProperties.verify(() -> SystemProperties.getProperty("key1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${38f78799-40fc-3113-999c-848d2788a710}
    @Test()
    void getIntWhenDefaultIfAbsentIsNotNull() {
        /* Branches:
         * (str == null) : true
         * (defaultIfAbsent != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("nonexistent_key")).thenReturn(null);
            //TODO: Needs initialization with real value
            IntSupplier intSupplier = null;
            //Act Statement(s)
            int result = SystemProperties.getInt("nonexistent_key", intSupplier);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                systemProperties.verify(() -> SystemProperties.getProperty("nonexistent_key"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${790932c6-85e7-3bc2-b166-944d1d758d80}
    @Test()
    void getIntWhenDefaultIfAbsentIsNull() {
        /* Branches:
         * (str == null) : true
         * (defaultIfAbsent != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("key1")).thenReturn(null);
            IntSupplier intSupplier = null;
            //Act Statement(s)
            int result = SystemProperties.getInt("key1", intSupplier);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                systemProperties.verify(() -> SystemProperties.getProperty("key1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6604c3ce-9b0a-3368-ba84-64a7218c81e5}
    @Test()
    void getJavaAwtFontsTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.awt.fonts")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaAwtFonts();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.awt.fonts"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7b69e71e-5503-3458-96ad-c4cd025afef9}
    @Test()
    void getJavaAwtGraphicsenvTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.awt.graphicsenv")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaAwtGraphicsenv();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.awt.graphicsenv"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d9e105b6-4c0e-3b2e-8ee0-8bc9fc8879ce}
    @Test()
    void getJavaAwtHeadlessTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.awt.headless")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaAwtHeadless();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.awt.headless"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${587d2543-5805-38fa-9e15-38d755556980}
    @Test()
    void getJavaAwtPrinterjobTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.awt.printerjob")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaAwtPrinterjob();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.awt.printerjob"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${315733a2-1635-3dc8-93cd-a5d59d170387}
    @Test()
    void getJavaClassPathTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.class.path")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaClassPath();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.class.path"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ce29beab-523b-38b9-8567-b456ff2cf9d2}
    @Test()
    void getJavaClassVersionTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.class.version")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaClassVersion();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.class.version"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${35ebb895-d32d-3b22-914d-06ebade1633a}
    @Test()
    void getJavaCompilerTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.compiler")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaCompiler();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.compiler"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b38d7876-f4e0-35e2-975c-599859662502}
    @Test()
    void getJavaEndorsedDirsTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.endorsed.dirs")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaEndorsedDirs();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.endorsed.dirs"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${45792c7c-8637-3a99-bb80-be1fed9c56e1}
    @Test()
    void getJavaExtDirsTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.ext.dirs")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaExtDirs();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.ext.dirs"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a7c7ee35-a552-3f54-8dab-d10b5f866c18}
    @Test()
    void getJavaHomeTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.home")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaHome();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.home"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${195ac9af-08a2-30fb-ac69-d112696721e1}
    @Test()
    void getJavaIoTmpdirTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.io.tmpdir")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaIoTmpdir();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.io.tmpdir"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3ce07852-ddee-3052-8c44-d5b74e291b14}
    @Test()
    void getJavaLibraryPathTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.library.path")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaLibraryPath();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.library.path"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${41cb2380-e494-3b08-8a07-623db2a80c25}
    @Test()
    void getJavaLocaleProvidersTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.locale.providers")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaLocaleProviders();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.locale.providers"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cd09bab7-fa6b-3dda-9565-8d037226fab0}
    @Test()
    void getJavaRuntimeNameTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.runtime.name")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaRuntimeName();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.runtime.name"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2b8af317-ad53-3b62-b4c0-69d836d3e634}
    @Test()
    void getJavaRuntimeVersionTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.runtime.version")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaRuntimeVersion();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.runtime.version"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d61bab95-1cae-3486-a5e7-31a3b075ac3f}
    @Test()
    void getJavaSpecificationNameTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.specification.name")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaSpecificationName();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.specification.name"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4a2541bb-3f1f-3a76-ba20-df5899ff889b}
    @Test()
    void getJavaSpecificationVendorTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.specification.vendor")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaSpecificationVendor();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.specification.vendor"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${84450305-267b-3e3e-986b-f24f0752fc4e}
    @Test()
    void getJavaSpecificationVersionTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.specification.version")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaSpecificationVersion();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.specification.version"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${35e9f204-ec7c-3c77-81fb-48843a774a28}
    @Test()
    void getJavaUtilPrefsPreferencesFactoryTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.util.prefs.PreferencesFactory")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaUtilPrefsPreferencesFactory();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.util.prefs.PreferencesFactory"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fc7524de-ed7e-3b1b-b409-c22a92ce0ce8}
    @Test()
    void getJavaVendorTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.vendor")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaVendor();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.vendor"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3ad8061b-e4cc-3f7a-aad4-f8caaaa42bd1}
    @Test()
    void getJavaVendorUrlTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.vendor.url")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaVendorUrl();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.vendor.url"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${e22a9744-058f-3158-86bd-a2487d7d1f4a}
    @Test()
    void getJavaVersionTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.version")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaVersion();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.version"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${32d1d115-2b3a-3a77-9590-9a68d0676099}
    @Test()
    void getJavaVmInfoTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.vm.info")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaVmInfo();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.vm.info"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${bac74457-88bb-3901-93e0-a9426a0bd452}
    @Test()
    void getJavaVmNameTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.vm.name")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaVmName();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.vm.name"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${51635232-634f-3df0-9559-7f58feeec6ae}
    @Test()
    void getJavaVmSpecificationNameTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.vm.specification.name")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaVmSpecificationName();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.vm.specification.name"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cd8960ec-59e8-3ddc-b64d-61c88ef3e09c}
    @Test()
    void getJavaVmSpecificationVendorTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.vm.specification.vendor")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaVmSpecificationVendor();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.vm.specification.vendor"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5d267fa6-ad63-342e-a705-f3daff9e6a6d}
    @Test()
    void getJavaVmSpecificationVersionTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.vm.specification.version")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaVmSpecificationVersion();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.vm.specification.version"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1f558299-4df9-3a24-b1fd-293730b6b9da}
    @Test()
    void getJavaVmVendorTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.vm.vendor")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaVmVendor();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.vm.vendor"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ba6614b9-5806-38f8-9e87-2dfd290f7151}
    @Test()
    void getJavaVmVersionTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("java.vm.version")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getJavaVmVersion();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("java.vm.version"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b9ca9277-18ae-3b64-9946-7a465d479ca4}
    @Test()
    void getLineSeparatorTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("line.separator")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getLineSeparator();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("line.separator"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c332fff6-db41-35eb-92fd-bcbb02c1dd42}
    @Test()
    void getLongWhenStrIsNotNull() {
        /* Branches:
         * (str == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("key1")).thenReturn("2");
            //TODO: Needs initialization with real value
            LongSupplier longSupplier = null;
            //Act Statement(s)
            long result = SystemProperties.getLong("key1", longSupplier);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(2L));
                systemProperties.verify(() -> SystemProperties.getProperty("key1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${899d78c0-3691-38c6-b61d-92f6362373ee}
    @Test()
    void getLongWhenDefaultIfAbsentIsNotNull() {
        /* Branches:
         * (str == null) : true
         * (defaultIfAbsent != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("non.existent.property")).thenReturn(null);
            //TODO: Needs initialization with real value
            LongSupplier longSupplier = null;
            //Act Statement(s)
            long result = SystemProperties.getLong("non.existent.property", longSupplier);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0L));
                systemProperties.verify(() -> SystemProperties.getProperty("non.existent.property"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${540a2d72-0424-341c-8f30-338c42a00577}
    @Test()
    void getLongWhenDefaultIfAbsentIsNull() {
        /* Branches:
         * (str == null) : true
         * (defaultIfAbsent != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("key1")).thenReturn(null);
            LongSupplier longSupplier = null;
            //Act Statement(s)
            long result = SystemProperties.getLong("key1", longSupplier);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0L));
                systemProperties.verify(() -> SystemProperties.getProperty("key1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1d946f46-e3ea-37fb-94bb-fc65b2c8638b}
    @Test()
    void getOsArchTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("os.arch")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getOsArch();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("os.arch"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${31709543-e2b5-3411-a33e-0034353bcd3e}
    @Test()
    void getOsNameTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("os.name")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getOsName();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("os.name"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9ac7b2aa-19f2-3ebe-af73-2ab61fbcae15}
    @Test()
    void getOsVersionTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("os.version")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getOsVersion();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("os.version"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6180c46f-f5d7-3456-a3ca-3f19a6def067}
    @Test()
    void getPathSeparatorTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("path.separator")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getPathSeparator();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("path.separator"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ebf9d063-d15c-33a6-bbb2-427433abed69}
    @Test()
    void getPropertyTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty(eq("property1"), (Supplier) any())).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getProperty("property1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty(eq("property1"), (Supplier) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1c39b0fe-539a-3677-bb73-40e63b6df086}
    @Disabled()
    @Test()
    void getProperty1WhenStringUtilsIsEmptyProperty() {
        /* Branches:
         * (StringUtils.isEmpty(property)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Supplier<String> supplier = null;
        //Act Statement(s)
        String result = SystemProperties.getProperty("property1", supplier);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${d564385a-4ff9-3a8a-9956-f1300b6fb208}
    @Disabled()
    @Test()
    void getProperty1WhenStringUtilsNotIsEmptyProperty() {
        /* Branches:
         * (StringUtils.isEmpty(property)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Supplier<String> supplier = null;
        //Act Statement(s)
        String result = SystemProperties.getProperty("java.version", supplier);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${310afadc-abc5-3828-99a5-3b2413b9d1ee}
    @Disabled()
    @Test()
    void getProperty1WhenCaughtSecurityException() {
        /* Branches:
         * (StringUtils.isEmpty(property)) : false
         * (catch-exception (SecurityException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Supplier<String> supplier = null;
        //Act Statement(s)
        String result = SystemProperties.getProperty("java.version", supplier);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${17f12b18-a2bc-355b-9ec3-c35c091eade3}
    @Test()
    void getUserCountryTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("user.country")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getUserCountry();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("user.country"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ec79bec4-465b-30f0-880c-3b4d761d9f36}
    @Test()
    void getUserDirTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("user.dir")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getUserDir();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("user.dir"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${12e9ce3a-7ba1-38af-8aaa-1edf2ee30c1f}
    @Test()
    void getUserHomeTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("user.home")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getUserHome();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("user.home"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9bcb345b-a068-3e21-a72e-66e56cf07ebb}
    @Test()
    void getUserLanguageTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("user.language")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getUserLanguage();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("user.language"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7a51bcb8-69de-33a3-9bea-031d2f592a3d}
    @Test()
    void getUserNameTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("user.name")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getUserName();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("user.name"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${075e09f7-1dea-3d41-b878-d39177a68185}
    @Test()
    void getUserTimezoneTest() {
        //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("user.timezone")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            String result = SystemProperties.getUserTimezone();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                systemProperties.verify(() -> SystemProperties.getProperty("user.timezone"), atLeast(1));
            });
        }
    }
}
