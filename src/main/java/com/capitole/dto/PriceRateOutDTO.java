package com.capitole.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@SuperBuilder
public class PriceRateOutDTO extends PriceRateDTO {

    private Long rate;
    private String applicationDate;
    private BigDecimal finalPrice;
}
