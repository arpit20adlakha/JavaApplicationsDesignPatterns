package com.company;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MyDto {
    private String stringValue;
    private int intValue;
    private boolean booleanValue;

    public MyDto() {
        super();
    }
    @Test
    public void givenFieldIgnored() throws JsonParseException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        MyDto dtoObject = new MyDto();
        String asString = mapper.writeValueAsString(dtoObject);
        System.out.println(asString);

    }

}


