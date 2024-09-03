package org.apache.commons.lang3;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
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

    private final Comparable comparableMock = mock(Comparable.class);

    private final Comparable comparableMock2 = mock(Comparable.class);

    private final Comparable comparableMock3 = mock(Comparable.class);

    private final Object objectMock = mock(Object.class, "element1");

    private final Object objectMock2 = mock(Object.class, "element2");

    //Sapient generated method id: ${betweenTest}, hash: F794862630C86987239FC9F72F37D4C3
    @Test()
    void betweenTest() {
        //Arrange Statement(s)
        try (MockedStatic<Range> range = mockStatic(Range.class, CALLS_REAL_METHODS)) {
            Range range2 = Range.is(comparableMock);
            range.when(() -> Range.of(comparableMock2, comparableMock3, (Comparator) null)).thenReturn(range2);
            //Act Statement(s)
            Range result = Range.between(comparableMock2, comparableMock3);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(range2));
                range.verify(() -> Range.of(comparableMock2, comparableMock3, (Comparator) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${between1WhenDefaultBranch}, hash: E091F32D1DC6D188034E5816B2358EA5
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

    //Sapient generated method id: ${between1WhenDefaultBranchAndDefaultBranch}, hash: 0981D3BCBEAD3E868864CD09094516E7
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
        Comparator comparator = Comparator.reverseOrder();
        
        //Act Statement(s)
        Range result = Range.between(object, object2, comparator);
        Range range = new Range(object, object2, comparator);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(range)));
    }

    //Sapient generated method id: ${isTest}, hash: B5C34B51D49FB889A5C3D64E7E4F807D
    @Test()
    void isTest() {
        //Arrange Statement(s)
        try (MockedStatic<Range> range = mockStatic(Range.class, CALLS_REAL_METHODS)) {
            Range range2 = Range.is(comparableMock);
            range.when(() -> Range.of(comparableMock2, comparableMock2, (Comparator) null)).thenReturn(range2);
            //Act Statement(s)
            Range result = Range.is(comparableMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(range2));
                range.verify(() -> Range.of(comparableMock2, comparableMock2, (Comparator) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${is1Test}, hash: CC911ED9F5AAF80236DDDFEA0FB41159
    @Test()
    void is1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Range> range = mockStatic(Range.class, CALLS_REAL_METHODS)) {
            Range range2 = Range.is(comparableMock);
            Object object = new Object();
            range.when(() -> Range.of(eq(object), eq(object), (Comparator) any())).thenReturn(range2);
            Comparator comparator = Comparator.reverseOrder();
            //Act Statement(s)
            Range result = Range.is(object, comparator);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(range2));
                range.verify(() -> Range.of(eq(object), eq(object), (Comparator) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ofTest}, hash: A53FE73F9671F52957FD43AE482D3559
    @Test()
    void ofTest() {
        //Arrange Statement(s)
        try (MockedStatic<Range> range = mockStatic(Range.class, CALLS_REAL_METHODS)) {
            Range range2 = Range.is(comparableMock);
            range.when(() -> Range.of(comparableMock2, comparableMock3, (Comparator) null)).thenReturn(range2);
            //Act Statement(s)
            Range result = Range.of(comparableMock2, comparableMock3);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(range2));
                range.verify(() -> Range.of(comparableMock2, comparableMock3, (Comparator) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${of1WhenDefaultBranch}, hash: C8F35E6BA071E71F100204B9B0CF2F1F
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

    //Sapient generated method id: ${of1WhenDefaultBranchAndDefaultBranch}, hash: 73FA75CD9F99FF03E56C9ADAB0FCDFE6
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
        Comparator comparator = Comparator.reverseOrder();
        
        //Act Statement(s)
        Range result = Range.of(object, object2, comparator);
        Range range = new Range(object, object2, comparator);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(range)));
    }

    //Sapient generated method id: ${containsWhenElementIsNull}, hash: 4A69F6F50D526C1FDED16830F113B8B5
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

    //Sapient generated method id: ${containsWhenComparatorCompareElementMaximumLessThan1}, hash: 8FD965E69A42CCE7E178E42FD7D73D44
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

    //Sapient generated method id: ${containsWhenComparatorCompareElementMaximumNotLessThan1}, hash: 9B0795CDD08798BE10AC5BAE186F0959
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

    //Sapient generated method id: ${containsRangeWhenOtherRangeIsNull}, hash: A24D22EE0A56F28A96FF271E0F4C5C80
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

    //Sapient generated method id: ${containsRangeWhenContainsOtherRangeMaximum}, hash: 237D780E193AFAFFE5BD19586A4E010F
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
        Range range = Range.is(comparableMock);
        
        //Act Statement(s)
        boolean result = target.containsRange(range);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target, times(2)).contains((Object) null);
        });
    }

    //Sapient generated method id: ${containsRangeWhenContainsNotOtherRangeMaximum}, hash: 2621E67FBCEEFB8A59B18295B1471AE2
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
        Range range = Range.is(comparableMock);
        
        //Act Statement(s)
        boolean result = target.containsRange(range);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target, times(2)).contains((Object) null);
        });
    }

    //Sapient generated method id: ${elementCompareToWhenIsAfterElement}, hash: B56359A417F5AD0EDA38FD555C08DA5E
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

    //Sapient generated method id: ${elementCompareToWhenIsBeforeElement}, hash: B7131755C1AF5113DA8CA63542B8FC38
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

    //Sapient generated method id: ${elementCompareToWhenIsBeforeNotElement}, hash: 691D481F00210DF51F216D9C073DC9E6
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

    //Sapient generated method id: ${fitWhenIsAfterElement}, hash: 3B4C79632284E5E79425725117E6FD04
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

    //Sapient generated method id: ${fitWhenIsBeforeElement}, hash: 6338FBEB09BB1EA593A0D831E9B9EB61
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

    //Sapient generated method id: ${fitWhenIsBeforeNotElement}, hash: EA9260B5EA9C33871924B91CAD0B6779
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

    //Sapient generated method id: ${intersectionWithWhenThisNotIsOverlappedByOtherThrowsIllegalArgumentException}, hash: 566103DE0C5F024E7D727BFE570B5A0A
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
        Range range = Range.is(comparableMock);
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

    //Sapient generated method id: ${intersectionWithWhenThisEqualsOther}, hash: BBB462CF4164EF5E7BC259A3B25DEBBF
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
        Range range = Range.is(comparableMock);
        
        //Act Statement(s)
        Range result = target.intersectionWith(range);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(target));
            verify(target).isOverlappedBy((Range) any());
        });
    }

    //Sapient generated method id: ${intersectionWithWhenGetComparatorCompareMaximumOtherMaximumLessThan0}, hash: E56A9D432A1496F4A522D2F45318BB9B
    @Disabled()
    @Test()
    void intersectionWithWhenGetComparatorCompareMaximumOtherMaximumLessThan0() {
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //Act Statement(s)
        //Assert statement(s)
        //Range range2 = Range.is(comparableMock);
        //Object object = new Object();
        //range.when(() -> Range.of((Object) null, object, Range.ComparableComparator.INSTANCE)).thenReturn(range2);
        //Object object2 = new Object();
        //Range<Object> target = spy(new Range(object2, object, (Comparator) null));
        //doReturn(true).when(target).isOverlappedBy((Range) any());
        //Range range3 = Range.is(comparableMock2);
        //Range result = target.intersectionWith(range3);
        //assertAll("result", () -> {    assertThat(result, equalTo(range2));    range.verify(() -> Range.of((Object) null, object, Range.ComparableComparator.INSTANCE), atLeast(1));    verify(target).isOverlappedBy((Range) any());});
    }

    //Sapient generated method id: ${intersectionWithWhenGetComparatorCompareMinimumOtherMinimumNotLessThan0AndGetComparatorCompareMaximumOtherMaximumNotLes}, hash: 61BA4097D19EABA3DB258A61153A713D
    @Disabled()
    @Test()
    void intersectionWithWhenGetComparatorCompareMinimumOtherMinimumNotLessThan0AndGetComparatorCompareMaximumOtherMaximumNotLes() {
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //Act Statement(s)
        //Assert statement(s)
        //Range range2 = Range.is(comparableMock);
        //Object object = new Object();
        //range.when(() -> Range.of(object, (Object) null, Range.ComparableComparator.INSTANCE)).thenReturn(range2);
        //Object object2 = new Object();
        //Range<Object> target = spy(new Range(object, object2, (Comparator) null));
        //doReturn(true).when(target).isOverlappedBy((Range) any());
        //Range range3 = Range.is(comparableMock2);
        //Range result = target.intersectionWith(range3);
        //assertAll("result", () -> {    assertThat(result, equalTo(range2));    range.verify(() -> Range.of(object, (Object) null, Range.ComparableComparator.INSTANCE), atLeast(1));    verify(target).isOverlappedBy((Range) any());});
    }

    //Sapient generated method id: ${isAfterWhenElementIsNull}, hash: 38FD91FBECEA444E286C6C699D3B45A7
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

    //Sapient generated method id: ${isAfterWhenComparatorCompareElementMinimumLessThan0}, hash: 2D67E1CD50DED45C63391CDEFF968099
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

    //Sapient generated method id: ${isAfterWhenComparatorCompareElementMinimumNotLessThan0}, hash: 759589108B4DB7F8EF8503EE58EEE625
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

    //Sapient generated method id: ${isAfterRangeWhenOtherRangeIsNull}, hash: 42118E27EA417F07B44F0FA2142C9A09
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

    //Sapient generated method id: ${isAfterRangeWhenIsAfterOtherRangeMaximum}, hash: 38E7A7BB240BF13A376C5A84C57E7DA2
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
        Range range = Range.is(comparableMock);
        
        //Act Statement(s)
        boolean result = target.isAfterRange(range);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).isAfter((Object) null);
        });
    }

    //Sapient generated method id: ${isAfterRangeWhenIsAfterNotOtherRangeMaximum}, hash: DAC43C59AA55E3040806C674050A73E3
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
        Range range = Range.is(comparableMock);
        
        //Act Statement(s)
        boolean result = target.isAfterRange(range);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target).isAfter((Object) null);
        });
    }

    //Sapient generated method id: ${isBeforeWhenElementIsNull}, hash: ED5E303935182E13AC2979D0488DD29E
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

    //Sapient generated method id: ${isBeforeWhenComparatorCompareElementMaximumGreaterThan0}, hash: 3FBBA43E7831CA3C203EC642D61E8848
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

    //Sapient generated method id: ${isBeforeWhenComparatorCompareElementMaximumNotGreaterThan0}, hash: 9230428582FBFD1C6B3B9E54EE32CB0D
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

    //Sapient generated method id: ${isBeforeRangeWhenOtherRangeIsNull}, hash: CAA3128B787D4133620CCE5348319937
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

    //Sapient generated method id: ${isBeforeRangeWhenIsBeforeOtherRangeMinimum}, hash: 4D8ACB4077B945267193A6B405673F38
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
        Range range = Range.is(comparableMock);
        
        //Act Statement(s)
        boolean result = target.isBeforeRange(range);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).isBefore((Object) null);
        });
    }

    //Sapient generated method id: ${isBeforeRangeWhenIsBeforeNotOtherRangeMinimum}, hash: 061A13F416A310ED98397EE24E595A3E
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
        Range range = Range.is(comparableMock);
        
        //Act Statement(s)
        boolean result = target.isBeforeRange(range);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target).isBefore((Object) null);
        });
    }

    //Sapient generated method id: ${isEndedByWhenElementIsNull}, hash: C1D7B186E8AD60832656A08F09974CBE
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

    //Sapient generated method id: ${isEndedByWhenComparatorCompareElementMaximumEquals0}, hash: 5006660CC70DCB271EAA079345F1248D
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

    //Sapient generated method id: ${isEndedByWhenComparatorCompareElementMaximumNotEquals0}, hash: ADCC35B2D1855C5C39616FA9F4D6899A
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

    //Sapient generated method id: ${isNaturalOrderingWhenComparatorEqualsComparableComparatorINSTANCE}, hash: 118843F9FF896774EAA9F6A9D934C1AB
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

    //Sapient generated method id: ${isOverlappedByWhenOtherRangeIsNull}, hash: 5A922F0E47523AD7D104887C7CA5506E
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

    //Sapient generated method id: ${isOverlappedByWhenContainsOtherRangeMinimum}, hash: 3FEEFC30BF69333CDA2D579493B3CC60
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
        Range range = Range.is(comparableMock);
        
        //Act Statement(s)
        boolean result = target.isOverlappedBy(range);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).contains((Object) null);
        });
    }

    //Sapient generated method id: ${isOverlappedByWhenContainsNotOtherRangeMinimum}, hash: FD99A20AB51679CE29C83D7F3376055F
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
        Range range = Range.is(comparableMock);
        
        //Act Statement(s)
        boolean result = target.isOverlappedBy(range);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(target).contains((Object) null);
        });
    }

    //Sapient generated method id: ${isStartedByWhenElementIsNull}, hash: 6AFEE31A197879A5310DAB5280C29B27
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

    //Sapient generated method id: ${isStartedByWhenComparatorCompareElementMinimumEquals0}, hash: B6529EE6A9DED02BD2ECF39EACC8E3FA
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

    //Sapient generated method id: ${isStartedByWhenComparatorCompareElementMinimumNotEquals0}, hash: 819F31A2BEE68B9B5BCC7900F44E731D
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

    //Sapient generated method id: ${toStringWhenToStringIsNull}, hash: 0CF57F0F225BD216747B0F106B29A6B8
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
        assertAll("result", () -> assertThat(result, equalTo("[element1..element2]")));
    }

    //Sapient generated method id: ${toString1Test}, hash: DB4FD783D58A255A17C0F0CFBD77F358
    @Test()
    void toString1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Range<Object> target = new Range(objectMock, objectMock2, (Comparator) null);
        
        //Act Statement(s)
        String result = target.toString("A");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("A")));
    }
}
