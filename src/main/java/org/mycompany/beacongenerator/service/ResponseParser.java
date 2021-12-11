package org.mycompany.beacongenerator.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.mycompany.beacongenerator.domain.BeaconResponse;

public class ResponseParser {
    private ObjectMapper mapper;

    public ResponseParser(){
        mapper = new ObjectMapper();
    }
    public BeaconResponse parse(String jsonString) throws JsonProcessingException {
        return mapper.readValue(jsonString, BeaconResponse.class);
    }
}
