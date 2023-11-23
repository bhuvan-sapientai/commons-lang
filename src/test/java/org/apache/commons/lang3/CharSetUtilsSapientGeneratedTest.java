package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CharSetUtilsSapientGeneratedTest {

    //Sapient generated method id: ${4228f9be-2000-321a-8fba-9a97ceacb31e}
    @Test()
    void containsAnyWhenDeepEmptySet() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (Streams.of(strings).allMatch(StringUtils::isEmpty)) : true  #  inside deepEmpty method
         * (deepEmpty(set)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[]{};
        //Act Statement(s)
        boolean result = CharSetUtils.containsAny("A", stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${321f6c05-27e8-3ece-9331-d30d243cf986}
    @Disabled()
    @Test()
    void containsAnyWhenCharsContainsC() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (Streams.of(strings).allMatch(StringUtils::isEmpty)) : false  #  inside deepEmpty method
         * (deepEmpty(set)) : false
         * (for-each(str.toCharArray())) : true
         * (chars.contains(c)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[]{};
        //Act Statement(s)
        boolean result = CharSetUtils.containsAny("str1", stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${6e7dabc6-00fc-3080-b434-8bb58e88f67b}
    @Test()
    void containsAnyWhenCharsNotContainsC() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (Streams.of(strings).allMatch(StringUtils::isEmpty)) : false  #  inside deepEmpty method
         * (deepEmpty(set)) : false
         * (for-each(str.toCharArray())) : true
         * (chars.contains(c)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[]{};
        //Act Statement(s)
        boolean result = CharSetUtils.containsAny("A", stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${340c3d29-88c0-3a46-b0e7-032499e445bf}
    @Test()
    void countWhenDeepEmptySet() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (Streams.of(strings).allMatch(StringUtils::isEmpty)) : true  #  inside deepEmpty method
         * (deepEmpty(set)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[]{};
        //Act Statement(s)
        int result = CharSetUtils.count("A", stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${d27f6fb6-a563-37bb-a3e8-4a33d98fd6f6}
    @Disabled()
    @Test()
    void countWhenCharsContainsC() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (Streams.of(strings).allMatch(StringUtils::isEmpty)) : false  #  inside deepEmpty method
         * (deepEmpty(set)) : false
         * (for-each(str.toCharArray())) : true
         * (chars.contains(c)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[]{};
        //Act Statement(s)
        int result = CharSetUtils.count("str1", stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${8e8ffe30-0569-3755-a060-aa22e2de5ce9}
    @Test()
    void deleteWhenDeepEmptySet() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (Streams.of(strings).allMatch(StringUtils::isEmpty)) : true  #  inside deepEmpty method
         * (deepEmpty(set)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[]{};
        //Act Statement(s)
        String result = CharSetUtils.delete("A", stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("A")));
    }

    //Sapient generated method id: ${04f54baa-9cc8-3375-b9bb-b4e2811230a8}
    @Disabled()
    @Test()
    void deleteWhenCharsContainsChrEqualsExpect() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (Streams.of(strings).allMatch(StringUtils::isEmpty)) : false  #  inside deepEmpty method
         * (deepEmpty(set)) : false
         * (for-each(chrs)) : true  #  inside modify method
         * (chars.contains(chr) == expect) : true  #  inside modify method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[]{};
        //Act Statement(s)
        String result = CharSetUtils.delete("A", stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("B")));
    }

    //Sapient generated method id: ${96816b71-3b61-3b9e-9411-00cb429f8f25}
    @Test()
    void keepWhenStrIsNull() {
        /* Branches:
         * (str == null) : true
         */
        //Arrange Statement(s)
        String[] stringArray = new String[]{};
        //Act Statement(s)
        String result = CharSetUtils.keep((String) null, stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${0b9fc677-0415-3894-b934-ec5c9e7b11b0}
    @Test()
    void keepWhenDeepEmptySet() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (Streams.of(strings).allMatch(StringUtils::isEmpty)) : true  #  inside deepEmpty method
         * (deepEmpty(set)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[]{};
        //Act Statement(s)
        String result = CharSetUtils.keep("A", stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }

    //Sapient generated method id: ${4ab0c3f3-4e38-3fe4-9deb-cabc6a31b734}
    @Disabled()
    @Test()
    void keepWhenCharsContainsChrEqualsExpect() {
        /* Branches:
         * (str == null) : false
         * (str.isEmpty()) : false
         * (Streams.of(strings).allMatch(StringUtils::isEmpty)) : false  #  inside deepEmpty method
         * (deepEmpty(set)) : false
         * (for-each(chrs)) : true  #  inside modify method
         * (chars.contains(chr) == expect) : true  #  inside modify method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[]{};
        //Act Statement(s)
        String result = CharSetUtils.keep("str1", stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${ff2c20f9-34bd-3063-9a4b-3ff0eb977942}
    @Test()
    void squeezeWhenDeepEmptySet() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (Streams.of(strings).allMatch(StringUtils::isEmpty)) : true  #  inside deepEmpty method
         * (deepEmpty(set)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[]{};
        //Act Statement(s)
        String result = CharSetUtils.squeeze("A", stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("A")));
    }

    //Sapient generated method id: ${bcbb3034-9689-3acc-b6b3-8eb438fad8c7}
    @Disabled()
    @Test()
    void squeezeWhenCharsContainsCh() {
        /* Branches:
         * (StringUtils.isEmpty(str)) : false
         * (Streams.of(strings).allMatch(StringUtils::isEmpty)) : false  #  inside deepEmpty method
         * (deepEmpty(set)) : false
         * (i < sz) : true
         * (ch == lastChar) : true
         * (inChars != null) : false
         * (notInChars == null) : true
         * (chars.contains(ch)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        String[] stringArray = new String[]{};
        //Act Statement(s)
        String result = CharSetUtils.squeeze("str1", stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }
}
