package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.net.URLClassLoader;
import java.net.URL;

import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ClassLoaderUtilsSapientGeneratedTest {

    //Sapient generated method id: ${d4f7ebc8-7006-38ba-b941-4b8261bd48bf}
    @Test()
    void getSystemURLsWhenClNotInstanceOfURLClassLoader() {
        /* Branches:
         * (cl instanceof URLClassLoader) : false  #  inside getURLs method
         */

        //Act Statement(s)
        URL[] result = ClassLoaderUtils.getSystemURLs();
        URL[] uRLResultArray = new URL[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(uRLResultArray)));
    }

    //Sapient generated method id: ${3398e974-4899-393d-8baf-e3221a5c067d}
    @Test()
    void getThreadURLsWhenClNotInstanceOfURLClassLoader() {
        /* Branches:
         * (cl instanceof URLClassLoader) : false  #  inside getURLs method
         */

        //Act Statement(s)
        URL[] result = ClassLoaderUtils.getThreadURLs();
        URL[] uRLResultArray = new URL[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(uRLResultArray)));
    }

    //Sapient generated method id: ${86cfe8cb-c82d-3cee-a2a5-98c4c5e72dd0}
    @Test()
    void toStringWhenClassLoaderInstanceOfURLClassLoader() {
        /* Branches:
         * (classLoader instanceof URLClassLoader) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassLoaderUtils> classLoaderUtils = mockStatic(ClassLoaderUtils.class, CALLS_REAL_METHODS)) {
            URL[] uRLArray = new URL[]{};
            URLClassLoader uRLClassLoader = new URLClassLoader(uRLArray);
            classLoaderUtils.when(() -> ClassLoaderUtils.toString(uRLClassLoader)).thenReturn("return_of_toString1");
            //Act Statement(s)
            String result = ClassLoaderUtils.toString((ClassLoader) uRLClassLoader);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_toString1"));
                classLoaderUtils.verify(() -> ClassLoaderUtils.toString(uRLClassLoader), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7399f82c-a3da-356f-88f5-411b7e4c3a62}
    @Test()
    void toStringWhenClassLoaderNotInstanceOfURLClassLoader() {
        /* Branches:
         * (classLoader instanceof URLClassLoader) : false
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();

        //Act Statement(s)
        String result = ClassLoaderUtils.toString(classLoader);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("null")));
    }

    //Sapient generated method id: ${929c8f2a-e749-3df0-a058-68ed46eb995d}
    @Test()
    void toString1WhenClassLoaderIsNotNull() {
        /* Branches:
         * (classLoader != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        URL[] uRLArray = new URL[]{};
        URLClassLoader uRLClassLoader = new URLClassLoader(uRLArray);

        //Act Statement(s)
        String result = ClassLoaderUtils.toString(uRLClassLoader);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("toString_uRLClassLoader1A")));
    }

    //Sapient generated method id: ${83637e61-9547-346c-a20d-16a3aa0b3518}
    @Test()
    void toString1WhenClassLoaderIsNull() {
        /* Branches:
         * (classLoader != null) : false
         */
        //Arrange Statement(s)
        URLClassLoader uRLClassLoader = null;

        //Act Statement(s)
        String result = ClassLoaderUtils.toString(uRLClassLoader);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("null")));
    }
}
