package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ClassPathUtilsSapientGeneratedTest {

    //Sapient generated method id: ${fc0fcab4-671b-34c5-8631-31388dcc9d01}
    @Test()
    void packageToPathTest() {
        //Act Statement(s)
        String result = ClassPathUtils.packageToPath("/");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("/")));
    }

    //Sapient generated method id: ${b5ddb74e-4373-3e98-a56c-ff335b9aa8d5}
    @Test()
    void pathToPackageTest() {
        //Act Statement(s)
        String result = ClassPathUtils.pathToPackage(".");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(".")));
    }

    //Sapient generated method id: ${bd527fb8-2ab2-3834-8979-78ca610008e0}
    @Test()
    void toFullyQualifiedNameTest() {
        //Arrange Statement(s)
        try (MockedStatic<ClassPathUtils> classPathUtils = mockStatic(ClassPathUtils.class, CALLS_REAL_METHODS)) {
            classPathUtils.when(() -> ClassPathUtils.toFullyQualifiedName((Package) any(), eq("resourceName1"))).thenReturn("return_of_toFullyQualifiedName1");
            //Act Statement(s)
            String result = ClassPathUtils.toFullyQualifiedName(Object.class, "resourceName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toFullyQualifiedName1"));
                classPathUtils.verify(() -> ClassPathUtils.toFullyQualifiedName((Package) any(), eq("resourceName1")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${75a9fef8-dc52-388e-8b52-5af392cd6ffd}
    @Disabled()
    @Test()
    void toFullyQualifiedName1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Package _package = Package.getPackage("name1");
        //Act Statement(s)
        String result = ClassPathUtils.toFullyQualifiedName(_package, "testResource");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("A.testResource")));
    }

    //Sapient generated method id: ${0909d870-e44b-321a-9f5f-6e105b79d281}
    @Test()
    void toFullyQualifiedPathTest() {
        //Arrange Statement(s)
        try (MockedStatic<ClassPathUtils> classPathUtils = mockStatic(ClassPathUtils.class, CALLS_REAL_METHODS)) {
            classPathUtils.when(() -> ClassPathUtils.toFullyQualifiedPath((Package) any(), eq("resourceName1"))).thenReturn("return_of_toFullyQualifiedPath1");
            //Act Statement(s)
            String result = ClassPathUtils.toFullyQualifiedPath(Object.class, "resourceName1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toFullyQualifiedPath1"));
                classPathUtils.verify(() -> ClassPathUtils.toFullyQualifiedPath((Package) any(), eq("resourceName1")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${886b67c2-16fe-3ad3-94a4-2d9f95787f0d}
    @Disabled()
    @Test()
    void toFullyQualifiedPath1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Package _package = Package.getPackage("name1");
        //Act Statement(s)
        String result = ClassPathUtils.toFullyQualifiedPath(_package, "A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("//A")));
    }
}
