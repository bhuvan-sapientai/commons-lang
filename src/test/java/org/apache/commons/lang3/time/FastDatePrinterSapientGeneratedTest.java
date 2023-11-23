package org.apache.commons.lang3.time;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;
import java.util.TimeZone;
import java.text.FieldPosition;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FastDatePrinterSapientGeneratedTest {

    //Sapient generated method id: ${eceff685-4c22-3f8a-9c8c-cfb09f633b43}
    @Test()
    void parsePatternWhenTokenLenEquals0() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result.size(), equalTo(0));    verify(target).parseToken("pattern1", intArray);});
    }

    //Sapient generated method id: ${9c43faac-3dc9-30d6-9d55-a0d18f85e8a9}
    @Test()
    void parsePatternWhenSwitchCCase_E_() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 'E') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> fastDatePrinterRuleResultList = new ArrayList<>();
        //fastDatePrinterRuleResultList.add((FastDatePrinter.Iso8601_Rule) null);
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result.size(), equalTo(fastDatePrinterRuleResultList.size()));    assertThat(result, containsInRelativeOrder(fastDatePrinterRuleResultList.toArray()));    verify(target).parseToken("pattern1", intArray);});
    }

    //Sapient generated method id: ${c84834fd-7c4f-3757-8598-a6f16c844ebc}
    @Test()
    void parsePatternWhenSwitchCCase_K_() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 'K') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //doReturn(null).when(target).selectNumberRule(13, 0);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> fastDatePrinterRuleResultList = new ArrayList<>();
        //fastDatePrinterRuleResultList.add((FastDatePrinter.NumberRule) null);
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result.size(), equalTo(fastDatePrinterRuleResultList.size()));    assertThat(result, containsInRelativeOrder(fastDatePrinterRuleResultList.toArray()));    verify(target).parseToken("pattern1", intArray);    verify(target).selectNumberRule(13, 0);});
    }

    //Sapient generated method id: ${656797ac-f369-36f8-b5c2-82c431b3662a}
    @Test()
    void parsePatternWhenSwitchCCase_M_() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 'M') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //doReturn(null).when(target).selectNumberRule(8, 0);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> fastDatePrinterRuleResultList = new ArrayList<>();
        //fastDatePrinterRuleResultList.add((FastDatePrinter.NumberRule) null);
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result.size(), equalTo(fastDatePrinterRuleResultList.size()));    assertThat(result, containsInRelativeOrder(fastDatePrinterRuleResultList.toArray()));    verify(target).parseToken("pattern1", intArray);    verify(target).selectNumberRule(8, 0);});
    }

    //Sapient generated method id: ${90e4cd87-f794-3135-a370-b4c4ef2a1acb}
    @Test()
    void parsePatternWhenSwitchCCase_S_() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 'S') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //doReturn(null).when(target).selectNumberRule(4, 0);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> fastDatePrinterRuleResultList = new ArrayList<>();
        //fastDatePrinterRuleResultList.add((FastDatePrinter.NumberRule) null);
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result.size(), equalTo(fastDatePrinterRuleResultList.size()));    assertThat(result, containsInRelativeOrder(fastDatePrinterRuleResultList.toArray()));    verify(target).parseToken("pattern1", intArray);    verify(target).selectNumberRule(4, 0);});
    }

    //Sapient generated method id: ${2347a74a-4e3f-3599-8e4a-8fb066e2dba1}
    @Test()
    void parsePatternWhenSwitchCCase_W_() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 'W') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //doReturn(null).when(target).selectNumberRule(10, 0);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result, is(notNullValue()));    verify(target).parseToken("pattern1", intArray);    verify(target).selectNumberRule(10, 0);});
    }

    //Sapient generated method id: ${16a8e647-09e2-3d63-bb65-5fcdc9469176}
    @Test()
    void parsePatternWhenSwitchCCase_X_() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 'X') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //doReturn(null).when(target).selectNumberRule(7, 0);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result, is(notNullValue()));    verify(target).parseToken("pattern1", intArray);    verify(target).selectNumberRule(7, 0);});
    }

    //Sapient generated method id: ${f8c94544-2c63-3b65-8e94-b97a7ef7f901}
    @Test()
    void parsePatternWhenSwitchCCase_a_() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 'a') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //doReturn(null).when(target).selectNumberRule(11, 0);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result, is(notNullValue()));    verify(target).parseToken("pattern1", intArray);    verify(target).selectNumberRule(11, 0);});
    }

    //Sapient generated method id: ${2935b757-fcfe-3484-819b-682cb060516f}
    @Test()
    void parsePatternWhenSwitchCCase_d_() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 'd') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //doReturn(null).when(target).selectNumberRule(11, 0);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> fastDatePrinterRuleResultList = new ArrayList<>();
        //fastDatePrinterRuleResultList.add((FastDatePrinter.NumberRule) null);
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result.size(), equalTo(fastDatePrinterRuleResultList.size()));    assertThat(result, containsInRelativeOrder(fastDatePrinterRuleResultList.toArray()));    verify(target).parseToken("pattern1", intArray);    verify(target).selectNumberRule(11, 0);});
    }

    //Sapient generated method id: ${330d97a8-1340-36c1-9270-a4d2f5db89f7}
    @Test()
    void parsePatternWhenSwitchCCase_h_() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 'h') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //doReturn(null).when(target).selectNumberRule(10, 0);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> fastDatePrinterRuleResultList = new ArrayList<>();
        //fastDatePrinterRuleResultList.add((FastDatePrinter.NumberRule) null);
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result.size(), equalTo(fastDatePrinterRuleResultList.size()));    assertThat(result, containsInRelativeOrder(fastDatePrinterRuleResultList.toArray()));    verify(target).parseToken("pattern1", intArray);    verify(target).selectNumberRule(10, 0);});
    }

    //Sapient generated method id: ${71bc5f36-b489-37cc-babc-2db10a9abf73}
    @Test()
    void parsePatternWhenSwitchCCase_k_() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 'k') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //doReturn(null).when(target).selectNumberRule(12, 0);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> fastDatePrinterRuleResultList = new ArrayList<>();
        //fastDatePrinterRuleResultList.add((FastDatePrinter.NumberRule) null);
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result.size(), equalTo(fastDatePrinterRuleResultList.size()));    assertThat(result, containsInRelativeOrder(fastDatePrinterRuleResultList.toArray()));    verify(target).parseToken("pattern1", intArray);    verify(target).selectNumberRule(12, 0);});
    }

    //Sapient generated method id: ${53a7ea0d-845b-3b9a-b273-1b2f4dfc2c6f}
    @Test()
    void parsePatternWhenSwitchCCase_s_() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 's') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //doReturn(null).when(target).selectNumberRule(14, 0);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> fastDatePrinterRuleResultList = new ArrayList<>();
        //fastDatePrinterRuleResultList.add((FastDatePrinter.NumberRule) null);
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result.size(), equalTo(fastDatePrinterRuleResultList.size()));    assertThat(result, containsInRelativeOrder(fastDatePrinterRuleResultList.toArray()));    verify(target).parseToken("pattern1", intArray);    verify(target).selectNumberRule(14, 0);});
    }

    //Sapient generated method id: ${0b5bd955-2d47-3a02-9fc5-08c7efba83cd}
    @Test()
    void parsePatternWhenSwitchCCase_w_() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 'w') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //doReturn(null).when(target).selectNumberRule(5, 0);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> fastDatePrinterRuleResultList = new ArrayList<>();
        //fastDatePrinterRuleResultList.add((FastDatePrinter.NumberRule) null);
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result.size(), equalTo(fastDatePrinterRuleResultList.size()));    assertThat(result, containsInRelativeOrder(fastDatePrinterRuleResultList.toArray()));    verify(target).parseToken("pattern1", intArray);    verify(target).selectNumberRule(5, 0);});
    }

    //Sapient generated method id: ${c4eaf3de-88b2-361c-b15a-f782617c373f}
    @Test()
    void parsePatternWhenSwitchCCase_y_() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 'y' or switch(c) = 'Y') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //doReturn(null).when(target).selectNumberRule(6, 0);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> fastDatePrinterRuleResultList = new ArrayList<>();
        //fastDatePrinterRuleResultList.add((FastDatePrinter.NumberRule) null);
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result.size(), equalTo(fastDatePrinterRuleResultList.size()));    assertThat(result, containsInRelativeOrder(fastDatePrinterRuleResultList.toArray()));    verify(target).parseToken("pattern1", intArray);    verify(target).selectNumberRule(6, 0);});
    }

    //Sapient generated method id: ${a83c7709-f0a7-3b92-abd7-ddf9e0b7dc68}
    @Test()
    void parsePatternWhenSwitchCCase_z_() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 'z') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //doReturn(null).when(target).selectNumberRule(3, 0);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> fastDatePrinterRuleResultList = new ArrayList<>();
        //fastDatePrinterRuleResultList.add((FastDatePrinter.NumberRule) null);
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result.size(), equalTo(fastDatePrinterRuleResultList.size()));    assertThat(result, containsInRelativeOrder(fastDatePrinterRuleResultList.toArray()));    verify(target).parseToken("pattern1", intArray);    verify(target).selectNumberRule(3, 0);});
    }

    //Sapient generated method id: ${3d949dbd-f6d6-3b1f-9745-ead3dff8cb02}
    @Test()
    void parsePatternWhenSwitchCCaseDefaultThrowsIllegalArgumentException() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = default) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        ////Act Statement(s)//TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {    target.parsePattern();});
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result, is(notNullValue()));    assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));    verify(target).parseToken("pattern1", intArray);});
    }

    //Sapient generated method id: ${ee860329-743a-3d7a-80a6-41722e1b4599}
    @Test()
    void parsePatternWhenTokenLenEquals1() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 'D') : true
         * (tokenLen == 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //FastDatePrinter.TimeZoneNumberRule timeZoneNumberRule = FastDatePrinter.TimeZoneNumberRule.INSTANCE_NO_COLON;
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> fastDatePrinterRuleResultList = new ArrayList<>();
        //fastDatePrinterRuleResultList.add(timeZoneNumberRule);
        //Assert statement(s)
        //TODO: Please implement equals method in FastDatePrinter.TimeZoneNumberRule for verification to succeed or you need to adjust respective assertion statements
        //assertAll("result", () -> {    assertThat(result.size(), equalTo(fastDatePrinterRuleResultList.size()));    assertThat(result, containsInRelativeOrder(fastDatePrinterRuleResultList.toArray()));    verify(target).parseToken("pattern1", intArray);});
    }

    //Sapient generated method id: ${4d19517f-05b9-3a86-84f4-20c089bcb5f5}
    @Test()
    void parsePatternWhenSubLengthEquals1() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 'G') : true
         * (sub.length() == 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result, is(notNullValue()));    verify(target).parseToken("pattern1", intArray);});
    }

    //Sapient generated method id: ${c7545cb7-f8ca-3f7e-8c4d-debe68af99e5}
    @Test()
    void parsePatternWhenSubLengthNotEquals1() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 'G') : true
         * (sub.length() == 1) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result, is(notNullValue()));    verify(target).parseToken("pattern1", intArray);});
    }

    //Sapient generated method id: ${78179d06-7b2f-3d3f-a4d4-d035ca18cf71}
    @Test()
    void parsePatternWhenTokenLenGreaterThanOrEqualsTo4() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = '\'') : true
         * (tokenLen >= 4) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result, is(notNullValue()));    verify(target).parseToken("pattern1", intArray);});
    }

    //Sapient generated method id: ${b1405b55-44b0-3ffc-9fd3-c5cbbf88468b}
    @Test()
    void parsePatternWhenTokenLenLessThan4() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 'y' or switch(c) = 'Y') : true
         * (tokenLen < 4) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result, is(notNullValue()));    verify(target).parseToken("pattern1", intArray);});
    }

    //Sapient generated method id: ${4abfe09d-ec09-35c1-8a4a-20e468c45fa0}
    @Test()
    void parsePatternWhenCEquals_Y_() {
        /* Branches:
         * (i < length) : true
         * (tokenLen == 0) : false
         * (switch(c) = 'u') : true
         * (tokenLen == 2) : true
         * (c == 'Y') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //int[] intArray = new int[] { 0 };
        //doReturn("return_of_parseToken1").when(target).parseToken("pattern1", intArray);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //List<FastDatePrinter.Rule> result = target.parsePattern();
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result, is(notNullValue()));    verify(target).parseToken("pattern1", intArray);});
    }

    //Sapient generated method id: ${f4c51fa1-a138-34f8-9bf8-39719b3adb41}
    @Disabled()
    @Test()
    void parseTokenWhenPeekNotEqualsC() {
        /* Branches:
         * (c >= 'A') : true
         * (c <= 'Z') : false
         * (c >= 'a') : true
         * (c <= 'z') : true
         * (i + 1 < length) : true
         * (peek != c) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        int[] intArray = new int[]{0};
        //Act Statement(s)
        String result = target.parseToken("pattern1", intArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${ccf8081b-59d4-3999-8b21-d3892a17cad5}
    @Disabled()
    @Test()
    void parseTokenWhenPeekEqualsC() {
        /* Branches:
         * (c >= 'A') : true
         * (c <= 'Z') : false
         * (c >= 'a') : true
         * (c <= 'z') : true
         * (i + 1 < length) : true
         * (peek != c) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        int[] intArray = new int[]{1};
        //Act Statement(s)
        String result = target.parseToken("pattern1", intArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${a266ffa6-bd77-33ba-9180-13f3c31e0126}
    @Disabled()
    @Test()
    void parseTokenWhenPatternCharAtIPlus1Equals____() {
        /* Branches:
         * (c >= 'A') : true
         * (c <= 'Z') : false
         * (c >= 'a') : true
         * (c <= 'z') : false
         * (i < length) : true
         * (c == '\'') : true
         * (i + 1 < length) : true
         * (pattern.charAt(i + 1) == '\'') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        int[] intArray = new int[]{2};
        //Act Statement(s)
        String result = target.parseToken("pattern1", intArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${0c884aba-e921-3705-96c2-a06dcfdf2c86}
    @Disabled()
    @Test()
    void parseTokenWhenPatternCharAtIPlus1NotEquals____AndNotInLiteral() {
        /* Branches:
         * (c >= 'A') : true
         * (c <= 'Z') : false
         * (c >= 'a') : true
         * (c <= 'z') : false
         * (i < length) : true
         * (c == '\'') : true
         * (i + 1 < length) : true
         * (pattern.charAt(i + 1) == '\'') : false
         * (!inLiteral) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        int[] intArray = new int[]{1};
        //Act Statement(s)
        String result = target.parseToken("pattern1", intArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("'")));
    }

    //Sapient generated method id: ${81c651c4-b912-3b3f-b5c6-2568c51c1da0}
    @Disabled()
    @Test()
    void parseTokenWhenCLessThanOrEqualsTo_z_() {
        /* Branches:
         * (c >= 'A') : true
         * (c <= 'Z') : false
         * (c >= 'a') : true
         * (c <= 'z') : false
         * (i < length) : true
         * (c == '\'') : false
         * (!inLiteral) : true
         * (c >= 'A') : true
         * (c <= 'Z') : false
         * (c >= 'a') : true
         * (c <= 'z') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        int[] intArray = new int[]{-1};
        //Act Statement(s)
        String result = target.parseToken("pattern1", intArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("'")));
    }

    //Sapient generated method id: ${9339a2a3-bc2e-3a12-bb32-cf5cae9f51a5}
    @Disabled()
    @Test()
    void parseTokenWhenCGreaterThan_z_() {
        /* Branches:
         * (c >= 'A') : true
         * (c <= 'Z') : false
         * (c >= 'a') : true
         * (c <= 'z') : false
         * (i < length) : true
         * (c == '\'') : false
         * (!inLiteral) : true
         * (c >= 'A') : true
         * (c <= 'Z') : false
         * (c >= 'a') : true
         * (c <= 'z') : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        int[] intArray = new int[]{1};
        //Act Statement(s)
        String result = target.parseToken("pattern1", intArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${889d7113-cd40-3440-85a0-3c179e323e0d}
    @Test()
    void selectNumberRuleWhenSwitchPaddingCase1() {
        /* Branches:
         * (switch(padding) = 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //FastDatePrinter.NumberRule result = target.selectNumberRule(0, 0);
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${42f8353f-4309-376a-b984-577f4254c275}
    @Test()
    void selectNumberRuleWhenSwitchPaddingCase2() {
        /* Branches:
         * (switch(padding) = 2) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //FastDatePrinter.NumberRule result = target.selectNumberRule(0, 0);
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${3637872b-e720-3692-8734-7fa7fafdaac6}
    @Test()
    void selectNumberRuleWhenSwitchPaddingCaseDefault() {
        /* Branches:
         * (switch(padding) = default) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //FastDatePrinter.NumberRule result = target.selectNumberRule(0, 0);
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${fca6de8e-c8c0-3b0d-a4fd-831cf476fb31}
    @Disabled()
    @Test()
    void formatWhenObjInstanceOfDate() {
        /* Branches:
         * (obj instanceof Date) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        StringBuffer stringBuffer = new StringBuffer();
        Date date = new Date();
        StringBuffer stringBuffer2 = new StringBuffer();
        doReturn(stringBuffer).when(target).format(date, stringBuffer2);
        FieldPosition fieldPosition = new FieldPosition(0);
        //Act Statement(s)
        StringBuffer result = target.format((Object) date, stringBuffer2, fieldPosition);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(stringBuffer));
            verify(target).format(date, stringBuffer2);
        });
    }

    //Sapient generated method id: ${0e2fca03-32d5-31a6-aa1e-b7f336ce54df}
    @Disabled()
    @Test()
    void formatWhenObjInstanceOfCalendar() {
        /* Branches:
         * (obj instanceof Date) : false
         * (obj instanceof Calendar) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        doReturn(stringBuffer).when(target).format((Calendar) any(), eq(stringBuffer2));
        Calendar calendar = Calendar.getInstance();
        FieldPosition fieldPosition = new FieldPosition(0);
        //Act Statement(s)
        StringBuffer result = target.format((Object) calendar, stringBuffer2, fieldPosition);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(stringBuffer));
            verify(target).format((Calendar) any(), eq(stringBuffer2));
        });
    }

    //Sapient generated method id: ${4c328a53-6383-3445-9a31-9ed7c14a883f}
    @Disabled()
    @Test()
    void formatWhenObjInstanceOfLong() {
        /* Branches:
         * (obj instanceof Date) : false
         * (obj instanceof Calendar) : false
         * (obj instanceof Long) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        doReturn(stringBuffer).when(target).format(0L, stringBuffer2);
        FieldPosition fieldPosition = new FieldPosition(0);
        //Act Statement(s)
        StringBuffer result = target.format((Object) 0L, stringBuffer2, fieldPosition);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(stringBuffer));
            verify(target).format(0L, stringBuffer2);
        });
    }

    //Sapient generated method id: ${7ea2ba25-a27b-313b-bcbc-15ae8ed9b97b}
    @Disabled()
    @Test()
    void formatWhenObjNotInstanceOfLongThrowsIllegalArgumentException() {
        /* Branches:
         * (obj instanceof Date) : false
         * (obj instanceof Calendar) : false
         * (obj instanceof Long) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        Object object = new Object();
        StringBuffer stringBuffer = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(0);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.format(object, stringBuffer, fieldPosition);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${00416a84-323f-3ae8-aa38-862128707568}
    @Disabled()
    @Test()
    void format1WhenObjInstanceOfDate() throws IOException {
        /* Branches:
         * (obj instanceof Date) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        Date date = new Date();
        //Act Statement(s)
        String result = target.format((Object) date);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${6e70a525-1cdb-3778-b84c-8fc78e5a6de4}
    @Disabled()
    @Test()
    void format1WhenObjInstanceOfCalendar() throws IOException {
        /* Branches:
         * (obj instanceof Date) : false
         * (obj instanceof Calendar) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        Calendar calendar = Calendar.getInstance();
        //Act Statement(s)
        String result = target.format((Object) calendar);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${17fa5414-cf0a-3a22-8f5f-cc99dc545149}
    @Disabled()
    @Test()
    void format1WhenObjInstanceOfLong() throws IOException {
        /* Branches:
         * (obj instanceof Date) : false
         * (obj instanceof Calendar) : false
         * (obj instanceof Long) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        doReturn("return_of_format1").when(target).format(0L);
        //Act Statement(s)
        String result = target.format((Object) 0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_format1"));
            verify(target).format(0L);
        });
    }

    //Sapient generated method id: ${274d0ae0-b96e-3304-b56e-eba4e2e12395}
    @Disabled()
    @Test()
    void format1WhenObjNotInstanceOfLongThrowsIllegalArgumentException() {
        /* Branches:
         * (obj instanceof Date) : false
         * (obj instanceof Calendar) : false
         * (obj instanceof Long) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        Object object = new Object();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.format(object);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${0b2bf043-9c73-3f26-b5d5-36102d1bcdfb}
    @Disabled()
    @Test()
    void format2WhenRulesIsEmpty() throws IOException {
        /* Branches:
         * (for-each(rules)) : false  #  inside applyRules method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        //Act Statement(s)
        String result = target.format(0L);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }

    //Sapient generated method id: ${ed173e0a-d4bc-3752-9660-f86adfed6b1e}
    @Disabled()
    @Test()
    void format3WhenRulesIsEmpty() throws IOException {
        /* Branches:
         * (for-each(rules)) : false  #  inside applyRules method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        Date date = new Date();
        //Act Statement(s)
        String result = target.format(date);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }

    //Sapient generated method id: ${3612aa57-1eb2-3d0d-9cca-fef59552b16f}
    @Disabled()
    @Test()
    void format4Test() throws IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        doReturn(stringBuilder).when(target).format((Calendar) any(), eq(stringBuilder2));
        Calendar calendar = Calendar.getInstance();
        //Act Statement(s)
        String result = target.format(calendar);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(target).format((Calendar) any(), eq(stringBuilder2));
        });
    }

    //Sapient generated method id: ${43fa53a3-cb6a-33e5-9520-348ec399d4da}
    @Test()
    void format5Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //StringBuffer stringBuffer = new StringBuffer();
        //StringBuffer stringBuffer2 = new StringBuffer();
        //TODO: Please change the modifier of applyRules from private to default to isolate the test case scenario
        //doReturn(stringBuffer).when(target).applyRules((Calendar) any(), eq(stringBuffer2));
        //Act Statement(s)
        //StringBuffer result = target.format(0L, stringBuffer2);
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, equalTo(stringBuffer)));
    }

    //Sapient generated method id: ${7645e822-384a-31ee-88cb-323c31841239}
    @Test()
    void format6Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TimeZone timeZone = TimeZone.getDefault();
        //Locale locale = new Locale("language1");
        //FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        //StringBuffer stringBuffer = new StringBuffer();
        //StringBuffer stringBuffer2 = new StringBuffer();
        //TODO: Please change the modifier of applyRules from private to default to isolate the test case scenario
        //doReturn(stringBuffer).when(target).applyRules((Calendar) any(), eq(stringBuffer2));
        //Date date = new Date();
        //Act Statement(s)
        //StringBuffer result = target.format(date, stringBuffer2);
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, equalTo(stringBuffer)));
    }

    //Sapient generated method id: ${d137a877-9e47-3cf5-8fac-23e9d327b517}
    @Disabled()
    @Test()
    void format7Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = spy(new FastDatePrinter("pattern1", timeZone, locale));
        StringBuffer stringBuffer = new StringBuffer();
        Date date = new Date();
        StringBuffer stringBuffer2 = new StringBuffer();
        doReturn(stringBuffer).when(target).format(date, stringBuffer2);
        Calendar calendar = Calendar.getInstance();
        //Act Statement(s)
        StringBuffer result = target.format(calendar, stringBuffer2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(stringBuffer));
            verify(target).format(date, stringBuffer2);
        });
    }

    //Sapient generated method id: ${db6abf2b-33f6-3a24-ad83-a9b9c11d0cc2}
    @Disabled()
    @Test()
    void format8WhenRulesIsEmpty() throws IOException {
        /* Branches:
         * (for-each(rules)) : false  #  inside applyRules method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        //TODO: Needs initialization with real value
        Appendable appendable = null;
        //Act Statement(s)
        Appendable result = target.format(0L, appendable);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(appendable)));
    }

    //Sapient generated method id: ${1d3f433f-4f99-3711-be4c-bbb5295c55c7}
    @Disabled()
    @Test()
    void format9WhenRulesIsEmpty() throws IOException {
        /* Branches:
         * (for-each(rules)) : false  #  inside applyRules method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        Date date = new Date();
        //TODO: Needs initialization with real value
        Appendable appendable = null;
        //Act Statement(s)
        Appendable result = target.format(date, appendable);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(appendable)));
    }

    //Sapient generated method id: ${394c9b8a-4139-3437-9b80-c2145d84594a}
    @Disabled()
    @Test()
    void format10WhenRulesIsEmpty() throws IOException {
        /* Branches:
         * (!calendar.getTimeZone().equals(timeZone)) : true
         * (for-each(rules)) : false  #  inside applyRules method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        Calendar calendar = Calendar.getInstance();
        //TODO: Needs initialization with real value
        Appendable appendable = null;
        //Act Statement(s)
        Appendable result = target.format(calendar, appendable);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(appendable)));
    }

    //Sapient generated method id: ${6a9dc1c7-3b2f-37c3-a35b-df9925020e9b}
    @Disabled()
    @Test()
    void format10WhenCaughtIOException() throws IOException {
        /* Branches:
         * (!calendar.getTimeZone().equals(timeZone)) : true
         * (for-each(rules)) : false  #  inside applyRules method
         * (catch-exception (IOException)) : true  #  inside applyRules method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        Calendar calendar = Calendar.getInstance();
        //TODO: Needs initialization with real value
        Appendable appendable = null;
        //Act Statement(s)
        Appendable result = target.format(calendar, appendable);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(appendable)));
    }

    //Sapient generated method id: ${a1cf6001-b515-3bd6-8ab4-1fd6aefb50e3}
    @Disabled()
    @Test()
    void applyRulesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        Calendar calendar = Calendar.getInstance();
        StringBuffer stringBuffer = new StringBuffer();
        //Act Statement(s)
        StringBuffer result = target.applyRules(calendar, stringBuffer);
        StringBuffer stringBuffer2 = new StringBuffer();
        //Assert statement(s)
        //TODO: Please implement equals method in StringBuffer for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(stringBuffer2)));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Disabled()
    @Test()
    void toStringTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        FastDatePrinter target = new FastDatePrinter("pattern1", timeZone, locale);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${00f96403-d6f5-38dd-a4d3-4a30da3db460}
    @Disabled()
    @Test()
    void getTimeZoneDisplayTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = new Locale("language1");
        //Act Statement(s)
        String result = FastDatePrinter.getTimeZoneDisplay(timeZone, true, 1, locale);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }
}
