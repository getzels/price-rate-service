package com.capitole.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.ZonedDateTime;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class PriceRateInDTO extends PriceRateDTO {
    private ZonedDateTime applicationDate;
}
