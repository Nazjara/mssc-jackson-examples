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
        String jsonString = "{\"beerName\":\"name\",\"beerStyle\":\"style\",\"upc\":123123123123,\"price\":\"12.99\",\"createdDate\":\"2019-10-31\",\"lastModifiedDate\":\"2019-10-31T00:20:49\",\"date\":\"20191031\",\"beerId\":\"521e5c44-8886-47b6-98c4-48fb47688131\"}";

        BeerDto beer = objectMapper.readValue(jsonString, BeerDto.class);

        System.out.println(beer.toString());
    }
}