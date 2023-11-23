package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
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
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.closeTo;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ObjectUtilsSapientGeneratedTest {

    private final Object objectMock = mock(Object.class, "toString_object1");

    //Sapient generated method id: ${cfccf2c8-9e66-34be-ad9e-400b44f27301}
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

    //Sapient generated method id: ${933547c3-c6fe-33d4-9c10-1c446fd9f596}
    @Test()
    void allNotNullWhenStreamOfValuesNoneMatchIsNullObjects() {
        /* Branches:
         * (values != null) : true
         * (Stream.of(values).noneMatch(Objects::isNull)) : true
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};

        //Act Statement(s)
        boolean result = ObjectUtils.allNotNull(objectArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${dcd96403-dcf5-36d7-9a09-86538e08ceba}
    @Test()
    void allNullWhenAnyNotNullNotValues() {
        /* Branches:
         * (!anyNotNull(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
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

    //Sapient generated method id: ${4dd608d3-c56d-33e8-9972-17ce5758be20}
    @Test()
    void allNullWhenAnyNotNullValues() {
        /* Branches:
         * (!anyNotNull(values)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
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

    //Sapient generated method id: ${13d69699-9bd7-359f-a871-3b08836c7aa5}
    @Test()
    void anyNotNullWhenFirstNonNullValuesIsNull() {
        /* Branches:
         * (firstNonNull(values) != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};

        //Act Statement(s)
        boolean result = ObjectUtils.anyNotNull(objectArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${4d09f5df-1fdc-3b77-a121-4590acb523ec}
    @Test()
    void anyNullWhenAllNotNullNotValues() {
        /* Branches:
         * (!allNotNull(values)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
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

    //Sapient generated method id: ${21b63de5-b972-304a-b47a-78081c5808a3}
    @Test()
    void anyNullWhenAllNotNullValues() {
        /* Branches:
         * (!allNotNull(values)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
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

    //Sapient generated method id: ${7049eb25-50e6-3671-8053-be078387399e}
    @Test()
    void cloneWhenObjNotInstanceOfCloneable() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
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

    //Sapient generated method id: ${e8a27f76-f521-3448-9b95-74389ab7c9e6}
    @Test()
    void cloneWhenIsArrayNotObj() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /* Branches:
         * (obj instanceof Cloneable) : true
         * (isArray(obj)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            objectUtils.when(() -> ObjectUtils.isArray((Cloneable) null)).thenReturn(false);
            //TODO: Needs initialization with real value
            Cloneable cloneable = null;
            //Act Statement(s)
            Object result = ObjectUtils.clone(cloneable);
            Object object = new Object();
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                objectUtils.verify(() -> ObjectUtils.isArray((Cloneable) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${323543d2-3adb-3a45-9969-6d42cdf24639}
    @Test()
    void cloneWhenCaughtNoSuchMethodExceptionThrowsCloneFailedException() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
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
            objectUtils.when(() -> ObjectUtils.isArray((Cloneable) null)).thenReturn(false);
            //TODO: Needs initialization with real value
            Cloneable cloneable = null;
            //Act Statement(s)
            final CloneFailedException result = assertThrows(CloneFailedException.class, () -> {
                ObjectUtils.clone(cloneable);
            });
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException();
            CloneFailedException cloneFailedException = new CloneFailedException("Cloneable type java.lang.Cloneable has no clone method", noSuchMethodException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(cloneFailedException.getMessage()));
                assertThat(result.getCause(), isA(noSuchMethodException.getClass()));
                objectUtils.verify(() -> ObjectUtils.isArray((Cloneable) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${b2d60825-297a-3ac7-a861-7439f8e0e64d}
    @Test()
    void cloneWhenCaughtIllegalAccessExceptionThrowsCloneFailedException() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
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
            objectUtils.when(() -> ObjectUtils.isArray((Cloneable) null)).thenReturn(false);
            //TODO: Needs initialization with real value
            Cloneable cloneable = null;
            //Act Statement(s)
            final CloneFailedException result = assertThrows(CloneFailedException.class, () -> {
                ObjectUtils.clone(cloneable);
            });
            IllegalAccessException illegalAccessException = new IllegalAccessException();
            CloneFailedException cloneFailedException = new CloneFailedException("Cannot clone Cloneable type java.lang.Cloneable", illegalAccessException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(cloneFailedException.getMessage()));
                assertThat(result.getCause(), isA(illegalAccessException.getClass()));
                objectUtils.verify(() -> ObjectUtils.isArray((Cloneable) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c0fd6776-4555-33cf-b2b8-5667f79e4bd9}
    @Test()
    void cloneWhenCaughtInvocationTargetExceptionThrowsCloneFailedException() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
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
            objectUtils.when(() -> ObjectUtils.isArray((Cloneable) null)).thenReturn(false);
            //TODO: Needs initialization with real value
            Cloneable cloneable = null;
            //Act Statement(s)
            final CloneFailedException result = assertThrows(CloneFailedException.class, () -> {
                ObjectUtils.clone(cloneable);
            });
            Throwable throwable = new Throwable();
            CloneFailedException cloneFailedException = new CloneFailedException("Exception cloning Cloneable type java.lang.Cloneable", throwable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(cloneFailedException.getMessage()));
                assertThat(result.getCause(), isA(throwable.getClass()));
                objectUtils.verify(() -> ObjectUtils.isArray((Cloneable) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7ba066fb-bb95-3c2d-8853-e181c512ed2e}
    @Test()
    void cloneWhenLengthGreaterThan0() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
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
            objectUtils.when(() -> ObjectUtils.isArray((Cloneable) null)).thenReturn(true);
            //TODO: Needs initialization with real value
            Cloneable cloneable = null;
            //Act Statement(s)
            Object result = ObjectUtils.clone(cloneable);
            Object object = new Object();
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                objectUtils.verify(() -> ObjectUtils.isArray((Cloneable) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7cb1d80f-2ada-38d9-9436-4a984e54e20c}
    @Test()
    void cloneWhenCaughtNoSuchMethodException() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
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
        try (MockedStatic<Array> array = mockStatic(Array.class);
             MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            objectUtils.when(() -> ObjectUtils.isArray((Cloneable) null)).thenReturn(true);
            array.when(() -> Array.getLength((Cloneable) null)).thenReturn(2147483647);
            Object object = new Object();
            array.when(() -> Array.newInstance(Object.class, 2147483647)).thenReturn(object);
            Object object2 = new Object();
            array.when(() -> Array.get((Cloneable) null, 2147483646)).thenReturn(object2);
            array.when(() -> Array.set(object, 2147483646, object2)).thenAnswer((Answer<Void>) invocation -> null);
            //TODO: Needs initialization with real value
            Cloneable cloneable = null;
            //Act Statement(s)
            Object result = ObjectUtils.clone(cloneable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                objectUtils.verify(() -> ObjectUtils.isArray((Cloneable) null), atLeast(1));
                array.verify(() -> Array.getLength((Cloneable) null), atLeast(1));
                array.verify(() -> Array.newInstance(Object.class, 2147483647), atLeast(1));
                array.verify(() -> Array.get((Cloneable) null, 2147483646), atLeast(1));
                array.verify(() -> Array.set(object, 2147483646, object2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${790ebdcc-8ce5-3b65-909e-f7e5045be028}
    @Test()
    void cloneIfPossibleWhenCloneIsNull() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
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

    //Sapient generated method id: ${1745ab87-9bf5-35e5-9950-133c49d94f3e}
    @Test()
    void cloneIfPossibleWhenCloneIsNotNull() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
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

    //Sapient generated method id: ${d3e977de-633f-3acd-9866-5ed0c48a1db3}
    @Test()
    void compareTest() {
        //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            objectUtils.when(() -> ObjectUtils.compare((Comparable) null, (Comparable) null, false)).thenReturn(0);
            //TODO: Needs initialization with real value
            Comparable comparable = null;
            //TODO: Needs initialization with real value
            Comparable comparable2 = null;
            //Act Statement(s)
            int result = ObjectUtils.compare(comparable, comparable2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                objectUtils.verify(() -> ObjectUtils.compare((Comparable) null, (Comparable) null, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${cc1f035b-06ef-3dcc-a541-9cea61b80ab9}
    @Test()
    void compare1WhenC1EqualsC2() {
        /* Branches:
         * (c1 == c2) : true
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Comparable comparable = null;
        //TODO: Needs initialization with real value
        Comparable comparable2 = null;

        //Act Statement(s)
        int result = ObjectUtils.compare(comparable, comparable2, false);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${1685403f-5e2a-33a3-b0bc-7bbfe4825368}
    @Test()
    void compare1WhenNullGreater() {
        /* Branches:
         * (c1 == c2) : false
         * (c1 == null) : true
         * (nullGreater) : true
         */
        //Arrange Statement(s)
        Comparable comparable = null;
        //TODO: Needs initialization with real value
        Comparable comparable2 = null;

        //Act Statement(s)
        int result = ObjectUtils.compare(comparable, comparable2, true);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${597313d1-9945-3b8c-9db1-21076d060d77}
    @Test()
    void compare1WhenNotNullGreater() {
        /* Branches:
         * (c1 == c2) : false
         * (c1 == null) : true
         * (nullGreater) : false
         */
        //Arrange Statement(s)
        Comparable comparable = null;
        //TODO: Needs initialization with real value
        Comparable comparable2 = null;

        //Act Statement(s)
        int result = ObjectUtils.compare(comparable, comparable2, false);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${b2316771-ffa6-30fa-8c99-c785e0e03964}
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
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Comparable comparable = null;
        //TODO: Needs initialization with real value
        Comparable comparable2 = null;

        //Act Statement(s)
        int result = ObjectUtils.compare(comparable, comparable2, false);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${e045d770-c42c-3ba5-a363-13579ed4bf74}
    @Test()
    void compare1WhenC2IsNullAndNullGreater() {
        /* Branches:
         * (c1 == c2) : false
         * (c1 == null) : false
         * (c2 == null) : true
         * (nullGreater) : true
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Comparable comparable = null;
        Comparable comparable2 = null;

        //Act Statement(s)
        int result = ObjectUtils.compare(comparable, comparable2, true);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${60a092e2-d2b4-37d2-9a89-21d6c37190db}
    @Test()
    void compare1WhenC2IsNullAndNotNullGreater() {
        /* Branches:
         * (c1 == c2) : false
         * (c1 == null) : false
         * (c2 == null) : true
         * (nullGreater) : false
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Comparable comparable = null;
        Comparable comparable2 = null;

        //Act Statement(s)
        int result = ObjectUtils.compare(comparable, comparable2, false);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${4ca7ddab-821f-33ac-9521-dfef2c448ae1}
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

    //Sapient generated method id: ${4cfb30b3-8445-33ac-8bad-e2dd380bd312}
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

    //Sapient generated method id: ${f59b1d4f-d088-3268-b9ea-6e585c8fb22b}
    @Test()
    void CONST1Test() {

        //Act Statement(s)
        byte result = ObjectUtils.CONST((byte) 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((byte) 0)));
    }

    //Sapient generated method id: ${36839c44-f02a-384f-853b-f01157f59250}
    @Test()
    void CONST2Test() {

        //Act Statement(s)
        char result = ObjectUtils.CONST('A');

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo('A')));
    }

    //Sapient generated method id: ${7f3cd1fc-ce7e-3cb7-907b-49df458695a2}
    @Test()
    void CONST3Test() {

        //Act Statement(s)
        double result = ObjectUtils.CONST(Double.parseDouble("0.0"));

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${73126daa-39d8-3687-b80f-3a4b9ecf00f0}
    @Test()
    void CONST4Test() {

        //Act Statement(s)
        float result = ObjectUtils.CONST(Float.parseFloat("0.0"));

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Float.parseFloat("0.0"))));
    }

    //Sapient generated method id: ${804bae93-055f-3e45-971d-96760f1538a0}
    @Test()
    void CONST5Test() {

        //Act Statement(s)
        int result = ObjectUtils.CONST(0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${a9255b92-ee2f-342c-a3fe-51b66891eeae}
    @Test()
    void CONST6Test() {

        //Act Statement(s)
        long result = ObjectUtils.CONST(0L);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }

    //Sapient generated method id: ${eb920e1c-96a2-3cd9-b8c1-806987e1d55e}
    @Test()
    void CONST7Test() {

        //Act Statement(s)
        short result = ObjectUtils.CONST((short) 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 0)));
    }

    //Sapient generated method id: ${475cb7cd-6bc3-3fd6-b73f-7fe5dbbceb68}
    @Test()
    void CONST8Test() {
        //Arrange Statement(s)
        Object object = new Object();

        //Act Statement(s)
        Object result = ObjectUtils.CONST(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${203e175e-d335-3de1-bda9-cd6530b0ea72}
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

    //Sapient generated method id: ${39dc128c-8c3c-36b7-b11a-31c8303f4ba7}
    @Test()
    void CONST_BYTEWhenVNotGreaterThanByteMAX_VALUE() {
        /* Branches:
         * (v < Byte.MIN_VALUE) : false
         * (v > Byte.MAX_VALUE) : false
         */

        //Act Statement(s)
        byte result = ObjectUtils.CONST_BYTE(1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((byte) 1)));
    }

    //Sapient generated method id: ${aafe073a-ee8a-33a1-a855-81900d357e30}
    @Test()
    void CONST_SHORTWhenVGreaterThanShortMAX_VALUEThrowsIllegalArgumentException() {
        /* Branches:
         * (v < Short.MIN_VALUE) : false
         * (v > Short.MAX_VALUE) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Supplied value must be a valid byte literal between -32768 and 32767: [2005024]");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            ObjectUtils.CONST_SHORT(2005024);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${7e0ef115-9882-3707-a379-02a10c67d75c}
    @Test()
    void CONST_SHORTWhenVNotGreaterThanShortMAX_VALUE() {
        /* Branches:
         * (v < Short.MIN_VALUE) : false
         * (v > Short.MAX_VALUE) : false
         */

        //Act Statement(s)
        short result = ObjectUtils.CONST_SHORT(1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo((short) 1)));
    }

    //Sapient generated method id: ${57ac2b01-cdd8-31a6-b1f6-f1e97f9a5dfc}
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

    //Sapient generated method id: ${ed11b2df-170e-3913-b607-dee89ee8f7a6}
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

    //Sapient generated method id: ${3dde3e2e-484f-3f3a-9ab5-8a58c731c1e3}
    @Test()
    void equalsWhenObjectsEqualsObject1Object2() {
        /* Branches:
         * (Objects.equals(object1, object2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();

        //Act Statement(s)
        boolean result = ObjectUtils.equals(object, object2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${1a996db1-a954-3371-8167-19d9a33d59bd}
    @Test()
    void equalsWhenObjectsNotEqualsObject1Object2() {
        /* Branches:
         * (Objects.equals(object1, object2)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();

        //Act Statement(s)
        boolean result = ObjectUtils.equals(object, object2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${bd6a7a16-deda-36f9-b3a7-30ca33f0e803}
    @Test()
    void firstNonNullTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{(Object) null};

        //Act Statement(s)
        Object result = ObjectUtils.firstNonNull(objectArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${78e72602-d907-3c91-b12a-8bd1d20fbaf7}
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

    //Sapient generated method id: ${692f86e5-6d00-3d1a-a4fe-5d700fd05e73}
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

    //Sapient generated method id: ${41e63fe5-4bde-3c4b-b9c6-6daf6cdd8b73}
    @Test()
    void getFirstNonNullTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Supplier<Object>[] supplierArray = new Supplier[]{(Supplier) null};

        //Act Statement(s)
        Object result = ObjectUtils.getFirstNonNull(supplierArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${711035af-d462-3aed-b2fd-11cc2e2e0fd0}
    @Test()
    void getIfNullWhenObjectIsNotNull() {
        /* Branches:
         * (object != null) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        //TODO: Needs initialization with real value
        Supplier<Object> supplier = null;

        //Act Statement(s)
        Object result = ObjectUtils.getIfNull(object, supplier);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${8513b9d7-63e3-3fdf-91f7-9656033d6326}
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
        //TODO: Needs initialization with real value
        Supplier<Object> supplier = null;

        //Act Statement(s)
        Object result = ObjectUtils.getIfNull(object, supplier);
        Object object2 = new Object();

        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object2)));
    }

    //Sapient generated method id: ${38f7c071-283a-3aab-adff-62ff29c426ab}
    @Test()
    void hashCodeTest() {
        //Arrange Statement(s)
        Object object = new Object();

        //Act Statement(s)
        int result = ObjectUtils.hashCode(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${b1eb7e02-af10-3a2e-b906-378beb27d2f5}
    @Test()
    void hashCodeHexTest() {
        //Arrange Statement(s)
        Object object = new Object();

        //Act Statement(s)
        String result = ObjectUtils.hashCodeHex(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("0")));
    }

    //Sapient generated method id: ${4d28893e-f052-3a63-b393-7047a36cb556}
    @Test()
    void hashCodeMultiWhenObjectsIsNotEmpty() {
        /* Branches:
         * (objects != null) : true
         * (for-each(objects)) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object[] objectArray = new Object[]{object};

        //Act Statement(s)
        int result = ObjectUtils.hashCodeMulti(objectArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(31)));
    }

    //Sapient generated method id: ${bac23f65-90df-31fe-bc78-61f5eaf5403e}
    @Test()
    void identityHashCodeHexTest() {
        //Arrange Statement(s)
        Object object = new Object();

        //Act Statement(s)
        String result = ObjectUtils.identityHashCodeHex(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("0")));
    }

    //Sapient generated method id: ${7467d70c-5479-3e0f-8fd2-6bdfa5db00b3}
    @Test()
    void identityToStringTest() throws IOException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Appendable appendable = null;
        Object object = new Object();

        //Act Statement(s)
        ObjectUtils.identityToString(appendable, object);
    }

    //Sapient generated method id: ${abdd97e4-8123-3af0-9f40-67f3437358e5}
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

    //Sapient generated method id: ${6a666a31-164d-3bb6-ba93-a048923fe048}
    @Test()
    void identityToString1WhenObjectIsNotNull() {
        /* Branches:
         * (object == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();

        //Act Statement(s)
        String result = ObjectUtils.identityToString(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("java.lang.Object@1")));
    }

    //Sapient generated method id: ${36ff8506-f7e0-34d8-8403-1f785a8ba467}
    @Test()
    void identityToString2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StrBuilder strBuilder = new StrBuilder();
        Object object = new Object();

        //Act Statement(s)
        ObjectUtils.identityToString(strBuilder, object);
    }

    //Sapient generated method id: ${6371dbe2-7103-379d-bfd2-d326c4b7f63c}
    @Test()
    void identityToString3Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StringBuffer stringBuffer = new StringBuffer();
        Object object = new Object();

        //Act Statement(s)
        ObjectUtils.identityToString(stringBuffer, object);
    }

    //Sapient generated method id: ${85358467-efef-36af-ac6c-08188b16724e}
    @Test()
    void identityToString4Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StringBuilder stringBuilder = new StringBuilder();
        Object object = new Object();

        //Act Statement(s)
        ObjectUtils.identityToString(stringBuilder, object);
    }

    //Sapient generated method id: ${22ba0008-6395-38b7-9785-82907c06b0a5}
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

    //Sapient generated method id: ${3504f6b9-6be2-36f7-a9d6-6cf33455d683}
    @Test()
    void isArrayWhenObjectGetClassNotIsArray() {
        /* Branches:
         * (object != null) : true
         * (object.getClass().isArray()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();

        //Act Statement(s)
        boolean result = ObjectUtils.isArray(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${413de78d-d582-37eb-bb4d-5e65c76386ed}
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

    //Sapient generated method id: ${41359393-f950-3394-8d44-8d2362aa2347}
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
        boolean result = ObjectUtils.isEmpty("isEmpty_object1");

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${2add4b83-4ba4-322d-91ba-b1b66fe2cd93}
    @Test()
    void isEmptyWhenObjectLengthNotEquals0() {
        /* Branches:
         * (object == null) : false
         * (object instanceof CharSequence) : true
         * (((CharSequence) object).length() == 0) : false
         */

        //Act Statement(s)
        boolean result = ObjectUtils.isEmpty("isEmpty_object1");

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${bfe3ee5a-adee-3d86-b842-b902391a50fd}
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

    //Sapient generated method id: ${2d843b41-a500-3243-8673-6e1f095c17b2}
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

    //Sapient generated method id: ${80493721-ec06-3ea9-9108-73acd47a2fc9}
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

    //Sapient generated method id: ${a2c73f45-0867-3b84-98b6-3f803cdfbd6d}
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

    //Sapient generated method id: ${3784b134-fc7c-33c2-a1ec-ea3ef01cb2bf}
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

    //Sapient generated method id: ${054645cf-6e30-313c-9d89-6e1562e5ff9b}
    @Test()
    void isEmptyWhenObjectInstanceOfMap__AndObjectNotIsEmpty() {
        /* Branches:
         * (object == null) : false
         * (object instanceof CharSequence) : false
         * (isArray(object)) : false
         * (object instanceof Collection<?>) : false
         * (object instanceof Map<?, ?>) : true
         * (((Map<?, ?>) object).isEmpty()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            objectUtils.when(() -> ObjectUtils.isArray(anyMap())).thenReturn(false);
            Object object = new Object();
            Object object2 = new Object();
            Map<Object, Object> objectObjectMap = new HashMap<>();
            objectObjectMap.put(object, object2);
            //Act Statement(s)
            boolean result = ObjectUtils.isEmpty(objectObjectMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                objectUtils.verify(() -> ObjectUtils.isArray(anyMap()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5dac2117-9eea-3193-881e-9feebf329e27}
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

    //Sapient generated method id: ${4a0ccbe9-01e3-3416-ba1f-754002231422}
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

    //Sapient generated method id: ${551160ce-53f4-3f16-b176-88e8f6e38392}
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

    //Sapient generated method id: ${7e7eb310-3feb-32d0-8726-5d2bd8f1263c}
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

    //Sapient generated method id: ${1156070e-edc4-31b9-8204-41c2d7707ff1}
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

    //Sapient generated method id: ${1c9d7368-6c03-3e2f-ad6f-5053812ef780}
    @Test()
    void maxWhenCompareValueResultFalseGreaterThan0() {
        /* Branches:
         * (values != null) : true
         * (for-each(values)) : true
         * (compare(value, result, false) > 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            objectUtils.when(() -> ObjectUtils.compare((Comparable) null, (Comparable) null, false)).thenReturn(1);
            Comparable[] comparableArray = new Comparable[]{(Comparable) null};
            //Act Statement(s)
            Comparable result = ObjectUtils.max(comparableArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                objectUtils.verify(() -> ObjectUtils.compare((Comparable) null, (Comparable) null, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f62a615e-dab7-3177-8767-c205b8e72c26}
    @Test()
    void medianThrowsArrayIndexOutOfBoundsException() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Comparator<Object> comparator = Comparator.reverseOrder();
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        final ArrayIndexOutOfBoundsException result = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            ObjectUtils.median(comparator, objectArray);
        });

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${d37313e0-0183-3286-ae33-b5f2635b683c}
    @Test()
    void median1ThrowsArrayIndexOutOfBoundsException() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Comparable[] comparableArray = new Comparable[]{(Comparable) null};
        //Act Statement(s)
        final ArrayIndexOutOfBoundsException result = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            ObjectUtils.median(comparableArray);
        });

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${0ae8c82e-deae-3a8e-a80e-b5350ed2083c}
    @Test()
    void minWhenCompareValueResultTrueLessThan0() {
        /* Branches:
         * (values != null) : true
         * (for-each(values)) : true
         * (compare(value, result, true) < 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            objectUtils.when(() -> ObjectUtils.compare((Comparable) null, (Comparable) null, true)).thenReturn(-1);
            Comparable[] comparableArray = new Comparable[]{(Comparable) null};
            //Act Statement(s)
            Comparable result = ObjectUtils.min(comparableArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                objectUtils.verify(() -> ObjectUtils.compare((Comparable) null, (Comparable) null, true), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4388042e-0b54-3236-9a97-d967151c151e}
    @Test()
    void modeWhenArrayUtilsNotIsNotEmptyItems() {
        /* Branches:
         * (ArrayUtils.isNotEmpty(items)) : false
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};

        //Act Statement(s)
        Object result = ObjectUtils.mode(objectArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${463cb00b-1e4c-3acf-bcaf-312ae1dc314e}
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
        Object[] objectArray = new Object[]{object};

        //Act Statement(s)
        Object result = ObjectUtils.mode(objectArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${fc5894bf-a59d-30f9-a48a-9f4249ddcf40}
    @Test()
    void notEqualWhenObjectsNotEqualsObject1Object2() {
        /* Branches:
         * (!Objects.equals(object1, object2)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();

        //Act Statement(s)
        boolean result = ObjectUtils.notEqual(object, object2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${4d1ea427-03c1-30ff-a43e-1bc1203fab74}
    @Test()
    void notEqualWhenObjectsEqualsObject1Object2() {
        /* Branches:
         * (!Objects.equals(object1, object2)) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();

        //Act Statement(s)
        boolean result = ObjectUtils.notEqual(object, object2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${e10629d8-d500-3482-8eb5-d4cae45bc395}
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

    //Sapient generated method id: ${49aed40c-7054-3ca0-acae-10cd724c81a5}
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

    //Sapient generated method id: ${896bcd3c-7574-3064-98e1-678ecc51e302}
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

    //Sapient generated method id: ${1c27c4e9-c6ab-30cb-a67f-f62f4243461a}
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

    //Sapient generated method id: ${8685b661-88a8-3b3b-a070-47174e5af3ac}
    @Test()
    void toStringWhenObjIsNotNull() {
        /* Branches:
         * (obj == null) : false
         */

        //Act Statement(s)
        String result = ObjectUtils.toString(objectMock);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("toString_object1")));
    }

    //Sapient generated method id: ${02efeed7-7229-31b3-bcd3-de9091630ba2}
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

    //Sapient generated method id: ${dfc313ec-22c2-3c8f-86e2-b47c0b3b3113}
    @Test()
    void toString1WhenObjIsNotNull() {
        /* Branches:
         * (obj == null) : false
         */

        //Act Statement(s)
        String result = ObjectUtils.toString(objectMock, "nullStr1");

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("toString_object1")));
    }

    //Sapient generated method id: ${e4be91d5-9b7b-3dd6-b6e8-566cd43c41a2}
    @Test()
    void toString2WhenObjIsNull() {
        /* Branches:
         * (obj == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = null;
        //TODO: Needs initialization with real value
        Supplier<String> supplier = null;

        //Act Statement(s)
        String result = ObjectUtils.toString(object, supplier);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${66a1646f-7c09-3667-b3eb-358d7a943a78}
    @Test()
    void toString2WhenObjIsNotNull() {
        /* Branches:
         * (obj == null) : false
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Supplier<String> supplier = null;

        //Act Statement(s)
        String result = ObjectUtils.toString(objectMock, supplier);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("toString_object1")));
    }

    //Sapient generated method id: ${741a22d1-670c-3dd7-90bc-0afab5824a70}
    @Test()
    void toString3WhenObjIsNull() {
        /* Branches:
         * (obj == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Supplier<Object> supplier = null;
        //TODO: Needs initialization with real value
        Supplier<String> supplier2 = null;

        //Act Statement(s)
        String result = ObjectUtils.toString(supplier, supplier2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${a22062d2-e08a-324f-8be8-19719b9d191b}
    @Test()
    void toString3WhenObjIsNotNull() {
        /* Branches:
         * (obj == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            objectUtils.when(() -> ObjectUtils.toString(object, (Supplier) null)).thenReturn("return_of_toString1");
            //TODO: Needs initialization with real value
            Supplier<Object> supplier = null;
            //TODO: Needs initialization with real value
            Supplier<String> supplier2 = null;
            //Act Statement(s)
            String result = ObjectUtils.toString(supplier, supplier2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toString1"));
                objectUtils.verify(() -> ObjectUtils.toString(object, (Supplier) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${67037719-1dc9-34e7-a6d9-81c231d55325}
    @Test()
    void waitTest() throws InterruptedException {
        /**
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
