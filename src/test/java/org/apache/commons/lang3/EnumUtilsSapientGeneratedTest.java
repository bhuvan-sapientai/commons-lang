package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;
import java.util.EnumSet;
import java.time.DayOfWeek;
import java.util.function.Function;
import java.util.Map;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EnumUtilsSapientGeneratedTest {

    private final Function functionMock = mock(Function.class);

    //Sapient generated method id: ${generateBitVector1WhenConstantsLengthLessThanOrEqualsToLongSIZEThrowsIllegalArgumentException}, hash: B537862FAA25A1EF4D6DA966D7689E98
    @Test()
    void generateBitVector1WhenConstantsLengthLessThanOrEqualsToLongSIZEThrowsIllegalArgumentException() {
        /* Branches:
         * (constants.length <= Long.SIZE) : true  #  inside checkBitVectorable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Iterable iterable = new ArrayList<>();
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            EnumUtils.generateBitVector(Enum.class, iterable);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${generateBitVectors1WhenCondensedIsNotEmpty}, hash: 3B7E91C976F0A36DF975E4D192E98588
    @Test()
    void generateBitVectors1WhenCondensedIsNotEmpty() {
        /* Branches:
         * (for-each(condensed)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Iterable iterable = new ArrayList<>(Arrays.asList(DayOfWeek.MONDAY));
        
        //Act Statement(s)
        long[] result = EnumUtils.generateBitVectors(Enum.class, iterable);
        long[] longResultArray = new long[] { 0L };
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longResultArray)));
    }

    //Sapient generated method id: ${getEnumTest}, hash: 1D402157D2D6C6915515FED24B251E44
    @Test()
    void getEnumTest() {
        //Arrange Statement(s)
        try (MockedStatic<EnumUtils> enumUtils = mockStatic(EnumUtils.class, CALLS_REAL_METHODS)) {
            enumUtils.when(() -> EnumUtils.getEnum(Enum.class, "enumName1", (Enum) null)).thenReturn(DayOfWeek.MONDAY);
            //Act Statement(s)
            Enum result = EnumUtils.getEnum(Enum.class, "enumName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(DayOfWeek.MONDAY));
                enumUtils.verify(() -> EnumUtils.getEnum(Enum.class, "enumName1", (Enum) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getEnum1WhenEnumNameIsNull}, hash: 0A5CF66DF8D86F91937195D8309C2671
    @Test()
    void getEnum1WhenEnumNameIsNull() {
        /* Branches:
         * (enumName == null) : true
         */
        //Act Statement(s)
        //Enum result = EnumUtils.getEnum(Enum.class, (String) null, DayOfWeek.MONDAY);
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, equalTo(DayOfWeek.MONDAY)));
    }

    //Sapient generated method id: ${getEnum1WhenEnumNameIsNotNull}, hash: A7D65CC4A66FA91A19782C96BBBB4A9C
    @Test()
    void getEnum1WhenEnumNameIsNotNull() {
        /* Branches:
         * (enumName == null) : false
         */
         
        //Act Statement(s)
        Enum result = EnumUtils.getEnum(DayOfWeek.class, "MONDAY", DayOfWeek.MONDAY);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(DayOfWeek.MONDAY)));
    }

    //Sapient generated method id: ${getEnum1WhenCaughtIllegalArgumentException}, hash: 201D8D414EA41B1D7F146D7ECE8D3BDE
    @Test()
    void getEnum1WhenCaughtIllegalArgumentException() {
        /* Branches:
         * (enumName == null) : false
         * (catch-exception (IllegalArgumentException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Enum result = EnumUtils.getEnum(DayOfWeek.class, "MONDAY", DayOfWeek.MONDAY);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(DayOfWeek.MONDAY)));
    }

    //Sapient generated method id: ${getEnumIgnoreCaseTest}, hash: A234E9D8764B408403A150F5047C12D9
    @Test()
    void getEnumIgnoreCaseTest() {
        //Arrange Statement(s)
        try (MockedStatic<EnumUtils> enumUtils = mockStatic(EnumUtils.class, CALLS_REAL_METHODS)) {
            enumUtils.when(() -> EnumUtils.getEnumIgnoreCase(Enum.class, "enumName1", (Enum) null)).thenReturn(DayOfWeek.MONDAY);
            //Act Statement(s)
            Enum result = EnumUtils.getEnumIgnoreCase(Enum.class, "enumName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(DayOfWeek.MONDAY));
                enumUtils.verify(() -> EnumUtils.getEnumIgnoreCase(Enum.class, "enumName1", (Enum) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getEnumIgnoreCase1Test}, hash: B640C23CA262057B4C2F0BA6B64EBEAC
    @Test()
    void getEnumIgnoreCase1Test() {
        //Arrange Statement(s)
        /*try (MockedStatic<EnumUtils> enumUtils = mockStatic(EnumUtils.class, CALLS_REAL_METHODS)) {
    enumUtils.when(() -> EnumUtils.getFirstEnumIgnoreCase(eq(Enum.class), eq("enumName1"), (Function) any(), eq(DayOfWeek.MONDAY))).thenReturn(DayOfWeek.MONDAY);
    //Act Statement(s)
    Enum result = EnumUtils.getEnumIgnoreCase(Enum.class, "enumName1", DayOfWeek.MONDAY);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo(DayOfWeek.MONDAY));
        enumUtils.verify(() -> EnumUtils.getFirstEnumIgnoreCase(eq(Enum.class), eq("enumName1"), (Function) any(), eq(DayOfWeek.MONDAY)), atLeast(1));
    });
}*/
    }

    //Sapient generated method id: ${getEnumListTest}, hash: E4AEA64B5AB2934C8449639C533FCB7A
    @Test()
    void getEnumListTest() {
        
        //Act Statement(s)
        List result = EnumUtils.getEnumList(Enum.class);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result.get(0), is(instanceOf(Enum.class)));
        });
    }

    //Sapient generated method id: ${getEnumMapTest}, hash: 463F8A24F20C31A95406E2CD091BD3E5
    @Test()
    void getEnumMapTest() {
        
        //Act Statement(s)
        Map result = EnumUtils.getEnumMap(Enum.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getEnumMap1Test}, hash: 705962180B93045A3ED10070575E3BB4
    @Test()
    void getEnumMap1Test() {
        
        //Act Statement(s)
        Map result = EnumUtils.getEnumMap(Enum.class, functionMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getEnumSystemPropertyWhenPropNameIsNull}, hash: BFAE992C97629C3EA34C45793DE37FBD
    @Test()
    void getEnumSystemPropertyWhenPropNameIsNull() {
        /* Branches:
         * (enumClass == null) : false
         * (propName == null) : true
         */
        //Act Statement(s)
        //Enum result = EnumUtils.getEnumSystemProperty(Enum.class, (String) null, DayOfWeek.MONDAY);
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, equalTo(DayOfWeek.MONDAY)));
    }

    //Sapient generated method id: ${getEnumSystemPropertyWhenPropNameIsNotNull}, hash: 993DC585B2D36F4F407A03F3AB19E972
    @Test()
    void getEnumSystemPropertyWhenPropNameIsNotNull() {
        /* Branches:
         * (enumClass == null) : false
         * (propName == null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<EnumUtils> enumUtils = mockStatic(EnumUtils.class, CALLS_REAL_METHODS)) {
    enumUtils.when(() -> EnumUtils.getEnum(Enum.class, "string1", DayOfWeek.MONDAY)).thenReturn(DayOfWeek.MONDAY);
    //Act Statement(s)
    Enum result = EnumUtils.getEnumSystemProperty(Enum.class, "propName1", DayOfWeek.MONDAY);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo(DayOfWeek.MONDAY));
        enumUtils.verify(() -> EnumUtils.getEnum(Enum.class, "string1", DayOfWeek.MONDAY), atLeast(1));
    });
}*/
    }

    //Sapient generated method id: ${getFirstEnumIgnoreCaseWhenEnumClassNotIsEnum}, hash: CF47C3DD430D40BBF8DD7BC4EACAD9C2
    @Test()
    void getFirstEnumIgnoreCaseWhenEnumClassNotIsEnum() {
        /* Branches:
         * (enumName == null) : false
         * (!enumClass.isEnum()) : true
         */
        //Act Statement(s)
        //Enum result = EnumUtils.getFirstEnumIgnoreCase(Enum.class, "enumName1", functionMock, DayOfWeek.MONDAY);
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, equalTo(DayOfWeek.MONDAY)));
    }

    //Sapient generated method id: ${getFirstEnumIgnoreCaseWhenEnumClassIsEnum}, hash: 3845B4F108B8EDF3EDD0B7755BCFF128
    @Test()
    void getFirstEnumIgnoreCaseWhenEnumClassIsEnum() {
        /* Branches:
         * (enumName == null) : false
         * (!enumClass.isEnum()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        //Enum result = EnumUtils.getFirstEnumIgnoreCase(Enum.class, "enumName1", functionMock, DayOfWeek.MONDAY);
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, equalTo(DayOfWeek.MONDAY)));
    }

    //Sapient generated method id: ${isValidEnumWhenGetEnumEnumClassEnumNameIsNotNull}, hash: 2AEB319CCAF2C60094E3592D720E131D
    @Test()
    void isValidEnumWhenGetEnumEnumClassEnumNameIsNotNull() {
        /* Branches:
         * (getEnum(enumClass, enumName) != null) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<EnumUtils> enumUtils = mockStatic(EnumUtils.class, CALLS_REAL_METHODS)) {
            enumUtils.when(() -> EnumUtils.getEnum(Enum.class, "enumName1")).thenReturn(DayOfWeek.MONDAY);
            //Act Statement(s)
            boolean result = EnumUtils.isValidEnum(Enum.class, "enumName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                enumUtils.verify(() -> EnumUtils.getEnum(Enum.class, "enumName1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isValidEnumWhenGetEnumEnumClassEnumNameIsNull}, hash: 2076C73E846EAEBD8E29180D20E493C0
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

    //Sapient generated method id: ${isValidEnumIgnoreCaseWhenGetEnumIgnoreCaseEnumClassEnumNameIsNotNull}, hash: 7F17AECD1676B4160F801320E6A5E319
    @Test()
    void isValidEnumIgnoreCaseWhenGetEnumIgnoreCaseEnumClassEnumNameIsNotNull() {
        /* Branches:
         * (getEnumIgnoreCase(enumClass, enumName) != null) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<EnumUtils> enumUtils = mockStatic(EnumUtils.class, CALLS_REAL_METHODS)) {
            enumUtils.when(() -> EnumUtils.getEnumIgnoreCase(Enum.class, "enumName1")).thenReturn(DayOfWeek.MONDAY);
            //Act Statement(s)
            boolean result = EnumUtils.isValidEnumIgnoreCase(Enum.class, "enumName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                enumUtils.verify(() -> EnumUtils.getEnumIgnoreCase(Enum.class, "enumName1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isValidEnumIgnoreCaseWhenGetEnumIgnoreCaseEnumClassEnumNameIsNull}, hash: 08D359734870948FAF3812C70BB85E6B
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

    //Sapient generated method id: ${processBitVectorWhenConstantsLengthLessThanOrEqualsToLongSIZEThrowsIllegalArgumentException}, hash: BD6511F6D13A56F5AF5047D9EBB337CD
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

    //Sapient generated method id: ${processBitVectorsWhenBlockIndexOfLvaluesAnd1LConstantOrdinalModulusLongSIZENotEquals0}, hash: C8EA778ED1EF91E91EF7F42358F6D7F0
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
        long[] longArray = new long[] {};
        
        //Act Statement(s)
        EnumSet result = EnumUtils.processBitVectors(Enum.class, longArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }
}