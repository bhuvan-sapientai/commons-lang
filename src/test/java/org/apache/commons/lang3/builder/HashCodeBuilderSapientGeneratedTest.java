package org.apache.commons.lang3.builder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.Set;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class HashCodeBuilderSapientGeneratedTest {

    //Sapient generated method id: ${111e62bf-a249-36a7-ad25-eb28584631db}
    @Test()
    void getRegistryTest() {

        //Act Statement(s)
        Set<IDKey> result = HashCodeBuilder.getRegistry();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${503da690-a5d8-37ca-8ce8-019efff44fef}
    @Test()
    void isRegisteredWhenRegistryIsNull() {
        /* Branches:
         * (registry != null) : false
         */
        //Arrange Statement(s)
        Object object = new Object();

        //Act Statement(s)
        boolean result = HashCodeBuilder.isRegistered(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${792dbdcf-3390-34cc-a46e-a25bafce7bb3}
    @Test()
    void reflectionHashCodeTest() {
        //Arrange Statement(s)
        try (MockedStatic<HashCodeBuilder> hashCodeBuilder = mockStatic(HashCodeBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            String[] stringArray = new String[]{};
            hashCodeBuilder.when(() -> HashCodeBuilder.reflectionHashCode(0, 0, object, false, (Class) null, stringArray)).thenReturn(0);
            //Act Statement(s)
            int result = HashCodeBuilder.reflectionHashCode(0, 0, object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                hashCodeBuilder.verify(() -> HashCodeBuilder.reflectionHashCode(0, 0, object, false, (Class) null, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${2e4a246a-ec0f-3b45-aede-5c0ba1213b2c}
    @Test()
    void reflectionHashCode1Test() {
        //Arrange Statement(s)
        try (MockedStatic<HashCodeBuilder> hashCodeBuilder = mockStatic(HashCodeBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            String[] stringArray = new String[]{};
            hashCodeBuilder.when(() -> HashCodeBuilder.reflectionHashCode(0, 0, object, false, (Class) null, stringArray)).thenReturn(0);
            //Act Statement(s)
            int result = HashCodeBuilder.reflectionHashCode(0, 0, object, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                hashCodeBuilder.verify(() -> HashCodeBuilder.reflectionHashCode(0, 0, object, false, (Class) null, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3e1a2198-bbcd-3092-a062-3a38730a99c7}
    @Test()
    void reflectionHashCode2WhenDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 533)) : true  #  inside <init> method
         */
        //Arrange Statement(s)
        Object object = new Object();
        String[] stringArray = new String[]{};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            HashCodeBuilder.reflectionHashCode(-1, 0, object, false, Object.class, stringArray);
        });

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${4dd82211-eb68-3197-b533-350f3be6f5c7}
    @Test()
    void reflectionHashCode2WhenDefaultBranch2ThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 533)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        Object object = new Object();
        String[] stringArray = new String[]{};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            HashCodeBuilder.reflectionHashCode(0, 0, object, false, Object.class, stringArray);
        });

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${6cc3cf6f-d561-3217-ab2f-aebb0f0645d9}
    @Test()
    void reflectionHashCode3Test() {
        //Arrange Statement(s)
        try (MockedStatic<HashCodeBuilder> hashCodeBuilder = mockStatic(HashCodeBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            String[] stringArray = new String[]{};
            hashCodeBuilder.when(() -> HashCodeBuilder.reflectionHashCode(17, 37, object, false, (Class) null, stringArray)).thenReturn(0);
            //Act Statement(s)
            int result = HashCodeBuilder.reflectionHashCode(object, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                hashCodeBuilder.verify(() -> HashCodeBuilder.reflectionHashCode(17, 37, object, false, (Class) null, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${556ff338-8e18-3286-a7ea-1ed792e35854}
    @Test()
    void reflectionHashCode4Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HashCodeBuilder> hashCodeBuilder = mockStatic(HashCodeBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            String[] stringArray = new String[]{};
            hashCodeBuilder.when(() -> HashCodeBuilder.reflectionHashCode(object, stringArray)).thenReturn(0);
            Collection<String> collection = new ArrayList<>();
            collection.add("field1");
            collection.add("field2");
            //Act Statement(s)
            int result = HashCodeBuilder.reflectionHashCode(object, collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                hashCodeBuilder.verify(() -> HashCodeBuilder.reflectionHashCode(object, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${19d81884-efa7-3dda-92a3-a74c002473d4}
    @Test()
    void reflectionHashCode5Test() {
        //Arrange Statement(s)
        try (MockedStatic<HashCodeBuilder> hashCodeBuilder = mockStatic(HashCodeBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            String[] stringArray = new String[]{};
            hashCodeBuilder.when(() -> HashCodeBuilder.reflectionHashCode(17, 37, object, false, (Class) null, stringArray)).thenReturn(0);
            //Act Statement(s)
            int result = HashCodeBuilder.reflectionHashCode(object, stringArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                hashCodeBuilder.verify(() -> HashCodeBuilder.reflectionHashCode(17, 37, object, false, (Class) null, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8c6df516-0d6b-31b3-b21d-f694425ed8c4}
    @Test()
    void appendWhenValue() {
        /* Branches:
         * (value) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);

        //Act Statement(s)
        HashCodeBuilder result = target.append(true);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${25e73bf5-1791-3066-b587-eeb322b90314}
    @Test()
    void append1WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        boolean[] _boolean = null;

        //Act Statement(s)
        HashCodeBuilder result = target.append(_boolean);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${3e7d9338-0d5d-3be3-989d-6664bd2eed07}
    @Test()
    void append1WhenArrayIsNotEmpty() {
        /* Branches:
         * (array == null) : false
         * (for-each(array)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = spy(new HashCodeBuilder(0, 0));
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        doReturn(hashCodeBuilder).when(target).append(true);
        HashCodeBuilder hashCodeBuilder2 = new HashCodeBuilder();
        doReturn(hashCodeBuilder2).when(target).append(false);
        boolean[] booleanArray = new boolean[]{true, false};

        //Act Statement(s)
        HashCodeBuilder result = target.append(booleanArray);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(true);
            verify(target).append(false);
        });
    }

    //Sapient generated method id: ${b324e137-5e69-3120-8d06-f0a667c86b18}
    @Test()
    void append2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);

        //Act Statement(s)
        HashCodeBuilder result = target.append((byte) 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${d2641371-a0b3-39c1-8944-27fffd29e67b}
    @Test()
    void append3WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        byte[] _byte = null;

        //Act Statement(s)
        HashCodeBuilder result = target.append(_byte);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${720fa373-9135-39b8-93a9-6044c090dc35}
    @Test()
    void append3WhenArrayIsNotEmpty() {
        /* Branches:
         * (array == null) : false
         * (for-each(array)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        byte[] byteArray = new byte[]{};

        //Act Statement(s)
        HashCodeBuilder result = target.append(byteArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${77faf400-bf10-378a-a01b-bf0aeb738054}
    @Test()
    void append4Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);

        //Act Statement(s)
        HashCodeBuilder result = target.append((char) a);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${2b69f4b9-49dc-32f3-86b2-1fc56d134107}
    @Test()
    void append5WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        char[] _char = null;

        //Act Statement(s)
        HashCodeBuilder result = target.append(_char);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${082cbdb6-5909-3a72-ae66-73719f03975e}
    @Test()
    void append5WhenArrayIsNotEmpty() {
        /* Branches:
         * (array == null) : false
         * (for-each(array)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        char[] charArray = new char[]{};

        //Act Statement(s)
        HashCodeBuilder result = target.append(charArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${49ec5054-cded-359c-bbec-b7dfbfc6a70b}
    @Test()
    void append6Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);

        //Act Statement(s)
        HashCodeBuilder result = target.append(Double.parseDouble("0.0"));

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${aa12bcf9-f0d9-34d9-b15b-8981b122e56e}
    @Test()
    void append7WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        double[] _double = null;

        //Act Statement(s)
        HashCodeBuilder result = target.append(_double);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${297b96ef-0ca7-3f99-8e9c-9fe4750bbec0}
    @Test()
    void append7WhenArrayIsNotEmpty() {
        /* Branches:
         * (array == null) : false
         * (for-each(array)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = spy(new HashCodeBuilder(0, 0));
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        doReturn(hashCodeBuilder).when(target).append(Double.parseDouble("1.0"));
        HashCodeBuilder hashCodeBuilder2 = new HashCodeBuilder();
        doReturn(hashCodeBuilder2).when(target).append(Double.parseDouble("2.0"));
        HashCodeBuilder hashCodeBuilder3 = new HashCodeBuilder();
        doReturn(hashCodeBuilder3).when(target).append(Double.parseDouble("3.0"));
        double[] doubleArray = new double[]{Double.parseDouble("1.0"), Double.parseDouble("2.0"), Double.parseDouble("3.0")};

        //Act Statement(s)
        HashCodeBuilder result = target.append(doubleArray);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(Double.parseDouble("1.0"));
            verify(target).append(Double.parseDouble("2.0"));
            verify(target).append(Double.parseDouble("3.0"));
        });
    }

    //Sapient generated method id: ${f3d7688c-b3eb-395b-a588-830ae1d5b905}
    @Test()
    void append8Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);

        //Act Statement(s)
        HashCodeBuilder result = target.append(Float.parseFloat("1.0"));

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${c0371855-3d3d-3589-b924-650bb2fd54f2}
    @Test()
    void append9WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        float[] _float = null;

        //Act Statement(s)
        HashCodeBuilder result = target.append(_float);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${5cdcf791-650f-310f-8013-f79d46417f61}
    @Test()
    void append9WhenArrayIsNotEmpty() {
        /* Branches:
         * (array == null) : false
         * (for-each(array)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        float[] floatArray = new float[]{};

        //Act Statement(s)
        HashCodeBuilder result = target.append(floatArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${bc7fd1c6-0075-355c-80f7-fb98309e0201}
    @Test()
    void append10Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);

        //Act Statement(s)
        HashCodeBuilder result = target.append(10);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${268ff5a4-a1d6-3888-94d1-62ba6a10868e}
    @Test()
    void append11WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        int[] _int = null;

        //Act Statement(s)
        HashCodeBuilder result = target.append(_int);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${8e770861-194b-38d3-a009-c408d0f5c519}
    @Test()
    void append11WhenArrayIsNotEmpty() {
        /* Branches:
         * (array == null) : false
         * (for-each(array)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = spy(new HashCodeBuilder(0, 0));
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        doReturn(hashCodeBuilder).when(target).append(1);
        int[] intArray = new int[]{1};

        //Act Statement(s)
        HashCodeBuilder result = target.append(intArray);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(1);
        });
    }

    //Sapient generated method id: ${a8941ea3-dae5-3fab-b8cb-3c1c0d58264b}
    @Test()
    void append12Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);

        //Act Statement(s)
        HashCodeBuilder result = target.append(123456789L);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${19673845-8eb9-3eeb-82ee-68dff700e1f0}
    @Test()
    void append13WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        long[] _long = null;

        //Act Statement(s)
        HashCodeBuilder result = target.append(_long);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${1e6f1cd2-8306-3798-8184-32211543ecdc}
    @Test()
    void append13WhenArrayIsNotEmpty() {
        /* Branches:
         * (array == null) : false
         * (for-each(array)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        long[] longArray = new long[]{};

        //Act Statement(s)
        HashCodeBuilder result = target.append(longArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${7cfff943-9eab-31d0-8d26-e178ea39044c}
    @Test()
    void append14WhenObjectIsNull() {
        /* Branches:
         * (object == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        Object object = null;

        //Act Statement(s)
        HashCodeBuilder result = target.append(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${ba757a08-a432-3ade-81c7-4b78a629b79a}
    @Test()
    void append14WhenObjectUtilsNotIsArrayObject() {
        /* Branches:
         * (object == null) : false
         * (ObjectUtils.isArray(object)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        Object object = new Object();

        //Act Statement(s)
        HashCodeBuilder result = target.append(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${41fe94ac-f4ac-3faa-a5e4-bd1f4420445e}
    @Test()
    void append14WhenObjectInstanceOfLongArray() {
        /* Branches:
         * (object == null) : false
         * (ObjectUtils.isArray(object)) : true
         * (object instanceof long[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = spy(new HashCodeBuilder(0, 0));
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        long[] longArray = new long[]{};
        doReturn(hashCodeBuilder).when(target).append(longArray);

        //Act Statement(s)
        HashCodeBuilder result = target.append((Object) longArray);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(longArray);
        });
    }

    //Sapient generated method id: ${0736c47a-5093-3bf5-ab59-73c26d89f938}
    @Test()
    void append14WhenObjectInstanceOfIntArray() {
        /* Branches:
         * (object == null) : false
         * (ObjectUtils.isArray(object)) : true
         * (object instanceof long[]) : false  #  inside appendArray method
         * (object instanceof int[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = spy(new HashCodeBuilder(0, 0));
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        int[] intArray = new int[]{};
        doReturn(hashCodeBuilder).when(target).append(intArray);

        //Act Statement(s)
        HashCodeBuilder result = target.append((Object) intArray);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(intArray);
        });
    }

    //Sapient generated method id: ${2b3279ad-5507-3e10-904e-32ea5c45734c}
    @Test()
    void append14WhenObjectInstanceOfShortArray() {
        /* Branches:
         * (object == null) : false
         * (ObjectUtils.isArray(object)) : true
         * (object instanceof long[]) : false  #  inside appendArray method
         * (object instanceof int[]) : false  #  inside appendArray method
         * (object instanceof short[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        short[] shortArray = new short[]{};

        //Act Statement(s)
        HashCodeBuilder result = target.append((Object) shortArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${c1f727b0-b6e5-3bc9-a437-704f35969db9}
    @Test()
    void append14WhenObjectInstanceOfCharArray() {
        /* Branches:
         * (object == null) : false
         * (ObjectUtils.isArray(object)) : true
         * (object instanceof long[]) : false  #  inside appendArray method
         * (object instanceof int[]) : false  #  inside appendArray method
         * (object instanceof short[]) : false  #  inside appendArray method
         * (object instanceof char[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = spy(new HashCodeBuilder(0, 0));
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        char[] charArray = new char[]{};
        doReturn(hashCodeBuilder).when(target).append(charArray);

        //Act Statement(s)
        HashCodeBuilder result = target.append((Object) charArray);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(charArray);
        });
    }

    //Sapient generated method id: ${c8dd3aec-074c-319f-8a04-1a50459c8649}
    @Test()
    void append14WhenObjectInstanceOfByteArray() {
        /* Branches:
         * (object == null) : false
         * (ObjectUtils.isArray(object)) : true
         * (object instanceof long[]) : false  #  inside appendArray method
         * (object instanceof int[]) : false  #  inside appendArray method
         * (object instanceof short[]) : false  #  inside appendArray method
         * (object instanceof char[]) : false  #  inside appendArray method
         * (object instanceof byte[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = spy(new HashCodeBuilder(0, 0));
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        byte[] byteArray = new byte[]{};
        doReturn(hashCodeBuilder).when(target).append(byteArray);

        //Act Statement(s)
        HashCodeBuilder result = target.append((Object) byteArray);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(byteArray);
        });
    }

    //Sapient generated method id: ${acf36b35-0d6c-3f70-a562-4b8c5af8265d}
    @Test()
    void append14WhenObjectInstanceOfDoubleArray() {
        /* Branches:
         * (object == null) : false
         * (ObjectUtils.isArray(object)) : true
         * (object instanceof long[]) : false  #  inside appendArray method
         * (object instanceof int[]) : false  #  inside appendArray method
         * (object instanceof short[]) : false  #  inside appendArray method
         * (object instanceof char[]) : false  #  inside appendArray method
         * (object instanceof byte[]) : false  #  inside appendArray method
         * (object instanceof double[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = spy(new HashCodeBuilder(0, 0));
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        double[] doubleArray = new double[]{};
        doReturn(hashCodeBuilder).when(target).append(doubleArray);

        //Act Statement(s)
        HashCodeBuilder result = target.append((Object) doubleArray);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(doubleArray);
        });
    }

    //Sapient generated method id: ${b04bb550-f20a-34dd-aa61-2c507f1ffdb9}
    @Test()
    void append14WhenObjectInstanceOfFloatArray() {
        /* Branches:
         * (object == null) : false
         * (ObjectUtils.isArray(object)) : true
         * (object instanceof long[]) : false  #  inside appendArray method
         * (object instanceof int[]) : false  #  inside appendArray method
         * (object instanceof short[]) : false  #  inside appendArray method
         * (object instanceof char[]) : false  #  inside appendArray method
         * (object instanceof byte[]) : false  #  inside appendArray method
         * (object instanceof double[]) : false  #  inside appendArray method
         * (object instanceof float[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = spy(new HashCodeBuilder(0, 0));
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        float[] floatArray = new float[]{};
        doReturn(hashCodeBuilder).when(target).append(floatArray);

        //Act Statement(s)
        HashCodeBuilder result = target.append((Object) floatArray);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(floatArray);
        });
    }

    //Sapient generated method id: ${155ac66d-fd9a-3270-8765-0cb656cd5590}
    @Test()
    void append14WhenObjectInstanceOfBooleanArray() {
        /* Branches:
         * (object == null) : false
         * (ObjectUtils.isArray(object)) : true
         * (object instanceof long[]) : false  #  inside appendArray method
         * (object instanceof int[]) : false  #  inside appendArray method
         * (object instanceof short[]) : false  #  inside appendArray method
         * (object instanceof char[]) : false  #  inside appendArray method
         * (object instanceof byte[]) : false  #  inside appendArray method
         * (object instanceof double[]) : false  #  inside appendArray method
         * (object instanceof float[]) : false  #  inside appendArray method
         * (object instanceof boolean[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = spy(new HashCodeBuilder(0, 0));
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        boolean[] booleanArray = new boolean[]{};
        doReturn(hashCodeBuilder).when(target).append(booleanArray);

        //Act Statement(s)
        HashCodeBuilder result = target.append((Object) booleanArray);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(booleanArray);
        });
    }

    //Sapient generated method id: ${b6445957-b2f1-3ca9-b969-e566d798cfa2}
    @Test()
    void append14WhenObjectNotInstanceOfBooleanArray() {
        /* Branches:
         * (object == null) : false
         * (ObjectUtils.isArray(object)) : true
         * (object instanceof long[]) : false  #  inside appendArray method
         * (object instanceof int[]) : false  #  inside appendArray method
         * (object instanceof short[]) : false  #  inside appendArray method
         * (object instanceof char[]) : false  #  inside appendArray method
         * (object instanceof byte[]) : false  #  inside appendArray method
         * (object instanceof double[]) : false  #  inside appendArray method
         * (object instanceof float[]) : false  #  inside appendArray method
         * (object instanceof boolean[]) : false  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        Object object = new Object();

        //Act Statement(s)
        HashCodeBuilder result = target.append(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${4a6e1311-516d-3f9f-af14-f89d9cc423b2}
    @Test()
    void append15WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        //TODO: Needs initialization with real value
        Object[] object = null;

        //Act Statement(s)
        HashCodeBuilder result = target.append(object);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${5548954a-1d38-3ab4-9aff-bfc18c1c2219}
    @Test()
    void append15WhenArrayIsNotEmpty() {
        /* Branches:
         * (array == null) : false
         * (for-each(array)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = spy(new HashCodeBuilder(0, 0));
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        Object[][] objectArray = new Object[][]{(Object) null};
        Object[] object = new Object[]{objectArray};
        doReturn(hashCodeBuilder).when(target).append(object);
        Object[][] objectArray4 = new Object[][]{(Object) null};
        Object[] objectArray3 = new Object[]{objectArray4};
        Object[] objectArray2 = new Object[]{objectArray3};

        //Act Statement(s)
        HashCodeBuilder result = target.append(objectArray2);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(object);
        });
    }

    //Sapient generated method id: ${daa93de7-e090-3c4e-9661-7a2aca592df5}
    @Test()
    void append16Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);

        //Act Statement(s)
        HashCodeBuilder result = target.append((short) 10);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${4f1213a6-0111-34f6-8c54-a8f1859ecbb4}
    @Test()
    void append17WhenArrayIsNull() {
        /* Branches:
         * (array == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        short[] _short = null;

        //Act Statement(s)
        HashCodeBuilder result = target.append(_short);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${4c3db495-574f-3740-b240-dea9c9d3f199}
    @Test()
    void append17WhenArrayIsNotEmpty() {
        /* Branches:
         * (array == null) : false
         * (for-each(array)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = spy(new HashCodeBuilder(0, 0));
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        doReturn(hashCodeBuilder).when(target).append((short) 1);
        HashCodeBuilder hashCodeBuilder2 = new HashCodeBuilder();
        doReturn(hashCodeBuilder2).when(target).append((short) 2);
        HashCodeBuilder hashCodeBuilder3 = new HashCodeBuilder();
        doReturn(hashCodeBuilder3).when(target).append((short) 3);
        short[] shortArray = new short[]{(short) 1, (short) 2, (short) 3};

        //Act Statement(s)
        HashCodeBuilder result = target.append(shortArray);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append((short) 1);
            verify(target).append((short) 2);
            verify(target).append((short) 3);
        });
    }

    //Sapient generated method id: ${d39059ab-45fe-3c77-851b-668ba0a6edde}
    @Test()
    void appendSuperTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);

        //Act Statement(s)
        HashCodeBuilder result = target.appendSuper(0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${c319ea97-f8d0-37c4-a5dd-88e142a90c6d}
    @Test()
    void buildTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);

        //Act Statement(s)
        Integer result = target.build();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${8094f16a-fa90-33ac-ac73-28df63568208}
    @Test()
    void toHashCodeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);

        //Act Statement(s)
        int result = target.toHashCode();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }
}
