package com.capitole.service.impl;

import com.capitole.dto.PriceRateInDTO;
import com.capitole.dto.PriceRateOutDTO;
import com.capitole.mapper.PriceDTOMapper;
import com.capitole.repository.PriceServiceRepository;
import com.capitole.service.PriceService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PriceServiceImpl implements PriceService {

    private final PriceServiceRepository priceServiceRepository;

    private PriceDTOMapper mapper;

    @Override
    public PriceRateOutDTO getPriceRate(@NonNull PriceRateInDTO priceRateInDTO) {

        return mapper.toDTO(priceServiceRepository.findPriceByDateAndBrandIdAndProductId(
                priceRateInDTO.getApplicationDate(),
                priceRateInDTO.getBrandId(),
                priceRateInDTO.getProductId()));
    }

}
