package org.apache.commons.lang3.event;

import org.apache.commons.lang3.event.EventListenerSupport;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import static org.mockito.Mockito.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EventListenerSupportSapientGeneratedTest {

    @Test
    void createTest() {
        assertThrows(IllegalArgumentException.class, () -> EventListenerSupport.create(Object.class));
        assertDoesNotThrow(() -> EventListenerSupport.create(Runnable.class));
    }

    @Test
    void addListenerTest() {
        EventListenerSupport<Runnable> target = spy(new EventListenerSupport<>(Runnable.class));
        Runnable listener = mock(Runnable.class);
        target.addListener(listener);
        verify(target).addListener(listener, true);
        assertEquals(1, target.getListenerCount());
    }

    @ParameterizedTest
    @CsvSource({ "true,2", "false,1" })
    void addListenerWithAllowDuplicateTest(boolean allowDuplicate, int expectedCount) {
        EventListenerSupport<Runnable> target = new EventListenerSupport<>(Runnable.class);
        Runnable listener = mock(Runnable.class);
        target.addListener(listener, true);
        target.addListener(listener, allowDuplicate);
        assertEquals(expectedCount, target.getListenerCount());
    }

    @Test
    void createInvocationHandlerTest() {
        EventListenerSupport<Runnable> target = new EventListenerSupport<>(Runnable.class);
        InvocationHandler result = target.createInvocationHandler();
        assertThat(result, is(notNullValue()));
        assertThat(result, instanceOf(EventListenerSupport.ProxyInvocationHandler.class));
    }

    @Test
    void fireTest() throws Exception {
        EventListenerSupport<Runnable> target = new EventListenerSupport<>(Runnable.class);
        Runnable listener1 = mock(Runnable.class);
        Runnable listener2 = mock(Runnable.class);
        target.addListener(listener1);
        target.addListener(listener2);
        Runnable proxy = target.fire();
        proxy.run();
        verify(listener1).run();
        verify(listener2).run();
    }

    @Test
    void getListenerCountTest() {
        EventListenerSupport<Runnable> target = new EventListenerSupport<>(Runnable.class);
        assertEquals(0, target.getListenerCount());
        target.addListener(mock(Runnable.class));
        assertEquals(1, target.getListenerCount());
        target.addListener(mock(Runnable.class));
        assertEquals(2, target.getListenerCount());
    }

    @Test
    void getListenersTest() {
        EventListenerSupport<Runnable> target = new EventListenerSupport<>(Runnable.class);
        Runnable listener1 = mock(Runnable.class);
        Runnable listener2 = mock(Runnable.class);
        target.addListener(listener1);
        target.addListener(listener2);
        Runnable[] listeners = target.getListeners();
        assertThat(listeners, arrayContaining(listener1, listener2));
    }

    @Test
    void removeListenerTest() {
        EventListenerSupport<Runnable> target = new EventListenerSupport<>(Runnable.class);
        Runnable listener = mock(Runnable.class);
        target.addListener(listener);
        assertEquals(1, target.getListenerCount());
        target.removeListener(listener);
        assertEquals(0, target.getListenerCount());
    }

    @Test
    void testSerializationWithSerializableListeners() throws IOException, ClassNotFoundException {
        EventListenerSupport<Serializable> original = new EventListenerSupport<>(Serializable.class);
        Serializable listener1 = (Serializable & Runnable) () -> {
        };
        Serializable listener2 = (Serializable & Runnable) () -> {
        };
        original.addListener(listener1);
        original.addListener(listener2);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(original);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            EventListenerSupport<?> deserialized = (EventListenerSupport<?>) ois.readObject();
            assertEquals(original.getListenerCount(), deserialized.getListenerCount());
        }
    }

    @Test
    void testSerializationWithNonSerializableListeners() throws IOException, ClassNotFoundException {
        EventListenerSupport<Runnable> original = new EventListenerSupport<>(Runnable.class);
        Runnable serializableListener = (Serializable & Runnable) () -> {
        };
        Runnable nonSerializableListener = () -> {
        };
        original.addListener(serializableListener);
        original.addListener(nonSerializableListener);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(original);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            EventListenerSupport<?> deserialized = (EventListenerSupport<?>) ois.readObject();
            assertEquals(1, deserialized.getListenerCount());
        }
    }

    @Test
    void testProxyInvocationHandlerInvoke() throws Throwable {
        EventListenerSupport<Runnable> support = new EventListenerSupport<>(Runnable.class);
        Runnable listener1 = mock(Runnable.class);
        Runnable listener2 = mock(Runnable.class);
        support.addListener(listener1);
        support.addListener(listener2);
        InvocationHandler handler = support.createInvocationHandler();
        Method runMethod = Runnable.class.getMethod("run");
        handler.invoke(null, runMethod, null);
        verify(listener1).run();
        verify(listener2).run();
    }
}
