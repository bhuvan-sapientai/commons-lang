package org.apache.commons.lang3.util;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.BitSet;
import java.util.stream.IntStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FluentBitSetSapientGeneratedTest {

    //Sapient generated method id: ${2d052624-ed95-37dd-b08e-031ead7eafc1}
    @Test()
    void andTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);
        BitSet bitSet2 = new BitSet();

        //Act Statement(s)
        FluentBitSet result = target.and(bitSet2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${3bdf89f8-8e69-3c91-ba45-9976820b2272}
    @Test()
    void and1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);
        FluentBitSet fluentBitSet = new FluentBitSet();

        //Act Statement(s)
        FluentBitSet result = target.and(fluentBitSet);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${d12e9a9c-c7d3-3fad-ad97-d181407285bf}
    @Test()
    void andNotTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);
        BitSet bitSet2 = new BitSet();

        //Act Statement(s)
        FluentBitSet result = target.andNot(bitSet2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${509da604-eba3-33bd-92c7-1ea049a9dc97}
    @Test()
    void andNot1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);
        FluentBitSet fluentBitSet = new FluentBitSet();

        //Act Statement(s)
        FluentBitSet result = target.andNot(fluentBitSet);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${44a6fa22-79e0-3125-80e1-e807724ffe56}
    @Test()
    void bitSetTest() {
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        BitSet result = target.bitSet();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(bitSet)));
    }

    //Sapient generated method id: ${f3463326-83fd-366a-85e3-7acb4e59c329}
    @Test()
    void cardinalityTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        int result = target.cardinality();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${53c00396-4771-38ed-8731-096091c47b7f}
    @Test()
    void clearTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        FluentBitSet result = target.clear();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${28982883-22b1-3c8a-a651-af5c089d406b}
    @Test()
    void clear1WhenBitIndexArrayIsNotEmpty() {
        /* Branches:
         * (for-each(bitIndexArray)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);
        int[] intArray = new int[]{0};

        //Act Statement(s)
        FluentBitSet result = target.clear(intArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${fb087283-1d95-3d3c-8587-24d14cc202ac}
    @Test()
    void clear2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        FluentBitSet result = target.clear(0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${47ffbb93-99eb-3597-b9bf-e2c69aae2bbe}
    @Test()
    void clear3Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        FluentBitSet result = target.clear(0, 5);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${4940d98d-11fd-3bb1-87e7-4e48368ce6b3}
    @Test()
    void cloneTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        Object result = target.clone();
        BitSet bitSet2 = new BitSet();
        FluentBitSet fluentBitSet = new FluentBitSet(bitSet2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(fluentBitSet)));
    }

    //Sapient generated method id: ${de460740-5d13-30cb-bcdf-269c7d28a8e4}
    @Test()
    void flipTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        FluentBitSet result = target.flip(0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${a625733e-29a5-3af4-bab8-d038c6f98bbe}
    @Test()
    void flip1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        FluentBitSet result = target.flip(0, 1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${e93312da-5b5c-323d-b650-1a141f3bedde}
    @Test()
    void getWhenBitSetGetBitIndex() {
        /* Branches:
         * (bitSet.get(bitIndex)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        boolean result = target.get(0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${00ce9a84-cf52-3302-8a7e-9a337c01b4be}
    @Test()
    void getWhenBitSetNotGetBitIndex() {
        /* Branches:
         * (bitSet.get(bitIndex)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        boolean result = target.get(0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${fa77ec73-5d5e-3732-b683-af7decc28622}
    @Test()
    void get1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        FluentBitSet result = target.get(0, 0);
        BitSet bitSet2 = new BitSet();
        FluentBitSet fluentBitSet = new FluentBitSet(bitSet2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(fluentBitSet)));
    }

    //Sapient generated method id: ${c089d75e-c7f2-36c4-a1aa-079afb47a785}
    @Test()
    void intersectsWhenBitSetIntersectsSet() {
        /* Branches:
         * (bitSet.intersects(set)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);
        BitSet bitSet2 = new BitSet();

        //Act Statement(s)
        boolean result = target.intersects(bitSet2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${f5e512ec-0ad5-33eb-a610-9667b19006e7}
    @Test()
    void intersectsWhenBitSetNotIntersectsSet() {
        /* Branches:
         * (bitSet.intersects(set)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);
        BitSet bitSet2 = new BitSet();

        //Act Statement(s)
        boolean result = target.intersects(bitSet2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${f1ea74c4-b4d8-3745-85f3-8d1d15112c17}
    @Test()
    void intersects1WhenBitSetIntersectsSetBitSet() {
        /* Branches:
         * (bitSet.intersects(set.bitSet)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);
        FluentBitSet fluentBitSet = new FluentBitSet();

        //Act Statement(s)
        boolean result = target.intersects(fluentBitSet);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${b898378b-c28d-3fad-8033-5267c7cec938}
    @Test()
    void intersects1WhenBitSetNotIntersectsSetBitSet() {
        /* Branches:
         * (bitSet.intersects(set.bitSet)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);
        FluentBitSet fluentBitSet = new FluentBitSet();

        //Act Statement(s)
        boolean result = target.intersects(fluentBitSet);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${ee304c96-9741-38de-817c-5cc74c5fac26}
    @Test()
    void isEmptyWhenBitSetIsEmpty() {
        /* Branches:
         * (bitSet.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        boolean result = target.isEmpty();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${b0d94151-d657-37d0-a362-585fa77a50b6}
    @Test()
    void isEmptyWhenBitSetNotIsEmpty() {
        /* Branches:
         * (bitSet.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        boolean result = target.isEmpty();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${fce83bc9-a37e-3f22-8db6-849a69a7252e}
    @Test()
    void lengthTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        int result = target.length();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${76df924c-131f-3a7d-999b-78663a40b573}
    @Test()
    void nextClearBitTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        int result = target.nextClearBit(0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${1d853c07-d97f-3f8c-bfd8-ff3c17e1d674}
    @Test()
    void nextSetBitTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        int result = target.nextSetBit(0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${28528dba-f527-3316-ae92-6b9809dfdafa}
    @Test()
    void orTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);
        BitSet bitSet2 = new BitSet();

        //Act Statement(s)
        FluentBitSet result = target.or(bitSet2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${9770a28e-27fb-31e8-98c6-11458675d9c7}
    @Test()
    void or1WhenSetIsNotEmpty() {
        /* Branches:
         * (for-each(set)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);
        FluentBitSet[][] fluentBitSetArray3 = new FluentBitSet[][]{};
        FluentBitSet[] fluentBitSetArray2 = new FluentBitSet[]{fluentBitSetArray3};
        FluentBitSet[] fluentBitSetArray = new FluentBitSet[]{fluentBitSetArray2};

        //Act Statement(s)
        FluentBitSet result = target.or(fluentBitSetArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${9e65ebde-32c2-3d37-b4cf-bb8b34ce7c59}
    @Test()
    void or2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);
        FluentBitSet fluentBitSet = new FluentBitSet();

        //Act Statement(s)
        FluentBitSet result = target.or(fluentBitSet);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${0bd62f4c-ee4a-3de6-ad10-7c073c57f7ca}
    @Test()
    void previousClearBitTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        int result = target.previousClearBit(0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${0afd9953-8657-35be-8e75-1ccc48626344}
    @Test()
    void previousSetBitTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        int result = target.previousSetBit(-1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${170530a4-bcb1-3bf9-9e8b-677e20ea2218}
    @Test()
    void setWhenBitIndexArrayIsNotEmpty() {
        /* Branches:
         * (for-each(bitIndexArray)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);
        int[] intArray = new int[]{0};

        //Act Statement(s)
        FluentBitSet result = target.set(intArray);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${b10881fb-7915-32ec-8d60-7b83d8b3d1b3}
    @Test()
    void set1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        FluentBitSet result = target.set(0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${d3c77b0d-27dc-36b6-981f-08b4bbc706e2}
    @Test()
    void set2Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        FluentBitSet result = target.set(3, true);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${50af2edf-a77a-316d-bd5c-62f8e7ce6c8e}
    @Test()
    void set3Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        FluentBitSet result = target.set(0, 1);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${d3c8047a-cbcf-39b3-9194-d7a8b24ece03}
    @Test()
    void set4Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        FluentBitSet result = target.set(2, 5, true);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${860fa8ba-c413-35f2-916d-66df69456fc3}
    @Test()
    void setInclusiveTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        FluentBitSet result = target.setInclusive(0, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${0a253188-e32a-3fb1-a265-54df02efeff0}
    @Test()
    void sizeTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        int result = target.size();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${b4af2388-e781-3800-820a-b8ede09bd914}
    @Test()
    void streamTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        IntStream result = target.stream();
        IntStream intStream = IntStream.empty();

        //Assert statement(s)
        //TODO: Please implement equals method in IntStream for verification to succeed or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, equalTo(intStream)));
    }

    //Sapient generated method id: ${49437d84-80ef-3baa-99c8-2dac74bc4473}
    @Test()
    void toByteArrayTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        byte[] result = target.toByteArray();
        byte[] byteResultArray = new byte[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(byteResultArray)));
    }

    //Sapient generated method id: ${362ae0c1-7c79-303f-a12e-c237a8fe4cd5}
    @Test()
    void toLongArrayTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        long[] result = target.toLongArray();
        long[] longResultArray = new long[]{};

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(longResultArray)));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
    @Test()
    void toStringTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);

        //Act Statement(s)
        String result = target.toString();

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("<init>_bitSet1")));
    }

    //Sapient generated method id: ${bd3ff5af-31c1-39b7-bc92-252a18eb2901}
    @Test()
    void xorTest() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);
        BitSet bitSet2 = new BitSet();

        //Act Statement(s)
        FluentBitSet result = target.xor(bitSet2);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }

    //Sapient generated method id: ${b4f23636-5338-32ff-b330-6274f362a116}
    @Test()
    void xor1Test() {
        /**
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BitSet bitSet = new BitSet();
        FluentBitSet target = new FluentBitSet(bitSet);
        FluentBitSet fluentBitSet = new FluentBitSet();

        //Act Statement(s)
        FluentBitSet result = target.xor(fluentBitSet);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(target)));
    }
}
