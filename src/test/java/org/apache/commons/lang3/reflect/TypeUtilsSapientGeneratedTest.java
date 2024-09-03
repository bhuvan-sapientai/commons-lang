package org.apache.commons.lang3.reflect;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.HashMap;
import org.mockito.MockedStatic;
import java.lang.reflect.WildcardType;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TypeUtilsSapientGeneratedTest {

    private final GenericArrayType genericArrayTypeMock = mock(GenericArrayType.class);

    private final GenericArrayType genericArrayTypeMock2 = mock(GenericArrayType.class);

    private final ParameterizedType parameterizedTypeMock = mock(ParameterizedType.class);

    private final ParameterizedType parameterizedTypeMock2 = mock(ParameterizedType.class);

    private final Type typeMock = mock(Type.class);

    private final Type typeMock2 = mock(Type.class);

    private final TypeUtils.WildcardTypeBuilder typeUtilsWildcardTypeBuilderMock = mock(TypeUtils.WildcardTypeBuilder.class);

    private final TypeVariable typeVariableMock = mock(TypeVariable.class);

    private final TypeVariable typeVariableMock2 = mock(TypeVariable.class);

    private final WildcardType wildcardTypeMock = mock(WildcardType.class);

    //Sapient generated method id: ${containsTypeVariablesWhenTypeInstanceOfTypeVariable_}, hash: 1E2D57D43A8BCE30DD517CFED0AB7112
    @Test()
    void containsTypeVariablesWhenTypeInstanceOfTypeVariable_() {
        /* Branches:
         * (type instanceof TypeVariable<?>) : true
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.containsTypeVariables(typeVariableMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${containsTypeVariablesWhenTypeGetTypeParametersLengthGreaterThan0}, hash: F8BC24AAB426E6D50F6B962D3A2B5FB5
    @Test()
    void containsTypeVariablesWhenTypeGetTypeParametersLengthGreaterThan0() {
        /* Branches:
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof Class<?>) : true
         * (((Class<?>) type).getTypeParameters().length > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.containsTypeVariables(Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${containsTypeVariablesWhenTypeGetTypeParametersLengthNotGreaterThan0}, hash: 6C67339951D6F91969A73200DCD6A976
    @Test()
    void containsTypeVariablesWhenTypeGetTypeParametersLengthNotGreaterThan0() {
        /* Branches:
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof Class<?>) : true
         * (((Class<?>) type).getTypeParameters().length > 0) : false
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.containsTypeVariables(Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${containsTypeVariablesWhenContainsTypeVariablesArg}, hash: 38F948F99047D8EABCD0D1CD0460009B
    @Test()
    void containsTypeVariablesWhenContainsTypeVariablesArg() {
        /* Branches:
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : true
         * (for-each(((ParameterizedType) type).getActualTypeArguments())) : true
         * (containsTypeVariables(arg)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.containsTypeVariables(parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${containsTypeVariablesWhenContainsTypeVariablesNotArg}, hash: 56771622AAC801EEF0DEA062E8B74038
    @Test()
    void containsTypeVariablesWhenContainsTypeVariablesNotArg() {
        /* Branches:
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : true
         * (for-each(((ParameterizedType) type).getActualTypeArguments())) : true
         * (containsTypeVariables(arg)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.containsTypeVariables(parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${containsTypeVariablesWhenTypeInstanceOfGenericArrayType}, hash: 2D58C276900E7BE7FC2E873090A9DCB1
    @Test()
    void containsTypeVariablesWhenTypeInstanceOfGenericArrayType() {
        /* Branches:
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof WildcardType) : false
         * (type instanceof GenericArrayType) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.containsTypeVariables(genericArrayTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${containsTypeVariablesWhenTypeNotInstanceOfGenericArrayType}, hash: 8826C1DCAFF21CC9EB53A1C8A24109B8
    @Test()
    void containsTypeVariablesWhenTypeNotInstanceOfGenericArrayType() {
        /* Branches:
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof WildcardType) : false
         * (type instanceof GenericArrayType) : false
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.containsTypeVariables(typeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${containsTypeVariablesWhenContainsTypeVariables0IndexOfGetImplicitUpperBoundsWild}, hash: 5D7F14EA49661ACE36F7A7E850122E07
    @Test()
    void containsTypeVariablesWhenContainsTypeVariables0IndexOfGetImplicitUpperBoundsWild() {
        /* Branches:
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof WildcardType) : true
         * (containsTypeVariables(getImplicitLowerBounds(wild)[0])) : false
         * (containsTypeVariables(getImplicitUpperBounds(wild)[0])) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { typeMock };
            typeUtils.when(() -> TypeUtils.getImplicitLowerBounds(wildcardTypeMock)).thenReturn(typeArray);
            Type[] typeArray2 = new Type[] { typeMock2 };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray2);
            //Act Statement(s)
            boolean result = TypeUtils.containsTypeVariables(wildcardTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                typeUtils.verify(() -> TypeUtils.getImplicitLowerBounds(wildcardTypeMock), atLeast(1));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${containsTypeVariablesWhenContainsTypeVariablesNot0IndexOfGetImplicitUpperBoundsWild}, hash: 210ABC144249DE9F962B8850EA73C3EC
    @Test()
    void containsTypeVariablesWhenContainsTypeVariablesNot0IndexOfGetImplicitUpperBoundsWild() {
        /* Branches:
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof WildcardType) : true
         * (containsTypeVariables(getImplicitLowerBounds(wild)[0])) : false
         * (containsTypeVariables(getImplicitUpperBounds(wild)[0])) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { typeMock };
            typeUtils.when(() -> TypeUtils.getImplicitLowerBounds(wildcardTypeMock)).thenReturn(typeArray);
            Type[] typeArray2 = new Type[] { typeMock2 };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray2);
            //Act Statement(s)
            boolean result = TypeUtils.containsTypeVariables(wildcardTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                typeUtils.verify(() -> TypeUtils.getImplicitLowerBounds(wildcardTypeMock), atLeast(1));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenRawTypeNotInstanceOfClass_ThrowsIllegalStateException}, hash: 6F1FEB9894DE8D38258602DA2C1DECFC
    @Test()
    void determineTypeArgumentsWhenRawTypeNotInstanceOfClass_ThrowsIllegalStateException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : true  #  inside getRawType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenIsAssignableNotClsSuperClass}, hash: F4AC5C5C1E4ADC5058659C2DFF05D0A8
    @Test()
    void determineTypeArgumentsWhenIsAssignableNotClsSuperClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenToClassNotIsPrimitiveAndIsAssignableClsSuperClassThrowsNullPointerException}, hash: 85F2C09D7BA6BBABA9C785BB7F9E7665
    @Test()
    void determineTypeArgumentsWhenToClassNotIsPrimitiveAndIsAssignableClsSuperClassThrowsNullPointerException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Class<?> _class = null;
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            TypeUtils.determineTypeArguments(_class, parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenToClassIsPrimitiveAndIsAssignableNotClsSuperClass}, hash: B2FAB8B897120F7C074EC9AF4A0EE9E7
    @Test()
    void determineTypeArgumentsWhenToClassIsPrimitiveAndIsAssignableNotClsSuperClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Class<?> _class = null;
        
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(_class, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenClsEqualsSuperClassThrowsIllegalStateException}, hash: F8C3B71E914DCB2375BB317173D10ACD
    @Test()
    void determineTypeArgumentsWhenClsEqualsSuperClassThrowsIllegalStateException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type2");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenIsAssignableNotClsToClass}, hash: 56141EECCBD1D3EA036C910DBD5965AF
    @Test()
    void determineTypeArgumentsWhenIsAssignableNotClsToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenOwnerTypeInstanceOfParameterizedTypeThrowsIllegalStateException}, hash: A02276BC528028BF5D395D00F2D9B460
    @Test()
    void determineTypeArgumentsWhenOwnerTypeInstanceOfParameterizedTypeThrowsIllegalStateException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type4");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenOwnerTypeInstanceOfParameterizedTypeThrowsNullPointerException}, hash: AD404A85D6AB877FCC03ADF5ABB1966C
    @Test()
    void determineTypeArgumentsWhenOwnerTypeInstanceOfParameterizedTypeThrowsNullPointerException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenToClassEqualsCls}, hash: 7087AC3862ADAAC9490EBF1DA2E44CE7
    @Test()
    void determineTypeArgumentsWhenToClassEqualsCls() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
        anyMap.put(typeVariableMock, typeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(anyMap)));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenMidTypeInstanceOfParameterizedTypeThrowsIllegalStateException}, hash: 8F81CB2963BC73AD4658493F0ABDDAD8
    @Test()
    void determineTypeArgumentsWhenMidTypeInstanceOfParameterizedTypeThrowsIllegalStateException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type5");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenTypeInstanceOfClass_AndIsAssignableNotClsToClass}, hash: 8CED62A0F93F8812DA29F48956ABB398
    @Test()
    void determineTypeArgumentsWhenTypeInstanceOfClass_AndIsAssignableNotClsToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenGenericInterfaceIsNullAndTypeInstanceOfClass_AndIsAssignableNotClsToClass}, hash: 24414BD10B5EADEBE3992016200412C6
    @Test()
    void determineTypeArgumentsWhenGenericInterfaceIsNullAndTypeInstanceOfClass_AndIsAssignableNotClsToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenIsAssignableClsToClassThrowsNullPointerException}, hash: 127B76526A20A079E41F46646D143B09
    @Test()
    void determineTypeArgumentsWhenIsAssignableClsToClassThrowsNullPointerException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenTypeNotInstanceOfClass_AndTypeInstanceOfParameterizedType}, hash: 0D021E4C040AE5EC258F3792301CB44B
    @Test()
    void determineTypeArgumentsWhenTypeNotInstanceOfClass_AndTypeInstanceOfParameterizedType() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenToClassIsPrimitive}, hash: 3DAE59E71E45E4B12D4F9EAE431EFC84
    @Test()
    void determineTypeArgumentsWhenToClassIsPrimitive() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenToClassIsArray}, hash: 130EA1A1E7365EA4401967ECFC8AE29D
    @Test()
    void determineTypeArgumentsWhenToClassIsArray() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : true  #  inside getTypeArguments method
         * (toClass.isArray()) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenSubtypeVarAssignsIsNotNullAndToClassNotEqualsCls}, hash: CEC60E051FACEFD3938E9C47F06B6748
    @Test()
    void determineTypeArgumentsWhenSubtypeVarAssignsIsNotNullAndToClassNotEqualsCls() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenToClassNotIsPrimitiveAndSubtypeVarAssignsIsNotNullAndToClassEqualsCls}, hash: 3B529F9DF1E46E792680027F1B825975
    @Test()
    void determineTypeArgumentsWhenToClassNotIsPrimitiveAndSubtypeVarAssignsIsNotNullAndToClassEqualsCls() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenToClassNotEqualsClsThrowsIllegalStateException}, hash: 2D752B3003EF4FFBABB3C3BDE0F663D4
    @Test()
    void determineTypeArgumentsWhenToClassNotEqualsClsThrowsIllegalStateException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type8");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenIsAssignableClsToClassAndClsIsPrimitiveAndToClassNotIsPrimitiveAndSubtypeVarAssignsIsNotNullA}, hash: 99172BAA5170BA75AD879440D9E55C84
    @Test()
    void determineTypeArgumentsWhenIsAssignableClsToClassAndClsIsPrimitiveAndToClassNotIsPrimitiveAndSubtypeVarAssignsIsNotNullA() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenIsAssignableBoundToClass}, hash: 7BC703F7D6201B21767019FA207D05E1
    @Test()
    void determineTypeArgumentsWhenIsAssignableBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (isAssignable(bound, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { (Type) null };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenGetImplicitUpperBoundsTypeIsNotEmptyAndIsAssignableBoundToClass}, hash: CAC606A788089ECD040398E9EB1BCFB4
    @Test()
    void determineTypeArgumentsWhenGetImplicitUpperBoundsTypeIsNotEmptyAndIsAssignableBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (isAssignable(bound, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { Object.class };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenTypeInstanceOfWildcardTypeAndGetImplicitUpperBoundsTypeIsNotEmptyAndIsAssignableBoundToClass}, hash: B1FD2E9AA6C06ED82585458C98B16F5A
    @Test()
    void determineTypeArgumentsWhenTypeInstanceOfWildcardTypeAndGetImplicitUpperBoundsTypeIsNotEmptyAndIsAssignableBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (isAssignable(bound, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { typeMock };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenIsAssignableNotBoundToClass}, hash: 03F65AA9175BC45A6D9D2A995A855E7A
    @Test()
    void determineTypeArgumentsWhenIsAssignableNotBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (isAssignable(bound, toClass)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { (Type) null };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenGetImplicitUpperBoundsTypeIsNotEmptyAndIsAssignableNotBoundToClass}, hash: D5464B9CDE1A09A2D1A2501C18F5015D
    @Test()
    void determineTypeArgumentsWhenGetImplicitUpperBoundsTypeIsNotEmptyAndIsAssignableNotBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (isAssignable(bound, toClass)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { Object.class };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenTypeInstanceOfParameterizedTypeThrowsIllegalStateException}, hash: 206F2D227FBA442F8CF02D87B2AF5DAA
    @Test()
    void determineTypeArgumentsWhenTypeInstanceOfParameterizedTypeThrowsIllegalStateException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { parameterizedTypeMock };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock2);
            });
            IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type8");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenMidTypeInstanceOfClass_}, hash: 531C07312031EBDCC52AE5A91015167E
    @Test()
    void determineTypeArgumentsWhenMidTypeInstanceOfClass_() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (midType instanceof Class<?>) : true  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenMidTypeNotInstanceOfClass_ThrowsIllegalStateException}, hash: 8C41C5CA686131BC9DFF56CAEC027F32
    @Test()
    void determineTypeArgumentsWhenMidTypeNotInstanceOfClass_ThrowsIllegalStateException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (midType instanceof Class<?>) : false  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Unexpected generic interface type found: type7");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenIsAssignableGenericInterfaceMidClass}, hash: 76B55288C8D4D22CF095999ADAEAB736
    @Test()
    void determineTypeArgumentsWhenIsAssignableGenericInterfaceMidClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenToClassNotEqualsClsAndIsAssignableGenericInterfaceMidClass}, hash: AB8E9BAA73643119610B4E51D9865DFD
    @Test()
    void determineTypeArgumentsWhenToClassNotEqualsClsAndIsAssignableGenericInterfaceMidClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenIsAssignableNotGenericInterfaceMidClass}, hash: 4A44D5C31F545815DAB49C9A020A3EAA
    @Test()
    void determineTypeArgumentsWhenIsAssignableNotGenericInterfaceMidClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (isAssignable(genericInterface, (Type) midClass)) : false  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenTypeInstanceOfParameterizedTypeAndIsAssignableBoundToClass}, hash: ACC962664631C7D66B423201817C3BF6
    @Test()
    void determineTypeArgumentsWhenTypeInstanceOfParameterizedTypeAndIsAssignableBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { parameterizedTypeMock };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenIsAssignableBoundToClassAndIsAssignableBoundToClass}, hash: 93397B7A80018E56AF4E00F21D89F768
    @Test()
    void determineTypeArgumentsWhenIsAssignableBoundToClassAndIsAssignableBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : true  #  inside isAssignable method
         * (for-each(((TypeVariable<?>) type).getBounds())) : true  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : true  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { typeVariableMock };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenIsAssignableNotBoundToClassAndIsAssignableNotBoundToClass}, hash: 10EDDEFE900437B166A3C8265E0E962E
    @Test()
    void determineTypeArgumentsWhenIsAssignableNotBoundToClassAndIsAssignableNotBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : true  #  inside isAssignable method
         * (for-each(((TypeVariable<?>) type).getBounds())) : true  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : false  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { typeVariableMock };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenIsAssignableTypeGetGenericComponentTypeToClassGetComponentTypeAndIsAssignableBoundToClass}, hash: A50004C045121A885F2A5666E83553D5
    @Test()
    void determineTypeArgumentsWhenIsAssignableTypeGetGenericComponentTypeToClassGetComponentTypeAndIsAssignableBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : true  #  inside isAssignable method
         * (toClass.equals(Object.class)) : false  #  inside isAssignable method
         * (toClass.isArray()) : true  #  inside isAssignable method
         * (isAssignable(((GenericArrayType) type).getGenericComponentType(), toClass.getComponentType())) : true  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { genericArrayTypeMock };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${determineTypeArgumentsWhenIsAssignableNotTypeGetGenericComponentTypeToClassGetComponentTypeAndIsAssignableNotBoundToCla}, hash: 930F25C7D1FCE7B0282EE2784E00F225
    @Test()
    void determineTypeArgumentsWhenIsAssignableNotTypeGetGenericComponentTypeToClassGetComponentTypeAndIsAssignableNotBoundToCla() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, superClass)) : false
         * (cls.equals(superClass)) : true
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : true  #  inside isAssignable method
         * (toClass.equals(Object.class)) : false  #  inside isAssignable method
         * (toClass.isArray()) : true  #  inside isAssignable method
         * (isAssignable(((GenericArrayType) type).getGenericComponentType(), toClass.getComponentType())) : false  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { genericArrayTypeMock };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.determineTypeArguments(Object.class, parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equals2WhenObjectsEqualsType1Type2}, hash: 84AAD5CE7C83FC301D110B23138DEDCD
    @Test()
    void equals2WhenObjectsEqualsType1Type2() {
        /* Branches:
         * (Objects.equals(type1, type2)) : true
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.equals(typeMock, typeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${equals2WhenType1InstanceOfWildcardType}, hash: AA974DB6D64E8B3C3FFADF16B15699A1
    @Test()
    void equals2WhenType1InstanceOfWildcardType() {
        /* Branches:
         * (Objects.equals(type1, type2)) : false
         * (type1 instanceof ParameterizedType) : false
         * (type1 instanceof GenericArrayType) : false
         * (type1 instanceof WildcardType) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.equals((Type) wildcardTypeMock, typeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${equals2WhenType1NotInstanceOfWildcardType}, hash: CF157A867956DF229D2DA4B7FF5439EA
    @Test()
    void equals2WhenType1NotInstanceOfWildcardType() {
        /* Branches:
         * (Objects.equals(type1, type2)) : false
         * (type1 instanceof ParameterizedType) : false
         * (type1 instanceof GenericArrayType) : false
         * (type1 instanceof WildcardType) : false
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.equals(typeMock, typeMock2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${equals2WhenEqualsNotParameterizedTypeGetOwnerTypeOtherGetOwnerType}, hash: 17C7016DAAB47C5266BB4CF800C2A7D7
    @Test()
    void equals2WhenEqualsNotParameterizedTypeGetOwnerTypeOtherGetOwnerType() {
        /* Branches:
         * (Objects.equals(type1, type2)) : false
         * (type1 instanceof ParameterizedType) : true
         * (type instanceof ParameterizedType) : true  #  inside equals method
         * (equals(parameterizedType.getRawType(), other.getRawType())) : true  #  inside equals method
         * (equals(parameterizedType.getOwnerType(), other.getOwnerType())) : false  #  inside equals method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.equals((Type) parameterizedTypeMock, (Type) parameterizedTypeMock2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${equals2WhenEqualsGenericArrayTypeGetGenericComponentTypeTypeGetGenericComponentType}, hash: 99F27EEC3B9419D3F29CCC52D0932BF5
    @Test()
    void equals2WhenEqualsGenericArrayTypeGetGenericComponentTypeTypeGetGenericComponentType() {
        /* Branches:
         * (Objects.equals(type1, type2)) : false
         * (type1 instanceof ParameterizedType) : false
         * (type1 instanceof GenericArrayType) : true
         * (type instanceof GenericArrayType) : true  #  inside equals method
         * (equals(genericArrayType.getGenericComponentType(), ((GenericArrayType) type).getGenericComponentType())) : true  #  inside equals method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.equals((Type) genericArrayTypeMock, (Type) genericArrayTypeMock2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${equals2WhenEqualsNotGenericArrayTypeGetGenericComponentTypeTypeGetGenericComponentType}, hash: BB9121480506803986488CDEA53C9072
    @Test()
    void equals2WhenEqualsNotGenericArrayTypeGetGenericComponentTypeTypeGetGenericComponentType() {
        /* Branches:
         * (Objects.equals(type1, type2)) : false
         * (type1 instanceof ParameterizedType) : false
         * (type1 instanceof GenericArrayType) : true
         * (type instanceof GenericArrayType) : true  #  inside equals method
         * (equals(genericArrayType.getGenericComponentType(), ((GenericArrayType) type).getGenericComponentType())) : false  #  inside equals method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.equals((Type) genericArrayTypeMock, (Type) genericArrayTypeMock2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${equals2WhenType1LengthNotEqualsType2Length}, hash: 9F64E24B96335723C088BBB4D4AC8FB8
    @Test()
    void equals2WhenType1LengthNotEqualsType2Length() {
        /* Branches:
         * (Objects.equals(type1, type2)) : false
         * (type1 instanceof ParameterizedType) : true
         * (type instanceof ParameterizedType) : true  #  inside equals method
         * (equals(parameterizedType.getRawType(), other.getRawType())) : true  #  inside equals method
         * (equals(parameterizedType.getOwnerType(), other.getOwnerType())) : true  #  inside equals method
         * (type1.length == type2.length) : false  #  inside equals method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.equals((Type) parameterizedTypeMock, (Type) parameterizedTypeMock2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${equals2WhenEqualsNotIIndexOfType1IIndexOfType2}, hash: C370F51940BE188F914701E6D88FADC8
    @Test()
    void equals2WhenEqualsNotIIndexOfType1IIndexOfType2() {
        /* Branches:
         * (Objects.equals(type1, type2)) : false
         * (type1 instanceof ParameterizedType) : true
         * (type instanceof ParameterizedType) : true  #  inside equals method
         * (equals(parameterizedType.getRawType(), other.getRawType())) : true  #  inside equals method
         * (equals(parameterizedType.getOwnerType(), other.getOwnerType())) : true  #  inside equals method
         * (type1.length == type2.length) : true  #  inside equals method
         * (i < type1.length) : true  #  inside equals method
         * (!equals(type1[i], type2[i])) : true  #  inside equals method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            typeUtils.when(() -> TypeUtils.equals(typeMock, typeMock2)).thenReturn(false);
            //Act Statement(s)
            boolean result = TypeUtils.equals((Type) parameterizedTypeMock, (Type) parameterizedTypeMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                typeUtils.verify(() -> TypeUtils.equals(typeMock, typeMock2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${equals2WhenEqualsIIndexOfType1IIndexOfType2}, hash: 3B9F41D706745575A1AAA5424A8857E4
    @Test()
    void equals2WhenEqualsIIndexOfType1IIndexOfType2() {
        /* Branches:
         * (Objects.equals(type1, type2)) : false
         * (type1 instanceof ParameterizedType) : true
         * (type instanceof ParameterizedType) : true  #  inside equals method
         * (equals(parameterizedType.getRawType(), other.getRawType())) : true  #  inside equals method
         * (equals(parameterizedType.getOwnerType(), other.getOwnerType())) : true  #  inside equals method
         * (type1.length == type2.length) : true  #  inside equals method
         * (i < type1.length) : true  #  inside equals method
         * (!equals(type1[i], type2[i])) : false  #  inside equals method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            typeUtils.when(() -> TypeUtils.equals(typeMock, typeMock2)).thenReturn(true);
            //Act Statement(s)
            boolean result = TypeUtils.equals((Type) parameterizedTypeMock, (Type) parameterizedTypeMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                typeUtils.verify(() -> TypeUtils.equals(typeMock, typeMock2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${genericArrayTypeTest}, hash: 27BAF297687432ECA96A2783192F2FB6
    @Test()
    void genericArrayTypeTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        GenericArrayType result = TypeUtils.genericArrayType(typeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getArrayComponentTypeWhenClsIsArray}, hash: EAA06A7A70DF636CE412BC8CE276AD20
    @Test()
    void getArrayComponentTypeWhenClsIsArray() {
        /* Branches:
         * (type instanceof Class<?>) : true
         * (cls.isArray()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Type result = TypeUtils.getArrayComponentType(Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Object.class)));
    }

    //Sapient generated method id: ${getArrayComponentTypeWhenClsNotIsArray}, hash: 4CF1BCD6E11BFB198014A5FA915D3301
    @Test()
    void getArrayComponentTypeWhenClsNotIsArray() {
        /* Branches:
         * (type instanceof Class<?>) : true
         * (cls.isArray()) : false
         */
         
        //Act Statement(s)
        Type result = TypeUtils.getArrayComponentType(Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getArrayComponentTypeWhenTypeInstanceOfGenericArrayType}, hash: 1350FB8490408D448949E5F318C1CCBF
    @Test()
    void getArrayComponentTypeWhenTypeInstanceOfGenericArrayType() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof GenericArrayType) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Type result = TypeUtils.getArrayComponentType(genericArrayTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getArrayComponentTypeWhenTypeNotInstanceOfGenericArrayType}, hash: 16FE9FF11F7C0821E8F123EE51B1856D
    @Test()
    void getArrayComponentTypeWhenTypeNotInstanceOfGenericArrayType() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof GenericArrayType) : false
         */
         
        //Act Statement(s)
        Type result = TypeUtils.getArrayComponentType(typeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getImplicitBoundsWhenBoundsLengthEquals0}, hash: 49864DDE6819C77CCD82FC2DC072C0E9
    @Test()
    void getImplicitBoundsWhenBoundsLengthEquals0() {
        /* Branches:
         * (bounds.length == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Type[] result = TypeUtils.getImplicitBounds(typeVariableMock);
        Type[] typeResultArray = new Type[] { Object.class };
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(typeResultArray)));
    }

    //Sapient generated method id: ${getImplicitBoundsWhenBoundsLengthNotEquals0}, hash: 7B393D06F1A2454E35843799BF47C614
    @Test()
    void getImplicitBoundsWhenBoundsLengthNotEquals0() {
        /* Branches:
         * (bounds.length == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            Type[] typeArray2 = new Type[] { typeMock };
            typeUtils.when(() -> TypeUtils.normalizeUpperBounds(typeArray2)).thenReturn(typeArray);
            //Act Statement(s)
            Type[] result = TypeUtils.getImplicitBounds(typeVariableMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(typeArray));
                typeUtils.verify(() -> TypeUtils.normalizeUpperBounds(typeArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getImplicitLowerBoundsWhenBoundsLengthEquals0}, hash: 1507984EEB4B50C88893B187F8535E60
    @Test()
    void getImplicitLowerBoundsWhenBoundsLengthEquals0() {
        /* Branches:
         * (bounds.length == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Type[] result = TypeUtils.getImplicitLowerBounds(wildcardTypeMock);
        Type[] typeResultArray = new Type[] { (Type) null };
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(typeResultArray)));
    }

    //Sapient generated method id: ${getImplicitLowerBoundsWhenBoundsLengthNotEquals0}, hash: 3C3BE68A11C17AA3BF1A37551B25BDD8
    @Test()
    void getImplicitLowerBoundsWhenBoundsLengthNotEquals0() {
        /* Branches:
         * (bounds.length == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Type[] result = TypeUtils.getImplicitLowerBounds(wildcardTypeMock);
        Type[] typeResultArray = new Type[] { typeMock };
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(typeResultArray)));
    }

    //Sapient generated method id: ${getImplicitUpperBoundsWhenBoundsLengthEquals0}, hash: 4BDB7871297AB53D1191EB5C7A055123
    @Test()
    void getImplicitUpperBoundsWhenBoundsLengthEquals0() {
        /* Branches:
         * (bounds.length == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Type[] result = TypeUtils.getImplicitUpperBounds(wildcardTypeMock);
        Type[] typeResultArray = new Type[] { Object.class };
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(typeResultArray)));
    }

    //Sapient generated method id: ${getImplicitUpperBoundsWhenBoundsLengthNotEquals0}, hash: 260DE8FD2A4E65B841AB4E2B96B1A00E
    @Test()
    void getImplicitUpperBoundsWhenBoundsLengthNotEquals0() {
        /* Branches:
         * (bounds.length == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            Type[] typeArray2 = new Type[] { typeMock };
            typeUtils.when(() -> TypeUtils.normalizeUpperBounds(typeArray2)).thenReturn(typeArray);
            //Act Statement(s)
            Type[] result = TypeUtils.getImplicitUpperBounds(wildcardTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(typeArray));
                typeUtils.verify(() -> TypeUtils.normalizeUpperBounds(typeArray2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getRawType1WhenTypeInstanceOfClass_}, hash: 276AE75BACB3B388D141DFA02FA09EEE
    @Test()
    void getRawType1WhenTypeInstanceOfClass_() {
        /* Branches:
         * (type instanceof Class<?>) : true
         */
         
        //Act Statement(s)
        Class<?> result = TypeUtils.getRawType(Object.class, typeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Object.class)));
    }

    //Sapient generated method id: ${getRawType1WhenRawTypeNotInstanceOfClass_ThrowsIllegalStateException}, hash: 5B7DA4FFCD9B234C80869CFE2B73EE73
    @Test()
    void getRawType1WhenRawTypeNotInstanceOfClass_ThrowsIllegalStateException() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : true
         * (!(rawType instanceof Class<?>)) : true  #  inside getRawType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type2");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.getRawType(parameterizedTypeMock, typeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getRawType1WhenRawTypeInstanceOfClass_}, hash: 180D6F67E00711C3725D9E016188D7EA
    @Test()
    void getRawType1WhenRawTypeInstanceOfClass_() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : true
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Class<?> result = TypeUtils.getRawType(parameterizedTypeMock, typeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Object.class)));
    }

    //Sapient generated method id: ${getRawType1WhenAssigningTypeIsNull}, hash: 383844AACB3719E9D9198A512AA5901F
    @Test()
    void getRawType1WhenAssigningTypeIsNull() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof TypeVariable<?>) : true
         * (assigningType == null) : true
         */
         //Arrange Statement(s)
        Type type = null;
        
        //Act Statement(s)
        Class<?> result = TypeUtils.getRawType(typeVariableMock, type);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getRawType1WhenGenericDeclarationNotInstanceOfClass_}, hash: A0BE5BF186CF70EF490CC9DBC8FCFA89
    @Test()
    void getRawType1WhenGenericDeclarationNotInstanceOfClass_() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof TypeVariable<?>) : true
         * (assigningType == null) : false
         * (!(genericDeclaration instanceof Class<?>)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Class<?> result = TypeUtils.getRawType(typeVariableMock, typeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getRawType1WhenRawComponentTypeIsNotNull}, hash: FA44D5E88724486CEE78E1848E2B6A17
    @Test()
    void getRawType1WhenRawComponentTypeIsNotNull() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof GenericArrayType) : true
         * (rawComponentType != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Class<?> result = TypeUtils.getRawType(genericArrayTypeMock, typeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Object.class)));
    }

    //Sapient generated method id: ${getRawType1WhenRawComponentTypeIsNull}, hash: 558DD293E3C59944BBEC1FEBA3F6A11E
    @Test()
    void getRawType1WhenRawComponentTypeIsNull() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof GenericArrayType) : true
         * (rawComponentType != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Class<?> result = TypeUtils.getRawType(genericArrayTypeMock, typeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getRawType1WhenTypeInstanceOfWildcardType}, hash: 2E55918EAC60D30EDF815CC096C2401F
    @Test()
    void getRawType1WhenTypeInstanceOfWildcardType() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof GenericArrayType) : false
         * (type instanceof WildcardType) : true
         */
         
        //Act Statement(s)
        Class<?> result = TypeUtils.getRawType(wildcardTypeMock, typeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getRawType1WhenTypeNotInstanceOfWildcardTypeThrowsIllegalArgumentException}, hash: 8970613F7EDE99CA7A2093AC89F87EFA
    @Test()
    void getRawType1WhenTypeNotInstanceOfWildcardTypeThrowsIllegalArgumentException() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof GenericArrayType) : false
         * (type instanceof WildcardType) : false
         */
         //Arrange Statement(s)
        Type typeMock = mock(Type.class, "type");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unknown type: type");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            TypeUtils.getRawType(typeMock, typeMock2);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${getRawType1WhenTypeVarAssignsIsNull}, hash: E48D6061B8243767F74E21BBD97FA76A
    @Test()
    void getRawType1WhenTypeVarAssignsIsNull() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof TypeVariable<?>) : true
         * (assigningType == null) : false
         * (!(genericDeclaration instanceof Class<?>)) : false
         * (typeVarAssigns == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            typeUtils.when(() -> TypeUtils.getTypeArguments(typeMock, Object.class)).thenReturn(null);
            //Act Statement(s)
            Class<?> result = TypeUtils.getRawType(typeVariableMock, typeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                typeUtils.verify(() -> TypeUtils.getTypeArguments(typeMock, Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getRawType1WhenTypeArgumentIsNull}, hash: CAF477BF6C4BF036DAB9F169577A6854
    @Test()
    void getRawType1WhenTypeArgumentIsNull() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof TypeVariable<?>) : true
         * (assigningType == null) : false
         * (!(genericDeclaration instanceof Class<?>)) : false
         * (typeVarAssigns == null) : false
         * (typeArgument == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock, (Type) null);
            typeUtils.when(() -> TypeUtils.getTypeArguments(typeMock, Object.class)).thenReturn(anyMap);
            //Act Statement(s)
            Class<?> result = TypeUtils.getRawType(typeVariableMock, typeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                typeUtils.verify(() -> TypeUtils.getTypeArguments(typeMock, Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getRawType1WhenTypeArgumentIsNotNull}, hash: B6364054DDB83D5D232CA06AE85709A4
    @Test()
    void getRawType1WhenTypeArgumentIsNotNull() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof TypeVariable<?>) : true
         * (assigningType == null) : false
         * (!(genericDeclaration instanceof Class<?>)) : false
         * (typeVarAssigns == null) : false
         * (typeArgument == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock, typeMock);
            typeUtils.when(() -> TypeUtils.getTypeArguments(typeMock2, Object.class)).thenReturn(anyMap);
            //Act Statement(s)
            Class<?> result = TypeUtils.getRawType(typeVariableMock, typeMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Object.class));
                typeUtils.verify(() -> TypeUtils.getTypeArguments(typeMock2, Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getTypeArguments1WhenRawTypeNotInstanceOfClass_ThrowsIllegalStateException}, hash: CF20D19C3FEDF59322CB25BF1A4462D1
    @Test()
    void getTypeArguments1WhenRawTypeNotInstanceOfClass_ThrowsIllegalStateException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : true  #  inside getRawType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type2");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.getTypeArguments(parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getTypeArguments1WhenRawTypeInstanceOfClass_ThrowsIllegalStateException}, hash: 940905205CCB1D59B8FF76D978D939AA
    @Test()
    void getTypeArguments1WhenRawTypeInstanceOfClass_ThrowsIllegalStateException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type3");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.getTypeArguments(parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getTypeArguments1WhenIsAssignableNotClsToClass}, hash: 7C2B6DB005F986A25AD4F6B07104294D
    @Test()
    void getTypeArguments1WhenIsAssignableNotClsToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getTypeArguments1WhenToClassIsPrimitiveAndIsAssignableNotClsToClass}, hash: C50EE4E6BC37D5FBC24D8481CDE157CC
    @Test()
    void getTypeArguments1WhenToClassIsPrimitiveAndIsAssignableNotClsToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getTypeArguments1WhenOwnerTypeInstanceOfParameterizedTypeThrowsIllegalStateException}, hash: 2DF4693493CBE28F2E3BC5D1BDAF94F2
    @Test()
    void getTypeArguments1WhenOwnerTypeInstanceOfParameterizedTypeThrowsIllegalStateException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type5");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.getTypeArguments(parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getTypeArguments1WhenOwnerTypeInstanceOfParameterizedTypeThrowsNullPointerException}, hash: 36B815D850E08C330E11254343619A6A
    @Test()
    void getTypeArguments1WhenOwnerTypeInstanceOfParameterizedTypeThrowsNullPointerException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            TypeUtils.getTypeArguments(parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getTypeArguments1WhenToClassEqualsCls}, hash: CE49CBB9AD6906CC9809A2CEE6621840
    @Test()
    void getTypeArguments1WhenToClassEqualsCls() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
        Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
        anyMap.put(typeVariableMock, typeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(anyMap)));
    }

    //Sapient generated method id: ${getTypeArguments1WhenMidTypeInstanceOfParameterizedTypeThrowsIllegalStateException}, hash: 94C5C0ABC3E2C99ECC87CB1B6374CB44
    @Test()
    void getTypeArguments1WhenMidTypeInstanceOfParameterizedTypeThrowsIllegalStateException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type6");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.getTypeArguments(parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getTypeArguments1WhenTypeInstanceOfClass_AndIsAssignableNotClsToClass}, hash: C30664BF8285A2D05B5CEFF9178F7C19
    @Test()
    void getTypeArguments1WhenTypeInstanceOfClass_AndIsAssignableNotClsToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getTypeArguments1WhenGenericInterfaceIsNullAndTypeInstanceOfClass_AndIsAssignableNotClsToClass}, hash: DC8E3A4948B8B8C0F02A7ACBA4C32EE2
    @Test()
    void getTypeArguments1WhenGenericInterfaceIsNullAndTypeInstanceOfClass_AndIsAssignableNotClsToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getTypeArguments1WhenIsAssignableClsToClassThrowsNullPointerException}, hash: CC0688819A21FCEA922C8C5BDC979741
    @Test()
    void getTypeArguments1WhenIsAssignableClsToClassThrowsNullPointerException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            TypeUtils.getTypeArguments(parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getTypeArguments1WhenTypeNotInstanceOfClass_AndTypeInstanceOfParameterizedType}, hash: 3747E4B3505026DFECD62408349B8F0E
    @Test()
    void getTypeArguments1WhenTypeNotInstanceOfClass_AndTypeInstanceOfParameterizedType() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments1WhenToClassIsPrimitive}, hash: 23C8EE751C72D4FAE18D80099B387623
    @Test()
    void getTypeArguments1WhenToClassIsPrimitive() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments1WhenToClassIsArray}, hash: 6FEE33AD511E7B60962F6A6F91D1493A
    @Test()
    void getTypeArguments1WhenToClassIsArray() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : true  #  inside getTypeArguments method
         * (toClass.isArray()) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments1WhenSubtypeVarAssignsIsNotNullAndToClassNotEqualsCls}, hash: 404E476F21EC00968C51FCCA4FFCE458
    @Test()
    void getTypeArguments1WhenSubtypeVarAssignsIsNotNullAndToClassNotEqualsCls() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments1WhenToClassNotIsPrimitiveAndSubtypeVarAssignsIsNotNullAndToClassEqualsCls}, hash: 53C2DF6BDD3CA23AE566AF5C2DBA1C29
    @Test()
    void getTypeArguments1WhenToClassNotIsPrimitiveAndSubtypeVarAssignsIsNotNullAndToClassEqualsCls() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments1WhenToClassNotEqualsClsThrowsIllegalStateException}, hash: 5AC1C4BF5130CEFA1EE8A1EC9C3D6DE2
    @Test()
    void getTypeArguments1WhenToClassNotEqualsClsThrowsIllegalStateException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type9");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.getTypeArguments(parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getTypeArguments1WhenIsAssignableClsToClassAndClsIsPrimitiveAndToClassNotIsPrimitiveAndSubtypeVarAssignsIsNotNullAndToC}, hash: C73EA70585DCDA00E6CA262DAF82A715
    @Test()
    void getTypeArguments1WhenIsAssignableClsToClassAndClsIsPrimitiveAndToClassNotIsPrimitiveAndSubtypeVarAssignsIsNotNullAndToC() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments1WhenIsAssignableBoundToClass}, hash: E45FD11C1392B11F7D13FAAA15B6238A
    @Test()
    void getTypeArguments1WhenIsAssignableBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (isAssignable(bound, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { (Type) null };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getTypeArguments1WhenGetImplicitUpperBoundsTypeIsNotEmptyAndIsAssignableBoundToClass}, hash: F293D973DF3214BE356A580E1351312A
    @Test()
    void getTypeArguments1WhenGetImplicitUpperBoundsTypeIsNotEmptyAndIsAssignableBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (isAssignable(bound, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { Object.class };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getTypeArguments1WhenTypeInstanceOfWildcardTypeAndGetImplicitUpperBoundsTypeIsNotEmptyAndIsAssignableBoundToClass}, hash: 827C2271CECF8AA89772F3F21DB60D69
    @Test()
    void getTypeArguments1WhenTypeInstanceOfWildcardTypeAndGetImplicitUpperBoundsTypeIsNotEmptyAndIsAssignableBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (isAssignable(bound, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { typeMock };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getTypeArguments1WhenIsAssignableNotBoundToClass}, hash: 2940DD189F9AD0F70118BFE59AEF3F2F
    @Test()
    void getTypeArguments1WhenIsAssignableNotBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (isAssignable(bound, toClass)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { (Type) null };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getTypeArguments1WhenGetImplicitUpperBoundsTypeIsNotEmptyAndIsAssignableNotBoundToClass}, hash: CAA45F25791FEB9684B5296EDFF6CF1B
    @Test()
    void getTypeArguments1WhenGetImplicitUpperBoundsTypeIsNotEmptyAndIsAssignableNotBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (isAssignable(bound, toClass)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { Object.class };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getTypeArguments1WhenTypeInstanceOfParameterizedTypeThrowsIllegalStateException}, hash: 6D64254CD5D7262A932540136FCD6E9F
    @Test()
    void getTypeArguments1WhenTypeInstanceOfParameterizedTypeThrowsIllegalStateException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { parameterizedTypeMock };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                TypeUtils.getTypeArguments(parameterizedTypeMock2);
            });
            IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type9");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getTypeArguments1WhenMidTypeInstanceOfClass_}, hash: 86FDF289A2EE24BAA3702563647C61AE
    @Test()
    void getTypeArguments1WhenMidTypeInstanceOfClass_() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (midType instanceof Class<?>) : true  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments1WhenMidTypeNotInstanceOfClass_ThrowsIllegalStateException}, hash: 8B418AF5E2480DBC89CDB83D7856BFBE
    @Test()
    void getTypeArguments1WhenMidTypeNotInstanceOfClass_ThrowsIllegalStateException() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (midType instanceof Class<?>) : false  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Unexpected generic interface type found: type8");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.getTypeArguments(parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getTypeArguments1WhenIsAssignableGenericInterfaceMidClass}, hash: 5D807D1AED2DF0261E45998FD5B93203
    @Test()
    void getTypeArguments1WhenIsAssignableGenericInterfaceMidClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments1WhenToClassNotEqualsClsAndIsAssignableGenericInterfaceMidClass}, hash: 2884158815406BAA4873FF9A7E0109BE
    @Test()
    void getTypeArguments1WhenToClassNotEqualsClsAndIsAssignableGenericInterfaceMidClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments1WhenIsAssignableNotGenericInterfaceMidClass}, hash: 10BCB86BD5F33167D49C06D5D0F82E28
    @Test()
    void getTypeArguments1WhenIsAssignableNotGenericInterfaceMidClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (isAssignable(genericInterface, (Type) midClass)) : false  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments1WhenTypeInstanceOfParameterizedTypeAndIsAssignableBoundToClass}, hash: DEF0D6570E2CE72371A1A95B52C92124
    @Test()
    void getTypeArguments1WhenTypeInstanceOfParameterizedTypeAndIsAssignableBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { parameterizedTypeMock };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getTypeArguments1WhenIsAssignableBoundToClassAndIsAssignableBoundToClass}, hash: D71643BC7A10A1F84753EDBB4E48F17F
    @Test()
    void getTypeArguments1WhenIsAssignableBoundToClassAndIsAssignableBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : true  #  inside isAssignable method
         * (for-each(((TypeVariable<?>) type).getBounds())) : true  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : true  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { typeVariableMock };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getTypeArguments1WhenIsAssignableNotBoundToClassAndIsAssignableNotBoundToClass}, hash: 3AF1DFC1E79309A2D38CB2693E856E94
    @Test()
    void getTypeArguments1WhenIsAssignableNotBoundToClassAndIsAssignableNotBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : true  #  inside isAssignable method
         * (for-each(((TypeVariable<?>) type).getBounds())) : true  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : false  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { typeVariableMock };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getTypeArguments1WhenIsAssignableTypeGetGenericComponentTypeToClassGetComponentTypeAndIsAssignableBoundToClass}, hash: A61CBED5F2446AEE799D96E0B65E07E0
    @Test()
    void getTypeArguments1WhenIsAssignableTypeGetGenericComponentTypeToClassGetComponentTypeAndIsAssignableBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : true  #  inside isAssignable method
         * (toClass.equals(Object.class)) : false  #  inside isAssignable method
         * (toClass.isArray()) : true  #  inside isAssignable method
         * (isAssignable(((GenericArrayType) type).getGenericComponentType(), toClass.getComponentType())) : true  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { genericArrayTypeMock };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getTypeArguments1WhenIsAssignableNotTypeGetGenericComponentTypeToClassGetComponentTypeAndIsAssignableNotBoundToClass}, hash: D2549AE437F9BD76CF6C7DBC47171B5E
    @Test()
    void getTypeArguments1WhenIsAssignableNotTypeGetGenericComponentTypeToClassGetComponentTypeAndIsAssignableNotBoundToClass() {
        /* Branches:
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : true  #  inside isAssignable method
         * (toClass.equals(Object.class)) : false  #  inside isAssignable method
         * (toClass.isArray()) : true  #  inside isAssignable method
         * (isAssignable(((GenericArrayType) type).getGenericComponentType(), toClass.getComponentType())) : false  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { genericArrayTypeMock };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getTypeArguments3WhenRawTypeNotInstanceOfClass_ThrowsIllegalStateException}, hash: 6D83FC0F46118498FD88518CED68E58F
    @Test()
    void getTypeArguments3WhenRawTypeNotInstanceOfClass_ThrowsIllegalStateException() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         * (!(rawType instanceof Class<?>)) : true  #  inside getRawType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type2");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.getTypeArguments(parameterizedTypeMock, Object.class);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getTypeArguments3WhenIsAssignableNotClsToClass}, hash: 3F574D91C4C9CA0A56B5D06C35A9364F
    @Test()
    void getTypeArguments3WhenIsAssignableNotClsToClass() {
        /* Branches:
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         */
         //Arrange Statement(s)
        Class<?> _class = null;
        
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(Object.class, _class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getTypeArguments3WhenToClassIsArray}, hash: 6FE4DF455B6B7AAAEFFF4370604EE39F
    @Test()
    void getTypeArguments3WhenToClassIsArray() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : true  #  inside getTypeArguments method
         * (toClass.isArray()) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(genericArrayTypeMock, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments3WhenToClassNotIsPrimitiveAndIsAssignableClsToClassThrowsNullPointerException}, hash: 7BBAAB3ECCAA909A8C1D55C098A5F249
    @Test()
    void getTypeArguments3WhenToClassNotIsPrimitiveAndIsAssignableClsToClassThrowsNullPointerException() {
        /* Branches:
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         */
         //Arrange Statement(s)
        Class _class = null;
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            TypeUtils.getTypeArguments(_class, Object.class);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getTypeArguments3WhenToClassIsPrimitiveAndIsAssignableNotClsToClass}, hash: 86B6E4FC9A81886076BF4E9C6540A473
    @Test()
    void getTypeArguments3WhenToClassIsPrimitiveAndIsAssignableNotClsToClass() {
        /* Branches:
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Class _class = null;
        
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(_class, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getTypeArguments3WhenToClassIsNullAndIsAssignableNotClsToClass}, hash: 5C07AE478ACB312308181BEDAF1385BE
    @Test()
    void getTypeArguments3WhenToClassIsNullAndIsAssignableNotClsToClass() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Class<?> _class = null;
        
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock, _class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getTypeArguments3WhenToClassIsPrimitive}, hash: 817E95CEDF9755A728456FA34541F57F
    @Test()
    void getTypeArguments3WhenToClassIsPrimitive() {
        /* Branches:
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(Object.class, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments3WhenClassUtilsNotIsAssignableTypeToClassAndIsAssignableNotClsToClass}, hash: 74DA7E50C0A163DEC1DB307A108D5C0E
    @Test()
    void getTypeArguments3WhenClassUtilsNotIsAssignableTypeToClassAndIsAssignableNotClsToClass() {
        /* Branches:
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(Object.class, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getTypeArguments3WhenToClassIsNotNullAndToClassIsPrimitiveAndIsAssignableNotClsToClass}, hash: D0D9F073E7CA35EE4BE5387C0B554DD3
    @Test()
    void getTypeArguments3WhenToClassIsNotNullAndToClassIsPrimitiveAndIsAssignableNotClsToClass() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getTypeArguments3WhenOwnerTypeInstanceOfParameterizedTypeThrowsIllegalStateException}, hash: 791DFF6E37942E3C4A1D571C036E9731
    @Test()
    void getTypeArguments3WhenOwnerTypeInstanceOfParameterizedTypeThrowsIllegalStateException() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type4");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.getTypeArguments(parameterizedTypeMock, Object.class);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getTypeArguments3WhenOwnerTypeInstanceOfParameterizedTypeThrowsNullPointerException}, hash: B404716C0160E39E1DEF9C7037071388
    @Test()
    void getTypeArguments3WhenOwnerTypeInstanceOfParameterizedTypeThrowsNullPointerException() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            TypeUtils.getTypeArguments(parameterizedTypeMock, Object.class);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getTypeArguments3WhenIsAssignableNotBoundToClass}, hash: FC2645DDD484194BD848FB61B5443749
    @Test()
    void getTypeArguments3WhenIsAssignableNotBoundToClass() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : true  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : false  #  inside getTypeArguments method
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { typeMock };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            Class<?> _class = null;
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(wildcardTypeMock, _class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getTypeArguments3WhenSubtypeVarAssignsIsNullAndToClassEqualsCls}, hash: 6E5A39363524CACCF7BF0053BB27EDA0
    @Test()
    void getTypeArguments3WhenSubtypeVarAssignsIsNullAndToClassEqualsCls() {
        /* Branches:
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(Object.class, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments3WhenTypeInstanceOfClass_AndClassUtilsNotIsAssignableTypeToClassAndIsAssignableNotClsToClass}, hash: 1E08608548B64E1F6B43A32D0749B146
    @Test()
    void getTypeArguments3WhenTypeInstanceOfClass_AndClassUtilsNotIsAssignableTypeToClassAndIsAssignableNotClsToClass() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getTypeArguments3WhenToClassNotIsPrimitiveAndIsAssignableBoundToClass}, hash: 0345E6B8C84C5C37E46C3F3A8F57659B
    @Test()
    void getTypeArguments3WhenToClassNotIsPrimitiveAndIsAssignableBoundToClass() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { (Type) null };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(wildcardTypeMock, Object.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getTypeArguments3WhenToClassIsPrimitiveAndIsAssignableNotBoundToClass}, hash: 5E27B3D1DD68100118817620CF85F0CC
    @Test()
    void getTypeArguments3WhenToClassIsPrimitiveAndIsAssignableNotBoundToClass() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (type instanceof GenericArrayType) : false  #  inside getTypeArguments method
         * (type instanceof WildcardType) : true  #  inside getTypeArguments method
         * (for-each(getImplicitUpperBounds((WildcardType) type))) : true  #  inside getTypeArguments method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { (Type) null };
            typeUtils.when(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock)).thenReturn(typeArray);
            //Act Statement(s)
            Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(wildcardTypeMock, Object.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                typeUtils.verify(() -> TypeUtils.getImplicitUpperBounds(wildcardTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getTypeArguments3WhenToClassNotEqualsClsAndSuperClassNotIsInterface}, hash: 1A7407D1E0910FA75A5953FE8F300C08
    @Test()
    void getTypeArguments3WhenToClassNotEqualsClsAndSuperClassNotIsInterface() {
        /* Branches:
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : false  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(Object.class, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments3WhenILessThanTypeParamsLengthAndToClassEqualsCls}, hash: 97EE1F9044CF79122F1BDCD8013D4DA3
    @Test()
    void getTypeArguments3WhenILessThanTypeParamsLengthAndToClassEqualsCls() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock, Object.class);
        Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
        anyMap.put(typeVariableMock, typeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(anyMap)));
    }

    //Sapient generated method id: ${getTypeArguments3WhenMidTypeInstanceOfParameterizedTypeAndRawTypeNotInstanceOfClass_ThrowsIllegalStateException}, hash: ECF40CF4A8667471B71F9C1C43C81CC6
    @Test()
    void getTypeArguments3WhenMidTypeInstanceOfParameterizedTypeAndRawTypeNotInstanceOfClass_ThrowsIllegalStateException() {
        /* Branches:
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (!(rawType instanceof Class<?>)) : true  #  inside getRawType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type3");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.getTypeArguments(Object.class, Object.class);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getTypeArguments3WhenMidTypeNotInstanceOfClass_ThrowsIllegalStateException}, hash: 33654CE814D177942B57244E1865361B
    @Test()
    void getTypeArguments3WhenMidTypeNotInstanceOfClass_ThrowsIllegalStateException() {
        /* Branches:
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : false  #  inside getClosestParentType method
         * (midType instanceof Class<?>) : false  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Unexpected generic interface type found: type2");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.getTypeArguments(Object.class, Object.class);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getTypeArguments3WhenMidTypeInstanceOfParameterizedTypeThrowsIllegalStateException}, hash: 4E54E6104599A76BDD080445B4224789
    @Test()
    void getTypeArguments3WhenMidTypeInstanceOfParameterizedTypeThrowsIllegalStateException() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type7");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.getTypeArguments(parameterizedTypeMock, Object.class);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getTypeArguments3WhenSubtypeVarAssignsIsNullAndINotLessThanTypeParamsLengthAndToClassNotEqualsClsAndSuperClassNotIsInte}, hash: 2EC7372C6EF3D45B4817AD14F9CEDA9A
    @Test()
    void getTypeArguments3WhenSubtypeVarAssignsIsNullAndINotLessThanTypeParamsLengthAndToClassNotEqualsClsAndSuperClassNotIsInte() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : false  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments3WhenMidTypeNotInstanceOfParameterizedTypeAndMidTypeNotInstanceOfClass_ThrowsIllegalStateException}, hash: 660D270FA8D0041256489C6E08F70830
    @Test()
    void getTypeArguments3WhenMidTypeNotInstanceOfParameterizedTypeAndMidTypeNotInstanceOfClass_ThrowsIllegalStateException() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : false  #  inside getClosestParentType method
         * (midType instanceof Class<?>) : false  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Unexpected generic interface type found: type6");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.getTypeArguments(parameterizedTypeMock, Object.class);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getTypeArguments3WhenIsAssignableNotMidClassSuperClassAndGenericInterfaceIsNull}, hash: 48831D4816D1655E89038400DD01CB1F
    @Test()
    void getTypeArguments3WhenIsAssignableNotMidClassSuperClassAndGenericInterfaceIsNull() {
        /* Branches:
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(Object.class, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments3WhenTypeInstanceOfClass_AndClassUtilsNotIsAssignableTypeToClassAndIsAssignableNotMidClassSuperClassAnd}, hash: 3945394FDF5883C74C408AFEDEB2A165
    @Test()
    void getTypeArguments3WhenTypeInstanceOfClass_AndClassUtilsNotIsAssignableTypeToClassAndIsAssignableNotMidClassSuperClassAnd() {
        /* Branches:
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : false  #  inside getClosestParentType method
         * (midType instanceof Class<?>) : true  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(Object.class, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments3WhenGenericInterfaceIsNotNull}, hash: D78DB72F144C9C821D3DA381A21DE852
    @Test()
    void getTypeArguments3WhenGenericInterfaceIsNotNull() {
        /* Branches:
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(Object.class, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments3WhenIsAssignableGenericInterfaceMidClassAndGenericInterfaceIsNotNull}, hash: 8FC1B8F8CBA1C75453D22004071FED44
    @Test()
    void getTypeArguments3WhenIsAssignableGenericInterfaceMidClassAndGenericInterfaceIsNotNull() {
        /* Branches:
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(Object.class, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments3WhenToClassIsPrimitiveAndIsAssignableNotMidClassSuperClassAndGenericInterfaceIsNull}, hash: 6D80D7FBE8BCC901697A1A8ECF7A4098
    @Test()
    void getTypeArguments3WhenToClassIsPrimitiveAndIsAssignableNotMidClassSuperClassAndGenericInterfaceIsNull() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments3WhenToClassNotIsPrimitiveAndIsAssignableGenericInterfaceMidClassAndGenericInterfaceIsNotNull}, hash: 008F673FFA838B419A83DE521448DA6C
    @Test()
    void getTypeArguments3WhenToClassNotIsPrimitiveAndIsAssignableGenericInterfaceMidClassAndGenericInterfaceIsNotNull() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments3WhenIsAssignableMidClassSuperClassAndIsAssignableGenericInterfaceMidClassAndGenericInterfaceIsNotNull}, hash: BBE98918DA16B7965F261EE583758A48
    @Test()
    void getTypeArguments3WhenIsAssignableMidClassSuperClassAndIsAssignableGenericInterfaceMidClassAndGenericInterfaceIsNotNull() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments3WhenClassUtilsNotIsAssignableTypeToClassAndIsAssignableNotMidClassSuperClassAndGenericInterfaceIsNull3}, hash: D03B9EB9BF815DD6224DD3B7FBD1D46F
    @Test()
    void getTypeArguments3WhenClassUtilsNotIsAssignableTypeToClassAndIsAssignableNotMidClassSuperClassAndGenericInterfaceIsNull3() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : false  #  inside getClosestParentType method
         * (midType instanceof Class<?>) : true  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : false  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments3WhenToClassIsNotNullAndToClassIsPrimitiveAndIsAssignableNotGenericInterfaceMidClassAndGenericInterface}, hash: 8A9D913EFF9B9F4047B63DA6ED1194D9
    @Test()
    void getTypeArguments3WhenToClassIsNotNullAndToClassIsPrimitiveAndIsAssignableNotGenericInterfaceMidClassAndGenericInterface() {
        /* Branches:
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(genericInterface, (Type) midClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(Object.class, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getTypeArguments3WhenToClassIsPrimitiveAndIsAssignableNotGenericInterfaceMidClassAndGenericInterfaceIsNull2}, hash: 7FABDB6D12B15446442F250716822CF0
    @Test()
    void getTypeArguments3WhenToClassIsPrimitiveAndIsAssignableNotGenericInterfaceMidClassAndGenericInterfaceIsNull2() {
        /* Branches:
         * (type instanceof Class<?>) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (isAssignable(genericInterface, (Type) midClass)) : false  #  inside getClosestParentType method
         * (genericInterface != null) : false  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Map<TypeVariable<?>, Type> result = TypeUtils.getTypeArguments(parameterizedTypeMock, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${isArrayTypeWhenTypeIsArray}, hash: E3FD36B8433CF34DDA402BB621D2ABE8
    @Test()
    void isArrayTypeWhenTypeIsArray() {
        /* Branches:
         * (type instanceof GenericArrayType) : false
         * (type instanceof Class<?>) : true
         * (((Class<?>) type).isArray()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isArrayType(Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isArrayTypeWhenTypeNotIsArray}, hash: 5ED9A682B004D0433E0FA5EE45919B93
    @Test()
    void isArrayTypeWhenTypeNotIsArray() {
        /* Branches:
         * (type instanceof GenericArrayType) : false
         * (type instanceof Class<?>) : true
         * (((Class<?>) type).isArray()) : false
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isArrayType(Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isAssignable3WhenTypeIsNull}, hash: A777B66AF1076AE591831FFF264778AC
    @Test()
    void isAssignable3WhenTypeIsNull() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : true  #  inside isAssignable method
         */
         //Arrange Statement(s)
        Type type = null;
        
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable(type, (Type) parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isAssignable3WhenToClassNotIsPrimitive}, hash: BD22EBBBD9B76E6BA3C6366AE892D817
    @Test()
    void isAssignable3WhenToClassNotIsPrimitive() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         */
         //Arrange Statement(s)
        Type type = null;
        
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable(type, (Type) Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isAssignable3WhenToClassIsPrimitive}, hash: B7A0AF4EF1082239DF2E68500A213E56
    @Test()
    void isAssignable3WhenToClassIsPrimitive() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type type = null;
        
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable(type, (Type) Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isAssignable3WhenToClassEqualsType}, hash: E459FE9F2297573CAB95BDFD08018214
    @Test()
    void isAssignable3WhenToClassEqualsType() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) Object.class, (Type) Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isAssignable3WhenTypeInstanceOfGenericArrayType}, hash: 9C0792EDDE79E690CAC44177DD53CBC9
    @Test()
    void isAssignable3WhenTypeInstanceOfGenericArrayType() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : true  #  inside isAssignable method
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) genericArrayTypeMock, (Type) parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isAssignable3WhenClassUtilsIsAssignableTypeToClass}, hash: 45991174698BF8072EAD35F16D10BE66
    @Test()
    void isAssignable3WhenClassUtilsIsAssignableTypeToClass() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) Object.class, (Type) Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isAssignable3WhenClassUtilsNotIsAssignableTypeToClass}, hash: B37A07804F6B8915408A3207EC867636
    @Test()
    void isAssignable3WhenClassUtilsNotIsAssignableTypeToClass() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) Object.class, (Type) Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isAssignable3WhenToParameterizedTypeEqualsType}, hash: 57DB096C9F662A7A7609D05385C6D7A6
    @Test()
    void isAssignable3WhenToParameterizedTypeEqualsType() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : true  #  inside isAssignable method
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) parameterizedTypeMock, (Type) parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isAssignable3WhenRawTypeNotInstanceOfClass_ThrowsIllegalStateException}, hash: E1AEB18BC581F66C7F894343FE949C2C
    @Test()
    void isAssignable3WhenRawTypeNotInstanceOfClass_ThrowsIllegalStateException() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : true  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : true  #  inside getRawType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type2");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.isAssignable((Type) parameterizedTypeMock, (Type) Object.class);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${isAssignable3WhenToParameterizedTypeNotEqualsTypeAndRawTypeNotInstanceOfClass_ThrowsIllegalStateException}, hash: 25B6F9E89BE87BD08E9DEB70DF48F799
    @Test()
    void isAssignable3WhenToParameterizedTypeNotEqualsTypeAndRawTypeNotInstanceOfClass_ThrowsIllegalStateException() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : true  #  inside getRawType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type2");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.isAssignable(typeMock, (Type) parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${isAssignable3WhenIsAssignableTypeToType}, hash: E71906C75AA966E27B4E86EE60A6C378
    @Test()
    void isAssignable3WhenIsAssignableTypeToType() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : true  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (isAssignable(type, (Class<?>) toType)) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) parameterizedTypeMock, (Type) Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isAssignable3WhenIsAssignableBoundToClass}, hash: E0D03E25E1109DD31A3A3588315F0996
    @Test()
    void isAssignable3WhenIsAssignableBoundToClass() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : true  #  inside isAssignable method
         * (for-each(((TypeVariable<?>) type).getBounds())) : true  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) typeVariableMock, (Type) Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isAssignable3WhenIsAssignableNotBoundToClass}, hash: A2A00B727B42F4FE16670CCCEC54970A
    @Test()
    void isAssignable3WhenIsAssignableNotBoundToClass() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : true  #  inside isAssignable method
         * (for-each(((TypeVariable<?>) type).getBounds())) : true  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) typeVariableMock, (Type) Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isAssignable3WhenTypeInstanceOfWildcardType}, hash: F59A53C9B8F458719B9B89E30FC9F9CE
    @Test()
    void isAssignable3WhenTypeInstanceOfWildcardType() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (type instanceof WildcardType) : true  #  inside isAssignable method
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) wildcardTypeMock, (Type) Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isAssignable3WhenTypeNotInstanceOfWildcardTypeThrowsIllegalStateException}, hash: 0450A6778EC843FA359E0F93F35934C3
    @Test()
    void isAssignable3WhenTypeNotInstanceOfWildcardTypeThrowsIllegalStateException() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (type instanceof WildcardType) : false  #  inside isAssignable method
         */
         //Arrange Statement(s)
        Type typeMock = mock(Type.class, "type");
        IllegalStateException illegalStateException = new IllegalStateException("found an unhandled type: type");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.isAssignable(typeMock, (Type) Object.class);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${isAssignable3WhenIsAssignableTypeGetGenericComponentTypeToClassGetComponentType}, hash: DBC50B04DB72D3B5852A53530B2072E7
    @Test()
    void isAssignable3WhenIsAssignableTypeGetGenericComponentTypeToClassGetComponentType() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : true  #  inside isAssignable method
         * (toClass.equals(Object.class)) : false  #  inside isAssignable method
         * (toClass.isArray()) : true  #  inside isAssignable method
         * (isAssignable(((GenericArrayType) type).getGenericComponentType(), toClass.getComponentType())) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) genericArrayTypeMock, (Type) Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isAssignable3WhenIsAssignableNotTypeGetGenericComponentTypeToClassGetComponentType}, hash: 871C2E615EB9A9F0C2F04730BF9A20DE
    @Test()
    void isAssignable3WhenIsAssignableNotTypeGetGenericComponentTypeToClassGetComponentType() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : true  #  inside isAssignable method
         * (toClass.equals(Object.class)) : false  #  inside isAssignable method
         * (toClass.isArray()) : true  #  inside isAssignable method
         * (isAssignable(((GenericArrayType) type).getGenericComponentType(), toClass.getComponentType())) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) genericArrayTypeMock, (Type) Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isAssignable3WhenFromTypeVarAssignsIsNull}, hash: 58667BC1B44BD41D587141FF54377293
    @Test()
    void isAssignable3WhenFromTypeVarAssignsIsNull() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         * (fromTypeVarAssigns == null) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) Object.class, (Type) parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isAssignable3WhenFromTypeVarAssignsIsEmpty}, hash: D63EDA2F18DD833C8BC11A073C8E5C2E
    @Test()
    void isAssignable3WhenFromTypeVarAssignsIsEmpty() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : true  #  inside getTypeArguments method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) Object.class, (Type) parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isAssignable3WhenFromTypeVarAssignsIsNotNullAndFromTypeVarAssignsIsEmpty}, hash: 6338301DDB031056F4F9237AFE3B6420
    @Test()
    void isAssignable3WhenFromTypeVarAssignsIsNotNullAndFromTypeVarAssignsIsEmpty() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) Object.class, (Type) parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isAssignable3WhenMidTypeInstanceOfParameterizedTypeThrowsIllegalStateException}, hash: 819D8B00DAFFB1A6DC81F422B2D3D65B
    @Test()
    void isAssignable3WhenMidTypeInstanceOfParameterizedTypeThrowsIllegalStateException() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type4");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.isAssignable((Type) Object.class, (Type) parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${isAssignable3WhenFromTypeVarAssignsNotIsEmptyThrowsIllegalStateException}, hash: 06EFE09F246BC864AA11732F8BDE38E6
    @Test()
    void isAssignable3WhenFromTypeVarAssignsNotIsEmptyThrowsIllegalStateException() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type5");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.isAssignable((Type) Object.class, (Type) parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${isAssignable3WhenIsAssignableNotClsToClassThrowsNullPointerException}, hash: D23D207329CCC4D117E6447FEC726F4C
    @Test()
    void isAssignable3WhenIsAssignableNotClsToClassThrowsNullPointerException() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            TypeUtils.isAssignable((Type) Object.class, (Type) parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${isAssignable3WhenOwnerTypeInstanceOfParameterizedTypeThrowsIllegalStateException}, hash: 270E720B8728C5621AEB371605132417
    @Test()
    void isAssignable3WhenOwnerTypeInstanceOfParameterizedTypeThrowsIllegalStateException() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type7");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.isAssignable((Type) Object.class, (Type) parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${isAssignable3WhenOwnerTypeInstanceOfParameterizedTypeThrowsNullPointerException}, hash: CA79111524109541DCC8741C1251EC76
    @Test()
    void isAssignable3WhenOwnerTypeInstanceOfParameterizedTypeThrowsNullPointerException() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            TypeUtils.isAssignable((Type) Object.class, (Type) parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${isAssignable3WhenToClassNotEqualsClsThrowsNullPointerException}, hash: 0637C6B82289E1DC22AB403FC875942F
    @Test()
    void isAssignable3WhenToClassNotEqualsClsThrowsNullPointerException() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            TypeUtils.isAssignable((Type) Object.class, (Type) parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${isAssignable3WhenToClassNotEqualsClsThrowsIllegalStateException}, hash: 43A4DB453792AA9230805BFAA98CA77A
    @Test()
    void isAssignable3WhenToClassNotEqualsClsThrowsIllegalStateException() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type8");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.isAssignable((Type) Object.class, (Type) parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${isAssignable3WhenINotLessThanTypeParamsLengthAndToClassNotEqualsClsThrowsNullPointerException}, hash: E3CCF7BB322F8C6BEE0B85E657C867C9
    @Test()
    void isAssignable3WhenINotLessThanTypeParamsLengthAndToClassNotEqualsClsThrowsNullPointerException() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            TypeUtils.isAssignable((Type) Object.class, (Type) parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${isAssignable3WhenTypeInstanceOfParameterizedTypeThrowsNullPointerException}, hash: DF987D482AC081DD2F535007C3A618DB
    @Test()
    void isAssignable3WhenTypeInstanceOfParameterizedTypeThrowsNullPointerException() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            TypeUtils.isAssignable((Type) Object.class, (Type) parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${isAssignable3WhenToClassNotEqualsClsAndToTypeVarAssignsKeySetIsEmpty}, hash: 78E11CA79DAEED36721F06D8746D0021
    @Test()
    void isAssignable3WhenToClassNotEqualsClsAndToTypeVarAssignsKeySetIsEmpty() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (for-each(toTypeVarAssigns.keySet())) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) Object.class, (Type) parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isAssignable3WhenFromTypeArgInstanceOfClass}, hash: 493863712F6660D5693D792CD40EFB72
    @Test()
    void isAssignable3WhenFromTypeArgInstanceOfClass() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         * (for-each(toTypeVarAssigns.keySet())) : true  #  inside isAssignable method
         * (!(result instanceof TypeVariable<?>)) : true  #  inside unrollVariableAssignments method
         * (toTypeArg == null) : true  #  inside isAssignable method
         * (fromTypeArg instanceof Class) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) Object.class, (Type) parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isAssignable3WhenResultNotEqualsTypeVariableAndToTypeArgIsNotNullAndFromTypeArgIsNull}, hash: 5416BE49B4E28713577F91E0EC468A86
    @Test()
    void isAssignable3WhenResultNotEqualsTypeVariableAndToTypeArgIsNotNullAndFromTypeArgIsNull() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         * (for-each(toTypeVarAssigns.keySet())) : true  #  inside isAssignable method
         * (!(result instanceof TypeVariable<?>)) : false  #  inside unrollVariableAssignments method
         * (result.equals(typeVariable)) : false  #  inside unrollVariableAssignments method
         * (toTypeArg == null) : false  #  inside isAssignable method
         * (fromTypeArg != null) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) Object.class, (Type) parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isAssignable3WhenToTypeArgNotEqualsFromTypeArg}, hash: C508193E0EDCFD38914AF72C9BE6ECB9
    @Test()
    void isAssignable3WhenToTypeArgNotEqualsFromTypeArg() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         * (for-each(toTypeVarAssigns.keySet())) : true  #  inside isAssignable method
         * (!(result instanceof TypeVariable<?>)) : false  #  inside unrollVariableAssignments method
         * (result.equals(typeVariable)) : true  #  inside unrollVariableAssignments method
         * (toTypeArg == null) : false  #  inside isAssignable method
         * (fromTypeArg != null) : true  #  inside isAssignable method
         * (toTypeArg != null) : true  #  inside isAssignable method
         * (!toTypeArg.equals(fromTypeArg)) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) Object.class, (Type) parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isAssignable3WhenToTypeArgIsNotNullAndToTypeArgNotEqualsFromTypeArg}, hash: 6C2D344920A6D09230A3E94A233FA593
    @Test()
    void isAssignable3WhenToTypeArgIsNotNullAndToTypeArgNotEqualsFromTypeArg() {
        /* Branches:
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         * (for-each(toTypeVarAssigns.keySet())) : true  #  inside isAssignable method
         * (!(result instanceof TypeVariable<?>)) : false  #  inside unrollVariableAssignments method
         * (result.equals(typeVariable)) : true  #  inside unrollVariableAssignments method
         * (toTypeArg == null) : false  #  inside isAssignable method
         * (fromTypeArg != null) : true  #  inside isAssignable method
         * (toTypeArg != null) : true  #  inside isAssignable method
         * (!toTypeArg.equals(fromTypeArg)) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        boolean result = TypeUtils.isAssignable((Type) Object.class, (Type) parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isInstanceWhenTypeIsNull}, hash: DF5E6DD90D7B010E07AD07CDA8F59409
    @Test()
    void isInstanceWhenTypeIsNull() {
        /* Branches:
         * (type == null) : true
         */
         //Arrange Statement(s)
        Object object = new Object();
        Type type = null;
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, type);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isInstanceWhenTypeNotInstanceOfClass_}, hash: E22573FFC2ACF52C8D740F04D85414D2
    @Test()
    void isInstanceWhenTypeNotInstanceOfClass_() {
        /* Branches:
         * (type == null) : false
         * (value == null) : true
         * (!(type instanceof Class<?>)) : true
         */
         //Arrange Statement(s)
        Object object = null;
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isInstanceWhenTypeInstanceOfClass_}, hash: CD59C6E35C6B60E8615A0734BC065FF2
    @Test()
    void isInstanceWhenTypeInstanceOfClass_() {
        /* Branches:
         * (type == null) : false
         * (value == null) : true
         * (!(type instanceof Class<?>)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = null;
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isInstanceWhenToTypeInstanceOfParameterizedTypeAndTypeIsNull}, hash: 4232BF3260AAB4AC3989CC8F11CC2713
    @Test()
    void isInstanceWhenToTypeInstanceOfParameterizedTypeAndTypeIsNull() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : true  #  inside isAssignable method
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isInstanceWhenToClassNotIsPrimitive}, hash: 7BA389D3613F2F85CCDF5F726BEC4E48
    @Test()
    void isInstanceWhenToClassNotIsPrimitive() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isInstanceWhenToClassIsPrimitive}, hash: 171FD6FD84ED7CDCE6F8AB8362A8A0D8
    @Test()
    void isInstanceWhenToClassIsPrimitive() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isInstanceWhenToClassEqualsType}, hash: EAAC8D1AB0D64488090D95B3F53D4BEA
    @Test()
    void isInstanceWhenToClassEqualsType() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isInstanceWhenClassUtilsIsAssignableTypeToClass}, hash: 9CEFE5CE0A1D6D4BC08B23100AED5125
    @Test()
    void isInstanceWhenClassUtilsIsAssignableTypeToClass() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isInstanceWhenClassUtilsNotIsAssignableTypeToClass}, hash: 9C912094ABD6BA074F80496C3F218C24
    @Test()
    void isInstanceWhenClassUtilsNotIsAssignableTypeToClass() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isInstanceWhenToParameterizedTypeEqualsType}, hash: 3B35959440EB0A9902E2661AE8BC7657
    @Test()
    void isInstanceWhenToParameterizedTypeEqualsType() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isInstanceWhenRawTypeNotInstanceOfClass_ThrowsIllegalStateException}, hash: EAAD2BC9B1FA4EB3E7EFEBF8698BE859
    @Test()
    void isInstanceWhenRawTypeNotInstanceOfClass_ThrowsIllegalStateException() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : true  #  inside getRawType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type2");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.isInstance(object, parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${isInstanceWhenFromTypeVarAssignsIsNull}, hash: 558A1E2C1E48E783669055BBC5F13142
    @Test()
    void isInstanceWhenFromTypeVarAssignsIsNull() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         * (fromTypeVarAssigns == null) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isInstanceWhenFromTypeVarAssignsIsEmpty}, hash: D6E5A9CA0A980A03C0ACF08EDD9164AD
    @Test()
    void isInstanceWhenFromTypeVarAssignsIsEmpty() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : true  #  inside getTypeArguments method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isInstanceWhenMidTypeInstanceOfParameterizedTypeThrowsIllegalStateException}, hash: C68E68257963D84BD073ACCFE2032D55
    @Test()
    void isInstanceWhenMidTypeInstanceOfParameterizedTypeThrowsIllegalStateException() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type4");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.isInstance(object, parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${isInstanceWhenFromTypeVarAssignsNotIsEmptyThrowsIllegalStateException}, hash: C8B25107CCDF7BC0819A90373F9F0416
    @Test()
    void isInstanceWhenFromTypeVarAssignsNotIsEmptyThrowsIllegalStateException() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type5");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.isInstance(object, parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${isInstanceWhenIsAssignableNotClsToClassThrowsNullPointerException}, hash: 275620AA5DA2D329BCE48E87C93780E0
    @Test()
    void isInstanceWhenIsAssignableNotClsToClassThrowsNullPointerException() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            TypeUtils.isInstance(object, parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${isInstanceWhenOwnerTypeInstanceOfParameterizedTypeThrowsIllegalStateException}, hash: B7C2E6C9BF57DFE2BB69D8DED4DF7404
    @Test()
    void isInstanceWhenOwnerTypeInstanceOfParameterizedTypeThrowsIllegalStateException() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type7");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.isInstance(object, parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${isInstanceWhenOwnerTypeInstanceOfParameterizedTypeThrowsNullPointerException}, hash: 3DECE3955833AF6C62FE817708511EC3
    @Test()
    void isInstanceWhenOwnerTypeInstanceOfParameterizedTypeThrowsNullPointerException() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            TypeUtils.isInstance(object, parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${isInstanceWhenToClassNotEqualsClsThrowsNullPointerException}, hash: C41EB75F4C3549A69B7087A53EE860CB
    @Test()
    void isInstanceWhenToClassNotEqualsClsThrowsNullPointerException() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            TypeUtils.isInstance(object, parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${isInstanceWhenToClassNotEqualsClsThrowsIllegalStateException}, hash: DF7EF6E00B797E3871E5250D1FA20487
    @Test()
    void isInstanceWhenToClassNotEqualsClsThrowsIllegalStateException() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type8");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.isInstance(object, parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${isInstanceWhenINotLessThanTypeParamsLengthAndToClassNotEqualsClsThrowsNullPointerException}, hash: 8D009D95A84EF0CE0D61189686F15327
    @Test()
    void isInstanceWhenINotLessThanTypeParamsLengthAndToClassNotEqualsClsThrowsNullPointerException() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            TypeUtils.isInstance(object, parameterizedTypeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${isInstanceWhenToClassNotEqualsClsAndToTypeVarAssignsKeySetIsEmpty}, hash: 475DB1A34DC0F80AE84C1B94874E1F0C
    @Test()
    void isInstanceWhenToClassNotEqualsClsAndToTypeVarAssignsKeySetIsEmpty() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (for-each(toTypeVarAssigns.keySet())) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isInstanceWhenINotLessThanTypeParamsLengthAndToClassNotEqualsClsAndToTypeVarAssignsKeySetIsEmpty}, hash: D5E59362F68246583A0B2A41365C670D
    @Test()
    void isInstanceWhenINotLessThanTypeParamsLengthAndToClassNotEqualsClsAndToTypeVarAssignsKeySetIsEmpty() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (for-each(toTypeVarAssigns.keySet())) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isInstanceWhenFromTypeArgInstanceOfClass}, hash: 00134BD56FDC3586704CDF9E4F406E08
    @Test()
    void isInstanceWhenFromTypeArgInstanceOfClass() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         * (for-each(toTypeVarAssigns.keySet())) : true  #  inside isAssignable method
         * (!(result instanceof TypeVariable<?>)) : true  #  inside unrollVariableAssignments method
         * (toTypeArg == null) : true  #  inside isAssignable method
         * (fromTypeArg instanceof Class) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isInstanceWhenResultNotEqualsTypeVariableAndToTypeArgIsNotNullAndFromTypeArgIsNull}, hash: F74AB952454EA1240701C49437499D4C
    @Test()
    void isInstanceWhenResultNotEqualsTypeVariableAndToTypeArgIsNotNullAndFromTypeArgIsNull() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         * (for-each(toTypeVarAssigns.keySet())) : true  #  inside isAssignable method
         * (!(result instanceof TypeVariable<?>)) : false  #  inside unrollVariableAssignments method
         * (result.equals(typeVariable)) : false  #  inside unrollVariableAssignments method
         * (toTypeArg == null) : false  #  inside isAssignable method
         * (fromTypeArg != null) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isInstanceWhenToTypeArgNotEqualsFromTypeArg}, hash: 2C43BD27EB4517D78CAAE90FF2DE30E6
    @Test()
    void isInstanceWhenToTypeArgNotEqualsFromTypeArg() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         * (for-each(toTypeVarAssigns.keySet())) : true  #  inside isAssignable method
         * (!(result instanceof TypeVariable<?>)) : false  #  inside unrollVariableAssignments method
         * (result.equals(typeVariable)) : true  #  inside unrollVariableAssignments method
         * (toTypeArg == null) : false  #  inside isAssignable method
         * (fromTypeArg != null) : true  #  inside isAssignable method
         * (toTypeArg != null) : true  #  inside isAssignable method
         * (!toTypeArg.equals(fromTypeArg)) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isInstanceWhenToTypeArgIsNotNullAndToTypeArgNotEqualsFromTypeArg}, hash: 81747E79438D8E69A7D0DAFBF06F491F
    @Test()
    void isInstanceWhenToTypeArgIsNotNullAndToTypeArgNotEqualsFromTypeArg() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         * (for-each(toTypeVarAssigns.keySet())) : true  #  inside isAssignable method
         * (!(result instanceof TypeVariable<?>)) : false  #  inside unrollVariableAssignments method
         * (result.equals(typeVariable)) : true  #  inside unrollVariableAssignments method
         * (toTypeArg == null) : false  #  inside isAssignable method
         * (fromTypeArg != null) : true  #  inside isAssignable method
         * (toTypeArg != null) : true  #  inside isAssignable method
         * (!toTypeArg.equals(fromTypeArg)) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isInstanceWhenToTypeArgInstanceOfWildcardTypeAndIsAssignableFromTypeArgToTypeArgTypeVarAssigns}, hash: AB7DF4E6FE656D124D2733C42CA66A20
    @Test()
    void isInstanceWhenToTypeArgInstanceOfWildcardTypeAndIsAssignableFromTypeArgToTypeArgTypeVarAssigns() {
        /* Branches:
         * (type == null) : false
         * (value == null) : false
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         * (for-each(toTypeVarAssigns.keySet())) : true  #  inside isAssignable method
         * (!(result instanceof TypeVariable<?>)) : true  #  inside unrollVariableAssignments method
         * (toTypeArg == null) : false  #  inside isAssignable method
         * (fromTypeArg != null) : true  #  inside isAssignable method
         * (toTypeArg != null) : true  #  inside isAssignable method
         * (!toTypeArg.equals(fromTypeArg)) : true  #  inside isAssignable method
         * (!(toTypeArg instanceof WildcardType && isAssignable(fromTypeArg, toTypeArg, typeVarAssigns))) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Object object = new Object();
        
        //Act Statement(s)
        boolean result = TypeUtils.isInstance(object, parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${normalizeUpperBoundsWhenBoundsLengthLessThan2}, hash: 4D210591047176F1A545C42E8A07438B
    @Test()
    void normalizeUpperBoundsWhenBoundsLengthLessThan2() {
        /* Branches:
         * (bounds.length < 2) : true
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] {};
        
        //Act Statement(s)
        Type[] result = TypeUtils.normalizeUpperBounds(typeArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(typeArray)));
    }

    //Sapient generated method id: ${normalizeUpperBoundsWhenSubtypeFound}, hash: 4C298A2B7C4766B02E8A064AF6C56DE9
    @Test()
    void normalizeUpperBoundsWhenSubtypeFound() {
        /* Branches:
         * (bounds.length < 2) : false
         * (for-each(bounds)) : true
         * (for-each(bounds)) : true
         * (type1 != type2) : true
         * (toType == null) : true  #  inside isAssignable method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : true  #  inside isAssignable method
         * (isAssignable(type2, type1, null)) : true
         * (!subtypeFound) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] { (Class) null, typeMock };
        
        //Act Statement(s)
        Type[] result = TypeUtils.normalizeUpperBounds(typeArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //Sapient generated method id: ${normalizeUpperBoundsWhenToTypeNotInstanceOfTypeVariable_ThrowsIllegalStateException}, hash: 00A07E5921E0914B9CD5ADAB36CE5FBE
    @Test()
    void normalizeUpperBoundsWhenToTypeNotInstanceOfTypeVariable_ThrowsIllegalStateException() {
        /* Branches:
         * (bounds.length < 2) : false
         * (for-each(bounds)) : true
         * (for-each(bounds)) : true
         * (type1 != type2) : true
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : false  #  inside isAssignable method
         * (toType instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toType instanceof WildcardType) : false  #  inside isAssignable method
         * (toType instanceof TypeVariable<?>) : false  #  inside isAssignable method
         */
         //Arrange Statement(s)
        Type typeMock = mock(Type.class, "type");
        Type[] typeArray = new Type[] { typeMock, typeMock2 };
        IllegalStateException illegalStateException = new IllegalStateException("found an unhandled type: type");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.normalizeUpperBounds(typeArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${normalizeUpperBoundsWhenIsAssignableType2Type1NullAndSubtypeFound}, hash: CAD394EAFFACD385527A505CE2215455
    @Test()
    void normalizeUpperBoundsWhenIsAssignableType2Type1NullAndSubtypeFound() {
        /* Branches:
         * (bounds.length < 2) : false
         * (for-each(bounds)) : true
         * (for-each(bounds)) : true
         * (type1 != type2) : true
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (isAssignable(type2, type1, null)) : true
         * (!subtypeFound) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] { Object.class, typeMock };
        
        //Act Statement(s)
        Type[] result = TypeUtils.normalizeUpperBounds(typeArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //Sapient generated method id: ${normalizeUpperBoundsWhenToTypeInstanceOfWildcardTypeAndIsAssignableType2Type1NullAndSubtypeFound}, hash: 82813AD769AB30B0475E5016ACF819D6
    @Test()
    void normalizeUpperBoundsWhenToTypeInstanceOfWildcardTypeAndIsAssignableType2Type1NullAndSubtypeFound() {
        /* Branches:
         * (bounds.length < 2) : false
         * (for-each(bounds)) : true
         * (for-each(bounds)) : true
         * (type1 != type2) : true
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : false  #  inside isAssignable method
         * (toType instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toType instanceof WildcardType) : true  #  inside isAssignable method
         * (isAssignable(type2, type1, null)) : true
         * (!subtypeFound) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] { wildcardTypeMock, typeMock };
        
        //Act Statement(s)
        Type[] result = TypeUtils.normalizeUpperBounds(typeArray);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //Sapient generated method id: ${normalizeUpperBoundsWhenToTypeInstanceOfTypeVariable_AndIsAssignableNotType2Type1NullAndNotSubtypeFound}, hash: F07A3CC4ABC9F7EF23C536857E1FB12E
    @Test()
    void normalizeUpperBoundsWhenToTypeInstanceOfTypeVariable_AndIsAssignableNotType2Type1NullAndNotSubtypeFound() {
        /* Branches:
         * (bounds.length < 2) : false
         * (for-each(bounds)) : true
         * (for-each(bounds)) : true
         * (type1 != type2) : true
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : false  #  inside isAssignable method
         * (toType instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toType instanceof WildcardType) : false  #  inside isAssignable method
         * (toType instanceof TypeVariable<?>) : true  #  inside isAssignable method
         * (isAssignable(type2, type1, null)) : false
         * (!subtypeFound) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] { typeVariableMock, typeMock };
        
        //Act Statement(s)
        Type[] result = TypeUtils.normalizeUpperBounds(typeArray);
        Type[] typeResultArray = new Type[] { typeVariableMock };
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(typeResultArray)));
    }

    //Sapient generated method id: ${normalizeUpperBoundsWhenToParameterizedTypeEqualsTypeAndIsAssignableType2Type1NullAndSubtypeFound}, hash: 7713DF9D70CE0C293CD4E838C6641020
    @Test()
    void normalizeUpperBoundsWhenToParameterizedTypeEqualsTypeAndIsAssignableType2Type1NullAndSubtypeFound() {
        /* Branches:
         * (bounds.length < 2) : false
         * (for-each(bounds)) : true
         * (for-each(bounds)) : true
         * (type1 != type2) : true
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : true  #  inside isAssignable method
         * (isAssignable(type2, type1, null)) : true
         * (!subtypeFound) : false
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] { parameterizedTypeMock, parameterizedTypeMock };
        
        //Act Statement(s)
        Type[] result = TypeUtils.normalizeUpperBounds(typeArray);
        Type[] typeResultArray = new Type[] { parameterizedTypeMock };
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(typeResultArray)));
    }

    //Sapient generated method id: ${normalizeUpperBoundsWhenToGenericArrayTypeEqualsTypeAndIsAssignableType2Type1NullAndSubtypeFound}, hash: B3279DB7E3DAC39E8D1244C9031AF13E
    @Test()
    void normalizeUpperBoundsWhenToGenericArrayTypeEqualsTypeAndIsAssignableType2Type1NullAndSubtypeFound() {
        /* Branches:
         * (bounds.length < 2) : false
         * (for-each(bounds)) : true
         * (for-each(bounds)) : true
         * (type1 != type2) : true
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : false  #  inside isAssignable method
         * (toType instanceof GenericArrayType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toGenericArrayType == null) : false  #  inside isAssignable method
         * (toGenericArrayType.equals(type)) : true  #  inside isAssignable method
         * (isAssignable(type2, type1, null)) : true
         * (!subtypeFound) : false
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] { genericArrayTypeMock, genericArrayTypeMock };
        
        //Act Statement(s)
        Type[] result = TypeUtils.normalizeUpperBounds(typeArray);
        Type[] typeResultArray = new Type[] { genericArrayTypeMock };
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(typeResultArray)));
    }

    //Sapient generated method id: ${parameterizeWhenObjectInstanceOfType}, hash: D1CD2C34C7CF72AFA0182BAA3528D3AC
    @Test()
    void parameterizeWhenObjectInstanceOfType() {
        /* Branches:
         * (for-each(variables)) : true  #  inside extractTypeArgumentsFrom method
         * (object instanceof Type) : true  #  inside toString method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { typeMock };
            typeUtils.when(() -> TypeUtils.parameterizeWithOwner((Type) null, Object.class, typeArray)).thenReturn(parameterizedTypeMock);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            //Act Statement(s)
            ParameterizedType result = TypeUtils.parameterize(Object.class, anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(parameterizedTypeMock));
                typeUtils.verify(() -> TypeUtils.parameterizeWithOwner((Type) null, Object.class, typeArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${parameterize1Test}, hash: 2DECF05DF94A7E3FFDFC1930EE9C6F7E
    @Test()
    void parameterize1Test() {
        //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.parameterizeWithOwner((Type) null, Object.class, typeArray)).thenReturn(parameterizedTypeMock);
            //Act Statement(s)
            ParameterizedType result = TypeUtils.parameterize(Object.class, typeArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(parameterizedTypeMock));
                typeUtils.verify(() -> TypeUtils.parameterizeWithOwner((Type) null, Object.class, typeArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${parameterizeWithOwnerWhenObjectInstanceOfType}, hash: 98ABF1541C4CB224206786A63240AE36
    @Test()
    void parameterizeWithOwnerWhenObjectInstanceOfType() {
        /* Branches:
         * (for-each(variables)) : true  #  inside extractTypeArgumentsFrom method
         * (object instanceof Type) : true  #  inside toString method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { typeMock2 };
            typeUtils.when(() -> TypeUtils.parameterizeWithOwner(typeMock, Object.class, typeArray)).thenReturn(parameterizedTypeMock);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            //Act Statement(s)
            ParameterizedType result = TypeUtils.parameterizeWithOwner(typeMock, Object.class, anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(parameterizedTypeMock));
                typeUtils.verify(() -> TypeUtils.parameterizeWithOwner(typeMock, Object.class, typeArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${parameterizeWithOwner1WhenOwnerIsNullThrowsIllegalArgumentException}, hash: B39C6E1970FA3A140B873AC9EC39975F
    @Test()
    void parameterizeWithOwner1WhenOwnerIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (rawClass.getEnclosingClass() == null) : true
         * (owner == null) : true
         */
         //Arrange Statement(s)
        Type type = null;
        Type[] typeArray = new Type[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            TypeUtils.parameterizeWithOwner(type, Object.class, typeArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${parameterizeWithOwner1WhenOwnerIsNotNullThrowsIllegalArgumentException}, hash: 1E7AA8B31E8914E898E56E09F620CCD5
    @Test()
    void parameterizeWithOwner1WhenOwnerIsNotNullThrowsIllegalArgumentException() {
        /* Branches:
         * (rawClass.getEnclosingClass() == null) : true
         * (owner == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            TypeUtils.parameterizeWithOwner(typeMock, Object.class, typeArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${parameterizeWithOwner1WhenRawClassGetTypeParametersLengthEqualsTypeArgumentsLengthThrowsIllegalArgumentException}, hash: 1EC66B2DE618487C09BADEFD70A5315D
    @Test()
    void parameterizeWithOwner1WhenRawClassGetTypeParametersLengthEqualsTypeArgumentsLengthThrowsIllegalArgumentException() {
        /* Branches:
         * (rawClass.getEnclosingClass() == null) : false
         * (owner == null) : true
         * (rawClass.getTypeParameters().length == typeArguments.length) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type type = null;
        Type[] typeArray = new Type[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            TypeUtils.parameterizeWithOwner(type, Object.class, typeArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${parameterizeWithOwner1WhenToClassIsNullThrowsIllegalArgumentException}, hash: CE887144450C834EEEE5E3C387FAB251
    @Test()
    void parameterizeWithOwner1WhenToClassIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (rawClass.getEnclosingClass() == null) : false
         * (owner == null) : false
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            TypeUtils.parameterizeWithOwner(typeMock, Object.class, typeArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${parameterizeWithOwner1WhenToClassEqualsTypeAndRawClassGetTypeParametersLengthEqualsTypeArThrowsIllegalArgumentException}, hash: E214EE1687407D43E0465A4745B7B90E
    @Test()
    void parameterizeWithOwner1WhenToClassEqualsTypeAndRawClassGetTypeParametersLengthEqualsTypeArThrowsIllegalArgumentException() {
        /* Branches:
         * (rawClass.getEnclosingClass() == null) : false
         * (owner == null) : false
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (rawClass.getTypeParameters().length == typeArguments.length) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            TypeUtils.parameterizeWithOwner(typeMock, Object.class, typeArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${parameterizeWithOwner1WhenClassUtilsNotIsAssignableTypeToClassThrowsIllegalArgumentException}, hash: 82A73B7B9E095EF9C68F759C16647310
    @Test()
    void parameterizeWithOwner1WhenClassUtilsNotIsAssignableTypeToClassThrowsIllegalArgumentException() {
        /* Branches:
         * (rawClass.getEnclosingClass() == null) : false
         * (owner == null) : false
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            TypeUtils.parameterizeWithOwner((Type) Object.class, Object.class, typeArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${parameterizeWithOwner1WhenClassUtilsIsAssignableTypeToClassAndRawClassGetTypeParametersLeThrowsIllegalArgumentException}, hash: 89AC969383E17596882CD1FABFE17F38
    @Test()
    void parameterizeWithOwner1WhenClassUtilsIsAssignableTypeToClassAndRawClassGetTypeParametersLeThrowsIllegalArgumentException() {
        /* Branches:
         * (rawClass.getEnclosingClass() == null) : false
         * (owner == null) : false
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (rawClass.getTypeParameters().length == typeArguments.length) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] { typeMock };
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            TypeUtils.parameterizeWithOwner((Type) Object.class, Object.class, typeArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${parameterizeWithOwner1WhenRawTypeNotInstanceOfClass_ThrowsIllegalStateException}, hash: 04C1CD1080E4F5D02F4D91E286A18CBE
    @Test()
    void parameterizeWithOwner1WhenRawTypeNotInstanceOfClass_ThrowsIllegalStateException() {
        /* Branches:
         * (rawClass.getEnclosingClass() == null) : false
         * (owner == null) : false
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : true  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : true  #  inside getRawType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] {};
        IllegalStateException illegalStateException = new IllegalStateException("Wait... What!? Type of rawType: type");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.parameterizeWithOwner((Type) parameterizedTypeMock, Object.class, typeArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${parameterizeWithOwner1WhenRawTypeInstanceOfClass_AndRawClassGetTypeParametersLengthNotEquThrowsIllegalArgumentException}, hash: 7C40A53860C8ECB07A25A88AFBA83706
    @Test()
    void parameterizeWithOwner1WhenRawTypeInstanceOfClass_AndRawClassGetTypeParametersLengthNotEquThrowsIllegalArgumentException() {
        /* Branches:
         * (rawClass.getEnclosingClass() == null) : false
         * (owner == null) : false
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : true  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (rawClass.getTypeParameters().length == typeArguments.length) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] { typeMock };
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            TypeUtils.parameterizeWithOwner((Type) parameterizedTypeMock, Object.class, typeArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${parameterizeWithOwner1WhenIsAssignableNotBoundToClassThrowsIllegalArgumentException}, hash: C83FA19C5136D9CB6D7579351CB38F9A
    @Test()
    void parameterizeWithOwner1WhenIsAssignableNotBoundToClassThrowsIllegalArgumentException() {
        /* Branches:
         * (rawClass.getEnclosingClass() == null) : false
         * (owner == null) : false
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : true  #  inside isAssignable method
         * (for-each(((TypeVariable<?>) type).getBounds())) : true  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            TypeUtils.parameterizeWithOwner((Type) typeVariableMock, Object.class, typeArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${parameterizeWithOwner1WhenTypeInstanceOfWildcardTypeThrowsIllegalArgumentException}, hash: 40A21F545122E5F47B1A8CE311A725AC
    @Test()
    void parameterizeWithOwner1WhenTypeInstanceOfWildcardTypeThrowsIllegalArgumentException() {
        /* Branches:
         * (rawClass.getEnclosingClass() == null) : false
         * (owner == null) : false
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (type instanceof WildcardType) : true  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            TypeUtils.parameterizeWithOwner((Type) wildcardTypeMock, Object.class, typeArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${parameterizeWithOwner1WhenTypeNotInstanceOfWildcardTypeThrowsIllegalStateException}, hash: D422501205120E28F6EBEC9320EE05BF
    @Test()
    void parameterizeWithOwner1WhenTypeNotInstanceOfWildcardTypeThrowsIllegalStateException() {
        /* Branches:
         * (rawClass.getEnclosingClass() == null) : false
         * (owner == null) : false
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (type instanceof WildcardType) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type typeMock = mock(Type.class, "owner");
        Type[] typeArray = new Type[] {};
        IllegalStateException illegalStateException = new IllegalStateException("found an unhandled type: owner");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            TypeUtils.parameterizeWithOwner(typeMock, Object.class, typeArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${parameterizeWithOwner1WhenIsAssignableBoundToClassAndRawClassGetTypeParametersLengthNotEqThrowsIllegalArgumentException}, hash: D6F84017477DBDF54A23FFD0A30222E6
    @Test()
    void parameterizeWithOwner1WhenIsAssignableBoundToClassAndRawClassGetTypeParametersLengthNotEqThrowsIllegalArgumentException() {
        /* Branches:
         * (rawClass.getEnclosingClass() == null) : false
         * (owner == null) : false
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : true  #  inside isAssignable method
         * (for-each(((TypeVariable<?>) type).getBounds())) : true  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : true  #  inside isAssignable method
         * (rawClass.getTypeParameters().length == typeArguments.length) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            TypeUtils.parameterizeWithOwner((Type) typeVariableMock, Object.class, typeArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${parameterizeWithOwner1WhenIsAssignableNotTypeGetGenericComponentTypeToClassGetComponentTyThrowsIllegalArgumentException}, hash: 434D2082DBDA616AA0DCD0FFF5E8E1B0
    @Test()
    void parameterizeWithOwner1WhenIsAssignableNotTypeGetGenericComponentTypeToClassGetComponentTyThrowsIllegalArgumentException() {
        /* Branches:
         * (rawClass.getEnclosingClass() == null) : false
         * (owner == null) : false
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : true  #  inside isAssignable method
         * (toClass.equals(Object.class)) : false  #  inside isAssignable method
         * (toClass.isArray()) : true  #  inside isAssignable method
         * (isAssignable(((GenericArrayType) type).getGenericComponentType(), toClass.getComponentType())) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] {};
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            TypeUtils.parameterizeWithOwner((Type) genericArrayTypeMock, Object.class, typeArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${parameterizeWithOwner1WhenIsAssignableTypeGetGenericComponentTypeToClassGetComponentTypeAThrowsIllegalArgumentException}, hash: 83C773B37F8D478C851A4A471EB2DD07
    @Test()
    void parameterizeWithOwner1WhenIsAssignableTypeGetGenericComponentTypeToClassGetComponentTypeAThrowsIllegalArgumentException() {
        /* Branches:
         * (rawClass.getEnclosingClass() == null) : false
         * (owner == null) : false
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : true  #  inside isAssignable method
         * (toClass.equals(Object.class)) : false  #  inside isAssignable method
         * (toClass.isArray()) : true  #  inside isAssignable method
         * (isAssignable(((GenericArrayType) type).getGenericComponentType(), toClass.getComponentType())) : true  #  inside isAssignable method
         * (rawClass.getTypeParameters().length == typeArguments.length) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Type[] typeArray = new Type[] { typeMock };
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            TypeUtils.parameterizeWithOwner((Type) genericArrayTypeMock, Object.class, typeArray);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${toLongStringWhenBoundsLengthNotGreaterThan0}, hash: 57898EF32F7AA08D4B429106825D33B0
    @Test()
    void toLongStringWhenBoundsLengthNotGreaterThan0() {
        /* Branches:
         * (d instanceof Class<?>) : false
         * (d instanceof Type) : false
         * (bounds.length > 0) : false  #  inside typeVariableToString method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = TypeUtils.toLongString(typeVariableMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("genericDeclaration:A")));
    }

    //Sapient generated method id: ${toLongStringWhenILessThanTypesLength}, hash: A85BB5D6C11A93830ECC0343E4A32BDD
    @Test()
    void toLongStringWhenILessThanTypesLength() {
        /* Branches:
         * (d instanceof Class<?>) : true
         * (c.getEnclosingClass() == null) : true
         * (bounds.length > 0) : true  #  inside typeVariableToString method
         * (!(bounds.length == 1 && Object.class.equals(bounds[0]))) : false  #  inside typeVariableToString method
         * (types.length > 0) : true  #  inside appendAllTo method
         * (object instanceof Type) : true  #  inside toString method
         * (i < types.length) : true  #  inside appendAllTo method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = TypeUtils.toLongString(typeVariableMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(": extends  & ")));
    }

    //Sapient generated method id: ${toString1WhenObjectInstanceOfType}, hash: 6E92752722AD02C93DA18C1A7DE75EE1
    @Test()
    void toString1WhenObjectInstanceOfType() {
        /* Branches:
         * (type instanceof Class<?>) : true
         * (cls.isArray()) : true  #  inside classToString method
         * (object instanceof Type) : true  #  inside toString method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = TypeUtils.toString((Type) Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("A[]")));
    }

    //Sapient generated method id: ${toString1WhenClsGetTypeParametersLengthGreaterThan0AndTypesLengthNotGreaterThan0}, hash: 362B7F807BE6B57D741EE3AEB78A0A1B
    @Test()
    void toString1WhenClsGetTypeParametersLengthGreaterThan0AndTypesLengthNotGreaterThan0() {
        /* Branches:
         * (type instanceof Class<?>) : true
         * (cls.isArray()) : false  #  inside classToString method
         * (cls.getEnclosingClass() != null) : false  #  inside classToString method
         * (cls.getTypeParameters().length > 0) : true  #  inside classToString method
         * (types.length > 0) : false  #  inside appendAllTo method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = TypeUtils.toString((Type) Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("java.lang.Object<>")));
    }

    //Sapient generated method id: ${toString1WhenTypeNotInstanceOfGenericArrayTypeThrowsIllegalArgumentException}, hash: C6637866A1C71DCC62A5E7EBD580FCF8
    @Test()
    void toString1WhenTypeNotInstanceOfGenericArrayTypeThrowsIllegalArgumentException() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof WildcardType) : false
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof GenericArrayType) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            TypeUtils.toString(typeMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${toString1WhenTypeInstanceOfGenericArrayTypeAndObjectInstanceOfType}, hash: F7332B6BB5C830EB6FE566C901E6A086
    @Test()
    void toString1WhenTypeInstanceOfGenericArrayTypeAndObjectInstanceOfType() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof WildcardType) : false
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof GenericArrayType) : true
         * (object instanceof Type) : true  #  inside toString method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = TypeUtils.toString((Type) genericArrayTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("A[]")));
    }

    //Sapient generated method id: ${toString1WhenILessThanTypesLength}, hash: 17B56A183107E6D83E14644F71FE0830
    @Test()
    void toString1WhenILessThanTypesLength() {
        /* Branches:
         * (type instanceof Class<?>) : true
         * (cls.isArray()) : false  #  inside classToString method
         * (cls.getEnclosingClass() != null) : true  #  inside classToString method
         * (cls.getTypeParameters().length > 0) : true  #  inside classToString method
         * (types.length > 0) : true  #  inside appendAllTo method
         * (object instanceof Type) : true  #  inside toString method
         * (i < types.length) : true  #  inside appendAllTo method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = TypeUtils.toString((Type) Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(".Object<, >")));
    }

    //Sapient generated method id: ${toString1WhenINotLessThanFilteredArgumentTypesLengthAndRecursiveTypeIndexesLengthNotGreaterThan0AndTypesLengthNotGreate}, hash: D7D992505701A74A427CFDFAEDBC3817
    @Test()
    void toString1WhenINotLessThanFilteredArgumentTypesLengthAndRecursiveTypeIndexesLengthNotGreaterThan0AndTypesLengthNotGreate() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : true
         * (useOwner == null) : false  #  inside parameterizedTypeToString method
         * (useOwner instanceof Class<?>) : true  #  inside parameterizedTypeToString method
         * (i < filteredArgumentTypes.length) : false  #  inside findRecursiveTypes method
         * (recursiveTypeIndexes.length > 0) : false  #  inside parameterizedTypeToString method
         * (types.length > 0) : false  #  inside appendAllTo method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = TypeUtils.toString((Type) parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("java.lang.Object.Object<>")));
    }

    //Sapient generated method id: ${toString1WhenRecursiveTypeIndexesLengthNotGreaterThan0AndTypesLengthNotGreaterThan02}, hash: DBA804B1E88A8776B94CB91AC29C140C
    @Test()
    void toString1WhenRecursiveTypeIndexesLengthNotGreaterThan0AndTypesLengthNotGreaterThan02() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : true
         * (useOwner == null) : false  #  inside parameterizedTypeToString method
         * (useOwner instanceof Class<?>) : false  #  inside parameterizedTypeToString method
         * (i < filteredArgumentTypes.length) : false  #  inside findRecursiveTypes method
         * (recursiveTypeIndexes.length > 0) : false  #  inside parameterizedTypeToString method
         * (types.length > 0) : false  #  inside appendAllTo method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = TypeUtils.toString((Type) parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("type3.Object<>")));
    }

    //Sapient generated method id: ${toString1WhenObjectInstanceOfTypeAndILessThanTypesLength}, hash: 64EEB77592E53E1D4127693ED8AED016
    @Test()
    void toString1WhenObjectInstanceOfTypeAndILessThanTypesLength() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof WildcardType) : true
         * (lowerBounds.length > 1) : false  #  inside wildcardTypeToString method
         * (lowerBounds.length == 1) : true  #  inside wildcardTypeToString method
         * (lowerBounds[0] != null) : true  #  inside wildcardTypeToString method
         * (types.length > 0) : true  #  inside appendAllTo method
         * (object instanceof Type) : true  #  inside toString method
         * (i < types.length) : true  #  inside appendAllTo method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = TypeUtils.toString((Type) wildcardTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${toString1WhenTypesLengthGreaterThan0AndObjectInstanceOfTypeAndILessThanTypesLength}, hash: 136DC87B20F3B38ECA66821A8AF756C4
    @Test()
    void toString1WhenTypesLengthGreaterThan0AndObjectInstanceOfTypeAndILessThanTypesLength() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof WildcardType) : false
         * (type instanceof TypeVariable<?>) : true
         * (bounds.length > 0) : true  #  inside typeVariableToString method
         * (!(bounds.length == 1 && Object.class.equals(bounds[0]))) : false  #  inside typeVariableToString method
         * (types.length > 0) : true  #  inside appendAllTo method
         * (object instanceof Type) : true  #  inside toString method
         * (i < types.length) : true  #  inside appendAllTo method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = TypeUtils.toString((Type) typeVariableMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("A extends B & B")));
    }

    //Sapient generated method id: ${toString1WhenRecursiveTypeIndexesLengthNotGreaterThan0AndTypesLengthGreaterThan0AndObjectInstanceOfTypeAndILessThanType}, hash: 3B6F1B59DBA1E7B74B0C7A2A9D0FD766
    @Test()
    void toString1WhenRecursiveTypeIndexesLengthNotGreaterThan0AndTypesLengthGreaterThan0AndObjectInstanceOfTypeAndILessThanType() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : true
         * (useOwner == null) : true  #  inside parameterizedTypeToString method
         * (i < filteredArgumentTypes.length) : true  #  inside findRecursiveTypes method
         * (filteredArgumentTypes[i] instanceof TypeVariable<?>) : true  #  inside findRecursiveTypes method
         * (ArrayUtils.contains(typeVariable.getBounds(), parameterizedType)) : false  #  inside containsVariableTypeSameParametrizedTypeBound method
         * (containsVariableTypeSameParametrizedTypeBound((TypeVariable<?>) filteredArgumentTypes[i], parameterizedType)) : false  #  inside findRecursiveTypes method
         * (recursiveTypeIndexes.length > 0) : false  #  inside parameterizedTypeToString method
         * (types.length > 0) : true  #  inside appendAllTo method
         * (object instanceof Type) : true  #  inside toString method
         * (i < types.length) : true  #  inside appendAllTo method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = TypeUtils.toString((Type) parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("java.lang.Object<, >")));
    }

    //Sapient generated method id: ${toString1WhenObjectNotEquals0IndexOfUpperBoundsAndTypesLengthGreaterThan0AndObjectInstanceOfTypeAndILessThanTypesLength}, hash: 6664A2623ED81F64D878C96754ABDD7D
    @Test()
    void toString1WhenObjectNotEquals0IndexOfUpperBoundsAndTypesLengthGreaterThan0AndObjectInstanceOfTypeAndILessThanTypesLength() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof WildcardType) : true
         * (lowerBounds.length > 1) : false  #  inside wildcardTypeToString method
         * (lowerBounds.length == 1) : true  #  inside wildcardTypeToString method
         * (lowerBounds[0] != null) : false  #  inside wildcardTypeToString method
         * (upperBounds.length > 1) : false  #  inside wildcardTypeToString method
         * (upperBounds.length == 1) : true  #  inside wildcardTypeToString method
         * (!Object.class.equals(upperBounds[0])) : true  #  inside wildcardTypeToString method
         * (types.length > 0) : true  #  inside appendAllTo method
         * (object instanceof Type) : true  #  inside toString method
         * (i < types.length) : true  #  inside appendAllTo method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = TypeUtils.toString((Type) wildcardTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${toString1WhenArgumentsFilteredLengthGreaterThan0}, hash: B7FE67880EF200EADF2B1852B5FCFDF4
    @Test()
    void toString1WhenArgumentsFilteredLengthGreaterThan0() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : true
         * (useOwner == null) : true  #  inside parameterizedTypeToString method
         * (i < filteredArgumentTypes.length) : true  #  inside findRecursiveTypes method
         * (filteredArgumentTypes[i] instanceof TypeVariable<?>) : true  #  inside findRecursiveTypes method
         * (ArrayUtils.contains(typeVariable.getBounds(), parameterizedType)) : true  #  inside containsVariableTypeSameParametrizedTypeBound method
         * (containsVariableTypeSameParametrizedTypeBound((TypeVariable<?>) filteredArgumentTypes[i], parameterizedType)) : true  #  inside findRecursiveTypes method
         * (recursiveTypeIndexes.length > 0) : true  #  inside parameterizedTypeToString method
         * (i < recursiveTypeIndexes.length) : true  #  inside appendRecursiveTypes method
         * (types.length > 0) : true  #  inside appendAllTo method
         * (object instanceof Type) : false  #  inside toString method
         * (i < types.length) : false  #  inside appendAllTo method
         * (argumentsFiltered.length > 0) : true  #  inside appendRecursiveTypes method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        String result = TypeUtils.toString((Type) parameterizedTypeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("java.lang.Object<type7><type7, type7>")));
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenReplacementTypeIsNullThrowsIllegalArgumentException}, hash: 5E765EFB8EE9671203C13410D85F06C1
    @Test()
    void typesSatisfyVariablesWhenReplacementTypeIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : true  #  inside substituteTypeVariables method
         */
         //Arrange Statement(s)
        TypeVariable typeVariableMock = mock(TypeVariable.class, "type");
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { typeVariableMock };
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock, (Type) null);
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                TypeUtils.typesSatisfyVariables(anyMap);
            });
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("missing assignment type for type variable type");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVariableMap}, hash: 23A630DF800DFE5BFCE0186C62DBCF0F
    @Test()
    void typesSatisfyVariablesWhenIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVariableMap() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : true  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, parameterizedTypeMock);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenToClassNotIsPrimitiveAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVariabl}, hash: 5FA14781FFFF16C7E4956E449E56355E
    @Test()
    void typesSatisfyVariablesWhenToClassNotIsPrimitiveAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVariabl() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, Object.class);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenIsAssignableNotTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVariableMap}, hash: 0BAE459ECED4934896763E8DC324CF04
    @Test()
    void typesSatisfyVariablesWhenIsAssignableNotTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVariableMap() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : true  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : false  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, Object.class);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenToClassEqualsTypeAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVariableMap}, hash: 97FE7351707CACCCBCF1C9F4EB07D50D
    @Test()
    void typesSatisfyVariablesWhenToClassEqualsTypeAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVariableMap() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { typeVariableMock };
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock, Object.class);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenTypeInstanceOfGenericArrayTypeAndIsAssignableNotTypeSubstituteTypeVariablesBoundTypeVariableMa}, hash: 8A52A0B648EC0E818269BA6DD866C94F
    @Test()
    void typesSatisfyVariablesWhenTypeInstanceOfGenericArrayTypeAndIsAssignableNotTypeSubstituteTypeVariablesBoundTypeVariableMa() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : true  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, parameterizedTypeMock);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenClassUtilsIsAssignableTypeToClassAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMa}, hash: 9B4E7EF5261626E5E130B3D60FF940BF
    @Test()
    void typesSatisfyVariablesWhenClassUtilsIsAssignableTypeToClassAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMa() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, Object.class);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenClassUtilsNotIsAssignableTypeToClassAndIsAssignableNotTypeSubstituteTypeVariablesBoundTypeVari}, hash: EC47A58BD9C69748301CF4A0B9607D96
    @Test()
    void typesSatisfyVariablesWhenClassUtilsNotIsAssignableTypeToClassAndIsAssignableNotTypeSubstituteTypeVariablesBoundTypeVari() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : false  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, Object.class);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenRawTypeNotInstanceOfClass_ThrowsIllegalStateException}, hash: C30AE0E3E075C32BE5F6EDCE541D2776
    @Test()
    void typesSatisfyVariablesWhenRawTypeNotInstanceOfClass_ThrowsIllegalStateException() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : true  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : true  #  inside getRawType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, Object.class);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                TypeUtils.typesSatisfyVariables(anyMap);
            });
            IllegalStateException illegalStateException = new IllegalStateException("s1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenToParameterizedTypeEqualsTypeAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTyp}, hash: 4D0B3DA64613AC0BBB34DBFC6500CCFA
    @Test()
    void typesSatisfyVariablesWhenToParameterizedTypeEqualsTypeAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTyp() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] { typeVariableMock };
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock, parameterizedTypeMock);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenToParameterizedTypeNotEqualsTypeAndRawTypeNotInstanceOfClass_ThrowsIllegalStateException}, hash: 587122CB330AFC95150F28AA7750D2A5
    @Test()
    void typesSatisfyVariablesWhenToParameterizedTypeNotEqualsTypeAndRawTypeNotInstanceOfClass_ThrowsIllegalStateException() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : true  #  inside getRawType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, parameterizedTypeMock);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                TypeUtils.typesSatisfyVariables(anyMap);
            });
            IllegalStateException illegalStateException = new IllegalStateException("s1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenIsAssignableTypeToTypeAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVariab}, hash: 2502A8D4ADCDD36CD83F456054E29ABE
    @Test()
    void typesSatisfyVariablesWhenIsAssignableTypeToTypeAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVariab() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : true  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (isAssignable(type, (Class<?>) toType)) : true  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, Object.class);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenTypeNotInstanceOfWildcardTypeThrowsIllegalStateException}, hash: 38A8A378FEA257285B3069777912A41B
    @Test()
    void typesSatisfyVariablesWhenTypeNotInstanceOfWildcardTypeThrowsIllegalStateException() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (type instanceof WildcardType) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, Object.class);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                TypeUtils.typesSatisfyVariables(anyMap);
            });
            IllegalStateException illegalStateException = new IllegalStateException("s1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenIsAssignableBoundToClassAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVari}, hash: 77461F29DB026E0BEED6D0DF36F052BB
    @Test()
    void typesSatisfyVariablesWhenIsAssignableBoundToClassAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVari() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : true  #  inside isAssignable method
         * (for-each(((TypeVariable<?>) type).getBounds())) : true  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, Object.class);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenIsAssignableNotBoundToClassAndIsAssignableNotTypeSubstituteTypeVariablesBoundTypeVariableMapTy}, hash: 57DAF1465711CBC996889A256153436F
    @Test()
    void typesSatisfyVariablesWhenIsAssignableNotBoundToClassAndIsAssignableNotTypeSubstituteTypeVariablesBoundTypeVariableMapTy() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : true  #  inside isAssignable method
         * (for-each(((TypeVariable<?>) type).getBounds())) : true  #  inside isAssignable method
         * (isAssignable(bound, toClass)) : false  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, Object.class);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenTypeInstanceOfWildcardTypeAndIsAssignableNotTypeSubstituteTypeVariablesBoundTypeVariableMapTyp}, hash: 8AA2F02FF1F59F5150E83570C879417D
    @Test()
    void typesSatisfyVariablesWhenTypeInstanceOfWildcardTypeAndIsAssignableNotTypeSubstituteTypeVariablesBoundTypeVariableMapTyp() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (type instanceof WildcardType) : true  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, Object.class);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenIsAssignableTypeGetGenericComponentTypeToClassGetComponentTypeAndIsAssignableTypeSubstituteTyp}, hash: 512C6D0D0FFCC6E170D77E6E52637877
    @Test()
    void typesSatisfyVariablesWhenIsAssignableTypeGetGenericComponentTypeToClassGetComponentTypeAndIsAssignableTypeSubstituteTyp() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : true  #  inside isAssignable method
         * (toClass.equals(Object.class)) : false  #  inside isAssignable method
         * (toClass.isArray()) : true  #  inside isAssignable method
         * (isAssignable(((GenericArrayType) type).getGenericComponentType(), toClass.getComponentType())) : true  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, Object.class);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenIsAssignableNotTypeGetGenericComponentTypeToClassGetComponentTypeAndIsAssignableNotTypeSubstit}, hash: 8537EFD5EF9B6B597B3239FEC76955F1
    @Test()
    void typesSatisfyVariablesWhenIsAssignableNotTypeGetGenericComponentTypeToClassGetComponentTypeAndIsAssignableNotTypeSubstit() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : false  #  inside isAssignable method
         * (type instanceof ParameterizedType) : false  #  inside isAssignable method
         * (type instanceof TypeVariable<?>) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : true  #  inside isAssignable method
         * (toClass.equals(Object.class)) : false  #  inside isAssignable method
         * (toClass.isArray()) : true  #  inside isAssignable method
         * (isAssignable(((GenericArrayType) type).getGenericComponentType(), toClass.getComponentType())) : false  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, Object.class);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenFromTypeVarAssignsIsNullAndIsAssignableNotTypeSubstituteTypeVariablesBoundTypeVariableMapTypeV}, hash: C33C9D972DC91CB1E277CC9CE08CF45A
    @Test()
    void typesSatisfyVariablesWhenFromTypeVarAssignsIsNullAndIsAssignableNotTypeSubstituteTypeVariablesBoundTypeVariableMapTypeV() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         * (fromTypeVarAssigns == null) : true  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, parameterizedTypeMock);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenFromTypeVarAssignsIsEmptyAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVar}, hash: EFD4FF56145A7F84EFF24FA0DD15D055
    @Test()
    void typesSatisfyVariablesWhenFromTypeVarAssignsIsEmptyAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVar() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : true  #  inside getTypeArguments method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : true  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, parameterizedTypeMock);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenFromTypeVarAssignsIsEmptyAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVar2}, hash: 94A99834614335FBF32A1A9982B9E806
    @Test()
    void typesSatisfyVariablesWhenFromTypeVarAssignsIsEmptyAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVar2() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : true  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, parameterizedTypeMock);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenMidTypeInstanceOfParameterizedTypeThrowsIllegalStateException}, hash: D91473EB754EC7D390A055595C354A7F
    @Test()
    void typesSatisfyVariablesWhenMidTypeInstanceOfParameterizedTypeThrowsIllegalStateException() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, parameterizedTypeMock);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                TypeUtils.typesSatisfyVariables(anyMap);
            });
            IllegalStateException illegalStateException = new IllegalStateException("s1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenFromTypeVarAssignsNotIsEmptyThrowsIllegalStateException}, hash: 48B1C2F97987FF2535D2473E1A9C2D08
    @Test()
    void typesSatisfyVariablesWhenFromTypeVarAssignsNotIsEmptyThrowsIllegalStateException() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, parameterizedTypeMock);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                TypeUtils.typesSatisfyVariables(anyMap);
            });
            IllegalStateException illegalStateException = new IllegalStateException("s1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenIsAssignableNotClsToClassThrowsNullPointerException}, hash: 174D51AF1667FD6D704AEA1565EF7F11
    @Test()
    void typesSatisfyVariablesWhenIsAssignableNotClsToClassThrowsNullPointerException() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, parameterizedTypeMock);
            //Act Statement(s)
            final NullPointerException result = assertThrows(NullPointerException.class, () -> {
                TypeUtils.typesSatisfyVariables(anyMap);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenOwnerTypeInstanceOfParameterizedTypeThrowsIllegalStateException}, hash: 237D6BB659A74588870F1E8A1006C155
    @Test()
    void typesSatisfyVariablesWhenOwnerTypeInstanceOfParameterizedTypeThrowsIllegalStateException() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, parameterizedTypeMock);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                TypeUtils.typesSatisfyVariables(anyMap);
            });
            IllegalStateException illegalStateException = new IllegalStateException("s1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenOwnerTypeInstanceOfParameterizedTypeThrowsNullPointerException}, hash: 525915498FC174A4E95926EEE14CD4AF
    @Test()
    void typesSatisfyVariablesWhenOwnerTypeInstanceOfParameterizedTypeThrowsNullPointerException() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : true  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, parameterizedTypeMock);
            //Act Statement(s)
            final NullPointerException result = assertThrows(NullPointerException.class, () -> {
                TypeUtils.typesSatisfyVariables(anyMap);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenToClassNotEqualsClsThrowsIllegalStateException}, hash: 8087803BEF5543ADFFC754E26B7B3AA4
    @Test()
    void typesSatisfyVariablesWhenToClassNotEqualsClsThrowsIllegalStateException() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, parameterizedTypeMock);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                TypeUtils.typesSatisfyVariables(anyMap);
            });
            IllegalStateException illegalStateException = new IllegalStateException("s1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenFromTypeArgInstanceOfClassAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVa}, hash: 47D7C162FB88DAE9597193FFF6A5E49C
    @Test()
    void typesSatisfyVariablesWhenFromTypeArgInstanceOfClassAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVa() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         * (for-each(toTypeVarAssigns.keySet())) : true  #  inside isAssignable method
         * (!(result instanceof TypeVariable<?>)) : true  #  inside unrollVariableAssignments method
         * (toTypeArg == null) : true  #  inside isAssignable method
         * (fromTypeArg instanceof Class) : true  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, parameterizedTypeMock);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenFromTypeArgIsNullAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVariableMap3}, hash: D86E2E3CBE2421B418D127861B766A07
    @Test()
    void typesSatisfyVariablesWhenFromTypeArgIsNullAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVariableMapTypeVariableMap3() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         * (for-each(toTypeVarAssigns.keySet())) : true  #  inside isAssignable method
         * (!(result instanceof TypeVariable<?>)) : false  #  inside unrollVariableAssignments method
         * (result.equals(typeVariable)) : false  #  inside unrollVariableAssignments method
         * (toTypeArg == null) : false  #  inside isAssignable method
         * (fromTypeArg != null) : false  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, parameterizedTypeMock);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenToTypeArgNotEqualsFromTypeArgAndIsAssignableNotTypeSubstituteTypeVariablesBoundTypeVariableMap}, hash: C559465B8B4BF5F6983A71FE2BAD39A4
    @Test()
    void typesSatisfyVariablesWhenToTypeArgNotEqualsFromTypeArgAndIsAssignableNotTypeSubstituteTypeVariablesBoundTypeVariableMap() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         * (for-each(toTypeVarAssigns.keySet())) : true  #  inside isAssignable method
         * (!(result instanceof TypeVariable<?>)) : false  #  inside unrollVariableAssignments method
         * (result.equals(typeVariable)) : true  #  inside unrollVariableAssignments method
         * (toTypeArg == null) : false  #  inside isAssignable method
         * (fromTypeArg != null) : true  #  inside isAssignable method
         * (toTypeArg != null) : true  #  inside isAssignable method
         * (!toTypeArg.equals(fromTypeArg)) : true  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, parameterizedTypeMock);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenToTypeArgNotEqualsFromTypeArgAndIsAssignableNotTypeSubstituteTypeVariablesBoundTypeVariableMap2}, hash: D55566594FE121B6324BBCD4633D8EDC
    @Test()
    void typesSatisfyVariablesWhenToTypeArgNotEqualsFromTypeArgAndIsAssignableNotTypeSubstituteTypeVariablesBoundTypeVariableMap2() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (i < typeParams.length) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : true  #  inside getTypeArguments method
         * (for-each(toTypeVarAssigns.keySet())) : true  #  inside isAssignable method
         * (!(result instanceof TypeVariable<?>)) : false  #  inside unrollVariableAssignments method
         * (result.equals(typeVariable)) : true  #  inside unrollVariableAssignments method
         * (toTypeArg == null) : false  #  inside isAssignable method
         * (fromTypeArg != null) : true  #  inside isAssignable method
         * (toTypeArg != null) : true  #  inside isAssignable method
         * (!toTypeArg.equals(fromTypeArg)) : true  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, parameterizedTypeMock);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${typesSatisfyVariablesWhenFromTypeArgIsNotNullAndToTypeArgIsNullAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVaria}, hash: 963C05DE26799A0025C1C11AC915603D
    @Test()
    void typesSatisfyVariablesWhenFromTypeArgIsNotNullAndToTypeArgIsNullAndIsAssignableTypeSubstituteTypeVariablesBoundTypeVaria() {
        /* Branches:
         * (for-each(typeVariableMap.entrySet())) : true
         * (for-each(getImplicitBounds(typeVar))) : true
         * (type instanceof TypeVariable<?>) : true  #  inside substituteTypeVariables method
         * (typeVarAssigns != null) : true  #  inside substituteTypeVariables method
         * (replacementType == null) : false  #  inside substituteTypeVariables method
         * (toType == null) : false  #  inside isAssignable method
         * (toType instanceof Class<?>) : false  #  inside isAssignable method
         * (toType instanceof ParameterizedType) : true  #  inside isAssignable method
         * (type == null) : false  #  inside isAssignable method
         * (toParameterizedType == null) : false  #  inside isAssignable method
         * (type instanceof GenericArrayType) : false  #  inside isAssignable method
         * (toParameterizedType.equals(type)) : false  #  inside isAssignable method
         * (!(rawType instanceof Class<?>)) : false  #  inside getRawType method
         * (type instanceof Class<?>) : true  #  inside getTypeArguments method
         * (type == null) : false  #  inside isAssignable method
         * (toClass == null) : false  #  inside isAssignable method
         * (toClass.equals(type)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (cls.isPrimitive()) : true  #  inside getTypeArguments method
         * (toClass.isPrimitive()) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : true  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (superClass.isInterface()) : true  #  inside getClosestParentType method
         * (for-each(interfaceTypes)) : true  #  inside getClosestParentType method
         * (midType instanceof ParameterizedType) : true  #  inside getClosestParentType method
         * (toClass == null) : false  #  inside isAssignable method
         * (!toClass.isPrimitive()) : true  #  inside isAssignable method
         * (isAssignable(midClass, superClass)) : true  #  inside getClosestParentType method
         * (isAssignable(genericInterface, (Type) midClass)) : true  #  inside getClosestParentType method
         * (genericInterface != null) : true  #  inside getClosestParentType method
         * (fromTypeVarAssigns == null) : false  #  inside isAssignable method
         * (fromTypeVarAssigns.isEmpty()) : false  #  inside isAssignable method
         * (type instanceof Class<?>) : true  #  inside isAssignable method
         * (ClassUtils.isAssignable((Class<?>) type, toClass)) : true  #  inside isAssignable method
         * (!isAssignable(cls, toClass)) : false  #  inside getTypeArguments method
         * (ownerType instanceof ParameterizedType) : false  #  inside getTypeArguments method
         * (subtypeVarAssigns == null) : false  #  inside getTypeArguments method
         * (i < typeParams.length) : false  #  inside getTypeArguments method
         * (toClass.equals(cls)) : false  #  inside getTypeArguments method
         * (type instanceof ParameterizedType) : true  #  inside getTypeArguments method
         * (for-each(toTypeVarAssigns.keySet())) : true  #  inside isAssignable method
         * (!(result instanceof TypeVariable<?>)) : true  #  inside unrollVariableAssignments method
         * (toTypeArg == null) : true  #  inside isAssignable method
         * (fromTypeArg instanceof Class) : false  #  inside isAssignable method
         * (fromTypeArg != null) : true  #  inside isAssignable method
         * (toTypeArg != null) : false  #  inside isAssignable method
         * (!isAssignable(type, substituteTypeVariables(bound, typeVariableMap), typeVariableMap)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[] {};
            typeUtils.when(() -> TypeUtils.getImplicitBounds(typeVariableMock)).thenReturn(typeArray);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            anyMap.put(typeVariableMock2, parameterizedTypeMock);
            //Act Statement(s)
            boolean result = TypeUtils.typesSatisfyVariables(anyMap);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                typeUtils.verify(() -> TypeUtils.getImplicitBounds(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${unrollVariablesWhenTypeInstanceOfTypeVariable_}, hash: 05F9DDE9E8187313C560B383AD09D47E
    @Test()
    void unrollVariablesWhenTypeInstanceOfTypeVariable_() {
        /* Branches:
         * (typeArguments == null) : true
         * (containsTypeVariables(type)) : true
         * (type instanceof TypeVariable<?>) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            typeUtils.when(() -> TypeUtils.containsTypeVariables(typeVariableMock)).thenReturn(true);
            Map<TypeVariable<?>, Type> map = null;
            //Act Statement(s)
            Type result = TypeUtils.unrollVariables(map, typeVariableMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                typeUtils.verify(() -> TypeUtils.containsTypeVariables(typeVariableMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${unrollVariablesWhenTypeNotInstanceOfWildcardType}, hash: A06B5E4BFCC01FCACF868C423842B5E5
    @Test()
    void unrollVariablesWhenTypeNotInstanceOfWildcardType() {
        /* Branches:
         * (typeArguments == null) : true
         * (containsTypeVariables(type)) : true
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof WildcardType) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            typeUtils.when(() -> TypeUtils.containsTypeVariables(typeMock)).thenReturn(true);
            Map<TypeVariable<?>, Type> map = null;
            //Act Statement(s)
            Type result = TypeUtils.unrollVariables(map, typeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(typeMock));
                typeUtils.verify(() -> TypeUtils.containsTypeVariables(typeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${unrollVariablesWhenUnrolledIsNotNull}, hash: 437E574D9E69B667D3F37BF556433583
    @Test()
    void unrollVariablesWhenUnrolledIsNotNull() {
        /* Branches:
         * (typeArguments == null) : true
         * (containsTypeVariables(type)) : true
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof ParameterizedType) : true
         * (p.getOwnerType() == null) : true
         * (i < args.length) : true
         * (unrolled != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            typeUtils.when(() -> TypeUtils.containsTypeVariables(parameterizedTypeMock)).thenReturn(true);
            Type[] typeArray = new Type[] { typeMock2 };
            typeUtils.when(() -> TypeUtils.parameterizeWithOwner(typeMock, Object.class, typeArray)).thenReturn(parameterizedTypeMock2);
            Map<TypeVariable<?>, Type> map = null;
            //Act Statement(s)
            Type result = TypeUtils.unrollVariables(map, parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(parameterizedTypeMock2));
                typeUtils.verify(() -> TypeUtils.containsTypeVariables(parameterizedTypeMock), atLeast(1));
                typeUtils.verify(() -> TypeUtils.parameterizeWithOwner(typeMock, Object.class, typeArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${unrollVariablesWhenILessThanArgsLengthAndUnrolledIsNotNull}, hash: 8307B2EA2F4E347DD5047E8CBE0F1E60
    @Test()
    void unrollVariablesWhenILessThanArgsLengthAndUnrolledIsNotNull() {
        /* Branches:
         * (typeArguments == null) : true
         * (containsTypeVariables(type)) : true
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof ParameterizedType) : true
         * (p.getOwnerType() == null) : false
         * (i < args.length) : true
         * (unrolled != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            typeUtils.when(() -> TypeUtils.containsTypeVariables(parameterizedTypeMock)).thenReturn(true);
            Map<TypeVariable<?>, Type> anyMap = new HashMap<>();
            typeUtils.when(() -> TypeUtils.getTypeArguments(parameterizedTypeMock)).thenReturn(anyMap);
            Type[] typeArray = new Type[] { typeMock2 };
            typeUtils.when(() -> TypeUtils.parameterizeWithOwner(typeMock, Object.class, typeArray)).thenReturn(parameterizedTypeMock2);
            Map<TypeVariable<?>, Type> map = null;
            //Act Statement(s)
            Type result = TypeUtils.unrollVariables(map, parameterizedTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(parameterizedTypeMock2));
                typeUtils.verify(() -> TypeUtils.containsTypeVariables(parameterizedTypeMock), atLeast(1));
                typeUtils.verify(() -> TypeUtils.getTypeArguments(parameterizedTypeMock), atLeast(1));
                typeUtils.verify(() -> TypeUtils.parameterizeWithOwner(typeMock, Object.class, typeArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${unrollVariablesWhenILessThanResultLengthAndUnrolledIsNull}, hash: 4081C877C5112A6CA0480FD0D0AC425F
    @Test()
    void unrollVariablesWhenILessThanResultLengthAndUnrolledIsNull() {
        /* Branches:
         * (typeArguments == null) : true
         * (containsTypeVariables(type)) : true
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof WildcardType) : true
         * (i < result.length) : true  #  inside unrollBounds method
         * (unrolled == null) : true  #  inside unrollBounds method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            typeUtils.when(() -> TypeUtils.containsTypeVariables(wildcardTypeMock)).thenReturn(true);
            typeUtils.when(() -> TypeUtils.wildcardType()).thenReturn(typeUtilsWildcardTypeBuilderMock);
            Map<TypeVariable<?>, Type> map = null;
            //Act Statement(s)
            Type result = TypeUtils.unrollVariables(map, wildcardTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                typeUtils.verify(() -> TypeUtils.containsTypeVariables(wildcardTypeMock), atLeast(1));
                typeUtils.verify(() -> TypeUtils.wildcardType(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${unrollVariablesWhenTypeNotInstanceOfParameterizedTypeAndTypeInstanceOfWildcardTypeAndILessThanResultLengthAndUnrolledIs}, hash: 5D15A7351A4923C3AA5658B8958CA500
    @Test()
    void unrollVariablesWhenTypeNotInstanceOfParameterizedTypeAndTypeInstanceOfWildcardTypeAndILessThanResultLengthAndUnrolledIs() {
        /* Branches:
         * (typeArguments == null) : true
         * (containsTypeVariables(type)) : true
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof WildcardType) : true
         * (i < result.length) : true  #  inside unrollBounds method
         * (unrolled == null) : true  #  inside unrollBounds method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            typeUtils.when(() -> TypeUtils.containsTypeVariables(wildcardTypeMock)).thenReturn(true);
            typeUtils.when(() -> TypeUtils.wildcardType()).thenReturn(typeUtilsWildcardTypeBuilderMock);
            Map<TypeVariable<?>, Type> map = null;
            //Act Statement(s)
            Type result = TypeUtils.unrollVariables(map, wildcardTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                typeUtils.verify(() -> TypeUtils.containsTypeVariables(wildcardTypeMock), atLeast(1));
                typeUtils.verify(() -> TypeUtils.wildcardType(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${unrollVariablesWhenILessThanResultLengthAndUnrolledIsNotNull}, hash: 8B5604464A298B19BF912FC359EA82EA
    @Test()
    void unrollVariablesWhenILessThanResultLengthAndUnrolledIsNotNull() {
        /* Branches:
         * (typeArguments == null) : true
         * (containsTypeVariables(type)) : true
         * (type instanceof TypeVariable<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof WildcardType) : true
         * (i < result.length) : true  #  inside unrollBounds method
         * (unrolled == null) : false  #  inside unrollBounds method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<TypeUtils> typeUtils = mockStatic(TypeUtils.class, CALLS_REAL_METHODS)) {
            typeUtils.when(() -> TypeUtils.containsTypeVariables(wildcardTypeMock)).thenReturn(true);
            typeUtils.when(() -> TypeUtils.wildcardType()).thenReturn(typeUtilsWildcardTypeBuilderMock);
            Map<TypeVariable<?>, Type> map = null;
            //Act Statement(s)
            Type result = TypeUtils.unrollVariables(map, wildcardTypeMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                typeUtils.verify(() -> TypeUtils.containsTypeVariables(wildcardTypeMock), atLeast(1));
                typeUtils.verify(() -> TypeUtils.wildcardType(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${wildcardTypeTest}, hash: B9B0E916A62F981A2F27F667C3BFB2F6
    @Test()
    void wildcardTypeTest() {
        
        //Act Statement(s)
        TypeUtils.WildcardTypeBuilder result = TypeUtils.wildcardType();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${wrapTest}, hash: AD534969B2482A1C0C6326ACE09D5F80
    @Test()
    void wrapTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        Typed result = TypeUtils.wrap(Object.class);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${wrap1Test}, hash: 33AE4FB648DBE783092A3EEF6CD76BDD
    @Test()
    void wrap1Test() {
        
        //Act Statement(s)
        Typed result = TypeUtils.wrap(typeMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
