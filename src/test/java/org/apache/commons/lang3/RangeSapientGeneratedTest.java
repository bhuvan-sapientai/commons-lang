package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.util.Comparator;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RangeSapientGeneratedTest {

    private final Object objectMock = mock(Object.class, "<init>_object1");

    private final Object objectMock2 = mock(Object.class, "<init>_object2");

    //Sapient generated method id: ${d9deeb8a-01f3-3eca-a9d1-4cdbac046a10}
    @Test()
    void betweenTest() {
        //Arrange Statement(s)
        try (MockedStatic<Range> range = mockStatic(Range.class, CALLS_REAL_METHODS)) {
            Range range2 = Range.is((Comparable) null);
            range.when(() -> Range.of((Comparable) null, (Comparable) null, (Comparator) null)).thenReturn(range2);
            //TODO: Needs initialization with real value
            Comparable comparable = null;
            //TODO: Needs initialization with real value
            Comparable comparable2 = null;
            //Act Statement(s)
            Range result = Range.between(comparable, comparable2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(range2));
                range.verify(() -> Range.of((Comparable) null, (Comparable) null, (Comparator) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${e20b2521-f2f2-3cb3-8312-2b005bfa4c85}
    @Test()
    void between1WhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 224)) : false  #  inside <init> method
         * (branch expression (line 229)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Comparator<Object> comparator = null;

        //Act Statement(s)
        Range result = Range.between(object, object2, comparator);
        Range range = new Range(object, object2, (Comparator) null);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(range)));
    }

    //Sapient generated method id: ${c078d689-7a79-3b74-addd-a1c60022b454}
    @Test()
    void between1WhenDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (branch expression (line 224)) : false  #  inside <init> method
         * (branch expression (line 229)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Comparator<Object> comparator = Comparator.reverseOrder();

        //Act Statement(s)
        Range result = Range.between(object, object2, comparator);
        Range range = new Range(object, object2, comparator);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(range)));
    }

    //Sapient generated method id: ${17723183-1d77-3293-96d3-5c36d008054f}
    @Test()
    void isTest() {
        //Arrange Statement(s)
        try (MockedStatic<Range> range = mockStatic(Range.class, CALLS_REAL_METHODS)) {
            Range range2 = Range.is((Comparable) null);
            range.when(() -> Range.of((Comparable) null, (Comparable) null, (Comparator) null)).thenReturn(range2);
            //TODO: Needs initialization with real value
            Comparable comparable = null;
            //Act Statement(s)
            Range result = Range.is(comparable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(range2));
                range.verify(() -> Range.of((Comparable) null, (Comparable) null, (Comparator) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${c2c28f95-d951-38ad-88fc-1d04200f53ff}
    @Test()
    void is1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Range> range = mockStatic(Range.class, CALLS_REAL_METHODS)) {
            Range range2 = Range.is((Comparable) null);
            Object object = new Object();
            range.when(() -> Range.of(eq(object), eq(object), (Comparator) any())).thenReturn(range2);
            Comparator<Object> comparator = Comparator.reverseOrder();
            //Act Statement(s)
            Range result = Range.is(object, comparator);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(range2));
                range.verify(() -> Range.of(eq(object), eq(object), (Comparator) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}
    @Test()
    void ofTest() {
        //Arrange Statement(s)
        try (MockedStatic<Range> range = mockStatic(Range.class, CALLS_REAL_METHODS)) {
            Range range2 = Range.is((Comparable) null);
            range.when(() -> Range.of((Comparable) null, (Comparable) null, (Comparator) null)).thenReturn(range2);
            //TODO: Needs initialization with real value
            Comparable comparable = null;
            //TODO: Needs initialization with real value
            Comparable comparable2 = null;
            //Act Statement(s)
            Range result = Range.of(comparable, comparable2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(range2));
                range.verify(() -> Range.of((Comparable) null, (Comparable) null, (Comparator) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7bc17aed-dbef-398e-a1d7-03ff99b846a7}
    @Test()
    void of1WhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 224)) : false  #  inside <init> method
         * (branch expression (line 229)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Comparator<Object> comparator = null;

        //Act Statement(s)
        Range result = Range.of(object, object2, comparator);
        Range range = new Range(object, object2, (Comparator) null);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(range)));
    }

    //Sapient generated method id: ${32261fbf-c91a-3754-86b9-6b4f005e92ae}
    @Test()
    void of1WhenDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (branch expression (line 224)) : false  #  inside <init> method
         * (branch expression (line 229)) : false  #  inside <init> method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Comparator<Object> comparator = Comparator.reverseOrder();

        //Act Statement(s)
        Range result = Range.of(object, object2, comparator);
        Range range = new Range(object, object2, comparator);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(range)));
    }

    //Sapient generated method id: ${19bc0e2e-e04c-36a1-a125-b9acf1972783}
    @Test()
    void containsWhenElementIsNull() {
        /* Branches:
         * (element == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Object object3 = null;

        //Act Statement(s)
        boolean result = target.contains(object3);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${f92b6f25-be5f-362e-8a0a-d00ae3884e9d}
    @Test()
    void containsWhenComparatorCompareElementMaximumLessThan1() {
        /* Branches:
         * (element == null) : false
         * (comparator.compare(element, minimum) > -1) : true
         * (comparator.compare(element, maximum) < 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Object object3 = new Object();

        //Act Statement(s)
        boolean result = target.contains(object3);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${752896de-2946-3a03-8a69-51118fa94474}
    @Test()
    void containsWhenComparatorCompareElementMaximumNotLessThan1() {
        /* Branches:
         * (element == null) : false
         * (comparator.compare(element, minimum) > -1) : true
         * (comparator.compare(element, maximum) < 1) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Object object3 = new Object();

        //Act Statement(s)
        boolean result = target.contains(object3);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${18b8d0f4-8077-375e-a8f3-4fa6cc9547d6}
    @Test()
    void containsRangeWhenOtherRangeIsNull() {
        /* Branches:
         * (otherRange == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Range<Object> range = null;

        //Act Statement(s)
        boolean result = target.containsRange(range);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${86e87c61-9cb4-332e-85e0-6fea62b2a282}
    @Test()
    void containsRangeWhenContainsOtherRangeMaximum() {
        /* Branches:
         * (otherRange == null) : false
         * (contains(otherRange.minimum)) : true
         * (contains(otherRange.maximum)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = spy(new Range(object, object2, (Comparator) null));
        doReturn(true).when(target).contains((Object) null);
        Range range = Range.is((Comparable) null);

        //Act Statement(s)
        boolean result = target.containsRange(range);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target, times(2)).contains((Object) null);
        });
    }

    //Sapient generated method id: ${3d78b5c9-dda4-35c9-8aa1-d8d1b2ec3e4b}
    @Test()
    void containsRangeWhenContainsNotOtherRangeMaximum() {
        /* Branches:
         * (otherRange == null) : false
         * (contains(otherRange.minimum)) : true
         * (contains(otherRange.maximum)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = spy(new Range(object, object2, (Comparator) null));
        doReturn(true, false).when(target).contains((Object) null);
        Range range = Range.is((Comparable) null);

        //Act Statement(s)
        boolean result = target.containsRange(range);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target, times(2)).contains((Object) null);
        });
    }

    //Sapient generated method id: ${8784e5d7-8e1f-3b7d-9622-649c916a8bbd}
    @Test()
    void elementCompareToWhenIsAfterElement() {
        /* Branches:
         * (isAfter(element)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = spy(new Range(object, object2, (Comparator) null));
        Object object3 = new Object();
        doReturn(true).when(target).isAfter(object3);

        //Act Statement(s)
        int result = target.elementCompareTo(object3);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(-1));
            verify(target).isAfter(object3);
        });
    }

    //Sapient generated method id: ${01a733be-568d-319e-9e0f-c98f8f3cdab7}
    @Test()
    void elementCompareToWhenIsBeforeElement() {
        /* Branches:
         * (isAfter(element)) : false
         * (isBefore(element)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = spy(new Range(object, object2, (Comparator) null));
        Object object3 = new Object();
        doReturn(false).when(target).isAfter(object3);
        doReturn(true).when(target).isBefore(object3);

        //Act Statement(s)
        int result = target.elementCompareTo(object3);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(1));
            verify(target).isAfter(object3);
            verify(target).isBefore(object3);
        });
    }

    //Sapient generated method id: ${3316de24-ba24-33d8-b033-8f2651741f7e}
    @Test()
    void elementCompareToWhenIsBeforeNotElement() {
        /* Branches:
         * (isAfter(element)) : false
         * (isBefore(element)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = spy(new Range(object, object2, (Comparator) null));
        Object object3 = new Object();
        doReturn(false).when(target).isAfter(object3);
        doReturn(false).when(target).isBefore(object3);

        //Act Statement(s)
        int result = target.elementCompareTo(object3);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(target).isAfter(object3);
            verify(target).isBefore(object3);
        });
    }

    //Sapient generated method id: ${3c2c3851-6a7e-3c51-ba43-4a2aa6bd73d0}
    @Test()
    void fitWhenIsAfterElement() {
        /* Branches:
         * (isAfter(element)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = spy(new Range(object, object2, (Comparator) null));
        Object object3 = new Object();
        doReturn(true).when(target).isAfter(object3);

        //Act Statement(s)
        Object result = target.fit(object3);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(object));
            verify(target).isAfter(object3);
        });
    }

    //Sapient generated method id: ${a93597a2-39ab-3f51-8e03-b918902812ca}
    @Test()
    void fitWhenIsBeforeElement() {
        /* Branches:
         * (isAfter(element)) : false
         * (isBefore(element)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = spy(new Range(object, object2, (Comparator) null));
        Object object3 = new Object();
        doReturn(false).when(target).isAfter(object3);
        doReturn(true).when(target).isBefore(object3);

        //Act Statement(s)
        Object result = target.fit(object3);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(object2));
            verify(target).isAfter(object3);
            verify(target).isBefore(object3);
        });
    }

    //Sapient generated method id: ${b7a350bd-d748-380b-be37-ab24067207b1}
    @Test()
    void fitWhenIsBeforeNotElement() {
        /* Branches:
         * (isAfter(element)) : false
         * (isBefore(element)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = spy(new Range(object, object2, (Comparator) null));
        Object object3 = new Object();
        doReturn(false).when(target).isAfter(object3);
        doReturn(false).when(target).isBefore(object3);

        //Act Statement(s)
        Object result = target.fit(object3);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(object3));
            verify(target).isAfter(object3);
            verify(target).isBefore(object3);
        });
    }

    //Sapient generated method id: ${c543bd2f-b174-3257-bcf5-387ddf3dc23a}
    @Test()
    void intersectionWithWhenThisNotIsOverlappedByOtherThrowsIllegalArgumentException() {
        /* Branches:
         * (!this.isOverlappedBy(other)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = spy(new Range(object, object2, (Comparator) null));
        doReturn(false).when(target).isOverlappedBy((Range) any());
        Range range = Range.is((Comparable) null);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot calculate intersection with non-overlapping range null");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.intersectionWith(range);
        });

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
            verify(target).isOverlappedBy((Range) any());
        });
    }

    //Sapient generated method id: ${b1afc744-80ce-3702-a40b-2adc14f2e45f}
    @Test()
    void intersectionWithWhenThisEqualsOther() {
        /* Branches:
         * (!this.isOverlappedBy(other)) : false
         * (this.equals(other)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = spy(new Range(object, object2, (Comparator) null));
        doReturn(true).when(target).isOverlappedBy((Range) any());
        Range range = Range.is((Comparable) null);

        //Act Statement(s)
        Range result = target.intersectionWith(range);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).isOverlappedBy((Range) any());
        });
    }

    //Sapient generated method id: ${ee69b101-5ecd-3ffa-9296-03740c823311}
    @Test()
    void intersectionWithWhenGetComparatorCompareMaximumOtherMaximumLessThan0() {
        /* Branches:
         * (!this.isOverlappedBy(other)) : false
         * (this.equals(other)) : false
         * (getComparator().compare(minimum, other.minimum) < 0) : true
         * (getComparator().compare(maximum, other.maximum) < 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Range> range = mockStatic(Range.class)) {
            //Range range2 = Range.is((Comparable) null);
            //Object object = new Object();
            //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
            //range.when(() -> Range.of((Object) null, object, Range.ComparableComparator.INSTANCE)).thenReturn(range2);
            //Object object2 = new Object();
            //Range<Object> target = spy(new Range(object2, object, (Comparator) null));
            //doReturn(true).when(target).isOverlappedBy((Range) any());
            //Range range3 = Range.is((Comparable) null);
            //Act Statement(s)
            //Range result = target.intersectionWith(range3);
            //Assert statement(s)
            //assertAll("result", () -> {    assertThat(result, equalTo(range2));    range.verify(() -> Range.of((Object) null, object, Range.ComparableComparator.INSTANCE), atLeast(1));    verify(target).isOverlappedBy((Range) any());});
        }
    }

    //Sapient generated method id: ${570066fe-e459-3140-af43-c2ff1e4ba78c}
    @Test()
    void intersectionWithWhenGetComparatorCompareMinimumOtherMinimumNotLessThan0AndGetComparatorCompareMaximumOtherMaximumNotLes() {
        /* Branches:
         * (!this.isOverlappedBy(other)) : false
         * (this.equals(other)) : false
         * (getComparator().compare(minimum, other.minimum) < 0) : false
         * (getComparator().compare(maximum, other.maximum) < 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Range> range = mockStatic(Range.class)) {
            //Range range2 = Range.is((Comparable) null);
            //Object object = new Object();
            //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
            //range.when(() -> Range.of(object, (Object) null, Range.ComparableComparator.INSTANCE)).thenReturn(range2);
            //Object object2 = new Object();
            //Range<Object> target = spy(new Range(object, object2, (Comparator) null));
            //doReturn(true).when(target).isOverlappedBy((Range) any());
            //Range range3 = Range.is((Comparable) null);
            //Act Statement(s)
            //Range result = target.intersectionWith(range3);
            //Assert statement(s)
            //assertAll("result", () -> {    assertThat(result, equalTo(range2));    range.verify(() -> Range.of(object, (Object) null, Range.ComparableComparator.INSTANCE), atLeast(1));    verify(target).isOverlappedBy((Range) any());});
        }
    }

    //Sapient generated method id: ${7f75c6f3-d80b-392d-a689-def8a66f2f3b}
    @Test()
    void isAfterWhenElementIsNull() {
        /* Branches:
         * (element == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Object object3 = null;

        //Act Statement(s)
        boolean result = target.isAfter(object3);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${c08f3169-8de6-32c8-98a4-fbfc252307fe}
    @Test()
    void isAfterWhenComparatorCompareElementMinimumLessThan0() {
        /* Branches:
         * (element == null) : false
         * (comparator.compare(element, minimum) < 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Object object3 = new Object();

        //Act Statement(s)
        boolean result = target.isAfter(object3);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${5905b7c0-2b46-3c6d-8b95-9d8bb008cb33}
    @Test()
    void isAfterWhenComparatorCompareElementMinimumNotLessThan0() {
        /* Branches:
         * (element == null) : false
         * (comparator.compare(element, minimum) < 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Object object3 = new Object();

        //Act Statement(s)
        boolean result = target.isAfter(object3);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${1ea7ff3f-38b9-3555-ad77-823d2aa0492d}
    @Test()
    void isAfterRangeWhenOtherRangeIsNull() {
        /* Branches:
         * (otherRange == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Range<Object> range = null;

        //Act Statement(s)
        boolean result = target.isAfterRange(range);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${c526affe-e990-3f8f-bcff-91ca6fb449a6}
    @Test()
    void isAfterRangeWhenIsAfterOtherRangeMaximum() {
        /* Branches:
         * (otherRange == null) : false
         * (isAfter(otherRange.maximum)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = spy(new Range(object, object2, (Comparator) null));
        doReturn(true).when(target).isAfter((Object) null);
        Range range = Range.is((Comparable) null);

        //Act Statement(s)
        boolean result = target.isAfterRange(range);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).isAfter((Object) null);
        });
    }

    //Sapient generated method id: ${bb256e3e-50da-3750-b907-2d34ab726081}
    @Test()
    void isAfterRangeWhenIsAfterNotOtherRangeMaximum() {
        /* Branches:
         * (otherRange == null) : false
         * (isAfter(otherRange.maximum)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = spy(new Range(object, object2, (Comparator) null));
        doReturn(false).when(target).isAfter((Object) null);
        Range range = Range.is((Comparable) null);

        //Act Statement(s)
        boolean result = target.isAfterRange(range);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target).isAfter((Object) null);
        });
    }

    //Sapient generated method id: ${7606fdd8-3a55-38c6-b567-2ccbe764716f}
    @Test()
    void isBeforeWhenElementIsNull() {
        /* Branches:
         * (element == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Object object3 = null;

        //Act Statement(s)
        boolean result = target.isBefore(object3);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${b513d205-18aa-32d9-9e20-c50250bcc0b3}
    @Test()
    void isBeforeWhenComparatorCompareElementMaximumGreaterThan0() {
        /* Branches:
         * (element == null) : false
         * (comparator.compare(element, maximum) > 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Object object3 = new Object();

        //Act Statement(s)
        boolean result = target.isBefore(object3);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${24f6037f-c9e5-3fa5-aa14-d05eab7609d5}
    @Test()
    void isBeforeWhenComparatorCompareElementMaximumNotGreaterThan0() {
        /* Branches:
         * (element == null) : false
         * (comparator.compare(element, maximum) > 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Object object3 = new Object();

        //Act Statement(s)
        boolean result = target.isBefore(object3);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${793f46ed-1057-33a8-98a0-669e1eb0bb26}
    @Test()
    void isBeforeRangeWhenOtherRangeIsNull() {
        /* Branches:
         * (otherRange == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Range<Object> range = null;

        //Act Statement(s)
        boolean result = target.isBeforeRange(range);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${3eb81393-17f4-3fe4-b5d8-3da03aa4fe66}
    @Test()
    void isBeforeRangeWhenIsBeforeOtherRangeMinimum() {
        /* Branches:
         * (otherRange == null) : false
         * (isBefore(otherRange.minimum)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = spy(new Range(object, object2, (Comparator) null));
        doReturn(true).when(target).isBefore((Object) null);
        Range range = Range.is((Comparable) null);

        //Act Statement(s)
        boolean result = target.isBeforeRange(range);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).isBefore((Object) null);
        });
    }

    //Sapient generated method id: ${685486d2-dd06-374c-bb78-09c4bdf795d1}
    @Test()
    void isBeforeRangeWhenIsBeforeNotOtherRangeMinimum() {
        /* Branches:
         * (otherRange == null) : false
         * (isBefore(otherRange.minimum)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = spy(new Range(object, object2, (Comparator) null));
        doReturn(false).when(target).isBefore((Object) null);
        Range range = Range.is((Comparable) null);

        //Act Statement(s)
        boolean result = target.isBeforeRange(range);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target).isBefore((Object) null);
        });
    }

    //Sapient generated method id: ${e997cd66-2ba3-3abc-af35-3be5658ea77b}
    @Test()
    void isEndedByWhenElementIsNull() {
        /* Branches:
         * (element == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Object object3 = null;

        //Act Statement(s)
        boolean result = target.isEndedBy(object3);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${f4b65d44-58d0-35e0-9fca-2565893cdf47}
    @Test()
    void isEndedByWhenComparatorCompareElementMaximumEquals0() {
        /* Branches:
         * (element == null) : false
         * (comparator.compare(element, maximum) == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Object object3 = new Object();

        //Act Statement(s)
        boolean result = target.isEndedBy(object3);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${6a1043fc-40c4-3ec9-a951-ba4507b22afc}
    @Test()
    void isEndedByWhenComparatorCompareElementMaximumNotEquals0() {
        /* Branches:
         * (element == null) : false
         * (comparator.compare(element, maximum) == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Object object3 = new Object();

        //Act Statement(s)
        boolean result = target.isEndedBy(object3);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${ff1c3c2f-8b2c-32ff-9951-0b2aff73e5c1}
    @Test()
    void isNaturalOrderingWhenComparatorEqualsComparableComparatorINSTANCE() {
        /* Branches:
         * (comparator == ComparableComparator.INSTANCE) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);

        //Act Statement(s)
        boolean result = target.isNaturalOrdering();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${576acbcf-3b4b-3c5f-af1c-6ee09d7443cd}
    @Test()
    void isOverlappedByWhenOtherRangeIsNull() {
        /* Branches:
         * (otherRange == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Range<Object> range = null;

        //Act Statement(s)
        boolean result = target.isOverlappedBy(range);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${66a49244-ec63-37e1-a3ac-49c056f17a65}
    @Test()
    void isOverlappedByWhenContainsOtherRangeMinimum() {
        /* Branches:
         * (otherRange == null) : false
         * (otherRange.contains(minimum)) : false
         * (otherRange.contains(maximum)) : false
         * (contains(otherRange.minimum)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = spy(new Range(object, object2, (Comparator) null));
        doReturn(true).when(target).contains((Object) null);
        Range range = Range.is((Comparable) null);

        //Act Statement(s)
        boolean result = target.isOverlappedBy(range);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).contains((Object) null);
        });
    }

    //Sapient generated method id: ${b8f7e4f5-4083-374b-a2ff-0a74c84c12e0}
    @Test()
    void isOverlappedByWhenContainsNotOtherRangeMinimum() {
        /* Branches:
         * (otherRange == null) : false
         * (otherRange.contains(minimum)) : false
         * (otherRange.contains(maximum)) : false
         * (contains(otherRange.minimum)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = spy(new Range(object, object2, (Comparator) null));
        doReturn(false).when(target).contains((Object) null);
        Range range = Range.is((Comparable) null);

        //Act Statement(s)
        boolean result = target.isOverlappedBy(range);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target).contains((Object) null);
        });
    }

    //Sapient generated method id: ${4053a4ef-396c-3c69-a91f-88619337cece}
    @Test()
    void isStartedByWhenElementIsNull() {
        /* Branches:
         * (element == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Object object3 = null;

        //Act Statement(s)
        boolean result = target.isStartedBy(object3);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${9eae4e0e-c687-388f-90de-2c9520213e78}
    @Test()
    void isStartedByWhenComparatorCompareElementMinimumEquals0() {
        /* Branches:
         * (element == null) : false
         * (comparator.compare(element, minimum) == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Object object3 = new Object();

        //Act Statement(s)
        boolean result = target.isStartedBy(object3);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${cfc7c087-60a8-373d-9657-66c68243bd30}
    @Test()
    void isStartedByWhenComparatorCompareElementMinimumNotEquals0() {
        /* Branches:
         * (element == null) : false
         * (comparator.compare(element, minimum) == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Range<Object> target = new Range(object, object2, (Comparator) null);
        Object object3 = new Object();

        //Act Statement(s)
        boolean result = target.isStartedBy(object3);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${0e64e8ed-a5dc-35ba-9660-05fba27bf54b}
    @Test()
    void toStringWhenToStringIsNull() {
        /* Branches:
         * (toString == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Range<Object> target = new Range(objectMock, objectMock2, (Comparator) null);

        //Act Statement(s)
        String result = target.toString();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("[<init>_object1..<init>_object2]")));
    }

    //Sapient generated method id: ${cabd8b84-4f2d-339c-9d46-60cffe26dac3}
    @Test()
    void toString1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Range<Object> target = new Range(objectMock, objectMock2, (Comparator) null);

        //Act Statement(s)
        String result = target.toString("%d to %d (%s)");

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("null to null (INSTANCE)")));
    }
}
