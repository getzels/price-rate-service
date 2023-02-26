package com.capitole.service;

import com.capitole.dto.PriceRateInDTO;
import com.capitole.dto.PriceRateOutDTO;

public interface PriceService {

    PriceRateOutDTO getPriceRate(PriceRateInDTO priceRateInDTO);
}
