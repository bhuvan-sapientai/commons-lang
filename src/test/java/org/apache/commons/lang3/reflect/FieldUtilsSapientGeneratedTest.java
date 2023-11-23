package org.apache.commons.lang3.reflect;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;

import org.mockito.stubbing.Answer;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FieldUtilsSapientGeneratedTest {

    //Sapient generated method id: ${cae61e6e-2bde-3bd3-ab99-f0aabebeb150}
    @Test()
    void getFieldTest() throws NoSuchFieldException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            fieldUtils.when(() -> FieldUtils.getField(Object.class, "fieldName1", false)).thenReturn(null);
            //Act Statement(s)
            Field result = FieldUtils.getField(Object.class, "fieldName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                fieldUtils.verify(() -> FieldUtils.getField(Object.class, "fieldName1", false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${07408e52-07f9-3c97-afe2-a302f2a3e324}
    @Test()
    void getField1WhenForceAccess() throws NoSuchFieldException {
        /* Branches:
         * (acls != null) : true
         * (!MemberUtils.isPublic(field)) : true
         * (!forceAccess) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Field result = FieldUtils.getField(Object.class, "A", true);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${cfb858c6-e4a0-361a-8663-560fb637c411}
    @Disabled()
    @Test()
    void getField1WhenNotForceAccessAndClassUtilsGetAllInterfacesClsIsEmpty() throws NoSuchFieldException {
        /* Branches:
         * (acls != null) : true
         * (!MemberUtils.isPublic(field)) : true
         * (!forceAccess) : true
         * (for-each(ClassUtils.getAllInterfaces(cls))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Field result = FieldUtils.getField(Object.class, "", false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${e780aedb-0ea9-39fd-ac1c-96e994bc8a2e}
    @Disabled()
    @Test()
    void getField1WhenNotForceAccessAndClassUtilsGetAllInterfacesClsIsNotEmptyAndMatchIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (acls != null) : true
         * (!MemberUtils.isPublic(field)) : true
         * (!forceAccess) : true
         * (for-each(ClassUtils.getAllInterfaces(cls))) : true
         * (match == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            FieldUtils.getField(Object.class, "A", false);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${b5287e70-10a4-3534-b0f0-dfb8a5ee9690}
    @Disabled()
    @Test()
    void getField1WhenCaughtNoSuchFieldException() throws NoSuchFieldException, SecurityException {
        /* Branches:
         * (acls != null) : true
         * (!MemberUtils.isPublic(field)) : true
         * (!forceAccess) : true
         * (for-each(ClassUtils.getAllInterfaces(cls))) : false
         * (catch-exception (NoSuchFieldException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Field result = FieldUtils.getField(Object.class, "", false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${42837c68-a8d6-3a81-a70c-fc0e38b12466}
    @Disabled()
    @Test()
    void getField1WhenClassUtilsGetAllInterfacesClsIsNotEmptyAndMatchIsNull2ThrowsIllegalArgumentException() throws NoSuchFieldException, SecurityException {
        /* Branches:
         * (acls != null) : true
         * (!MemberUtils.isPublic(field)) : true
         * (!forceAccess) : true
         * (catch-exception (NoSuchFieldException)) : true
         * (for-each(ClassUtils.getAllInterfaces(cls))) : true
         * (match == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            FieldUtils.getField(Object.class, "A", false);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${12a1461c-8d44-35b1-89c2-189351cc6abe}
    @Test()
    void getDeclaredFieldTest() throws NoSuchFieldException {
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            fieldUtils.when(() -> FieldUtils.getDeclaredField(Object.class, "fieldName1", false)).thenReturn(null);
            //Act Statement(s)
            Field result = FieldUtils.getDeclaredField(Object.class, "fieldName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                fieldUtils.verify(() -> FieldUtils.getDeclaredField(Object.class, "fieldName1", false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${1854b603-18ce-35bd-978c-0b64db2b6d0a}
    @Test()
    void getDeclaredField1WhenNotForceAccess() throws NoSuchFieldException {
        /* Branches:
         * (!MemberUtils.isAccessible(field)) : true
         * (!forceAccess) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Field result = FieldUtils.getDeclaredField(Object.class, "A", false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${411a0a7c-a398-3c40-b8f6-088597fb5160}
    @Test()
    void getDeclaredField1WhenForceAccess() throws NoSuchFieldException {
        /* Branches:
         * (!MemberUtils.isAccessible(field)) : true
         * (!forceAccess) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Field result = FieldUtils.getDeclaredField(Object.class, "A", true);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${26b5b2e1-c2dc-3021-a764-e9e30a653a7f}
    @Test()
    void getDeclaredField1WhenNotForceAccessAndCaughtNoSuchFieldException() throws NoSuchFieldException, SecurityException {
        /* Branches:
         * (!MemberUtils.isAccessible(field)) : true
         * (!forceAccess) : true
         * (catch-exception (NoSuchFieldException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Field result = FieldUtils.getDeclaredField(Object.class, "A", false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${e3a559ad-8899-3243-b43f-7f2256e10e56}
    @Test()
    void getAllFieldsTest() {
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            List<Field> fieldList = new ArrayList<>();
            fieldUtils.when(() -> FieldUtils.getAllFieldsList(Object.class)).thenReturn(fieldList);
            //Act Statement(s)
            Field[] result = FieldUtils.getAllFields(Object.class);
            Field[] fieldResultArray = new Field[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(fieldResultArray));
                fieldUtils.verify(() -> FieldUtils.getAllFieldsList(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${d4cbf333-6862-3823-a423-9481408253b2}
    @Test()
    void getAllFieldsListWhenCurrentClassIsNotNull() {
        /* Branches:
         * (currentClass != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        List<Field> result = FieldUtils.getAllFieldsList(Object.class);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${f4f5748c-e064-32a0-a412-1f30db8bdfef}
    @Test()
    void getFieldsWithAnnotationTest() {
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            List<Field> fieldList = new ArrayList<>();
            fieldUtils.when(() -> FieldUtils.getFieldsListWithAnnotation(Object.class, Annotation.class)).thenReturn(fieldList);
            //Act Statement(s)
            Field[] result = FieldUtils.getFieldsWithAnnotation(Object.class, Annotation.class);
            Field[] fieldResultArray = new Field[]{};
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(fieldResultArray));
                fieldUtils.verify(() -> FieldUtils.getFieldsListWithAnnotation(Object.class, Annotation.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0326000e-68e9-3748-97ed-9d6f978f91ed}
    @Disabled()
    @Test()
    void getFieldsListWithAnnotationWhenFieldGetAnnotationAnnotationClsIsNotNull() {
        /* Branches:
         * (field.getAnnotation(annotationCls) != null) : true  #  inside lambda$getFieldsListWithAnnotation$0 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            List<Field> fieldList = new ArrayList<>();
            fieldList.add((Field) null);
            fieldUtils.when(() -> FieldUtils.getAllFieldsList(Object.class)).thenReturn(fieldList);
            //Act Statement(s)
            List<Field> result = FieldUtils.getFieldsListWithAnnotation(Object.class, Annotation.class);
            List<Field> fieldResultList = new ArrayList<>(Arrays.asList((Field) null));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(fieldResultList.size()));
                assertThat(result, containsInRelativeOrder(fieldResultList.toArray()));
                fieldUtils.verify(() -> FieldUtils.getAllFieldsList(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4ca3e5c7-2f4e-3416-906e-b056adfa240d}
    @Disabled()
    @Test()
    void getFieldsListWithAnnotationWhenFieldGetAnnotationAnnotationClsIsNull() {
        /* Branches:
         * (field.getAnnotation(annotationCls) != null) : false  #  inside lambda$getFieldsListWithAnnotation$0 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            List<Field> fieldList = new ArrayList<>();
            fieldList.add((Field) null);
            fieldUtils.when(() -> FieldUtils.getAllFieldsList(Object.class)).thenReturn(fieldList);
            //Act Statement(s)
            List<Field> result = FieldUtils.getFieldsListWithAnnotation(Object.class, Annotation.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                fieldUtils.verify(() -> FieldUtils.getAllFieldsList(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${5399ef36-06d0-3a41-be5a-130b58317236}
    @Test()
    void readStaticFieldTest() throws IllegalAccessException {
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            fieldUtils.when(() -> FieldUtils.readStaticField((Field) null, false)).thenReturn(object);
            //TODO: Needs initialization with real value
            Field field = null;
            //Act Statement(s)
            Object result = FieldUtils.readStaticField(field);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                fieldUtils.verify(() -> FieldUtils.readStaticField((Field) null, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${dd0e59f4-1a40-3e81-bfa2-f3b61b05b33b}
    @Test()
    void readStaticField1Test() throws IllegalAccessException {
        //Arrange Statement(s)
        Field field = null;
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            FieldUtils.readStaticField(field, false);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${81bf2b1b-c058-36ef-bbfd-f03a3fa8a159}
    @Test()
    void readStaticField2Test() throws IllegalAccessException, NoSuchFieldException {
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            fieldUtils.when(() -> FieldUtils.readStaticField(Object.class, "fieldName1", false)).thenReturn(object);
            //Act Statement(s)
            Object result = FieldUtils.readStaticField(Object.class, "fieldName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                fieldUtils.verify(() -> FieldUtils.readStaticField(Object.class, "fieldName1", false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9a073cc3-8b7b-3f17-9951-c290f42cc888}
    @Disabled()
    @Test()
    void readStaticField3Test() throws IllegalAccessException, NoSuchFieldException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            fieldUtils.when(() -> FieldUtils.getField(Object.class, "fieldName1", false)).thenReturn(null);
            Object object = new Object();
            fieldUtils.when(() -> FieldUtils.readStaticField((Field) null, false)).thenReturn(object);
            //Act Statement(s)
            Object result = FieldUtils.readStaticField(Object.class, "fieldName1", false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                fieldUtils.verify(() -> FieldUtils.getField(Object.class, "fieldName1", false), atLeast(1));
                fieldUtils.verify(() -> FieldUtils.readStaticField((Field) null, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${49e23579-6a8d-3281-89e9-8e36944b28a2}
    @Test()
    void readDeclaredStaticFieldTest() throws IllegalAccessException, NoSuchFieldException {
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            fieldUtils.when(() -> FieldUtils.readDeclaredStaticField(Object.class, "fieldName1", false)).thenReturn(object);
            //Act Statement(s)
            Object result = FieldUtils.readDeclaredStaticField(Object.class, "fieldName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                fieldUtils.verify(() -> FieldUtils.readDeclaredStaticField(Object.class, "fieldName1", false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${4498446d-06bf-3c11-b670-97353763a980}
    @Disabled()
    @Test()
    void readDeclaredStaticField1Test() throws IllegalAccessException, NoSuchFieldException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            fieldUtils.when(() -> FieldUtils.getDeclaredField(Object.class, "fieldName1", false)).thenReturn(null);
            Object object = new Object();
            fieldUtils.when(() -> FieldUtils.readStaticField((Field) null, false)).thenReturn(object);
            //Act Statement(s)
            Object result = FieldUtils.readDeclaredStaticField(Object.class, "fieldName1", false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                fieldUtils.verify(() -> FieldUtils.getDeclaredField(Object.class, "fieldName1", false), atLeast(1));
                fieldUtils.verify(() -> FieldUtils.readStaticField((Field) null, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ab31723b-8958-3604-b66a-70a7a702e538}
    @Test()
    void readFieldTest() throws IllegalAccessException {
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            fieldUtils.when(() -> FieldUtils.readField((Field) null, object2, false)).thenReturn(object);
            //TODO: Needs initialization with real value
            Field field = null;
            //Act Statement(s)
            Object result = FieldUtils.readField(field, object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                fieldUtils.verify(() -> FieldUtils.readField((Field) null, object2, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6e29171d-7679-38d0-9463-4e973eb3662a}
    @Disabled()
    @Test()
    void readField1WhenNotForceAccess() throws IllegalAccessException {
        /* Branches:
         * (forceAccess) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Field field = null;
        Object object = new Object();
        //Act Statement(s)
        Object result = FieldUtils.readField(field, object, false);
        Object object2 = new Object();
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object2)));
    }

    //Sapient generated method id: ${01c610e2-1bac-3f0c-bc24-547464c0cbff}
    @Disabled()
    @Test()
    void readField1WhenFieldNotIsAccessible() throws IllegalAccessException {
        /* Branches:
         * (forceAccess) : true
         * (!field.isAccessible()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Field field = null;
        Object object = new Object();
        //Act Statement(s)
        Object result = FieldUtils.readField(field, object, true);
        Object object2 = new Object();
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object2)));
    }

    //Sapient generated method id: ${a7dfb79e-4ae6-3b30-9d09-0f301e63b9be}
    @Test()
    void readField2Test() throws IllegalAccessException, NoSuchFieldException {
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            fieldUtils.when(() -> FieldUtils.readField(object2, "fieldName1", false)).thenReturn(object);
            //Act Statement(s)
            Object result = FieldUtils.readField(object2, "fieldName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                fieldUtils.verify(() -> FieldUtils.readField(object2, "fieldName1", false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a1d6f56b-3002-3508-9f9c-a5efc32ed185}
    @Test()
    void readField3WhenFieldIsNotNullThrowsIllegalArgumentException() throws IllegalAccessException {
        /* Branches:
         * (field != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            fieldUtils.when(() -> FieldUtils.getField(Object.class, "fieldName1", false)).thenReturn(null);
            Object object = new Object();
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                FieldUtils.readField(object, "fieldName1", false);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                fieldUtils.verify(() -> FieldUtils.getField(Object.class, "fieldName1", false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${33e9e4a5-e352-391b-9464-efe7daa86a70}
    @Test()
    void readField3WhenFieldIsNullThrowsIllegalArgumentException() throws IllegalAccessException {
        /* Branches:
         * (field != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            fieldUtils.when(() -> FieldUtils.getField(Object.class, "fieldName1", false)).thenReturn(null);
            Object object = new Object();
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                FieldUtils.readField(object, "fieldName1", false);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                fieldUtils.verify(() -> FieldUtils.getField(Object.class, "fieldName1", false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${792eaaee-8337-39a1-b04f-4afab59b2649}
    @Test()
    void readDeclaredFieldTest() throws IllegalAccessException, NoSuchFieldException {
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            fieldUtils.when(() -> FieldUtils.readDeclaredField(object2, "fieldName1", false)).thenReturn(object);
            //Act Statement(s)
            Object result = FieldUtils.readDeclaredField(object2, "fieldName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                fieldUtils.verify(() -> FieldUtils.readDeclaredField(object2, "fieldName1", false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${6dc92b6c-b51d-3c42-be47-4cd0610c40a9}
    @Test()
    void readDeclaredField1WhenFieldIsNotNullThrowsIllegalArgumentException() throws IllegalAccessException {
        /* Branches:
         * (field != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            fieldUtils.when(() -> FieldUtils.getDeclaredField(Object.class, "fieldName1", false)).thenReturn(null);
            Object object = new Object();
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                FieldUtils.readDeclaredField(object, "fieldName1", false);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                fieldUtils.verify(() -> FieldUtils.getDeclaredField(Object.class, "fieldName1", false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${085c2aeb-fbcd-345b-b865-b8c4beb7175c}
    @Test()
    void readDeclaredField1WhenFieldIsNullThrowsIllegalArgumentException() throws IllegalAccessException {
        /* Branches:
         * (field != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            fieldUtils.when(() -> FieldUtils.getDeclaredField(Object.class, "fieldName1", false)).thenReturn(null);
            Object object = new Object();
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                FieldUtils.readDeclaredField(object, "fieldName1", false);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                fieldUtils.verify(() -> FieldUtils.getDeclaredField(Object.class, "fieldName1", false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${a638390c-7866-35ac-b2d3-c7c9febc0548}
    @Test()
    void writeStaticFieldTest() throws IllegalAccessException {
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            fieldUtils.when(() -> FieldUtils.writeStaticField((Field) null, object, false)).thenAnswer((Answer<Void>) invocation -> null);
            //TODO: Needs initialization with real value
            Field field = null;
            //Act Statement(s)
            FieldUtils.writeStaticField(field, object);
            //Assert statement(s)
            assertAll("result", () -> fieldUtils.verify(() -> FieldUtils.writeStaticField((Field) null, object, false), atLeast(1)));
        }
    }

    //Sapient generated method id: ${4b83a4fd-3d2d-3f7a-96f0-1e442d173b12}
    @Test()
    void writeStaticField1Test() throws IllegalAccessException {
        //Arrange Statement(s)
        Field field = null;
        Object object = new Object();
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            FieldUtils.writeStaticField(field, object, false);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${61f247c8-b4fa-3219-82af-33a0de1a1b4a}
    @Test()
    void writeStaticField2Test() throws IllegalAccessException, NoSuchFieldException {
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            fieldUtils.when(() -> FieldUtils.writeStaticField(Object.class, "fieldName1", object, false)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            FieldUtils.writeStaticField(Object.class, "fieldName1", object);
            //Assert statement(s)
            assertAll("result", () -> fieldUtils.verify(() -> FieldUtils.writeStaticField(Object.class, "fieldName1", object, false), atLeast(1)));
        }
    }

    //Sapient generated method id: ${d174bc0e-7afc-3b9c-85bc-6ac6f11aaa28}
    @Disabled()
    @Test()
    void writeStaticField3Test() throws IllegalAccessException, NoSuchFieldException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            fieldUtils.when(() -> FieldUtils.getField(Object.class, "fieldName1", false)).thenReturn(null);
            Object object = new Object();
            fieldUtils.when(() -> FieldUtils.writeStaticField((Field) null, object, false)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            FieldUtils.writeStaticField(Object.class, "fieldName1", object, false);
            //Assert statement(s)
            assertAll("result", () -> {
                fieldUtils.verify(() -> FieldUtils.getField(Object.class, "fieldName1", false), atLeast(1));
                fieldUtils.verify(() -> FieldUtils.writeStaticField((Field) null, object, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${620341ce-4bd9-3f95-8d2d-7fa94c0c3c8b}
    @Test()
    void writeDeclaredStaticFieldTest() throws IllegalAccessException, NoSuchFieldException {
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            fieldUtils.when(() -> FieldUtils.writeDeclaredStaticField(Object.class, "fieldName1", object, false)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            FieldUtils.writeDeclaredStaticField(Object.class, "fieldName1", object);
            //Assert statement(s)
            assertAll("result", () -> fieldUtils.verify(() -> FieldUtils.writeDeclaredStaticField(Object.class, "fieldName1", object, false), atLeast(1)));
        }
    }

    //Sapient generated method id: ${f70f0322-1d22-3794-a79b-89bffce9c3e9}
    @Disabled()
    @Test()
    void writeDeclaredStaticField1Test() throws IllegalAccessException, NoSuchFieldException {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            fieldUtils.when(() -> FieldUtils.getDeclaredField(Object.class, "fieldName1", false)).thenReturn(null);
            Object object = new Object();
            fieldUtils.when(() -> FieldUtils.writeField((Field) null, (Object) null, object, false)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            FieldUtils.writeDeclaredStaticField(Object.class, "fieldName1", object, false);
            //Assert statement(s)
            assertAll("result", () -> {
                fieldUtils.verify(() -> FieldUtils.getDeclaredField(Object.class, "fieldName1", false), atLeast(1));
                fieldUtils.verify(() -> FieldUtils.writeField((Field) null, (Object) null, object, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${9a906a04-cfad-3d85-8c13-884a711590fe}
    @Test()
    void writeFieldTest() throws IllegalAccessException {
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            fieldUtils.when(() -> FieldUtils.writeField((Field) null, object, object2, false)).thenAnswer((Answer<Void>) invocation -> null);
            //TODO: Needs initialization with real value
            Field field = null;
            //Act Statement(s)
            FieldUtils.writeField(field, object, object2);
            //Assert statement(s)
            assertAll("result", () -> fieldUtils.verify(() -> FieldUtils.writeField((Field) null, object, object2, false), atLeast(1)));
        }
    }

    //Sapient generated method id: ${05b569b6-8832-36ce-a224-d5a6f02b2624}
    @Disabled()
    @Test()
    void writeField1WhenNotForceAccess() throws IllegalAccessException {
        /* Branches:
         * (forceAccess) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Field field = null;
        Object object = new Object();
        Object object2 = new Object();
        //Act Statement(s)
        FieldUtils.writeField(field, object, object2, false);
    }

    //Sapient generated method id: ${869dfaeb-b700-3e86-b11e-96557c6c04fe}
    @Disabled()
    @Test()
    void writeField1WhenFieldNotIsAccessible() throws IllegalAccessException {
        /* Branches:
         * (forceAccess) : true
         * (!field.isAccessible()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Field field = null;
        Object object = new Object();
        Object object2 = new Object();
        //Act Statement(s)
        FieldUtils.writeField(field, object, object2, true);
    }

    //Sapient generated method id: ${54800e25-0320-3b0f-af48-bb237629feff}
    @Test()
    void removeFinalModifierTest() throws IllegalAccessException, NoSuchFieldException {
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            fieldUtils.when(() -> FieldUtils.removeFinalModifier((Field) null, true)).thenAnswer((Answer<Void>) invocation -> null);
            //TODO: Needs initialization with real value
            Field field = null;
            //Act Statement(s)
            FieldUtils.removeFinalModifier(field);
            //Assert statement(s)
            assertAll("result", () -> fieldUtils.verify(() -> FieldUtils.removeFinalModifier((Field) null, true), atLeast(1)));
        }
    }

    //Sapient generated method id: ${9adcfa5c-d6a2-35ac-9382-5f51c577a393}
    @Disabled()
    @Test()
    void removeFinalModifier1WhenDoForceAccess() throws IllegalAccessException, NoSuchFieldException {
        /* Branches:
         * (Modifier.isFinal(field.getModifiers())) : true
         * (forceAccess) : true
         * (!modifiersField.isAccessible()) : true
         * (doForceAccess) : true
         * (doForceAccess) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Field field = null;
        //Act Statement(s)
        FieldUtils.removeFinalModifier(field, true);
    }

    //Sapient generated method id: ${a788d976-d996-357f-b8d6-4042c7a7c30e}
    @Disabled()
    @Test()
    void removeFinalModifier1WhenCaughtNoSuchFieldExceptionOrIllegalAccessExceptionAndSystemUThrowsUnsupportedOperationException() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        /* Branches:
         * (Modifier.isFinal(field.getModifiers())) : true
         * (forceAccess) : true
         * (!modifiersField.isAccessible()) : true
         * (doForceAccess) : true
         * (doForceAccess) : true
         * (catch-exception (NoSuchFieldException | IllegalAccessException)) : true
         * (SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_12)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Needs initialization with real value
        Field field = null;
        ReflectiveOperationException reflectiveOperationException = new ReflectiveOperationException();
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("In java 12+ final cannot be removed.", reflectiveOperationException);
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            FieldUtils.removeFinalModifier(field, true);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(unsupportedOperationException.getMessage()));
            assertThat(result.getCause(), isA(reflectiveOperationException.getClass()));
        });
    }

    //Sapient generated method id: ${76e461b9-89f0-3cc1-aca5-c7ffe223cc6f}
    @Test()
    void writeField2Test() throws IllegalAccessException, NoSuchFieldException {
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            fieldUtils.when(() -> FieldUtils.writeField(object, "fieldName1", object2, false)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            FieldUtils.writeField(object, "fieldName1", object2);
            //Assert statement(s)
            assertAll("result", () -> fieldUtils.verify(() -> FieldUtils.writeField(object, "fieldName1", object2, false), atLeast(1)));
        }
    }

    //Sapient generated method id: ${be858759-110d-3241-b58d-a0941ef2bd82}
    @Test()
    void writeField3WhenFieldIsNotNullThrowsIllegalArgumentException() throws IllegalAccessException {
        /* Branches:
         * (field != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            fieldUtils.when(() -> FieldUtils.getField(Object.class, "fieldName1", false)).thenReturn(null);
            Object object = new Object();
            Object object2 = new Object();
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                FieldUtils.writeField(object, "fieldName1", object2, false);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                fieldUtils.verify(() -> FieldUtils.getField(Object.class, "fieldName1", false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${71be404f-6ab2-3acb-ab9c-4efc916d38c1}
    @Test()
    void writeField3WhenFieldIsNullThrowsIllegalArgumentException() throws IllegalAccessException {
        /* Branches:
         * (field != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            fieldUtils.when(() -> FieldUtils.getField(Object.class, "fieldName1", false)).thenReturn(null);
            Object object = new Object();
            Object object2 = new Object();
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                FieldUtils.writeField(object, "fieldName1", object2, false);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                fieldUtils.verify(() -> FieldUtils.getField(Object.class, "fieldName1", false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${0d588656-8654-3008-b14e-207dcaffeaee}
    @Test()
    void writeDeclaredFieldTest() throws IllegalAccessException, NoSuchFieldException {
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            Object object2 = new Object();
            fieldUtils.when(() -> FieldUtils.writeDeclaredField(object, "fieldName1", object2, false)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            FieldUtils.writeDeclaredField(object, "fieldName1", object2);
            //Assert statement(s)
            assertAll("result", () -> fieldUtils.verify(() -> FieldUtils.writeDeclaredField(object, "fieldName1", object2, false), atLeast(1)));
        }
    }

    //Sapient generated method id: ${7e6d64fb-21f4-3cf6-9b1e-8cfc6c72dbdb}
    @Test()
    void writeDeclaredField1WhenFieldIsNotNullThrowsIllegalArgumentException() throws IllegalAccessException {
        /* Branches:
         * (field != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            fieldUtils.when(() -> FieldUtils.getDeclaredField(Object.class, "fieldName1", false)).thenReturn(null);
            Object object = new Object();
            Object object2 = new Object();
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                FieldUtils.writeDeclaredField(object, "fieldName1", object2, false);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                fieldUtils.verify(() -> FieldUtils.getDeclaredField(Object.class, "fieldName1", false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${8ba5c7e3-7787-32d9-bbf7-2bc5ad1f25cc}
    @Test()
    void writeDeclaredField1WhenFieldIsNullThrowsIllegalArgumentException() throws IllegalAccessException {
        /* Branches:
         * (field != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<FieldUtils> fieldUtils = mockStatic(FieldUtils.class, CALLS_REAL_METHODS)) {
            fieldUtils.when(() -> FieldUtils.getDeclaredField(Object.class, "fieldName1", false)).thenReturn(null);
            Object object = new Object();
            Object object2 = new Object();
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                FieldUtils.writeDeclaredField(object, "fieldName1", object2, false);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                fieldUtils.verify(() -> FieldUtils.getDeclaredField(Object.class, "fieldName1", false), atLeast(1));
            });
        }
    }
}
