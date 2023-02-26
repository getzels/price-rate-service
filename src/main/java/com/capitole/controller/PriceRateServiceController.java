package com.capitole.controller;

import com.capitole.dto.PriceRateInDTO;
import com.capitole.dto.PriceRateOutDTO;
import com.capitole.service.PriceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(EndPoint.PRICE_RATE_PATH)
@AllArgsConstructor
public class PriceRateServiceController {

    private final PriceService priceService;

    @GetMapping
    public PriceRateOutDTO getPriceRate(@RequestBody PriceRateInDTO priceRateInDTO) {

        return priceService.getPriceRate(priceRateInDTO);
    }
}
