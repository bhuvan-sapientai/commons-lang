package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.mockito.MockedStatic;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Set;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LocaleUtilsSapientGeneratedTest {

    //Sapient generated method id: ${availableLocaleListTest}, hash: 7E144A64B89CAA60F46503C08CF3D7BD
    @Test()
    void availableLocaleListTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        List<Locale> result = LocaleUtils.availableLocaleList();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${availableLocaleSetTest}, hash: DB61923E1AD18097AB514D4551709CBF
    @Test()
    void availableLocaleSetTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Set<Locale> result = LocaleUtils.availableLocaleSet();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${countriesByLanguageWhenLanguageCodeIsNull}, hash: 775AEDB9D5C60630F5C372ABEDD8085E
    @Test()
    void countriesByLanguageWhenLanguageCodeIsNull() {
        /* Branches:
         * (languageCode == null) : true
         */
         
        //Act Statement(s)
        List<Locale> result = LocaleUtils.countriesByLanguage((String) null);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${countriesByLanguageWhenLanguageCodeIsNotNull}, hash: E9059DBE1AB77E479DE1A5A6138909F2
    @Test()
    void countriesByLanguageWhenLanguageCodeIsNotNull() {
        /* Branches:
         * (languageCode == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        List<Locale> result = LocaleUtils.countriesByLanguage("languageCode1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${isAvailableLocaleWhenAvailableLocaleSetContainsLocale}, hash: 56743D99723D24DDDE5F2BCDFF933125
    @Test()
    void isAvailableLocaleWhenAvailableLocaleSetContainsLocale() {
        /* Branches:
         * (availableLocaleSet().contains(locale)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Locale locale = new Locale("language1");
        
        //Act Statement(s)
        boolean result = LocaleUtils.isAvailableLocale(locale);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isAvailableLocaleWhenAvailableLocaleSetNotContainsLocale}, hash: D76CD215FFF5224723EF75B85E2471F6
    @Test()
    void isAvailableLocaleWhenAvailableLocaleSetNotContainsLocale() {
        /* Branches:
         * (availableLocaleSet().contains(locale)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Locale locale = new Locale("language1");
        
        //Act Statement(s)
        boolean result = LocaleUtils.isAvailableLocale(locale);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isLanguageUndeterminedWhenUNDETERMINEDEqualsLocaleToLanguageTag}, hash: CF1C8CF2B060365B69A2F271E6C46DFB
    @Test()
    void isLanguageUndeterminedWhenUNDETERMINEDEqualsLocaleToLanguageTag() {
        /* Branches:
         * (locale == null) : false
         * (UNDETERMINED.equals(locale.toLanguageTag())) : true
         */
         //Arrange Statement(s)
        Locale locale = new Locale("language1");
        
        //Act Statement(s)
        boolean result = LocaleUtils.isLanguageUndetermined(locale);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isLanguageUndeterminedWhenUNDETERMINEDNotEqualsLocaleToLanguageTag}, hash: FB94D955C06AE241175C97B74CFA9E98
    @Test()
    void isLanguageUndeterminedWhenUNDETERMINEDNotEqualsLocaleToLanguageTag() {
        /* Branches:
         * (locale == null) : false
         * (UNDETERMINED.equals(locale.toLanguageTag())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Locale locale = new Locale("language1");
        
        //Act Statement(s)
        boolean result = LocaleUtils.isLanguageUndetermined(locale);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${languagesByCountryWhenCountryCodeIsNull}, hash: 84C1569BF3199BA20765C31012FCD131
    @Test()
    void languagesByCountryWhenCountryCodeIsNull() {
        /* Branches:
         * (countryCode == null) : true
         */
         
        //Act Statement(s)
        List<Locale> result = LocaleUtils.languagesByCountry((String) null);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${languagesByCountryWhenCountryCodeIsNotNull}, hash: 3F9A4F4055438631825BA65BC1898743
    @Test()
    void languagesByCountryWhenCountryCodeIsNotNull() {
        /* Branches:
         * (countryCode == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        List<Locale> result = LocaleUtils.languagesByCountry("countryCode1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${localeLookupListTest}, hash: 37FA486907D134F68FB45882E421A75E
    @Test()
    void localeLookupListTest() {
        //Arrange Statement(s)
        try (MockedStatic<LocaleUtils> localeUtils = mockStatic(LocaleUtils.class, CALLS_REAL_METHODS)) {
            List<Locale> localeList = new ArrayList<>();
            Locale locale = new Locale("language1");
            localeUtils.when(() -> LocaleUtils.localeLookupList(locale, locale)).thenReturn(localeList);
            //Act Statement(s)
            List<Locale> result = LocaleUtils.localeLookupList(locale);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(localeList));
                localeUtils.verify(() -> LocaleUtils.localeLookupList(locale, locale), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${localeLookupList1WhenListNotContainsDefaultLocale}, hash: F34B2D47B7FD38D1EB13092B9FE07B3A
    @Test()
    void localeLookupList1WhenListNotContainsDefaultLocale() {
        /* Branches:
         * (locale != null) : true
         * (!locale.getVariant().isEmpty()) : true
         * (!locale.getCountry().isEmpty()) : true
         * (!list.contains(defaultLocale)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Locale locale = new Locale("language1");
        Locale locale2 = new Locale("language1");
        
        //Act Statement(s)
        List<Locale> result = LocaleUtils.localeLookupList(locale, locale2);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(4));
            assertThat(result.get(0), is(instanceOf(Locale.class)));
        });
    }

    //Sapient generated method id: ${toLocaleWhenLocaleIsNotNull}, hash: 3513DFAEE06E7FBDADA7755E4BE8E36A
    @Test()
    void toLocaleWhenLocaleIsNotNull() {
        /* Branches:
         * (locale != null) : true
         */
         //Arrange Statement(s)
        Locale locale = new Locale("language1");
        
        //Act Statement(s)
        Locale result = LocaleUtils.toLocale(locale);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(locale)));
    }

    //Sapient generated method id: ${toLocaleWhenLocaleIsNull}, hash: D1B10DBDE88FB63D2D2BF7CBF21FA819
    @Test()
    void toLocaleWhenLocaleIsNull() {
        /* Branches:
         * (locale != null) : false
         */
         //Arrange Statement(s)
        Locale locale = null;
        
        //Act Statement(s)
        Locale result = LocaleUtils.toLocale(locale);
        Locale locale2 = Locale.getDefault();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(locale2)));
    }

    //Sapient generated method id: ${toLocale1WhenStrIsNull}, hash: 19CD17B2A0C161F9D466CA7DD9CF573E
    @Test()
    void toLocale1WhenStrIsNull() {
        /* Branches:
         * (str == null) : true
         */
         
        //Act Statement(s)
        Locale result = LocaleUtils.toLocale((String) null);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${toLocale1WhenStrIsEmpty}, hash: 6028AF4B68DF4CB004A8B30C2BC496D2
    @Test()
    void toLocale1WhenStrIsEmpty() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : true
         */
         
        //Act Statement(s)
        Locale result = LocaleUtils.toLocale("");
        Locale locale = new Locale("", "");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(locale)));
    }

    //Sapient generated method id: ${toLocale1WhenStrContains_ThrowsIllegalArgumentException}, hash: 50287EFFF995073CC3724C5536D18A44
    @Test()
    void toLocale1WhenStrContains_ThrowsIllegalArgumentException() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (str.contains("#")) : true
         */
         //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid locale format: #");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            LocaleUtils.toLocale("#");
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${toLocale1WhenLenLessThan2ThrowsIllegalArgumentException}, hash: DCF8A6D6A557A16FAEA34938F5F8C646
    @Test()
    void toLocale1WhenLenLessThan2ThrowsIllegalArgumentException() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (str.contains("#")) : false
         * (len < 2) : true
         */
         //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid locale format: A");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            LocaleUtils.toLocale("A");
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${toLocale1WhenCh0EqualsDASHAndLenLessThan3ThrowsIllegalArgumentException}, hash: F7A2B33BBE5AB0D77A6A7486F1E99102
    @Test()
    void toLocale1WhenCh0EqualsDASHAndLenLessThan3ThrowsIllegalArgumentException() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (str.contains("#")) : false
         * (len < 2) : false
         * (ch0 == UNDERSCORE) : false
         * (ch0 == DASH) : true
         * (len < 3) : true
         */
         //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid locale format: -B");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            LocaleUtils.toLocale("-B");
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${toLocale1WhenCharacterNotIsUpperCaseCh2ThrowsIllegalArgumentException}, hash: 2B16B43D6118A103F04F5702BC144C6B
    @Test()
    void toLocale1WhenCharacterNotIsUpperCaseCh2ThrowsIllegalArgumentException() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (str.contains("#")) : false
         * (len < 2) : false
         * (ch0 == UNDERSCORE) : false
         * (ch0 == DASH) : true
         * (len < 3) : false
         * (!Character.isUpperCase(ch1)) : false
         * (!Character.isUpperCase(ch2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            LocaleUtils.toLocale("str1");
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${toLocale1WhenCharacterIsUpperCaseCh2AndLenEquals3}, hash: 3D70490A641C6FEB895BE76D65F2A1BD
    @Test()
    void toLocale1WhenCharacterIsUpperCaseCh2AndLenEquals3() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (str.contains("#")) : false
         * (len < 2) : false
         * (ch0 == UNDERSCORE) : false
         * (ch0 == DASH) : true
         * (len < 3) : false
         * (!Character.isUpperCase(ch1)) : false
         * (!Character.isUpperCase(ch2)) : false
         * (len == 3) : true
         */
         
        //Act Statement(s)
        Locale result = LocaleUtils.toLocale("-BC");
        Locale locale = new Locale("", "BC");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(locale)));
    }

    //Sapient generated method id: ${toLocale1WhenIsISO639LanguageCodeStr}, hash: C20A419C42B404C125786A23B2007EB3
    @Test()
    void toLocale1WhenIsISO639LanguageCodeStr() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (str.contains("#")) : false
         * (len < 2) : false
         * (ch0 == UNDERSCORE) : false
         * (ch0 == DASH) : false
         * (StringUtils.isAllLowerCase(str)) : true  #  inside isISO639LanguageCode method
         * (str.length() == 2) : false  #  inside isISO639LanguageCode method
         * (str.length() == 3) : true  #  inside isISO639LanguageCode method
         * (isISO639LanguageCode(str)) : true  #  inside parseLocale method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Locale result = LocaleUtils.toLocale("str1");
        Locale locale = new Locale("str1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(locale)));
    }

    //Sapient generated method id: ${toLocale1WhenLenNotEquals3AndLenLessThan5ThrowsIllegalArgumentException}, hash: 40AA7D8547E8F41992C4F329F79CDEF5
    @Test()
    void toLocale1WhenLenNotEquals3AndLenLessThan5ThrowsIllegalArgumentException() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (str.contains("#")) : false
         * (len < 2) : false
         * (ch0 == UNDERSCORE) : false
         * (ch0 == DASH) : true
         * (len < 3) : false
         * (!Character.isUpperCase(ch1)) : false
         * (!Character.isUpperCase(ch2)) : false
         * (len == 3) : false
         * (len < 5) : true
         */
         //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid locale format: -BCD");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            LocaleUtils.toLocale("-BCD");
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${toLocale1WhenSegmentsLengthNotEquals3ThrowsIllegalArgumentException}, hash: 18D00DE53CD6D960815ADF3202BF3940
    @Test()
    void toLocale1WhenSegmentsLengthNotEquals3ThrowsIllegalArgumentException() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (str.contains("#")) : false
         * (len < 2) : false
         * (ch0 == UNDERSCORE) : false
         * (ch0 == DASH) : false
         * (StringUtils.isAllLowerCase(str)) : false  #  inside isISO639LanguageCode method
         * (isISO639LanguageCode(str)) : false  #  inside parseLocale method
         * (str.indexOf(UNDERSCORE) != -1) : false  #  inside parseLocale method
         * (segments.length == 2) : false  #  inside parseLocale method
         * (segments.length == 3) : false  #  inside parseLocale method
         */
         //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid locale format: BC");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            LocaleUtils.toLocale("BC");
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${toLocale1WhenLenNotLessThan5AndStrCharAt3NotEqualsCh0ThrowsIllegalArgumentException}, hash: 8FCA1A32B7B22739A417277FC1E286F6
    @Test()
    void toLocale1WhenLenNotLessThan5AndStrCharAt3NotEqualsCh0ThrowsIllegalArgumentException() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (str.contains("#")) : false
         * (len < 2) : false
         * (ch0 == UNDERSCORE) : false
         * (ch0 == DASH) : true
         * (len < 3) : false
         * (!Character.isUpperCase(ch1)) : false
         * (!Character.isUpperCase(ch2)) : false
         * (len == 3) : false
         * (len < 5) : false
         * (str.charAt(3) != ch0) : true
         */
         //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid locale format: -BCDE");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            LocaleUtils.toLocale("-BCDE");
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${toLocale1WhenLenNotLessThan5AndStrCharAt3EqualsCh0}, hash: 80977A8C8CB1B114BA29440E3708CB6D
    @Test()
    void toLocale1WhenLenNotLessThan5AndStrCharAt3EqualsCh0() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (str.contains("#")) : false
         * (len < 2) : false
         * (ch0 == UNDERSCORE) : false
         * (ch0 == DASH) : true
         * (len < 3) : false
         * (!Character.isUpperCase(ch1)) : false
         * (!Character.isUpperCase(ch2)) : false
         * (len == 3) : false
         * (len < 5) : false
         * (str.charAt(3) != ch0) : false
         */
         
        //Act Statement(s)
        Locale result = LocaleUtils.toLocale("-BC-DE");
        Locale locale = new Locale("", "BC", "DE");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(locale)));
    }

    //Sapient generated method id: ${toLocale1WhenIsISO639LanguageCodeNotLanguageThrowsIllegalArgumentException}, hash: 5BE7613C0ED874F4016B5D56380B2FFA
    @Test()
    void toLocale1WhenIsISO639LanguageCodeNotLanguageThrowsIllegalArgumentException() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (str.contains("#")) : false
         * (len < 2) : false
         * (ch0 == UNDERSCORE) : false
         * (ch0 == DASH) : false
         * (StringUtils.isAllLowerCase(str)) : true  #  inside isISO639LanguageCode method
         * (str.length() == 2) : false  #  inside isISO639LanguageCode method
         * (str.length() == 3) : false  #  inside isISO639LanguageCode method
         * (isISO639LanguageCode(str)) : false  #  inside parseLocale method
         * (str.indexOf(UNDERSCORE) != -1) : true  #  inside parseLocale method
         * (segments.length == 2) : false  #  inside parseLocale method
         * (segments.length == 3) : true  #  inside parseLocale method
         * (isISO639LanguageCode(language)) : false  #  inside parseLocale method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            LocaleUtils.toLocale("str1");
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${toLocale1WhenIsNumericAreaCodeNotCountryThrowsIllegalArgumentException}, hash: 0B064B7B018D4B8148AE03C98EE72CF3
    @Test()
    void toLocale1WhenIsNumericAreaCodeNotCountryThrowsIllegalArgumentException() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (str.contains("#")) : false
         * (len < 2) : false
         * (ch0 == UNDERSCORE) : false
         * (ch0 == DASH) : false
         * (StringUtils.isAllLowerCase(str)) : true  #  inside isISO639LanguageCode method
         * (str.length() == 2) : false  #  inside isISO639LanguageCode method
         * (str.length() == 3) : false  #  inside isISO639LanguageCode method
         * (isISO639LanguageCode(str)) : false  #  inside parseLocale method
         * (str.indexOf(UNDERSCORE) != -1) : true  #  inside parseLocale method
         * (segments.length == 2) : true  #  inside parseLocale method
         * (isISO639LanguageCode(language)) : false  #  inside parseLocale method
         * (StringUtils.isNumeric(str)) : false  #  inside isNumericAreaCode method
         * (isNumericAreaCode(country)) : false  #  inside parseLocale method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            LocaleUtils.toLocale("str1");
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${toLocale1WhenIsISO3166CountryCodeCountry}, hash: 2C10E79A994CBF5151965D494D3DDD61
    @Test()
    void toLocale1WhenIsISO3166CountryCodeCountry() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (str.contains("#")) : false
         * (len < 2) : false
         * (ch0 == UNDERSCORE) : false
         * (ch0 == DASH) : false
         * (StringUtils.isAllLowerCase(str)) : true  #  inside isISO639LanguageCode method
         * (str.length() == 2) : false  #  inside isISO639LanguageCode method
         * (str.length() == 3) : false  #  inside isISO639LanguageCode method
         * (isISO639LanguageCode(str)) : false  #  inside parseLocale method
         * (str.indexOf(UNDERSCORE) != -1) : true  #  inside parseLocale method
         * (segments.length == 2) : true  #  inside parseLocale method
         * (isISO639LanguageCode(language)) : true  #  inside parseLocale method
         * (StringUtils.isAllUpperCase(str)) : true  #  inside isISO3166CountryCode method
         * (str.length() == 2) : true  #  inside isISO3166CountryCode method
         * (isISO3166CountryCode(country)) : true  #  inside parseLocale method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Locale result = LocaleUtils.toLocale("str1");
        Locale locale = new Locale("language1", "country1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(locale)));
    }

    //Sapient generated method id: ${toLocale1WhenIsNumericAreaCodeCountry}, hash: 4C31BD86D1441DF13FBF2D7F7CB05E94
    @Test()
    void toLocale1WhenIsNumericAreaCodeCountry() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (str.contains("#")) : false
         * (len < 2) : false
         * (ch0 == UNDERSCORE) : false
         * (ch0 == DASH) : false
         * (StringUtils.isAllLowerCase(str)) : true  #  inside isISO639LanguageCode method
         * (str.length() == 2) : false  #  inside isISO639LanguageCode method
         * (str.length() == 3) : false  #  inside isISO639LanguageCode method
         * (isISO639LanguageCode(str)) : false  #  inside parseLocale method
         * (str.indexOf(UNDERSCORE) != -1) : true  #  inside parseLocale method
         * (segments.length == 2) : true  #  inside parseLocale method
         * (isISO639LanguageCode(language)) : true  #  inside parseLocale method
         * (StringUtils.isAllUpperCase(str)) : true  #  inside isISO3166CountryCode method
         * (str.length() == 2) : false  #  inside isISO3166CountryCode method
         * (isISO3166CountryCode(country)) : false  #  inside parseLocale method
         * (StringUtils.isNumeric(str)) : true  #  inside isNumericAreaCode method
         * (str.length() == 3) : true  #  inside isNumericAreaCode method
         * (isNumericAreaCode(country)) : true  #  inside parseLocale method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Locale result = LocaleUtils.toLocale("str1");
        Locale locale = new Locale("language1", "country1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(locale)));
    }

    //Sapient generated method id: ${toLocale1WhenIsISO3166CountryCodeCountryAndVariantNotIsEmpty}, hash: 5A3CCB270C089CBFD36FA5DA4C010FBB
    @Test()
    void toLocale1WhenIsISO3166CountryCodeCountryAndVariantNotIsEmpty() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (str.contains("#")) : false
         * (len < 2) : false
         * (ch0 == UNDERSCORE) : false
         * (ch0 == DASH) : false
         * (StringUtils.isAllLowerCase(str)) : true  #  inside isISO639LanguageCode method
         * (str.length() == 2) : false  #  inside isISO639LanguageCode method
         * (str.length() == 3) : false  #  inside isISO639LanguageCode method
         * (isISO639LanguageCode(str)) : false  #  inside parseLocale method
         * (str.indexOf(UNDERSCORE) != -1) : true  #  inside parseLocale method
         * (segments.length == 2) : false  #  inside parseLocale method
         * (segments.length == 3) : true  #  inside parseLocale method
         * (isISO639LanguageCode(language)) : true  #  inside parseLocale method
         * (country.isEmpty()) : false  #  inside parseLocale method
         * (StringUtils.isAllUpperCase(str)) : true  #  inside isISO3166CountryCode method
         * (str.length() == 2) : true  #  inside isISO3166CountryCode method
         * (isISO3166CountryCode(country)) : true  #  inside parseLocale method
         * (!variant.isEmpty()) : true  #  inside parseLocale method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Locale result = LocaleUtils.toLocale("str1");
        Locale locale = new Locale("language1", "country1", "variant1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(locale)));
    }

    //Sapient generated method id: ${toLocale1WhenStringUtilsIsNumericStrAndStrLengthNotEquals3AndIsNumericAreaCodeNotCountryThrowsIllegalArgumentException}, hash: D230BA111078E9B434E90AFB83619D56
    @Test()
    void toLocale1WhenStringUtilsIsNumericStrAndStrLengthNotEquals3AndIsNumericAreaCodeNotCountryThrowsIllegalArgumentException() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (str.contains("#")) : false
         * (len < 2) : false
         * (ch0 == UNDERSCORE) : false
         * (ch0 == DASH) : false
         * (StringUtils.isAllLowerCase(str)) : true  #  inside isISO639LanguageCode method
         * (str.length() == 2) : false  #  inside isISO639LanguageCode method
         * (str.length() == 3) : false  #  inside isISO639LanguageCode method
         * (isISO639LanguageCode(str)) : false  #  inside parseLocale method
         * (str.indexOf(UNDERSCORE) != -1) : true  #  inside parseLocale method
         * (segments.length == 2) : false  #  inside parseLocale method
         * (segments.length == 3) : true  #  inside parseLocale method
         * (isISO639LanguageCode(language)) : true  #  inside parseLocale method
         * (country.isEmpty()) : false  #  inside parseLocale method
         * (StringUtils.isAllUpperCase(str)) : true  #  inside isISO3166CountryCode method
         * (str.length() == 2) : false  #  inside isISO3166CountryCode method
         * (isISO3166CountryCode(country)) : false  #  inside parseLocale method
         * (StringUtils.isNumeric(str)) : true  #  inside isNumericAreaCode method
         * (str.length() == 3) : false  #  inside isNumericAreaCode method
         * (isNumericAreaCode(country)) : false  #  inside parseLocale method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            LocaleUtils.toLocale("str1");
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${toLocale1WhenIsNumericAreaCodeCountryAndVariantIsEmptyThrowsIllegalArgumentException}, hash: 7EC9B3734EE093A817C27FFD93B1FFA9
    @Test()
    void toLocale1WhenIsNumericAreaCodeCountryAndVariantIsEmptyThrowsIllegalArgumentException() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (str.contains("#")) : false
         * (len < 2) : false
         * (ch0 == UNDERSCORE) : false
         * (ch0 == DASH) : false
         * (StringUtils.isAllLowerCase(str)) : true  #  inside isISO639LanguageCode method
         * (str.length() == 2) : false  #  inside isISO639LanguageCode method
         * (str.length() == 3) : false  #  inside isISO639LanguageCode method
         * (isISO639LanguageCode(str)) : false  #  inside parseLocale method
         * (str.indexOf(UNDERSCORE) != -1) : true  #  inside parseLocale method
         * (segments.length == 2) : false  #  inside parseLocale method
         * (segments.length == 3) : true  #  inside parseLocale method
         * (isISO639LanguageCode(language)) : true  #  inside parseLocale method
         * (country.isEmpty()) : false  #  inside parseLocale method
         * (StringUtils.isAllUpperCase(str)) : true  #  inside isISO3166CountryCode method
         * (str.length() == 2) : false  #  inside isISO3166CountryCode method
         * (isISO3166CountryCode(country)) : false  #  inside parseLocale method
         * (StringUtils.isNumeric(str)) : true  #  inside isNumericAreaCode method
         * (str.length() == 3) : true  #  inside isNumericAreaCode method
         * (isNumericAreaCode(country)) : true  #  inside parseLocale method
         * (!variant.isEmpty()) : false  #  inside parseLocale method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            LocaleUtils.toLocale("str1");
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }
}
