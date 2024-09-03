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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SystemPropertiesSapientGeneratedTest {

    private final BooleanSupplier booleanSupplierMock = mock(BooleanSupplier.class);

    private final IntSupplier intSupplierMock = mock(IntSupplier.class);

    private final LongSupplier longSupplierMock = mock(LongSupplier.class);

    private final Supplier supplierMock = mock(Supplier.class);

    //Sapient generated method id: ${getAwtToolkitTest}, hash: 6E69442A989F9259418B3607A4EAF319
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

    //Sapient generated method id: ${getBooleanWhenDefaultIfAbsentIsNotNull}, hash: 384B04F4966CA23E3F11F4467E4472F6
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
            systemProperties.when(() -> SystemProperties.getProperty("key1")).thenReturn(null);
            //Act Statement(s)
            boolean result = SystemProperties.getBoolean("key1", booleanSupplierMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                systemProperties.verify(() -> SystemProperties.getProperty("key1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getBooleanWhenDefaultIfAbsentIsNull}, hash: 000DC18D64F1CF9C556325FE66755A32
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
            systemProperties.when(() -> SystemProperties.getProperty("key1")).thenReturn(null);
            //Act Statement(s)
            boolean result = SystemProperties.getBoolean("key1", booleanSupplierMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                systemProperties.verify(() -> SystemProperties.getProperty("key1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getBooleanWhenStrIsNullDefaultIfAbsentIsNotNullAndDefaultIfAbsentGetAsBoolean}, hash: 6A35C891925533CF1C0C7E5E2C856705
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
            systemProperties.when(() -> SystemProperties.getProperty("key1")).thenReturn("return_of_getProperty1");
            //Act Statement(s)
            boolean result = SystemProperties.getBoolean("key1", booleanSupplierMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                systemProperties.verify(() -> SystemProperties.getProperty("key1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getFileEncodingTest}, hash: 32EA22A072A6C96A3CD6573EB4186401
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

    //Sapient generated method id: ${getFileSeparatorTest}, hash: AFD8E6B5DC56889F8F12D1F8B8ADD6F4
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

    //Sapient generated method id: ${getIntWhenStrIsNotNull}, hash: AFBBC078DAC2FC26A9CEAEDD5B67371E
    @Test()
    void getIntWhenStrIsNotNull() {
        /* Branches:
         * (str == null) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("key1")).thenReturn("0");
            //Act Statement(s)
            int result = SystemProperties.getInt("key1", intSupplierMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                systemProperties.verify(() -> SystemProperties.getProperty("key1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getIntWhenDefaultIfAbsentIsNotNull}, hash: 440453C730B5F51FD71C9F6ED8CD3D8C
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
            systemProperties.when(() -> SystemProperties.getProperty("key1")).thenReturn(null);
            //Act Statement(s)
            int result = SystemProperties.getInt("key1", intSupplierMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                systemProperties.verify(() -> SystemProperties.getProperty("key1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getIntWhenDefaultIfAbsentIsNull}, hash: D8F356EE66C39EE48B9AEE5360C9DB44
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

    //Sapient generated method id: ${getJavaAwtFontsTest}, hash: 26046AA2B8DFD251CE514DD79E04BA2B
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

    //Sapient generated method id: ${getJavaAwtGraphicsenvTest}, hash: 2EEA129E1DC22644811985B606F1EB2B
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

    //Sapient generated method id: ${getJavaAwtHeadlessTest}, hash: 71A07FB939447EE20F6E22BEF8309E42
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

    //Sapient generated method id: ${getJavaAwtPrinterjobTest}, hash: F3390CE77492072869AC592EA83E66C9
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

    //Sapient generated method id: ${getJavaClassPathTest}, hash: 561E792EA9CD09F2D0BD841B61F9E934
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

    //Sapient generated method id: ${getJavaClassVersionTest}, hash: A0FAAB08B920E77C3F7A79B7D82394CE
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

    //Sapient generated method id: ${getJavaCompilerTest}, hash: A5A744F7BAE02BE11CC0EE51FD433E11
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

    //Sapient generated method id: ${getJavaEndorsedDirsTest}, hash: 190C295E787B39A365DEF86B040EF3FA
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

    //Sapient generated method id: ${getJavaExtDirsTest}, hash: 32BB2D182CFD2EBA58A65304584AC09D
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

    //Sapient generated method id: ${getJavaHomeTest}, hash: 41E64301F536E2ECF4394EDC6A407E4A
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

    //Sapient generated method id: ${getJavaIoTmpdirTest}, hash: 719A64CCD3D5518DA1D999FE0CCB0472
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

    //Sapient generated method id: ${getJavaLibraryPathTest}, hash: A4204C68B291C207FC27578394A5245E
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

    //Sapient generated method id: ${getJavaLocaleProvidersTest}, hash: A93C1A93338CAE88A75A6B43E447C519
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

    //Sapient generated method id: ${getJavaRuntimeNameTest}, hash: 912C4D8FDB9F4B6B7CC0124903CF8850
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

    //Sapient generated method id: ${getJavaRuntimeVersionTest}, hash: B4E23DD4C12866DF219418212B45F3F6
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

    //Sapient generated method id: ${getJavaSpecificationNameTest}, hash: 3A67A73677A3D751D2710B4D65001C19
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

    //Sapient generated method id: ${getJavaSpecificationVendorTest}, hash: 0033C9C2C6347B2DC6AB7300612040AF
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

    //Sapient generated method id: ${getJavaSpecificationVersionTest}, hash: D15BBF01092F1391017C0B45A57EE929
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

    //Sapient generated method id: ${getJavaUtilPrefsPreferencesFactoryTest}, hash: E88061068B127D34FED06C0167FB30FA
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

    //Sapient generated method id: ${getJavaVendorTest}, hash: C484B94BFF0E74020E32B7E668487296
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

    //Sapient generated method id: ${getJavaVendorUrlTest}, hash: F72BBBE06274BB46F33B9AC20539E3DD
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

    //Sapient generated method id: ${getJavaVersionTest}, hash: 13BB2402337A070244A1F035956D9BAD
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

    //Sapient generated method id: ${getJavaVmInfoTest}, hash: EC5E00D759A38A8967FAFD7407EB5FF4
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

    //Sapient generated method id: ${getJavaVmNameTest}, hash: CA786A4BB0B7F79C5EA3EAA44D993A40
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

    //Sapient generated method id: ${getJavaVmSpecificationNameTest}, hash: 27E329EBABC14DE9A55A8529F14E678A
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

    //Sapient generated method id: ${getJavaVmSpecificationVendorTest}, hash: 061DBE5933E2FEB1F3AA0BD3A25A2232
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

    //Sapient generated method id: ${getJavaVmSpecificationVersionTest}, hash: E8648723A4AFF7806EEB368AF7324696
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

    //Sapient generated method id: ${getJavaVmVendorTest}, hash: 818418AE45CB707239144B5A2F51EFE8
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

    //Sapient generated method id: ${getJavaVmVersionTest}, hash: 9C0D5354E0D67AD64135E8356115E984
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

    //Sapient generated method id: ${getLineSeparatorTest}, hash: CD64E542324A38ECCAAF021F11C2966C
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

    //Sapient generated method id: ${getLongWhenStrIsNotNull}, hash: 34637CD2CA0B71DB8967BE4C34909808
    @Test()
    void getLongWhenStrIsNotNull() {
        /* Branches:
         * (str == null) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<SystemProperties> systemProperties = mockStatic(SystemProperties.class, CALLS_REAL_METHODS)) {
            systemProperties.when(() -> SystemProperties.getProperty("key1")).thenReturn("0");
            //Act Statement(s)
            long result = SystemProperties.getLong("key1", longSupplierMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0L));
                systemProperties.verify(() -> SystemProperties.getProperty("key1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getLongWhenDefaultIfAbsentIsNotNull}, hash: 16D60448C32A7E75EDA8F25AD6119049
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
            systemProperties.when(() -> SystemProperties.getProperty("key1")).thenReturn(null);
            //Act Statement(s)
            long result = SystemProperties.getLong("key1", longSupplierMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0L));
                systemProperties.verify(() -> SystemProperties.getProperty("key1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getLongWhenDefaultIfAbsentIsNull}, hash: C041541848B7ED3A1813895849EB224C
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

    //Sapient generated method id: ${getOsArchTest}, hash: 9EA3FA84138BEC1CCC33E816645F64F8
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

    //Sapient generated method id: ${getOsNameTest}, hash: 4B1E4AE245C1BF92002F2191DCDFEB53
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

    //Sapient generated method id: ${getOsVersionTest}, hash: 18B54A72BF5F7A38EF05EE27AF6D28F1
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

    //Sapient generated method id: ${getPathSeparatorTest}, hash: 9140E3D1BB281604B5BF9C0FFFAE91BA
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

    //Sapient generated method id: ${getPropertyTest}, hash: 872B3BA2595FC0082ABD7E262CB6142F
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

    //Sapient generated method id: ${getProperty1WhenStringUtilsIsEmptyProperty}, hash: 8371D72477F9B3AF4BC4D9F9ABB1C82C
    @Test()
    void getProperty1WhenStringUtilsIsEmptyProperty() {
        /* Branches:
         * (StringUtils.isEmpty(property)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = SystemProperties.getProperty("property1", supplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${getProperty1WhenStringUtilsNotIsEmptyProperty}, hash: 83BECCB2AC501EDD2D2187CFC68811E9
    @Test()
    void getProperty1WhenStringUtilsNotIsEmptyProperty() {
        /* Branches:
         * (StringUtils.isEmpty(property)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = SystemProperties.getProperty("A", supplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${getProperty1WhenCaughtSecurityException}, hash: BD15D9EF4ECF6C790F2AE12211A1348F
    @Test()
    void getProperty1WhenCaughtSecurityException() {
        /* Branches:
         * (StringUtils.isEmpty(property)) : true
         * (catch-exception (SecurityException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = SystemProperties.getProperty("property1", supplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${getProperty1WhenStringUtilsNotIsEmptyPropertyAndCaughtSecurityException}, hash: 660FBF50573AC1A5AE39D42B036BC5D3
    @Test()
    void getProperty1WhenStringUtilsNotIsEmptyPropertyAndCaughtSecurityException() {
        /* Branches:
         * (StringUtils.isEmpty(property)) : false
         * (catch-exception (SecurityException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = SystemProperties.getProperty("A", supplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${getUserCountryTest}, hash: 9D4C1CF66D9546433A3732052424EAB8
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

    //Sapient generated method id: ${getUserDirTest}, hash: 2704EEE5F6F70281DD69D71243ECDF2A
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

    //Sapient generated method id: ${getUserHomeTest}, hash: 83AB2C16CDE353339A74B93100DB42C7
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

    //Sapient generated method id: ${getUserLanguageTest}, hash: D06919C239E23A1849E1C75B9964A3F2
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

    //Sapient generated method id: ${getUserNameTest}, hash: 01EDF98B60BEFD5254CAF86C5FE4D8A1
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

    //Sapient generated method id: ${getUserTimezoneTest}, hash: 4347F9C7BCFACA13D8E9581B5149C675
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
