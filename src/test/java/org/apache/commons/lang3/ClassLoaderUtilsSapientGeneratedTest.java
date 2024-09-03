package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.net.URLClassLoader;
import java.net.URL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ClassLoaderUtilsSapientGeneratedTest {

    //Sapient generated method id: ${getSystemURLsWhenClNotInstanceOfURLClassLoader}, hash: 6EB07EE18FC343BB8F0983014B959E2E
    @Test()
    void getSystemURLsWhenClNotInstanceOfURLClassLoader() {
        /* Branches:
         * (cl instanceof URLClassLoader) : false  #  inside getURLs method
         */
         
        //Act Statement(s)
        URL[] result = ClassLoaderUtils.getSystemURLs();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //Sapient generated method id: ${getThreadURLsWhenClNotInstanceOfURLClassLoader}, hash: 71E42EF75965D973F9385EAB0879F661
    @Test()
    void getThreadURLsWhenClNotInstanceOfURLClassLoader() {
        /* Branches:
         * (cl instanceof URLClassLoader) : false  #  inside getURLs method
         */
         
        //Act Statement(s)
        URL[] result = ClassLoaderUtils.getThreadURLs();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.length, equalTo(0)));
    }

    //Sapient generated method id: ${toStringWhenClassLoaderInstanceOfURLClassLoader}, hash: 35C5196E3FDBEFA53210E0B4B6BBE5A2
    @Test()
    void toStringWhenClassLoaderInstanceOfURLClassLoader() {
        /* Branches:
         * (classLoader instanceof URLClassLoader) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        URL[] uRLArray = new URL[] {};
        URLClassLoader uRLClassLoader = new URLClassLoader(uRLArray);
        
        //Act Statement(s)
        String result = ClassLoaderUtils.toString((ClassLoader) uRLClassLoader);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${toStringWhenClassLoaderNotInstanceOfURLClassLoader}, hash: 3CA47D094A2DE0AA9F810B7284856027
    @Test()
    void toStringWhenClassLoaderNotInstanceOfURLClassLoader() {
        /* Branches:
         * (classLoader instanceof URLClassLoader) : false
         */
        //Arrange Statement(s)
        //ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        //Act Statement(s)
        //String result = ClassLoaderUtils.toString(classLoader);
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, equalTo("jdk.internal.loader.ClassLoaders$PlatformClassLoader@6f30716")));
    }

    //Sapient generated method id: ${toString1WhenClassLoaderIsNotNull}, hash: 2ECA00AC691D4FE1A9CAD067B93C390E
    @Test()
    void toString1WhenClassLoaderIsNotNull() {
        /* Branches:
         * (classLoader != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        URL[] uRLArray = new URL[] {};
        URLClassLoader uRLClassLoader = new URLClassLoader(uRLArray);
        
        //Act Statement(s)
        String result = ClassLoaderUtils.toString(uRLClassLoader);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("classLoaderA")));
    }

    //Sapient generated method id: ${toString1WhenClassLoaderIsNull}, hash: 2D01116F86B12247B2F23B8873F6AD73
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