package org.apache.commons.lang3.time;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StopWatchSapientGeneratedTest {

    //Sapient generated method id: ${createTest}, hash: 45463F709BFD70AB0507F63277B30000
    @Test()
    void createTest() {
        
        //Act Statement(s)
        StopWatch result = StopWatch.create();
        
        //Assert statement(s)
        //TODO: Please implement equals method in StopWatch for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${createStartedTest}, hash: B7AF9EDACE9E6460F75C62106491507D
    @Test()
    void createStartedTest() {
        
        //Act Statement(s)
        StopWatch result = StopWatch.createStarted();
        
        //Assert statement(s)
        //TODO: Please implement equals method in StopWatch for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${formatSplitTimeTest}, hash: D42F23966FB143DD6FC191256AF6B60E
    @Test()
    void formatSplitTimeTest() {
        //Arrange Statement(s)
        StopWatch target = spy(new StopWatch("message1"));
        doReturn(1L).when(target).getSplitTime();
        
        //Act Statement(s)
        String result = target.formatSplitTime();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("00:00:00.001"));
            verify(target).getSplitTime();
        });
    }

    //Sapient generated method id: ${formatTimeTest}, hash: 14318977B37F079878E0BD4613D14E4A
    @Test()
    void formatTimeTest() {
        //Arrange Statement(s)
        StopWatch target = spy(new StopWatch("message1"));
        doReturn(1L).when(target).getTime();
        
        //Act Statement(s)
        String result = target.formatTime();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("00:00:00.001"));
            verify(target).getTime();
        });
    }

    //Sapient generated method id: ${getNanoTimeWhenThisRunningStateEqualsStateUNSTARTED}, hash: C9B7FA7E95EF5C04147DF1DC732BBF01
    @Test()
    void getNanoTimeWhenThisRunningStateEqualsStateUNSTARTED() {
        /* Branches:
         * (this.runningState == State.STOPPED) : false
         * (this.runningState == State.SUSPENDED) : false
         * (this.runningState == State.UNSTARTED) : true
         */
         //Arrange Statement(s)
        StopWatch target = new StopWatch("message1");
        
        //Act Statement(s)
        long result = target.getNanoTime();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0L)));
    }

    //Sapient generated method id: ${getSplitNanoTimeWhenThisSplitStateNotEqualsSplitStateSPLITThrowsIllegalStateException}, hash: BDA39D692ECFBCB9DD9B39A292672100
    @Test()
    void getSplitNanoTimeWhenThisSplitStateNotEqualsSplitStateSPLITThrowsIllegalStateException() {
        /* Branches:
         * (this.splitState != SplitState.SPLIT) : true
         */
         //Arrange Statement(s)
        StopWatch target = new StopWatch("message1");
        IllegalStateException illegalStateException = new IllegalStateException("Stopwatch must be split to get the split time.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.getSplitNanoTime();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getSplitTimeTest}, hash: C02FAE259A0427CF7FF2A5DC81C29B0E
    @Test()
    void getSplitTimeTest() {
        //Arrange Statement(s)
        StopWatch target = spy(new StopWatch("message1"));
        doReturn(1L).when(target).getSplitNanoTime();
        
        //Act Statement(s)
        long result = target.getSplitTime();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0L));
            verify(target).getSplitNanoTime();
        });
    }

    //Sapient generated method id: ${getStartTimeWhenThisRunningStateEqualsStateUNSTARTEDThrowsIllegalStateException}, hash: 002E0C557C5B2610577C81EF7EB3B92B
    @Test()
    void getStartTimeWhenThisRunningStateEqualsStateUNSTARTEDThrowsIllegalStateException() {
        /* Branches:
         * (this.runningState == State.UNSTARTED) : true
         */
         //Arrange Statement(s)
        StopWatch target = new StopWatch("message1");
        IllegalStateException illegalStateException = new IllegalStateException("Stopwatch has not been started");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.getStartTime();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getStopTimeWhenThisRunningStateEqualsStateUNSTARTEDThrowsIllegalStateException}, hash: CB8EA65E92EE89B518E1CF653B866DC0
    @Test()
    void getStopTimeWhenThisRunningStateEqualsStateUNSTARTEDThrowsIllegalStateException() {
        /* Branches:
         * (this.runningState == State.UNSTARTED) : true
         */
         //Arrange Statement(s)
        StopWatch target = new StopWatch("message1");
        IllegalStateException illegalStateException = new IllegalStateException("Stopwatch has not been started");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.getStopTime();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getTimeTest}, hash: 9386700825EEEDB406BB7978516ACFFE
    @Test()
    void getTimeTest() {
        //Arrange Statement(s)
        StopWatch target = spy(new StopWatch("message1"));
        doReturn(1L).when(target).getNanoTime();
        
        //Act Statement(s)
        long result = target.getTime();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0L));
            verify(target).getNanoTime();
        });
    }

    //Sapient generated method id: ${getTime1Test}, hash: B6A1315C9CA98A66EE52030500385F84
    @Test()
    void getTime1Test() {
        //Arrange Statement(s)
        StopWatch target = spy(new StopWatch("message1"));
        doReturn(0L).when(target).getNanoTime();
        
        //Act Statement(s)
        long result = target.getTime(TimeUnit.NANOSECONDS);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0L));
            verify(target).getNanoTime();
        });
    }

    //Sapient generated method id: ${isStartedWhenRunningStateIsStarted}, hash: 1220A258E3DC8ECCF7114DE38300AF2B
    @Test()
    void isStartedWhenRunningStateIsStarted() {
        /* Branches:
         * (runningState.isStarted()) : true
         */
         //Arrange Statement(s)
        StopWatch target = new StopWatch("message1");
        
        //Act Statement(s)
        boolean result = target.isStarted();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isStartedWhenRunningStateNotIsStarted}, hash: F95CB268AC240BBCD6BE84D71A686D5B
    @Test()
    void isStartedWhenRunningStateNotIsStarted() {
        /* Branches:
         * (runningState.isStarted()) : false
         */
         //Arrange Statement(s)
        StopWatch target = new StopWatch("message1");
        
        //Act Statement(s)
        boolean result = target.isStarted();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isStoppedWhenRunningStateIsStopped}, hash: 74286203750BD9A8585844094A0E5CEC
    @Test()
    void isStoppedWhenRunningStateIsStopped() {
        /* Branches:
         * (runningState.isStopped()) : true
         */
         //Arrange Statement(s)
        StopWatch target = new StopWatch("message1");
        
        //Act Statement(s)
        boolean result = target.isStopped();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isStoppedWhenRunningStateNotIsStopped}, hash: 1D568B880CDCB16D5083560D223D7611
    @Test()
    void isStoppedWhenRunningStateNotIsStopped() {
        /* Branches:
         * (runningState.isStopped()) : false
         */
         //Arrange Statement(s)
        StopWatch target = new StopWatch("message1");
        
        //Act Statement(s)
        boolean result = target.isStopped();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isSuspendedWhenRunningStateIsSuspended}, hash: CB0F26482D458DC3D54B9140A604DD4C
    @Test()
    void isSuspendedWhenRunningStateIsSuspended() {
        /* Branches:
         * (runningState.isSuspended()) : true
         */
         //Arrange Statement(s)
        StopWatch target = new StopWatch("message1");
        
        //Act Statement(s)
        boolean result = target.isSuspended();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isSuspendedWhenRunningStateNotIsSuspended}, hash: CAC7BDA7FDF54D63CE8FA1819DC49C00
    @Test()
    void isSuspendedWhenRunningStateNotIsSuspended() {
        /* Branches:
         * (runningState.isSuspended()) : false
         */
         //Arrange Statement(s)
        StopWatch target = new StopWatch("message1");
        
        //Act Statement(s)
        boolean result = target.isSuspended();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${resetTest}, hash: 8E4C20034D585807C63FEB91EE9A1054
    @Test()
    void resetTest() {
        //Arrange Statement(s)
        StopWatch target = new StopWatch("message1");
        
        //Act Statement(s)
        target.reset();
    }

    //Sapient generated method id: ${resumeWhenThisRunningStateNotEqualsStateSUSPENDEDThrowsIllegalStateException}, hash: 388749FAD9D470822684A363BE004636
    @Test()
    void resumeWhenThisRunningStateNotEqualsStateSUSPENDEDThrowsIllegalStateException() {
        /* Branches:
         * (this.runningState != State.SUSPENDED) : true
         */
         //Arrange Statement(s)
        StopWatch target = new StopWatch("message1");
        IllegalStateException illegalStateException = new IllegalStateException("Stopwatch must be suspended to resume. ");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.resume();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${splitWhenThisRunningStateNotEqualsStateRUNNINGThrowsIllegalStateException}, hash: EA8CCE99FF67773D1101A4A53B126A74
    @Test()
    void splitWhenThisRunningStateNotEqualsStateRUNNINGThrowsIllegalStateException() {
        /* Branches:
         * (this.runningState != State.RUNNING) : true
         */
         //Arrange Statement(s)
        StopWatch target = new StopWatch("message1");
        IllegalStateException illegalStateException = new IllegalStateException("Stopwatch is not running. ");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.split();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${startWhenThisRunningStateEqualsStateUNSTARTED}, hash: 8BEB5601822C5B7D9AA4676EC06D1A8B
    @Test()
    void startWhenThisRunningStateEqualsStateUNSTARTED() {
        /* Branches:
         * (this.runningState == State.STOPPED) : false
         * (this.runningState != State.UNSTARTED) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::nanoTime has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        StopWatch target = new StopWatch("message1");
        
        //Act Statement(s)
        target.start();
    }

    //Sapient generated method id: ${stopWhenThisRunningStateNotEqualsStateSUSPENDEDThrowsIllegalStateException}, hash: B82924350798C7A0C1DAB2F8EE61975F
    @Test()
    void stopWhenThisRunningStateNotEqualsStateSUSPENDEDThrowsIllegalStateException() {
        /* Branches:
         * (this.runningState != State.RUNNING) : true
         * (this.runningState != State.SUSPENDED) : true
         */
         //Arrange Statement(s)
        StopWatch target = new StopWatch("message1");
        IllegalStateException illegalStateException = new IllegalStateException("Stopwatch is not running. ");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.stop();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${suspendWhenThisRunningStateNotEqualsStateRUNNINGThrowsIllegalStateException}, hash: C444C7DA329CE34F25EB3782FB0C6694
    @Test()
    void suspendWhenThisRunningStateNotEqualsStateRUNNINGThrowsIllegalStateException() {
        /* Branches:
         * (this.runningState != State.RUNNING) : true
         */
         //Arrange Statement(s)
        StopWatch target = new StopWatch("message1");
        IllegalStateException illegalStateException = new IllegalStateException("Stopwatch must be running to suspend. ");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.suspend();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${toSplitStringWhenMsgStrIsEmpty}, hash: 521BB28C52F80BA54D39E7F0C9F94377
    @Test()
    void toSplitStringWhenMsgStrIsEmpty() {
        /* Branches:
         * (msgStr.isEmpty()) : true
         */
         //Arrange Statement(s)
        StopWatch target = spy(new StopWatch(""));
        doReturn("return_of_formatSplitTime1").when(target).formatSplitTime();
        
        //Act Statement(s)
        String result = target.toSplitString();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_formatSplitTime1"));
            verify(target).formatSplitTime();
        });
    }

    //Sapient generated method id: ${toSplitStringWhenMsgStrNotIsEmpty}, hash: 93E9DEF85422586A040F3342AAFE33FF
    @Test()
    void toSplitStringWhenMsgStrNotIsEmpty() {
        /* Branches:
         * (msgStr.isEmpty()) : false
         */
         //Arrange Statement(s)
        StopWatch target = spy(new StopWatch("C"));
        doReturn("A").when(target).formatSplitTime();
        
        //Act Statement(s)
        String result = target.toSplitString();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("C A"));
            verify(target).formatSplitTime();
        });
    }

    //Sapient generated method id: ${toStringWhenMsgStrIsEmpty}, hash: 50B5BAF685E7E2D5E04C13F0C02E5397
    @Test()
    void toStringWhenMsgStrIsEmpty() {
        /* Branches:
         * (msgStr.isEmpty()) : true
         */
         //Arrange Statement(s)
        StopWatch target = spy(new StopWatch(""));
        doReturn("return_of_formatTime1").when(target).formatTime();
        
        //Act Statement(s)
        String result = target.toString();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_formatTime1"));
            verify(target).formatTime();
        });
    }

    //Sapient generated method id: ${toStringWhenMsgStrNotIsEmpty}, hash: 8DBDC3C8E5418DA3FB130C444A6F4F12
    @Test()
    void toStringWhenMsgStrNotIsEmpty() {
        /* Branches:
         * (msgStr.isEmpty()) : false
         */
         //Arrange Statement(s)
        StopWatch target = spy(new StopWatch("C"));
        doReturn("A").when(target).formatTime();
        
        //Act Statement(s)
        String result = target.toString();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("C A"));
            verify(target).formatTime();
        });
    }

    //Sapient generated method id: ${unsplitWhenThisSplitStateNotEqualsSplitStateSPLITThrowsIllegalStateException}, hash: 01E71B2B09D7D691788ECAE11F224788
    @Test()
    void unsplitWhenThisSplitStateNotEqualsSplitStateSPLITThrowsIllegalStateException() {
        /* Branches:
         * (this.splitState != SplitState.SPLIT) : true
         */
         //Arrange Statement(s)
        StopWatch target = new StopWatch("message1");
        IllegalStateException illegalStateException = new IllegalStateException("Stopwatch has not been split. ");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.unsplit();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }
}
