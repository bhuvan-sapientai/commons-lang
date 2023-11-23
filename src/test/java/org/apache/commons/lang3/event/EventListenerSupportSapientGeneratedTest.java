package org.apache.commons.lang3.event;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EventListenerSupportSapientGeneratedTest {

    //Sapient generated method id: ${2284fc3d-473b-3992-886d-8fe431bd702d}
    @Test()
    void createTest() {
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            EventListenerSupport.create(Object.class);
        });

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${8198ac6d-4747-3f7d-83b5-d8ecfefc72c5}
    @Test()
    void fireTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        EventListenerSupport<Object> target = new EventListenerSupport(Object.class, classLoader);

        //Act Statement(s)
        Object result = target.fire();
        Object object = new Object();

        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }

    //Sapient generated method id: ${b42a3086-1ce1-3df4-8464-a2efc15fdc63}
    @Test()
    void addListenerTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        EventListenerSupport<Object> target = spy(new EventListenerSupport(Object.class, classLoader));
        Object object = new Object();
        doNothing().when(target).addListener(object, true);

        //Act Statement(s)
        target.addListener(object);

        //Assert statement(s)
        assertAll("result", () -> verify(target).addListener(object, true));
    }

    //Sapient generated method id: ${d4507ac8-9ef4-35de-a066-36af0686ee9b}
    @Test()
    void addListener1WhenListenersNotContainsListener() {
        /* Branches:
         * (allowDuplicate) : false
         * (!listeners.contains(listener)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        EventListenerSupport<Object> target = new EventListenerSupport(Object.class, classLoader);
        Object object = new Object();

        //Act Statement(s)
        target.addListener(object, false);
    }

    //Sapient generated method id: ${952661c9-48dd-367a-980d-b8d1ca05e0ec}
    @Test()
    void getListenerCountTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        EventListenerSupport<Object> target = new EventListenerSupport(Object.class, classLoader);

        //Act Statement(s)
        int result = target.getListenerCount();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${6bcc2d87-95d0-3d30-abf1-4e8d40c773a8}
    @Test()
    void removeListenerTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        EventListenerSupport<Object> target = new EventListenerSupport(Object.class, classLoader);
        Object object = new Object();

        //Act Statement(s)
        target.removeListener(object);
    }

    //Sapient generated method id: ${b1c37231-1147-3ac0-8762-d7c1e4be3220}
    @Test()
    void getListenersTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        EventListenerSupport<Object> target = new EventListenerSupport(Object.class, classLoader);

        //Act Statement(s)
        Object[] result = target.getListeners();
        Object[] objectResultArray = new Object[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectResultArray)));
    }

    //Sapient generated method id: ${b79473f4-8cf2-31f1-ae19-84ea52227e8b}
    @Test()
    void createInvocationHandlerTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        EventListenerSupport<Object> target = new EventListenerSupport(Object.class, classLoader);

        //Act Statement(s)
        InvocationHandler result = target.createInvocationHandler();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
