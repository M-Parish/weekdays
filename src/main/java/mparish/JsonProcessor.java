package mparish;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class JsonProcessor {
    ObjectMapper mapper = new ObjectMapper();

    public List<Day> testMe() throws IOException {
        return mapper.readValue(
                JsonProcessor.class.getResourceAsStream("/workweek.json"),
                new TypeReference<List<Day>>() {}
        );
    }
}
