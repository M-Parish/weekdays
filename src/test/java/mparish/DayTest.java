package mparish;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class DayTest {
    private transient Day day;

    @Before public void init() {
        day = new Day();
    }
    @Test public void TestThatTimeConversionIsCorrect(){
        day.setStart(480);
        assertEquals("8:00 AM", day.calculateTimeStart());
        day.setStart(960);
        assertEquals("4:00 PM", day.calculateTimeStart());
        day.setStart(0);
        assertEquals("12:00 AM", day.calculateTimeStart());
        day.setStart(720);
        assertEquals("12:00 PM", day.calculateTimeStart());
        day.setStart(745);
        assertEquals("12:25 PM", day.calculateTimeStart());
    }

}
