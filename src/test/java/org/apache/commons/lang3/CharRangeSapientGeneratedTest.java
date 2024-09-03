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

    //Sapient generated method id: ${isWhenDefaultBranch}, hash: E52EB05A99BE43D6E36F47FE2BD2003F
    @Test()
    void isWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 227)) : false  #  inside <init> method
         */
        //Act Statement(s)
        CharRange result = CharRange.is('A');
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${isInWhenDefaultBranch}, hash: 6A1B18594CA01E6241008F8819EDD7C8
    @Test()
    void isInWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 227)) : false  #  inside <init> method
         */
        //Act Statement(s)
        CharRange result = CharRange.isIn('\uD85F', '\uD83D');
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${isNotWhenDefaultBranch}, hash: 6EC166213C6CF4CD8171D8A5B0B0E40B
    @Test()
    void isNotWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 227)) : false  #  inside <init> method
         */
        //Act Statement(s)
        CharRange result = CharRange.isNot('A');
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${isNotInWhenDefaultBranch}, hash: 7B5006CC329D272E0BB2CDC266DB5995
    @Test()
    void isNotInWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 227)) : false  #  inside <init> method
         */
        //Act Statement(s)
        CharRange result = CharRange.isNotIn('\uD85F', '\uD83D');
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${containsWhenChGreaterThanOrEqualsToStartAndChGreaterThanEnd}, hash: A7D36CCF8DA3F65C190DE88E7804C500
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

    //Sapient generated method id: ${containsWhenChLessThanStartAndChGreaterThanEnd}, hash: BA3AD8D97314B2CB30AB144429A4F062
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

    //Sapient generated method id: ${contains1WhenEndGreaterThanOrEqualsToRangeEnd}, hash: 5DDDA1B4D435FEFC91E46835B6C1A54B
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

    //Sapient generated method id: ${contains1WhenEndLessThanRangeEnd}, hash: BF43B45755352396941674BBDCB314C6
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

    //Sapient generated method id: ${iteratorTest}, hash: F82C7500018F374415D024D0FEF6B237
    @Test()
    void iteratorTest() {
        //Arrange Statement(s)
        CharRange target = CharRange.isIn('\uD85F', '\uD83D');
        //Act Statement(s)
        Iterator<Character> result = target.iterator();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${toStringWhenStartNotEqualsEnd}, hash: 8A8D65C731CC01E69CF87DF81FE10544
    @Disabled()
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
            assertThat(result, equalTo("^\uECE2-\uFBAD"));
            verify(target).isNegated();
        });
    }
}
