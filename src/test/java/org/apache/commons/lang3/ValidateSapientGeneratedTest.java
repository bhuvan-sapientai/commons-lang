package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ValidateSapientGeneratedTest {

    //Sapient generated method id: ${6f945bd6-5806-3fa4-a464-a771b07eeba7}
    @Test()
    void isTrueWhenNotExpressionThrowsIllegalArgumentException() {
        /* Branches:
         * (!expression) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("A");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.isTrue(false, "A", 2L);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${5779787a-8099-3f8b-8a32-981de0d9d3f3}
    @Test()
    void isTrueWhenExpression() {
        /* Branches:
         * (!expression) : false
         */
        //Act Statement(s)
        Validate.isTrue(true, "message1", 0L);
    }

    //Sapient generated method id: ${c23bd411-d7c4-3cf8-a07f-24a507f51e31}
    @Test()
    void isTrue1WhenNotExpressionThrowsIllegalArgumentException() {
        /* Branches:
         * (!expression) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("A");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.isTrue(false, "A", Double.parseDouble("0.5"));
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${80e1e606-158c-3bdd-80cf-f631edbd0400}
    @Test()
    void isTrue1WhenExpression() {
        /* Branches:
         * (!expression) : false
         */
        //Act Statement(s)
        Validate.isTrue(true, "message1", Double.parseDouble("0.0"));
    }

    //Sapient generated method id: ${7e3f7b75-9be3-3c1c-8390-590d081e7bb6}
    @Test()
    void isTrue2WhenExpression() {
        /* Branches:
         * (!expression) : false
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        Validate.isTrue(true, "message1", objectArray);
    }

    //Sapient generated method id: ${82e3fbf5-ccf1-3d05-9f1a-82169a671a0f}
    @Test()
    void isTrue2WhenArrayUtilsIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (!expression) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.isTrue(false, "message1", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${3976f3d1-6c75-38e5-a7dc-885677e0e89c}
    @Test()
    void isTrue2WhenArrayUtilsNotIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (!expression) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("A");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.isTrue(false, "A", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${72a23ff1-fda5-3d7f-aa40-8d76d10a1de5}
    @Test()
    void isTrue3WhenNotExpressionThrowsIllegalArgumentException() {
        /* Branches:
         * (!expression) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The validated expression is false");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.isTrue(false);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${04185f4b-e42e-3a1c-a27c-b9bf227e382a}
    @Test()
    void isTrue3WhenExpression() {
        /* Branches:
         * (!expression) : false
         */
        //Act Statement(s)
        Validate.isTrue(true);
    }

    //Sapient generated method id: ${4a327428-c245-33ce-8910-44276b0bb7b2}
    @Test()
    void notNullTest() {
        //Arrange Statement(s)
        try (MockedStatic<Validate> validate = mockStatic(Validate.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            Object[] objectArray = new Object[]{};
            validate.when(() -> Validate.notNull(object2, "The validated object is null", objectArray)).thenReturn(object);
            //Act Statement(s)
            Object result = Validate.notNull(object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                validate.verify(() -> Validate.notNull(object2, "The validated object is null", objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${64a63dcf-7140-3c4f-918a-ae813d7fa129}
    @Test()
    void notNull1Test() {
        //Arrange Statement(s)
        Object object = new Object();
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        Object result = Validate.notNull(object, "message1", objectArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${fadf2792-0cfe-3fcc-914e-f4be7bcf1079}
    @Test()
    void notEmptyWhenArrayLengthNotEquals0() {
        /* Branches:
         * (array.length == 0) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object[] objectArray = new Object[]{object};
        Object[] objectArray2 = new Object[]{};
        //Act Statement(s)
        Object[] result = Validate.notEmpty(objectArray, "message1", objectArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectArray)));
    }

    //Sapient generated method id: ${70ee1260-bfd2-34cf-a929-e363c8e94234}
    @Test()
    void notEmptyWhenArrayUtilsIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (array.length == 0) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        Object[] objectArray2 = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.notEmpty(objectArray, "message1", objectArray2);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${592e446f-08ce-3a51-974c-a09a12d04d30}
    @Test()
    void notEmptyWhenArrayUtilsNotIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (array.length == 0) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        Object[] objectArray2 = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("A");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.notEmpty(objectArray, "A", objectArray2);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${0fac02b5-76ab-35e5-92eb-6f618685dce9}
    @Test()
    void notEmpty1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Validate> validate = mockStatic(Validate.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            Object[] objectArray2 = new Object[]{};
            Object[] objectArray3 = new Object[]{};
            validate.when(() -> Validate.notEmpty(objectArray2, "The validated array is empty", objectArray3)).thenReturn(objectArray);
            //Act Statement(s)
            Object[] result = Validate.notEmpty(objectArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(objectArray));
                validate.verify(() -> Validate.notEmpty(objectArray2, "The validated array is empty", objectArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${79aced8b-0038-34d6-ac25-290adc96d1f3}
    @Test()
    void notEmpty2WhenCollectionNotIsEmpty() {
        /* Branches:
         * (collection.isEmpty()) : false
         */
        //Arrange Statement(s)
        Collection collection = new ArrayList<>();
        collection.add(null);
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        Collection result = Validate.notEmpty(collection, "message1", objectArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(collection)));
    }

    //Sapient generated method id: ${49881561-f3a3-321d-bfd4-2bb8592baaa1}
    @Test()
    void notEmpty2WhenArrayUtilsIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (collection.isEmpty()) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         */
        //Arrange Statement(s)
        Collection collection = new ArrayList<>();
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.notEmpty(collection, "message1", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${5d389101-5fc7-3037-bf01-697b409d81bf}
    @Test()
    void notEmpty2WhenArrayUtilsNotIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (collection.isEmpty()) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Collection collection = new ArrayList<>();
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("A");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.notEmpty(collection, "A", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${c96f5193-c5fb-370b-ac9b-60110b0bce0a}
    @Test()
    void notEmpty3Test() {
        //Arrange Statement(s)
        try (MockedStatic<Validate> validate = mockStatic(Validate.class, CALLS_REAL_METHODS)) {
            Collection collection = new ArrayList<>();
            Object[] objectArray = new Object[]{};
            validate.when(() -> Validate.notEmpty(anyCollection(), eq("The validated collection is empty"), eq(objectArray))).thenReturn(collection);
            Collection collection2 = new ArrayList<>();
            //Act Statement(s)
            Collection result = Validate.notEmpty(collection2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(collection));
                validate.verify(() -> Validate.notEmpty(anyCollection(), eq("The validated collection is empty"), eq(objectArray)), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2a9f5d38-b09a-3dd3-8cc1-2a6e40c528fc}
    @Test()
    void notEmpty4WhenMapNotIsEmpty() {
        /* Branches:
         * (map.isEmpty()) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Map<Object, Object> objectObjectMap = new HashMap<>();
        objectObjectMap.put(object, object2);
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        Map result = Validate.notEmpty(objectObjectMap, "message1", objectArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectObjectMap)));
    }

    //Sapient generated method id: ${20f7acf9-3362-3799-9f10-8870e02b01b1}
    @Test()
    void notEmpty4WhenArrayUtilsIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (map.isEmpty()) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         */
        //Arrange Statement(s)
        Map map = new HashMap<>();
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.notEmpty(map, "message1", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${398abdab-9c53-33c1-a58a-7c5cb8dab943}
    @Test()
    void notEmpty4WhenArrayUtilsNotIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (map.isEmpty()) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Map map = new HashMap<>();
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("A");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.notEmpty(map, "A", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${a082e217-6a3f-3329-aba3-e41ab33769a0}
    @Test()
    void notEmpty5Test() {
        //Arrange Statement(s)
        try (MockedStatic<Validate> validate = mockStatic(Validate.class, CALLS_REAL_METHODS)) {
            Map map = new HashMap<>();
            Object[] objectArray = new Object[]{};
            validate.when(() -> Validate.notEmpty(anyMap(), eq("The validated map is empty"), eq(objectArray))).thenReturn(map);
            Map map2 = new HashMap<>();
            //Act Statement(s)
            Map result = Validate.notEmpty(map2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(map));
                validate.verify(() -> Validate.notEmpty(anyMap(), eq("The validated map is empty"), eq(objectArray)), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fe22524f-a65b-367c-b5bc-adb9ead4e45d}
    @Test()
    void notEmpty6WhenCharsLengthNotEquals0() {
        /* Branches:
         * (chars.length() == 0) : false
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        CharSequence result = Validate.notEmpty((CharSequence) "notEmpty_charSequence1", "message1", objectArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("notEmpty_charSequence1")));
    }

    //Sapient generated method id: ${6c1e7a3a-5edc-3c1a-b006-e1be998680e4}
    @Disabled()
    @Test()
    void notEmpty6WhenArrayUtilsIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (chars.length() == 0) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.notEmpty("notEmpty_charSequence1", "message1", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${e8c29ec9-ba2a-33a7-bd39-ea0b80c266ac}
    @Disabled()
    @Test()
    void notEmpty6WhenArrayUtilsNotIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (chars.length() == 0) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("A");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.notEmpty("notEmpty_charSequence1", "A", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${4b40b0ba-b318-3fb6-b7f9-3569b44910af}
    @Test()
    void notEmpty7Test() {
        //Arrange Statement(s)
        try (MockedStatic<Validate> validate = mockStatic(Validate.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            validate.when(() -> Validate.notEmpty("notEmpty_charSequence1", "The validated character sequence is empty", objectArray)).thenReturn("notEmpty_charSequence2");
            //Act Statement(s)
            CharSequence result = Validate.notEmpty("notEmpty_charSequence1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("notEmpty_charSequence2"));
                validate.verify(() -> Validate.notEmpty("notEmpty_charSequence1", "The validated character sequence is empty", objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a20a83da-d67b-3c4b-beca-54c5a6ad3197}
    @Test()
    void notBlankWhenStringUtilsNotIsBlankChars() {
        /* Branches:
         * (StringUtils.isBlank(chars)) : false
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        CharSequence result = Validate.notBlank((CharSequence) "notBlank_charSequence1", "message1", objectArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("notBlank_charSequence1")));
    }

    //Sapient generated method id: ${7842f685-dc9a-3118-bf22-e592b1ac0eb1}
    @Disabled()
    @Test()
    void notBlankWhenArrayUtilsIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (StringUtils.isBlank(chars)) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.notBlank("notBlank_charSequence1", "message1", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${2e78f9e3-ad3a-380e-9822-7f6bb2944ec9}
    @Disabled()
    @Test()
    void notBlankWhenArrayUtilsNotIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (StringUtils.isBlank(chars)) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("A");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.notBlank("notBlank_charSequence1", "A", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${81018e61-e431-3a5c-8eba-ae886d2a49be}
    @Test()
    void notBlank1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Validate> validate = mockStatic(Validate.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            validate.when(() -> Validate.notBlank("notBlank_charSequence1", "The validated character sequence is blank", objectArray)).thenReturn("notBlank_charSequence2");
            //Act Statement(s)
            CharSequence result = Validate.notBlank("notBlank_charSequence1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("notBlank_charSequence2"));
                validate.verify(() -> Validate.notBlank("notBlank_charSequence1", "The validated character sequence is blank", objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${bbb024d0-7b34-381f-aee4-9242ec31ecb2}
    @Test()
    void noNullElementsWhenIIndexOfArrayIsNotNull() {
        /* Branches:
         * (i < array.length) : true
         * (array[i] == null) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object[] objectArray = new Object[]{object};
        Object[] objectArray2 = new Object[]{};
        //Act Statement(s)
        Object[] result = Validate.noNullElements(objectArray, "message1", objectArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectArray)));
    }

    //Sapient generated method id: ${6b55c0b7-4f54-3da8-a824-609aba014282}
    @Test()
    void noNullElementsWhenArrayUtilsIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (i < array.length) : true
         * (array[i] == null) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{(Object) null};
        Object[] objectArray2 = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.noNullElements(objectArray, "message1", objectArray2);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${d4b4d820-dbf4-3a7d-9c71-c8adc67b2f13}
    @Disabled()
    @Test()
    void noNullElementsWhenArrayUtilsNotIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (i < array.length) : true
         * (array[i] == null) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        Object[] objectArray2 = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.noNullElements(objectArray, "message1", objectArray2);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${1d3c7e28-69c9-332e-8bae-e0c6611e2fbc}
    @Test()
    void noNullElements1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Validate> validate = mockStatic(Validate.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            Object[] objectArray2 = new Object[]{};
            Object[] objectArray3 = new Object[]{};
            validate.when(() -> Validate.noNullElements(objectArray2, "The validated array contains null element at index: %d", objectArray3)).thenReturn(objectArray);
            //Act Statement(s)
            Object[] result = Validate.noNullElements(objectArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(objectArray));
                validate.verify(() -> Validate.noNullElements(objectArray2, "The validated array contains null element at index: %d", objectArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3cf6d3d6-b1fd-3aac-9149-e776a7c29252}
    @Disabled()
    @Test()
    void noNullElements2WhenItNextIsNotNull() {
        /* Branches:
         * (it.hasNext()) : true
         * (it.next() == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Iterable iterable = null;
        Object[] objectArray = new Object[]{(Object) null, (Object) null, (Object) null};
        //Act Statement(s)
        Iterable result = Validate.noNullElements(iterable, "Hello World", objectArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(iterable)));
    }

    //Sapient generated method id: ${8733a07f-acb4-3d3f-8544-c31b388f4dfe}
    @Disabled()
    @Test()
    void noNullElements2WhenArrayUtilsIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (it.hasNext()) : true
         * (it.next() == null) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Iterable iterable = null;
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.noNullElements(iterable, "message1", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${ae65c1bd-1142-35cd-a73b-1fff3bab3f15}
    @Disabled()
    @Test()
    void noNullElements2WhenArrayUtilsNotIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (it.hasNext()) : true
         * (it.next() == null) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Iterable iterable = null;
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("A");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.noNullElements(iterable, "A", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${33d23926-43b8-3564-8b12-001b1dc694bf}
    @Test()
    void noNullElements3Test() {
        //Arrange Statement(s)
        try (MockedStatic<Validate> validate = mockStatic(Validate.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            validate.when(() -> Validate.noNullElements((Iterable) null, "The validated collection contains null element at index: %d", objectArray)).thenReturn(null);
            //TODO: Needs initialization with real value
            Iterable iterable = null;
            //Act Statement(s)
            Iterable result = Validate.noNullElements(iterable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                validate.verify(() -> Validate.noNullElements((Iterable) null, "The validated collection contains null element at index: %d", objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${95d5dca1-2925-3131-b026-447a03910656}
    @Test()
    void validIndexWhenIndexLessThanArrayLength() {
        /* Branches:
         * (index < 0) : false
         * (index >= array.length) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object[] objectArray = new Object[]{object};
        Object[] objectArray2 = new Object[]{};
        //Act Statement(s)
        Object[] result = Validate.validIndex(objectArray, 0, "message1", objectArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectArray)));
    }

    //Sapient generated method id: ${0df3469d-fffa-38fe-b5dc-84d7f696868e}
    @Test()
    void validIndexWhenArrayUtilsIsEmptyValuesThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (index < 0) : false
         * (index >= array.length) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        Object[] objectArray2 = new Object[]{};
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("message1");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            Validate.validIndex(objectArray, 1, "message1", objectArray2);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${146a40e6-b40d-3813-a009-0cc2706f666f}
    @Test()
    void validIndexWhenIndexGreaterThanOrEqualsToArrayLengthAndArrayUtilsNotIsEmptyValuesThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (index < 0) : false
         * (index >= array.length) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        Object[] objectArray2 = new Object[]{};
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("A");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            Validate.validIndex(objectArray, 1, "A", objectArray2);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${a841b3b2-5b42-3f3e-80be-39f2dad468ed}
    @Test()
    void validIndex1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Validate> validate = mockStatic(Validate.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            Object[] objectArray2 = new Object[]{};
            Object[] objectArray3 = new Object[]{1};
            validate.when(() -> Validate.validIndex(objectArray2, 1, "The validated array index is invalid: %d", objectArray3)).thenReturn(objectArray);
            //Act Statement(s)
            Object[] result = Validate.validIndex(objectArray2, 1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(objectArray));
                validate.verify(() -> Validate.validIndex(objectArray2, 1, "The validated array index is invalid: %d", objectArray3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b92ea787-f532-3985-b3c0-0a70988fcfe1}
    @Test()
    void validIndex2WhenIndexLessThanCollectionSize() {
        /* Branches:
         * (index < 0) : false
         * (index >= collection.size()) : false
         */
        //Arrange Statement(s)
        Collection collection = new ArrayList<>();
        collection.add(null);
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        Collection result = Validate.validIndex(collection, 0, "message1", objectArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(collection)));
    }

    //Sapient generated method id: ${2619da5e-604f-39da-ad92-ebbe0f4a1ef0}
    @Test()
    void validIndex2WhenArrayUtilsIsEmptyValuesThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (index < 0) : false
         * (index >= collection.size()) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         */
        //Arrange Statement(s)
        Collection collection = new ArrayList<>();
        Object[] objectArray = new Object[]{};
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("message1");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            Validate.validIndex(collection, 1, "message1", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${873e3206-6645-3e96-a7e6-8403c57c9611}
    @Test()
    void validIndex2WhenIndexGreaterThanOrEqualsToCollectionSizeAndArrayUtilsNotIsEmptyValuesThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (index < 0) : false
         * (index >= collection.size()) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Collection collection = new ArrayList<>();
        Object[] objectArray = new Object[]{};
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("A");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            Validate.validIndex(collection, 1, "A", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${ff668939-553b-3ed3-a216-7330781e498d}
    @Test()
    void validIndex3Test() {
        //Arrange Statement(s)
        try (MockedStatic<Validate> validate = mockStatic(Validate.class, CALLS_REAL_METHODS)) {
            Collection collection = new ArrayList<>();
            Object[] objectArray = new Object[]{1};
            validate.when(() -> Validate.validIndex(anyCollection(), eq(1), eq("The validated collection index is invalid: %d"), eq(objectArray))).thenReturn(collection);
            Collection collection2 = new ArrayList<>();
            //Act Statement(s)
            Collection result = Validate.validIndex(collection2, 1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(collection));
                validate.verify(() -> Validate.validIndex(anyCollection(), eq(1), eq("The validated collection index is invalid: %d"), eq(objectArray)), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2db40e26-9d98-3a1e-a580-f90e812f8265}
    @Test()
    void validIndex4WhenIndexLessThanCharsLength() {
        /* Branches:
         * (index < 0) : false
         * (index >= chars.length()) : false
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        CharSequence result = Validate.validIndex((CharSequence) "validIndex_charSequence1", 1, "message1", objectArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("validIndex_charSequence1")));
    }

    //Sapient generated method id: ${f1328dba-8eaf-3f35-90f2-79f6b3b08b0c}
    @Disabled()
    @Test()
    void validIndex4WhenArrayUtilsIsEmptyValuesThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (index < 0) : false
         * (index >= chars.length()) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("message1");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            Validate.validIndex("validIndex_charSequence1", 1, "message1", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${a810500c-02db-3088-86c7-90519ca6fdc6}
    @Disabled()
    @Test()
    void validIndex4WhenIndexGreaterThanOrEqualsToCharsLengthAndArrayUtilsNotIsEmptyValuesThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (index < 0) : false
         * (index >= chars.length()) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("A");
        //Act Statement(s)
        final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
            Validate.validIndex("validIndex_charSequence1", 1, "A", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
        });
    }

    //Sapient generated method id: ${35f95ed8-590d-39b5-85ef-eb9b31c81849}
    @Test()
    void validIndex5Test() {
        //Arrange Statement(s)
        try (MockedStatic<Validate> validate = mockStatic(Validate.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{1};
            validate.when(() -> Validate.validIndex("validIndex_charSequence1", 1, "The validated character sequence index is invalid: %d", objectArray)).thenReturn("validIndex_charSequence2");
            //Act Statement(s)
            CharSequence result = Validate.validIndex("validIndex_charSequence1", 1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("validIndex_charSequence2"));
                validate.verify(() -> Validate.validIndex("validIndex_charSequence1", 1, "The validated character sequence index is invalid: %d", objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a0c57d79-eb2f-32da-b5a1-afcd431eefb8}
    @Test()
    void validStateWhenNotExpressionThrowsIllegalStateException() {
        /* Branches:
         * (!expression) : true
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("The validated state is false");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            Validate.validState(false);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${82795518-cc7c-3c72-a9b8-64482ce2e704}
    @Test()
    void validStateWhenExpression() {
        /* Branches:
         * (!expression) : false
         */
        //Act Statement(s)
        Validate.validState(true);
    }

    //Sapient generated method id: ${9f9b1cea-2eb8-3fb1-88bf-f6d9589df79e}
    @Test()
    void validState1WhenExpression() {
        /* Branches:
         * (!expression) : false
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        Validate.validState(true, "message1", objectArray);
    }

    //Sapient generated method id: ${0cb61365-8e6f-3d35-853e-d02940c52fcd}
    @Test()
    void validState1WhenArrayUtilsIsEmptyValuesThrowsIllegalStateException() {
        /* Branches:
         * (!expression) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        IllegalStateException illegalStateException = new IllegalStateException("message1");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            Validate.validState(false, "message1", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${961f73ce-be54-33f6-994b-0703478dcb21}
    @Test()
    void validState1WhenArrayUtilsNotIsEmptyValuesThrowsIllegalStateException() {
        /* Branches:
         * (!expression) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        IllegalStateException illegalStateException = new IllegalStateException("A");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            Validate.validState(false, "A", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${e0449c0c-e2be-37fb-9534-c72211f2baf1}
    @Disabled()
    @Test()
    void matchesPatternWhenPatternNotMatchesPatternInputThrowsIllegalArgumentException() {
        /* Branches:
         * (!Pattern.matches(pattern, input)) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The string null does not match the pattern null");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.matchesPattern((CharSequence) "matchesPattern_charSequence1", "A");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${c4f0724a-e087-3577-8a62-5c63793a4ce7}
    @Test()
    void matchesPatternWhenPatternMatchesPatternInput() {
        /* Branches:
         * (!Pattern.matches(pattern, input)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Validate.matchesPattern("matchesPattern_charSequence1", "\\w+");
    }

    //Sapient generated method id: ${50af79e9-269e-3c19-92b0-3e7717196cf4}
    @Disabled()
    @Test()
    void matchesPattern1WhenPatternMatchesPatternInput() {
        /* Branches:
         * (!Pattern.matches(pattern, input)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        Validate.matchesPattern("matchesPattern_charSequence1", "\\d+", "Input does not match pattern", objectArray);
    }

    //Sapient generated method id: ${04788ea9-83aa-364e-bdd2-a1ce3e1e8a22}
    @Test()
    void matchesPattern1WhenArrayUtilsIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (!Pattern.matches(pattern, input)) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.matchesPattern((CharSequence) "matchesPattern_charSequence1", "pattern1", "message1", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${78198dea-27e4-3b9a-b4c9-32f2f3fb525e}
    @Test()
    void matchesPattern1WhenArrayUtilsNotIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (!Pattern.matches(pattern, input)) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("A");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.matchesPattern("matchesPattern_charSequence1", "pattern1", "A", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${d3ca8460-6aac-3e82-97da-4767166c21ec}
    @Test()
    void notNaNTest() {
        //Arrange Statement(s)
        try (MockedStatic<Validate> validate = mockStatic(Validate.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            validate.when(() -> Validate.notNaN(Double.parseDouble("0.0"), "The validated value is not a number", objectArray)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            Validate.notNaN(Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> validate.verify(() -> Validate.notNaN(Double.parseDouble("0.0"), "The validated value is not a number", objectArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${6574b7ce-6bee-381b-9b59-c91fd3f73357}
    @Test()
    void notNaN1WhenDoubleNotIsNaNValue() {
        /* Branches:
         * (Double.isNaN(value)) : false
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        Validate.notNaN(Double.parseDouble("0.0"), "message1", objectArray);
    }

    //Sapient generated method id: ${c9e98df3-c1ce-34f2-8d0e-1772eb42b4d1}
    @Disabled()
    @Test()
    void notNaN1WhenArrayUtilsIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (Double.isNaN(value)) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.notNaN(Double.parseDouble("0.0"), "message1", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${f03f848a-1eba-35ff-9c4a-957761ddda8d}
    @Disabled()
    @Test()
    void notNaN1WhenArrayUtilsNotIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (Double.isNaN(value)) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.notNaN(Double.parseDouble("0.0"), "message1", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${7cc5ddfa-7bbd-37c3-93cf-18388c1cc90d}
    @Test()
    void finiteTest() {
        //Arrange Statement(s)
        try (MockedStatic<Validate> validate = mockStatic(Validate.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{Double.parseDouble("0.0")};
            validate.when(() -> Validate.finite(Double.parseDouble("0.0"), "The value is invalid: %f", objectArray)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            Validate.finite(Double.parseDouble("0.0"));
            //Assert statement(s)
            assertAll("result", () -> validate.verify(() -> Validate.finite(Double.parseDouble("0.0"), "The value is invalid: %f", objectArray), atLeast(1)));
        }
    }

    //Sapient generated method id: ${ba42a724-9ea4-394a-b497-e782bdb10e98}
    @Test()
    void finite1WhenDoubleNotIsInfiniteValue() {
        /* Branches:
         * (Double.isNaN(value)) : false
         * (Double.isInfinite(value)) : false
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        Validate.finite(Double.parseDouble("0.0"), "message1", objectArray);
    }

    //Sapient generated method id: ${e33e5dcc-412a-3caf-a6a2-890967b3ea41}
    @Disabled()
    @Test()
    void finite1WhenArrayUtilsIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (Double.isNaN(value)) : false
         * (Double.isInfinite(value)) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.finite(Double.parseDouble("0.0"), "message1", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${8e4e2dcb-d737-3ff6-9202-24a9e043dcaf}
    @Disabled()
    @Test()
    void finite1WhenArrayUtilsNotIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (Double.isNaN(value)) : false
         * (Double.isInfinite(value)) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.finite(Double.parseDouble("0.0"), "message1", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${d532e3be-189e-3a69-889e-05862e3eb13e}
    @Disabled()
    @Test()
    void inclusiveBetweenWhenValueCompareToEndGreaterThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (value.compareTo(start) < 0) : false
         * (value.compareTo(end) > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object objectMock = mock(Object.class, "inclusiveBetween_object1");
        Object objectMock2 = mock(Object.class, "inclusiveBetween_object2");
        //TODO: Needs initialization with real value
        Comparable<Object> comparable = null;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The value null is not in the specified inclusive range of null to null");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.inclusiveBetween(objectMock, objectMock2, comparable);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${50998776-e3ff-373e-afc8-e0fea3253071}
    @Disabled()
    @Test()
    void inclusiveBetweenWhenValueCompareToEndNotGreaterThan0() {
        /* Branches:
         * (value.compareTo(start) < 0) : false
         * (value.compareTo(end) > 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        //TODO: Needs initialization with real value
        Comparable<Object> comparable = null;
        //Act Statement(s)
        Validate.inclusiveBetween(object, object2, comparable);
    }

    //Sapient generated method id: ${7ae1f58a-7bc5-3edd-b166-b05f313194b2}
    @Disabled()
    @Test()
    void inclusiveBetween1WhenValueCompareToEndNotGreaterThan0() {
        /* Branches:
         * (value.compareTo(start) < 0) : false
         * (value.compareTo(end) > 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        //TODO: Needs initialization with real value
        Comparable<Object> comparable = null;
        Object[] objectArray = new Object[]{(Object) null, (Object) null, (Object) null};
        //Act Statement(s)
        Validate.inclusiveBetween(object, object2, comparable, "This is a sample message.", objectArray);
    }

    //Sapient generated method id: ${521cb31f-16d7-3db1-8f60-6576b0fc12d5}
    @Disabled()
    @Test()
    void inclusiveBetween1WhenArrayUtilsIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (value.compareTo(start) < 0) : false
         * (value.compareTo(end) > 0) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        //TODO: Needs initialization with real value
        Comparable<Object> comparable = null;
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.inclusiveBetween(object, object2, comparable, "message1", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${79b5fb71-59db-3467-8b63-e5e9e19f0b72}
    @Disabled()
    @Test()
    void inclusiveBetween1WhenArrayUtilsNotIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (value.compareTo(start) < 0) : false
         * (value.compareTo(end) > 0) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        //TODO: Needs initialization with real value
        Comparable<Object> comparable = null;
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("A");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.inclusiveBetween(object, object2, comparable, "A", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${084779fa-d66f-37b8-bdd2-1e90b19459fb}
    @Test()
    void inclusiveBetween2WhenValueGreaterThanEndThrowsIllegalArgumentException() {
        /* Branches:
         * (value < start) : false
         * (value > end) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The value 3 is not in the specified inclusive range of 2 to 2");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.inclusiveBetween(2L, 2L, 3L);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${1d2f121d-def1-3a72-9018-f66ab09015dc}
    @Test()
    void inclusiveBetween2WhenValueNotGreaterThanEnd() {
        /* Branches:
         * (value < start) : false
         * (value > end) : false
         */
        //Act Statement(s)
        Validate.inclusiveBetween(1L, 2L, 2L);
    }

    //Sapient generated method id: ${b1ce4ebd-3510-34b1-b431-954f9d3e9056}
    @Test()
    void inclusiveBetween3WhenValueGreaterThanEndThrowsIllegalArgumentException() {
        /* Branches:
         * (value < start) : false
         * (value > end) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.inclusiveBetween(1L, 1L, 2L, "message1");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${884c90e4-9b50-3487-9b92-5745364bcc57}
    @Test()
    void inclusiveBetween3WhenValueNotGreaterThanEnd() {
        /* Branches:
         * (value < start) : false
         * (value > end) : false
         */
        //Act Statement(s)
        Validate.inclusiveBetween(1L, 2L, 2L, "message1");
    }

    //Sapient generated method id: ${a548e489-0245-354a-adca-8cf351835d82}
    @Disabled()
    @Test()
    void inclusiveBetween4WhenValueGreaterThanEndThrowsIllegalArgumentException() {
        /* Branches:
         * (value < start) : false
         * (value > end) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The value null is not in the specified inclusive range of null to null");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.inclusiveBetween(Double.parseDouble("0.25"), Double.parseDouble("0.25"), Double.parseDouble("0.3125"));
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${9dc8390c-03f4-3aad-8e45-644d402c6c19}
    @Test()
    void inclusiveBetween4WhenValueNotGreaterThanEnd() {
        /* Branches:
         * (value < start) : false
         * (value > end) : false
         */
        //Act Statement(s)
        Validate.inclusiveBetween(Double.parseDouble("0.5"), Double.parseDouble("0.5"), Double.parseDouble("0.5"));
    }

    //Sapient generated method id: ${3698b123-cc41-39a2-9099-2645ae80a00b}
    @Test()
    void inclusiveBetween5WhenValueGreaterThanEndThrowsIllegalArgumentException() {
        /* Branches:
         * (value < start) : false
         * (value > end) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.inclusiveBetween(Double.parseDouble("0.25"), Double.parseDouble("0.25"), Double.parseDouble("0.5"), "message1");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${a94ca94b-2f68-3ca7-ac3b-0d374be42a99}
    @Test()
    void inclusiveBetween5WhenValueNotGreaterThanEnd() {
        /* Branches:
         * (value < start) : false
         * (value > end) : false
         */
        //Act Statement(s)
        Validate.inclusiveBetween(Double.parseDouble("0.5"), Double.parseDouble("0.5"), Double.parseDouble("0.5"), "message1");
    }

    //Sapient generated method id: ${f6dfb700-505b-384d-8f7d-8650580ec30d}
    @Disabled()
    @Test()
    void exclusiveBetweenWhenValueCompareToEndGreaterThanOrEqualsTo0ThrowsIllegalArgumentException() {
        /* Branches:
         * (value.compareTo(start) <= 0) : false
         * (value.compareTo(end) >= 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object objectMock = mock(Object.class, "exclusiveBetween_object1");
        Object objectMock2 = mock(Object.class, "exclusiveBetween_object2");
        //TODO: Needs initialization with real value
        Comparable<Object> comparable = null;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The value null is not in the specified exclusive range of null to null");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.exclusiveBetween(objectMock, objectMock2, comparable);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${a51c7422-f0ec-3b5b-b213-50054291b6ed}
    @Disabled()
    @Test()
    void exclusiveBetweenWhenValueCompareToEndLessThan0() {
        /* Branches:
         * (value.compareTo(start) <= 0) : false
         * (value.compareTo(end) >= 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        //TODO: Needs initialization with real value
        Comparable<Object> comparable = null;
        //Act Statement(s)
        Validate.exclusiveBetween(object, object2, comparable);
    }

    //Sapient generated method id: ${b0ce553b-84a2-34eb-b9e4-2cf661d14244}
    @Disabled()
    @Test()
    void exclusiveBetween1WhenValueCompareToEndLessThan0() {
        /* Branches:
         * (value.compareTo(start) <= 0) : false
         * (value.compareTo(end) >= 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        //TODO: Needs initialization with real value
        Comparable<Object> comparable = null;
        Object[] objectArray = new Object[]{(Object) null, (Object) null, (Object) null};
        //Act Statement(s)
        Validate.exclusiveBetween(object, object2, comparable, "Hello World", objectArray);
    }

    //Sapient generated method id: ${039eaa48-8b5e-3e3f-9cd3-3501b9304f0e}
    @Disabled()
    @Test()
    void exclusiveBetween1WhenArrayUtilsIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (value.compareTo(start) <= 0) : false
         * (value.compareTo(end) >= 0) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        //TODO: Needs initialization with real value
        Comparable<Object> comparable = null;
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.exclusiveBetween(object, object2, comparable, "message1", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${6bc8c036-c660-37e5-8663-af1ff827794a}
    @Disabled()
    @Test()
    void exclusiveBetween1WhenArrayUtilsNotIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (value.compareTo(start) <= 0) : false
         * (value.compareTo(end) >= 0) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        //TODO: Needs initialization with real value
        Comparable<Object> comparable = null;
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("A");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.exclusiveBetween(object, object2, comparable, "A", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${46b2301b-cbe0-35e7-a029-1ca9fde46b24}
    @Test()
    void exclusiveBetween2WhenValueGreaterThanOrEqualsToEndThrowsIllegalArgumentException() {
        /* Branches:
         * (value <= start) : false
         * (value >= end) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The value 3 is not in the specified exclusive range of 2 to 2");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.exclusiveBetween(2L, 2L, 3L);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${da5b8267-8994-386c-abd0-1104dfef521f}
    @Test()
    void exclusiveBetween2WhenValueLessThanEnd() {
        /* Branches:
         * (value <= start) : false
         * (value >= end) : false
         */
        //Act Statement(s)
        Validate.exclusiveBetween(1L, 3L, 2L);
    }

    //Sapient generated method id: ${53478f9e-dcce-3b25-a32c-5ed730a085f2}
    @Test()
    void exclusiveBetween3WhenValueGreaterThanOrEqualsToEndThrowsIllegalArgumentException() {
        /* Branches:
         * (value <= start) : false
         * (value >= end) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.exclusiveBetween(1L, 1L, 2L, "message1");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${ca14bb15-a9d9-350a-8476-bfb366bb4c5b}
    @Test()
    void exclusiveBetween3WhenValueLessThanEnd() {
        /* Branches:
         * (value <= start) : false
         * (value >= end) : false
         */
        //Act Statement(s)
        Validate.exclusiveBetween(1L, 3L, 2L, "message1");
    }

    //Sapient generated method id: ${fd72ee50-16a9-3001-9236-4ebd94d5d2e5}
    @Disabled()
    @Test()
    void exclusiveBetween4WhenValueGreaterThanOrEqualsToEndThrowsIllegalArgumentException() {
        /* Branches:
         * (value <= start) : false
         * (value >= end) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The value null is not in the specified exclusive range of null to null");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.exclusiveBetween(Double.parseDouble("0.25"), Double.parseDouble("0.25"), Double.parseDouble("0.3125"));
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${a34211ee-5ff5-37ff-8673-1cfcf7153026}
    @Test()
    void exclusiveBetween4WhenValueLessThanEnd() {
        /* Branches:
         * (value <= start) : false
         * (value >= end) : false
         */
        //Act Statement(s)
        Validate.exclusiveBetween(Double.parseDouble("0.25"), Double.parseDouble("0.75"), Double.parseDouble("0.5"));
    }

    //Sapient generated method id: ${2ae8a6c6-bb2a-3c15-9e2e-2d732fd7310a}
    @Test()
    void exclusiveBetween5WhenValueGreaterThanOrEqualsToEndThrowsIllegalArgumentException() {
        /* Branches:
         * (value <= start) : false
         * (value >= end) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.exclusiveBetween(Double.parseDouble("0.25"), Double.parseDouble("0.25"), Double.parseDouble("0.5"), "message1");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${2853f9dc-65f8-39e8-8a9e-d3e8942d3b32}
    @Test()
    void exclusiveBetween5WhenValueLessThanEnd() {
        /* Branches:
         * (value <= start) : false
         * (value >= end) : false
         */
        //Act Statement(s)
        Validate.exclusiveBetween(Double.parseDouble("0.25"), Double.parseDouble("0.75"), Double.parseDouble("0.5"), "message1");
    }

    //Sapient generated method id: ${68da990b-d900-31f1-a470-a41daf8ff077}
    @Disabled()
    @Test()
    void isInstanceOfWhenTypeNotIsInstanceObjThrowsIllegalArgumentException() {
        /* Branches:
         * (!type.isInstance(obj)) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected type: null, actual: null");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.isInstanceOf(Object.class, object);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${d85a7a33-2ff6-310c-b983-e7c10bb3851e}
    @Test()
    void isInstanceOfWhenTypeIsInstanceObj() {
        /* Branches:
         * (!type.isInstance(obj)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        //Act Statement(s)
        Validate.isInstanceOf(Object.class, object);
    }

    //Sapient generated method id: ${99bc7af3-4322-3daf-8688-132bde8e9300}
    @Test()
    void isInstanceOf1WhenTypeIsInstanceObj() {
        /* Branches:
         * (!type.isInstance(obj)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        Validate.isInstanceOf(Object.class, object, "message1", objectArray);
    }

    //Sapient generated method id: ${000ec456-6bea-31e1-94b5-0d1e09d404ce}
    @Disabled()
    @Test()
    void isInstanceOf1WhenArrayUtilsIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (!type.isInstance(obj)) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.isInstanceOf(Object.class, object, "message1", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${f9a6d6c6-a099-3a0e-8466-eedb331a2c05}
    @Disabled()
    @Test()
    void isInstanceOf1WhenArrayUtilsNotIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (!type.isInstance(obj)) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("A");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.isInstanceOf(Object.class, object, "A", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${edff8810-4dda-3e8c-9dd9-1d44190b1f89}
    @Disabled()
    @Test()
    void isAssignableFromWhenSuperTypeNotIsAssignableFromTypeThrowsIllegalArgumentException() {
        /* Branches:
         * (type == null) : false
         * (superType == null) : false
         * (!superType.isAssignableFrom(type)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot assign a A to a B");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.isAssignableFrom(Object.class, Object.class);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${532cc7f4-53b4-38bc-9179-4a37dcd36b03}
    @Test()
    void isAssignableFromWhenSuperTypeIsAssignableFromType() {
        /* Branches:
         * (type == null) : false
         * (superType == null) : false
         * (!superType.isAssignableFrom(type)) : false
         */
        //Act Statement(s)
        Validate.isAssignableFrom(Object.class, Object.class);
    }

    //Sapient generated method id: ${4ad97749-aaf0-35f2-846a-25110250144e}
    @Test()
    void isAssignableFrom1WhenSuperTypeIsAssignableFromType() {
        /* Branches:
         * (!superType.isAssignableFrom(type)) : false
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        Validate.isAssignableFrom(Object.class, Object.class, "message1", objectArray);
    }

    //Sapient generated method id: ${8a8d840b-47a2-3f32-b161-0557698092d8}
    @Disabled()
    @Test()
    void isAssignableFrom1WhenArrayUtilsIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (!superType.isAssignableFrom(type)) : true
         * (ArrayUtils.isEmpty(values)) : true  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.isAssignableFrom(Object.class, Object.class, "message1", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${69202a7b-d7ad-3d44-b7f3-867fb2a8a79e}
    @Disabled()
    @Test()
    void isAssignableFrom1WhenArrayUtilsNotIsEmptyValuesThrowsIllegalArgumentException() {
        /* Branches:
         * (!superType.isAssignableFrom(type)) : true
         * (ArrayUtils.isEmpty(values)) : false  #  inside getMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("A");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Validate.isAssignableFrom(Object.class, Object.class, "A", objectArray);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }
}
