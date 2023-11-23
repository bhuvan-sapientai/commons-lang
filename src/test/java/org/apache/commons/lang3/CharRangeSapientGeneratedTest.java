package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CharRangeSapientGeneratedTest {

    //Sapient generated method id: ${777bb57a-9855-3778-8550-be0fb4fbe33f}
    @Test()
    void isWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 73)) : false  #  inside <init> method
         */
        //Act Statement(s)
        CharRange result = CharRange.is('A');
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${38934847-5051-31a8-85f5-c104daaa6170}
    @Test()
    void isNotWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 73)) : false  #  inside <init> method
         */
        //Act Statement(s)
        CharRange result = CharRange.isNot('A');
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${7f14dca2-7a9e-35a9-b8e8-19ea2310a1ba}
    @Test()
    void isInWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 73)) : false  #  inside <init> method
         */
        //Act Statement(s)
        CharRange result = CharRange.isIn('\uD85F', '\uD83D');
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${bbaa764b-6a76-3b1b-804f-b34002ded235}
    @Test()
    void isNotInWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 73)) : false  #  inside <init> method
         */
        //Act Statement(s)
        CharRange result = CharRange.isNotIn('\uD85F', '\uD83D');
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${eea5e106-c18a-3d72-8cb0-3b969fbc4b9b}
    @Disabled()
    @Test()
    void containsWhenChGreaterThanOrEqualsToStartAndChGreaterThanEnd() {
        /* Branches:
         * ((ch >= start && ch <= end) != negated) : true
         * (ch >= start) : true
         * (ch <= end) : false
         */
        //Arrange Statement(s)
        CharRange target = CharRange.isIn('\uD83D', '\uD81F');
        //Act Statement(s)
        boolean result = target.contains('\uD87F');
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${abba89be-7534-3de9-b129-b69e37ffa291}
    @Test()
    void containsWhenChLessThanStartAndChGreaterThanEnd() {
        /* Branches:
         * ((ch >= start && ch <= end) != negated) : true
         * (ch >= start) : false
         * (ch <= end) : false
         */
        //Arrange Statement(s)
        CharRange target = CharRange.isIn('\uD87D', '\uD842');
        //Act Statement(s)
        boolean result = target.contains('\uD87C');
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${39246ce3-9710-3ef1-9208-8b91ff4d6279}
    @Test()
    void contains1WhenEndGreaterThanOrEqualsToRangeEnd() {
        /* Branches:
         * (negated) : false
         * (range.negated) : false
         * (start <= range.start) : true
         * (end >= range.end) : true
         */
        //Arrange Statement(s)
        CharRange target = CharRange.isIn('\uF4D7', '\u7FA9');
        CharRange charRange = CharRange.isIn('\uD87F', '\u837D');
        //Act Statement(s)
        boolean result = target.contains(charRange);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${dcda74bd-9525-3b0f-974b-6f2dac959fbe}
    @Disabled()
    @Test()
    void contains1WhenEndLessThanRangeEnd() {
        /* Branches:
         * (negated) : false
         * (range.negated) : false
         * (start <= range.start) : true
         * (end >= range.end) : false
         */
        //Arrange Statement(s)
        CharRange target = CharRange.isIn('\uF4D7', '\u7FA9');
        CharRange charRange = CharRange.isIn('\uD87F', '\uD840');
        //Act Statement(s)
        boolean result = target.contains(charRange);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${cb54a96d-88b0-340f-ba96-faea88b4d8e1}
    @Test()
    void toStringWhenStartNotEqualsEnd() {
        /* Branches:
         * (iToString == null) : true
         * (isNegated()) : true
         * (start != end) : true
         */
        //Arrange Statement(s)
        CharRange target = spy(CharRange.isIn('\uD87E', '\uD87B'));
        doReturn(true).when(target).isNegated();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("^\uD87B-\uD87E"));
            verify(target).isNegated();
        });
    }

    //Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}
    @Test()
    void iteratorTest() {
        //Arrange Statement(s)
        CharRange target = CharRange.isIn('\uD85F', '\uD83D');
        //Act Statement(s)
        Iterator<Character> result = target.iterator();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
