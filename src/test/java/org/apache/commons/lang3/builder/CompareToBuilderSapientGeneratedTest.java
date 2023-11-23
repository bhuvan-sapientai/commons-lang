package org.apache.commons.lang3.builder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.Comparator;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.spy;
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

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CompareToBuilderSapientGeneratedTest {

    //Sapient generated method id: ${334e48f0-54a6-3a70-9e63-300a93b74b18}
    @Test()
    void reflectionCompareTest() {
        //Arrange Statement(s)
        try (MockedStatic<CompareToBuilder> compareToBuilder = mockStatic(CompareToBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            String[] stringArray = new String[]{};
            compareToBuilder.when(() -> CompareToBuilder.reflectionCompare(object, object2, false, (Class) null, stringArray)).thenReturn(0);
            //Act Statement(s)
            int result = CompareToBuilder.reflectionCompare(object, object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                compareToBuilder.verify(() -> CompareToBuilder.reflectionCompare(object, object2, false, (Class) null, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${316c706e-056f-3d37-af86-38bce3b5724d}
    @Test()
    void reflectionCompare1Test() {
        //Arrange Statement(s)
        try (MockedStatic<CompareToBuilder> compareToBuilder = mockStatic(CompareToBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            String[] stringArray = new String[]{};
            compareToBuilder.when(() -> CompareToBuilder.reflectionCompare(object, object2, false, (Class) null, stringArray)).thenReturn(0);
            //Act Statement(s)
            int result = CompareToBuilder.reflectionCompare(object, object2, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                compareToBuilder.verify(() -> CompareToBuilder.reflectionCompare(object, object2, false, (Class) null, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4989e80b-a67f-3b61-877a-44303931ea57}
    @Test()
    void reflectionCompare2WhenLhsEqualsRhs() {
        /* Branches:
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        String[] stringArray = new String[]{};
        //Act Statement(s)
        int result = CompareToBuilder.reflectionCompare(object, object, false, Object.class, stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${61ec8f60-2fda-366e-8c44-975437544e71}
    @Disabled()
    @Test()
    void reflectionCompare2WhenLhsClazzNotIsInstanceRhsThrowsClassCastException() {
        /* Branches:
         * (lhs == rhs) : false
         * (!lhsClazz.isInstance(rhs)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        String[] stringArray = new String[]{};
        //Act Statement(s)
        final ClassCastException result = assertThrows(ClassCastException.class, () -> {
            CompareToBuilder.reflectionCompare(object, object2, false, Object.class, stringArray);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${2b948d3c-9c16-35e9-bd2a-010454a7c364}
    @Test()
    void reflectionCompare2WhenLhsClazzNotEqualsReflectUpToClass() {
        /* Branches:
         * (lhs == rhs) : false
         * (!lhsClazz.isInstance(rhs)) : false
         * (i < fields.length) : true  #  inside reflectionAppend method
         * (builder.comparison == 0) : true  #  inside reflectionAppend method
         * (!ArrayUtils.contains(excludeFields, field.getName())) : true  #  inside reflectionAppend method
         * (!field.getName().contains("$")) : true  #  inside reflectionAppend method
         * (useTransients) : false  #  inside reflectionAppend method
         * (!Modifier.isStatic(field.getModifiers())) : true  #  inside reflectionAppend method
         * (lhsClazz.getSuperclass() != null) : true
         * (lhsClazz != reflectUpToClass) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        String[] stringArray = new String[]{};
        //Act Statement(s)
        int result = CompareToBuilder.reflectionCompare(object, object2, false, Object.class, stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${41015688-0d2c-337b-a6d3-556bfe2d115c}
    @Test()
    void reflectionCompare3Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CompareToBuilder> compareToBuilder = mockStatic(CompareToBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            String[] stringArray = new String[]{};
            compareToBuilder.when(() -> CompareToBuilder.reflectionCompare(object, object2, stringArray)).thenReturn(0);
            Collection<String> collection = new ArrayList<>();
            //Act Statement(s)
            int result = CompareToBuilder.reflectionCompare(object, object2, collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                compareToBuilder.verify(() -> CompareToBuilder.reflectionCompare(object, object2, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ae88d79d-c3c7-33b6-9de5-afeb0a48399b}
    @Test()
    void reflectionCompare4Test() {
        //Arrange Statement(s)
        try (MockedStatic<CompareToBuilder> compareToBuilder = mockStatic(CompareToBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            String[] stringArray = new String[]{};
            compareToBuilder.when(() -> CompareToBuilder.reflectionCompare(object, object2, false, (Class) null, stringArray)).thenReturn(0);
            //Act Statement(s)
            int result = CompareToBuilder.reflectionCompare(object, object2, stringArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                compareToBuilder.verify(() -> CompareToBuilder.reflectionCompare(object, object2, false, (Class) null, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${de7ceec1-39f6-3111-93fb-66ee95dd4d19}
    @Test()
    void appendWhenLhsEqualsRhs() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        //Act Statement(s)
        CompareToBuilder result = target.append(false, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${52da5d75-e6bb-3291-86db-1dc8f01a09ee}
    @Test()
    void appendWhenLhs() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        //Act Statement(s)
        CompareToBuilder result = target.append(true, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${98d2c5fa-62ab-3410-8313-1934f6beca88}
    @Test()
    void appendWhenNotLhs() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs) : false
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        //Act Statement(s)
        CompareToBuilder result = target.append(false, true);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${f8f78d16-6888-32df-bf84-c97b250be4e3}
    @Test()
    void append1WhenLhsEqualsRhs() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        boolean[] booleanArray = new boolean[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(booleanArray, booleanArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${c7fb12ff-b9e9-367a-acac-77a705f7b3a7}
    @Test()
    void append1WhenLhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        boolean[] _boolean = null;
        boolean[] booleanArray = new boolean[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(_boolean, booleanArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${9c68bd6c-85aa-3324-aeab-b629c3129f0e}
    @Test()
    void append1WhenRhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        boolean[] booleanArray = new boolean[]{};
        boolean[] _boolean = null;
        //Act Statement(s)
        CompareToBuilder result = target.append(booleanArray, _boolean);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${695967f2-0ff7-3b77-aed4-e5dc39fd1abf}
    @Test()
    void append1WhenLhsLengthLessThanRhsLength() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         * (lhs.length < rhs.length) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        boolean[] booleanArray = new boolean[]{};
        boolean[] booleanArray2 = new boolean[]{false};
        //Act Statement(s)
        CompareToBuilder result = target.append(booleanArray, booleanArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${1881b881-3409-3c2e-aefd-1ac332152989}
    @Test()
    void append1WhenLhsLengthNotLessThanRhsLength() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         * (lhs.length < rhs.length) : false
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        boolean[] booleanArray = new boolean[]{false};
        boolean[] booleanArray2 = new boolean[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(booleanArray, booleanArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${e0f446fb-089c-3555-bbcb-dfc365fb58ee}
    @Test()
    void append1WhenComparisonEquals0() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : false
         * (i < lhs.length) : true
         * (comparison == 0) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        doReturn(compareToBuilder).when(target).append(false, false);
        boolean[] booleanArray = new boolean[]{false};
        boolean[] booleanArray2 = new boolean[]{false};
        //Act Statement(s)
        CompareToBuilder result = target.append(booleanArray, booleanArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(false, false);
        });
    }

    //Sapient generated method id: ${a5feebcb-ec83-3bac-bb38-ad0dc0616d8f}
    @Test()
    void append2WhenComparisonEquals0() {
        /* Branches:
         * (comparison != 0) : false
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        //Act Statement(s)
        CompareToBuilder result = target.append((byte) 1, (byte) 1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${9abbe0f4-e7df-3d4d-a5ef-2a0f7ab19738}
    @Test()
    void append3WhenLhsEqualsRhs() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(byteArray, byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${d646cc9b-b992-326e-b318-c4468a054efb}
    @Test()
    void append3WhenLhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        byte[] _byte = null;
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(_byte, byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${16155463-8c4f-3fcd-85bf-64754923cc3c}
    @Test()
    void append3WhenRhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        byte[] byteArray = new byte[]{};
        byte[] _byte = null;
        //Act Statement(s)
        CompareToBuilder result = target.append(byteArray, _byte);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${b845fc9f-4e05-3c3c-b4f6-e5d7e3737f6e}
    @Test()
    void append3WhenLhsLengthLessThanRhsLength() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         * (lhs.length < rhs.length) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        byte[] byteArray = new byte[]{};
        byte[] byteArray2 = new byte[]{(byte) 0};
        //Act Statement(s)
        CompareToBuilder result = target.append(byteArray, byteArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${e70676da-f8c3-37c7-820a-de9dcb977b01}
    @Test()
    void append3WhenLhsLengthNotLessThanRhsLength() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         * (lhs.length < rhs.length) : false
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        byte[] byteArray = new byte[]{(byte) 0};
        byte[] byteArray2 = new byte[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(byteArray, byteArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${96825053-5ae4-3e57-85af-a3bd2a62d415}
    @Test()
    void append3WhenComparisonEquals0() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : false
         * (i < lhs.length) : true
         * (comparison == 0) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        doReturn(compareToBuilder).when(target).append((byte) 0, (byte) 0);
        byte[] byteArray = new byte[]{(byte) 0};
        byte[] byteArray2 = new byte[]{(byte) 0};
        //Act Statement(s)
        CompareToBuilder result = target.append(byteArray, byteArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append((byte) 0, (byte) 0);
        });
    }

    //Sapient generated method id: ${1fb4ff06-dfa2-3a11-8c0e-610c53afd237}
    @Test()
    void append4WhenComparisonEquals0() {
        /* Branches:
         * (comparison != 0) : false
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        //Act Statement(s)
        CompareToBuilder result = target.append('A', 'A');
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${7c97f58c-4231-35ef-973b-890714c96012}
    @Test()
    void append5WhenLhsEqualsRhs() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        char[] charArray = new char[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(charArray, charArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${58a9f075-b783-3fea-a9f3-d159fc350ba6}
    @Test()
    void append5WhenLhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        char[] _char = null;
        char[] charArray = new char[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(_char, charArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${942e76a9-a3b2-350a-9fec-710be3481701}
    @Test()
    void append5WhenRhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        char[] charArray = new char[]{};
        char[] _char = null;
        //Act Statement(s)
        CompareToBuilder result = target.append(charArray, _char);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${7ec7e12d-9b6f-3117-a6e6-4655bed571b1}
    @Test()
    void append5WhenLhsLengthLessThanRhsLength() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         * (lhs.length < rhs.length) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        char[] charArray = new char[]{};
        char[] charArray2 = new char[]{'A'};
        //Act Statement(s)
        CompareToBuilder result = target.append(charArray, charArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${bd8ace59-a8f0-39f6-adcf-73e855f2ea15}
    @Test()
    void append5WhenLhsLengthNotLessThanRhsLength() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         * (lhs.length < rhs.length) : false
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        char[] charArray = new char[]{'A'};
        char[] charArray2 = new char[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(charArray, charArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${d4a1305e-e1df-30a3-b460-ac970ba223e6}
    @Test()
    void append5WhenComparisonEquals0() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : false
         * (i < lhs.length) : true
         * (comparison == 0) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        doReturn(compareToBuilder).when(target).append('A', 'A');
        char[] charArray = new char[]{'A'};
        char[] charArray2 = new char[]{'A'};
        //Act Statement(s)
        CompareToBuilder result = target.append(charArray, charArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append('A', 'A');
        });
    }

    //Sapient generated method id: ${dffc81bb-9141-3dd0-8bb3-5152b1ab7426}
    @Test()
    void append6WhenComparisonEquals0() {
        /* Branches:
         * (comparison != 0) : false
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        //Act Statement(s)
        CompareToBuilder result = target.append(Double.parseDouble("1.0"), Double.parseDouble("1.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${2cde6ee8-0201-33f6-b798-934a59579e25}
    @Test()
    void append7WhenLhsEqualsRhs() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        double[] doubleArray = new double[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(doubleArray, doubleArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${f13efe0c-f03c-373b-91da-5731da0b8c7c}
    @Test()
    void append7WhenLhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        double[] _double = null;
        double[] doubleArray = new double[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(_double, doubleArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${9e1b9dfc-02ea-3b55-a530-86ad256a3131}
    @Test()
    void append7WhenRhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        double[] doubleArray = new double[]{};
        double[] _double = null;
        //Act Statement(s)
        CompareToBuilder result = target.append(doubleArray, _double);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${a554bd3b-d543-3be5-9c8e-5b5c9ffb5dbd}
    @Test()
    void append7WhenLhsLengthLessThanRhsLength() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         * (lhs.length < rhs.length) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        double[] doubleArray = new double[]{};
        double[] doubleArray2 = new double[]{Double.parseDouble("0")};
        //Act Statement(s)
        CompareToBuilder result = target.append(doubleArray, doubleArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${f65f9087-7e84-37dd-a1ea-90a46df91be6}
    @Test()
    void append7WhenLhsLengthNotLessThanRhsLength() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         * (lhs.length < rhs.length) : false
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        double[] doubleArray = new double[]{Double.parseDouble("0")};
        double[] doubleArray2 = new double[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(doubleArray, doubleArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${0895a5c3-733b-3986-bc29-53befea9a682}
    @Test()
    void append7WhenComparisonEquals0() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : false
         * (i < lhs.length) : true
         * (comparison == 0) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        doReturn(compareToBuilder).when(target).append(Double.parseDouble("0"), Double.parseDouble("0"));
        double[] doubleArray = new double[]{Double.parseDouble("0")};
        double[] doubleArray2 = new double[]{Double.parseDouble("0")};
        //Act Statement(s)
        CompareToBuilder result = target.append(doubleArray, doubleArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(Double.parseDouble("0"), Double.parseDouble("0"));
        });
    }

    //Sapient generated method id: ${116e5d83-275f-35d2-90a8-a067034f26ae}
    @Test()
    void append8WhenComparisonEquals0() {
        /* Branches:
         * (comparison != 0) : false
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        //Act Statement(s)
        CompareToBuilder result = target.append(Float.parseFloat("1.0"), Float.parseFloat("1.0"));
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${a1ccc2e5-eb12-3115-8ebf-8876b027ecf1}
    @Test()
    void append9WhenLhsEqualsRhs() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        float[] floatArray = new float[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(floatArray, floatArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${025cd1e5-0373-3ec8-95af-cf820afe0b16}
    @Test()
    void append9WhenLhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        float[] _float = null;
        float[] floatArray = new float[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(_float, floatArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${65e11fdb-f983-34e2-a28f-0a2f539c46c0}
    @Test()
    void append9WhenRhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        float[] floatArray = new float[]{};
        float[] _float = null;
        //Act Statement(s)
        CompareToBuilder result = target.append(floatArray, _float);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${3f037270-1a1e-38a0-b242-54c3f5637a19}
    @Test()
    void append9WhenLhsLengthLessThanRhsLength() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         * (lhs.length < rhs.length) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        float[] floatArray = new float[]{};
        float[] floatArray2 = new float[]{Float.parseFloat("0")};
        //Act Statement(s)
        CompareToBuilder result = target.append(floatArray, floatArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${b19724c2-7189-3d1d-ba55-d352def4bb39}
    @Test()
    void append9WhenLhsLengthNotLessThanRhsLength() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         * (lhs.length < rhs.length) : false
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        float[] floatArray = new float[]{Float.parseFloat("0")};
        float[] floatArray2 = new float[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(floatArray, floatArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${a2ae39fe-7136-3113-b96f-ec5f17143741}
    @Test()
    void append9WhenComparisonEquals0() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : false
         * (i < lhs.length) : true
         * (comparison == 0) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        doReturn(compareToBuilder).when(target).append(Float.parseFloat("0"), Float.parseFloat("0"));
        float[] floatArray = new float[]{Float.parseFloat("0")};
        float[] floatArray2 = new float[]{Float.parseFloat("0")};
        //Act Statement(s)
        CompareToBuilder result = target.append(floatArray, floatArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(Float.parseFloat("0"), Float.parseFloat("0"));
        });
    }

    //Sapient generated method id: ${5710108c-1378-347f-aa37-fe9573fa27b6}
    @Test()
    void append10WhenComparisonEquals0() {
        /* Branches:
         * (comparison != 0) : false
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        //Act Statement(s)
        CompareToBuilder result = target.append(1, 1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${981b95ef-d0c2-37aa-8380-a04c5a572892}
    @Test()
    void append11WhenLhsEqualsRhs() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        int[] intArray = new int[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(intArray, intArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${7a025ff4-b363-39b7-90b5-94af864a6fbf}
    @Test()
    void append11WhenLhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        int[] _int = null;
        int[] intArray = new int[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(_int, intArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${6260ba8e-c1a5-3fde-997f-b7e70d42a9db}
    @Test()
    void append11WhenRhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        int[] intArray = new int[]{};
        int[] _int = null;
        //Act Statement(s)
        CompareToBuilder result = target.append(intArray, _int);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${a3d46b63-a75d-3c95-89c8-214eed588ead}
    @Test()
    void append11WhenLhsLengthLessThanRhsLength() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         * (lhs.length < rhs.length) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        int[] intArray = new int[]{};
        int[] intArray2 = new int[]{0};
        //Act Statement(s)
        CompareToBuilder result = target.append(intArray, intArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${0ba8f741-ef7c-3646-93c3-d61d2b2b05b7}
    @Test()
    void append11WhenLhsLengthNotLessThanRhsLength() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         * (lhs.length < rhs.length) : false
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        int[] intArray = new int[]{0};
        int[] intArray2 = new int[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(intArray, intArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${e4587ae4-b4ea-3de9-8bf2-c21c5d854f5d}
    @Test()
    void append11WhenComparisonEquals0() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : false
         * (i < lhs.length) : true
         * (comparison == 0) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        doReturn(compareToBuilder).when(target).append(0, 0);
        int[] intArray = new int[]{0};
        int[] intArray2 = new int[]{0};
        //Act Statement(s)
        CompareToBuilder result = target.append(intArray, intArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(0, 0);
        });
    }

    //Sapient generated method id: ${17eef76a-c6ad-36c6-8045-93c2e01aced9}
    @Test()
    void append12WhenComparisonEquals0() {
        /* Branches:
         * (comparison != 0) : false
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        //Act Statement(s)
        CompareToBuilder result = target.append(1L, 1L);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${2d9134dc-0125-31da-b105-b4a0b1fa4ac5}
    @Test()
    void append13WhenLhsEqualsRhs() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        long[] longArray = new long[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(longArray, longArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${fc84c18d-ab3e-37a5-afff-bc5bc0058031}
    @Test()
    void append13WhenLhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        long[] _long = null;
        long[] longArray = new long[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(_long, longArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${ebc222f7-7841-3925-82d2-1c076bad4b04}
    @Test()
    void append13WhenRhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        long[] longArray = new long[]{};
        long[] _long = null;
        //Act Statement(s)
        CompareToBuilder result = target.append(longArray, _long);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${f11ef3fb-2dc6-3a08-8673-4ca8469893a8}
    @Test()
    void append13WhenLhsLengthLessThanRhsLength() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         * (lhs.length < rhs.length) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        long[] longArray = new long[]{};
        long[] longArray2 = new long[]{0L};
        //Act Statement(s)
        CompareToBuilder result = target.append(longArray, longArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${2f76ee2a-83cd-3bf8-a523-8a01b1114f0a}
    @Test()
    void append13WhenLhsLengthNotLessThanRhsLength() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         * (lhs.length < rhs.length) : false
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        long[] longArray = new long[]{0L};
        long[] longArray2 = new long[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(longArray, longArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${297adc8d-ae02-31ec-82ab-f73376a05797}
    @Test()
    void append13WhenComparisonEquals0() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : false
         * (i < lhs.length) : true
         * (comparison == 0) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        doReturn(compareToBuilder).when(target).append(0L, 0L);
        long[] longArray = new long[]{0L};
        long[] longArray2 = new long[]{0L};
        //Act Statement(s)
        CompareToBuilder result = target.append(longArray, longArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(0L, 0L);
        });
    }

    //Sapient generated method id: ${d34dd394-f8d8-3d1a-aadc-ba03c32a90a6}
    @Test()
    void append14Test() {
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        Object object = new Object();
        Object object2 = new Object();
        doReturn(compareToBuilder).when(target).append(object, object2, (Comparator) null);
        //Act Statement(s)
        CompareToBuilder result = target.append(object, object2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(compareToBuilder));
            verify(target).append(object, object2, (Comparator) null);
        });
    }

    //Sapient generated method id: ${5bf69fd7-1fcb-349c-8e59-9840426e1ceb}
    @Test()
    void append15WhenLhsEqualsRhs() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        Object object = new Object();
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append(object, object, comparator);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${10829bc8-60ea-3596-869a-cd9524b8d6bb}
    @Test()
    void append15WhenLhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        Object object = null;
        Object object2 = new Object();
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append(object, object2, comparator);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${068a4ae9-d63c-3c56-8eaf-6d2a55a77139}
    @Test()
    void append15WhenRhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        Object object = new Object();
        Object object2 = null;
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append(object, object2, comparator);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${57e53044-134e-3621-a135-9230df2f7f0b}
    @Test()
    void append15WhenLhsInstanceOfLongArray() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (ObjectUtils.isArray(lhs)) : true
         * (lhs instanceof long[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        long[] longArray = new long[]{};
        long[] longArray2 = new long[]{};
        doReturn(compareToBuilder).when(target).append(longArray, longArray2);
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append((Object) longArray, (Object) longArray2, comparator);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(longArray, longArray2);
        });
    }

    //Sapient generated method id: ${d58291de-4ba8-3e79-8559-ecca177f83dd}
    @Test()
    void append15WhenComparatorIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (ObjectUtils.isArray(lhs)) : false
         * (comparator == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        //TODO: Needs initialization with real value
        Comparable<Object> comparable = null;
        Object object = new Object();
        Comparator<?> comparator = null;
        //Act Statement(s)
        CompareToBuilder result = target.append((Object) comparable, object, comparator);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${475e2aaa-2ac8-3a79-9dfd-4a8e92e95a2e}
    @Disabled()
    @Test()
    void append15WhenComparatorIsNotNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (ObjectUtils.isArray(lhs)) : false
         * (comparator == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        Object object = new Object();
        Object object2 = new Object();
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append(object, object2, comparator);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${0d9fa314-674a-3304-82a1-f84573651e3f}
    @Test()
    void append15WhenLhsInstanceOfIntArray() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (ObjectUtils.isArray(lhs)) : true
         * (lhs instanceof long[]) : false  #  inside appendArray method
         * (lhs instanceof int[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        int[] intArray = new int[]{};
        int[] intArray2 = new int[]{};
        doReturn(compareToBuilder).when(target).append(intArray, intArray2);
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append((Object) intArray, (Object) intArray2, comparator);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(intArray, intArray2);
        });
    }

    //Sapient generated method id: ${a462c2c3-a92f-3660-bfef-cdaefc5dd6b0}
    @Test()
    void append15WhenLhsInstanceOfShortArray() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (ObjectUtils.isArray(lhs)) : true
         * (lhs instanceof long[]) : false  #  inside appendArray method
         * (lhs instanceof int[]) : false  #  inside appendArray method
         * (lhs instanceof short[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        short[] shortArray = new short[]{};
        short[] shortArray2 = new short[]{};
        doReturn(compareToBuilder).when(target).append(shortArray, shortArray2);
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append((Object) shortArray, (Object) shortArray2, comparator);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(shortArray, shortArray2);
        });
    }

    //Sapient generated method id: ${a3a23d74-8412-3da4-9b89-94d59d2ab1c7}
    @Test()
    void append15WhenLhsInstanceOfCharArray() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (ObjectUtils.isArray(lhs)) : true
         * (lhs instanceof long[]) : false  #  inside appendArray method
         * (lhs instanceof int[]) : false  #  inside appendArray method
         * (lhs instanceof short[]) : false  #  inside appendArray method
         * (lhs instanceof char[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        char[] charArray = new char[]{};
        char[] charArray2 = new char[]{};
        doReturn(compareToBuilder).when(target).append(charArray, charArray2);
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append((Object) charArray, (Object) charArray2, comparator);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(charArray, charArray2);
        });
    }

    //Sapient generated method id: ${e57cd3e4-8913-3d56-8d5f-c31d0b156768}
    @Test()
    void append15WhenLhsInstanceOfByteArray() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (ObjectUtils.isArray(lhs)) : true
         * (lhs instanceof long[]) : false  #  inside appendArray method
         * (lhs instanceof int[]) : false  #  inside appendArray method
         * (lhs instanceof short[]) : false  #  inside appendArray method
         * (lhs instanceof char[]) : false  #  inside appendArray method
         * (lhs instanceof byte[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        byte[] byteArray = new byte[]{};
        byte[] byteArray2 = new byte[]{};
        doReturn(compareToBuilder).when(target).append(byteArray, byteArray2);
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append((Object) byteArray, (Object) byteArray2, comparator);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(byteArray, byteArray2);
        });
    }

    //Sapient generated method id: ${64eb6492-8eec-3a02-a2cf-997ed79c1744}
    @Test()
    void append15WhenLhsInstanceOfDoubleArray() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (ObjectUtils.isArray(lhs)) : true
         * (lhs instanceof long[]) : false  #  inside appendArray method
         * (lhs instanceof int[]) : false  #  inside appendArray method
         * (lhs instanceof short[]) : false  #  inside appendArray method
         * (lhs instanceof char[]) : false  #  inside appendArray method
         * (lhs instanceof byte[]) : false  #  inside appendArray method
         * (lhs instanceof double[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        double[] doubleArray = new double[]{};
        double[] doubleArray2 = new double[]{};
        doReturn(compareToBuilder).when(target).append(doubleArray, doubleArray2);
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append((Object) doubleArray, (Object) doubleArray2, comparator);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(doubleArray, doubleArray2);
        });
    }

    //Sapient generated method id: ${d77067a3-f24d-3ef4-bcd0-475c5c8c38e5}
    @Test()
    void append15WhenLhsInstanceOfFloatArray() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (ObjectUtils.isArray(lhs)) : true
         * (lhs instanceof long[]) : false  #  inside appendArray method
         * (lhs instanceof int[]) : false  #  inside appendArray method
         * (lhs instanceof short[]) : false  #  inside appendArray method
         * (lhs instanceof char[]) : false  #  inside appendArray method
         * (lhs instanceof byte[]) : false  #  inside appendArray method
         * (lhs instanceof double[]) : false  #  inside appendArray method
         * (lhs instanceof float[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        float[] floatArray = new float[]{};
        float[] floatArray2 = new float[]{};
        doReturn(compareToBuilder).when(target).append(floatArray, floatArray2);
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append((Object) floatArray, (Object) floatArray2, comparator);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(floatArray, floatArray2);
        });
    }

    //Sapient generated method id: ${eae587f9-d31d-3b7f-9d8a-2b81b3c0193f}
    @Test()
    void append15WhenLhsInstanceOfBooleanArray() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (ObjectUtils.isArray(lhs)) : true
         * (lhs instanceof long[]) : false  #  inside appendArray method
         * (lhs instanceof int[]) : false  #  inside appendArray method
         * (lhs instanceof short[]) : false  #  inside appendArray method
         * (lhs instanceof char[]) : false  #  inside appendArray method
         * (lhs instanceof byte[]) : false  #  inside appendArray method
         * (lhs instanceof double[]) : false  #  inside appendArray method
         * (lhs instanceof float[]) : false  #  inside appendArray method
         * (lhs instanceof boolean[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        boolean[] booleanArray = new boolean[]{};
        boolean[] booleanArray2 = new boolean[]{};
        doReturn(compareToBuilder).when(target).append(booleanArray, booleanArray2);
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append((Object) booleanArray, (Object) booleanArray2, comparator);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(booleanArray, booleanArray2);
        });
    }

    //Sapient generated method id: ${f76d3541-e98e-3621-b1e7-a3db6b70471c}
    @Disabled()
    @Test()
    void append15WhenLhsNotInstanceOfBooleanArray() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (ObjectUtils.isArray(lhs)) : true
         * (lhs instanceof long[]) : false  #  inside appendArray method
         * (lhs instanceof int[]) : false  #  inside appendArray method
         * (lhs instanceof short[]) : false  #  inside appendArray method
         * (lhs instanceof char[]) : false  #  inside appendArray method
         * (lhs instanceof byte[]) : false  #  inside appendArray method
         * (lhs instanceof double[]) : false  #  inside appendArray method
         * (lhs instanceof float[]) : false  #  inside appendArray method
         * (lhs instanceof boolean[]) : false  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        Object object = new Object();
        Object object2 = new Object();
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append(object, object2, comparator);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${daa93de7-e090-3c4e-9661-7a2aca592df5}
    @Test()
    void append16Test() {
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        Object[] objectArray = new Object[]{};
        Object[] objectArray2 = new Object[]{};
        doReturn(compareToBuilder).when(target).append(objectArray, objectArray2, (Comparator) null);
        //Act Statement(s)
        CompareToBuilder result = target.append(objectArray, objectArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(compareToBuilder));
            verify(target).append(objectArray, objectArray2, (Comparator) null);
        });
    }

    //Sapient generated method id: ${e0e22689-9922-3a03-9f08-db8e29239220}
    @Test()
    void append17WhenLhsEqualsRhs() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        Object[] objectArray = new Object[]{};
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append(objectArray, objectArray, comparator);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${b68f1528-6c10-3870-8d6c-7eb2766a18b2}
    @Test()
    void append17WhenLhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        Object[] object = null;
        Object[] objectArray = new Object[]{};
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append(object, objectArray, comparator);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${80d3ceca-fcb2-3834-884e-2b3ac3d6fe25}
    @Test()
    void append17WhenRhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        Object[] objectArray = new Object[]{};
        Object[] object = null;
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append(objectArray, object, comparator);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${82af4021-0fa4-3645-96e9-7d341b626094}
    @Test()
    void append17WhenLhsLengthLessThanRhsLength() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         * (lhs.length < rhs.length) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        Object[] objectArray = new Object[]{};
        Object object = new Object();
        Object[] objectArray2 = new Object[]{object};
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append(objectArray, objectArray2, comparator);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${63df0f7f-0763-3c85-baa9-a1ec8b9c5b4e}
    @Test()
    void append17WhenLhsLengthNotLessThanRhsLength() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         * (lhs.length < rhs.length) : false
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        Object object = new Object();
        Object[] objectArray = new Object[]{object};
        Object[] objectArray2 = new Object[]{};
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append(objectArray, objectArray2, comparator);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${a1a09405-5fc8-31fa-89dc-030d5abfdb64}
    @Test()
    void append17WhenComparisonEquals0() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : false
         * (i < lhs.length) : true
         * (comparison == 0) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        Object object = new Object();
        Object object2 = new Object();
        doReturn(compareToBuilder).when(target).append(eq(object), eq(object2), (Comparator) any());
        Object[] objectArray = new Object[]{object};
        Object[] objectArray2 = new Object[]{object2};
        Comparator<?> comparator = Comparator.reverseOrder();
        //Act Statement(s)
        CompareToBuilder result = target.append(objectArray, objectArray2, comparator);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(eq(object), eq(object2), (Comparator) any());
        });
    }

    //Sapient generated method id: ${2349a683-9679-3f5a-83ad-4122c34fa13e}
    @Test()
    void append18WhenComparisonEquals0() {
        /* Branches:
         * (comparison != 0) : false
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        //Act Statement(s)
        CompareToBuilder result = target.append((short) 1, (short) 1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${becfc2c1-aa16-37fa-adeb-5afac362fef4}
    @Test()
    void append19WhenLhsEqualsRhs() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        short[] shortArray = new short[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(shortArray, shortArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${21281282-726e-30f0-bd99-d18a56cb5540}
    @Test()
    void append19WhenLhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        short[] _short = null;
        short[] shortArray = new short[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(_short, shortArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${ca9a85bd-e1b5-3808-981c-136d792fbcd1}
    @Test()
    void append19WhenRhsIsNull() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        short[] shortArray = new short[]{};
        short[] _short = null;
        //Act Statement(s)
        CompareToBuilder result = target.append(shortArray, _short);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${1c8594fe-8eab-3167-9b4d-91625230c34c}
    @Test()
    void append19WhenLhsLengthLessThanRhsLength() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         * (lhs.length < rhs.length) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        short[] shortArray = new short[]{};
        short[] shortArray2 = new short[]{(short) 0};
        //Act Statement(s)
        CompareToBuilder result = target.append(shortArray, shortArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${f05ccfe0-9c8d-3a6f-b67c-53139daa10bf}
    @Test()
    void append19WhenLhsLengthNotLessThanRhsLength() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         * (lhs.length < rhs.length) : false
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        short[] shortArray = new short[]{(short) 0};
        short[] shortArray2 = new short[]{};
        //Act Statement(s)
        CompareToBuilder result = target.append(shortArray, shortArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${5fb6b31b-883d-36b6-bddf-c38b1d8249ed}
    @Test()
    void append19WhenComparisonEquals0() {
        /* Branches:
         * (comparison != 0) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : false
         * (i < lhs.length) : true
         * (comparison == 0) : true
         */
        //Arrange Statement(s)
        CompareToBuilder target = spy(new CompareToBuilder());
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        doReturn(compareToBuilder).when(target).append((short) 0, (short) 0);
        short[] shortArray = new short[]{(short) 0};
        short[] shortArray2 = new short[]{(short) 0};
        //Act Statement(s)
        CompareToBuilder result = target.append(shortArray, shortArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append((short) 0, (short) 0);
        });
    }

    //Sapient generated method id: ${023601bd-826c-35d2-a0fb-2a049109ba2e}
    @Test()
    void appendSuperWhenComparisonEquals0() {
        /* Branches:
         * (comparison != 0) : false
         */
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        //Act Statement(s)
        CompareToBuilder result = target.appendSuper(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${c319ea97-f8d0-37c4-a5dd-88e142a90c6d}
    @Test()
    void buildTest() {
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        //Act Statement(s)
        Integer result = target.build();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${cf0e3772-c9d7-393b-a936-f0ed69d622c5}
    @Test()
    void toComparisonTest() {
        //Arrange Statement(s)
        CompareToBuilder target = new CompareToBuilder();
        //Act Statement(s)
        int result = target.toComparison();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }
}
