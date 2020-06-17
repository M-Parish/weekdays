package mparish;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class JsonProcessorTest {
    private transient JsonProcessor processor;

    @Test public void testThatJsonRetrievesData() throws IOException{
        processor = new JsonProcessor();
        assertEquals("mon", processor.testMe().get(0).getDay());
    }
}
