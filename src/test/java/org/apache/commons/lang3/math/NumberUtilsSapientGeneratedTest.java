package org.apache.commons.lang3.math;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.math.RoundingMode;
import java.math.BigInteger;
import org.mockito.MockedStatic;
import java.math.BigDecimal;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.closeTo;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NumberUtilsSapientGeneratedTest {

    //Sapient generated method id: ${compareTest}, hash: CCAD25C0B8352D78FF55BBCF69387E32
    @Test()
    void compareTest() {
        
        //Act Statement(s)
        int result = NumberUtils.compare((byte) 1, (byte) 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${compare1WhenXEqualsY}, hash: F5E2EA96D6F81AC6A27E00E71D5F843A
    @Test()
    void compare1WhenXEqualsY() {
        /* Branches:
         * (x == y) : true
         */
         
        //Act Statement(s)
        int result = NumberUtils.compare(1, 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${compare1WhenXLessThanY}, hash: 305E25073C81E5A92FF54D1F653B9575
    @Test()
    void compare1WhenXLessThanY() {
        /* Branches:
         * (x == y) : false
         * (x < y) : true
         */
         
        //Act Statement(s)
        int result = NumberUtils.compare(1, 2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${compare1WhenXNotLessThanY}, hash: BEC66A8FCFEAE952EFDF50A0A33D45C3
    @Test()
    void compare1WhenXNotLessThanY() {
        /* Branches:
         * (x == y) : false
         * (x < y) : false
         */
         
        //Act Statement(s)
        int result = NumberUtils.compare(2, 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${compare2WhenXEqualsY}, hash: 18305AA0D872FBF53F81D7AE05576067
    @Test()
    void compare2WhenXEqualsY() {
        /* Branches:
         * (x == y) : true
         */
         
        //Act Statement(s)
        int result = NumberUtils.compare(1L, 1L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${compare2WhenXLessThanY}, hash: 28157ECC225EF02723024780357B4780
    @Test()
    void compare2WhenXLessThanY() {
        /* Branches:
         * (x == y) : false
         * (x < y) : true
         */
         
        //Act Statement(s)
        int result = NumberUtils.compare(1L, 2L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${compare2WhenXNotLessThanY}, hash: 6261F15F1D3D9D5734F9DF35F4E9F395
    @Test()
    void compare2WhenXNotLessThanY() {
        /* Branches:
         * (x == y) : false
         * (x < y) : false
         */
         
        //Act Statement(s)
        int result = NumberUtils.compare(2L, 1L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${compare3WhenXEqualsY}, hash: 7670E1D4F33A232AF23309B88926FB14
    @Test()
    void compare3WhenXEqualsY() {
        /* Branches:
         * (x == y) : true
         */
         
        //Act Statement(s)
        int result = NumberUtils.compare((short) 1, (short) 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${compare3WhenXLessThanY}, hash: EF5B73D0B68CCD248B3FDD0202D69A64
    @Test()
    void compare3WhenXLessThanY() {
        /* Branches:
         * (x == y) : false
         * (x < y) : true
         */
         
        //Act Statement(s)
        int result = NumberUtils.compare((short) 1, (short) 2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${compare3WhenXNotLessThanY}, hash: FEFFC9C7695504BCF7CE7A4E7765A3B9
    @Test()
    void compare3WhenXNotLessThanY() {
        /* Branches:
         * (x == y) : false
         * (x < y) : false
         */
         
        //Act Statement(s)
        int result = NumberUtils.compare((short) 2, (short) 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${createBigDecimalWhenStrIsNull}, hash: 30825F9832EC2E7C53A322CE9D76298E
    @Test()
    void createBigDecimalWhenStrIsNull() {
        /* Branches:
         * (str == null) : true
         */
         
        //Act Statement(s)
        BigDecimal result = NumberUtils.createBigDecimal((String) null);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${createBigDecimalWhenStringUtilsIsBlankStrThrowsNumberFormatException}, hash: 2E2A61D2E35A7C525074FAA4588ABD8F
    @Test()
    void createBigDecimalWhenStringUtilsIsBlankStrThrowsNumberFormatException() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        NumberFormatException numberFormatException = new NumberFormatException("A blank string is not a valid number");
        //Act Statement(s)
        final NumberFormatException result = assertThrows(NumberFormatException.class, () -> {
            NumberUtils.createBigDecimal("str1");
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(numberFormatException.getMessage()));
        });
    }

    //Sapient generated method id: ${createBigDecimalWhenStringUtilsNotIsBlankStr}, hash: 62CEB0EA0F1C41B1260A030C66AAAD33
    @Test()
    void createBigDecimalWhenStringUtilsNotIsBlankStr() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : false
         */
         
        //Act Statement(s)
        BigDecimal result = NumberUtils.createBigDecimal("0");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.stripTrailingZeros(), equalTo(new BigDecimal("0.0").stripTrailingZeros())));
    }

    //Sapient generated method id: ${createBigIntegerWhenStrIsNull}, hash: A814ED4E68C426809B7688548D1E351B
    @Test()
    void createBigIntegerWhenStrIsNull() {
        /* Branches:
         * (str == null) : true
         */
         
        //Act Statement(s)
        BigInteger result = NumberUtils.createBigInteger((String) null);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${createBigIntegerWhenStrIsEmptyThrowsNumberFormatException}, hash: 72FD95D44ECD8120EC3B95518841523A
    @Test()
    void createBigIntegerWhenStrIsEmptyThrowsNumberFormatException() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : true
         */
         //Arrange Statement(s)
        NumberFormatException numberFormatException = new NumberFormatException("An empty string is not a valid number");
        //Act Statement(s)
        final NumberFormatException result = assertThrows(NumberFormatException.class, () -> {
            NumberUtils.createBigInteger("");
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(numberFormatException.getMessage()));
        });
    }

    //Sapient generated method id: ${createBigIntegerWhenStrStartsWith_PosAndNegate}, hash: 7FBCF7AE58163DF2BF258E3F609196B8
    @Test()
    void createBigIntegerWhenStrStartsWith_PosAndNegate() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (char0 == '-') : true
         * (str.startsWith("0x", pos)) : false
         * (str.startsWith("0X", pos)) : false
         * (str.startsWith("#", pos)) : true
         * (negate) : true
         */
         
        //Act Statement(s)
        BigInteger result = NumberUtils.createBigInteger("-#AB");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(new BigInteger("-171"))));
    }

    //Sapient generated method id: ${createBigIntegerWhenStrStartsWith0XPosAndNotNegate}, hash: C32B1A92C39D00DF5233B3B22155DC8E
    @Test()
    void createBigIntegerWhenStrStartsWith0XPosAndNotNegate() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (char0 == '-') : false
         * (char0 == '+') : true
         * (str.startsWith("0x", pos)) : false
         * (str.startsWith("0X", pos)) : true
         * (negate) : false
         */
         
        //Act Statement(s)
        BigInteger result = NumberUtils.createBigInteger("+0XA");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(new BigInteger("10"))));
    }

    //Sapient generated method id: ${createBigIntegerWhenStrLengthGreaterThanPosPlus1AndNegate}, hash: F257BF80A396D09EC2CB5E92F857C303
    @Test()
    void createBigIntegerWhenStrLengthGreaterThanPosPlus1AndNegate() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (char0 == '-') : true
         * (str.startsWith("0x", pos)) : false
         * (str.startsWith("0X", pos)) : false
         * (str.startsWith("#", pos)) : false
         * (str.startsWith("0", pos)) : true
         * (str.length() > pos + 1) : true
         * (negate) : true
         */
         
        //Act Statement(s)
        BigInteger result = NumberUtils.createBigInteger("-0A");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(new BigInteger("-1"))));
    }

    //Sapient generated method id: ${createDoubleWhenStrIsNull}, hash: 9DE4C0D9A7B00739A633B0F9C2715F28
    @Test()
    void createDoubleWhenStrIsNull() {
        /* Branches:
         * (str == null) : true
         */
         
        //Act Statement(s)
        Double result = NumberUtils.createDouble((String) null);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${createDoubleWhenStrIsNotNull}, hash: 2E9EA9CEDA46FD95A19CF97A98411C9B
    @Test()
    void createDoubleWhenStrIsNotNull() {
        /* Branches:
         * (str == null) : false
         */
         
        //Act Statement(s)
        Double result = NumberUtils.createDouble("1.0");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("1.0"), 0.00001)));
    }

    //Sapient generated method id: ${createFloatWhenStrIsNull}, hash: C8E54FBD9AF42ABE3F29EB1F158A56FC
    @Test()
    void createFloatWhenStrIsNull() {
        /* Branches:
         * (str == null) : true
         */
         
        //Act Statement(s)
        Float result = NumberUtils.createFloat((String) null);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${createFloatWhenStrIsNotNull}, hash: 9DF408C5714EE7D5279F323FFCA0E5E6
    @Test()
    void createFloatWhenStrIsNotNull() {
        /* Branches:
         * (str == null) : false
         */
         
        //Act Statement(s)
        Float result = NumberUtils.createFloat("1.0");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("1.0"))));
    }

    //Sapient generated method id: ${createIntegerWhenStrIsNull}, hash: F08B3C45989E72EFA1B91FA71629B3FD
    @Test()
    void createIntegerWhenStrIsNull() {
        /* Branches:
         * (str == null) : true
         */
         
        //Act Statement(s)
        Integer result = NumberUtils.createInteger((String) null);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${createIntegerWhenStrIsNotNull}, hash: 0EC2964C7A78A6B144565FB3567C6E40
    @Test()
    void createIntegerWhenStrIsNotNull() {
        /* Branches:
         * (str == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Integer result = NumberUtils.createInteger("A");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${createLongWhenStrIsNull}, hash: 28F85F87B678F673CED879AF921688D0
    @Test()
    void createLongWhenStrIsNull() {
        /* Branches:
         * (str == null) : true
         */
         
        //Act Statement(s)
        Long result = NumberUtils.createLong((String) null);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${createLongWhenStrIsNotNull}, hash: 55B2B6A798B03FB7A019FBBFBCC30F39
    @Test()
    void createLongWhenStrIsNotNull() {
        /* Branches:
         * (str == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Long result = NumberUtils.createLong("A");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }

    //Sapient generated method id: ${createNumberWhenStrIsNull}, hash: 3C9605EBBA0F0DF8B26279C506133577
    @Test()
    void createNumberWhenStrIsNull() {
        /* Branches:
         * (str == null) : true
         */
         
        //Act Statement(s)
        Number result = NumberUtils.createNumber((String) null);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${createNumberWhenStringUtilsIsBlankStrThrowsNumberFormatException}, hash: 0BAB1A7277B71AE994F98CC9212A815A
    @Test()
    void createNumberWhenStringUtilsIsBlankStrThrowsNumberFormatException() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        NumberFormatException numberFormatException = new NumberFormatException("A blank string is not a valid number");
        //Act Statement(s)
        final NumberFormatException result = assertThrows(NumberFormatException.class, () -> {
            NumberUtils.createNumber("str1");
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(numberFormatException.getMessage()));
        });
    }

    //Sapient generated method id: ${createNumberWhenFirstSigDigitGreaterThan_7_}, hash: A338BC20E106AA162D16A2550FAE1F22
    @Test()
    void createNumberWhenFirstSigDigitGreaterThan_7_() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : false
         * (str.charAt(0) == '+') : false
         * (str.charAt(0) == '-') : true
         * (for-each(hexPrefixes)) : true
         * (str.startsWith(pfx, offset)) : true
         * (pfxLen > 0) : true
         * (i < length) : true
         * (firstSigDigit != '0') : true
         * (hexDigits > 16) : false
         * (hexDigits == 16) : true
         * (firstSigDigit > '7') : true
         */
         //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.createBigInteger("-0x\uFDFFCDEFGHIJKLMNOPQ")).thenReturn(new BigInteger("0"));
            //Act Statement(s)
            Number result = NumberUtils.createNumber("-0x\uFDFFCDEFGHIJKLMNOPQ");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(new BigInteger("0")));
                numberUtils.verify(() -> NumberUtils.createBigInteger("-0x\uFDFFCDEFGHIJKLMNOPQ"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${createNumberWhenFirstSigDigitNotGreaterThan_7_AndHexDigitsGreaterThan8}, hash: E08C5D6BCD2FF8B56CCD5043DCEE44AE
    @Test()
    void createNumberWhenFirstSigDigitNotGreaterThan_7_AndHexDigitsGreaterThan8() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : false
         * (str.charAt(0) == '+') : false
         * (str.charAt(0) == '-') : true
         * (for-each(hexPrefixes)) : true
         * (str.startsWith(pfx, offset)) : true
         * (pfxLen > 0) : true
         * (i < length) : true
         * (firstSigDigit != '0') : true
         * (hexDigits > 16) : false
         * (hexDigits == 16) : true
         * (firstSigDigit > '7') : false
         * (hexDigits > 8) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.createLong("-0x\u0001CDEFGHIJKLMNOPQ")).thenReturn(0L);
            //Act Statement(s)
            Number result = NumberUtils.createNumber("-0x\u0001CDEFGHIJKLMNOPQ");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0L));
                numberUtils.verify(() -> NumberUtils.createLong("-0x\u0001CDEFGHIJKLMNOPQ"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${createNumberWhenExpPosGreaterThanLengthThrowsNumberFormatException}, hash: 788E7ECD0A65457CD93C7FD26D7BE7A6
    @Test()
    void createNumberWhenExpPosGreaterThanLengthThrowsNumberFormatException() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : false
         * (str.charAt(0) == '+') : false
         * (str.charAt(0) == '-') : true
         * (for-each(hexPrefixes)) : true
         * (str.startsWith(pfx, offset)) : false
         * (pfxLen > 0) : false
         * (!Character.isDigit(lastChar)) : true
         * (lastChar != '.') : true
         * (decPos > -1) : true
         * (expPos > -1) : true
         * (expPos < decPos) : false
         * (expPos > length) : true
         */
         //Arrange Statement(s)
        NumberFormatException numberFormatException = new NumberFormatException("-.eE is not a valid number.");
        //Act Statement(s)
        final NumberFormatException result = assertThrows(NumberFormatException.class, () -> {
            NumberUtils.createNumber("-.eE");
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(numberFormatException.getMessage()));
        });
    }

    //Sapient generated method id: ${createNumberWhenHexDigitsEquals8AndFirstSigDigitNotGreaterThan_7_}, hash: 0AF312B91C5384E3BE2CC661ED826E6A
    @Test()
    void createNumberWhenHexDigitsEquals8AndFirstSigDigitNotGreaterThan_7_() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : false
         * (str.charAt(0) == '+') : false
         * (str.charAt(0) == '-') : true
         * (for-each(hexPrefixes)) : true
         * (str.startsWith(pfx, offset)) : true
         * (pfxLen > 0) : true
         * (i < length) : true
         * (firstSigDigit != '0') : false
         * (hexDigits > 16) : false
         * (hexDigits == 16) : false
         * (hexDigits > 8) : false
         * (hexDigits == 8) : true
         * (firstSigDigit > '7') : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.createInteger("-0x0DEFGHIJK")).thenReturn(0);
            //Act Statement(s)
            Number result = NumberUtils.createNumber("-0x0DEFGHIJK");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                numberUtils.verify(() -> NumberUtils.createInteger("-0x0DEFGHIJK"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${createNumberWhenIsDigitsNotNumericThrowsNumberFormatException}, hash: CD4C2550477CFB1DA53ACA5790D08D9E
    @Test()
    void createNumberWhenIsDigitsNotNumericThrowsNumberFormatException() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : false
         * (str.charAt(0) == '+') : false
         * (str.charAt(0) == '-') : true
         * (for-each(hexPrefixes)) : true
         * (str.startsWith(pfx, offset)) : false
         * (pfxLen > 0) : false
         * (!Character.isDigit(lastChar)) : true
         * (lastChar != '.') : true
         * (decPos > -1) : true
         * (expPos > -1) : true
         * (expPos < decPos) : false
         * (expPos > length) : false
         * (firstChar == '-') : false  #  inside getMantissa method
         * (firstChar == '+') : true  #  inside getMantissa method
         * (hasSign) : true  #  inside getMantissa method
         * (requestType) : true
         * (expPos > -1) : true
         * (expPos < length - 1) : true
         * (switch(lastChar) = 'f' or switch(lastChar) = 'F') : true
         * (dec == null) : true
         * (exp == null) : true
         * (!numeric.isEmpty()) : true
         * (isDigits(numeric.substring(1))) : false
         * (isDigits(numeric)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.isDigits("string11")).thenReturn(false);
            numberUtils.when(() -> NumberUtils.isDigits("string10")).thenReturn(false);
            //Act Statement(s)
            final NumberFormatException result = assertThrows(NumberFormatException.class, () -> {
                NumberUtils.createNumber("str1");
            });
            NumberFormatException numberFormatException = new NumberFormatException("s1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(numberFormatException.getMessage()));
                numberUtils.verify(() -> NumberUtils.isDigits("string11"), atLeast(1));
                numberUtils.verify(() -> NumberUtils.isDigits("string10"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${createNumberWhenIsDigitsNotNumeric}, hash: 15AB94A939E65453504A7174F70CB1F6
    @Test()
    void createNumberWhenIsDigitsNotNumeric() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : false
         * (str.charAt(0) == '+') : false
         * (str.charAt(0) == '-') : true
         * (for-each(hexPrefixes)) : true
         * (str.startsWith(pfx, offset)) : false
         * (pfxLen > 0) : false
         * (!Character.isDigit(lastChar)) : true
         * (lastChar != '.') : true
         * (decPos > -1) : true
         * (expPos > -1) : true
         * (expPos < decPos) : false
         * (expPos > length) : false
         * (firstChar == '-') : false  #  inside getMantissa method
         * (firstChar == '+') : true  #  inside getMantissa method
         * (hasSign) : true  #  inside getMantissa method
         * (requestType) : true
         * (expPos > -1) : true
         * (expPos < length - 1) : true
         * (switch(lastChar) = 'f' or switch(lastChar) = 'F') : true
         * (dec == null) : true
         * (exp == null) : true
         * (!numeric.isEmpty()) : true
         * (isDigits(numeric.substring(1))) : false
         * (isDigits(numeric)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.isDigits("string11")).thenReturn(false);
            numberUtils.when(() -> NumberUtils.isDigits("string10")).thenReturn(false);
            numberUtils.when(() -> NumberUtils.createLong("string10")).thenReturn(0L);
            //Act Statement(s)
            Number result = NumberUtils.createNumber("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0L));
                numberUtils.verify(() -> NumberUtils.isDigits("string11"), atLeast(1));
                numberUtils.verify(() -> NumberUtils.isDigits("string10"), atLeast(1));
                numberUtils.verify(() -> NumberUtils.createLong("string10"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${createNumberWhenFFloatValueNotEquals0_0F}, hash: 6E58ECD67DE6909B3CF11EA38B9FE00D
    @Test()
    void createNumberWhenFFloatValueNotEquals0_0F() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : false
         * (str.charAt(0) == '+') : false
         * (str.charAt(0) == '-') : true
         * (for-each(hexPrefixes)) : true
         * (str.startsWith(pfx, offset)) : false
         * (pfxLen > 0) : false
         * (!Character.isDigit(lastChar)) : true
         * (lastChar != '.') : true
         * (decPos > -1) : true
         * (expPos > -1) : true
         * (expPos < decPos) : false
         * (expPos > length) : false
         * (firstChar == '-') : false  #  inside getMantissa method
         * (firstChar == '+') : true  #  inside getMantissa method
         * (hasSign) : true  #  inside getMantissa method
         * (requestType) : true
         * (expPos > -1) : true
         * (expPos < length - 1) : true
         * (switch(lastChar) = 'l' or switch(lastChar) = 'L') : true
         * (!(f.isInfinite() || f.floatValue() == 0.0F && !isZero(mant, dec))) : false
         * (f.isInfinite()) : false
         * (str == null) : true  #  inside isAllZeros method
         * (isAllZeros(mant)) : true  #  inside isZero method
         * (isAllZeros(dec)) : true  #  inside isZero method
         * (f.floatValue() == 0.0F) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.createFloat("str1")).thenReturn(Float.parseFloat("0.0"));
            //Act Statement(s)
            Number result = NumberUtils.createNumber("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Float.parseFloat("0.0")));
                numberUtils.verify(() -> NumberUtils.createFloat("str1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${createNumberWhenDDoubleValueNotEquals0_0D}, hash: 04AAAC598F9F72EBB037FE881DBB9886
    @Test()
    void createNumberWhenDDoubleValueNotEquals0_0D() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : false
         * (str.charAt(0) == '+') : false
         * (str.charAt(0) == '-') : true
         * (for-each(hexPrefixes)) : true
         * (str.startsWith(pfx, offset)) : false
         * (pfxLen > 0) : false
         * (!Character.isDigit(lastChar)) : true
         * (lastChar != '.') : true
         * (decPos > -1) : true
         * (expPos > -1) : true
         * (expPos < decPos) : false
         * (expPos > length) : false
         * (firstChar == '-') : false  #  inside getMantissa method
         * (firstChar == '+') : true  #  inside getMantissa method
         * (hasSign) : true  #  inside getMantissa method
         * (requestType) : true
         * (expPos > -1) : true
         * (expPos < length - 1) : true
         * (switch(lastChar) = 'l' or switch(lastChar) = 'L') : true
         * (!(d.isInfinite() || d.doubleValue() == 0.0D && !isZero(mant, dec))) : false
         * (d.isInfinite()) : false
         * (str == null) : true  #  inside isAllZeros method
         * (isAllZeros(mant)) : true  #  inside isZero method
         * (isAllZeros(dec)) : true  #  inside isZero method
         * (d.doubleValue() == 0.0D) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.createDouble("str1")).thenReturn(Double.parseDouble("0.0"));
            //Act Statement(s)
            Number result = NumberUtils.createNumber("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat((Double) result, closeTo(Double.parseDouble("0.0"), 0.00001));
                numberUtils.verify(() -> NumberUtils.createDouble("str1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${createNumberWhenDDoubleValueEquals0_0D}, hash: B5EB4E6A4A4FD4813D59CA3570F25A40
    @Test()
    void createNumberWhenDDoubleValueEquals0_0D() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : false
         * (str.charAt(0) == '+') : false
         * (str.charAt(0) == '-') : true
         * (for-each(hexPrefixes)) : true
         * (str.startsWith(pfx, offset)) : false
         * (pfxLen > 0) : false
         * (!Character.isDigit(lastChar)) : true
         * (lastChar != '.') : true
         * (decPos > -1) : true
         * (expPos > -1) : true
         * (expPos < decPos) : false
         * (expPos > length) : false
         * (firstChar == '-') : false  #  inside getMantissa method
         * (firstChar == '+') : true  #  inside getMantissa method
         * (hasSign) : true  #  inside getMantissa method
         * (requestType) : true
         * (expPos > -1) : true
         * (expPos < length - 1) : true
         * (switch(lastChar) = 'l' or switch(lastChar) = 'L') : true
         * (!(d.isInfinite() || d.doubleValue() == 0.0D && !isZero(mant, dec))) : false
         * (d.isInfinite()) : false
         * (str == null) : false  #  inside isAllZeros method
         * (i >= 0) : true  #  inside isAllZeros method
         * (str.charAt(i) != '0') : true  #  inside isAllZeros method
         * (isAllZeros(mant)) : false  #  inside isZero method
         * (d.doubleValue() == 0.0D) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.createDouble("str1")).thenReturn(Double.parseDouble("0.0"));
            numberUtils.when(() -> NumberUtils.createBigDecimal("string10")).thenReturn(new BigDecimal("0"));
            //Act Statement(s)
            Number result = NumberUtils.createNumber("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(new BigDecimal("0")));
                numberUtils.verify(() -> NumberUtils.createDouble("str1"), atLeast(1));
                numberUtils.verify(() -> NumberUtils.createBigDecimal("string10"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${createNumberWhenStrCharAtIEquals_0_AndIsAllZerosDecAndFFloatValueNotEquals0_0F}, hash: 6EFF350B6062A0E45CC4CAAB2387FF34
    @Test()
    void createNumberWhenStrCharAtIEquals_0_AndIsAllZerosDecAndFFloatValueNotEquals0_0F() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : false
         * (str.charAt(0) == '+') : false
         * (str.charAt(0) == '-') : true
         * (for-each(hexPrefixes)) : true
         * (str.startsWith(pfx, offset)) : false
         * (pfxLen > 0) : false
         * (!Character.isDigit(lastChar)) : true
         * (lastChar != '.') : true
         * (decPos > -1) : true
         * (expPos > -1) : true
         * (expPos < decPos) : false
         * (expPos > length) : false
         * (firstChar == '-') : false  #  inside getMantissa method
         * (firstChar == '+') : true  #  inside getMantissa method
         * (hasSign) : true  #  inside getMantissa method
         * (requestType) : true
         * (expPos > -1) : true
         * (expPos < length - 1) : true
         * (switch(lastChar) = 'l' or switch(lastChar) = 'L') : true
         * (!(f.isInfinite() || f.floatValue() == 0.0F && !isZero(mant, dec))) : false
         * (f.isInfinite()) : false
         * (str == null) : true  #  inside isAllZeros method
         * (isAllZeros(mant)) : true  #  inside isZero method
         * (i >= 0) : true  #  inside isAllZeros method
         * (str.charAt(i) != '0') : false  #  inside isAllZeros method
         * (isAllZeros(dec)) : true  #  inside isZero method
         * (f.floatValue() == 0.0F) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.createFloat("str1")).thenReturn(Float.parseFloat("0.0"));
            //Act Statement(s)
            Number result = NumberUtils.createNumber("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Float.parseFloat("0.0")));
                numberUtils.verify(() -> NumberUtils.createFloat("str1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${createNumberWhenFFloatValueEquals0_0FAndDIsInfiniteNotOrDDoubleValueEquals0_0DAndIsZeroNotMantDec}, hash: 3F9A5A6051C87327D2708C5602394D7E
    @Test()
    void createNumberWhenFFloatValueEquals0_0FAndDIsInfiniteNotOrDDoubleValueEquals0_0DAndIsZeroNotMantDec() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : false
         * (str.charAt(0) == '+') : false
         * (str.charAt(0) == '-') : true
         * (for-each(hexPrefixes)) : true
         * (str.startsWith(pfx, offset)) : false
         * (pfxLen > 0) : false
         * (!Character.isDigit(lastChar)) : true
         * (lastChar != '.') : true
         * (decPos > -1) : true
         * (expPos > -1) : true
         * (expPos < decPos) : false
         * (expPos > length) : false
         * (firstChar == '-') : false  #  inside getMantissa method
         * (firstChar == '+') : true  #  inside getMantissa method
         * (hasSign) : true  #  inside getMantissa method
         * (requestType) : true
         * (expPos > -1) : true
         * (expPos < length - 1) : true
         * (switch(lastChar) = 'l' or switch(lastChar) = 'L') : true
         * (!(f.isInfinite() || f.floatValue() == 0.0F && !isZero(mant, dec))) : false
         * (f.isInfinite()) : false
         * (str == null) : false  #  inside isAllZeros method
         * (i >= 0) : true  #  inside isAllZeros method
         * (str.charAt(i) != '0') : true  #  inside isAllZeros method
         * (isAllZeros(mant)) : false  #  inside isZero method
         * (f.floatValue() == 0.0F) : true
         * (!(d.isInfinite() || d.doubleValue() == 0.0D && !isZero(mant, dec))) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.createFloat("str1")).thenReturn(Float.parseFloat("0.0"));
            numberUtils.when(() -> NumberUtils.createDouble("str1")).thenReturn(Double.parseDouble("0.0"));
            numberUtils.when(() -> NumberUtils.createBigDecimal("string10")).thenReturn(new BigDecimal("0"));
            //Act Statement(s)
            Number result = NumberUtils.createNumber("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(new BigDecimal("0")));
                numberUtils.verify(() -> NumberUtils.createFloat("str1"), atLeast(1));
                numberUtils.verify(() -> NumberUtils.createDouble("str1"), atLeast(1));
                numberUtils.verify(() -> NumberUtils.createBigDecimal("string10"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${createNumberWhenStrCharAtIEquals_0_AndIsAllZerosMantAndIsAllZerosDecAndFFloatValueNotEquals0_0F}, hash: 77AB4FB6C919024FDE2828B88152830E
    @Test()
    void createNumberWhenStrCharAtIEquals_0_AndIsAllZerosMantAndIsAllZerosDecAndFFloatValueNotEquals0_0F() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : false
         * (str.charAt(0) == '+') : false
         * (str.charAt(0) == '-') : true
         * (for-each(hexPrefixes)) : true
         * (str.startsWith(pfx, offset)) : false
         * (pfxLen > 0) : false
         * (!Character.isDigit(lastChar)) : true
         * (lastChar != '.') : true
         * (decPos > -1) : true
         * (expPos > -1) : true
         * (expPos < decPos) : false
         * (expPos > length) : false
         * (firstChar == '-') : false  #  inside getMantissa method
         * (firstChar == '+') : true  #  inside getMantissa method
         * (hasSign) : true  #  inside getMantissa method
         * (requestType) : true
         * (expPos > -1) : true
         * (expPos < length - 1) : true
         * (switch(lastChar) = 'l' or switch(lastChar) = 'L') : true
         * (!(f.isInfinite() || f.floatValue() == 0.0F && !isZero(mant, dec))) : false
         * (f.isInfinite()) : false
         * (str == null) : false  #  inside isAllZeros method
         * (i >= 0) : true  #  inside isAllZeros method
         * (str.charAt(i) != '0') : false  #  inside isAllZeros method
         * (isAllZeros(mant)) : true  #  inside isZero method
         * (isAllZeros(dec)) : true  #  inside isZero method
         * (f.floatValue() == 0.0F) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.createFloat("str1")).thenReturn(Float.parseFloat("0.0"));
            //Act Statement(s)
            Number result = NumberUtils.createNumber("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Float.parseFloat("0.0")));
                numberUtils.verify(() -> NumberUtils.createFloat("str1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${createNumberWhenIsAllZerosNotDecAndDDoubleValueEquals0_0D}, hash: C52BB3BCAF098B74ACC1C8BC9617F3F8
    @Test()
    void createNumberWhenIsAllZerosNotDecAndDDoubleValueEquals0_0D() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : false
         * (str.charAt(0) == '+') : false
         * (str.charAt(0) == '-') : true
         * (for-each(hexPrefixes)) : true
         * (str.startsWith(pfx, offset)) : false
         * (pfxLen > 0) : false
         * (!Character.isDigit(lastChar)) : true
         * (lastChar != '.') : true
         * (decPos > -1) : true
         * (expPos > -1) : true
         * (expPos < decPos) : false
         * (expPos > length) : false
         * (firstChar == '-') : false  #  inside getMantissa method
         * (firstChar == '+') : true  #  inside getMantissa method
         * (hasSign) : true  #  inside getMantissa method
         * (requestType) : true
         * (expPos > -1) : true
         * (expPos < length - 1) : true
         * (switch(lastChar) = 'l' or switch(lastChar) = 'L') : true
         * (!(d.isInfinite() || d.doubleValue() == 0.0D && !isZero(mant, dec))) : false
         * (d.isInfinite()) : false
         * (str == null) : true  #  inside isAllZeros method
         * (isAllZeros(mant)) : true  #  inside isZero method
         * (i >= 0) : true  #  inside isAllZeros method
         * (str.charAt(i) != '0') : true  #  inside isAllZeros method
         * (isAllZeros(dec)) : false  #  inside isZero method
         * (d.doubleValue() == 0.0D) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.createDouble("str1")).thenReturn(Double.parseDouble("0.0"));
            numberUtils.when(() -> NumberUtils.createBigDecimal("string10")).thenReturn(new BigDecimal("0"));
            //Act Statement(s)
            Number result = NumberUtils.createNumber("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(new BigDecimal("0")));
                numberUtils.verify(() -> NumberUtils.createDouble("str1"), atLeast(1));
                numberUtils.verify(() -> NumberUtils.createBigDecimal("string10"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${createNumberWhenStrCharAtIEquals_0_AndIsAllZerosDecAndDDoubleValueNotEquals0_0D}, hash: BA51281EC4C2AA04C14CE5B8A1C9045F
    @Test()
    void createNumberWhenStrCharAtIEquals_0_AndIsAllZerosDecAndDDoubleValueNotEquals0_0D() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : false
         * (str.charAt(0) == '+') : false
         * (str.charAt(0) == '-') : true
         * (for-each(hexPrefixes)) : true
         * (str.startsWith(pfx, offset)) : false
         * (pfxLen > 0) : false
         * (!Character.isDigit(lastChar)) : true
         * (lastChar != '.') : true
         * (decPos > -1) : true
         * (expPos > -1) : true
         * (expPos < decPos) : false
         * (expPos > length) : false
         * (firstChar == '-') : false  #  inside getMantissa method
         * (firstChar == '+') : true  #  inside getMantissa method
         * (hasSign) : true  #  inside getMantissa method
         * (requestType) : true
         * (expPos > -1) : true
         * (expPos < length - 1) : true
         * (switch(lastChar) = 'l' or switch(lastChar) = 'L') : true
         * (!(d.isInfinite() || d.doubleValue() == 0.0D && !isZero(mant, dec))) : false
         * (d.isInfinite()) : false
         * (str == null) : true  #  inside isAllZeros method
         * (isAllZeros(mant)) : true  #  inside isZero method
         * (i >= 0) : true  #  inside isAllZeros method
         * (str.charAt(i) != '0') : false  #  inside isAllZeros method
         * (isAllZeros(dec)) : true  #  inside isZero method
         * (d.doubleValue() == 0.0D) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.createDouble("str1")).thenReturn(Double.parseDouble("0.0"));
            //Act Statement(s)
            Number result = NumberUtils.createNumber("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat((Double) result, closeTo(Double.parseDouble("0.0"), 0.00001));
                numberUtils.verify(() -> NumberUtils.createDouble("str1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${createNumberWhenStrCharAtIEquals_0_AndIsAllZerosMantAndIsAllZerosDecAndDDoubleValueNotEquals0_0D}, hash: DC75B7C1F08BCAFE4EE0469F868E588F
    @Test()
    void createNumberWhenStrCharAtIEquals_0_AndIsAllZerosMantAndIsAllZerosDecAndDDoubleValueNotEquals0_0D() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : false
         * (str.charAt(0) == '+') : false
         * (str.charAt(0) == '-') : true
         * (for-each(hexPrefixes)) : true
         * (str.startsWith(pfx, offset)) : false
         * (pfxLen > 0) : false
         * (!Character.isDigit(lastChar)) : true
         * (lastChar != '.') : true
         * (decPos > -1) : true
         * (expPos > -1) : true
         * (expPos < decPos) : false
         * (expPos > length) : false
         * (firstChar == '-') : false  #  inside getMantissa method
         * (firstChar == '+') : true  #  inside getMantissa method
         * (hasSign) : true  #  inside getMantissa method
         * (requestType) : true
         * (expPos > -1) : true
         * (expPos < length - 1) : true
         * (switch(lastChar) = 'l' or switch(lastChar) = 'L') : true
         * (!(d.isInfinite() || d.doubleValue() == 0.0D && !isZero(mant, dec))) : false
         * (d.isInfinite()) : false
         * (str == null) : false  #  inside isAllZeros method
         * (i >= 0) : true  #  inside isAllZeros method
         * (str.charAt(i) != '0') : false  #  inside isAllZeros method
         * (isAllZeros(mant)) : true  #  inside isZero method
         * (isAllZeros(dec)) : true  #  inside isZero method
         * (d.doubleValue() == 0.0D) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.createDouble("str1")).thenReturn(Double.parseDouble("0.0"));
            //Act Statement(s)
            Number result = NumberUtils.createNumber("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat((Double) result, closeTo(Double.parseDouble("0.0"), 0.00001));
                numberUtils.verify(() -> NumberUtils.createDouble("str1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${createNumberWhenDNotIsInfiniteAndDDoubleValueNotEquals0_0D}, hash: 5797518420F009C1C9D4185B6B8CA9CE
    @Test()
    void createNumberWhenDNotIsInfiniteAndDDoubleValueNotEquals0_0D() {
        /* Branches:
         * (str == null) : false
         * (StringUtils.isBlank(str)) : false
         * (str.charAt(0) == '+') : false
         * (str.charAt(0) == '-') : true
         * (for-each(hexPrefixes)) : true
         * (str.startsWith(pfx, offset)) : false
         * (pfxLen > 0) : false
         * (!Character.isDigit(lastChar)) : true
         * (lastChar != '.') : true
         * (decPos > -1) : true
         * (expPos > -1) : true
         * (expPos < decPos) : false
         * (expPos > length) : false
         * (firstChar == '-') : false  #  inside getMantissa method
         * (firstChar == '+') : true  #  inside getMantissa method
         * (hasSign) : true  #  inside getMantissa method
         * (requestType) : true
         * (expPos > -1) : true
         * (expPos < length - 1) : true
         * (switch(lastChar) = 'l' or switch(lastChar) = 'L') : true
         * (!(f.isInfinite() || f.floatValue() == 0.0F && !isZero(mant, dec))) : false
         * (f.isInfinite()) : false
         * (str == null) : true  #  inside isAllZeros method
         * (isAllZeros(mant)) : true  #  inside isZero method
         * (i >= 0) : true  #  inside isAllZeros method
         * (str.charAt(i) != '0') : true  #  inside isAllZeros method
         * (isAllZeros(dec)) : false  #  inside isZero method
         * (f.floatValue() == 0.0F) : true
         * (!(d.isInfinite() || d.doubleValue() == 0.0D && !isZero(mant, dec))) : false
         * (d.isInfinite()) : false
         * (d.doubleValue() == 0.0D) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.createFloat("str1")).thenReturn(Float.parseFloat("0.0"));
            numberUtils.when(() -> NumberUtils.createDouble("str1")).thenReturn(Double.parseDouble("0.0"));
            //Act Statement(s)
            Number result = NumberUtils.createNumber("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat((Double) result, closeTo(Double.parseDouble("0.0"), 0.00001));
                numberUtils.verify(() -> NumberUtils.createFloat("str1"), atLeast(1));
                numberUtils.verify(() -> NumberUtils.createDouble("str1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isCreatableWhenStringUtilsIsEmptyStr}, hash: EA362320AE3CEDF6C6A2A29722F2848A
    @Test()
    void isCreatableWhenStringUtilsIsEmptyStr() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = NumberUtils.isCreatable("str1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isCreatableWhenIIndexOfCharsNotGreaterThan_f_}, hash: B1CFE488EBBA98946135AA103E996C01
    @Test()
    void isCreatableWhenIIndexOfCharsNotGreaterThan_f_() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (chars[0] == '-') : false
         * (chars[0] == '+') : true
         * (sz > start + 1) : true
         * (chars[start] == '0') : true
         * (!StringUtils.contains(str, '.')) : true
         * (chars[start + 1] == 'x') : false
         * (chars[start + 1] == 'X') : true
         * (i == sz) : false
         * (i < chars.length) : true
         * (chars[i] < '0') : false
         * (chars[i] > '9') : true
         * (chars[i] < 'a') : false
         * (chars[i] > 'f') : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = NumberUtils.isCreatable("str1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isCreatableWhenNotHasExp}, hash: BE82B22BEAF39C00963EF6FBFC1F473F
    @Test()
    void isCreatableWhenNotHasExp() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (chars[0] == '-') : false
         * (chars[0] == '+') : true
         * (sz > start + 1) : true
         * (chars[start] == '0') : true
         * (!StringUtils.contains(str, '.')) : true
         * (chars[start + 1] == 'x') : false
         * (chars[start + 1] == 'X') : false
         * (Character.isDigit(chars[start + 1])) : false
         * (i < sz) : false
         * (i < sz + 1) : true
         * (allowSigns) : false
         * (i < chars.length) : true
         * (chars[i] >= '0') : true
         * (chars[i] <= '9') : false
         * (chars[i] == 'e') : false
         * (chars[i] == 'E') : false
         * (chars[i] == '.') : true
         * (hasDecPoint) : false
         * (hasExp) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = NumberUtils.isCreatable("str1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isDigitsWhenStringUtilsIsNumericStr}, hash: 7C3564309089880DB465360B67AD6AC7
    @Test()
    void isDigitsWhenStringUtilsIsNumericStr() {
        /* Branches:
         * (StringUtils.isNumeric(str)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = NumberUtils.isDigits("str1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isDigitsWhenStringUtilsNotIsNumericStr}, hash: 4FB4C9209840A5280AFEB425FFCF47C5
    @Test()
    void isDigitsWhenStringUtilsNotIsNumericStr() {
        /* Branches:
         * (StringUtils.isNumeric(str)) : false
         */
         
        //Act Statement(s)
        boolean result = NumberUtils.isDigits("A");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isNumberWhenIsCreatableStr}, hash: 5743AA65B380529A9CD0FCB5A96488A9
    @Test()
    void isNumberWhenIsCreatableStr() {
        /* Branches:
         * (isCreatable(str)) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.isCreatable("str1")).thenReturn(true);
            //Act Statement(s)
            boolean result = NumberUtils.isNumber("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                numberUtils.verify(() -> NumberUtils.isCreatable("str1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isNumberWhenIsCreatableNotStr}, hash: 280461E4E9511C9119322F34FEF33E94
    @Test()
    void isNumberWhenIsCreatableNotStr() {
        /* Branches:
         * (isCreatable(str)) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.isCreatable("str1")).thenReturn(false);
            //Act Statement(s)
            boolean result = NumberUtils.isNumber("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                numberUtils.verify(() -> NumberUtils.isCreatable("str1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isParsableWhenStringUtilsIsEmptyStr}, hash: 58A650F681921B7E2FEA4987CAB24F13
    @Test()
    void isParsableWhenStringUtilsIsEmptyStr() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = NumberUtils.isParsable("str1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isParsableWhenStrCharAtStrLengthMinus1Equals___}, hash: C79838677A9C1456A0B1EB8C56ECC741
    @Test()
    void isParsableWhenStrCharAtStrLengthMinus1Equals___() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (str.charAt(str.length() - 1) == '.') : true
         */
         
        //Act Statement(s)
        boolean result = NumberUtils.isParsable(".");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isParsableWhenStrLengthEquals1}, hash: 19F7B9F2F77AACAB9646E178092AD848
    @Test()
    void isParsableWhenStrLengthEquals1() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (str.charAt(str.length() - 1) == '.') : false
         * (str.charAt(0) == '-') : true
         * (str.length() == 1) : true
         */
         
        //Act Statement(s)
        boolean result = NumberUtils.isParsable("-");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isParsableWhenIsDecimalPoint}, hash: EC1671BF8ECE97A9D2D90C4EE0C8C2B1
    @Test()
    void isParsableWhenIsDecimalPoint() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (str.charAt(str.length() - 1) == '.') : false
         * (str.charAt(0) == '-') : false
         * (i < str.length()) : true  #  inside withDecimalsParsing method
         * (str.charAt(i) == '.') : true  #  inside withDecimalsParsing method
         * (isDecimalPoint) : true  #  inside withDecimalsParsing method
         * (decimalPoints > 1) : false  #  inside withDecimalsParsing method
         * (!isDecimalPoint) : false  #  inside withDecimalsParsing method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = NumberUtils.isParsable(".A");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isParsableWhenDecimalPointsNotGreaterThan1AndIsDecimalPoint}, hash: 9B08FF414B29293D93F17A5D7746AE44
    @Test()
    void isParsableWhenDecimalPointsNotGreaterThan1AndIsDecimalPoint() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (str.charAt(str.length() - 1) == '.') : false
         * (str.charAt(0) == '-') : true
         * (str.length() == 1) : false
         * (i < str.length()) : true  #  inside withDecimalsParsing method
         * (str.charAt(i) == '.') : true  #  inside withDecimalsParsing method
         * (isDecimalPoint) : true  #  inside withDecimalsParsing method
         * (decimalPoints > 1) : false  #  inside withDecimalsParsing method
         * (!isDecimalPoint) : false  #  inside withDecimalsParsing method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = NumberUtils.isParsable("-.A");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isParsableWhenCharacterNotIsDigitStrCharAtI}, hash: 7B51A3BAFD72B3091C035DA8B362938B
    @Test()
    void isParsableWhenCharacterNotIsDigitStrCharAtI() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (str.charAt(str.length() - 1) == '.') : false
         * (str.charAt(0) == '-') : false
         * (i < str.length()) : true  #  inside withDecimalsParsing method
         * (str.charAt(i) == '.') : false  #  inside withDecimalsParsing method
         * (isDecimalPoint) : false  #  inside withDecimalsParsing method
         * (decimalPoints > 1) : false  #  inside withDecimalsParsing method
         * (!isDecimalPoint) : true  #  inside withDecimalsParsing method
         * (!Character.isDigit(str.charAt(i))) : true  #  inside withDecimalsParsing method
         */
         
        //Act Statement(s)
        boolean result = NumberUtils.isParsable("A");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isParsableWhenCharacterIsDigitStrCharAtI}, hash: 5AC2546B4229050025B7487612468F74
    @Test()
    void isParsableWhenCharacterIsDigitStrCharAtI() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (str.charAt(str.length() - 1) == '.') : false
         * (str.charAt(0) == '-') : false
         * (i < str.length()) : true  #  inside withDecimalsParsing method
         * (str.charAt(i) == '.') : false  #  inside withDecimalsParsing method
         * (isDecimalPoint) : false  #  inside withDecimalsParsing method
         * (decimalPoints > 1) : false  #  inside withDecimalsParsing method
         * (!isDecimalPoint) : true  #  inside withDecimalsParsing method
         * (!Character.isDigit(str.charAt(i))) : false  #  inside withDecimalsParsing method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = NumberUtils.isParsable("str1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isParsableWhenNotIsDecimalPointAndCharacterNotIsDigitStrCharAtI}, hash: 2248DA5ACEB7D4A7BF45E371FFA37370
    @Test()
    void isParsableWhenNotIsDecimalPointAndCharacterNotIsDigitStrCharAtI() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (str.charAt(str.length() - 1) == '.') : false
         * (str.charAt(0) == '-') : true
         * (str.length() == 1) : false
         * (i < str.length()) : true  #  inside withDecimalsParsing method
         * (str.charAt(i) == '.') : false  #  inside withDecimalsParsing method
         * (isDecimalPoint) : false  #  inside withDecimalsParsing method
         * (decimalPoints > 1) : false  #  inside withDecimalsParsing method
         * (!isDecimalPoint) : true  #  inside withDecimalsParsing method
         * (!Character.isDigit(str.charAt(i))) : true  #  inside withDecimalsParsing method
         */
         
        //Act Statement(s)
        boolean result = NumberUtils.isParsable("-A");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isParsableWhenNotIsDecimalPointAndCharacterIsDigitStrCharAtI}, hash: 0F54FB2CA033C7D7A4926257AF840A64
    @Test()
    void isParsableWhenNotIsDecimalPointAndCharacterIsDigitStrCharAtI() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (str.charAt(str.length() - 1) == '.') : false
         * (str.charAt(0) == '-') : true
         * (str.length() == 1) : false
         * (i < str.length()) : true  #  inside withDecimalsParsing method
         * (str.charAt(i) == '.') : false  #  inside withDecimalsParsing method
         * (isDecimalPoint) : false  #  inside withDecimalsParsing method
         * (decimalPoints > 1) : false  #  inside withDecimalsParsing method
         * (!isDecimalPoint) : true  #  inside withDecimalsParsing method
         * (!Character.isDigit(str.charAt(i))) : false  #  inside withDecimalsParsing method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = NumberUtils.isParsable("str1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${maxWhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException}, hash: B767F30092F0E850FDF1C451AC8D1C52
    @Test()
    void maxWhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (Array.getLength(array) != 0) : true  #  inside validateArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            NumberUtils.max(byteArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${max1WhenCGreaterThanA}, hash: E0AF6886D9F2A56A7ABD1427AEB388F5
    @Test()
    void max1WhenCGreaterThanA() {
        /* Branches:
         * (b > a) : true
         * (c > a) : true
         */
         
        //Act Statement(s)
        byte result = NumberUtils.max((byte) 1, (byte) 2, (byte) 3);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((byte) 3)));
    }

    //Sapient generated method id: ${max2WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException}, hash: A959D3D54ED06602EFEB870FE0AE0FC3
    @Test()
    void max2WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (Array.getLength(array) != 0) : true  #  inside validateArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        double[] doubleArray = new double[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            NumberUtils.max(doubleArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${max3Test}, hash: 132FCC7C8AC55D6C50372A07DD783185
    @Test()
    void max3Test() {
        
        //Act Statement(s)
        double result = NumberUtils.max(Double.parseDouble("7719.0"), Double.parseDouble("7718.0"), Double.parseDouble("7718.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("7719.0"), 0.00001)));
    }

    //Sapient generated method id: ${max4WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException}, hash: 36F09374550872CB88E96E87B027F0AD
    @Test()
    void max4WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (Array.getLength(array) != 0) : true  #  inside validateArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        float[] floatArray = new float[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            NumberUtils.max(floatArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${max5Test}, hash: 73EFAAF70324273E993BE72EF767577A
    @Test()
    void max5Test() {
        
        //Act Statement(s)
        float result = NumberUtils.max(Float.parseFloat("7719.0"), Float.parseFloat("7718.0"), Float.parseFloat("7718.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("7719.0"))));
    }

    //Sapient generated method id: ${max6WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException}, hash: 495F6A38EC8F11F002D0DDEB1153E7A0
    @Test()
    void max6WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (Array.getLength(array) != 0) : true  #  inside validateArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        int[] intArray = new int[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            NumberUtils.max(intArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${max7WhenCGreaterThanA}, hash: C5AE562AEA668A941C6CA4E0D36C314E
    @Test()
    void max7WhenCGreaterThanA() {
        /* Branches:
         * (b > a) : true
         * (c > a) : true
         */
         
        //Act Statement(s)
        int result = NumberUtils.max(1, 2, 3);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(3)));
    }

    //Sapient generated method id: ${max8WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException}, hash: 7DF53A17D48BE5DCE94861940A57B9CE
    @Test()
    void max8WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (Array.getLength(array) != 0) : true  #  inside validateArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        long[] longArray = new long[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            NumberUtils.max(longArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${max9WhenCGreaterThanA}, hash: 515A7520084CD3F4E4825018A343EB20
    @Test()
    void max9WhenCGreaterThanA() {
        /* Branches:
         * (b > a) : true
         * (c > a) : true
         */
         
        //Act Statement(s)
        long result = NumberUtils.max(1L, 2L, 3L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(3L)));
    }

    //Sapient generated method id: ${max10WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException}, hash: 0B64EA0A74A512AF56DE008678DA26D6
    @Test()
    void max10WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (Array.getLength(array) != 0) : true  #  inside validateArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        short[] shortArray = new short[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            NumberUtils.max(shortArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${max11WhenCGreaterThanA}, hash: 7EF792E11A6B68054CDAB7FDB25BF7CD
    @Test()
    void max11WhenCGreaterThanA() {
        /* Branches:
         * (b > a) : true
         * (c > a) : true
         */
         
        //Act Statement(s)
        short result = NumberUtils.max((short) 1, (short) 2, (short) 3);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 3)));
    }

    //Sapient generated method id: ${minWhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException}, hash: 8CCA21DE1F9E2E8C9DDFCDE884BA06D5
    @Test()
    void minWhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (Array.getLength(array) != 0) : true  #  inside validateArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            NumberUtils.min(byteArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${min1WhenCLessThanA}, hash: B3D929E7440018D91E85E834D6D7D4A8
    @Test()
    void min1WhenCLessThanA() {
        /* Branches:
         * (b < a) : true
         * (c < a) : true
         */
         
        //Act Statement(s)
        byte result = NumberUtils.min((byte) 3, (byte) 2, (byte) 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((byte) 1)));
    }

    //Sapient generated method id: ${min2WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException}, hash: F6E325A571A1A00A9A2FEDFB0EABE3DE
    @Test()
    void min2WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (Array.getLength(array) != 0) : true  #  inside validateArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        double[] doubleArray = new double[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            NumberUtils.min(doubleArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${min3Test}, hash: D65BD66C14D497DA72015570EBDB747D
    @Test()
    void min3Test() {
        
        //Act Statement(s)
        double result = NumberUtils.min(Double.parseDouble("7719.0"), Double.parseDouble("7720.0"), Double.parseDouble("7720.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("7719.0"), 0.00001)));
    }

    //Sapient generated method id: ${min4WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException}, hash: 0198B28AC559D9761A73759D21FAED5B
    @Test()
    void min4WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (Array.getLength(array) != 0) : true  #  inside validateArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        float[] floatArray = new float[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            NumberUtils.min(floatArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${min5Test}, hash: 6C5AC278CE250B70721BEE374C119FC0
    @Test()
    void min5Test() {
        
        //Act Statement(s)
        float result = NumberUtils.min(Float.parseFloat("7719.0"), Float.parseFloat("7720.0"), Float.parseFloat("7720.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("7719.0"))));
    }

    //Sapient generated method id: ${min6WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException}, hash: E9000DDF5B6355BE9347B5EED5CBFB72
    @Test()
    void min6WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (Array.getLength(array) != 0) : true  #  inside validateArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        int[] intArray = new int[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            NumberUtils.min(intArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${min7WhenCLessThanA}, hash: E647769EC216AE1011AD81B7D43C16D6
    @Test()
    void min7WhenCLessThanA() {
        /* Branches:
         * (b < a) : true
         * (c < a) : true
         */
         
        //Act Statement(s)
        int result = NumberUtils.min(3, 2, 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${min8WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException}, hash: 8ABCD02D8215E29B6871113E18B8A13C
    @Test()
    void min8WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (Array.getLength(array) != 0) : true  #  inside validateArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        long[] longArray = new long[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            NumberUtils.min(longArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${min9WhenCLessThanA}, hash: F1A466003BC2C3A40F3936CB5153E186
    @Test()
    void min9WhenCLessThanA() {
        /* Branches:
         * (b < a) : true
         * (c < a) : true
         */
         
        //Act Statement(s)
        long result = NumberUtils.min(3L, 2L, 1L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1L)));
    }

    //Sapient generated method id: ${min10WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException}, hash: 09905D43E5F177E507B41C5851ABF444
    @Test()
    void min10WhenArrayGetLengthArrayNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * (Array.getLength(array) != 0) : true  #  inside validateArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        short[] shortArray = new short[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            NumberUtils.min(shortArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${min11WhenCLessThanA}, hash: BD27704787AF05023D6C6AFA58028B92
    @Test()
    void min11WhenCLessThanA() {
        /* Branches:
         * (b < a) : true
         * (c < a) : true
         */
         
        //Act Statement(s)
        short result = NumberUtils.min((short) 3, (short) 2, (short) 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 1)));
    }

    //Sapient generated method id: ${toByteTest}, hash: D1E6F56EB78360C356E863DE4D0A5AB0
    @Test()
    void toByteTest() {
        //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.toByte("str1", (byte) 0)).thenReturn((byte) 0);
            //Act Statement(s)
            byte result = NumberUtils.toByte("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo((byte) 0));
                numberUtils.verify(() -> NumberUtils.toByte("str1", (byte) 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toByte1WhenStrIsNull}, hash: 6DE9AD65827343EEFDBB2C6F28A37B53
    @Test()
    void toByte1WhenStrIsNull() {
        /* Branches:
         * (str == null) : true
         */
         
        //Act Statement(s)
        byte result = NumberUtils.toByte((String) null, (byte) 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((byte) 0)));
    }

    //Sapient generated method id: ${toByte1WhenStrIsNotNull}, hash: 07C47F112CB1C18FDB62AF44C8643E6C
    @Test()
    void toByte1WhenStrIsNotNull() {
        /* Branches:
         * (str == null) : false
         */
         
        //Act Statement(s)
        byte result = NumberUtils.toByte("0", (byte) 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((byte) 0)));
    }

    //Sapient generated method id: ${toByte1WhenCaughtNumberFormatException}, hash: 956B77355DE31A3BF5FB7855F0520DBD
    @Test()
    void toByte1WhenCaughtNumberFormatException() {
        /* Branches:
         * (str == null) : false
         * (catch-exception (NumberFormatException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        byte result = NumberUtils.toByte("0", (byte) 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((byte) 0)));
    }

    //Sapient generated method id: ${toDoubleTest}, hash: 65D14DF9598C49F9E7884E634D8A687C
    @Test()
    void toDoubleTest() {
        //Arrange Statement(s)
        /*try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
    numberUtils.when(() -> NumberUtils.toDouble(any(), eq(Double.parseDouble("0.0")))).thenReturn(Double.parseDouble("0.0"));
    //Act Statement(s)
    double result = NumberUtils.toDouble(new BigDecimal("0"));
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001));
        numberUtils.verify(() -> NumberUtils.toDouble(any(), eq(Double.parseDouble("0.0"))), atLeast(1));
    });
}*/
    }

    //Sapient generated method id: ${toDouble1WhenValueIsNull}, hash: EB63DC835C2BDC5EE2DFC70AE0F36FCB
    @Test()
    void toDouble1WhenValueIsNull() {
        /* Branches:
         * (value == null) : true
         */
         
        //Act Statement(s)
        double result = NumberUtils.toDouble((BigDecimal) null, Double.parseDouble("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${toDouble1WhenValueIsNotNull}, hash: F5E812F4CCECEBB621B0E71D4B1693E6
    @Test()
    void toDouble1WhenValueIsNotNull() {
        /* Branches:
         * (value == null) : false
         */
         
        //Act Statement(s)
        double result = NumberUtils.toDouble(new BigDecimal("0.0"), Double.parseDouble("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${toDouble2Test}, hash: BF3B5D0F7D9DA1F7DAA7EA7F4372738A
    @Test()
    void toDouble2Test() {
        //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.toDouble("str1", Double.parseDouble("0.0"))).thenReturn(Double.parseDouble("0.0"));
            //Act Statement(s)
            double result = NumberUtils.toDouble("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001));
                numberUtils.verify(() -> NumberUtils.toDouble("str1", Double.parseDouble("0.0")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toDouble3WhenStrIsNull}, hash: D4E08FF74F6E6E7FB0674C61289AF12A
    @Test()
    void toDouble3WhenStrIsNull() {
        /* Branches:
         * (str == null) : true
         */
         
        //Act Statement(s)
        double result = NumberUtils.toDouble((String) null, Double.parseDouble("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${toDouble3WhenStrIsNotNull}, hash: 828F228603B9337C859B79DE62E91D32
    @Test()
    void toDouble3WhenStrIsNotNull() {
        /* Branches:
         * (str == null) : false
         */
         
        //Act Statement(s)
        double result = NumberUtils.toDouble("1.0", Double.parseDouble("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("1.0"), 0.00001)));
    }

    //Sapient generated method id: ${toDouble3WhenCaughtNumberFormatException}, hash: D8679277BC5525C076F5EEC232E398F5
    @Test()
    void toDouble3WhenCaughtNumberFormatException() {
        /* Branches:
         * (str == null) : false
         * (catch-exception (NumberFormatException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        double result = NumberUtils.toDouble("1.0", Double.parseDouble("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${toFloatTest}, hash: 904AE285A94F9F1E485ACE2ED9A683D5
    @Test()
    void toFloatTest() {
        //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.toFloat("str1", Float.parseFloat("0.0"))).thenReturn(Float.parseFloat("0.0"));
            //Act Statement(s)
            float result = NumberUtils.toFloat("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Float.parseFloat("0.0")));
                numberUtils.verify(() -> NumberUtils.toFloat("str1", Float.parseFloat("0.0")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toFloat1WhenStrIsNull}, hash: 6420D5CEAA865927F8083C8755F179FB
    @Test()
    void toFloat1WhenStrIsNull() {
        /* Branches:
         * (str == null) : true
         */
         
        //Act Statement(s)
        float result = NumberUtils.toFloat((String) null, Float.parseFloat("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("0.0"))));
    }

    //Sapient generated method id: ${toFloat1WhenStrIsNotNull}, hash: 3FA11F546FC8EC491EAC44C52C51613C
    @Test()
    void toFloat1WhenStrIsNotNull() {
        /* Branches:
         * (str == null) : false
         */
         
        //Act Statement(s)
        float result = NumberUtils.toFloat("1.0", Float.parseFloat("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("1.0"))));
    }

    //Sapient generated method id: ${toFloat1WhenCaughtNumberFormatException}, hash: 1F66D910569FEF1FC9539BDAE852C708
    @Test()
    void toFloat1WhenCaughtNumberFormatException() {
        /* Branches:
         * (str == null) : false
         * (catch-exception (NumberFormatException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        float result = NumberUtils.toFloat("1.0", Float.parseFloat("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("0.0"))));
    }

    //Sapient generated method id: ${toIntTest}, hash: EC93EF33CFA12EC55C9EEE6A80AECD63
    @Test()
    void toIntTest() {
        //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.toInt("str1", 0)).thenReturn(0);
            //Act Statement(s)
            int result = NumberUtils.toInt("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                numberUtils.verify(() -> NumberUtils.toInt("str1", 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toInt1WhenStrIsNull}, hash: 375C1AC94E0011C254DED468016D86D6
    @Test()
    void toInt1WhenStrIsNull() {
        /* Branches:
         * (str == null) : true
         */
         
        //Act Statement(s)
        int result = NumberUtils.toInt((String) null, 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${toInt1WhenStrIsNotNull}, hash: D0E103B56EBAF63E64FA2871C351E6BB
    @Test()
    void toInt1WhenStrIsNotNull() {
        /* Branches:
         * (str == null) : false
         */
         
        //Act Statement(s)
        int result = NumberUtils.toInt("0", 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${toInt1WhenCaughtNumberFormatException}, hash: 39CDA72B206D2CF03C85901719D7B8FA
    @Test()
    void toInt1WhenCaughtNumberFormatException() {
        /* Branches:
         * (str == null) : false
         * (catch-exception (NumberFormatException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        int result = NumberUtils.toInt("0", 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${toLongTest}, hash: C2584CA606DD16784B33339536D92096
    @Test()
    void toLongTest() {
        //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.toLong("str1", 0L)).thenReturn(0L);
            //Act Statement(s)
            long result = NumberUtils.toLong("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0L));
                numberUtils.verify(() -> NumberUtils.toLong("str1", 0L), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toLong1WhenStrIsNull}, hash: 5450EAAC726683D6C5D88D7E5AE7AFF9
    @Test()
    void toLong1WhenStrIsNull() {
        /* Branches:
         * (str == null) : true
         */
         
        //Act Statement(s)
        long result = NumberUtils.toLong((String) null, 0L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }

    //Sapient generated method id: ${toLong1WhenStrIsNotNull}, hash: FB9DC4ACF1DB202BCC3F456EC41BBD71
    @Test()
    void toLong1WhenStrIsNotNull() {
        /* Branches:
         * (str == null) : false
         */
         
        //Act Statement(s)
        long result = NumberUtils.toLong("0", 0L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }

    //Sapient generated method id: ${toLong1WhenCaughtNumberFormatException}, hash: 265E2EEC516CC36EA4BC01C9475E52E8
    @Test()
    void toLong1WhenCaughtNumberFormatException() {
        /* Branches:
         * (str == null) : false
         * (catch-exception (NumberFormatException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        long result = NumberUtils.toLong("0", 0L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }

    //Sapient generated method id: ${toScaledBigDecimalTest}, hash: ECFC08DADB3AC04843DA812DA516321D
    @Test()
    void toScaledBigDecimalTest() {
        //Arrange Statement(s)
        /*try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
    numberUtils.when(() -> NumberUtils.toScaledBigDecimal(any(), eq(2), eq(RoundingMode.HALF_EVEN))).thenReturn(new BigDecimal("0"));
    //Act Statement(s)
    BigDecimal result = NumberUtils.toScaledBigDecimal(new BigDecimal("0"));
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result.stripTrailingZeros(), equalTo(new BigDecimal("0").stripTrailingZeros()));
        numberUtils.verify(() -> NumberUtils.toScaledBigDecimal(any(), eq(2), eq(RoundingMode.HALF_EVEN)), atLeast(1));
    });
}*/
    }

    //Sapient generated method id: ${toScaledBigDecimal1WhenValueIsNull}, hash: 968046E93A55D08379AC5FF3D8526F60
    @Test()
    void toScaledBigDecimal1WhenValueIsNull() {
        /* Branches:
         * (value == null) : true
         */
         
        //Act Statement(s)
        BigDecimal result = NumberUtils.toScaledBigDecimal((BigDecimal) null, 0, RoundingMode.UP);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.stripTrailingZeros(), equalTo(new BigDecimal("0").stripTrailingZeros())));
    }

    //Sapient generated method id: ${toScaledBigDecimal1WhenRoundingModeIsNull}, hash: 8F77BAF812E01FFA83187D3A897F9460
    @Test()
    void toScaledBigDecimal1WhenRoundingModeIsNull() {
        /* Branches:
         * (value == null) : false
         * (roundingMode == null) : true
         */
         //Arrange Statement(s)
        RoundingMode roundingMode = null;
        
        //Act Statement(s)
        BigDecimal result = NumberUtils.toScaledBigDecimal(new BigDecimal("1.0"), 1, roundingMode);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.stripTrailingZeros(), equalTo(new BigDecimal("1.0").stripTrailingZeros())));
    }

    //Sapient generated method id: ${toScaledBigDecimal1WhenRoundingModeIsNotNull}, hash: 7D985A47FBFD85B8C075C243000DB0F2
    @Test()
    void toScaledBigDecimal1WhenRoundingModeIsNotNull() {
        /* Branches:
         * (value == null) : false
         * (roundingMode == null) : false
         */
         
        //Act Statement(s)
        BigDecimal result = NumberUtils.toScaledBigDecimal(new BigDecimal("1.0"), 1, RoundingMode.HALF_EVEN);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.stripTrailingZeros(), equalTo(new BigDecimal("1.0").stripTrailingZeros())));
    }

    //Sapient generated method id: ${toScaledBigDecimal2Test}, hash: 77A70325402D5A31E16464B1C4DC3EFD
    @Test()
    void toScaledBigDecimal2Test() {
        //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.toScaledBigDecimal(Double.parseDouble("0.0"), 2, RoundingMode.HALF_EVEN)).thenReturn(new BigDecimal("0"));
            //Act Statement(s)
            BigDecimal result = NumberUtils.toScaledBigDecimal(Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.stripTrailingZeros(), equalTo(new BigDecimal("0").stripTrailingZeros()));
                numberUtils.verify(() -> NumberUtils.toScaledBigDecimal(Double.parseDouble("0.0"), 2, RoundingMode.HALF_EVEN), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toScaledBigDecimal3WhenValueIsNull}, hash: 937492D56B230ABA778E2EC9583F1B9D
    @Test()
    void toScaledBigDecimal3WhenValueIsNull() {
        /* Branches:
         * (value == null) : true
         */
         
        //Act Statement(s)
        BigDecimal result = NumberUtils.toScaledBigDecimal((Double) null, 0, RoundingMode.UP);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.stripTrailingZeros(), equalTo(new BigDecimal("0").stripTrailingZeros())));
    }

    //Sapient generated method id: ${toScaledBigDecimal3WhenValueIsNotNull}, hash: E427D9410DC61673789B8C3B966D71CD
    @Test()
    void toScaledBigDecimal3WhenValueIsNotNull() {
        /* Branches:
         * (value == null) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
    numberUtils.when(() -> NumberUtils.toScaledBigDecimal(any(), eq(0), eq(RoundingMode.UP))).thenReturn(new BigDecimal("0"));
    //Act Statement(s)
    BigDecimal result = NumberUtils.toScaledBigDecimal(Double.parseDouble("0.0"), 0, RoundingMode.UP);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result.stripTrailingZeros(), equalTo(new BigDecimal("0").stripTrailingZeros()));
        numberUtils.verify(() -> NumberUtils.toScaledBigDecimal(any(), eq(0), eq(RoundingMode.UP)), atLeast(1));
    });
}*/
    }

    //Sapient generated method id: ${toScaledBigDecimal4Test}, hash: 9273E09C582AB5B3EACE0846A5F25EB7
    @Test()
    void toScaledBigDecimal4Test() {
        //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.toScaledBigDecimal(Float.parseFloat("0.0"), 2, RoundingMode.HALF_EVEN)).thenReturn(new BigDecimal("0"));
            //Act Statement(s)
            BigDecimal result = NumberUtils.toScaledBigDecimal(Float.parseFloat("0.0"));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.stripTrailingZeros(), equalTo(new BigDecimal("0").stripTrailingZeros()));
                numberUtils.verify(() -> NumberUtils.toScaledBigDecimal(Float.parseFloat("0.0"), 2, RoundingMode.HALF_EVEN), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toScaledBigDecimal5WhenValueIsNull}, hash: 9EA4379C57826F1C1EF34E865E315BB7
    @Test()
    void toScaledBigDecimal5WhenValueIsNull() {
        /* Branches:
         * (value == null) : true
         */
         
        //Act Statement(s)
        BigDecimal result = NumberUtils.toScaledBigDecimal((Float) null, 0, RoundingMode.UP);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.stripTrailingZeros(), equalTo(new BigDecimal("0").stripTrailingZeros())));
    }

    //Sapient generated method id: ${toScaledBigDecimal5WhenValueIsNotNull}, hash: FC772FF4F64C96CBA2A73E80C61F2101
    @Test()
    void toScaledBigDecimal5WhenValueIsNotNull() {
        /* Branches:
         * (value == null) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
    numberUtils.when(() -> NumberUtils.toScaledBigDecimal(any(), eq(0), eq(RoundingMode.UP))).thenReturn(new BigDecimal("0"));
    //Act Statement(s)
    BigDecimal result = NumberUtils.toScaledBigDecimal(Float.parseFloat("0.0"), 0, RoundingMode.UP);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result.stripTrailingZeros(), equalTo(new BigDecimal("0").stripTrailingZeros()));
        numberUtils.verify(() -> NumberUtils.toScaledBigDecimal(any(), eq(0), eq(RoundingMode.UP)), atLeast(1));
    });
}*/
    }

    //Sapient generated method id: ${toScaledBigDecimal6Test}, hash: 22E70584BAF286DF782158B2BE5451DD
    @Test()
    void toScaledBigDecimal6Test() {
        //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.toScaledBigDecimal("value1", 2, RoundingMode.HALF_EVEN)).thenReturn(new BigDecimal("0"));
            //Act Statement(s)
            BigDecimal result = NumberUtils.toScaledBigDecimal("value1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.stripTrailingZeros(), equalTo(new BigDecimal("0").stripTrailingZeros()));
                numberUtils.verify(() -> NumberUtils.toScaledBigDecimal("value1", 2, RoundingMode.HALF_EVEN), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toScaledBigDecimal7WhenValueIsNull}, hash: 4AB81E9EB6B47924614CA662AAA5D681
    @Test()
    void toScaledBigDecimal7WhenValueIsNull() {
        /* Branches:
         * (value == null) : true
         */
         
        //Act Statement(s)
        BigDecimal result = NumberUtils.toScaledBigDecimal((String) null, 0, RoundingMode.UP);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.stripTrailingZeros(), equalTo(new BigDecimal("0").stripTrailingZeros())));
    }

    //Sapient generated method id: ${toScaledBigDecimal7WhenValueIsNotNull}, hash: 9144743BE5E372D2226B6A5FAC7B0A76
    @Test()
    void toScaledBigDecimal7WhenValueIsNotNull() {
        /* Branches:
         * (value == null) : false
         */
        //Arrange Statement(s)
        /*try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
    numberUtils.when(() -> NumberUtils.createBigDecimal("value1")).thenReturn(new BigDecimal("0"));
    numberUtils.when(() -> NumberUtils.toScaledBigDecimal(any(), eq(0), eq(RoundingMode.UP))).thenReturn(new BigDecimal("0"));
    //Act Statement(s)
    BigDecimal result = NumberUtils.toScaledBigDecimal("value1", 0, RoundingMode.UP);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result.stripTrailingZeros(), equalTo(new BigDecimal("0").stripTrailingZeros()));
        numberUtils.verify(() -> NumberUtils.createBigDecimal("value1"), atLeast(1));
        numberUtils.verify(() -> NumberUtils.toScaledBigDecimal(any(), eq(0), eq(RoundingMode.UP)), atLeast(1));
    });
}*/
    }

    //Sapient generated method id: ${toShortTest}, hash: A1BE48B1C36F1614668350C2632B37C4
    @Test()
    void toShortTest() {
        //Arrange Statement(s)
        try (MockedStatic<NumberUtils> numberUtils = mockStatic(NumberUtils.class, CALLS_REAL_METHODS)) {
            numberUtils.when(() -> NumberUtils.toShort("str1", (short) 0)).thenReturn((short) 0);
            //Act Statement(s)
            short result = NumberUtils.toShort("str1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo((short) 0));
                numberUtils.verify(() -> NumberUtils.toShort("str1", (short) 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toShort1WhenStrIsNull}, hash: 7664B1A77171C0690164E3DD0015D703
    @Test()
    void toShort1WhenStrIsNull() {
        /* Branches:
         * (str == null) : true
         */
         
        //Act Statement(s)
        short result = NumberUtils.toShort((String) null, (short) 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }

    //Sapient generated method id: ${toShort1WhenStrIsNotNull}, hash: 43F51AD486F43969652BB0C039AE07F9
    @Test()
    void toShort1WhenStrIsNotNull() {
        /* Branches:
         * (str == null) : false
         */
         
        //Act Statement(s)
        short result = NumberUtils.toShort("0", (short) 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }

    //Sapient generated method id: ${toShort1WhenCaughtNumberFormatException}, hash: 9A87235A91292D0BB9A58933289128E7
    @Test()
    void toShort1WhenCaughtNumberFormatException() {
        /* Branches:
         * (str == null) : false
         * (catch-exception (NumberFormatException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        short result = NumberUtils.toShort("0", (short) 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }
}