package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.EnumSet;
import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;

import org.mockito.MockedStatic;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
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
class EnumUtilsSapientGeneratedTest {

    //Sapient generated method id: ${64c5b9a2-d567-38e7-8d06-c20cfd8d7e46}
    @Test()
    void generateBitVector1WhenConstantsLengthLessThanOrEqualsToLongSIZEThrowsIllegalArgumentException() {
        /* Branches:
         * (constants.length <= Long.SIZE) : true  #  inside checkBitVectorable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Iterable iterable = null;
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            EnumUtils.generateBitVector(Enum.class, iterable);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${74e121db-7816-3fdc-bf48-c31748aa1299}
    @Disabled()
    @Test()
    void generateBitVectors1WhenCondensedIsNotEmpty() {
        /* Branches:
         * (for-each(condensed)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Iterable iterable = null;
        //Act Statement(s)
        long[] result = EnumUtils.generateBitVectors(Enum.class, iterable);
        long[] longResultArray = new long[]{0L};
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longResultArray)));
    }

    //Sapient generated method id: ${e653e082-1073-3e19-a7ae-6c9d76dc9144}
    @Test()
    void getEnumTest() {
        //Arrange Statement(s)
        try (MockedStatic<EnumUtils> enumUtils = mockStatic(EnumUtils.class, CALLS_REAL_METHODS)) {
            enumUtils.when(() -> EnumUtils.getEnum(Enum.class, "enumName1", (Enum) null)).thenReturn(null);
            //Act Statement(s)
            Enum result = EnumUtils.getEnum(Enum.class, "enumName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                enumUtils.verify(() -> EnumUtils.getEnum(Enum.class, "enumName1", (Enum) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${244c9518-4a45-3b6d-9440-0829bfa6a889}
    @Test()
    void getEnum1WhenEnumNameIsNull() {
        /* Branches:
         * (enumName == null) : true
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Enum _enum = null;
        //Act Statement(s)
        Enum result = EnumUtils.getEnum(Enum.class, (String) null, _enum);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(_enum)));
    }

    //Sapient generated method id: ${3e38c9d6-cf17-3e27-a2f8-90689081e009}
    @Test()
    void getEnum1WhenEnumNameIsNotNull() {
        /* Branches:
         * (enumName == null) : false
         */
        //Arrange Statement(s)
        Enum _enum = null;
        //Act Statement(s)
        Enum result = EnumUtils.getEnum(Enum.class, "enumName1", _enum);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(_enum)));
    }

    //Sapient generated method id: ${76dc6bed-d4cc-3789-83cd-f446607873de}
    @Test()
    void getEnum1WhenCaughtIllegalArgumentException() {
        /* Branches:
         * (enumName == null) : false
         * (catch-exception (IllegalArgumentException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Enum _enum = null;
        //Act Statement(s)
        Enum result = EnumUtils.getEnum(Enum.class, "enumName1", _enum);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(_enum)));
    }

    //Sapient generated method id: ${bcf01090-f86a-35a9-9431-f5f932dd992a}
    @Test()
    void getEnumIgnoreCaseTest() {
        //Arrange Statement(s)
        try (MockedStatic<EnumUtils> enumUtils = mockStatic(EnumUtils.class, CALLS_REAL_METHODS)) {
            enumUtils.when(() -> EnumUtils.getEnumIgnoreCase(Enum.class, "enumName1", (Enum) null)).thenReturn(null);
            //Act Statement(s)
            Enum result = EnumUtils.getEnumIgnoreCase(Enum.class, "enumName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                enumUtils.verify(() -> EnumUtils.getEnumIgnoreCase(Enum.class, "enumName1", (Enum) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${57a424ae-25db-3ded-9978-1b0487812a54}
    @Test()
    void getEnumIgnoreCase1Test() {
        //Arrange Statement(s)
        try (MockedStatic<EnumUtils> enumUtils = mockStatic(EnumUtils.class, CALLS_REAL_METHODS)) {
            enumUtils.when(() -> EnumUtils.getFirstEnumIgnoreCase(eq(Enum.class), eq("enumName1"), (Function) any(), eq((Enum) null))).thenReturn(null);
            //TODO: Needs initialization with real value
            Enum _enum = null;
            //Act Statement(s)
            Enum result = EnumUtils.getEnumIgnoreCase(Enum.class, "enumName1", _enum);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                enumUtils.verify(() -> EnumUtils.getFirstEnumIgnoreCase(eq(Enum.class), eq("enumName1"), (Function) any(), eq((Enum) null)), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5e12cbe1-80fb-3d79-af39-2f38045155ea}
    @Disabled()
    @Test()
    void getEnumListTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        List result = EnumUtils.getEnumList(Enum.class);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${b7889fb3-5857-397d-ae8f-f33ccd4d2f38}
    @Disabled()
    @Test()
    void getEnumMapTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Map result = EnumUtils.getEnumMap(Enum.class);
        Map<String, Enum> stringEnumResultMap = new HashMap<>();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringEnumResultMap)));
    }

    //Sapient generated method id: ${305fe02e-3621-3538-9235-7086b8a7c8f9}
    @Disabled()
    @Test()
    void getEnumMap1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Function<Enum, Object> function = null;
        //Act Statement(s)
        Map result = EnumUtils.getEnumMap(Enum.class, function);
        Map<Object, Enum> objectEnumResultMap = new HashMap<>();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectEnumResultMap)));
    }

    //Sapient generated method id: ${0096e3c4-49b0-3d95-9b5b-b207bc6f6be3}
    @Test()
    void getEnumSystemPropertyWhenPropNameIsNull() {
        /* Branches:
         * (enumClass == null) : false
         * (propName == null) : true
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Enum _enum = null;
        //Act Statement(s)
        Enum result = EnumUtils.getEnumSystemProperty(Enum.class, (String) null, _enum);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(_enum)));
    }

    //Sapient generated method id: ${06d576d1-2011-3da4-baaa-73a1dce90230}
    @Disabled()
    @Test()
    void getEnumSystemPropertyWhenPropNameIsNotNull() {
        /* Branches:
         * (enumClass == null) : false
         * (propName == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<EnumUtils> enumUtils = mockStatic(EnumUtils.class, CALLS_REAL_METHODS)) {
            enumUtils.when(() -> EnumUtils.getEnum(Enum.class, "enumName1", (Enum) null)).thenReturn(null);
            //TODO: Needs initialization with real value
            Enum _enum = null;
            //Act Statement(s)
            Enum result = EnumUtils.getEnumSystemProperty(Enum.class, "propName1", _enum);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                enumUtils.verify(() -> EnumUtils.getEnum(Enum.class, "enumName1", (Enum) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${aefcd1b2-4a24-3dad-81d8-a7bfae265f37}
    @Test()
    void getFirstEnumIgnoreCaseWhenEnumClassNotIsEnum() {
        /* Branches:
         * (enumName == null) : false
         * (!enumClass.isEnum()) : true
         */
        //Arrange Statement(s)
        Function<Enum, String> function = null;
        Enum _enum = null;
        //Act Statement(s)
        Enum result = EnumUtils.getFirstEnumIgnoreCase(Enum.class, "enumName1", function, _enum);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(_enum)));
    }

    //Sapient generated method id: ${6efefff9-3482-3f71-b854-325960e09c03}
    @Disabled()
    @Test()
    void isValidEnumWhenGetEnumEnumClassEnumNameIsNotNull() {
        /* Branches:
         * (getEnum(enumClass, enumName) != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<EnumUtils> enumUtils = mockStatic(EnumUtils.class, CALLS_REAL_METHODS)) {
            enumUtils.when(() -> EnumUtils.getEnum(Enum.class, "enumName1")).thenReturn(null);
            //Act Statement(s)
            boolean result = EnumUtils.isValidEnum(Enum.class, "enumName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                enumUtils.verify(() -> EnumUtils.getEnum(Enum.class, "enumName1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a8fbd573-befc-3aaf-9ec1-85118a8be346}
    @Test()
    void isValidEnumWhenGetEnumEnumClassEnumNameIsNull() {
        /* Branches:
         * (getEnum(enumClass, enumName) != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<EnumUtils> enumUtils = mockStatic(EnumUtils.class, CALLS_REAL_METHODS)) {
            enumUtils.when(() -> EnumUtils.getEnum(Enum.class, "enumName1")).thenReturn(null);
            //Act Statement(s)
            boolean result = EnumUtils.isValidEnum(Enum.class, "enumName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                enumUtils.verify(() -> EnumUtils.getEnum(Enum.class, "enumName1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0cca7785-b96c-3240-86bd-61d12a3a9a89}
    @Disabled()
    @Test()
    void isValidEnumIgnoreCaseWhenGetEnumIgnoreCaseEnumClassEnumNameIsNotNull() {
        /* Branches:
         * (getEnumIgnoreCase(enumClass, enumName) != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<EnumUtils> enumUtils = mockStatic(EnumUtils.class, CALLS_REAL_METHODS)) {
            enumUtils.when(() -> EnumUtils.getEnumIgnoreCase(Enum.class, "enumName1")).thenReturn(null);
            //Act Statement(s)
            boolean result = EnumUtils.isValidEnumIgnoreCase(Enum.class, "enumName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                enumUtils.verify(() -> EnumUtils.getEnumIgnoreCase(Enum.class, "enumName1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4e08b384-0bfb-3e6d-8879-49a49a6dca1d}
    @Test()
    void isValidEnumIgnoreCaseWhenGetEnumIgnoreCaseEnumClassEnumNameIsNull() {
        /* Branches:
         * (getEnumIgnoreCase(enumClass, enumName) != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<EnumUtils> enumUtils = mockStatic(EnumUtils.class, CALLS_REAL_METHODS)) {
            enumUtils.when(() -> EnumUtils.getEnumIgnoreCase(Enum.class, "enumName1")).thenReturn(null);
            //Act Statement(s)
            boolean result = EnumUtils.isValidEnumIgnoreCase(Enum.class, "enumName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                enumUtils.verify(() -> EnumUtils.getEnumIgnoreCase(Enum.class, "enumName1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${62366b75-2886-3cf3-b6a4-73ef53d59241}
    @Test()
    void processBitVectorWhenConstantsLengthLessThanOrEqualsToLongSIZEThrowsIllegalArgumentException() {
        /* Branches:
         * (constants.length <= Long.SIZE) : true  #  inside checkBitVectorable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            EnumUtils.processBitVector(Enum.class, 0L);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${06105b27-ee6a-3562-af83-bd977643c97f}
    @Disabled()
    @Test()
    void processBitVectorsWhenBlockIndexOfLvaluesAnd1LConstantOrdinalModulusLongSIZENotEquals0() {
        /* Branches:
         * (for-each(enumClass.getEnumConstants())) : true
         * (block < lvalues.length) : true
         * ((lvalues[block] & 1L << (constant.ordinal() % Long.SIZE)) != 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        long[] longArray = new long[]{};
        //Act Statement(s)
        EnumSet result = EnumUtils.processBitVectors(Enum.class, longArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }
}
