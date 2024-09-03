package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.concurrent.ThreadLocalRandom;
import org.mockito.MockedStatic;
import java.util.Random;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RandomStringUtilsSapientGeneratedTest {

    private final Random randomMock = mock(Random.class);

    //Sapient generated method id: ${random1Test}, hash: E3B827867A1D9C6BFB261D01AA9A66CD
    @Test()
    void random1Test() {
        //Arrange Statement(s)
        try (MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            randomStringUtils.when(() -> RandomStringUtils.random(0, false, false)).thenReturn("return_of_random1");
            //Act Statement(s)
            String result = RandomStringUtils.random(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_random1"));
                randomStringUtils.verify(() -> RandomStringUtils.random(0, false, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${random2Test}, hash: E6E040BE80B4948B9566039B6CC5CEAE
    @Test()
    void random2Test() {
        //Arrange Statement(s)
        try (MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            randomStringUtils.when(() -> RandomStringUtils.random(0, 0, 0, false, false)).thenReturn("return_of_random1");
            //Act Statement(s)
            String result = RandomStringUtils.random(0, false, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_random1"));
                randomStringUtils.verify(() -> RandomStringUtils.random(0, 0, 0, false, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${random3WhenCharsIsNull}, hash: ADF46C98294E2CBA204F29A157585621
    @Test()
    void random3WhenCharsIsNull() {
        /* Branches:
         * (chars == null) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            randomStringUtils.when(() -> RandomStringUtils.random(eq(0), eq(0), eq(0), eq(false), eq(false), eq((char[]) null), (ThreadLocalRandom) any())).thenReturn("return_of_random1");
            char[] _char = null;
            //Act Statement(s)
            String result = RandomStringUtils.random(0, _char);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_random1"));
                randomStringUtils.verify(() -> RandomStringUtils.random(eq(0), eq(0), eq(0), eq(false), eq(false), eq((char[]) null), (ThreadLocalRandom) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${random3WhenCharsIsNotNull}, hash: 9E26773136DACE56CC89F1A86C192B30
    @Test()
    void random3WhenCharsIsNotNull() {
        /* Branches:
         * (chars == null) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] {};
            randomStringUtils.when(() -> RandomStringUtils.random(eq(0), eq(0), eq(0), eq(false), eq(false), eq(charArray), (ThreadLocalRandom) any())).thenReturn("return_of_random1");
            //Act Statement(s)
            String result = RandomStringUtils.random(0, charArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_random1"));
                randomStringUtils.verify(() -> RandomStringUtils.random(eq(0), eq(0), eq(0), eq(false), eq(false), eq(charArray), (ThreadLocalRandom) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${random4Test}, hash: 4E320D8F56B1048C337EAC40C7E0CFBA
    @Test()
    void random4Test() {
        //Arrange Statement(s)
        try (MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            randomStringUtils.when(() -> RandomStringUtils.random(eq(0), eq(0), eq(0), eq(false), eq(false), eq((char[]) null), (ThreadLocalRandom) any())).thenReturn("return_of_random1");
            //Act Statement(s)
            String result = RandomStringUtils.random(0, 0, 0, false, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_random1"));
                randomStringUtils.verify(() -> RandomStringUtils.random(eq(0), eq(0), eq(0), eq(false), eq(false), eq((char[]) null), (ThreadLocalRandom) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${random5Test}, hash: 911362ADC16F5E88C28709573EF2721A
    @Test()
    void random5Test() {
        //Arrange Statement(s)
        try (MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] {};
            randomStringUtils.when(() -> RandomStringUtils.random(eq(0), eq(0), eq(0), eq(false), eq(false), eq(charArray), (ThreadLocalRandom) any())).thenReturn("return_of_random1");
            //Act Statement(s)
            String result = RandomStringUtils.random(0, 0, 0, false, false, charArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_random1"));
                randomStringUtils.verify(() -> RandomStringUtils.random(eq(0), eq(0), eq(0), eq(false), eq(false), eq(charArray), (ThreadLocalRandom) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${random6WhenCountEquals0}, hash: 4B3BDBAE862D8D553249BADD6633FA49
    @Test()
    void random6WhenCountEquals0() {
        /* Branches:
         * (count == 0) : true
         */
         //Arrange Statement(s)
        char[] charArray = new char[] {};
        Random random = new Random();
        
        //Act Statement(s)
        String result = RandomStringUtils.random(0, 0, 0, false, false, charArray, random);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }

    //Sapient generated method id: ${random6WhenCountLessThan0ThrowsIllegalArgumentException}, hash: 8AD7A20B829F4E63D93709CAAD5BAF57
    @Test()
    void random6WhenCountLessThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (count == 0) : false
         * (count < 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        char[] charArray = new char[] {};
        Random random = new Random();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            RandomStringUtils.random(0, 0, 0, false, false, charArray, random);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${random6WhenCharsLengthEquals0ThrowsIllegalArgumentException}, hash: 76EB42463798CECBBAC5885AAD758177
    @Test()
    void random6WhenCharsLengthEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (count == 0) : false
         * (count < 0) : false
         * (chars != null) : true
         * (chars.length == 0) : true
         */
         //Arrange Statement(s)
        char[] charArray = new char[] {};
        Random random = new Random();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The chars array must not be empty");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            RandomStringUtils.random(1, 0, 0, false, false, charArray, random);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${random6WhenNumberOfCharsGreaterThan1}, hash: EF455DBA1A92A5B103D5B8703D138C34
    @Test()
    void random6WhenNumberOfCharsGreaterThan1() {
        /* Branches:
         * (count == 0) : false
         * (count < 0) : false
         * (chars != null) : true
         * (chars.length == 0) : false
         * (start == 0) : true
         * (end == 0) : true
         * (chars != null) : true
         * (chars == null) : false
         * (count-- != 0) : true
         * (chars == null) : false
         * (count == 0) : true
         * (numberOfChars > 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(0).when(randomMock).nextInt(0);
        char[] charArray = new char[] {};
        
        //Act Statement(s)
        String result = RandomStringUtils.random(0, 0, 0, false, false, charArray, randomMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(randomMock).nextInt(0);
        });
    }

    //Sapient generated method id: ${random6WhenCharacterNotIsLetterCodePointAndNumbersAndNotNumbersAndCharacterIsDigitCodePoint}, hash: 8791DA616334E3FD81E98C18F0DF8EB4
    @Test()
    void random6WhenCharacterNotIsLetterCodePointAndNumbersAndNotNumbersAndCharacterIsDigitCodePoint() {
        /* Branches:
         * (count == 0) : false
         * (count < 0) : false
         * (chars != null) : true
         * (chars.length == 0) : false
         * (start == 0) : true
         * (end == 0) : true
         * (chars != null) : true
         * (chars == null) : false
         * (count-- != 0) : true
         * (chars == null) : false
         * (count == 0) : true
         * (numberOfChars > 1) : false
         * (letters) : true
         * (Character.isLetter(codePoint)) : false
         * (numbers) : true
         * (numbers) : false
         * (Character.isDigit(codePoint)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(0).when(randomMock).nextInt(1);
        char[] charArray = new char[] { 0 };
        
        //Act Statement(s)
        String result = RandomStringUtils.random(1, 0, 0, true, true, charArray, randomMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(randomMock).nextInt(1);
        });
    }

    //Sapient generated method id: ${random6WhenNotNumbersAndNumberOfCharsNotEquals2}, hash: 02698A60BD4193B766872D341F309DBB
    @Test()
    void random6WhenNotNumbersAndNumberOfCharsNotEquals2() {
        /* Branches:
         * (count == 0) : false
         * (count < 0) : false
         * (chars != null) : true
         * (chars.length == 0) : false
         * (start == 0) : true
         * (end == 0) : true
         * (chars != null) : true
         * (chars == null) : false
         * (count-- != 0) : true
         * (chars == null) : false
         * (count == 0) : true
         * (numberOfChars > 1) : false
         * (letters) : false
         * (numbers) : false
         * (Character.isDigit(codePoint)) : false
         * (numbers) : false
         * (numberOfChars == 2) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(0).when(randomMock).nextInt(1);
        char[] charArray = new char[] { 0 };
        
        //Act Statement(s)
        String result = RandomStringUtils.random(1, 0, 0, false, false, charArray, randomMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(randomMock).nextInt(1);
        });
    }

    //Sapient generated method id: ${random7WhenCharsIsNull}, hash: C316688202DAE946C3C312D8CF472DE6
    @Test()
    void random7WhenCharsIsNull() {
        /* Branches:
         * (chars == null) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            randomStringUtils.when(() -> RandomStringUtils.random(eq(0), eq(0), eq(0), eq(false), eq(false), eq((char[]) null), (ThreadLocalRandom) any())).thenReturn("return_of_random1");
            //Act Statement(s)
            String result = RandomStringUtils.random(0, (String) null);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_random1"));
                randomStringUtils.verify(() -> RandomStringUtils.random(eq(0), eq(0), eq(0), eq(false), eq(false), eq((char[]) null), (ThreadLocalRandom) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${random7WhenCharsIsNotNull}, hash: 252653438415B71CEA49ADB9058C9CDC
    @Test()
    void random7WhenCharsIsNotNull() {
        /* Branches:
         * (chars == null) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            char[] charArray = new char[] { 'A' };
            randomStringUtils.when(() -> RandomStringUtils.random(0, charArray)).thenReturn("return_of_random1");
            //Act Statement(s)
            String result = RandomStringUtils.random(0, "A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_random1"));
                randomStringUtils.verify(() -> RandomStringUtils.random(0, charArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${randomAlphabeticTest}, hash: 7685D4AAF1444A0B103F3AE87A37B75F
    @Test()
    void randomAlphabeticTest() {
        //Arrange Statement(s)
        try (MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            randomStringUtils.when(() -> RandomStringUtils.random(0, true, false)).thenReturn("return_of_random1");
            //Act Statement(s)
            String result = RandomStringUtils.randomAlphabetic(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_random1"));
                randomStringUtils.verify(() -> RandomStringUtils.random(0, true, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${randomAlphabetic1Test}, hash: AFE32664A5B435ECB19ADD1AF0BEA3ED
    @Test()
    void randomAlphabetic1Test() {
        //Arrange Statement(s)
        try (MockedStatic<RandomUtils> randomUtils = mockStatic(RandomUtils.class);
            MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            randomStringUtils.when(() -> RandomStringUtils.randomAlphabetic(0)).thenReturn("return_of_randomAlphabetic1");
            randomUtils.when(() -> RandomUtils.nextInt(0, 0)).thenReturn(0);
            //Act Statement(s)
            String result = RandomStringUtils.randomAlphabetic(0, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_randomAlphabetic1"));
                randomStringUtils.verify(() -> RandomStringUtils.randomAlphabetic(0), atLeast(1));
                randomUtils.verify(() -> RandomUtils.nextInt(0, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${randomAlphanumericTest}, hash: 28524A3E34DD2BAC8E34B9C47076511C
    @Test()
    void randomAlphanumericTest() {
        //Arrange Statement(s)
        try (MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            randomStringUtils.when(() -> RandomStringUtils.random(0, true, true)).thenReturn("return_of_random1");
            //Act Statement(s)
            String result = RandomStringUtils.randomAlphanumeric(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_random1"));
                randomStringUtils.verify(() -> RandomStringUtils.random(0, true, true), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${randomAlphanumeric1Test}, hash: 4D90EFCEF03197BB3B2B5E1D8AC358D3
    @Test()
    void randomAlphanumeric1Test() {
        //Arrange Statement(s)
        try (MockedStatic<RandomUtils> randomUtils = mockStatic(RandomUtils.class);
            MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            randomStringUtils.when(() -> RandomStringUtils.randomAlphanumeric(0)).thenReturn("return_of_randomAlphanumeric1");
            randomUtils.when(() -> RandomUtils.nextInt(0, 0)).thenReturn(0);
            //Act Statement(s)
            String result = RandomStringUtils.randomAlphanumeric(0, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_randomAlphanumeric1"));
                randomStringUtils.verify(() -> RandomStringUtils.randomAlphanumeric(0), atLeast(1));
                randomUtils.verify(() -> RandomUtils.nextInt(0, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${randomAsciiTest}, hash: 9F32A12178E7BD7EDD6C497ACE2DE8E3
    @Test()
    void randomAsciiTest() {
        //Arrange Statement(s)
        try (MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            randomStringUtils.when(() -> RandomStringUtils.random(0, 32, 127, false, false)).thenReturn("return_of_random1");
            //Act Statement(s)
            String result = RandomStringUtils.randomAscii(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_random1"));
                randomStringUtils.verify(() -> RandomStringUtils.random(0, 32, 127, false, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${randomAscii1Test}, hash: 986AF43ED0A2F22DA2192204B234D87C
    @Test()
    void randomAscii1Test() {
        //Arrange Statement(s)
        try (MockedStatic<RandomUtils> randomUtils = mockStatic(RandomUtils.class);
            MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            randomStringUtils.when(() -> RandomStringUtils.randomAscii(0)).thenReturn("return_of_randomAscii1");
            randomUtils.when(() -> RandomUtils.nextInt(0, 0)).thenReturn(0);
            //Act Statement(s)
            String result = RandomStringUtils.randomAscii(0, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_randomAscii1"));
                randomStringUtils.verify(() -> RandomStringUtils.randomAscii(0), atLeast(1));
                randomUtils.verify(() -> RandomUtils.nextInt(0, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${randomGraphTest}, hash: 353AC47A9ACD312A247B0DF061EF3410
    @Test()
    void randomGraphTest() {
        //Arrange Statement(s)
        try (MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            randomStringUtils.when(() -> RandomStringUtils.random(0, 33, 126, false, false)).thenReturn("return_of_random1");
            //Act Statement(s)
            String result = RandomStringUtils.randomGraph(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_random1"));
                randomStringUtils.verify(() -> RandomStringUtils.random(0, 33, 126, false, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${randomGraph1Test}, hash: 34E9E0F39220A4E71EEE3CD9FB4749BA
    @Test()
    void randomGraph1Test() {
        //Arrange Statement(s)
        try (MockedStatic<RandomUtils> randomUtils = mockStatic(RandomUtils.class);
            MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            randomStringUtils.when(() -> RandomStringUtils.randomGraph(0)).thenReturn("return_of_randomGraph1");
            randomUtils.when(() -> RandomUtils.nextInt(0, 0)).thenReturn(0);
            //Act Statement(s)
            String result = RandomStringUtils.randomGraph(0, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_randomGraph1"));
                randomStringUtils.verify(() -> RandomStringUtils.randomGraph(0), atLeast(1));
                randomUtils.verify(() -> RandomUtils.nextInt(0, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${randomNumericTest}, hash: 1F49828D16CBEBEC248BCB7A9B7D67EA
    @Test()
    void randomNumericTest() {
        //Arrange Statement(s)
        try (MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            randomStringUtils.when(() -> RandomStringUtils.random(0, false, true)).thenReturn("return_of_random1");
            //Act Statement(s)
            String result = RandomStringUtils.randomNumeric(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_random1"));
                randomStringUtils.verify(() -> RandomStringUtils.random(0, false, true), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${randomNumeric1Test}, hash: A38329444F0F42335787E36C6C4050AD
    @Test()
    void randomNumeric1Test() {
        //Arrange Statement(s)
        try (MockedStatic<RandomUtils> randomUtils = mockStatic(RandomUtils.class);
            MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            randomStringUtils.when(() -> RandomStringUtils.randomNumeric(0)).thenReturn("return_of_randomNumeric1");
            randomUtils.when(() -> RandomUtils.nextInt(0, 0)).thenReturn(0);
            //Act Statement(s)
            String result = RandomStringUtils.randomNumeric(0, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_randomNumeric1"));
                randomStringUtils.verify(() -> RandomStringUtils.randomNumeric(0), atLeast(1));
                randomUtils.verify(() -> RandomUtils.nextInt(0, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${randomPrintTest}, hash: 144B117083F46CCA1797027C5950C4DB
    @Test()
    void randomPrintTest() {
        //Arrange Statement(s)
        try (MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            randomStringUtils.when(() -> RandomStringUtils.random(0, 32, 126, false, false)).thenReturn("return_of_random1");
            //Act Statement(s)
            String result = RandomStringUtils.randomPrint(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_random1"));
                randomStringUtils.verify(() -> RandomStringUtils.random(0, 32, 126, false, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${randomPrint1Test}, hash: 43E69E49332BE30D4496076FAF4525A5
    @Test()
    void randomPrint1Test() {
        //Arrange Statement(s)
        try (MockedStatic<RandomUtils> randomUtils = mockStatic(RandomUtils.class);
            MockedStatic<RandomStringUtils> randomStringUtils = mockStatic(RandomStringUtils.class, CALLS_REAL_METHODS)) {
            randomStringUtils.when(() -> RandomStringUtils.randomPrint(0)).thenReturn("return_of_randomPrint1");
            randomUtils.when(() -> RandomUtils.nextInt(0, 0)).thenReturn(0);
            //Act Statement(s)
            String result = RandomStringUtils.randomPrint(0, 0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_randomPrint1"));
                randomStringUtils.verify(() -> RandomStringUtils.randomPrint(0), atLeast(1));
                randomUtils.verify(() -> RandomUtils.nextInt(0, 0), atLeast(1));
            });
        }
    }
}
