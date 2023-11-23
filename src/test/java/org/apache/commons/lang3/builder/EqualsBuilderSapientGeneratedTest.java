package org.apache.commons.lang3.builder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.Collection;

import org.mockito.MockedStatic;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EqualsBuilderSapientGeneratedTest {

    //Sapient generated method id: ${111e62bf-a249-36a7-ad25-eb28584631db}
    @Test()
    void getRegistryTest() {
        //Act Statement(s)
        Set<Pair<IDKey, IDKey>> result = EqualsBuilder.getRegistry();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${007a7abb-6f70-3867-bd53-50416059ef98}
    @Disabled()
    @Test()
    void getRegisterPairTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        //Act Statement(s)
        Pair<IDKey, IDKey> result = EqualsBuilder.getRegisterPair(object, object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${503da690-a5d8-37ca-8ce8-019efff44fef}
    @Disabled()
    @Test()
    void isRegisteredWhenRegistryIsNull() {
        /* Branches:
         * (registry != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<EqualsBuilder> equalsBuilder = mockStatic(EqualsBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            equalsBuilder.when(() -> EqualsBuilder.getRegisterPair(object, object2)).thenReturn(null);
            //Act Statement(s)
            boolean result = EqualsBuilder.isRegistered(object, object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                equalsBuilder.verify(() -> EqualsBuilder.getRegisterPair(object, object2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1c9373c8-383a-3ded-9865-2bd4971b7de2}
    @Test()
    void setTestTransientsTest() {
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        //Act Statement(s)
        EqualsBuilder result = target.setTestTransients(false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${42759e54-1e4b-31ce-b2d7-925f64a20db7}
    @Test()
    void setTestRecursiveTest() {
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        //Act Statement(s)
        EqualsBuilder result = target.setTestRecursive(false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${cddf2cde-cf55-3f27-b2d2-c99ca83c6e1c}
    @Test()
    void setBypassReflectionClassesTest() {
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        List<Class<?>> anyList = new ArrayList<>();
        //Act Statement(s)
        EqualsBuilder result = target.setBypassReflectionClasses(anyList);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${47c14f8a-54ed-3f49-8708-67d12e94dcdf}
    @Test()
    void setReflectUpToClassTest() {
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        //Act Statement(s)
        EqualsBuilder result = target.setReflectUpToClass(Object.class);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${3c0fdaf9-5570-3993-a117-9feff7d9b736}
    @Test()
    void setExcludeFieldsTest() {
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        String[] stringArray = new String[]{};
        //Act Statement(s)
        EqualsBuilder result = target.setExcludeFields(stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${83fb93bf-174e-3ba4-bd31-e9bdc5f5333c}
    @Test()
    void reflectionEqualsWhenReflectionEqualsLhsRhsReflectionToStringBuilderToNoNullStringArrayExcludeFields() {
        /* Branches:
         * (reflectionEquals(lhs, rhs, ReflectionToStringBuilder.toNoNullStringArray(excludeFields))) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<EqualsBuilder> equalsBuilder = mockStatic(EqualsBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            String[] stringArray = new String[]{};
            equalsBuilder.when(() -> EqualsBuilder.reflectionEquals(object, object2, stringArray)).thenReturn(true);
            Collection<String> collection = new ArrayList<>();
            collection.add("field1");
            collection.add("field2");
            //Act Statement(s)
            boolean result = EqualsBuilder.reflectionEquals(object, object2, collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                equalsBuilder.verify(() -> EqualsBuilder.reflectionEquals(object, object2, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c0824ad1-95c2-342e-ab76-e8eb2239c96e}
    @Test()
    void reflectionEqualsWhenReflectionEqualsNotLhsRhsReflectionToStringBuilderToNoNullStringArrayExcludeFields() {
        /* Branches:
         * (reflectionEquals(lhs, rhs, ReflectionToStringBuilder.toNoNullStringArray(excludeFields))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<EqualsBuilder> equalsBuilder = mockStatic(EqualsBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            String[] stringArray = new String[]{};
            equalsBuilder.when(() -> EqualsBuilder.reflectionEquals(object, object2, stringArray)).thenReturn(false);
            Collection<String> collection = new ArrayList<>();
            //Act Statement(s)
            boolean result = EqualsBuilder.reflectionEquals(object, object2, collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                equalsBuilder.verify(() -> EqualsBuilder.reflectionEquals(object, object2, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9c72dd6c-70a3-3bee-a129-cfad318ba6e3}
    @Test()
    void reflectionEquals1WhenReflectionEqualsLhsRhsFalseNullExcludeFields() {
        /* Branches:
         * (reflectionEquals(lhs, rhs, false, null, excludeFields)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<EqualsBuilder> equalsBuilder = mockStatic(EqualsBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            String[] stringArray = new String[]{};
            equalsBuilder.when(() -> EqualsBuilder.reflectionEquals(object, object2, false, (Class) null, stringArray)).thenReturn(true);
            //Act Statement(s)
            boolean result = EqualsBuilder.reflectionEquals(object, object2, stringArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                equalsBuilder.verify(() -> EqualsBuilder.reflectionEquals(object, object2, false, (Class) null, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${db9692ef-57ca-36ab-b4f4-1a55eb090076}
    @Test()
    void reflectionEquals1WhenReflectionEqualsNotLhsRhsFalseNullExcludeFields() {
        /* Branches:
         * (reflectionEquals(lhs, rhs, false, null, excludeFields)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<EqualsBuilder> equalsBuilder = mockStatic(EqualsBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            String[] stringArray = new String[]{};
            equalsBuilder.when(() -> EqualsBuilder.reflectionEquals(object, object2, false, (Class) null, stringArray)).thenReturn(false);
            //Act Statement(s)
            boolean result = EqualsBuilder.reflectionEquals(object, object2, stringArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                equalsBuilder.verify(() -> EqualsBuilder.reflectionEquals(object, object2, false, (Class) null, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${f8a04da5-adfa-32c1-9ab5-ea8b7148a9d5}
    @Test()
    void reflectionEquals2WhenReflectionEqualsLhsRhsTestTransientsNull() {
        /* Branches:
         * (reflectionEquals(lhs, rhs, testTransients, null)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<EqualsBuilder> equalsBuilder = mockStatic(EqualsBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            String[] stringArray = new String[]{};
            equalsBuilder.when(() -> EqualsBuilder.reflectionEquals(object, object2, false, (Class) null, stringArray)).thenReturn(true);
            //Act Statement(s)
            boolean result = EqualsBuilder.reflectionEquals(object, object2, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                equalsBuilder.verify(() -> EqualsBuilder.reflectionEquals(object, object2, false, (Class) null, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d964f6a5-9f52-3ca1-b67e-2a722096d831}
    @Test()
    void reflectionEquals2WhenReflectionEqualsNotLhsRhsTestTransientsNull() {
        /* Branches:
         * (reflectionEquals(lhs, rhs, testTransients, null)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<EqualsBuilder> equalsBuilder = mockStatic(EqualsBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            String[] stringArray = new String[]{};
            equalsBuilder.when(() -> EqualsBuilder.reflectionEquals(object, object2, false, (Class) null, stringArray)).thenReturn(false);
            //Act Statement(s)
            boolean result = EqualsBuilder.reflectionEquals(object, object2, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                equalsBuilder.verify(() -> EqualsBuilder.reflectionEquals(object, object2, false, (Class) null, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5802c04e-6c16-3922-b589-375eaab166a8}
    @Test()
    void reflectionEquals3WhenReflectionEqualsLhsRhsTestTransientsReflectUpToClassFalseExcludeFields() {
        /* Branches:
         * (reflectionEquals(lhs, rhs, testTransients, reflectUpToClass, false, excludeFields)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<EqualsBuilder> equalsBuilder = mockStatic(EqualsBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            String[] stringArray = new String[]{};
            equalsBuilder.when(() -> EqualsBuilder.reflectionEquals(object, object2, false, Object.class, false, stringArray)).thenReturn(true);
            //Act Statement(s)
            boolean result = EqualsBuilder.reflectionEquals(object, object2, false, Object.class, stringArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                equalsBuilder.verify(() -> EqualsBuilder.reflectionEquals(object, object2, false, Object.class, false, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${bce597d0-e0a4-314b-839f-a0d640a7c234}
    @Test()
    void reflectionEquals3WhenReflectionEqualsNotLhsRhsTestTransientsReflectUpToClassFalseExcludeFields() {
        /* Branches:
         * (reflectionEquals(lhs, rhs, testTransients, reflectUpToClass, false, excludeFields)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<EqualsBuilder> equalsBuilder = mockStatic(EqualsBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            String[] stringArray = new String[]{};
            equalsBuilder.when(() -> EqualsBuilder.reflectionEquals(object, object2, false, Object.class, false, stringArray)).thenReturn(false);
            //Act Statement(s)
            boolean result = EqualsBuilder.reflectionEquals(object, object2, false, Object.class, stringArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                equalsBuilder.verify(() -> EqualsBuilder.reflectionEquals(object, object2, false, Object.class, false, stringArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${e2cea882-9302-3766-8f9c-de22d3d7d4e7}
    @Test()
    void reflectionEquals4WhenLhsEqualsRhs() {
        /* Branches:
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        String[] stringArray = new String[]{};
        //Act Statement(s)
        boolean result = EqualsBuilder.reflectionEquals(object, object, false, Object.class, false, stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${de5ea12a-c47c-3b2e-9f1d-f14ccbe241cf}
    @Test()
    void reflectionEquals4WhenRhsIsNull() {
        /* Branches:
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = null;
        String[] stringArray = new String[]{};
        //Act Statement(s)
        boolean result = EqualsBuilder.reflectionEquals(object, object2, false, Object.class, false, stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${9efa18bb-100c-3d83-8118-47a575dfed9c}
    @Test()
    void reflectionEquals4WhenNewEqualsBuilderSetExcludeFieldsExcludeFieldsSetReflectUpToClassReflectUpToClassSetTestTransientsT() {
        /* Branches:
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (new EqualsBuilder().setExcludeFields(excludeFields).setReflectUpToClass(reflectUpToClass).setTestTransients(testTransients).setTestRecursive(testRecursive).reflectionAppend(lhs, rhs).isEquals()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        String[] stringArray = new String[]{};
        //Act Statement(s)
        boolean result = EqualsBuilder.reflectionEquals(object, object2, false, Object.class, false, stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${27876319-163a-3541-af6c-bc7916a11291}
    @Disabled()
    @Test()
    void reflectionEquals4WhenNewEqualsBuilderSetExcludeFieldsExcludeFieldsSetReflectUpToClassReflectUpToClassSetTestTransientsT2() {
        /* Branches:
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (new EqualsBuilder().setExcludeFields(excludeFields).setReflectUpToClass(reflectUpToClass).setTestTransients(testTransients).setTestRecursive(testRecursive).reflectionAppend(lhs, rhs).isEquals()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        String[] stringArray = new String[]{};
        //Act Statement(s)
        boolean result = EqualsBuilder.reflectionEquals(object, object2, false, Object.class, false, stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${1e38b6fc-76b3-363c-97c3-4ab670337ae3}
    @Test()
    void reflectionAppendWhenLhsEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        Object object = new Object();
        //Act Statement(s)
        EqualsBuilder result = target.reflectionAppend(object, object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${f85ac1a4-b605-38cb-b067-013c78ce5d04}
    @Test()
    void reflectionAppendWhenRhsIsNull() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        Object object = new Object();
        Object object2 = null;
        //Act Statement(s)
        EqualsBuilder result = target.reflectionAppend(object, object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${09255c4d-5ea1-34c4-a276-b306599e9d0a}
    @Disabled()
    @Test()
    void reflectionAppendWhenTestClassIsArray() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isInstance(rhs)) : true
         * (!rhsClass.isInstance(lhs)) : true
         * (testClass.isArray()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EqualsBuilder target = spy(new EqualsBuilder());
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        Object object = new Object();
        Object object2 = new Object();
        doReturn(equalsBuilder).when(target).append(object, object2);
        //Act Statement(s)
        EqualsBuilder result = target.reflectionAppend(object, object2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(object, object2);
        });
    }

    //Sapient generated method id: ${8373b398-2677-3b98-a542-aaec9576e2b2}
    @Disabled()
    @Test()
    void reflectionAppendWhenCaughtIllegalArgumentException() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isInstance(rhs)) : true
         * (!rhsClass.isInstance(lhs)) : true
         * (testClass.isArray()) : true
         * (catch-exception (IllegalArgumentException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EqualsBuilder target = spy(new EqualsBuilder());
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        Object object = new Object();
        Object object2 = new Object();
        doReturn(equalsBuilder).when(target).append(object, object2);
        //Act Statement(s)
        EqualsBuilder result = target.reflectionAppend(object, object2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(object, object2);
        });
    }

    //Sapient generated method id: ${d13a055a-d029-3804-840c-0005a088c59b}
    @Test()
    void reflectionAppendWhenBypassReflectionClassesContainsRhsClass() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isInstance(rhs)) : true
         * (!rhsClass.isInstance(lhs)) : true
         * (testClass.isArray()) : false
         * (bypassReflectionClasses != null) : true
         * (bypassReflectionClasses.contains(lhsClass)) : false
         * (bypassReflectionClasses.contains(rhsClass)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        Object object = new Object();
        Object object2 = new Object();
        //Act Statement(s)
        EqualsBuilder result = target.reflectionAppend(object, object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${bbce6ff0-ebf9-3ddd-8d2a-48cb41dcf3fa}
    @Disabled()
    @Test()
    void reflectionAppendWhenTestClassNotEqualsReflectUpToClass() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isInstance(rhs)) : true
         * (!rhsClass.isInstance(lhs)) : true
         * (testClass.isArray()) : false
         * (bypassReflectionClasses != null) : true
         * (bypassReflectionClasses.contains(lhsClass)) : false
         * (bypassReflectionClasses.contains(rhsClass)) : false
         * (isRegistered(lhs, rhs)) : true  #  inside reflectionAppend method
         * (testClass.getSuperclass() != null) : true
         * (testClass != reflectUpToClass) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<EqualsBuilder> equalsBuilder = mockStatic(EqualsBuilder.class)) {
            Object object = new Object();
            Object object2 = new Object();
            equalsBuilder.when(() -> EqualsBuilder.isRegistered(object, object2)).thenReturn(true);
            EqualsBuilder target = new EqualsBuilder();
            //Act Statement(s)
            EqualsBuilder result = target.reflectionAppend(object, object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(target));
                equalsBuilder.verify(() -> EqualsBuilder.isRegistered(object, object2), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${244282a3-5755-3f5b-b7e1-7f6a2f834387}
    @Disabled()
    @Test()
    void reflectionAppendWhenTestClassNotEqualsReflectUpToClassAndCaughtIllegalArgumentException() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isInstance(rhs)) : true
         * (!rhsClass.isInstance(lhs)) : true
         * (testClass.isArray()) : false
         * (bypassReflectionClasses != null) : true
         * (bypassReflectionClasses.contains(lhsClass)) : false
         * (bypassReflectionClasses.contains(rhsClass)) : false
         * (isRegistered(lhs, rhs)) : true  #  inside reflectionAppend method
         * (testClass.getSuperclass() != null) : true
         * (testClass != reflectUpToClass) : true
         * (catch-exception (IllegalArgumentException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<EqualsBuilder> equalsBuilder = mockStatic(EqualsBuilder.class)) {
            Object object = new Object();
            Object object2 = new Object();
            equalsBuilder.when(() -> EqualsBuilder.isRegistered(object, object2)).thenReturn(true);
            EqualsBuilder target = new EqualsBuilder();
            //Act Statement(s)
            EqualsBuilder result = target.reflectionAppend(object, object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(target));
                equalsBuilder.verify(() -> EqualsBuilder.isRegistered(object, object2), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${4d6e9c9b-9007-357a-9ed8-5a4b12d37f10}
    @Disabled()
    @Test()
    void reflectionAppendWhenRegistryIsEmptyAndTestClassGetSuperclassIsNotNullAndTestClassNotEqualsReflectUpToClass() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isInstance(rhs)) : false
         * (rhsClass.isInstance(lhs)) : true
         * (!lhsClass.isInstance(rhs)) : true
         * (testClass.isArray()) : false
         * (bypassReflectionClasses != null) : true
         * (bypassReflectionClasses.contains(lhsClass)) : false
         * (bypassReflectionClasses.contains(rhsClass)) : false
         * (isRegistered(lhs, rhs)) : false  #  inside reflectionAppend method
         * (registry == null) : true  #  inside register method
         * (i < fields.length) : false  #  inside reflectionAppend method
         * (registry != null) : true  #  inside unregister method
         * (registry.isEmpty()) : true  #  inside unregister method
         * (testClass.getSuperclass() != null) : true
         * (testClass != reflectUpToClass) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<EqualsBuilder> equalsBuilder = mockStatic(EqualsBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            equalsBuilder.when(() -> EqualsBuilder.isRegistered(object, object2)).thenReturn(false);
            equalsBuilder.when(() -> EqualsBuilder.getRegisterPair(object, object2)).thenReturn(null);
            EqualsBuilder target = new EqualsBuilder();
            //Act Statement(s)
            EqualsBuilder result = target.reflectionAppend(object, object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(target));
                equalsBuilder.verify(() -> EqualsBuilder.isRegistered(object, object2), atLeast(2));
                equalsBuilder.verify(() -> EqualsBuilder.getRegisterPair(object, object2), atLeast(4));
            });
        }
    }

    //Sapient generated method id: ${69a352a6-63ea-303e-b7c9-65a705be76bf}
    @Disabled()
    @Test()
    void reflectionAppendWhenFieldNotIsAnnotationPresentEqualsExcludeAndRegistryIsNotNullAndRegistryIsEmptyAndTestClassGetSuperc() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isInstance(rhs)) : true
         * (!rhsClass.isInstance(lhs)) : true
         * (testClass.isArray()) : false
         * (bypassReflectionClasses != null) : true
         * (bypassReflectionClasses.contains(lhsClass)) : false
         * (bypassReflectionClasses.contains(rhsClass)) : false
         * (isRegistered(lhs, rhs)) : false  #  inside reflectionAppend method
         * (registry == null) : true  #  inside register method
         * (i < fields.length) : true  #  inside reflectionAppend method
         * (isEquals) : true  #  inside reflectionAppend method
         * (!ArrayUtils.contains(excludeFields, field.getName())) : true  #  inside reflectionAppend method
         * (!field.getName().contains("$")) : true  #  inside reflectionAppend method
         * (testTransients) : false  #  inside reflectionAppend method
         * (!Modifier.isStatic(field.getModifiers())) : true  #  inside reflectionAppend method
         * (!field.isAnnotationPresent(EqualsExclude.class)) : true  #  inside reflectionAppend method
         * (registry != null) : true  #  inside unregister method
         * (registry.isEmpty()) : true  #  inside unregister method
         * (testClass.getSuperclass() != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<EqualsBuilder> equalsBuilder = mockStatic(EqualsBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            equalsBuilder.when(() -> EqualsBuilder.isRegistered(object, object2)).thenReturn(false);
            equalsBuilder.when(() -> EqualsBuilder.getRegisterPair(object, object2)).thenReturn(null);
            EqualsBuilder target = spy(new EqualsBuilder());
            EqualsBuilder equalsBuilder2 = new EqualsBuilder();
            Object object3 = new Object();
            Object object4 = new Object();
            doReturn(equalsBuilder2).when(target).append(object3, object4);
            //Act Statement(s)
            EqualsBuilder result = target.reflectionAppend(object, object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(target));
                equalsBuilder.verify(() -> EqualsBuilder.isRegistered(object, object2), atLeast(1));
                equalsBuilder.verify(() -> EqualsBuilder.getRegisterPair(object, object2), atLeast(2));
                verify(target, atLeast(1)).append(object3, object4);
            });
        }
    }

    //Sapient generated method id: ${5874df33-a3e3-394b-a124-e4f301392789}
    @Disabled()
    @Test()
    void reflectionAppendWhenRegistryIsNotNullAndRegistryIsEmpty() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isInstance(rhs)) : true
         * (!rhsClass.isInstance(lhs)) : true
         * (testClass.isArray()) : false
         * (bypassReflectionClasses != null) : true
         * (bypassReflectionClasses.contains(lhsClass)) : false
         * (bypassReflectionClasses.contains(rhsClass)) : false
         * (isRegistered(lhs, rhs)) : true  #  inside reflectionAppend method
         * (testClass.getSuperclass() != null) : true
         * (testClass != reflectUpToClass) : true
         * (registry == null) : true  #  inside register method
         * (i < fields.length) : true  #  inside reflectionAppend method
         * (isEquals) : true  #  inside reflectionAppend method
         * (!ArrayUtils.contains(excludeFields, field.getName())) : true  #  inside reflectionAppend method
         * (!field.getName().contains("$")) : true  #  inside reflectionAppend method
         * (testTransients) : false  #  inside reflectionAppend method
         * (!Modifier.isStatic(field.getModifiers())) : true  #  inside reflectionAppend method
         * (!field.isAnnotationPresent(EqualsExclude.class)) : true  #  inside reflectionAppend method
         * (registry != null) : true  #  inside unregister method
         * (registry.isEmpty()) : true  #  inside unregister method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<EqualsBuilder> equalsBuilder = mockStatic(EqualsBuilder.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            equalsBuilder.when(() -> EqualsBuilder.isRegistered(object, object2)).thenReturn(true).thenReturn(false);
            equalsBuilder.when(() -> EqualsBuilder.getRegisterPair(object, object2)).thenReturn(null);
            EqualsBuilder target = spy(new EqualsBuilder());
            EqualsBuilder equalsBuilder2 = new EqualsBuilder();
            Object object3 = new Object();
            Object object4 = new Object();
            doReturn(equalsBuilder2).when(target).append(object3, object4);
            //Act Statement(s)
            EqualsBuilder result = target.reflectionAppend(object, object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(target));
                equalsBuilder.verify(() -> EqualsBuilder.isRegistered(object, object2), atLeast(2));
                equalsBuilder.verify(() -> EqualsBuilder.getRegisterPair(object, object2), atLeast(2));
                verify(target, atLeast(1)).append(object3, object4);
            });
        }
    }

    //Sapient generated method id: ${bc1aa0ea-a9e0-32a2-97fd-02d3119940bf}
    @Test()
    void appendSuperWhenIsEquals() {
        /* Branches:
         * (!isEquals) : false
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        //Act Statement(s)
        EqualsBuilder result = target.appendSuper(false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${de7ceec1-39f6-3111-93fb-66ee95dd4d19}
    @Test()
    void appendWhenLhsEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        Object object = new Object();
        //Act Statement(s)
        EqualsBuilder result = target.append(object, object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${4e04e831-2c22-3c56-b858-c316c50398f4}
    @Test()
    void appendWhenRhsIsNull() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        Object object = new Object();
        Object object2 = null;
        //Act Statement(s)
        EqualsBuilder result = target.append(object, object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${21990472-a670-354b-8d92-556dda877421}
    @Test()
    void appendWhenLhsGetClassNotEqualsRhsGetClass() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isArray()) : true
         * (lhs.getClass() != rhs.getClass()) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        Object object = new Object();
        Object object2 = new Object();
        //Act Statement(s)
        EqualsBuilder result = target.append(object, object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${66a1c0fa-648f-3944-8afb-1538c0971307}
    @Test()
    void appendWhenNotTestRecursive() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isArray()) : false
         * (testRecursive) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        Object object = new Object();
        Object object2 = new Object();
        //Act Statement(s)
        EqualsBuilder result = target.append(object, object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${14c4276b-df7e-37b2-a217-d5bd92128785}
    @Test()
    void appendWhenLhsInstanceOfLongArray() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isArray()) : true
         * (lhs.getClass() != rhs.getClass()) : false  #  inside appendArray method
         * (lhs instanceof long[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        long[] longArray = new long[]{};
        long[] longArray2 = new long[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append((Object) longArray, (Object) longArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${2c1150fa-6ce2-3549-9753-c6d806d2613f}
    @Test()
    void appendWhenLhsInstanceOfIntArray() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isArray()) : true
         * (lhs.getClass() != rhs.getClass()) : false  #  inside appendArray method
         * (lhs instanceof long[]) : false  #  inside appendArray method
         * (lhs instanceof int[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        int[] intArray = new int[]{};
        int[] intArray2 = new int[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append((Object) intArray, (Object) intArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${d7038e37-b564-365d-9dfe-9aa1c334bf5b}
    @Test()
    void appendWhenLhsInstanceOfShortArray() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isArray()) : true
         * (lhs.getClass() != rhs.getClass()) : false  #  inside appendArray method
         * (lhs instanceof long[]) : false  #  inside appendArray method
         * (lhs instanceof int[]) : false  #  inside appendArray method
         * (lhs instanceof short[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        short[] shortArray = new short[]{};
        short[] shortArray2 = new short[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append((Object) shortArray, (Object) shortArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${8bc8c37f-12b6-3b1c-b976-10cd7ceb3706}
    @Test()
    void appendWhenLhsInstanceOfCharArray() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isArray()) : true
         * (lhs.getClass() != rhs.getClass()) : false  #  inside appendArray method
         * (lhs instanceof long[]) : false  #  inside appendArray method
         * (lhs instanceof int[]) : false  #  inside appendArray method
         * (lhs instanceof short[]) : false  #  inside appendArray method
         * (lhs instanceof char[]) : true  #  inside appendArray method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        char[] charArray = new char[]{};
        char[] charArray2 = new char[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append((Object) charArray, (Object) charArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${0e53e069-bb0c-324d-8a74-7e1645770c1b}
    @Test()
    void appendWhenLhsInstanceOfByteArray() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isArray()) : true
         * (lhs.getClass() != rhs.getClass()) : false  #  inside appendArray method
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
        EqualsBuilder target = new EqualsBuilder();
        byte[] byteArray = new byte[]{};
        byte[] byteArray2 = new byte[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append((Object) byteArray, (Object) byteArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${6e45b0d5-37a1-33ca-9f87-7264b49a5ff9}
    @Test()
    void appendWhenLhsInstanceOfDoubleArray() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isArray()) : true
         * (lhs.getClass() != rhs.getClass()) : false  #  inside appendArray method
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
        EqualsBuilder target = new EqualsBuilder();
        double[] doubleArray = new double[]{};
        double[] doubleArray2 = new double[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append((Object) doubleArray, (Object) doubleArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${b71b2f69-4d23-3561-a8e1-168143617312}
    @Test()
    void appendWhenLhsInstanceOfFloatArray() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isArray()) : true
         * (lhs.getClass() != rhs.getClass()) : false  #  inside appendArray method
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
        EqualsBuilder target = new EqualsBuilder();
        float[] floatArray = new float[]{};
        float[] floatArray2 = new float[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append((Object) floatArray, (Object) floatArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${5143c7b1-c72b-36a9-8024-e2cb8020e67e}
    @Test()
    void appendWhenLhsInstanceOfBooleanArray() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isArray()) : true
         * (lhs.getClass() != rhs.getClass()) : false  #  inside appendArray method
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
        EqualsBuilder target = new EqualsBuilder();
        boolean[] booleanArray = new boolean[]{};
        boolean[] booleanArray2 = new boolean[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append((Object) booleanArray, (Object) booleanArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${a0e5208a-7629-3a6f-8480-17a8a69d8e6a}
    @Test()
    void appendWhenLhsNotInstanceOfBooleanArray() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhsClass.isArray()) : true
         * (lhs.getClass() != rhs.getClass()) : false  #  inside appendArray method
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
        EqualsBuilder target = new EqualsBuilder();
        Object object = new Object();
        Object object2 = new Object();
        //Act Statement(s)
        EqualsBuilder result = target.append(object, object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${f8f78d16-6888-32df-bf84-c97b250be4e3}
    @Test()
    void append1WhenLhsEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        //Act Statement(s)
        EqualsBuilder result = target.append(0L, 0L);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${b31cbf77-711a-3a11-9edf-103c726d4f62}
    @Test()
    void append1WhenLhsNotEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        //Act Statement(s)
        EqualsBuilder result = target.append(1L, 2L);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${1e62386e-9dfc-3dca-aa94-8c3119738db5}
    @Test()
    void append2WhenLhsEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        //Act Statement(s)
        EqualsBuilder result = target.append(1, 1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${44066f48-0c8b-3121-be50-769425a45ded}
    @Test()
    void append2WhenLhsNotEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        //Act Statement(s)
        EqualsBuilder result = target.append(1, 2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${9abbe0f4-e7df-3d4d-a5ef-2a0f7ab19738}
    @Test()
    void append3WhenLhsEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        //Act Statement(s)
        EqualsBuilder result = target.append((short) 1, (short) 1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${1dda7aba-ea40-3db6-9f26-a47abb98c215}
    @Test()
    void append3WhenLhsNotEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        //Act Statement(s)
        EqualsBuilder result = target.append((short) 1, (short) 2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${040b655b-e56d-368f-b711-eff005378630}
    @Test()
    void append4WhenLhsEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        //Act Statement(s)
        EqualsBuilder result = target.append('A', 'A');
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${b411be4d-8cd3-3b9f-808c-c676bdcb5eb6}
    @Test()
    void append4WhenLhsNotEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        //Act Statement(s)
        EqualsBuilder result = target.append('A', 'B');
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${7c97f58c-4231-35ef-973b-890714c96012}
    @Test()
    void append5WhenLhsEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        //Act Statement(s)
        EqualsBuilder result = target.append((byte) 1, (byte) 1);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${ae9f0367-3f29-332a-b27d-6feb8f4965c1}
    @Test()
    void append5WhenLhsNotEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        //Act Statement(s)
        EqualsBuilder result = target.append((byte) 1, (byte) 2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${069d8767-e1bb-3078-b8b0-55a89a1cb8aa}
    @Test()
    void append6WhenIsEquals() {
        /* Branches:
         * (!isEquals) : false
         */
        //Arrange Statement(s)
        EqualsBuilder target = spy(new EqualsBuilder());
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        doReturn(equalsBuilder).when(target).append(4607182418800017408L, 0L);
        //Act Statement(s)
        EqualsBuilder result = target.append(Double.parseDouble("1.0"), Double.parseDouble("0.0"));
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(equalsBuilder));
            verify(target).append(4607182418800017408L, 0L);
        });
    }

    //Sapient generated method id: ${a61ed76d-fbee-3ff3-9da9-36eb081b8ed9}
    @Test()
    void append7WhenIsEquals() {
        /* Branches:
         * (!isEquals) : false
         */
        //Arrange Statement(s)
        EqualsBuilder target = spy(new EqualsBuilder());
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        doReturn(equalsBuilder).when(target).append(1065353216, 0);
        //Act Statement(s)
        EqualsBuilder result = target.append(Float.parseFloat("1.0"), Float.parseFloat("0.0"));
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(equalsBuilder));
            verify(target).append(1065353216, 0);
        });
    }

    //Sapient generated method id: ${5e40c0de-9877-3eb2-96d9-30aa13c012bd}
    @Test()
    void append8WhenLhsEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        //Act Statement(s)
        EqualsBuilder result = target.append(false, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${7c03db1b-a40f-37e6-9a71-601b8cb54a9b}
    @Test()
    void append8WhenLhsNotEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        //Act Statement(s)
        EqualsBuilder result = target.append(true, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${a1ccc2e5-eb12-3115-8ebf-8876b027ecf1}
    @Test()
    void append9WhenLhsEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append(objectArray, objectArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${65e11fdb-f983-34e2-a28f-0a2f539c46c0}
    @Test()
    void append9WhenRhsIsNull() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        Object[] objectArray = new Object[]{};
        Object[] object = null;
        //Act Statement(s)
        EqualsBuilder result = target.append(objectArray, object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${7951fc90-8046-356e-865a-667faae7264f}
    @Test()
    void append9WhenLhsLengthNotEqualsRhsLength() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        Object object = new Object();
        Object[] objectArray = new Object[]{object};
        Object[] objectArray2 = new Object[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append(objectArray, objectArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${d6fc8cb3-267d-33eb-b066-4067a0de080e}
    @Test()
    void append9WhenIsEquals() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : false
         * (i < lhs.length) : true
         * (isEquals) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = spy(new EqualsBuilder());
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        Object object = new Object();
        Object object2 = new Object();
        doReturn(equalsBuilder).when(target).append(object, object2);
        Object[] objectArray = new Object[]{object};
        Object[] objectArray2 = new Object[]{object2};
        //Act Statement(s)
        EqualsBuilder result = target.append(objectArray, objectArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(object, object2);
        });
    }

    //Sapient generated method id: ${5ad823f0-3d41-3732-a085-696b772e0d50}
    @Test()
    void append10WhenLhsEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        long[] longArray = new long[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append(longArray, longArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${8b9be490-e53c-3ddd-afe5-75e3728ddc64}
    @Test()
    void append10WhenRhsIsNull() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        long[] longArray = new long[]{};
        long[] _long = null;
        //Act Statement(s)
        EqualsBuilder result = target.append(longArray, _long);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${c81fc39a-3105-35a8-a09b-11c0369f31ba}
    @Test()
    void append10WhenLhsLengthNotEqualsRhsLength() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        long[] longArray = new long[]{0L};
        long[] longArray2 = new long[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append(longArray, longArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${8a4543f3-d449-3b49-850d-ed6b720e65cd}
    @Test()
    void append10WhenIsEquals() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : false
         * (i < lhs.length) : true
         * (isEquals) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = spy(new EqualsBuilder());
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        doReturn(equalsBuilder).when(target).append(0L, 0L);
        long[] longArray = new long[]{0L};
        long[] longArray2 = new long[]{0L};
        //Act Statement(s)
        EqualsBuilder result = target.append(longArray, longArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(0L, 0L);
        });
    }

    //Sapient generated method id: ${981b95ef-d0c2-37aa-8380-a04c5a572892}
    @Test()
    void append11WhenLhsEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        int[] intArray = new int[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append(intArray, intArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${6260ba8e-c1a5-3fde-997f-b7e70d42a9db}
    @Test()
    void append11WhenRhsIsNull() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        int[] intArray = new int[]{};
        int[] _int = null;
        //Act Statement(s)
        EqualsBuilder result = target.append(intArray, _int);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${43caa762-b267-334b-9396-fcfcdb3ad0ae}
    @Test()
    void append11WhenLhsLengthNotEqualsRhsLength() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        int[] intArray = new int[]{0};
        int[] intArray2 = new int[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append(intArray, intArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${01ead517-94d1-3a8b-bf5d-07fa85fb1884}
    @Test()
    void append11WhenIsEquals() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : false
         * (i < lhs.length) : true
         * (isEquals) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = spy(new EqualsBuilder());
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        doReturn(equalsBuilder).when(target).append(0, 0);
        int[] intArray = new int[]{0};
        int[] intArray2 = new int[]{0};
        //Act Statement(s)
        EqualsBuilder result = target.append(intArray, intArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(0, 0);
        });
    }

    //Sapient generated method id: ${0dfe15b9-5d3b-310f-b1fe-a7de84906e5e}
    @Test()
    void append12WhenLhsEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        short[] shortArray = new short[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append(shortArray, shortArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${b71dc82c-fab7-3ae0-8cdb-35cac8611599}
    @Test()
    void append12WhenRhsIsNull() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        short[] shortArray = new short[]{};
        short[] _short = null;
        //Act Statement(s)
        EqualsBuilder result = target.append(shortArray, _short);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${f977ed38-348a-3044-addd-201e0c2faa02}
    @Test()
    void append12WhenLhsLengthNotEqualsRhsLength() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        short[] shortArray = new short[]{(short) 0};
        short[] shortArray2 = new short[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append(shortArray, shortArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${d5df4192-9079-3580-886d-d755da0df974}
    @Test()
    void append12WhenIsEquals() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : false
         * (i < lhs.length) : true
         * (isEquals) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = spy(new EqualsBuilder());
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        doReturn(equalsBuilder).when(target).append((short) 0, (short) 0);
        short[] shortArray = new short[]{(short) 0};
        short[] shortArray2 = new short[]{(short) 0};
        //Act Statement(s)
        EqualsBuilder result = target.append(shortArray, shortArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append((short) 0, (short) 0);
        });
    }

    //Sapient generated method id: ${2d9134dc-0125-31da-b105-b4a0b1fa4ac5}
    @Test()
    void append13WhenLhsEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        char[] charArray = new char[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append(charArray, charArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${ebc222f7-7841-3925-82d2-1c076bad4b04}
    @Test()
    void append13WhenRhsIsNull() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        char[] charArray = new char[]{};
        char[] _char = null;
        //Act Statement(s)
        EqualsBuilder result = target.append(charArray, _char);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${2d3c0bc5-ab52-3e76-9b04-4c898a0ea667}
    @Test()
    void append13WhenLhsLengthNotEqualsRhsLength() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        char[] charArray = new char[]{'A'};
        char[] charArray2 = new char[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append(charArray, charArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${103eeb7a-d7bc-32de-a3da-9333ab4620a1}
    @Test()
    void append13WhenIsEquals() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : false
         * (i < lhs.length) : true
         * (isEquals) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = spy(new EqualsBuilder());
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        doReturn(equalsBuilder).when(target).append('A', 'A');
        char[] charArray = new char[]{'A'};
        char[] charArray2 = new char[]{'A'};
        //Act Statement(s)
        EqualsBuilder result = target.append(charArray, charArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append('A', 'A');
        });
    }

    //Sapient generated method id: ${b9899d86-2f4d-3d58-a2f4-958b151dda82}
    @Test()
    void append14WhenLhsEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append(byteArray, byteArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${f7c49d10-c351-35f9-a332-5c7ea9cea0db}
    @Test()
    void append14WhenRhsIsNull() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        byte[] byteArray = new byte[]{};
        byte[] _byte = null;
        //Act Statement(s)
        EqualsBuilder result = target.append(byteArray, _byte);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${48eed701-2e27-37b1-9bc3-5752d83f1380}
    @Test()
    void append14WhenLhsLengthNotEqualsRhsLength() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        byte[] byteArray = new byte[]{(byte) 0};
        byte[] byteArray2 = new byte[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append(byteArray, byteArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${07036f3f-7f5c-3533-8439-4f60b8191113}
    @Test()
    void append14WhenIsEquals() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : false
         * (i < lhs.length) : true
         * (isEquals) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = spy(new EqualsBuilder());
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        doReturn(equalsBuilder).when(target).append((byte) 0, (byte) 0);
        byte[] byteArray = new byte[]{(byte) 0};
        byte[] byteArray2 = new byte[]{(byte) 0};
        //Act Statement(s)
        EqualsBuilder result = target.append(byteArray, byteArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append((byte) 0, (byte) 0);
        });
    }

    //Sapient generated method id: ${5bf69fd7-1fcb-349c-8e59-9840426e1ceb}
    @Test()
    void append15WhenLhsEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        double[] doubleArray = new double[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append(doubleArray, doubleArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${068a4ae9-d63c-3c56-8eaf-6d2a55a77139}
    @Test()
    void append15WhenRhsIsNull() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        double[] doubleArray = new double[]{};
        double[] _double = null;
        //Act Statement(s)
        EqualsBuilder result = target.append(doubleArray, _double);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${b46c9e91-207c-34ba-9d17-4e83adbaaff0}
    @Test()
    void append15WhenLhsLengthNotEqualsRhsLength() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        double[] doubleArray = new double[]{Double.parseDouble("0")};
        double[] doubleArray2 = new double[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append(doubleArray, doubleArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${da36d1c4-6d0e-35af-b838-35ef99bed87c}
    @Test()
    void append15WhenIsEquals() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : false
         * (i < lhs.length) : true
         * (isEquals) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = spy(new EqualsBuilder());
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        doReturn(equalsBuilder).when(target).append(Double.parseDouble("0"), Double.parseDouble("0"));
        double[] doubleArray = new double[]{Double.parseDouble("0")};
        double[] doubleArray2 = new double[]{Double.parseDouble("0")};
        //Act Statement(s)
        EqualsBuilder result = target.append(doubleArray, doubleArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(Double.parseDouble("0"), Double.parseDouble("0"));
        });
    }

    //Sapient generated method id: ${9d79217e-f9dc-3c7d-a04a-73f885434792}
    @Test()
    void append16WhenLhsEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        float[] floatArray = new float[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append(floatArray, floatArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${e2db16c1-4c69-30ab-8b42-6b474d385623}
    @Test()
    void append16WhenRhsIsNull() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        float[] floatArray = new float[]{};
        float[] _float = null;
        //Act Statement(s)
        EqualsBuilder result = target.append(floatArray, _float);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${40043f3c-3360-30b4-98ff-e388e7d66714}
    @Test()
    void append16WhenLhsLengthNotEqualsRhsLength() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        float[] floatArray = new float[]{Float.parseFloat("0")};
        float[] floatArray2 = new float[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append(floatArray, floatArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${f447ec13-b551-3518-b2ca-618a8ddf37a5}
    @Test()
    void append16WhenIsEquals() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : false
         * (i < lhs.length) : true
         * (isEquals) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = spy(new EqualsBuilder());
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        doReturn(equalsBuilder).when(target).append(Float.parseFloat("0"), Float.parseFloat("0"));
        float[] floatArray = new float[]{Float.parseFloat("0")};
        float[] floatArray2 = new float[]{Float.parseFloat("0")};
        //Act Statement(s)
        EqualsBuilder result = target.append(floatArray, floatArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(Float.parseFloat("0"), Float.parseFloat("0"));
        });
    }

    //Sapient generated method id: ${e0e22689-9922-3a03-9f08-db8e29239220}
    @Test()
    void append17WhenLhsEqualsRhs() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        boolean[] booleanArray = new boolean[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append(booleanArray, booleanArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${80d3ceca-fcb2-3834-884e-2b3ac3d6fe25}
    @Test()
    void append17WhenRhsIsNull() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        boolean[] booleanArray = new boolean[]{};
        boolean[] _boolean = null;
        //Act Statement(s)
        EqualsBuilder result = target.append(booleanArray, _boolean);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${433f9075-ffc6-3fa9-8651-1f267853bf6a}
    @Test()
    void append17WhenLhsLengthNotEqualsRhsLength() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        boolean[] booleanArray = new boolean[]{false};
        boolean[] booleanArray2 = new boolean[]{};
        //Act Statement(s)
        EqualsBuilder result = target.append(booleanArray, booleanArray2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${5ea0c8de-a3e6-350a-aa0a-8b3b57861b6d}
    @Test()
    void append17WhenIsEquals() {
        /* Branches:
         * (!isEquals) : false
         * (lhs == rhs) : false
         * (lhs == null) : false
         * (rhs == null) : false
         * (lhs.length != rhs.length) : false
         * (i < lhs.length) : true
         * (isEquals) : true
         */
        //Arrange Statement(s)
        EqualsBuilder target = spy(new EqualsBuilder());
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        doReturn(equalsBuilder).when(target).append(false, false);
        boolean[] booleanArray = new boolean[]{false};
        boolean[] booleanArray2 = new boolean[]{false};
        //Act Statement(s)
        EqualsBuilder result = target.append(booleanArray, booleanArray2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).append(false, false);
        });
    }

    //Sapient generated method id: ${c319ea97-f8d0-37c4-a5dd-88e142a90c6d}
    @Test()
    void buildTest() {
        //Arrange Statement(s)
        EqualsBuilder target = spy(new EqualsBuilder());
        doReturn(false).when(target).isEquals();
        //Act Statement(s)
        Boolean result = target.build();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target).isEquals();
        });
    }

    //Sapient generated method id: ${956fb832-abf7-3971-aedb-c516d557eacc}
    @Test()
    void resetTest() {
        //Arrange Statement(s)
        EqualsBuilder target = new EqualsBuilder();
        //Act Statement(s)
        target.reset();
    }
}
