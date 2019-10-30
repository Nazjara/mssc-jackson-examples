package com.nazjara.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beer = getBeer();

        String jsonString = objectMapper.writeValueAsString(beer);

        System.out.println(jsonString);
    }

    @Test
    void testDeserializeDto() throws JsonProcessingException {
        String jsonString = "{\"id\":\"5690e802-7b29-4190-80f1-4cdc98654326\",\"beerName\":\"name\",\"beerStyle\":\"style\",\"upc\":123123123123,\"price\":12.99,\"createdDate\":\"2019-10-30T11:48:11.493\",\"lastModifiedDate\":\"2019-10-30T11:48:11.494\"}";

        BeerDto beer = objectMapper.readValue(jsonString, BeerDto.class);

        System.out.println(beer.toString());
    }
}