package org.apache.commons.lang3.builder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import java.util.Set;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
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

    //Sapient generated method id: ${getRegistryTest}, hash: E007987BDB5BEA66A29E4C09097EE0F4
    @Test()
    void getRegistryTest() {
        
        //Act Statement(s)
        Set<IDKey> result = HashCodeBuilder.getRegistry();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${isRegisteredWhenRegistryIsNull}, hash: C0FE2525FE2C75956ACC91E66B5BFAA9
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

    //Sapient generated method id: ${reflectionHashCodeTest}, hash: 1E0C20178043E43756454F33D8CC6D01
    @Test()
    void reflectionHashCodeTest() {
        //Arrange Statement(s)
        try (MockedStatic<HashCodeBuilder> hashCodeBuilder = mockStatic(HashCodeBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            String[] stringArray = new String[] {};
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

    //Sapient generated method id: ${reflectionHashCode1Test}, hash: 653C6E5AB7FB7044EB7B5A15037C1EE3
    @Test()
    void reflectionHashCode1Test() {
        //Arrange Statement(s)
        try (MockedStatic<HashCodeBuilder> hashCodeBuilder = mockStatic(HashCodeBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            String[] stringArray = new String[] {};
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

    //Sapient generated method id: ${reflectionHashCode2WhenDefaultBranchThrowsIllegalArgumentException}, hash: A742B893017039CAEA431AEA1088F9A0
    @Test()
    void reflectionHashCode2WhenDefaultBranchThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 533)) : true  #  inside <init> method
         */
         //Arrange Statement(s)
        Object object = new Object();
        String[] stringArray = new String[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            HashCodeBuilder.reflectionHashCode(1, 0, object, false, Object.class, stringArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${reflectionHashCode2WhenDefaultBranch2ThrowsIllegalArgumentException}, hash: D88E04996AF55CC3B2E007AB2B72364B
    @Test()
    void reflectionHashCode2WhenDefaultBranch2ThrowsIllegalArgumentException() {
        /* Branches:
         * (branch expression (line 533)) : false  #  inside <init> method
         */
         //Arrange Statement(s)
        Object object = new Object();
        String[] stringArray = new String[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            HashCodeBuilder.reflectionHashCode(0, 0, object, false, Object.class, stringArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${reflectionHashCode3Test}, hash: 3B3914EAFD49B15CC859AF733B72962B
    @Test()
    void reflectionHashCode3Test() {
        //Arrange Statement(s)
        try (MockedStatic<HashCodeBuilder> hashCodeBuilder = mockStatic(HashCodeBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            String[] stringArray = new String[] {};
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

    //Sapient generated method id: ${reflectionHashCode4Test}, hash: ABA8E7F007780CC03A2B531058DB1FA5
    @Test()
    void reflectionHashCode4Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<HashCodeBuilder> hashCodeBuilder = mockStatic(HashCodeBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            String[] stringArray = new String[] {};
            hashCodeBuilder.when(() -> HashCodeBuilder.reflectionHashCode(object, stringArray)).thenReturn(0);
            Collection<String> collection = new ArrayList<>();
            //Act Statement(s)
            int result = HashCodeBuilder.reflectionHashCode(object, collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                hashCodeBuilder.verify(() -> HashCodeBuilder.reflectionHashCode(object, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${reflectionHashCode5Test}, hash: F902ED4E121D4EAAED6D36ABA8EEBCB0
    @Test()
    void reflectionHashCode5Test() {
        //Arrange Statement(s)
        try (MockedStatic<HashCodeBuilder> hashCodeBuilder = mockStatic(HashCodeBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            String[] stringArray = new String[] {};
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

    //Sapient generated method id: ${appendWhenValue}, hash: 4847BF3F3BFE634011222155ED9F291B
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

    //Sapient generated method id: ${appendWhenNotValue}, hash: 0AD5A1CE18ED97C0596C71CF09930B7F
    @Test()
    void appendWhenNotValue() {
        /* Branches:
         * (value) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        
        //Act Statement(s)
        HashCodeBuilder result = target.append(false);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append1WhenArrayIsNull}, hash: E21F7119565C1FFCC76700A2E249961A
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

    //Sapient generated method id: ${append1WhenArrayIsNotEmpty}, hash: E4545DB7A03D55EFAC5252E390CCB666
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
        doReturn(hashCodeBuilder).when(target).append(false);
        boolean[] booleanArray = new boolean[] { false };
        
        //Act Statement(s)
        HashCodeBuilder result = target.append(booleanArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(false);
        });
    }

    //Sapient generated method id: ${append2Test}, hash: 89431B2EA112E1C1E13968580461B3B5
    @Test()
    void append2Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        
        //Act Statement(s)
        HashCodeBuilder result = target.append((byte) 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append3WhenArrayIsNull}, hash: D2A7DD535F741C6F76F041961ACE4463
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

    //Sapient generated method id: ${append3WhenArrayIsNotEmpty}, hash: EE0E456C45426B92D6647C08359615EC
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
        byte[] byteArray = new byte[] { (byte) 1 };
        
        //Act Statement(s)
        HashCodeBuilder result = target.append(byteArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append4Test}, hash: C0B3AF14DCA8E6C093B4891ACFD95D61
    @Test()
    void append4Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        
        //Act Statement(s)
        HashCodeBuilder result = target.append('A');
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append5WhenArrayIsNull}, hash: BB0769B96265D3C32EA7DE6538BE3C45
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

    //Sapient generated method id: ${append5WhenArrayIsNotEmpty}, hash: 27E3124ACF0AE88FC049ECE401F7EDAF
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
        char[] charArray = new char[] { 'A' };
        
        //Act Statement(s)
        HashCodeBuilder result = target.append(charArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append6Test}, hash: B0C0D5D8AC4A0609AD02F6A9D42D6CAE
    @Test()
    void append6Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        
        //Act Statement(s)
        HashCodeBuilder result = target.append(Double.parseDouble("1.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append7WhenArrayIsNull}, hash: DC18274204E94BE51F588A285648329A
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

    //Sapient generated method id: ${append7WhenArrayIsNotEmpty}, hash: 2C23E68B0DD94C509B3E1DAD1F39FBD0
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
        doReturn(hashCodeBuilder).when(target).append(Double.parseDouble("0"));
        double[] doubleArray = new double[] { Double.parseDouble("0") };
        
        //Act Statement(s)
        HashCodeBuilder result = target.append(doubleArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(Double.parseDouble("0"));
        });
    }

    //Sapient generated method id: ${append8Test}, hash: F2877316E5901B9795A4FBB30C31132B
    @Test()
    void append8Test() {
        /*
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

    //Sapient generated method id: ${append9WhenArrayIsNull}, hash: 2A5C619F6C1FEF42702A02012EB4FF25
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

    //Sapient generated method id: ${append9WhenArrayIsNotEmpty}, hash: 78C02CCEBC80865F7D3BD2F727EB7DCF
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
        float[] floatArray = new float[] { Float.parseFloat("1.0") };
        
        //Act Statement(s)
        HashCodeBuilder result = target.append(floatArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append10Test}, hash: 4097EDFC0902C967B588799A2C31704B
    @Test()
    void append10Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        
        //Act Statement(s)
        HashCodeBuilder result = target.append(1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append11WhenArrayIsNull}, hash: 8538BD093D249773665EB7F001B1402F
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

    //Sapient generated method id: ${append11WhenArrayIsNotEmpty}, hash: 0D96B32BFA97AD8BC4492ACE244BF85D
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
        doReturn(hashCodeBuilder).when(target).append(0);
        int[] intArray = new int[] { 0 };
        
        //Act Statement(s)
        HashCodeBuilder result = target.append(intArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(0);
        });
    }

    //Sapient generated method id: ${append12Test}, hash: E3B57E3AD3FF3E55897884FA055EDE98
    @Test()
    void append12Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        
        //Act Statement(s)
        HashCodeBuilder result = target.append(0L);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append13WhenArrayIsNull}, hash: 4460201EF478821FD9A924CA519A1ED8
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

    //Sapient generated method id: ${append13WhenArrayIsNotEmpty}, hash: B85C1522864EA6B5CAF4CAF356C31F10
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
        long[] longArray = new long[] { 0L };
        
        //Act Statement(s)
        HashCodeBuilder result = target.append(longArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append14WhenObjectIsNull}, hash: 5B346BE0FAC6C03398CEE95A68F2E45F
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

    //Sapient generated method id: ${append14WhenObjectUtilsNotIsArrayObject}, hash: 7D76A08C3D65CF0AB346251B9D79171C
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

    //Sapient generated method id: ${append14WhenObjectNotInstanceOfBooleanArray}, hash: 87B626236FECE1DBA432E89E7F5D0224
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
        
        //Act Statement(s)
        HashCodeBuilder result = target.append((Object) null);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append15WhenArrayIsNull}, hash: B42639F2036E6D8EB162B12EBDA78456
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
        Object[] object = null;
        
        //Act Statement(s)
        HashCodeBuilder result = target.append(object);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append15WhenArrayIsNotEmpty}, hash: A51937C35EE724873E7BE67366F0E7FE
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
        Object object = new Object();
        doReturn(hashCodeBuilder).when(target).append(object);
        Object[] objectArray = new Object[] { object };
        
        //Act Statement(s)
        HashCodeBuilder result = target.append(objectArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(object);
        });
    }

    //Sapient generated method id: ${append16Test}, hash: 2091708E1F9A54E92B3518C73C958741
    @Test()
    void append16Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        
        //Act Statement(s)
        HashCodeBuilder result = target.append((short) 1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${append17WhenArrayIsNull}, hash: D690BD7BE5723E4833501874B3BC4D2B
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

    //Sapient generated method id: ${append17WhenArrayIsNotEmpty}, hash: 47FF56FAC302496CE40B0EDCA1CD486A
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
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        short[] shortArray = new short[] { (short) 1 };
        
        //Act Statement(s)
        HashCodeBuilder result = target.append(shortArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${appendSuperTest}, hash: F1ACAA22E4346E835D5470600C5DB46F
    @Test()
    void appendSuperTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        HashCodeBuilder target = new HashCodeBuilder(0, 0);
        
        //Act Statement(s)
        HashCodeBuilder result = target.appendSuper(1);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${buildTest}, hash: 5C833688A46AF58304A131BF727F1029
    @Test()
    void buildTest() {
        /*
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

    //Sapient generated method id: ${toHashCodeTest}, hash: 9305B02D27118C26AE2C9E381E489C11
    @Test()
    void toHashCodeTest() {
        /*
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
