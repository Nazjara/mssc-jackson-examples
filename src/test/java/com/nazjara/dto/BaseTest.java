package com.nazjara.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class BaseTest {

    BeerDto getBeer() {
        return BeerDto.builder()
                .beerName("name")
                .beerStyle("style")
                .id(UUID.randomUUID())
                .createdDate(LocalDate.now())
                .lastModifiedDate(LocalDateTime.now())
                .price(new BigDecimal("12.99"))
                .upc(123123123123L)
                .date(LocalDate.now())
                .build();
    }
}
