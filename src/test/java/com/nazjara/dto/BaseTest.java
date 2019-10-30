package com.nazjara.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class BaseTest {

    BeerDto getBeer() {
        return BeerDto.builder()
                .beerName("name")
                .beerStyle("style")
                .id(UUID.randomUUID())
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .price(new BigDecimal("12.99"))
                .upc(123123123123L)
                .build();
    }
}
