package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Comparator;
import org.apache.commons.lang3.exception.CloneFailedException;
import org.mockito.stubbing.Answer;
import java.util.Collection;
import java.util.function.Supplier;
import org.mockito.MockedStatic;
import org.apache.commons.lang3.text.StrBuilder;
import java.lang.reflect.Array;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.closeTo;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ObjectUtilsSapientGeneratedTest {

    private final Cloneable cloneableMock = mock(Cloneable.class);

    private final Comparable comparableMock = mock(Comparable.class);

    private final Comparable comparableMock2 = mock(Comparable.class);

    private final Object objectMock = mock(Object.class, "obj");

    private final Supplier supplierMock = mock(Supplier.class);

    //Sapient generated method id: ${allNotNullWhenValuesIsNull}, hash: 86BC893DE213C55C3DE747A1A64CDD40
    @Test()
    void allNotNullWhenValuesIsNull() {
        /* Branches:
         * (values != null) : false
         */
         //Arrange Statement(s)
        Object[] object = null;
        
        //Act Statement(s)
        boolean result = ObjectUtils.allNotNull(object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${allNotNullWhenStreamOfValuesNoneMatchIsNullObjects}, hash: 882A5F5A3CECA1ABDB1CF3E43F202584
    @Test()
    void allNotNullWhenStreamOfValuesNoneMatchIsNullObjects() {
        /* Branches:
         * (values != null) : true
         * (Stream.of(values).noneMatch(Objects::isNull)) : true
         */
         //Arrange Statement(s)
        Object[] objectArray = new Object[] {};
        
        //Act Statement(s)
        boolean result = ObjectUtils.allNotNull(objectArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${allNullWhenAnyNotNullNotValues}, hash: 49F09CA3000AFE43FF48177A5CE70A52
    @Test()
    void allNullWhenAnyNotNullNotValues() {
        /* Branches:
         * (!anyNotNull(values)) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[] {};
            objectUtils.when(() -> ObjectUtils.anyNotNull(objectArray)).thenReturn(false);
            //Act Statement(s)
            boolean result = ObjectUtils.allNull(objectArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                objectUtils.verify(() -> ObjectUtils.anyNotNull(objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${allNullWhenAnyNotNullValues}, hash: 802255A3927FCE2090817E8F20283F1F
    @Test()
    void allNullWhenAnyNotNullValues() {
        /* Branches:
         * (!anyNotNull(values)) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[] {};
            objectUtils.when(() -> ObjectUtils.anyNotNull(objectArray)).thenReturn(true);
            //Act Statement(s)
            boolean result = ObjectUtils.allNull(objectArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                objectUtils.verify(() -> ObjectUtils.anyNotNull(objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${anyNotNullWhenFirstNonNullValuesIsNull}, hash: ACADDDC88DFD6C0AED5609BD7ADFCF46
    @Test()
    void anyNotNullWhenFirstNonNullValuesIsNull() {
        /* Branches:
         * (firstNonNull(values) != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object[] objectArray = new Object[] {};
        
        //Act Statement(s)
        boolean result = ObjectUtils.anyNotNull(objectArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${anyNullWhenAllNotNullNotValues}, hash: 67D2420CAD13AEB2D21DC0D03A3A5E24
    @Test()
    void anyNullWhenAllNotNullNotValues() {
        /* Branches:
         * (!allNotNull(values)) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[] {};
            objectUtils.when(() -> ObjectUtils.allNotNull(objectArray)).thenReturn(false);
            //Act Statement(s)
            boolean result = ObjectUtils.anyNull(objectArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                objectUtils.verify(() -> ObjectUtils.allNotNull(objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${anyNullWhenAllNotNullValues}, hash: 185C59E901C57EE9825A1DF3185F7561
    @Test()
    void anyNullWhenAllNotNullValues() {
        /* Branches:
         * (!allNotNull(values)) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[] {};
            objectUtils.when(() -> ObjectUtils.allNotNull(objectArray)).thenReturn(true);
            //Act Statement(s)
            boolean result = ObjectUtils.anyNull(objectArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                objectUtils.verify(() -> ObjectUtils.allNotNull(objectArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cloneWhenObjNotInstanceOfCloneable}, hash: F23304817D98C39AB821DDB8EBC97290
    @Test()
    void cloneWhenObjNotInstanceOfCloneable() {
        /* Branches:
         * (obj instanceof Cloneable) : false
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        Object result = ObjectUtils.clone(object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${cloneWhenIsArrayNotObj}, hash: 7BA544B28E54868E040DA7CCFACF2DFB
    @Test()
    void cloneWhenIsArrayNotObj() {
        /* Branches:
         * (obj instanceof Cloneable) : true
         * (isArray(obj)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            objectUtils.when(() -> ObjectUtils.isArray(cloneableMock)).thenReturn(false);
            //Act Statement(s)
            Object result = ObjectUtils.clone(cloneableMock);
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                objectUtils.verify(() -> ObjectUtils.isArray(cloneableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cloneWhenCaughtNoSuchMethodExceptionThrowsCloneFailedException}, hash: F1FB552B6F287F71D00911D0060E2641
    @Test()
    void cloneWhenCaughtNoSuchMethodExceptionThrowsCloneFailedException() {
        /* Branches:
         * (obj instanceof Cloneable) : true
         * (isArray(obj)) : false
         * (catch-exception (NoSuchMethodException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            objectUtils.when(() -> ObjectUtils.isArray(cloneableMock)).thenReturn(false);
            //Act Statement(s)
            final CloneFailedException result = assertThrows(CloneFailedException.class, () -> {
                ObjectUtils.clone(cloneableMock);
            });
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException();
            CloneFailedException cloneFailedException = new CloneFailedException("Cloneable type java.lang.Cloneable has no clone method", noSuchMethodException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(cloneFailedException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(noSuchMethodException.getClass())));
                objectUtils.verify(() -> ObjectUtils.isArray(cloneableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cloneWhenCaughtIllegalAccessExceptionThrowsCloneFailedException}, hash: 085ED6288CCC972DE079587D0C12F519
    @Test()
    void cloneWhenCaughtIllegalAccessExceptionThrowsCloneFailedException() {
        /* Branches:
         * (obj instanceof Cloneable) : true
         * (isArray(obj)) : false
         * (catch-exception (IllegalAccessException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            objectUtils.when(() -> ObjectUtils.isArray(cloneableMock)).thenReturn(false);
            //Act Statement(s)
            final CloneFailedException result = assertThrows(CloneFailedException.class, () -> {
                ObjectUtils.clone(cloneableMock);
            });
            IllegalAccessException illegalAccessException = new IllegalAccessException();
            CloneFailedException cloneFailedException = new CloneFailedException("Cannot clone Cloneable type java.lang.Cloneable", illegalAccessException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(cloneFailedException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(illegalAccessException.getClass())));
                objectUtils.verify(() -> ObjectUtils.isArray(cloneableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cloneWhenCaughtInvocationTargetExceptionThrowsCloneFailedException}, hash: 2D5A9664EACEC646CAD7FC439ABCD679
    @Test()
    void cloneWhenCaughtInvocationTargetExceptionThrowsCloneFailedException() {
        /* Branches:
         * (obj instanceof Cloneable) : true
         * (isArray(obj)) : false
         * (catch-exception (InvocationTargetException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            objectUtils.when(() -> ObjectUtils.isArray(cloneableMock)).thenReturn(false);
            //Act Statement(s)
            final CloneFailedException result = assertThrows(CloneFailedException.class, () -> {
                ObjectUtils.clone(cloneableMock);
            });
            Throwable throwable = new Throwable();
            CloneFailedException cloneFailedException = new CloneFailedException("Exception cloning Cloneable type java.lang.Cloneable", throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(cloneFailedException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(throwable.getClass())));
                objectUtils.verify(() -> ObjectUtils.isArray(cloneableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cloneWhenLengthGreaterThan0}, hash: CEE0667C44EDA8989E7D501DF043AA7B
    @Test()
    void cloneWhenLengthGreaterThan0() {
        /* Branches:
         * (obj instanceof Cloneable) : true
         * (isArray(obj)) : true
         * (componentType.isPrimitive()) : true
         * (length-- > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            objectUtils.when(() -> ObjectUtils.isArray(cloneableMock)).thenReturn(true);
            //Act Statement(s)
            Object result = ObjectUtils.clone(cloneableMock);
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                objectUtils.verify(() -> ObjectUtils.isArray(cloneableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cloneWhenCaughtNoSuchMethodException}, hash: C2B1BA42EA3CF9B89CCCBBD364AFF2B9
    @Test()
    void cloneWhenCaughtNoSuchMethodException() {
        /* Branches:
         * (obj instanceof Cloneable) : true
         * (isArray(obj)) : true
         * (componentType.isPrimitive()) : true
         * (length-- > 0) : true
         * (catch-exception (NoSuchMethodException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS);
            MockedStatic<Array> array = mockStatic(Array.class)) {
            array.when(() -> Array.getLength(cloneableMock)).thenReturn(1);
            Object object = new Object();
            array.when(() -> Array.newInstance(Object.class, 1)).thenReturn(object);
            Object object2 = new Object();
            array.when(() -> Array.get(cloneableMock, 0)).thenReturn(object2);
            array.when(() -> Array.set(object, 0, object2)).thenAnswer((Answer<Void>) invocation -> null);
            objectUtils.when(() -> ObjectUtils.isArray(cloneableMock)).thenReturn(true);
            //Act Statement(s)
            Object result = ObjectUtils.clone(cloneableMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                array.verify(() -> Array.getLength(cloneableMock), atLeast(1));
                array.verify(() -> Array.newInstance(Object.class, 1), atLeast(1));
                array.verify(() -> Array.get(cloneableMock, 0), atLeast(1));
                array.verify(() -> Array.set(object, 0, object2), atLeast(1));
                objectUtils.verify(() -> ObjectUtils.isArray(cloneableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cloneIfPossibleWhenCloneIsNull}, hash: 605A155E8B4A5D5C5AFFFA95F046C629
    @Test()
    void cloneIfPossibleWhenCloneIsNull() {
        /* Branches:
         * (clone == null) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            objectUtils.when(() -> ObjectUtils.clone(object)).thenReturn(null);
            //Act Statement(s)
            Object result = ObjectUtils.cloneIfPossible(object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                objectUtils.verify(() -> ObjectUtils.clone(object), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cloneIfPossibleWhenCloneIsNotNull}, hash: 10EA7EACE1D09146263E3B8B9807AABB
    @Test()
    void cloneIfPossibleWhenCloneIsNotNull() {
        /* Branches:
         * (clone == null) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            objectUtils.when(() -> ObjectUtils.clone(object2)).thenReturn(object);
            //Act Statement(s)
            Object result = ObjectUtils.cloneIfPossible(object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                objectUtils.verify(() -> ObjectUtils.clone(object2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${compareTest}, hash: BF8D79D4BDC5E452982F78EFC7DBA25C
    @Test()
    void compareTest() {
        //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            objectUtils.when(() -> ObjectUtils.compare(comparableMock, comparableMock2, false)).thenReturn(0);
            //Act Statement(s)
            int result = ObjectUtils.compare(comparableMock, comparableMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                objectUtils.verify(() -> ObjectUtils.compare(comparableMock, comparableMock2, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${compare1WhenC1EqualsC2}, hash: FD23E17FA37091F11D3FF29DE5D9AF8E
    @Test()
    void compare1WhenC1EqualsC2() {
        /* Branches:
         * (c1 == c2) : true
         */
         
        //Act Statement(s)
        int result = ObjectUtils.compare(comparableMock, comparableMock, false);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${compare1WhenNullGreater}, hash: 2247200DF1036916D8FADB313D9EA8D5
    @Test()
    void compare1WhenNullGreater() {
        /* Branches:
         * (c1 == c2) : false
         * (c1 == null) : true
         * (nullGreater) : true
         */
         //Arrange Statement(s)
        Comparable comparable = null;
        
        //Act Statement(s)
        int result = ObjectUtils.compare(comparable, comparableMock, true);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${compare1WhenNotNullGreater}, hash: 0201E6D87D283657EE1E2D617EF3E953
    @Test()
    void compare1WhenNotNullGreater() {
        /* Branches:
         * (c1 == c2) : false
         * (c1 == null) : true
         * (nullGreater) : false
         */
         //Arrange Statement(s)
        Comparable comparable = null;
        
        //Act Statement(s)
        int result = ObjectUtils.compare(comparable, comparableMock, false);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${compare1WhenC2IsNotNull}, hash: DA99C17C23D1604263160062731393C6
    @Test()
    void compare1WhenC2IsNotNull() {
        /* Branches:
         * (c1 == c2) : false
         * (c1 == null) : false
         * (c2 == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        int result = ObjectUtils.compare(comparableMock, comparableMock2, false);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${compare1WhenC2IsNullAndNullGreater}, hash: CBBC4943851A147456C981FD06D8EFBB
    @Test()
    void compare1WhenC2IsNullAndNullGreater() {
        /* Branches:
         * (c1 == c2) : false
         * (c1 == null) : false
         * (c2 == null) : true
         * (nullGreater) : true
         */
         //Arrange Statement(s)
        Comparable comparable = null;
        
        //Act Statement(s)
        int result = ObjectUtils.compare(comparableMock, comparable, true);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${compare1WhenC2IsNullAndNotNullGreater}, hash: B4EC4DCA726F98AC97C58736AF0E947A
    @Test()
    void compare1WhenC2IsNullAndNotNullGreater() {
        /* Branches:
         * (c1 == c2) : false
         * (c1 == null) : false
         * (c2 == null) : true
         * (nullGreater) : false
         */
         //Arrange Statement(s)
        Comparable comparable = null;
        
        //Act Statement(s)
        int result = ObjectUtils.compare(comparableMock, comparable, false);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${CONSTWhenV}, hash: 0607032D42A35D6107C9C4787AA0FF2F
    @Test()
    void CONSTWhenV() {
        /* Branches:
         * (v) : true
         */
         
        //Act Statement(s)
        boolean result = ObjectUtils.CONST(true);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${CONSTWhenNotV}, hash: 7FA8CEED8BE8D580AE1FE2DC47D59EE7
    @Test()
    void CONSTWhenNotV() {
        /* Branches:
         * (v) : false
         */
         
        //Act Statement(s)
        boolean result = ObjectUtils.CONST(false);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${CONST1Test}, hash: 486F55018F353ED92D7E45C96FF417D0
    @Test()
    void CONST1Test() {
        
        //Act Statement(s)
        byte result = ObjectUtils.CONST((byte) 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((byte) 0)));
    }

    //Sapient generated method id: ${CONST2Test}, hash: A1A29C7AA7032D78DE914F40BCF179ED
    @Test()
    void CONST2Test() {
        
        //Act Statement(s)
        char result = ObjectUtils.CONST('A');
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo('A')));
    }

    //Sapient generated method id: ${CONST3Test}, hash: EF4201D36EBF5B1AF6FD095BDFC6FE6C
    @Test()
    void CONST3Test() {
        
        //Act Statement(s)
        double result = ObjectUtils.CONST(Double.parseDouble("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${CONST4Test}, hash: 9F5E0AFF13691D740A557546971DC126
    @Test()
    void CONST4Test() {
        
        //Act Statement(s)
        float result = ObjectUtils.CONST(Float.parseFloat("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("0.0"))));
    }

    //Sapient generated method id: ${CONST5Test}, hash: D6EF7B6BFDB467EB8024C6C1BDC74667
    @Test()
    void CONST5Test() {
        
        //Act Statement(s)
        int result = ObjectUtils.CONST(0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${CONST6Test}, hash: 98872D7246049C99B29274997202E57A
    @Test()
    void CONST6Test() {
        
        //Act Statement(s)
        long result = ObjectUtils.CONST(0L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }

    //Sapient generated method id: ${CONST7Test}, hash: 8908D5546E6102895CA3B4903C48E800
    @Test()
    void CONST7Test() {
        
        //Act Statement(s)
        short result = ObjectUtils.CONST((short) 0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }

    //Sapient generated method id: ${CONST8Test}, hash: 4D2CFF65AC444B76C02162B70CD6C1FC
    @Test()
    void CONST8Test() {
        //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        Object result = ObjectUtils.CONST(object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${CONST_BYTEWhenVGreaterThanByteMAX_VALUEThrowsIllegalArgumentException}, hash: ED82DDCD03ED7202819BAC0AF81B588F
    @Test()
    void CONST_BYTEWhenVGreaterThanByteMAX_VALUEThrowsIllegalArgumentException() {
        /* Branches:
         * (v < Byte.MIN_VALUE) : false
         * (v > Byte.MAX_VALUE) : true
         */
         //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Supplied value must be a valid byte literal between -128 and 127: [2044]");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            ObjectUtils.CONST_BYTE(2044);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${CONST_BYTEWhenVNotGreaterThanByteMAX_VALUE}, hash: 90BB3559B9D3AC4C011784D0A9C239CF
    @Test()
    void CONST_BYTEWhenVNotGreaterThanByteMAX_VALUE() {
        /* Branches:
         * (v < Byte.MIN_VALUE) : false
         * (v > Byte.MAX_VALUE) : false
         */
         
        //Act Statement(s)
        byte result = ObjectUtils.CONST_BYTE(0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((byte) 0)));
    }

    //Sapient generated method id: ${CONST_SHORTWhenVGreaterThanShortMAX_VALUEThrowsIllegalArgumentException}, hash: B1C9C9E16D1E8EEEA96968C742852E33
    @Test()
    void CONST_SHORTWhenVGreaterThanShortMAX_VALUEThrowsIllegalArgumentException() {
        /* Branches:
         * (v < Short.MIN_VALUE) : false
         * (v > Short.MAX_VALUE) : true
         */
         //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Supplied value must be a valid byte literal between -32768 and 32767: [109022]");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            ObjectUtils.CONST_SHORT(109022);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${CONST_SHORTWhenVNotGreaterThanShortMAX_VALUE}, hash: F2E4DA5480C7431E53614B5B9E7DDF66
    @Test()
    void CONST_SHORTWhenVNotGreaterThanShortMAX_VALUE() {
        /* Branches:
         * (v < Short.MIN_VALUE) : false
         * (v > Short.MAX_VALUE) : false
         */
         
        //Act Statement(s)
        short result = ObjectUtils.CONST_SHORT(0);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }

    //Sapient generated method id: ${defaultIfNullWhenObjectIsNotNull}, hash: 6A27F93A5C47A4E51B0FE61772371F5A
    @Test()
    void defaultIfNullWhenObjectIsNotNull() {
        /* Branches:
         * (object != null) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        
        //Act Statement(s)
        Object result = ObjectUtils.defaultIfNull(object, object2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${defaultIfNullWhenObjectIsNull}, hash: 1A42550AE377A0A6C22B97D0A19A5572
    @Test()
    void defaultIfNullWhenObjectIsNull() {
        /* Branches:
         * (object != null) : false
         */
         //Arrange Statement(s)
        Object object = null;
        Object object2 = new Object();
        
        //Act Statement(s)
        Object result = ObjectUtils.defaultIfNull(object, object2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(object2)));
    }

    //Sapient generated method id: ${equalsWhenObjectsEqualsObject1Object2}, hash: B96ECC0DDA948FEE9EA2C4BA21825F55
    @Test()
    void equalsWhenObjectsEqualsObject1Object2() {
        /* Branches:
         * (Objects.equals(object1, object2)) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = ObjectUtils.equals(object, object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${equalsWhenObjectsNotEqualsObject1Object2}, hash: C5459EDDA8E85DC82A19455FA2A95C1D
    @Test()
    void equalsWhenObjectsNotEqualsObject1Object2() {
        /* Branches:
         * (Objects.equals(object1, object2)) : false
         */
         //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        
        //Act Statement(s)
        boolean result = ObjectUtils.equals(object, object2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${firstNonNullTest}, hash: C8783B89F38A23D7D97B7A19915E0488
    @Test()
    void firstNonNullTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object[] objectArray = new Object[] {};
        
        //Act Statement(s)
        Object result = ObjectUtils.firstNonNull(objectArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getClassWhenObjectIsNull}, hash: 6D4ED3CE6572F4D3D40707EDBFB9AA66
    @Test()
    void getClassWhenObjectIsNull() {
        /* Branches:
         * (object == null) : true
         */
         //Arrange Statement(s)
        Object object = null;
        
        //Act Statement(s)
        Class result = ObjectUtils.getClass(object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getClassWhenObjectIsNotNull}, hash: F2FF410E91A56C9B7F8D5DE87F3AE844
    @Test()
    void getClassWhenObjectIsNotNull() {
        /* Branches:
         * (object == null) : false
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        Class result = ObjectUtils.getClass(object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Object.class)));
    }

    //Sapient generated method id: ${getFirstNonNullTest}, hash: 5A4AB6A8DE6753AB50CF44E3F2DB6BE1
    @Test()
    void getFirstNonNullTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Supplier<Object>[] supplierArray = new Supplier[] {};
        
        //Act Statement(s)
        Object result = ObjectUtils.getFirstNonNull(supplierArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getIfNullWhenObjectIsNotNull}, hash: 83E782355AB0447B11EB8425C9E0F4DE
    @Test()
    void getIfNullWhenObjectIsNotNull() {
        /* Branches:
         * (object != null) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        Object result = ObjectUtils.getIfNull(object, supplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${getIfNullWhenObjectIsNull}, hash: 7FB3BB8E5A54F6EAEF1B32FD4E3CFA7B
    @Test()
    void getIfNullWhenObjectIsNull() {
        /* Branches:
         * (object != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = null;
        
        //Act Statement(s)
        Object result = ObjectUtils.getIfNull(object, supplierMock);
        
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${hashCodeTest}, hash: 670077DA8EC1720858BBBF389B63BC10
    @Test()
    void hashCodeTest() {
        //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        int result = ObjectUtils.hashCode(object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1937514545)));
    }

    //Sapient generated method id: ${hashCodeHexTest}, hash: FFE38D7C34108803CFC8F1314C4500CE
    @Test()
    void hashCodeHexTest() {
        //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        String result = ObjectUtils.hashCodeHex(object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("27ec1c71")));
    }

    //Sapient generated method id: ${hashCodeMultiWhenObjectsIsNotEmpty}, hash: 98990CA5D04B0E61823E46EAD9B2C798
    @Test()
    void hashCodeMultiWhenObjectsIsNotEmpty() {
        /* Branches:
         * (objects != null) : true
         * (for-each(objects)) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        Object[] objectArray = new Object[] { object };
        
        //Act Statement(s)
        int result = ObjectUtils.hashCodeMulti(objectArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1060441774)));
    }

    //Sapient generated method id: ${identityHashCodeHexTest}, hash: FD00758653972A4EB9220D193EC79551
    @Test()
    void identityHashCodeHexTest() {
        //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        String result = ObjectUtils.identityHashCodeHex(object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("50531779")));
    }

    //Sapient generated method id: ${identityToStringTest}, hash: B90E629CF208FDB5D28BEC23B5B85FB3
    @Test()
    void identityToStringTest() throws IOException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Appendable appendableMock = mock(Appendable.class);
        Object object = new Object();
        
        //Act Statement(s)
        ObjectUtils.identityToString(appendableMock, object);
    }

    //Sapient generated method id: ${identityToString1WhenObjectIsNull}, hash: 0B7A4B6BE1BCB27C3835D604A4090D40
    @Test()
    void identityToString1WhenObjectIsNull() {
        /* Branches:
         * (object == null) : true
         */
         //Arrange Statement(s)
        Object object = null;
        
        //Act Statement(s)
        String result = ObjectUtils.identityToString(object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${identityToString1WhenObjectIsNotNull}, hash: 9C1D3836EFFDD20A2ACB2F98C4B3BD5C
    @Test()
    void identityToString1WhenObjectIsNotNull() {
        /* Branches:
         * (object == null) : false
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        String result = ObjectUtils.identityToString(object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("java.lang.Object@39b17cbf")));
    }

    //Sapient generated method id: ${identityToString2Test}, hash: 22B2513591F8C12BE7873B8D31E6D094
    @Test()
    void identityToString2Test() {
        //Arrange Statement(s)
        StrBuilder strBuilder = new StrBuilder();
        Object object = new Object();
        
        //Act Statement(s)
        ObjectUtils.identityToString(strBuilder, object);
    }

    //Sapient generated method id: ${identityToString3Test}, hash: 9C9673F374BF45630E69C14CFA666B65
    @Test()
    void identityToString3Test() {
        //Arrange Statement(s)
        StringBuffer stringBuffer = new StringBuffer();
        Object object = new Object();
        
        //Act Statement(s)
        ObjectUtils.identityToString(stringBuffer, object);
    }

    //Sapient generated method id: ${identityToString4Test}, hash: 547AF99F0BB807B538E1CE5C6A3C84D2
    @Test()
    void identityToString4Test() {
        //Arrange Statement(s)
        StringBuilder stringBuilder = new StringBuilder("");
        Object object = new Object();
        
        //Act Statement(s)
        ObjectUtils.identityToString(stringBuilder, object);
    }

    //Sapient generated method id: ${isArrayWhenObjectGetClassIsArray}, hash: 2862B3C156F73DBF32151AFAD5D11F78
    @Test()
    void isArrayWhenObjectGetClassIsArray() {
        /* Branches:
         * (object != null) : true
         * (object.getClass().isArray()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = ObjectUtils.isArray(object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isArrayWhenObjectGetClassNotIsArray}, hash: F84DC4388D33973680B047D3D8DA5FD2
    @Test()
    void isArrayWhenObjectGetClassNotIsArray() {
        /* Branches:
         * (object != null) : true
         * (object.getClass().isArray()) : false
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = ObjectUtils.isArray(object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isEmptyWhenObjectIsNull}, hash: 6DDFEC9BE98C78100BA2EE17EBD1568F
    @Test()
    void isEmptyWhenObjectIsNull() {
        /* Branches:
         * (object == null) : true
         */
         //Arrange Statement(s)
        Object object = null;
        
        //Act Statement(s)
        boolean result = ObjectUtils.isEmpty(object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isEmptyWhenObjectLengthEquals0}, hash: 4E48884275E0CF078799FBB60AF7E808
    @Test()
    void isEmptyWhenObjectLengthEquals0() {
        /* Branches:
         * (object == null) : false
         * (object instanceof CharSequence) : true
         * (((CharSequence) object).length() == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = ObjectUtils.isEmpty("object1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isEmptyWhenObjectLengthNotEquals0}, hash: 2ADB03A8D9390B325889DC41DED0B824
    @Test()
    void isEmptyWhenObjectLengthNotEquals0() {
        /* Branches:
         * (object == null) : false
         * (object instanceof CharSequence) : true
         * (((CharSequence) object).length() == 0) : false
         */
         
        //Act Statement(s)
        boolean result = ObjectUtils.isEmpty("object1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isEmptyWhenArrayGetLengthObjectEquals0}, hash: ACF52F5FB390A2F29EB67DB744074260
    @Test()
    void isEmptyWhenArrayGetLengthObjectEquals0() {
        /* Branches:
         * (object == null) : false
         * (object instanceof CharSequence) : false
         * (isArray(object)) : true
         * (Array.getLength(object) == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            objectUtils.when(() -> ObjectUtils.isArray(object)).thenReturn(true);
            //Act Statement(s)
            boolean result = ObjectUtils.isEmpty(object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                objectUtils.verify(() -> ObjectUtils.isArray(object), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isEmptyWhenArrayGetLengthObjectNotEquals0}, hash: C59295198EC3FAD9C7DA831E579D2F34
    @Test()
    void isEmptyWhenArrayGetLengthObjectNotEquals0() {
        /* Branches:
         * (object == null) : false
         * (object instanceof CharSequence) : false
         * (isArray(object)) : true
         * (Array.getLength(object) == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            objectUtils.when(() -> ObjectUtils.isArray(object)).thenReturn(true);
            //Act Statement(s)
            boolean result = ObjectUtils.isEmpty(object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                objectUtils.verify(() -> ObjectUtils.isArray(object), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isEmptyWhenObjectIsEmpty}, hash: 25C9895F1EB09F54A96EBA87A4E9A6E5
    @Test()
    void isEmptyWhenObjectIsEmpty() {
        /* Branches:
         * (object == null) : false
         * (object instanceof CharSequence) : false
         * (isArray(object)) : false
         * (object instanceof Collection<?>) : true
         * (((Collection<?>) object).isEmpty()) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            objectUtils.when(() -> ObjectUtils.isArray(anyCollection())).thenReturn(false);
            Collection collection = new ArrayList<>();
            //Act Statement(s)
            boolean result = ObjectUtils.isEmpty(collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                objectUtils.verify(() -> ObjectUtils.isArray(anyCollection()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isEmptyWhenObjectNotIsEmpty}, hash: AE0124E2787770C52F512F25BF8EB935
    @Test()
    void isEmptyWhenObjectNotIsEmpty() {
        /* Branches:
         * (object == null) : false
         * (object instanceof CharSequence) : false
         * (isArray(object)) : false
         * (object instanceof Collection<?>) : true
         * (((Collection<?>) object).isEmpty()) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            objectUtils.when(() -> ObjectUtils.isArray(anyCollection())).thenReturn(false);
            Collection collection = new ArrayList<>();
            collection.add(null);
            //Act Statement(s)
            boolean result = ObjectUtils.isEmpty(collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                objectUtils.verify(() -> ObjectUtils.isArray(anyCollection()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isEmptyWhenObjectInstanceOfMap__AndObjectIsEmpty}, hash: 2B85CA433364BAEFD83614FAA5437A91
    @Test()
    void isEmptyWhenObjectInstanceOfMap__AndObjectIsEmpty() {
        /* Branches:
         * (object == null) : false
         * (object instanceof CharSequence) : false
         * (isArray(object)) : false
         * (object instanceof Collection<?>) : false
         * (object instanceof Map<?, ?>) : true
         * (((Map<?, ?>) object).isEmpty()) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            objectUtils.when(() -> ObjectUtils.isArray(anyMap())).thenReturn(false);
            Map map = new HashMap<>();
            //Act Statement(s)
            boolean result = ObjectUtils.isEmpty(map);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                objectUtils.verify(() -> ObjectUtils.isArray(anyMap()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isEmptyWhenObjectNotInstanceOfOptional_}, hash: 4210D309D9987BAB91B65265C65A5B76
    @Test()
    void isEmptyWhenObjectNotInstanceOfOptional_() {
        /* Branches:
         * (object == null) : false
         * (object instanceof CharSequence) : false
         * (isArray(object)) : false
         * (object instanceof Collection<?>) : false
         * (object instanceof Map<?, ?>) : false
         * (object instanceof Optional<?>) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            objectUtils.when(() -> ObjectUtils.isArray(object)).thenReturn(false);
            //Act Statement(s)
            boolean result = ObjectUtils.isEmpty(object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                objectUtils.verify(() -> ObjectUtils.isArray(object), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isEmptyWhenObjectNotIsPresent}, hash: 118A03EAF9BBC697193703AA79A3BA59
    @Test()
    void isEmptyWhenObjectNotIsPresent() {
        /* Branches:
         * (object == null) : false
         * (object instanceof CharSequence) : false
         * (isArray(object)) : false
         * (object instanceof Collection<?>) : false
         * (object instanceof Map<?, ?>) : false
         * (object instanceof Optional<?>) : true
         * (!((Optional<?>) object).isPresent()) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Optional optional = Optional.empty();
            objectUtils.when(() -> ObjectUtils.isArray(optional)).thenReturn(false);
            Optional optional2 = Optional.empty();
            //Act Statement(s)
            boolean result = ObjectUtils.isEmpty(optional2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                objectUtils.verify(() -> ObjectUtils.isArray(optional), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isEmptyWhenObjectIsPresent}, hash: 48F5558DB08771CBBA9B8F13C5E42E7B
    @Test()
    void isEmptyWhenObjectIsPresent() {
        /* Branches:
         * (object == null) : false
         * (object instanceof CharSequence) : false
         * (isArray(object)) : false
         * (object instanceof Collection<?>) : false
         * (object instanceof Map<?, ?>) : false
         * (object instanceof Optional<?>) : true
         * (!((Optional<?>) object).isPresent()) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Optional optional = Optional.empty();
            objectUtils.when(() -> ObjectUtils.isArray(optional)).thenReturn(false);
            Optional optional2 = Optional.empty();
            //Act Statement(s)
            boolean result = ObjectUtils.isEmpty(optional2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                objectUtils.verify(() -> ObjectUtils.isArray(optional), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isNotEmptyWhenIsEmptyNotObject}, hash: 5952A9681FD352CD00D7AC6529D5A1FB
    @Test()
    void isNotEmptyWhenIsEmptyNotObject() {
        /* Branches:
         * (!isEmpty(object)) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            objectUtils.when(() -> ObjectUtils.isEmpty(object)).thenReturn(false);
            //Act Statement(s)
            boolean result = ObjectUtils.isNotEmpty(object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                objectUtils.verify(() -> ObjectUtils.isEmpty(object), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isNotEmptyWhenIsEmptyObject}, hash: ECA1D76F0E037BC49AB792B4638B66A9
    @Test()
    void isNotEmptyWhenIsEmptyObject() {
        /* Branches:
         * (!isEmpty(object)) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            objectUtils.when(() -> ObjectUtils.isEmpty(object)).thenReturn(true);
            //Act Statement(s)
            boolean result = ObjectUtils.isNotEmpty(object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                objectUtils.verify(() -> ObjectUtils.isEmpty(object), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${maxWhenCompareValueResultFalseGreaterThan0}, hash: 2CD42A769CC488F2AECA6A8B6CA10704
    @Test()
    void maxWhenCompareValueResultFalseGreaterThan0() {
        /* Branches:
         * (values != null) : true
         * (for-each(values)) : true
         * (compare(value, result, false) > 0) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            objectUtils.when(() -> ObjectUtils.compare(comparableMock, (Comparable) null, false)).thenReturn(1);
            Comparable[] comparableArray = new Comparable[] { comparableMock };
            //Act Statement(s)
            Comparable result = ObjectUtils.max(comparableArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(comparableMock));
                objectUtils.verify(() -> ObjectUtils.compare(comparableMock, (Comparable) null, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${medianThrowsArrayIndexOutOfBoundsException}, hash: E9D0F96454CE735C102F275B967C3995
    @Test()
    void medianThrowsArrayIndexOutOfBoundsException() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Comparator comparator = Comparator.reverseOrder();
        Object[] objectArray = new Object[] {};
        //Act Statement(s)
        final ArrayIndexOutOfBoundsException result = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            ObjectUtils.median(comparator, objectArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${median1ThrowsArrayIndexOutOfBoundsException}, hash: 3098A1BBF1417AEBF09CF4F6ACE7CB56
    @Test()
    void median1ThrowsArrayIndexOutOfBoundsException() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Comparable[] comparableArray = new Comparable[] {};
        //Act Statement(s)
        final ArrayIndexOutOfBoundsException result = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            ObjectUtils.median(comparableArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${minWhenCompareValueResultTrueLessThan0}, hash: C28EEAD36699B8C7482A5A3A7DF48E28
    @Test()
    void minWhenCompareValueResultTrueLessThan0() {
        /* Branches:
         * (values != null) : true
         * (for-each(values)) : true
         * (compare(value, result, true) < 0) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            objectUtils.when(() -> ObjectUtils.compare(comparableMock, (Comparable) null, true)).thenReturn(-1);
            Comparable[] comparableArray = new Comparable[] { comparableMock };
            //Act Statement(s)
            Comparable result = ObjectUtils.min(comparableArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(comparableMock));
                objectUtils.verify(() -> ObjectUtils.compare(comparableMock, (Comparable) null, true), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${modeWhenArrayUtilsNotIsNotEmptyItems}, hash: 6920E90CB3B0935EDEE3706496CC2772
    @Test()
    void modeWhenArrayUtilsNotIsNotEmptyItems() {
        /* Branches:
         * (ArrayUtils.isNotEmpty(items)) : false
         */
         //Arrange Statement(s)
        Object[] objectArray = new Object[] {};
        
        //Act Statement(s)
        Object result = ObjectUtils.mode(objectArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${modeWhenCmpGreaterThanMax}, hash: 0C31A4D595A9120215C57F19DC29B7DC
    @Test()
    void modeWhenCmpGreaterThanMax() {
        /* Branches:
         * (ArrayUtils.isNotEmpty(items)) : true
         * (for-each(items)) : true
         * (count == null) : true
         * (for-each(occurrences.entrySet())) : true
         * (cmp == max) : false
         * (cmp > max) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        Object[] objectArray = new Object[] { object };
        
        //Act Statement(s)
        Object result = ObjectUtils.mode(objectArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${notEqualWhenObjectsNotEqualsObject1Object2}, hash: C98231BA12212E62B8D19C7C098429FC
    @Test()
    void notEqualWhenObjectsNotEqualsObject1Object2() {
        /* Branches:
         * (!Objects.equals(object1, object2)) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        
        //Act Statement(s)
        boolean result = ObjectUtils.notEqual(object, object2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${notEqualWhenObjectsEqualsObject1Object2}, hash: 3D5E3E03E4AB8B3177C75B5CDA3706BD
    @Test()
    void notEqualWhenObjectsEqualsObject1Object2() {
        /* Branches:
         * (!Objects.equals(object1, object2)) : false
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = ObjectUtils.notEqual(object, object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${requireNonEmptyTest}, hash: 26A6228B42CB5FA422992F7E189CB0B1
    @Test()
    void requireNonEmptyTest() {
        //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            objectUtils.when(() -> ObjectUtils.requireNonEmpty(object2, "object")).thenReturn(object);
            //Act Statement(s)
            Object result = ObjectUtils.requireNonEmpty(object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                objectUtils.verify(() -> ObjectUtils.requireNonEmpty(object2, "object"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${requireNonEmpty1WhenIsEmptyObjThrowsIllegalArgumentException}, hash: AEAAC158643F6F005001F1B129FD01EF
    @Test()
    void requireNonEmpty1WhenIsEmptyObjThrowsIllegalArgumentException() {
        /* Branches:
         * (isEmpty(obj)) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            objectUtils.when(() -> ObjectUtils.isEmpty(object)).thenReturn(true);
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                ObjectUtils.requireNonEmpty(object, "message1");
            });
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                objectUtils.verify(() -> ObjectUtils.isEmpty(object), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${requireNonEmpty1WhenIsEmptyNotObj}, hash: 9483CC0CBCA4FA1965F3E69C2539AC00
    @Test()
    void requireNonEmpty1WhenIsEmptyNotObj() {
        /* Branches:
         * (isEmpty(obj)) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            objectUtils.when(() -> ObjectUtils.isEmpty(object)).thenReturn(false);
            //Act Statement(s)
            Object result = ObjectUtils.requireNonEmpty(object, "message1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                objectUtils.verify(() -> ObjectUtils.isEmpty(object), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toStringWhenObjIsNull}, hash: 87E1513D834EC77C1F86B7F51ED53424
    @Test()
    void toStringWhenObjIsNull() {
        /* Branches:
         * (obj == null) : true
         */
         //Arrange Statement(s)
        Object object = null;
        
        //Act Statement(s)
        String result = ObjectUtils.toString(object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }

    //Sapient generated method id: ${toStringWhenObjIsNotNull}, hash: BA9675D031986ED18BE4042AECE5A88B
    @Test()
    void toStringWhenObjIsNotNull() {
        /* Branches:
         * (obj == null) : false
         */
         
        //Act Statement(s)
        String result = ObjectUtils.toString(objectMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("obj")));
    }

    //Sapient generated method id: ${toString1WhenObjIsNull}, hash: 61E295ABC4E547D7FA3616B51C5DBFBD
    @Test()
    void toString1WhenObjIsNull() {
        /* Branches:
         * (obj == null) : true
         */
         //Arrange Statement(s)
        Object object = null;
        
        //Act Statement(s)
        String result = ObjectUtils.toString(object, "nullStr1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("nullStr1")));
    }

    //Sapient generated method id: ${toString1WhenObjIsNotNull}, hash: 5B9DD1CCABC353CDAC814B4631093D96
    @Test()
    void toString1WhenObjIsNotNull() {
        /* Branches:
         * (obj == null) : false
         */
         
        //Act Statement(s)
        String result = ObjectUtils.toString(objectMock, "nullStr1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("obj")));
    }

    //Sapient generated method id: ${toString2WhenObjIsNull}, hash: E0D038E0B45DEFE7D67EC549900FBCFB
    @Test()
    void toString2WhenObjIsNull() {
        /* Branches:
         * (obj == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Supplier<Object> supplier = null;
        
        //Act Statement(s)
        String result = ObjectUtils.toString(supplier, supplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${toString2WhenObjIsNotNull}, hash: 80F649E26EEEED3D261A0D40B0A9ED06
    @Test()
    void toString2WhenObjIsNotNull() {
        /* Branches:
         * (obj == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Supplier supplierMock2 = mock(Supplier.class);
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            objectUtils.when(() -> ObjectUtils.toString(object, supplierMock)).thenReturn("return_of_toString1");
            //Act Statement(s)
            String result = ObjectUtils.toString(supplierMock2, supplierMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toString1"));
                objectUtils.verify(() -> ObjectUtils.toString(object, supplierMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toString3WhenObjIsNull}, hash: A2E6CFEF0A76AF69180608780F71C714
    @Test()
    void toString3WhenObjIsNull() {
        /* Branches:
         * (obj == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = null;
        
        //Act Statement(s)
        String result = ObjectUtils.toString(object, supplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${toString3WhenObjIsNotNull}, hash: F39C4E9CCC4FA83F105BD8D4D65B5EF0
    @Test()
    void toString3WhenObjIsNotNull() {
        /* Branches:
         * (obj == null) : false
         */
         
        //Act Statement(s)
        String result = ObjectUtils.toString(objectMock, supplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("obj")));
    }

    //Sapient generated method id: ${waitTest}, hash: 64077C2AE19A1340DA89699934D5AE33
    @Test()
    void waitTest() throws InterruptedException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        Duration duration = Duration.ofDays(0L);
        
        //Act Statement(s)
        ObjectUtils.wait(object, duration);
    }
}
