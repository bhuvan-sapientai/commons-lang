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
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LocaleUtilsSapientGeneratedTest {

    //Sapient generated method id: ${9fec795d-c055-311f-b4be-5bf2afe6dad3}
    @Disabled()
    @Test()
    void availableLocaleListTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        List<Locale> result = LocaleUtils.availableLocaleList();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${6c7846bf-0213-3bf0-8c8b-6197475c33f6}
    @Disabled()
    @Test()
    void availableLocaleSetTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Set<Locale> result = LocaleUtils.availableLocaleSet();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${8084ac30-4dac-3925-9e93-7ce325e1f69a}
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

    //Sapient generated method id: ${7721f878-15f0-3c7f-a21e-e99e9da726f8}
    @Disabled()
    @Test()
    void countriesByLanguageWhenLanguageCodeIsNotNull() {
        /* Branches:
         * (languageCode == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        List<Locale> result = LocaleUtils.countriesByLanguage("en");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${ee295de4-53a7-39ee-a2d4-77f2b94e7590}
    @Disabled()
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

    //Sapient generated method id: ${c114a500-1ab3-35f8-9dcf-1ca4f0b89642}
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

    //Sapient generated method id: ${772b0494-6b5e-3579-8734-b2d178e7f62a}
    @Test()
    void isLanguageUndeterminedWhenUNDETERMINEDEqualsLocaleToLanguageTag() {
        /* Branches:
         * (locale == null) : false
         * (UNDETERMINED.equals(locale.toLanguageTag())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Locale locale = new Locale("language1");
        //Act Statement(s)
        boolean result = LocaleUtils.isLanguageUndetermined(locale);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${50c63eea-cae7-35dc-8ca3-a85dfdebcc54}
    @Disabled()
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

    //Sapient generated method id: ${e5528298-ef83-3733-a4e8-b53bab01879d}
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

    //Sapient generated method id: ${925d053d-d622-3977-87f0-00e47fb96fa9}
    @Disabled()
    @Test()
    void languagesByCountryWhenCountryCodeIsNotNull() {
        /* Branches:
         * (countryCode == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        List<Locale> result = LocaleUtils.languagesByCountry("US");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${22440a23-eacc-3771-b874-9464c602f213}
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

    //Sapient generated method id: ${d8f2ec0d-74bf-32d7-bb86-b1fcd8c395da}
    @Disabled()
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
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${3ff16ae7-13a3-3940-b558-770364f2c5bf}
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

    //Sapient generated method id: ${8415a1a9-cb09-3ece-ba3c-2ce63985637a}
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

    //Sapient generated method id: ${bcec9542-8160-35c6-b267-bdecfcc6224d}
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

    //Sapient generated method id: ${5a12780c-ea1a-387f-8568-4ec4f6b47876}
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

    //Sapient generated method id: ${176d66b8-de5a-3614-9459-0886fc3bd9e1}
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

    //Sapient generated method id: ${f7da130b-d34e-3e38-bdf7-8a8336f164ce}
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

    //Sapient generated method id: ${3eee3cb8-71c6-388c-a803-28a78b328c0e}
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

    //Sapient generated method id: ${12c1331a-ea0f-3554-aa2d-594b1a092f58}
    @Disabled()
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

    //Sapient generated method id: ${c2353c38-2018-30e3-9c56-9f72d9c1c15a}
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

    //Sapient generated method id: ${067be623-cc94-3ab8-bf73-d5593aa24470}
    @Disabled()
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

    //Sapient generated method id: ${a3b13a81-bb32-3c98-97f5-f6af3adec015}
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

    //Sapient generated method id: ${c64ba1a5-6ce4-3158-acca-2623a2518375}
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

    //Sapient generated method id: ${46b8a1b5-1277-372e-84e4-1704c05498ed}
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
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid locale format: -BCDEF");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            LocaleUtils.toLocale("-BCDEF");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${6db887d0-568a-3a37-a6ae-8bcd6ff7ee21}
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

    //Sapient generated method id: ${bbf50b95-af01-3d5d-870f-342a799d6c1e}
    @Disabled()
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

    //Sapient generated method id: ${c0e7a154-91ef-3c5e-bace-febbbc682df9}
    @Disabled()
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

    //Sapient generated method id: ${d0c862a2-8d69-38a3-adea-40790f5d6edb}
    @Disabled()
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

    //Sapient generated method id: ${beaf9e6b-ea9b-3ec0-b5a1-1e08c372ce13}
    @Disabled()
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

    //Sapient generated method id: ${e1bb8691-ef5e-3dc4-9531-d9d18d82c12d}
    @Disabled()
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

    //Sapient generated method id: ${3fe336d9-720e-3a2e-8592-66d201f958c2}
    @Disabled()
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

    //Sapient generated method id: ${d2aaff69-76f4-3896-80c4-dc3d2e54c210}
    @Disabled()
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
