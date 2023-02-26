package com.capitole.mapper;

import com.capitole.dto.PriceRateOutDTO;
import com.capitole.model.Prices;
import org.springframework.stereotype.Component;

@Component
public class PriceDTOMapper {

    public static PriceRateOutDTO toDTO(Prices source) {
        if ( source == null ) {
            return null;
        }

        PriceRateOutDTO priceRateOutDTO = new PriceRateOutDTO();

        priceRateOutDTO.setProductId( source.getProductId() );
        priceRateOutDTO.setBrandId( source.getBrandId() );
        priceRateOutDTO.setFinalPrice(source.getPrice());
        priceRateOutDTO.setApplicationDate(source.getStartDate() + " to " + source.getEndDate()) ;
        priceRateOutDTO.setRate(source.getPriceList());

        return priceRateOutDTO;
    }
}
