package com.capitole;

import com.capitole.dto.PriceRateInDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
@Sql(scripts = "classpath:/sql/data.sql")
class PriceRateServiceApplicationTests {

    private static final String PRICE_RATE_PATH = "/rate";

    @Autowired
    private transient MockMvc mockMvc;

    @Autowired
    private transient ObjectMapper objectMapper;

    @Test
    void priceRateService_1() throws Exception {

        // Create a LocalDate object
        ZonedDateTime zonedDateTime =
                ZonedDateTime.of(2020,
                        6,
                        14,
                        10,
                        0,
                        0,
                        0, ZoneId.systemDefault());

        PriceRateInDTO priceRateInDTO = PriceRateInDTO.builder()
                .applicationDate(zonedDateTime)
                .productId(35455L)
                .brandId(1L)
                .build();

        mockMvc.perform(get(PRICE_RATE_PATH)
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(priceRateInDTO)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.productId", Is.is(35455)))
                .andExpect(jsonPath("$.brandId", Is.is(1)))
                .andExpect(jsonPath("$.rate", Is.is(1)))
                .andExpect(jsonPath("$.applicationDate", Is.is(String.format("2020-06-14T00:00-04:00[%s] to 2020-12-31T23:59:59-04:00[%s]",ZoneId.systemDefault(), ZoneId.systemDefault()))))
                .andExpect(jsonPath("$.finalPrice", Is.is(35.5)));
    }

    @Test
    void priceRateService_2() throws Exception {

        // Create a LocalDate object
        ZonedDateTime zonedDateTime =
                ZonedDateTime.of(2020,
                        6,
                        14,
                        16,
                        0,
                        0,
                        0, ZoneId.systemDefault());

        PriceRateInDTO priceRateInDTO = PriceRateInDTO.builder()
                .applicationDate(zonedDateTime)
                .productId(35455L)
                .brandId(1L)
                .build();

        mockMvc.perform(get(PRICE_RATE_PATH)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(priceRateInDTO)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.productId", Is.is(35455)))
                .andExpect(jsonPath("$.brandId", Is.is(1)))
                .andExpect(jsonPath("$.rate", Is.is(2)))
                .andExpect(jsonPath("$.applicationDate", Is.is(String.format("2020-06-14T15:00-04:00[%s] to 2020-06-14T18:30-04:00[%s]",ZoneId.systemDefault(), ZoneId.systemDefault()))))
                .andExpect(jsonPath("$.finalPrice", Is.is(25.45)));
    }

    @Test
    void priceRateService_3() throws Exception {

        // Create a LocalDate object
        ZonedDateTime zonedDateTime =
                ZonedDateTime.of(2020,
                        6,
                        14,
                        21,
                        0,
                        0,
                        0, ZoneId.systemDefault());

        PriceRateInDTO priceRateInDTO = PriceRateInDTO.builder()
                .applicationDate(zonedDateTime)
                .productId(35455L)
                .brandId(1L)
                .build();

        mockMvc.perform(get(PRICE_RATE_PATH)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(priceRateInDTO)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.productId", Is.is(35455)))
                .andExpect(jsonPath("$.brandId", Is.is(1)))
                .andExpect(jsonPath("$.rate", Is.is(1)))
                .andExpect(jsonPath("$.applicationDate", Is.is(String.format("2020-06-14T00:00-04:00[%s] to 2020-12-31T23:59:59-04:00[%s]",ZoneId.systemDefault(), ZoneId.systemDefault()))))
                .andExpect(jsonPath("$.finalPrice", Is.is(35.5)));
    }

    @Test
    void priceRateService_4() throws Exception {

        // Create a LocalDate object
        ZonedDateTime zonedDateTime =
                ZonedDateTime.of(2020,
                        6,
                        15,
                        10,
                        0,
                        0,
                        0, ZoneId.systemDefault());

        PriceRateInDTO priceRateInDTO = PriceRateInDTO.builder()
                .applicationDate(zonedDateTime)
                .productId(35455L)
                .brandId(1L)
                .build();

        mockMvc.perform(get(PRICE_RATE_PATH)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(priceRateInDTO)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.productId", Is.is(35455)))
                .andExpect(jsonPath("$.brandId", Is.is(1)))
                .andExpect(jsonPath("$.rate", Is.is(3)))
                .andExpect(jsonPath("$.applicationDate", Is.is(String.format("2020-06-15T00:00-04:00[%s] to 2020-06-15T11:00-04:00[%s]",ZoneId.systemDefault(), ZoneId.systemDefault()))))
                .andExpect(jsonPath("$.finalPrice", Is.is(30.50)));
    }

    @Test
    void priceRateService_5() throws Exception {

        // Create a LocalDate object
        ZonedDateTime zonedDateTime =
                ZonedDateTime.of(2020,
                        6,
                        16,
                        21,
                        0,
                        0,
                        0, ZoneId.systemDefault());

        PriceRateInDTO priceRateInDTO = PriceRateInDTO.builder()
                .applicationDate(zonedDateTime)
                .productId(35455L)
                .brandId(1L)
                .build();

        mockMvc.perform(get(PRICE_RATE_PATH)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(priceRateInDTO)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.productId", Is.is(35455)))
                .andExpect(jsonPath("$.brandId", Is.is(1)))
                .andExpect(jsonPath("$.rate", Is.is(4)))
                .andExpect(jsonPath("$.applicationDate", Is.is(String.format("2020-06-15T16:00-04:00[%s] to 2020-12-31T23:59:59-04:00[%s]",ZoneId.systemDefault(), ZoneId.systemDefault()))))
                .andExpect(jsonPath("$.finalPrice", Is.is(38.95)));
    }

}
