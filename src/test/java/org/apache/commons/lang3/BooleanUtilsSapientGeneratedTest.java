package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.mockito.MockedStatic;

import java.util.function.Consumer;

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
class BooleanUtilsSapientGeneratedTest {

    //Sapient generated method id: ${f8b85c2e-d211-3b4e-b7b9-485d93fe690c}
    @Test()
    void andWhenNotElement() {
        /* Branches:
         * (for-each(array)) : true
         * (!element) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        boolean[] booleanArray = new boolean[]{false};
        //Act Statement(s)
        boolean result = BooleanUtils.and(booleanArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${71a83c4a-3d97-3986-a632-472223ccf4ec}
    @Test()
    void andWhenElement() {
        /* Branches:
         * (for-each(array)) : true
         * (!element) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        boolean[] booleanArray = new boolean[]{true, true, true};
        //Act Statement(s)
        boolean result = BooleanUtils.and(booleanArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${937d45bc-7286-3f4a-b188-53f681c6ca3f}
    @Test()
    void and1WhenAndArrayUtilsToPrimitiveArray() {
        /* Branches:
         * (and(ArrayUtils.toPrimitive(array))) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{true, true, true};
            booleanUtils.when(() -> BooleanUtils.and(booleanArray)).thenReturn(true);
            Boolean[] booleanArray2 = new Boolean[]{true, true, true};
            //Act Statement(s)
            Boolean result = BooleanUtils.and(booleanArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                booleanUtils.verify(() -> BooleanUtils.and(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a06d2f52-9148-3ed6-a3c7-4cd594034a02}
    @Test()
    void and1WhenAndNotArrayUtilsToPrimitiveArray() {
        /* Branches:
         * (and(ArrayUtils.toPrimitive(array))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{true, true, false};
            booleanUtils.when(() -> BooleanUtils.and(booleanArray)).thenReturn(false);
            Boolean[] booleanArray2 = new Boolean[]{true, true, false};
            //Act Statement(s)
            Boolean result = BooleanUtils.and(booleanArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                booleanUtils.verify(() -> BooleanUtils.and(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${751888cf-afec-364b-9ab8-3e70f2b6eb29}
    @Test()
    void booleanValuesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean[] result = BooleanUtils.booleanValues();
        Boolean[] booleanResultArray = new Boolean[]{false, true};
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(booleanResultArray)));
    }

    //Sapient generated method id: ${78a13e9b-60e7-3c82-902c-15a93c6350b5}
    @Test()
    void compareWhenXEqualsY() {
        /* Branches:
         * (x == y) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        int result = BooleanUtils.compare(true, true);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${b56777b8-c28d-3f79-9771-81fbba9a8480}
    @Test()
    void compareWhenX() {
        /* Branches:
         * (x == y) : false
         * (x) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        int result = BooleanUtils.compare(true, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${aa666520-e83a-32dd-8409-bd13f9782695}
    @Test()
    void compareWhenNotX() {
        /* Branches:
         * (x == y) : false
         * (x) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        int result = BooleanUtils.compare(false, true);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${eaf48a4e-d2f2-3434-bc4f-1847fbe649f9}
    @Disabled()
    @Test()
    void forEachTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Consumer<Boolean> consumer = null;
        //Act Statement(s)
        BooleanUtils.forEach(consumer);
    }

    //Sapient generated method id: ${c4c1e99a-8ae2-3639-af26-373ed89969a1}
    @Test()
    void isFalseWhenBooleanFALSEEqualsBool() {
        /* Branches:
         * (Boolean.FALSE.equals(bool)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.isFalse(false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${9eccd5cb-809f-3bbe-bb0c-446ebd020c10}
    @Test()
    void isFalseWhenBooleanFALSENotEqualsBool() {
        /* Branches:
         * (Boolean.FALSE.equals(bool)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.isFalse(true);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${e351cadf-9490-3bfe-8469-87149f997db6}
    @Test()
    void isNotFalseWhenIsFalseNotBool() {
        /* Branches:
         * (!isFalse(bool)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            booleanUtils.when(() -> BooleanUtils.isFalse(true)).thenReturn(false);
            //Act Statement(s)
            boolean result = BooleanUtils.isNotFalse(true);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                booleanUtils.verify(() -> BooleanUtils.isFalse(true), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6307581b-c7dd-35f0-adfa-17eac0287d0f}
    @Test()
    void isNotFalseWhenIsFalseBool() {
        /* Branches:
         * (!isFalse(bool)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            booleanUtils.when(() -> BooleanUtils.isFalse(false)).thenReturn(true);
            //Act Statement(s)
            boolean result = BooleanUtils.isNotFalse(false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                booleanUtils.verify(() -> BooleanUtils.isFalse(false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${03b198f6-98ba-307c-8d9b-c36198d6fff4}
    @Test()
    void isNotTrueWhenIsTrueNotBool() {
        /* Branches:
         * (!isTrue(bool)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            booleanUtils.when(() -> BooleanUtils.isTrue(false)).thenReturn(false);
            //Act Statement(s)
            boolean result = BooleanUtils.isNotTrue(false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                booleanUtils.verify(() -> BooleanUtils.isTrue(false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a8a3b398-4c40-3081-8af4-34bc1a9eae6e}
    @Test()
    void isNotTrueWhenIsTrueBool() {
        /* Branches:
         * (!isTrue(bool)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            booleanUtils.when(() -> BooleanUtils.isTrue(true)).thenReturn(true);
            //Act Statement(s)
            boolean result = BooleanUtils.isNotTrue(true);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                booleanUtils.verify(() -> BooleanUtils.isTrue(true), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1f232db3-c287-326a-ac1b-c2feef1e12c0}
    @Test()
    void isTrueWhenBooleanTRUEEqualsBool() {
        /* Branches:
         * (Boolean.TRUE.equals(bool)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.isTrue(true);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${45f2dcd3-8a34-3041-99bd-41cf067d2585}
    @Test()
    void isTrueWhenBooleanTRUENotEqualsBool() {
        /* Branches:
         * (Boolean.TRUE.equals(bool)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.isTrue(false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${9b63226d-48bb-3484-b3cf-3fef7f4c840d}
    @Test()
    void negateWhenBoolIsNull() {
        /* Branches:
         * (bool == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.negate((Boolean) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${a981b236-21e6-375d-af6e-fbf4893571c3}
    @Test()
    void negateWhenBoolBooleanValue() {
        /* Branches:
         * (bool == null) : false
         * (bool.booleanValue()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.negate(true);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${e2f28d40-bfc7-398b-bc0a-017472e9efe5}
    @Test()
    void negateWhenBoolNotBooleanValue() {
        /* Branches:
         * (bool == null) : false
         * (bool.booleanValue()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.negate(false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${3b3667a8-abf8-3d43-96a4-85863878852f}
    @Test()
    void oneHotWhenNotResult() {
        /* Branches:
         * (for-each(array)) : true
         * (element) : true
         * (result) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        boolean[] booleanArray = new boolean[]{true};
        //Act Statement(s)
        boolean result = BooleanUtils.oneHot(booleanArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${f13772ed-ddfe-3274-888e-7090c7d9541f}
    @Test()
    void oneHot1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{true, false};
            booleanUtils.when(() -> BooleanUtils.oneHot(booleanArray)).thenReturn(false);
            Boolean[] booleanArray2 = new Boolean[]{true, false};
            //Act Statement(s)
            Boolean result = BooleanUtils.oneHot(booleanArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                booleanUtils.verify(() -> BooleanUtils.oneHot(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${587cf6ac-df94-32c6-b433-f4fe0ff8e27d}
    @Test()
    void orWhenElement() {
        /* Branches:
         * (for-each(array)) : true
         * (element) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        boolean[] booleanArray = new boolean[]{true};
        //Act Statement(s)
        boolean result = BooleanUtils.or(booleanArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${62d0a030-f0d7-3cc7-b84c-034fd1211f32}
    @Test()
    void orWhenNotElement() {
        /* Branches:
         * (for-each(array)) : true
         * (element) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        boolean[] booleanArray = new boolean[]{false};
        //Act Statement(s)
        boolean result = BooleanUtils.or(booleanArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${679d24eb-e2d6-3cbf-8d1d-91f07c070964}
    @Test()
    void or1WhenOrArrayUtilsToPrimitiveArray() {
        /* Branches:
         * (or(ArrayUtils.toPrimitive(array))) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{true, false, true};
            booleanUtils.when(() -> BooleanUtils.or(booleanArray)).thenReturn(true);
            Boolean[] booleanArray2 = new Boolean[]{true, false, true};
            //Act Statement(s)
            Boolean result = BooleanUtils.or(booleanArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                booleanUtils.verify(() -> BooleanUtils.or(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ca1f50cd-139a-3da2-8340-c0d731270c06}
    @Test()
    void or1WhenOrNotArrayUtilsToPrimitiveArray() {
        /* Branches:
         * (or(ArrayUtils.toPrimitive(array))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{true, false, false};
            booleanUtils.when(() -> BooleanUtils.or(booleanArray)).thenReturn(false);
            Boolean[] booleanArray2 = new Boolean[]{true, false, false};
            //Act Statement(s)
            Boolean result = BooleanUtils.or(booleanArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                booleanUtils.verify(() -> BooleanUtils.or(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fab327fb-25c1-39a7-9455-088c767cf24a}
    @Test()
    void primitiveValuesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean[] result = BooleanUtils.primitiveValues();
        boolean[] booleanResultArray = new boolean[]{false, true};
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(booleanResultArray)));
    }

    //Sapient generated method id: ${6a1de873-899f-3237-9670-1eb759ac844a}
    @Test()
    void toBooleanWhenBoolBooleanValue() {
        /* Branches:
         * (bool != null) : true
         * (bool.booleanValue()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.toBoolean(true);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${3e73f571-224c-34e6-be76-9b5ccbb44abf}
    @Test()
    void toBooleanWhenBoolNotBooleanValue() {
        /* Branches:
         * (bool != null) : true
         * (bool.booleanValue()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.toBoolean(false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${d03508c7-fb4e-323e-a71c-a793f2c86946}
    @Test()
    void toBoolean1WhenValueNotEquals0() {
        /* Branches:
         * (value != 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.toBoolean(5);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${d26003e8-70f7-35f9-bd6c-84899cc72e35}
    @Test()
    void toBoolean1WhenValueEquals0() {
        /* Branches:
         * (value != 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.toBoolean(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${9a5a3602-8b47-3848-8db1-f731b90803ca}
    @Test()
    void toBoolean2WhenValueEqualsTrueValue() {
        /* Branches:
         * (value == trueValue) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.toBoolean(1, 1, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${9d968c99-c7bc-3333-861e-0224a428c34d}
    @Test()
    void toBoolean2WhenValueEqualsFalseValue() {
        /* Branches:
         * (value == trueValue) : false
         * (value == falseValue) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.toBoolean(1, 2, 1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${b2181e29-4873-31cd-be41-3de90aa21618}
    @Test()
    void toBoolean2WhenValueNotEqualsFalseValueThrowsIllegalArgumentException() {
        /* Branches:
         * (value == trueValue) : false
         * (value == falseValue) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The Integer did not match either specified value");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            BooleanUtils.toBoolean(1, 2, 3);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${46eea5a6-8e8f-3570-ba33-af5942bd3e47}
    @Test()
    void toBoolean3WhenTrueValueIsNull() {
        /* Branches:
         * (value == null) : true
         * (trueValue == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${d6e4d670-99da-38c2-a014-dd535c5bcd32}
    @Test()
    void toBoolean3WhenValueEqualsTrueValue() {
        /* Branches:
         * (value == null) : false
         * (value.equals(trueValue)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.toBoolean(5, 5, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${715d7a62-82ca-35e4-99a8-49a1cc0d9173}
    @Test()
    void toBoolean3WhenFalseValueIsNull() {
        /* Branches:
         * (value == null) : true
         * (trueValue == null) : false
         * (falseValue == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.toBoolean((Integer) null, (Integer) 1, (Integer) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${c09e6b95-f12d-3637-8c69-82da4a0cdb1a}
    @Test()
    void toBoolean3WhenValueEqualsFalseValue() {
        /* Branches:
         * (value == null) : false
         * (value.equals(trueValue)) : false
         * (value.equals(falseValue)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.toBoolean(5, 10, 5);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${2bddc56b-2779-332b-ba34-e3668370f659}
    @Test()
    void toBoolean3WhenValueNotEqualsFalseValueThrowsIllegalArgumentException() {
        /* Branches:
         * (value == null) : false
         * (value.equals(trueValue)) : false
         * (value.equals(falseValue)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The Integer did not match either specified value");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            BooleanUtils.toBoolean(1, 2, 3);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${d4615068-1456-31fe-a886-8d12322f2586}
    @Test()
    void toBoolean4WhenToBooleanObjectStrEqualsBooleanTRUE() {
        /* Branches:
         * (toBooleanObject(str) == Boolean.TRUE) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            booleanUtils.when(() -> BooleanUtils.toBooleanObject("true")).thenReturn(true);
            //Act Statement(s)
            boolean result = BooleanUtils.toBoolean("true");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                booleanUtils.verify(() -> BooleanUtils.toBooleanObject("true"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${355051ca-d7c1-3c87-8bd3-c7f51e3751ef}
    @Test()
    void toBoolean4WhenToBooleanObjectStrNotEqualsBooleanTRUE() {
        /* Branches:
         * (toBooleanObject(str) == Boolean.TRUE) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            booleanUtils.when(() -> BooleanUtils.toBooleanObject("false")).thenReturn(false);
            //Act Statement(s)
            boolean result = BooleanUtils.toBoolean("false");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                booleanUtils.verify(() -> BooleanUtils.toBooleanObject("false"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9b416580-d5bd-3e66-8eca-e82065c7b300}
    @Test()
    void toBoolean5WhenStrEqualsTrueString() {
        /* Branches:
         * (str == trueString) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.toBoolean("test", "test", "false");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${08798914-33d1-3109-84d3-c85ae5172ff5}
    @Test()
    void toBoolean5WhenStrEqualsFalseString() {
        /* Branches:
         * (str == trueString) : false
         * (str == falseString) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.toBoolean("false", "true", "false");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${7ad8e689-8343-360a-86b9-177e13d2316f}
    @Test()
    void toBoolean5WhenStrIsNotNullAndStrEqualsTrueString() {
        /* Branches:
         * (str == trueString) : false
         * (str == falseString) : false
         * (str != null) : true
         * (str.equals(trueString)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.toBoolean("A", "A", "falseString1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${885ec0df-0333-3758-a2ac-d9fef71199e2}
    @Test()
    void toBoolean5WhenStrNotEqualsTrueStringAndStrEqualsFalseString() {
        /* Branches:
         * (str == trueString) : false
         * (str == falseString) : false
         * (str != null) : true
         * (str.equals(trueString)) : false
         * (str.equals(falseString)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.toBoolean("A", "B", "A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${182d279b-f62a-3b43-8158-8df158237423}
    @Test()
    void toBoolean5WhenStrNotEqualsFalseStringThrowsIllegalArgumentException() {
        /* Branches:
         * (str == trueString) : false
         * (str == falseString) : false
         * (str != null) : true
         * (str.equals(trueString)) : false
         * (str.equals(falseString)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The String did not match either specified value");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            BooleanUtils.toBoolean("input", "true", "false");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${689bf6f6-1928-3a38-a12f-e08faa07d80f}
    @Test()
    void toBooleanDefaultIfNullWhenValueIfNull() {
        /* Branches:
         * (bool == null) : true
         * (valueIfNull) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${a2eba686-22ce-32df-b2fd-282526fdb239}
    @Test()
    void toBooleanDefaultIfNullWhenNotValueIfNull() {
        /* Branches:
         * (bool == null) : true
         * (valueIfNull) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${0e7092bd-de22-31dd-ad4b-04925dadd3f3}
    @Test()
    void toBooleanDefaultIfNullWhenBoolBooleanValue() {
        /* Branches:
         * (bool == null) : false
         * (bool.booleanValue()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.toBooleanDefaultIfNull(true, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${3ae1cb3e-84bc-388e-a257-d7b2e9d0af9e}
    @Test()
    void toBooleanDefaultIfNullWhenBoolNotBooleanValue() {
        /* Branches:
         * (bool == null) : false
         * (bool.booleanValue()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = BooleanUtils.toBooleanDefaultIfNull(false, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${9b8bc2a3-fc3b-30fa-97e0-5625a407fd9d}
    @Test()
    void toBooleanObjectWhenValueEquals0() {
        /* Branches:
         * (value == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${5c710f0d-2232-3d9c-b7b4-f8abb494e8ff}
    @Test()
    void toBooleanObjectWhenValueNotEquals0() {
        /* Branches:
         * (value == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject(1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${f21a753e-af7f-31d2-98bd-1cc1932973c7}
    @Test()
    void toBooleanObject1WhenValueEqualsTrueValue() {
        /* Branches:
         * (value == trueValue) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject(5, 5, 0, -1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${3f42fac9-e522-3826-a3eb-12050cb24aa9}
    @Test()
    void toBooleanObject1WhenValueEqualsFalseValue() {
        /* Branches:
         * (value == trueValue) : false
         * (value == falseValue) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject(5, 10, 5, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${765c945c-b14b-344d-a275-bd9b358c9760}
    @Test()
    void toBooleanObject1WhenValueEqualsNullValue() {
        /* Branches:
         * (value == trueValue) : false
         * (value == falseValue) : false
         * (value == nullValue) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject(1, 2, 2, 1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${8c72d6cc-b053-3f9b-a1d7-b51448873b22}
    @Test()
    void toBooleanObject1WhenValueNotEqualsNullValueThrowsIllegalArgumentException() {
        /* Branches:
         * (value == trueValue) : false
         * (value == falseValue) : false
         * (value == nullValue) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The Integer did not match any specified value");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            BooleanUtils.toBooleanObject(5, 1, 0, -1);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${97293891-3c04-36cf-a29b-6300563da6b6}
    @Test()
    void toBooleanObject2WhenValueIsNull() {
        /* Branches:
         * (value == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject((Integer) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${6ead6b82-8487-3f33-ae6a-a72d4a99c969}
    @Test()
    void toBooleanObject2WhenValueIntValueEquals0() {
        /* Branches:
         * (value == null) : false
         * (value.intValue() == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${a54c9884-9998-3b2c-9edc-278d450c7ceb}
    @Test()
    void toBooleanObject2WhenValueIntValueNotEquals0() {
        /* Branches:
         * (value == null) : false
         * (value.intValue() == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject(-1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${d80fe08b-e8c1-39bf-95ce-4c09540708c6}
    @Test()
    void toBooleanObject3WhenTrueValueIsNull() {
        /* Branches:
         * (value == null) : true
         * (trueValue == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) 0, (Integer) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${ff83cedb-3916-34c6-94b0-f7fcdb74c345}
    @Test()
    void toBooleanObject3WhenValueEqualsTrueValue() {
        /* Branches:
         * (value == null) : false
         * (value.equals(trueValue)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject(1, 1, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${0e31c6f9-a885-3915-bf1d-326e5bc9f41c}
    @Test()
    void toBooleanObject3WhenFalseValueIsNull() {
        /* Branches:
         * (value == null) : true
         * (trueValue == null) : false
         * (falseValue == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject((Integer) null, (Integer) 1, (Integer) null, (Integer) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${eff5f454-c47a-3e02-8c9d-078662a2305a}
    @Test()
    void toBooleanObject3WhenValueEqualsFalseValue() {
        /* Branches:
         * (value == null) : false
         * (value.equals(trueValue)) : false
         * (value.equals(falseValue)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject(2, 1, 2, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${b9ff73f5-6baf-3058-8f95-604e5842f497}
    @Test()
    void toBooleanObject3WhenNullValueIsNull() {
        /* Branches:
         * (value == null) : true
         * (trueValue == null) : false
         * (falseValue == null) : false
         * (nullValue == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject((Integer) null, (Integer) 1, (Integer) 0, (Integer) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${f874de8a-681b-3318-9992-e16255a98f5f}
    @Test()
    void toBooleanObject3WhenValueEqualsNullValue() {
        /* Branches:
         * (value == null) : false
         * (value.equals(trueValue)) : false
         * (value.equals(falseValue)) : false
         * (value.equals(nullValue)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject(2, 1, 0, 2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${d855183b-05da-3c73-9d71-380d442fcb64}
    @Test()
    void toBooleanObject3WhenValueNotEqualsNullValueThrowsIllegalArgumentException() {
        /* Branches:
         * (value == null) : false
         * (value.equals(trueValue)) : false
         * (value.equals(falseValue)) : false
         * (value.equals(nullValue)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The Integer did not match any specified value");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            BooleanUtils.toBooleanObject(1, 2, 3, 4);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${4efaffad-3e4d-3500-b99e-b37d7848adb4}
    @Test()
    void toBooleanObject4WhenStrEqualsTRUE() {
        /* Branches:
         * (str == TRUE) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject("true");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${23796b44-a185-383f-ade4-ecb318d2d174}
    @Test()
    void toBooleanObject4WhenStrIsNull() {
        /* Branches:
         * (str == TRUE) : false
         * (str == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${4cd0e8f1-259d-3747-974c-e3fffdad2641}
    @Test()
    void toBooleanObject4WhenCh1NotEquals_n_AndCh1Equals_N_() {
        /* Branches:
         * (str == TRUE) : false
         * (str == null) : false
         * (switch(str.length()) = 2) : true
         * (ch0 == 'o') : false
         * (ch0 == 'O') : true
         * (ch1 == 'n') : false
         * (ch1 == 'N') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject("ON");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${206e995b-2cf1-3bee-91b5-3be63c1baca0}
    @Test()
    void toBooleanObject4WhenCh0Equals_1_() {
        /* Branches:
         * (str == TRUE) : false
         * (str == null) : false
         * (switch(str.length()) = 1) : true
         * (ch0 == 'y') : false
         * (ch0 == 'Y') : false
         * (ch0 == 't') : false
         * (ch0 == 'T') : false
         * (ch0 == '1') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject("1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${4ff516fe-2021-33e0-981b-4840dddbd33b}
    @Test()
    void toBooleanObject4WhenCh1NotEquals_o_AndCh1Equals_O_() {
        /* Branches:
         * (str == TRUE) : false
         * (str == null) : false
         * (switch(str.length()) = 2) : true
         * (ch0 == 'o') : false
         * (ch0 == 'O') : false
         * (ch0 == 'n') : false
         * (ch0 == 'N') : true
         * (ch1 == 'o') : false
         * (ch1 == 'O') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject("NO");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${5e836f91-73c1-3dc7-a579-ae9ceaf4733e}
    @Test()
    void toBooleanObject4WhenCh2NotEquals_s_AndCh2Equals_S_() {
        /* Branches:
         * (str == TRUE) : false
         * (str == null) : false
         * (switch(str.length()) = 3) : true
         * (ch0 == 'y') : false
         * (ch0 == 'Y') : true
         * (ch1 == 'e') : false
         * (ch1 == 'E') : true
         * (ch2 == 's') : false
         * (ch2 == 'S') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject("YES");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${b07a283c-7d15-3def-8677-d6ca1a20f2b5}
    @Test()
    void toBooleanObject4WhenCh2NotEquals_s_AndCh2NotEquals_S_AndCh0NotEquals_o_AndCh0NotEquals_O_() {
        /* Branches:
         * (str == TRUE) : false
         * (str == null) : false
         * (switch(str.length()) = 3) : true
         * (ch0 == 'y') : false
         * (ch0 == 'Y') : true
         * (ch1 == 'e') : false
         * (ch1 == 'E') : true
         * (ch2 == 's') : false
         * (ch2 == 'S') : false
         * (ch0 == 'o') : false
         * (ch0 == 'O') : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject("YED");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${2e51a060-ae06-396a-bdad-0659cb59bea1}
    @Test()
    void toBooleanObject4WhenCh1Equals_F_AndCh2NotEquals_f_AndCh2Equals_F_() {
        /* Branches:
         * (str == TRUE) : false
         * (str == null) : false
         * (switch(str.length()) = 3) : true
         * (ch0 == 'y') : false
         * (ch0 == 'Y') : false
         * (ch0 == 'o') : false
         * (ch0 == 'O') : true
         * (ch1 == 'f') : false
         * (ch1 == 'F') : true
         * (ch2 == 'f') : false
         * (ch2 == 'F') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject("OFF");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${5696e1a2-f41e-3246-ab30-46e5a57f45c6}
    @Test()
    void toBooleanObject4WhenCh0Equals_0_() {
        /* Branches:
         * (str == TRUE) : false
         * (str == null) : false
         * (switch(str.length()) = 1) : true
         * (ch0 == 'y') : false
         * (ch0 == 'Y') : false
         * (ch0 == 't') : false
         * (ch0 == 'T') : false
         * (ch0 == '1') : false
         * (ch0 == 'n') : false
         * (ch0 == 'N') : false
         * (ch0 == 'f') : false
         * (ch0 == 'F') : false
         * (ch0 == '0') : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject("0");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${d51ebd8d-2157-36f8-b34b-665041b4976e}
    @Test()
    void toBooleanObject5WhenTrueStringIsNull() {
        /* Branches:
         * (str == null) : true
         * (trueString == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject((String) null, (String) null, "false", "");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${aeefb66d-1431-3999-99d1-77875556c599}
    @Test()
    void toBooleanObject5WhenStrEqualsTrueString() {
        /* Branches:
         * (str == null) : false
         * (str.equals(trueString)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject("true", "true", "false", "");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${5a88926e-8ae0-325a-a3c2-fe6d0587f797}
    @Test()
    void toBooleanObject5WhenFalseStringIsNull() {
        /* Branches:
         * (str == null) : true
         * (trueString == null) : false
         * (falseString == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject((String) null, "true", (String) null, "");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${4a9c9bbc-8359-3509-8104-9b1022d1382f}
    @Test()
    void toBooleanObject5WhenStrEqualsFalseString() {
        /* Branches:
         * (str == null) : false
         * (str.equals(trueString)) : false
         * (str.equals(falseString)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject("false", "true", "false", "");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${e1b97b39-8fdc-3b22-957e-cdbd9195e16c}
    @Test()
    void toBooleanObject5WhenNullStringIsNull() {
        /* Branches:
         * (str == null) : true
         * (trueString == null) : false
         * (falseString == null) : false
         * (nullString == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject((String) null, "true", "false", (String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${8d0c6279-f6c7-3e97-9c51-9f1a1ed6c38d}
    @Test()
    void toBooleanObject5WhenStrEqualsNullString() {
        /* Branches:
         * (str == null) : false
         * (str.equals(trueString)) : false
         * (str.equals(falseString)) : false
         * (str.equals(nullString)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Boolean result = BooleanUtils.toBooleanObject("", "true", "false", "");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${9925a693-129b-38c5-a9e1-d9f6237770ab}
    @Test()
    void toBooleanObject5WhenStrNotEqualsNullStringThrowsIllegalArgumentException() {
        /* Branches:
         * (str == null) : false
         * (str.equals(trueString)) : false
         * (str.equals(falseString)) : false
         * (str.equals(nullString)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The String did not match any specified value");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            BooleanUtils.toBooleanObject("A", "B", "C", "D");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${e3434ae0-dc99-3ff6-b61c-f565484fa217}
    @Test()
    void toIntegerWhenBool() {
        /* Branches:
         * (bool) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        int result = BooleanUtils.toInteger(true);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${838c5ad6-16d1-355d-b099-de670574b79f}
    @Test()
    void toIntegerWhenNotBool() {
        /* Branches:
         * (bool) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        int result = BooleanUtils.toInteger(false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${f4398196-5a05-3883-8ef9-befe9c1e0957}
    @Test()
    void toInteger1WhenBool() {
        /* Branches:
         * (bool) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        int result = BooleanUtils.toInteger(true, 1, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${c8190bfd-93da-3e23-99c4-11ff796b33ea}
    @Test()
    void toInteger1WhenNotBool() {
        /* Branches:
         * (bool) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        int result = BooleanUtils.toInteger(false, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${d0ececfa-a880-33ff-8b7c-a5f36f79aca1}
    @Test()
    void toInteger2WhenBoolIsNull() {
        /* Branches:
         * (bool == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        int result = BooleanUtils.toInteger((Boolean) null, 1, 0, -1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${edb4a10d-eed9-3712-a3d1-76f972505125}
    @Test()
    void toInteger2WhenBoolBooleanValue() {
        /* Branches:
         * (bool == null) : false
         * (bool.booleanValue()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        int result = BooleanUtils.toInteger(true, 10, 5, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(10)));
    }

    //Sapient generated method id: ${1791481a-8f6a-3e92-8c38-fcd5b8380758}
    @Test()
    void toInteger2WhenBoolNotBooleanValue() {
        /* Branches:
         * (bool == null) : false
         * (bool.booleanValue()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        int result = BooleanUtils.toInteger(false, 0, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${c1ef1ed2-5147-3850-8e17-6d67580ac0b3}
    @Test()
    void toIntegerObjectWhenBool() {
        /* Branches:
         * (bool) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Integer result = BooleanUtils.toIntegerObject(true);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${89d879a5-d7b5-3058-bdda-9495d3a80cb9}
    @Test()
    void toIntegerObjectWhenNotBool() {
        /* Branches:
         * (bool) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Integer result = BooleanUtils.toIntegerObject(false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${62a0b809-e58f-32c9-872e-d36f8743469d}
    @Test()
    void toIntegerObject1WhenBool() {
        /* Branches:
         * (bool) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Integer result = BooleanUtils.toIntegerObject(true, 10, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(10)));
    }

    //Sapient generated method id: ${00bcfa1c-969d-3bde-87d3-19e05aa038ea}
    @Test()
    void toIntegerObject1WhenNotBool() {
        /* Branches:
         * (bool) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Integer result = BooleanUtils.toIntegerObject(false, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${2ffbe5b2-8ceb-3c77-9615-5f3797f0e4d7}
    @Test()
    void toIntegerObject2WhenBoolIsNull() {
        /* Branches:
         * (bool == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Integer result = BooleanUtils.toIntegerObject((Boolean) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${e7596fef-f34c-34a1-923a-dbddfdf33729}
    @Test()
    void toIntegerObject2WhenBoolBooleanValue() {
        /* Branches:
         * (bool == null) : false
         * (bool.booleanValue()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Integer result = BooleanUtils.toIntegerObject(true);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${56f3c444-3b40-3f1b-96fd-39db9ee124ce}
    @Test()
    void toIntegerObject2WhenBoolNotBooleanValue() {
        /* Branches:
         * (bool == null) : false
         * (bool.booleanValue()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Integer result = BooleanUtils.toIntegerObject(false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${818f03e5-83c2-315a-a33c-10b4bf958974}
    @Test()
    void toIntegerObject3WhenBoolIsNull() {
        /* Branches:
         * (bool == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Integer result = BooleanUtils.toIntegerObject((Boolean) null, 10, 20, 30);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(30)));
    }

    //Sapient generated method id: ${84262d5d-22a1-3919-a49f-a87cd4eac3ac}
    @Test()
    void toIntegerObject3WhenBoolBooleanValue() {
        /* Branches:
         * (bool == null) : false
         * (bool.booleanValue()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Integer result = BooleanUtils.toIntegerObject(true, 10, 5, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(10)));
    }

    //Sapient generated method id: ${649b084a-05f1-3e98-8952-c07427dbb54d}
    @Test()
    void toIntegerObject3WhenBoolNotBooleanValue() {
        /* Branches:
         * (bool == null) : false
         * (bool.booleanValue()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Integer result = BooleanUtils.toIntegerObject(false, 0, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${90eecb47-30f0-38c9-9b12-06fbf24d0b15}
    @Test()
    void toStringWhenBool() {
        /* Branches:
         * (bool) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = BooleanUtils.toString(true, "true", "false");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("true")));
    }

    //Sapient generated method id: ${244fe917-1e4a-35fd-8a08-8ad83ad2977e}
    @Test()
    void toStringWhenNotBool() {
        /* Branches:
         * (bool) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = BooleanUtils.toString(false, "trueString1", "falseString1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("falseString1")));
    }

    //Sapient generated method id: ${1a247ec4-0bce-3768-aee8-65f126a4c0f2}
    @Test()
    void toString1WhenBoolIsNull() {
        /* Branches:
         * (bool == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = BooleanUtils.toString((Boolean) null, "true", "false", "");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }

    //Sapient generated method id: ${415ccf3d-dcb1-3af0-b5e9-2edb9252c38b}
    @Test()
    void toString1WhenBoolBooleanValue() {
        /* Branches:
         * (bool == null) : false
         * (bool.booleanValue()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = BooleanUtils.toString(true, "true", "false", "");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("true")));
    }

    //Sapient generated method id: ${8672db04-ec51-3034-95b4-0bea8c4dda5d}
    @Test()
    void toString1WhenBoolNotBooleanValue() {
        /* Branches:
         * (bool == null) : false
         * (bool.booleanValue()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = BooleanUtils.toString(false, "true", "false", "");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("false")));
    }

    //Sapient generated method id: ${0da26bea-68fc-3974-8e57-f6a4dbbcd667}
    @Test()
    void toStringOnOffTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            booleanUtils.when(() -> BooleanUtils.toString(true, "on", "off")).thenReturn("return_of_toString1");
            //Act Statement(s)
            String result = BooleanUtils.toStringOnOff(true);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toString1"));
                booleanUtils.verify(() -> BooleanUtils.toString(true, "on", "off"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0886d2b1-9285-39ed-b141-686ad80e4203}
    @Disabled()
    @Test()
    void toStringOnOff1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            booleanUtils.when(() -> BooleanUtils.toString(true, "on", "off", (String) null)).thenReturn("return_of_toString1");
            //Act Statement(s)
            String result = BooleanUtils.toStringOnOff(true);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toString1"));
                booleanUtils.verify(() -> BooleanUtils.toString(true, "on", "off", (String) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${141b4d4e-b818-362c-92c4-3507e77dedc3}
    @Test()
    void toStringTrueFalseTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            booleanUtils.when(() -> BooleanUtils.toString(true, "true", "false")).thenReturn("return_of_toString1");
            //Act Statement(s)
            String result = BooleanUtils.toStringTrueFalse(true);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toString1"));
                booleanUtils.verify(() -> BooleanUtils.toString(true, "true", "false"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${93090dd8-c427-37fc-a7e4-008c277b32fe}
    @Disabled()
    @Test()
    void toStringTrueFalse1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            booleanUtils.when(() -> BooleanUtils.toString(true, "true", "false", (String) null)).thenReturn("return_of_toString1");
            //Act Statement(s)
            String result = BooleanUtils.toStringTrueFalse(true);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toString1"));
                booleanUtils.verify(() -> BooleanUtils.toString(true, "true", "false", (String) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3a6b3882-1cc3-38c2-aebc-29425432bb8f}
    @Test()
    void toStringYesNoTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            booleanUtils.when(() -> BooleanUtils.toString(true, "yes", "no")).thenReturn("return_of_toString1");
            //Act Statement(s)
            String result = BooleanUtils.toStringYesNo(true);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toString1"));
                booleanUtils.verify(() -> BooleanUtils.toString(true, "yes", "no"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${26e303cd-c790-320c-a6ce-e6ac61533357}
    @Disabled()
    @Test()
    void toStringYesNo1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            booleanUtils.when(() -> BooleanUtils.toString(true, "yes", "no", (String) null)).thenReturn("return_of_toString1");
            //Act Statement(s)
            String result = BooleanUtils.toStringYesNo(true);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toString1"));
                booleanUtils.verify(() -> BooleanUtils.toString(true, "yes", "no", (String) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${805c481b-e400-3709-99b9-5d110e576e3d}
    @Disabled()
    @Test()
    void valuesTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        List<Boolean> result = BooleanUtils.values();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${1d912ac1-278a-3d8b-b9bc-fa8c5bad9b39}
    @Test()
    void xorWhenResult() {
        /* Branches:
         * (for-each(array)) : true
         * (result) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        boolean[] booleanArray = new boolean[]{true};
        //Act Statement(s)
        boolean result = BooleanUtils.xor(booleanArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${75827be6-6ad7-3f11-9ade-a9b312e3ebe0}
    @Test()
    void xorWhenNotResult() {
        /* Branches:
         * (for-each(array)) : true
         * (result) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        boolean[] booleanArray = new boolean[]{false};
        //Act Statement(s)
        boolean result = BooleanUtils.xor(booleanArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${ecc080dd-8486-3f93-908d-c873601c79cd}
    @Test()
    void xor1WhenXorArrayUtilsToPrimitiveArray() {
        /* Branches:
         * (xor(ArrayUtils.toPrimitive(array))) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{true, false, true};
            booleanUtils.when(() -> BooleanUtils.xor(booleanArray)).thenReturn(true);
            Boolean[] booleanArray2 = new Boolean[]{true, false, true};
            //Act Statement(s)
            Boolean result = BooleanUtils.xor(booleanArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                booleanUtils.verify(() -> BooleanUtils.xor(booleanArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a226cbc2-20a0-32c3-9e8c-f78c74815248}
    @Test()
    void xor1WhenXorNotArrayUtilsToPrimitiveArray() {
        /* Branches:
         * (xor(ArrayUtils.toPrimitive(array))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BooleanUtils> booleanUtils = mockStatic(BooleanUtils.class, CALLS_REAL_METHODS)) {
            boolean[] booleanArray = new boolean[]{true, false, true};
            booleanUtils.when(() -> BooleanUtils.xor(booleanArray)).thenReturn(false);
            Boolean[] booleanArray2 = new Boolean[]{true, false, true};
            //Act Statement(s)
            Boolean result = BooleanUtils.xor(booleanArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                booleanUtils.verify(() -> BooleanUtils.xor(booleanArray), atLeast(1));
            });
        }
    }
}
